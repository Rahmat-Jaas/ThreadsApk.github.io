package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C03370Ia;
import android.text.TextUtils;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class DexOptRunner {
    public final ProcessBuilder mTemplate;
    public final File mTmpDir;
    public File mTmpFbDexOpt = null;

    public class DexOptException extends RuntimeException {
        public final String errout;
        public final int status;

        public DexOptException(int i, String str) {
            super(AnonymousClass00U.A0h("dexopt failed with status ", Process.describeStatus(i), ": [", str, "]"));
            this.status = i;
            this.errout = str;
        }
    }

    public void addDexOptOptions(ProcessBuilder processBuilder) {
    }

    public boolean attemptAllocate(int i, long j) {
        return DalvikInternals.attemptAllocate(i, j, -1);
    }

    public void cleanup() {
        if (this.mTmpFbDexOpt != null) {
            try {
                Mlog.safeFmt("Cleaning up temporary fbdexopt", new Object[0]);
                Fs.deleteRecursive(this.mTmpFbDexOpt);
            } catch (IOException unused) {
                Mlog.w("Unable to delete temporary fbdexopt", new Object[0]);
            }
        }
    }

    public final void run(InputStream inputStream, int i, String str, RandomAccessFile randomAccessFile, String str2, String[] strArr) {
        String join;
        Process startSubprocess;
        Object[] objArr;
        String str3;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        boolean z = false;
        if (randomAccessFile2.getFilePointer() == 0) {
            z = true;
        }
        Mlog.assertThat(z, "odex fpos must be 0", new Object[0]);
        boolean z2 = false;
        if (randomAccessFile2.length() == 0) {
            z2 = true;
        }
        Mlog.assertThat(z2, "odex must be empty", new Object[0]);
        int fileno = Fd.fileno(randomAccessFile2.getFD());
        DalvikInternals.dexOptCreateEmptyHeader(fileno);
        int filePointer = (int) randomAccessFile2.getFilePointer();
        int i2 = i;
        if (i2 > 1) {
            if (DalvikInternals.attemptAllocate(fileno, randomAccessFile2.getFilePointer() + ((long) i2), -1)) {
                objArr = new Object[]{Integer.valueOf(i2)};
                str3 = "allocated more %s bytes for dex content";
            } else {
                objArr = new Object[0];
                str3 = "unable to preallocate on this system";
            }
            Mlog.safeFmt(str3, objArr);
        }
        int copyDexToOdex = copyDexToOdex(inputStream, i2, randomAccessFile2);
        String str4 = str;
        if (copyDexToOdex != Integer.MAX_VALUE) {
            Mlog.safeFmt("wrote %s bytes to dex %s", Integer.valueOf(copyDexToOdex), str4);
            RandomAccessFile openUnlinkedTemporaryFile = Fs.openUnlinkedTemporaryFile(this.mTmpDir);
            try {
                ProcessBuilder clone = this.mTemplate.clone();
                int fileno2 = Fd.fileno(openUnlinkedTemporaryFile.getFD());
                int[] iArr = clone.mStreamDispositions;
                iArr[1] = fileno2;
                iArr[2] = -5;
                clone.mKeepFds.set(fileno);
                addDexOptOptions(clone);
                String num = Integer.toString(fileno);
                String num2 = Integer.toString(0);
                String str5 = System.getenv("BOOTCLASSPATH");
                String[] strArr2 = strArr;
                if (strArr == null) {
                    join = "";
                } else {
                    join = TextUtils.join(":", strArr2);
                }
                clone.addArguments("--", num, str4, num2, num2, str5, join, Long.toString((long) filePointer), Long.toString((long) copyDexToOdex), str2);
                startSubprocess = startSubprocess(clone);
                waitForDexOpt(startSubprocess, fileno);
                int exitValueEx = startSubprocess.exitValueEx();
                startSubprocess.destroy();
                if (exitValueEx == 0) {
                    openUnlinkedTemporaryFile.close();
                } else {
                    th = new DexOptException(exitValueEx, Fs.readProgramOutputFile(openUnlinkedTemporaryFile));
                    throw th;
                }
            } catch (Throwable th) {
                try {
                    openUnlinkedTemporaryFile.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass00U.A0L("refusing to deal with impossibly huge dex file ", str4));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DexOptRunner(java.io.File r6) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 0
            r5.mTmpFbDexOpt = r2
            r5.mTmpDir = r6
            java.lang.String r1 = "fbdexopt"
            java.io.File r4 = X.C15020qa.A01(r1)
            boolean r0 = r4.canExecute()
            if (r0 != 0) goto L_0x0043
            java.io.File r3 = java.io.File.createTempFile(r1, r2, r6)
            r5.mTmpFbDexOpt = r3
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0036 }
            r1.<init>(r4)     // Catch:{ all -> 0x0036 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.C03370Ia.A00(r1, r2, r0)     // Catch:{ all -> 0x0031 }
            r2.flush()     // Catch:{ all -> 0x0031 }
            r1.close()     // Catch:{ all -> 0x0036 }
            goto L_0x003b
        L_0x0031:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        L_0x003b:
            r2.close()
            r0 = 1
            r3.setExecutable(r0, r0)
            r4 = r3
        L_0x0043:
            java.lang.String r1 = r4.getAbsolutePath()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.facebook.forker.ProcessBuilder r2 = new com.facebook.forker.ProcessBuilder
            r2.<init>(r1, r0)
            java.lang.String r1 = X.C15020qa.A02()
            java.lang.String r0 = "LD_LIBRARY_PATH"
            r2.setenv(r0, r1)
            r2.mTmpDir = r6
            r5.mTemplate = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptRunner.<init>(java.io.File):void");
    }

    public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[32768];
        int i2 = 0;
        do {
            int A02 = C03370Ia.A02(inputStream, bArr, Integer.MAX_VALUE - i2);
            if (A02 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, A02);
            i2 += A02;
        } while (i2 < Integer.MAX_VALUE);
        return i2;
    }

    public Process startSubprocess(ProcessBuilder processBuilder) {
        return processBuilder.create();
    }

    public void waitForDexOpt(Process process, int i) {
        process.waitForUninterruptibly();
    }
}

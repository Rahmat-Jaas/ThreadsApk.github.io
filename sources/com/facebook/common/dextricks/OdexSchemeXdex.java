package com.facebook.common.dextricks;

import X.C03370Ia;
import android.text.TextUtils;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexOptRunner;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;

public final class OdexSchemeXdex extends OdexSchemeTurbo {
    public final DexManifest.Dex[] mDexes;

    public final class DexToOptimize implements Closeable {
        public final int dexNr;
        public final ReentrantLockFile.Lock signalLock;

        public void close() {
            this.signalLock.close();
        }

        public String toString() {
            return String.format("DexToOptimize(dexNr=%d)", new Object[]{Integer.valueOf(this.dexNr)});
        }

        public DexToOptimize(int i, ReentrantLockFile.Lock lock) {
            this.dexNr = i;
            this.signalLock = lock;
        }
    }

    public final class PoliteDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED];
        public final DexStore.OptimizationSession mOptimizationSession;

        public void addDexOptOptions(ProcessBuilder processBuilder) {
            processBuilder.addArgument("-n");
            OdexSchemeTurbo.addConfiguredDexOptOptions(this.mOptimizationSession.dexStoreConfig, processBuilder);
        }

        public void waitForDexOpt(Process process, int i) {
            this.mOptimizationSession.waitForAndManageProcess(process, (DexStore.ExternalProcessProgressListener) null);
        }

        public PoliteDexOptRunner(DexStore.OptimizationSession optimizationSession, File file) {
            super(file);
            this.mOptimizationSession = optimizationSession;
        }

        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            int fileno = Fd.fileno(randomAccessFile.getFD());
            int i2 = 0;
            while (true) {
                byte[] bArr = this.mBuffer;
                int A02 = C03370Ia.A02(inputStream, bArr, bArr.length);
                if (A02 == -1) {
                    return i2;
                }
                randomAccessFile.write(this.mBuffer, 0, A02);
                i2 += A02;
                this.mOptimizationSession.checkShouldStop();
                DalvikInternals.fdatasync(fileno, -1);
                Fs.tryDiscardPageCache(fileno);
            }
        }

        public Process startSubprocess(ProcessBuilder processBuilder) {
            return processBuilder.create();
        }
    }

    public OdexSchemeXdex(DexManifest.Dex[] dexArr) {
        super(1, dexArr);
        this.mDexes = dexArr;
    }

    private DexToOptimize findDexToOptimize(DexStore dexStore, long j) {
        for (int i = 0; i < this.mDexes.length; i++) {
            if (((16 << i) & j) == 0) {
                ReentrantLockFile open = ReentrantLockFile.open(new File(dexStore.root, this.expectedFiles[i << 1]));
                try {
                    ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                    open.close();
                    if (tryAcquire != null) {
                        try {
                            return new DexToOptimize(i, tryAcquire);
                        } catch (Throwable th) {
                            tryAcquire.close();
                            throw th;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
        throw th;
    }

    public String getSchemeName() {
        return "OdexSchemeXdex";
    }

    private boolean isFileCorruptionException(DexOptRunner.DexOptException dexOptException) {
        String str;
        if (dexOptException.status != 1 || (str = dexOptException.errout) == null) {
            return false;
        }
        int indexOf = str.indexOf("E/dalvikvm: ERROR: bad checksum");
        if (indexOf == 0 || (indexOf > 0 && str.charAt(indexOf - 1) == 10)) {
            return true;
        }
        return false;
    }

    private PartialInputStream openDexInsideOdex(FileInputStream fileInputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        FileChannel channel = fileInputStream.getChannel();
        channel.position(8);
        allocate.order(ByteOrder.nativeOrder());
        if (channel.read(allocate) == 8) {
            boolean z = false;
            allocate.position(0);
            int i = allocate.getInt();
            int i2 = allocate.getInt();
            Mlog.safeFmt("dexOffset:%s dexLength:%s", Integer.valueOf(i), Integer.valueOf(i2));
            boolean z2 = false;
            if (i <= 0) {
                z2 = true;
            }
            if (i2 <= 0) {
                z = true;
            }
            if (!z && !z2) {
                channel.position((long) i);
                return new PartialInputStream(fileInputStream, i2);
            }
            throw new IllegalArgumentException("invalid odex file");
        }
        throw new IllegalArgumentException("invalid odex file");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0103 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0108 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void optimize1(com.facebook.common.dextricks.DexStore r19, java.io.File r20, com.facebook.common.dextricks.DexStore.OptimizationSession r21, com.facebook.common.dextricks.DexStore.OptimizationSession.Job r22, com.facebook.common.dextricks.DexOptRunner r23, com.facebook.common.dextricks.OdexSchemeXdex.DexToOptimize r24, java.io.File[] r25, byte[] r26) {
        /*
            r18 = this;
            r8 = r22
            r8.startOptimizing()
            r11 = r18
            java.lang.String[] r1 = r11.expectedFiles
            r9 = r24
            int r0 = r9.dexNr
            r4 = 2
            int r0 = r0 << 1
            r7 = 0
            r10 = r1[r0]
            r3 = 1
            int r0 = r0 + 1
            r2 = r1[r0]
            java.io.File r6 = new java.io.File
            r0 = r20
            r6.<init>(r0, r2)
            r14 = r19
            java.io.File r0 = r14.root
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r10)
            java.io.File r0 = r14.root
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            java.lang.String r0 = "[opt] started optimizing %s -> %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r15 = r25
            int r2 = r15.length
            int r13 = r2 / r4
            java.lang.String[] r0 = r11.expectedFiles
            int r0 = r0.length
            int r0 = r0 / r4
            int r13 = r13 + r0
            int r13 = r13 - r3
            java.lang.String[] r4 = new java.lang.String[r13]
            r1 = 0
            r12 = 0
        L_0x0047:
            if (r1 >= r2) goto L_0x0058
            int r16 = r12 + 1
            r0 = r25[r1]
            java.lang.String r0 = r0.getPath()
            r4[r12] = r0
            int r1 = r1 + 2
            r12 = r16
            goto L_0x0047
        L_0x0058:
            r2 = 0
        L_0x0059:
            java.lang.String[] r0 = r11.expectedFiles
            int r1 = r0.length
            if (r2 >= r1) goto L_0x007a
            int r15 = r2 >> 1
            int r1 = r9.dexNr
            if (r15 == r1) goto L_0x0077
            int r16 = r12 + 1
            java.io.File r15 = r14.root
            r1 = r0[r2]
            java.io.File r0 = new java.io.File
            r0.<init>(r15, r1)
            java.lang.String r0 = r0.getPath()
            r4[r12] = r0
            r12 = r16
        L_0x0077:
            int r2 = r2 + 2
            goto L_0x0059
        L_0x007a:
            r2 = 0
            if (r12 != r13) goto L_0x007e
            r2 = 1
        L_0x007e:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "accounted for all dex files"
            com.facebook.common.dextricks.Mlog.assertThat(r2, r0, r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r5)
            com.facebook.common.dextricks.PartialInputStream r12 = r11.openDexInsideOdex(r1)     // Catch:{ all -> 0x0109 }
            int r13 = r12.mBytesToRead     // Catch:{ all -> 0x0104 }
            int r0 = r12.mBytesRead     // Catch:{ all -> 0x0104 }
            int r13 = r13 - r0
            if (r13 > r3) goto L_0x0096
            r13 = -1
        L_0x0096:
            java.lang.String r2 = "[opt] size hint for %s: %s"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0104 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}     // Catch:{ all -> 0x0104 }
            com.facebook.common.dextricks.Mlog.safeFmt(r2, r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0104 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r16 = "xdex"
            r11 = r23
            r17 = r4
            r14 = r10
            r15 = r3
            r11.run(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00fa }
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ all -> 0x00ff }
            int r2 = com.facebook.forker.Fd.fileno(r0)     // Catch:{ all -> 0x00ff }
            r0 = r26
            com.facebook.common.dextricks.DalvikInternals.replaceOdexDepBlock(r2, r0)     // Catch:{ all -> 0x00ff }
            r0 = r21
            com.facebook.common.dextricks.OptimizationConfiguration r0 = r0.config     // Catch:{ all -> 0x00ff }
            com.facebook.common.dextricks.Prio r0 = r0.prio     // Catch:{ all -> 0x00ff }
            int r0 = r0.ioPriority     // Catch:{ all -> 0x00ff }
            com.facebook.common.dextricks.DalvikInternals.fsync(r2, r0)     // Catch:{ all -> 0x00ff }
            com.facebook.common.dextricks.Fs.tryDiscardPageCache(r2)     // Catch:{ all -> 0x00ff }
            r3.close()     // Catch:{ all -> 0x0104 }
            r12.close()     // Catch:{ all -> 0x0109 }
            r1.close()
            r0 = 0
            long r3 = r8.startCommitting(r0)
            r1 = 16
            int r0 = r9.dexNr
            long r1 = r1 << r0
            long r3 = r3 | r1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "[opt] started commit"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            com.facebook.common.dextricks.Fs.renameOrThrow(r6, r5)
            r8.finishCommit(r3)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "[opt] finished commit"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            return
        L_0x00fa:
            r0 = move-exception
            com.facebook.common.dextricks.Fs.deleteRecursive(r6)     // Catch:{ all -> 0x00ff }
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0103 }
        L_0x0103:
            throw r0     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0108 }
        L_0x0108:
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.optimize1(com.facebook.common.dextricks.DexStore, java.io.File, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$OptimizationSession$Job, com.facebook.common.dextricks.DexOptRunner, com.facebook.common.dextricks.OdexSchemeXdex$DexToOptimize, java.io.File[], byte[]):void");
    }

    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean z = true;
        long length = (long) ((1 << this.mDexes.length) - 1);
        long j2 = j >> 4;
        Mlog.safeFmt("expectedDexBits:0x%08x actualDexBits:0x%08x", Long.valueOf(length), Long.valueOf(j2));
        if (length == j2) {
            z = false;
        }
        return OdexScheme.NeedOptimizationState.shouldOptimize(z);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void optimize(android.content.Context r16, com.facebook.common.dextricks.DexStore r17, com.facebook.common.dextricks.DexStore.OptimizationSession r18) {
        /*
            r15 = this;
            r7 = r17
            java.io.File[] r13 = r7.getDependencyOdexFiles()
            java.lang.String r0 = r7.getOdexCachePath()
            byte[] r14 = com.facebook.common.dextricks.DalvikInternals.readOdexDepBlock(r0)
            java.lang.String r0 = "dexopt"
            com.facebook.common.dextricks.DexStore$TmpDir r2 = r7.makeTemporaryDirectory(r0)
            java.lang.String r1 = "[opt] opened tmpDir %s"
            r5 = 1
            java.io.File r0 = r2.directory     // Catch:{ all -> 0x00a7 }
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00a7 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a7 }
            r9 = r18
            com.facebook.common.dextricks.OptimizationConfiguration r0 = r9.config     // Catch:{ all -> 0x00a7 }
            int r0 = r0.flags     // Catch:{ all -> 0x00a7 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0033
            java.io.File r0 = r2.directory     // Catch:{ all -> 0x00a7 }
            com.facebook.common.dextricks.OdexSchemeXdex$PoliteDexOptRunner r11 = new com.facebook.common.dextricks.OdexSchemeXdex$PoliteDexOptRunner     // Catch:{ all -> 0x00a7 }
            r11.<init>(r9, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x003c
        L_0x0033:
            com.facebook.common.dextricks.DexStore$Config r1 = r9.dexStoreConfig     // Catch:{ all -> 0x00a7 }
            java.io.File r0 = r2.directory     // Catch:{ all -> 0x00a7 }
            com.facebook.common.dextricks.OdexSchemeTurbo$TurboDexOptRunner r11 = new com.facebook.common.dextricks.OdexSchemeTurbo$TurboDexOptRunner     // Catch:{ all -> 0x00a7 }
            r11.<init>(r1, r0)     // Catch:{ all -> 0x00a7 }
        L_0x003c:
            r4 = 0
        L_0x003d:
            java.lang.String r1 = "[opt] starting optimization pass; creating job"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a7 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a7 }
            com.facebook.common.dextricks.DexStore$OptimizationSession$Job r10 = new com.facebook.common.dextricks.DexStore$OptimizationSession$Job     // Catch:{ all -> 0x00a7 }
            r10.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "[opt] opened job"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a2 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a2 }
            r6 = r15
            if (r4 != 0) goto L_0x0058
            java.io.File r0 = r2.directory     // Catch:{ all -> 0x00a2 }
            r15.prepareTmpDirForXdex(r13, r7, r0)     // Catch:{ all -> 0x00a2 }
        L_0x0058:
            long r0 = r10.initialStatus     // Catch:{ all -> 0x00a2 }
            com.facebook.common.dextricks.OdexSchemeXdex$DexToOptimize r12 = r15.findDexToOptimize(r7, r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "[opt] dto %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x00a2 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a2 }
            if (r12 == 0) goto L_0x0086
            java.io.File r8 = r2.directory     // Catch:{ DexOptException -> 0x006f }
            r6.optimize1(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ DexOptException -> 0x006f }
            goto L_0x0083
        L_0x006f:
            r1 = move-exception
            boolean r0 = com.facebook.common.dextricks.Fs.isKernelPageCacheFlushIsBroken     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008e
            boolean r0 = r15.isFileCorruptionException(r1)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = "detected odex file corruption: trying again with kernel workaround"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x008f }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x008f }
            com.facebook.common.dextricks.Fs.isKernelPageCacheFlushIsBroken = r5     // Catch:{ all -> 0x008f }
        L_0x0083:
            r12.close()     // Catch:{ all -> 0x00a2 }
        L_0x0086:
            r10.close()     // Catch:{ all -> 0x00a7 }
            if (r12 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            r4 = 1
            goto L_0x003d
        L_0x008e:
            throw r1     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x0094:
            r11.cleanup()     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "[opt] optimization complete"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a7 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a7 }
            r2.close()
            return
        L_0x00a2:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.optimize(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.DexStore$OptimizationSession):void");
    }

    private void makeFakeCacheSymlink(File file, File file2, File file3) {
        String str;
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected file to exist: ");
            sb.append(file2);
            throw new IllegalStateException(sb.toString());
        } else if (file3.exists()) {
            if (file2.getPath().endsWith(".jar")) {
                str = "classes.dex";
            } else {
                str = null;
            }
            File dexOptGenerateCacheFileName = Fs.dexOptGenerateCacheFileName(file, file2, str);
            Mlog.safeFmt("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, file3);
            Fs.symlink(file3, dexOptGenerateCacheFileName);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected file to exist: ");
            sb2.append(file3);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private void prepareTmpDirForXdex(File[] fileArr, DexStore dexStore, File file) {
        int i;
        String str;
        File findSystemDalvikCache = Fs.findSystemDalvikCache();
        File file2 = new File(file, "dalvik-cache");
        Fs.mkdirOrThrow(file2);
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        simpleStringSplitter.setString(System.getenv("BOOTCLASSPATH"));
        Iterator<String> it = simpleStringSplitter.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.length() != 0) {
                if (next.endsWith(".jar")) {
                    str = "classes.dex";
                } else {
                    str = null;
                }
                File file3 = new File(next);
                File dexOptGenerateCacheFileName = Fs.dexOptGenerateCacheFileName(file2, file3, str);
                File dexOptGenerateCacheFileName2 = Fs.dexOptGenerateCacheFileName(findSystemDalvikCache, file3, str);
                Mlog.safeFmt("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, dexOptGenerateCacheFileName2);
                Fs.symlink(dexOptGenerateCacheFileName2, dexOptGenerateCacheFileName);
            }
        }
        for (int i2 = 0; i2 < fileArr.length; i2 += 2) {
            makeFakeCacheSymlink(file2, fileArr[i2], fileArr[i2 + 1]);
        }
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                makeFakeCacheSymlink(file2, new File(dexStore.root, strArr[i]), new File(dexStore.root, this.expectedFiles[i + 1]));
                i += 2;
            } else {
                return;
            }
        }
    }
}

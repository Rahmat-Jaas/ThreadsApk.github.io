package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C03370Ia;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class OdexSchemeTurbo extends OdexScheme {

    public final class TurboCompiler extends OdexScheme.Compiler {
        public final TurboDexOptRunner mDexOptRunner;
        public final DexStore mDexStore;
        public final File mDummyZip;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        public void close() {
            this.mDexOptRunner.cleanup();
            this.mTmpDir.close();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0089 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void compile(com.facebook.common.dextricks.InputDex r12) {
            /*
                r11 = this;
                com.facebook.common.dextricks.DexManifest$Dex r0 = r12.dex
                java.lang.String r7 = com.facebook.common.dextricks.OdexSchemeTurbo.makeDexName(r0)
                java.lang.String r3 = com.facebook.common.dextricks.OdexSchemeTurbo.makeOdexName(r7)
                com.facebook.common.dextricks.DexStore r0 = r11.mDexStore
                java.io.File r0 = r0.root
                java.io.File r2 = new java.io.File
                r2.<init>(r0, r7)
                com.facebook.common.dextricks.DexStore r0 = r11.mDexStore
                java.io.File r0 = r0.root
                java.io.File r1 = new java.io.File
                r1.<init>(r0, r3)
                int r0 = r11.mFlags
                r0 = r0 & 1
                if (r0 == 0) goto L_0x002f
                boolean r0 = r2.exists()
                if (r0 == 0) goto L_0x002f
                boolean r0 = r1.exists()
                if (r0 == 0) goto L_0x002f
                return
            L_0x002f:
                com.facebook.common.dextricks.DexStore$TmpDir r0 = r11.mTmpDir
                java.io.File r0 = r0.directory
                java.io.File r2 = new java.io.File
                r2.<init>(r0, r3)
                java.io.InputStream r5 = r12.getDexContents()
                int r6 = r12.getSizeHint(r5)     // Catch:{ all -> 0x008a }
                java.lang.String r1 = "size hint for %s: %s"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x008a }
                java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}     // Catch:{ all -> 0x008a }
                com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x008a }
                java.lang.String r0 = "rw"
                java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x008a }
                r8.<init>(r2, r0)     // Catch:{ all -> 0x008a }
                com.facebook.common.dextricks.OdexSchemeTurbo$TurboDexOptRunner r4 = r11.mDexOptRunner     // Catch:{ InterruptedException -> 0x007f }
                java.lang.String r9 = "quick"
                r10 = 0
                r4.run(r5, r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x007f }
                r8.close()     // Catch:{ all -> 0x008a }
                if (r5 == 0) goto L_0x0064
                r5.close()
            L_0x0064:
                java.io.File r4 = r11.mDummyZip
                com.facebook.common.dextricks.DexStore r0 = r11.mDexStore
                java.io.File r1 = r0.root
                java.io.File r0 = new java.io.File
                r0.<init>(r1, r7)
                com.facebook.common.dextricks.Fs.linkAtomic(r4, r0)
                com.facebook.common.dextricks.DexStore r0 = r11.mDexStore
                java.io.File r1 = r0.root
                java.io.File r0 = new java.io.File
                r0.<init>(r1, r3)
                com.facebook.common.dextricks.Fs.renameOrThrow(r2, r0)
                return
            L_0x007f:
                java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0085 }
                r0.<init>()     // Catch:{ all -> 0x0085 }
                throw r0     // Catch:{ all -> 0x0085 }
            L_0x0085:
                r0 = move-exception
                r8.close()     // Catch:{ all -> 0x0089 }
            L_0x0089:
                throw r0     // Catch:{ all -> 0x008a }
            L_0x008a:
                r0 = move-exception
                if (r5 == 0) goto L_0x0090
                r5.close()     // Catch:{ all -> 0x0090 }
            L_0x0090:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeTurbo.TurboCompiler.compile(com.facebook.common.dextricks.InputDex):void");
        }

        public TurboCompiler(DexStore dexStore, int i) {
            this.mDexOptRunner = new TurboDexOptRunner(dexStore.root);
            this.mDexStore = dexStore;
            this.mFlags = i;
            DexStore.TmpDir makeTemporaryDirectory = dexStore.makeTemporaryDirectory("turbo-compiler");
            this.mTmpDir = makeTemporaryDirectory;
            try {
                File file = new File(makeTemporaryDirectory.directory, "dummy.zip");
                this.mDummyZip = file;
                OdexSchemeTurbo.makeDummyZip(file);
            } catch (Throwable th) {
                Fs.safeClose((Closeable) this.mTmpDir);
                throw th;
            }
        }
    }

    public final class TurboDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer;
        public final DexStore.Config mDsConfig;

        public void addDexOptOptions(ProcessBuilder processBuilder) {
            DexStore.Config config = this.mDsConfig;
            if (config != null) {
                OdexSchemeTurbo.addConfiguredDexOptOptions(config, processBuilder);
            }
        }

        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            byte[] bArr = this.mBuffer;
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

        public TurboDexOptRunner(File file) {
            super(file);
            this.mBuffer = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
            this.mDsConfig = null;
        }

        public TurboDexOptRunner(DexStore.Config config, File file) {
            super(file);
            this.mBuffer = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
            this.mDsConfig = config;
        }
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        String[] strArr = new String[(length << 1)];
        for (int i = 0; i < length; i++) {
            String makeDexName = makeDexName(dexArr[i]);
            int i2 = i << 1;
            strArr[i2] = makeDexName;
            strArr[i2 + 1] = makeOdexName(makeDexName);
        }
        return strArr;
    }

    public final void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        int i = 0;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                configuration.addDex(new File(file, strArr[i]), new File(file, this.expectedFiles[i + 1]));
                i += 2;
            } else {
                return;
            }
        }
    }

    public String getSchemeName() {
        return "OdexSchemeTurbo";
    }

    public OdexSchemeTurbo(DexManifest.Dex[] dexArr) {
        this(8, dexArr);
    }

    public static void addConfiguredDexOptOptions(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        String str3;
        byte b = config.dalvikVerify;
        if (b != 0) {
            if (b == 1) {
                Mlog.safeFmt("using DALVIK_VERIFY_NONE as requested in config file", new Object[0]);
                str3 = "-Vn";
            } else if (b == 2) {
                Mlog.safeFmt("using DALVIK_VERIFY_REMOTE as requested in config file", new Object[0]);
                str3 = "-Vr";
            } else if (b != 3) {
                Mlog.w("ignoring unknown Dalvik verify value %s in config file", Byte.valueOf(b));
            } else {
                Mlog.safeFmt("using DALVIK_VERIFY_ALL as requested in config file", new Object[0]);
                str3 = "-Va";
            }
            processBuilder.addArgument(str3);
        }
        byte b2 = config.dalvikOptimize;
        if (b2 != 0) {
            if (b2 == 1) {
                Mlog.safeFmt("using DALVIK_OPT_NONE as requested in config file", new Object[0]);
                str2 = "-On";
            } else if (b2 == 2) {
                Mlog.safeFmt("using DALVIK_OPT_VERIFIED as requested in config file", new Object[0]);
                str2 = "-Ov";
            } else if (b2 == 3) {
                Mlog.safeFmt("using DALVIK_OPT_ALL as requested in config file", new Object[0]);
                str2 = "-Oa";
            } else if (b2 != 4) {
                Mlog.w("ignoring unknown Dalvik optimize value %s in config file", Byte.valueOf(b2));
            } else {
                Mlog.safeFmt("using DALVIK_OPT_FULL as requested in config file", new Object[0]);
                str2 = "-Of";
            }
            processBuilder.addArgument(str2);
        }
        byte b3 = config.dalvikRegisterMaps;
        if (b3 != 0) {
            if (b3 == 1) {
                str = "-Rn";
            } else if (b3 != 2) {
                Mlog.w("ignoring unknown Dalvik register map value %s in config file", Byte.valueOf(b3));
                return;
            } else {
                str = "-Ry";
            }
            processBuilder.addArgument(str);
        }
    }

    public static String makeDexName(DexManifest.Dex dex) {
        return AnonymousClass00U.A0V("prog-", dex.hash, ".dex.jar");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void makeDummyZip(java.io.File r4) {
        /*
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r4)
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x003d }
            r2.<init>(r3)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "META-INF/MANIFEST.MF"
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0038 }
            r0.<init>(r1)     // Catch:{ all -> 0x0038 }
            r2.putNextEntry(r0)     // Catch:{ all -> 0x0038 }
            java.io.PrintStream r1 = new java.io.PrintStream     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "Manifest-Version: 1.0"
            r1.println(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "Created-By: OdexSchemeTurbo"
            r1.println(r0)     // Catch:{ all -> 0x0033 }
            r1.flush()     // Catch:{ all -> 0x0033 }
            r1.close()     // Catch:{ all -> 0x0033 }
            r1.close()     // Catch:{ all -> 0x0038 }
            r2.close()     // Catch:{ all -> 0x003d }
            r3.close()
            return
        L_0x0033:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeTurbo.makeDummyZip(java.io.File):void");
    }

    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboCompiler(dexStore, i);
    }

    public static String makeOdexName(String str) {
        return AnonymousClass00U.A0L(Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }

    public OdexSchemeTurbo(int i, DexManifest.Dex[] dexArr) {
        super(i, makeExpectedFileList(dexArr));
    }
}

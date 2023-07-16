package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OdexSchemeArtTurbo extends OdexScheme {
    public static final String OREO_ODEX_DIR = "oat";
    public static boolean sAttemptedArtHackInstallation;

    public final class TurboArtCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        public void close() {
            this.mTmpDir.close();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
            if (r8 == null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            com.facebook.common.dextricks.Fs.renameOrThrow(r6, new java.io.File(r10.mDexStore.root, r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0074=Splitter:B:24:0x0074, B:15:0x005b=Splitter:B:15:0x005b} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void compile(com.facebook.common.dextricks.InputDex r11) {
            /*
                r10 = this;
                com.facebook.common.dextricks.DexManifest$Dex r0 = r11.dex
                java.lang.String r7 = r0.makeDexName()
                com.facebook.common.dextricks.DexStore r0 = r10.mDexStore
                java.io.File r0 = r0.root
                java.io.File r1 = new java.io.File
                r1.<init>(r0, r7)
                int r0 = r10.mFlags
                r0 = r0 & 1
                if (r0 == 0) goto L_0x001c
                boolean r0 = r1.exists()
                if (r0 == 0) goto L_0x001c
                return
            L_0x001c:
                com.facebook.common.dextricks.DexStore$TmpDir r0 = r10.mTmpDir
                java.io.File r0 = r0.directory
                java.io.File r6 = new java.io.File
                r6.<init>(r0, r7)
                java.io.InputStream r8 = r11.getDexContents()
                int r0 = r11.getSizeHint(r8)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = "size hint for %s: %s"
                r9 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0075 }
                java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}     // Catch:{ all -> 0x0075 }
                com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0075 }
                java.lang.String r0 = "rw"
                java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0075 }
                r5.<init>(r6, r0)     // Catch:{ all -> 0x0075 }
                r0 = 32768(0x8000, float:4.5918E-41)
                byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0070 }
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2 = 0
            L_0x004b:
                int r0 = r3 - r2
                int r1 = X.C03370Ia.A02(r8, r4, r0)     // Catch:{ all -> 0x0070 }
                r0 = -1
                if (r1 == r0) goto L_0x005b
                r5.write(r4, r9, r1)     // Catch:{ all -> 0x0070 }
                int r2 = r2 + r1
                if (r2 >= r3) goto L_0x005b
                goto L_0x004b
            L_0x005b:
                r5.close()     // Catch:{ all -> 0x0075 }
                if (r8 == 0) goto L_0x0063
                r8.close()
            L_0x0063:
                com.facebook.common.dextricks.DexStore r0 = r10.mDexStore
                java.io.File r1 = r0.root
                java.io.File r0 = new java.io.File
                r0.<init>(r1, r7)
                com.facebook.common.dextricks.Fs.renameOrThrow(r6, r0)
                return
            L_0x0070:
                r0 = move-exception
                r5.close()     // Catch:{ all -> 0x0074 }
            L_0x0074:
                throw r0     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r0 = move-exception
                if (r8 == 0) goto L_0x007b
                r8.close()     // Catch:{ all -> 0x007b }
            L_0x007b:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtTurbo.TurboArtCompiler.compile(com.facebook.common.dextricks.InputDex):void");
        }

        public TurboArtCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-art-compiler");
        }
    }

    public OdexSchemeArtTurbo(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, (String) null)));
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, String str) {
        int length = dexArr.length;
        int i = length;
        if (str != null) {
            length++;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new ExpectedFileInfo(dexArr[i2]));
        }
        if (str != null) {
            arrayList.add(new ExpectedFileInfo(str));
        }
        return arrayList;
    }

    public String getSchemeName() {
        return "OdexSchemeArtTurbo";
    }

    public static String getArch() {
        String str = Build.SUPPORTED_32_BIT_ABIS[0];
        if (str.equals("x86")) {
            return "x86";
        }
        if (str.equals("armeabi-v7a")) {
            return "arm";
        }
        throw new RuntimeException(AnonymousClass00U.A0L("Unknown ABI ", str));
    }

    public static String getOreoOdexOutputDirectory(File file, boolean z) {
        File file2 = new File(file, AnonymousClass00U.A0L("oat/", getArch()));
        if (z) {
            Fs.mkdirOrThrow(file2);
        }
        return AnonymousClass00U.A0L(file2.getPath(), "/");
    }

    public static String[] makeExpectedFileListFrom(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((ExpectedFileInfo) list.get(i)).toExpectedFileString();
        }
        return strArr;
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i < 29) {
            i2 = 6;
        }
        if (!sAttemptedArtHackInstallation) {
            sAttemptedArtHackInstallation = true;
            try {
                int installArtHacks = DalvikInternals.installArtHacks(i2, i);
                if ((i2 & 2) != 0 && (installArtHacks & 2) == 0) {
                    DexTricksErrorReporter.reportSampledSoftError("OdexSchemeArtTurbo", AnonymousClass00U.A0L("Could not install 0x", Integer.toHexString(2)), 100, (Throwable) null);
                }
            } catch (Exception e) {
                Mlog.w(e, "failed to install verifier-disabling ART hacks; continuing slowly", new Object[0]);
            }
        }
        int enabledThreadArtHacks = DalvikInternals.getEnabledThreadArtHacks();
        DalvikInternals.setEnabledThreadArtHacks(i2 | enabledThreadArtHacks);
        try {
            Mlog.safeFmt("enabled ART verifier hack (warning-level logs following are expected)", new Object[0]);
            int i3 = 0;
            while (true) {
                String[] strArr = this.expectedFiles;
                if (i3 < strArr.length) {
                    if (!strArr[i3].equals(OREO_ODEX_DIR)) {
                        configuration.addDex(new File(file, strArr[i3]), true);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        } finally {
            DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            Mlog.safeFmt("restored old ART hack mask", new Object[0]);
        }
    }

    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboArtCompiler(dexStore, i);
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, String str) {
        return makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, str));
    }

    public OdexSchemeArtTurbo(int i, String[] strArr) {
        super(i, strArr);
    }
}

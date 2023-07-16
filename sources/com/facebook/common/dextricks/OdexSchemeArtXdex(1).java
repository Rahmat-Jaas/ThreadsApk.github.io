package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass0FW;
import X.AnonymousClass0JR;
import X.C03670Kf;
import X.C15020qa;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.facebook.common.dextricks.Dex2oatLogcatParser;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.DexUnpacker;
import com.facebook.common.dextricks.ExpectedFileInfo;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.forker.ProcessBuilder;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class OdexSchemeArtXdex extends OdexSchemeArtTurbo {
    public static final boolean APPLY_MIRANDA_HACK = true;
    public static final String CREATED_BY_OATMEAL = "86827de6f1ef3407f8dc98b76382d3a6e0759ab3";
    public static final String DEX_MANIFEST_RESOURCE_PATH = "dex_manifest.txt";
    public static final String DISABLING_PGO = "OdexSchemeArtXdex_DisablingPGO";
    public static final String ENV_LD_PRELOAD = "LD_PRELOAD";
    public static final int MAX_OAT_OPTIMIZATION_ATTEMPTS = 3;
    public static final long MIN_DISK_FREE_FOR_MIXED_MODE = 419430400;
    public static final String MISSING_PGO_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_MissingPGO";
    public static final String MIXED_MODE_DATA_RESOURCE_PATH = "mixed_mode.txt";
    public static final String QUICK_DATA_RESOURCE_PATH = "oatmeal.bin";
    public static final String REGENERATE_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_REGEN";
    public static final long STATE_DEX2OAT_CLASSPATH_SET = 2048;
    public static final long STATE_DEX2OAT_QUICKENING_NEEDED = 64;
    public static final long STATE_DEX2OAT_QUICK_ATTEMPTED = 512;
    public static final long STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED = 32768;
    public static final long STATE_DO_PERIODIC_PGO_COMP_FINISHED = 65536;
    public static final long STATE_DO_PERIODIC_PGO_COMP_NEEDED = 16384;
    public static final long STATE_MASK = 20720;
    public static final long STATE_MIXED_ATTEMPTED = 1024;
    public static final long STATE_MIXED_NEEDED = 128;
    public static final long STATE_OATMEAL_QUICKENING_NEEDED = 32;
    public static final long STATE_OATMEAL_QUICK_ATTEMPTED = 256;
    public static final long STATE_OPT_COMPLETED = 16;
    public static final long STATE_PGO_ATTEMPTED = 8192;
    public static final long STATE_PGO_NEEDED = 4096;
    public static final String TMP_DEX_MANIFEST_FILE = "art_dex_manifest";
    public static final String TMP_MIXED_MODE_DATA_FILE = "art_mixed_mode_data_input";
    public static final String TMP_QUICK_DATA_FILE = "art_quick_data_input";
    public final DexUnpacker mDexUnpacker;
    public final DexManifest.Dex[] mDexes;
    public final boolean mIsLoadable;
    public String mOatmealPath;
    public final AnonymousClass0JR mPGOProfileUtil;
    public final ResProvider mResProvider;

    public class CriticalCannotTruncateDexesSection implements Closeable {
        public final boolean mHasMarked;
        public final File mRoot;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r4) == false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CriticalCannotTruncateDexesSection(java.io.File r4, boolean r5) {
            /*
                r2 = this;
                com.facebook.common.dextricks.OdexSchemeArtXdex.this = r3
                r2.<init>()
                r2.mRoot = r4
                if (r5 == 0) goto L_0x0010
                boolean r1 = com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r4)
                r0 = 1
                if (r1 != 0) goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                r2.mHasMarked = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.CriticalCannotTruncateDexesSection.<init>(com.facebook.common.dextricks.OdexSchemeArtXdex, java.io.File, boolean):void");
        }

        public void close() {
            if (this.mHasMarked) {
                OdexSchemeArtXdex.clearCannotTruncateDexesFlag(this.mRoot);
            }
        }

        public CriticalCannotTruncateDexesSection(OdexSchemeArtXdex odexSchemeArtXdex, File file) {
            this(file, true);
        }
    }

    public class Dex2OatProgressListener implements DexStore.ExternalProcessProgressListener {
        public static final long CHECKPOINT_PERIOD = TimeUnit.MINUTES.toMillis(5);
        public static final String EVENT_NAME = "OptsvcEvent";
        public final Context mAppContext;
        public final int mAttemptNumber;
        public Integer mExitStatus;
        public final String mJobName;
        public long mLastCheckpointMs;
        public final long mStartTimeMs;

        private void convertDex2OatStatInfoToEventMap(Map map, Dex2oatLogcatParser.Dex2OatStatInfo dex2OatStatInfo) {
            String replace = dex2OatStatInfo.statType.replace(' ', '_');
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_TOTAL_CASES, Integer.valueOf(dex2OatStatInfo.totalCases));
            addDex2OatStatToEventMap(map, replace, "success", Integer.valueOf(dex2OatStatInfo.success));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, Integer.valueOf(dex2OatStatInfo.failure));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_PERCENT, Double.valueOf(dex2OatStatInfo.percent));
        }

        private String makeKeyNameFromDex2OatStatInfo(String str, String str2) {
            return AnonymousClass00U.A0d("dex2oat_stat_", str, "_", str2);
        }

        private String normalizeDex2OatStatType(String str) {
            return str.replace(' ', '_');
        }

        public void logEvent(String str, Dex2oatLogcatParser dex2oatLogcatParser) {
            Set<Dex2oatLogcatParser.Dex2OatStatInfo> emptySet;
            if (this.mExitStatus == null) {
                Mlog.w("Bad call to logEvent, exit status not set", new Object[0]);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "finish");
            hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.mStartTimeMs));
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_EXIT_CODE, this.mExitStatus);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_DETAIL_MSG, str);
            }
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
            if (dex2oatLogcatParser != null) {
                emptySet = dex2oatLogcatParser.mDex2OatStatInfos;
            } else {
                emptySet = Collections.emptySet();
            }
            for (Dex2oatLogcatParser.Dex2OatStatInfo convertDex2OatStatInfoToEventMap : emptySet) {
                convertDex2OatStatInfoToEventMap(hashMap, convertDex2OatStatInfoToEventMap);
            }
            OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, hashMap);
        }

        public Dex2OatProgressListener(Context context, String str, int i) {
            Context applicationContext = context.getApplicationContext();
            this.mAppContext = applicationContext != null ? applicationContext : context;
            this.mJobName = str;
            this.mAttemptNumber = i;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.mStartTimeMs = uptimeMillis;
            this.mLastCheckpointMs = uptimeMillis;
        }

        private void addDex2OatStatToEventMap(Map map, String str, String str2, Object obj) {
            String makeKeyNameFromDex2OatStatInfo = makeKeyNameFromDex2OatStatInfo(str, str2);
            Mlog.safeFmt("Adding dex2oat stat key %s with %s", makeKeyNameFromDex2OatStatInfo, obj);
            map.put(makeKeyNameFromDex2OatStatInfo, obj);
        }

        public void onCheckpoint() {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.mLastCheckpointMs >= CHECKPOINT_PERIOD) {
                this.mLastCheckpointMs = uptimeMillis;
                HashMap hashMap = new HashMap();
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "checkpoint");
                hashMap.put("duration", Long.valueOf(uptimeMillis - this.mStartTimeMs));
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
                OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, hashMap);
            }
        }

        public void onComplete(int i) {
            this.mExitStatus = Integer.valueOf(i);
        }
    }

    public interface DexSelector {
        boolean select(DexManifest.Dex dex);
    }

    public class ManifestEntry {
        public final boolean background;
        public final String canary;
        public final boolean coldstart;
        public final boolean extended;
        public final int ordinal;
        public final boolean primary;
        public final boolean scroll;

        public static ManifestEntry fromCSV(String str) {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int length = split.length;
            if (length < 1) {
                return null;
            }
            String convertClassToDotForm = OdexSchemeArtXdex.convertClassToDotForm(split[0]);
            int i = -1;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 = 1; i2 < length; i2++) {
                String[] split2 = split[i2].split("=");
                if (split2.length != 2) {
                    return null;
                }
                if (split2[0].equals("primary")) {
                    z = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z = true;
                    }
                } else if (split2[0].equals("extended")) {
                    z3 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z3 = true;
                    }
                } else if (split2[0].equals("scroll")) {
                    z4 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z4 = true;
                    }
                } else if (split2[0].equals("coldstart")) {
                    z2 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z2 = true;
                    }
                } else if (split2[0].equals(AppStateModule.APP_STATE_BACKGROUND)) {
                    z5 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z5 = true;
                    }
                } else if (split2[0].equals("ordinal")) {
                    i = Integer.valueOf(split2[1]).intValue();
                }
            }
            return new ManifestEntry(convertClassToDotForm, i, z, z2, z3, z4, z5);
        }

        public ManifestEntry(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.canary = str;
            this.ordinal = i;
            this.primary = z;
            this.coldstart = z2;
            this.extended = z3;
            this.scroll = z4;
            this.background = z5;
        }
    }

    public OdexSchemeArtXdex(Context context, DexManifest.Dex[] dexArr, ResProvider resProvider, long j) {
        super(1, OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j)));
        this.mDexes = dexArr;
        this.mResProvider = resProvider;
        this.mIsLoadable = (j & STATE_MASK) != 0;
        this.mPGOProfileUtil = AnonymousClass0JR.A00(context);
        this.mDexUnpacker = new DexUnpacker(context, resProvider);
        this.mOatmealPath = null;
    }

    public static boolean anyOptimizationDone(long j) {
        return (j & STATE_MASK) != 0;
    }

    private List getMixedModeDexInfos(List list, DexStore.TmpDir tmpDir, boolean z, byte b, DexManifest.Dex[] dexArr) {
        DexStore.TmpDir tmpDir2 = tmpDir;
        File extractResourceFile = extractResourceFile(DEX_MANIFEST_RESOURCE_PATH, tmpDir.directory, TMP_DEX_MANIFEST_FILE);
        Object[] objArr = new Object[0];
        List list2 = list;
        boolean z2 = z;
        DexManifest.Dex[] dexArr2 = dexArr;
        if (extractResourceFile == null) {
            Mlog.safeFmt("[opt][mixed_mode] Getting mixed mode dex infos in legacy mode", objArr);
            return getMixedModeDexInfosLegacy(list, tmpDir, z, dexArr);
        }
        Mlog.safeFmt("[opt][mixed_mode] Getting mixed mode dex infos in manifest mode", objArr);
        return getMixedModeDexInfosManifest(extractResourceFile, list2, tmpDir2, z2, dexSelectorForMultidexCompilationStrategy(extractResourceFile, b), dexArr2);
    }

    public static boolean markedToTryPgoProfileRecompilation(long j) {
        return (j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0;
    }

    public static boolean mixedNeeded(long j) {
        return (j & 128) != 0;
    }

    public static boolean optimizationCompleted(long j) {
        return (j & 16) != 0;
    }

    private boolean optimizeOatmeal(Context context, Renamer renamer, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.TmpDir tmpDir, boolean z, File file, List list) {
        DexStore dexStore2 = dexStore;
        File file2 = file;
        List list2 = list;
        if (file == null) {
            file2 = dexStore.root;
        }
        if (list == null) {
            list2 = makeExpectedFileInfoList(this.mDexes, 0);
        }
        return optimizeOatmealForOreo(context, renamer, dexStore2, optimizationSession, tmpDir, file2, list2);
    }

    private boolean optimizeOatmealForOreo(Context context, Renamer renamer, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.TmpDir tmpDir, File file, List list) {
        File file2 = file;
        String oreoOdexOutputDirectory = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(file2, true);
        DexStore.TmpDir tmpDir2 = tmpDir;
        ProcessBuilder processBuilder = new ProcessBuilder(getOatmealPath(tmpDir2), "--write-elf", "--build", AnonymousClass00U.A0L("--arch=", OdexSchemeArtTurbo.getArch()), AnonymousClass00U.A0L("--art-image-location=", getArtImageLocation()), AnonymousClass00U.A0V("--oat=", tmpDir2.directory.getPath(), "/"), AnonymousClass00U.A0L("--oat-version=", getOatVersion()));
        processBuilder.setenv("LD_LIBRARY_PATH", C15020qa.A02());
        Context context2 = context;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context2;
        }
        processBuilder.mTmpDir = ProcessBuilder.genDefaultTmpDir(applicationContext);
        if (DalvikInternals.detectSamsungOatFormat()) {
            processBuilder.addArgument("--samsung-oatformat");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExpectedFileInfo expectedFileInfo = (ExpectedFileInfo) it.next();
            processBuilder.addArgument(AnonymousClass00U.A0L("--dex=", expectedFileInfo.getFile(file2).getPath()));
            String oatNameFromExpectedFileInfo = oatNameFromExpectedFileInfo(expectedFileInfo);
            String vdexNameFromOdexName = vdexNameFromOdexName(oatNameFromExpectedFileInfo);
            File file3 = new File(oreoOdexOutputDirectory, oatNameFromExpectedFileInfo);
            File file4 = new File(tmpDir2.directory, oatNameFromExpectedFileInfo);
            Renamer renamer2 = renamer;
            renamer2.addFile(file4, file3);
            renamer2.addFile(new File(tmpDir2.directory, vdexNameFromOdexName), new File(oreoOdexOutputDirectory, vdexNameFromOdexName));
        }
        Mlog.safeFmt("oatmeal: %s", processBuilder);
        startOptimizerProcess(processBuilder, context2, "oatmeal", optimizationSession, (Dex2oatLogcatParser) null, tmpDir2);
        return true;
    }

    public static boolean quickeningNeeded(long j) {
        long j2 = j & STATE_MASK;
        return j2 == 32 || j2 == 64;
    }

    public String getSchemeName() {
        return "OdexSchemeArtXdex";
    }

    public final class Dex2OatHookInfo {
        public final String envFlag;
        public final String libName;

        public Dex2OatHookInfo(String str, String str2) {
            this.libName = str;
            this.envFlag = str2;
        }
    }

    public class OptimizationStateHolder {
        public long status;
        public long statusIntent;
        public boolean success;

        public OptimizationStateHolder(boolean z, long j, long j2) {
            this.success = z;
            this.status = j;
            this.statusIntent = j2;
        }
    }

    public class Renamer {
        public ArrayList mDestFiles = new ArrayList();
        public ArrayList mSourceFiles = new ArrayList();
        public final DexStore.TmpDir mTmpDir;

        public void renameOrThrow() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.mSourceFiles;
                if (i < arrayList.size()) {
                    File file = (File) arrayList.get(i);
                    File file2 = (File) this.mDestFiles.get(i);
                    Mlog.safeFmt("Renaming %s to %s", file, file2);
                    Fs.renameOrThrow(file, file2);
                    i++;
                } else {
                    return;
                }
            }
        }

        public void reset() {
            Mlog.safeFmt("Resetting Renamer", new Object[0]);
            this.mSourceFiles.clear();
            this.mDestFiles.clear();
        }

        public Renamer(DexStore.TmpDir tmpDir) {
            this.mTmpDir = tmpDir;
        }

        public void addFile(File file, File file2) {
            Mlog.safeFmt("Queueing Rename of src %s to dest %s", file.getAbsolutePath(), file2.getAbsolutePath());
            this.mSourceFiles.add(file);
            this.mDestFiles.add(file2);
        }
    }

    public static boolean anyCompilationNeeded(DexStore.Config config) {
        if (config.enableMixedMode || config.enableMixedModePgo || config.tryPeriodicPgoCompilation) {
            return true;
        }
        return false;
    }

    public static List convertCopiedDexInfoToExpectedDexInfo(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExpectedFileInfo((DexUnpacker.CopiedDexInfo) it.next()));
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0027=Splitter:B:15:0x0027, B:21:0x002f=Splitter:B:21:0x002f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File extractResourceFile(java.lang.String r5, java.io.File r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "txt"
            java.io.File r3 = java.io.File.createTempFile(r7, r0, r6)     // Catch:{ IOException -> 0x0030 }
            r3.deleteOnExit()     // Catch:{ IOException -> 0x0030 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0030 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0030 }
            com.facebook.common.dextricks.ResProvider r0 = r4.mResProvider     // Catch:{ all -> 0x002b }
            java.io.InputStream r1 = r0.open(r5)     // Catch:{ all -> 0x002b }
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.C03370Ia.A01(r1, r2, r0)     // Catch:{ all -> 0x001b }
            goto L_0x0022
        L_0x001b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ all -> 0x002b }
        L_0x0027:
            r2.close()     // Catch:{ IOException -> 0x0030 }
            return r3
        L_0x002b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            throw r0     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            java.lang.String r1 = "[opt][res] io exception "
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.facebook.common.dextricks.Mlog.e(r1, r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.extractResourceFile(java.lang.String, java.io.File, java.lang.String):java.io.File");
    }

    public static String getBootClassPathValue(DexStore dexStore, boolean z) {
        String str = System.getenv("BOOTCLASSPATH");
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(dependencyOdexFiles[i].getAbsoluteFile());
        }
        return sb.toString();
    }

    public static File getCannotTruncateDexFlagFile(File file) {
        return DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
    }

    public static boolean getCannotTruncateDexesFlag(File file) {
        return DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg").exists();
    }

    public static String getClassPathValue(DexStore dexStore, File file, List list) {
        StringBuilder sb = new StringBuilder();
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(dependencyOdexFiles[i].getAbsoluteFile());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = ((ExpectedFileInfo) it.next()).getFile(file);
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(file2.getAbsolutePath());
        }
        return sb.toString();
    }

    public static long getCompilationStatusFlags(DexStore.Config config) {
        long j;
        if (config.enableMixedMode) {
            j = 128;
        } else {
            j = 0;
        }
        if (config.tryPeriodicPgoCompilation) {
            j |= STATE_DO_PERIODIC_PGO_COMP_NEEDED;
        }
        if (config.enableMixedModePgo) {
            return j | STATE_PGO_NEEDED;
        }
        return j;
    }

    private Dex2OatHookInfo getDex2OatLibHooks(Context context, DexStore.OptimizationSession optimizationSession) {
        Object[] objArr;
        String str;
        if (AnonymousClass0FW.A00.booleanValue()) {
            objArr = new Object[0];
            str = "Not installing Dex2OatLibHooks on 64 bit device";
        } else {
            objArr = new Object[0];
            if (!optimizationSession.config.installDex2OatHooks) {
                str = "Not installing Dex2OatLibHooks";
            } else {
                Mlog.safeFmt("Going to try installing Dex2OatLibHooks", objArr);
                return new Dex2OatHookInfo("dex2oathooks", "FB_ENABLE_DEX2OAT_HOOKS");
            }
        }
        Mlog.safeFmt(str, objArr);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|22|23|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0049 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0040=Splitter:B:18:0x0040, B:24:0x0049=Splitter:B:24:0x0049} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List getMixedModeDexInfosLegacy(java.util.List r7, com.facebook.common.dextricks.DexStore.TmpDir r8, boolean r9, com.facebook.common.dextricks.DexManifest.Dex[] r10) {
        /*
            r6 = this;
            java.io.File r2 = r8.directory
            java.lang.String r1 = "mixed_mode.txt"
            java.lang.String r0 = "art_mixed_mode_data_input"
            java.io.File r3 = r6.extractResourceFile(r1, r2, r0)
            r2 = 0
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            if (r3 != 0) goto L_0x0016
            java.lang.String r0 = "[opt][mixed_mode] no mixed mode data file found"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            return r2
        L_0x0016:
            java.lang.String r0 = "[opt][mixed_mode] found mixed mode data file"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x004a }
            r0.<init>(r3)     // Catch:{ IOException -> 0x004a }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x004a }
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = r0.trim()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0038
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0040
            goto L_0x0038
        L_0x0036:
            r0 = move-exception
            goto L_0x0046
        L_0x0038:
            java.lang.String r1 = "[opt][mixed_mode] mixed mode data missing in mixed mode data file"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0044 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x0044 }
            r4 = r2
        L_0x0040:
            r3.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0055
        L_0x0044:
            r0 = move-exception
            r4 = r2
        L_0x0046:
            r3.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004d }
        L_0x004a:
            r3 = move-exception
            r4 = r2
            goto L_0x004e
        L_0x004d:
            r3 = move-exception
        L_0x004e:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "[opt][mixed_mode] problem reading mixed mode data file"
            com.facebook.common.dextricks.Mlog.w(r3, r0, r1)
        L_0x0055:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "[opt][mixed_mode] mixed mode canary is %s"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            if (r4 == 0) goto L_0x0079
            if (r9 == 0) goto L_0x0075
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            com.facebook.common.dextricks.ExpectedFileInfo$CompilationType r0 = com.facebook.common.dextricks.ExpectedFileInfo.CompilationType.PGO
            java.util.List r2 = com.facebook.common.dextricks.ExpectedFileInfo.setCompTypeIfUnknown(r7, r0)
        L_0x0075:
            java.util.List r2 = makeMixedModeFileList((com.facebook.common.dextricks.DexManifest.Dex[]) r10, (java.lang.String) r4, (java.util.List) r2)
        L_0x0079:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "[opt][mixed_mode] mixed mode dex names: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.getMixedModeDexInfosLegacy(java.util.List, com.facebook.common.dextricks.DexStore$TmpDir, boolean, com.facebook.common.dextricks.DexManifest$Dex[]):java.util.List");
    }

    private List getMixedModeDexInfosManifest(File file, List list, DexStore.TmpDir tmpDir, boolean z, DexSelector dexSelector, DexManifest.Dex[] dexArr) {
        List list2;
        if (z) {
            Mlog.safeFmt("[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s", list.toString());
            list2 = ExpectedFileInfo.setCompTypeIfUnknown(list, ExpectedFileInfo.CompilationType.PGO);
        } else {
            list2 = null;
        }
        return makeMixedModeFileList(dexArr, dexSelector, list2);
    }

    private List getNewInitialOptimizedSecondaryDexes(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, AtomicReference atomicReference) {
        DexStore.TmpDir tmpDir2 = tmpDir;
        File makeTmpSubDirectory = makeTmpSubDirectory(tmpDir2, "tmp-unpack-dexes");
        DexStore dexStore2 = dexStore;
        List newSecondaryDexes = getNewSecondaryDexes(makeTmpSubDirectory, dexStore.root);
        atomicReference.set(makeTmpSubDirectory);
        if (newSecondaryDexes == null) {
            return null;
        }
        Mlog.safeFmt("Starting to do initial optimizations for temp secondary dexes", new Object[0]);
        DexStore.DexStoreTestHooks dexStoreTestHooks = DexStore.sDexStoreTestHooks;
        if (dexStoreTestHooks != null) {
            dexStoreTestHooks.onSecondaryDexesUnpackedForRecompilation();
        }
        Renamer renamer2 = renamer;
        Mlog.safeFmt("Optimizing temp secondary dexes got result status: %d", Long.valueOf(initialDexOptimizations(context, dexStore2, optimizationSession, config, tmpDir2, renamer2, makeTmpSubDirectory, newSecondaryDexes)));
        renamer2.renameOrThrow();
        renamer2.reset();
        return newSecondaryDexes;
    }

    private List getNewSecondaryDexes(File file, File file2) {
        return convertCopiedDexInfoToExpectedDexInfo(this.mDexUnpacker.copySecondaryDexes(file, file2));
    }

    public static void initAllDex2OatHooks(ProcessBuilder processBuilder, Dex2OatHookInfo... dex2OatHookInfoArr) {
        int length;
        boolean z;
        if (dex2OatHookInfoArr != null && (length = dex2OatHookInfoArr.length) != 0) {
            StringBuilder sb = new StringBuilder();
            String str = System.getenv(ENV_LD_PRELOAD);
            if (str != null) {
                sb.append(str);
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            boolean z2 = false;
            do {
                Dex2OatHookInfo dex2OatHookInfo = dex2OatHookInfoArr[i];
                if (dex2OatHookInfo != null) {
                    Mlog.safeFmt("Installing hook for %s", dex2OatHookInfo.libName);
                    File A01 = C15020qa.A01(dex2OatHookInfo.libName);
                    if (z) {
                        sb.append(File.pathSeparatorChar);
                    }
                    sb.append(A01.getAbsolutePath());
                    if (dex2OatHookInfo.envFlag != null) {
                        processBuilder.setenv(dex2OatHookInfo.envFlag, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    }
                    z = true;
                    z2 = true;
                }
                i++;
            } while (i < length);
            if (z2) {
                Mlog.safeFmt("Setting %s to %s", ENV_LD_PRELOAD, sb.toString());
                processBuilder.setenv(ENV_LD_PRELOAD, sb.toString());
                processBuilder.setenv("LD_LIBRARY_PATH", C15020qa.A02());
            }
        }
    }

    private long initialDexOptimizations(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, File file, List list) {
        DexStore.Config config2 = config;
        Context context2 = context;
        DexStore dexStore2 = dexStore;
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        DexStore.TmpDir tmpDir2 = tmpDir;
        Renamer renamer2 = renamer;
        File file2 = file;
        List list2 = list;
        if (config2.enableOatmeal) {
            optimizeOatmeal(context2, renamer2, dexStore2, optimizationSession2, tmpDir2, false, file2, list2);
            Mlog.safeFmt("[opt] first oatmeal run", new Object[0]);
            if (config2.enableQuickening) {
                if (config2.enableOatmealQuickening) {
                    return 32;
                }
                return 64;
            } else if (anyCompilationNeeded(config2)) {
                return getCompilationStatusFlags(config2);
            } else {
                return 16;
            }
        } else {
            Mlog.safeFmt("[opt] first dex2oat run", new Object[0]);
            optimizeDex2Oat(context2, dexStore2, renamer2, optimizationSession2, config2, tmpDir2, config2.enableArtVerifyNone, false, false, false, false, (byte) 0, (byte) 0, false, file2, list2);
            return 16;
        }
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, DexSelector dexSelector, List list) {
        int length;
        if (list == null || (length = dexArr.length) == list.size()) {
            int length2 = dexArr.length;
            ArrayList arrayList = new ArrayList(length2);
            for (int i = 0; i < length2; i++) {
                DexManifest.Dex dex = dexArr[i];
                if (dex != null && dexSelector.select(dex)) {
                    Mlog.safeFmt("[mixed_mode] selected dex = { %s, %s, %s }", dex.canaryClass, dex.hash, dex.assetName);
                    ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(dex, ExpectedFileInfo.CompilationType.ALL);
                    if (list == null) {
                        arrayList.add(expectedFileInfo);
                    } else if (i < list.size()) {
                        list.set(i, expectedFileInfo);
                    }
                }
            }
            if (list != null) {
                return list;
            }
            return arrayList;
        }
        throw new IllegalStateException(String.format("Dexes array [size: %d] needs to be the same size as replaceDexNames array [size: %d]", new Object[]{Integer.valueOf(length), Integer.valueOf(list.size())}));
    }

    private boolean needsTruncation(File file, int i) {
        if (i < 0 || dexAppearsTruncated(file, i)) {
            return false;
        }
        return true;
    }

    public static String oatNameFromDexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return AnonymousClass00U.A0L(str, DexManifest.ODEX_EXT);
    }

    public static String oatNameFromExpectedFileInfo(ExpectedFileInfo expectedFileInfo) {
        String str;
        DexManifest.Dex dex = expectedFileInfo.dex;
        if (dex != null) {
            str = dex.makeDexName();
        } else {
            str = expectedFileInfo.rawFile;
        }
        return oatNameFromDexName(str);
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte b, byte b2, boolean z6, File file, List list) {
        File file2 = file;
        if (file == null) {
            file2 = dexStore.root;
        }
        CriticalCannotTruncateDexesSection criticalCannotTruncateDexesSection = new CriticalCannotTruncateDexesSection(file2, z6);
        try {
            boolean innerOptimizeDex2Oat = innerOptimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, z5, b, b2, z6, file2, list);
            criticalCannotTruncateDexesSection.close();
            return innerOptimizeDex2Oat;
        } catch (Throwable unused) {
        }
        throw th;
    }

    private void optimizeInitial(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, DexStore.OptimizationSession.Job job, OptimizationStateHolder optimizationStateHolder) {
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        if (optimizationSession2.optimizationAttemptNumber <= optimizationSession2.config.maximumOptimizationAttempts) {
            OptimizationStateHolder optimizationStateHolder2 = optimizationStateHolder;
            optimizationStateHolder2.status = initialDexOptimizations(context, dexStore, optimizationSession2, config, tmpDir, renamer, (File) null, (List) null) | optimizationStateHolder2.status;
            return;
        }
        throw new IllegalStateException("Unable to optimize in a reasonable amount of attempts");
    }

    public static boolean pgoProfileRecompilationNeeded(DexStore.OptimizationHistoryLog optimizationHistoryLog, long j) {
        if (!optimizationCompleted(optimizationHistoryLog.schemeStatus) || !markedToTryPgoProfileRecompilation(j)) {
            return false;
        }
        return true;
    }

    private void setCompilerFilter(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        byte b = config.artFilter;
        if (b != 0) {
            switch (b) {
                case 1:
                    str2 = "verify-none";
                    break;
                case 2:
                    str2 = "interpret-only";
                    break;
                case 3:
                    str2 = "space";
                    break;
                case 4:
                    str2 = "balanced";
                    break;
                case 5:
                    str2 = "speed";
                    break;
                case 6:
                    str2 = "everything";
                    break;
                case 7:
                    str2 = "time";
                    break;
                default:
                    Mlog.w("ignoring unknown configured ART filter %s", Byte.valueOf(b));
                    break;
            }
        }
        str2 = SystemProperties.get("dalvik.vm.dex2oat-filter");
        if (!str2.isEmpty()) {
            Mlog.safeFmt("Setting dex2oatFilter to system prop: %s", str2);
            str = AnonymousClass00U.A0L("--compiler-filter=", str2);
            processBuilder.addArgument(str);
        }
        Mlog.safeFmt("[opt] no compile-filter set or pgo data, compiling with verify-none", new Object[0]);
        str = "--compiler-filter=verify-none";
        processBuilder.addArgument(str);
    }

    public static boolean shouldUseMixedModeDex2Oat(Context context, boolean z) {
        if (!z) {
            return true;
        }
        return !C03670Kf.A00(AnonymousClass0JR.A00(context).A02).A1F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.facebook.forker.Process} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startOptimizerProcess(com.facebook.forker.ProcessBuilder r11, android.content.Context r12, java.lang.String r13, com.facebook.common.dextricks.DexStore.OptimizationSession r14, com.facebook.common.dextricks.Dex2oatLogcatParser r15, com.facebook.common.dextricks.DexStore.TmpDir r16) {
        /*
            r10 = this;
            int r0 = r14.optimizationAttemptNumber
            com.facebook.common.dextricks.OdexSchemeArtXdex$Dex2OatProgressListener r5 = new com.facebook.common.dextricks.OdexSchemeArtXdex$Dex2OatProgressListener
            r5.<init>(r12, r13, r0)
            r4 = 0
            r0 = r16
            java.io.File r0 = r0.directory     // Catch:{ all -> 0x0080 }
            java.io.RandomAccessFile r9 = com.facebook.common.dextricks.Fs.openUnlinkedTemporaryFile(r0)     // Catch:{ all -> 0x0080 }
            java.io.FileDescriptor r0 = r9.getFD()     // Catch:{ all -> 0x0083 }
            int r1 = com.facebook.forker.Fd.fileno(r0)     // Catch:{ all -> 0x0083 }
            r0 = 1
            int[] r2 = r11.mStreamDispositions     // Catch:{ all -> 0x0083 }
            r2[r0] = r1     // Catch:{ all -> 0x0083 }
            r1 = 2
            r0 = -5
            r2[r1] = r0     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "starting job %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r13}     // Catch:{ all -> 0x0083 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0083 }
            com.facebook.forker.Process r4 = r11.create()     // Catch:{ all -> 0x007e }
            int r1 = r4.mPid     // Catch:{ all -> 0x0083 }
            int r8 = r14.waitForAndManageProcess(r4, r5)     // Catch:{ all -> 0x0083 }
            if (r15 == 0) goto L_0x0056
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0083 }
            r0 = 10000(0x2710, float:1.4013E-41)
            boolean r0 = r15.readAndParseProcess(r1, r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "Success getting logcat dex2oat data: %s in %d ms"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0083 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0083 }
            long r0 = r0 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0083 }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch:{ all -> 0x0083 }
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r0)     // Catch:{ all -> 0x0083 }
        L_0x0056:
            java.lang.String r3 = com.facebook.common.dextricks.Fs.readProgramOutputFile(r9)     // Catch:{ IOException -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            java.lang.String r2 = "Got result from dex2oat [exit status: %d]: %s"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r3}     // Catch:{ all -> 0x0083 }
            com.facebook.common.dextricks.Mlog.safeFmt(r2, r0)     // Catch:{ all -> 0x0083 }
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r9)
            r4.destroy()
            r5.logEvent(r3, r15)
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r1}
            java.lang.String r0 = "%s exited with status %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            if (r8 != 0) goto L_0x008f
            return
        L_0x007e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0080:
            r1 = move-exception
            r0 = r4
            goto L_0x0086
        L_0x0083:
            r1 = move-exception
            r0 = r4
            r4 = r9
        L_0x0086:
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r4)
            if (r0 == 0) goto L_0x00a2
            r0.destroy()
            throw r1
        L_0x008f:
            java.lang.String r0 = com.facebook.forker.Process.describeStatus(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r0, r3}
            java.lang.String r0 = "%s failed: %s: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
        L_0x00a2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.startOptimizerProcess(com.facebook.forker.ProcessBuilder, android.content.Context, java.lang.String, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.Dex2oatLogcatParser, com.facebook.common.dextricks.DexStore$TmpDir):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void truncateWithBackup(java.io.File r4, java.io.File r5, int r6) {
        /*
            r3 = this;
            if (r6 < 0) goto L_0x0023
            com.facebook.common.dextricks.Fs.renameOrThrow(r4, r5)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r4)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x001b }
            r1.<init>(r5)     // Catch:{ all -> 0x001b }
            X.C03370Ia.A00(r1, r2, r6)     // Catch:{ all -> 0x0016 }
            r1.close()     // Catch:{ all -> 0x001b }
            goto L_0x0020
        L_0x0016:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001a }
        L_0x001a:
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        L_0x0020:
            r2.close()
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.truncateWithBackup(java.io.File, java.io.File, int):void");
    }

    public static String vdexNameFromOdexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return AnonymousClass00U.A0L(str, ".vdex");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0123 A[Catch:{ IOException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0178 A[Catch:{ IOException -> 0x019f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void configureClassLoader(java.io.File r28, com.facebook.common.dextricks.MultiDexClassLoader.Configuration r29) {
        /*
            r27 = this;
            r13 = r27
            boolean r0 = r13.mIsLoadable
            r10 = 0
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r12 = r28
            r11 = r29
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "App is not loadable yet, avoid loading secondary dexes"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            super.configureClassLoader(r12, r11)
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r0 = "We pass through this code when loading secondary dexes"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.lang.String[] r0 = r13.expectedFiles
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "oat"
            boolean r2 = r1.contains(r0)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = "expect oat dir"
            com.facebook.common.dextricks.Mlog.assertThat(r2, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = "loading pre-built omni-oat"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            boolean r0 = com.facebook.common.dextricks.DalvikConstants.FB_REDEX_VERIFY_NONE_ENABLED
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = "redex ran in verify-none mode, and may have produced non-verifying bytecode."
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
        L_0x0040:
            com.facebook.common.dextricks.DexStore r20 = com.facebook.common.dextricks.DexStore.findOpened((java.io.File) r12)
            long r2 = r20.reportStatus()
            com.facebook.common.dextricks.DexStore$Config r0 = r20.readConfig()
            int r9 = r0.artTruncatedDexSize
            java.lang.String r8 = com.facebook.common.dextricks.OdexSchemeArtTurbo.getOreoOdexOutputDirectory(r12, r10)
            java.lang.String[] r0 = r13.expectedFiles
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Looking at expected files: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r7 = 0
        L_0x0062:
            java.lang.String[] r1 = r13.expectedFiles
            int r0 = r1.length
            java.lang.String r6 = "OdexSchemeArtXdex_REGEN"
            if (r7 >= r0) goto L_0x0193
            r0 = r1[r7]
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Looking at expected file: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.lang.String[] r4 = r13.expectedFiles
            r1 = r4[r7]
            java.lang.String r0 = ".dex"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = "Skipping since the expected file is not a dex file"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
        L_0x0087:
            int r7 = r7 + 1
            goto L_0x0062
        L_0x008a:
            r0 = r4[r7]
            java.lang.String r0 = oatNameFromDexName(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r8, r0)
            java.io.File r14 = new java.io.File
            r14.<init>(r0)
            r14.lastModified()
            r14.length()
            java.lang.String[] r0 = r13.expectedFiles
            r0 = r0[r7]
            java.io.File r5 = new java.io.File
            r5.<init>(r12, r0)
            java.lang.String[] r0 = r13.expectedFiles
            r1 = r0[r7]
            java.lang.String r0 = ".backup"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.io.File r15 = new java.io.File
            r15.<init>(r12, r0)
            java.lang.String r1 = "odexSchemeArtXDex.configureClassLoader() status="
            long r16 = r20.reportStatus()
            java.lang.String r0 = java.lang.Long.toHexString(r16)
            java.lang.String r4 = X.AnonymousClass00U.A0L(r1, r0)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x00ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = " expected dex file "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " not found"
            r1.append(r0)
        L_0x00e0:
            java.lang.String r4 = r1.toString()
        L_0x00e4:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.facebook.common.dextricks.Mlog.safeFmt(r4, r0)
            goto L_0x0113
        L_0x00ea:
            long r18 = r5.length()
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = " attempting to load 0 length dex file "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " when we seemed to have already compiled to "
            r1.append(r0)
            r1.append(r14)
            goto L_0x00e0
        L_0x0113:
            r23 = r5
            r24 = r2
            r26 = r9
            r21 = r13
            r22 = r12
            boolean r0 = r21.shouldTruncateDexesNow(r22, r23, r24, r26)     // Catch:{ IOException -> 0x019f }
            if (r0 == 0) goto L_0x0178
            r13.truncateWithBackup(r5, r15, r9)     // Catch:{ IOException -> 0x019f }
            java.lang.String r1 = "attempting to truncate %s to %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0151 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}     // Catch:{ IOException -> 0x0151 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ IOException -> 0x0151 }
            r11.addDex((java.io.File) r5, (java.io.File) r14)     // Catch:{ IOException -> 0x0151 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0151 }
            r1.<init>()     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = "added truncated dex ok "
            r1.append(r0)     // Catch:{ IOException -> 0x0151 }
            r1.append(r5)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0151 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0151 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ IOException -> 0x0151 }
            com.facebook.common.dextricks.Fs.deleteRecursive(r15)     // Catch:{ IOException -> 0x0151 }
            goto L_0x0087
        L_0x0151:
            r1 = move-exception
            com.facebook.common.dextricks.Fs.renameOrThrow(r15, r5)     // Catch:{ IOException -> 0x019f }
            java.lang.String r0 = "failed to load truncated dex"
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r6, r0, r1)     // Catch:{ IOException -> 0x019f }
            r20.forceRegenerateOnNextLoad()     // Catch:{ IOException -> 0x019f }
            r11.addDex((java.io.File) r5, (java.io.File) r14)     // Catch:{ IOException -> 0x019f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019f }
            r1.<init>()     // Catch:{ IOException -> 0x019f }
            java.lang.String r0 = "added full dex ok "
            r1.append(r0)     // Catch:{ IOException -> 0x019f }
            r1.append(r5)     // Catch:{ IOException -> 0x019f }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x019f }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x019f }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ IOException -> 0x019f }
            goto L_0x0087
        L_0x0178:
            r11.addDex((java.io.File) r5, (java.io.File) r14)     // Catch:{ IOException -> 0x019f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019f }
            r1.<init>()     // Catch:{ IOException -> 0x019f }
            java.lang.String r0 = "added dex ok "
            r1.append(r0)     // Catch:{ IOException -> 0x019f }
            r1.append(r5)     // Catch:{ IOException -> 0x019f }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x019f }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x019f }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ IOException -> 0x019f }
            goto L_0x0087
        L_0x0193:
            boolean r0 = optimizationCompleted(r2)
            if (r0 == 0) goto L_0x0015
            r0 = r20
            r0.writeStatusLocked(r2)
            return
        L_0x019f:
            r2 = move-exception
            java.lang.String r0 = "IOException adding dex "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " will rethrow and attempt recovery"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r6, r0, r2)
            r20.forceRegenerateOnNextLoad()
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r4, r2)
            com.facebook.common.dextricks.DexStore$RecoverableDexException r0 = new com.facebook.common.dextricks.DexStore$RecoverableDexException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.configureClassLoader(java.io.File, com.facebook.common.dextricks.MultiDexClassLoader$Configuration):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getOatmealPath(com.facebook.common.dextricks.DexStore.TmpDir r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.mOatmealPath
            if (r0 != 0) goto L_0x0049
            java.lang.String r2 = "oatmeal"
            java.io.File r4 = X.C15020qa.A01(r2)
            r4.getParentFile()
            boolean r0 = r4.canExecute()
            if (r0 != 0) goto L_0x0043
            r1 = 0
            java.io.File r0 = r6.directory
            java.io.File r3 = java.io.File.createTempFile(r2, r1, r0)
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
            java.lang.String r0 = r4.getAbsolutePath()
            r5.mOatmealPath = r0
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.getOatmealPath(com.facebook.common.dextricks.DexStore$TmpDir):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0149 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int loadInformationalStatus(java.io.File r18, long r19) {
        /*
            r17 = this;
            r0 = r17
            com.facebook.common.dextricks.DexManifest$Dex[] r0 = r0.mDexes
            r4 = 0
            java.util.List r0 = makeExpectedFileInfoList(r0, r4)
            java.lang.String[] r13 = com.facebook.common.dextricks.OdexSchemeArtTurbo.makeExpectedFileListFrom(r0)
            r12 = 0
            r0 = r18
            java.lang.String r14 = com.facebook.common.dextricks.OdexSchemeArtTurbo.getOreoOdexOutputDirectory(r0, r12)
            r11 = 0
            r10 = 0
        L_0x0017:
            int r0 = r13.length
            r2 = 4096(0x1000, double:2.0237E-320)
            if (r11 >= r0) goto L_0x0040
            r0 = r13[r11]
            java.lang.String r0 = oatNameFromDexName(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r0)
            java.io.File r9 = new java.io.File
            r9.<init>(r0)
            boolean r0 = r9.exists()
            if (r0 != 0) goto L_0x00de
            java.lang.String r1 = "loadInformationalStatus didn't find: "
            java.lang.String r0 = r9.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)
        L_0x0040:
            r0 = 32
            long r6 = r19 & r0
            r15 = 512(0x200, double:2.53E-321)
            r13 = 256(0x100, double:1.265E-321)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00cc
            long r6 = r19 & r13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
            r10 = r10 | 256(0x100, float:3.59E-43)
        L_0x0054:
            r0 = 128(0x80, double:6.32E-322)
            long r6 = r19 & r0
            r11 = 1024(0x400, double:5.06E-321)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            long r6 = r19 & r11
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r10 = r10 | 1024(0x400, float:1.435E-42)
        L_0x0066:
            long r8 = r19 & r2
            r6 = 8192(0x2000, double:4.0474E-320)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            long r1 = r19 & r6
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            r0 = 32768(0x8000, float:4.5918E-41)
            r10 = r10 | r0
        L_0x0078:
            long r1 = r19 & r13
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            r10 = r10 | 2048(0x800, float:2.87E-42)
        L_0x0080:
            long r1 = r19 & r11
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0088
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
        L_0x0088:
            long r1 = r19 & r6
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            r0 = 65536(0x10000, float:9.18355E-41)
            r10 = r10 | r0
        L_0x0091:
            r6 = 2048(0x800, double:1.0118E-320)
            long r1 = r19 & r6
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x009b
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
        L_0x009b:
            r6 = 16384(0x4000, double:8.0948E-320)
            long r1 = r19 & r6
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            r6 = 65536(0x10000, double:3.2379E-319)
            long r1 = r19 & r6
            r6 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00b9
            long r1 = r19 & r6
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00b9
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r10
            r10 = r0
        L_0x00b9:
            long r19 = r19 & r6
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            r0 = 262144(0x40000, float:3.67342E-40)
            r10 = r10 | r0
        L_0x00c2:
            return r10
        L_0x00c3:
            long r1 = r19 & r15
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            goto L_0x0080
        L_0x00cc:
            r0 = 64
            long r6 = r19 & r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            long r6 = r19 & r15
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            r10 = r10 | 512(0x200, float:7.175E-43)
            goto L_0x0054
        L_0x00de:
            java.lang.String r1 = "loadInformationalStatus DID find: "
            java.lang.String r0 = r9.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014f }
            r8.<init>(r9)     // Catch:{ IOException -> 0x014f }
            r0 = 1024(0x400, float:1.435E-42)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x014a }
            r7.<init>(r0)     // Catch:{ all -> 0x014a }
            long r15 = com.facebook.common.dextricks.Fs.discardFromInputStream(r8, r2)     // Catch:{ all -> 0x0145 }
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            java.lang.String r1 = "loadInformationalStatus couldn't read more than 4k of the beginning of "
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0145 }
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x0145 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0145 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x013e
        L_0x0111:
            r0 = 4096(0x1000, float:5.74E-42)
            X.C03370Ia.A01(r8, r7, r0)     // Catch:{ all -> 0x0145 }
            r7.flush()     // Catch:{ all -> 0x0145 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "86827de6f1ef3407f8dc98b76382d3a6e0759ab3"
            int r0 = r1.indexOf(r0)     // Catch:{ all -> 0x0145 }
            r6 = 0
            if (r0 < 0) goto L_0x0127
            r6 = 1
        L_0x0127:
            java.lang.String r0 = "loadInformationalStatus? "
            java.lang.String r1 = X.AnonymousClass00U.A0o(r0, r6)     // Catch:{ all -> 0x0145 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0145 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x013e
            r10 = r10 | 128(0x80, float:1.794E-43)
            r7.close()     // Catch:{ all -> 0x014a }
            r8.close()     // Catch:{ IOException -> 0x014f }
            goto L_0x0040
        L_0x013e:
            r7.close()     // Catch:{ all -> 0x014a }
            r8.close()     // Catch:{ IOException -> 0x014f }
            goto L_0x015e
        L_0x0145:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0149 }
        L_0x0149:
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x014e }
        L_0x014e:
            throw r0     // Catch:{ IOException -> 0x014f }
        L_0x014f:
            java.lang.String r1 = "loadInformationalStatus couldn't open "
            java.lang.String r0 = r9.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            com.facebook.common.dextricks.Mlog.w(r1, r0)
        L_0x015e:
            int r11 = r11 + 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.loadInformationalStatus(java.io.File, long):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:37:0x00f9=Splitter:B:37:0x00f9, B:28:0x00ed=Splitter:B:28:0x00ed} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void optimize(android.content.Context r25, com.facebook.common.dextricks.DexStore r26, com.facebook.common.dextricks.DexStore.OptimizationSession r27) {
        /*
            r24 = this;
            r9 = r26
            com.facebook.common.dextricks.DexStore$Config r7 = r9.readConfig()
            java.lang.String r0 = "dexopt"
            com.facebook.common.dextricks.DexStore$TmpDir r6 = r9.makeTemporaryDirectory(r0)
            com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer r5 = new com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer     // Catch:{ all -> 0x00fa }
            r5.<init>(r6)     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "[opt] opened tmpDir %s; starting job"
            r17 = 1
            java.io.File r0 = r6.directory     // Catch:{ all -> 0x00fa }
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00fa }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00fa }
            r8 = r27
            r8.getClass()     // Catch:{ all -> 0x00fa }
            com.facebook.common.dextricks.DexStore$OptimizationSession$Job r3 = new com.facebook.common.dextricks.DexStore$OptimizationSession$Job     // Catch:{ all -> 0x00fa }
            r3.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "[opt] opened job"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00f5 }
            long r0 = r3.initialStatus     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.DexStore$OptimizationHistoryLog r2 = r8.getOptimizationHistoryLog()     // Catch:{ all -> 0x00f5 }
            r15 = r24
            com.facebook.common.dextricks.OdexScheme$NeedOptimizationState r0 = r15.needOptimization(r0, r7, r2)     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.needsOptimization()     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r1 = "[opt] nothing to do: ART xdex already complete and no need to further optimize"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ed
        L_0x004b:
            long r0 = r3.initialStatus     // Catch:{ all -> 0x00f5 }
            r20 = 0
            com.facebook.common.dextricks.OdexSchemeArtXdex$OptimizationStateHolder r2 = new com.facebook.common.dextricks.OdexSchemeArtXdex$OptimizationStateHolder     // Catch:{ all -> 0x00f5 }
            r16 = r2
            r18 = r0
            r16.<init>(r17, r18, r20)     // Catch:{ all -> 0x00f5 }
            r3.startOptimizing()     // Catch:{ all -> 0x00f5 }
            int r12 = r8.optimizationAttemptNumber     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "[opt] Optimization attempt %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00f5 }
            long r0 = r2.status     // Catch:{ all -> 0x00f5 }
            boolean r0 = anyOptimizationDone(r0)     // Catch:{ all -> 0x00f5 }
            r16 = r25
            if (r0 != 0) goto L_0x00b8
            r23 = r2
            r22 = r3
            r21 = r5
            r20 = r6
            r19 = r7
            r18 = r8
            r17 = r9
            r15.optimizeInitial(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00f5 }
        L_0x0085:
            long r0 = r2.statusIntent     // Catch:{ all -> 0x00f5 }
            r3.startCommitting(r0)     // Catch:{ all -> 0x00f5 }
            boolean r0 = r2.success     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00b0
            r5.renameOrThrow()     // Catch:{ all -> 0x00f5 }
        L_0x0091:
            java.lang.String r5 = "[opt] new status 0x%x"
            long r0 = r2.status     // Catch:{ all -> 0x00f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.safeFmt(r5, r0)     // Catch:{ all -> 0x00f5 }
            long r0 = r2.status     // Catch:{ all -> 0x00f5 }
            long r7 = r2.statusIntent     // Catch:{ all -> 0x00f5 }
            long r0 = r0 | r7
            r3.finishCommit(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "ART xdex optimization phase complete"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ed
        L_0x00b0:
            java.lang.String r1 = "[opt] failure to set up the optimization command"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0091
        L_0x00b8:
            r13 = 16
            r10 = -20721(0xffffffffffffaf0f, double:NaN)
            r1 = 3
            if (r12 > r1) goto L_0x00d5
            r23 = r2
            r22 = r3
            r21 = r5
            r20 = r6
            r19 = r7
            r18 = r8
            r17 = r9
            r15.optimizeFurther(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0085
        L_0x00d1:
            r0 = move-exception
            if (r12 != r1) goto L_0x00f4
            goto L_0x00e2
        L_0x00d5:
            java.lang.String r1 = "[opt] Detected error but seem to be in a complete state"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f5 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x00f5 }
            long r0 = r2.status     // Catch:{ all -> 0x00f5 }
            long r0 = r0 & r10
            r2.status = r0     // Catch:{ all -> 0x00f5 }
            goto L_0x00e7
        L_0x00e2:
            long r0 = r2.status     // Catch:{ all -> 0x00f5 }
            long r0 = r0 & r10
            r2.status = r0     // Catch:{ all -> 0x00f5 }
        L_0x00e7:
            long r0 = r0 | r13
            r2.status = r0     // Catch:{ all -> 0x00f5 }
            r2.success = r4     // Catch:{ all -> 0x00f5 }
            goto L_0x0085
        L_0x00ed:
            r3.close()     // Catch:{ all -> 0x00fa }
            r6.close()
            return
        L_0x00f4:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.optimize(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.DexStore$OptimizationSession):void");
    }

    public static /* synthetic */ Context access$100(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    private boolean areDexesTruncated(DexStore dexStore, File file, DexManifest.Dex[] dexArr) {
        int i = dexStore.readConfig().artTruncatedDexSize;
        if (i > 0) {
            int i2 = 0;
            while (i2 < dexArr.length) {
                DexManifest.Dex dex = dexArr[i2];
                if (!dexAppearsTruncated(dex, file, i)) {
                    Mlog.w("Dex %s is not truncated", dex.assetName);
                } else {
                    i2++;
                }
            }
            Mlog.safeFmt("All dexes appear truncated", new Object[0]);
            return true;
        }
        return false;
    }

    private void checkTmpOatFileLength(File file) {
        if (file.exists() && file.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            sb.append(" is an impossibly short oat file");
            throw new RuntimeException(sb.toString());
        }
    }

    public static void clearCannotTruncateDexesFlag(File file) {
        Mlog.safeFmt("Clearing flag to not truncate dex files at root: %s", file.getAbsolutePath());
        File makeIgnoreDirtyCheckFile = DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
        if (!makeIgnoreDirtyCheckFile.exists()) {
            Mlog.w("Dex truncation file does not exist. This is likely an error", new Object[0]);
        }
        if (!makeIgnoreDirtyCheckFile.delete() && makeIgnoreDirtyCheckFile.exists()) {
            Mlog.w("Was not able to delete cannot truncate dexes file", new Object[0]);
        }
    }

    public static String convertClassToDotForm(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    public static boolean dexAppearsTruncated(DexManifest.Dex dex, File file, int i) {
        String makeDexName = dex.makeDexName();
        File file2 = new File(file, makeDexName);
        if (!file2.exists()) {
            Mlog.w("Dex [asset: %s] %s seems not to exist", dex.assetName, makeDexName);
        }
        return dexAppearsTruncated(file2, i);
    }

    public static boolean forceUseOriginalMixedModePGOProfile(Context context) {
        Context context2 = AnonymousClass0JR.A00(context).A02;
        C03670Kf A00 = C03670Kf.A00(context2);
        if (!(!C03670Kf.A00(context2).A1F) || A00.A2l) {
            return false;
        }
        return true;
    }

    public static Context getAppContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private String getArtImageLocation() {
        String artImageLocation = DalvikInternals.getArtImageLocation();
        if (artImageLocation == null || "".equals(artImageLocation)) {
            return AnonymousClass00U.A0V("/data/dalvik-cache/", OdexSchemeArtTurbo.getArch(), "/system@framework@boot.art");
        }
        return artImageLocation;
    }

    public static Dex2OatHookInfo getMirandaFixLibHook() {
        return null;
    }

    private String getOatVersion() {
        StringBuilder sb;
        String str;
        String oatFormatVersion = DalvikInternals.getOatFormatVersion();
        if (oatFormatVersion != null && !oatFormatVersion.isEmpty()) {
            return oatFormatVersion;
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 10000) {
            str = "unknown api version: VERSION.SDK_INT = ";
        } else {
            sb = new StringBuilder();
            str = "oatmeal should be used on Dalvik. VERSION.SDK_INT = ";
        }
        sb.append(str);
        sb.append(i);
        Mlog.e(sb.toString(), new Object[0]);
        return "039";
    }

    public static int getOdexFlags() {
        return 1;
    }

    private int getTruncatedSize(DexStore dexStore) {
        return dexStore.readConfig().artTruncatedDexSize;
    }

    public static boolean initialMixedNeeded(long j) {
        if (optimizationCompleted(j) || !mixedNeeded(j)) {
            return false;
        }
        return true;
    }

    public static boolean isOatFileStillValid(File file, long j, long j2) {
        return true;
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, long j) {
        boolean anyOptimizationDone = anyOptimizationDone(j);
        List makeExpectedFileInfoList = OdexSchemeArtTurbo.makeExpectedFileInfoList(dexArr, (String) null);
        Mlog.safeFmt("makeExpectedFile: are oat around: %s expected files: %s", Boolean.valueOf(anyOptimizationDone), makeExpectedFileInfoList.toString());
        if (anyOptimizationDone) {
            makeExpectedFileInfoList.add(new ExpectedFileInfo(OdexSchemeArtTurbo.OREO_ODEX_DIR));
        }
        Mlog.safeFmt("makeExpectedFile: RETURN expected files: %s", makeExpectedFileInfoList.toString());
        return makeExpectedFileInfoList;
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, long j) {
        return OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j));
    }

    public static File makeTmpSubDirectory(DexStore.TmpDir tmpDir, String str) {
        File file = new File(tmpDir.directory, AnonymousClass00U.A0V(str, "-", UUID.randomUUID().toString().replace("-", "")));
        Fs.mkdirOrThrow(file);
        return file;
    }

    public static boolean markCannotTruncateDexesFlag(File file) {
        Mlog.safeFmt("Marking cannot truncate dex files at root: %s", file.getAbsolutePath());
        File makeIgnoreDirtyCheckFile = DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
        if (makeIgnoreDirtyCheckFile.exists()) {
            Mlog.w("Dex truncation file already exists. This is likely an error", new Object[0]);
        }
        try {
            boolean createNewFile = makeIgnoreDirtyCheckFile.createNewFile();
            if (!createNewFile) {
                Mlog.w("Was not successful creating cannot truncate dexes file", new Object[0]);
            }
            return createNewFile;
        } catch (IOException e) {
            Mlog.w(e, "Was not able to create cannot truncate dexes file", new Object[0]);
            return false;
        }
    }

    public static String readProgramOutputFileSafely(RandomAccessFile randomAccessFile) {
        try {
            return Fs.readProgramOutputFile(randomAccessFile);
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean shouldTruncateDexesNow(File file, File file2, long j, int i) {
        if (!needsTruncation(file2, i) || !optimizationCompleted(j)) {
            return false;
        }
        return !getCannotTruncateDexesFlag(file);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.dextricks.OdexSchemeArtXdex.DexSelector dexSelectorForMultidexCompilationStrategy(java.io.File r10, final byte r11) {
        /*
            r9 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r4.<init>(r0)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0063 }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0063 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0063 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0063 }
        L_0x0018:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005a
            java.lang.String r8 = r0.trim()     // Catch:{ all -> 0x005e }
            com.facebook.common.dextricks.OdexSchemeArtXdex$ManifestEntry r7 = com.facebook.common.dextricks.OdexSchemeArtXdex.ManifestEntry.fromCSV(r8)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0034
            java.lang.String r0 = "[opt][mixed_mode] could not parse manifest entry for : "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r8)     // Catch:{ all -> 0x005e }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x005e }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x005e }
            goto L_0x0018
        L_0x0034:
            java.lang.String r6 = "[opt][mixed_mode] read manifest entry for "
            java.lang.String r1 = r7.canary     // Catch:{ all -> 0x005e }
            java.lang.String r0 = " : "
            java.lang.String r1 = X.AnonymousClass00U.A0d(r6, r1, r0, r8)     // Catch:{ all -> 0x005e }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x005e }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r7.canary     // Catch:{ all -> 0x005e }
            r3.put(r0, r7)     // Catch:{ all -> 0x005e }
            boolean r0 = r7.coldstart     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0018
            int r1 = r4.get()     // Catch:{ all -> 0x005e }
            int r0 = r7.ordinal     // Catch:{ all -> 0x005e }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x005e }
            r4.set(r0)     // Catch:{ all -> 0x005e }
            goto L_0x0018
        L_0x005a:
            r2.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x006b
        L_0x005e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "[opt][mixed_mode] problem reading manifest file"
            com.facebook.common.dextricks.Mlog.w(r2, r0, r1)
        L_0x006b:
            com.facebook.common.dextricks.OdexSchemeArtXdex$2 r0 = new com.facebook.common.dextricks.OdexSchemeArtXdex$2
            r0.<init>(r3, r11, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.dexSelectorForMultidexCompilationStrategy(java.io.File, byte):com.facebook.common.dextricks.OdexSchemeArtXdex$DexSelector");
    }

    public boolean loadNotOptimized(long j) {
        return !anyOptimizationDone(j);
    }

    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean optimizationCompleted = optimizationCompleted(j);
        Mlog.safeFmt("NeedOptimization: opt complete: %s last scheme: %s pgo: %s opt history: %s", Boolean.valueOf(optimizationCompleted), Boolean.valueOf(optimizationCompleted(optimizationHistoryLog.schemeStatus)), Boolean.valueOf(config.tryPeriodicPgoCompilation), optimizationHistoryLog);
        if (!config.tryPeriodicPgoCompilation || !optimizationHistoryLog.lastCompilationSessionWasASuccess()) {
            return OdexScheme.NeedOptimizationState.shouldOptimize(!optimizationCompleted);
        }
        if (!optimizationCompleted(optimizationHistoryLog.schemeStatus)) {
            return OdexScheme.NeedOptimizationState.NEED_OPTIMIZATION;
        }
        long timeDeltaFromLastCompilationSessionMs = optimizationHistoryLog.timeDeltaFromLastCompilationSessionMs();
        Mlog.safeFmt("NeedOptimization: timeDelta %d ms min interval: %d ms", Long.valueOf(timeDeltaFromLastCompilationSessionMs), Long.valueOf(config.minTimeBetweenPgoCompilationMs));
        if (timeDeltaFromLastCompilationSessionMs == DexStore.OptimizationHistoryLog.NO_TIME_DELTA || timeDeltaFromLastCompilationSessionMs < config.minTimeBetweenPgoCompilationMs) {
            return OdexScheme.NeedOptimizationState.NO_OPTIMIZATION_NEEDED;
        }
        Mlog.safeFmt("NeedOptimization: Time to run additional pgo optimizations", new Object[0]);
        return OdexScheme.NeedOptimizationState.NEED_REOPTIMIZATION;
    }

    public static void addOldPgoDex2OatParams(ProcessBuilder processBuilder) {
    }

    private List getDexInfos(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, List list, boolean z, boolean z2, byte b, File file, DexManifest.Dex[] dexArr, AtomicReference atomicReference) {
        List list2 = list;
        boolean z3 = z2;
        Mlog.safeFmt("[opt] dex2oat - get dex infos for mm: %s pgo comp: %s", Boolean.valueOf(z), Boolean.valueOf(z3));
        DexStore dexStore2 = dexStore;
        File file2 = file;
        DexManifest.Dex[] dexArr2 = dexArr;
        try {
            DexStore.TmpDir tmpDir2 = tmpDir;
            if (areDexesTruncated(dexStore2, file2, dexArr2)) {
                Mlog.safeFmt("Dexes appear truncated. Re-unpacking secondary dexes", new Object[0]);
                if (file2 == dexStore2.root) {
                    if (list != null) {
                        Mlog.safeFmt("Ignoring given expected dex file infos since dexes are truncated", new Object[0]);
                    }
                    list2 = getNewInitialOptimizedSecondaryDexes(context, dexStore2, optimizationSession, config, tmpDir2, renamer, atomicReference);
                } else {
                    throw new IllegalStateException("Can only copy temp secondary dexes from the root");
                }
            }
            if (z2) {
                ExpectedFileInfo.setCompTypeToPgoIfUnknown(list2);
            }
            if (!z) {
                return list2;
            }
            return getMixedModeDexInfos(list2, tmpDir2, z3, b, dexArr2);
        } catch (IOException e) {
            Mlog.w(e, "Could not get dex infos due to IO error. Bailing...", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d9, code lost:
        if (r50 == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02db, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Enabling verify-none option for art", r5);
        r10.addArgument("--compiler-filter=verify-none");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e5, code lost:
        r28 = "dex2oat";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e9, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Loading compiler system flags", r5);
        setCompilerFilter(r9, r10);
        r6 = android.os.SystemProperties.get("dalvik.vm.dex2oat-flags");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f7, code lost:
        if (r6 == null) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02f9, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02fe, code lost:
        if (r6.isEmpty() == false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0300, code lost:
        r5 = "<none>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0302, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] compiler defaults system flags are %s", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x030f, code lost:
        if (r6.isEmpty() != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r8 == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0311, code lost:
        r1 = new android.text.TextUtils.SimpleStringSplitter(' ');
        r1.setString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031f, code lost:
        if (r1.hasNext() == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0321, code lost:
        r10.addArgument(r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0329, code lost:
        r0 = "<none>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x032d, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0331, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0334, code lost:
        r1 = makeExpectedFileInfoList(r2.mDexes, 0);
        r3 = new java.util.concurrent.atomic.AtomicReference((java.lang.Object) null);
        r5 = getDexInfos(r42, r6, r40, r48, r39, r41, r1, r51, r5, r56, r15, r2.mDexes, r3);
        r3 = (java.io.File) r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0369, code lost:
        if (r3 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x036b, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x036e, code lost:
        com.facebook.common.dextricks.Mlog.w("[opt] did NOT find PGO profile file [mm: %s periodic: %s]", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0375, code lost:
        com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(MISSING_PGO_SOFT_ERROR_CATEGORY, "PGO file could not be located", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0383, code lost:
        throw new java.io.IOException("Couldn't find PGO profile for mixed mode compilation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0384, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0386, code lost:
        com.facebook.common.dextricks.Mlog.w("[opt] no dex file to compile", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x038e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r7 != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r6 = new java.lang.Object[]{java.lang.Boolean.valueOf(r54), java.lang.Boolean.valueOf(r57)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r8 == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Trying PGO compilation [mm: %s periodic recomp: %s] and found PGO profile file", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r42 = r44;
        r23 = forceUseOriginalMixedModePGOProfile(r42);
        r22 = shouldUseMixedModeDex2Oat(r42, r5);
        r6 = r45;
        r39 = r49;
        r41 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r59 == null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r21 = getBootClassPathValue(r6, !r53);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r53 == false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r11 = getClassPathValue(r6, r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r5 == null) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r5.size() == 0) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        r1 = new com.facebook.common.dextricks.Dex2oatLogcatParser("dex2oat", r39.directory);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r7 == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r18 = com.facebook.common.dextricks.DexStoreUtils.getCurrentMainDexStorePgoProfile(r42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r18 == null) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        r0 = r18.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] dex2oat - using pgo file %s", r0);
        r16 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r16.hasNext() == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        r1 = (com.facebook.common.dextricks.ExpectedFileInfo) r16.next();
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] dex2oat - go for expected file %s", r1);
        r29 = r1.getFile(r15);
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] dex2oat - go for dex %s", r29);
        r6 = oatNameFromExpectedFileInfo(r1);
        r14 = new java.io.File(r15, r6);
        r0 = new java.io.File(r39.directory, r6);
        r5 = new java.io.File(r3, r6);
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Current State: \n Expected File Info %s \n Root: %s \n Potential Root: %s \n dex-file [exists: %s]: %s \n oat-location [exists: %s]: %s \n oat-file [exists: %s]: %s \n oat-file-overwrite [exists: %s]: %s", r1, r3, r15, java.lang.Boolean.valueOf(r29.exists()), r29, java.lang.Boolean.valueOf(r14.exists()), r14, java.lang.Boolean.valueOf(r0.exists()), r0, java.lang.Boolean.valueOf(r5.exists()), r5);
        r7 = new java.lang.StringBuilder();
        r7.append("--oat-file=");
        r7.append(r0);
        r10 = new com.facebook.forker.ProcessBuilder("/system/bin/dex2oat", r7.toString(), X.AnonymousClass00U.A0L("--oat-location=", r5.getPath()), X.AnonymousClass00U.A0L("--dex-file=", r29.getPath()), "--no-watch-dog", "--dump-timings", "--dump-stats");
        r10.setenv("BOOTCLASSPATH", r21);
        r5 = r42.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0142, code lost:
        if (r5 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0144, code lost:
        r5 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0146, code lost:
        r10.mTmpDir = com.facebook.forker.ProcessBuilder.genDefaultTmpDir(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014c, code lost:
        if (r11 == null) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014e, code lost:
        r10.setenv("CLASSPATH", r11);
        com.facebook.common.dextricks.Mlog.safeFmt("dex2oat CLASSPATH: %s", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015c, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("dex2oat BOOTCLASSPATH: %s", r21);
        r7 = android.os.SystemProperties.get("dalvik.vm.dex2oat-Xms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0171, code lost:
        if (r7.isEmpty() != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0173, code lost:
        r10.addArgument("--runtime-arg");
        r10.addArgument(X.AnonymousClass00U.A0L("-Xms", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x017f, code lost:
        r9 = r40.dexStoreConfig;
        r6 = android.os.SystemProperties.get("dalvik.vm.dex2oat-Xmx");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x018d, code lost:
        if (r6.isEmpty() != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018f, code lost:
        r10.addArgument("--runtime-arg");
        r10.addArgument(X.AnonymousClass00U.A0L("-Xmx", r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x019f, code lost:
        if (r1.isCompilationTypeMixedModeAll() == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a1, code lost:
        if (r22 != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a3, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Expected file is configured for mixed mode but we are skipping it for pgo. File Info: %s", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b6, code lost:
        if (r1.isCompilationTypeMixedModeAll() == false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b8, code lost:
        if (r22 == false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ba, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Enabling compilation for mixed mode", new java.lang.Object[0]);
        r5 = "speed";
        r28 = "dex2oat-mixedmode-pgo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c5, code lost:
        if (r54 == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c7, code lost:
        if (r23 == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c9, code lost:
        r6 = com.facebook.common.dextricks.DexStorePgoUtils.getDefaultPgoMixedModeProfileFromApkForDex(r42, r1, r39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d1, code lost:
        if (r57 != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d3, code lost:
        r1 = X.C14550pe.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d5, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d6, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d7, code lost:
        if (r6 == null) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d9, code lost:
        r5 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01dc, code lost:
        if (r5 == 1) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01df, code lost:
        if (r5 == 2) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e2, code lost:
        if (r5 == 3) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e4, code lost:
        r5 = "speed-profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e6, code lost:
        r10.addArgument(X.AnonymousClass00U.A0L("--profile-file=", r6.getAbsolutePath()));
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Using PGO profile for mixed mode compilation [compiler filter: %s] at %s", r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r57 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fa, code lost:
        r10.addArgument(X.AnonymousClass00U.A0L("--compiler-filter=", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0201, code lost:
        if (r24 == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0203, code lost:
        r10.addArgument("-j1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0208, code lost:
        r5 = r9.artHugeMethodMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
        if (r5 < 0) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020c, code lost:
        r10.addArgument(X.AnonymousClass00U.A0J("--huge-method-max=", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0215, code lost:
        r5 = r9.artLargeMethodMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0217, code lost:
        if (r5 < 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0219, code lost:
        r10.addArgument(X.AnonymousClass00U.A0J("--large-method-max=", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0222, code lost:
        r5 = r9.artSmallMethodMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0224, code lost:
        if (r5 < 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0226, code lost:
        r10.addArgument(X.AnonymousClass00U.A0J("--small-method-max=", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022f, code lost:
        r5 = r9.artTinyMethodMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0231, code lost:
        if (r5 < 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0233, code lost:
        r10.addArgument(X.AnonymousClass00U.A0J("--tiny-method-max=", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023c, code lost:
        initAllDex2OatHooks(r10, null, getDex2OatLibHooks(r42, r40));
        r1 = new java.lang.StringBuilder("[opt] Running compiler: ");
        r1.append(r10);
        com.facebook.common.dextricks.Mlog.safeFmt(r1.toString(), new java.lang.Object[0]);
        r41.addFile(r0, r14);
        startOptimizerProcess(r10, r42, r28, r40, r1, r39);
        checkTmpOatFileLength(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0277, code lost:
        r5 = "verify-profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027b, code lost:
        r5 = "everything-profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027e, code lost:
        r5 = "space-profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0282, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0286, code lost:
        r28 = "dex2oat-mixedmode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028e, code lost:
        if (r1.isCompilationTypePgoOrMixedMode() == false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0290, code lost:
        if (r18 == null) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0292, code lost:
        r6 = r18.getAbsoluteFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0296, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Enabling compilation for pgo %s [mm: %s pgo: %s]", r6, java.lang.Boolean.valueOf(r1.isCompilationTypeMixedModeAll()), java.lang.Boolean.valueOf(r1.isCompilationTypePGO()));
        r10.addArgument(X.AnonymousClass00U.A0L("--profile-file=", r18.getAbsolutePath()));
        r10.addArgument(X.AnonymousClass00U.A0L("--compiler-filter=", "everything-profile"));
        r28 = "dex2oat-pgo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c5, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c7, code lost:
        r5 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c9, code lost:
        if (r52 == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02cb, code lost:
        com.facebook.common.dextricks.Mlog.safeFmt("[opt] Enabling quickening", r5);
        r10.addArgument("--compiler-filter=interpret-only");
        r28 = "dex2oat-quicken";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean innerOptimizeDex2Oat(android.content.Context r44, com.facebook.common.dextricks.DexStore r45, com.facebook.common.dextricks.OdexSchemeArtXdex.Renamer r46, com.facebook.common.dextricks.DexStore.OptimizationSession r47, com.facebook.common.dextricks.DexStore.Config r48, com.facebook.common.dextricks.DexStore.TmpDir r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, byte r55, byte r56, boolean r57, java.io.File r58, java.util.List r59) {
        /*
            r43 = this;
            r15 = r58
            r1 = r59
            r3 = r15
            r40 = r47
            r0 = r40
            com.facebook.common.dextricks.OptimizationConfiguration r0 = r0.config
            int r0 = r0.flags
            r0 = r0 & 1
            r4 = 0
            r24 = 0
            if (r0 == 0) goto L_0x0016
            r24 = 1
        L_0x0016:
            r2 = r43
            X.0JR r0 = r2.mPGOProfileUtil
            boolean r8 = X.AnonymousClass0JR.A05(r0)
            if (r54 != 0) goto L_0x0023
            r7 = 0
            if (r57 == 0) goto L_0x0029
        L_0x0023:
            r7 = 1
            if (r57 == 0) goto L_0x0029
            r5 = 1
            if (r8 != 0) goto L_0x002c
        L_0x0029:
            r5 = 0
            if (r7 == 0) goto L_0x003f
        L_0x002c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r54)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r57)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            if (r8 == 0) goto L_0x036e
            java.lang.String r0 = "[opt] Trying PGO compilation [mm: %s periodic recomp: %s] and found PGO profile file"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r6)
        L_0x003f:
            r42 = r44
            boolean r23 = forceUseOriginalMixedModePGOProfile(r42)
            r0 = r42
            boolean r22 = shouldUseMixedModeDex2Oat(r0, r5)
            r12 = 0
            r6 = r45
            r39 = r49
            r41 = r46
            if (r59 == 0) goto L_0x0334
            r5 = r1
        L_0x0055:
            r0 = r53 ^ 1
            java.lang.String r21 = getBootClassPathValue(r6, r0)
            if (r53 == 0) goto L_0x0331
            java.lang.String r11 = getClassPathValue(r6, r15, r1)
        L_0x0061:
            if (r5 == 0) goto L_0x0386
            int r0 = r5.size()
            if (r0 == 0) goto L_0x0386
            r0 = r39
            java.io.File r6 = r0.directory
            java.lang.String r20 = "dex2oat"
            com.facebook.common.dextricks.Dex2oatLogcatParser r19 = new com.facebook.common.dextricks.Dex2oatLogcatParser
            r1 = r19
            r0 = r20
            r1.<init>(r0, r6)
            if (r7 == 0) goto L_0x032d
            java.io.File r18 = com.facebook.common.dextricks.DexStoreUtils.getCurrentMainDexStorePgoProfile(r42)
        L_0x007e:
            java.lang.String r17 = "<none>"
            if (r18 == 0) goto L_0x0329
            java.lang.String r0 = r18.getAbsolutePath()
        L_0x0086:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "[opt] dex2oat - using pgo file %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.util.Iterator r16 = r5.iterator()
        L_0x0093:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0384
            java.lang.Object r1 = r16.next()
            com.facebook.common.dextricks.ExpectedFileInfo r1 = (com.facebook.common.dextricks.ExpectedFileInfo) r1
            java.lang.Object[] r5 = new java.lang.Object[]{r1}
            java.lang.String r0 = "[opt] dex2oat - go for expected file %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r5)
            java.io.File r29 = r1.getFile((java.io.File) r15)
            java.lang.Object[] r5 = new java.lang.Object[]{r29}
            java.lang.String r0 = "[opt] dex2oat - go for dex %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r5)
            java.lang.String r6 = oatNameFromExpectedFileInfo(r1)
            java.io.File r14 = new java.io.File
            r14.<init>(r15, r6)
            r0 = r39
            java.io.File r5 = r0.directory
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r6)
            java.io.File r5 = new java.io.File
            r5.<init>(r3, r6)
            boolean r6 = r29.exists()
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r14.exists()
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r0.exists()
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r5.exists()
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r6)
            r25 = r1
            r26 = r3
            r27 = r15
            r31 = r14
            r33 = r0
            r35 = r5
            java.lang.Object[] r7 = new java.lang.Object[]{r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35}
            java.lang.String r6 = "[opt] Current State: \n Expected File Info %s \n Root: %s \n Potential Root: %s \n dex-file [exists: %s]: %s \n oat-location [exists: %s]: %s \n oat-file [exists: %s]: %s \n oat-file-overwrite [exists: %s]: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = "--oat-file="
            r7.append(r6)
            r7.append(r0)
            java.lang.String r25 = r7.toString()
            java.lang.String r6 = "--oat-location="
            java.lang.String r5 = r5.getPath()
            java.lang.String r26 = X.AnonymousClass00U.A0L(r6, r5)
            java.lang.String r5 = "--dex-file="
            java.lang.String r6 = r29.getPath()
            java.lang.String r27 = X.AnonymousClass00U.A0L(r5, r6)
            java.lang.String r28 = "--no-watch-dog"
            java.lang.String r29 = "--dump-timings"
            java.lang.String r30 = "--dump-stats"
            java.lang.String[] r6 = new java.lang.String[]{r25, r26, r27, r28, r29, r30}
            java.lang.String r5 = "/system/bin/dex2oat"
            com.facebook.forker.ProcessBuilder r10 = new com.facebook.forker.ProcessBuilder
            r10.<init>(r5, r6)
            java.lang.String r6 = "BOOTCLASSPATH"
            r5 = r21
            r10.setenv(r6, r5)
            android.content.Context r5 = r42.getApplicationContext()
            if (r5 != 0) goto L_0x0146
            r5 = r42
        L_0x0146:
            java.io.File r5 = com.facebook.forker.ProcessBuilder.genDefaultTmpDir(r5)
            r10.mTmpDir = r5
            if (r11 == 0) goto L_0x015c
            java.lang.String r5 = "CLASSPATH"
            r10.setenv(r5, r11)
            java.lang.Object[] r6 = new java.lang.Object[]{r11}
            java.lang.String r5 = "dex2oat CLASSPATH: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r5, r6)
        L_0x015c:
            java.lang.Object[] r6 = new java.lang.Object[]{r21}
            java.lang.String r5 = "dex2oat BOOTCLASSPATH: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r5, r6)
            java.lang.String r5 = "dalvik.vm.dex2oat-Xms"
            java.lang.String r7 = android.os.SystemProperties.get(r5)
            boolean r6 = r7.isEmpty()
            java.lang.String r5 = "--runtime-arg"
            if (r6 != 0) goto L_0x017f
            r10.addArgument(r5)
            java.lang.String r6 = "-Xms"
            java.lang.String r6 = X.AnonymousClass00U.A0L(r6, r7)
            r10.addArgument(r6)
        L_0x017f:
            r6 = r40
            com.facebook.common.dextricks.DexStore$Config r9 = r6.dexStoreConfig
            java.lang.String r6 = "dalvik.vm.dex2oat-Xmx"
            java.lang.String r6 = android.os.SystemProperties.get(r6)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x019b
            r10.addArgument(r5)
            java.lang.String r5 = "-Xmx"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r5, r6)
            r10.addArgument(r5)
        L_0x019b:
            boolean r5 = r1.isCompilationTypeMixedModeAll()
            if (r5 == 0) goto L_0x01ac
            if (r22 != 0) goto L_0x01ac
            java.lang.Object[] r6 = new java.lang.Object[]{r1}
            java.lang.String r5 = "[opt] Expected file is configured for mixed mode but we are skipping it for pgo. File Info: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r5, r6)
        L_0x01ac:
            boolean r5 = r1.isCompilationTypeMixedModeAll()
            java.lang.String r13 = "everything-profile"
            java.lang.String r8 = "--profile-file="
            java.lang.String r7 = "--compiler-filter="
            if (r5 == 0) goto L_0x028a
            if (r22 == 0) goto L_0x028a
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r5 = "[opt] Enabling compilation for mixed mode"
            com.facebook.common.dextricks.Mlog.safeFmt(r5, r6)
            java.lang.String r5 = "speed"
            java.lang.String r28 = "dex2oat-mixedmode-pgo"
            if (r54 == 0) goto L_0x0286
            if (r23 == 0) goto L_0x0282
            r6 = r42
            r5 = r39
            java.io.File r6 = com.facebook.common.dextricks.DexStorePgoUtils.getDefaultPgoMixedModeProfileFromApkForDex(r6, r1, r5)
        L_0x01d1:
            if (r57 != 0) goto L_0x01d7
            java.lang.Class<X.0pe> r1 = X.C14550pe.class
            monitor-enter(r1)
            monitor-exit(r1)
        L_0x01d7:
            if (r6 == 0) goto L_0x0375
            r1 = 1
            r5 = r55
            if (r5 == r1) goto L_0x027e
            r1 = 2
            if (r5 == r1) goto L_0x027b
            r1 = 3
            if (r5 == r1) goto L_0x0277
            java.lang.String r5 = "speed-profile"
        L_0x01e6:
            java.lang.String r1 = r6.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r8, r1)
            r10.addArgument(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6}
            java.lang.String r1 = "[opt] Using PGO profile for mixed mode compilation [compiler filter: %s] at %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r6)
        L_0x01fa:
            java.lang.String r1 = X.AnonymousClass00U.A0L(r7, r5)
            r10.addArgument(r1)
        L_0x0201:
            if (r24 == 0) goto L_0x0208
            java.lang.String r1 = "-j1"
            r10.addArgument(r1)
        L_0x0208:
            int r5 = r9.artHugeMethodMax
            if (r5 < 0) goto L_0x0215
            java.lang.String r1 = "--huge-method-max="
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r5)
            r10.addArgument(r1)
        L_0x0215:
            int r5 = r9.artLargeMethodMax
            if (r5 < 0) goto L_0x0222
            java.lang.String r1 = "--large-method-max="
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r5)
            r10.addArgument(r1)
        L_0x0222:
            int r5 = r9.artSmallMethodMax
            if (r5 < 0) goto L_0x022f
            java.lang.String r1 = "--small-method-max="
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r5)
            r10.addArgument(r1)
        L_0x022f:
            int r5 = r9.artTinyMethodMax
            if (r5 < 0) goto L_0x023c
            java.lang.String r1 = "--tiny-method-max="
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r5)
            r10.addArgument(r1)
        L_0x023c:
            r5 = r42
            r1 = r40
            com.facebook.common.dextricks.OdexSchemeArtXdex$Dex2OatHookInfo r1 = r2.getDex2OatLibHooks(r5, r1)
            com.facebook.common.dextricks.OdexSchemeArtXdex$Dex2OatHookInfo[] r1 = new com.facebook.common.dextricks.OdexSchemeArtXdex.Dex2OatHookInfo[]{r12, r1}
            initAllDex2OatHooks(r10, r1)
            java.lang.String r5 = "[opt] Running compiler: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r10)
            java.lang.String r5 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.facebook.common.dextricks.Mlog.safeFmt(r5, r1)
            r1 = r41
            r1.addFile(r0, r14)
            r25 = r2
            r26 = r10
            r27 = r42
            r29 = r40
            r30 = r19
            r31 = r39
            r25.startOptimizerProcess(r26, r27, r28, r29, r30, r31)
            r2.checkTmpOatFileLength(r0)
            goto L_0x0093
        L_0x0277:
            java.lang.String r5 = "verify-profile"
            goto L_0x01e6
        L_0x027b:
            r5 = r13
            goto L_0x01e6
        L_0x027e:
            java.lang.String r5 = "space-profile"
            goto L_0x01e6
        L_0x0282:
            r6 = r18
            goto L_0x01d1
        L_0x0286:
            java.lang.String r28 = "dex2oat-mixedmode"
            goto L_0x01fa
        L_0x028a:
            boolean r5 = r1.isCompilationTypePgoOrMixedMode()
            if (r5 == 0) goto L_0x02c7
            if (r18 == 0) goto L_0x02c5
            java.io.File r6 = r18.getAbsoluteFile()
        L_0x0296:
            boolean r5 = r1.isCompilationTypeMixedModeAll()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r1 = r1.isCompilationTypePGO()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5, r1}
            java.lang.String r1 = "[opt] Enabling compilation for pgo %s [mm: %s pgo: %s]"
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r5)
            java.lang.String r1 = r18.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r8, r1)
            r10.addArgument(r1)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r7, r13)
            r10.addArgument(r1)
            java.lang.String r28 = "dex2oat-pgo"
            goto L_0x0201
        L_0x02c5:
            r6 = r12
            goto L_0x0296
        L_0x02c7:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            if (r52 == 0) goto L_0x02d9
            java.lang.String r1 = "[opt] Enabling quickening"
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r5)
            java.lang.String r1 = "--compiler-filter=interpret-only"
            r10.addArgument(r1)
            java.lang.String r28 = "dex2oat-quicken"
            goto L_0x0201
        L_0x02d9:
            if (r50 == 0) goto L_0x02e9
            java.lang.String r1 = "[opt] Enabling verify-none option for art"
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r5)
            java.lang.String r1 = "--compiler-filter=verify-none"
            r10.addArgument(r1)
        L_0x02e5:
            r28 = r20
            goto L_0x0201
        L_0x02e9:
            java.lang.String r1 = "[opt] Loading compiler system flags"
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r5)
            r2.setCompilerFilter(r9, r10)
            java.lang.String r1 = "dalvik.vm.dex2oat-flags"
            java.lang.String r6 = android.os.SystemProperties.get(r1)
            if (r6 == 0) goto L_0x0300
            boolean r1 = r6.isEmpty()
            r5 = r6
            if (r1 == 0) goto L_0x0302
        L_0x0300:
            r5 = r17
        L_0x0302:
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r1 = "[opt] compiler defaults system flags are %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r5)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x02e5
            r5 = 32
            android.text.TextUtils$SimpleStringSplitter r1 = new android.text.TextUtils$SimpleStringSplitter
            r1.<init>(r5)
            r1.setString(r6)
        L_0x031b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x02e5
            java.lang.String r5 = r1.next()
            r10.addArgument(r5)
            goto L_0x031b
        L_0x0329:
            r0 = r17
            goto L_0x0086
        L_0x032d:
            r18 = 0
            goto L_0x007e
        L_0x0331:
            r11 = 0
            goto L_0x0061
        L_0x0334:
            com.facebook.common.dextricks.DexManifest$Dex[] r3 = r2.mDexes
            r0 = 0
            java.util.List r1 = makeExpectedFileInfoList(r3, r0)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>(r12)
            com.facebook.common.dextricks.DexManifest$Dex[] r0 = r2.mDexes
            r35 = r56
            r29 = r48
            r33 = r51
            r25 = r2
            r26 = r42
            r27 = r6
            r28 = r40
            r30 = r39
            r31 = r41
            r32 = r1
            r34 = r5
            r36 = r15
            r37 = r0
            r38 = r3
            java.util.List r5 = r25.getDexInfos(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r3 = r3.get()
            java.io.File r3 = (java.io.File) r3
            if (r3 != 0) goto L_0x0055
            r3 = r15
            goto L_0x0055
        L_0x036e:
            java.lang.String r0 = "[opt] did NOT find PGO profile file [mm: %s periodic: %s]"
            com.facebook.common.dextricks.Mlog.w(r0, r6)
            goto L_0x003f
        L_0x0375:
            java.lang.String r1 = "OdexSchemeArtXdex_MissingPGO"
            java.lang.String r0 = "PGO file could not be located"
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r1, r0, r12)
            java.lang.String r1 = "Couldn't find PGO profile for mixed mode compilation"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0384:
            r2 = 1
            return r2
        L_0x0386:
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "[opt] no dex file to compile"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.innerOptimizeDex2Oat(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$Config, com.facebook.common.dextricks.DexStore$TmpDir, boolean, boolean, boolean, boolean, boolean, byte, byte, boolean, java.io.File, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f5, code lost:
        if (r2.enableMixedMode != false) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void optimizeFurther(android.content.Context r29, com.facebook.common.dextricks.DexStore r30, com.facebook.common.dextricks.DexStore.OptimizationSession r31, com.facebook.common.dextricks.DexStore.Config r32, com.facebook.common.dextricks.DexStore.TmpDir r33, com.facebook.common.dextricks.OdexSchemeArtXdex.Renamer r34, com.facebook.common.dextricks.DexStore.OptimizationSession.Job r35, com.facebook.common.dextricks.OdexSchemeArtXdex.OptimizationStateHolder r36) {
        /*
            r28 = this;
            r8 = r31
            com.facebook.common.dextricks.DexStore$OptimizationHistoryLog r0 = r8.getOptimizationHistoryLog()
            r1 = r36
            long r3 = r1.status
            boolean r21 = mixedNeeded(r3)
            boolean r6 = initialMixedNeeded(r3)
            boolean r27 = pgoProfileRecompilationNeeded(r0, r3)
            boolean r0 = quickeningNeeded(r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            boolean r2 = optimizationCompleted(r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r7 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r21)
            r2 = r32
            boolean r5 = r2.enableMixedMode
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r2.enableMixedModePgo
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r27)
            boolean r3 = markedToTryPgoProfileRecompilation(r3)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r9, r10, r11, r12, r13, r14, r15, r16}
            java.lang.String r3 = "[opt] Optimizing further quickeningNeeded: %s opt completed: %s mm status: %s (config mm: %s config mm pgo: %s) initial mm: %s pgo recomp: (now: %s enabled: %s)"
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r4)
            long r3 = r1.status
            boolean r5 = quickeningNeeded(r3)
            java.lang.String r9 = "[opt] new status 0x%x"
            r11 = 16
            r13 = r28
            r14 = r29
            r15 = r30
            r19 = r33
            r16 = r34
            if (r5 == 0) goto L_0x00dd
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "[opt] quickening"
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r4)
            boolean r3 = r2.enableOatmealQuickening
            if (r3 == 0) goto L_0x00ba
            r20 = r13
            r21 = r14
            r22 = r16
            r23 = r15
            r24 = r8
            r25 = r19
            r26 = r7
            boolean r0 = r20.optimizeOatmeal(r21, r22, r23, r24, r25, r26)
            r1.success = r0
            r3 = 256(0x100, double:1.265E-321)
        L_0x008a:
            r1.statusIntent = r3
        L_0x008c:
            long r6 = r1.status
            boolean r0 = anyCompilationNeeded(r2)
            if (r0 == 0) goto L_0x0098
            long r11 = getCompilationStatusFlags(r2)
        L_0x0098:
            long r6 = r6 | r11
            r1.status = r6
            boolean r0 = r1.success
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r2.enableOatmealQuickening
            if (r0 == 0) goto L_0x00b7
            r4 = 32
        L_0x00a5:
            r2 = -1
            long r4 = r4 ^ r2
            long r6 = r6 & r4
            r1.status = r6
        L_0x00ab:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.facebook.common.dextricks.Mlog.safeFmt(r9, r0)
            return
        L_0x00b7:
            r4 = 64
            goto L_0x00a5
        L_0x00ba:
            boolean r3 = r2.enableDex2OatQuickening
            if (r3 == 0) goto L_0x008c
            boolean r3 = r2.enableArtVerifyNone
            r20 = r3
            r21 = r0
            r22 = r7
            r23 = r7
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r0
            r17 = r8
            r18 = r2
            boolean r0 = r13.optimizeDex2Oat(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.success = r0
            r3 = 512(0x200, double:2.53E-321)
            goto L_0x008a
        L_0x00dd:
            if (r6 != 0) goto L_0x00e9
            if (r27 != 0) goto L_0x00e9
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "[opt] Have no further optimizations to do"
        L_0x00e5:
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            return
        L_0x00e9:
            boolean r6 = optimizationCompleted(r3)
            if (r27 == 0) goto L_0x00f9
            if (r21 != 0) goto L_0x00f7
            boolean r3 = r2.enableMixedMode
            r21 = 0
            if (r3 == 0) goto L_0x00f9
        L_0x00f7:
            r21 = 1
        L_0x00f9:
            java.lang.String r5 = ""
            java.lang.String r3 = "NOT "
            r4 = r3
            if (r21 == 0) goto L_0x0101
            r4 = r5
        L_0x0101:
            if (r27 != 0) goto L_0x0104
            r5 = r3
        L_0x0104:
            if (r6 == 0) goto L_0x0167
            java.lang.String r3 = "Yes"
        L_0x0108:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r3}
            java.lang.String r3 = "[opt] mixed mode %sneeded and pgo profile recompilation %sneeded. Already Complete: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            if (r6 != 0) goto L_0x0164
            java.lang.String r3 = "[opt] inspecting free disk space"
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r4)
            java.io.File r3 = r15.root
            java.lang.String r4 = r3.getAbsolutePath()
            android.os.StatFs r3 = new android.os.StatFs
            r3.<init>(r4)
            long r3 = r3.getAvailableBytes()
            java.lang.String r5 = "[opt] "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r3)
            java.lang.String r5 = " bytes available on "
            r6.append(r5)
            java.io.File r5 = r15.root
            r6.append(r5)
            java.lang.String r5 = " filesystem"
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.facebook.common.dextricks.Mlog.safeFmt(r6, r5)
            com.facebook.common.dextricks.OptimizationConfiguration r5 = r8.config
            long r5 = r5.requiredDiskSpaceForCompilation
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x01fc
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "[opt] sufficient disk space for mixed mode or pgo compilation"
        L_0x0157:
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r4)
            if (r27 == 0) goto L_0x016a
            com.facebook.common.dextricks.DexStorePgoUtils.isMainDexStoreProfileChangeSignificant(r14, r7)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "[opt] No need to recompile since PGO file is not different enough"
            goto L_0x00e5
        L_0x0164:
            java.lang.String r3 = "[opt] skipping disk space check for mixed mode or pgo compilation"
            goto L_0x0157
        L_0x0167:
            java.lang.String r3 = "No"
            goto L_0x0108
        L_0x016a:
            boolean r3 = r2.enableMixedModePgo
            if (r3 == 0) goto L_0x0178
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = "[opt] Saving reference PGO file"
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r4)
            com.facebook.common.dextricks.DexStorePgoUtils.createNewMainDexStoreReferencePgoProfile(r14)
        L_0x0178:
            boolean r7 = r2.enableArtVerifyNone
            boolean r6 = r2.enableMixedModeClassPath
            boolean r5 = r2.enableMixedModePgo
            byte r4 = r2.pgoCompilerFilter
            byte r3 = r2.multidexCompilationStrategy
            r20 = r7
            r22 = r0
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r3
            r17 = r8
            r18 = r2
            boolean r0 = r13.optimizeDex2Oat(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.success = r0
            long r3 = r1.status
            long r3 = r3 | r11
            r1.status = r3
            if (r0 == 0) goto L_0x01f9
            java.lang.String r0 = "succeeded"
        L_0x01a1:
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r0 = "[opt] optimizeDex2Oat: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r3)
            boolean r0 = r1.success
            if (r0 == 0) goto L_0x01da
            if (r21 == 0) goto L_0x01b7
            long r5 = r1.status
            r3 = -129(0xffffffffffffff7f, double:NaN)
            long r5 = r5 & r3
            r1.status = r5
        L_0x01b7:
            boolean r0 = r2.enableMixedModePgo
            if (r0 == 0) goto L_0x01c2
            long r5 = r1.status
            r3 = -4097(0xffffffffffffefff, double:NaN)
            long r5 = r5 & r3
            r1.status = r5
        L_0x01c2:
            boolean r0 = r2.enableMixedModeClassPath
            if (r0 == 0) goto L_0x01cd
            long r5 = r1.status
            r3 = 2048(0x800, double:1.0118E-320)
            long r5 = r5 | r3
            r1.status = r5
        L_0x01cd:
            long r3 = r1.status
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.facebook.common.dextricks.Mlog.safeFmt(r9, r0)
        L_0x01da:
            r4 = 0
            r1.statusIntent = r4
            if (r21 == 0) goto L_0x01f6
            r8 = 1024(0x400, double:5.06E-321)
        L_0x01e2:
            long r6 = r4 | r8
            r1.statusIntent = r6
            boolean r0 = r2.enableMixedModePgo
            if (r0 == 0) goto L_0x01f3
            r2 = 8192(0x2000, double:4.0474E-320)
        L_0x01ec:
            long r2 = r2 | r6
            r1.statusIntent = r2
            long r2 = r2 | r4
            r1.statusIntent = r2
            return
        L_0x01f3:
            r2 = 0
            goto L_0x01ec
        L_0x01f6:
            r8 = 0
            goto L_0x01e2
        L_0x01f9:
            java.lang.String r0 = "failed"
            goto L_0x01a1
        L_0x01fc:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "[opt] insufficient disk space %d for mixed mode or pgo compilation"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.lang.String r1 = "Insufficient disk space for mixed mode or pgo compilation"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.optimizeFurther(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$Config, com.facebook.common.dextricks.DexStore$TmpDir, com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer, com.facebook.common.dextricks.DexStore$OptimizationSession$Job, com.facebook.common.dextricks.OdexSchemeArtXdex$OptimizationStateHolder):void");
    }

    public static boolean dexAppearsTruncated(File file, int i) {
        if (file.length() <= ((long) i)) {
            return true;
        }
        return false;
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, String str, List list) {
        final String convertClassToDotForm = convertClassToDotForm(str);
        return makeMixedModeFileList(dexArr, (DexSelector) new DexSelector() {
            public boolean select(DexManifest.Dex dex) {
                Mlog.w("[mixed_mode] comparing %s and %s", dex.canaryClass, convertClassToDotForm);
                return dex.canaryClass.equals(convertClassToDotForm);
            }
        }, list);
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte b, byte b2, boolean z6) {
        return optimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, z5, b, b2, z6, (File) null, (List) null);
    }

    private boolean optimizeOatmeal(Context context, Renamer renamer, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.TmpDir tmpDir, boolean z) {
        return optimizeOatmeal(context, renamer, dexStore, optimizationSession, tmpDir, z, (File) null, (List) null);
    }
}

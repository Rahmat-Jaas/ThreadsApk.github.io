package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass0FX;
import X.AnonymousClass0I6;
import X.AnonymousClass0JB;
import X.AnonymousClass0JR;
import X.AnonymousClass0SH;
import X.C03770Kr;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.JsonWriter;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.endtoend.EndToEnd;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class DexStore {
    public static final String CONFIG_FILENAME = "config";
    public static final String CONFIG_TMP_FILENAME = "config.tmp";
    public static final long CS_DEX0OPT = 16;
    public static final long CS_STATE_MASK = 15;
    public static final byte CS_STATE_SHIFT = 4;
    public static final int DAYS_TO_MS_FACTOR = 86400000;
    public static final byte DEFAULT_MULTIDEX_COMPILATION_STRATEGY = 0;
    public static final byte DEFAULT_PGO_COMPILER_FILTER = 0;
    public static final String DEPS_FILENAME = "deps";
    public static final int DS_ASYNC = 4;
    public static final int DS_DO_NOT_OPTIMIZE = 1;
    public static final int DS_FORCE_SYNC = 8;
    public static final int DS_LOAD_SECONDARY = 16;
    public static final int DS_NO_RETRY = 2;
    public static final int DS_UNPACK_ONLY = 32;
    public static final int LA_LOAD_EXISTING = 0;
    public static final int LA_REGEN_ALL = 2;
    public static final int LA_REGEN_MISSING = 1;
    public static final String MDEX_LOCK_FILENAME = "mdex_lock";
    public static final String MDEX_STATUS_FILENAME = "mdex_status2";
    public static final long MDEX_STATUS_XOR = -374168170706063353L;
    public static final int MS_IN_NS = 1000000;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_COLDSTART_DEX = 2;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_DEX = 1;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_FIRST_COLDSTART_DEX = 0;
    public static final long NO_TIMESTAMP = 0;
    public static final String ODEX_LOCK_FILENAME = "odex_lock";
    public static final String OPTIMIZATION_HISTORY_LOG_FILENAME = "optimization_history_log";
    public static final String OPTIMIZATION_LOG_FILENAME = "optimization_log";
    public static final byte PGO_COMPILER_FILTER_EVERYTHING_PROFILE = 2;
    public static final byte PGO_COMPILER_FILTER_SPACE_PROFILE = 1;
    public static final byte PGO_COMPILER_FILTER_SPEED_PROFILE = 0;
    public static final byte PGO_COMPILER_FILTER_VERIFY_PROFILE = 3;
    public static final String REGEN_STAMP_FILENAME = "regen_stamp";
    public static final int RET_MAY_REGEN = 1;
    public static final byte STATE_ART_TURBO = 7;
    public static final byte STATE_ART_XDEX = 8;
    public static final byte STATE_BAD_GEN = 5;
    public static final byte STATE_FALLBACK = 2;
    public static final byte STATE_INVALID = 0;
    public static final byte STATE_NOOP = 9;
    public static final byte STATE_REGEN_FORCED = 6;
    public static final byte STATE_RESERVED1 = 10;
    public static final byte STATE_TURBO = 4;
    public static final byte STATE_TX_FAILED = 1;
    public static final byte STATE_XDEX = 3;
    public static final String TMPDIR_LOCK_SUFFIX = ".tmpdir_lock";
    public static final String TMPDIR_SUFFIX = ".tmpdir";
    public static boolean logDexAddPageFaults;
    public static long majPageFaultsDelta;
    public static long pageInBytesDelta;
    public static boolean sAttemptedCrossDexHookInstallation;
    public static long sCachedLastAppUpdateTime;
    public static Throwable sCrossDexHookInstallationError;
    public static DexStoreClock sDexStoreClock = new NormalDexStoreClock();
    public static DexStoreTestHooks sDexStoreTestHooks;
    public static DexStore sListHead;
    public static boolean sLoadedCompressedOreo;
    public static MultiDexClassLoader.Configuration sMergedDexConfig;
    public final ArrayList auxiliaryDexes;
    public String id;
    public final File mApk;
    public OptimizationHistoryLog mCachedOptimizationHistoryLog;
    public final List mChildStores = new ArrayList();
    public DexIteratorFactory mDexIteratorFactory;
    public boolean mDisableVerifier = false;
    public DexErrorRecoveryInfo mLastDeri;
    public ArrayList mLoadedDexFiles;
    public DexManifest mLoadedManifest;
    public final ReentrantLockFile mLockFile;
    public DexManifest mManifest;
    public String mMegaZipPath = null;
    public final List mParentStores = new ArrayList();
    public ResProvider mResProvider;
    public boolean mUseBgDexOpt = false;
    public boolean mUseEagerDexOpt = false;
    public final DexStore next = sListHead;
    public final ArrayList primaryDexes;
    public final File root;

    public final class Config {
        public static final byte ART_FILTER_BALANCED = 4;
        public static final byte ART_FILTER_DEFAULT = 0;
        public static final byte ART_FILTER_EVERYTHING = 6;
        public static final byte ART_FILTER_INTERPRET_ONLY = 2;
        public static final byte ART_FILTER_SPACE = 3;
        public static final byte ART_FILTER_SPEED = 5;
        public static final byte ART_FILTER_TIME = 7;
        public static final byte ART_FILTER_VERIFY_NONE = 1;
        public static final byte DALVIK_OPT_ALL = 3;
        public static final byte DALVIK_OPT_DEFAULT = 0;
        public static final byte DALVIK_OPT_FULL = 4;
        public static final byte DALVIK_OPT_NONE = 1;
        public static final byte DALVIK_OPT_VERIFIED = 2;
        public static final byte DALVIK_REGISTER_MAPS_DEFAULT = 0;
        public static final byte DALVIK_REGISTER_MAPS_NO = 1;
        public static final byte DALVIK_REGISTER_MAPS_YES = 2;
        public static final byte DALVIK_VERIFY_ALL = 3;
        public static final byte DALVIK_VERIFY_DEFAULT = 0;
        public static final byte DALVIK_VERIFY_NONE = 1;
        public static final byte DALVIK_VERIFY_REMOTE = 2;
        public static final int FLAGS_CONTROL_UNPACK = 31;
        public static final byte MODE_DEFAULT = 0;
        public static final byte MODE_FORCE_FALLBACK = 1;
        public static final byte MODE_FORCE_TURBO = 2;
        public static final byte MODE_FORCE_XDEX = 3;
        public static final byte SYNC_CONTROL_ASYNC = 1;
        public static final byte SYNC_CONTROL_DEFAULT = 0;
        public static final byte SYNC_CONTROL_SYNC = 2;
        public static final byte VERSION = 8;
        public final byte artFilter;
        public final int artHugeMethodMax;
        public final int artLargeMethodMax;
        public final int artSmallMethodMax;
        public final int artTinyMethodMax;
        public final int artTruncatedDexSize;
        public final byte dalvikOptimize;
        public final byte dalvikRegisterMaps;
        public final byte dalvikVerify;
        public final boolean enableArtVerifyNone;
        public final boolean enableDex2OatQuickening;
        public final boolean enableMixedMode;
        public final boolean enableMixedModeClassPath;
        public final boolean enableMixedModePgo;
        public final boolean enableOatmeal;
        public final boolean enableOatmealQuickening;
        public final boolean enableQuickening;
        public final int henosisFlags;
        public final int legacyFlags;
        public final long minTimeBetweenPgoCompilationMs;
        public final byte mode;
        public final byte multidexCompilationStrategy;
        public final byte pgoCompilerFilter;
        public final byte sync;
        public final boolean tryPeriodicPgoCompilation;

        public final class Builder {
            public byte mArtFilter = 0;
            public int mArtHugeMethodMax = -1;
            public int mArtLargeMethodMax = -1;
            public int mArtSmallMethodMax = -1;
            public int mArtTinyMethodMax = -1;
            public int mArtTruncatedDexSize = -1;
            public byte mDalvikOptimize = 0;
            public byte mDalvikRegisterMaps = 0;
            public byte mDalvikVerify = 0;
            public boolean mDoPeriodicPgoCompilation = false;
            public boolean mEnableArtVerifyNone = false;
            public boolean mEnableDex2OatQuickening = false;
            public boolean mEnableMixedMode = false;
            public boolean mEnableMixedModeClassPath = false;
            public boolean mEnableMixedModePgo = false;
            public boolean mEnableOatmeal = Config.enableOatmealByDefault();
            public boolean mEnableOatmealQuickening = false;
            public boolean mEnableQuickening = false;
            public int mHenosisFlags = 0;
            public int mLegacyFlags = 0;
            public long mMinTimeBetweenPgoCompilationMs = 0;
            public byte mMode = 0;
            public byte mMultidexCompilationStrategy = 0;
            public byte mPgoCompilerFilter = 0;
            public byte mSync = 0;

            public Config build() {
                byte b = this.mMode;
                byte b2 = this.mSync;
                byte b3 = this.mDalvikVerify;
                byte b4 = this.mDalvikOptimize;
                byte b5 = this.mDalvikRegisterMaps;
                byte b6 = this.mArtFilter;
                int i = this.mArtHugeMethodMax;
                int i2 = this.mArtLargeMethodMax;
                int i3 = this.mArtSmallMethodMax;
                int i4 = this.mArtTinyMethodMax;
                int i5 = this.mArtTruncatedDexSize;
                boolean z = this.mEnableArtVerifyNone;
                boolean z2 = this.mEnableOatmeal;
                boolean z3 = this.mEnableDex2OatQuickening;
                boolean z4 = this.mEnableOatmealQuickening;
                int i6 = i;
                int i7 = i2;
                int i8 = i3;
                int i9 = i4;
                return new Config(b, b2, b3, b4, b5, b6, i6, i7, i8, i9, i5, z, z2, z3, z4, this.mEnableQuickening, this.mEnableMixedMode, this.mEnableMixedModeClassPath, this.mEnableMixedModePgo, this.mPgoCompilerFilter, this.mDoPeriodicPgoCompilation, this.mMinTimeBetweenPgoCompilationMs, this.mMultidexCompilationStrategy, this.mLegacyFlags, this.mHenosisFlags);
            }

            public Builder(Config config) {
                this.mMode = config.mode;
                this.mSync = config.sync;
                this.mDalvikVerify = config.dalvikVerify;
                this.mDalvikOptimize = config.dalvikOptimize;
                this.mDalvikRegisterMaps = config.dalvikRegisterMaps;
                this.mArtFilter = config.artFilter;
                this.mArtHugeMethodMax = config.artHugeMethodMax;
                this.mArtLargeMethodMax = config.artLargeMethodMax;
                this.mArtSmallMethodMax = config.artSmallMethodMax;
                this.mArtTinyMethodMax = config.artTinyMethodMax;
                this.mArtTruncatedDexSize = config.artTruncatedDexSize;
                this.mEnableArtVerifyNone = config.enableArtVerifyNone;
                this.mEnableOatmeal = config.enableOatmeal;
                this.mEnableDex2OatQuickening = config.enableDex2OatQuickening;
                this.mEnableOatmealQuickening = config.enableOatmealQuickening;
                this.mEnableQuickening = config.enableQuickening;
                this.mEnableMixedMode = config.enableMixedMode;
                this.mEnableMixedModeClassPath = config.enableMixedModeClassPath;
                this.mEnableMixedModePgo = config.enableMixedModePgo;
                this.mPgoCompilerFilter = config.pgoCompilerFilter;
                this.mDoPeriodicPgoCompilation = config.tryPeriodicPgoCompilation;
                this.mMinTimeBetweenPgoCompilationMs = config.minTimeBetweenPgoCompilationMs;
                this.mMultidexCompilationStrategy = config.multidexCompilationStrategy;
                this.mLegacyFlags = config.legacyFlags;
                this.mHenosisFlags = config.henosisFlags;
            }

            public Builder setMinTimeBetweenPgoCompilationDays(double d) {
                this.mMinTimeBetweenPgoCompilationMs = convertDaysToMs(d);
                return this;
            }

            private long convertDaysToMs(double d) {
                return Math.round(d * 8.64E7d);
            }

            public Builder setArtFilter(byte b) {
                this.mArtFilter = b;
                return this;
            }

            public Builder setArtHugeMethodMax(int i) {
                this.mArtHugeMethodMax = i;
                return this;
            }

            public Builder setArtLargeMethodMax(int i) {
                this.mArtLargeMethodMax = i;
                return this;
            }

            public Builder setArtSmallMethodMax(int i) {
                this.mArtSmallMethodMax = i;
                return this;
            }

            public Builder setArtTinyMethodMax(int i) {
                this.mArtTinyMethodMax = i;
                return this;
            }

            public Builder setArtTruncatedDexSize(int i) {
                this.mArtTruncatedDexSize = i;
                return this;
            }

            public Builder setDalvikOptimize(byte b) {
                this.mDalvikOptimize = b;
                return this;
            }

            public Builder setDalvikRegisterMaps(byte b) {
                this.mDalvikRegisterMaps = b;
                return this;
            }

            public Builder setDalvikVerify(byte b) {
                this.mDalvikVerify = b;
                return this;
            }

            public Builder setDoPeriodicPgoCompilation(boolean z) {
                this.mDoPeriodicPgoCompilation = z;
                return this;
            }

            public Builder setEnableArtVerifyNone(boolean z) {
                this.mEnableArtVerifyNone = z;
                return this;
            }

            public Builder setEnableDex2OatQuickening(boolean z) {
                this.mEnableDex2OatQuickening = z;
                return this;
            }

            public Builder setEnableMixedMode(boolean z) {
                this.mEnableMixedMode = z;
                return this;
            }

            public Builder setEnableMixedModeClassPath(boolean z) {
                this.mEnableMixedModeClassPath = z;
                return this;
            }

            public Builder setEnableMixedModePgo(boolean z) {
                this.mEnableMixedModePgo = z;
                return this;
            }

            public Builder setEnableOatmeal(boolean z) {
                this.mEnableOatmeal = z;
                return this;
            }

            public Builder setEnableOatmealQuickening(boolean z) {
                this.mEnableOatmealQuickening = z;
                return this;
            }

            public Builder setEnableQuickening(boolean z) {
                this.mEnableQuickening = z;
                return this;
            }

            public Builder setHenosisFlags(int i) {
                this.mHenosisFlags = i;
                return this;
            }

            public Builder setLegacyFlags(int i) {
                this.mLegacyFlags = i;
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationMs(long j) {
                this.mMinTimeBetweenPgoCompilationMs = j;
                return this;
            }

            public Builder setMode(byte b) {
                this.mMode = b;
                return this;
            }

            public Builder setMultidexCompilationStrategy(byte b) {
                this.mMultidexCompilationStrategy = b;
                return this;
            }

            public Builder setPgoCompilerFilter(byte b) {
                this.mPgoCompilerFilter = b;
                return this;
            }

            public Builder setSync(byte b) {
                this.mSync = b;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj != null && getClass() == obj.getClass()) {
                    Config config = (Config) obj;
                    if (!(this.mode == config.mode && this.sync == config.sync && this.dalvikVerify == config.dalvikVerify && this.dalvikOptimize == config.dalvikOptimize && this.dalvikRegisterMaps == config.dalvikRegisterMaps && this.artFilter == config.artFilter && this.artHugeMethodMax == config.artHugeMethodMax && this.artLargeMethodMax == config.artLargeMethodMax && this.artSmallMethodMax == config.artSmallMethodMax && this.artTinyMethodMax == config.artTinyMethodMax && this.artTruncatedDexSize == config.artTruncatedDexSize && this.enableArtVerifyNone == config.enableArtVerifyNone && this.enableOatmeal == config.enableOatmeal && this.enableDex2OatQuickening == config.enableDex2OatQuickening && this.enableOatmealQuickening == config.enableOatmealQuickening && this.enableQuickening == config.enableQuickening && this.enableMixedMode == config.enableMixedMode && this.enableMixedModeClassPath == config.enableMixedModeClassPath && this.enableMixedModePgo == config.enableMixedModePgo && this.pgoCompilerFilter == config.pgoCompilerFilter && this.multidexCompilationStrategy == config.multidexCompilationStrategy && this.tryPeriodicPgoCompilation == config.tryPeriodicPgoCompilation && this.minTimeBetweenPgoCompilationMs == config.minTimeBetweenPgoCompilationMs && this.legacyFlags == config.legacyFlags && this.henosisFlags == config.henosisFlags)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public static File getConfigFileName(File file) {
            return new File(file, DexStore.CONFIG_FILENAME);
        }

        public static Config read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                if (randomAccessFile.readByte() == 8) {
                    Config config = new Config(randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readByte(), randomAccessFile.readBoolean(), randomAccessFile.readLong(), randomAccessFile.readByte(), randomAccessFile.readInt(), randomAccessFile.readInt());
                    randomAccessFile.close();
                    return config;
                }
                throw new UnsupportedOperationException("unexpected version");
            } catch (Throwable unused) {
            }
            throw th;
        }

        public static Config readFromRoot(File file) {
            return read(new File(file, DexStore.CONFIG_FILENAME));
        }

        public boolean equalsForBootstrapPurposes(Config config) {
            if (config != null && config.mode == this.mode && config.sync == this.sync && config.artFilter == this.artFilter && config.enableArtVerifyNone == this.enableArtVerifyNone && config.enableOatmeal == this.enableOatmeal && config.enableDex2OatQuickening == this.enableDex2OatQuickening && config.enableOatmealQuickening == this.enableOatmealQuickening && config.enableMixedMode == this.enableMixedMode && config.enableMixedModeClassPath == this.enableMixedModeClassPath && config.enableMixedModePgo == this.enableMixedModePgo && config.pgoCompilerFilter == this.pgoCompilerFilter && config.multidexCompilationStrategy == this.multidexCompilationStrategy && config.tryPeriodicPgoCompilation == this.tryPeriodicPgoCompilation && config.legacyFlags == this.legacyFlags && config.henosisFlags == this.henosisFlags) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((((((((10571 + this.mode) * 31) + this.sync) * 31) + this.dalvikVerify) * 31) + this.dalvikOptimize) * 31) + this.dalvikRegisterMaps) * 31) + this.artFilter) * 31) + this.artHugeMethodMax) * 31) + this.artLargeMethodMax) * 31) + this.artSmallMethodMax) * 31) + this.artTinyMethodMax) * 31) + this.artTruncatedDexSize) * 31) + (this.enableArtVerifyNone ? 1 : 0)) * 31) + (this.enableOatmeal ? 1 : 0)) * 31) + (this.enableDex2OatQuickening ? 1 : 0)) * 31) + (this.enableOatmealQuickening ? 1 : 0)) * 31) + (this.enableQuickening ? 1 : 0)) * 31) + (this.enableMixedMode ? 1 : 0)) * 31) + (this.enableMixedModeClassPath ? 1 : 0)) * 31) + (this.enableMixedModePgo ? 1 : 0)) * 31) + this.pgoCompilerFilter) * 31) + this.multidexCompilationStrategy) * 31) + (this.tryPeriodicPgoCompilation ? 1 : 0)) * 31) + ((int) this.minTimeBetweenPgoCompilationMs)) * 31) + this.legacyFlags) * 31) + this.henosisFlags;
        }

        public boolean isDefault() {
            return equals(new Builder().build());
        }

        public void writeAndSync(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.writeByte(8);
                randomAccessFile.writeByte(this.mode);
                randomAccessFile.writeByte(this.sync);
                randomAccessFile.writeByte(this.dalvikVerify);
                randomAccessFile.writeByte(this.dalvikOptimize);
                randomAccessFile.writeByte(this.dalvikRegisterMaps);
                randomAccessFile.writeByte(this.artFilter);
                randomAccessFile.writeInt(this.artHugeMethodMax);
                randomAccessFile.writeInt(this.artLargeMethodMax);
                randomAccessFile.writeInt(this.artSmallMethodMax);
                randomAccessFile.writeInt(this.artTinyMethodMax);
                randomAccessFile.writeInt(this.artTruncatedDexSize);
                randomAccessFile.writeBoolean(this.enableArtVerifyNone);
                randomAccessFile.writeBoolean(this.enableOatmeal);
                randomAccessFile.writeBoolean(this.enableDex2OatQuickening);
                randomAccessFile.writeBoolean(this.enableOatmealQuickening);
                randomAccessFile.writeBoolean(this.enableQuickening);
                randomAccessFile.writeBoolean(this.enableMixedMode);
                randomAccessFile.writeBoolean(this.enableMixedModeClassPath);
                randomAccessFile.writeBoolean(this.enableMixedModePgo);
                randomAccessFile.writeByte(this.pgoCompilerFilter);
                randomAccessFile.writeBoolean(this.tryPeriodicPgoCompilation);
                randomAccessFile.writeLong(this.minTimeBetweenPgoCompilationMs);
                randomAccessFile.writeByte(this.multidexCompilationStrategy);
                randomAccessFile.writeInt(this.legacyFlags);
                randomAccessFile.writeInt(this.henosisFlags);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
        }

        public static boolean enableOatmealByDefault() {
            if (AnonymousClass0FX.A01() > 1 || !AnonymousClass0I6.A01) {
                EndToEnd.A03();
                if (DalvikConstants.FB_REDEX_VERIFY_NONE_ENABLED) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public byte[] readDepBlock() {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeByte(this.mode);
                obtain.writeByte(this.sync);
                obtain.writeByte(this.dalvikVerify);
                obtain.writeByte(this.dalvikOptimize);
                obtain.writeByte(this.dalvikRegisterMaps);
                obtain.writeByte(this.artFilter);
                obtain.writeInt(this.artHugeMethodMax);
                obtain.writeInt(this.artLargeMethodMax);
                obtain.writeInt(this.artSmallMethodMax);
                obtain.writeInt(this.artTinyMethodMax);
                int i = 0;
                obtain.writeBooleanArray(new boolean[]{this.enableArtVerifyNone, this.enableOatmeal, this.enableDex2OatQuickening, this.enableOatmealQuickening, this.enableQuickening, this.enableMixedMode, this.enableMixedModeClassPath, this.enableMixedModePgo});
                obtain.writeByte(this.pgoCompilerFilter);
                if (this.tryPeriodicPgoCompilation) {
                    i = 1;
                }
                obtain.writeByte((byte) i);
                obtain.writeLong(this.minTimeBetweenPgoCompilationMs);
                obtain.writeByte(this.multidexCompilationStrategy);
                obtain.writeInt(this.legacyFlags);
                obtain.writeInt(this.henosisFlags);
                return obtain.marshall();
            } finally {
                obtain.recycle();
            }
        }

        public Config(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte b7, boolean z9, long j, byte b8, int i6, int i7) {
            this.mode = b;
            this.sync = b2;
            this.dalvikVerify = b3;
            this.dalvikOptimize = b4;
            this.dalvikRegisterMaps = b5;
            this.artFilter = b6;
            this.artHugeMethodMax = i;
            this.artLargeMethodMax = i2;
            this.artSmallMethodMax = i3;
            this.artTinyMethodMax = i4;
            this.artTruncatedDexSize = i5;
            this.enableArtVerifyNone = z;
            this.enableOatmeal = z2;
            this.enableDex2OatQuickening = z3;
            this.enableOatmealQuickening = z4;
            this.enableQuickening = z5;
            this.enableMixedMode = z6;
            this.enableMixedModeClassPath = z7;
            this.enableMixedModePgo = z8;
            this.pgoCompilerFilter = b7;
            this.tryPeriodicPgoCompilation = z9;
            this.minTimeBetweenPgoCompilationMs = j;
            this.multidexCompilationStrategy = b8;
            this.legacyFlags = i6;
            this.henosisFlags = i7;
        }
    }

    public interface DexStoreClock {
        long now();
    }

    public interface DexStoreTestHooks {
        void onSecondaryDexesUnpackedForRecompilation();
    }

    public interface ExternalProcessProgressListener {
        void onCheckpoint();

        void onComplete(int i);
    }

    public final class FinishRegenerationThread extends Thread {
        public final ReentrantLockFile.Lock mHeldLock;
        public final long mNewStatus;
        public final OdexScheme mOdexScheme;

        public FinishRegenerationThread(OdexScheme odexScheme, ReentrantLockFile.Lock lock, long j) {
            super(AnonymousClass00U.A0L("TxFlush-", DexStore.this.root.getName()));
            this.mHeldLock = lock;
            this.mNewStatus = j;
            this.mOdexScheme = odexScheme;
        }

        public void run() {
            try {
                Mlog.safeFmt("running syncer thread", new Object[0]);
                for (String file : this.mOdexScheme.expectedFiles) {
                    File file2 = new File(DexStore.this.root, file);
                    if (file2.exists()) {
                        DalvikInternals.fsyncNamed(file2.getCanonicalPath(), -1);
                    }
                }
                DexStore.this.writeStatusLocked(this.mNewStatus);
                this.mHeldLock.close();
                Mlog.safeFmt("finished syncer thread: initial regeneration of dex store %s complete", DexStore.this.root);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                this.mHeldLock.close();
                throw th;
            }
        }
    }

    public final class OptimizationHistoryLog {
        public static long NO_TIME_DELTA = -1;
        public static final int SUCCESS = 2;
        public final File file;
        public final long lastFileModifiedTime;
        public final long lastOptedAppUpgradeTimestamp;
        public final long lastSuccessfulOptimizationTimestampMs;
        public final long optStatus;
        public final long schemeStatus;

        public static void clearHistoryLog(File file2) {
            new File(file2, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME).delete();
        }

        public static File getDefaultFile(File file2) {
            return new File(file2, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
        }

        public static OptimizationHistoryLog read(File file2) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
            try {
                OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(DexStore.sanityCheckTimestamp(randomAccessFile.readLong()), randomAccessFile.readLong(), randomAccessFile.readLong(), randomAccessFile.readLong(), DexStore.lastModifiedTime(file2), file2);
                Mlog.safeFmt("Read opt history log %s", optimizationHistoryLog);
                randomAccessFile.close();
                return optimizationHistoryLog;
            } catch (Throwable unused) {
            }
            throw th;
        }

        public static OptimizationHistoryLog readOrMakeDefaultFromRoot(Context context, File file2) {
            return readOrMakeDefault(context, new File(file2, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME));
        }

        public static void writeNewStatus(Context context, File file2, boolean z, long j) {
            long j2;
            String str;
            File file3 = new File(file2, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
            if (z) {
                j2 = 2;
            } else {
                j2 = 0;
            }
            long now = DexStore.sDexStoreClock.now();
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            if (z) {
                str = "success";
            } else {
                str = "error";
            }
            long j3 = j;
            Mlog.safeFmt("Writing optimization history log %s [opt status: %d scheme status: %d] (app last update time %d) at %d ms for %s", str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(appUpgradeTimestamp), Long.valueOf(now), file3.getAbsolutePath());
            OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(now, j2, j3, appUpgradeTimestamp, 0, file3);
            optimizationHistoryLog.writeToDisk(file3);
            Mlog.safeFmt("Wrote optimization history log %s", optimizationHistoryLog);
        }

        public boolean isLogFileAsFromRoot(File file2) {
            if (file2 != null) {
                return new File(file2, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME).equals(this.file);
            }
            if (this.file == null) {
                return true;
            }
            return false;
        }

        public boolean isNotDefault() {
            if (this.file != null) {
                return true;
            }
            return false;
        }

        public boolean isOutOfDate() {
            if (DexStore.lastModifiedTime(this.file) != this.lastFileModifiedTime) {
                return true;
            }
            return false;
        }

        public boolean lastCompilationSessionWasASuccess() {
            if ((this.optStatus & 2) != 0) {
                return true;
            }
            return false;
        }

        public long timeDeltaFromLastCompilationSessionMs() {
            if (this.lastSuccessfulOptimizationTimestampMs != 0) {
                long now = DexStore.sDexStoreClock.now();
                long j = this.lastSuccessfulOptimizationTimestampMs;
                if (j <= now) {
                    return now - j;
                }
            }
            return NO_TIME_DELTA;
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder("[ Opt History Log: ");
            sb.append("Default: ");
            boolean z = false;
            if (this.file != null) {
                z = true;
            }
            sb.append(!z);
            sb.append(", ");
            sb.append("Last Compile time: ");
            sb.append(this.lastSuccessfulOptimizationTimestampMs);
            sb.append(" ms, ");
            sb.append("Delta: ");
            sb.append(timeDeltaFromLastCompilationSessionMs());
            sb.append(" ms, ");
            sb.append("Opt Status: ");
            sb.append(this.optStatus);
            sb.append(" (");
            if (lastCompilationSessionWasASuccess()) {
                str = "success";
            } else {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            sb.append(str);
            sb.append("), ");
            sb.append("Scheme Status: ");
            sb.append(this.schemeStatus);
            sb.append(", ");
            sb.append("Last app update time: ");
            sb.append(this.lastOptedAppUpgradeTimestamp);
            sb.append(" ms, ");
            sb.append("File: ");
            File file2 = this.file;
            if (file2 != null) {
                str2 = file2.getAbsolutePath();
            } else {
                str2 = "None";
            }
            sb.append(str2);
            sb.append(']');
            return sb.toString();
        }

        public void writeToDisk(File file2) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.writeLong(this.lastSuccessfulOptimizationTimestampMs);
                randomAccessFile.writeLong(this.optStatus);
                randomAccessFile.writeLong(this.schemeStatus);
                randomAccessFile.writeLong(this.lastOptedAppUpgradeTimestamp);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
        }

        public OptimizationHistoryLog(long j, long j2, long j3, long j4, long j5, File file2) {
            this.lastSuccessfulOptimizationTimestampMs = j;
            this.optStatus = j2;
            this.schemeStatus = j3;
            this.lastOptedAppUpgradeTimestamp = j4;
            this.lastFileModifiedTime = j5;
            this.file = file2;
        }

        public static boolean canUseHistoryLogForThisApp(Context context, OptimizationHistoryLog optimizationHistoryLog) {
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            if (appUpgradeTimestamp == 0) {
                Mlog.w("Found not app version", new Object[0]);
            } else {
                Mlog.w("Comparing new %d to old %s", Long.valueOf(appUpgradeTimestamp), Long.valueOf(optimizationHistoryLog.lastOptedAppUpgradeTimestamp));
                if (appUpgradeTimestamp == optimizationHistoryLog.lastOptedAppUpgradeTimestamp) {
                    return true;
                }
            }
            return false;
        }

        public static OptimizationHistoryLog readOrMakeDefault(Context context, File file2) {
            try {
                OptimizationHistoryLog read = read(file2);
                if (canUseHistoryLogForThisApp(context, read)) {
                    return read;
                }
                Mlog.safeFmt("Could not use previous history log since it was for a different version or corrupted. optHistoryLog: %s", read);
                return new OptimizationHistoryLog();
            } catch (IOException unused) {
                return new OptimizationHistoryLog();
            }
        }

        public OptimizationHistoryLog() {
            this(0, 0, 0, 0, 0, (File) null);
        }
    }

    public final class OptimizationLog {
        public static final int COMPLETE = 1;
        public static final int COUNTER_AWAKE_MS = 0;
        public static final int COUNTER_AWAKE_RUN_MS = 3;
        public static final int COUNTER_AWAKE_YIELD_MS = 2;
        public static final int COUNTER_REAL_TIME_MS = 1;
        public static final int NR_COUNTERS = 4;
        public static final int SUCCESS = 2;
        public long[] counters = new long[4];
        public int flags = 0;
        public boolean isNotDefault = false;
        public long[] lastAttemptCounters = new long[4];
        public String lastFailureExceptionJson = "";
        public int nrOptimizationsAttempted = 0;
        public int nrOptimizationsFailed = 0;

        public static String getCounterName(int i) {
            if (i == 0) {
                return "COUNTER_AWAKE_MS";
            }
            if (i == 1) {
                return "COUNTER_AWAKE_REAL_TIME_MS";
            }
            if (i == 2) {
                return "COUNTER_AWAKE_YIELD_MS";
            }
            if (i == 3) {
                return "COUNTER_AWAKE_RUN_MS";
            }
            throw new AssertionError(AnonymousClass00U.A0J("unknown counter ", i));
        }

        public static File getDefaultFile(File file) {
            return new File(file, DexStore.OPTIMIZATION_LOG_FILENAME);
        }

        public static OptimizationLog read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                OptimizationLog optimizationLog = new OptimizationLog();
                optimizationLog.flags = randomAccessFile.readInt();
                optimizationLog.nrOptimizationsAttempted = randomAccessFile.readInt();
                optimizationLog.nrOptimizationsFailed = randomAccessFile.readInt();
                int i = 0;
                do {
                    optimizationLog.counters[i] = randomAccessFile.readLong();
                    optimizationLog.lastAttemptCounters[i] = randomAccessFile.readLong();
                    i++;
                } while (i < 4);
                optimizationLog.lastFailureExceptionJson = randomAccessFile.readUTF();
                optimizationLog.isNotDefault = true;
                randomAccessFile.close();
                return optimizationLog;
            } catch (Throwable unused) {
            }
            throw th;
        }

        public static OptimizationLog readFromRoot(File file) {
            return read(new File(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public static OptimizationLog readOrMakeDefaultFromRoot(File file) {
            return readOrMakeDefault(new File(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public void write(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.writeInt(this.flags);
                randomAccessFile.writeInt(this.nrOptimizationsAttempted);
                randomAccessFile.writeInt(this.nrOptimizationsFailed);
                int i = 0;
                do {
                    randomAccessFile.writeLong(this.counters[i]);
                    randomAccessFile.writeLong(this.lastAttemptCounters[i]);
                    i++;
                } while (i < 4);
                randomAccessFile.writeUTF(this.lastFailureExceptionJson);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
        }

        public void writeFromRoot(File file) {
            write(new File(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public static OptimizationLog readOrMakeDefault(File file) {
            try {
                return read(file);
            } catch (FileNotFoundException unused) {
                return new OptimizationLog();
            }
        }

        public boolean isNotDefault() {
            return this.isNotDefault;
        }
    }

    public final class OptimizationSession implements Closeable {
        public static final int PHASE_RUNNING = 0;
        public static final int PHASE_YIELDING = 1;
        public long accumulatedRunNs;
        public long accumulatedYieldNs;
        public final OptimizationConfiguration config;
        public final OptimizationConfiguration.Provider configProvider;
        public final Config dexStoreConfig;
        public final boolean inForeground;
        public final Context mContext;
        public final ReentrantLockFile mOptLockFile;
        public final FileInputStream mRegenStampFile;
        public final int optimizationAttemptNumber;
        public final long startRealtimeMs;
        public final long startUptimeMs;

        public final class Job implements Closeable {
            public static final int PHASE_COMMITTING = 2;
            public static final int PHASE_DONE = 3;
            public static final int PHASE_OPTIMIZING = 1;
            public static final int PHASE_PREPARING = 0;
            public final long initialStatus;
            public ReentrantLockFile.Lock mCommitLock;
            public ReentrantLockFile.Lock mOptLock;
            public int mPhase;

            public Job() {
                try {
                    this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                    long access$500 = DexStore.this.readStatusLocked();
                    this.initialStatus = access$500;
                    checkBadStatus(access$500);
                } catch (Throwable th) {
                    close();
                    throw th;
                }
            }

            private void checkBadStatus(long j) {
                byte b = (byte) ((int) (15 & j));
                if (b == 0 || b == 1 || b == 5 || b >= 10) {
                    throw new OptimizationCanceledException(String.format("bad status %x for dex store %s starting tx", new Object[]{Long.valueOf(j), DexStore.this.root}));
                }
                OptimizationSession.this.checkShouldStop();
            }

            public void close() {
                ReentrantLockFile.Lock lock = this.mCommitLock;
                if (lock != null) {
                    lock.close();
                    this.mCommitLock = null;
                }
                ReentrantLockFile.Lock lock2 = this.mOptLock;
                if (lock2 != null) {
                    lock2.close();
                    this.mOptLock = null;
                }
            }

            public void finishCommit(long j) {
                boolean z = false;
                if (this.mPhase == 2) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase", new Object[0]);
                DexStore.this.writeStatusLocked(j);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 3;
            }

            public long startCommitting(long j) {
                int i = this.mPhase;
                boolean z = false;
                if (i == 1) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase: %s", Integer.valueOf(i));
                this.mOptLock.close();
                this.mOptLock = null;
                this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                long access$500 = DexStore.this.readStatusLocked();
                checkBadStatus(access$500);
                long j2 = j | access$500;
                DexStore.this.writeStatusLocked(1 | (j2 << 4));
                this.mPhase = 2;
                return j2;
            }

            public void startOptimizing() {
                boolean z = false;
                if (this.mPhase == 0) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase", new Object[0]);
                this.mOptLock = OptimizationSession.this.mOptLockFile.acquireInterruptubly(1);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 1;
            }

            public long startCommitting() {
                return startCommitting(0);
            }
        }

        private byte determineOptimizationFailureState(byte b) {
            if (b == 8) {
                return 7;
            }
            return b == 3 ? (byte) 4 : 5;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void copeWithOptimizationFailure(java.lang.Throwable r5) {
            /*
                r4 = this;
                r3 = 0
                com.facebook.common.dextricks.DexStore r0 = com.facebook.common.dextricks.DexStore.this     // Catch:{ all -> 0x001c }
                com.facebook.common.dextricks.ReentrantLockFile r0 = r0.mLockFile     // Catch:{ all -> 0x001c }
                com.facebook.common.dextricks.ReentrantLockFile$Lock r1 = r0.acquire(r3)     // Catch:{ all -> 0x001c }
                r4.checkShouldStop()     // Catch:{ all -> 0x0015 }
                r4.copeWithOptimizationFailureImpl(r5)     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x0024
                r1.close()     // Catch:{ all -> 0x001c }
                return
            L_0x0015:
                r0 = move-exception
                if (r1 == 0) goto L_0x001b
                r1.close()     // Catch:{ all -> 0x001b }
            L_0x001b:
                throw r0     // Catch:{ all -> 0x001c }
            L_0x001c:
                r2 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.String r0 = "recording optimization failure itself failed"
                com.facebook.common.dextricks.Mlog.w(r2, r0, r1)
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationSession.copeWithOptimizationFailure(java.lang.Throwable):void");
        }

        public OptimizationSession(Context context, OptimizationConfiguration.Provider provider, boolean z) {
            ReentrantLockFile reentrantLockFile;
            this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            int i = readOrMakeDefaultFromRoot.nrOptimizationsAttempted;
            int i2 = i >= 1 ? 1 + i : 1;
            readOrMakeDefaultFromRoot.nrOptimizationsAttempted = i2;
            this.optimizationAttemptNumber = i2;
            writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot, false);
            this.dexStoreConfig = DexStore.this.readConfig();
            this.inForeground = z;
            this.startUptimeMs = SystemClock.uptimeMillis();
            this.startRealtimeMs = SystemClock.elapsedRealtime();
            FileInputStream fileInputStream = null;
            try {
                this.configProvider = provider;
                this.config = provider.baseline;
                FileInputStream fileInputStream2 = new FileInputStream(DexStore.this.getRegenFile());
                try {
                    reentrantLockFile = ReentrantLockFile.open(new File(DexStore.this.root, DexStore.ODEX_LOCK_FILENAME));
                    try {
                        this.mRegenStampFile = fileInputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        Fs.safeClose((Closeable) fileInputStream);
                        Fs.safeClose((Closeable) reentrantLockFile);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLockFile = null;
                    fileInputStream = fileInputStream2;
                    Fs.safeClose((Closeable) fileInputStream);
                    Fs.safeClose((Closeable) reentrantLockFile);
                    throw th;
                }
                try {
                    this.mOptLockFile = reentrantLockFile;
                } catch (Throwable th3) {
                    th = th3;
                    Fs.safeClose((Closeable) fileInputStream);
                    Fs.safeClose((Closeable) reentrantLockFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                reentrantLockFile = null;
                Fs.safeClose((Closeable) fileInputStream);
                Fs.safeClose((Closeable) reentrantLockFile);
                throw th;
            }
        }

        private int incrementOptimizationAttempts(OptimizationLog optimizationLog) {
            int i = optimizationLog.nrOptimizationsAttempted;
            if (i >= 1) {
                return 1 + i;
            }
            return 1;
        }

        private int resumeProcess(Process process) {
            process.kill(18);
            return process.waitFor(-1, 5);
        }

        private boolean shouldWriteOptimizationHistoryLog(OptimizationLog optimizationLog) {
            if ((optimizationLog.flags & 1) == 0) {
                return false;
            }
            return true;
        }

        private int stopProcess(Process process) {
            process.kill(20);
            return process.waitFor(-1, 6);
        }

        private void updateOptimizationLogCounters(OptimizationLog optimizationLog) {
            long[] jArr = optimizationLog.lastAttemptCounters;
            int i = 0;
            jArr[0] = SystemClock.uptimeMillis() - this.startUptimeMs;
            jArr[1] = SystemClock.elapsedRealtime() - this.startRealtimeMs;
            jArr[3] = this.accumulatedRunNs / 1000000;
            jArr[2] = this.accumulatedYieldNs / 1000000;
            do {
                long[] jArr2 = optimizationLog.counters;
                jArr2[i] = jArr2[i] + jArr[i];
                i++;
            } while (i < 4);
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j, boolean z) {
            DexStore.this.writeTxFailedStatusLocked(j);
            boolean z2 = false;
            if ((optimizationLog.flags & 2) != 0) {
                z2 = true;
            }
            optimizationLog.writeFromRoot(DexStore.this.root);
            if (z) {
                OptimizationHistoryLog.writeNewStatus(this.mContext, DexStore.this.root, z2, j);
            }
            DexStore.this.writeStatusLocked(j);
        }

        public void checkShouldStop() {
            if (DalvikInternals.getOpenFileLinkCount(Fd.fileno(this.mRegenStampFile.getFD())) == 0) {
                throw new OptimizationCanceledException("obsolete optimization: regeneration pending");
            }
        }

        public void close() {
            Fs.safeClose((Closeable) this.mOptLockFile);
            Fs.safeClose((Closeable) this.mRegenStampFile);
        }

        public void copeWithOptimizationFailureImpl(Throwable th) {
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            Mlog.w(th, "optimization failed (%s failures already)", Integer.valueOf(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
            long access$500 = DexStore.this.readStatusLocked();
            byte b = (byte) ((int) (15 & access$500));
            updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
            readOrMakeDefaultFromRoot.nrOptimizationsFailed++;
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                C03770Kr.A01(jsonWriter, th);
                jsonWriter.close();
                readOrMakeDefaultFromRoot.lastFailureExceptionJson = stringWriter.toString();
                int i = readOrMakeDefaultFromRoot.nrOptimizationsFailed;
                int i2 = this.config.maximumOptimizationAttempts;
                if (i >= i2) {
                    Mlog.w("too many optimization failures (threshold is %s): will not keep trying", Integer.valueOf(i2));
                    access$500 = (long) determineOptimizationFailureState(b);
                    readOrMakeDefaultFromRoot.flags |= 1;
                }
                writeCurrentStateFromRoot(readOrMakeDefaultFromRoot, access$500);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public OptimizationHistoryLog getOptimizationHistoryLog() {
            DexStore dexStore = DexStore.this;
            return dexStore.getCurrentOptHistoryLogFromRoot(this.mContext, dexStore.root);
        }

        public int maxOptimizationAttempts() {
            return this.config.maximumOptimizationAttempts;
        }

        public void noteOptimizationSuccess() {
            ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
            try {
                if (!this.inForeground) {
                    checkShouldStop();
                }
                OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
                readOrMakeDefaultFromRoot.flags |= 3;
                updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
                writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot);
                if (acquire != null) {
                    acquire.close();
                    return;
                }
                return;
            } catch (Throwable unused) {
            }
            throw th;
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog) {
            writeCurrentStateWithCurrentStatusFromRoot(optimizationLog, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
            if (r9 == Integer.MIN_VALUE) goto L_0x0048;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[LOOP:0: B:1:0x000f->B:28:0x0080, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x006d A[EDGE_INSN: B:37:0x006d->B:24:0x006d ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int waitForAndManageProcess(com.facebook.forker.Process r22, com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener r23) {
            /*
                r21 = this;
                long r19 = java.lang.System.nanoTime()
                r17 = 1000000(0xf4240, double:4.940656E-318)
                long r15 = r19 / r17
                r13 = r15
                r12 = 0
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r19
            L_0x000f:
                r6 = r21
                com.facebook.common.dextricks.OptimizationConfiguration$Provider r0 = r6.configProvider
                com.facebook.common.dextricks.OptimizationConfiguration r4 = r0.getInstantaneous()
                long r10 = r15 - r13
                r5 = r22
                if (r12 != 0) goto L_0x0085
                long r0 = r6.accumulatedRunNs
                long r2 = r19 - r7
                long r0 = r0 + r2
                r6.accumulatedRunNs = r0
                int r0 = r4.optTimeSliceMs
                long r2 = (long) r0
                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0048
                int r0 = r4.yieldTimeSliceMs
                if (r0 <= 0) goto L_0x0043
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r0 = "beginning yield"
                com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
                int r9 = r6.stopProcess(r5)
                r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
                if (r9 != r0) goto L_0x0042
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0042:
                r12 = 1
            L_0x0043:
                r13 = r15
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 != r0) goto L_0x0059
            L_0x0048:
                int r1 = r4.processPollMs
                long r2 = r2 - r10
                long r7 = (long) r1
                int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r0 >= 0) goto L_0x0051
                int r1 = (int) r2
            L_0x0051:
                if (r1 >= 0) goto L_0x0054
                r1 = 0
            L_0x0054:
                r0 = 4
                int r9 = r5.waitFor(r1, r0)
            L_0x0059:
                r6.checkShouldStop()
                long r1 = java.lang.System.nanoTime()
                long r15 = r1 / r17
                r3 = r23
                if (r23 == 0) goto L_0x0069
                r3.onCheckpoint()
            L_0x0069:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 == r0) goto L_0x0080
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                java.lang.Object[] r1 = new java.lang.Object[]{r0}
                java.lang.String r0 = "process exited with status %s"
                com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
                if (r23 == 0) goto L_0x007f
                r3.onComplete(r9)
            L_0x007f:
                return r9
            L_0x0080:
                r7 = r19
                r19 = r1
                goto L_0x000f
            L_0x0085:
                long r2 = r6.accumulatedYieldNs
                long r0 = r19 - r7
                long r2 = r2 + r0
                r6.accumulatedYieldNs = r2
                int r0 = r4.yieldTimeSliceMs
                long r2 = (long) r0
                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0048
                int r0 = r4.optTimeSliceMs
                if (r0 <= 0) goto L_0x0043
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r0 = "ending yield"
                com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
                int r9 = r6.resumeProcess(r5)
                r0 = -2147483646(0xffffffff80000002, float:-2.8E-45)
                if (r9 != r0) goto L_0x00aa
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x00aa:
                r12 = 0
                goto L_0x0043
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationSession.waitForAndManageProcess(com.facebook.forker.Process, com.facebook.common.dextricks.DexStore$ExternalProcessProgressListener):int");
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j) {
            writeCurrentStateFromRoot(optimizationLog, j, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog, boolean z) {
            writeCurrentStateFromRoot(optimizationLog, DexStore.this.readStatusLocked(), z);
        }
    }

    public class PreviewSdkHelper {
        public static boolean isPreviewSdk() {
            if (Build.VERSION.PREVIEW_SDK_INT != 0) {
                return true;
            }
            return false;
        }
    }

    public class ProgressListener {
        public void onProgress(int i, int i2, boolean z) {
        }
    }

    public final class TmpDir implements Closeable {
        public File directory;
        public ReentrantLockFile.Lock mTmpDirLock;

        public TmpDir(ReentrantLockFile.Lock lock, File file) {
            this.mTmpDirLock = lock;
            this.directory = file;
        }

        public void close() {
            if (this.mTmpDirLock != null) {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                try {
                    ReentrantLockFile.Lock lock = this.mTmpDirLock;
                    File file = ReentrantLockFile.this.lockFileName;
                    lock.close();
                    this.mTmpDirLock = null;
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(this.directory);
                    this.directory = null;
                    if (acquire != null) {
                        acquire.close();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                }
            } else {
                return;
            }
            throw th;
        }
    }

    public static boolean checkAndClearGk(Context context, String str) {
        try {
            boolean z = true;
            if (AnonymousClass0SH.A00(context, str, 0) != 1) {
                z = false;
            }
            return z;
        } finally {
            if (context != null) {
                AnonymousClass0SH.A02(context, str, 0);
            }
        }
    }

    private void deleteFiles(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null) {
                Mlog.safeFmt("deleting existing file %s/%s", this.root, strArr[i]);
                Fs.deleteRecursive(new File(this.root, strArr[i]));
            }
        }
    }

    private int findInArray(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static long getBaseApkIdentifier(File file) {
        return getApkIdentifier(file, false);
    }

    private synchronized DexStore[] getParents() {
        List list;
        DexManifest loadManifest = loadManifest();
        if (this.mParentStores.isEmpty() && !DexStoreUtils.MAIN_DEX_STORE_ID.equals(loadManifest.id)) {
            for (String str : loadManifest.requires) {
                if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
                    DexStore dexStoreListHead = dexStoreListHead();
                    while (true) {
                        if (dexStoreListHead != null) {
                            String str2 = dexStoreListHead.id;
                            if (str2 != null && str2.equals(str)) {
                                this.mParentStores.add(dexStoreListHead);
                                dexStoreListHead.addChild(this);
                                break;
                            }
                            dexStoreListHead = dexStoreListHead.next;
                        } else {
                            Mlog.safeFmt(AnonymousClass00U.A0d("unable to find required store ", str, " of store ", loadManifest.id), new Object[0]);
                            break;
                        }
                    }
                }
            }
        }
        list = this.mParentStores;
        return (DexStore[]) list.toArray(new DexStore[list.size()]);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ Exception -> 0x0041, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ Exception -> 0x0041, all -> 0x00a4 }] */
    private byte[] readCurrentDepBlock() {
        /*
            r8 = this;
            r7 = 0
            r5 = 1
            r6 = 0
            java.io.File r0 = r8.mApk     // Catch:{ Exception -> 0x000a }
            java.io.File r6 = determineOdexCacheName(r0)     // Catch:{ Exception -> 0x000a }
            goto L_0x0014
        L_0x000a:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "error reading odex cache file %s"
            com.facebook.common.dextricks.Mlog.w(r2, r0, r1)
        L_0x0014:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            if (r6 == 0) goto L_0x004b
            boolean r0 = r6.exists()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x004b
            com.facebook.common.dextricks.DexStore[] r4 = r8.getParents()     // Catch:{ Exception -> 0x0041 }
            int r3 = r4.length     // Catch:{ Exception -> 0x0041 }
            r1 = 0
        L_0x0026:
            if (r1 >= r3) goto L_0x0034
            r0 = r4[r1]     // Catch:{ Exception -> 0x0041 }
            byte[] r0 = r0.readCurrentDepBlock()     // Catch:{ Exception -> 0x0041 }
            r2.writeByteArray(r0)     // Catch:{ Exception -> 0x0041 }
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0034:
            java.lang.String r0 = r6.getPath()     // Catch:{ Exception -> 0x0041 }
            byte[] r0 = com.facebook.common.dextricks.DalvikInternals.readOdexDepBlock(r0)     // Catch:{ Exception -> 0x0041 }
            r2.writeByteArray(r0)     // Catch:{ Exception -> 0x0041 }
            r0 = 1
            goto L_0x004c
        L_0x0041:
            r0 = move-exception
            java.lang.String r1 = "could not read odex dep block: using modtime: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00a4 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a4 }
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 != 0) goto L_0x006b
            java.io.File r0 = r8.mApk     // Catch:{ all -> 0x00a4 }
            long r3 = getApkIdentifier(r0, r5)     // Catch:{ all -> 0x00a4 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            java.io.File r0 = r8.mApk     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00a4 }
            r2.writeString(r0)     // Catch:{ all -> 0x00a4 }
            r2.writeLong(r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x00a4 }
            r2.writeString(r0)     // Catch:{ all -> 0x00a4 }
        L_0x006b:
            boolean r0 = com.facebook.endtoend.EndToEnd.A03()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0074
            r2.writeByte(r7)     // Catch:{ all -> 0x00a4 }
        L_0x0074:
            java.lang.Class<X.0pe> r0 = X.C14550pe.class
            monitor-enter(r0)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            com.facebook.common.dextricks.DexStore$Config r0 = r8.readConfig()     // Catch:{ all -> 0x00a4 }
            byte[] r0 = r0.readDepBlock()     // Catch:{ all -> 0x00a4 }
            r2.writeByteArray(r0)     // Catch:{ all -> 0x00a4 }
            byte[] r0 = r2.marshall()     // Catch:{ all -> 0x00a4 }
            r2.recycle()
            return r0
        L_0x008b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            r1.<init>()     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "unable to get identifier of "
            r1.append(r0)     // Catch:{ all -> 0x00a4 }
            java.io.File r0 = r8.mApk     // Catch:{ all -> 0x00a4 }
            r1.append(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a4 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00a4 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.readCurrentDepBlock():byte[]");
    }

    public static void setClock(DexStoreClock dexStoreClock) {
        Mlog.safeFmt("Setting dexstore clock override", new Object[0]);
        sDexStoreClock = dexStoreClock;
    }

    public static void setDexStoreTestHooks(DexStoreTestHooks dexStoreTestHooks) {
        Mlog.safeFmt("Setting dexstore test hooks", new Object[0]);
        sDexStoreTestHooks = dexStoreTestHooks;
    }

    private void setDifference(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < strArr2.length) {
                        String str2 = strArr2[i2];
                        if (str2 != null && str.equals(str2)) {
                            strArr[i] = null;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private void verifyCanaryClasses(DexManifest dexManifest) {
        int i = 0;
        while (true) {
            DexManifest.Dex[] dexArr = dexManifest.dexes;
            if (i < dexArr.length) {
                Class.forName(dexArr[i].canaryClass);
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void writeTxFailedStatusLocked(long j) {
        writeStatusLocked((j << 4) | 1);
    }

    public synchronized boolean isLoaded() {
        boolean z;
        z = false;
        if (this.mLoadedManifest != null) {
            z = true;
        }
        return z;
    }

    public boolean isReoptimization(Context context) {
        try {
            return readConfig().tryPeriodicPgoCompilation && getCurrentOptHistoryLogFromRoot(context, this.root).lastCompilationSessionWasASuccess();
        } catch (IOException e) {
            Mlog.e(e, "failed to check if reoptimization. Failing back to not a reoptimization.", new Object[0]);
            return false;
        }
    }

    public synchronized DexErrorRecoveryInfo loadAll(int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        try {
            dexErrorRecoveryInfo = loadAllImpl(i, lightweightQuickPerformanceLogger, context);
        } catch (RecoverableDexException e) {
            try {
                dexErrorRecoveryInfo = loadAllImpl(i | 2, lightweightQuickPerformanceLogger, context);
                dexErrorRecoveryInfo.regenRetryCause = e;
            } catch (RecoverableDexException e2) {
                throw new AssertionError(e2);
            }
        }
        dexErrorRecoveryInfo.loadAllTime = sDexStoreClock.now();
        return dexErrorRecoveryInfo;
    }

    public synchronized int peekMainStoreRegenStatus(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        AssertionError th;
        boolean z;
        DexManifest loadManifest = loadManifest();
        if (getParents().length <= 0) {
            z = false;
            if (!canLoadCanaryClass(loadManifest)) {
                ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
                try {
                    if (shouldLoadCompressedOreoImpl(context, loadManifest)) {
                        z = new OdexSchemeOreo(loadManifest.dexes, new File(this.root, getMegaZipName(context, loadManifest)), context, lightweightQuickPerformanceLogger).needsUnpack();
                    } else {
                        OdexScheme schemeForState = schemeForState(context, loadManifest, readStatusLocked());
                        ArrayList arrayList = new ArrayList();
                        if (checkDirty(schemeForState, listRootFilesForPruningLocked(context, arrayList), arrayList) > 0) {
                            z = true;
                        }
                    }
                    if (acquire != null) {
                        acquire.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (acquire != null) {
                        acquire.close();
                    }
                }
            }
        } else {
            th = new AssertionError("Not supported for this store");
            throw th;
        }
        return z ? 1 : 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long reportStatus() {
        /*
            r5 = this;
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "DexStore::reportStatus()"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r2 = 0
            com.facebook.common.dextricks.ReentrantLockFile r0 = r5.mLockFile     // Catch:{ all -> 0x0021 }
            com.facebook.common.dextricks.ReentrantLockFile$Lock r1 = r0.acquire(r4)     // Catch:{ all -> 0x0021 }
            long r2 = r5.readStatusLocked()     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ all -> 0x0021 }
            return r2
        L_0x001a:
            r0 = move-exception
            if (r1 == 0) goto L_0x0020
            r1.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "DexStore::reportStatus caught Throwable "
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.reportStatus():long");
    }

    public class NormalDexStoreClock implements DexStoreClock {
        public long now() {
            return System.currentTimeMillis();
        }

        public /* synthetic */ NormalDexStoreClock(AnonymousClass1 r1) {
        }

        public NormalDexStoreClock() {
        }
    }

    private byte adjustDesiredStateForConfig(byte b, Config config) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        String str2;
        byte b2 = config.mode;
        if (b2 == 0) {
            return b;
        }
        if (b2 == 1) {
            Mlog.safeFmt("using fallback mode due to request in config file", new Object[0]);
            return 2;
        }
        if (b2 == 2) {
            if (b == 2) {
                objArr = new Object[0];
                str = "ignoring configured turbo mode: already forced to fallback mode";
            } else if (b == 3) {
                Mlog.safeFmt("using Dalvik turbo as requested in config file", new Object[0]);
                return 4;
            } else if (b == 4 || b == 7) {
                objArr = new Object[0];
                str = "config file wants turbo mode: already using it";
            } else if (b == 8) {
                Mlog.safeFmt("using ART turbo as requested in config file", new Object[0]);
                return 7;
            } else if (b != 9) {
                objArr2 = new Object[]{Byte.valueOf(b)};
                str2 = "ignoring configured turbo mode: state not whitelisted: %s";
            } else {
                objArr = new Object[0];
                str = "ignoring configured turbo mode: no dex loading to do";
            }
            Mlog.safeFmt(str, objArr);
            return b;
        } else if (b2 == 3) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 4) {
                        Mlog.safeFmt("using Dalvik xdex as requested in config", new Object[0]);
                        return 3;
                    } else if (b == 7) {
                        Mlog.safeFmt("using ART xdex as requested in config file", new Object[0]);
                        return 8;
                    } else if (b != 8) {
                        if (b != 9) {
                            objArr2 = new Object[]{Byte.valueOf(b)};
                            str2 = "ignoring configured xdex mode: state not whitelisted: %s";
                        } else {
                            objArr = new Object[0];
                            str = "ignoring configured xdex mode: no dex loading to do";
                        }
                    }
                }
                objArr = new Object[0];
                str = "config file wants xdex mode: already using it";
            } else {
                objArr = new Object[0];
                str = "ignoring configured xdex mode: already forced to fallback";
            }
            Mlog.safeFmt(str, objArr);
            return b;
        } else {
            objArr2 = new Object[]{Byte.valueOf(b2)};
            str2 = "ignoring unknown configured dex mode %s";
        }
        Mlog.w(str2, objArr2);
        return b;
    }

    private void appendDexHashForMegaZip(Context context, StringBuilder sb, DexManifest dexManifest) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA");
            instance.update(OdexSchemeOreo.getPrimaryDexIdentifierString(context).getBytes());
            int i = 0;
            while (true) {
                DexManifest.Dex[] dexArr = dexManifest.dexes;
                if (i < dexArr.length) {
                    instance.update(dexArr[i].hash.getBytes());
                    i++;
                } else {
                    instance.update(readCurrentDepBlock());
                    sb.append(DexStoreUtils.toHex(instance.digest()));
                    return;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void assertLockHeld() {
        boolean z = false;
        if (this.mLockFile.mLockOwner == Thread.currentThread()) {
            z = true;
        }
        Mlog.assertThat(z, "lock req", new Object[0]);
    }

    public static boolean canLoadCanaryClass(DexManifest dexManifest) {
        String str = dexManifest.dexes[0].canaryClass;
        try {
            Mlog.safeFmt("attempting to detect built-in ART multidex by classloading %s", str);
            Class.forName(dexManifest.dexes[0].canaryClass);
            Mlog.safeFmt("ART native multi-dex in use: found %s", str);
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            Mlog.safeFmt("ART multi-dex not in use: cannot load %s", str);
            return false;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0027 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0027=Splitter:B:16:0x0027, B:10:0x001f=Splitter:B:10:0x001f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkAnyOptimizerRunningCurrently() {
        /*
            r3 = this;
            java.io.File r2 = r3.root
            java.lang.String r0 = "odex_lock"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r2 = 0
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0028 }
            if (r0 == 0) goto L_0x0028
            com.facebook.common.dextricks.ReentrantLockFile r1 = com.facebook.common.dextricks.ReentrantLockFile.open(r1)     // Catch:{ IOException -> 0x0028 }
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r1.tryAcquire(r2)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x001c
            r2 = 1
            goto L_0x001f
        L_0x001c:
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r0)     // Catch:{ all -> 0x0023 }
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0028 }
            return r2
        L_0x0023:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.checkAnyOptimizerRunningCurrently():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r0.mIsOptional == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int checkDirty(com.facebook.common.dextricks.OdexScheme r9, java.lang.String[] r10, java.util.List r11) {
        /*
            r8 = this;
            java.lang.String[] r2 = r9.expectedFiles
            int r0 = r9.flags
            r0 = r0 & 2
            r5 = 0
            if (r0 == 0) goto L_0x000a
            r5 = 2
        L_0x000a:
            java.lang.Object r6 = r10.clone()
            java.lang.String[] r6 = (java.lang.String[]) r6
            r8.setDifference(r6, r2)
            r4 = 0
            r7 = 0
        L_0x0015:
            int r0 = r6.length
            r3 = 1
            if (r4 >= r0) goto L_0x0054
            r0 = r6[r4]
            if (r0 == 0) goto L_0x0046
            r0 = r6[r4]
            boolean r0 = com.facebook.common.dextricks.DexStoreUtils.isIgnoreDirtyFileName(r0)
            if (r0 != 0) goto L_0x0046
            r3 = r6[r4]
            java.io.File r1 = r8.root
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r0}
            java.lang.String r0 = "deleting unknown file %s in dex store %s with schema %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.io.File r3 = r8.root
            r1 = r6[r4]
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r1)
            r11.add(r0)
            r7 = 1
        L_0x0043:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0046:
            r1 = r6[r4]
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Ignoring potentially excessive file %s in root: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            goto L_0x0043
        L_0x0054:
            if (r7 == 0) goto L_0x0068
            int r0 = r9.flags
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0068
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s had excess files and is non-incremental: regenerating"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r5 = 2
        L_0x0068:
            boolean r0 = r8.checkDeps()
            if (r0 != 0) goto L_0x007b
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s dependencies have changed: regenerating all"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r5 = 2
        L_0x007a:
            return r5
        L_0x007b:
            if (r5 >= r3) goto L_0x007a
            com.facebook.common.dextricks.ExpectedFileInfo[] r4 = r9.expectedFileInfos
            java.lang.Object r3 = r2.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            r8.setDifference(r3, r10)
            r2 = 0
        L_0x0089:
            int r0 = r3.length
            if (r2 >= r0) goto L_0x007a
            r0 = r4[r2]
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.mIsOptional
            r1 = 1
            if (r0 != 0) goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            r0 = r3[r2]
            if (r0 == 0) goto L_0x00aa
            if (r1 != 0) goto L_0x00aa
            r1 = r3[r2]
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "missing file %s in dex store %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r5 = 1
        L_0x00aa:
            int r2 = r2 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.checkDirty(com.facebook.common.dextricks.OdexScheme, java.lang.String[], java.util.List):int");
    }

    private byte determineDesiredState(byte b, DexManifest dexManifest, boolean z) {
        Object[] objArr;
        String str;
        if (dexManifest.dexes.length == 0) {
            Mlog.safeFmt("no secondary dexes listed: using noop configuration", new Object[0]);
            return 9;
        }
        if (b == 5) {
            objArr = new Object[0];
            str = "recovering from bad class gen: using fallback";
        } else if ("Amazon".equals(Build.BRAND) && !AnonymousClass0JB.A00) {
            objArr = new Object[0];
            str = "avoiding optimizations on non-standard VM";
        } else if (!AnonymousClass0JB.A00) {
            return 3;
        } else {
            if (z || !canLoadCanaryClass(dexManifest)) {
                return 8;
            }
            return 9;
        }
        Mlog.safeFmt(str, objArr);
        return 2;
    }

    public static File determineOdexCacheName(File file) {
        if (AnonymousClass0JB.A00) {
            return null;
        }
        String path = file.getPath();
        if (path.endsWith(".apk")) {
            File file2 = new File(AnonymousClass00U.A0L(path.substring(0, path.length() - 4), DexManifest.ODEX_EXT));
            if (file2.exists()) {
                return file2;
            }
        }
        return Fs.dexOptGenerateCacheFileName(Fs.findSystemDalvikCache(), file, "classes.dex");
    }

    public static synchronized DexStore dexStoreListHead() {
        DexStore dexStore;
        synchronized (DexStore.class) {
            dexStore = sListHead;
        }
        return dexStore;
    }

    public static synchronized DexStore findOpened(String str) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            dexStoreListHead = dexStoreListHead();
            while (true) {
                if (dexStoreListHead == null) {
                    dexStoreListHead = null;
                    break;
                }
                String str2 = dexStoreListHead.id;
                if (str2 != null) {
                    if (str2.equals(str)) {
                        break;
                    }
                } else if (str == null) {
                    break;
                }
                dexStoreListHead = dexStoreListHead.next;
            }
        }
        return dexStoreListHead;
    }

    public static long getAppUpgradeTimestamp(Context context) {
        long j = sCachedLastAppUpdateTime;
        if (j != 0) {
            return j;
        }
        long genAppUpgradeTimestamp = genAppUpgradeTimestamp(context);
        sCachedLastAppUpdateTime = genAppUpgradeTimestamp;
        return genAppUpgradeTimestamp;
    }

    public static DexStoreClock getClock(Class cls) {
        DexStoreClock dexStoreClock = sDexStoreClock;
        if (dexStoreClock == null) {
            return null;
        }
        return dexStoreClock;
    }

    /* access modifiers changed from: private */
    public OptimizationHistoryLog getCurrentOptHistoryLogFromRoot(Context context, File file) {
        OptimizationHistoryLog optimizationHistoryLog = this.mCachedOptimizationHistoryLog;
        if (optimizationHistoryLog == null || !optimizationHistoryLog.isLogFileAsFromRoot(file) || this.mCachedOptimizationHistoryLog.isOutOfDate()) {
            OptimizationHistoryLog optimizationHistoryLog2 = this.mCachedOptimizationHistoryLog;
            OptimizationHistoryLog readOrMakeDefaultFromRoot = OptimizationHistoryLog.readOrMakeDefaultFromRoot(context, file);
            this.mCachedOptimizationHistoryLog = readOrMakeDefaultFromRoot;
            Mlog.safeFmt("Reading new history log for (same root: %s out of date: %s) root: %s \n old: %s \n new: %s", Boolean.valueOf(readOrMakeDefaultFromRoot.isLogFileAsFromRoot(file)), Boolean.valueOf(this.mCachedOptimizationHistoryLog.isOutOfDate()), file.getAbsolutePath(), optimizationHistoryLog2, this.mCachedOptimizationHistoryLog);
        }
        return this.mCachedOptimizationHistoryLog;
    }

    private String getMegaZipName(Context context, DexManifest dexManifest) {
        StringBuilder sb = new StringBuilder(46);
        sb.append("z-");
        appendDexHashForMegaZip(context, sb, dexManifest);
        sb.append(".zip");
        return sb.toString();
    }

    public static File getOatFileFromDexHash(File file, String str) {
        if (str == null) {
            return null;
        }
        return new File(file, AnonymousClass00U.A0V("prog-", str, ".oat"));
    }

    public static String getStatusDescription(long j) {
        String str;
        int i = (int) (j & 15);
        switch (i) {
            case 0:
                str = "STATE_INVALID";
                break;
            case 1:
                str = "STATE_TX_FAILED";
                break;
            case 2:
                str = "STATE_FALLBACK";
                break;
            case 3:
                str = "STATE_XDEX";
                break;
            case 4:
                str = "STATE_TURBO";
                break;
            case 5:
                str = "STATE_BAD_GEN";
                break;
            case 6:
                str = "STATE_REGEN_FORCED";
                break;
            case 7:
                str = "STATE_ART_TURBO";
                break;
            case 8:
                str = "STATE_ART_XDEX";
                break;
            case 9:
                str = "STATE_NOOP";
                break;
            default:
                str = AnonymousClass00U.A0J("BAD STATE ", i);
                break;
        }
        return AnonymousClass00U.A09(str);
    }

    public static synchronized void installCrossDexHooks() {
        synchronized (DexStore.class) {
            if (sAttemptedCrossDexHookInstallation) {
                Throwable th = sCrossDexHookInstallationError;
                if (th != null) {
                    th = Fs.runtimeExFrom(th);
                }
            } else {
                sAttemptedCrossDexHookInstallation = true;
                try {
                    DalvikInternals.fixDvmForCrossDexHack();
                    Mlog.safeFmt("cross-dex hook installation succeeded", new Object[0]);
                } catch (Throwable th2) {
                    th = th2;
                    sCrossDexHookInstallationError = th;
                }
            }
            throw th;
        }
    }

    public static long lastModifiedTime(File file) {
        if (file == null || !file.exists()) {
            return 0;
        }
        return file.lastModified();
    }

    private String[] listAndPruneRootFiles(Context context) {
        ArrayList arrayList = new ArrayList();
        String[] listRootFilesForPruningLocked = listRootFilesForPruningLocked(context, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return listRootFilesForPruningLocked;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b0, code lost:
        if (r15 == false) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c3 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01eb A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0129 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012e A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0142 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0174 A[Catch:{ all -> 0x0146, all -> 0x0220 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo r24, com.facebook.common.dextricks.DexManifest r25, int r26, com.facebook.quicklog.LightweightQuickPerformanceLogger r27, android.content.Context r28) {
        /*
            r23 = this;
            r2 = 32
            java.lang.String r1 = "DexStore.loadAllOreo"
            r0 = 646280348(0x2685749c, float:9.260336E-16)
            X.C13850oP.A01(r2, r1, r0)
            r16 = r26 & -2
            r4 = r23
            java.io.File r1 = r4.root     // Catch:{ all -> 0x0220 }
            r9 = r25
            r10 = r28
            java.lang.String r0 = r4.getMegaZipName(r10, r9)     // Catch:{ all -> 0x0220 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0220 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x0220 }
            r4.mMegaZipPath = r0     // Catch:{ all -> 0x0220 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.DexManifest$Dex[] r0 = r9.dexes     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.OdexSchemeOreo r5 = new com.facebook.common.dextricks.OdexSchemeOreo     // Catch:{ all -> 0x0220 }
            r14 = r27
            r5.<init>(r0, r6, r10, r14)     // Catch:{ all -> 0x0220 }
            r11 = 29
            r7 = 0
            if (r1 > r11) goto L_0x004f
            if (r1 != r11) goto L_0x004d
            int r0 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x004f
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ all -> 0x0220 }
            int r0 = r0.targetSdkVersion     // Catch:{ all -> 0x0220 }
            if (r0 >= r11) goto L_0x004f
            int r8 = X.AnonymousClass0FX.A01()     // Catch:{ all -> 0x0220 }
            r0 = 1
            if (r8 > r0) goto L_0x004d
            boolean r0 = X.AnonymousClass0I6.A00     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r0 = 0
            goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r4.mUseBgDexOpt = r0     // Catch:{ all -> 0x0220 }
            if (r1 == r11) goto L_0x0060
            r0 = 30
            if (r1 == r0) goto L_0x0060
            int r0 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0062
            r0 = 31
            if (r1 < r0) goto L_0x0062
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r4.mUseEagerDexOpt = r0     // Catch:{ all -> 0x0220 }
            boolean r0 = X.AnonymousClass0JR.A03()     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x008d
            boolean r0 = r4.shouldUnpackForCloudPgo(r10, r5)     // Catch:{ all -> 0x0220 }
            r15 = 1
            if (r0 == 0) goto L_0x008d
            r5.requestDexUnpack()     // Catch:{ all -> 0x0220 }
            java.lang.String r1 = "inCloudPgoQE: dex unpack requested for cloud pgo qe"
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x0220 }
        L_0x007c:
            boolean r0 = r5.needsUnpack()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0129
            java.io.File r0 = r4.root     // Catch:{ all -> 0x0220 }
            java.lang.String[] r13 = r0.list()     // Catch:{ all -> 0x0220 }
            if (r13 == 0) goto L_0x010f
            int r12 = r13.length     // Catch:{ all -> 0x0220 }
            r11 = 0
            goto L_0x008f
        L_0x008d:
            r15 = 0
            goto L_0x007c
        L_0x008f:
            if (r11 >= r12) goto L_0x00e8
            r8 = r13[r11]     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = ".dex"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = ".zlock"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = ".prof"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = ".zip"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "z-"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "p-"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
        L_0x00c3:
            java.lang.String r0 = "oat"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "foreign-dex"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "regen_stamp"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x00e5
        L_0x00db:
            java.io.File r1 = r4.root     // Catch:{ all -> 0x0220 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0220 }
            r0.<init>(r1, r8)     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r0)     // Catch:{ all -> 0x0220 }
        L_0x00e5:
            int r11 = r11 + 1
            goto L_0x008f
        L_0x00e8:
            r21 = r14
            r22 = r10
            r20 = r7
            r19 = r5
            r18 = r9
            r17 = r4
            r17.runCompiler(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0220 }
            boolean r0 = r4.mUseEagerDexOpt     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = r4.id     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "dex"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0108
            r5.addEmptyDex(r10)     // Catch:{ all -> 0x0220 }
        L_0x0108:
            r5.finalizeZip()     // Catch:{ all -> 0x0220 }
            r4.touchRegenStamp()     // Catch:{ all -> 0x0220 }
            goto L_0x012b
        L_0x010f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r1.<init>()     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "unable to list directory "
            r1.append(r0)     // Catch:{ all -> 0x0220 }
            java.io.File r0 = r4.root     // Catch:{ all -> 0x0220 }
            r1.append(r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0220 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0220 }
            r1.<init>(r0)     // Catch:{ all -> 0x0220 }
            goto L_0x01ea
        L_0x0129:
            r8 = 0
            goto L_0x012c
        L_0x012b:
            r8 = 1
        L_0x012c:
            if (r15 == 0) goto L_0x0138
            com.facebook.common.dextricks.OreoFileUtils.markUnpackedForCloudPgo(r6)     // Catch:{ all -> 0x0220 }
            java.lang.String r1 = "inCloudPgoQE: markUnpackedForCloudPgo in DexStore"
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x0220 }
        L_0x0138:
            r7 = r24
            r4.installArtHacks(r10, r7)     // Catch:{ all -> 0x0220 }
            r5.initializeClassLoader()     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x016d
            r4.verifyCanaryClasses(r9)     // Catch:{ all -> 0x0146 }
            goto L_0x016d
        L_0x0146:
            r9 = move-exception
            r0 = r16 & 2
            r7 = 0
            if (r0 == 0) goto L_0x014d
            r7 = 1
        L_0x014d:
            java.lang.String r6 = "Failed to teach app classloader about secondary dex files (%s); fatal: %b, regenerated: %b"
            java.io.File r4 = r4.root     // Catch:{ all -> 0x0220 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0220 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r1, r0}     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.Mlog.e(r9, r6, r0)     // Catch:{ all -> 0x0220 }
            if (r7 == 0) goto L_0x0164
            goto L_0x01e5
        L_0x0164:
            r5.requestDexUnpack()     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.DexStore$RecoverableDexException r1 = new com.facebook.common.dextricks.DexStore$RecoverableDexException     // Catch:{ all -> 0x0220 }
            r1.<init>(r9)     // Catch:{ all -> 0x0220 }
            goto L_0x01ea
        L_0x016d:
            r4.setUsingAppImageForMainDexStore(r10, r6)     // Catch:{ all -> 0x0220 }
            java.io.IOException[] r12 = r5.mSuppressedExceptions     // Catch:{ all -> 0x0220 }
            if (r12 == 0) goto L_0x01b2
            java.lang.String r0 = "ClassLoader suppressed exceptions"
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0220 }
            r6.<init>(r0)     // Catch:{ all -> 0x0220 }
            java.lang.Class<java.lang.Throwable> r10 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.Class[] r0 = new java.lang.Class[]{r10}     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            java.lang.reflect.Method r11 = r10.getMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            r10 = 0
            r15 = 0
        L_0x0189:
            int r0 = r12.length     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            if (r10 >= r0) goto L_0x01b0
            r14 = r12[r10]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            java.lang.String r13 = r14.getMessage()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            java.lang.String r0 = "No original dex files found for dex location"
            int r0 = r13.indexOf(r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            r1 = -1
            if (r0 == r1) goto L_0x01a3
            java.lang.String r0 = "/split_"
            int r0 = r13.indexOf(r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            if (r0 != r1) goto L_0x01ab
        L_0x01a3:
            java.lang.Object[] r0 = new java.lang.Object[]{r14}     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            r11.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ae }
            r15 = 1
        L_0x01ab:
            int r10 = r10 + 1
            goto L_0x0189
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b4
        L_0x01b0:
            if (r15 != 0) goto L_0x01bd
        L_0x01b2:
            r6 = 0
            goto L_0x01bd
        L_0x01b4:
            java.lang.String r1 = "Unable to add suppressed exceptions: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.Mlog.e(r1, r0)     // Catch:{ all -> 0x0220 }
        L_0x01bd:
            boolean r0 = canLoadCanaryClass(r9)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x01eb
            if (r6 != 0) goto L_0x01cc
            java.lang.String r0 = "Failed to load canary class after classloader init"
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0220 }
            r6.<init>(r0)     // Catch:{ all -> 0x0220 }
        L_0x01cc:
            if (r8 == 0) goto L_0x01cf
            goto L_0x01d2
        L_0x01cf:
            java.lang.String r1 = "OdexSchemeOreo reunpack"
            goto L_0x01d4
        L_0x01d2:
            java.lang.String r1 = "OdexSchemeOreo reunpack after unpack"
        L_0x01d4:
            java.lang.String r0 = "Failed to load canary class, reunpacking"
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r1, r0, r6)     // Catch:{ all -> 0x0220 }
            r5.requestDexUnpack()     // Catch:{ all -> 0x0220 }
            r0 = 0
            r4.mLoadedManifest = r0     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.DexStore$RecoverableDexException r1 = new com.facebook.common.dextricks.DexStore$RecoverableDexException     // Catch:{ all -> 0x0220 }
            r1.<init>(r6)     // Catch:{ all -> 0x0220 }
            goto L_0x01ea
        L_0x01e5:
            com.facebook.common.dextricks.FatalDexError r1 = new com.facebook.common.dextricks.FatalDexError     // Catch:{ all -> 0x0220 }
            r1.<init>((java.lang.Throwable) r9)     // Catch:{ all -> 0x0220 }
        L_0x01ea:
            throw r1     // Catch:{ all -> 0x0220 }
        L_0x01eb:
            if (r6 == 0) goto L_0x01f4
            java.lang.String r1 = "OdexSchemeOreo suppressed"
            java.lang.String r0 = "OdexSchemeOreo found suppressed exceptions when initializing classloader"
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r1, r0, r6)     // Catch:{ all -> 0x0220 }
        L_0x01f4:
            r4.mLoadedManifest = r9     // Catch:{ all -> 0x0220 }
            boolean r0 = r4.mUseBgDexOpt     // Catch:{ all -> 0x0220 }
            r5.registerCodeAndProfile(r0, r8)     // Catch:{ all -> 0x0220 }
            r4.setCompressedOreoDexErrorRecoveryInfo(r7, r5, r8)     // Catch:{ all -> 0x0220 }
            r4.mLastDeri = r7     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = "%s loadResult=%d odexSize=%d"
            java.lang.String r5 = r5.getSchemeName()     // Catch:{ all -> 0x0220 }
            int r0 = r7.loadResult     // Catch:{ all -> 0x0220 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0220 }
            long r0 = r7.odexSize     // Catch:{ all -> 0x0220 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0220 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4, r0}     // Catch:{ all -> 0x0220 }
            com.facebook.common.dextricks.Mlog.safeFmt(r6, r0)     // Catch:{ all -> 0x0220 }
            r0 = 167347100(0x9f9839c, float:6.0068334E-33)
            X.C13850oP.A00(r2, r0)
            return r24
        L_0x0220:
            r1 = move-exception
            r0 = -96810712(0xfffffffffa3ac928, float:-2.4246179E35)
            X.C13850oP.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo, com.facebook.common.dextricks.DexManifest, int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x03a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0186 */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d9 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02ed A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03b6 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03be A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03e3 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x041a A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x042f A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f5 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010f A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0173 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0202 A[Catch:{ all -> 0x0182, all -> 0x0186, Exception -> 0x0118, all -> 0x044a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllImpl(int r56, com.facebook.quicklog.LightweightQuickPerformanceLogger r57, android.content.Context r58) {
        /*
            r55 = this;
            r8 = r56
            com.facebook.common.dextricks.DexErrorRecoveryInfo r6 = new com.facebook.common.dextricks.DexErrorRecoveryInfo
            r6.<init>()
            r9 = r55
            boolean r0 = r9.isLoaded()
            r15 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0024
            com.facebook.common.dextricks.DexErrorRecoveryInfo r0 = r9.mLastDeri
            if (r0 != 0) goto L_0x0023
            java.io.File r0 = r9.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s has already been loaded, but did not save recovery info"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            r9.mLastDeri = r6
            return r6
        L_0x0023:
            return r0
        L_0x0024:
            com.facebook.common.dextricks.DexManifest r10 = r9.loadManifest()
            com.facebook.common.dextricks.DexStore[] r4 = r9.getParents()
            int r3 = r4.length
            r2 = 0
        L_0x002e:
            r19 = 2
            r48 = r57
            r7 = r58
            if (r2 >= r3) goto L_0x0058
            r1 = r4[r2]
            boolean r0 = r1.isLoaded()
            if (r0 != 0) goto L_0x0055
            r0 = r48
            com.facebook.common.dextricks.DexErrorRecoveryInfo r0 = r1.loadAll(r8, r0, r7)
            java.lang.String r1 = r1.id
            int r0 = r0.loadResult
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "parent dex store %s loaded with result: %x"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
        L_0x0055:
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0058:
            com.facebook.common.dextricks.ReentrantLockFile r0 = r9.mLockFile
            com.facebook.common.dextricks.ReentrantLockFile$Lock r52 = r0.acquire(r5)
            r0 = r56 & 32
            r18 = 0
            if (r0 == 0) goto L_0x0067
            r18 = 1
            goto L_0x0084
        L_0x0067:
            boolean r0 = r9.shouldLoadCompressedOreoImpl(r7, r10)     // Catch:{ all -> 0x044a }
            if (r0 == 0) goto L_0x0084
            java.lang.String r1 = "Loading %s with compressed oreo startup logic"
            java.io.File r0 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x044a }
            r0 = r9
            r1 = r6
            r2 = r10
            r3 = r8
            r4 = r48
            r5 = r7
            r0.loadAllCompressedOreoImpl(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x044a }
            goto L_0x0444
        L_0x0084:
            long r0 = r9.readStatusLocked()     // Catch:{ all -> 0x044a }
            r16 = 15
            long r2 = r0 & r16
            int r4 = (int) r2     // Catch:{ all -> 0x044a }
            byte r11 = (byte) r4     // Catch:{ all -> 0x044a }
            r2 = 10
            if (r11 < r2) goto L_0x00a2
            java.lang.String r4 = "found invalid state %s: nuking dex store %s"
            java.lang.Byte r3 = java.lang.Byte.valueOf(r11)     // Catch:{ all -> 0x044a }
            java.io.File r2 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r4, r2)     // Catch:{ all -> 0x044a }
            goto L_0x00bf
        L_0x00a2:
            r2 = 4
            if (r11 != r15) goto L_0x00bf
            java.lang.String r12 = "found abandoned transaction (prev stateno %s status %x) on dex store %s: nuking store"
            long r13 = r0 >> r2
            long r2 = r13 & r16
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x044a }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x044a }
            java.io.File r2 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r3, r2}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r12, r2)     // Catch:{ all -> 0x044a }
            r4 = 16
            goto L_0x00d9
        L_0x00bf:
            r4 = 0
            r2 = 5
            if (r11 != r2) goto L_0x00cd
            java.lang.String r3 = "crashed last time while loading generated files; trying fallback"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r3, r2)     // Catch:{ all -> 0x044a }
            r4 = 64
            goto L_0x00d9
        L_0x00cd:
            r2 = 6
            if (r11 != r2) goto L_0x00d9
            java.lang.String r3 = "force dex regeneration requested"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r3, r2)     // Catch:{ all -> 0x044a }
            r4 = 32
        L_0x00d9:
            com.facebook.common.dextricks.OdexScheme r3 = r9.schemeForState(r7, r10, r0)     // Catch:{ all -> 0x044a }
            java.lang.String[] r17 = r9.listAndPruneRootFiles(r7)     // Catch:{ all -> 0x044a }
            r2 = r17
            int r2 = r9.checkDirty(r3, r2)     // Catch:{ all -> 0x044a }
            if (r2 != 0) goto L_0x00f5
            java.lang.String r12 = "LA_LOAD_EXISTING"
        L_0x00eb:
            java.lang.String r13 = "current scheme: %s next step: %s"
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r12}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r13, r12)     // Catch:{ all -> 0x044a }
            goto L_0x00fd
        L_0x00f5:
            if (r2 != r15) goto L_0x00fa
            java.lang.String r12 = "LA_REGEN_MISSING"
            goto L_0x00eb
        L_0x00fa:
            java.lang.String r12 = "LA_REGEN_ALL"
            goto L_0x00eb
        L_0x00fd:
            if (r2 != r15) goto L_0x010f
            int r12 = r3.flags     // Catch:{ all -> 0x044a }
            r12 = r12 & 1
            if (r12 == 0) goto L_0x0131
            java.lang.String r12 = "scheme %s is non-incremental: regenerating everything"
            java.lang.Object[] r2 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r12, r2)     // Catch:{ all -> 0x044a }
            goto L_0x0124
        L_0x010f:
            if (r2 != 0) goto L_0x0131
            r12 = 3
            if (r11 != r12) goto L_0x0126
            installCrossDexHooks()     // Catch:{ Exception -> 0x0118 }
            goto L_0x0126
        L_0x0118:
            r13 = move-exception
            java.lang.String r12 = "dex store %s needs xdex hooks, but we can't do it: regenerating"
            java.io.File r2 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r13, r12, r2)     // Catch:{ all -> 0x044a }
        L_0x0124:
            r2 = 2
            goto L_0x0131
        L_0x0126:
            r47 = 0
            boolean r12 = r9.checkAnyOptimizerRunningCurrently()     // Catch:{ all -> 0x044a }
            if (r12 == 0) goto L_0x01aa
            r6.dexoptDuringColdStart = r15     // Catch:{ all -> 0x044a }
            goto L_0x01aa
        L_0x0131:
            r16 = 58
            com.facebook.common.dextricks.DexManifest$Dex[] r12 = r10.dexes     // Catch:{ all -> 0x044a }
            int r13 = r12.length     // Catch:{ all -> 0x044a }
            r12 = r16
            if (r13 <= r12) goto L_0x014d
            java.lang.String r14 = "too many dexes, forcing turbo mode: have %s but maximum per dex store is %s"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x044a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x044a }
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r12}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r14, r13)     // Catch:{ all -> 0x044a }
            r8 = r56 | 1
        L_0x014d:
            r9.writeTxFailedStatusLocked(r0)     // Catch:{ all -> 0x044a }
            java.io.File r13 = r9.getRegenFile()     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Fs.deleteRecursive(r13)     // Catch:{ all -> 0x044a }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ all -> 0x044a }
            r12.<init>(r13)     // Catch:{ all -> 0x044a }
            r12.close()     // Catch:{ all -> 0x044a }
            java.io.File r12 = r9.root     // Catch:{ all -> 0x044a }
            r13 = r12
            java.lang.String r12 = "odex_lock"
            java.io.File r16 = new java.io.File     // Catch:{ all -> 0x044a }
            r14 = r13
            r13 = r12
            r12 = r16
            r12.<init>(r14, r13)     // Catch:{ all -> 0x044a }
            boolean r12 = r16.exists()     // Catch:{ all -> 0x044a }
            if (r12 == 0) goto L_0x0187
            com.facebook.common.dextricks.ReentrantLockFile r12 = com.facebook.common.dextricks.ReentrantLockFile.open(r16)     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.ReentrantLockFile$Lock r13 = r12.acquire(r5)     // Catch:{ all -> 0x0182 }
            r13.close()     // Catch:{ all -> 0x0182 }
            r12.close()     // Catch:{ all -> 0x044a }
            goto L_0x0187
        L_0x0182:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0186 }
        L_0x0186:
            throw r0     // Catch:{ all -> 0x044a }
        L_0x0187:
            r47 = 1
            if (r2 != r15) goto L_0x01aa
            r20 = r9
            r21 = r10
            r22 = r3
            r23 = r15
            r24 = r48
            r25 = r7
            r20.runCompiler(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x019b }
            goto L_0x01a9
        L_0x019b:
            r13 = move-exception
            java.lang.String r12 = "incremental regeneration error in dex store %s: regenerating"
            java.io.File r2 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r13, r12, r2)     // Catch:{ all -> 0x044a }
            r2 = 2
            goto L_0x01aa
        L_0x01a9:
            r2 = 0
        L_0x01aa:
            java.io.File r12 = r9.root     // Catch:{ FileNotFoundException -> 0x01b8 }
            com.facebook.common.dextricks.DexStore$Config r16 = com.facebook.common.dextricks.DexStore.Config.readFromRoot(r12)     // Catch:{ FileNotFoundException -> 0x01b8 }
            java.lang.String r13 = "loaded normal root config file"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x01b8 }
            com.facebook.common.dextricks.Mlog.safeFmt(r13, r12)     // Catch:{ FileNotFoundException -> 0x01b8 }
            goto L_0x01fe
        L_0x01b8:
            java.lang.String r13 = "no config file for repository %s found: using all-default configuration"
            java.io.File r12 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r13, r12)     // Catch:{ all -> 0x044a }
            boolean r33 = com.facebook.common.dextricks.DexStore.Config.enableOatmealByDefault()     // Catch:{ all -> 0x044a }
            r27 = -1
            r42 = 0
            com.facebook.common.dextricks.DexStore$Config r16 = new com.facebook.common.dextricks.DexStore$Config     // Catch:{ all -> 0x044a }
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            r26 = r5
            r28 = r27
            r29 = r27
            r30 = r27
            r31 = r27
            r32 = r5
            r34 = r5
            r35 = r5
            r36 = r5
            r37 = r5
            r38 = r5
            r39 = r5
            r40 = r5
            r41 = r5
            r44 = r5
            r45 = r5
            r46 = r5
            r20 = r16
            r21 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46)     // Catch:{ all -> 0x044a }
        L_0x01fe:
            r12 = 8
            if (r2 == 0) goto L_0x02d4
            r9.saveDeps()     // Catch:{ all -> 0x044a }
            r0 = r18
            byte r3 = r9.determineDesiredState(r11, r10, r0)     // Catch:{ all -> 0x044a }
            r0 = r8 & 1
            r1 = 3
            if (r0 == 0) goto L_0x0225
            if (r3 == r1) goto L_0x021d
            if (r3 != r12) goto L_0x0225
            java.lang.String r3 = "using ART turbo instead of ART xdex: DS_DO_NOT_OPTIMIZE"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r0)     // Catch:{ all -> 0x044a }
            r3 = 7
            goto L_0x0225
        L_0x021d:
            java.lang.String r3 = "using Dalvik turbo instead of xdex: DS_DO_NOT_OPTIMIZE"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r0)     // Catch:{ all -> 0x044a }
            r3 = 4
        L_0x0225:
            r0 = r16
            byte r12 = r0.sync     // Catch:{ all -> 0x044a }
            if (r12 == 0) goto L_0x0255
            if (r12 == r15) goto L_0x023e
            r0 = r19
            if (r12 == r0) goto L_0x0232
            goto L_0x0248
        L_0x0232:
            java.lang.String r11 = "forcing synchronous optimization from config file"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r11, r0)     // Catch:{ all -> 0x044a }
            r0 = r8 & -5
            r8 = r0 | 8
            goto L_0x0255
        L_0x023e:
            java.lang.String r11 = "forcing async optimization mode from config file: dangerous!"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r11, r0)     // Catch:{ all -> 0x044a }
            r8 = r8 | 4
            goto L_0x0255
        L_0x0248:
            java.lang.String r11 = "config file has unknown sync control mode %s: ignoring"
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)     // Catch:{ all -> 0x044a }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r11, r0)     // Catch:{ all -> 0x044a }
        L_0x0255:
            r0 = r16
            byte r3 = r9.adjustDesiredStateForConfig(r3, r0)     // Catch:{ all -> 0x044a }
            if (r3 != r1) goto L_0x026c
            installCrossDexHooks()     // Catch:{ Exception -> 0x0261 }
            goto L_0x026c
        L_0x0261:
            r3 = move-exception
            java.lang.String r1 = "disabling cross-dex optimization: cannot install hooks"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r3, r1, r0)     // Catch:{ all -> 0x044a }
            r6.xdexFailureCause = r3     // Catch:{ all -> 0x044a }
            r3 = 4
        L_0x026c:
            java.lang.String r1 = "desiredStateNo:%s"
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)     // Catch:{ all -> 0x044a }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x044a }
        L_0x0279:
            r11 = 0
            r0 = r19
            if (r2 < r0) goto L_0x027f
            r11 = 1
        L_0x027f:
            java.lang.String r1 = "incremental regen already handled"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.assertThat(r11, r1, r0)     // Catch:{ all -> 0x044a }
            long r0 = (long) r3     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.OdexScheme r14 = r9.schemeForState(r7, r10, r0)     // Catch:{ all -> 0x044a }
            r0 = r17
            r9.deleteFiles(r0)     // Catch:{ Exception -> 0x02ba }
            java.io.File r11 = r9.root     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "optimization_log"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x02ba }
            r0.<init>(r11, r1)     // Catch:{ Exception -> 0x02ba }
            r0.delete()     // Catch:{ Exception -> 0x02ba }
            int r0 = r14.flags     // Catch:{ Exception -> 0x02ba }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x02aa
            java.lang.String r1 = "not running dex compiler: scheme says there is nothing to do"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02ba }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02d2
        L_0x02aa:
            r20 = r9
            r21 = r10
            r22 = r14
            r23 = r5
            r24 = r48
            r25 = r7
            r20.runCompiler(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02d2
        L_0x02ba:
            r11 = move-exception
            r0 = r19
            if (r3 == r0) goto L_0x0323
            java.lang.String r1 = "dex store %s: failed turbodex: using fallback"
            java.io.File r0 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r11, r1, r0)     // Catch:{ all -> 0x044a }
            r6.fallbackCause = r11     // Catch:{ all -> 0x044a }
            java.lang.String[] r17 = r9.listAndPruneRootFiles(r7)     // Catch:{ all -> 0x044a }
            r3 = 2
            goto L_0x0279
        L_0x02d2:
            long r0 = (long) r3     // Catch:{ all -> 0x044a }
            r3 = r14
        L_0x02d4:
            r2 = r8 & 4
            r12 = 0
            if (r2 == 0) goto L_0x02eb
            r12 = 1
            if (r18 != 0) goto L_0x02eb
            r45 = r9
            r46 = r6
            r48 = r3
            r49 = r10
            r50 = r7
            r51 = r8
            r45.loadDexFiles(r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x044a }
        L_0x02eb:
            if (r47 == 0) goto L_0x0379
            if (r12 == 0) goto L_0x0324
            java.lang.String r11 = "about to start syncer thread"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r11, r2)     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.DexStore$FinishRegenerationThread r11 = new com.facebook.common.dextricks.DexStore$FinishRegenerationThread     // Catch:{ all -> 0x044a }
            r49 = r11
            r50 = r9
            r51 = r3
            r53 = r0
            r49.<init>(r51, r52, r53)     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.ReentrantLockFile r2 = r9.mLockFile     // Catch:{ all -> 0x044a }
            r2.donateLock(r11)     // Catch:{ all -> 0x044a }
            r11.start()     // Catch:{ all -> 0x0316 }
            java.lang.String r11 = "started syncer thread"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0451 }
            com.facebook.common.dextricks.Mlog.safeFmt(r11, r2)     // Catch:{ all -> 0x0451 }
            r2 = 0
            r52 = 0
            goto L_0x037a
        L_0x0316:
            r11 = move-exception
            java.lang.String r1 = "failed to start syncer thread"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.ReentrantLockFile r0 = r9.mLockFile     // Catch:{ all -> 0x044a }
            r0.stealLock()     // Catch:{ all -> 0x044a }
        L_0x0323:
            throw r11     // Catch:{ all -> 0x044a }
        L_0x0324:
            java.lang.String r11 = "fsyncing just-regenerated dex store %s in foreground as requested"
            java.io.File r2 = r9.root     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r11, r2)     // Catch:{ all -> 0x044a }
            java.io.File r11 = r9.root     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Prio r2 = com.facebook.common.dextricks.Prio.unchanged()     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Fs.fsyncRecursive(r11, r2)     // Catch:{ all -> 0x044a }
            r9.writeStatusLocked(r0)     // Catch:{ all -> 0x044a }
            java.lang.String r11 = "dex store sync completed"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r11, r2)     // Catch:{ all -> 0x044a }
            int r2 = r3.flags     // Catch:{ all -> 0x044a }
            r2 = r2 & 4
            if (r2 != 0) goto L_0x0368
            java.lang.String r3 = "optimizing in foreground"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r2)     // Catch:{ all -> 0x044a }
        L_0x034f:
            r9.optimizeInForegroundLocked(r7, r10, r0)     // Catch:{ all -> 0x044a }
            long r0 = r9.readStatusLocked()     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.OdexScheme r3 = r9.schemeForState(r7, r10, r0)     // Catch:{ all -> 0x044a }
            java.lang.String r11 = "done optimizing in foreground: new status %x scheme %s"
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch:{ all -> 0x044a }
        L_0x0364:
            com.facebook.common.dextricks.Mlog.safeFmt(r11, r2)     // Catch:{ all -> 0x044a }
            goto L_0x0379
        L_0x0368:
            r2 = r8 & 8
            if (r2 == 0) goto L_0x0374
            java.lang.String r3 = "optimizing in foreground despite expense: forced"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r2)     // Catch:{ all -> 0x044a }
            goto L_0x034f
        L_0x0374:
            java.lang.String r11 = "not optimizing in foreground: would be too expensive"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            goto L_0x0364
        L_0x0379:
            r2 = 0
        L_0x037a:
            r9.setUsingAppImageForMainDexStore(r7, r2)     // Catch:{ all -> 0x044a }
            if (r12 != 0) goto L_0x0390
            if (r18 != 0) goto L_0x0390
            r45 = r9
            r46 = r6
            r48 = r3
            r49 = r10
            r50 = r7
            r51 = r8
            r45.loadDexFiles(r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x044a }
        L_0x0390:
            java.lang.String r2 = "dexopt"
            com.facebook.common.dextricks.DexStore$TmpDir r8 = r9.makeTemporaryDirectory(r2)     // Catch:{ all -> 0x03a6 }
            java.io.File r2 = r9.root     // Catch:{ all -> 0x03a1 }
            int r2 = r3.loadInformationalStatus(r2, r0)     // Catch:{ all -> 0x03a1 }
            r4 = r4 | r2
            r8.close()     // Catch:{ all -> 0x03a6 }
            goto L_0x03ae
        L_0x03a1:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x03a5 }
        L_0x03a5:
            throw r2     // Catch:{ all -> 0x03a6 }
        L_0x03a6:
            r10 = move-exception
            java.lang.String r8 = "Failure while checking oat file provenance."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.e(r10, r8, r2)     // Catch:{ all -> 0x044a }
        L_0x03ae:
            java.lang.String r8 = r3.getSchemeName()     // Catch:{ all -> 0x044a }
            r6.odexSchemeName = r8     // Catch:{ all -> 0x044a }
            if (r47 == 0) goto L_0x03b8
            r4 = r4 | 1
        L_0x03b8:
            int r2 = r3.flags     // Catch:{ all -> 0x044a }
            r2 = r2 & 8
            if (r2 == 0) goto L_0x03c0
            r4 = r4 | 8
        L_0x03c0:
            java.io.File r2 = r9.root     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.DexStore$OptimizationHistoryLog r11 = r9.getCurrentOptHistoryLogFromRoot(r7, r2)     // Catch:{ all -> 0x044a }
            java.lang.String r10 = "Asking scheme %s needOptimization"
            java.lang.Class r2 = r3.getClass()     // Catch:{ all -> 0x044a }
            java.lang.String r12 = r2.getSimpleName()     // Catch:{ all -> 0x044a }
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r10, r2)     // Catch:{ all -> 0x044a }
            r2 = r16
            com.facebook.common.dextricks.OdexScheme$NeedOptimizationState r11 = r3.needOptimization(r0, r2, r11)     // Catch:{ all -> 0x044a }
            boolean r2 = r11.needsOptimization()     // Catch:{ all -> 0x044a }
            if (r2 == 0) goto L_0x041a
            r4 = r4 | 2
            com.facebook.common.dextricks.OdexScheme$NeedOptimizationState r2 = com.facebook.common.dextricks.OdexScheme.NeedOptimizationState.NEED_REOPTIMIZATION     // Catch:{ all -> 0x044a }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x044a }
            if (r2 == 0) goto L_0x03f9
            java.lang.String r10 = "Scheme %s currently needs reoptimization"
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r10, r2)     // Catch:{ all -> 0x044a }
            r2 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 | r2
        L_0x03f9:
            boolean r0 = r3.loadNotOptimized(r0)     // Catch:{ all -> 0x044a }
            if (r0 == 0) goto L_0x0401
            r4 = r4 | 8
        L_0x0401:
            java.lang.String r1 = "optimization needed state: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x044a }
            int r0 = r3.flags     // Catch:{ all -> 0x044a }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0421
            java.lang.String r1 = "... but optimization is very expensive"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x044a }
            r4 = r4 | 4
            goto L_0x0421
        L_0x041a:
            java.lang.String r1 = "optimization needed: no"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x044a }
        L_0x0421:
            r6.loadResult = r4     // Catch:{ all -> 0x044a }
            java.lang.String r0 = "dex2oat-cmdline"
            java.lang.String r0 = com.facebook.common.dextricks.OreoFileUtils.getBaseOdexKeyValue(r7, r0)     // Catch:{ all -> 0x044a }
            r6.dex2oatCmdLine = r0     // Catch:{ all -> 0x044a }
            r9.mLastDeri = r6     // Catch:{ all -> 0x044a }
            if (r18 == 0) goto L_0x0444
            java.lang.String r3 = "Unpack only: %s loadResult=%d odexSize=%d"
            int r0 = r6.loadResult     // Catch:{ all -> 0x044a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x044a }
            long r0 = r6.odexSize     // Catch:{ all -> 0x044a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x044a }
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r2, r0}     // Catch:{ all -> 0x044a }
            com.facebook.common.dextricks.Mlog.safeFmt(r3, r0)     // Catch:{ all -> 0x044a }
        L_0x0444:
            if (r52 == 0) goto L_0x0449
            r52.close()
        L_0x0449:
            return r6
        L_0x044a:
            r0 = move-exception
            if (r52 == 0) goto L_0x0452
            r52.close()
            throw r0
        L_0x0451:
            r0 = move-exception
        L_0x0452:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllImpl(int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo r7, boolean r8, com.facebook.common.dextricks.OdexScheme r9, com.facebook.common.dextricks.DexManifest r10, android.content.Context r11, int r12) {
        /*
            r6 = this;
            boolean r0 = r10.locators
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0007
            r3 = 2
        L_0x0007:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x000d
            r3 = r3 | 4
        L_0x000d:
            r6.installArtHacks(r11, r7)
            java.lang.String r0 = "fb4a_enable_io_logging_across_add_dexes"
            boolean r0 = checkAndClearGk(r11, r0)
            logDexAddPageFaults = r0
            if (r0 == 0) goto L_0x0026
            X.0Cz r4 = X.AnonymousClass0D0.A00()
            long r0 = r4.A03
            majPageFaultsDelta = r0
            long r0 = r4.A02
            pageInBytesDelta = r0
        L_0x0026:
            int r1 = com.facebook.common.dextricks.DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT
            boolean r0 = r6.mDisableVerifier
            com.facebook.common.dextricks.MultiDexClassLoader$Configuration r5 = new com.facebook.common.dextricks.MultiDexClassLoader$Configuration
            r5.<init>(r3, r1, r0)
            java.util.ArrayList r0 = r5.mDexFiles
            int r1 = r0.size()
            java.io.File r0 = r6.root
            r9.configureClassLoader(r0, r5)
            java.util.ArrayList r3 = r5.mDexFiles
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r6.mLoadedDexFiles = r0
            com.facebook.common.dextricks.MultiDexClassLoader$Configuration r0 = sMergedDexConfig
            if (r0 != 0) goto L_0x0052
            int r4 = com.facebook.common.dextricks.DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT
            boolean r3 = r6.mDisableVerifier
            com.facebook.common.dextricks.MultiDexClassLoader$Configuration r0 = new com.facebook.common.dextricks.MultiDexClassLoader$Configuration
            r0.<init>(r2, r4, r3)
            sMergedDexConfig = r0
        L_0x0052:
            mergeConfiguration(r5)
            java.util.ArrayList r3 = r6.primaryDexes     // Catch:{ all -> 0x0086 }
            java.util.ArrayList r0 = r6.auxiliaryDexes     // Catch:{ all -> 0x0086 }
            java.lang.ClassLoader r3 = com.facebook.common.dextricks.MultiDexClassLoader.install(r11, r3, r0)     // Catch:{ all -> 0x0086 }
            boolean r0 = r3 instanceof com.facebook.common.dextricks.MultiDexClassLoader     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0068
            com.facebook.common.dextricks.MultiDexClassLoader r3 = (com.facebook.common.dextricks.MultiDexClassLoader) r3     // Catch:{ all -> 0x0086 }
            com.facebook.common.dextricks.MultiDexClassLoader$Configuration r0 = sMergedDexConfig     // Catch:{ all -> 0x0086 }
            r3.configure(r0)     // Catch:{ all -> 0x0086 }
        L_0x0068:
            if (r8 == 0) goto L_0x006d
            r6.verifyCanaryClasses(r10)     // Catch:{ all -> 0x0086 }
        L_0x006d:
            r6.mLoadedManifest = r10     // Catch:{ all -> 0x0086 }
            boolean r0 = logDexAddPageFaults
            if (r0 == 0) goto L_0x0085
            X.0Cz r4 = X.AnonymousClass0D0.A00()
            long r2 = r4.A03
            long r0 = majPageFaultsDelta
            long r2 = r2 - r0
            majPageFaultsDelta = r2
            long r2 = r4.A02
            long r0 = pageInBytesDelta
            long r2 = r2 - r0
            pageInBytesDelta = r2
        L_0x0085:
            return
        L_0x0086:
            r4 = move-exception
            r0 = r12 & 2
            if (r0 != 0) goto L_0x00b9
            com.facebook.common.dextricks.MultiDexClassLoader$Configuration r0 = sMergedDexConfig
            java.util.ArrayList r0 = r0.mDexFiles
            int r0 = r0.size()
            r5 = 0
            if (r0 != r1) goto L_0x00b9
            java.lang.String r3 = "recoverable"
        L_0x0098:
            java.io.File r1 = r6.root
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r9, r0}
            java.lang.String r0 = "%s error in store %s scheme %s regen %s"
            com.facebook.common.dextricks.Mlog.e(r4, r0, r1)
            if (r8 == 0) goto L_0x00b6
            r0 = 5
        L_0x00ab:
            r6.writeStatusLocked(r0)
            if (r5 == 0) goto L_0x00bd
            com.facebook.common.dextricks.FatalDexError r0 = new com.facebook.common.dextricks.FatalDexError
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x00b6:
            r0 = 0
            goto L_0x00ab
        L_0x00b9:
            r5 = 1
            java.lang.String r3 = "fatal"
            goto L_0x0098
        L_0x00bd:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "retrying dex store load after reset"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            com.facebook.common.dextricks.DexStore$RecoverableDexException r0 = new com.facebook.common.dextricks.DexStore$RecoverableDexException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo, boolean, com.facebook.common.dextricks.OdexScheme, com.facebook.common.dextricks.DexManifest, android.content.Context, int):void");
    }

    public static void mergeConfiguration(MultiDexClassLoader.Configuration configuration) {
        sMergedDexConfig.configFlags |= configuration.configFlags;
        Iterator it = configuration.mDexFiles.iterator();
        while (it.hasNext()) {
            sMergedDexConfig.addDex((DexFile) it.next());
        }
        configuration.mDexFiles.clear();
    }

    public static long nowTimestamp() {
        return sDexStoreClock.now();
    }

    public static DexStore open(File file, File file2, ResProvider resProvider) {
        return open(file, file2, resProvider, new ArrayList(), new ArrayList());
    }

    private byte[] readSavedDepBlock() {
        String str;
        Object[] objArr;
        File file = new File(this.root, DEPS_FILENAME);
        if (!file.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile.length();
                if (length > 16777216) {
                    str = "saved dep block file is way too big (%s bytes): considering invalid";
                    objArr = new Object[]{Long.valueOf(length)};
                } else {
                    byte[] bArr = new byte[((int) length)];
                    int read = randomAccessFile.read(bArr);
                    if (((long) read) < length) {
                        str = "short read of dep block %s: wanted %s bytes; got %s: considering invalid";
                        objArr = new Object[]{file, Long.valueOf(length), Integer.valueOf(read)};
                    } else {
                        Mlog.safeFmt("read saved dep file %s (%s bytes)", file, Long.valueOf(length));
                        Fs.safeClose((Closeable) randomAccessFile);
                        return bArr;
                    }
                }
                Mlog.safeFmt(str, objArr);
                return null;
            } finally {
                Fs.safeClose((Closeable) randomAccessFile);
            }
        } catch (FileNotFoundException e) {
            Mlog.w(e, "unable to open deps file %s", file);
            return null;
        }
    }

    public static long sanityCheckTimestamp(long j) {
        if (j > sDexStoreClock.now()) {
            return 0;
        }
        return j;
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j) {
        DexManifest.Dex[] dexArr = dexManifest.dexes;
        long j2 = j;
        byte b = (byte) ((int) (15 & j));
        if (b == 2) {
            return new OdexSchemeBoring(dexArr);
        }
        if (b == 3) {
            return new OdexSchemeXdex(dexArr);
        }
        if (b == 4) {
            return new OdexSchemeTurbo(dexArr);
        }
        if (b == 7) {
            return new OdexSchemeArtTurbo(dexArr);
        }
        if (b == 8) {
            return new OdexSchemeArtXdex(context, dexArr, this.mResProvider, j2);
        } else if (b != 9) {
            return new OdexSchemeInvalid(j);
        } else {
            return new OdexSchemeNoop();
        }
    }

    private void setCompressedOreoDexErrorRecoveryInfo(DexErrorRecoveryInfo dexErrorRecoveryInfo, OdexSchemeOreo odexSchemeOreo, int i) {
        File file = odexSchemeOreo.mZipFile;
        int markLoadResult = odexSchemeOreo.markLoadResult(i, this.mUseEagerDexOpt);
        dexErrorRecoveryInfo.loadResult = markLoadResult;
        dexErrorRecoveryInfo.odexSize = OreoFileUtils.getOdex(file).length();
        dexErrorRecoveryInfo.odexLastModified = OreoFileUtils.getOdex(file).lastModified();
        dexErrorRecoveryInfo.odexSchemeName = odexSchemeOreo.getSchemeName();
        boolean z = true;
        if ((markLoadResult & 1) == 0) {
            z = false;
        }
        dexErrorRecoveryInfo.dexoptDuringColdStart = z;
        dexErrorRecoveryInfo.dex2oatCmdLine = OreoFileUtils.getMegazipOdexKeyValue(file, "dex2oat-cmdline");
        dexErrorRecoveryInfo.vdexSize = OreoFileUtils.getVdex(file).length();
        dexErrorRecoveryInfo.vdexLastModified = OreoFileUtils.getVdex(file).lastModified();
    }

    private void setUsingAppImageForMainDexStore(final Context context, final File file) {
        Runnable r1;
        String str = this.id;
        if (str != null && DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
            if (file != null) {
                r1 = new Runnable() {
                    public void run() {
                        DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectAsyncInfoWithSecondary(context, file));
                    }
                };
            } else {
                r1 = new Runnable() {
                    public void run() {
                        DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectBaseAsyncInfo(context));
                    }
                };
            }
            new Thread(r1).start();
        }
    }

    private boolean shouldLoadCompressedOreoImpl(Context context, DexManifest dexManifest) {
        if (sLoadedCompressedOreo) {
            return true;
        }
        context.getApplicationInfo();
        canLoadCanaryClass(dexManifest);
        return false;
    }

    private boolean shouldUnpackForCloudPgo(Context context, OdexSchemeOreo odexSchemeOreo) {
        if (!AnonymousClass0JR.A06 || !DexStoreUtils.MAIN_DEX_STORE_ID.equals(this.id) || OreoFileUtils.alreadyUnpackedForCloudPgo(odexSchemeOreo.mZipFile) || AnonymousClass0SH.A00(context, Experiments.HENOSIS_IN_CLOUD_PGO_QE, 0) != 1) {
            return false;
        }
        return true;
    }

    public void addChild(DexStore dexStore) {
        if (!this.mChildStores.contains(dexStore)) {
            this.mChildStores.add(dexStore);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (attemptedOptimizationSinceRegeneration() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r8.isDefault() == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean atomicReplaceConfig(com.facebook.common.dextricks.DexStore.Config r8) {
        /*
            r7 = this;
            java.lang.String r2 = "Replacing config is default: %s nn: s"
            r4 = 0
            if (r8 == 0) goto L_0x000c
            boolean r1 = r8.isDefault()
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            if (r8 == 0) goto L_0x0015
            r0 = 1
        L_0x0015:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            com.facebook.common.dextricks.Mlog.safeFmt(r2, r0)
            com.facebook.common.dextricks.ReentrantLockFile r0 = r7.mLockFile
            com.facebook.common.dextricks.ReentrantLockFile$Lock r6 = r0.acquire(r4)
            java.io.File r1 = r7.root     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "config"
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0099 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x0099 }
            com.facebook.common.dextricks.DexStore$Config r1 = r7.readConfig()     // Catch:{ all -> 0x0099 }
            boolean r3 = r8.equals(r1)     // Catch:{ all -> 0x0099 }
            boolean r0 = r7.attemptedOptimizationSinceRegeneration()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            boolean r1 = r8.equalsForBootstrapPurposes(r1)     // Catch:{ all -> 0x0099 }
            goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            if (r1 == 0) goto L_0x004f
            if (r3 != 0) goto L_0x004f
            boolean r0 = r7.checkDeps()     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0051
            r1 = 0
        L_0x004f:
            r4 = r1
            goto L_0x0057
        L_0x0051:
            boolean r0 = r7.attemptedOptimizationSinceRegeneration()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x004f
        L_0x0057:
            boolean r0 = r8.isDefault()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0061
            com.facebook.common.dextricks.Fs.deleteRecursive(r5)     // Catch:{ all -> 0x0099 }
            goto L_0x0070
        L_0x0061:
            java.io.File r2 = r7.root     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "config.tmp"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0099 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0099 }
            r8.writeAndSync(r0)     // Catch:{ all -> 0x0099 }
            com.facebook.common.dextricks.Fs.renameOrThrow(r0, r5)     // Catch:{ all -> 0x0099 }
        L_0x0070:
            if (r4 != 0) goto L_0x008c
            java.io.File r0 = r7.root     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ all -> 0x0099 }
            r0 = -1
            com.facebook.common.dextricks.DalvikInternals.fsyncNamed(r1, r0)     // Catch:{ all -> 0x0099 }
            monitor-enter(r7)     // Catch:{ all -> 0x0099 }
            java.io.File r0 = r7.getRegenFile()     // Catch:{ all -> 0x0089 }
            r0.delete()     // Catch:{ all -> 0x0089 }
            r7.touchRegenStamp()     // Catch:{ all -> 0x0089 }
            monitor-exit(r7)     // Catch:{ all -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x008c:
            if (r3 != 0) goto L_0x0091
            r7.saveDeps()     // Catch:{ all -> 0x0099 }
        L_0x0091:
            r0 = r4 ^ 1
            if (r6 == 0) goto L_0x0098
            r6.close()
        L_0x0098:
            return r0
        L_0x0099:
            r0 = move-exception
            if (r6 == 0) goto L_0x009f
            r6.close()     // Catch:{ all -> 0x009f }
        L_0x009f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.atomicReplaceConfig(com.facebook.common.dextricks.DexStore$Config):boolean");
    }

    public boolean attemptedOptimizationSinceRegeneration() {
        return new File(this.root, OPTIMIZATION_LOG_FILENAME).exists();
    }

    public String findDexHashForCanaryClass(String str) {
        DexManifest dexManifest = this.mLoadedManifest;
        if (dexManifest == null) {
            return null;
        }
        for (DexManifest.Dex dex : dexManifest.dexes) {
            if (dex.canaryClass.equals(str)) {
                return dex.hash;
            }
        }
        return null;
    }

    public void forceRegenerateOnNextLoad() {
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            writeStatusLocked(6);
            if (acquire != null) {
                acquire.close();
                return;
            }
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public List getAllOatFiles(File file) {
        ArrayList arrayList = new ArrayList(r4);
        for (DexManifest.Dex dex : this.mLoadedManifest.dexes) {
            File oatFileFromDexHash = getOatFileFromDexHash(file, dex.hash);
            if (oatFileFromDexHash != null && oatFileFromDexHash.exists()) {
                arrayList.add(oatFileFromDexHash);
            }
        }
        return arrayList;
    }

    public OptimizationLog getAndClearCompletedOptimizationLog() {
        File file = new File(this.root, OPTIMIZATION_LOG_FILENAME);
        if (file.exists()) {
            ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
            try {
                OptimizationLog readOrMakeDefault = OptimizationLog.readOrMakeDefault(file);
                if ((readOrMakeDefault.flags & 1) != 0) {
                    file.delete();
                    if (acquire != null) {
                        acquire.close();
                    }
                    return readOrMakeDefault;
                } else if (acquire != null) {
                    acquire.close();
                    return null;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
        throw th;
    }

    public long getApkLastModified() {
        return this.mApk.lastModified();
    }

    public File[] getDependencyOdexFiles() {
        ArrayList arrayList = new ArrayList();
        File file = this.mApk;
        arrayList.add(file);
        arrayList.add(determineOdexCacheName(file));
        for (DexStore dependencyOdexFiles : getParents()) {
            for (File add : dependencyOdexFiles.getDependencyOdexFiles()) {
                arrayList.add(add);
            }
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return fileArr;
    }

    public Map getDiagnostics(Context context) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long reportStatus = reportStatus();
        OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(context, this.root);
        Config readConfig = readConfig();
        OdexScheme schemeForState = schemeForState(context, loadManifest(), reportStatus);
        linkedHashMap.put("loadNotOptimized", Boolean.toString(schemeForState.loadNotOptimized(reportStatus)));
        linkedHashMap.put("needOptimization", schemeForState.needOptimization(reportStatus, readConfig, currentOptHistoryLogFromRoot).name());
        linkedHashMap.put("scheme", getStatusDescription(reportStatus));
        linkedHashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, Long.toHexString(reportStatus));
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            long now = sDexStoreClock.now();
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(this.root);
            if (readOrMakeDefaultFromRoot.isNotDefault) {
                linkedHashMap.put("optlog.flags", Integer.toString(readOrMakeDefaultFromRoot.flags));
                linkedHashMap.put("optlog.nrOptimizationsAttempted", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsAttempted));
                linkedHashMap.put("optlog.nrOptimizationsFailed", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
                linkedHashMap.put("optlog.lastFailureExceptionJson", readOrMakeDefaultFromRoot.lastFailureExceptionJson);
            }
            linkedHashMap.put("config.enablePgoCompile", Boolean.toString(readConfig.tryPeriodicPgoCompilation));
            if (readConfig.tryPeriodicPgoCompilation) {
                linkedHashMap.put("config.minPgoDuration", Long.toString(readConfig.minTimeBetweenPgoCompilationMs));
                if (currentOptHistoryLogFromRoot != null) {
                    boolean z = false;
                    if (currentOptHistoryLogFromRoot.file != null) {
                        z = true;
                    }
                    if (z) {
                        str = printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs + readConfig.minTimeBetweenPgoCompilationMs);
                        linkedHashMap.put("config.timeleft", str);
                    }
                }
                str = "<no info>";
                linkedHashMap.put("config.timeleft", str);
            }
            if (currentOptHistoryLogFromRoot != null) {
                boolean z2 = false;
                if (currentOptHistoryLogFromRoot.file != null) {
                    z2 = true;
                }
                if (z2) {
                    linkedHashMap.put("opthistlog.lastSuccess", Boolean.toString(currentOptHistoryLogFromRoot.lastCompilationSessionWasASuccess()));
                    linkedHashMap.put("opthistlog.lastCompilationTimestamp", printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs));
                }
            }
            if (acquire != null) {
                acquire.close();
            }
            return linkedHashMap;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public long getNextRecommendedOptimizationAttemptTime(OptimizationConfiguration optimizationConfiguration) {
        long lastModified = new File(this.root, OPTIMIZATION_LOG_FILENAME).lastModified();
        if (lastModified > sDexStoreClock.now()) {
            Mlog.w("ignoring optimization log file from the future", new Object[0]);
        } else if (lastModified > 0) {
            return ((long) optimizationConfiguration.timeBetweenOptimizationAttemptsMs) + lastModified;
        }
        return 0;
    }

    public String getOdexCachePath() {
        if (determineOdexCacheName(this.mApk) != null) {
            return determineOdexCacheName(this.mApk).getAbsolutePath();
        }
        return null;
    }

    public File getRegenFile() {
        return new File(this.root, REGEN_STAMP_FILENAME);
    }

    public boolean hasChildren() {
        return this.mChildStores.isEmpty();
    }

    public DexManifest loadManifest() {
        if (this.mManifest == null) {
            synchronized (this) {
                if (this.mManifest == null) {
                    DexManifest loadManifestFrom = DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, true);
                    this.id = loadManifestFrom.id;
                    this.mManifest = loadManifestFrom;
                }
            }
        }
        return this.mManifest;
    }

    public TmpDir makeTemporaryDirectory(String str) {
        File file;
        File file2;
        ReentrantLockFile reentrantLockFile;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        ReentrantLockFile.Lock lock = null;
        try {
            file = File.createTempFile(str, TMPDIR_LOCK_SUFFIX, this.root);
            try {
                file2 = new File(this.root, AnonymousClass00U.A0L(Fs.stripLastExtension(file.getName()), TMPDIR_SUFFIX));
                Fs.mkdirOrThrow(file2);
            } catch (Throwable th) {
                th = th;
                file2 = null;
                reentrantLockFile = null;
                try {
                    Fs.safeClose((Closeable) lock);
                    Fs.safeClose((Closeable) reentrantLockFile);
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(file2);
                    throw th;
                } catch (Throwable unused) {
                }
            }
            try {
                reentrantLockFile = ReentrantLockFile.open(file);
                try {
                    lock = reentrantLockFile.tryAcquire(1);
                    if (lock != null) {
                        TmpDir tmpDir = new TmpDir(lock, file2);
                        Mlog.safeFmt("created tmpdir %s (lock file %s)", tmpDir.directory, reentrantLockFile.lockFileName);
                        if (acquire != null) {
                            acquire.close();
                        }
                        return tmpDir;
                    }
                    throw new RuntimeException("should have been able to acquire tmpdir lock");
                } catch (Throwable th2) {
                    th = th2;
                    Fs.safeClose((Closeable) lock);
                    Fs.safeClose((Closeable) reentrantLockFile);
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(file2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                reentrantLockFile = null;
                Fs.safeClose((Closeable) lock);
                Fs.safeClose((Closeable) reentrantLockFile);
                Fs.deleteRecursiveNoThrow(file);
                Fs.deleteRecursiveNoThrow(file2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            file = null;
            file2 = null;
            reentrantLockFile = null;
            Fs.safeClose((Closeable) lock);
            Fs.safeClose((Closeable) reentrantLockFile);
            Fs.deleteRecursiveNoThrow(file);
            Fs.deleteRecursiveNoThrow(file2);
            throw th;
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void optimize(android.content.Context r7, com.facebook.common.dextricks.OptimizationConfiguration.Provider r8) {
        /*
            r6 = this;
            com.facebook.common.dextricks.DexManifest r2 = r6.mLoadedManifest
            if (r2 != 0) goto L_0x0008
            com.facebook.common.dextricks.DexManifest r2 = r6.loadManifest()
        L_0x0008:
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "[opt] loaded manifets"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            com.facebook.common.dextricks.ReentrantLockFile r0 = r6.mLockFile
            com.facebook.common.dextricks.ReentrantLockFile$Lock r5 = r0.acquireInterruptubly(r4)
            java.io.File r0 = r6.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "[opt] locked dex store %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            long r0 = r6.readStatusLocked()     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            com.facebook.common.dextricks.OdexScheme r3 = r6.schemeForState(r7, r2, r0)     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            java.lang.String r1 = "[opt] found scheme %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            boolean r0 = r6.checkDeps()     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            if (r0 == 0) goto L_0x0063
            com.facebook.common.dextricks.DexStore$OptimizationSession r2 = new com.facebook.common.dextricks.DexStore$OptimizationSession     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            r2.<init>(r7, r8, r4)     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            java.lang.String r1 = "[opt] opened optimization session"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x005e }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x005e }
            r5.close()     // Catch:{ all -> 0x005e }
            r5 = 0
            r3.optimize(r7, r6, r2)     // Catch:{ all -> 0x0059 }
            r2.noteOptimizationSuccess()     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "[opt] finished optimization session"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x005e }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x005e }
            r2.close()     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            return
        L_0x0059:
            r0 = move-exception
            r2.copeWithOptimizationFailure(r0)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
        L_0x0063:
            java.lang.String r1 = "attempt to optimize stale repository"
            com.facebook.common.dextricks.DexStore$OptimizationCanceledException r0 = new com.facebook.common.dextricks.DexStore$OptimizationCanceledException     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
            throw r0     // Catch:{ InterruptedException -> 0x0076, all -> 0x006b }
        L_0x006b:
            r2 = move-exception
            java.lang.String r1 = "[opt] optimization failed!"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0078 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x0078 }
            throw r2     // Catch:{ all -> 0x0078 }
        L_0x0076:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            if (r5 == 0) goto L_0x007e
            r5.close()
        L_0x007e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.optimize(android.content.Context, com.facebook.common.dextricks.OptimizationConfiguration$Provider):void");
    }

    public Config readConfig() {
        File file;
        Config config;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            file = new File(this.root, CONFIG_FILENAME);
            config = Config.read(file);
        } catch (FileNotFoundException unused) {
            config = new Config.Builder().build();
        } catch (UnsupportedOperationException unused2) {
            Mlog.safeFmt("unsupported dex store config file %s: ignoring and deleting", new Object[0]);
            Fs.deleteRecursive(file);
            config = new Config.Builder().build();
        } catch (Exception e) {
            Mlog.w(e, "error reading dex store config file %s: deleting and proceeding", new Object[0]);
            Fs.deleteRecursive(file);
            config = new Config.Builder().build();
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable unused3) {
                }
            }
            throw th;
        }
        if (acquire != null) {
            acquire.close();
        }
        return config;
    }

    public void setResProvider(ResProvider resProvider) {
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public DexStore(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        this.mApk = file2;
        this.root = file;
        Fs.mkdirOrThrow(file);
        this.mLockFile = ReentrantLockFile.open(new File(file, MDEX_LOCK_FILENAME));
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
        this.primaryDexes = arrayList;
        this.auxiliaryDexes = arrayList2;
    }

    private boolean checkDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        byte[] readSavedDepBlock = readSavedDepBlock();
        if (readSavedDepBlock == null || !Arrays.equals(readCurrentDepBlock, readSavedDepBlock)) {
            return false;
        }
        return true;
    }

    public static long genAppUpgradeTimestamp(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Mlog.w(e, "Cannot get our app last update time", new Object[0]);
            return 0;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getApkIdentifier(java.io.File r6, boolean r7) {
        /*
            int r2 = X.AnonymousClass0FX.A01()
            r4 = 0
            r0 = 1
            if (r2 <= r0) goto L_0x0011
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Build id used for apk identification"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            long r4 = (long) r2
            return r4
        L_0x0011:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0052 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r2 = r3.getEntry(r0)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x002d
            java.lang.String r1 = "CRC used for apk identification"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x004d }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x004d }
            long r4 = r2.getCrc()     // Catch:{ all -> 0x004d }
            r3.close()     // Catch:{ IOException -> 0x0052 }
            return r4
        L_0x002d:
            r3.close()     // Catch:{ IOException -> 0x0052 }
            if (r7 == 0) goto L_0x003d
            long r4 = r6.lastModified()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            return r4
        L_0x003d:
            java.lang.String r1 = "No usable identifier for apk "
            java.lang.String r0 = r6.getPath()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x004d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.getApkIdentifier(java.io.File, boolean):long");
    }

    public static DexStoreTestHooks getDexStoreTestHooks() {
        return sDexStoreTestHooks;
    }

    private void installArtHacks(Context context, DexErrorRecoveryInfo dexErrorRecoveryInfo) {
        int i = 256;
        if (!context.getPackageName().equals("com.facebook.katana")) {
            i = 0;
        }
        boolean checkAndClearGk = checkAndClearGk(context, Experiments.DISABLE_DEX_VERIFIER);
        this.mDisableVerifier = checkAndClearGk;
        if (checkAndClearGk) {
            i |= 4;
        }
        if (checkAndClearGk(context, Experiments.DISABLE_DEX_COLLISION_CHECK)) {
            i |= 32;
        }
        if (!sLoadedCompressedOreo) {
            if (checkAndClearGk(context, Experiments.DISABLE_DEX_ISUPTODATE_CHECK)) {
                i |= 64;
            }
            if (AnonymousClass0SH.A00(context, Experiments.DISABLE_MONITOR_VISITLOCKS, 0) == 1) {
                i |= 128;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        int installArtHacks = DalvikInternals.installArtHacks(i, i2);
        if (i2 <= 31) {
            if ((i & 4) != 0 && (installArtHacks & 4) == 0) {
                DexTricksErrorReporter.reportSampledSoftError("dex_tricks::art_disable_verifier::failed_install", DalvikInternals.getLastInstallFailures(), (Throwable) null);
            }
            if ((i & 256) != 0 && (installArtHacks & 256) == 0) {
                DexTricksErrorReporter.reportSampledSoftError("dex_tricks::pc_line_num::failed_install", DalvikInternals.getLastInstallFailures(), (Throwable) null);
            }
        }
        DalvikInternals.setEnabledThreadArtHacks(i);
        dexErrorRecoveryInfo.hacksDesired = i;
        dexErrorRecoveryInfo.hacksInstalled = installArtHacks;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r3.startsWith("ditto") == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] listRootFilesForPruningLocked(android.content.Context r12, java.util.List r13) {
        /*
            r11 = this;
            r11.assertLockHeld()
            java.io.File r0 = r11.root
            java.lang.String[] r5 = r0.list()
            if (r5 == 0) goto L_0x0159
            X.AnonymousClass0JR.A00(r12)
            r4 = 0
            r2 = 0
        L_0x0010:
            int r3 = r5.length
            r10 = 0
            if (r2 >= r3) goto L_0x0095
            r3 = r5[r2]
            java.lang.String r0 = "mdex_lock"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "mdex_status2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "odex_lock"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "deps"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "regen_stamp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "optimization_log"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "optimization_history_log"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "config"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "art_pgo_ref_profile.prof"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = ".prof"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "TmpPgoProfile_"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0093
        L_0x006e:
            r0 = 1
        L_0x006f:
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "ditto"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x007b
        L_0x0079:
            r5[r2] = r10
        L_0x007b:
            java.lang.String r0 = "config.tmp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x008f
            java.io.File r1 = r11.root
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            r13.add(r0)
            r5[r2] = r10
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0093:
            r0 = 0
            goto L_0x006f
        L_0x0095:
            r2 = 0
        L_0x0096:
            if (r2 >= r3) goto L_0x0158
            r7 = r5[r2]
            if (r7 == 0) goto L_0x014a
            java.lang.String r6 = ".tmpdir_lock"
            boolean r0 = r7.endsWith(r6)
            java.lang.String r1 = ".tmpdir"
            if (r0 == 0) goto L_0x0121
            r5[r2] = r10
            java.lang.String r0 = com.facebook.common.dextricks.Fs.stripLastExtension(r7)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            int r0 = r11.findInArray(r5, r0)
            if (r0 < 0) goto L_0x011f
            r6 = r5[r0]
            r5[r0] = r10
        L_0x00ba:
            if (r7 == 0) goto L_0x00f3
            if (r6 == 0) goto L_0x00f3
            java.io.File r0 = r11.root
            java.io.File r9 = new java.io.File
            r9.<init>(r0, r7)
            com.facebook.common.dextricks.ReentrantLockFile r7 = com.facebook.common.dextricks.ReentrantLockFile.open(r9)
            com.facebook.common.dextricks.ReentrantLockFile$Lock r8 = r7.tryAcquire(r4)     // Catch:{ all -> 0x0153 }
            if (r8 != 0) goto L_0x00d9
            java.lang.String r1 = "tmpdir %s in use: not deleting"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0153 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0153 }
            goto L_0x0147
        L_0x00d9:
            java.lang.String r1 = "tmpdir %s (lockfile %s) is abandoned: will delete"
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r6}     // Catch:{ all -> 0x014e }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x014e }
            r13.add(r9)     // Catch:{ all -> 0x014e }
            java.io.File r1 = r11.root     // Catch:{ all -> 0x014e }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x014e }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x014e }
            r13.add(r0)     // Catch:{ all -> 0x014e }
            r8.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0147
        L_0x00f3:
            if (r7 == 0) goto L_0x0109
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "tmpdir lockfile %s is orphaned: will delete"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.io.File r1 = r11.root
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r7)
            r13.add(r0)
            goto L_0x014a
        L_0x0109:
            if (r6 == 0) goto L_0x014a
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "tmpdir %s is orphaned without its lockfile: will delete"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.io.File r1 = r11.root
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r6)
            r13.add(r0)
            goto L_0x014a
        L_0x011f:
            r6 = r10
            goto L_0x00ba
        L_0x0121:
            boolean r0 = r7.endsWith(r1)
            if (r0 == 0) goto L_0x0143
            r5[r2] = r10
            java.lang.String r0 = com.facebook.common.dextricks.Fs.stripLastExtension(r7)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r6)
            int r1 = r11.findInArray(r5, r0)
            if (r1 < 0) goto L_0x013f
            r0 = r5[r1]
            r5[r1] = r10
            r6 = r7
            r7 = r0
            goto L_0x00ba
        L_0x013f:
            r6 = r7
            r7 = r10
            goto L_0x00ba
        L_0x0143:
            r7 = r10
            r6 = r10
            goto L_0x00ba
        L_0x0147:
            r7.close()
        L_0x014a:
            int r2 = r2 + 1
            goto L_0x0096
        L_0x014e:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0157 }
        L_0x0157:
            throw r0
        L_0x0158:
            return r5
        L_0x0159:
            java.lang.String r0 = "unable to list directory "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.io.File r0 = r11.root
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.listRootFilesForPruningLocked(android.content.Context, java.util.List):java.lang.String[]");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void optimizeInForegroundLocked(android.content.Context r9, com.facebook.common.dextricks.DexManifest r10, long r11) {
        /*
            r8 = this;
            r8.assertLockHeld()
            com.facebook.common.dextricks.OdexScheme r7 = r8.schemeForState(r9, r10, r11)
            com.facebook.common.dextricks.OptimizationConfiguration$Builder r0 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
            r0.<init>()
            com.facebook.common.dextricks.OptimizationConfiguration r1 = r0.build()
            com.facebook.common.dextricks.OptimizationConfiguration$Provider r6 = new com.facebook.common.dextricks.OptimizationConfiguration$Provider
            r6.<init>(r1)
            com.facebook.common.dextricks.DexStore$DexStoreClock r0 = sDexStoreClock
            long r4 = r0.now()
            long r1 = r8.getNextRecommendedOptimizationAttemptTime(r1)
            r3 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "... actually, not optimizing in foreground, since we failed optimization too recently"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            return
        L_0x002c:
            r0 = 1
            com.facebook.common.dextricks.DexStore$OptimizationSession r1 = new com.facebook.common.dextricks.DexStore$OptimizationSession     // Catch:{ InterruptedException -> 0x004f, all -> 0x0046 }
            r1.<init>(r9, r6, r0)     // Catch:{ InterruptedException -> 0x004f, all -> 0x0046 }
            r7.optimize(r9, r8, r1)     // Catch:{ all -> 0x003c }
            r1.noteOptimizationSuccess()     // Catch:{ all -> 0x0041 }
            r1.close()     // Catch:{ InterruptedException -> 0x004f, all -> 0x0046 }
            return
        L_0x003c:
            r0 = move-exception
            r1.copeWithOptimizationFailure(r0)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ InterruptedException -> 0x004f, all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "foreground optimization failed; proceeding"
            com.facebook.common.dextricks.Mlog.w(r2, r0, r1)
            return
        L_0x004f:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.optimizeInForegroundLocked(android.content.Context, com.facebook.common.dextricks.DexManifest, long):void");
    }

    public static String printRelativeTime(long j, long j2) {
        return String.format("%d (%d ms ago)", new Object[]{Long.valueOf(j2), Long.valueOf(j - j2)});
    }

    /* access modifiers changed from: private */
    public long readStatusLocked() {
        assertLockHeld();
        File file = new File(this.root, MDEX_STATUS_FILENAME);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16];
                if (fileInputStream.read(bArr, 0, 16) < 16) {
                    Mlog.safeFmt("status file %s too short: treating as zero", file);
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    long j = wrap.getLong();
                    long j2 = wrap.getLong();
                    Long valueOf = Long.valueOf(j);
                    Long valueOf2 = Long.valueOf(j2);
                    Mlog.safeFmt("read status:%x check:%x str:%s", valueOf, valueOf2, getStatusDescription(j));
                    long j3 = MDEX_STATUS_XOR ^ j;
                    if (j3 != j2) {
                        Mlog.e("check mismatch: status:%x expected-check:%x actual-check:%x", valueOf, Long.valueOf(j3), valueOf2);
                    } else {
                        Fs.safeClose((Closeable) fileInputStream);
                        return j;
                    }
                }
                Fs.deleteRecursiveNoThrow(file);
                return 0;
            } finally {
                Fs.safeClose((Closeable) fileInputStream);
            }
        } catch (FileNotFoundException unused) {
            Mlog.safeFmt("status file %s not found: treating as zero", file);
            return 0;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void runCompiler(com.facebook.common.dextricks.DexManifest r7, com.facebook.common.dextricks.OdexScheme r8, int r9, com.facebook.quicklog.LightweightQuickPerformanceLogger r10, android.content.Context r11) {
        /*
            r6 = this;
            com.facebook.common.dextricks.OdexScheme$Compiler r4 = r8.makeCompiler(r6, r9)
            com.facebook.common.dextricks.DexIteratorFactory r1 = r6.mDexIteratorFactory     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r6.id     // Catch:{ all -> 0x0049 }
            com.facebook.common.dextricks.InputDexIterator r5 = r1.openDexIterator(r0, r7, r10, r11)     // Catch:{ all -> 0x0049 }
        L_0x000c:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0038
            com.facebook.common.dextricks.InputDex r3 = r5.next()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "compiling %d/%d %s"
            int r0 = r5.mDexPos     // Catch:{ all -> 0x0033 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0033 }
            com.facebook.common.dextricks.DexManifest$Dex[] r0 = r5.mDexes     // Catch:{ all -> 0x0033 }
            int r0 = r0.length     // Catch:{ all -> 0x0033 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r3}     // Catch:{ all -> 0x0033 }
            com.facebook.common.dextricks.Mlog.safeFmt(r2, r0)     // Catch:{ all -> 0x0033 }
            r4.compile(r3)     // Catch:{ all -> 0x0033 }
            r3.close()     // Catch:{ all -> 0x0042 }
            goto L_0x000c
        L_0x0033:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0038:
            r4.performFinishActions()     // Catch:{ all -> 0x0042 }
            r5.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return
        L_0x0042:
            r0 = move-exception
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            if (r4 == 0) goto L_0x004f
            r4.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.runCompiler(com.facebook.common.dextricks.DexManifest, com.facebook.common.dextricks.OdexScheme, int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):void");
    }

    private void saveDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        File file = new File(this.root, DEPS_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.write(readCurrentDepBlock);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.close();
            Mlog.safeFmt("saved deps file %s", file);
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    private void touchRegenStamp() {
        File regenFile = getRegenFile();
        regenFile.createNewFile();
        if (!regenFile.setLastModified(sDexStoreClock.now())) {
            StringBuilder sb = new StringBuilder("could not set modtime of ");
            sb.append(regenFile);
            throw new IOException(sb.toString());
        }
    }

    public File findOatFileForCanaryClass(File file, String str) {
        return getOatFileFromDexHash(file, findDexHashForCanaryClass(str));
    }

    public List getLoadedDexFiles() {
        return this.mLoadedDexFiles;
    }

    public DexManifest getLoadedManifest() {
        return this.mLoadedManifest;
    }

    public String getMegaZipPath() {
        return this.mMegaZipPath;
    }

    public String[] getParentNames() {
        return loadManifest().requires;
    }

    public ResProvider getResProvider() {
        return this.mResProvider;
    }

    public boolean useBgDexOpt() {
        return this.mUseBgDexOpt;
    }

    public boolean useEagerDexOpt() {
        return this.mUseEagerDexOpt;
    }

    public void writeStatusLocked(long j) {
        assertLockHeld();
        if (((byte) ((int) (15 & j))) != 1) {
            DalvikInternals.fsyncNamed(this.root.getAbsolutePath(), -1);
        }
        File file = new File(this.root, MDEX_STATUS_FILENAME);
        long j2 = MDEX_STATUS_XOR ^ j;
        Mlog.safeFmt("writing status:%x check:%x str:%s", Long.valueOf(j), Long.valueOf(j2), getStatusDescription(j));
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(j);
        wrap.putLong(j2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr, 0, 16);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final class OptimizationCanceledException extends InterruptedException {
        public OptimizationCanceledException(String str) {
            super(str);
        }
    }

    public final class RecoverableDexException extends Exception {
        public RecoverableDexException(Throwable th) {
            super(th);
        }
    }

    private int checkDirty(OdexScheme odexScheme, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        int checkDirty = checkDirty(odexScheme, strArr, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return checkDirty;
    }

    public static synchronized DexStore findOpened(File file) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            dexStoreListHead = dexStoreListHead();
            while (true) {
                if (dexStoreListHead != null) {
                    if (dexStoreListHead.root.equals(absoluteFile)) {
                        break;
                    }
                    dexStoreListHead = dexStoreListHead.next;
                } else {
                    dexStoreListHead = null;
                    break;
                }
            }
        }
        return dexStoreListHead;
    }

    public static synchronized DexStore open(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            dexStoreListHead = dexStoreListHead();
            while (true) {
                if (dexStoreListHead != null) {
                    if (dexStoreListHead.root.equals(absoluteFile)) {
                        break;
                    }
                    dexStoreListHead = dexStoreListHead.next;
                } else {
                    dexStoreListHead = new DexStore(absoluteFile, file2, resProvider, arrayList, arrayList2);
                    sListHead = dexStoreListHead;
                    break;
                }
            }
        }
        return dexStoreListHead;
    }
}

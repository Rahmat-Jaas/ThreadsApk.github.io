package com.facebook.common.dextricks;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexUnpacker;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class ExpectedFileInfo {
    public final boolean coldstart;
    public final DexManifest.Dex dex;
    public final File dexFile;
    public final String dexName;
    public final boolean extended;
    public CompilationType mCompType;
    public boolean mIsOptional;
    public final int ordinal;
    public final boolean primary;
    public final String rawFile;
    public final boolean scroll;

    public static ExpectedFileInfo[] convertTo(String[] strArr) {
        ExpectedFileInfo expectedFileInfo;
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str != null) {
                expectedFileInfo = new ExpectedFileInfo(str);
            } else {
                expectedFileInfo = null;
            }
            expectedFileInfoArr[i] = expectedFileInfo;
        }
        return expectedFileInfoArr;
    }

    public enum CompilationType {
        ALL("all"),
        PGO("pgo"),
        NONE(NetInfoModule.CONNECTION_TYPE_NONE),
        UNKNOWN("unknown");
        
        public final String mFriendlyName;

        /* access modifiers changed from: public */
        CompilationType(String str) {
            this.mFriendlyName = str;
        }

        public String getFriendlyName() {
            return this.mFriendlyName;
        }

        public String toString() {
            return getFriendlyName();
        }
    }

    public ExpectedFileInfo(DexUnpacker.CopiedDexInfo copiedDexInfo) {
        this(copiedDexInfo.dex, (String) null, copiedDexInfo.dexFile, (String) null, CompilationType.UNKNOWN);
    }

    public static CompilationType checkIsValidCompType(CompilationType compilationType) {
        if (compilationType != null) {
            return compilationType;
        }
        Mlog.w("Comp type cannot be null defaulting to unknown", new Object[0]);
        return CompilationType.UNKNOWN;
    }

    public static ExpectedFileInfo makeOdexFromName(String str) {
        return new ExpectedFileInfo(str);
    }

    public static List setCompTypeIfUnknown(List list, CompilationType compilationType) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExpectedFileInfo expectedFileInfo = (ExpectedFileInfo) it.next();
            if (expectedFileInfo.isCompilationTypeUnknown()) {
                expectedFileInfo.setCompilationType(compilationType);
            }
        }
        return list;
    }

    public static List setCompTypeToPgoIfUnknown(List list) {
        return setCompTypeIfUnknown(list, CompilationType.PGO);
    }

    public File getFile(File file) {
        if (this.rawFile != null || isRootDex()) {
            return new File(file, toExpectedFileString());
        }
        if (isNonRootDex()) {
            return this.dexFile;
        }
        throw new RuntimeException("Cannot generate file");
    }

    public File getFileFromAnotherRoot(File file) {
        String expectedFileString;
        if (this.rawFile != null || isRootDex()) {
            expectedFileString = toExpectedFileString();
        } else if (isNonRootDex()) {
            expectedFileString = this.dexFile.getName();
        } else {
            throw new RuntimeException("Cannot generate file");
        }
        return new File(file, expectedFileString);
    }

    public boolean hasDex() {
        if (this.dex != null) {
            return true;
        }
        return false;
    }

    public boolean hasManifestData() {
        if (this.ordinal != -1) {
            return true;
        }
        return false;
    }

    public boolean isCompilationTypeMixedModeAll() {
        return CompilationType.ALL.equals(this.mCompType);
    }

    public boolean isCompilationTypePGO() {
        return CompilationType.PGO.equals(this.mCompType);
    }

    public boolean isCompilationTypeUnknown() {
        return CompilationType.UNKNOWN.equals(this.mCompType);
    }

    public boolean isNonRootDex() {
        if (this.dex == null || this.dexFile == null) {
            return false;
        }
        return true;
    }

    public boolean isRawFile() {
        if (this.rawFile != null) {
            return true;
        }
        return false;
    }

    public boolean isRootDex() {
        if (this.dex == null || this.dexName == null) {
            return false;
        }
        return true;
    }

    public String toExpectedFileString() {
        String str = this.rawFile;
        if (str != null) {
            return str;
        }
        if (isRootDex()) {
            return this.dexName;
        }
        throw new IllegalStateException("Cannot generated an expected string");
    }

    public String toString() {
        String path;
        StringBuilder sb = new StringBuilder("[Expected File Info: ");
        String str = this.rawFile;
        if (str != null) {
            sb.append("Raw File: ");
        } else {
            if (isRootDex()) {
                sb.append("Dex Name: ");
                path = this.dexName;
            } else if (isNonRootDex()) {
                sb.append("Dex File: ");
                path = this.dexFile.getPath();
            } else {
                str = "ERROR!";
            }
            sb.append(path);
            sb.append("Compilation Type: ");
            sb.append(this.mCompType);
            sb.append(" ]");
            return sb.toString();
        }
        sb.append(str);
        sb.append(" ]");
        return sb.toString();
    }

    public static ExpectedFileInfo makeOdexFrom(DexManifest.Dex dex2) {
        return new ExpectedFileInfo(dex2.makeOdexName());
    }

    public CompilationType getCompilationType() {
        return this.mCompType;
    }

    public DexManifest.Dex getDex() {
        return this.dex;
    }

    public boolean isCompilationTypePgoOrMixedMode() {
        if (isCompilationTypePGO() || isCompilationTypeMixedModeAll()) {
            return true;
        }
        return false;
    }

    public boolean isOptional() {
        return this.mIsOptional;
    }

    public void setCompilationType(CompilationType compilationType) {
        this.mCompType = checkIsValidCompType(compilationType);
    }

    public ExpectedFileInfo setIsOptional(boolean z) {
        this.mIsOptional = z;
        return this;
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str, CompilationType compilationType) {
        this(dex2, str, (File) null, (String) null, compilationType);
    }

    public static String[] convertTo(ExpectedFileInfo[] expectedFileInfoArr) {
        String str;
        if (expectedFileInfoArr == null) {
            return null;
        }
        int length = expectedFileInfoArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            ExpectedFileInfo expectedFileInfo = expectedFileInfoArr[i];
            if (expectedFileInfo != null) {
                str = expectedFileInfo.toExpectedFileString();
            } else {
                str = null;
            }
            strArr[i] = str;
        }
        return strArr;
    }

    public File getFile(DexStore dexStore) {
        return getFile(dexStore.root);
    }

    public ExpectedFileInfo setIsOptional() {
        this.mIsOptional = true;
        return this;
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str, File file, String str2, CompilationType compilationType, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.dex = dex2;
        this.dexName = str;
        this.dexFile = file;
        this.rawFile = str2;
        this.mCompType = checkIsValidCompType(compilationType);
        this.ordinal = i;
        this.primary = z;
        this.coldstart = z2;
        this.extended = z3;
        this.scroll = z4;
        this.mIsOptional = z5;
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str, File file, String str2, CompilationType compilationType) {
        this(dex2, str, file, str2, compilationType, -1, false, false, false, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpectedFileInfo(com.facebook.common.dextricks.DexManifest.Dex r2, com.facebook.common.dextricks.ExpectedFileInfo.CompilationType r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            java.lang.String r0 = r2.makeDexName()
        L_0x0006:
            r1.<init>(r2, r0, r3)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ExpectedFileInfo.<init>(com.facebook.common.dextricks.DexManifest$Dex, com.facebook.common.dextricks.ExpectedFileInfo$CompilationType):void");
    }

    public ExpectedFileInfo(String str) {
        this((DexManifest.Dex) null, (String) null, (File) null, str, CompilationType.NONE);
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str) {
        this(dex2, str, CompilationType.UNKNOWN);
    }

    public ExpectedFileInfo(DexManifest.Dex dex2) {
        this(dex2, CompilationType.UNKNOWN);
    }
}

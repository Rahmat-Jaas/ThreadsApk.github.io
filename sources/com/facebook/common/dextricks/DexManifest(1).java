package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C14600po;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class DexManifest {
    public static final String DEX_EXT = ".dex";
    public static final String ODEX_EXT = ".odex";
    public final Dex[] dexes;
    public final String id;
    public final boolean locators;
    public final String[] requires;
    public final boolean rootRelative;
    public final C14600po superpackExtension;
    public final int superpackFiles;

    public final class Dex {
        public final String assetName;
        public final String canaryClass;
        public final String hash;

        public String makeDexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.DEX_EXT);
        }

        public String makeOdexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.ODEX_EXT);
        }

        public String toString() {
            return String.format("<Dex assetName:[%s]>", new Object[]{this.assetName});
        }

        public Dex(String str, String str2, String str3) {
            this.assetName = str;
            this.hash = str2;
            this.canaryClass = str3;
        }
    }

    public static String makeCompileUnitNameFromHashAndExtension(String str, String str2) {
        if (!str2.startsWith(".")) {
            str2 = AnonymousClass00U.A0L(".", str2);
        }
        return AnonymousClass00U.A0V("prog-", str, str2);
    }

    public static String makeDexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, DEX_EXT);
    }

    public static String makeOdexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, ODEX_EXT);
    }

    public DexManifest(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        C14600po r4 = C14600po.NONE;
        C14600po r14 = r4;
        String str = DexStoreUtils.MAIN_DEX_STORE_ID;
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    this.rootRelative = z;
                    this.locators = z2;
                    this.superpackFiles = i;
                    this.superpackExtension = r4;
                    this.id = str;
                    this.requires = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    this.dexes = (Dex[]) arrayList.toArray(new Dex[arrayList.size()]);
                    return;
                } else if (readLine.length() != 0) {
                    Mlog.safeFmt("Secondary program dex metadata: [%s]", readLine);
                    if (readLine.equals(".root_relative")) {
                        z = true;
                    } else if (readLine.equals(".locators")) {
                        z2 = true;
                    } else if (readLine.startsWith(".superpack_files")) {
                        i = Integer.parseInt(readLine.split(" ")[1]);
                    } else if (readLine.startsWith(".superpack_extension")) {
                        String str2 = readLine.split(" ")[1];
                        if (!str2.isEmpty()) {
                            if (str2.equalsIgnoreCase("xz")) {
                                r4 = C14600po.XZ;
                            } else if (str2.equalsIgnoreCase("zst") || str2.equalsIgnoreCase("zstd")) {
                                r4 = C14600po.ZST;
                            } else if (str2.equalsIgnoreCase("spo")) {
                                r4 = C14600po.OB;
                            }
                        }
                        r4 = r14;
                    } else if (readLine.startsWith(".id")) {
                        str = readLine.split(" ")[1];
                    } else if (readLine.startsWith(".requires")) {
                        arrayList2.add(readLine.split(" ")[1]);
                    } else if (readLine.startsWith(".")) {
                        Mlog.w("ignoring dex metadata pragma [%s]", readLine);
                    } else {
                        String[] split = readLine.split(" ");
                        arrayList.add(new Dex(split[0], split[1], split[2]));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    public static DexManifest loadManifestFrom(ResProvider resProvider, String str, boolean z) {
        InputStream open = resProvider.open(str);
        try {
            DexManifest dexManifest = new DexManifest(open);
            if (open != null) {
                open.close();
            }
            if (z && dexManifest.rootRelative) {
                resProvider.markRootRelative();
            }
            return dexManifest;
        } catch (Throwable unused) {
        }
        throw th;
    }
}

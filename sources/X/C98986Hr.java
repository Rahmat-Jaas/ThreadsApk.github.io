package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.6Hr  reason: invalid class name and case insensitive filesystem */
public final class C98986Hr {
    public static int A00(File file, File file2, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        String str5;
        String str6;
        if (!file.exists()) {
            if (file2 != null && !file2.isDirectory()) {
                file2.mkdirs();
            }
            i = 1;
            i2 = 4;
        } else {
            try {
                str = file2.getCanonicalPath();
            } catch (IOException unused) {
                str = file2.getAbsolutePath();
            }
            try {
                str2 = file.getCanonicalPath();
            } catch (IOException unused2) {
                str2 = file.getAbsolutePath();
            }
            if (str.equals(str2)) {
                if (!file2.isDirectory()) {
                    file2.mkdirs();
                }
                i = 1;
                i2 = 8;
            } else {
                try {
                    str3 = file.getCanonicalPath();
                } catch (IOException unused3) {
                    str3 = file.getAbsolutePath();
                }
                try {
                    str4 = file2.getCanonicalPath();
                } catch (IOException unused4) {
                    str4 = file2.getAbsolutePath();
                }
                String str7 = File.separator;
                if (!str4.endsWith(str7)) {
                    str4 = AnonymousClass00U.A0L(str4, str7);
                }
                if (str3.startsWith(str4)) {
                    if (z) {
                        File file3 = new File(file2.getParent(), AnonymousClass00U.A0L(file.getName(), "__tmp"));
                        int A00 = A00(file, file3, true);
                        if ((A00 & 1) == 1) {
                            return A00(file3, file2, true);
                        }
                        AnonymousClass0IV.A00(file3);
                        return A00;
                    }
                } else if (file2.isFile()) {
                    i = 18;
                    i2 = 32;
                } else {
                    i = 0;
                    if (file2.isDirectory()) {
                        if (z) {
                            AnonymousClass0IV.A00(file2);
                            i = 64;
                        }
                    }
                    try {
                        str5 = file2.getCanonicalPath();
                    } catch (IOException unused5) {
                        str5 = file2.getAbsolutePath();
                    }
                    try {
                        str6 = file.getCanonicalPath();
                    } catch (IOException unused6) {
                        str6 = file.getAbsolutePath();
                    }
                    if (!str6.endsWith(str7)) {
                        str6 = AnonymousClass00U.A0L(str6, str7);
                    }
                    if (str5.startsWith(str6)) {
                        File file4 = new File(file.getParent(), AnonymousClass00U.A0L(file.getName(), "__tmp"));
                        i2 = A00(file, file4, true);
                        if ((i2 & 1) == 1) {
                            i2 = A00(file4, file2, true);
                        } else {
                            AnonymousClass0IV.A00(file4);
                        }
                    } else {
                        File parentFile = file2.getParentFile();
                        if (parentFile != null && !parentFile.isDirectory()) {
                            parentFile.mkdirs();
                        }
                        i2 = C86164wN.A04(file.renameTo(file2) ? 1 : 0);
                    }
                }
                i = 2;
                i2 = 16;
            }
        }
        return i | i2;
    }
}

package X;

import java.io.File;

/* renamed from: X.6Ft  reason: invalid class name and case insensitive filesystem */
public final class C98496Ft {
    public static boolean A00(File file) {
        boolean z = true;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            z = false;
            if (listFiles != null) {
                boolean z2 = true;
                for (File A00 : listFiles) {
                    if (A00(A00)) {
                        boolean z3 = z2;
                        z2 = true;
                        if (z3) {
                        }
                    }
                    z2 = false;
                }
                return z2;
            }
        } else {
            file.delete();
        }
        return z;
    }
}

package X;

import java.io.File;

/* renamed from: X.0IV  reason: invalid class name */
public final class AnonymousClass0IV {
    public static boolean A00(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File A00 : listFiles) {
                A00(A00);
            }
        }
        return file.delete();
    }
}

package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Pm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04870Pm implements FileFilter {
    public static final /* synthetic */ C04870Pm A00 = new C04870Pm();

    public final boolean accept(File file) {
        if (file == null || !file.getName().startsWith("_attempt")) {
            return false;
        }
        return true;
    }
}

package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.7y8  reason: invalid class name and case insensitive filesystem */
public final class C134657y8 implements FileFilter {
    public final boolean accept(File file) {
        String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i = 3; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

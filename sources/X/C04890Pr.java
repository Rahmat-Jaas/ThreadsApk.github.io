package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.0Pr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04890Pr implements Comparator {
    public static final /* synthetic */ C04890Pr A00 = new C04890Pr();

    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        String name = file.getName();
        String name2 = file2.getName();
        int lastIndexOf = name.lastIndexOf(95);
        int lastIndexOf2 = name2.lastIndexOf(95);
        if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && lastIndexOf < name.length() - 1 && lastIndexOf2 < name2.length() - 1) {
            int indexOf = name.indexOf(45, lastIndexOf);
            int indexOf2 = name2.indexOf(45, lastIndexOf2);
            if (indexOf >= 0 && indexOf2 >= 0) {
                try {
                    return (int) (Long.parseLong(name.substring(lastIndexOf + 1, indexOf)) - Long.parseLong(name2.substring(lastIndexOf2 + 1, indexOf2)));
                } catch (NumberFormatException unused) {
                    C04790Pd.A00();
                }
            }
        }
        return (int) (file.lastModified() - file2.lastModified());
    }
}

package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.0Pg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04820Pg implements Comparator {
    public static final /* synthetic */ C04820Pg A00 = new C04820Pg();

    public final int compare(Object obj, Object obj2) {
        return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
    }
}

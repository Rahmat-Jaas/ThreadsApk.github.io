package X;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0P0  reason: invalid class name */
public final class AnonymousClass0P0 {
    public static final List A00 = new ArrayList();
    public static final Map A01 = new HashMap();

    public static synchronized C06180Xz A00(File file) {
        synchronized (AnonymousClass0P0.class) {
            Map map = A01;
            if (map.get(file.getName()) != null) {
                C06180Xz r0 = (C06180Xz) map.get(file.getName());
                return r0;
            }
            File file2 = new File(file, "mapped_map.txt");
            C06160Xx AEw = new C06310Yr().AEw(file2, 4096);
            if (AEw != null) {
                C06180Xz r1 = new C06180Xz(new AnonymousClass0O2(AEw));
                map.put(file.getName(), r1);
                return r1;
            }
            throw new IllegalStateException(AnonymousClass00U.A0L("Cannot create mapped file: ", file2.getName()));
        }
    }
}

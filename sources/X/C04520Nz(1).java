package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0Nz  reason: invalid class name and case insensitive filesystem */
public final class C04520Nz {
    public static C06180Xz A00;
    public static final List A01 = new ArrayList();
    public static final ExecutorService A02 = Executors.newSingleThreadExecutor();

    public static synchronized void A00(C04490Nw r4) {
        synchronized (C04520Nz.class) {
            C06180Xz r2 = A00;
            if (r2 == null) {
                A01.add(r4);
            } else {
                A02.execute(new C04500Nx(r4, r2));
            }
        }
    }

    public static synchronized void A01(C06180Xz r6) {
        synchronized (C04520Nz.class) {
            A00 = r6;
            if (r6 != null) {
                List<C04490Nw> list = A01;
                for (C04490Nw r2 : list) {
                    A02.execute(new C04510Ny(r2, r6));
                }
                list.clear();
            }
        }
    }
}

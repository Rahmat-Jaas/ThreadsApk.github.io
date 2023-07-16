package X;

import java.util.Set;

/* renamed from: X.7oB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7oB implements C143988hd {
    public static final AnonymousClass7oB A00 = new AnonymousClass7oB();

    public final Object AFE(C115446v5 r5) {
        Set A04 = r5.A04(AnonymousClass6JJ.class);
        C106666fP r2 = C106666fP.A01;
        if (r2 == null) {
            synchronized (C106666fP.class) {
                r2 = C106666fP.A01;
                if (r2 == null) {
                    r2 = new C106666fP();
                    C106666fP.A01 = r2;
                }
            }
        }
        return new AnonymousClass75a(r2, A04);
    }
}

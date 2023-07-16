package X;

import java.util.List;

/* renamed from: X.7EF  reason: invalid class name */
public final class AnonymousClass7EF {
    public final AnonymousClass601 A00;
    public final C109326jp A01;
    public final List A02;
    public final AnonymousClass0YY A03;

    public AnonymousClass7EF(AnonymousClass601 r2, C109326jp r3) {
        C04220Ms.A0B(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = null;
        this.A02 = null;
    }

    public final Object A00(AnonymousClass601 r3, C63893iY r4) {
        AnonymousClass0YY r0 = this.A03;
        if (r0 != null) {
            return r0.invoke(r4);
        }
        C109326jp r1 = this.A01;
        if (r1 != null) {
            AnonymousClass601 r02 = this.A00;
            if (r02 == null) {
                List list = this.A02;
                if (!(list == null || r3 == null)) {
                    r02 = AnonymousClass601.A01(r3, list);
                }
            }
            return C61043Rr.A00(r02, r4, r1);
        }
        C30967GcS.A02("BloksCallback", "An attempt to invoke an invalid callback");
        return null;
    }

    public AnonymousClass7EF(AnonymousClass0YY r2) {
        this.A01 = null;
        this.A00 = null;
        this.A03 = r2;
        this.A02 = null;
    }

    public AnonymousClass7EF(C109326jp r2, List list) {
        C04220Ms.A0B(list, 2);
        this.A01 = r2;
        this.A00 = null;
        this.A03 = null;
        this.A02 = list;
    }
}

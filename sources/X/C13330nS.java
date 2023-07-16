package X;

/* renamed from: X.0nS  reason: invalid class name and case insensitive filesystem */
public final class C13330nS implements C021209x {
    public final C10690il A00;
    public final C10300i6 A01;
    public final C11630kW A02;
    public final boolean A03;

    public static C13330nS A00(C11630kW r2, C10690il r3, C10300i6 r4) {
        return new C13330nS(r2, r3, r4, false);
    }

    public static C13330nS A01(C11630kW r3, C10300i6 r4) {
        return new C13330nS(r3, C10690il.A03, r4, false);
    }

    public static C13330nS A02(C10300i6 r2) {
        return new C13330nS(C10690il.A03, r2);
    }

    public final AnonymousClass0A2 A03(C10690il r6, String str) {
        boolean z = this.A03;
        if (z) {
            str = AnonymousClass00U.A0L(str, "_experimental");
        }
        C15730rn A002 = C15730rn.A00(this.A02, str);
        C10300i6 r2 = this.A01;
        boolean BTc = C12090lI.A00(r2).BTc(A002);
        A002.A04 = true;
        if (!BTc && !z) {
            return C021309y.A00;
        }
        C11660kZ A003 = C12090lI.A00(r2);
        if (0 >= r6.A02.length) {
            return new C13350nU(A002, A003, r6.A00, r6.A01);
        }
        throw new NullPointerException("modify");
    }

    public C13330nS(C11630kW r1, C10690il r2, C10300i6 r3, boolean z) {
        this.A01 = r3;
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = z;
    }

    public C13330nS(C10690il r2, C10300i6 r3) {
        this.A01 = r3;
        this.A02 = null;
        this.A00 = r2;
        this.A03 = false;
    }
}

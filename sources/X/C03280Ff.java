package X;

/* renamed from: X.0Ff  reason: invalid class name and case insensitive filesystem */
public final class C03280Ff extends C11580kR implements C11730ki, C11680kb {
    public final String AdE(C05800Wc r4) {
        String AQn = r4.AQn(this.A00);
        if (AQn == null) {
            return AnonymousClass00U.A08(0, "");
        }
        return AQn;
    }

    public final long BKH(C05800Wc r3) {
        try {
            String AQn = r3.AQn(this.A00);
            if (AQn == null) {
                return 0;
            }
            return Long.parseLong(AQn);
        } catch (NullPointerException | NumberFormatException unused) {
            return 0;
        }
    }

    public C03280Ff(String str) {
        super(str);
    }
}

package X;

/* renamed from: X.4aD  reason: invalid class name and case insensitive filesystem */
public final class C74304aD extends C02220Ah implements AnonymousClass0ZU {
    public static final C74304aD A00 = new C74304aD();

    public C74304aD() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        double d;
        C04530Oa r2 = C550231j.A00;
        if (AnonymousClass0wJ.A04(r2.getValue()) > 480) {
            d = 4.0d;
        } else if (AnonymousClass0wJ.A04(r2.getValue()) > 320) {
            d = 3.0d;
        } else if (AnonymousClass0wJ.A04(r2.getValue()) > 240) {
            d = 2.0d;
        } else if (AnonymousClass0wJ.A04(r2.getValue()) > 160) {
            d = 1.5d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }
}

package X;

/* renamed from: X.0ub  reason: invalid class name and case insensitive filesystem */
public class C17260ub {
    public final C17320uh A00;
    public final Object A01;
    public final Object A02;

    public String toString() {
        String str;
        C17320uh r3 = this.A00;
        String obj = r3.A03.toString();
        switch (C17240uZ.A00(r3.A02).intValue()) {
            case 0:
                str = "FIRE_AND_FORGET";
                break;
            case 1:
                str = "ACKNOWLEDGED_DELIVERY";
                break;
            default:
                str = "ASSURED_DELIVERY";
                break;
        }
        return AnonymousClass00U.A0N(obj, str, ' ');
    }

    public C17260ub(C17320uh r1, Object obj, Object obj2) {
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = obj2;
    }
}

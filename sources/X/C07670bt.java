package X;

/* renamed from: X.0bt  reason: invalid class name and case insensitive filesystem */
public final class C07670bt implements AnonymousClass0S8 {
    public final AnonymousClass0S8[] A00;

    public final Integer BI0() {
        Integer num = AnonymousClass006.A0C;
        for (AnonymousClass0S8 BI0 : this.A00) {
            int intValue = BI0.BI0().intValue();
            if (intValue == 0) {
                return AnonymousClass006.A00;
            }
            if (intValue == 1) {
                num = AnonymousClass006.A01;
            }
        }
        return num;
    }

    public C07670bt(AnonymousClass0S8... r1) {
        this.A00 = r1;
    }
}

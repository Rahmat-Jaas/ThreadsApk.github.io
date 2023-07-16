package X;

/* renamed from: X.784  reason: invalid class name */
public final class AnonymousClass784 {
    public AnonymousClass2L8 A00;
    public final C25515Dn3 A01;
    public final String A02;
    public final C04530Oa A03 = AnonymousClass0OY.A02(C74434aR.A00);

    public final void A01(Integer num, int i) {
        C04220Ms.A0B(num, 0);
        AnonymousClass01V r5 = AnonymousClass01V.A0p;
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2 || intValue == 3 || intValue == 1) {
            r5.markerAnnotate(17631244, A00(this), "cache_type", AnonymousClass6LY.A00(num));
        }
        r5.markerAnnotate(17631244, A00(this), "effects_count", i);
        r5.markerEnd(17631244, A00(this), 2);
    }

    public static final int A00(AnonymousClass784 r0) {
        return AnonymousClass0wJ.A04(r0.A03.getValue());
    }

    public AnonymousClass784(C25515Dn3 dn3, String str) {
        this.A01 = dn3;
        this.A02 = str;
    }
}

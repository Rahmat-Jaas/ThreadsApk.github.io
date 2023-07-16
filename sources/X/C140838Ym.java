package X;

/* renamed from: X.8Ym  reason: invalid class name and case insensitive filesystem */
public final class C140838Ym extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ C113196qu A00;
    public final /* synthetic */ C121827Ii A01;
    public final /* synthetic */ C146978nB A02;
    public final /* synthetic */ AnonymousClass7HD A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140838Ym(C113196qu r2, C121827Ii r3, C146978nB r4, AnonymousClass7HD r5, boolean z) {
        super(3);
        this.A02 = r4;
        this.A04 = z;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A042 = AnonymousClass0wJ.A04(obj);
        int A043 = AnonymousClass0wJ.A04(obj2);
        boolean A1X = AnonymousClass0wJ.A1X(obj3);
        if (!A1X) {
            C146978nB r0 = this.A02;
            A042 = r0.D7e(A042);
            A043 = r0.D7e(A043);
        }
        boolean z = false;
        if (this.A04) {
            AnonymousClass7HD r7 = this.A03;
            long j = r7.A00;
            if (!(A042 == C86104wH.A07(j) && A043 == C86104wH.A08(j))) {
                int i = A042;
                if (A042 > A043) {
                    i = A043;
                }
                if (i >= 0) {
                    int i2 = A042;
                    if (A042 < A043) {
                        i2 = A043;
                    }
                    C134747yH r5 = r7.A01;
                    if (i2 <= r5.length()) {
                        if (A1X || A042 == A043) {
                            C121827Ii r1 = this.A01;
                            C113196qu r02 = r1.A02;
                            if (r02 != null) {
                                r02.A06 = false;
                            }
                            C121827Ii.A00(AnonymousClass679.None, r1);
                        } else {
                            this.A01.A05();
                        }
                        this.A00.A0J.invoke(new AnonymousClass7HD(r5, (C121767Ia) null, AnonymousClass6FM.A00(A042, A043)));
                        z = true;
                    }
                }
                C121827Ii r12 = this.A01;
                C113196qu r03 = r12.A02;
                if (r03 != null) {
                    r03.A06 = false;
                }
                C121827Ii.A00(AnonymousClass679.None, r12);
            }
        }
        return Boolean.valueOf(z);
    }
}

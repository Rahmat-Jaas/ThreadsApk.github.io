package X;

/* renamed from: X.7UE  reason: invalid class name */
public final class AnonymousClass7UE implements C142678fP {
    public final C81784oM A00;
    public final C81784oM A01;
    public final C81784oM A02;

    public final void AIz(C147558pX r15) {
        long j;
        float f;
        C147558pX r3 = r15;
        r15.AIq();
        if (C86104wH.A1X(this.A02)) {
            j = AnonymousClass7KE.A01;
            f = 0.3f;
        } else if (C86104wH.A1X(this.A01) || C86104wH.A1X(this.A00)) {
            j = AnonymousClass7KE.A01;
            f = 0.1f;
        } else {
            return;
        }
        long A04 = C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), f);
        long BCH = r15.BCH();
        r3.AJA((C104136bI) null, C877353x.A00, 1.0f, 3, A04, AnonymousClass7KC.A03, BCH);
    }

    public AnonymousClass7UE(C81784oM r2, C81784oM r3, C81784oM r4) {
        AnonymousClass0wJ.A1O(r2, r3);
        C04220Ms.A0B(r4, 3);
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }
}

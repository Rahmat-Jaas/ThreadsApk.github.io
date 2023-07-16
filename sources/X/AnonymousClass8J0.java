package X;

import kotlin.Unit;

/* renamed from: X.8J0  reason: invalid class name */
public final class AnonymousClass8J0 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C115286uo A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8J0(C115286uo r2, float f, float f2, long j, long j2) {
        super(1);
        this.A03 = j;
        this.A01 = f;
        this.A00 = f2;
        this.A02 = j2;
        this.A04 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104136bI A012;
        C147558pX r7 = (C147558pX) obj;
        C04220Ms.A0B(r7, 0);
        long j = this.A03;
        if (j == AnonymousClass7KE.A06) {
            A012 = null;
        } else {
            A012 = C115866w2.A01(j);
        }
        float f = this.A01;
        float f2 = f / ((float) 2);
        float f3 = f2 + this.A00;
        r7.AIq();
        float A002 = (C147848q1.A00(r7) * 0.8333333f) + r7.CxL((float) 1);
        float CxL = A002 - r7.CxL(f2);
        long j2 = this.A02;
        r7.AIp((C104136bI) null, C877353x.A00, r7.CxL(f3), 1.0f, 3, j2, C86104wH.A0C(A002, A002));
        C115286uo r5 = this.A04;
        C146278lx r3 = ((AnonymousClass7X9) r7.Ae6()).A00;
        r3.D7f(CxL, CxL);
        r5.A02(A012, r7, 1.0f, C86104wH.A0C(r7.CxL(f), r7.CxL(f)));
        float f4 = -CxL;
        r3.D7f(f4, f4);
        return Unit.A00;
    }
}

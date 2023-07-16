package X;

import kotlin.Unit;

/* renamed from: X.8JT  reason: invalid class name */
public final class AnonymousClass8JT extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ C81784oM A04;
    public final /* synthetic */ C81784oM A05;
    public final /* synthetic */ C877253w A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JT(C81784oM r2, C81784oM r3, C81784oM r4, C81784oM r5, C877253w r6, float f, long j) {
        super(1);
        this.A00 = f;
        this.A01 = j;
        this.A06 = r6;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C147848q1 r7 = (C147848q1) obj;
        C04220Ms.A0B(r7, 0);
        float A002 = C18240wQ.A00(this.A04.getValue());
        C81784oM r2 = this.A05;
        float A012 = C86124wJ.A01(A002, C18240wQ.A00(r2.getValue()));
        float A042 = (((((float) AnonymousClass0wJ.A04(this.A03.getValue())) * 216.0f) % 360.0f) - 0.049804688f) + C18240wQ.A00(this.A02.getValue());
        float f = this.A00;
        long j = this.A01;
        C877253w r9 = this.A06;
        float f2 = (float) 2;
        float max = Math.max(A012, 0.1f);
        float f3 = r9.A01 / f2;
        float A022 = AnonymousClass7JK.A02(r7.BCH()) - (f2 * f3);
        r7.AIm((C104136bI) null, r9, C18240wQ.A00(r2.getValue()) + A042 + (((f / (AnonymousClass74U.A00 / f2)) * 57.29578f) / 2.0f), max, 1.0f, 3, j, C86104wH.A0C(f3, f3), C86104wH.A0C(A022, A022), false);
        return Unit.A00;
    }
}

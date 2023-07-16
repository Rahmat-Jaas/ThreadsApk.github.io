package X;

import kotlin.Unit;

/* renamed from: X.8Jf  reason: invalid class name */
public final class AnonymousClass8Jf extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C111366nD A05;
    public final /* synthetic */ C877253w A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jf(C111366nD r2, C877253w r3, float f, float f2, long j, long j2, long j3, boolean z) {
        super(1);
        this.A07 = z;
        this.A05 = r2;
        this.A03 = j;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = j2;
        this.A02 = j3;
        this.A06 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C111366nD r9;
        long j;
        long A002;
        C98126Eh r11;
        C104136bI r10;
        float f;
        int i;
        long j2;
        C147558pX r8 = (C147558pX) obj;
        C04220Ms.A0B(r8, 0);
        r8.AIq();
        if (this.A07) {
            r9 = this.A05;
            long j3 = this.A03;
            r10 = null;
            j = AnonymousClass7KC.A03;
            j2 = C115886w4.A00(r8.BCH(), j);
            f = 1.0f;
            r11 = C877353x.A00;
            i = 3;
            A002 = j3;
        } else {
            long j4 = this.A03;
            float A003 = C86104wH.A00(j4);
            float f2 = this.A00;
            if (A003 < f2) {
                float f3 = this.A01;
                long BCH = r8.BCH();
                C111366nD r92 = this.A05;
                C146708mj Ae6 = r8.Ae6();
                AnonymousClass7X9 r1 = (AnonymousClass7X9) Ae6;
                C121167El r7 = r1.A01.A02;
                long A004 = C121167El.A00(r7);
                r1.A00.ADO(f3, f3, AnonymousClass7JK.A02(BCH) - f3, AnonymousClass7JK.A00(BCH) - f3, 0);
                long j5 = AnonymousClass7KC.A03;
                r8.AJC(r92, (C104136bI) null, C877353x.A00, 1.0f, 3, j5, C115886w4.A00(r8.BCH(), j5), j4);
                C146708mj.A00(r7, Ae6, A004);
                return Unit.A00;
            }
            r9 = this.A05;
            j = this.A04;
            long j6 = this.A02;
            A002 = AnonymousClass7Ac.A00(f2, j4);
            r11 = this.A06;
            r10 = null;
            f = 1.0f;
            i = 3;
            j2 = j6;
        }
        r8.AJC(r9, r10, r11, f, i, j, j2, A002);
        return Unit.A00;
    }
}

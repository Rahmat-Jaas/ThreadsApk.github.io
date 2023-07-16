package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8Jj  reason: invalid class name */
public final class AnonymousClass8Jj extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C104136bI A06;
    public final /* synthetic */ C115286uo A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jj(C104136bI r2, C115286uo r3, float f, float f2, float f3, float f4, long j, long j2) {
        super(1);
        this.A02 = f;
        this.A04 = j;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A05 = j2;
        this.A07 = r3;
        this.A06 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C147558pX r11 = (C147558pX) obj;
        C04220Ms.A0B(r11, 0);
        r11.AIq();
        long BCH = r11.BCH();
        float A002 = AnonymousClass7JK.A00(BCH) * 0.8333333f;
        float A003 = (AnonymousClass7JK.A00(BCH) * 0.8333333f) - r11.CxL((float) 1);
        float f = this.A02;
        float f2 = f / ((float) 2);
        float CxL = A002 - r11.CxL(f2);
        float CxL2 = A003 - r11.CxL(f2);
        long j = this.A04;
        r11.AIp((C104136bI) null, C877353x.A00, r11.CxL(this.A03), 1.0f, 3, j, C86104wH.A0C(A002, A003));
        C115286uo r9 = this.A07;
        C104136bI r8 = this.A06;
        C146278lx r7 = ((AnonymousClass7X9) r11.Ae6()).A00;
        r7.D7f(CxL, CxL2);
        C115286uo r25 = r9;
        r25.A02(r8, r11, 1.0f, C86104wH.A0C(r11.CxL(f), r11.CxL(f)));
        r7.D7f(-CxL, -CxL2);
        float CxL3 = r11.CxL(this.A00);
        r11.AIp((C104136bI) null, new C877253w(r11.CxL(this.A01), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0, 30), CxL3, 1.0f, 3, this.A05, C86104wH.A0C(A002, A003));
        return Unit.A00;
    }
}

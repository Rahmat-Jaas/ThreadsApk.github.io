package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithContentElement;

/* renamed from: X.8Yc  reason: invalid class name */
public final class AnonymousClass8Yc extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C115286uo A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Yc(C115286uo r2, long j, long j2, long j3) {
        super(3);
        this.A00 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C104136bI A012;
        Modifier modifier = (Modifier) obj;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(modifier, 0);
        A0H.Cvb(-59361524);
        float f = (float) 18;
        float f2 = (float) 1;
        float f3 = (float) 2;
        long j = this.A00;
        if (j == AnonymousClass7KE.A06) {
            A012 = null;
        } else {
            A012 = C115866w2.A01(this.A02);
        }
        float f4 = f / f3;
        long j2 = this.A01;
        Modifier Cx6 = modifier.Cx6(new DrawWithContentElement(new AnonymousClass8Jj(A012, this.A03, f, f4, f2 + f4, f3, j, j2)));
        AnonymousClass7W3.A0z(A0H, false);
        return Cx6;
    }
}

package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.C02220Ah;
import X.C04220Ms;
import X.C123457Wz;
import X.C134847yT;
import X.C1371586i;
import X.C142918fo;
import X.C147798pw;
import X.C86134wK;
import kotlin.Unit;

public class KtLambdaShape0S0110201_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public long A01;
    public long A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0110201_I2(C142918fo r2, float f, int i, long j, long j2, boolean z) {
        super(1);
        this.A05 = i;
        this.A00 = f;
        this.A03 = r2;
        this.A04 = z;
        this.A01 = j;
        this.A02 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A05 != 0) {
            C1371586i A002 = AnonymousClass75O.A00(obj);
            A002.A01("elevation", C134847yT.A00(this.A00));
            A002.A01("shape", this.A03);
            A002.A01("clip", Boolean.valueOf(this.A04));
            A002.A01("ambientColor", C86134wK.A0I(this.A01));
            A002.A01("spotColor", C86134wK.A0I(this.A02));
        } else {
            C147798pw r4 = (C147798pw) obj;
            C04220Ms.A0B(r4, 0);
            float CxL = r4.CxL(this.A00);
            C123457Wz r42 = (C123457Wz) r4;
            r42.A05 = CxL;
            C142918fo r0 = (C142918fo) this.A03;
            C04220Ms.A0B(r0, 0);
            r42.A0C = r0;
            r42.A0E = this.A04;
            r42.A08 = this.A01;
            r42.A0A = this.A02;
        }
        return Unit.A00;
    }
}

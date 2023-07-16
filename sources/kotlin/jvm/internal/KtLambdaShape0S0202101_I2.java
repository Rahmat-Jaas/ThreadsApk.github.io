package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass77C;
import X.AnonymousClass78U;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S0202101_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0202101_I2(Object obj, Object obj2, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A06 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A00 = f;
        this.A03 = j;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A06;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        Object obj3 = this.A05;
        switch (i) {
            case 0:
                ((AnonymousClass78U) obj3).A00(A0H, (Modifier) this.A04, this.A00, C115796vv.A00(this.A01), this.A02, this.A03);
                break;
            case 1:
                ((AnonymousClass78U) obj3).A01(A0H, (Modifier) this.A04, this.A00, C115796vv.A00(this.A01), this.A02, this.A03);
                break;
            default:
                ((AnonymousClass77C) obj3).A00(A0H, (Modifier) this.A04, this.A00, C115796vv.A00(this.A01), this.A02, this.A03);
                break;
        }
        return Unit.A00;
    }
}

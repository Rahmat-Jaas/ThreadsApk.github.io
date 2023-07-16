package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass70V;
import X.AnonymousClass74U;
import X.C02220Ah;
import X.C115796vv;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S0102101_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0102101_I2(Modifier modifier, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A05 = i3;
        this.A04 = modifier;
        this.A03 = j;
        this.A00 = f;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A05 != 0) {
            AnonymousClass70V.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A04, this.A00, C115796vv.A00(this.A01), this.A02, this.A03);
        } else {
            AnonymousClass74U.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A04, this.A00, C115796vv.A00(this.A01), this.A02, this.A03);
        }
        return Unit.A00;
    }
}

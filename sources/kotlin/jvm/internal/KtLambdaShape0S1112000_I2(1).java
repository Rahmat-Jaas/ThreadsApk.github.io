package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;
import X.C100206Mk;
import X.C100336Mx;
import X.C115796vv;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1112000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1112000_I2(Modifier modifier, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A05 = i3;
        this.A03 = str;
        this.A04 = z;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A05 != 0) {
            C100336Mx.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, this.A03, C115796vv.A00(this.A00), this.A01, this.A04);
        } else {
            C100206Mk.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, this.A03, C115796vv.A00(this.A00), this.A01, this.A04);
        }
        return Unit.A00;
    }
}

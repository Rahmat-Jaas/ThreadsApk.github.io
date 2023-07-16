package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C115796vv;
import X.C120477Ba;
import X.C121917Iu;
import X.C122107Kg;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1203000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1203000_I2(Object obj, Object obj2, String str, int i, int i2, int i3, int i4) {
        super(2);
        this.A06 = i4;
        this.A03 = obj;
        this.A05 = str;
        this.A04 = obj2;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A06;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                int i2 = this.A02;
                String str = this.A05;
                C120477Ba.A01(A0H, (Modifier) this.A03, str, (AnonymousClass0ZU) this.A04, i2, C115796vv.A00(this.A00), this.A01);
                break;
            case 1:
                Modifier modifier = (Modifier) this.A03;
                int i3 = this.A02;
                C122107Kg.A08(A0H, modifier, this.A05, (AnonymousClass0ZU) this.A04, i3, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                Modifier modifier2 = (Modifier) this.A03;
                int i4 = this.A02;
                C122107Kg.A09(A0H, modifier2, this.A05, (AnonymousClass0ZU) this.A04, i4, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                C121917Iu.A02(A0H, (Modifier) this.A03, this.A05, (AnonymousClass0ZU) this.A04, this.A02, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}

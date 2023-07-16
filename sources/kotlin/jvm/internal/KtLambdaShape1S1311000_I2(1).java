package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass70R;
import X.C02220Ah;
import X.C115796vv;
import X.C117636z0;
import X.C121737Hu;
import X.C142488ew;
import X.C147188nY;
import X.C147258p3;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape1S1311000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1311000_I2(Object obj, Object obj2, Object obj3, String str, int i, int i2, boolean z) {
        super(2);
        this.A06 = i2;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = z;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A06) {
            case 0:
                C147188nY A0H = C86104wH.A0H(obj, obj2);
                boolean z = this.A05;
                C117636z0.A01((C147258p3) this.A02, A0H, this.A04, (AnonymousClass0ZU) this.A03, (AnonymousClass0YP) this.A01, C115796vv.A00(this.A00), z);
                break;
            case 1:
                C147188nY A0H2 = C86104wH.A0H(obj, obj2);
                boolean z2 = this.A05;
                String str = this.A04;
                C121737Hu.A01((C147258p3) this.A02, A0H2, (C142488ew) this.A03, str, (AnonymousClass0YP) this.A01, C115796vv.A00(this.A00), z2);
                break;
            case 2:
                C147188nY A0H3 = C86104wH.A0H(obj, obj2);
                String str2 = this.A04;
                boolean z3 = this.A05;
                C121737Hu.A03(A0H3, (Modifier) this.A02, (C142488ew) this.A03, str2, (AnonymousClass0YP) this.A01, C115796vv.A00(this.A00), z3);
                break;
            default:
                C147188nY A0H4 = C86104wH.A0H(obj, obj2);
                boolean z4 = this.A05;
                AnonymousClass70R.A01((C147258p3) this.A02, A0H4, this.A04, (AnonymousClass0ZU) this.A03, (AnonymousClass0YP) this.A01, C115796vv.A00(this.A00), z4);
                break;
        }
        return Unit.A00;
    }
}

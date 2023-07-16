package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass7KY;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C100246Mo;
import X.C100426Ng;
import X.C105556dc;
import X.C115796vv;
import X.C121377Fr;
import X.C147188nY;
import X.C86104wH;
import X.C97886Di;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2;
import kotlin.Unit;

public class KtLambdaShape0S0312000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0312000_I2(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z) {
        super(2);
        this.A06 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = z;
        this.A02 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A06;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                C97886Di.A00(A0H, (Alignment) this.A03, (Modifier) this.A04, (AnonymousClass0YM) this.A02, this.A00 | 1, this.A01, this.A05);
                break;
            case 1:
                boolean z = this.A05;
                C100246Mo.A00(A0H, (Modifier) this.A02, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, z);
                break;
            case 2:
                boolean z2 = this.A05;
                AnonymousClass0ZU r3 = (AnonymousClass0ZU) this.A03;
                C121377Fr.A03(A0H, (Modifier) this.A02, r3, (AnonymousClass8s2) this.A04, C115796vv.A00(this.A00), this.A01, z2);
                break;
            case 3:
                KtCSuperShape0S0302000_I2 ktCSuperShape0S0302000_I2 = (KtCSuperShape0S0302000_I2) this.A04;
                boolean z3 = this.A05;
                AnonymousClass7KY.A06(A0H, (Modifier) this.A02, ktCSuperShape0S0302000_I2, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01, z3);
                break;
            default:
                C100426Ng.A00(A0H, (C105556dc) this.A02, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, this.A05);
                break;
        }
        return Unit.A00;
    }
}

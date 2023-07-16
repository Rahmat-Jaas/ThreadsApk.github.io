package kotlin.jvm.internal;

import X.AnonymousClass06E;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass58B;
import X.AnonymousClass67U;
import X.AnonymousClass7BW;
import X.AnonymousClass7JP;
import X.AnonymousClass7JX;
import X.C02220Ah;
import X.C115796vv;
import X.C1203679w;
import X.C1203779x;
import X.C142758fX;
import X.C147188nY;
import X.C147258p3;
import X.C86104wH;
import X.C968266v;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1512000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public boolean A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1512000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A09 = i3;
        this.A06 = obj;
        this.A08 = z;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A07 = str;
        this.A02 = obj5;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A09) {
            case 0:
                C147188nY A0H = C86104wH.A0H(obj, obj2);
                boolean z = this.A08;
                AnonymousClass7JP.A05((C1203679w) this.A03, (C1203779x) this.A04, (C142758fX) this.A06, A0H, (Modifier) this.A05, this.A07, (AnonymousClass0YM) this.A02, this.A00 | 1, this.A01, z);
                break;
            case 1:
                C968266v r5 = (C968266v) this.A06;
                AnonymousClass67U r4 = (AnonymousClass67U) this.A05;
                Modifier modifier = (Modifier) this.A03;
                String str = this.A07;
                boolean z2 = this.A08;
                AnonymousClass7BW.A01((C147258p3) this.A02, C86104wH.A0H(obj, obj2), modifier, r4, r5, str, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, z2);
                break;
            default:
                C147188nY A0H2 = C86104wH.A0H(obj, obj2);
                String str2 = this.A07;
                boolean z3 = this.A08;
                AnonymousClass0ZU r6 = (AnonymousClass0ZU) this.A04;
                Modifier modifier2 = (Modifier) this.A03;
                AnonymousClass58B r42 = (AnonymousClass58B) this.A06;
                AnonymousClass7JX.A00(A0H2, modifier2, (AnonymousClass06E) this.A02, r42, str2, r6, (AnonymousClass0YY) this.A05, C115796vv.A00(this.A00), this.A01, z3);
                break;
        }
        return Unit.A00;
    }
}

package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass6MJ;
import X.AnonymousClass6MQ;
import X.C02220Ah;
import X.C101146Qb;
import X.C115796vv;
import X.C121417Fv;
import X.C147258p3;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape0S0322000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0322000_I2(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A07 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A07) {
            case 0:
                boolean z = this.A06;
                boolean z2 = this.A05;
                AnonymousClass6MJ.A00((C147258p3) this.A02, C86104wH.A0H(obj, obj2), (Modifier) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, z, z2);
                break;
            case 1:
                ImageUrl imageUrl = (ImageUrl) this.A04;
                boolean z3 = this.A06;
                boolean z4 = this.A05;
                AnonymousClass6MQ.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, imageUrl, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z3, z4);
                break;
            case 2:
                boolean z5 = this.A06;
                boolean z6 = this.A05;
                C101146Qb.A00((C147258p3) this.A02, C86104wH.A0H(obj, obj2), (Modifier) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, z5, z6);
                break;
            default:
                C121417Fv.A00((C147258p3) this.A03, C86104wH.A0H(obj, obj2), (Modifier) this.A04, (AnonymousClass0YM) this.A02, C115796vv.A00(this.A00), this.A01, this.A06, this.A05);
                break;
        }
        return Unit.A00;
    }
}

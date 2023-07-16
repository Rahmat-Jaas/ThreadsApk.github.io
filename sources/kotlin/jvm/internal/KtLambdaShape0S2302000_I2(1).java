package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass70R;
import X.AnonymousClass7Hs;
import X.C02220Ah;
import X.C100566Nu;
import X.C115286uo;
import X.C115796vv;
import X.C117926zT;
import X.C147258p3;
import X.C86104wH;
import X.C879956a;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape0S2302000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public String A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S2302000_I2(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A07 = i3;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A07) {
            case 0:
                String str = this.A06;
                String str2 = this.A05;
                ImageUrl imageUrl = (ImageUrl) this.A04;
                AnonymousClass7Hs.A04(C86104wH.A0H(obj, obj2), (Modifier) this.A02, imageUrl, str, str2, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 1:
                String str3 = this.A06;
                String str4 = this.A05;
                C115286uo r3 = (C115286uo) this.A02;
                C100566Nu.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, r3, str3, str4, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                C117926zT.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C879956a) this.A04, this.A05, this.A06, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                Modifier modifier = (Modifier) this.A03;
                String str5 = this.A05;
                AnonymousClass70R.A00((C147258p3) this.A02, C86104wH.A0H(obj, obj2), modifier, this.A06, str5, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}

package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass68N;
import X.AnonymousClass6MY;
import X.C02220Ah;
import X.C115796vv;
import X.C120557Bj;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape0S3402000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S3402000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i, int i2, int i3) {
        super(2);
        this.A09 = i3;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A09;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            String str = this.A06;
            String str2 = this.A07;
            String str3 = this.A08;
            C120557Bj.A01(A0H, (AnonymousClass68N) this.A02, str, str2, str3, (AnonymousClass0ZU) this.A04, (AnonymousClass0ZU) this.A03, (AnonymousClass0YP) this.A05, C115796vv.A00(this.A00), this.A01);
        } else {
            String str4 = this.A08;
            String str5 = this.A07;
            String str6 = this.A06;
            AnonymousClass6MY.A00(A0H, (Modifier) this.A02, (ImageUrl) this.A05, str4, str5, str6, (AnonymousClass0ZU) this.A04, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01);
        }
        return Unit.A00;
    }
}

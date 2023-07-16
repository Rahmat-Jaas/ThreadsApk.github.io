package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C100066Lv;
import X.C100096Ly;
import X.C115796vv;
import X.C147188nY;
import X.C22168CKc;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape0S11003000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public String A0D;
    public final int A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S11003000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, String str, int i, int i2, int i3, int i4) {
        super(2);
        this.A0E = i4;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A0C = obj4;
        this.A0D = str;
        this.A0B = obj5;
        this.A06 = obj6;
        this.A07 = obj7;
        this.A09 = obj8;
        this.A0A = obj9;
        this.A08 = obj10;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A0E;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        List list = (List) this.A04;
        List list2 = (List) this.A05;
        List list3 = (List) this.A03;
        ImageUrl imageUrl = (ImageUrl) this.A0C;
        String str = this.A0D;
        Double d = (Double) this.A0B;
        if (i != 0) {
            C22168CKc cKc = (C22168CKc) this.A07;
            C100096Ly.A00(A0H, (Modifier) this.A08, cKc, imageUrl, d, str, list, list2, list3, (List) this.A06, (AnonymousClass0ZU) this.A09, (AnonymousClass0ZU) this.A0A, C115796vv.A00(this.A00), C115796vv.A01(this.A01), this.A02);
        } else {
            C22168CKc cKc2 = (C22168CKc) this.A08;
            C100066Lv.A00(A0H, (Modifier) this.A09, cKc2, imageUrl, d, str, list, list2, list3, (List) this.A07, (AnonymousClass0ZU) this.A0A, (AnonymousClass0YM) this.A06, C115796vv.A00(this.A00), C115796vv.A01(this.A01), this.A02);
        }
        return Unit.A00;
    }
}

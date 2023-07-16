package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass5IJ;
import X.AnonymousClass6M7;
import X.AnonymousClass7JS;
import X.AnonymousClass7W3;
import X.BKU;
import X.C02220Ah;
import X.C10300i6;
import X.C146458mH;
import X.C147188nY;
import X.C171469zS;
import X.C171779zx;
import X.C20066BMj;
import X.C37235Jn1;
import X.C3G;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import kotlin.Unit;

public class KtLambdaShape5S1400000_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S1400000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(3);
        this.A05 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A00 = obj3;
        this.A01 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i;
        Object[] objArr;
        Object obj4 = obj2;
        Object obj5 = obj;
        if (this.A05 != 0) {
            View view = (View) obj5;
            C3G c3g = (C3G) obj4;
            int A042 = AnonymousClass0wJ.A04(obj3);
            AnonymousClass0wJ.A1N(view, c3g);
            C37235Jn1.A00((C10300i6) this.A03).A04(view, C171469zS.TAP, C171779zx.A0U);
            boolean A3e = ((User) this.A02).A3e();
            BKU bku = (BKU) this.A00;
            C20066BMj bMj = (C20066BMj) this.A01;
            if (A3e) {
                c3g.BpL(bku, bMj, A042);
            } else {
                c3g.Bq2(bku, bMj, this.A04, A042);
            }
        } else {
            C147188nY r10 = (C147188nY) obj4;
            if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r10.BCM()) {
                AnonymousClass5IJ r4 = (AnonymousClass5IJ) this.A02;
                if (!r4.A04) {
                    r10.Cvb(1317588140);
                    i = 2131822013;
                    objArr = new Object[]{r4.A03, this.A04};
                } else if (r4.A05) {
                    r10.Cvb(1317588532);
                    i = 2131822014;
                    objArr = new Object[]{r4.A03};
                } else {
                    r10.Cvb(-2104420252);
                    AnonymousClass7W3.A0z(r10, false);
                    str = null;
                    AnonymousClass6M7.A00(r10, (Modifier) null, (C146458mH) null, r4.A01(), new KtLambdaShape2S1400000_I2(r4, this.A01, this.A03, this.A00, str, 1), 0, 12);
                }
                str = AnonymousClass7JS.A03(r10, objArr, i);
                AnonymousClass7W3.A0z(r10, false);
                AnonymousClass6M7.A00(r10, (Modifier) null, (C146458mH) null, r4.A01(), new KtLambdaShape2S1400000_I2(r4, this.A01, this.A03, this.A00, str, 1), 0, 12);
            } else {
                r10.CuJ();
            }
        }
        return Unit.A00;
    }
}

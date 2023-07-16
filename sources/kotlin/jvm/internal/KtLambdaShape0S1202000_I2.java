package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7Hy;
import X.C02220Ah;
import X.C100376Nb;
import X.C115796vv;
import X.C117846zL;
import X.C121947Ix;
import X.C18;
import X.C19450zt;
import X.C86104wH;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import kotlin.Unit;

public class KtLambdaShape0S1202000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A05) {
            case 0:
                C117846zL.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C19450zt) this.A03, this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 1:
                C121947Ix.A03(C86104wH.A0H(obj, obj2), (Modifier) this.A02, this.A04, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                C100376Nb.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, this.A04, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 3:
                String str = this.A04;
                AnonymousClass7Hy.A02(C86104wH.A0H(obj, obj2), (Modifier) this.A02, str, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 4:
                String str2 = this.A04;
                AnonymousClass7Hy.A03(C86104wH.A0H(obj, obj2), (Modifier) this.A02, str2, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                View view = (View) obj4;
                MotionEvent motionEvent = (MotionEvent) obj3;
                boolean A1Y = AnonymousClass0wJ.A1Y(view, motionEvent);
                return Boolean.valueOf(((C18) this.A02).CCu(motionEvent, view, (ProductFeedItem) this.A03, this.A04, this.A01, this.A00, A1Y));
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1202000_I2(Object obj, Object obj2, String str, int i, int i2, int i3) {
        super(2);
        this.A05 = i3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str;
    }
}

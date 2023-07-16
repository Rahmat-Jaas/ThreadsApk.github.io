package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass688;
import X.AnonymousClass7KY;
import X.C02220Ah;
import X.C100396Nd;
import X.C115796vv;
import X.C121317Fl;
import X.C122107Kg;
import X.C18;
import X.C304621k;
import X.C86104wH;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import kotlin.Unit;

public class KtLambdaShape0S1212000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A06) {
            case 0:
                String str = this.A04;
                boolean z = this.A05;
                C121317Fl.A03(C86104wH.A0H(obj, obj2), (Modifier) this.A02, str, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z);
                break;
            case 1:
                String str2 = this.A04;
                boolean z2 = this.A05;
                AnonymousClass7KY.A08(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (AnonymousClass688) this.A03, str2, C115796vv.A00(this.A00), this.A01, z2);
                break;
            case 2:
                boolean z3 = this.A05;
                String str3 = this.A04;
                C122107Kg.A06(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (C304621k) this.A02, str3, C115796vv.A00(this.A00), this.A01, z3);
                break;
            case 3:
                String str4 = this.A04;
                boolean z4 = this.A05;
                C100396Nd.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, str4, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z4);
                break;
            default:
                View view = (View) obj4;
                MotionEvent motionEvent = (MotionEvent) obj3;
                AnonymousClass0wJ.A1N(view, motionEvent);
                return Boolean.valueOf(((C18) this.A02).CCu(motionEvent, view, new ProductFeedItem((ProductTile) this.A03), this.A04, this.A01, this.A00, this.A05));
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1212000_I2(Object obj, Object obj2, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A06 = i3;
        this.A03 = obj;
        this.A04 = str;
        this.A05 = z;
        this.A02 = obj2;
        this.A00 = i;
        this.A01 = i2;
    }
}

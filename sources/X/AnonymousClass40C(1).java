package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Map;

/* renamed from: X.40C  reason: invalid class name */
public final class AnonymousClass40C implements C27607EqI {
    public final /* synthetic */ String A00;
    public final /* synthetic */ AnonymousClass8s9 A01;

    public AnonymousClass40C(String str, AnonymousClass8s9 r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final void CGt(C41173LyC lyC, Map map) {
        String str;
        AnonymousClass8s9 r1;
        Object obj;
        SkuDetails skuDetails;
        if (map == null || (skuDetails = (SkuDetails) map.get(this.A00)) == null) {
            str = null;
        } else {
            str = skuDetails.A00.optString("price");
        }
        if (lyC.A00 != 0 || str == null) {
            r1 = this.A01;
            obj = AnonymousClass1pZ.A00;
        } else {
            r1 = this.A01;
            obj = new C25861pX(str);
        }
        r1.resumeWith(obj);
    }
}

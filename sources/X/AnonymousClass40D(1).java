package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Map;

/* renamed from: X.40D  reason: invalid class name */
public final class AnonymousClass40D implements C27607EqI {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ String A03;

    public AnonymousClass40D(AnonymousClass601 r1, C109326jp r2, C109326jp r3, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r3;
    }

    public final void CGt(C41173LyC lyC, Map map) {
        C109326jp r3;
        C63893iY r1;
        String str;
        SkuDetails skuDetails;
        if (lyC.A00 == 0) {
            r3 = this.A02;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            if (map == null || (skuDetails = (SkuDetails) map.get(this.A03)) == null) {
                str = null;
            } else {
                str = skuDetails.A00.optString("price");
            }
            r1 = C63893iY.A04(A002, str, 0);
        } else {
            r3 = this.A01;
            r1 = C63893iY.A01;
        }
        C61043Rr.A00(this.A00, r1, r3);
    }
}

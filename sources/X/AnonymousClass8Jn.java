package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo;
import com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo;
import kotlin.Unit;

/* renamed from: X.8Jn  reason: invalid class name */
public final class AnonymousClass8Jn extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C15680ri A02;
    public final /* synthetic */ ProductFeedItem A03;
    public final /* synthetic */ ShoppingModuleLoggingInfo A04;
    public final /* synthetic */ C18 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jn(C15680ri r2, ProductFeedItem productFeedItem, ShoppingModuleLoggingInfo shoppingModuleLoggingInfo, C18 c18, String str, String str2, int i, int i2) {
        super(1);
        this.A05 = c18;
        this.A03 = productFeedItem;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = shoppingModuleLoggingInfo;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C04220Ms.A0B(view, 0);
        C18 c18 = this.A05;
        ProductFeedItem productFeedItem = this.A03;
        int i = this.A01;
        int i2 = i;
        c18.CCk(view, productFeedItem, new C1532493d(this.A02, this.A04, (ShoppingRankingLoggingInfo) null, false, 0, this.A07, this.A06, (String) null, (String) null), i2, this.A00);
        return Unit.A00;
    }
}

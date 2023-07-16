package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.service.session.UserSession;

/* renamed from: X.7s2  reason: invalid class name and case insensitive filesystem */
public final class C131457s2 implements C82394pY {
    public final /* synthetic */ C95185zb A00;
    public final /* synthetic */ BU9 A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ ProductFeedItem A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ AnonymousClass90U A07;

    public C131457s2(C95185zb r1, BU9 bu9, AnonymousClass3HX r3, C127397h3 r4, ImageUrl imageUrl, ProductFeedItem productFeedItem, UserSession userSession, AnonymousClass90U r8) {
        this.A00 = r1;
        this.A05 = productFeedItem;
        this.A02 = r3;
        this.A06 = userSession;
        this.A07 = r8;
        this.A01 = bu9;
        this.A03 = r4;
        this.A04 = imageUrl;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = C14030oh.A03(-761799352);
        C19786BAh bAh = (C19786BAh) obj;
        int A033 = C14030oh.A03(370504546);
        ProductFeedItem productFeedItem = this.A05;
        if (productFeedItem.A01() != null && bAh.A00.getId().equals(productFeedItem.A01().A00.A0j)) {
            C19310AuE.A01(this.A01, this.A02, this.A03, this.A04, this.A00.A03, productFeedItem, this.A06, this.A07, C18180wK.A0X());
        }
        C14030oh.A0A(-999302684, A033);
        C14030oh.A0A(-461567621, A032);
    }
}

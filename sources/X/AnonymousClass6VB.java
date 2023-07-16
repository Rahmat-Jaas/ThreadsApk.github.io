package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.model.shopping.Product;

/* renamed from: X.6VB  reason: invalid class name */
public final class AnonymousClass6VB {
    public static final String A00(Product product, Integer num) {
        String str;
        C04220Ms.A0B(product, 0);
        switch (num.intValue()) {
            case 1:
                str = "commerce/products/%s/influencer_posts/";
                break;
            case 2:
                str = "commerce/products/%s/featured_product_medias/";
                break;
            default:
                str = "commerce/products/%s/related_posts/";
                break;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, (Object) product.A00.A0j);
        C04220Ms.A06(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}

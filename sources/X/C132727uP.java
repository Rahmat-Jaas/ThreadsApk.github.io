package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.shopping.Product;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.7uP  reason: invalid class name and case insensitive filesystem */
public final class C132727uP implements C39549KvX {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ C95335zu A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    public C132727uP(View view, Product product, C95335zu r3, Integer num, String str) {
        this.A00 = view;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = num;
        this.A01 = product;
    }

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        Long l;
        String str;
        String str2;
        if (c2r.BLJ(jnx) != AnonymousClass006.A0C && ((double) c2r.BLq(jnx)) > 0.95d) {
            View view = this.A00;
            if (view.getVisibility() == 0) {
                C95335zu r6 = this.A02;
                LinkedHashMap linkedHashMap = r6.A06;
                String str3 = this.A04;
                Integer num = this.A03;
                Product product = this.A01;
                C89145Cc r2 = new C89145Cc();
                String A002 = AnonymousClass6VD.A00(num);
                Locale locale = Locale.ENGLISH;
                C04220Ms.A08(locale);
                r2.A0A("component_tag", C18190wL.A0r(locale, A002));
                r2.A0A(C18170wI.A00(83), C18210wN.A0e(view));
                String str4 = null;
                if (product == null || (str2 = product.A00.A0j) == null) {
                    l = null;
                } else {
                    l = AnonymousClass0wJ.A0d(str2);
                }
                r2.A09("product_id", l);
                if (view instanceof TextView) {
                    CharSequence text = ((TextView) view).getText();
                    if (text != null) {
                        str = text.toString();
                    } else {
                        str = null;
                    }
                    r2.A0A("text", str);
                }
                if (view instanceof IgImageView) {
                    IgImageView igImageView = (IgImageView) view;
                    C86114wI.A16(igImageView, r2);
                    ImageUrl imageUrl = igImageView.A0D;
                    if (imageUrl != null) {
                        str4 = imageUrl.getUrl();
                    }
                    r2.A0A("media_url", String.valueOf(str4));
                } else if (view instanceof ImageView) {
                    C86114wI.A16(view, r2);
                }
                linkedHashMap.put(str3, r2);
                r6.A01.A02(view);
            }
        }
    }
}

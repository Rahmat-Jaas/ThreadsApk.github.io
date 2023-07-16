package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.Triple;

/* renamed from: X.2rN  reason: invalid class name and case insensitive filesystem */
public final class C49432rN {
    public static /* synthetic */ void A00(View view, C11630kW r9, ImageUrl imageUrl, String str, AnonymousClass0ZU r12, int i, boolean z, boolean z2) {
        Triple triple;
        String valueOf;
        View A0J = AnonymousClass0wJ.A0J(view, R.id.product_picture);
        View A0J2 = AnonymousClass0wJ.A0J(view, R.id.profile_picture);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.username);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.available_items);
        if (imageUrl == null) {
            triple = new Triple(A0J, (Object) null, A0J2);
        }
        IgImageView igImageView = (IgImageView) triple.A00;
        ImageUrl imageUrl2 = (ImageUrl) triple.A01;
        ((View) triple.A02).setVisibility(8);
        igImageView.setVisibility(0);
        if (imageUrl2 != null) {
            igImageView.setUrl(imageUrl2, r9);
        }
        textView.setText(str);
        if (z2) {
            if (z) {
                valueOf = view.getContext().getString(2131835805);
            } else {
                valueOf = String.valueOf(i);
            }
            C04220Ms.A09(valueOf);
            textView2.setText(C18230wP.A0j(view.getContext().getResources(), valueOf, R.plurals.shop_selector_product_count_label, i));
        } else {
            textView2.setVisibility(8);
        }
        AnonymousClass0wJ.A17(view, 299, r12);
    }
}

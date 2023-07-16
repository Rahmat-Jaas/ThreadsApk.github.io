package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IP  reason: invalid class name */
public final class AnonymousClass4IP implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AnonymousClass491 r5 = (AnonymousClass491) C18180wK.A0c(userSession, AnonymousClass491.class, 31);
        if (AnonymousClass268.A0J.A02(uri.toString())) {
            String queryParameter = uri.getQueryParameter("source");
            if (queryParameter != null) {
                boolean booleanQueryParameter = uri.getBooleanQueryParameter("show_product_row_tooltip", false);
                C170769vX r2 = (C170769vX) C170769vX.A01.get(queryParameter);
                Fragment fragment = this.A00;
                if (r2 == null) {
                    r2 = C170769vX.SHOPPING_TAGGED_PRODUCTS_DIALOG;
                }
                AnonymousClass3ib.A0C(fragment, r2, userSession, uri.getQueryParameter("product_row_tooltip_string_override"), booleanQueryParameter);
            } else if (C25790Ds3.A01(userSession)) {
                AnonymousClass3ib.A0C(this.A00, C170769vX.SHOPPING_TAGGED_PRODUCTS_DIALOG, userSession, (String) null, true);
            } else {
                Fragment fragment2 = this.A00;
                FragmentActivity activity = fragment2.getActivity();
                if (activity != null) {
                    r5.A00(fragment2, activity);
                }
                C06810aP.A01.A01(userSession);
                AnonymousClass3ib.A0L(fragment2.getActivity(), userSession, "product_tagging_dialog", "qp_product_shopping_dialog", true);
            }
        }
    }

    public AnonymousClass4IP(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}

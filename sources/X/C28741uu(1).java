package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1uu  reason: invalid class name and case insensitive filesystem */
public final class C28741uu extends AnonymousClass1bK {
    public static final String __redex_internal_original_name = "DataDownloadConfirmFragment";
    public String A00;

    public final String getModuleName() {
        return "data_download_confirm";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1781648070);
        super.onCreate(bundle);
        this.A00 = requireArguments().getString("email");
        C14030oh.A09(194864849, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(759602529);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.data_download_confirm_fragment);
        AnonymousClass0wJ.A0L(A0H, R.id.header_text).setText(2131824756);
        int i = 2131824754;
        if (C63803iN.A05(AnonymousClass0TJ.A05, this.A00, 36324299358871974L).booleanValue()) {
            i = 2131824755;
        }
        AnonymousClass0wJ.A0L(A0H, R.id.body_text).setText(AnonymousClass0wJ.A0o(this, this.A00, i));
        C18200wM.A0J(A0H, R.id.header_icon).setImageDrawable(AnonymousClass0wJ.A0B(this).getDrawable(R.drawable.checkmark_icon, (Resources.Theme) null));
        AnonymousClass0wJ.A17(A0H.requireViewById(R.id.download_request_button), 270, this);
        C14030oh.A09(1056499004, A02);
        return A0H;
    }
}

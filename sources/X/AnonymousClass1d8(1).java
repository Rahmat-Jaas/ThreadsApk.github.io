package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.1d8  reason: invalid class name */
public final class AnonymousClass1d8 extends C34640IcN implements C34 {
    public static final String __redex_internal_original_name = "WearableAttributionSheetFragment";
    public String A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final Integer B6F() {
        return AnonymousClass006.A0D;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1209729584);
        super.onCreate(bundle);
        Bundle A07 = C18250wR.A07(this);
        this.A01 = C18180wK.A0V(A07);
        this.A05 = A07.getString("args_attribution_title");
        this.A04 = A07.getString("args_attribution_subtitle");
        this.A03 = A07.getString("args_attribution_icon_url");
        this.A02 = A07.getString("args_attribution_cta_text");
        this.A00 = A07.getString("args_attribution_cta_action_url");
        C14030oh.A09(-192927770, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(774628620);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.wearable_attribution_sheet);
        C14030oh.A09(962524785, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.onViewCreated(view, bundle);
        TextView A0G = C18180wK.A0G(view, R.id.wearable_attribution_sheet_title);
        if (!(A0G == null || (str4 = this.A05) == null)) {
            A0G.setText(str4);
        }
        TextView A0G2 = C18180wK.A0G(view, R.id.wearable_attribution_sheet_subtitle);
        if (!(A0G2 == null || (str3 = this.A04) == null)) {
            A0G2.setText(str3);
        }
        IgImageView igImageView = (IgImageView) view.findViewById(R.id.wearable_attribution_sheet_icon);
        if (!(igImageView == null || (str2 = this.A03) == null)) {
            C18230wP.A1J(this, igImageView, str2);
        }
        TextView A0G3 = C18180wK.A0G(view, R.id.wearable_attribution_sheet_cta_button);
        if (A0G3 != null && (str = this.A02) != null) {
            A0G3.setText(str);
            AnonymousClass0wJ.A17(A0G3, 67, this);
        }
    }
}

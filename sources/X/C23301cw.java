package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1cw  reason: invalid class name and case insensitive filesystem */
public final class C23301cw extends C34640IcN implements C21839C2o {
    public static final String __redex_internal_original_name = "PoliticalSeeFewerAdsSheetFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public boolean A03;

    public final String getModuleName() {
        return "political_see_fewer_ads_sheet";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        C18250wR.A0q(requireArguments, (TextView) AnonymousClass0wJ.A0J(view, R.id.see_fewer_ads_header), "see_fewer_political_ads_confirmation_text");
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.visit_preferences_button);
        C18250wR.A0q(requireArguments, textView, "visit_ad_topic_preferences_text");
        AnonymousClass0wJ.A17(textView, 315, this);
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(2059052510);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18180wK.A0V(requireArguments);
        String string = requireArguments.getString("ad_id");
        if (string != null) {
            this.A01 = string;
            String string2 = requireArguments.getString("tracking_token");
            if (string2 != null) {
                this.A02 = string2;
                this.A03 = false;
                C14030oh.A09(1843489707, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -641301275;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1284533873;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1782725131);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.political_see_fewer_ads_sheet, false);
        C14030oh.A09(-313917021, A022);
        return A0D;
    }
}

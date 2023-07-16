package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.1cx  reason: invalid class name and case insensitive filesystem */
public final class C23311cx extends C34640IcN implements C21839C2o, C82034oy {
    public static final String __redex_internal_original_name = "DisclaimerPageFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public String A03;

    public final String getModuleName() {
        return "disclaimer_page";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        E2V e2v = ((BaseFragmentActivity) requireActivity()).A01;
        e2v.getClass();
        E2V.A0G(e2v);
        TextView A0G = C18180wK.A0G(view2, R.id.page_voice);
        C19577Ayd A0U = C18190wL.A0U(view2, R.id.text_view_stub);
        C19577Ayd A0U2 = C18190wL.A0U(view2, R.id.web_view_stub);
        String str = this.A02;
        if (str != null) {
            String str2 = this.A03;
            if (str2 != null) {
                UserSession userSession = this.A00;
                AnonymousClass01J r3 = new AnonymousClass01J(getChildFragmentManager());
                A0G.setText(C18190wL.A0h(A0G.getResources(), str.toLowerCase(), 2131826162));
                SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig(str2, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false);
                Bundle A06 = C18180wK.A06();
                A06.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
                C18190wL.A13(A06, userSession.token);
                C34608Ibe ibe = new C34608Ibe();
                ibe.setArguments(A06);
                r3.A0C(ibe, R.id.web_view_fragment);
                r3.A00();
                A0U2.A08().setVisibility(0);
                return;
            }
            String str3 = this.A01;
            if (str3 != null) {
                A0G.setText(C18190wL.A0h(A0G.getResources(), str.toLowerCase(), 2131826162));
                ((TextView) A0U.A08()).setText(str3);
            }
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A07(r3, 2131826161);
        r3.Cro(new C58763Hc(AnonymousClass006.A00).A00());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1383940749);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        this.A02 = requireArguments().getString("DisclaimerPageFragment.TITLE");
        this.A01 = requireArguments().getString("DisclaimerPageFragment.TEXT");
        this.A03 = requireArguments().getString("DisclaimerPageFragment.URL");
        C14030oh.A09(-1637261349, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(992534044);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fragment_disclaimer_page);
        C14030oh.A09(-1928763940, A022);
        return A0H;
    }
}

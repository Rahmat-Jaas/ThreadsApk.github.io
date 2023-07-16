package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape11S1100000_1_I2;

/* renamed from: X.1Zz  reason: invalid class name and case insensitive filesystem */
public final class C22821Zz extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationFullPolicyFragment";
    public UserSession A00;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131833554);
    }

    public final String getModuleName() {
        return "promote_non_discrimination_full_policy";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        AnonymousClass2KL.A00(AnonymousClass0wJ.A0K(view, R.id.full_policy_body_1_row), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833521), false);
        AnonymousClass2KL.A00(AnonymousClass0wJ.A0K(view, R.id.full_policy_body_2_row), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833522), false);
        AnonymousClass2KL.A00(AnonymousClass0wJ.A0K(view, R.id.discrimination_guides_title_row), AnonymousClass0wJ.A0B(this).getString(2131833528), (String) null, true);
        A00(AnonymousClass0wJ.A0K(view, R.id.department_of_housing_and_urban_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833526), "https://www.hud.gov/?fbclid=IwAR1BCtVQIYzgEV-AHKFQ7vnY4BiJoVZP1dPzbEQqpDMj01L7Jc8W39jVabU");
        A00(AnonymousClass0wJ.A0K(view, R.id.equal_employment_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833529), "https://www.eeoc.gov");
        A00(AnonymousClass0wJ.A0K(view, R.id.consumer_financial_protect_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833525), "https://www.consumerfinance.gov/?fbclid=IwAR3Zq8i7BOJ14yCUZWYSjN7OHEB3L0aLeG4gzOOMQML0Z6brPvZ8q7k2eH4");
        A00(AnonymousClass0wJ.A0K(view, R.id.civil_liberties_union_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833524), "https://www.aclu.org/?fbclid=IwAR2DU6KQXc-zOSrjZ4m_0OHP-BTTKG7EEint9fmolzXVRKdzcd9pfiVYIxY");
        A00(AnonymousClass0wJ.A0K(view, R.id.civil_and_human_rights_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833523), "https://civilrights.org/?fbclid=IwAR3Ejp_5nLJ2Ghi9aHVekHPj2j_V44uct_fy29kq1Lu9OZily5UiqWCYeJ8");
        A00(AnonymousClass0wJ.A0K(view, R.id.department_of_justice_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833527), "https://www.justice.gov/crt?fbclid=IwAR1FW0uYkUB885SbGjwDs_Rtyv_8KiUFy2M-OUdE95YmYtXmy89Rq_JlDdQ");
        A00(AnonymousClass0wJ.A0K(view, R.id.fair_housing_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833531), "https://fairhousingresourcecenter.wordpress.com/?fbclid=IwAR036hQB0CW7b-jPAQfoGB8B5kKc0Zt1bN39QBOtY2BDig-JYG-JcdL7zOU");
        A00(AnonymousClass0wJ.A0K(view, R.id.facebook_advertising_policies_link_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833530), "https://www.facebook.com/policies/ads/prohibited_content/discriminatory_practices");
        AnonymousClass2KL.A00(AnonymousClass0wJ.A0K(view, R.id.footer_row), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833532), false);
        super.onViewCreated(view, bundle);
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    private final void A00(View view, String str, String str2) {
        AnonymousClass3Zw.A03(new IDxCSpanShape11S1100000_1_I2(this, str2, C18180wK.A00(this), 0), (TextView) AnonymousClass0wJ.A0J(view, R.id.primary_text), str, str);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(878677658);
        UserSession userSession = C18190wL.A0P(this).A0v;
        C04220Ms.A05(userSession);
        this.A00 = userSession;
        super.onCreate(bundle);
        C14030oh.A09(-876528999, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1035917289);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_non_discrimination_full_policy_view, false);
        C14030oh.A09(1222304849, A02);
        return A0D;
    }
}

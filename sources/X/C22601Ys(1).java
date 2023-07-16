package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape10S1100000_1_I2;

/* renamed from: X.1Ys  reason: invalid class name and case insensitive filesystem */
public final class C22601Ys extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteSpecialRequirementsPolicyFragment";
    public View A00;
    public UserSession A01;
    public PromoteData A02;

    public final String getModuleName() {
        return "promote_special_requirements_policy";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.special_requirement_policy_layout);
        this.A00 = A0K;
        ((TextView) AnonymousClass0wJ.A0J(A0K, R.id.special_requirement_header_text)).setText(2131833707);
        View view2 = this.A00;
        if (view2 != null) {
            AnonymousClass0wJ.A16(AnonymousClass0wJ.A0K(view2, R.id.special_requirement_back_button), HttpStatus.SC_CREATED, this);
            View view3 = this.A00;
            if (view3 != null) {
                View A0K2 = AnonymousClass0wJ.A0K(view3, R.id.advertising_policy_row);
                A00(A0K2, 2131833699, 2131833700);
                SpannableStringBuilder A0E = C18200wM.A0E(getString(2131833700));
                C18720xk.A00(A0E, this, getString(2131833699), C18180wK.A00(this), 8);
                TextView textView = (TextView) AnonymousClass0wJ.A0J(A0K2, R.id.secondary_text);
                textView.setText(A0E);
                C18180wK.A0z(textView);
                View view4 = this.A00;
                if (view4 != null) {
                    A00(AnonymousClass0wJ.A0K(view4, R.id.audience_row), 2131833701, 2131833702);
                    View view5 = this.A00;
                    if (view5 != null) {
                        A00(AnonymousClass0wJ.A0K(view5, R.id.creative_consideration_row), 2131833703, 2131833704);
                        View view6 = this.A00;
                        if (view6 != null) {
                            A00(AnonymousClass0wJ.A0K(view6, R.id.additional_resource_row), 2131833697, 2131833698);
                            View view7 = this.A00;
                            if (view7 != null) {
                                View A0K3 = AnonymousClass0wJ.A0K(view7, R.id.credit_row);
                                A00(A0K3, 2131833678, 2131833705);
                                View requireViewById = A0K3.requireViewById(R.id.secondary_text);
                                C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
                                A01((TextView) requireViewById, "https://www.consumerfinance.gov/", 2131833705, 2131833705);
                                View view8 = this.A00;
                                if (view8 != null) {
                                    View A0K4 = AnonymousClass0wJ.A0K(view8, R.id.employment_row);
                                    A00(A0K4, 2131833681, 2131833706);
                                    A01(C18200wM.A0K(A0K4, R.id.secondary_text), "https://www.eeoc.gov/", 2131833706, 2131833706);
                                    View view9 = this.A00;
                                    str = "mainContainer";
                                    if (view9 != null) {
                                        View A0J = AnonymousClass0wJ.A0J(view9, R.id.housing_row);
                                        View view10 = this.A00;
                                        if (view10 != null) {
                                            TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view10, R.id.housing_nfha_link_text);
                                            A00(A0J, 2131833684, 2131833708);
                                            textView2.setText(2131833709);
                                            A01(C18200wM.A0K(A0J, R.id.secondary_text), "https://www.hud.gov/", 2131833708, 2131833708);
                                            A01(textView2, "https://nationalfairhousing.org/", 2131833709, 2131833709);
                                            return;
                                        }
                                    }
                                    C04220Ms.A0E(str);
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        str = "mainContainer";
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public static final void A00(View view, int i, int i2) {
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.primary_text)).setText(i);
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.secondary_text)).setText(i2);
    }

    private final void A01(TextView textView, String str, int i, int i2) {
        AnonymousClass3Zw.A03(new IDxCSpanShape10S1100000_1_I2(this, str, C18180wK.A00(this), 0), textView, getString(i), getString(i2));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1000974158);
        super.onCreate(bundle);
        PromoteData A0P = C18190wL.A0P(this);
        this.A02 = A0P;
        UserSession userSession = A0P.A0v;
        C04220Ms.A05(userSession);
        this.A01 = userSession;
        C14030oh.A09(-1777617273, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1660159014);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_special_requirements_policy_view, viewGroup, false);
        C14030oh.A09(294547183, A022);
        return inflate;
    }
}

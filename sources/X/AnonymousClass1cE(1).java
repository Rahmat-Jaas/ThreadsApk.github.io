package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape44S0100000_I2_24;

/* renamed from: X.1cE  reason: invalid class name */
public final class AnonymousClass1cE extends C34640IcN implements C82424pb, C82034oy, C82254pK {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationFragment";
    public C58923Id A00;
    public UserSession A01;
    public boolean A02;
    public C37352Jq1 A03;
    public PromoteData A04;
    public final C04530Oa A05 = C62373Zc.A03(new KtLambdaShape44S0100000_I2_24(this, 20));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131833554);
    }

    public final String getModuleName() {
        return "promote_non_discrimination";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        C35394Iu2 iu2 = C35394Iu2.A0t;
        ((C37741K2b) this.A05.getValue()).A0P(iu2.toString());
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.about_policy_title_row), AnonymousClass0wJ.A0B(this).getString(2131833507), (String) null, true);
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.about_policy_content_row_1), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833505), false);
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.about_policy_content_row_2), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833506), false);
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.acceptable_ad_targeting_row), AnonymousClass0wJ.A0B(this).getString(2131833510), AnonymousClass0wJ.A0B(this).getString(2131833509), false);
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.ad_discrimination_row), AnonymousClass0wJ.A0B(this).getString(2131833515), AnonymousClass0wJ.A0B(this).getString(2131833514), false);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.hec_row_with_chevron);
        String A0g = C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833553);
        IDxCListenerShape201S0100000_1_I2 A0H = C18190wL.A0H(this, HttpStatus.SC_NO_CONTENT);
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(A0K, R.id.front_icon);
        imageView.setImageResource(R.drawable.instagram_info_pano_outline_24);
        imageView.setVisibility(0);
        C18210wN.A0E(A0K, R.id.primary_text).setText(A0g);
        A0K.setOnClickListener(A0H);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.full_policy_row_with_chevron);
        String A0g2 = C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833534);
        IDxCListenerShape201S0100000_1_I2 A0H2 = C18190wL.A0H(this, HttpStatus.SC_RESET_CONTENT);
        ImageView imageView2 = (ImageView) AnonymousClass0wJ.A0J(A0K2, R.id.front_icon);
        imageView2.setImageResource(R.drawable.instagram_licensing_outline_24);
        imageView2.setVisibility(0);
        C18210wN.A0E(A0K2, R.id.primary_text).setText(A0g2);
        A0K2.setOnClickListener(A0H2);
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.footer_message_row), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833520), false);
        AnonymousClass2KK.A00(AnonymousClass0wJ.A0K(view, R.id.acceptance_claim_title_row), AnonymousClass0wJ.A0B(this).getString(2131833513), (String) null, false);
        A00(AnonymousClass0wJ.A0K(view, R.id.acceptance_first_claim_check_mark_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833511));
        A00(AnonymousClass0wJ.A0K(view, R.id.acceptance_second_claim_check_mark_row), C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131833512));
        C58923Id r0 = new C58923Id(view, iu2);
        this.A00 = r0;
        r0.A00();
        C58923Id r1 = this.A00;
        if (r1 == null) {
            C04220Ms.A0E("acceptButtonHolder");
            throw null;
        }
        r1.A04(false);
        r1.A02(this);
        r1.A01(2131833508);
        super.onViewCreated(view, bundle);
    }

    public final void BjA() {
        C37352Jq1 jq1 = this.A03;
        if (jq1 == null) {
            C04220Ms.A0E("dataFetcher");
            throw null;
        }
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(this, 30);
        PromoteData promoteData = jq1.A06;
        UserSession userSession = promoteData.A0v;
        String str = promoteData.A0x;
        H1T h1t = new H1T(userSession);
        h1t.A0O("fb_auth_token", str);
        C18250wR.A16(h1t);
        h1t.A0J("ads/promote/accept_non_disc_policy/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(h1t, AnonymousClass1S3.class, AnonymousClass3LF.class);
        A0T.A00 = A06;
        jq1.A0C.schedule(A0T);
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final boolean onBackPressed() {
        if (this.A02) {
            C25828Dsm A0W = C18190wL.A0W(requireActivity());
            A0W.A0r(false);
            A0W.A0L(2131833519);
            A0W.A0K(2131833516);
            A0W.A0P((DialogInterface.OnClickListener) null, 2131833518);
            A0W.A0N(C18220wO.A0O(this, 25), 2131833517);
            AnonymousClass0wJ.A1K(A0W);
            return true;
        }
        C37741K2b k2b = (C37741K2b) this.A05.getValue();
        PromoteData promoteData = this.A04;
        if (promoteData == null) {
            C04220Ms.A0E("promoteData");
            throw null;
        }
        k2b.A0E(C35394Iu2.A0t, promoteData);
        return false;
    }

    private final void A00(View view, String str) {
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.primary_text);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.secondary_text);
        ((CompoundButton) AnonymousClass0wJ.A0J(view, R.id.promote_row_checkbox)).setChecked(true);
        textView.setText(str);
        textView.setTextSize(0, (float) AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        A0K.setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(252716012);
        PromoteData A0P = C18190wL.A0P(this);
        this.A04 = A0P;
        UserSession userSession = A0P.A0v;
        C04220Ms.A05(userSession);
        this.A01 = userSession;
        PromoteData promoteData = this.A04;
        if (promoteData == null) {
            C04220Ms.A0E("promoteData");
            throw null;
        }
        this.A03 = new C37352Jq1(requireActivity(), this, promoteData.A0v);
        this.A02 = true;
        super.onCreate(bundle);
        C14030oh.A09(715706506, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(64056957);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_non_discrimination_view, false);
        C14030oh.A09(-607454681, A022);
        return A0D;
    }
}

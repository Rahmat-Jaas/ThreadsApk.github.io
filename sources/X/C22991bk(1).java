package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgRadioButton;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.service.session.UserSession;

/* renamed from: X.1bk  reason: invalid class name and case insensitive filesystem */
public final class C22991bk extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "FeedCrosspostingAudienceSettingFragment";
    public int A00;
    public View A01;
    public UserSession A02;
    public int A03;
    public IgRadioButton A04;
    public IgRadioButton A05;
    public IgRadioButton A06;
    public IgdsButton A07;

    public final String getModuleName() {
        return "feed_crossposting_audFience_setting";
    }

    public static void A00(C22991bk r4) {
        boolean z = true;
        r4.A06.setChecked(AnonymousClass0wJ.A1T(r4.A00, 80));
        r4.A04.setChecked(AnonymousClass0wJ.A1T(r4.A00, 40));
        IgRadioButton igRadioButton = r4.A05;
        if (r4.A00 != 10) {
            z = false;
        }
        igRadioButton.setChecked(z);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        if (this.A00 != this.A03) {
            C63073bQ.A00(this.A02).A00 = this.A00;
            C63073bQ.A00(this.A02).A03 = true;
            C63073bQ.A00(this.A02).A09(requireContext(), this.A00, this.A03);
        }
        return false;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A08(r2, getString(2131837425));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1849233679);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(717956387, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int A022 = C14030oh.A02(28669858);
        boolean z2 = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_update_feed_post_audience_setting, viewGroup, false);
        C59693Lv.A00(C320129v.ENTER_AUDIENCE_SETTINGS_SHEET, this.A02);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("BUNDLE_ARG_EXTRA_PADDING")) {
            inflate.setPadding(0, AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.account_group_management_clickable_width), 0, 0);
        }
        this.A06 = (IgRadioButton) inflate.requireViewById(R.id.public_selection);
        this.A04 = (IgRadioButton) inflate.requireViewById(R.id.friends_selection);
        this.A05 = (IgRadioButton) inflate.requireViewById(R.id.only_me_selection);
        this.A01 = inflate.requireViewById(R.id.crosspost_megaphone_frame);
        this.A07 = (IgdsButton) inflate.requireViewById(R.id.review_button);
        C209416t A012 = C63073bQ.A01(this.A02);
        UserSession userSession = this.A02;
        C04220Ms.A0B(userSession, 0);
        if (C63073bQ.A03(userSession) && C63073bQ.A00(this.A02).A03() != null && A012 != null && !(z = A012.A00)) {
            boolean z3 = z;
            C59693Lv.A01(C320129v.DEFAULT_PRIVACY_ADVANCE_SETTING_MEGA_IMPRESSION, this.A02, A012.A02.toString(), C63143c0.A05(requireContext(), Integer.valueOf(C18200wM.A06(this.A02, C63803iN.A05(AnonymousClass0TJ.A05, this.A02, 36325317266121774L).booleanValue() ? 1 : 0))), "advanced_setting", A012.A01.toString(), z3, C62183Xq.A00(this.A02), A012.A05);
            this.A01.setVisibility(0);
        }
        AnonymousClass1ak A002 = AnonymousClass2MH.A00("advanced_setting");
        A002.A01 = new C69864At(this);
        int A062 = C18200wM.A06(this.A02, C63803iN.A05(AnonymousClass0TJ.A05, this.A02, 36325317266121774L).booleanValue() ? 1 : 0);
        this.A03 = A062;
        this.A00 = A062;
        this.A06.setChecked(AnonymousClass0wJ.A1T(A062, 80));
        this.A04.setChecked(AnonymousClass0wJ.A1T(this.A03, 40));
        IgRadioButton igRadioButton = this.A05;
        if (this.A03 == 10) {
            z2 = true;
        }
        igRadioButton.setChecked(z2);
        AnonymousClass0wJ.A16(inflate.requireViewById(R.id.public_row), HttpStatus.SC_NOT_MODIFIED, this);
        AnonymousClass0wJ.A16(inflate.requireViewById(R.id.friends_row), HttpStatus.SC_USE_PROXY, this);
        AnonymousClass0wJ.A16(inflate.requireViewById(R.id.only_me_row), 306, this);
        AnonymousClass0wJ.A16(this.A06, HttpStatus.SC_TEMPORARY_REDIRECT, this);
        AnonymousClass0wJ.A16(this.A04, 308, this);
        AnonymousClass0wJ.A16(this.A05, 309, this);
        C18200wM.A1E(this.A07, this, A012, A002, 29);
        C14030oh.A09(-1876910479, A022);
        return inflate;
    }
}

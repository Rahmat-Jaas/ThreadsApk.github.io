package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;

/* renamed from: X.1a5  reason: invalid class name */
public final class AnonymousClass1a5 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "GDPRPrivacyCheckFragment";
    public BugReport A00;
    public BugReportComposerViewModel A01;
    public C58533Ga A02;
    public C61593Uj A03;
    public final C04530Oa A04 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r5) {
        C04220Ms.A0B(r5, 0);
        r5.Cjt(AnonymousClass0wJ.A0X(this.A04), R.layout.bugreporter_actionbar_header, 50, 0);
        r5.AJa(0, true);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A05 = R.drawable.instagram_x_pano_outline_24;
        A0K.A04 = 2131821803;
        A0K.A0C = C18190wL.A0H(this, 94);
        r5.A6M(new C25435DlZ(A0K));
    }

    public final String getModuleName() {
        return "gdpr_consent_for_rageshake";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass3GE r2 = new AnonymousClass3GE(requireContext());
        BugReportComposerViewModel bugReportComposerViewModel = this.A01;
        if (bugReportComposerViewModel == null) {
            C04220Ms.A0E("composerViewModel");
            throw null;
        }
        r2.A01 = bugReportComposerViewModel.A01;
        r2.A02 = bugReportComposerViewModel.A02;
        r2.A00 = bugReportComposerViewModel.A00;
        r2.A05 = bugReportComposerViewModel.A05;
        r2.A06 = bugReportComposerViewModel.A06;
        r2.A04 = bugReportComposerViewModel.A04;
        r2.A08 = bugReportComposerViewModel.A08;
        r2.A07 = bugReportComposerViewModel.A07;
        r2.A03 = bugReportComposerViewModel.A03;
        r2.A09 = bugReportComposerViewModel.A09;
        r2.A0A = bugReportComposerViewModel.A0A;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.rageshake_continue_button);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18200wM.A0R(this, r2, 29));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(C18200wM.A0R(this, r2, 30));
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.rageshake_span_with_link);
        String A0g = C18180wK.A0g(this, 2131822734);
        String A0o = AnonymousClass0wJ.A0o(this, A0g, 2131834015);
        C04220Ms.A06(A0o);
        C18180wK.A0z(textView);
        Context A0A = C18190wL.A0A(textView);
        SpannableStringBuilder A0E = C18200wM.A0E(A0o);
        C18720xk.A00(A0E, this, A0g, A0A.getColor(R.color.igds_link_on_white), 3);
        textView.setText(A0E);
    }

    public static final void A00(AnonymousClass1a5 r8) {
        Fragment A012;
        BugReportComposerViewModel bugReportComposerViewModel = r8.A01;
        if (bugReportComposerViewModel != null) {
            boolean z = bugReportComposerViewModel.A07;
            C04530Oa r6 = r8.A04;
            UserSession A0X = AnonymousClass0wJ.A0X(r6);
            if (z) {
                String str = A0X.token;
                BugReport bugReport = r8.A00;
                if (bugReport != null) {
                    BugReportComposerViewModel bugReportComposerViewModel2 = r8.A01;
                    if (bugReportComposerViewModel2 != null) {
                        C04220Ms.A0B(str, 0);
                        A012 = new C22931bd();
                        Bundle A06 = C18180wK.A06();
                        C18190wL.A13(A06, str);
                        A06.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", bugReport);
                        A06.putParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", bugReportComposerViewModel2);
                        A012.setArguments(A06);
                    }
                }
                C04220Ms.A0E("bugReport");
                throw null;
            }
            String str2 = A0X.token;
            BugReport bugReport2 = r8.A00;
            if (bugReport2 != null) {
                BugReportComposerViewModel bugReportComposerViewModel3 = r8.A01;
                if (bugReportComposerViewModel3 != null) {
                    A012 = AnonymousClass1c2.A01(bugReport2, bugReportComposerViewModel3, C18180wK.A0X(), str2);
                }
            }
            C04220Ms.A0E("bugReport");
            throw null;
            C25786Drz A0Q = C18180wK.A0Q(r8.requireActivity(), AnonymousClass0wJ.A0U(r6));
            A0Q.A03 = A012;
            A0Q.A05();
            return;
        }
        C04220Ms.A0E("composerViewModel");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        BugReportComposerViewModel bugReportComposerViewModel;
        BugReport bugReport;
        int A022 = C14030oh.A02(1143056865);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (bugReportComposerViewModel = (BugReportComposerViewModel) bundle2.getParcelable("GDPRPrivacyCheckFragment.ARGUMENT_COMPOSER_VIEWMODEL")) == null) {
            illegalArgumentException = C18190wL.A0a("BugReportComposerViewModel is required in order to launch this screen");
            i = 271352917;
        } else {
            this.A01 = bugReportComposerViewModel;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (bugReport = (BugReport) bundle3.getParcelable("GDPRPrivacyCheckFragment.ARGUMENT_BUGREPORT")) == null) {
                illegalArgumentException = C18190wL.A0a("BugReport is required in order to launch this screen");
                i = -1710945694;
            } else {
                this.A00 = bugReport;
                C04530Oa r3 = this.A04;
                this.A02 = new C58533Ga(AnonymousClass0wJ.A0X(r3), "gdpr_consent_for_rageshake");
                this.A03 = C61593Uj.A04.A00(AnonymousClass0wJ.A0X(r3));
                C14030oh.A09(2023187409, A022);
                return;
            }
        }
        C14030oh.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-736561626);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.feedback_privacy_consent_screen, viewGroup, false);
        C14030oh.A09(-557830071, A022);
        return inflate;
    }
}

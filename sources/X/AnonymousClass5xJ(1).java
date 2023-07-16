package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;

/* renamed from: X.5xJ  reason: invalid class name */
public final class AnonymousClass5xJ extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "LeadGenFlaggedFormErrorFragment";
    public C133647w5 A00;
    public Long A01;
    public final C04530Oa A02 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "lead_gen_flagged_form_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        UserSession A0X = AnonymousClass0wJ.A0X(this.A02);
        FragmentActivity activity = getActivity();
        C04220Ms.A0B(A0X, 1);
        String A0k = AnonymousClass0wJ.A0k(requireContext, 2131829510);
        String A0l = AnonymousClass0wJ.A0l(requireContext, A0k, 2131829513);
        C04220Ms.A06(A0l);
        String A0k2 = AnonymousClass0wJ.A0k(requireContext, 2131829511);
        SpannableStringBuilder A012 = C25795Ds9.A01(requireContext, A0l);
        AnonymousClass3Zw.A01(A012, new AnonymousClass65N(activity, requireContext, A0X, "https://transparency.fb.com/policies/community-standards/", C18210wN.A01(requireContext)), A0k);
        A012.append(System.getProperty("line.separator"));
        A012.append(System.getProperty("line.separator"));
        A012.append(A0k2);
        ((IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.warning_headline)).setBody((CharSequence) A012);
        ((IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.action_bottom_button)).setPrimaryAction(getString(2131829512), C86134wK.A0P(this, 139));
        C86104wH.A1C(AnonymousClass0wJ.A0K(view, R.id.learn_more_button), 140, this);
        C133647w5 r1 = this.A00;
        if (r1 == null) {
            C04220Ms.A0E("logger");
            throw null;
        }
        C133647w5.A00(r1, this.A01, AnonymousClass000.A00(175), "flagged_form_warning_screen_impression", "impression", C86114wI.A0o("FLAGGED_FORM")).Bb4();
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.setTitle("");
            C25764Drc drc = new C25764Drc();
            drc.A04(R.drawable.instagram_arrow_back_24);
            AnonymousClass4u2.A03(drc, r3);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final boolean onBackPressed() {
        C133647w5 r3 = this.A00;
        if (r3 == null) {
            C04220Ms.A0E("logger");
            throw null;
        }
        C133647w5.A00(r3, this.A01, AnonymousClass000.A00(175), "cancel", "click", C86114wI.A0o("FLAGGED_FORM")).Bb4();
        C18180wK.A0Q(getActivity(), AnonymousClass0wJ.A0U(this.A02)).A0D((String) null, 0);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        Long l;
        int A022 = C14030oh.A02(1431128638);
        super.onCreate(bundle);
        C04530Oa r1 = this.A02;
        String A14 = C04620Ok.A00(AnonymousClass0wJ.A0X(r1)).A00.A14();
        if (A14 != null) {
            l = AnonymousClass0wJ.A0d(A14);
        } else {
            l = null;
        }
        this.A01 = l;
        this.A00 = new C133647w5(this, AnonymousClass0wJ.A0X(r1));
        C14030oh.A09(-96315852, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-873153192);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_flagged_form_view, viewGroup, false);
        C14030oh.A09(-1207172609, A022);
        return inflate;
    }
}

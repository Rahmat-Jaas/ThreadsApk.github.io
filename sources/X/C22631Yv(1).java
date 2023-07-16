package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.1Yv  reason: invalid class name and case insensitive filesystem */
public final class C22631Yv extends C34640IcN {
    public static final String __redex_internal_original_name = "ChangeAccountPrivacyFragment";
    public RadioButton A00;
    public RadioButton A01;
    public UserSession A02;
    public ProgressButton A03;
    public C67083yq A04;

    public final String getModuleName() {
        return "account_privacy_nux";
    }

    public static void A02(C22631Yv r2) {
        C169839tz r0;
        C82844qM r1;
        User A0Y = AnonymousClass0wJ.A0Y(r2.A02);
        if (r2.A00.isChecked()) {
            r0 = C169839tz.PrivacyStatusPrivate;
        } else {
            r0 = C169839tz.PrivacyStatusPublic;
        }
        A0Y.A20(r0);
        FragmentActivity activity = r2.getActivity();
        if (!(activity instanceof C82844qM) || (r1 = (C82844qM) activity) == null) {
            r2.A04.A01();
        } else {
            r1.Ben(1);
        }
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    private void A00(View view) {
        C18180wK.A0r(requireContext(), C18200wM.A0J(view, R.id.icon), R.drawable.instagram_unlock_pano_outline_24);
        AnonymousClass0wJ.A0L(view, R.id.title_view).setText(2131820877);
        AnonymousClass0wJ.A0L(view, R.id.content_view).setText(2131820878);
        this.A01 = (RadioButton) view.requireViewById(R.id.radio_button);
        AnonymousClass0wJ.A16(view, 601, this);
    }

    private void A01(View view, boolean z) {
        C18180wK.A0r(requireContext(), C18200wM.A0J(view, R.id.icon), R.drawable.instagram_lock_pano_outline_24);
        AnonymousClass0wJ.A0L(view, R.id.title_view).setText(2131820875);
        AnonymousClass0wJ.A0L(view, R.id.content_view).setText(2131820876);
        RadioButton radioButton = (RadioButton) view.requireViewById(R.id.radio_button);
        this.A00 = radioButton;
        radioButton.setChecked(z);
        AnonymousClass0wJ.A16(view, 600, this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(237585806);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(1282599101, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(167319104);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        boolean z = true;
        layoutInflater.inflate(R.layout.nux_change_account_privacy_fragment, C18190wL.A0E(A0H), true);
        User A0R = C18250wR.A0R(this.A02);
        if (A0R.A0e() == C169839tz.PrivacyStatusPublic) {
            z = false;
            Boolean B54 = A0R.A05.B54();
            if (B54 != null && B54.booleanValue()) {
                A00(A0H.requireViewById(R.id.top_option_container));
                A01(A0H.requireViewById(R.id.bottom_option_container), false);
                ProgressButton progressButton = (ProgressButton) A0H.requireViewById(R.id.progress_button);
                this.A03 = progressButton;
                progressButton.setEnabled(z);
                AnonymousClass0wJ.A18(this.A03, 149, A0R, this);
                AnonymousClass3YT.A00.A02(this.A02, "nux_account_privacy");
                UserSession userSession = this.A02;
                String userId = userSession.getUserId();
                boolean isChecked = this.A00.isChecked();
                C04220Ms.A0B(userId, 1);
                C54152yz.A00(userSession, Boolean.valueOf(isChecked), Boolean.valueOf(z), userId, "android_pbd_nux_impression");
                this.A04 = new C67083yq(this, this, this.A02);
                C14030oh.A09(753774414, A022);
                return A0H;
            }
        }
        A01(A0H.requireViewById(R.id.top_option_container), z);
        A00(A0H.requireViewById(R.id.bottom_option_container));
        ProgressButton progressButton2 = (ProgressButton) A0H.requireViewById(R.id.progress_button);
        this.A03 = progressButton2;
        progressButton2.setEnabled(z);
        AnonymousClass0wJ.A18(this.A03, 149, A0R, this);
        AnonymousClass3YT.A00.A02(this.A02, "nux_account_privacy");
        UserSession userSession2 = this.A02;
        String userId2 = userSession2.getUserId();
        boolean isChecked2 = this.A00.isChecked();
        C04220Ms.A0B(userId2, 1);
        C54152yz.A00(userSession2, Boolean.valueOf(isChecked2), Boolean.valueOf(z), userId2, "android_pbd_nux_impression");
        this.A04 = new C67083yq(this, this, this.A02);
        C14030oh.A09(753774414, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1662567347);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        C14030oh.A09(-1538899994, A022);
    }
}

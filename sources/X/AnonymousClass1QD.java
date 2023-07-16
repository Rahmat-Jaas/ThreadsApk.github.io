package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1QD  reason: invalid class name */
public final class AnonymousClass1QD extends AnonymousClass1QK implements C11630kW {
    public static final String __redex_internal_original_name = "IdVerificationPermissionsFragment";
    public C10300i6 A00;
    public UserSession A01 = null;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final String getModuleName() {
        return "selfie_permissions";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C31090GfY.A05((Button) AnonymousClass2CW.A00(view, R.id.btn_camera_access_allow));
        if (this.A05) {
            UserSession userSession = this.A01;
            userSession.getClass();
            C63133bc.A05(this, userSession, this.A02, "av_idv", "camera_permission_granting", this.A04);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2089666137);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C10300i6 A0S = C18190wL.A0S(requireArguments);
        this.A00 = A0S;
        if (A0S instanceof UserSession) {
            this.A01 = C05030Qo.A02(A0S);
        }
        this.A03 = requireArguments.getString("challenge_use_case");
        this.A02 = requireArguments.getString("av_session_id");
        this.A04 = requireArguments.getString("flow_id");
        this.A05 = C28174Ezk.A00(589).equals(this.A03);
        C14030oh.A09(-1896244941, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(826065864);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.id_verification_permission_layout);
        C14030oh.A09(1559980761, A022);
        return A0H;
    }
}

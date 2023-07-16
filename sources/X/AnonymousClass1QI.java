package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.1QI  reason: invalid class name */
public final class AnonymousClass1QI extends FLk implements C11630kW {
    public static final String __redex_internal_original_name = "IgSelfieCaptureOverlayFragment";
    public C10300i6 A00;
    public UserSession A01 = null;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final void A01() {
        if ("ig_age_verification".equals(this.A03)) {
            UserSession userSession = this.A01;
            userSession.getClass();
            C63133bc.A02(this, userSession, this.A02, "av_fbap", "capture_video_selfie", this.A04);
            AnonymousClass3LY.A00(this.A01).CWx(new C686945c(C32642Cq.A00(this.A05), "fbap"));
        }
    }

    public final String getModuleName() {
        return "selfie_capture";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-948039736);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getString("challenge_use_case");
        this.A02 = requireArguments.getString("av_session_id");
        this.A04 = requireArguments.getString("flow_id");
        this.A05 = requireArguments.getString("product_surface");
        C10300i6 A0S = C18190wL.A0S(requireArguments);
        this.A00 = A0S;
        if (A0S.isLoggedIn()) {
            this.A01 = C05030Qo.A02(A0S);
        }
        C14030oh.A09(1740144422, A022);
    }
}

package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Bo  reason: invalid class name and case insensitive filesystem */
public final class C69944Bo implements C83544ra {
    public final /* synthetic */ C22741Zh A00;

    public C69944Bo(C22741Zh r1) {
        this.A00 = r1;
    }

    public final void onFailure() {
        FragmentActivity requireActivity = this.A00.requireActivity();
        requireActivity.runOnUiThread(new AnonymousClass4P1(requireActivity));
    }

    public final void onSuccess() {
        C22741Zh r2 = this.A00;
        UserSession userSession = r2.A04;
        if (userSession == null) {
            C18210wN.A0m();
            throw null;
        }
        DA0.A00(userSession, "igd_nudity_detection_model_loading_nux");
        r2.requireActivity().runOnUiThread(new AnonymousClass4P2(r2));
        FragmentActivity requireActivity = r2.requireActivity();
        requireActivity.runOnUiThread(new AnonymousClass4P1(requireActivity));
    }
}

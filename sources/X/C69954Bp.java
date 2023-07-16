package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Bp  reason: invalid class name and case insensitive filesystem */
public final class C69954Bp implements C83544ra {
    public final /* synthetic */ C29061we A00;
    public final /* synthetic */ boolean A01;

    public C69954Bp(C29061we r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void onFailure() {
    }

    public final void onSuccess() {
        if (this.A01) {
            UserSession A0X = AnonymousClass0wJ.A0X(this.A00.A02);
            C04220Ms.A0B(A0X, 1);
            DA0.A00(A0X, "igd_nudity_detection_model_loading_settings");
        }
    }
}

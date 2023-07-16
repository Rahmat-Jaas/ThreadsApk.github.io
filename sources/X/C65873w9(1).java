package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.urlhandlers.infocenterfactexternal.InfoCenterFactExternalUrlHandlerActivity;

/* renamed from: X.3w9  reason: invalid class name and case insensitive filesystem */
public final class C65873w9 implements AnonymousClass054 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C12560m7 A01;
    public final /* synthetic */ InfoCenterFactExternalUrlHandlerActivity A02;

    public C65873w9(FragmentActivity fragmentActivity, C12560m7 r2, InfoCenterFactExternalUrlHandlerActivity infoCenterFactExternalUrlHandlerActivity) {
        this.A02 = infoCenterFactExternalUrlHandlerActivity;
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final void onBackStackChanged() {
        if (this.A01.A0I() <= 0) {
            this.A00.finish();
        }
    }
}

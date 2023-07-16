package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.81u  reason: invalid class name and case insensitive filesystem */
public final class C1361981u implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactNavigatorModule A01;

    public C1361981u(IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.A01 = igReactNavigatorModule;
        this.A00 = d;
    }

    public final void run() {
        FragmentActivity fragmentActivity;
        IgReactNavigatorModule igReactNavigatorModule = this.A01;
        Activity currentActivity = igReactNavigatorModule.getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) currentActivity) != null && igReactNavigatorModule.mIsHostResumed) {
            fragmentActivity.getSupportFragmentManager().A1C(Integer.toString((int) this.A00), 1);
        }
    }
}

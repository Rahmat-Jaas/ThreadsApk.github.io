package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.82c  reason: invalid class name and case insensitive filesystem */
public final class C1362782c implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactNavigatorModule A01;
    public final /* synthetic */ String A02;

    public C1362782c(IgReactNavigatorModule igReactNavigatorModule, String str, double d) {
        this.A01 = igReactNavigatorModule;
        this.A00 = d;
        this.A02 = str;
    }

    public final void run() {
        Activity currentActivity = this.A01.getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && currentActivity != null && C1186671u.A01(currentActivity, (int) this.A00)) {
            E2V.A03(currentActivity).setTitle(this.A02);
        }
    }
}

package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.80E  reason: invalid class name */
public final class AnonymousClass80E implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;

    public AnonymousClass80E(IgReactNavigatorModule igReactNavigatorModule) {
        this.A00 = igReactNavigatorModule;
    }

    public final void run() {
        Activity currentActivity = this.A00.getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && currentActivity != null) {
            currentActivity.finish();
        }
    }
}

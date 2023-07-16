package X;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.80D  reason: invalid class name */
public final class AnonymousClass80D implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;

    public AnonymousClass80D(IgReactNavigatorModule igReactNavigatorModule) {
        this.A00 = igReactNavigatorModule;
    }

    public final void run() {
        ComponentActivity componentActivity;
        Activity currentActivity = this.A00.getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && (componentActivity = (ComponentActivity) currentActivity) != null) {
            componentActivity.onBackPressed();
        }
    }
}

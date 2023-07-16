package X;

import android.app.Activity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.81s  reason: invalid class name and case insensitive filesystem */
public final class C1361781s implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;
    public final /* synthetic */ String A01;

    public C1361781s(IgReactNavigatorModule igReactNavigatorModule, String str) {
        this.A00 = igReactNavigatorModule;
        this.A01 = str;
    }

    public final void run() {
        IgReactNavigatorModule igReactNavigatorModule = this.A00;
        Activity currentActivity = igReactNavigatorModule.getCurrentActivity();
        if (currentActivity != null) {
            String str = this.A01;
            if (!C62513aA.A01(currentActivity, igReactNavigatorModule.mSession, str, "Navigation")) {
                AnonymousClass3RZ.A00();
                C37350Jpy jpy = new C37350Jpy(currentActivity, C05030Qo.A02(igReactNavigatorModule.mSession), C171209wF.A22, str);
                jpy.A07("Navigation");
                jpy.A04();
            }
        }
    }
}

package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4SK  reason: invalid class name */
public final class AnonymousClass4SK implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C25918DvM A01;
    public final /* synthetic */ UserSession A02;

    public AnonymousClass4SK(Activity activity, C25918DvM dvM, UserSession userSession) {
        this.A01 = dvM;
        this.A00 = activity;
        this.A02 = userSession;
    }

    public final void run() {
        C25918DvM dvM = this.A01;
        Activity activity = this.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            dvM.A05();
            AnonymousClass0wJ.A13(C63703i9.A00(C63703i9.A00, this.A02).edit(), "has_shown_igtv_shopping_creation_tooltip", true);
        }
    }
}

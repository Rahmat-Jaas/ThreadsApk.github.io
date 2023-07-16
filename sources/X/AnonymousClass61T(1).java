package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxFactoryShape218S0200000_4_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.61T  reason: invalid class name */
public final class AnonymousClass61T extends C12140lP {
    public final /* synthetic */ C34653Icf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61T(C34653Icf icf) {
        super("scheduleClipsDraftNotification", 875171464, 3, false, false);
        this.A00 = icf;
    }

    public final void loggedRun() {
        C34653Icf icf = this.A00;
        FragmentActivity activity = icf.getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && icf.mView != null && icf.isAdded() && !icf.mDetached && !icf.mRemoving && icf.mViewLifecycleOwnerLiveData.A08() != null) {
            Application application = activity.getApplication();
            C04220Ms.A06(application);
            UserSession userSession = icf.A0T;
            if (userSession != null) {
                AnonymousClass56V r3 = (AnonymousClass56V) AnonymousClass7IU.A00(new IDxFactoryShape218S0200000_4_I2(0, application, userSession), activity).A01(AnonymousClass56V.class);
                UserSession userSession2 = icf.A0T;
                if (userSession2 != null) {
                    AnonymousClass066 r1 = (AnonymousClass066) icf.mViewLifecycleOwnerLiveData.A08();
                    C04220Ms.A0B(r3, 3);
                    if (r1 != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        C63643hy.A05(new C1364782w(activity, r1, r3, userSession2));
                        return;
                    }
                    return;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }
}

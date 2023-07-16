package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.bloks.foa.screenqueries.screencontainer.ScreenContainerDelegate;

/* renamed from: X.3T2  reason: invalid class name */
public final class AnonymousClass3T2 {
    public Application.ActivityLifecycleCallbacks A00;
    public final int A01;
    public final FragmentActivity A02;
    public final C12560m7 A03;
    public final ScreenContainerDelegate A04;

    public static final void A00(AnonymousClass3T2 r2) {
        if (r2.A00 != null) {
            Context applicationContext = r2.A02.getApplicationContext();
            C04220Ms.A0C(applicationContext, AnonymousClass000.A00(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(r2.A00);
            r2.A00 = null;
        }
    }

    public AnonymousClass3T2(FragmentActivity fragmentActivity, C12560m7 r2, ScreenContainerDelegate screenContainerDelegate, int i) {
        this.A02 = fragmentActivity;
        this.A03 = r2;
        this.A04 = screenContainerDelegate;
        this.A01 = i;
    }
}

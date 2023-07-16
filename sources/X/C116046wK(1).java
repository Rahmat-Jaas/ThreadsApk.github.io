package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* renamed from: X.6wK  reason: invalid class name and case insensitive filesystem */
public final class C116046wK {
    public static final void A01(Activity activity, AnonymousClass060 r2) {
        C04220Ms.A0B(r2, 1);
        if (activity instanceof AnonymousClass066) {
            AnonymousClass062 lifecycle = ((AnonymousClass066) activity).getLifecycle();
            if (lifecycle instanceof C14340pE) {
                ((C14340pE) lifecycle).A09(r2);
            }
        }
    }

    public static final void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C116056wL.A00(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C86234wi(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

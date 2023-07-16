package X;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.4wi  reason: invalid class name and case insensitive filesystem */
public final class C86234wi extends Fragment {
    public AnonymousClass8dN A00;

    public static final void A00(Activity activity) {
        C116046wK.A00(activity);
    }

    private final void A01(AnonymousClass060 r3) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C04220Ms.A06(activity);
            C116046wK.A01(activity, r3);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A01(AnonymousClass060.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        A01(AnonymousClass060.ON_DESTROY);
        this.A00 = null;
    }

    public final void onPause() {
        super.onPause();
        A01(AnonymousClass060.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        AnonymousClass8dN r0 = this.A00;
        if (r0 != null) {
            ((C124057aR) r0).A00.A01();
        }
        A01(AnonymousClass060.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        AnonymousClass8dN r0 = this.A00;
        if (r0 != null) {
            C123907Zw r2 = ((C124057aR) r0).A00;
            int i = r2.A01 + 1;
            r2.A01 = i;
            if (i == 1 && r2.A04) {
                r2.A05.A09(AnonymousClass060.ON_START);
                r2.A04 = false;
            }
        }
        A01(AnonymousClass060.ON_START);
    }

    public final void onStop() {
        super.onStop();
        A01(AnonymousClass060.ON_STOP);
    }
}

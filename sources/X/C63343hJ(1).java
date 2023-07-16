package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.3hJ  reason: invalid class name and case insensitive filesystem */
public abstract class C63343hJ {
    public static C63343hJ A00;

    public abstract void addMemoryInfoToEvent(C15730rn r1);

    public abstract AnonymousClass6UG getFragmentFactory();

    public abstract L5O getPerformanceLogger(C10300i6 r1);

    public abstract boolean maybeRequestOverlayPermissions(Context context, Integer num);

    public abstract void navigateToReactNativeApp(C10300i6 r1, String str, Bundle bundle);

    public abstract C35068ImK newIgReactDelegate(Fragment fragment);

    public abstract AnonymousClass4u1 newReactNativeLauncher(C10300i6 r1);

    public abstract AnonymousClass4u1 newReactNativeLauncher(C10300i6 r1, String str);

    public abstract void preloadReactNativeBridge(C10300i6 r1);

    public static C71494Ja A00(BaseBundle baseBundle, C10300i6 r2, String str, String str2, String str3) {
        baseBundle.putString("invoice_id", str);
        baseBundle.putString("order_item_id", str2);
        baseBundle.putString("referrer", str3);
        getInstance();
        return new C71494Ja(r2);
    }

    public static synchronized C63343hJ getInstance() {
        C63343hJ r0;
        synchronized (C63343hJ.class) {
            r0 = A00;
        }
        return r0;
    }

    public static C71494Ja A01(C10300i6 r1) {
        getInstance();
        return new C71494Ja(r1);
    }

    public static void maybeAddMemoryInfoToEvent(C15730rn r0) {
    }

    public static void setInstance(C63343hJ r0) {
        A00 = r0;
    }
}

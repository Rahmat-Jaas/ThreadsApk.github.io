package X;

import android.app.Activity;

/* renamed from: X.1jw  reason: invalid class name and case insensitive filesystem */
public final class C24731jw extends C19819BBt {
    public Activity A00;

    public static void A01(C34640IcN icN) {
        C37063Jjq jjq = new C37063Jjq();
        jjq.A0D(new C24731jw(icN.getActivity()));
        icN.registerLifecycleListenerSet(jjq);
    }

    public C24731jw(Activity activity) {
        this.A00 = activity;
    }

    public static void A00(C34640IcN icN) {
        icN.registerLifecycleListener(new C24731jw(icN.getActivity()));
    }

    public static void A02(C34640IcN icN) {
        icN.registerLifecycleListener(new C24731jw(icN.requireActivity()));
    }
}

package X;

import android.os.Bundle;

/* renamed from: X.4PJ  reason: invalid class name */
public final class AnonymousClass4PJ implements Runnable {
    public final /* synthetic */ C23231co A00;

    public AnonymousClass4PJ(C23231co r1) {
        this.A00 = r1;
    }

    public final void run() {
        C23231co r4 = this.A00;
        r4.requireArguments().putBoolean("push_to_next", false);
        C25786Drz A002 = C63463hW.A00(r4.getActivity(), r4.A05);
        AnonymousClass1aA r2 = new AnonymousClass1aA();
        String string = r4.mArguments.getString("PHONE_NUMBER");
        String string2 = r4.mArguments.getString("COUNTRY_CODE");
        String string3 = r4.mArguments.getString("NATIONAL_NUMBER");
        Bundle bundle = r4.mArguments;
        AnonymousClass2SL.A00(bundle, string, string2, string3, true, false);
        A002.A0A(bundle, r2);
        A002.A0C(r4, 0);
        A002.A05();
    }
}

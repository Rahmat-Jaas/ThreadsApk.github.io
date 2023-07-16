package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4u1  reason: invalid class name */
public interface AnonymousClass4u1 {
    Bundle ABD();

    boolean BaN(Context context);

    AnonymousClass4u1 Cod(Bundle bundle);

    AnonymousClass4u1 CpK(String str);

    C25786Drz CxN(FragmentActivity fragmentActivity);

    static C25786Drz A00(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r4, String str) {
        bundle.putString("entryPoint", "instagram");
        bundle.putString("paymentAccountID", str);
        C63343hJ.getInstance();
        C71494Ja r1 = new C71494Ja(r4);
        r1.A07 = fragmentActivity.getString(2131833191);
        r1.Cod(bundle);
        r1.CpK("BillingASLDisplayIGRoute");
        return r1.CxN(fragmentActivity);
    }

    static void A01(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r4, String str, String str2) {
        bundle.putString(str, str2);
        C63343hJ.getInstance();
        C71494Ja r1 = new C71494Ja(r4);
        r1.A07 = fragmentActivity.getString(2131833462);
        r1.Cod(bundle);
        r1.CpK("BillingWizardIGRoute");
        r1.CxN(fragmentActivity).A05();
    }

    static void A02(Bundle bundle, FragmentActivity fragmentActivity, C71494Ja r3, int i) {
        r3.A07 = fragmentActivity.getString(i);
        r3.Cod(bundle);
        r3.CxN(fragmentActivity).A05();
    }
}

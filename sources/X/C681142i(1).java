package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42i  reason: invalid class name and case insensitive filesystem */
public final class C681142i implements C39528KvC {
    public final /* synthetic */ C34613Ibj A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C681142i(C34613Ibj ibj, String str, String str2, String str3) {
        this.A00 = ibj;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void onComplete() {
        C34613Ibj ibj = this.A00;
        FragmentActivity requireActivity = ibj.requireActivity();
        UserSession userSession = ibj.A0H;
        String str = "userSession";
        if (userSession != null) {
            C37352Jq1 jq1 = ibj.A08;
            if (jq1 == null) {
                str = "dataFetcher";
            } else {
                String A04 = jq1.A04(C35394Iu2.A19.toString(), this.A01);
                if (A04 != null) {
                    String str2 = this.A02;
                    UserSession userSession2 = ibj.A0H;
                    if (userSession2 != null) {
                        String str3 = C37741K2b.A01(userSession2).A03;
                        C04220Ms.A06(str3);
                        String str4 = this.A03;
                        Bundle A06 = C18180wK.A06();
                        A06.putString("paymentAccountID", A04);
                        A06.putString("contextID", str3);
                        A06.putString("placement", "ig");
                        A06.putString("wizardName", str2);
                        A06.putString("paymentMethodID", "");
                        if (str4 != null && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36328426822445471L)) {
                            A06.putString("jsonProps", str4);
                        }
                        C71494Ja A012 = C63343hJ.A01(userSession);
                        A012.Cod(A06);
                        A012.CpK("BillingWizardIGRoute");
                        A012.CxN(requireActivity).A05();
                        return;
                    }
                } else {
                    throw C18180wK.A0a("Ad Account ID is non null for payment flow");
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}

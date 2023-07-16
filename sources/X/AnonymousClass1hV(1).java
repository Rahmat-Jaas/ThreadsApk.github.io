package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hV  reason: invalid class name */
public final class AnonymousClass1hV extends C63873iU {
    public final /* synthetic */ C83614rh A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass1hV(C83614rh r1, UserSession userSession, String str, boolean z, boolean z2) {
        this.A01 = userSession;
        this.A04 = z;
        this.A02 = str;
        this.A03 = z2;
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A032 = C14030oh.A03(-1484516317);
        C83614rh r1 = this.A00;
        if (r1 != null) {
            r1.onFailure(r4.A01);
        }
        C14030oh.A0A(-1127274000, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(448830635);
        int A033 = C14030oh.A03(-2073001580);
        Object obj2 = ((AnonymousClass5z0) obj).A01;
        if (obj2 != null) {
            C85314ur r2 = (C85314ur) obj2;
            if (r2.Ao1() != null && AnonymousClass216.SUCCESS.equals(r2.Ao1().BDj())) {
                int count = r2.Ao1().getCount();
                C28161tl A012 = AnonymousClass3WS.A01(this.A01);
                if (this.A04) {
                    AnonymousClass0wJ.A13(C28161tl.A02(A012), "browser_autofill_consent_accepted", true);
                }
                if (this.A02.equals("CONTACT_AUTOFILL")) {
                    AnonymousClass0wJ.A11(C28161tl.A02(A012), "browser_consecutive_decline_autofill", count);
                } else {
                    boolean z = this.A03;
                    SharedPreferences sharedPreferences = A012.A00;
                    AnonymousClass0wJ.A13(sharedPreferences.edit(), "browser_autofill_payment_opt_in", z);
                    AnonymousClass0wJ.A11(sharedPreferences.edit(), "browser_autofill_payment_decline_count", count);
                }
                C83614rh r1 = this.A00;
                if (r1 != null) {
                    r1.CNK((Integer) null);
                }
            }
        }
        C14030oh.A0A(-1293729086, A033);
        C14030oh.A0A(1196086257, A032);
    }
}

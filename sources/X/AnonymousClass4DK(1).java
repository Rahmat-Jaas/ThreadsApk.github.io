package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.user.model.User;

/* renamed from: X.4DK  reason: invalid class name */
public final class AnonymousClass4DK implements C33516HpC {
    public final /* synthetic */ C29371xr A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass4DK(C29371xr r1, User user, String str, boolean z) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = str;
        this.A03 = z;
    }

    public final boolean onToggle(boolean z) {
        String str;
        C29371xr r7 = this.A00;
        String str2 = r7.A06;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r7.A03, "toggle_privacy_setting"), 2767);
        if (z) {
            str = "private";
        } else {
            str = "public";
        }
        A0I.A0T("change_privacy_option_to", str);
        A0I.A0T("qpid", str2);
        C18210wN.A1C(A0I, "privacy_updater");
        if (!r7.A07) {
            User user = this.A01;
            if (user.A0g() == AnonymousClass266.A04 || user.A0g() == AnonymousClass266.A05) {
                Dialog dialog = r7.A00;
                if (dialog == null) {
                    C25828Dsm A0V = AnonymousClass0wJ.A0V(r7.A02);
                    A0V.A0L(2131822767);
                    A0V.A0K(2131822768);
                    A0V.A0q(false);
                    C18180wK.A1M(A0V);
                    dialog = A0V.A0G();
                    r7.A00 = dialog;
                }
                C13950oZ.A00(dialog);
            } else {
                boolean z2 = true;
                r7.A07 = true;
                if (!z) {
                    C29371xr.A00(r7, user);
                    return z;
                }
                if (this.A02 == null) {
                    z2 = false;
                }
                boolean z3 = this.A03;
                C22302CTd cTd = r7.A02;
                Object systemService = cTd.requireContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(cTd.requireView().getWindowToken(), 0);
                C64633rJ r4 = new C64633rJ(r7, user, z2, z3);
                C37032Jj9 A0L = C18210wN.A0L(r7.A04);
                A0L.A0O = cTd.getString(2131835578);
                C18250wR.A1A(A0L, r7, 4);
                A0L.A0R = cTd.getString(2131835572);
                A0L.A0A = r4;
                A0L.A0d = false;
                C37383Jqm A002 = A0L.A00();
                A002.A0I(true);
                C18190wL.A10();
                Bundle A06 = C18180wK.A06();
                A06.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", true);
                C22441Yc r1 = new C22441Yc();
                r1.setArguments(A06);
                r1.A00 = r4;
                r1.A02 = r7.A08;
                C37383Jqm.A00(cTd.requireContext(), r1, A002);
                return false;
            }
        }
        return false;
    }
}

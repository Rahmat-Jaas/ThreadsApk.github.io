package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yr  reason: invalid class name and case insensitive filesystem */
public final class C67093yr implements CallerContextable {
    public static final String __redex_internal_original_name = "PromoteReactBridgingUtil";

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, str);
        AnonymousClass4u1.A00(C18180wK.A06(), fragmentActivity, userSession, str).A05();
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, str);
        Bundle A06 = C18180wK.A06();
        A06.putString("entryPoint", "instagram");
        A06.putString("paymentAccountID", str);
        C71494Ja A01 = C63343hJ.A01(userSession);
        A01.A07 = fragmentActivity.getString(2131833462);
        A01.Cod(A06);
        A01.CpK("AdsPaymentsPayNowRoute");
        A01.CxN(fragmentActivity).A05();
    }
}

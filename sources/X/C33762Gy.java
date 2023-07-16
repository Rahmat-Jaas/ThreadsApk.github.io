package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Gy  reason: invalid class name and case insensitive filesystem */
public final class C33762Gy {
    public static final Object A00(AnonymousClass601 r4, C63893iY r5) {
        Object A0B = C63893iY.A0B(r5, AnonymousClass0wJ.A1Z(r5, r4) ? 1 : 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        if (A0B.equals("pro2pro_ads_payments_ad_account_linking")) {
            C10300i6 A0F = C63913ic.A0F(r4);
            C18190wL.A10();
            AnonymousClass0wJ.A19(new C35199Ipr(), C63913ic.A05(r4), A0F);
            return null;
        } else if (A0B.equals("pro2pro_ads_payments_ad_account_switching")) {
            UserSession userSession = (UserSession) C63913ic.A0F(r4);
            C12560m7 parentFragmentManager = C63913ic.A01(r4).getParentFragmentManager();
            while (parentFragmentManager.A0I() > 0) {
                AnonymousClass051 r0 = (AnonymousClass051) parentFragmentManager.A0D.get(parentFragmentManager.A0I() - 1);
                C04220Ms.A06(r0);
                if (C04220Ms.A0I(((AnonymousClass05O) r0).A0A, "PromotePaymentsInterstitialFragment.BACK_STACK_NAME")) {
                    break;
                }
                parentFragmentManager.A16();
            }
            FragmentActivity A05 = C63913ic.A05(r4);
            C04220Ms.A0C(A05, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            AnonymousClass3LB.A01((BaseFragmentActivity) A05, userSession, I17.A00(652));
            return null;
        } else if (!A0B.equals("ad_tools_prevalidation")) {
            return null;
        } else {
            AnonymousClass3LY.A00(C63913ic.A0F(r4)).CWx(new C687245f());
            AnonymousClass3WA.A00(C63913ic.A05(r4), C63913ic.A01(r4).getParentFragmentManager());
            return null;
        }
    }
}

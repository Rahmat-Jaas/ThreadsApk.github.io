package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.3zJ  reason: invalid class name and case insensitive filesystem */
public final class C67293zJ implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67293zJ.class);
    public static final String __redex_internal_original_name = "BusinessConversionControllerUtil";

    public static BusinessFlowAnalyticsLogger A00(C84654td r2, C11630kW r3, C10300i6 r4) {
        C311924p Aiz;
        String A0q;
        if (r2 == null) {
            Aiz = C311924p.EDIT_PROFILE;
            A0q = null;
        } else {
            Aiz = r2.Aiz();
            A0q = C18200wM.A0q(((BusinessConversionActivity) r2).A0B);
        }
        return C37076Jk8.A00(Aiz, r3, r4, A0q);
    }

    public static String A03(C84654td r2, C10300i6 r3) {
        String A002 = C61853Wb.A00(A00, r3, "ig_professional_conversion_flow");
        if (A002 != null) {
            return A002;
        }
        if (r2 != null) {
            return AnonymousClass0wJ.A0R(r2).A0C;
        }
        return null;
    }

    public static boolean A04(C84654td r2) {
        if ((r2 == null || (r2.Aiz() != C311924p.INTEREST_ACCOUNT_CONVERSION && r2.Aiz() != C311924p.RENEW_PROFESSIONAL_ACCOUNT && r2.Aiz() != C311924p.CONVERSION_FLOW)) && !A05(r2)) {
            return false;
        }
        return true;
    }

    public static boolean A05(C84654td r2) {
        if (r2 == null || r2.Aiz() != C311924p.CREATOR_CONVERSION_FLOW) {
            return false;
        }
        return true;
    }

    public static boolean A06(C84654td r2) {
        if (r2 == null) {
            return false;
        }
        if (r2.Aiz() == C311924p.PROFESSIONAL_SIGNUP_FLOW || r2.Aiz() == C311924p.BUSINESS_SIGNUP_FLOW || r2.Aiz() == C311924p.CREATOR_SIGNUP_FLOW) {
            return true;
        }
        return false;
    }

    public static C84654td A01(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof C84654td) {
            return (C84654td) activity;
        }
        return null;
    }

    public static String A02(C84654td r1) {
        if (r1.Abh() == null) {
            return null;
        }
        return r1.Abh().A00;
    }
}

package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import com.instagram.payout.activity.PayoutOnboardingFlowActivity;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.6Tl  reason: invalid class name and case insensitive filesystem */
public final class C102006Tl {
    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = str;
        AnonymousClass0wJ.A1Q(userSession, str);
        C04220Ms.A0B(userMonetizationProductType, 4);
        C132097tJ A02 = C25584DoK.A02(userSession);
        C35424Iut A00 = C25584DoK.A00(userMonetizationProductType);
        C35421Iuq A01 = C25584DoK.A01(userMonetizationProductType);
        D38 d38 = D38.START;
        AnonymousClass6BH r5 = AnonymousClass6BH.PAYOUTS_ONBOARDING;
        String str8 = null;
        if (str2 != null) {
            str6 = C18220wO.A0u(Locale.ROOT, str2);
        } else {
            str6 = null;
        }
        A02.A02(A00, A01, d38, r5, str7, str6, (String) null);
        DDJ.A00();
        Intent intent = new Intent(fragmentActivity, PayoutOnboardingFlowActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.getUserId());
        intent.putExtra(C18170wI.A00(250), userMonetizationProductType.A00);
        if (str2 != null) {
            str8 = C86114wI.A0o(str2);
        }
        intent.putExtra("ARGUMENT_ORIGIN", str8);
        intent.putExtra("ARGUMENT_DEAL_ID", str3);
        intent.putExtra("ARGUMENT_FE_ID", str4);
        intent.putExtra(AnonymousClass3QB.A00(9, 10, 62), str5);
        intent.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        if (fragment != null) {
            C10650ih.A0E(intent, fragment, 8888);
        } else {
            C10650ih.A08(fragmentActivity, intent, 8888);
        }
        fragmentActivity.overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}

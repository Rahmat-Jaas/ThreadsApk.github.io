package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.sessionscoped.IDxACallbackShape102S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2NP  reason: invalid class name */
public final class AnonymousClass2NP {
    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, C11630kW r14, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        AnonymousClass0wJ.A1M(userSession, 0, fragment);
        C11630kW r6 = r14;
        C18180wK.A1R(r14, str2);
        String str3 = str;
        if (str != null) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (fragmentActivity != null) {
                C62873b3.A03(r6, userSession2, AnonymousClass006.A0Y, (Integer) null, (Integer) null, str3, (String) null, (Throwable) null, AnonymousClass4WK.A0O(C18180wK.A0p("surface", "user_profile")), 992);
                C61873Wd.A02(fragmentActivity2.getSupportFragmentManager());
                List A0n = C18180wK.A0n(str3);
                AnonymousClass4BN r4 = new AnonymousClass4BN(fragmentActivity2, r6, userSession2);
                String valueOf = String.valueOf(AnonymousClass0Ix.A00());
                H1T A0O = AnonymousClass0wJ.A0O(userSession2);
                C18190wL.A1N(A0O, A0n, valueOf);
                A0O.A0R("is_partnership_folder", true);
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    A0O.A0O("thread_title", (String) null);
                }
                C32165H8c A02 = A0O.A02();
                A02.A00 = new IDxACallbackShape102S0100000_1_I2(userSession2, r4, 0);
                C31155GhB.A03(A02);
                return;
            }
        }
        Context requireContext = fragment.requireContext();
        C10450iM.A03("PartnershipThreadLauncher", "Unable create BC partnership thread");
        C63813iO.A09(requireContext);
    }
}

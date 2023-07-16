package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3z3  reason: invalid class name */
public final class AnonymousClass3z3 implements CallerContextable {
    public static final String __redex_internal_original_name = "OnboardingStepNavigator";
    public final C82844qM A00;

    public AnonymousClass3z3(C82844qM r1) {
        this.A00 = r1;
    }

    public static final Bundle A00(C67073yp r3) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession userSession = r3.A00;
        if (userSession != null) {
            C05050Qq.A00(A06, userSession);
        }
        return A06;
    }

    public static final void A01(Fragment fragment, FragmentActivity fragmentActivity, C67073yp r4, String str) {
        fragment.requireArguments().putAll(A00(r4));
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r4.A00);
        A0Q.A03 = fragment;
        A0Q.A0B = true;
        if (str != null) {
            A0Q.A07 = str;
        }
        A0Q.A05();
    }
}

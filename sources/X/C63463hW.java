package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3hW  reason: invalid class name and case insensitive filesystem */
public final class C63463hW {
    public static C63463hW A01;
    public C61753Vf A00;

    public static C25786Drz A00(FragmentActivity fragmentActivity, C10300i6 r3) {
        C25786Drz drz = new C25786Drz(fragmentActivity, r3);
        A02().A06();
        return drz;
    }

    public static synchronized C63463hW A02() {
        C63463hW r0;
        synchronized (C63463hW.class) {
            r0 = A01;
        }
        return r0;
    }

    public static void A04(Context context, C10300i6 r13, C63463hW r14, C313625r r15, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4) {
        C67073yp r11 = new C67073yp();
        C313625r r3 = r15;
        r11.A01 = r15;
        Integer num3 = num;
        r11.A02 = num3;
        r11.A04 = z4;
        C10300i6 r2 = r13;
        if (r13 instanceof UserSession) {
            r11.A00 = C05030Qo.A02(r13);
        }
        Context context2 = context;
        ArrayList A0s = C18200wM.A0s(C27551sh.A00(context, r13, r11, (C82834qL) null).A04.values());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C32165H8c A002 = C60013Nh.A00(context2, r2, r3, num2, num3, A0s, z, z2, AnonymousClass0wJ.A1W(C63443hU.A00()), z3);
        A002.A00 = new AnonymousClass1h5(context2, r2, r14, r11, elapsedRealtime);
        C31155GhB.A03(A002);
    }

    public final C61753Vf A06() {
        C61753Vf r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C61753Vf r02 = new C61753Vf();
        this.A00 = r02;
        return r02;
    }

    public final void A07(Context context, C10300i6 r12, C313625r r13, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = context;
        C10300i6 r1 = r12;
        A04(context2, r1, this, r13, (Integer) null, AnonymousClass006.A00, z, z2, z3, z4);
    }

    public final void A08(Context context, C82834qL r15, UserSession userSession, C313625r r17, Integer num, Integer num2, boolean z) {
        C67073yp r1 = new C67073yp();
        UserSession userSession2 = userSession;
        r1.A00 = userSession2;
        C313625r r6 = r17;
        r1.A01 = r6;
        Integer num3 = num;
        r1.A02 = num3;
        boolean z2 = z;
        r1.A04 = z2;
        Integer num4 = AnonymousClass006.A01;
        Context context2 = context;
        Integer num5 = num2;
        if (num5 != num4) {
            A04(context2, userSession2, this, r6, num3, num4, false, r1.A00(), true, z2);
        }
        C27551sh.A01(context.getApplicationContext(), userSession2, r1, r15, num5);
        A05(userSession2, context, z2);
    }

    public final void A09(Context context, C82834qL r10, UserSession userSession, C313625r r12, boolean z) {
        A08(context, r10, userSession, r12, (Integer) null, AnonymousClass006.A00, z);
    }

    public static C61753Vf A01() {
        return A02().A06();
    }

    public static void A03() {
        A02().A06();
    }

    public static void A05(UserSession userSession, Context context, boolean z) {
        Intent intent = C18230wP.A0B().setClass(context, OnboardingActivity.class);
        intent.putExtra("IS_SIGN_UP_FLOW", true);
        C18230wP.A12(intent, userSession);
        C10650ih.A02(context, intent);
        if (z && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(R.anim.cds_slide_in_right, R.anim.cds_slide_out_left);
        }
    }
}

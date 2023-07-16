package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCBackShape81S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Iv  reason: invalid class name and case insensitive filesystem */
public final class C34252Iv {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        AnonymousClass601 r3 = r19;
        C63893iY r2 = r20;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r3);
        String A0E = C63893iY.A0E(r2, A1Z ? 1 : 0);
        Object A09 = C63893iY.A09(r2);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type kotlin.Number");
        int A04 = AnonymousClass0wJ.A04(A09);
        int A042 = AnonymousClass0wJ.A04(C63893iY.A0C(r2, "null cannot be cast to non-null type kotlin.Number", 3));
        UserSession userSession = (UserSession) C63913ic.A0F(r3);
        FragmentActivity A05 = C63913ic.A05(r3);
        FragmentActivity A052 = C63913ic.A05(r3);
        C10300i6 A0F = C63913ic.A0F(r3);
        long A08 = C18240wQ.A08(C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316134626102240L) ? 1 : 0);
        long j = ((long) A042) / 60;
        if (A04 == 0) {
            AnonymousClass0wJ.A12(C62803am.A00(C63043bN.A01, userSession), "DAILY_QUOTA", A08 * j);
            C63583hq.A06(userSession, "daily_limit", j, 0);
            return null;
        } else if (A04 != A1Z) {
            return null;
        } else {
            C62803am r11 = C63043bN.A01;
            long A053 = r11.A05(userSession);
            boolean A0I = C04220Ms.A0I(A0E, "ig_setting_shortcuts");
            if (A053 <= 0 || A0I) {
                AnonymousClass0wJ.A12(C62803am.A00(r11, userSession), "TAKE_A_BREAK", j * A08);
                long A054 = r11.A05(userSession);
                C696349j.A03(userSession).A0L();
                if (!A0I) {
                    FragmentActivity fragmentActivity = A052;
                    C10300i6 r12 = A0F;
                    String str = A0E;
                    FragmentActivity fragmentActivity2 = A05;
                    AnonymousClass3Zz.A02(fragmentActivity2, fragmentActivity, r12, userSession, str, (A054 / A08) * 60);
                }
                C63583hq.A06(userSession, "take_break", j, 0);
                return null;
            }
            Drawable drawable = A05.getDrawable(R.drawable.instagram_clock_dotted_pano_outline_24);
            C63733iD A01 = C63733iD.A01();
            C63733iD.A07(A05, A01, 2131836605);
            ImageView imageView = E2V.A03(A052).A0P;
            C04220Ms.A06(imageView);
            A01.A0K = A1Z;
            A01.A04 = imageView;
            A01.A0D = AnonymousClass0wJ.A0k(A05, 2131826643);
            A01.A07 = new IDxCBackShape81S0300000_1_I2(2, A052, A0F, userSession);
            if (drawable != null) {
                C63733iD.A05(A05, drawable, A01);
            }
            A01.A0E(AnonymousClass22b.ICON);
            A01.A0I = A1Z;
            A01.A0C();
            C63733iD.A09(C38040KHr.A01, A01);
            C04220Ms.A0B(userSession, 0);
            boolean z = A1Z;
            C63583hq.A04(userSession, AnonymousClass006.A0Q, (Integer) null, (Long) null, (Long) null, (Long) null, "take_break", z);
            return null;
        }
    }
}

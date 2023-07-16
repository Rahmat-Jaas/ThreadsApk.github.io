package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape0S2410000_3_I2;
import com.instagram.service.session.UserSession;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7GJ  reason: invalid class name */
public final class AnonymousClass7GJ {
    public static final AtomicBoolean A00 = C18230wP.A0w();

    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass601 r9, UserSession userSession, String str, boolean z) {
        AnonymousClass0wJ.A1N(userSession, fragmentActivity);
        C04220Ms.A0B(str, 3);
        String A0n = C18190wL.A0n(UUID.randomUUID());
        C19877BEd A002 = AnonymousClass706.A00(userSession);
        C32165H8c A03 = C19482Ax5.A03(userSession, str);
        C145538kf A0H = C63913ic.A0H(r9);
        A03.A00 = new IDxACallbackShape0S2410000_3_I2(fragmentActivity, A002, r9, userSession, A0n, str, 1, z);
        A0H.schedule(A03);
    }

    public static final void A01(AnonymousClass601 r9, C109326jp r10, AnonymousClass24E r11, String str, boolean z) {
        AnonymousClass601 r4 = r9;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, str);
        AnonymousClass24E r7 = r11;
        C04220Ms.A0B(r11, 4);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r4));
        String A0n = C18190wL.A0n(UUID.randomUUID());
        C19877BEd A002 = AnonymousClass706.A00(A02);
        if (!A00.getAndSet(A1Z)) {
            H1T A0O = C18180wK.A0O(A02);
            A0O.A0T(AnonymousClass000.A00(397), str);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C156169Me.class, C19265AtU.class);
            C145538kf A0H = C63913ic.A0H(r4);
            A0T.A00 = new C157859Tz(A002, r4, r10, A02, r7, A0n, str2, z);
            A0H.schedule(A0T);
        }
    }

    public static final void A02(AnonymousClass601 r9, C109326jp r10, String str, boolean z) {
        String str2 = str;
        C04220Ms.A0B(str, 1);
        AnonymousClass601 r5 = r9;
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r9));
        String A0n = C18190wL.A0n(UUID.randomUUID());
        C19877BEd A002 = AnonymousClass706.A00(A02);
        if (!A00.getAndSet(true)) {
            H1T A0O = C18180wK.A0O(A02);
            A0O.A0T(AnonymousClass000.A00(397), str);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C156169Me.class, C19265AtU.class);
            C145538kf A0H = C63913ic.A0H(r9);
            A0T.A00 = new IDxACallbackShape0S2410000_3_I2(r10, A002, r5, A02, A0n, str2, 0, z);
            A0H.schedule(A0T);
        }
    }
}

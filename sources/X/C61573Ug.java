package X;

import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67;

/* renamed from: X.3Ug  reason: invalid class name and case insensitive filesystem */
public final class C61573Ug {
    public final C30938GbW A00 = C29781Fu1.A00();
    public final UserSession A01;
    public final C23411dm A02;

    public static void A00(C61573Ug r5, Map map) {
        C23411dm r3 = r5.A02;
        C18330wh A012 = C18330wh.A01(r3);
        C18330wh.A02(r3.requireActivity(), A012, 2131830080);
        C13950oZ.A00(A012);
        AnonymousClass4A9 A002 = C63263h8.A00(r5.A01, "com.instagram.portable.settings.help.open_screen_async_action", map);
        AnonymousClass4A9.A01(A002, A012, r5, 17);
        r3.schedule(A002);
    }

    public C61573Ug(UserSession userSession, C23411dm r3) {
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void A01(List list) {
        AnonymousClass4MA.A04(this, list, 168, 2131834818);
        UserSession userSession = this.A01;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, userSession, 36314764531468433L)) {
            AnonymousClass4MA.A04(this, list, 165, 2131824648);
        }
        AnonymousClass4MA.A04(this, list, 166, 2131829092);
        AnonymousClass4MA.A04(this, list, 169, 2131836451);
        AnonymousClass4MA.A04(this, list, 167, 2131832767);
        if (C63803iN.A0E(r3, userSession, 36314708696893567L) && C59623Lo.A01(AnonymousClass0wJ.A0Y(userSession))) {
            C04220Ms.A0B(userSession, 0);
            C58313Ey r32 = (C58313Ey) userSession.A01(C58313Ey.class, new KtLambdaShape87S0100000_I2_67(userSession, 3));
            r32.A00(C315828e.IMPRESSION, AnonymousClass29T.MONETIZATION_HELP, "entrypoint");
            list.add(AnonymousClass4MA.A00(C18200wM.A0R(r32, this, 191), 2131830680));
        }
    }
}

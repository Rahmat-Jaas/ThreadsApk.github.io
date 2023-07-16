package X;

import com.instagram.common.task.IDxLTaskShape133S0100000_1_I2;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.44Z  reason: invalid class name */
public final class AnonymousClass44Z implements C11630kW, AnonymousClass0i4, C10270i0 {
    public static final String __redex_internal_original_name = "QuietModeServiceHandler";
    public final UserSession A00;

    public static void A00(UserSession userSession, UserSession userSession2, User user, AnonymousClass44Z r32) {
        UserSession userSession3 = userSession;
        if (C63803iN.A0E(C18250wR.A0D(userSession3, 0), userSession3, 36320360875038652L)) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            UserSession userSession4 = userSession2;
            User user2 = user;
            boolean A0F = C63823iP.A0F(userSession4, user2, currentTimeMillis);
            boolean A2w = AnonymousClass0wJ.A0Y(userSession4).A2w();
            AnonymousClass44Z r5 = r32;
            if (A0F) {
                C25602Dod.A00(false);
                AnonymousClass0wJ.A1N(userSession3, r5);
                AnonymousClass3Ui.A00(new AnonymousClass3Ui(r5, userSession3), C63823iP.A06(userSession3, 0), Boolean.valueOf(AnonymousClass0wJ.A0Y(userSession4).A2w()), (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_sound_turned_off", "service_handler", (Map) null, 4080);
                long A03 = C63823iP.A03(userSession4, user2);
                long A0A = AnonymousClass0wJ.A0A() / 1000;
                if ((System.currentTimeMillis() / 1000) - A0A > A03) {
                    A0A += A03;
                    A03 = SandboxRepository.CACHE_TTL;
                }
                long j = ((A0A + A03) - currentTimeMillis) + 1;
                C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r5, 4), 1039187132, 3, (int) (j * 1000), false, true);
                AnonymousClass0wJ.A1N(userSession3, r5);
                AnonymousClass3Ui r2 = new AnonymousClass3Ui(r5, userSession3);
                AnonymousClass3Ui r19 = r2;
                AnonymousClass3Ui.A00(r19, C63823iP.A06(userSession3, 0), Boolean.valueOf(AnonymousClass0wJ.A0Y(userSession4).A2w()), (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_schedule_sound_turn_on", "service_handler", AnonymousClass4WK.A0O(C18180wK.A0p("seconds_till_next_quiet_mode_end", String.valueOf((int) j))), 3952);
            } else if (A2w) {
                long A04 = C63823iP.A04(userSession4, user2);
                long A0A2 = AnonymousClass0wJ.A0A() / 1000;
                if ((System.currentTimeMillis() / 1000) - A0A2 > A04) {
                    A0A2 += A04;
                    A04 = SandboxRepository.CACHE_TTL;
                }
                long currentTimeMillis2 = ((A0A2 + A04) - (System.currentTimeMillis() / 1000)) + 1;
                C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r5, 4), 1039187132, 3, (int) (currentTimeMillis2 * 1000), false, true);
                AnonymousClass0wJ.A1N(userSession3, r5);
                AnonymousClass3Ui r22 = new AnonymousClass3Ui(r5, userSession3);
                AnonymousClass3Ui r192 = r22;
                AnonymousClass3Ui.A00(r192, C63823iP.A05(userSession3), Boolean.valueOf(AnonymousClass0wJ.A0Y(userSession4).A2w()), (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_schedule_sound_turn_off", "service_handler", AnonymousClass4WK.A0O(C18180wK.A0p("seconds_till_quiet_mode_start", String.valueOf((int) currentTimeMillis2))), 3952);
            } else {
                AnonymousClass0wJ.A1N(userSession3, r5);
                AnonymousClass3Ui.A00(new AnonymousClass3Ui(r5, userSession3), C63823iP.A05(userSession3), Boolean.valueOf(AnonymousClass0wJ.A0Y(userSession4).A2w()), (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_sound_turn_off_no_scheduling", "service_handler", (Map) null, 4080);
            }
        }
    }

    public final void Bks(C10300i6 r1) {
    }

    public final void Bku(C10300i6 r5) {
        C04220Ms.A0B(r5, 0);
        if (r5 instanceof UserSession) {
            UserSession userSession = (UserSession) r5;
            C04220Ms.A0B(userSession, 1);
            User A0Y = AnonymousClass0wJ.A0Y(userSession);
            if (AnonymousClass0wJ.A0Y(userSession).A2w() && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320360875038652L)) {
                A00(userSession, userSession, A0Y, this);
            }
        }
    }

    public final String getModuleName() {
        return "quiet_mode_service_handler";
    }

    public final void onSessionWillEnd() {
    }

    public AnonymousClass44Z(UserSession userSession) {
        this.A00 = userSession;
    }
}

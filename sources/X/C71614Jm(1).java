package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Jm  reason: invalid class name and case insensitive filesystem */
public final class C71614Jm implements C0N, CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C71614Jm.class);
    public static final String __redex_internal_original_name = "OneTapFBShareTooltipDelegate";

    public final BO8 BHM(BKH bkh, C1525190h r3, UserSession userSession) {
        return null;
    }

    public final D0f BHN() {
        return D0f.ABOVE_ANCHOR;
    }

    public final View BHL(BKH bkh, C1525190h r3) {
        return r3.A03();
    }

    public final C27828Etx BHO(Context context, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        return new C26431qd((CharSequence) context.getString(2131835667));
    }

    public final void CPT(C11630kW r8, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        AnonymousClass0wJ.A12(C28161tl.A02(A01), "reel_one_tap_fbshare_tooltip_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        AnonymousClass0wJ.A14(A01.A00, "reel_one_tap_fbshare_tooltip_count", 0);
        AnonymousClass2AC r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_TOOLTIP;
        AnonymousClass2AD r4 = AnonymousClass2AD.A0a;
        AnonymousClass29W r3 = AnonymousClass29W.VIEW;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        C67343zO.A00(A002, userSession);
        C18210wN.A1D(A002, (long) C28161tl.A04(userSession).getInt("reel_one_tap_fbshare_tooltip_count", 0));
        C49322rC.A00(r5, r3, r4, A002, userSession);
    }

    public final boolean Ct9(BKH bkh, C19589Ayp ayp, C1525190h r8, UserSession userSession) {
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        View A03 = r8.A03();
        if (A03 != null && !A03.isSelected()) {
            SharedPreferences sharedPreferences = A01.A00;
            if (C18190wL.A04(sharedPreferences, "reel_one_tap_fbshare_tooltip_count") < 3) {
                long j = sharedPreferences.getLong("reel_one_tap_fbshare_tooltip_last_seen_sec", 0);
                if (j == 0 || C18180wK.A04() - j > 604800) {
                    if (!C63423hS.A03(AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_TOOLTIP, AnonymousClass2AD.A0a, userSession)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

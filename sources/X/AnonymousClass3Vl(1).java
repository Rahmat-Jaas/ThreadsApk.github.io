package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObjectShape132S0200000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape44S0200000_I2_5;

/* renamed from: X.3Vl  reason: invalid class name */
public final class AnonymousClass3Vl {
    public static AnonymousClass3Vl A01;
    public final C04530Oa A00 = C62373Zc.A03(C75864cw.A00);

    public final void A02(Context context, UserSession userSession, Integer num, AnonymousClass0YY r12) {
        String str;
        C04220Ms.A0B(r12, 3);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A0P = "com.bloks.www.ig_subscriptions.creator_experience.subscribe_cta_settings";
        AnonymousClass3CA r4 = new AnonymousClass3CA(context);
        if (num.intValue() != 0) {
            str = "settings";
        } else {
            str = "edit_highlight";
        }
        Map map = r4.A02;
        map.put("origin", str);
        map.put("callback", new AnonymousClass7EF(new IDxObjectShape132S0200000_1_I2(1, r4, new KtLambdaShape44S0200000_I2_5(22, userSession, r12))));
        C63743iE A05 = C63743iE.A05("com.bloks.www.ig_subscriptions.creator_experience.subscribe_cta_settings", C37067Jjv.A02(r4.A03), map);
        A05.A03 = null;
        A05.A02 = null;
        A05.A04 = null;
        A05.A0G(r4.A01);
        A05.A0C(r4.A00, A0N);
    }

    public final void A03(FragmentActivity fragmentActivity, UserSession userSession, C21659By5 by5, String str, String str2) {
        C04220Ms.A0B(userSession, 1);
        AnonymousClass0wJ.A1Q(str, str2);
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0e = true;
        A0L.A00 = 0.9f;
        A0L.A0J = by5;
        C37383Jqm A002 = A0L.A00();
        A01();
        Bundle A06 = C18180wK.A06();
        A00(A06, userSession, str, str2, true);
        C23041bp r0 = new C23041bp();
        r0.setArguments(A06);
        C37383Jqm.A00(fragmentActivity, r0, A002);
    }

    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, Boolean bool, Boolean bool2, String str, String str2) {
        C04220Ms.A0B(fragmentActivity, 0);
        AnonymousClass0wJ.A1O(userSession, str);
        C04220Ms.A0B(str2, 3);
        Bundle A06 = C18180wK.A06();
        A00(A06, userSession, str, str2, false);
        if (bool != null) {
            A06.putBoolean("arg_is_subscribed", bool.booleanValue());
        }
        if (bool2 != null) {
            A06.putBoolean("arg_is_eligible_to_subscribe", bool2.booleanValue());
        }
        C63863iT.A0A(fragmentActivity, A06, userSession, "fan_club_consideration");
    }

    public final void A05(C37383Jqm jqm, C37032Jj9 jj9, UserSession userSession, String str, String str2) {
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, str);
        C04220Ms.A0B(str2, 2);
        A01();
        Bundle A06 = C18180wK.A06();
        A00(A06, userSession, str, str2, A1Z);
        C23041bp r0 = new C23041bp();
        r0.setArguments(A06);
        jqm.A0A(r0, jj9, false);
    }

    public final C58783Hg A01() {
        return (C58783Hg) this.A00.getValue();
    }

    public static void A00(Bundle bundle, C10300i6 r2, String str, String str2, boolean z) {
        AnonymousClass3W9.A01(bundle, r2);
        bundle.putString("creator_user_id", str);
        bundle.putString("origin", str2);
        bundle.putBoolean("is_bottom_sheet", z);
    }
}

package X;

import android.app.Activity;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.avatars.bloks.AvatarEditorIntentHelper$Companion$launcherEditor$1;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.3DW  reason: invalid class name */
public final class AnonymousClass3DW {
    public final void A00(Activity activity, C27930Evg evg, UserSession userSession, String str, String str2, String str3, List list, boolean z) {
        Integer num;
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 0);
        String str4 = str;
        String str5 = str2;
        AnonymousClass0wJ.A1Q(str4, str5);
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36316564122832046L);
        Boolean valueOf = Boolean.valueOf(A0E);
        Integer num2 = C66883yU.A0F;
        Integer num3 = AnonymousClass006.A00;
        Integer num4 = AnonymousClass006.A0C;
        if (A0E) {
            num = AnonymousClass006.A0N;
        } else {
            num = num3;
        }
        C66883yU r9 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, num4, num, num2, num3, (Integer) null, (Integer) null, false, false, false);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession2);
        A0N.A0P = "com.bloks.www.avatar.editor.cds.launcher";
        A0N.A01 = r9;
        Activity activity2 = activity;
        A0N.A04 = new AvatarEditorIntentHelper$Companion$launcherEditor$1(activity2, evg);
        C95245zh r0 = new C95245zh(13784);
        r0.A04.put(45, "avatar_editor_launcher");
        String A0e = C18180wK.A0e();
        String A00 = I17.A00(19);
        C04220Ms.A0C(A0e, A00);
        Pair A0p = C18180wK.A0p("logging_session_id", A0e);
        Pair A0p2 = C18180wK.A0p("logging_surface", str4);
        Pair A0p3 = C18180wK.A0p("logging_mechanism", str5);
        Boolean valueOf2 = Boolean.valueOf(z);
        C04220Ms.A0C(valueOf2, A00);
        Pair A0p4 = C18180wK.A0p("disable_intro_nux", valueOf2);
        Pair A0p5 = C18180wK.A0p("sticker_packs", list);
        C04220Ms.A0C(valueOf, A00);
        HashMap A09 = AnonymousClass4WJ.A09(A0p, A0p2, A0p3, A0p4, A0p5, C18180wK.A0p("is_full_screen", valueOf));
        String str6 = str3;
        if (str3 == null) {
            A09.put("on_launch_navigate_to", "STORE_CATEGORY");
        } else {
            A09.put("on_launch_navigate_to", "PRESELECTED_CATEGORY");
            A09.put("on_launch_navigation_data", str6);
        }
        HashMap A02 = C37067Jjv.A02(A09);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        C62093Xc r5 = C62093Xc.A04;
        C63743iE A04 = C63743iE.A04("com.bloks.www.avatar.editor.cds.launcher", A02, C63203gz.A03("last_touch_up_event_ts", Long.valueOf(AnonymousClass2C2.A00(now, r5.A03.get(), r5.A02.get()))));
        r0.A0V();
        A04.A03 = r0;
        A04.A0E(activity2, A0N);
    }
}

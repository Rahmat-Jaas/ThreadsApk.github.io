package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObjectShape132S0200000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.CrosspostingBloksUpsellManager$getAppScreenConfig$1;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape163S0100000_I2_18;

/* renamed from: X.49N  reason: invalid class name */
public final class AnonymousClass49N implements AnonymousClass0i4 {
    public final UserSession A00;
    public final AnonymousClass2AC A01;
    public final AnonymousClass2AD A02;
    public final AnonymousClass14U A03;
    public final boolean A04;

    public final void A02(Activity activity, Context context, C84514tG r8) {
        Fragment A012 = A01(context, r8);
        UserSession userSession = this.A00;
        C37032Jj9 A0Y = C18200wM.A0Y(userSession, false);
        C18250wR.A1A(A0Y, r8, 6);
        C18200wM.A16(activity, A012, A0Y);
        AnonymousClass2AD r0 = this.A02;
        C28161tl A013 = AnonymousClass3WS.A01(userSession);
        int ordinal = r0.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            AnonymousClass0wJ.A14(A013.A00, "xar_users_stories_feed_upsell_display_count", 0);
        }
    }

    public static final AnonymousClass3C9 A00(Context context, C84514tG r5, AnonymousClass49N r6) {
        AnonymousClass3C9 r3 = new AnonymousClass3C9(context);
        String str = r6.A01.A00;
        Map map = r3.A04;
        map.put("crosspost_upsell_entrypoint", str);
        r3.A01.set(0);
        map.put("crosspost_upsell_variant", r6.A02.A00);
        map.put("should_dismiss", Boolean.valueOf(r6.A04));
        if (r5 != null) {
            r3.A03.put("action_callback", new AnonymousClass7EF(new IDxObjectShape132S0200000_1_I2(0, r3, new KtLambdaShape163S0100000_I2_18(r5, 49))));
        }
        Map map2 = r6.A03.A00;
        Object obj = map2.get("newly_linked_accounts");
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        map.put("newly_linked_accounts", obj);
        Object obj2 = map2.get("is_account_linked");
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        map.put("is_account_linked", obj2);
        Object obj3 = map2.get("ig_media_Id");
        if (obj3 != null) {
            map.put("ig_media_id", obj3);
        }
        Object obj4 = map2.get("impression_count");
        if (obj4 != null) {
            map.put("impression_count", obj4);
        }
        Object obj5 = map2.get("waterfall_id");
        if (obj5 != null) {
            map.put("waterfall_id", obj5);
        }
        return r3;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(AnonymousClass49N.class);
    }

    public AnonymousClass49N(AnonymousClass2AC r2, AnonymousClass2AD r3, AnonymousClass14U r4, UserSession userSession, boolean z) {
        AnonymousClass0wJ.A1O(userSession, r2);
        C04220Ms.A0B(r3, 3);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = z;
    }

    public final Fragment A01(Context context, C84514tG r8) {
        AnonymousClass3C9 A002 = A00(context, r8, this);
        IgBloksScreenConfig A0N = C18190wL.A0N(this.A00);
        A0N.A0P = "com.bloks.www.cxp.xposting_upsells.native_shell";
        A0N.A0g = false;
        A0N.A06 = new CrosspostingBloksUpsellManager$getAppScreenConfig$1(r8);
        if (A002.A01.nextClearBit(0) >= 1) {
            C63743iE A05 = C63743iE.A05("com.bloks.www.cxp.xposting_upsells.native_shell", C37067Jjv.A02(A002.A04), A002.A03);
            A05.A03 = null;
            A05.A02 = null;
            A05.A04 = null;
            A05.A0G(A002.A02);
            return A05.A0B(A002.A00, A0N);
        }
        throw C18180wK.A0a("Missing Required Props");
    }
}

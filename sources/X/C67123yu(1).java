package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxObserverShape875S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yu  reason: invalid class name and case insensitive filesystem */
public final class C67123yu implements CallerContextable {
    public static C67123yu A04 = null;
    public static final String __redex_internal_original_name = "AutoCrosspostingNuxHelper";
    public C82394pY A00;
    public boolean A01;
    public final UserSession A02;
    public final AnonymousClass49N A03;

    public final synchronized void A01() {
        C82394pY r2 = this.A00;
        if (r2 != null) {
            AnonymousClass3LY.A00(this.A02).A02(r2, C688145o.class);
        }
    }

    public static final boolean A00(Context context, C67123yu r10, C313625r r11) {
        if (!C35692Ol.A00(r10.A02).A05(CallerContext.A00(C67123yu.class), "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check") && r11 != C313625r.A03) {
            return false;
        }
        r10.A01 = false;
        AnonymousClass49N r1 = r10.A03;
        AnonymousClass35Y r2 = new AnonymousClass35Y(r10);
        M4x.A00(context, new C210718u(r1.A00), "com.bloks.www.cxp.xposting_upsells.native_shell", (String) null, C37067Jjv.A02(AnonymousClass49N.A00(context, (C84514tG) null, r1).A04), 900).A6p(new IDxObserverShape875S0100000_1_I2(r2, 0));
        return true;
    }

    public C67123yu(UserSession userSession) {
        this.A02 = userSession;
        AnonymousClass2AC r2 = AnonymousClass2AC.A0E;
        AnonymousClass2AD r3 = AnonymousClass2AD.A0T;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        Boolean A0Y = C18180wK.A0Y();
        A002.A07("newly_linked_accounts", A0Y);
        A002.A07("is_account_linked", A0Y);
        this.A03 = new AnonymousClass49N(r2, r3, A002, userSession, false);
    }
}

package X;

import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3hX  reason: invalid class name and case insensitive filesystem */
public final class C63473hX {
    public final C13330nS A00;
    public final C38039KHq A01;
    public final C09810gi A02;
    public final C28161tl A03;
    public final UserSession A04;
    public final List A05;
    public final C04560Oe A06;
    public final C04560Oe A07;
    public final C04560Oe A08;
    public final C04560Oe A09;
    public final C04560Oe A0A;
    public final C04560Oe A0B;
    public final C04560Oe A0C;
    public final C04560Oe A0D;

    public static C04560Oe A04(AnonymousClass0e5 r2, UserSession userSession) {
        return new AnonymousClass47S(new AnonymousClass4UK(r2, userSession, true));
    }

    public static C63473hX A01(UserSession userSession) {
        return (C63473hX) C18180wK.A0c(userSession, C63473hX.class, 13);
    }

    public static Boolean A02(C63473hX r3) {
        Boolean bool;
        SharedPreferences sharedPreferences = r3.A03.A00;
        if (sharedPreferences.contains("has_interop_enable")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("has_interop_enable", true));
        } else {
            bool = null;
        }
        if (bool != null || !AnonymousClass0wJ.A1X(r3.A08.get())) {
            return bool;
        }
        return C18180wK.A0Y();
    }

    public static boolean A05(C63473hX r1, boolean z) {
        if (AnonymousClass0wJ.A1X(r1.A0D.get()) || ((AnonymousClass0wJ.A1X(r1.A0C.get()) && AnonymousClass0wJ.A1X(r1.A0A.get())) || z)) {
            return true;
        }
        return false;
    }

    public final void A07(AnonymousClass3GR r4, AnonymousClass3DE r5) {
        C35202Mn.A00(new IDxACallbackShape15S0300000_1_I2(8, (Object) r4, (Object) r5, (Object) this), r5, this.A04, true);
    }

    public final void A08(AnonymousClass3DE r4) {
        if (r4 != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "instagram_interop_upsell_and_upgrade_events"), 1839);
            A0I.A0T("qp_source_upsell", r4.A07);
            A0I.A0T("static_source_upsell", r4.A08);
            A0I.A0T("deeplink_campaign", r4.A02);
            A0I.A0T("deeplink_source", r4.A03);
            A0I.A0T("event_type", r4.A05);
            A0I.A0S("impression_duration_ms", r4.A00);
            C18230wP.A1G(A0I, r4.A04);
            A0I.A0S("total_videos_seen", r4.A01);
            A0I.A0T("interstitial_type", r4.A06);
            A0I.Bb4();
        }
    }

    public C63473hX(UserSession userSession, List list) {
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        C09810gi r3 = C09820gj.A00;
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        C13330nS A013 = C13330nS.A01(new C15720rm("direct_interop_upgrade"), userSession);
        this.A04 = userSession;
        this.A03 = A012;
        this.A02 = r3;
        this.A01 = A002;
        this.A00 = A013;
        this.A08 = A04(AnonymousClass0e5.A00(36312402299454425L), userSession);
        this.A0D = A04(AnonymousClass0e5.A00(36311886903378684L), userSession);
        this.A0C = A04(AnonymousClass0e5.A00(36310598413254803L), userSession);
        this.A0A = A04(AnonymousClass0e5.A00(36312144601416546L), userSession);
        this.A0B = A04(AnonymousClass0e5.A00(36592073389899844L), userSession);
        this.A09 = A04(AnonymousClass0e5.A00(36310598413320340L), userSession);
        this.A06 = A04(AnonymousClass0e5.A00(36316800345967953L), userSession);
        this.A07 = A04(AnonymousClass0e5.A00(36598275322874704L), userSession);
        this.A05 = list;
    }

    public static int A00(UserSession userSession) {
        return A01(userSession).A06().intValue();
    }

    public static Object A03(C63473hX r5, AnonymousClass0e5 r6, long j) {
        AnonymousClass0e5 A002 = AnonymousClass0e5.A00(j);
        int intValue = r5.A06().intValue();
        if (intValue == 1) {
            return A002.A02(r5.A04);
        }
        if (intValue != 2) {
            return r6.A02(r5.A04);
        }
        return true;
    }

    public final Integer A06() {
        Boolean A022 = A02(this);
        if (A022 == null) {
            return AnonymousClass006.A0N;
        }
        boolean booleanValue = A022.booleanValue();
        if (!A05(this, booleanValue)) {
            return AnonymousClass006.A00;
        }
        if (!booleanValue) {
            return AnonymousClass006.A01;
        }
        return AnonymousClass006.A0C;
    }

    public final boolean A09() {
        Integer A062 = A06();
        if (A062 == AnonymousClass006.A0C || A062 == AnonymousClass006.A01) {
            return true;
        }
        return false;
    }
}

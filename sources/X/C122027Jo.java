package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.7Jo  reason: invalid class name and case insensitive filesystem */
public final class C122027Jo {
    public final LoggingData A00;
    public final C11630kW A01;
    public final C13330nS A02;

    public static C89175Cf A00(LoggingData loggingData, Boolean bool, Integer num) {
        C89175Cf r2 = new C89175Cf();
        r2.A0A("view_name", AnonymousClass6LJ.A00(num));
        r2.A0A("entry_point", loggingData.A00);
        if (bool != null) {
            r2.A07("is_content_appreciation_eligible", Boolean.valueOf(bool.booleanValue()));
        }
        return r2;
    }

    public static void A01(C122027Jo r9, CreatorLoggingData creatorLoggingData, Integer num, Integer num2) {
        A02(r9, Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), (Boolean) null, (Boolean) null, num, num2, creatorLoggingData.A00, (Map) null, (Map) null, 480);
    }

    public static /* synthetic */ void A02(C122027Jo r4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Map map, Map map2, Map map3, int i) {
        AnonymousClass28P r1;
        AnonymousClass28Y r12;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            map2 = null;
        }
        if ((i & 64) != 0) {
            bool3 = null;
        }
        if ((i & 128) != 0) {
            bool4 = null;
        }
        if ((i & 256) != 0) {
            map3 = AnonymousClass4WJ.A0A();
        }
        C04220Ms.A0B(map3, 8);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A02, "user_click_appreciationcreatorsettings_atomic"), 2815);
        if (AnonymousClass0wJ.A1U(A0I)) {
            LoggingData loggingData = r4.A00;
            A0I.A0T(C61953Wm.A00(), loggingData.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89175Cf r3 = new C89175Cf();
            C86124wJ.A1K(r3, AnonymousClass6LJ.A00(num));
            C86134wK.A1G(r3, AnonymousClass6LI.A00(num2));
            r3.A0A("entry_point", loggingData.A00);
            if (bool != null) {
                r3.A07("is_content_appreciation_eligible", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    r12 = AnonymousClass28Y.ON;
                } else {
                    r12 = AnonymousClass28Y.OFF;
                }
                r3.A04(r12, "gifts_enabled");
            }
            if (map != null) {
                r3.A0C("total_earnings_in_cents", map);
            }
            if (map2 != null) {
                r3.A0C("reel_earnings_in_cents", map2);
            }
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    r1 = AnonymousClass28P.ONBOARDED;
                } else {
                    r1 = AnonymousClass28P.NOT_ONBOARDED;
                }
                r3.A04(r1, "onboarding_status");
            }
            if (bool4 != null) {
                r3.A07("is_default_on", Boolean.valueOf(bool4.booleanValue()));
            }
            C86114wI.A1C(A0I, r3);
            A0I.A1g(map3);
            A0I.Bb4();
        }
    }

    public static /* synthetic */ void A03(C122027Jo r4, Boolean bool, Boolean bool2, Integer num, String str, Map map, int i) {
        AnonymousClass28Y r1;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        C04220Ms.A0B(str, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A02, "client_load_appreciationcreatorsettings_fail"), 246);
        if (AnonymousClass0wJ.A1U(A0I)) {
            LoggingData loggingData = r4.A00;
            A0I.A0T(C61953Wm.A00(), loggingData.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89175Cf A002 = A00(loggingData, bool, num);
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    r1 = AnonymousClass28Y.ON;
                } else {
                    r1 = AnonymousClass28Y.OFF;
                }
                A002.A04(r1, "gifts_enabled");
            }
            if (map != null) {
                A002.A0C("total_earnings_in_cents", map);
            }
            C86114wI.A1C(A0I, A002);
            A0I.A1J(str);
            A0I.A1g(AnonymousClass4WJ.A0A());
            A0I.Bb4();
        }
    }

    public static /* synthetic */ void A04(C122027Jo r4, Boolean bool, Boolean bool2, Integer num, Map map, Map map2, int i) {
        AnonymousClass28Y r1;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            map2 = AnonymousClass4WJ.A0A();
        }
        C04220Ms.A0B(map2, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A02, "client_load_appreciationcreatorsettings_success"), 248);
        if (AnonymousClass0wJ.A1U(A0I)) {
            LoggingData loggingData = r4.A00;
            A0I.A0T(C61953Wm.A00(), loggingData.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89175Cf A002 = A00(loggingData, bool, num);
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    r1 = AnonymousClass28Y.ON;
                } else {
                    r1 = AnonymousClass28Y.OFF;
                }
                A002.A04(r1, "gifts_enabled");
            }
            if (map != null) {
                A002.A0C("total_earnings_in_cents", map);
            }
            C86114wI.A1C(A0I, A002);
            A0I.A1g(map2);
            A0I.Bb4();
        }
    }

    public static /* synthetic */ void A05(C122027Jo r4, Integer num, boolean z) {
        AnonymousClass28P r1;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A02, "user_click_appreciationmediasettings_atomic"), 2821);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T(C61953Wm.A00(), r4.A00.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89205Ci r2 = new C89205Ci();
            C86124wJ.A1K(r2, "reels_creation_advanced_settings");
            C86134wK.A1G(r2, AnonymousClass6LI.A00(num));
            if (z) {
                r1 = AnonymousClass28P.ONBOARDED;
            } else {
                r1 = AnonymousClass28P.NOT_ONBOARDED;
            }
            r2.A04(r1, "onboarding_status");
            C86114wI.A1C(A0I, r2);
            A0I.Bb4();
        }
    }

    public final void A06(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Map map) {
        AnonymousClass28P r1;
        AnonymousClass28Y r12;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A02, "client_load_appreciationcreatorsettings_init"), 247);
        if (AnonymousClass0wJ.A1U(A0I)) {
            LoggingData loggingData = this.A00;
            A0I.A0T(C61953Wm.A00(), loggingData.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89175Cf A002 = A00(loggingData, bool, num);
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    r12 = AnonymousClass28Y.ON;
                } else {
                    r12 = AnonymousClass28Y.OFF;
                }
                A002.A04(r12, "gifts_enabled");
            }
            if (map != null) {
                A002.A0C("total_earnings_in_cents", map);
            }
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    r1 = AnonymousClass28P.ONBOARDED;
                } else {
                    r1 = AnonymousClass28P.NOT_ONBOARDED;
                }
                A002.A04(r1, "onboarding_status");
            }
            if (bool4 != null) {
                A002.A07("is_default_on", Boolean.valueOf(bool4.booleanValue()));
            }
            C86114wI.A1C(A0I, A002);
            A0I.A1g(AnonymousClass4WJ.A0A());
            A0I.Bb4();
        }
    }

    public final void A07(Boolean bool, Boolean bool2, Integer num, Map map) {
        AnonymousClass28Y r1;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A02, "client_load_appreciationcreatorsettings_display"), 245);
        if (AnonymousClass0wJ.A1U(A0I)) {
            LoggingData loggingData = this.A00;
            A0I.A0T(C61953Wm.A00(), loggingData.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89175Cf A002 = A00(loggingData, bool, num);
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    r1 = AnonymousClass28Y.ON;
                } else {
                    r1 = AnonymousClass28Y.OFF;
                }
                A002.A04(r1, "gifts_enabled");
            }
            if (map != null) {
                A002.A0C("total_earnings_in_cents", map);
            }
            C86114wI.A1C(A0I, A002);
            A0I.A1g(AnonymousClass4WJ.A0A());
            A0I.Bb4();
        }
    }

    public final void A08(Boolean bool, Boolean bool2, Integer num, Map map) {
        AnonymousClass28Y r1;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A02, "user_click_appreciationcreatorsettings_exit"), 2816);
        if (AnonymousClass0wJ.A1U(A0I)) {
            LoggingData loggingData = this.A00;
            A0I.A0T(C61953Wm.A00(), loggingData.A01);
            C86104wH.A1G(AnonymousClass6BP.A07, A0I);
            C89175Cf r3 = new C89175Cf();
            C86124wJ.A1K(r3, AnonymousClass6LJ.A00(num));
            C86134wK.A1G(r3, "exit");
            r3.A0A("entry_point", loggingData.A00);
            if (bool != null) {
                r3.A07("is_content_appreciation_eligible", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    r1 = AnonymousClass28Y.ON;
                } else {
                    r1 = AnonymousClass28Y.OFF;
                }
                r3.A04(r1, "gifts_enabled");
            }
            if (map != null) {
                r3.A0C("total_earnings_in_cents", map);
            }
            C86114wI.A1C(A0I, r3);
            A0I.A1g(AnonymousClass4WJ.A0A());
            A0I.Bb4();
        }
    }

    public /* synthetic */ C122027Jo(LoggingData loggingData, C11630kW r3, UserSession userSession) {
        C13330nS A012 = C13330nS.A01(r3, userSession);
        AnonymousClass0wJ.A1R(loggingData, A012);
        this.A01 = r3;
        this.A00 = loggingData;
        this.A02 = A012;
    }
}

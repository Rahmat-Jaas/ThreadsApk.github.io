package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.49Y  reason: invalid class name */
public final class AnonymousClass49Y implements AnonymousClass0i4 {
    public String A00;
    public final long A01;
    public final C13330nS A02;
    public final UserSession A03;
    public final List A04 = C06750aI.A17(AnonymousClass22L.Carousel, AnonymousClass22L.UnskippableCarousel);

    public final void A06(C307522u r4, String str, int i) {
        C04220Ms.A0B(r4, 1);
        USLEBaseShape0S0000000 A002 = A00(this);
        if (AnonymousClass0wJ.A1U(A002)) {
            A03(A002, this);
            AnonymousClass2A4.A00(AnonymousClass2AE.A0B, A002);
            AnonymousClass3Zh.A03(C40328Lci.A0E, A002, r4, str, i);
            String A022 = A02(r4);
            if (A022 != null) {
                A002.A0V("extra", AnonymousClass4WK.A0O(C18180wK.A0p("entrypoint", A022)));
            }
            A002.Bb4();
        }
    }

    public final void A07(C307522u r4, String str, int i, boolean z) {
        C04220Ms.A0B(r4, 1);
        USLEBaseShape0S0000000 A002 = A00(this);
        if (AnonymousClass0wJ.A1U(A002) && !z) {
            A03(A002, this);
            AnonymousClass2A4.A00(AnonymousClass2AE.A0H, A002);
            AnonymousClass3Zh.A03(C40328Lci.A0E, A002, r4, str, i);
            String A022 = A02(r4);
            if (A022 != null) {
                A002.A0V("extra", AnonymousClass4WK.A0O(C18180wK.A0p("entrypoint", A022)));
            }
            A002.Bb4();
        }
    }

    public final void A08(Integer num) {
        AnonymousClass2AA r1;
        C04220Ms.A0B(num, 0);
        USLEBaseShape0S0000000 A002 = A00(this);
        if (AnonymousClass0wJ.A1U(A002)) {
            if (num.intValue() != 0) {
                r1 = AnonymousClass2AA.A09;
            } else {
                r1 = AnonymousClass2AA.A07;
            }
            A03(A002, this);
            AnonymousClass2A4.A00(AnonymousClass2AE.A0f, A002);
            C18230wP.A1D(C40328Lci.A0K, A002);
            AnonymousClass2AG.A01(r1, A002);
        }
    }

    public static USLEBaseShape0S0000000 A00(AnonymousClass49Y r0) {
        return USLEBaseShape0S0000000.A0C(r0.A02);
    }

    public static final AnonymousClass2AA A01(AnonymousClass24S r0, boolean z) {
        if (!z) {
            switch (r0.ordinal()) {
                case 0:
                case 2:
                    return AnonymousClass2AA.A06;
                case 1:
                    return AnonymousClass2AA.A0B;
                case 3:
                case 4:
                    return AnonymousClass2AA.A0A;
                case 5:
                    break;
                default:
                    throw AnonymousClass4VZ.A00();
            }
        }
        return AnonymousClass2AA.A05;
    }

    public static void A03(AnonymousClass0A3 r2, AnonymousClass49Y r3) {
        r2.A0S("actor_id", Long.valueOf(r3.A01));
    }

    public final void onSessionWillEnd() {
        this.A03.A03(AnonymousClass49Y.class);
    }

    public AnonymousClass49Y(UserSession userSession) {
        this.A03 = userSession;
        this.A01 = AnonymousClass4n2.A00(C18230wP.A0q(userSession));
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "creator_broadcast_chat";
        this.A02 = r1.A00();
    }

    public static final String A02(C307522u r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return "join_chat_sticker";
        }
        if (ordinal == 2) {
            return "reels";
        }
        if (ordinal == 3 || ordinal == 4) {
            return "message_in_story";
        }
        return null;
    }

    public final void A04(int i, String str, String str2) {
        Long l;
        this.A00 = C18180wK.A0e();
        USLEBaseShape0S0000000 A002 = A00(this);
        if (AnonymousClass0wJ.A1U(A002)) {
            A03(A002, this);
            AnonymousClass2A4.A00(AnonymousClass2AE.A0R, A002);
            C18230wP.A1D(C40328Lci.A0N, A002);
            AnonymousClass3Zh.A02(AnonymousClass2AA.A0H, A002, i);
            A002.A0T("ig_thread_id", str);
            if (str2 != null) {
                l = AnonymousClass4n2.A02(str2);
            } else {
                l = null;
            }
            A002.A0S("consistent_thread_fbid", l);
            A002.A0T(AnonymousClass3Q6.A00(9, 10, 56), this.A00);
            A002.Bb4();
        }
    }

    public final void A05(AnonymousClass24S r6, int i) {
        USLEBaseShape0S0000000 A002 = A00(this);
        if (AnonymousClass0wJ.A1U(A002)) {
            this.A00 = C18180wK.A0e();
            A03(A002, this);
            C18220wO.A1D(AnonymousClass2AE.A04, A002);
            C18220wO.A1E(AnonymousClass2A4.VIEW, A002);
            C18230wP.A1D(C40328Lci.A0O, A002);
            AnonymousClass3Zh.A02(A01(r6, false), A002, i);
            A002.A0T(AnonymousClass3Q6.A00(9, 10, 56), this.A00);
            A002.Bb4();
        }
    }
}

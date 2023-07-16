package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7JF  reason: invalid class name */
public final class AnonymousClass7JF {
    public static final AnonymousClass6BP A02 = AnonymousClass6BP.A07;
    public static final AnonymousClass28E A03 = AnonymousClass28E.ANDROID;
    public final KtCSuperShape0S4000000_I2 A00;
    public final C13330nS A01;

    public AnonymousClass7JF(KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I2, C11630kW r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = ktCSuperShape0S4000000_I2;
        this.A01 = C13330nS.A01(r3, userSession);
    }

    public final void A04(List list) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A01, "client_load_appreciationfeed_init"), 251);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A02(A0I, this);
            C86114wI.A1C(A0I, A00(this, (Boolean) null, (Boolean) null, AnonymousClass006.A01, (Integer) null, (Long) null, (String) null, (String) null, list, 238));
            A0I.Bb4();
        }
    }

    public static /* synthetic */ C89185Cg A00(AnonymousClass7JF r5, Boolean bool, Boolean bool2, Integer num, Integer num2, Long l, String str, String str2, List list, int i) {
        String str3;
        String str4;
        Long l2 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) == 0) {
            l2 = l;
        }
        C89185Cg r2 = new C89185Cg();
        switch (num.intValue()) {
            case 0:
                str3 = "appreciation_gift_awareness";
                break;
            case 1:
                str3 = "appreciation_feed";
                break;
            case 2:
                str3 = "appreciation_feed_onboarding";
                break;
            case 3:
                str3 = "appreciation_feed_overflow_menu";
                break;
            default:
                str3 = "appreciation_feed_disclaimer";
                break;
        }
        C86124wJ.A1K(r2, str3);
        KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I2 = r5.A00;
        r2.A0A("media_id", ktCSuperShape0S4000000_I2.A02);
        r2.A0A("receiver_id", ktCSuperShape0S4000000_I2.A00);
        r2.A0A("entry_point", ktCSuperShape0S4000000_I2.A01);
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str4 = C18170wI.A00(235);
                    break;
                case 2:
                    str4 = "filter";
                    break;
                case 3:
                    str4 = "profile";
                    break;
                case 4:
                    str4 = C18170wI.A00(448);
                    break;
                case 5:
                    str4 = C28174Ezk.A00(HttpStatus.SC_SWITCHING_PROTOCOLS);
                    break;
                case 6:
                    str4 = "dismiss";
                    break;
                case 7:
                    str4 = C18170wI.A00(435);
                    break;
                case 8:
                    str4 = "story";
                    break;
                case 9:
                    str4 = "block_user";
                    break;
                case 10:
                    str4 = "unblock_user";
                    break;
                case 11:
                    str4 = C18170wI.A00(480);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str4 = "exit";
                    break;
                default:
                    str4 = "like";
                    break;
            }
            if (AnonymousClass8bQ.A0m(str4)) {
                C86134wK.A1G(r2, str4);
            }
        }
        if (bool != null) {
            r2.A07("has_next_page", Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            r2.A07("is_receiver_onboarded", Boolean.valueOf(bool2.booleanValue()));
        }
        if (list != null) {
            r2.A0B("displayed_transaction_ids", list);
        }
        if (str != null) {
            r2.A0A("transaction_id", str);
        }
        if (str2 != null) {
            r2.A0A("sender_id", str2);
        }
        if (l2 != null) {
            r2.A0A("selected_filter_gift_id", String.valueOf(l2.longValue()));
        }
        return r2;
    }

    public static Integer A01(AnonymousClass0A3 r3, String str) {
        r3.A0T(AnonymousClass3QI.A00(9, 10, 55), str);
        r3.A0O(A02, "product_type");
        r3.A0O(A03, "platform");
        r3.A0S("actual_event_time", Long.valueOf(System.currentTimeMillis()));
        return AnonymousClass006.A01;
    }

    public static void A02(AnonymousClass0A3 r4, AnonymousClass7JF r5) {
        r4.A0T(C61953Wm.A01(52, 10, 34), r5.A00.A03);
        r4.A0O(A02, "product_type");
        r4.A0O(A03, "platform");
        r4.A0S("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static final void A03(C89185Cg r2, AnonymousClass7JF r3) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A01, "user_click_appreciationfeed_atomic"), 2817);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A02(A0I, r3);
            C86114wI.A1C(A0I, r2);
            A0I.Bb4();
        }
    }
}

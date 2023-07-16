package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3In  reason: invalid class name */
public final class AnonymousClass3In {
    public final C13330nS A00;
    public final Integer A01;
    public final C11630kW A02;
    public final UserSession A03;

    public final void A00(Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_finish_step"), 463);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(this.A01));
            switch (num.intValue()) {
                case 0:
                    str = "post_share_sheet";
                    break;
                case 1:
                    str = "reels_share_sheet";
                    break;
                default:
                    str = "schedule_picker";
                    break;
            }
            C18190wL.A1I(A0I, str);
            A0I.Bb4();
        }
    }

    public final void A01(Integer num) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_finish_step"), 463);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(num));
            C18190wL.A1I(A0I, "schedule_picker");
            A0I.Bb4();
        }
    }

    public final void A02(Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_start_step"), 464);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(this.A01));
            switch (num.intValue()) {
                case 0:
                    str = "post_share_sheet";
                    break;
                case 1:
                    str = "reels_share_sheet";
                    break;
                case 2:
                    str = "schedule_picker";
                    break;
                case 3:
                    str = "view_all_scheduled_content";
                    break;
                default:
                    str = "view_single_scheduled_content";
                    break;
            }
            C18190wL.A1I(A0I, str);
            A0I.Bb4();
        }
    }

    public final void A03(Integer num) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_start_step"), 464);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(num));
            C18190wL.A1I(A0I, "schedule_picker");
            A0I.Bb4();
        }
    }

    public final void A04(Integer num) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_tap_component"), 467);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(num));
            C18190wL.A1I(A0I, "schedule_picker");
            A0I.A0T("component", "done");
            A0I.Bb4();
        }
    }

    public final void A05(Integer num, Integer num2) {
        String str;
        String str2;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_tap_component"), 467);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(this.A01));
            switch (num.intValue()) {
                case 0:
                    str = "post_share_sheet";
                    break;
                case 1:
                    str = "reels_share_sheet";
                    break;
                case 2:
                    str = "schedule_picker";
                    break;
                default:
                    str = "view_all_scheduled_content";
                    break;
            }
            C18190wL.A1I(A0I, str);
            switch (num2.intValue()) {
                case 0:
                    str2 = "done";
                    break;
                case 1:
                    str2 = "schedule";
                    break;
                case 2:
                    str2 = "single_media";
                    break;
                default:
                    str2 = "three_dots";
                    break;
            }
            A0I.A0T("component", str2);
            A0I.Bb4();
        }
    }

    public final void A06(String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "content_scheduling_submit_error"), 465);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, C34482Js.A00(this.A01));
            C18190wL.A1I(A0I, "schedule_picker");
            A0I.A1J(str);
            A0I.Bb4();
        }
    }

    public AnonymousClass3In(C11630kW r2, UserSession userSession, Integer num) {
        AnonymousClass0wJ.A1O(num, userSession);
        C04220Ms.A0B(r2, 3);
        this.A01 = num;
        this.A03 = userSession;
        this.A02 = r2;
        this.A00 = C13330nS.A01(r2, userSession);
    }
}

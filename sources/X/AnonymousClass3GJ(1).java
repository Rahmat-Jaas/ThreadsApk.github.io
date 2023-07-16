package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3GJ  reason: invalid class name */
public final class AnonymousClass3GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C312224t A05;
    public C23920D1i A06 = C23920D1i.CLOSE_FRIENDS;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C11630kW A0B;
    public final UserSession A0C;

    public final void A00() {
        String str;
        if (!this.A0A) {
            this.A0A = true;
            UserSession userSession = this.A0C;
            C11630kW r3 = this.A0B;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, userSession), "ig_audience_settings_waterfall"), 800);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C312224t r0 = this.A05;
                if (r0 == null) {
                    r0 = C312224t.UNKNOWN;
                }
                String str2 = r0.A00;
                Integer num = this.A07;
                if (num == null) {
                    num = AnonymousClass006.A0j;
                }
                switch (num.intValue()) {
                    case 1:
                        str = "cancel_discard";
                        break;
                    case 2:
                        str = "cancel_save";
                        break;
                    case 3:
                        str = "done";
                        break;
                    case 4:
                        str = "share";
                        break;
                    case 5:
                        str = "unknown";
                        break;
                    default:
                        str = "cancel";
                        break;
                }
                int i = -1;
                if (this.A09) {
                    i = 0;
                }
                A0I.A0T("exit_point", str);
                C18210wN.A1B(A0I, str2);
                A0I.A0S("suggestions_available_count", C18230wP.A0f(this.A04));
                A0I.A0S("suggestions_max_seen_position", C18230wP.A0f(i));
                A0I.A0Q("did_tap_remove_all", Boolean.valueOf(this.A08));
                Boolean A0X = C18180wK.A0X();
                A0I.A0Q("did_tap_remove_all_in_dialog", A0X);
                A0I.A0Q("did_tap_undo_remove_all", A0X);
                A0I.A0T("audience", this.A06.A00);
                A0I.A0S("audience_added_search_count", C18230wP.A0f(this.A00));
                A0I.A0S("audience_removed_count", C18230wP.A0f(this.A03));
                A0I.A0S("audience_added_suggestions_count", C18230wP.A0f(this.A01));
                A0I.A0S("audience_initial_count", C18230wP.A0f(this.A02));
                C18180wK.A1C(A0I, r3);
                A0I.Bb4();
            }
        }
    }

    public AnonymousClass3GJ(C11630kW r2, UserSession userSession) {
        this.A0C = userSession;
        this.A0B = r2;
    }
}

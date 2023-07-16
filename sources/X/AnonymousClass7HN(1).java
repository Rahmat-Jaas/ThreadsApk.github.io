package X;

import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7HN  reason: invalid class name */
public abstract class AnonymousClass7HN {
    public static AnonymousClass7HN A02(C11630kW r4, UserSession userSession, Integer num) {
        C26148E0u e0u = new C26148E0u();
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36311066564624754L)) {
            return new C955761g(e0u, r4, userSession, num);
        }
        return new C955861h(e0u, r4, userSession, num);
    }

    public static void A03(AnonymousClass0A3 r2, C955761g r3, String str) {
        r2.A0T("query", str);
        r2.A0O(AnonymousClass287.TRADITIONAL, "list_type");
        r2.A0U("results_fetched", r3.A03);
        if (!TextUtils.isEmpty(r3.A02)) {
            r2.A0T("results_list_id", r3.A02);
        }
    }

    public static boolean A04(AnonymousClass0A3 r4, C955761g r5) {
        r4.A0O(r5.A05, "surface");
        r4.A0T("place_picker_session_id", r5.A08);
        r4.A0S("milliseconds_since_start", Long.valueOf(r5.A06.now() - r5.A04));
        r4.A0T(I17.A00(29), "ig_default");
        return TextUtils.isEmpty(r5.A01);
    }

    public final void A05() {
        String str;
        if (this instanceof C955761g) {
            C955761g r2 = (C955761g) this;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A07, "place_picker_cancelled"), 2494);
            if (AnonymousClass0wJ.A1U(A0I)) {
                if (A04(A0I, r2)) {
                    str = "";
                } else {
                    str = r2.A01;
                }
                A03(A0I, r2, str);
                A0I.Bb4();
                return;
            }
            return;
        }
        C955861h r22 = (C955861h) this;
        C18180wK.A1K(C955861h.A00(r22, "locations_cancelled"), r22.A02);
    }

    public final void A06() {
        if (this instanceof C955761g) {
            C955761g r3 = (C955761g) this;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A07, "place_picker_started"), 2497);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T("place_picker_session_id", r3.A08);
                A0I.A0O(r3.A05, "surface");
                A0I.A0T(I17.A00(29), "ig_default");
                Boolean bool = r3.A00;
                if (bool != null) {
                    A0I.A0Q("has_location_services", bool);
                }
                A0I.Bb4();
                return;
            }
            return;
        }
        C955861h r2 = (C955861h) this;
        C18180wK.A1K(C955861h.A00(r2, "locations_add_location_tapped"), r2.A02);
    }

    public final void A07(String str, String str2, List list) {
        if (this instanceof C955761g) {
            C955761g r3 = (C955761g) this;
            r3.A01 = str;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            r3.A02 = str2;
            r3.A03 = C955761g.A00(list);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A07, "place_picker_results_loaded"), 2496);
            if (AnonymousClass0wJ.A1U(A0I)) {
                if (!A04(A0I, r3)) {
                    str3 = r3.A01;
                }
                A03(A0I, r3, str3);
                A0I.Bb4();
                return;
            }
            return;
        }
        C955861h r2 = (C955861h) this;
        r2.A00 = str;
        r2.A01 = str2;
        C15730rn A00 = C955861h.A00(r2, "locations_query_results");
        C955861h.A01(A00, list);
        C18180wK.A1K(A00, r2.A02);
    }

    public final void A08(String str, List list) {
        String str2;
        if (this instanceof C955761g) {
            C955761g r3 = (C955761g) this;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A07, "place_picker_place_picked"), 2495);
            if (AnonymousClass0wJ.A1U(A0I)) {
                if (A04(A0I, r3)) {
                    str2 = "";
                } else {
                    str2 = r3.A01;
                }
                A0I.A0T("query", str2);
                A0I.A0O(AnonymousClass287.TRADITIONAL, "list_type");
                A0I.A0U("results_fetched", C955761g.A00(list));
                A0I.A0S("selected_page_id", new Long(str));
                if (!TextUtils.isEmpty(r3.A02)) {
                    A0I.A0T("results_list_id", r3.A02);
                }
                A0I.Bb4();
                return;
            }
            return;
        }
        C955861h r2 = (C955861h) this;
        C15730rn A00 = C955861h.A00(r2, "locations_result_tapped");
        A00.A0D(I17.A00(30), str);
        C955861h.A01(A00, list);
        C18180wK.A1K(A00, r2.A02);
    }

    public final void A09(boolean z) {
        if (this instanceof C955761g) {
            ((C955761g) this).A00 = Boolean.valueOf(z);
        }
    }
}

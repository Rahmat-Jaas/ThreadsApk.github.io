package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.3Ui  reason: invalid class name */
public final class AnonymousClass3Ui {
    public final C11630kW A00;
    public final C13330nS A01;
    public final UserSession A02;

    public final void A01(AnonymousClass3DJ r16, String str, String str2, long j, long j2) {
        String str3 = str;
        C04220Ms.A0B(str3, 4);
        A00(this, r16, true, (Boolean) null, (Boolean) null, Long.valueOf(j), Long.valueOf(j2), (Long) null, (Long) null, (Long) null, "ig_quiet_mode_error_event", str3, AnonymousClass4WJ.A0G(C18180wK.A0p(I17.A00(224), "customization_error"), C18180wK.A0p("exception_message", str2)), 3904);
    }

    public static /* synthetic */ void A00(AnonymousClass3Ui r2, AnonymousClass3DJ r3, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Map map, int i) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            map = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            l3 = null;
        }
        if ((i & 1024) != 0) {
            l4 = null;
        }
        if ((i & 2048) != 0) {
            l5 = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A01, "ig_quiet_mode_action"), 1415);
        C18210wN.A1A(A0I, str);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = r3.A08;
        }
        A0I.A0Q("enabled", Boolean.valueOf(z));
        A0I.A0Q("is_in_quiet_mode", Boolean.valueOf(r3.A06));
        if (l != null) {
            j = l.longValue();
        } else {
            j = r3.A05;
        }
        A0I.A0S("start_interval", Long.valueOf(j));
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = r3.A00;
        }
        A0I.A0S("end_interval", Long.valueOf(j2));
        if (bool3 != null) {
            z2 = bool3.booleanValue();
        } else {
            z2 = r3.A07;
        }
        A0I.A0Q("pause_enabled", Boolean.valueOf(z2));
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = r3.A02;
        }
        A0I.A0S("pause_interval_start", Long.valueOf(j3));
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = r3.A01;
        }
        A0I.A0S("pause_interval_end", Long.valueOf(j4));
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = r3.A03;
        }
        A0I.A0S("pause_selected_interval", Long.valueOf(j5));
        A0I.A0S("session_screen_time", Long.valueOf(r3.A04));
        A0I.A0T("entrypoint", str2);
        String id = TimeZone.getDefault().getID();
        C04220Ms.A06(id);
        A0I.A0T("timezone", id);
        if (bool2 != null) {
            A0I.A0Q("previous_enabled", bool2);
        }
        if (map != null) {
            A0I.A0V("extra_event_data", map);
        }
        A0I.Bb4();
    }

    public /* synthetic */ AnonymousClass3Ui(C11630kW r3, UserSession userSession) {
        C13330nS A012 = C13330nS.A01(r3, userSession);
        C04220Ms.A0B(A012, 3);
        this.A02 = userSession;
        this.A00 = r3;
        this.A01 = A012;
    }
}

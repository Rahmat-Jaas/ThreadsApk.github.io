package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.pando.TreeJNI;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;

/* renamed from: X.2rC  reason: invalid class name and case insensitive filesystem */
public final class C49322rC {
    public static final void A00(AnonymousClass2AC r11, AnonymousClass29W r12, AnonymousClass2AD r13, AnonymousClass14U r14, UserSession userSession) {
        String stringValue;
        AnonymousClass14U r6 = r14;
        AnonymousClass2AC r9 = r11;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, r9);
        AnonymousClass2AD r10 = r13;
        C04220Ms.A0B(r13, 2);
        C04220Ms.A0B(r12, 3);
        if (r14 == null) {
            r6 = AnonymousClass14U.A00();
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "crosspost_upsells"), 496);
        AnonymousClass3FA A00 = C49382rI.A00(userSession);
        String A01 = C61843Wa.A01(r9);
        MUg mUg = ((C679041a) A00.A01).A00;
        A01.getClass();
        int A002 = mUg.A00(A01);
        TreeJNI treeJNI = (TreeJNI) mUg.A01(A002).A08(A01, A002);
        if (!(treeJNI == null || (stringValue = treeJNI.getStringValue("client_session_id")) == null)) {
            r6.A0A("eligibility_fetch_session_id", stringValue);
        }
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r9, "entry_point");
            A0I.A0O(r12, "event_type");
            A0I.A0O(r13, "variant");
            A0I.A0P(r6, "extra");
            A0I.Bb4();
            AnonymousClass0TJ r62 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r62, userSession, 2342168730208117975L) && !AnonymousClass00J.A0k(AnonymousClass8bP.A0f(C63803iN.A0C(r62, userSession, 36888670948295154L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0, 6), C61843Wa.A02(r10))) {
                int ordinal = r12.ordinal();
                if (ordinal == 0 || ordinal == A1Z || ordinal == 2) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r9, r10, userSession2, r12, (C146958n9) null, 42), C84874u0.A00(C18250wR.A0J((AnonymousClass0gW) null, 3), 1732129082, 3), 3);
                }
            }
        }
    }
}

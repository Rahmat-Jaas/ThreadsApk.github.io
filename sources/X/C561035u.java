package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.35u  reason: invalid class name and case insensitive filesystem */
public final class C561035u {
    public final List A00;

    public C561035u(UserSession userSession) {
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        this.A00 = Arrays.asList(C63803iN.A0A(r2, userSession).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
        C63803iN.A0C(r2, userSession, 36875485397188688L);
    }
}

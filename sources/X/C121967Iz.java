package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Iz  reason: invalid class name and case insensitive filesystem */
public final class C121967Iz {
    public static final AtomicInteger A00 = C86144wL.A11();

    public static final int A00(UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 0);
        int andIncrement = A00.getAndIncrement();
        AnonymousClass01V.A0p.markerStart(383656871, andIncrement);
        AnonymousClass01V.A0p.markerAnnotate(383656871, andIncrement, "config_type", str);
        return andIncrement;
    }

    public static final void A04(UserSession userSession, int i, short s) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass01V.A0p.markerEnd(383656871, i, s);
    }

    public static final int A01(String str) {
        int andIncrement = A00.getAndIncrement();
        AnonymousClass01V.A0p.markerStart(383657104, andIncrement);
        AnonymousClass01V.A0p.markerAnnotate(383657104, andIncrement, "config_type", str);
        return andIncrement;
    }

    public static final void A02(int i) {
        AnonymousClass01V.A0p.markerAnnotate(383657104, i, "content_eligibility", "xpost_allowed");
        AnonymousClass01V.A0p.markerEnd(383657104, i, 2);
    }

    public static final void A03(int i) {
        AnonymousClass01V.A0p.markerAnnotate(383657104, i, "content_eligibility", "xpost_unavailable");
        AnonymousClass01V.A0p.markerEnd(383657104, i, 2);
    }
}

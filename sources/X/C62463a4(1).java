package X;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3a4  reason: invalid class name and case insensitive filesystem */
public final class C62463a4 {
    public static final AtomicBoolean A00 = new AtomicBoolean();

    public static void A01(Bundle bundle, C12560m7 r3) {
        if (!C18240wQ.A1T(bundle, "feedback_message")) {
            C18250wR.A08().post(new AnonymousClass4RQ(bundle, r3));
        }
    }

    public static Bundle A00(AnonymousClass45U r4) {
        Bundle A06 = C18180wK.A06();
        C18180wK.A0w(A06, r4.A00);
        AnonymousClass3VJ r2 = r4.A01;
        A06.putString("feedback_title", r2.A0A);
        A06.putString("feedback_message", r2.A08);
        A06.putString("feedback_appeal_label", r2.A00);
        A06.putString("feedback_action", r2.A05);
        A06.putString("feedback_ignore_label", r2.A07);
        A06.putString("feedback_url", r2.A06);
        return A06;
    }
}

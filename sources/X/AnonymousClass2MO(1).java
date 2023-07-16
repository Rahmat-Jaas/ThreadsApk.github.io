package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;

/* renamed from: X.2MO  reason: invalid class name */
public final class AnonymousClass2MO {
    public static final void A00(C10300i6 r4, String str, int[] iArr) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0W(r4), "ig_app_widget_lifecycle"), 793);
        if (AnonymousClass0wJ.A1U(A0I) && str != null) {
            A0I.A0T("widget_name", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
            A0I.A0T("lifecycle_event_name", str);
            ArrayList A0k = C18240wQ.A0k(r3);
            for (int valueOf : iArr) {
                A0k.add(String.valueOf(valueOf));
            }
            A0I.A0U("widget_ids", AnonymousClass00J.A0N(A0k));
            A0I.Bb4();
        }
    }
}

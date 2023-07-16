package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3w6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3w6 implements C002301a {
    public final void accept(Object obj) {
        AnonymousClass29O r1;
        C32163H7y h7y = (C32163H7y) obj;
        String str = h7y.A02;
        if (str != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(h7y.A03, "omnipicker_search_end"), 2447);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T(AnonymousClass3QA.A00(0, 10, 126), str);
                A0I.A0O(AnonymousClass29M.ABANDON, "end_action");
                A0I.A0O(C29024FgY.GROUP, "result_type");
                int ordinal = D1S.DJANGO.ordinal();
                if (ordinal == 2) {
                    r1 = AnonymousClass29O.IG_ADVANCED_CRYPTO_TRANSPORT;
                } else if (ordinal != 1) {
                    r1 = AnonymousClass29O.IG_DJANGO;
                } else {
                    r1 = AnonymousClass29O.IG_MESSENGER_INFRA;
                }
                A0I.A0O(r1, TraceFieldType.TransportType);
                A0I.A0O(AnonymousClass283.BROADCAST_FLOW_CHAT, "entry_point");
                A0I.Bb4();
            }
            h7y.A02 = null;
        }
    }
}

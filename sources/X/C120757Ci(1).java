package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.7Ci  reason: invalid class name and case insensitive filesystem */
public final class C120757Ci {
    public static final C120757Ci A00 = new C120757Ci();

    public static final void A00(C13330nS r3, BZI bzi, BKU bku, Integer num) {
        Long l;
        String str;
        String str2;
        AnonymousClass0wJ.A1M(bku, 0, r3);
        USLEBaseShape0S0000000 A0L = USLEBaseShape0S0000000.A0L(r3);
        A0L.A0T("source_of_action", "comment_reply");
        A0L.A1h(AnonymousClass4WJ.A0I(C18180wK.A0p("view_variant", C102456Vg.A00(num))));
        Long l2 = null;
        if (bzi == null || (str2 = bzi.A0e) == null) {
            l = null;
        } else {
            l = AnonymousClass0wJ.A0d(str2);
        }
        A0L.A0S("parent_comment_id", l);
        if (!(bzi == null || (str = bzi.A0f) == null)) {
            l2 = AnonymousClass0wJ.A0d(str);
        }
        C86114wI.A1E(A0L, bku, l2);
    }
}

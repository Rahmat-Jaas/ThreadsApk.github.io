package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.unifiedfeedback.api.graphql.TopLevelCommentsImpl;

/* renamed from: X.4CG  reason: invalid class name */
public final class AnonymousClass4CG implements C21269Brb {
    public boolean A00;
    public final /* synthetic */ AnonymousClass1dM A01;

    public AnonymousClass4CG(AnonymousClass1dM r1) {
        this.A01 = r1;
    }

    public final void AA0() {
        long j;
        String A33;
        Long A02;
        AnonymousClass1dM r4 = this.A01;
        AnonymousClass3G3 r2 = r4.A0E;
        TopLevelCommentsImpl.PageInfo pageInfo = r2.A00;
        if (pageInfo != null && pageInfo.getBooleanValue("has_next_page")) {
            String str = null;
            TopLevelCommentsImpl.PageInfo pageInfo2 = r2.A00;
            if (pageInfo2 != null) {
                str = pageInfo2.getStringValue("end_cursor");
            }
            AnonymousClass1dM.A04(r4, str, false);
        } else if (!this.A00) {
            C13330nS r1 = r4.A02;
            if (r1 == null) {
                C18240wQ.A0p();
                throw null;
            }
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "comments_from_facebook_scroll_end"), 429);
            BKU bku = r4.A05;
            if (bku == null || (A33 = bku.A33()) == null || (A02 = AnonymousClass4n2.A02(A33)) == null) {
                j = -1;
            } else {
                j = A02.longValue();
            }
            C18210wN.A18(A0I, j);
            A0I.Bb4();
            this.A00 = true;
        }
    }
}

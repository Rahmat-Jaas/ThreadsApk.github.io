package X;

import android.content.Context;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Cq  reason: invalid class name and case insensitive filesystem */
public final class C70144Cq implements C39574Kw1 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass1dM A01;

    public C70144Cq(View view, AnonymousClass1dM r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onClick() {
        long j;
        String str;
        C566237x r0;
        String A33;
        Long A02;
        AnonymousClass1dM r3 = this.A01;
        C13330nS r1 = r3.A02;
        if (r1 == null) {
            C18240wQ.A0p();
            throw null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "comments_from_facebook_exit_flow"), 426);
        BKU bku = r3.A05;
        if (bku == null || (A33 = bku.A33()) == null || (A02 = AnonymousClass4n2.A02(A33)) == null) {
            j = -1;
        } else {
            j = A02.longValue();
        }
        C18210wN.A18(A0I, j);
        A0I.A0Q("is_exit_to_fb", true);
        A0I.Bb4();
        Context context = this.A00.getContext();
        UserSession A0X = AnonymousClass0wJ.A0X(r3.A0I);
        BKU bku2 = r3.A05;
        if (bku2 == null || (r0 = bku2.A0e.A06) == null) {
            str = "";
        } else {
            str = r0.A01;
        }
        C60903Qz.A00(context, r3, A0X, "fb_comments_thread", AnonymousClass00U.A0L("https://www.facebook.com/story/graphql_permalink/?graphql_id=", str), StringFormatUtil.formatStrLocaleSafe(AnonymousClass320.A00, (Object) str), (String) null, (String) null, true);
    }
}

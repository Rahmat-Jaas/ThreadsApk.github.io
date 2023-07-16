package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.6N3  reason: invalid class name */
public final class AnonymousClass6N3 {
    public static final void A00(Context context, BKU bku, C21839C2o c2o, UserSession userSession, String str, int i, boolean z) {
        AnonymousClass674 r3;
        if (z) {
            r3 = AnonymousClass674.LIKED;
        } else {
            r3 = AnonymousClass674.NOT_LIKED;
        }
        BKU bku2 = bku;
        UserSession userSession2 = userSession;
        C17363A7f.A00(bku2.A2C(), r3, bku2, userSession2);
        Integer num = AnonymousClass006.A00;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i2);
        C21839C2o c2o2 = c2o;
        C19539Ay0.A05(context, c2o2, (C21274Brg) null, r3, bku2, (SearchContext) null, userSession2, num, valueOf, valueOf, -1, str, (Map) null, false);
        C19539Ay0.A03((Activity) null, r3, bku2, c2o2, userSession2, (C145018jf) null, num, i2, -1, -1, false);
    }
}

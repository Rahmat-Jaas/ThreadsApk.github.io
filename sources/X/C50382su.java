package X;

import android.net.Uri;

/* renamed from: X.2su  reason: invalid class name and case insensitive filesystem */
public final class C50382su {
    public static final void A00(Uri uri) {
        if (uri.getQueryParameter(I17.A00(896)) != null) {
            uri.getQueryParameter("upcoming_event_name");
            String queryParameter = uri.getQueryParameter("upcoming_event_start_time");
            if (queryParameter != null) {
                Long.parseLong(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("upcoming_event_end_time");
            if (queryParameter2 != null) {
                Long.parseLong(queryParameter2);
            }
            new C50392sv();
        }
    }
}

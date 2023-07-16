package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.service.session.UserSession;

/* renamed from: X.2zJ  reason: invalid class name and case insensitive filesystem */
public final class C54352zJ {
    public static final void A00(Context context, C21839C2o c2o, UserSession userSession, String str) {
        boolean A1X = C18240wQ.A1X(str);
        Uri.Builder A0E = C18220wO.A0E(AnonymousClass00U.A0L(AnonymousClass320.A03, "donate/"));
        A0E.appendQueryParameter("fundraiser_campaign_id", str);
        A0E.appendQueryParameter("source", "instagram_story_api");
        C60903Qz.A00(context, c2o, userSession, "ig_story", (String) null, A0E.build().toString(), (String) null, (String) null, A1X);
    }
}

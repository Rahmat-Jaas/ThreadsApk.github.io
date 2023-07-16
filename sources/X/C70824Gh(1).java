package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.4Gh  reason: invalid class name and case insensitive filesystem */
public final class C70824Gh implements C82894qR {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C70824Gh(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final void C3B(Context context, C81644o8 r6, C84844tx r7, String str) {
        AnonymousClass0wJ.A1O(r6, context);
        C61833Vz A002 = C36622Sa.A00();
        UserSession userSession = this.A00;
        String str2 = this.A01;
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        A002.A0A(context, r6, QuickPromotionSlot.valueOf(C18220wO.A0u(locale, str2)), userSession);
    }
}

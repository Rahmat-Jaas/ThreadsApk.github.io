package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6PC  reason: invalid class name */
public final class AnonymousClass6PC {
    public static void A00(Activity activity, Context context, UserSession userSession, C171209wF r12, User user, String str, String str2) {
        String AhU = user.A05.AhU();
        UserSession userSession2 = userSession;
        String str3 = str;
        if (AhU == null || !AhU.equals("Eventbrite")) {
            Intent instantExperiencesIntent = AnonymousClass7Dz.getInstance(context).getInstantExperiencesIntent(context, user.getId(), userSession2, str3, "instagram", r12, user.A12());
            if (instantExperiencesIntent != null) {
                C10650ih.A08(activity, instantExperiencesIntent, 1001);
                return;
            }
            return;
        }
        C37350Jpy jpy = new C37350Jpy(activity, userSession, C171209wF.A1y, str);
        jpy.A06(user.getId());
        jpy.A09 = C18180wK.A0j("%s %s %s", new Object[]{"FBExtensions/0.1", "IGInstantExperience/0.1", "(autofill-enabled)"});
        jpy.A07(str2);
        jpy.A04();
    }
}

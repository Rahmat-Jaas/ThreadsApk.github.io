package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.6Vf  reason: invalid class name and case insensitive filesystem */
public final class C102446Vf {
    public static void A00(Activity activity, C11630kW r15, AnonymousClass601 r16, C109326jp r17, C109326jp r18, C37383Jqm jqm, UserSession userSession, User user, String str, String str2, JSONObject jSONObject) {
        String moduleName = r15.getModuleName();
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        User user2 = user;
        Activity activity3 = activity2;
        C72154Mp r10 = new C72154Mp(activity3, r15, r16, r18, r17, userSession2, user2, str2);
        String BK7 = user2.BK7();
        C37032Jj9 jj9 = new C37032Jj9(userSession2);
        jj9.A0M = true;
        jj9.A0Z = true;
        C86104wH.A1P(moduleName, 2, BK7);
        C37090JkM.A00(activity2, (FragmentActivity) null, jqm, jj9, userSession2, user2, r10, moduleName, str, BK7, jSONObject);
    }
}

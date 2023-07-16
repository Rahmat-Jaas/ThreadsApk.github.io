package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.3Dx  reason: invalid class name and case insensitive filesystem */
public final class C58103Dx {
    public final AnonymousClass1dG A00(ImageUrl imageUrl, UserSession userSession, C307722x r7, String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        String obj;
        AnonymousClass1dG r3 = new AnonymousClass1dG();
        Bundle A06 = C18180wK.A06();
        A06.putString("target_user_id", str);
        A06.putString("target_username", str2);
        A06.putParcelable("target_profile_url", imageUrl);
        A06.putSerializable("entry_point", r7);
        if (jSONObject == null) {
            obj = null;
        } else {
            obj = jSONObject.toString();
        }
        A06.putString("analytics_extra", obj);
        A06.putBoolean("hide_action_button", z);
        A06.putBoolean("dont_dismiss_on_restrict_success", z2);
        C05050Qq.A00(A06, userSession);
        r3.setArguments(A06);
        return r3;
    }
}

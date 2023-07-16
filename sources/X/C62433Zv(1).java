package X;

import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.service.session.UserSession;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3Zv  reason: invalid class name and case insensitive filesystem */
public final class C62433Zv {
    public static final String A00(CallerContext callerContext, C10300i6 r4, String str) {
        AccessToken accessToken;
        AnonymousClass0wJ.A1M(r4, 0, callerContext);
        String str2 = callerContext.A02;
        C35802Ow.A00(r4, "token_access", str, str2);
        if (A03(str)) {
            C35802Ow.A00(r4, "token_access", str, str2);
            if (A03(str)) {
                if (r4 instanceof UserSession) {
                    accessToken = C62603aO.A00(((UserSession) r4).getUserId());
                } else {
                    accessToken = C49332rD.A00(r4).A00;
                }
                if (accessToken != null) {
                    return accessToken.A02;
                }
                return null;
            }
        }
        C35802Ow.A00(r4, "access_control_failure", str, str2);
        return null;
    }

    public static final String A01(CallerContext callerContext, C10300i6 r2, String str) {
        AccessToken accessToken;
        AnonymousClass0wJ.A1M(r2, 0, callerContext);
        String str2 = callerContext.A02;
        C35802Ow.A00(r2, "token_id_access", str, str2);
        if (!A03(str)) {
            C35802Ow.A00(r2, "access_control_failure", str, str2);
            return null;
        }
        if (r2 instanceof UserSession) {
            accessToken = C62603aO.A00(((UserSession) r2).getUserId());
        } else {
            accessToken = C49332rD.A00(r2).A00;
        }
        if (accessToken != null) {
            return accessToken.A03;
        }
        return null;
    }

    public static final boolean A02(CallerContext callerContext, C10300i6 r4, String str) {
        AnonymousClass0wJ.A1M(r4, 0, callerContext);
        String str2 = callerContext.A02;
        C35802Ow.A00(r4, "token_access", str, str2);
        if (A03(str)) {
            return !AnonymousClass0hA.A08(A00(callerContext, r4, str));
        }
        C35802Ow.A00(r4, "access_control_failure", str, str2);
        return false;
    }

    public static final boolean A03(String str) {
        if (AnonymousClass0wJ.A1X(C18200wM.A0e())) {
            return C54732zv.A00(AnonymousClass006.A0N, C18210wN.A0a(), str);
        }
        Object A01 = C08960ea.A00(18301199245838992L).A01();
        C04220Ms.A06(A01);
        if (!AnonymousClass0wJ.A1X(A01)) {
            return true;
        }
        String str2 = (String) C08960ea.A00(18864149199323295L).A01();
        if (str2 == null || str == null) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(str2);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.equals(jSONArray.getString(i))) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }
}

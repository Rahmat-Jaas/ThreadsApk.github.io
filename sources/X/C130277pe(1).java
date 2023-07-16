package X;

import com.instagram.service.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7pe  reason: invalid class name and case insensitive filesystem */
public final class C130277pe implements C33430Hnl {
    public final /* synthetic */ UserSession A00;

    public C130277pe(UserSession userSession) {
        this.A00 = userSession;
    }

    public final C32165H8c B7X() {
        UserSession userSession = this.A00;
        JSONObject A0y = C18230wP.A0y();
        try {
            JSONObject A03 = C31032GeB.A03(userSession);
            A0y.putOpt("identifier", (Object) null).put("supported_compression_types", C18250wR.A0i().put("TAR_BROTLI").put("ZIP")).put("device_capabilities", A03);
            if (A03.has("supported_texture_formats")) {
                A0y.put("supported_texture_formats", A03.get("supported_texture_formats"));
            }
            A0y.putOpt("cursor", (Object) null);
        } catch (JSONException e) {
            C10750is.A00(userSession, "CameraEffectApiUtil", C18230wP.A0t("Error adding adding query params to JSON Object: ", e));
        }
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("creatives/effect_gallery/");
        A0N.A0O("query_params", A0y.toString());
        return C18180wK.A0T(A0N, AnonymousClass9LO.class, C118246zz.class);
    }
}

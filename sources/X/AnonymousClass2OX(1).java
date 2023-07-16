package X;

import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.2OX  reason: invalid class name */
public final class AnonymousClass2OX {
    public static final C32165H8c A00(UserSession userSession, List list) {
        C04220Ms.A0B(list, 1);
        JSONArray A0i = C18250wR.A0i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0i.put(C18230wP.A0y().put("m_pk", ((C06) it.next()).getId()));
        }
        String A0n = C18190wL.A0n(A0i);
        H1T A0P = C18180wK.A0P(userSession);
        AnonymousClass0wJ.A1J(A0P, "accounts/", "get_controls_filtered_media/");
        A0P.A0B(AnonymousClass1R0.class, AnonymousClass3K9.class);
        C32165H8c A0T = C18200wM.A0T(A0P, "media_infos", A0n);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetControlsFilteredMediaResponse>>");
        return A0T;
    }
}

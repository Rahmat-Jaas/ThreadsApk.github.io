package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4K7  reason: invalid class name */
public final class AnonymousClass4K7 implements AnonymousClass0RJ {
    public static final AnonymousClass4K7 A00 = new AnonymousClass4K7();

    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        AnonymousClass601 r9 = r11;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        C127397h3 A03 = C63893iY.A03(r12, 0);
        C121997Jj r3 = (C121997Jj) C63893iY.A0B(r12, A1Z ? 1 : 0);
        String A0O = A03.A0O(35, "");
        C04220Ms.A06(A0O);
        if (AnonymousClass8bQ.A0n(A0O)) {
            return null;
        }
        JSONObject A0j = C18250wR.A0j(A0O);
        String string = A0j.getString("headers");
        String string2 = A0j.getString("registration_response");
        AnonymousClass0RG r4 = AnonymousClass0RA.A0C;
        C07530bf A05 = r4.A05(A00);
        C04220Ms.A06(string);
        try {
            Object A07 = new Gson().A07(string, new AnonymousClass1QV().type);
            C04220Ms.A06(A07);
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator A0z = AnonymousClass0wJ.A0z((Map) A07);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object key = A0o.getKey();
                List A0h = C18210wN.A0h(C18230wP.A0u(A0o));
                C04220Ms.A06(A0h);
                A0y.put(key, A0h);
            }
            new C685644h(A05).D8b(new URI("https://i.instagram.com/api/v1/bloks/apps/com.bloks.www.bloks.caa.reg.tos.async/"), A0y);
        } catch (LWW e) {
            AnonymousClass0LU.A0E("BKBloksActionCaaHandleLoginResponseForContextChangeImpl", "Exception parsing JSON", e);
        }
        try {
            C22241Ty parseFromJson = AnonymousClass3OC.parseFromJson(C18180wK.A0L(string2));
            User user = parseFromJson.A01;
            C04220Ms.A06(user);
            new C28431uG(C63913ic.A01(r9), r9, new RegFlowExtras(), A05, C313625r.NONE).A00(parseFromJson);
            if (r3 != null) {
                AnonymousClass3HX r6 = r9.A00;
                C04220Ms.A0C(r6, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
                String id = user.getId();
                Bundle A06 = C18180wK.A06();
                C18190wL.A13(A06, id);
                A06.putBoolean("IS_SIGN_UP_FLOW", A1Z);
                UserSession A062 = r4.A06(A06);
                Fragment fragment = ((C130667qT) r6.A02).A02;
                fragment.getClass();
                C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.instagram.base.fragment.IgDialogFragmentCompat");
                C130667qT A02 = C130667qT.A02(fragment, A062, (C30938GbW) null);
                return C122047Jt.A02(r6.A00, C61323St.A00(r3), A02, C63893iY.A01, AnonymousClass4To.A00());
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}

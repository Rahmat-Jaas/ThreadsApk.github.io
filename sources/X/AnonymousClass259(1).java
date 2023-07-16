package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.259  reason: invalid class name */
public enum AnonymousClass259 {
    ;

    public final void A00(Context context, AnonymousClass06E r7, C63873iU r8, C10300i6 r9, String str, String str2, String str3, List list, Map map, Set set, boolean z) {
        boolean z2 = this instanceof C27171s5;
        H1T A0N = AnonymousClass0wJ.A0N(r9);
        if (z2) {
            A0N.A0J("users/check_email/");
            A0N.A0O("email", str);
            A0N.A0O("qe_id", C18200wM.A0g());
            AnonymousClass269.A0A(A0N, "android_device_id", str2);
            A0N.A0B(C22181Tr.class, AnonymousClass3NV.class);
            if (set != null) {
                A0N.A0O("login_nonces", C18200wM.A0o(set));
                JSONObject A0y = C18230wP.A0y();
                Iterator A0z = AnonymousClass0wJ.A0z(map);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    A0y.put(C18200wM.A0p(A0o), A0o.getValue());
                }
                A0N.A0O("login_nonce_map", A0y.toString());
                if (z) {
                    A0N.A0O("prefill_shown", "False");
                    if (list != null && !list.isEmpty()) {
                        JSONArray A0i = C18250wR.A0i();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C18210wN.A1R(it, A0i);
                        }
                        C18230wP.A1I(A0N, A0i);
                    }
                    if (str3 != null) {
                        A0N.A0O("big_blue_token", str3);
                    }
                    A0N.A0O("phone_id", C18190wL.A0l(r9));
                }
            }
            C32165H8c A0Q = C18190wL.A0Q(A0N);
            A0Q.A00 = r8;
            C31155GhB.A01(context, r7, A0Q);
            return;
        }
        A0N.A0O(C62983bG.A03(0, 9, 122), str2);
        A0N.A0O("guid", C18200wM.A0g());
        A0N.A0J("accounts/check_phone_number/");
        C18180wK.A1J(A0N, r9, C62983bG.A03(9, 12, 69), str);
        A0N.A0B(AnonymousClass1SQ.class, AnonymousClass3NY.class);
        if (set != null) {
            A0N.A0O("login_nonces", C18200wM.A0o(set));
        }
        JSONObject A0y2 = C18230wP.A0y();
        Iterator A0z2 = AnonymousClass0wJ.A0z(map);
        while (A0z2.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0z2);
            A0y2.put(C18200wM.A0p(A0o2), A0o2.getValue());
        }
        A0N.A0O("login_nonce_map", A0y2.toString());
        if (z) {
            A0N.A0O("prefill_shown", "False");
            if (list != null && !list.isEmpty()) {
                JSONArray A0i2 = C18250wR.A0i();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C18210wN.A1R(it2, A0i2);
                }
                C18230wP.A1I(A0N, A0i2);
            }
            if (str3 != null) {
                A0N.A0O("big_blue_token", str3);
            }
        }
        C32165H8c A0Q2 = C18190wL.A0Q(A0N);
        A0Q2.A00 = r8;
        C31155GhB.A01(context, r7, A0Q2);
    }
}

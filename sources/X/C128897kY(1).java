package X;

import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7kY  reason: invalid class name and case insensitive filesystem */
public final class C128897kY implements C143688h9 {
    public final C128937kc A00;

    public final void Bb8(String str, Map map) {
        String str2;
        if (map != null) {
            HashMap A0j = C86164wN.A0j(map);
            IVw iVw = new IVw(K9R.A00);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                boolean z = A0o.getValue() instanceof Integer;
                String A0p = C18200wM.A0p(A0o);
                if (z) {
                    iVw.A02((Integer) A0o.getValue(), A0p);
                } else {
                    if (A0o.getValue() != null) {
                        str2 = A0o.getValue().toString();
                    } else {
                        str2 = null;
                    }
                    iVw.A04(A0p, str2);
                }
            }
            A0j.put("paymod_extra_data", iVw.toString());
            this.A00.Bb8(str, Collections.unmodifiableMap(A0j));
        }
    }

    public C128897kY(UserSession userSession) {
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "payflows";
        C13330nS A002 = r1.A00();
        this.A00 = new C128937kc(A002, new C128947kd(A002));
    }
}

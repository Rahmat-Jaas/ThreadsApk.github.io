package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7kX  reason: invalid class name and case insensitive filesystem */
public final class C128887kX implements C143688h9 {
    public final C143688h9 A00;

    public final void Bb8(String str, Map map) {
        C143688h9 r2;
        Map unmodifiableMap;
        String str2;
        if (map != null) {
            if (str.equals("fbpay_auth_ticket_query_fail")) {
                r2 = this.A00;
                HashMap A0j = C86164wN.A0j(map);
                A0j.put("flow_step", "auth_ticket_query");
                unmodifiableMap = Collections.unmodifiableMap(A0j);
                str2 = "payflows_fail";
            } else if (str.equals("fbpay_auth_ticket_query_success")) {
                r2 = this.A00;
                HashMap A0j2 = C86164wN.A0j(map);
                A0j2.put("flow_step", "auth_ticket_query");
                unmodifiableMap = Collections.unmodifiableMap(A0j2);
                str2 = "payflows_success";
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A0V("Event name ", str, " is not supported!"));
            }
            r2.Bb8(str2, unmodifiableMap);
        }
    }

    public C128887kX(C143688h9 r1) {
        this.A00 = r1;
    }
}

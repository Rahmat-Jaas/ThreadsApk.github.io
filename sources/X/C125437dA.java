package X;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.7dA  reason: invalid class name and case insensitive filesystem */
public final class C125437dA implements C39729Kyr {
    public final Map A00;

    public final boolean BTX(Object obj) {
        Map map = this.A00;
        Map map2 = ((C125437dA) obj).A00;
        if (map.size() == map2.size()) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            Iterator A0z2 = AnonymousClass0wJ.A0z(map2);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Map.Entry A0o2 = C18180wK.A0o(A0z2);
                if (A0o != null) {
                    if (A0o2 != null) {
                        if (A0o.getKey() == null || C18200wM.A0p(A0o).equals(A0o2.getKey())) {
                            if (A0o.getValue() != null && !C18230wP.A0u(A0o).equals(A0o2.getValue())) {
                                return false;
                            }
                        }
                    }
                } else if (A0o2 == null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int CuF() {
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        int i = 0;
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            i += C86154wM.A06(C18230wP.A0u(A0o), C18200wM.A0p(A0o).length());
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ JSONObject CxI(Object obj, JSONObject jSONObject) {
        String str = (String) obj;
        JSONObject A0y = C18230wP.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        boolean z = false;
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (A0o.getKey() != null && !C18200wM.A0p(A0o).isEmpty() && A0o.getValue() != null && !C18230wP.A0u(A0o).isEmpty()) {
                z = true;
                A0y.put(C18200wM.A0p(A0o), A0o.getValue());
            }
        }
        if (z) {
            return jSONObject.put(str, A0y);
        }
        return jSONObject;
    }

    public C125437dA(Enumeration enumeration) {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        while (enumeration.hasMoreElements()) {
            InetAddress inetAddress = (InetAddress) enumeration.nextElement();
            boolean z = inetAddress instanceof Inet4Address;
            if (z || (inetAddress instanceof Inet6Address)) {
                String hostAddress = inetAddress.getHostAddress();
                if (z) {
                    str = "v4";
                } else {
                    str = "v6";
                }
                A0y.put(str, hostAddress.contains("%") ? hostAddress.substring(0, hostAddress.indexOf(37)) : hostAddress);
            }
        }
        this.A00 = A0y;
    }
}

package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3ye  reason: invalid class name and case insensitive filesystem */
public final class C66963ye implements C33572HqU {
    public final Map A00 = new C013306f();

    public final void CYW(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        this.A00.put(str, str2);
    }

    public final void Ccw(String str, String str2, Throwable th) {
        AnonymousClass0wJ.A1N(str, str2);
        Map map = this.A00;
        if (map.size() > 0) {
            StringBuilder A0s = C18190wL.A0s("message:");
            A0s.append(str2);
            A0s.append("\n");
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                String A0p = C18200wM.A0p(A0o);
                String A0u = C18230wP.A0u(A0o);
                A0s.append(A0p);
                C18230wP.A1S(":", A0u, "\n", A0s);
            }
            C30967GcS.A01((AnonymousClass3HX) null, str, A0s.toString(), th, 0);
            map.clear();
            return;
        }
        C30967GcS.A01((AnonymousClass3HX) null, str, str2, th, 0);
    }
}

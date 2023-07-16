package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3UL  reason: invalid class name */
public final class AnonymousClass3UL {
    public HashMap A00 = AnonymousClass0wJ.A0y();

    public final synchronized AnonymousClass3UL A01() {
        AnonymousClass3UL r2;
        r2 = new AnonymousClass3UL();
        r2.A00 = new HashMap(this.A00);
        return r2;
    }

    public static String A00(HashMap hashMap) {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                A0K.A0c(C18200wM.A0p(A0o), C18190wL.A08(A0o.getValue()));
            }
            return C18180wK.A0h(A0K, A0d);
        } catch (IOException e) {
            AnonymousClass0LU.A0F("PendingReelTraySeenState", "Failed to serialize reel tray seen state to json", e);
            return null;
        }
    }
}

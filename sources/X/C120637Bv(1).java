package X;

import android.os.Bundle;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.7Bv  reason: invalid class name and case insensitive filesystem */
public final class C120637Bv {
    public static final Map A01(Bundle bundle, HashMap hashMap, String[] strArr) {
        Object A0L;
        List A17 = C06750aI.A17(AnonymousClass000.A00(1207), AnonymousClass000.A00(1208), AnonymousClass000.A00(1209), AnonymousClass000.A00(1210), AnonymousClass000.A00(31));
        LinkedHashMap A0y = C18220wO.A0y();
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(hashMap.size()));
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            if (A17.contains(A0o.getKey())) {
                A0L = A0o.getKey();
            } else {
                A0L = AnonymousClass00U.A0L("prop_", C18200wM.A0p(A0o));
            }
            C86144wL.A1P(A0L, A0v, A0o);
        }
        builder.putAll((Map) A0v);
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        A0y.putAll(build);
        for (String str : strArr) {
            if (bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    obj = "";
                }
                A0y.put(str, obj);
            }
        }
        return A0y;
    }

    public static final void A02(HashMap hashMap) {
        if (!hashMap.containsKey("shopping_session_id")) {
            hashMap.put("shopping_session_id", C18190wL.A0n(UUID.randomUUID()));
        }
        String A00 = I17.A00(HttpStatus.SC_PARTIAL_CONTENT);
        if (!hashMap.containsKey(A00)) {
            hashMap.put(A00, C122037Js.A00());
        }
    }

    public static final HashMap A00(Bundle bundle, String[] strArr) {
        Set<String> keySet = bundle.keySet();
        C04220Ms.A06(keySet);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (T next : keySet) {
            String str = (String) next;
            if (bundle.get(str) != null && !AnonymousClass8AP.A0E(str, strArr)) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A0w.add(C18180wK.A0p(A0k, String.valueOf(bundle.get(A0k))));
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass4WJ.A0J(A0w, A0y);
        return A0y;
    }
}

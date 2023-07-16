package X;

import com.instagram.model.shopping.ProductGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7tG  reason: invalid class name and case insensitive filesystem */
public final class C132067tG implements AnonymousClass0i4 {
    public final LinkedHashMap A00 = new MVD();

    public final void A00(ProductGroup productGroup, String str) {
        C04220Ms.A0B(str, 0);
        if (productGroup != null) {
            LinkedHashMap linkedHashMap = this.A00;
            if (linkedHashMap.containsKey(str)) {
                LinkedHashMap A0v = C18190wL.A0v(25);
                Iterator A0t = C86134wK.A0t(linkedHashMap.entrySet());
                while (A0t.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0t);
                    if (!str.equals(A0o.getKey())) {
                        Object key = A0o.getKey();
                        C04220Ms.A06(key);
                        Object value = A0o.getValue();
                        C04220Ms.A06(value);
                        A0v.put(key, value);
                    }
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(A0v);
            }
            linkedHashMap.put(str, productGroup);
        }
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}

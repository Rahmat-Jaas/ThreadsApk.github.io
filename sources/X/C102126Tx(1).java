package X;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Tx  reason: invalid class name and case insensitive filesystem */
public final class C102126Tx {
    public static final List A00(List list) {
        if (list == null) {
            return null;
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            Purchase purchase = (Purchase) next;
            StringBuilder A0s = C18190wL.A0s("sku");
            A0s.append("_");
            A0s.append(i);
            A0s.append(": ");
            A0s.append(C98816Ha.A00(purchase));
            C86144wL.A1T(A0s);
            A0s.append("orderId");
            A0s.append("_");
            A0s.append(i);
            A0s.append(": ");
            A0s.append(purchase.A02.optString("orderId"));
            A0w.add(C18180wK.A0i("; ", A0s));
            i = i2;
        }
        return A0w;
    }
}

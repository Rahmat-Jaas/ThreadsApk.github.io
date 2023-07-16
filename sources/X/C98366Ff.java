package X;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6Ff  reason: invalid class name and case insensitive filesystem */
public final class C98366Ff {
    public static final C121177En A00(Bundle bundle, Bundle bundle2) {
        AbstractMap abstractMap;
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw C18180wK.A0a("Invalid bundle passed as restored state");
            }
            abstractMap = C18220wO.A0y();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                C18240wQ.A1I(obj);
                abstractMap.put(obj, parcelableArrayList2.get(i));
            }
        } else if (bundle2 == null) {
            return new C121177En();
        } else {
            abstractMap = AnonymousClass0wJ.A0y();
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                C04220Ms.A04(A0k);
                abstractMap.put(A0k, bundle2.get(A0k));
            }
        }
        return new C121177En(abstractMap);
    }
}

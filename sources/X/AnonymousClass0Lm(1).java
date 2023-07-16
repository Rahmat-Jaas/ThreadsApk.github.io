package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0Lm  reason: invalid class name */
public final class AnonymousClass0Lm {
    public static void A00(Object obj, ArrayList arrayList) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length > 0) {
                arrayList.ensureCapacity(arrayList.size() + length);
                Collections.addAll(arrayList, objArr);
            }
        } else if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object add : (Iterable) obj) {
                arrayList.add(add);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            StringBuilder sb = new StringBuilder("Don't know how to spread ");
            sb.append(obj.getClass());
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}

package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.75P  reason: invalid class name */
public final class AnonymousClass75P {
    public final Map A00;
    public final Map A01 = AnonymousClass0wJ.A0y();

    public static void A00(AnonymousClass060 r4, AnonymousClass066 r5, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C113526rZ r2 = (C113526rZ) list.get(size);
                    try {
                        int i = r2.A00;
                        if (i == 0) {
                            method = r2.A01;
                            objArr = new Object[0];
                        } else if (i != 1) {
                            method = r2.A01;
                            objArr = new Object[]{r5, r4};
                        } else {
                            method = r2.A01;
                            objArr = new Object[]{r5};
                        }
                        method.invoke(obj, objArr);
                    } catch (InvocationTargetException e) {
                        throw C86154wM.A0h("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw C86114wI.A0k(e2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public AnonymousClass75P(Map map) {
        this.A00 = map;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object value = A0o.getValue();
            List list = (List) this.A01.get(value);
            if (list == null) {
                list = AnonymousClass0wJ.A0v();
                this.A01.put(value, list);
            }
            list.add(A0o.getKey());
        }
    }
}

package X;

import com.facebook.nativeutil.NativeList;
import com.facebook.nativeutil.NativeMap;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6HK  reason: invalid class name */
public final class AnonymousClass6HK {
    public static Object A00(Object obj) {
        List list;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(C86124wJ.A00(obj));
        }
        if (obj instanceof Map) {
            return new NativeMap((Map) obj);
        }
        if (obj.getClass().isArray()) {
            list = ImmutableList.of(obj);
        } else if (!(obj instanceof List)) {
            return obj;
        } else {
            list = (List) obj;
        }
        return new NativeList(list);
    }
}

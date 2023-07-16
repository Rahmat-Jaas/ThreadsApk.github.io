package X;

import android.graphics.drawable.ColorDrawable;
import android.util.Pair;
import android.util.Size;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7G8  reason: invalid class name */
public final class AnonymousClass7G8 {
    public static final Map A00;

    public static Boolean A00(C40883LqM lqM, Class cls, Object obj, Field field) {
        Map map = A00;
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            Class cls2 = (Class) A0x.next();
            if (cls2.isAssignableFrom(cls)) {
                C143388gd r0 = (C143388gd) map.get(cls2);
                if (r0 != null) {
                    return Boolean.valueOf(r0.DBL(lqM, obj, field));
                }
                return null;
            }
        }
        return null;
    }

    public static void A01(Object obj, Map map) {
        map.put(obj, new C41357MFk());
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A00 = A0y;
        A01(Integer.TYPE, A0y);
        A01(Float.TYPE, A0y);
        A01(Double.TYPE, A0y);
        A01(Long.TYPE, A0y);
        A01(Short.TYPE, A0y);
        A01(Byte.TYPE, A0y);
        A01(Integer.class, A0y);
        A01(Float.class, A0y);
        A01(Double.class, A0y);
        A01(Long.class, A0y);
        A01(Short.class, A0y);
        A01(Byte.class, A0y);
        A0y.put(CharSequence.class, new C41358MFl());
        A0y.put(Pair.class, new C41356MFj());
        C41355MFi mFi = new C41355MFi();
        A0y.put(Boolean.class, mFi);
        A0y.put(Boolean.TYPE, mFi);
        A0y.put(AtomicReference.class, new C126767fu());
        A0y.put(AtomicBoolean.class, new C41353MFg());
        A0y.put(AtomicInteger.class, new C41354MFh());
        A0y.put(List.class, new C126797fx());
        Object value = C126807fy.A00.getValue();
        A00.put(Map.class, value);
        Object value2 = C126817fz.A00.getValue();
        Map map = A00;
        map.put(AnonymousClass7A9.class, value2);
        map.put(Size.class, new C41359MFm());
        map.put(ColorDrawable.class, new C126777fv());
        map.put(L6M.class, new C126787fw());
    }
}

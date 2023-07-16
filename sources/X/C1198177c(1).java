package X;

import android.util.LongSparseArray;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.77c  reason: invalid class name and case insensitive filesystem */
public final class C1198177c {
    public final LongSparseArray A00 = new LongSparseArray();
    public final Map A01;

    public C1198177c(Map map) {
        this.A01 = map;
    }

    public static void A00(C145818l8 r3, Object obj) {
        Class AwA = r3.AwA();
        Class<?> cls = obj.getClass();
        if (!AwA.isAssignableFrom(cls)) {
            throw C18180wK.A0a(String.format(Locale.US, "Expected McfRef object of type '%s' but actual was '%s'", new Object[]{AwA, cls}));
        }
    }

    public final Object A01(C145818l8 r6) {
        Object obj;
        long BJ5 = r6.BJ5();
        LongSparseArray longSparseArray = this.A00;
        synchronized (longSparseArray) {
            obj = longSparseArray.get(BJ5);
        }
        if (obj != null) {
            A00(r6, obj);
            return obj;
        }
        McfReference mcfReference = (McfReference) this.A01.get(Long.valueOf(BJ5));
        if (mcfReference == null) {
            return null;
        }
        Object AEU = r6.AEU(mcfReference);
        A00(r6, AEU);
        synchronized (longSparseArray) {
            longSparseArray.put(BJ5, AEU);
        }
        return AEU;
    }
}

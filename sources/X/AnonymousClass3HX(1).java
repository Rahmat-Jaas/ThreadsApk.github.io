package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3HX  reason: invalid class name */
public final class AnonymousClass3HX {
    public final Context A00;
    public final SparseArray A01;
    public final C83454rP A02;
    public final boolean A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap(4));
    public final Map A05 = new HashMap(4);

    public final Object A00(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return obj;
        }
        throw C18210wN.A0W(AnonymousClass00U.A0L("Null value associated with key: ", this.A00.getResources().getResourceEntryName(i)));
    }

    public final Object A01(C82344pT r6, C127397h3 r7, int i) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i2 = r7.A02;
        synchronized (this) {
            Map map = this.A05;
            valueOf = Integer.valueOf(i2);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = new Object();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A04;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i);
            if (obj2 == null) {
                obj2 = r6.Bhh(this, r7);
            }
            sparseArray.put(i, obj2);
        }
        return obj2;
    }

    public AnonymousClass3HX(Context context, SparseArray sparseArray, C83454rP r5) {
        this.A00 = context;
        this.A02 = r5;
        C82174pC r0 = r5.ATb().A02;
        this.A03 = (r0 == null ? C1197476t.A07 : r0).ABX(context);
        this.A01 = sparseArray;
    }
}

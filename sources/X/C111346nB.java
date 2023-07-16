package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.6nB  reason: invalid class name and case insensitive filesystem */
public final class C111346nB {
    public final AnonymousClass7IK A00(C147188nY r5) {
        AnonymousClass7IK r1;
        r5.Cvb(-1366542614);
        View view = (View) r5.AEA(AnonymousClass7DA.A05);
        WeakHashMap weakHashMap = AnonymousClass7IK.A0O;
        synchronized (weakHashMap) {
            Object obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new AnonymousClass7IK(view);
                weakHashMap.put(view, obj);
            }
            r1 = (AnonymousClass7IK) obj;
        }
        AnonymousClass7K5.A04(r5, r1, C86164wN.A10(r1, view, 29));
        AnonymousClass7W3.A0y(r5);
        return r1;
    }
}

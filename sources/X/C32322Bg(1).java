package X;

import android.content.Context;
import android.util.SparseArray;
import com.bloks.foa.screenqueries.screencontainer.ScreenContainerDelegate;
import com.instagram.barcelona.R;

/* renamed from: X.2Bg  reason: invalid class name and case insensitive filesystem */
public final class C32322Bg {
    public static final ScreenContainerDelegate A00(Context context, C66833yP r8, C84884uA r9, C83454rP r10, Integer num) {
        SparseArray sparseArray;
        Integer num2 = num;
        C04220Ms.A0B(num, 4);
        C66833yP r4 = r8;
        SparseArray sparseArray2 = r8.A01;
        Integer num3 = null;
        if (sparseArray2 == null || (sparseArray = sparseArray2.clone()) == null) {
            sparseArray = new SparseArray(2);
        }
        sparseArray.put(R.id.bk_screen_container, r9);
        C81864oW r0 = r8.A03;
        if (r0 != null) {
            num3 = Integer.valueOf(r0.B91());
        }
        sparseArray.put(R.id.bk_screen_container_type, num3);
        ScreenContainerDelegate screenContainerDelegate = new ScreenContainerDelegate(context, sparseArray, r4, r10, num2);
        r9.getLifecycle().A07(screenContainerDelegate);
        return screenContainerDelegate;
    }
}

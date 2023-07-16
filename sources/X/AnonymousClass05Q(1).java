package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.05Q  reason: invalid class name */
public final class AnonymousClass05Q {
    public static final AnonymousClass05Y A00 = new C12810mW();
    public static final AnonymousClass05Y A01;

    static {
        AnonymousClass05Y r0;
        try {
            r0 = (AnonymousClass05Y) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A01 = r0;
    }

    public static void A00(C013306f r7, Fragment fragment, Fragment fragment2, boolean z) {
        C18209Abd enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = r7.size();
            for (int i = 0; i < size; i++) {
                Object[] objArr = r7.A02;
                int i2 = i << 1;
                arrayList2.add(objArr[i2]);
                arrayList.add(objArr[i2 + 1]);
            }
        }
    }

    public static void A01(ArrayList arrayList, int i) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((View) arrayList.get(size)).setVisibility(i);
            } else {
                return;
            }
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.util.Set;

/* renamed from: X.05t  reason: invalid class name and case insensitive filesystem */
public final class C012405t {
    public static C012305s A00 = C012305s.A02;
    public static final C012405t A01 = new C012405t();

    public static final C012305s A00(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.mParentFragment;
        }
        return A00;
    }

    public static final void A01(Fragment fragment, String str) {
        C13380na r3 = new C13380na(fragment, str);
        C12560m7.A0E(3);
        C012305s A002 = A00(fragment);
        if (A002.A01.contains(C012005o.DETECT_FRAGMENT_REUSE) && A03(A002, fragment.getClass(), r3.getClass())) {
            A02(A002, r3);
        }
    }

    public static final void A02(C012305s r5, C012505u r6) {
        Fragment fragment = r6.A00;
        String name = fragment.getClass().getName();
        Set set = r5.A01;
        set.contains(C012005o.PENALTY_LOG);
        if (set.contains(C012005o.PENALTY_DEATH)) {
            C011905n r3 = new C011905n(r6, name);
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().A09.A02;
                if (!C04220Ms.A0I(handler.getLooper(), Looper.myLooper())) {
                    handler.post(r3);
                    return;
                }
            }
            r3.run();
        }
    }

    public static final boolean A03(C012305s r2, Class cls, Class cls2) {
        Set set = (Set) r2.A00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C04220Ms.A0I(cls2.getSuperclass(), C012505u.class) || !AnonymousClass00J.A0k(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}

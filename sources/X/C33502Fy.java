package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2Fy  reason: invalid class name and case insensitive filesystem */
public final class C33502Fy {
    public static final E2V A00(FragmentActivity fragmentActivity, AnonymousClass3HX r3) {
        AnonymousClass0wJ.A1N(r3, fragmentActivity);
        for (Fragment A00 = C63913ic.A00(r3); A00 != null; A00 = A00.mParentFragment) {
            if (A00 instanceof C82044oz) {
                return ((C82044oz) A00).AOh();
            }
        }
        return E2V.A03(fragmentActivity);
    }
}

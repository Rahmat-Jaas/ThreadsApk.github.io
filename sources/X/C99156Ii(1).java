package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.6Ii  reason: invalid class name and case insensitive filesystem */
public final class C99156Ii {
    public static boolean A00(Bundle bundle, Fragment fragment, boolean z) {
        Fragment targetFragment = fragment.getTargetFragment();
        if ((targetFragment instanceof C143648h5) && ((C143648h5) targetFragment).Bzy(bundle, fragment.getTargetRequestCode(), z)) {
            return true;
        }
        Fragment fragment2 = fragment.mParentFragment;
        if ((fragment2 instanceof C143648h5) && ((C143648h5) fragment2).Bzy(bundle, fragment.getTargetRequestCode(), z)) {
            return true;
        }
        FragmentActivity activity = fragment.getActivity();
        return (activity instanceof C143648h5) && ((C143648h5) activity).Bzy(bundle, fragment.getTargetRequestCode(), z);
    }
}

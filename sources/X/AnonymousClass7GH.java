package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;

/* renamed from: X.7GH  reason: invalid class name */
public final class AnonymousClass7GH {
    public static final AnonymousClass7GH A00 = new AnonymousClass7GH();

    public static final void A00(Fragment fragment) {
        if (fragment != null && fragment.getActivity() != null) {
            C25828Dsm dsm = new C25828Dsm(fragment.requireActivity());
            dsm.A0K(2131826249);
            dsm.A0L(2131823081);
            dsm.A0O((DialogInterface.OnClickListener) null, 2131826243);
            AnonymousClass0wJ.A1K(dsm);
        }
    }

    public static final boolean A01(Fragment fragment) {
        if (fragment.getActivity() == null || fragment.getContext() == null || fragment.requireActivity().isFinishing() || fragment.requireActivity().isDestroyed() || fragment.mView == null || !fragment.isAdded() || fragment.mDetached || fragment.mRemoving || fragment.mViewLifecycleOwnerLiveData.A08() == null) {
            return false;
        }
        return true;
    }
}

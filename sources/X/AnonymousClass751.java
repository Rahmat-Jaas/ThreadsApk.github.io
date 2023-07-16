package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.751  reason: invalid class name */
public final class AnonymousClass751 {
    public final C10300i6 A00;

    public static Fragment A00(Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 == null || (fragment instanceof C956661r)) {
            return fragment;
        }
        return A00(fragment2);
    }

    public AnonymousClass751(C10300i6 r1) {
        this.A00 = r1;
    }
}

package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.04h  reason: invalid class name and case insensitive filesystem */
public final class C009604h implements C142618fJ {
    public final /* synthetic */ Fragment A00;

    public C009604h(Fragment fragment) {
        this.A00 = fragment;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Fragment fragment = this.A00;
        C04600Oi r1 = fragment.mHost;
        if (r1 instanceof AnonymousClass00S) {
            return ((AnonymousClass00S) r1).getActivityResultRegistry();
        }
        return fragment.requireActivity().getActivityResultRegistry();
    }
}

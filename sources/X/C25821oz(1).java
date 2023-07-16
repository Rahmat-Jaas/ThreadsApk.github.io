package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1oz  reason: invalid class name and case insensitive filesystem */
public final class C25821oz extends AnonymousClass3GR {
    public final /* synthetic */ C71144Hr A00;

    public C25821oz(C71144Hr r1) {
        this.A00 = r1;
    }

    public final void onFail(String str) {
        FragmentActivity activity = this.A00.A00.getActivity();
        if (activity != null) {
            C63733iD.A0A(C63733iD.A03(activity));
        }
    }

    public final void onSuccess() {
        Fragment fragment = this.A00.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            C35082Ma.A00(fragment.getActivity(), E2V.A03(activity).A0O.getMeasuredHeight());
        }
    }
}

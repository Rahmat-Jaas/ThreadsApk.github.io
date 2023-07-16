package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDCallbackShape633S0100000_1_I2;

/* renamed from: X.1lR  reason: invalid class name */
public final class AnonymousClass1lR extends C30809GWj {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C10300i6 A01;

    public AnonymousClass1lR(Fragment fragment, C10300i6 r2) {
        this.A00 = fragment;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        C62783aj r4 = (C62783aj) obj;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            r4.getSmartLockBroker(activity, new IDxDCallbackShape633S0100000_1_I2(this, 5), this.A01);
        }
    }
}

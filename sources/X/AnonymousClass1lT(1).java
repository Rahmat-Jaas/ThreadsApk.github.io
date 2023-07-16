package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDCallbackShape633S0100000_1_I2;

/* renamed from: X.1lT  reason: invalid class name */
public final class AnonymousClass1lT extends C30809GWj {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C58223Eo A02;
    public final /* synthetic */ C07530bf A03;
    public final /* synthetic */ AnonymousClass265 A04;

    public AnonymousClass1lT(Fragment fragment, FragmentActivity fragmentActivity, C58223Eo r3, C07530bf r4, AnonymousClass265 r5) {
        this.A01 = fragmentActivity;
        this.A00 = fragment;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        C62783aj r4 = (C62783aj) obj;
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity != null) {
            r4.getSmartLockBroker(fragmentActivity, new IDxDCallbackShape633S0100000_1_I2(this, 6), this.A03);
        }
    }
}

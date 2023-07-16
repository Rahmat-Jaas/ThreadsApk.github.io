package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDCallbackShape633S0100000_1_I2;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;

/* renamed from: X.1lS  reason: invalid class name */
public final class AnonymousClass1lS extends C30809GWj {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C84484tD A01;
    public final /* synthetic */ C07530bf A02;
    public final /* synthetic */ AnonymousClass265 A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass1lS(Fragment fragment, C84484tD r2, C07530bf r3, AnonymousClass265 r4, boolean z) {
        this.A01 = r2;
        this.A00 = fragment;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        C84484tD r1;
        String str;
        FragmentActivity activity;
        C62783aj r5 = (C62783aj) obj;
        if (!((SmartLockPluginImpl) r5).A00) {
            r1 = this.A01;
            str = "SmartLock disabled";
        } else {
            Fragment fragment = this.A00;
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                r1 = this.A01;
                str = "Activity is null";
            } else {
                r5.getSmartLockBroker(activity, new IDxDCallbackShape633S0100000_1_I2(this, 3), this.A02, false);
                return;
            }
        }
        r1.BNe(str);
    }
}

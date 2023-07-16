package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1rH  reason: invalid class name and case insensitive filesystem */
public final class C26821rH extends C24431ij implements C21800C0z {
    public final C34640IcN A00;
    public final C18330wh A01;

    public C26821rH(C34640IcN icN, C11630kW r13, C84634tZ r14, C07530bf r15, AnonymousClass265 r16, String str) {
        super(icN.requireActivity(), (Uri) null, r13, r14, r15, r16, AnonymousClass006.A0C, str);
        this.A00 = icN;
        C18330wh A012 = C18330wh.A01(icN);
        this.A01 = A012;
        C18330wh.A03(icN, A012, 2131830126);
        icN.registerLifecycleListener(this);
    }

    public final /* synthetic */ void Bsd(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final boolean A04() {
        FragmentActivity activity;
        C34640IcN icN = this.A00;
        if (icN.mView == null || (activity = icN.getActivity()) == null || !icN.isAdded() || icN.mRemoving || icN.mDetached || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public final void onDestroy() {
        this.A00.unregisterLifecycleListener(this);
    }

    public final void onPause() {
        this.A01.dismiss();
    }

    public final void onResume() {
        C13950oZ.A00(this.A01);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(1234794583);
        if (A04()) {
            this.A01.dismiss();
        }
        this.A00.unregisterLifecycleListener(this);
        super.onFinish();
        C14030oh.A0A(-1511192229, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1260388047);
        if (A04()) {
            C13950oZ.A00(this.A01);
        }
        super.onStart();
        C14030oh.A0A(1059200533, A03);
    }
}

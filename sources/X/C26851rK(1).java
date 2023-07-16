package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;

/* renamed from: X.1rK  reason: invalid class name and case insensitive filesystem */
public final class C26851rK extends C70224Dh implements C21800C0z {
    public Dialog A00;
    public Context A01;
    public final FragmentActivity A02;
    public final C34640IcN A03;
    public final C07530bf A04;
    public final AnonymousClass265 A05;

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

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroy() {
        this.A03.unregisterLifecycleListener(this);
    }

    public final void onPause() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void onResume() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            A00(dialog, this);
        }
    }

    public C26851rK(Context context, FragmentActivity fragmentActivity, C34640IcN icN, C07530bf r4, AnonymousClass265 r5) {
        super(fragmentActivity);
        this.A02 = fragmentActivity;
        this.A01 = context;
        this.A04 = r4;
        this.A03 = icN;
        this.A05 = r5;
        icN.registerLifecycleListener(this);
    }

    public static void A00(Dialog dialog, C26851rK r5) {
        String str;
        C13950oZ.A00(dialog);
        C07530bf r4 = r5.A04;
        AnonymousClass265 r0 = r5.A05;
        if (r0 == null) {
            str = "";
        } else {
            str = r0.A01;
        }
        C63523hf.A05(r4, str, "login", "invalid_saved_credentials");
        if (C62783aj.getInstance() != null) {
            ((SmartLockPluginImpl) C62783aj.getInstance()).A00 = false;
        }
    }
}

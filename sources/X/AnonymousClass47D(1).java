package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCListenerShape2S0110000_1_I2;

/* renamed from: X.47D  reason: invalid class name */
public final class AnonymousClass47D implements C21800C0z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IDxCListenerShape2S0110000_1_I2 A01;
    public final /* synthetic */ C58753Hb A02;

    public final /* synthetic */ void Bsd(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
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

    public AnonymousClass47D(IDxCListenerShape2S0110000_1_I2 iDxCListenerShape2S0110000_1_I2, C58753Hb r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = iDxCListenerShape2S0110000_1_I2;
    }

    public final void onDestroyView() {
        this.A02.A06.stopLoader(this.A00);
        this.A01.A01 = false;
    }
}

package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxDListenerShape47S0400000_1_I2;

/* renamed from: X.47F  reason: invalid class name */
public final class AnonymousClass47F implements C21800C0z {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ C109326jp A03;

    public final /* synthetic */ void Bsd(View view) {
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

    public AnonymousClass47F(AnonymousClass601 r1, C109326jp r2, C109326jp r3, C109326jp r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final void onDestroyView() {
        C63913ic.A0R(this.A00, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 64206) {
            AnonymousClass601 r3 = this.A00;
            C04220Ms.A0B(r3, 0);
            C10300i6 A0F = C63913ic.A0F(r3);
            IDxDListenerShape47S0400000_1_I2 iDxDListenerShape47S0400000_1_I2 = new IDxDListenerShape47S0400000_1_I2(r3, this.A03, this.A02, this.A01, 0);
            C63913ic.A0A(r3).getModuleName();
            C67363zQ.A06(intent, A0F, iDxDListenerShape47S0400000_1_I2, i2);
            C63913ic.A0R(r3, this);
        }
    }
}

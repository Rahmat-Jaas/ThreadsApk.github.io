package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxEListenerShape224S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.7s8  reason: invalid class name */
public final class AnonymousClass7s8 implements C21800C0z {
    public boolean A00 = false;
    public final AnonymousClass9VG A01;
    public final C3T A02;
    public final C130667qT A03;
    public final C82394pY A04;
    public final UserSession A05;

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

    public final /* synthetic */ void onDestroyView() {
    }

    public final void onResume() {
        this.A00 = false;
        AnonymousClass3LY.A00(this.A05).A01(this.A04, C131187rY.class);
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onPause() {
        AnonymousClass3LY.A00(this.A05).A02(this.A04, C131187rY.class);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C130667qT r0 = this.A03;
        r0.A01.put(R.id.story_bloks_sticker_controller, new C106406ez(this));
    }

    public AnonymousClass7s8(C130667qT r3, AnonymousClass9VG r4, C3T c3t, UserSession userSession) {
        this.A03 = r3;
        this.A05 = userSession;
        this.A02 = c3t;
        this.A01 = r4;
        this.A04 = new IDxEListenerShape224S0100000_2_I2(this, 7);
    }
}

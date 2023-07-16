package com.facebook.redex;

import X.AnonymousClass3LY;
import X.AnonymousClass45V;
import X.AnonymousClass47I;
import X.C109326jp;
import X.C122047Jt;
import X.C127397h3;
import X.C21800C0z;
import X.C61783Vj;
import X.C63893iY;
import X.C63913ic;
import X.C687145e;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;

public class IDxLListenerShape686S0100000_1_I2 implements C21800C0z {
    public Object A00;
    public final int A01;

    public IDxLListenerShape686S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.A01 == 0) {
            if (i == 9) {
                AnonymousClass47I r4 = (AnonymousClass47I) this.A00;
                C127397h3 r3 = r4.A08;
                if (r3.A0L(48) != null) {
                    C109326jp A0L = r3.A0L(48);
                    C122047Jt.A03(r4.A07, r3, C63893iY.A01, A0L);
                }
            }
            C63913ic.A0P(((AnonymousClass47I) this.A00).A07, this);
        }
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
        if (this.A01 != 0) {
            C61783Vj r4 = (C61783Vj) this.A00;
            UserSession userSession = r4.A07;
            AnonymousClass3LY.A00(userSession).A02(r4.A06, AnonymousClass45V.class);
            AnonymousClass3LY.A00(userSession).A02(r4.A05, C687145e.class);
        }
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void Bsd(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}

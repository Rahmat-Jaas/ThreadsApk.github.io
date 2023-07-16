package com.google.android.gms.common.api.internal;

import X.C103846ap;
import X.C110886mR;
import X.C14030oh;
import X.C143798hK;
import X.C148588rW;
import X.C148648rc;
import X.C148658rd;
import X.C93175l8;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.zac;
import java.util.Set;

public final class zact extends zac implements C148648rc, C148658rd {
    public static final C93175l8 A07 = C103846ap.A01;
    public C143798hK A00;
    public C148588rW A01;
    public final Context A02;
    public final Handler A03;
    public final C93175l8 A04;
    public final C110886mR A05;
    public final Set A06;

    public zact(Context context, Handler handler, C110886mR r6) {
        C93175l8 r2 = A07;
        int A032 = C14030oh.A03(-184067704);
        this.A02 = context;
        this.A03 = handler;
        this.A05 = r6;
        this.A06 = r6.A05;
        this.A04 = r2;
        C14030oh.A0A(385056328, A032);
    }

    public final void Brh(Bundle bundle) {
        int A032 = C14030oh.A03(1516191761);
        this.A01.DBd(this);
        C14030oh.A0A(395332081, A032);
    }

    public final void Bro(ConnectionResult connectionResult) {
        int A032 = C14030oh.A03(1024919413);
        this.A00.DBg(connectionResult);
        C14030oh.A0A(1631099790, A032);
    }

    public final void Brq(int i) {
        int A032 = C14030oh.A03(1807558776);
        this.A01.AI7();
        C14030oh.A0A(1839042446, A032);
    }
}

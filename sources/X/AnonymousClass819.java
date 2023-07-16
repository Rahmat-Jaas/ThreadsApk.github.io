package X;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* renamed from: X.819  reason: invalid class name */
public final class AnonymousClass819 implements Runnable {
    public final /* synthetic */ zact A00;
    public final /* synthetic */ zak A01;

    public AnonymousClass819(zact zact, zak zak) {
        this.A00 = zact;
        this.A01 = zak;
    }

    public final void run() {
        zact zact = this.A00;
        zak zak = this.A01;
        ConnectionResult connectionResult = zak.A01;
        if (connectionResult.A01 == 0) {
            zav zav = zak.A02;
            C13320nQ.A01(zav);
            connectionResult = zav.A02;
            if (connectionResult.A01 == 0) {
                C143798hK r4 = zact.A00;
                IAccountAccessor A002 = zav.A00();
                Set set = zact.A06;
                C129437ls r42 = (C129437ls) r4;
                if (A002 == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    r42.DBg(new ConnectionResult(4));
                    zact.A01.AI7();
                }
                r42.A00 = A002;
                r42.A01 = set;
                if (r42.A02) {
                    r42.A03.B6o(A002, set);
                }
                zact.A01.AI7();
            }
            String valueOf = String.valueOf(connectionResult);
            String.valueOf(valueOf);
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
        }
        zact.A00.DBg(connectionResult);
        zact.A01.AI7();
    }
}

package X;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.818  reason: invalid class name */
public final class AnonymousClass818 implements Runnable {
    public final /* synthetic */ ConnectionResult A00;
    public final /* synthetic */ C129437ls A01;

    public AnonymousClass818(ConnectionResult connectionResult, C129437ls r2) {
        this.A01 = r2;
        this.A00 = connectionResult;
    }

    public final void run() {
        Set emptySet;
        IAccountAccessor iAccountAccessor;
        C129437ls r2 = this.A01;
        AnonymousClass7lO r5 = (AnonymousClass7lO) r2.A05.A09.get(r2.A04);
        if (r5 != null) {
            ConnectionResult connectionResult = this.A00;
            if (C18180wK.A1W(connectionResult.A01)) {
                r2.A02 = true;
                C148598rX r3 = r2.A03;
                if (!r3.CeJ()) {
                    try {
                        C93625lu r1 = (C93625lu) r3;
                        if (r1.CeJ()) {
                            emptySet = r1.A01;
                        } else {
                            emptySet = Collections.emptySet();
                        }
                        r3.B6o((IAccountAccessor) null, emptySet);
                    } catch (SecurityException e) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                        r3.AI8("Failed to get service from broker.");
                        r5.A0B(new ConnectionResult(10), (Exception) null);
                    }
                } else if (r2.A02 && (iAccountAccessor = r2.A00) != null) {
                    r3.B6o(iAccountAccessor, r2.A01);
                }
            } else {
                r5.A0B(connectionResult, (Exception) null);
            }
        }
    }
}

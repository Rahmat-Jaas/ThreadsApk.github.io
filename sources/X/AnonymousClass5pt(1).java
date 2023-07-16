package X;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5pt  reason: invalid class name */
public final class AnonymousClass5pt extends C86854zE {
    public final /* synthetic */ C129387ln A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5pt(Looper looper, C129387ln r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        ConnectionResult connectionResult;
        C129347lj r4;
        int i = message.what;
        if (i == 1) {
            C105056co r2 = (C105056co) message.obj;
            C129387ln r0 = this.A00;
            Lock lock = r0.A0D;
            lock.lock();
            try {
                if (r0.A0E == r2.A00) {
                    if (r2 instanceof C93435lb) {
                        C93435lb r22 = (C93435lb) r2;
                        r4 = r22.A00;
                        zak zak = r22.A01;
                        if (C129347lj.A07(r4, 0)) {
                            connectionResult = zak.A01;
                            if (connectionResult.A01 == 0) {
                                zav zav = zak.A02;
                                C13320nQ.A01(zav);
                                connectionResult = zav.A02;
                                if (connectionResult.A01 == 0) {
                                    r4.A04 = true;
                                    IAccountAccessor A002 = zav.A00();
                                    C13320nQ.A01(A002);
                                    r4.A00 = A002;
                                    r4.A05 = zav.A03;
                                    r4.A06 = zav.A04;
                                } else {
                                    String valueOf = String.valueOf(connectionResult);
                                    String.valueOf(valueOf);
                                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                                }
                            } else if (r4.A02 && connectionResult.A02 == null) {
                                C129347lj.A03(r4);
                            }
                            C129347lj.A04(r4);
                        }
                    } else if (r2 instanceof C93415lZ) {
                        ((C93415lZ) r2).A00.CGB(new ConnectionResult(16, (PendingIntent) null));
                    } else if (r2 instanceof C93425la) {
                        C93425la r23 = (C93425la) r2;
                        r4 = r23.A01.A01;
                        connectionResult = r23.A00;
                    } else {
                        ((C93405lY) r2).A00.DBk(1);
                    }
                    C129347lj.A02(connectionResult, r4);
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GACStateManager", C86104wH.A10("Unknown message id: ", C86114wI.A0s(31), i));
        } else {
            throw ((Throwable) message.obj);
        }
    }
}

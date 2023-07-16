package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5lV  reason: invalid class name and case insensitive filesystem */
public abstract class C93375lV extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new C86854zE(Looper.getMainLooper());
    public final GoogleApiAvailability A01;
    public final AtomicReference A02 = new AtomicReference((Object) null);
    public volatile boolean A03;

    public final void A09() {
        if (this instanceof C93515lj) {
            C93515lj r2 = (C93515lj) this;
            for (int i = 0; i < r2.A00.size(); i++) {
                C129157lQ A002 = C93515lj.A00(r2, i);
                if (A002 != null) {
                    A002.A02.A05();
                }
            }
            return;
        }
        Handler handler = ((C93505li) this).A01.A06;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void A0A(ConnectionResult connectionResult, int i) {
        if (this instanceof C93515lj) {
            C93515lj r1 = (C93515lj) this;
            Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
            if (i < 0) {
                Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
                return;
            }
            SparseArray sparseArray = r1.A00;
            C129157lQ r5 = (C129157lQ) sparseArray.get(i);
            if (r5 != null) {
                C129157lQ r12 = (C129157lQ) sparseArray.get(i);
                sparseArray.remove(i);
                if (r12 != null) {
                    AnonymousClass7AL r6 = r12.A02;
                    AnonymousClass7MH r0 = ((C93285lJ) r6).A0C;
                    synchronized (r0.A03) {
                        if (!r0.A06.remove(r12)) {
                            String valueOf = String.valueOf(r12);
                            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 57);
                            A0s.append("unregisterConnectionFailedListener(): listener ");
                            A0s.append(valueOf);
                            Log.w("GmsClientEvents", C18180wK.A0i(" not found", A0s));
                        }
                    }
                    r6.A06();
                }
                C148658rd r02 = r5.A01;
                if (r02 != null) {
                    r02.Bro(connectionResult);
                    return;
                }
                return;
            }
            return;
        }
        ((C93505li) this).A01.A04(connectionResult, i);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null);
        AtomicReference atomicReference = this.A02;
        C107466gn r0 = (C107466gn) atomicReference.get();
        if (r0 == null) {
            i = -1;
        } else {
            i = r0.A00;
        }
        atomicReference.set((Object) null);
        A0A(connectionResult, i);
    }

    public C93375lV(GoogleApiAvailability googleApiAvailability, C146168ll r4) {
        super(r4);
        this.A01 = googleApiAvailability;
    }
}

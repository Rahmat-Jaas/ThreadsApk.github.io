package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.FBPaymentService;
import com.fbpay.w3c.client.W3CClient$FBPayServiceAddCardCallback;

/* renamed from: X.7M2  reason: invalid class name */
public final class AnonymousClass7M2 implements ServiceConnection {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C880856r A01;
    public final /* synthetic */ CardDetails A02;
    public final /* synthetic */ AnonymousClass7IX A03;

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public AnonymousClass7M2(Context context, C880856r r2, CardDetails cardDetails, AnonymousClass7IX r4) {
        this.A03 = r4;
        this.A02 = cardDetails;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            FBPaymentService.Stub.A00(iBinder).A5k(this.A02, new W3CClient$FBPayServiceAddCardCallback(this.A00, this, this.A01, this.A03));
        } catch (RemoteException e) {
            this.A01.A0G(new C107456gm((Object) null, e));
            AnonymousClass7IX.A02(this.A00, this, this.A03);
        }
    }
}

package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fbpay.w3c.client.W3CClient$IsReadyToPayCallbackWithConnection;
import org.chromium.IsReadyToPayService;

/* renamed from: X.7Ly  reason: invalid class name and case insensitive filesystem */
public final class C122267Ly implements ServiceConnection {
    public final /* synthetic */ C143728hD A00;
    public final /* synthetic */ AnonymousClass7IX A01;

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public C122267Ly(C143728hD r1, AnonymousClass7IX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IsReadyToPayService isReadyToPayService;
        if (iBinder == null) {
            isReadyToPayService = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.IsReadyToPayService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IsReadyToPayService)) {
                    isReadyToPayService = new IsReadyToPayService.Stub.Proxy(iBinder);
                } else {
                    isReadyToPayService = (IsReadyToPayService) queryLocalInterface;
                }
            } catch (RemoteException unused) {
                this.A00.C3J(false);
                AnonymousClass7IX r1 = this.A01;
                AnonymousClass7IX.A02(r1.A02, this, r1);
                return;
            }
        }
        isReadyToPayService.BXi(new W3CClient$IsReadyToPayCallbackWithConnection(this, this.A00, this.A01));
    }
}

package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.direct.stella.api.IStellaDirectMessagingService;

/* renamed from: X.7M3  reason: invalid class name */
public final class AnonymousClass7M3 implements ServiceConnection {
    public final /* synthetic */ StellaIpcDirectMessagingServiceClient A00;

    public AnonymousClass7M3(StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient) {
        this.A00 = stellaIpcDirectMessagingServiceClient;
    }

    public final void onBindingDied(ComponentName componentName) {
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = this.A00;
        Handler handler = stellaIpcDirectMessagingServiceClient.mHandler;
        if (handler != null) {
            handler.post(stellaIpcDirectMessagingServiceClient.mDisconnectRunnable);
        }
    }

    public final void onNullBinding(ComponentName componentName) {
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = this.A00;
        synchronized (stellaIpcDirectMessagingServiceClient.mLock) {
            stellaIpcDirectMessagingServiceClient.mIsServiceConnectionInProgress = false;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object queryLocalInterface;
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = this.A00;
        SettableFuture settableFuture = stellaIpcDirectMessagingServiceClient.mServiceInterfaceFuture;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.instagram.direct.stella.api.IStellaDirectMessagingService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IStellaDirectMessagingService)) {
                queryLocalInterface = new IStellaDirectMessagingService.Stub.Proxy(iBinder);
            }
        }
        settableFuture.set(queryLocalInterface);
        synchronized (stellaIpcDirectMessagingServiceClient.mLock) {
            stellaIpcDirectMessagingServiceClient.mIsServiceConnectionInProgress = false;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.mServiceInterfaceFuture = new SettableFuture();
    }
}

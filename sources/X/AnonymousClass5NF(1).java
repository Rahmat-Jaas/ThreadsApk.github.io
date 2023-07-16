package X;

import android.os.IBinder;
import android.os.IInterface;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;

/* renamed from: X.5NF  reason: invalid class name */
public final class AnonymousClass5NF extends C126927gD {
    public final /* bridge */ /* synthetic */ Object AAq(IBinder iBinder) {
        C04220Ms.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IGalaxyStoreDownloadService)) {
            return new IGalaxyStoreDownloadService.Stub.Proxy(iBinder);
        }
        return queryLocalInterface;
    }
}

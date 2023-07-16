package X;

import android.os.IBinder;
import android.os.IInterface;
import com.xiaomi.market.IMarketDownloadService;

/* renamed from: X.5NG  reason: invalid class name */
public final class AnonymousClass5NG extends C126927gD {
    public final /* bridge */ /* synthetic */ Object AAq(IBinder iBinder) {
        C04220Ms.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.market.IMarketDownloadService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMarketDownloadService)) {
            return new IMarketDownloadService.Stub.Proxy(iBinder);
        }
        return queryLocalInterface;
    }
}

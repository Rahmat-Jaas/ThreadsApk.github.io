package com.instagram.fbpay.w3c.ipc;

import X.AnonymousClass3TB;
import X.C04220Ms;
import X.C14030oh;
import X.C14570ph;
import X.C18230wP;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.fbpay.w3c.ipc.BaseIsReadyToPayServiceImpl$handler$1;
import org.chromium.IsReadyToPayService;

public final class IsReadyToPayServiceImpl extends C14570ph {
    public final Handler A00 = new Handler();
    public final IsReadyToPayService.Stub A01 = new BaseIsReadyToPayServiceImpl$handler$1(this);

    public final IBinder onBind(Intent intent) {
        C04220Ms.A0B(intent, 0);
        super.onBind(intent);
        return this.A01;
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(-371617077);
        super.onCreate();
        AnonymousClass3TB.A06.A00(C18230wP.A0Z());
        C14030oh.A0B(-1967329663, A04);
    }
}

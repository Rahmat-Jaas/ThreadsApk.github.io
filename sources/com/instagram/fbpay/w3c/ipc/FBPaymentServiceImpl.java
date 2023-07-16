package com.instagram.fbpay.w3c.ipc;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3TB;
import X.AnonymousClass3VE;
import X.C04220Ms;
import X.C113406rL;
import X.C117036y1;
import X.C120917Dc;
import X.C14030oh;
import X.C14570ph;
import X.C18230wP;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1;

public final class FBPaymentServiceImpl extends C14570ph {
    public Handler A00 = AnonymousClass0wJ.A0F();
    public AnonymousClass3VE A01;
    public C113406rL A02;
    public final IBinder A03 = new BaseFBPaymentServiceImpl$handler$1(this);

    public final IBinder onBind(Intent intent) {
        C04220Ms.A0B(intent, 0);
        super.onBind(intent);
        return this.A03;
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(1362990388);
        try {
            AnonymousClass3TB.A06.A00(C18230wP.A0Z());
            int A042 = C14030oh.A04(1408799784);
            super.onCreate();
            this.A01 = (AnonymousClass3VE) C117036y1.A00().A03.getValue();
            this.A02 = C120917Dc.A00();
            C14030oh.A0B(1738770915, A042);
        } catch (IllegalStateException e) {
            AnonymousClass0LU.A0N("FBPaymentServiceImpl", "Failed to get user session during onCreate: %s", e.getMessage());
        }
        C14030oh.A0B(-1804757592, A04);
    }
}

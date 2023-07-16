package com.fbpay.w3c.client;

import X.AnonymousClass7IX;
import X.C107456gm;
import X.C14030oh;
import X.C880856r;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.fbpay.w3c.FBPaymentServiceAddCardCallback;

public final class W3CClient$FBPayServiceAddCardCallback extends FBPaymentServiceAddCardCallback.Stub {
    public final Context A00;
    public final ServiceConnection A01;
    public final C880856r A02;
    public final /* synthetic */ AnonymousClass7IX A03;

    public W3CClient$FBPayServiceAddCardCallback(Context context, ServiceConnection serviceConnection, C880856r r5, AnonymousClass7IX r6) {
        this.A03 = r6;
        int A032 = C14030oh.A03(2030455983);
        this.A00 = context;
        this.A02 = r5;
        this.A01 = serviceConnection;
        C14030oh.A0A(2070080992, A032);
    }

    public final void CI0(String str) {
        int A032 = C14030oh.A03(2009648834);
        C880856r r2 = this.A02;
        str.getClass();
        r2.A0G(new C107456gm(str, (Throwable) null));
        AnonymousClass7IX.A02(this.A00, this.A01, this.A03);
        C14030oh.A0A(-1511772356, A032);
    }

    public final void onError(String str) {
        int A032 = C14030oh.A03(-1085684141);
        this.A02.A0G(new C107456gm((Object) null, new RemoteException(str)));
        AnonymousClass7IX.A02(this.A00, this.A01, this.A03);
        C14030oh.A0A(-778519455, A032);
    }
}

package X;

import android.content.Context;
import android.os.RemoteException;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.88r  reason: invalid class name and case insensitive filesystem */
public final class C1374688r extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass7K3 A01;

    public C1374688r(Context context, AnonymousClass7K3 r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass7K3 r1 = this.A01;
        r1.A09(this.A00);
        AutofillContactDataCallback autofillContactDataCallback = r1.A0R;
        BrowserLiteCallback browserLiteCallback = AnonymousClass7Ep.A00().A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.AMH(autofillContactDataCallback);
            } catch (RemoteException unused) {
            }
        }
    }
}

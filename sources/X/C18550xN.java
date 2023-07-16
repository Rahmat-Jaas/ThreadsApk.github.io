package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0xN  reason: invalid class name and case insensitive filesystem */
public final class C18550xN extends Handler {
    public final /* synthetic */ C30991Gcv A00;

    public C18550xN(C30991Gcv gcv) {
        this.A00 = gcv;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C09860go.A0I(this.A00.A09);
        } else if (i == 2) {
            C30991Gcv.A00(this.A00);
        }
    }
}

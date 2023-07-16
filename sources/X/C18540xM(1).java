package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0xM  reason: invalid class name and case insensitive filesystem */
public final class C18540xM extends Handler {
    public final /* synthetic */ AnonymousClass1cM A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18540xM(Looper looper, AnonymousClass1cM r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            AnonymousClass1cM r1 = this.A00;
            if (r1.mView != null) {
                AnonymousClass1cM.A03(r1);
            }
        }
    }
}

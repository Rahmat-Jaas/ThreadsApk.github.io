package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Collections;

/* renamed from: X.0BL  reason: invalid class name */
public final class AnonymousClass0BL extends Handler {
    public final /* synthetic */ AnonymousClass0L8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0BL(Looper looper, AnonymousClass0L8 r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass0L8 r2 = this.A00;
            C017508h r1 = new C017508h(r2.A03, (ByteArrayOutputStream) message.obj);
            AnonymousClass0CB r22 = new AnonymousClass0CB(new AnonymousClass0LQ(), r2.A05, r2.A06, r2.A04.A03, Collections.singletonList(r1).iterator());
            while (r22.A00.hasNext()) {
                r22.A00();
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Unknown what=", i));
    }
}

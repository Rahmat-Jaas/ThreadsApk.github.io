package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4z4  reason: invalid class name */
public final class AnonymousClass4z4 extends Handler {
    public final void handleMessage(Message message) {
        C127397h3 r1;
        C109326jp A0L;
        super.handleMessage(message);
        C111286n5 r6 = (C111286n5) message.obj;
        if (message.what == 0 && r6 != null && (r1 = r6.A0D) != null && r6.A0C != null && (A0L = r1.A0L(38)) != null) {
            C127397h3 r4 = r6.A0D;
            AnonymousClass3VO A00 = AnonymousClass3VO.A00();
            C86144wL.A1L(A00, (float) r6.A06, 2.14748365E9f, 0);
            C122047Jt.A03(r6.A0C, r4, C86154wM.A0R(A00, r6.A0C, 1), A0L);
        }
    }

    public AnonymousClass4z4(Looper looper) {
        super(looper);
    }
}

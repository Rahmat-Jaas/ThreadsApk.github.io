package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4zA  reason: invalid class name and case insensitive filesystem */
public final class C86814zA extends Handler {
    public final /* synthetic */ C91085fZ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86814zA(Looper looper, C91085fZ r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        C91085fZ r0 = this.A00;
        C127397h3 r3 = r0.A00;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        AnonymousClass3HX r1 = r0.A02;
        A002.A03(r1, 0);
        C122047Jt.A07(r1, r3, A002, (C109326jp) message.obj);
    }
}

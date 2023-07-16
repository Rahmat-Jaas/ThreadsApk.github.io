package X;

import java.net.Socket;
import java.util.concurrent.Callable;

/* renamed from: X.0vT  reason: invalid class name and case insensitive filesystem */
public final class C17750vT implements Callable {
    public final /* synthetic */ C17740vS A00;
    public final /* synthetic */ Socket A01;
    public final /* synthetic */ Socket A02;

    public C17750vT(C17740vS r1, Socket socket, Socket socket2) {
        this.A00 = r1;
        this.A01 = socket;
        this.A02 = socket2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C17740vS r3 = this.A00;
        C17740vS.A00(r3, r3.A03, this.A01, this.A02);
        return null;
    }
}

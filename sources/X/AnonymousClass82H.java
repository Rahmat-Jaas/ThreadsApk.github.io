package X;

import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.82H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass82H implements Runnable {
    public final /* synthetic */ C146148lj A00;
    public final /* synthetic */ C127047gR A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ AnonymousClass82H(C146148lj r1, C127047gR r2, SettableFuture settableFuture) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = settableFuture;
    }

    public final void run() {
        C127047gR r0 = this.A01;
        C146148lj r1 = this.A00;
        SettableFuture settableFuture = this.A02;
        r0.A00.A00();
        PapayaJNI.submitExecutor(r1.getName(), "federated");
        settableFuture.set(C18180wK.A0Y());
    }
}

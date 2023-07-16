package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.0Wr  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Wr implements Runnable {
    public final /* synthetic */ C09350fH A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ AnonymousClass01V A02;

    public /* synthetic */ AnonymousClass0Wr(C09350fH r1, SettableFuture settableFuture, AnonymousClass01V r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = settableFuture;
    }

    public final void run() {
        this.A02.A0g(this.A00, this.A01);
    }
}

package X;

import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.80f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1358080f implements Runnable {
    public final /* synthetic */ C127047gR A00;
    public final /* synthetic */ SettableFuture A01;

    public /* synthetic */ C1358080f(C127047gR r1, SettableFuture settableFuture) {
        this.A00 = r1;
        this.A01 = settableFuture;
    }

    public final void run() {
        C127047gR r0 = this.A00;
        SettableFuture settableFuture = this.A01;
        r0.A00.A00();
        PapayaJNI.nativeUninitialize();
        settableFuture.set((Object) null);
    }
}

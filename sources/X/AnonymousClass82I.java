package X;

import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.82I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass82I implements Runnable {
    public final /* synthetic */ C127047gR A00;
    public final /* synthetic */ PapayaRestrictions A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ AnonymousClass82I(C127047gR r1, PapayaRestrictions papayaRestrictions, SettableFuture settableFuture) {
        this.A00 = r1;
        this.A01 = papayaRestrictions;
        this.A02 = settableFuture;
    }

    public final void run() {
        C127047gR r0 = this.A00;
        PapayaRestrictions papayaRestrictions = this.A01;
        SettableFuture settableFuture = this.A02;
        r0.A00.A00();
        PapayaJNI.run(papayaRestrictions);
        settableFuture.set((Object) null);
    }
}

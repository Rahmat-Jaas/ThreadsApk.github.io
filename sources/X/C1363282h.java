package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

/* renamed from: X.82h  reason: invalid class name and case insensitive filesystem */
public final class C1363282h implements Runnable {
    public final /* synthetic */ C41259M6w A00;
    public final /* synthetic */ C27952Ew2 A01;
    public final /* synthetic */ AnonymousClass0YP A02;
    public final /* synthetic */ AnonymousClass8s9 A03;

    public C1363282h(C41259M6w m6w, C27952Ew2 ew2, AnonymousClass0YP r3, AnonymousClass8s9 r4) {
        this.A01 = ew2;
        this.A03 = r4;
        this.A00 = m6w;
        this.A02 = r3;
    }

    public final void run() {
        try {
            DH9.A00(this.A01.BgS(C148798sC.A00), new KtSLambdaShape4S0401000_I2((Object) this.A00, (Object) this.A02, (Object) this.A03, (C146958n9) null, 16));
        } catch (Throwable th) {
            this.A03.AC9(th);
        }
    }
}

package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.86C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass86C implements AnonymousClass0ZU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C33874HwA A01;
    public final /* synthetic */ C10300i6 A02;
    public final /* synthetic */ Executor A03;
    public final /* synthetic */ Executor A04;
    public final /* synthetic */ Executor A05;

    public /* synthetic */ AnonymousClass86C(Context context, C33874HwA hwA, C10300i6 r3, Executor executor, Executor executor2, Executor executor3) {
        this.A00 = context;
        this.A02 = r3;
        this.A03 = executor;
        this.A04 = executor2;
        this.A05 = executor3;
        this.A01 = hwA;
    }

    public final Object invoke() {
        Context context = this.A00;
        C10300i6 r4 = this.A02;
        Executor executor = this.A04;
        return new H8F(context.getApplicationContext(), this.A01, r4, executor);
    }
}

package X;

import android.content.Context;
import android.os.Handler;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0lg  reason: invalid class name and case insensitive filesystem */
public final class C12310lg {
    public static final Executor A04 = Executors.newSingleThreadExecutor();
    public final Handler A00;
    public final C14410pM A01;
    public final C12250la A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public final void A00(C14540pc r3) {
        A04.execute(new C13200nE(r3, this));
    }

    public C12310lg(Context context, AnonymousClass0PW r7, String str) {
        AnonymousClass0PL A002 = AnonymousClass0PL.A00(context);
        this.A01 = new C14410pM(new C14050oj(r7), "725056107548211|0e20c3123a90c76c02c901b7415ff67f", new AnonymousClass0NR(context, A002, str, (Map) null).A01());
        this.A00 = new C13210nF(context.getMainLooper(), this);
        this.A02 = new C12250la(A002.A01, A002.A00);
    }
}

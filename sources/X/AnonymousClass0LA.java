package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0LA  reason: invalid class name */
public final class AnonymousClass0LA {
    public static volatile AnonymousClass0LA A03;
    public final Context A00;
    public final AtomicInteger A01;
    public final AtomicReference A02;

    public AnonymousClass0LA(Context context) {
        this.A01 = new AtomicInteger(1);
        this.A02 = new AtomicReference();
        this.A00 = context.getApplicationContext();
    }

    public AnonymousClass0LA() {
    }
}

package X;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C013806k implements Runnable {
    public final /* synthetic */ Context A00;

    public /* synthetic */ C013806k(Context context) {
        this.A00 = context;
    }

    public final void run() {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C013906l(this.A00));
    }
}

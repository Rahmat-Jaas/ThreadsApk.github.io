package X;

import android.os.Environment;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Df  reason: invalid class name and case insensitive filesystem */
public final class C120947Df {
    public static final C120947Df A05 = new C120947Df();
    public final C1190673j A00;
    public final File A01;
    public final ScheduledExecutorService A02;
    public final AtomicBoolean A03;
    public final File A04;

    public static synchronized void A00() {
        synchronized (C120947Df.class) {
        }
    }

    public C120947Df() {
        Class<C14620pq> cls = C14620pq.class;
        synchronized (cls) {
        }
        this.A04 = C86154wM.A0U(C86154wM.A0U(Environment.getExternalStorageDirectory(), "e2e/files"), AnonymousClass00U.A0L("com.facebook.instagram.", "mock_connectivity.json"));
        synchronized (cls) {
        }
        this.A01 = C86154wM.A0U(C86154wM.A0U(Environment.getExternalStorageDirectory(), "e2e/files"), AnonymousClass00U.A0L("com.facebook.instagram.", "mock_connectivity.ping"));
        this.A03 = new AtomicBoolean();
        this.A00 = C1190673j.A00;
        this.A02 = Executors.newSingleThreadScheduledExecutor();
    }
}

package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0u2  reason: invalid class name and case insensitive filesystem */
public final class C16950u2 {
    public int A00 = 0;
    public IFbnsAIDLService A01 = null;
    public Integer A02 = AnonymousClass006.A00;
    public final Context A03;
    public final ServiceConnection A04 = new C16970u5(this);
    public final ExecutorService A05 = Executors.newFixedThreadPool(5);

    public static void A00(C16950u2 r2) {
        synchronized (r2) {
            int i = r2.A00 - 1;
            r2.A00 = i;
            if (i == 0) {
                r2.A01 = null;
                r2.A02 = AnonymousClass006.A00;
                r2.A03.unbindService(r2.A04);
            }
        }
        Thread.currentThread().getId();
    }

    public final void A01(FbnsAIDLRequest... fbnsAIDLRequestArr) {
        for (FbnsAIDLRequest r2 : fbnsAIDLRequestArr) {
            this.A05.submit(new C16960u4(r2, this));
        }
    }

    public final void finalize() {
        this.A05.shutdown();
    }

    public C16950u2(Context context) {
        this.A03 = context;
    }
}

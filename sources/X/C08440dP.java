package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.Choreographer;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0dP  reason: invalid class name and case insensitive filesystem */
public final class C08440dP extends AnonymousClass0Uk {
    public static final int A0D = ProvidersRegistry.A00.A02("frames");
    public final C03870Ld A00;
    public final Runnable A01 = new AnonymousClass0Vc(this);
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final Context A03;
    public final Handler A04;
    public final Runnable A05 = new AnonymousClass0Vb(this);
    public final Runnable A06 = new AnonymousClass0Va(this);
    public volatile double A07 = 0.0d;
    public volatile int A08 = 0;
    public volatile long A09 = 0;
    public volatile long A0A = -1;
    public volatile C03880Le A0B = null;
    public volatile long A0C;

    public C08440dP(Context context) {
        super((String) null);
        this.A03 = context;
        this.A04 = new Handler(Looper.getMainLooper());
        this.A00 = new C08430dO(this);
    }

    public final boolean A07() {
        return true;
    }

    static {
        TimeUnit.NANOSECONDS.convert(1, TimeUnit.MILLISECONDS);
    }

    public static void A01(C08440dP r14) {
        C03880Le r4 = r14.A0B;
        if (r4 != null) {
            r14.A00(8126532, r14.A0A);
            r14.A00(8126533, (long) r14.A08);
            r14.A00(8126534, r14.A09);
            String valueOf = String.valueOf(r14.A07);
            MultiBufferLogger A032 = r14.A03();
            A032.writeBytesEntry(0, 57, A032.writeBytesEntry(0, 56, A032.writeStandardEntry(6, 52, 0, 0, 8126535, 0, 0), "4_frame_drop_uncapped"), valueOf);
            r4.AHx();
        }
    }

    public final int getTracingProviders() {
        if (this.A02.get()) {
            return A0D;
        }
        return 0;
    }

    private void A00(int i, long j) {
        A03().writeStandardEntry(6, 52, 0, 0, i, 0, j);
    }

    public final void A08(String str) {
        MultiBufferLogger A032 = A03();
        A032.writeBytesEntry(1, 83, A032.writeStandardEntry(6, 21, 0, 0, 0, 0, 0), str);
        A032.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
    }

    public final void disable() {
        int i;
        int A032 = C14030oh.A03(365365400);
        C03880Le r2 = this.A0B;
        if (!this.A02.getAndSet(false)) {
            i = -536166528;
        } else {
            if (r2 == null) {
                this.A04.post(this.A05);
            } else {
                A01(this);
            }
            i = 793906493;
        }
        C14030oh.A0A(i, A032);
    }

    public final void enable() {
        int i;
        C03880Le r0;
        int A032 = C14030oh.A03(2007067407);
        AtomicBoolean atomicBoolean = this.A02;
        if (atomicBoolean.getAndSet(true)) {
            i = 1410611369;
        } else {
            if (this.A0A == -1) {
                C03900Lg r1 = C03900Lg.A01;
                if (r1 == null) {
                    r1 = new C03900Lg();
                    C03900Lg.A01 = r1;
                }
                this.A0A = r1.A00(this.A03);
            }
            if (this.A0B == null) {
                if (Process.myTid() != Process.myPid()) {
                    this.A04.post(this.A06);
                    i = 420174886;
                } else if (this.A0B == null) {
                    this.A0B = new C03930Lj(Choreographer.getInstance(), this.A00);
                }
            }
            if (!(!atomicBoolean.get() || this.A0A == -1 || (r0 = this.A0B) == null)) {
                r0.AJS();
            }
            i = 420174886;
        }
        C14030oh.A0A(i, A032);
    }

    public final int getSupportedProviders() {
        return A0D;
    }
}

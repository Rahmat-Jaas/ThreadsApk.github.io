package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.7HU  reason: invalid class name */
public final class AnonymousClass7HU {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final C113706s0 A03 = new C113706s0();
    public final Object A04 = C86144wL.A0d();
    public volatile boolean A05;

    private final void A00() {
        boolean z;
        String str;
        if (this.A02) {
            synchronized (this.A04) {
                z = this.A02;
            }
            if (!z) {
                throw C18180wK.A0a("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception A032 = A03();
            if (A032 != null) {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            } else if (A0C()) {
                String valueOf = String.valueOf(A04());
                String.valueOf(valueOf);
                str = "result ".concat(String.valueOf(valueOf));
            } else if (this.A05) {
                str = "cancellation";
            } else {
                str = "unknown issue";
            }
            throw new C97636Ce(C86114wI.A0p(str, "Complete with: "), A032);
        }
    }

    public static void A01(C143868hR r2, AnonymousClass7HU r3, Executor executor) {
        r3.A03.A00(new AnonymousClass7mO(r2, executor));
        A02(r3);
    }

    public static final void A02(AnonymousClass7HU r2) {
        synchronized (r2.A04) {
            if (r2.A02) {
                r2.A03.A01(r2);
            }
        }
    }

    public final Exception A03() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A04() {
        Throwable th;
        Object obj;
        synchronized (this.A04) {
            C13320nQ.A07(this.A02, "Task is not yet complete");
            if (!this.A05) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    th = new AnonymousClass88O(exc);
                }
            } else {
                th = new CancellationException("Task is already canceled.");
            }
            throw th;
        }
        return obj;
    }

    public final Object A05(Class cls) {
        Throwable th;
        Object obj;
        synchronized (this.A04) {
            C13320nQ.A07(this.A02, "Task is not yet complete");
            if (this.A05) {
                th = new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(this.A00)) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    th = new AnonymousClass88O(exc);
                }
            } else {
                th = (Throwable) cls.cast(this.A00);
            }
            throw th;
        }
        return obj;
    }

    public final void A06() {
        synchronized (this.A04) {
            if (!this.A02) {
                this.A02 = true;
                this.A05 = true;
                this.A03.A01(this);
            }
        }
    }

    public final void A07(C143878hS r4) {
        this.A03.A00(new AnonymousClass7mP(r4, C103456Zg.A00));
        A02(this);
    }

    public final void A08(C143888hT r3, Executor executor) {
        this.A03.A00(new AnonymousClass7mQ(r3, executor));
        A02(this);
    }

    public final void A09(C143898hU r3, Executor executor) {
        this.A03.A00(new AnonymousClass7mR(r3, executor));
        A02(this);
    }

    public final void A0A(Exception exc) {
        C13320nQ.A02(exc, "Exception must not be null");
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A01(this);
    }

    public final void A0B(Object obj) {
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A01(this);
    }

    public final boolean A0C() {
        boolean z;
        synchronized (this.A04) {
            z = false;
            if (this.A02 && !this.A05 && this.A00 == null) {
                z = true;
            }
        }
        return z;
    }
}

package X;

import android.os.Looper;
import java.io.Serializable;

/* renamed from: X.4UR  reason: invalid class name */
public final class AnonymousClass4UR implements C04530Oa, Serializable {
    public static final Thread A01;
    public final C04530Oa A00;

    public final boolean BV5() {
        return this.A00.BV5();
    }

    public final Object getValue() {
        if (C04220Ms.A0I(A01, Thread.currentThread())) {
            return this.A00.getValue();
        }
        throw C18180wK.A0a("LazyUi block must be accessed only on UI thread.");
    }

    static {
        Thread thread = Looper.getMainLooper().getThread();
        C04220Ms.A06(thread);
        A01 = thread;
    }

    public AnonymousClass4UR(AnonymousClass0ZU r2) {
        this.A00 = AnonymousClass0OY.A01(AnonymousClass006.A0C, r2);
    }
}

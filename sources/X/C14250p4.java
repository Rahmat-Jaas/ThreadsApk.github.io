package X;

import android.os.Process;
import com.facebook.systrace.Systrace;

/* renamed from: X.0p4  reason: invalid class name and case insensitive filesystem */
public final class C14250p4 {
    static {
        C14220p1.A02(new C17700vO());
    }

    public static void A00() {
        if ((64 & C14220p1.A02) != 0) {
            Systrace.A01(Process.myTid(), "thread_name", Thread.currentThread().getName());
        }
    }
}

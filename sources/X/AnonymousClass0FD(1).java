package X;

import android.os.Process;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0FD  reason: invalid class name */
public final class AnonymousClass0FD extends C11940l3 {
    public static final ListenableFuture A00(AnonymousClass0QX r6, C09350fH r7) {
        C04220Ms.A0B(r7, 0);
        if (r6 != null && r6.A0S) {
            r7.AvU().A01("cpu_stats");
            r7.AvU().A03("start_pri", Integer.valueOf(r6.A00));
            r7.AvU().A03("stop_pri", Integer.valueOf(r6.A01));
            r7.AvU().A02("ps_cpu_ms", r6.A09);
            long j = r6.A0C;
            if (j != -1) {
                r7.AvU().A02("th_cpu_ms", j);
            }
            r7.AvU().A03("low_power_state", r6.A0P);
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "ig_cpu_perf_stats";
    }

    public final int B52() {
        return 9;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        AnonymousClass0QX r4 = new AnonymousClass0QX();
        int myTid = Process.myTid();
        r4.A02 = myTid;
        r4.A00 = Process.getThreadPriority(myTid);
        r4.A09 = Process.getElapsedCpuTime();
        r4.A0C = SystemClock.currentThreadTimeMillis();
        r4.A0T = true;
        r4.A0S = false;
        C15020qa.A07.size();
        return r4;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00((AnonymousClass0QX) obj, r2);
    }

    public final /* bridge */ /* synthetic */ void Cw1(Object obj) {
        AnonymousClass0QX r2 = (AnonymousClass0QX) obj;
        if (r2 != null) {
            r2.A03(1);
        }
    }

    public final Class BCf() {
        return AnonymousClass0QX.class;
    }

    public final boolean BTR(C08640dy r2) {
        return true;
    }
}

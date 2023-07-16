package X;

import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0FY  reason: invalid class name */
public final class AnonymousClass0FY extends C11940l3 {
    public static final ListenableFuture A00(C09350fH r6, AnonymousClass0XM r7, AnonymousClass0XM r8) {
        if (!(r7 == null || r8 == null)) {
            r6.AvU().A03("gc_count", Integer.valueOf(r8.A01 - r7.A01));
            r6.AvU().A02("gc_time_ms", r8.A03 - r7.A03);
            r6.AvU().A03("blocking_gc_count", Integer.valueOf(r8.A00 - r7.A00));
            r6.AvU().A02("blocking_gc_time_ms", r8.A02 - r7.A02);
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "runtime_stats";
    }

    public final int B52() {
        return 38;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        AnonymousClass0XM r2 = new AnonymousClass0XM();
        String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
        if (runtimeStat != null) {
            r2.A01 = Integer.parseInt(runtimeStat);
        }
        String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
        if (runtimeStat2 != null) {
            r2.A03 = (long) Integer.parseInt(runtimeStat2);
        }
        String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
        if (runtimeStat3 != null) {
            r2.A00 = Integer.parseInt(runtimeStat3);
        }
        String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
        if (runtimeStat4 != null) {
            r2.A02 = (long) Integer.parseInt(runtimeStat4);
        }
        return r2;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00(r2, (AnonymousClass0XM) obj, (AnonymousClass0XM) obj2);
    }

    public final Class BCf() {
        return AnonymousClass0XM.class;
    }

    public final boolean BTR(C08640dy r3) {
        return C07960cV.A05(AnonymousClass0e5.A00(36318449613410756L));
    }
}

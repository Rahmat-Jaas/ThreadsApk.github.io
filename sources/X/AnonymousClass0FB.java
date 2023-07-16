package X;

import android.app.ActivityManager;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0FB  reason: invalid class name */
public final class AnonymousClass0FB extends C11940l3 {
    public ActivityManager A00;

    public static final ListenableFuture A00(AnonymousClass0QX r4, C09350fH r5) {
        ActivityManager.MemoryInfo memoryInfo;
        C04220Ms.A0B(r5, 0);
        if (!(r4 == null || !r4.A0S || (memoryInfo = r4.A0K) == null)) {
            r5.AvU().A01("memory_stats");
            r5.AvU().A02("avail_mem", memoryInfo.availMem);
            r5.AvU().A02("low_mem", memoryInfo.threshold);
            r5.AvU().A02("total_mem", memoryInfo.totalMem);
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "ig_memory_perf_stats";
    }

    public final int B52() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        AnonymousClass0QX r2;
        ActivityManager activityManager = this.A00;
        if (activityManager == null) {
            r2 = new AnonymousClass0QX();
        }
        r2.A0T = true;
        r2.A0S = false;
        C15020qa.A07.size();
        return r2;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00((AnonymousClass0QX) obj, r2);
    }

    public final /* bridge */ /* synthetic */ void Cw1(Object obj) {
        AnonymousClass0QX r2 = (AnonymousClass0QX) obj;
        if (r2 != null) {
            r2.A03(4);
        }
    }

    public AnonymousClass0FB(ActivityManager activityManager) {
        this.A00 = activityManager;
    }

    public final Class BCf() {
        return AnonymousClass0QX.class;
    }

    public final boolean BTR(C08640dy r2) {
        return true;
    }
}

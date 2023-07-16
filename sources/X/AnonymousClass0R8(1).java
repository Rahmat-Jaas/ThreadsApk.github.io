package X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.0R8  reason: invalid class name */
public final class AnonymousClass0R8 implements C04050Mb {
    public Context A00;

    public final void CWp(C04170Mn r5, AnonymousClass0ND r6) {
        ActivityManager activityManager = (ActivityManager) this.A00.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            r5.A02(AnonymousClass0MU.A1y, Long.valueOf(memoryInfo.threshold));
            r5.A02(AnonymousClass0MU.A19, Long.valueOf(memoryInfo.availMem));
            r5.A02(AnonymousClass0MU.A36, Long.valueOf(memoryInfo.totalMem));
            r5.A00(AnonymousClass0MU.A0J, memoryInfo.lowMemory);
        }
    }

    public AnonymousClass0R8(Context context) {
        this.A00 = context;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0G;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}

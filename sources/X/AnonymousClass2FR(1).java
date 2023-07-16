package X;

import android.content.Context;
import android.os.Build;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.2FR  reason: invalid class name */
public final class AnonymousClass2FR {
    public static final void A00(Context context) {
        String str;
        if (EndToEnd.isRunningEndToEndTest()) {
            if (Build.VERSION.SDK_INT >= 30) {
                C15330r8.A00(context);
            }
            if (!EndToEnd.isRunningEndToEndTest()) {
                str = "Device is not in E2E tests mode!";
            } else {
                str = "ResourceCoverageTracer can only be run on e2e, perftest and debug builds!";
            }
            AnonymousClass0LU.A0B("ResourceCoverageTracer", str);
        }
    }
}

package X;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: X.0Tw  reason: invalid class name and case insensitive filesystem */
public final class C05470Tw {
    public final int A00;
    public final long A01;

    public C05470Tw(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public static File A00(Context context, boolean z) {
        String str;
        String str2 = context.getApplicationInfo().dataDir;
        if (z) {
            str = "insta_crash_remedy_log";
        } else {
            str = "remedy_log";
        }
        return new File(str2, str);
    }

    public static void A01(Context context, boolean z) {
        if (!A00(context, z).delete()) {
            Log.w("CrashLoopRemedyLog", AnonymousClass00U.A0o("unable to delete remedy log, instaCrash: ", z));
        }
    }
}

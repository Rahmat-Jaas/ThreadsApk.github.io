package X;

import android.content.Context;
import com.facebook.common.lyra.LyraManager;

/* renamed from: X.0YX  reason: invalid class name */
public final class AnonymousClass0YX implements AnonymousClass0OE {
    public final void BPo(AnonymousClass0OK r7) {
        int i;
        C13810oL.A01("Lyra.init", 883386750);
        try {
            Context applicationContext = r7.A0L.getApplicationContext();
            if (LyraManager.initialized.compareAndSet(false, true)) {
                "true".equals(System.getProperty("fb.running_e2e"));
                boolean z = true;
                if (AnonymousClass0SH.A00(applicationContext, "android_crash_lyra_hook_cxa_throw", 1) != 1) {
                    z = false;
                }
                boolean z2 = true;
                if (AnonymousClass0SH.A00(applicationContext, "android_crash_lyra_enable_backtraces", 1) != 1) {
                    z2 = false;
                }
                if (z && !LyraManager.nativeInstallLyraHook(z2)) {
                    throw new RuntimeException("Installing lyra hook failed.");
                }
            }
            i = -1017651932;
        } catch (Throwable th) {
            C13810oL.A00(566502493);
            throw th;
        }
        C13810oL.A00(i);
    }

    public final Integer BM7() {
        return AnonymousClass006.A0C;
    }
}

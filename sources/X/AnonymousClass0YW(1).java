package X;

import com.facebook.logcatinterceptor.breakpadinstaller.LogcatInterceptor;
import java.io.File;

/* renamed from: X.0YW  reason: invalid class name */
public final class AnonymousClass0YW implements AnonymousClass0OE {
    public final void BPo(AnonymousClass0OK r4) {
        C13810oL.A01("LogcatInterceptor.install", 1113485131);
        try {
            File file = r4.A03().A04;
            C002801h.A02(file, "Did you call SessionManager.init()?");
            LogcatInterceptor.install(r4.A0L, 0, false, new File(file, LogcatInterceptor.LOGCAT_PERSISTED_FILE).getPath());
            LogcatInterceptor.integrateWithBreakpad();
        } finally {
            C13810oL.A00(-983198000);
        }
    }

    public AnonymousClass0YW() {
        String str = AnonymousClass0KY.A00().A01;
        if (str != null) {
            str.contains(":");
        }
    }

    public final Integer BM7() {
        return AnonymousClass006.A0C;
    }
}

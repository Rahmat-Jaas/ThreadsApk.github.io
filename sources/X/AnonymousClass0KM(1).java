package X;

import android.os.FileObserver;
import java.io.File;

/* renamed from: X.0KM  reason: invalid class name */
public final class AnonymousClass0KM extends FileObserver {
    public final /* synthetic */ AnonymousClass0EZ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0KM(AnonymousClass0EZ r2, String str) {
        super(str, 768);
        this.A00 = r2;
    }

    public final void onEvent(int i, String str) {
        if (str != null) {
            AnonymousClass0EZ r1 = this.A00;
            try {
                int parseInt = Integer.parseInt(new File(str).getName());
                if (parseInt != -1 && parseInt != r1.A00) {
                    if (i == 256) {
                        AnonymousClass0EZ.A00(AnonymousClass00U.A0J("Observed new PID: ", parseInt));
                        r1.A02.A00(parseInt);
                    } else if (i == 512) {
                        AnonymousClass0EZ.A00(AnonymousClass00U.A0J("Observed removed PID: ", parseInt));
                        AnonymousClass0KK r2 = r1.A02;
                        synchronized (r2) {
                            r2.A01.remove(Integer.valueOf(parseInt));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}

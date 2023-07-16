package X;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.0Uq  reason: invalid class name */
public final class AnonymousClass0Uq implements C04050Mb {
    public final long A00;
    public final long A01;
    public final Application A02;
    public final AnonymousClass0Q4 A03;

    public final void CWp(C04170Mn r7, AnonymousClass0ND r8) {
        C04220Ms.A0B(r7, 0);
        Application application = this.A02;
        String packageName = application.getPackageName();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null) {
                    r7.A02(AnonymousClass0MU.A2T, Long.valueOf(packageInfo.firstInstallTime));
                    r7.A02(AnonymousClass0MU.A2V, Long.valueOf(packageInfo.lastUpdateTime));
                    r7.A03(AnonymousClass0MU.A3s, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ", Locale.US).format(new Date(packageInfo.firstInstallTime)));
                }
                r7.A02(AnonymousClass0MU.A2W, Long.valueOf(SystemClock.elapsedRealtime()));
                AnonymousClass0OO r3 = AnonymousClass0MU.A2X;
                long[] jArr = new long[1];
                C03620Ka.A02("/proc/self/status", jArr, new String[]{"PPid:"});
                r7.A01(r3, (int) jArr[0]);
                r7.A02(AnonymousClass0MU.A2Z, Long.valueOf(this.A00));
                r7.A02(AnonymousClass0MU.A2a, Long.valueOf(this.A01));
                AnonymousClass0OO r2 = AnonymousClass0MU.A2Y;
                File file = this.A03.A04;
                C002801h.A02(file, "Did you call SessionManager.init()?");
                r7.A02(r2, Long.valueOf(AnonymousClass0Q4.A00(file, "")));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (PackageManager.NameNotFoundException unused) {
            C04790Pd.A00();
        }
    }

    public AnonymousClass0Uq(Application application, AnonymousClass0Q4 r6, long j) {
        this.A03 = r6;
        this.A02 = application;
        this.A01 = j;
        this.A00 = System.currentTimeMillis() - (SystemClock.uptimeMillis() - j);
    }

    public final Integer Awy() {
        return AnonymousClass006.A0o;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}

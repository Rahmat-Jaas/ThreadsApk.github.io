package X;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.redex.IDxCFactoryShape495S0100000_I2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.0Lt  reason: invalid class name and case insensitive filesystem */
public final class C03980Lt implements C04050Mb {
    public Application A00;
    public AnonymousClass0Y1 A01;
    public AnonymousClass0Q4 A02;
    public final /* synthetic */ IDxCFactoryShape495S0100000_I2 A03;
    public final /* synthetic */ AnonymousClass0OK A04;

    public C03980Lt(Application application, AnonymousClass0Y1 r2, AnonymousClass0OK r3, AnonymousClass0Q4 r4, IDxCFactoryShape495S0100000_I2 iDxCFactoryShape495S0100000_I2) {
        this.A03 = iDxCFactoryShape495S0100000_I2;
        this.A04 = r3;
        this.A00 = application;
        this.A02 = r4;
        this.A01 = r2;
    }

    public final void CWp(C04170Mn r18, AnonymousClass0ND r19) {
        String str;
        String num;
        String string;
        C04170Mn r9 = r18;
        r9.A03(AnonymousClass0MU.A3q, "3419628305025917");
        Application application = this.A00;
        String packageName = application.getPackageName();
        r9.A03(AnonymousClass0MU.A3u, packageName);
        r9.A02(AnonymousClass0MU.A1H, Long.valueOf((long) AnonymousClass0FX.A01()));
        r9.A02(AnonymousClass0MU.A0t, Long.valueOf((long) AnonymousClass0FX.A00()));
        r9.A02(AnonymousClass0MU.A26, Long.valueOf((long) AnonymousClass0FX.A01()));
        AnonymousClass0OO r5 = AnonymousClass0MU.A0z;
        AnonymousClass0Q4 r6 = this.A02;
        r9.A02(r5, Long.valueOf(r6.A01));
        r9.A02(r5, Long.valueOf(System.currentTimeMillis() - (SystemClock.uptimeMillis() - r6.A01)));
        String str2 = "not set";
        try {
            PackageManager packageManager = application.getPackageManager();
            AnonymousClass0SJ.A00(packageManager);
            r9.A03(AnonymousClass0MU.A5X, packageManager.getInstallerPackageName(packageName));
            if (Build.VERSION.SDK_INT >= 29) {
                C04120Mi.A00(packageManager, r9);
            }
            boolean z = false;
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                if (packageInfo.versionName != null && (packageInfo.versionCode == AnonymousClass0FX.A00() || AnonymousClass0FX.A00() == 1)) {
                    str2 = packageInfo.versionName;
                }
                r9.A02(AnonymousClass0MU.A0x, Long.valueOf(packageInfo.firstInstallTime));
                AnonymousClass0OO r3 = AnonymousClass0MU.A10;
                r9.A02(r3, Long.valueOf(packageInfo.lastUpdateTime));
                r9.A03(AnonymousClass0MU.A3s, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ", Locale.US).format(new Date(packageInfo.firstInstallTime)));
                r9.A02(r3, Long.valueOf(packageInfo.lastUpdateTime));
                AnonymousClass0Y1 r12 = this.A01;
                if (r12 != null) {
                    try {
                        string = r12.A00.getString("last_first_run", "0");
                    } catch (Exception unused) {
                        AnonymousClass0LU.A0B("lacrima", "Failed to read from SharedPreferences");
                        C04790Pd.A00();
                    }
                    long parseLong = Long.parseLong(string);
                    long j = packageInfo.firstInstallTime;
                    long j2 = packageInfo.lastUpdateTime;
                    long max = Math.max(j, j2);
                    if (max > parseLong) {
                        boolean z2 = false;
                        if (max == j) {
                            z2 = true;
                        }
                        if (max == j2) {
                            z = true;
                        }
                        r12.A01("last_first_run", Long.toString(max));
                        r9.A00(AnonymousClass0MU.A0G, z2);
                        r9.A00(AnonymousClass0MU.A0H, z);
                    } else {
                        r9.A00(AnonymousClass0MU.A0G, false);
                        r9.A00(AnonymousClass0MU.A0H, false);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            C04790Pd.A00();
        }
        r9.A03(AnonymousClass0MU.A6c, str2);
        r9.A03(AnonymousClass0MU.A3M, AnonymousClass0N7.A00(application));
        AnonymousClass0ON r1 = AnonymousClass0MU.A5F;
        File filesDir = application.getFilesDir();
        if (filesDir != null) {
            str = filesDir.getAbsolutePath();
        } else {
            str = "n/a";
        }
        r9.A03(r1, str);
        String str3 = r6.A06;
        AnonymousClass0ON r2 = AnonymousClass0MU.A3v;
        String str4 = "";
        if (!str4.equals(str3)) {
            str4 = AnonymousClass00U.A0L(":", str3);
        }
        r9.A03(r2, AnonymousClass00U.A0L(packageName, str4));
        r9.A00(AnonymousClass0MU.A0C, AnonymousClass0FX.A02());
        r9.A01(AnonymousClass0MU.A2M, Process.myPid());
        AnonymousClass0OO r4 = AnonymousClass0MU.A1W;
        long[] jArr = new long[1];
        C03620Ka.A02("/proc/self/status", jArr, new String[]{"PPid:"});
        r9.A01(r4, (int) jArr[0]);
        r9.A00(AnonymousClass0MU.A0K, AnonymousClass0FX.A03());
        AnonymousClass0ON r13 = AnonymousClass0MU.A8n;
        ApplicationInfo applicationInfo = application.getApplicationInfo();
        if (applicationInfo == null) {
            num = "n/a";
        } else {
            num = Integer.toString(applicationInfo.targetSdkVersion);
        }
        r9.A03(r13, num);
    }

    public final Integer Awy() {
        return AnonymousClass006.A1C;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}

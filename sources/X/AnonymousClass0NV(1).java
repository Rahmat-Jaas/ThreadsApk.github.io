package X;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.0NV  reason: invalid class name */
public final class AnonymousClass0NV {
    public static String A03 = "0";
    public static String A04 = "0";
    public static String A05 = "0";
    public static AnonymousClass0NV A06;
    public static Application A07;
    public static File A08;
    public static Callable A09;
    public static Callable A0A;
    public static Callable A0B;
    public static boolean A0C;
    public static final Object A0D = new Object();
    public C07430bV A00 = null;
    public String A01;
    public Executor A02;

    public final synchronized void A05(String str, Map map) {
        Executor executor = this.A02;
        if (executor == null) {
            executor = C04350Ng.A03;
            this.A02 = executor;
        }
        executor.execute(new AnonymousClass0NU(this, str, map));
    }

    public static AnonymousClass0NV A00() {
        AnonymousClass0NV r1;
        synchronized (A0D) {
            r1 = A06;
            if (r1 == null) {
                r1 = new AnonymousClass0NV(AnonymousClass0Q2.A00("mobile", "reliability_event_log_upload").toString());
                A06 = r1;
            }
        }
        return r1;
    }

    public static void A01() {
        synchronized (A0D) {
            if (!A0C) {
                try {
                    Callable callable = A09;
                    if (callable != null) {
                        String str = (String) callable.call();
                        if (str == null) {
                            str = A04;
                        }
                        A04 = str;
                    }
                    Callable callable2 = A0B;
                    if (callable2 != null) {
                        String str2 = (String) callable2.call();
                        if (str2 == null) {
                            str2 = A05;
                        }
                        A05 = str2;
                    }
                    Callable callable3 = A0A;
                    if (callable3 != null) {
                        A08 = (File) callable3.call();
                    }
                } catch (Exception e) {
                    C04790Pd.A00();
                    AnonymousClass0LU.A0E("lacrima", "Error lazy initializing DirectReportInternal", e);
                }
                A0C = true;
            }
        }
    }

    public static void A02(AnonymousClass0MP r3, String str, Map map) {
        synchronized (A0D) {
            if (TextUtils.isEmpty(str)) {
                map.remove(r3.A00);
            } else {
                String str2 = r3.A00;
                if (TextUtils.isEmpty((CharSequence) map.get(str2))) {
                    map.put(str2, str);
                }
            }
        }
    }

    public static void A04(String str, String str2, Map map) {
        A02(AnonymousClass0MU.A4b, "soft_error", map);
        A02(AnonymousClass0MU.A45, "i", map);
        A02(AnonymousClass0MU.A8V, str, map);
        A02(AnonymousClass0MU.A8W, str2, map);
        synchronized (A0D) {
            if (TextUtils.isEmpty((CharSequence) map.get("cause"))) {
                A02(AnonymousClass0MU.A4c, AnonymousClass0MN.A01(new RuntimeException(AnonymousClass00U.A0V(str, " | ", str2), (Throwable) null)), map);
            }
        }
    }

    public AnonymousClass0NV(String str) {
        this.A01 = str;
    }

    public static void A03(String str, String str2, String str3, String str4, Map map) {
        AnonymousClass0ON r0;
        String num;
        A01();
        AnonymousClass0OO r02 = AnonymousClass0MU.A2y;
        String l = Long.toString(System.currentTimeMillis() / 1000);
        A02(r02, l, map);
        A02(AnonymousClass0MU.A1K, l, map);
        if (str != null) {
            A02(AnonymousClass0MU.A8z, str, map);
        } else {
            AnonymousClass0LU.A0C("lacrima", "User Id missing. Direct reports use 0 as user id.");
            A02(AnonymousClass0MU.A8z, "0", map);
        }
        if (str2 != null) {
            r0 = AnonymousClass0MU.A3I;
        } else {
            AnonymousClass0LU.A0C("lacrima", "ACTOR_ID missing. Direct reports use 0 as id.");
            r0 = AnonymousClass0MU.A3I;
            str2 = "0";
        }
        A02(r0, str2, map);
        if (str3 != null) {
            A02(AnonymousClass0MU.A3F, str3, map);
        } else {
            AnonymousClass0LU.A0C("lacrima", "ACTING_ACCOUNT_ID missing. Direct reports use 0 as id.");
            A02(AnonymousClass0MU.A3F, "0", map);
        }
        A02(AnonymousClass0MU.A56, "lacrima_direct_report", map);
        A02(AnonymousClass0MU.A4H, "lacrima_direct_report", map);
        A02(AnonymousClass0MU.A8J, "lacrima_direct_report", map);
        A02(AnonymousClass0MU.A35, Long.toString(AnonymousClass0N9.A01()), map);
        A02(AnonymousClass0MU.A1X, Long.toString(AnonymousClass0N9.A00()), map);
        A02(AnonymousClass0MU.A43, "r", map);
        A02(AnonymousClass0MU.A2c, Long.toString((long) AnonymousClass0FX.A01()), map);
        synchronized (A0D) {
            A02(AnonymousClass0MU.A3q, A03, map);
            A02(AnonymousClass0MU.A4v, A04, map);
            A02(AnonymousClass0MU.A4A, A05, map);
            Application application = A07;
            if (application != null) {
                String packageName = application.getPackageName();
                if (str4 == null) {
                    str4 = "";
                }
                AnonymousClass0ON r2 = AnonymousClass0MU.A3v;
                String str5 = "";
                if (!str5.equals(str4)) {
                    str5 = AnonymousClass00U.A0L(":", str4);
                }
                A02(r2, AnonymousClass00U.A0L(packageName, str5), map);
                AnonymousClass0ON r1 = AnonymousClass0MU.A8n;
                ApplicationInfo applicationInfo = A07.getApplicationInfo();
                if (applicationInfo == null) {
                    num = "n/a";
                } else {
                    num = Integer.toString(applicationInfo.targetSdkVersion);
                }
                A02(r1, num, map);
            }
        }
        A02(AnonymousClass0MU.A0C, Boolean.toString(AnonymousClass0FX.A02()), map);
        A02(AnonymousClass0MU.A2M, Long.toString((long) Process.myPid()), map);
        A02(AnonymousClass0MU.A0K, Boolean.toString(AnonymousClass0FX.A03()), map);
        A02(AnonymousClass0MU.A4x, Build.MODEL, map);
        A02(AnonymousClass0MU.A4y, Build.DEVICE, map);
        A02(AnonymousClass0MU.A4t, Build.BRAND, map);
        A02(AnonymousClass0MU.A50, Build.VERSION.RELEASE, map);
        A02(AnonymousClass0MU.A53, "true", map);
        if (Build.VERSION.SDK_INT >= 30) {
            JSONObject A002 = AnonymousClass0NF.A00();
            if (A002.length() > 0) {
                A02(AnonymousClass0MU.A8P, A002.toString(), map);
            }
        }
        AnonymousClass0ON r3 = AnonymousClass0MU.A8B;
        StringBuilder sb = new StringBuilder();
        sb.append(Math.random());
        sb.append("-");
        sb.append(System.currentTimeMillis());
        A02(r3, sb.toString(), map);
        long A012 = (long) AnonymousClass0FX.A01();
        AnonymousClass0OO r03 = AnonymousClass0MU.A1H;
        String l2 = Long.toString(A012);
        A02(r03, l2, map);
        A02(AnonymousClass0MU.A26, l2, map);
        A02(AnonymousClass0MU.A6c, "289.0.0.68.109", map);
        A02(AnonymousClass0MU.A08, Boolean.toString(true), map);
    }
}

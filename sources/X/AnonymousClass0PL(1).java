package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0PL  reason: invalid class name */
public final class AnonymousClass0PL {
    public static AnonymousClass0PL A04;
    public static final Date A05 = new Date(Build.TIME);
    public static final Pattern A06 = Pattern.compile("^([0-9]+)L$");
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final Date A03;

    public static synchronized AnonymousClass0PL A00(Context context) {
        AnonymousClass0PL r0;
        synchronized (AnonymousClass0PL.class) {
            r0 = A04;
            if (r0 == null) {
                r0 = new AnonymousClass0PL(context);
                A04 = r0;
            }
        }
        return r0;
    }

    public AnonymousClass0PL(Context context) {
        Date date;
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj;
        String group;
        C04830Ph A002 = AnonymousClass0PS.A00(context, context.getPackageName(), 128);
        PackageInfo packageInfo = A002.A01;
        String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str2 = "unknown";
        if (packageInfo != null) {
            this.A01 = !TextUtils.isEmpty(A002.A01.versionName) ? A002.A01.versionName : str2;
            if (A002.A01.versionCode > 0) {
                str = String.valueOf(AnonymousClass0FX.A01());
            }
        } else {
            this.A01 = str2;
        }
        this.A00 = str;
        PackageInfo packageInfo2 = A002.A01;
        if (!(packageInfo2 == null || (applicationInfo = packageInfo2.applicationInfo) == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.facebook.build_time")) == null)) {
            Matcher matcher = A06.matcher(obj.toString());
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                date = new Date(Long.parseLong(group));
                date.toString();
                this.A03 = date;
                z = C15980sH.A04(context);
                this.A02 = z;
            }
        }
        date = A05;
        date.toString();
        this.A03 = date;
        try {
            z = C15980sH.A04(context);
        } catch (SecurityException e) {
            if (e.getCause() == null || !(e.getCause().getCause() instanceof DeadObjectException)) {
                throw e;
            }
            z = false;
        }
        this.A02 = z;
    }
}

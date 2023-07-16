package X;

import android.content.Context;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.0Jc  reason: invalid class name */
public final class AnonymousClass0Jc {
    public static C03520Jb A00;
    public static final Pattern A01 = Pattern.compile("^[0-9]+L$");

    public static C03520Jb A00(Context context) {
        long j;
        C03520Jb r0 = A00;
        if (r0 != null) {
            return r0;
        }
        String packageName = context.getPackageName();
        String A002 = C03560Ji.A00(context, "com.facebook.versioncontrol.revision", packageName);
        if (A002 == null) {
            A002 = "";
        }
        C03560Ji.A00(context, "com.facebook.versioncontrol.branch", packageName);
        String A003 = C03560Ji.A00(context, "com.facebook.build_time", packageName);
        if (A003 == null) {
            A003 = "";
        }
        if (A01.matcher(A003).matches()) {
            j = Long.parseLong(A003.substring(0, A003.length() - 1));
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 0, Locale.US);
            dateTimeInstance.setTimeZone(TimeZone.getTimeZone("PST8PDT"));
            dateTimeInstance.format(new Date(j));
        } else {
            j = 0;
        }
        C03520Jb r02 = new C03520Jb(j, A002);
        A00 = r02;
        return r02;
    }
}

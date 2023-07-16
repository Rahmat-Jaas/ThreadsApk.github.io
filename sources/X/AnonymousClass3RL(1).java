package X;

import android.content.Context;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.3RL  reason: invalid class name */
public final class AnonymousClass3RL {
    public static final DateFormat A00 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    public static String A00(Context context) {
        return String.format((Locale) null, "%s: v%s (Build #%d) %s", new Object[]{C10340iB.A00(), C10380iF.A02(context), Integer.valueOf(C10380iF.A00()), A00.format(new Date(AnonymousClass0Jc.A00(context).A00))});
    }
}

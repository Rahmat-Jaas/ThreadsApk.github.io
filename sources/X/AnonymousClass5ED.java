package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5ED  reason: invalid class name */
public final class AnonymousClass5ED extends JXv {
    public static String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile("<.*?\\>").matcher(str);
        while (matcher.find()) {
            String str2 = "";
            if (matcher.group().equals("<EXT_SD>") && Build.VERSION.SDK_INT <= 29) {
                synchronized (C14620pq.class) {
                }
                str2 = Environment.getExternalStorageDirectory().toString();
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        matcher.appendTail(stringBuffer);
        String obj = stringBuffer.toString();
        try {
            return C86144wL.A0Z(obj).getCanonicalPath();
        } catch (IOException e) {
            Log.e(I17.A00(397), "Parse Env Variable", e);
            return obj;
        }
    }

    public AnonymousClass5ED(Context context, JQR jqr) {
        super(context, jqr);
    }
}

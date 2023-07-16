package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.2tE  reason: invalid class name and case insensitive filesystem */
public final class C50582tE {
    public static long A00(String str, boolean z) {
        String str2;
        String str3;
        if (str != null) {
            if (z) {
                str2 = "yyyy:MM:dd kk:mm:ss";
            } else {
                str2 = "yyyyMMdd'T'HHmmss.SSS'Z'";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            if (!z) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            }
            try {
                Date parse = simpleDateFormat.parse(str);
                if (parse != null) {
                    return parse.getTime();
                }
            } catch (ParseException e) {
                if (z) {
                    str3 = "ExifTimestampUtil_Photo";
                } else {
                    str3 = "ExifTimestampUtil_Video";
                }
                C10450iM.A03(str3, AnonymousClass0wJ.A0t("Could not parse date time ", e));
            }
        }
        return -1;
    }
}

package X;

import android.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7GQ  reason: invalid class name */
public final class AnonymousClass7GQ {
    public static Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$");
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$");

    public static C38379KYp A00(File file, long j, long j2, boolean z, boolean z2) {
        int lastIndexOf;
        int lastIndexOf2;
        long j3 = j2;
        long j4 = j;
        File file2 = file;
        if (z2) {
            String name = file2.getName();
            int lastIndexOf3 = name.lastIndexOf(46);
            if (!(lastIndexOf3 == -1 || (lastIndexOf = name.lastIndexOf(46, lastIndexOf3 - 1)) == -1 || (lastIndexOf2 = name.lastIndexOf(46, lastIndexOf - 1)) == -1)) {
                String substring = name.substring(lastIndexOf2 + 1, lastIndexOf);
                int lastIndexOf4 = name.lastIndexOf(46, lastIndexOf2 - 1);
                if (lastIndexOf4 != -1) {
                    String substring2 = name.substring(lastIndexOf4 + 1, lastIndexOf2);
                    String substring3 = name.substring(0, lastIndexOf4);
                    if (j == -1) {
                        j4 = file2.length();
                    }
                    if (j4 != 0) {
                        if (j2 == -9223372036854775807L) {
                            try {
                                j3 = Long.parseLong(substring);
                            } catch (NumberFormatException e) {
                                Log.e("CacheSpan", AnonymousClass00U.A0L("invalid filename: ", name), e);
                                return null;
                            }
                        }
                        long parseLong = Long.parseLong(substring2);
                        if (j4 <= 0) {
                            j4 = file2.length();
                        }
                        return new C38379KYp(file2, substring3, parseLong, j4, j3, true);
                    }
                }
            }
        } else {
            Matcher matcher = A01.matcher(file2.getName());
            if (matcher.matches()) {
                String group = matcher.group(1);
                if (!z) {
                    int length = group.length();
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (group.charAt(i3) == '%') {
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int i4 = length - (i2 << 1);
                        StringBuilder A0s = C86114wI.A0s(i4);
                        Matcher matcher2 = Util.A04.matcher(group);
                        while (i2 > 0 && matcher2.find()) {
                            String group2 = matcher2.group(1);
                            group2.getClass();
                            char parseInt = (char) Integer.parseInt(group2, 16);
                            A0s.append(group, i, matcher2.start());
                            A0s.append(parseInt);
                            i = matcher2.end();
                            i2--;
                        }
                        if (i < length) {
                            A0s.append(group, i, length);
                        }
                        if (A0s.length() == i4) {
                            group = A0s.toString();
                        }
                    }
                }
                if (group != null) {
                    long parseLong2 = Long.parseLong(matcher.group(2));
                    long parseLong3 = Long.parseLong(matcher.group(3));
                    if (j <= 0) {
                        j4 = file2.length();
                    }
                    return new C38379KYp(file2, group, parseLong2, j4, parseLong3, true);
                }
            }
        }
        return null;
    }

    public static File A01(File file, String str, long j, long j2, boolean z) {
        if (!z) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Util.A0A(str.charAt(i3))) {
                    i2++;
                }
            }
            if (i2 != 0) {
                StringBuilder A0s = C86114wI.A0s((i2 << 1) + length);
                while (i2 > 0) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (Util.A0A(charAt)) {
                        A0s.append('%');
                        A0s.append(Integer.toHexString(charAt));
                        i2--;
                    } else {
                        A0s.append(charAt);
                    }
                    i = i4;
                }
                if (i < length) {
                    A0s.append(str, i, length);
                }
                str = A0s.toString();
            }
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(str);
        A0r.append(".");
        A0r.append(j);
        A0r.append(".");
        A0r.append(j2);
        return C86154wM.A0U(file, C18180wK.A0i(".v2.exo", A0r));
    }

    public static File A02(File file, boolean z) {
        Matcher matcher = A00.matcher(file.getName());
        if (!matcher.matches()) {
            return file;
        }
        File A012 = A01(file.getParentFile(), matcher.group(1), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), z);
        file.renameTo(A012);
        return A012;
    }
}

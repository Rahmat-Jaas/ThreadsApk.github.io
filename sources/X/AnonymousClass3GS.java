package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.3GS  reason: invalid class name */
public abstract class AnonymousClass3GS {
    public Integer A00(String str) {
        char c;
        C04220Ms.A0B(str, 0);
        Locale locale = Locale.ROOT;
        String A0u = C18220wO.A0u(locale, C18250wR.A0h("[^\\dA-Z˜Ñ&]*").A01(C18220wO.A0u(locale, str), ""));
        if (C18220wO.A08(A0u) != 13) {
            return AnonymousClass006.A01;
        }
        if (C18250wR.A0h("[A-Z\\u00D1&]{4}\\d{6}[A-Z0-9]{3}").A04(A0u)) {
            if (!C26561qq.A00.contains(C18230wP.A0s(A0u, 0, 4))) {
                String A0s = C18230wP.A0s(A0u, 4, 6);
                AnonymousClass725.A00(10);
                int parseInt = Integer.parseInt(A0s, 10);
                String A0s2 = C18230wP.A0s(A0u, 6, 8);
                AnonymousClass725.A00(10);
                int parseInt2 = Integer.parseInt(A0s2, 10) - 1;
                String A0s3 = C18230wP.A0s(A0u, 8, 10);
                AnonymousClass725.A00(10);
                int parseInt3 = Integer.parseInt(A0s3, 10);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                int floor = ((int) Math.floor((double) (gregorianCalendar.get(1) / 100))) * 100;
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(parseInt + floor, parseInt2, parseInt3);
                if (gregorianCalendar2.compareTo(gregorianCalendar) > 0) {
                    gregorianCalendar2 = new GregorianCalendar((floor - 100) + parseInt, parseInt2, parseInt3);
                }
                if (C18240wQ.A07(gregorianCalendar2) == parseInt3 && gregorianCalendar2.get(2) == parseInt2 && gregorianCalendar2.get(1) % 100 == parseInt) {
                    int codePointAt = A0u.codePointAt(12);
                    String A0l = AnonymousClass8bQ.A0l(C18230wP.A0s(A0u, 0, 12), "-", "", false);
                    int i = 0;
                    int i2 = 0;
                    do {
                        i2 += AnonymousClass8bP.A0G("0123456789ABCDEFGHIJKLMN&OPQRSTUVWXYZ Ñ", (char) A0l.codePointAt(i), 0, 6) * (13 - i);
                        i++;
                    } while (i < 12);
                    int i3 = 11 - (i2 % 11);
                    if (i3 == 10) {
                        c = 'A';
                    } else if (i3 != 11) {
                        c = (char) String.valueOf(i3).codePointAt(0);
                    } else {
                        c = '0';
                    }
                    if (c != codePointAt) {
                        return AnonymousClass006.A0j;
                    }
                    return AnonymousClass006.A00;
                }
            }
        }
        return AnonymousClass006.A15;
    }

    public String A01(String str) {
        StringBuilder A0r;
        char codePointAt;
        C04220Ms.A0B(str, 0);
        String A01 = C18250wR.A0h("[^\\dA-Z˜Ñ&]*").A01(C18220wO.A0u(Locale.ROOT, str), "");
        int A08 = C18220wO.A08(A01);
        if (A08 <= 4) {
            return C18250wR.A0h("[\\d]*").A01(A01, "");
        }
        String A012 = C18250wR.A0h("[\\d]*").A01(C18230wP.A0s(A01, 0, 4), "");
        int i = A08;
        if (A08 > 10) {
            i = 10;
        }
        String A013 = C18250wR.A0h("\\D").A01(C18230wP.A0s(A01, 4, i), "");
        if (A08 > 10) {
            if (A08 > 13) {
                A08 = 13;
            }
            String A014 = C18250wR.A0h(URLEncodedUtils.PARAMETER_SEPARATOR).A01(C18230wP.A0s(A01, 10, A08), "");
            int A082 = C18220wO.A08(A014);
            if (A082 != 0) {
                String A0X = AnonymousClass00U.A0X(A012, A013, C18230wP.A0s(A014, 0, Math.min(2, A082)), Rfc3492Idn.delimiter);
                if (A082 != 3 || '0' > (codePointAt = (char) A014.codePointAt(2))) {
                    return A0X;
                }
                if (codePointAt >= ':' && codePointAt != 'A') {
                    return A0X;
                }
                A0r = C18200wM.A0r();
                A0r.append(A0X);
                A0r.append(codePointAt);
                return A0r.toString();
            }
        }
        A0r = C18200wM.A0r();
        A0r.append(A012);
        A0r.append(A013);
        return A0r.toString();
    }
}

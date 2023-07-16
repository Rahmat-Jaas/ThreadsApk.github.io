package X;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3Wt  reason: invalid class name and case insensitive filesystem */
public final class C62013Wt {
    public static final Pattern A00 = Pattern.compile("((?:\\?|&|#|^)(?:oh|oh2)=)([^&#]+)", 2);

    public static final String A00(String str) {
        if (str == null) {
            return str;
        }
        if (AnonymousClass8bP.A0j(str, "?url=", false) || AnonymousClass8bP.A0j(str, "&url=", false)) {
            int A0J = AnonymousClass8bP.A0J(str, "&url=", 0, false);
            if (A0J == -1) {
                A0J = AnonymousClass8bP.A0J(str, "?url=", 0, false);
            }
            if (A0J != -1) {
                int i = A0J + 5;
                int A0G = AnonymousClass8bP.A0G(str, '&', i, 4);
                if (A0G == -1) {
                    A0G = C18220wO.A08(str);
                }
                try {
                    String decode = URLDecoder.decode(C18230wP.A0s(str, i, A0G), "UTF-8");
                    C04220Ms.A06(decode);
                    String encode = URLEncoder.encode(A01(decode), "UTF-8");
                    C04220Ms.A06(encode);
                    String A0s = C18230wP.A0s(str, 0, i);
                    String substring = str.substring(A0G);
                    C04220Ms.A06(substring);
                    str = AnonymousClass00U.A0V(A0s, encode, substring);
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return A01(str);
    }

    public static final String A01(String str) {
        Matcher matcher = A00.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder A0r = C18200wM.A0r();
        int i = 0;
        do {
            int start = matcher.start();
            int end = matcher.end();
            A0r.append(C18230wP.A0s(str, i, start));
            A0r.append(matcher.group(1));
            if (matcher.group(2) != null) {
                A0r.append(AnonymousClass8bQ.A0l(new String(new char[C18220wO.A08(matcher.group(2))]), "\u0000", "x", false));
                i = end;
            }
        } while (matcher.find());
        String substring = str.substring(i);
        C04220Ms.A06(substring);
        String A0i = C18180wK.A0i(substring, A0r);
        C04220Ms.A06(A0i);
        return A0i;
    }
}

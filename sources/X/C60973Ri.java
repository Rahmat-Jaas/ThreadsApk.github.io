package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3Ri  reason: invalid class name and case insensitive filesystem */
public final class C60973Ri {
    public static final C134697yC A00 = C18250wR.A0h("\\d");
    public static final C134697yC A01 = C18250wR.A0h("🏻|㳘ﳟ|🏽|🏾|㳘￟");
    public static final C134697yC A02 = C18250wR.A0h("(.)\\1{2,}");
    public static final C134697yC A03 = C18250wR.A0h("([\n\r])+");
    public static final C134697yC A04 = C18250wR.A0h("\\p{Punct}");
    public static final C134697yC A05 = C18250wR.A0h("\\s+");
    public static final C134697yC A06 = C18250wR.A0h("[^\\p{ASCII}]");

    public static final List A00(String str) {
        Locale locale = Locale.ROOT;
        C04220Ms.A08(locale);
        List A0f = AnonymousClass8bP.A0f(C18190wL.A0r(locale, str), new String[]{" "}, 0, 6);
        ArrayList A0x = AnonymousClass0wJ.A0x(A0f, 10);
        Iterator it = A0f.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            C04220Ms.A0B(A0k, 0);
            int length = A0k.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A032 = A04.A03(String.valueOf(A0k.charAt(i2)));
                if (z) {
                    if (!A032) {
                        break;
                    }
                    length--;
                } else if (!A032) {
                    z = true;
                } else {
                    i++;
                }
            }
            C18210wN.A1O(A0k.subSequence(i, length + 1), A0x);
        }
        String A0H = AnonymousClass00J.A0H(" ", (CharSequence) null, (CharSequence) null, A0x, (AnonymousClass0YY) null, 62);
        StringBuilder A0r = C18200wM.A0r();
        char[] charArray = A0H.toCharArray();
        C04220Ms.A06(charArray);
        for (char c : charArray) {
            Map map = C35860J6x.A00;
            Character valueOf = Character.valueOf(c);
            if (map.containsKey(valueOf)) {
                A0r.append(map.get(valueOf));
            } else {
                A0r.append(c);
            }
        }
        String A012 = A04.A01(C18190wL.A0n(A0r), "");
        String A0k2 = AnonymousClass8bQ.A0k("$1", 1);
        C134697yC r1 = A02;
        String A013 = r1.A01(A012, A0k2);
        String A014 = r1.A01(A012, AnonymousClass8bQ.A0k("$1", 2));
        List A0f2 = AnonymousClass8bP.A0f(A012, new String[]{" "}, 0, 6);
        ArrayList A0x2 = AnonymousClass0wJ.A0x(A0f2, 10);
        Iterator it2 = A0f2.iterator();
        while (it2.hasNext()) {
            String A0k3 = C18180wK.A0k(it2);
            Iterator it3 = C35860J6x.A01.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                String A0k4 = C18180wK.A0k(it3);
                C04220Ms.A0B(A0k3, 0);
                C04220Ms.A0B(A0k4, 1);
                int length2 = A0k3.length();
                int length3 = A0k4.length();
                if (A0k3.regionMatches(true, length2 - length3, A0k4, 0, length3)) {
                    A0k3 = C18230wP.A0s(A0k3, 0, C18220wO.A08(A0k3) - C18220wO.A08(A0k4));
                    break;
                }
            }
            A0x2.add(A0k3);
        }
        return C06750aI.A17(A013, A014, AnonymousClass00J.A0H(" ", (CharSequence) null, (CharSequence) null, A0x2, (AnonymousClass0YY) null, 62));
    }
}

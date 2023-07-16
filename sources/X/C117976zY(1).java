package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6zY  reason: invalid class name and case insensitive filesystem */
public final class C117976zY {
    public static final void A00(C108796ix r7, C90965fN r8) {
        String A0o;
        String str = ((C130757qi) AnonymousClass7K7.A03(r8.A01, r8.A02)).A03;
        C04220Ms.A05(str);
        List list = r7.A02;
        if (str.length() != 0) {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            String A0r = C18190wL.A0r(locale, str);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : list) {
                C127397h3 A06 = C127397h3.A06(((C108076hm) next).A01);
                if (!(A06 == null || (A0o = C18230wP.A0o(A06)) == null || !AnonymousClass8bP.A0j(C18190wL.A0r(locale, A0o), A0r, false))) {
                    A0v.add(next);
                }
            }
            list = A0v;
        }
        r8.A00.A01(new C108796ix(list, r7.A01, r7.A00));
    }
}

package X;

import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;

/* renamed from: X.2LW  reason: invalid class name */
public final class AnonymousClass2LW {
    public static final String A00(String str) {
        if (str.length() == 0 || !AnonymousClass8bP.A0j(str, "_", false) || C18250wR.A0h("_").A02(str, 0).toArray(new String[0]).length < 2) {
            return "";
        }
        String substring = str.substring(AnonymousClass8bP.A0J(str, "_", 0, false) + 1);
        C04220Ms.A06(substring);
        return C18190wL.A1b(substring, URLEncodedUtils.PARAMETER_SEPARATOR, 0)[0];
    }
}

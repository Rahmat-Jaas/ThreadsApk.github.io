package X;

/* renamed from: X.3E4  reason: invalid class name */
public final class AnonymousClass3E4 {
    public static AnonymousClass3E4 A00;

    public final String A00(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        C04220Ms.A06(charArray);
        int i = 0;
        for (char c : charArray) {
            i += c;
        }
        return AnonymousClass00U.A0J("2", i);
    }
}

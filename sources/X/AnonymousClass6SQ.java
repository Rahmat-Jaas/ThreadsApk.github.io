package X;

/* renamed from: X.6SQ  reason: invalid class name */
public final class AnonymousClass6SQ {
    public static final String A00(String str) {
        int length = str.length();
        if (length > 28) {
            str = C18230wP.A0s(str, 0, length - 28);
        }
        char[] charArray = str.toCharArray();
        C04220Ms.A06(charArray);
        long j = 0;
        for (char A0G : charArray) {
            j = (j * ((long) 64)) + ((long) AnonymousClass8bP.A0G("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", A0G, 0, 6));
        }
        return String.valueOf(j);
    }
}

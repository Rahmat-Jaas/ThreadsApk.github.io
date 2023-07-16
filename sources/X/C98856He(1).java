package X;

/* renamed from: X.6He  reason: invalid class name and case insensitive filesystem */
public final class C98856He {
    public static final int A00(String str, int i) {
        float f;
        if (str == null) {
            return i;
        }
        try {
            if (C86144wL.A1Y(str)) {
                f = (((float) C18230wP.A0E(C18230wP.A08()).heightPixels) * AnonymousClass7Kk.A00(str)) / 100.0f;
            } else {
                f = AnonymousClass7Kk.A01(str);
            }
            return (int) f;
        } catch (C29721zB unused) {
            return i;
        }
    }
}

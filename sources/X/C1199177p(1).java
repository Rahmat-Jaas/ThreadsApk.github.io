package X;

/* renamed from: X.77p  reason: invalid class name and case insensitive filesystem */
public final class C1199177p {
    public static final C1199177p A02 = new C1199177p(AnonymousClass006.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return Float.toString(this.A00);
        }
        if (intValue != 1) {
            return "auto";
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A00);
        return C18180wK.A0i("%", A0r);
    }

    public C1199177p(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}

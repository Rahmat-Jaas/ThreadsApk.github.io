package X;

/* renamed from: X.6tg  reason: invalid class name and case insensitive filesystem */
public final class C114656tg {
    public final float A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C114656tg)) {
            return false;
        }
        C114656tg r4 = (C114656tg) obj;
        Integer num = this.A01;
        if (num != r4.A01) {
            return false;
        }
        if (num == AnonymousClass006.A00 || num == AnonymousClass006.A0N || Float.compare(this.A00, r4.A00) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.A00);
        switch (this.A01.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return "undefined";
        }
        if (intValue == 1) {
            return Float.toString(this.A00);
        }
        if (intValue != 2) {
            return "auto";
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A00);
        return C18180wK.A0i("%", A0r);
    }

    public C114656tg(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}

package X;

/* renamed from: X.5Mq  reason: invalid class name */
public final class AnonymousClass5Mq extends AnonymousClass0Sf implements C144828jL {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final AnonymousClass5Mq D56() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Mq) {
                AnonymousClass5Mq r5 = (AnonymousClass5Mq) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, this.A00 * 31)) + this.A01;
    }

    public AnonymousClass5Mq(int i, String str, String str2, int i2) {
        AnonymousClass0wJ.A1Q(str, str2);
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i2;
    }
}

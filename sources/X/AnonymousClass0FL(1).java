package X;

/* renamed from: X.0FL  reason: invalid class name */
public final class AnonymousClass0FL {
    public static final AnonymousClass0FL A02 = new AnonymousClass0FL((Integer) null, (AnonymousClass0AD) null);
    public final Integer A00;
    public final AnonymousClass0AD A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0FL) {
                AnonymousClass0FL r5 = (AnonymousClass0FL) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A00;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "IN";
                    break;
                case 2:
                    str = "OUT";
                    break;
                default:
                    str = "INVARIANT";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = hashCode * 31;
        AnonymousClass0AD r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        int intValue;
        StringBuilder sb;
        String str;
        Integer num = this.A00;
        if (num == null || (intValue = num.intValue()) == -1) {
            return "*";
        }
        if (intValue == 0) {
            return String.valueOf(this.A01);
        }
        if (intValue == 1) {
            sb = new StringBuilder();
            str = "in ";
        } else if (intValue == 2) {
            sb = new StringBuilder();
            str = "out ";
        } else {
            throw new AnonymousClass4VZ();
        }
        sb.append(str);
        sb.append(this.A01);
        return sb.toString();
    }

    public AnonymousClass0FL(Integer num, AnonymousClass0AD r5) {
        String str;
        String A0V;
        this.A00 = num;
        this.A01 = r5;
        if ((num == null) != (r5 == null)) {
            if (num == null) {
                A0V = "Star projection must have no type specified.";
            } else {
                switch (num.intValue()) {
                    case 1:
                        str = "IN";
                        break;
                    case 2:
                        str = "OUT";
                        break;
                    default:
                        str = "INVARIANT";
                        break;
                }
                A0V = AnonymousClass00U.A0V("The projection variance ", str, " requires type to be specified.");
            }
            throw new IllegalArgumentException(A0V);
        }
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.3HW  reason: invalid class name */
public final class AnonymousClass3HW {
    public AnonymousClass3BH A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3HW) || hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr;
        AnonymousClass3BH r4 = this.A00;
        if (r4 != null) {
            objArr = new Object[]{this.A05, this.A03, Integer.valueOf(r4.A00), Integer.valueOf(r4.A01)};
        } else {
            objArr = new Object[]{this.A05, this.A03};
        }
        return Arrays.hashCode(objArr);
    }
}

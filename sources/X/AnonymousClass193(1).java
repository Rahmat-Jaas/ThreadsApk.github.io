package X;

/* renamed from: X.193  reason: invalid class name */
public final class AnonymousClass193 extends AnonymousClass0Sf implements C41882MfV {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass193) {
                AnonymousClass193 r5 = (AnonymousClass193) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        boolean z = this.A02;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = (i + (z ? 1 : 0)) * 31;
        if (!this.A01) {
            i2 = 0;
        }
        return i3 + i2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public AnonymousClass193(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}

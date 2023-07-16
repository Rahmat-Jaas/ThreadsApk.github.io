package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.5La  reason: invalid class name and case insensitive filesystem */
public final class C90235La extends AnonymousClass0Sf implements C146178lm {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90235La) {
                C90235La r5 = (C90235La) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int AnQ() {
        return this.A01;
    }

    public final Medium Av8() {
        return null;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A02;
    }

    public final int hashCode() {
        return ((((this.A01 * 31) + this.A02) * 31) + this.A00) * 31;
    }

    public C90235La(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }
}

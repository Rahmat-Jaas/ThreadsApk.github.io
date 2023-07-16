package X;

import java.util.Locale;

/* renamed from: X.19W  reason: invalid class name */
public final class AnonymousClass19W extends AnonymousClass0Sf implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Locale A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19W) {
                AnonymousClass19W r5 = (AnonymousClass19W) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass19W r3 = (AnonymousClass19W) obj;
        C04220Ms.A0B(r3, 0);
        return this.A02.compareTo(r3.A02);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A03, (((C18180wK.A03(this.A02) + this.A01) * 31) + this.A00) * 31);
    }

    public AnonymousClass19W(String str, Locale locale, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = locale;
    }
}

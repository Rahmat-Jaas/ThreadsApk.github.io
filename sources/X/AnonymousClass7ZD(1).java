package X;

/* renamed from: X.7ZD  reason: invalid class name */
public final class AnonymousClass7ZD implements C147038nH {
    public final long A00;

    public final C111366nD AUS() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7ZD) && this.A00 == ((AnonymousClass7ZD) obj).A00);
    }

    public final float AQV() {
        return AnonymousClass7KE.A00(this.A00);
    }

    public final long AYH() {
        return this.A00;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return C86104wH.A0y(AnonymousClass7KE.A06(this.A00), C18190wL.A0s("ColorStyle(value="));
    }

    public AnonymousClass7ZD(long j) {
        this.A00 = j;
        if (j == AnonymousClass7KE.A06) {
            throw C18190wL.A0a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}

package X;

/* renamed from: X.79A  reason: invalid class name */
public final class AnonymousClass79A {
    public final boolean A00 = true;

    public AnonymousClass79A(boolean z) {
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass79A) && this.A00 == ((AnonymousClass79A) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A04(this.A00 ? 1 : 0) * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PlatformParagraphStyle(includeFontPadding=");
        A0s.append(this.A00);
        A0s.append(", emojiSupportMatch=");
        return C86104wH.A0y("EmojiSupportMatch.Default", A0s);
    }

    public AnonymousClass79A() {
    }
}

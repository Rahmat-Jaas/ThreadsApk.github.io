package X;

/* renamed from: X.79B  reason: invalid class name */
public final class AnonymousClass79B {
    public final C141838dH A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass79B)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return A00(this).equals(A00((AnonymousClass79B) obj));
    }

    public static String A00(AnonymousClass79B r0) {
        String languageTag = ((AnonymousClass7ZA) r0.A00).A00.toLanguageTag();
        C04220Ms.A06(languageTag);
        return languageTag;
    }

    public AnonymousClass79B(C141838dH r1) {
        this.A00 = r1;
    }

    public final int hashCode() {
        return A00(this).hashCode();
    }

    public final String toString() {
        return A00(this);
    }
}

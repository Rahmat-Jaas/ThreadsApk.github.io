package X;

/* renamed from: X.5rZ  reason: invalid class name */
public final class AnonymousClass5rZ extends C26743EUq {
    public static final AnonymousClass5rZ A00 = new AnonymousClass5rZ();

    public final Object A04() {
        return null;
    }

    public final boolean A06() {
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object A03() {
        throw C18180wK.A0a("Optional.get() cannot be called on an absent value");
    }

    public final Object A05(Object obj) {
        AnonymousClass7Ko.A07(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    public final boolean equals(Object obj) {
        return C18180wK.A1Z(obj, this);
    }

    public final C26743EUq A02(McB mcB) {
        return A00;
    }
}

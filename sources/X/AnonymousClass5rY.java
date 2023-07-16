package X;

/* renamed from: X.5rY  reason: invalid class name */
public final class AnonymousClass5rY extends C26743EUq {
    public final Object A00;

    public final boolean A06() {
        return true;
    }

    public final C26743EUq A02(McB mcB) {
        Object apply = mcB.apply(this.A00);
        AnonymousClass7Ko.A07(apply, "the Function passed to Optional.transform() must not return null.");
        return new AnonymousClass5rY(apply);
    }

    public final Object A03() {
        return this.A00;
    }

    public final Object A04() {
        return this.A00;
    }

    public final Object A05(Object obj) {
        AnonymousClass7Ko.A07(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass5rY) {
            return this.A00.equals(((AnonymousClass5rY) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s(AnonymousClass000.A00(269));
        A0s.append(this.A00);
        return C18180wK.A0i(")", A0s);
    }

    public AnonymousClass5rY(Object obj) {
        this.A00 = obj;
    }
}

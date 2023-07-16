package X;

/* renamed from: X.5KC  reason: invalid class name */
public final class AnonymousClass5KC extends AnonymousClass0Sf implements C143308gV {
    public final String A00;
    public final String A01;
    public final Integer A02 = AnonymousClass006.A0N;

    public AnonymousClass5KC(String str, String str2) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final Integer AgJ() {
        return this.A02;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5KC) || !C04220Ms.A0I(this.A01, ((AnonymousClass5KC) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A01) + C18220wO.A07(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0L("FlowFailMessageEvent: ", this.A01);
    }
}

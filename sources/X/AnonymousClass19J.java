package X;

/* renamed from: X.19J  reason: invalid class name */
public final class AnonymousClass19J extends AnonymousClass0Sf implements C81454np {
    public final String A00;

    public AnonymousClass19J(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass19J) && C04220Ms.A0I(this.A00, ((AnonymousClass19J) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("DogfoodingAssistantApiError(message=", this.A00, ')');
    }
}

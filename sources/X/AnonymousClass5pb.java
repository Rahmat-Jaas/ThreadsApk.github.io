package X;

/* renamed from: X.5pb  reason: invalid class name */
public final class AnonymousClass5pb extends C134667y9 {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass5pb) {
            return this.A00.equals(((AnonymousClass5pb) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 13);
        A0s.append(AnonymousClass000.A00(269));
        A0s.append(valueOf);
        return C18180wK.A0i(")", A0s);
    }

    public AnonymousClass5pb(Object obj) {
        this.A00 = obj;
    }
}

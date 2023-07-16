package X;

import java.io.Serializable;

/* renamed from: X.0OW  reason: invalid class name */
public final class AnonymousClass0OW implements Serializable {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0OW) || !C04220Ms.A0I(this.A00, ((AnonymousClass0OW) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failure(");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass0OW(Throwable th) {
        this.A00 = th;
    }
}

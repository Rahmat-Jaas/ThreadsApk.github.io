package X;

/* renamed from: X.7XM  reason: invalid class name */
public final class AnonymousClass7XM implements C146738mm {
    public final int A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C04220Ms.A0I(getClass(), C86144wL.A0a(obj))) {
                C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.A00 != ((AnonymousClass7XM) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C86134wK.A0r("AndroidPointerIcon(type=", this.A00);
    }

    public AnonymousClass7XM(int i) {
        this.A00 = i;
    }
}

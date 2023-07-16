package X;

/* renamed from: X.799  reason: invalid class name */
public final class AnonymousClass799 {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public static AnonymousClass799 A00(int i) {
        return new AnonymousClass799(i);
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass799) || i != ((AnonymousClass799) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        if (i == 6) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public /* synthetic */ AnonymousClass799(int i) {
        this.A00 = i;
    }
}

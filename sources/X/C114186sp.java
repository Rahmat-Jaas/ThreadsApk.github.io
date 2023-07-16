package X;

/* renamed from: X.6sp  reason: invalid class name and case insensitive filesystem */
public final class C114186sp {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114186sp) || i != ((C114186sp) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        if (this.A00 == 1) {
            return "Touch";
        }
        return "Keyboard";
    }

    public /* synthetic */ C114186sp(int i) {
        this.A00 = i;
    }
}

package X;

/* renamed from: X.7Ee  reason: invalid class name and case insensitive filesystem */
public final class C121117Ee {
    public final int A00;

    public static C121117Ee A00() {
        return new C121117Ee(3);
    }

    public final int hashCode() {
        return this.A00;
    }

    public static C121117Ee A01(int i) {
        return new C121117Ee(i);
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C121117Ee) || i != ((C121117Ee) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return "Invalid";
    }

    public /* synthetic */ C121117Ee(int i) {
        this.A00 = i;
    }
}

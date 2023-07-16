package X;

/* renamed from: X.6t9  reason: invalid class name and case insensitive filesystem */
public final class C114356t9 {
    public final int value = -1;

    public final int hashCode() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        int i = this.value;
        if (!(obj instanceof C114356t9) || i != ((C114356t9) obj).value) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.value;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Software";
        }
        if (i == 2) {
            return "Hardware";
        }
        if (i == -1) {
            return "Auto";
        }
        return "Unknown";
    }
}

package X;

/* renamed from: X.0UH  reason: invalid class name */
public final class AnonymousClass0UH implements Comparable {
    public final String A00;
    public final String A01;
    public final String[] A02;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass0UH)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass0UH) obj).A00);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((AnonymousClass0UH) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0UH(String str, String str2, String... strArr) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = strArr;
    }
}

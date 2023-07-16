package X;

/* renamed from: X.1lJ  reason: invalid class name */
public final class AnonymousClass1lJ extends AnonymousClass48W {
    public final String A00;

    public AnonymousClass1lJ(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1lJ) && C04220Ms.A0I(this.A00, ((AnonymousClass1lJ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C04220Ms.A0B(obj, 0);
        Object obj2 = AnonymousClass48W.A00;
        return C04220Ms.A0I(obj2, obj2);
    }
}

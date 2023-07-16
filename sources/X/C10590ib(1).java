package X;

/* renamed from: X.0ib  reason: invalid class name and case insensitive filesystem */
public final class C10590ib {
    public final Object A00;

    public final String toString() {
        Object obj = this.A00;
        if (obj != null) {
            return String.format("Optional[%s]", new Object[]{obj});
        }
        return "Optional.empty";
    }

    public C10590ib(Object obj) {
        this.A00 = obj;
    }

    public C10590ib() {
        this.A00 = null;
    }
}

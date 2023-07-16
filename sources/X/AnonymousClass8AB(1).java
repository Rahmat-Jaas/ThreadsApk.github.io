package X;

/* renamed from: X.8AB  reason: invalid class name */
public final class AnonymousClass8AB extends AnonymousClass8AJ<String> {
    public final /* synthetic */ C110166lE A00;

    public AnonymousClass8AB(C110166lE r1) {
        this.A00 = r1;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains(obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }
}

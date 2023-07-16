package X;

/* renamed from: X.4MY  reason: invalid class name */
public final class AnonymousClass4MY implements C83114qo {
    public final /* synthetic */ C29281xg A00;

    public AnonymousClass4MY(C29281xg r1) {
        this.A00 = r1;
    }

    public final void onSearchCleared(String str) {
        C29341xn r0 = this.A00.A00;
        if (r0 == null) {
            C04220Ms.A0E("filteringAdapter");
            throw null;
        } else {
            r0.getFilter().filter((CharSequence) null);
        }
    }
}

package X;

/* renamed from: X.55R  reason: invalid class name */
public final class AnonymousClass55R extends MJO {
    public final /* synthetic */ AnonymousClass7o4 A00;

    public AnonymousClass55R(AnonymousClass7o4 r1) {
        this.A00 = r1;
    }

    public final String A05() {
        C112616pu r2 = (C112616pu) this.A00.A00.get();
        if (r2 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder A0s = C18190wL.A0s("tag=[");
        A0s.append(r2.A02);
        return C18180wK.A0i("]", A0s);
    }
}

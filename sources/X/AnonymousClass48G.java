package X;

/* renamed from: X.48G  reason: invalid class name */
public final class AnonymousClass48G implements C41882MfV {
    public final String A00;

    public AnonymousClass48G(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        AnonymousClass48G r3 = (AnonymousClass48G) obj;
        String str2 = this.A00;
        if (r3 != null) {
            str = r3.A00;
        } else {
            str = null;
        }
        return C18180wK.A1V(C04220Ms.A0I(str2, str) ? 1 : 0);
    }
}

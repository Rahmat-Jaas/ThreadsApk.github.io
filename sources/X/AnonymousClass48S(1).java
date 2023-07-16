package X;

/* renamed from: X.48S  reason: invalid class name */
public final class AnonymousClass48S implements C41882MfV {
    public final AnonymousClass266 A00;
    public final String A01;
    public final String A02;

    /* renamed from: A00 */
    public final boolean isContentSame(AnonymousClass48S r3) {
        if (!this.A01.equals(r3.A01) || !this.A02.equals(r3.A02)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public AnonymousClass48S(AnonymousClass266 r1, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
    }
}

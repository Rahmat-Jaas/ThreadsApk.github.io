package X;

/* renamed from: X.489  reason: invalid class name */
public final class AnonymousClass489 implements C41882MfV {
    public final int A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        AnonymousClass489 r3 = (AnonymousClass489) obj;
        String valueOf = String.valueOf(this.A00);
        if (r3 != null) {
            str = String.valueOf(r3.A00);
        } else {
            str = null;
        }
        return C04220Ms.A0I(valueOf, str);
    }

    public AnonymousClass489(int i) {
        this.A00 = i;
    }
}

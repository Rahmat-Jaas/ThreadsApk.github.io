package X;

/* renamed from: X.48H  reason: invalid class name */
public final class AnonymousClass48H implements C41882MfV {
    public final Integer A00;
    public final String A01;

    public AnonymousClass48H(Integer num, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(C34332Jd.A00(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48H r3 = (AnonymousClass48H) obj;
        C04220Ms.A0B(r3, 0);
        return AnonymousClass0wJ.A1T(C34332Jd.A00(this.A00), C34332Jd.A00(r3.A00));
    }
}

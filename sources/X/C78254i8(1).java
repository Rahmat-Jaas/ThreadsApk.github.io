package X;

/* renamed from: X.4i8  reason: invalid class name and case insensitive filesystem */
public final class C78254i8 extends C02220Ah implements AnonymousClass0YY {
    public static final C78254i8 A00 = new C78254i8();

    public C78254i8() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C04220Ms.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            return "UNKNOWN";
        }
        return message;
    }
}

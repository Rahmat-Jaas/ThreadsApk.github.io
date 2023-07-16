package X;

/* renamed from: X.4i9  reason: invalid class name and case insensitive filesystem */
public final class C78264i9 extends C02220Ah implements AnonymousClass0YY {
    public static final C78264i9 A00 = new C78264i9();

    public C78264i9() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        try {
            C04220Ms.A07(str);
            String substring = str.substring(27);
            C04220Ms.A06(substring);
            return AnonymousClass0wJ.A0d(substring);
        } catch (NumberFormatException unused) {
            AnonymousClass0LU.A0C("com.fbpay.w3c.security.SecurityProviderEphemeral", AnonymousClass00U.A0L("Broken alias for the ephemeral key:", str));
            return null;
        }
    }
}

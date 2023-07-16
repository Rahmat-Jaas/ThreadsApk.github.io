package X;

import com.fbpay.w3c.security.SecurityProviderEphemeral;

/* renamed from: X.8NK  reason: invalid class name */
public final class AnonymousClass8NK extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NK A00 = new AnonymousClass8NK();

    public AnonymousClass8NK() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(C86124wJ.A1X((C18190wL.A08(obj) > (System.currentTimeMillis() - SecurityProviderEphemeral.A01) ? 1 : (C18190wL.A08(obj) == (System.currentTimeMillis() - SecurityProviderEphemeral.A01) ? 0 : -1))));
    }
}

package X;

import android.security.keystore.KeyGenParameterSpec;
import kotlin.Unit;

/* renamed from: X.8NI  reason: invalid class name */
public final class AnonymousClass8NI extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NI A00 = new AnonymousClass8NI();

    public AnonymousClass8NI() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        KeyGenParameterSpec.Builder builder = (KeyGenParameterSpec.Builder) obj;
        C04220Ms.A0B(builder, 0);
        builder.setDigests(new String[]{"SHA-256", "SHA-1"});
        builder.setEncryptionPaddings(new String[]{"OAEPPadding"});
        return Unit.A00;
    }
}

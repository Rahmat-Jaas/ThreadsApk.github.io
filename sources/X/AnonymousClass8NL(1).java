package X;

import android.security.keystore.KeyGenParameterSpec;
import kotlin.Unit;

/* renamed from: X.8NL  reason: invalid class name */
public final class AnonymousClass8NL extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NL A00 = new AnonymousClass8NL();

    public AnonymousClass8NL() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        KeyGenParameterSpec.Builder builder = (KeyGenParameterSpec.Builder) obj;
        C04220Ms.A0B(builder, 0);
        builder.setDigests(new String[]{"SHA-256"});
        builder.setSignaturePaddings(new String[]{"PKCS1"});
        return Unit.A00;
    }
}

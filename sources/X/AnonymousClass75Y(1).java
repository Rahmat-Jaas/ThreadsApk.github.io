package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;

/* renamed from: X.75Y  reason: invalid class name */
public final class AnonymousClass75Y {
    public final Context A00;
    public final KeyStore A01;

    public static void A00(KeyGenParameterSpec.Builder builder, C110636m1 r3) {
        if (r3.A05) {
            builder.setUserAuthenticationParameters(300, 2);
        }
    }

    public AnonymousClass75Y(Context context) {
        try {
            context.getMainExecutor().execute(new C134967yf());
        } catch (Exception unused) {
        }
        this.A00 = context;
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        this.A01 = instance;
    }
}

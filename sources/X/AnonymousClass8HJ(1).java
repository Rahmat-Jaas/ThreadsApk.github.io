package X;

import java.security.KeyStore;

/* renamed from: X.8HJ  reason: invalid class name */
public final class AnonymousClass8HJ extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8HJ A00 = new AnonymousClass8HJ();

    public AnonymousClass8HJ() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        return instance;
    }
}

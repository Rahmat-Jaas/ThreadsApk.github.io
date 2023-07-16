package X;

import java.security.KeyStore;

/* renamed from: X.8HF  reason: invalid class name */
public final class AnonymousClass8HF extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8HF A00 = new AnonymousClass8HF();

    public AnonymousClass8HF() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        return instance;
    }
}

package X;

import java.security.KeyStore;
import kotlin.Unit;

/* renamed from: X.8HE  reason: invalid class name */
public final class AnonymousClass8HE extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8HE A00 = new AnonymousClass8HE();

    public AnonymousClass8HE() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore keyStore = AnonymousClass7GZ.A01;
        if (keyStore == null) {
            C04220Ms.A0E("keyStore");
            throw null;
        }
        keyStore.deleteEntry("ecp-40bbaf72-50a8-11ec-bf63-0242ac130002");
        return Unit.A00;
    }
}

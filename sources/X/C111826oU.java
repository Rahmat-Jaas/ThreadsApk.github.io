package X;

import com.fbpay.w3c.security.SecurityProviderEphemeral;
import java.security.KeyStore;

/* renamed from: X.6oU  reason: invalid class name and case insensitive filesystem */
public final class C111826oU {
    public final SecurityProviderEphemeral A00;

    public final synchronized void A00() {
        ((KeyStore) C18190wL.A0f(AnonymousClass7E9.A03)).deleteEntry(this.A00.A00);
    }

    public C111826oU(long j) {
        this.A00 = new SecurityProviderEphemeral(j);
    }
}

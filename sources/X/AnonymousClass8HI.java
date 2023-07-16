package X;

import java.security.KeyStore;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.8HI  reason: invalid class name */
public final class AnonymousClass8HI extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8HI A00 = new AnonymousClass8HI();

    public AnonymousClass8HI() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C111826oU r0;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            C04530Oa r8 = AnonymousClass7E9.A03;
            Enumeration<String> aliases = ((KeyStore) C18190wL.A0f(r8)).aliases();
            C04220Ms.A06(aliases);
            C146838mw A03 = AnonymousClass8bJ.A03(AnonymousClass8NJ.A00, AnonymousClass8bL.A09(new C06700aD(aliases)));
            C78264i9 r3 = C78264i9.A00;
            AnonymousClass0wJ.A1N(A03, r3);
            for (Object A08 : AnonymousClass8bJ.A03(AnonymousClass8NK.A00, AnonymousClass8bJ.A06(new C1371286f(r3, A03)))) {
                ((KeyStore) C18190wL.A0f(r8)).deleteEntry(AnonymousClass00U.A08(C18190wL.A08(A08), "W3C_PAYMENT_ENCRYPTION_KEY_"));
            }
            Enumeration<String> aliases2 = ((KeyStore) C18190wL.A0f(r8)).aliases();
            C04220Ms.A06(aliases2);
            Iterator it = AnonymousClass8bL.A09(new C06700aD(aliases2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C04220Ms.A0I(next, AnonymousClass00U.A08(currentTimeMillis, "W3C_PAYMENT_ENCRYPTION_KEY_"))) {
                    if (next != null) {
                        throw new SecurityException(AnonymousClass00U.A08(currentTimeMillis, "Please throttle your call, not more than one key per millisecond. Timestamp:"));
                    }
                }
            }
            r0 = new C111826oU(currentTimeMillis);
        }
        return r0;
    }
}

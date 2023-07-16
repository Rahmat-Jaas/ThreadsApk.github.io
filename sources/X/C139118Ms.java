package X;

import java.util.Locale;

/* renamed from: X.8Ms  reason: invalid class name and case insensitive filesystem */
public final class C139118Ms extends C02220Ah implements AnonymousClass0YY {
    public static final C139118Ms A00 = new C139118Ms();

    public C139118Ms() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String str = (String) obj;
        C04220Ms.A0B(str, 0);
        String A0r = C18190wL.A0r(AnonymousClass7Kz.A0O(), str);
        if (A0r.length() <= 0) {
            return A0r;
        }
        StringBuilder A0r2 = C18200wM.A0r();
        char charAt = A0r.charAt(0);
        if (Character.isLowerCase(charAt)) {
            Locale A0O = AnonymousClass7Kz.A0O();
            String valueOf2 = String.valueOf(charAt);
            C04220Ms.A0C(valueOf2, C18170wI.A00(97));
            valueOf = C18220wO.A0u(A0O, valueOf2);
            if (valueOf.length() > 1) {
                if (charAt != 329) {
                    valueOf = AnonymousClass00U.A0B(C86114wI.A0o(C86134wK.A0q(valueOf, 1)), valueOf.charAt(0));
                }
            } else if (valueOf.equals(C18220wO.A0u(Locale.ROOT, valueOf2))) {
                valueOf = String.valueOf(Character.toTitleCase(charAt));
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        A0r2.append(valueOf);
        return C18180wK.A0i(C86134wK.A0q(A0r, 1), A0r2);
    }
}

package X;

import com.instagram.nux.aymh.loginhandlers.CredentialsLoginHandler;

/* renamed from: X.3Tz  reason: invalid class name */
public final class AnonymousClass3Tz {
    public static final AnonymousClass3Tz A00 = new AnonymousClass3Tz();

    public final C82754qD A00(C209216q r2) {
        C82754qD r0;
        C04220Ms.A0B(r2, 0);
        switch (r2.A01.intValue()) {
            case 0:
            case 6:
            case 7:
            case 9:
                r0 = new CredentialsLoginHandler();
                break;
            case 1:
                r0 = new C70404Eh();
                break;
            case 2:
                r0 = new C70374Ee();
                break;
            case 3:
            case 4:
                r0 = new C70384Ef();
                break;
            case 5:
                r0 = new C70394Eg();
                break;
            case 8:
                throw C18180wK.A0a("Unsupported account type");
            default:
                throw AnonymousClass4VZ.A00();
        }
        return r0;
    }
}

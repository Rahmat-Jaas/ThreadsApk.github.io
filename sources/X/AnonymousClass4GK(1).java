package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4GK  reason: invalid class name */
public final class AnonymousClass4GK implements C82884qQ {
    public final C63473hX A00;
    public final Integer A01;

    public final boolean CW4(C58743Gz r3) {
        int i;
        switch (this.A00.A06().intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return AnonymousClass0wJ.A1T(i, this.A01.intValue());
    }

    public AnonymousClass4GK(UserSession userSession, Integer num) {
        this.A00 = C63473hX.A01(userSession);
        this.A01 = num;
    }
}

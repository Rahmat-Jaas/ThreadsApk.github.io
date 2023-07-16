package X;

import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.service.session.UserSession;

/* renamed from: X.6jc  reason: invalid class name and case insensitive filesystem */
public final class C109196jc {
    public long A00 = -1;
    public final IGInstantExperiencesParameters A01;
    public final UserSession A02;

    public C109196jc(C113046qd r3, IGInstantExperiencesParameters iGInstantExperiencesParameters, UserSession userSession) {
        this.A01 = iGInstantExperiencesParameters;
        this.A02 = userSession;
        r3.A04.add(new C107976hc(this, userSession));
    }
}

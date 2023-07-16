package X;

import android.app.Application;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7bp  reason: invalid class name and case insensitive filesystem */
public final class C124837bp implements C147138nS {
    public final Application A00;
    public final C121177En A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C124837bp(Application application, C121177En r3, C11630kW r4, UserSession userSession, String str, String str2, String str3, String str4, List list) {
        AnonymousClass0wJ.A1O(application, userSession);
        C04220Ms.A0B(r4, 3);
        this.A00 = application;
        this.A03 = userSession;
        this.A02 = r4;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A08 = list;
        this.A01 = r3;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A03;
        return new AnonymousClass56Z(application, this.A01, this.A02, userSession, this.A06, this.A07, this.A05, this.A04, this.A08);
    }
}

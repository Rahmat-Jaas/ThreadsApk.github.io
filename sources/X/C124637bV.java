package X;

import android.app.Activity;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bV  reason: invalid class name and case insensitive filesystem */
public final class C124637bV implements C147138nS {
    public final Activity A00;
    public final LoggingFanData A01;
    public final C11630kW A02;
    public final UserSession A03;

    public C124637bV(Activity activity, LoggingFanData loggingFanData, C11630kW r3, UserSession userSession) {
        AnonymousClass0wJ.A1Q(userSession, loggingFanData);
        this.A00 = activity;
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = r3;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A03;
        Activity activity = this.A00;
        LoggingFanData loggingFanData = this.A01;
        Class<C131987t8> cls2 = C131987t8.class;
        AnonymousClass6LO r3 = new AnonymousClass6LO();
        return new C881757a(new AnonymousClass76R(loggingFanData, this.A02, userSession), AnonymousClass2FT.A00().A00(userSession), r3, (C131987t8) userSession.A01(cls2, C86154wM.A11(new C110916mU(userSession, activity, loggingFanData.A03), new AnonymousClass6LR(), 47)));
    }
}

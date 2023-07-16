package X;

import android.content.res.Resources;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.service.session.UserSession;
import java.util.UUID;

/* renamed from: X.7bk  reason: invalid class name and case insensitive filesystem */
public final class C124787bk implements C147138nS {
    public final Resources A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C124787bk(Resources resources, C11630kW r3, UserSession userSession, String str, String str2, String str3) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = resources;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = r3;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String A002 = C122037Js.A00();
        UserSession userSession = this.A02;
        C109056jO r5 = new C109056jO(new AppreciationGiftingDataSource(userSession), A002, C18190wL.A0n(UUID.randomUUID()));
        return new C883457r(new AnonymousClass7EX(new LoggingFanData(A002, this.A05, this.A03, this.A04), this.A01, userSession), new C105356dI(this.A00), r5);
    }
}

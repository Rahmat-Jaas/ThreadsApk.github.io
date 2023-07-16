package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.41F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass41F implements McB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C21839C2o A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ AnonymousClass41F(Activity activity, C21839C2o c2o, UserSession userSession, String str, String str2, String str3) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = c2o;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    public final Object apply(Object obj) {
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        C21839C2o c2o = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = (String) obj;
        if (str4 == null) {
            return null;
        }
        String string = activity.getResources().getString(2131833856);
        Locale locale = Locale.ROOT;
        new C61693Ux(activity, c2o, userSession, str4, str, string, str2.toUpperCase(locale), str3.toUpperCase(locale)).A01();
        return null;
    }
}

package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hy  reason: invalid class name and case insensitive filesystem */
public final class C24361hy extends C63873iU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C12560m7 A01;
    public final /* synthetic */ McB A02;
    public final /* synthetic */ C21839C2o A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public C24361hy(Activity activity, C12560m7 r2, McB mcB, C21839C2o c2o, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        this.A08 = str;
        this.A05 = str2;
        this.A09 = str3;
        this.A06 = str4;
        this.A03 = c2o;
        this.A04 = userSession;
        this.A02 = mcB;
        this.A07 = str5;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onFail(AnonymousClass3XX r11) {
        int A032 = C14030oh.A03(2030694327);
        C63813iO.A0E(this.A00, "fetch_highlight_permalink_failed");
        UserSession userSession = this.A04;
        C21839C2o c2o = this.A03;
        String str = this.A07;
        String str2 = this.A05;
        String str3 = this.A09;
        C63673i6.A09(c2o, userSession, str, str2, str3, r11.A01);
        AnonymousClass3iG.A0B(c2o, userSession, this.A08, str2, str3, this.A06, (String) null);
        C14030oh.A0A(-2130988052, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(1891523476);
        C63643hy.A05(new AnonymousClass4QP(this.A01));
        C14030oh.A0A(-1986955364, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-815528938);
        int A033 = C14030oh.A03(1319952264);
        String str = ((AnonymousClass1SY) obj).A00;
        if (str != null) {
            String str2 = this.A08;
            String str3 = this.A05;
            String str4 = this.A09;
            String str5 = this.A06;
            C21839C2o c2o = this.A03;
            UserSession userSession = this.A04;
            AnonymousClass3iG.A0B(c2o, userSession, str2, str3, str4, str5, str);
            this.A02.apply(str);
            C63673i6.A0A(c2o, userSession, this.A07, str3, str4, str);
            C14030oh.A0A(419317056, A033);
            C14030oh.A0A(-66452076, A032);
            return;
        }
        C04220Ms.A0E("highlightUrl");
        throw null;
    }
}

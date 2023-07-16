package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.6m8  reason: invalid class name and case insensitive filesystem */
public final class C110706m8 {
    public final Context A00;
    public final C10440iL A01;
    public final JSG A02;
    public final UserSession A03;
    public final GWa A04;
    public final String A05;

    public C110706m8(Context context, C10440iL r5, JSG jsg, UserSession userSession) {
        String A002;
        this.A01 = r5;
        this.A02 = jsg;
        this.A03 = userSession;
        this.A00 = context.getApplicationContext();
        this.A04 = new GWa(context);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342171418856270230L)) {
            A002 = "feed/text_post_app_timeline/";
        } else {
            A002 = C28174Ezk.A00(554);
        }
        this.A05 = A002;
    }
}

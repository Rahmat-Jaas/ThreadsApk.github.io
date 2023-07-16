package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.481  reason: invalid class name */
public final class AnonymousClass481 implements C144608im {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass0YP A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass481(Activity activity, UserSession userSession, AnonymousClass0YP r3, boolean z, boolean z2) {
        this.A01 = userSession;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void CAi(Map map) {
        C04220Ms.A0B(map, 0);
        C971568d r4 = (C971568d) map.get("android.permission.READ_CONTACTS");
        if (r4 != null) {
            int ordinal = r4.ordinal();
            UserSession userSession = this.A01;
            C28161tl A012 = AnonymousClass3WS.A01(userSession);
            if (ordinal == 0) {
                A012.A0N(true);
            } else {
                A012.A0N(false);
                if (this.A03 && !this.A04 && r4 == C971568d.DENIED_DONT_ASK_AGAIN) {
                    C62413Zr.A02(this.A00, (C83694rp) null, 2131824342, false);
                }
            }
            this.A02.invoke(r4, Boolean.valueOf(this.A04));
            AnonymousClass3LY.A01(userSession);
        }
    }
}

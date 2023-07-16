package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4L8  reason: invalid class name */
public final class AnonymousClass4L8 implements C83844s5 {
    public final /* synthetic */ AnonymousClass1v4 A00;

    public AnonymousClass4L8(AnonymousClass1v4 r1) {
        this.A00 = r1;
    }

    public final void Bnw() {
        AnonymousClass1v4 r2 = this.A00;
        C83004qd r1 = r2.A04;
        if (r1 != null) {
            r1.afterSelection(false);
        }
        r2.A05 = true;
    }

    public final void Brc() {
        AnonymousClass1v4 r5 = this.A00;
        r5.A05();
        UserSession userSession = r5.A08;
        if (C61453Tm.A00(userSession) && !AnonymousClass0wJ.A0Y(userSession).Apo()) {
            C63073bQ.A00(userSession).A09((Context) null, 40, 0);
            C59693Lv.A00(C320129v.UPDATE_SETTING_ATTEMPT, userSession);
        }
        C83004qd r1 = r5.A04;
        if (r1 != null) {
            r1.afterSelection(true);
        }
        r5.A05 = true;
    }
}

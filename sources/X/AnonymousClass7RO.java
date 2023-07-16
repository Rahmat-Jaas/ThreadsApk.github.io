package X;

import android.app.Activity;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7RO  reason: invalid class name */
public final class AnonymousClass7RO implements View.OnClickListener {
    public final /* synthetic */ C111026mf A00;
    public final /* synthetic */ C871850m A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ List A07;

    public AnonymousClass7RO(C111026mf r1, C871850m r2, AnonymousClass3HX r3, C127397h3 r4, Reel reel, UserSession userSession, User user, List list) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = userSession;
        this.A01 = r2;
        this.A04 = reel;
        this.A07 = list;
        this.A06 = user;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(-537651189);
        C111026mf r10 = this.A00;
        C109326jp r4 = r10.A01;
        if (r4 != null) {
            C122047Jt.A03(this.A02, this.A03, C63893iY.A01, r4);
        }
        UserSession userSession = this.A05;
        AnonymousClass3HX r12 = this.A02;
        C25029DeI deI = new C25029DeI(C63913ic.A09(r12), new C133937wk(C63913ic.A00(r12), -1), userSession);
        C871850m r11 = this.A01;
        C133987wp r8 = new C133987wp(r11);
        deI.A05 = new C23372Cqx((Activity) C63913ic.A04(r12), (View) r11.A04, (C27907EvI) new C133927wj(r10, r11, r12, this.A03, this.A06));
        deI.A0C = (String) r12.A00(R.id.bloks_reel_tray_session_id);
        Reel reel = this.A04;
        List list = this.A07;
        deI.A02(reel, C171229wH.A0H, r8, (List) null, list, list);
        C14030oh.A0C(-293133081, A052);
    }
}

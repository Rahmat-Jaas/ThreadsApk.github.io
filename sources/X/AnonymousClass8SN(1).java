package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.8SN  reason: invalid class name */
public final class AnonymousClass8SN extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ BKU A00;
    public final /* synthetic */ C21839C2o A01;
    public final /* synthetic */ C3G A02;
    public final /* synthetic */ C20066BMj A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SN(BKU bku, C21839C2o c2o, C3G c3g, C20066BMj bMj, UserSession userSession, User user, String str, boolean z) {
        super(2);
        this.A04 = userSession;
        this.A00 = bku;
        this.A05 = user;
        this.A03 = bMj;
        this.A07 = z;
        this.A06 = str;
        this.A01 = c2o;
        this.A02 = c3g;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        View.OnTouchListener CPg;
        View view = (View) obj;
        MotionEvent motionEvent = (MotionEvent) obj2;
        AnonymousClass0wJ.A1N(view, motionEvent);
        UserSession userSession = this.A04;
        BKU bku = this.A00;
        User user = this.A05;
        C20066BMj bMj = this.A03;
        boolean z2 = this.A07;
        String str = this.A06;
        C21839C2o c2o = this.A01;
        C3G c3g = this.A02;
        Reel A002 = C19600Az1.A00(bku, bMj, userSession);
        if (C19544Ay5.A06(bku, userSession, str) || ((A002 != null && !z2) || motionEvent.getAction() != 0 || (CPg = c3g.CPg(bku, user.getId(), C18230wP.A0n(c2o))) == null)) {
            z = false;
        } else {
            z = CPg.onTouch(view, motionEvent);
        }
        return Boolean.valueOf(z);
    }
}

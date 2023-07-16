package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.5yg  reason: invalid class name and case insensitive filesystem */
public final class C95035yg extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BKU A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C18330wh A03;
    public final /* synthetic */ Integer A04;

    public C95035yg(Context context, BKU bku, UserSession userSession, C18330wh r4, Integer num) {
        this.A03 = r4;
        this.A04 = num;
        this.A00 = context;
        this.A01 = bku;
        this.A02 = userSession;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(1248504690);
        this.A03.dismiss();
        C14030oh.A0A(2046452856, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(2002712816);
        int A033 = C14030oh.A03(1233623813);
        this.A03.dismiss();
        Integer num = this.A04;
        if (num != null) {
            C38040KHr kHr = C38040KHr.A01;
            C63733iD r2 = new C63733iD();
            r2.A0A = this.A00.getString(num.intValue());
            BKU bku = this.A01;
            r2.A06 = bku.A22();
            r2.A0E(AnonymousClass22b.SQUARE);
            C63733iD.A09(kHr, r2);
            UserSession userSession = this.A02;
            C38039KHq A002 = AnonymousClass3LY.A00(userSession);
            String A0p = C86134wK.A0p(bku.A2Z(userSession));
            C04220Ms.A0A(A0p);
            C23932D1u d1u = C23932D1u.A02;
            A002.CWx(new C131227rc(d1u, A0p));
            AnonymousClass3LY.A00(userSession).CWx(new C131227rc(d1u, userSession.getUserId()));
        }
        C14030oh.A0A(-843490790, A033);
        C14030oh.A0A(-4349901, A032);
    }
}

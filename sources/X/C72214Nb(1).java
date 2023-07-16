package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Nb  reason: invalid class name and case insensitive filesystem */
public final class C72214Nb implements C83964sH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C61213Si A04;
    public final /* synthetic */ AnonymousClass3DL A05;
    public final /* synthetic */ CUV A06;
    public final /* synthetic */ String A07;

    public final void onAuthorizeFail() {
    }

    public C72214Nb(Context context, C34640IcN icN, BKU bku, UserSession userSession, C61213Si r5, AnonymousClass3DL r6, CUV cuv, String str) {
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = cuv;
        this.A00 = context;
        this.A01 = icN;
        this.A03 = userSession;
        this.A02 = bku;
        this.A07 = str;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        AnonymousClass3DL r9 = this.A05;
        C61213Si r8 = this.A04;
        CUV cuv = this.A06;
        Context context = this.A00;
        C34640IcN icN = this.A01;
        UserSession userSession = this.A03;
        BKU bku = this.A02;
        String str3 = this.A07;
        if (C63803iN.A0F(userSession)) {
            C49222r2.A00(userSession).A04(new C71834Kl(context, icN, bku, userSession, r8, r9, cuv, str3), "likes_sheet", "FEED");
        } else {
            C63023bL.A00(context, icN, bku, userSession, r8, r9, cuv, str3);
        }
    }
}

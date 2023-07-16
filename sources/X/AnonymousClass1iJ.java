package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1iJ  reason: invalid class name */
public final class AnonymousClass1iJ extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C84284st A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass1iJ(Context context, C84284st r2, UserSession userSession, String str, String str2) {
        this.A01 = r2;
        this.A04 = str;
        this.A00 = context;
        this.A03 = str2;
        this.A02 = userSession;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032 = C14030oh.A03(-1964128363);
        this.A01.CGK(C63483hZ.A04(r7, this.A00.getString(2131826868)), C63483hZ.A02(r7), C63483hZ.A01(r7), this.A03);
        C14030oh.A0A(-1125357157, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-1417906255);
        super.onFinish();
        this.A01.CGO();
        C14030oh.A0A(-129019182, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1882059377);
        super.onStart();
        this.A01.CGY();
        C14030oh.A0A(1580016315, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = C14030oh.A03(888735317);
        AnonymousClass1UD r8 = (AnonymousClass1UD) obj;
        int A033 = C14030oh.A03(-1559760729);
        super.onSuccess(r8);
        User A002 = D5D.A00(r8);
        if (A002.A17() == null || A002.A18() == null || (str = this.A04) == null) {
            this.A01.CGK(this.A00.getString(2131826868), "user.pageIdForProfessionalUser is null and/or user.pageName is null on user object returned by server", (String) null, this.A03);
        } else {
            AnonymousClass1j1 r0 = new AnonymousClass1j1(A002.A17(), A002.A18(), str);
            UserSession userSession = this.A02;
            C67363zQ.A0F(userSession, r0);
            D5D.A00(r8).A1t(userSession);
            this.A01.CGh(this.A03);
        }
        C14030oh.A0A(1327216476, A033);
        C14030oh.A0A(-1710818660, A032);
    }
}

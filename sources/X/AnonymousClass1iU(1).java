package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.model.business.BusinessInfo;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1iU  reason: invalid class name */
public final class AnonymousClass1iU extends C63873iU {
    public int A00;
    public BusinessInfo A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public final /* synthetic */ Context A05;
    public final /* synthetic */ C67133yv A06;
    public final /* synthetic */ C84294su A07;
    public final /* synthetic */ C145538kf A08;
    public final /* synthetic */ UserSession A09;
    public final /* synthetic */ AnonymousClass266 A0A;
    public final /* synthetic */ boolean A0B;

    public AnonymousClass1iU(Context context, C67133yv r2, C84294su r3, C145538kf r4, BusinessInfo businessInfo, UserSession userSession, UserSession userSession2, AnonymousClass266 r8, String str, String str2, int i, boolean z) {
        this.A07 = r3;
        this.A0A = r8;
        this.A09 = userSession2;
        this.A0B = z;
        this.A08 = r4;
        this.A06 = r2;
        this.A05 = context;
        this.A02 = userSession;
        this.A01 = businessInfo;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A032 = C14030oh.A03(255149887);
        int A033 = C14030oh.A03(-310181475);
        super.onFail(r6);
        C14030oh.A0A(1742598850, A033);
        String A042 = C63483hZ.A04(r6, this.A05.getString(2131826865));
        String A022 = C63483hZ.A02(r6);
        String A012 = C63483hZ.A01(r6);
        if (A012 == null) {
            A012 = "NO_INTERNET";
        }
        this.A07.CGJ(A042, A022, A012);
        C14030oh.A0A(-1311862343, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-1399229220);
        int A033 = C14030oh.A03(77196212);
        super.onFinish();
        C14030oh.A0A(-1475775508, A033);
        this.A07.CGO();
        C14030oh.A0A(1492536454, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-1220550620);
        int A033 = C14030oh.A03(265142311);
        super.onStart();
        C14030oh.A0A(1029787681, A033);
        this.A07.CGY();
        C14030oh.A0A(1765979489, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = C14030oh.A03(1179748017);
        int A033 = C14030oh.A03(762180231);
        int A034 = C14030oh.A03(-1302768641);
        User A002 = D5D.A00((AnonymousClass1UD) obj);
        String id = A002.getId();
        boolean z = !"branded_content_settings".equals(this.A03);
        if (z) {
            A002.A0g();
        }
        UserSession userSession = this.A02;
        AnonymousClass3LY.A00(userSession).CWx(new AnonymousClass46D(id));
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "show_business_welcome_dialog", z);
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(userSession)), "show_business_onboarding_check_list_tooltip", true);
        C18210wN.A1J(userSession, A002);
        A002.A1t(userSession);
        if (!(A002.A17() == null || A002.A18() == null || (str = this.A04) == null)) {
            C67363zQ.A0F(userSession, new AnonymousClass1j1(A002.A17(), A002.A18(), str));
        }
        C14030oh.A0A(-526865383, A034);
        AnonymousClass266 r6 = this.A0A;
        if (r6 == AnonymousClass266.A04) {
            UserSession userSession2 = this.A09;
            USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession2);
            C18190wL.A1H(A0P, userSession2, "destination_picker_flag_reset");
            A0P.A0Q("user_interaction", C18190wL.A0Z(A0P, "entry_point", "switch_to_biz", true));
            A0P.Bb4();
            C62953bC.A03(userSession2, false);
        }
        if (this.A0B) {
            new AnonymousClass3V5(this.A08, this.A09).A02(C63873iU.A06(this, 35), "conversion");
        } else {
            this.A07.CGg(r6);
        }
        C14030oh.A0A(-1177938085, A033);
        C14030oh.A0A(520551826, A032);
    }
}

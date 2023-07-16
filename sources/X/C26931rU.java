package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.1rU  reason: invalid class name and case insensitive filesystem */
public final class C26931rU extends C26951rX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Double A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26931rU(Fragment fragment, C11630kW r11, C84634tZ r12, C07530bf r13, UserSession userSession, AnonymousClass265 r15, Double d, String str, String str2, String str3, String str4, String str5) {
        super(fragment, r11, r12, r13, r15, str, str2);
        this.A00 = userSession;
        this.A01 = d;
        this.A03 = str3;
        this.A04 = str4;
        this.A02 = str5;
    }

    public final void A02(C26641qy r18) {
        int A032 = C14030oh.A03(1572492987);
        super.A02(r18);
        UserSession userSession = this.A00;
        userSession.getClass();
        AnonymousClass28R r3 = AnonymousClass28R.INTRA_APP;
        double doubleValue = this.A01.doubleValue();
        String str = this.A03;
        String str2 = this.A04;
        C63453hV.A01(r3, userSession, AnonymousClass0wJ.A0d(str2), AnonymousClass0wJ.A0d(str2), str, this.A02, (String) null, (String) null, (String) null, doubleValue, false, true, true);
        C14030oh.A0A(1909963606, A032);
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(223815853);
        super.onFail(r3);
        C14030oh.A0A(-575196057, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(2049177287, C63873iU.A04(this, obj, -558343583));
    }
}

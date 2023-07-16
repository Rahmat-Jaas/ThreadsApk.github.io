package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hd  reason: invalid class name and case insensitive filesystem */
public final class C24191hd extends C63873iU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ AnonymousClass601 A04;
    public final /* synthetic */ C63893iY A05;
    public final /* synthetic */ C109326jp A06;
    public final /* synthetic */ C109326jp A07;
    public final /* synthetic */ UserSession A08;

    public C24191hd(FragmentActivity fragmentActivity, AnonymousClass601 r2, C63893iY r3, C109326jp r4, C109326jp r5, UserSession userSession, int i, int i2, int i3) {
        this.A03 = fragmentActivity;
        this.A08 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A07 = r4;
        this.A05 = r3;
        this.A04 = r2;
        this.A06 = r5;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-2014555250);
        C22021Tb r1 = (C22021Tb) obj;
        int A002 = AnonymousClass0wJ.A00(1106761629, r1);
        if (r1.A04) {
            FragmentActivity fragmentActivity = this.A03;
            UserSession userSession = this.A08;
            int i = this.A02;
            int i2 = this.A01;
            int i3 = this.A00;
            C109326jp r5 = this.A06;
            C570239l r8 = new C570239l(this.A04, this.A05, r5);
            if (fragmentActivity != null) {
                C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
                A0W.A02 = r1.A03;
                A0W.A0p(r1.A00);
                A0W.A0c(new C64053jU(fragmentActivity, r8, userSession, i, i2, i3), r1.A01);
                A0W.A0b(new IDxCListenerShape217S0100000_1_I2(userSession, 138), r1.A02);
                AnonymousClass0wJ.A1K(A0W);
                C63133bc.A05((C11630kW) null, userSession, (String) null, "av_enrollment", "av_upsell", (String) null);
            }
        } else {
            C109326jp r2 = this.A07;
            C61043Rr.A00(this.A04, this.A05, r2);
        }
        C14030oh.A0A(-1749053310, A002);
        C14030oh.A0A(-1995246555, A032);
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A032 = C14030oh.A03(1165467612);
        C109326jp r2 = this.A07;
        C61043Rr.A00(this.A04, this.A05, r2);
        C14030oh.A0A(1523901657, A032);
    }
}

package X;

import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.instagram.fanclub.api.FanClubApi;
import java.util.concurrent.CancellationException;

/* renamed from: X.48w  reason: invalid class name and case insensitive filesystem */
public final class C695148w implements AnonymousClass0i4 {
    public final FanClubApi A00;
    public final C83224qz A01;
    public final C84714tk A02;
    public final C86074wE A03;
    public final C86094wG A04;

    public /* synthetic */ C695148w(FanClubApi fanClubApi) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.A00 = fanClubApi;
        this.A01 = AnonymousClass7Ja.A03(A0J.BQy(210647125, 3));
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A03 = A0z;
        this.A04 = C18230wP.A0x((C148838sG) null, A0z);
        this.A02 = new IDxFlowShape250S0100000_1_I2(A0z, 15);
    }

    public final void onSessionWillEnd() {
        AnonymousClass7Ja.A05((CancellationException) null, this.A01);
    }
}

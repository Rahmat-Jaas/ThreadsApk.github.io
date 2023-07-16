package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tr  reason: invalid class name and case insensitive filesystem */
public final class C132417tr implements AnonymousClass0i1 {
    public final C145188k1 A00;
    public final C125787dz A01;
    public final C1200878l A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05 = AnonymousClass0OY.A02(AnonymousClass8GE.A00);
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C04530Oa A08;
    public final C04530Oa A09;
    public final C04530Oa A0A;
    public final C04530Oa A0B;
    public final C04530Oa A0C;
    public final C04530Oa A0D;
    public final SharedPreferences A0E;
    public final C125727dt A0F;
    public final C125737du A0G;
    public final C125747dv A0H;
    public final C125707dr A0I;
    public final C125717ds A0J;
    public final C125767dx A0K;
    public final GWa A0L;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132417tr(UserSession userSession, Context context) {
        C1200878l r2 = (C1200878l) AnonymousClass6H0.A00(userSession).A02.getValue();
        this.A02 = r2;
        GWa gWa = new GWa(context);
        this.A0L = gWa;
        this.A03 = C86114wI.A0w(userSession, 44);
        this.A0D = AnonymousClass0OY.A02(AnonymousClass8GF.A00);
        this.A09 = C86114wI.A0w(this, 49);
        this.A08 = C86114wI.A0w(this, 48);
        this.A0B = C86104wH.A15(this, 0);
        this.A0C = C86104wH.A15(this, 1);
        C125727dt r3 = new C125727dt(r2);
        this.A0F = r3;
        C125737du r4 = new C125737du(gWa);
        this.A0G = r4;
        C125747dv r5 = new C125747dv((C03700Kj) C18190wL.A0f(this.A05));
        this.A0H = r5;
        C125707dr r6 = new C125707dr();
        this.A0I = r6;
        SharedPreferences A022 = AnonymousClass3Zs.A03(userSession).A02(D2R.A1P, C125767dx.class);
        this.A0E = A022;
        C125767dx r7 = new C125767dx(A022, (C03700Kj) C18190wL.A0f(this.A05));
        this.A0K = r7;
        C125717ds r8 = new C125717ds();
        this.A0J = r8;
        this.A01 = new C125787dz(AnonymousClass68S.FEATURES_AGGREGATION, (C121547Gq) null, "System", C06750aI.A17(r3, r4, r5, r6, r7, r8));
        C04530Oa A0w = C86114wI.A0w(userSession, 46);
        this.A06 = A0w;
        this.A00 = new AnonymousClass7e2((C696649n) A0w.getValue(), userSession);
        this.A0A = AnonymousClass0OY.A02(C86164wN.A0v(userSession, this, 40));
        this.A04 = C86114wI.A0w(this, 45);
        this.A07 = C86114wI.A0w(this, 47);
    }
}

package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7ty  reason: invalid class name and case insensitive filesystem */
public final class C132487ty implements AnonymousClass0i1 {
    public final AnonymousClass791 A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(AnonymousClass8GC.A00);
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C104456bo A05;
    public final C146988nC A06;
    public final C112086oy A07;
    public final C104506bt A08;
    public final C98746Gt A09;
    public final C110306lS A0A;
    public final C104516bu A0B;
    public final AnonymousClass7DX A0C;
    public final AnonymousClass7DX A0D;
    public final C104556by A0E;
    public final C104566bz A0F;
    public final C31580Grx A0G;
    public final GWa A0H;
    public final C04530Oa A0I;

    public final void onUserSessionWillEnd(boolean z) {
    }

    static {
        C132487ty.class.getCanonicalName();
    }

    public C132487ty(UserSession userSession, Context context) {
        UserSession userSession2 = userSession;
        C04530Oa A0w = C86114wI.A0w(userSession2, 40);
        this.A02 = A0w;
        C104556by r9 = new C104556by((C07810cE) A0w.getValue());
        this.A0E = r9;
        C104566bz r2 = new C104566bz(new Handler(C1189773a.A00(userSession2)));
        this.A0F = r2;
        C31580Grx A012 = AnonymousClass3WK.A01(userSession2);
        this.A0G = A012;
        C04530Oa A0w2 = C86114wI.A0w(userSession2, 42);
        this.A0I = A0w2;
        C104516bu r14 = new C104516bu(A0w2);
        this.A0B = r14;
        C04530Oa A022 = AnonymousClass0OY.A02(AnonymousClass8GD.A00);
        this.A04 = A022;
        C104456bo r0 = new C104456bo((C37295Joc) A022.getValue());
        this.A05 = r0;
        C125677do A002 = C125677do.A00(r0.A00);
        this.A06 = A002;
        C104506bt r8 = new C104506bt(A002);
        this.A08 = r8;
        this.A03 = C86114wI.A0w(userSession2, 41);
        Context context2 = context;
        GWa gWa = new GWa(context2);
        this.A0H = gWa;
        C112086oy r7 = new C112086oy(context2, A012);
        this.A07 = r7;
        C98746Gt r1 = new C98746Gt();
        this.A09 = r1;
        C112086oy r16 = r7;
        C110306lS r15 = new C110306lS(r16, (C121547Gq) this.A03.getValue(), r8, r1, r9);
        this.A0A = r15;
        AnonymousClass5F9 r152 = new AnonymousClass5F9((C03700Kj) C18190wL.A0f(this.A01), (C121547Gq) this.A03.getValue(), userSession2, gWa);
        this.A0C = r152;
        AnonymousClass5FC r12 = new AnonymousClass5FC((HashMap) null, (DefaultConstructorMarker) null, 1);
        this.A0D = r12;
        this.A00 = new AnonymousClass791((C03700Kj) C18190wL.A0f(this.A01), A002, (C121547Gq) this.A03.getValue(), r15, r14, r152, r12, r2);
    }
}

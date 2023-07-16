package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4EJ  reason: invalid class name */
public final class AnonymousClass4EJ implements C82694q7 {
    public AnonymousClass25R A00;
    public C83654rl A01;
    public boolean A02;
    public final C684944a A03;
    public final AnonymousClass35J A04;
    public final AnonymousClass3II A05;
    public final AnonymousClass38V A06;
    public final C83224qz A07;

    public final /* bridge */ /* synthetic */ AnonymousClass3GM AFH(AnonymousClass25P r35, AnonymousClass25P r36, AnonymousClass25P r37, AnonymousClass25P r38, AnonymousClass0ZU r39, int i, boolean z, boolean z2) {
        String str;
        AnonymousClass25P r15 = r35;
        C04220Ms.A0B(r15, 0);
        AnonymousClass25P r14 = r37;
        AnonymousClass25P r13 = r38;
        AnonymousClass0wJ.A1Q(r14, r13);
        AnonymousClass0ZU r12 = r39;
        C04220Ms.A0B(r12, 7);
        C83654rl r7 = this.A01;
        if (r7 != null) {
            boolean z3 = this.A02;
            AnonymousClass25R r6 = this.A00;
            if (r6 != null) {
                C684944a r5 = this.A03;
                AnonymousClass3II r4 = this.A05;
                C83224qz r3 = this.A07;
                AnonymousClass38V r2 = this.A06;
                UserSession userSession = this.A04.A00;
                AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
                boolean z4 = z;
                boolean z5 = z2;
                return new C27091rx(r5, r15, r36, r14, r13, r6, r7, r4, r2, r12, r3, i, (int) TimeUnit.SECONDS.toMillis((long) C63803iN.A01(r8, userSession, 36591974605848625L)), z4, z5, z3, C63803iN.A0E(r8, userSession, 36310877586719002L));
            }
            str = "badgeLocation";
        } else {
            str = "useCase";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public AnonymousClass4EJ(C684944a r2, AnonymousClass35J r3, AnonymousClass3II r4, AnonymousClass38V r5, C83224qz r6) {
        AnonymousClass0wJ.A1O(r4, r2);
        AnonymousClass0wJ.A1R(r3, r6);
        C04220Ms.A0B(r5, 5);
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = r5;
    }
}

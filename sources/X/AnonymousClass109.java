package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0300000_I2;

/* renamed from: X.109  reason: invalid class name */
public final class AnonymousClass109 extends C62793ak {
    public final int A00;
    public final AnonymousClass37P A01;
    public final AnonymousClass48v A02;
    public final C86064wD A03;
    public final C84714tk A04;
    public final C84714tk A05;
    public final C86074wE A06;
    public final C86094wG A07;
    public final C86094wG A08;
    public final C86094wG A09;

    public AnonymousClass109(AnonymousClass37P r7, AnonymousClass48v r8, int i) {
        C04220Ms.A0B(r8, 1);
        this.A02 = r8;
        this.A01 = r7;
        this.A00 = i;
        C86094wG r4 = r8.A04;
        this.A09 = r4;
        C86094wG r3 = r8.A03;
        this.A08 = r3;
        C27441EnX enX = new C27441EnX();
        this.A03 = enX;
        this.A05 = AnonymousClass7C4.A02(enX);
        C27457Enn A0z = C18190wL.A0z(false);
        this.A06 = A0z;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z);
        this.A04 = C25807DsL.A01(new KtSLambdaShape3S0300000_I2(this, (C146958n9) null, 1, 42), r4, r3);
        UserSession userSession = r7.A01;
        C11630kW r32 = r7.A00;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r32, userSession), "instagram_artist_program_page_tap"), 1690);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18240wQ.A14(A0I, r32);
            A0I.A0O(C171769zw.A0O, "action_source");
            A0I.Bb4();
        }
    }
}

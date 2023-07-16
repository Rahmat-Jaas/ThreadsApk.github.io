package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.78J  reason: invalid class name */
public final class AnonymousClass78J {
    public String A00;
    public boolean A01;
    public final C108036hi A02;
    public final AnonymousClass3V6 A03 = AnonymousClass2LT.A00();
    public final C86074wE A04;
    public final C86094wG A05;
    public final AnonymousClass3V6 A06 = AnonymousClass2LT.A00();
    public final UserSession A07;

    public AnonymousClass78J(C108036hi r4, UserSession userSession) {
        this.A07 = userSession;
        this.A02 = r4;
        C27457Enn A0z = C18190wL.A0z(C157129Qz.A00);
        this.A04 = A0z;
        this.A05 = C18230wP.A0x((C148838sG) null, A0z);
        this.A01 = true;
    }

    public static final void A00(C21835C2k c2k, AnonymousClass78J r10, boolean z, boolean z2) {
        C21835C2k c2k2 = c2k;
        List AXq = c2k.AXq();
        r10.A04.CrC(new AnonymousClass9R1(c2k2, (String) null, AXq, z, false, z2, false, true));
        r10.A01(c2k2.Azu());
        C21746BzX bzX = r10.A02.A00;
        if ((bzX instanceof C148678rf) && C18190wL.A1a(AXq)) {
            EAV.A00(r10.A07).A0B(((C148678rf) bzX).B7W(), z2);
        }
    }

    public final void A01(C84054sT r2) {
        String str;
        boolean z;
        if (r2 != null) {
            str = r2.Ata();
        } else {
            str = null;
        }
        this.A00 = str;
        if (r2 != null) {
            z = r2.AwS();
        } else {
            z = true;
        }
        this.A01 = z;
    }
}

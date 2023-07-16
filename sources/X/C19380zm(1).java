package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0zm  reason: invalid class name and case insensitive filesystem */
public final class C19380zm extends C62793ak {
    public final C25550Dnj A00;
    public final String A01;
    public final C86074wE A02;

    public C19380zm(C25550Dnj dnj, String str) {
        C84064sU A0Q;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        C28363FEx fEx;
        C25550Dnj dnj2 = dnj;
        C04220Ms.A0B(dnj2, 1);
        this.A00 = dnj2;
        this.A01 = str;
        C27457Enn A0z = C18190wL.A0z(new C565537q(this, AnonymousClass0ZV.A00));
        this.A02 = A0z;
        User A03 = this.A00.A03(this.A01);
        if (A03 != null && (A0Q = A03.A0Q()) != null) {
            List<C84614tX> B1g = A0Q.B1g();
            if (C18190wL.A1a(B1g)) {
                ArrayList A0w = AnonymousClass0wJ.A0w(B1g);
                for (C84614tX r4 : B1g) {
                    String Al8 = r4.Al8();
                    if (Al8 == null || Al8.length() == 0) {
                        imageUrl = null;
                    } else {
                        imageUrl = AnonymousClass3WG.A00(C15430rJ.A01(r4.Al8()));
                    }
                    String Al7 = r4.Al7();
                    if (Al7 == null || Al7.length() == 0) {
                        imageUrl2 = null;
                    } else {
                        imageUrl2 = AnonymousClass3WG.A00(C15430rJ.A01(r4.Al7()));
                    }
                    String BH2 = r4.BH2();
                    String BEm = r4.BEm();
                    BEm = BEm == null ? "" : BEm;
                    String BGN = r4.BGN();
                    String Apf = r4.Apf();
                    Integer BGQ = r4.BGQ();
                    Integer AyB = r4.AyB();
                    C83354rF Aaf = r4.Aaf();
                    if (Aaf != null) {
                        fEx = Aaf.CyU();
                    } else {
                        fEx = null;
                    }
                    A0w.add(new AnonymousClass197(fEx, imageUrl, imageUrl2, BGQ, AyB, BH2, BEm, BGN, Apf));
                }
                A0z.CrC(new C565537q(this, A0w));
            }
        }
    }
}

package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.57g  reason: invalid class name and case insensitive filesystem */
public final class C882357g extends C62793ak {
    public final C21839C2o A00;
    public final UserSession A01;
    public final C963564n A02;
    public final String A03;
    public final Set A04 = C86134wK.A0u();
    public final C86074wE A05;
    public final C86094wG A06;

    public C882357g(C21839C2o c2o, UserSession userSession, String str) {
        this.A03 = str;
        this.A01 = userSession;
        this.A00 = c2o;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0201000_I2());
        this.A05 = A0z;
        this.A06 = C18230wP.A0x((C148838sG) null, A0z);
        this.A02 = new C963564n(userSession);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 5), AnonymousClass3J5.A00(this), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 6), AnonymousClass3J5.A00(this), 3);
        UserSession userSession2 = this.A01;
        BKU A052 = C19462Awj.A01(userSession2).A05(this.A03);
        if (A052 != null) {
            C10680ik r1 = new C10680ik(userSession2);
            C21839C2o c2o2 = this.A00;
            r1.A00 = c2o2;
            r1.A01 = C10690il.A03;
            C13330nS A002 = r1.A00();
            BK1 A012 = C19541Ay2.A01(A052, c2o2, userSession2, (C145018jf) null, (Integer) null, C86144wL.A0b(), I17.A00(110));
            if (A012 != null) {
                A012.A2a = C18230wP.A0f(A052.A1g());
                C35712J1a.A00(A002, A012, c2o2);
            }
        }
    }

    public final void onCleared() {
        String str;
        User user;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : (Iterable) ((KtCSuperShape0S0201000_I2) this.A06.getValue()).A01) {
            if (this.A04.contains(((AnonymousClass5Hf) next).A03)) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        int i = 0;
        for (Object next2 : A0v) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            UserSession userSession = this.A01;
            String str2 = ((AnonymousClass5Hf) next2).A03;
            C23937D1z d1z = C23937D1z.LIKERS;
            BKU A052 = C19462Awj.A01(userSession).A05(this.A03);
            if (A052 == null || (user = A052.A0f.A1i) == null) {
                str = null;
            } else {
                str = user.getId();
            }
            C25595DoV.A01(userSession, AnonymousClass3PT.A00(d1z, str, 12, false), str2, i);
            A0w.add(Unit.A00);
            i = i2;
        }
        this.A02.onUserSessionWillEnd(false);
    }
}

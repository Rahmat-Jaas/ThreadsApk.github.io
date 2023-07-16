package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.0zt  reason: invalid class name and case insensitive filesystem */
public final class C19450zt extends C62793ak {
    public final C86094wG A00;
    public final UserSession A01;
    public final String A02;
    public final C86074wE A03;

    public C19450zt(String str, UserSession userSession) {
        String str2;
        Object value;
        boolean A0I;
        this.A02 = str;
        this.A01 = userSession;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S2010000_I2((String) null, (String) null, (DefaultConstructorMarker) null, 7, 3, false));
        this.A03 = A0z;
        this.A00 = A0z;
        C63803iN.A0C(AnonymousClass0TJ.A05, userSession, 36891479855071783L);
        User A0P = C18210wN.A0P(userSession, str);
        if (A0P == null) {
            C10450iM.A03("FediversePromiseViewModel_init_userNotFound", AnonymousClass00U.A0L("Can't find user in UserCache with id=", str));
            str2 = "";
        } else if (C04220Ms.A0B(A0P.BK7(), 0)) {
            str2 = A0P.BK7();
        } else {
            str2 = AnonymousClass00U.A0L(A0P.BK7(), "@threads.net");
        }
        String A0Z = AnonymousClass8bP.A0Z(str2, "@", AnonymousClass000.A00(1152));
        do {
            value = A0z.getValue();
            A0I = C04220Ms.A0I(this.A01.getUserId(), this.A02);
            C04220Ms.A0B(str2, 1);
        } while (!A0z.ADi(value, new KtCSuperShape0S2010000_I2(A0I, str2, A0Z, 3)));
    }
}

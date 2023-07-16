package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.AnonymousClass2R1;
import X.AnonymousClass2SX;
import X.AnonymousClass3Ie;
import X.AnonymousClass49O;
import X.C04220Ms;
import X.C10300i6;
import X.C130557qH;
import X.C18200wM;
import X.C18210wN;
import X.C28181to;
import X.C32163H7y;
import X.C36622Sa;
import X.C551231v;
import X.C62253Xz;
import X.C697249u;
import X.C70794Gd;
import X.C70814Gf;
import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.Function;

public class IDxObjectShape119S0200000_1_I2 implements Function, AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape119S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object invoke() {
        C62253Xz r8;
        switch (this.A02) {
            case 0:
                return new C32163H7y((UserSession) this.A01, ((AnonymousClass49O) this.A00).A04);
            case 1:
                return new C130557qH((Context) this.A00, (C10300i6) this.A01);
            case 2:
                C28181to r0 = (C28181to) this.A00;
                UserSession userSession = (UserSession) this.A01;
                AnonymousClass3Ie A03 = r0.A03();
                String userId = userSession.getUserId();
                Context context = r0.A00;
                String[] strArr = C551231v.A01;
                HashSet A0u = C18200wM.A0u();
                for (String add : strArr) {
                    A0u.add(add);
                }
                Set unmodifiableSet = Collections.unmodifiableSet(A0u);
                String A0g = C18200wM.A0g();
                if (A0g == null) {
                    A0g = "";
                }
                if (A03 != null) {
                    r8 = A03.A01;
                } else {
                    r8 = null;
                }
                return new AnonymousClass3Ie(context, userSession, AnonymousClass2R1.A00(context, userSession, r8, userId, A0g, (String) null, 2, false, C18210wN.A1S(36323977236455631L)), userId, unmodifiableSet);
            case 3:
                Context context2 = (Context) this.A00;
                UserSession userSession2 = (UserSession) this.A01;
                C36622Sa.A00();
                C04220Ms.A0B(context2, 0);
                return new C70814Gf(context2, C36622Sa.A00().A02(userSession2), AnonymousClass2SX.A00(userSession2), new C70794Gd(context2, userSession2), userSession2);
            default:
                return new C697249u((Context) this.A00, (UserSession) this.A01);
        }
    }
}

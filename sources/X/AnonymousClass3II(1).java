package X;

import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.notifications.badging.impl.BadgingApiImpl;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0100000_I2_4;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0110000_I2;

/* renamed from: X.3II  reason: invalid class name */
public final class AnonymousClass3II {
    public boolean A00;
    public final AnonymousClass3YB A01;
    public final AnonymousClass38U A02;
    public final BadgingApiImpl A03;
    public final UserSession A04;
    public final Map A05;
    public final C83224qz A06;
    public final C86074wE A07 = C18190wL.A0z(C18180wK.A0X());
    public final AnonymousClass35J A08;

    public final C84714tk A00(C83654rl r7) {
        C84714tk r2;
        C84714tk r4;
        C04220Ms.A0B(r7, 0);
        C61633Uq r0 = (C61633Uq) this.A01.A02.get(r7);
        if (r0 != null) {
            r2 = r0.A01;
        } else {
            r2 = null;
        }
        if (r2 != null) {
            r4 = new IDxFlowShape94S0200000_2_I2((AnonymousClass0YP) new KtSLambdaShape15S0100000_I2_4(this, (C146958n9) null, 24), r2, 29);
        } else {
            r4 = AnonymousClass4V0.A00;
        }
        if (!C63803iN.A0E(AnonymousClass0TJ.A06, this.A08.A00, 36310877586653465L)) {
            return r4;
        }
        return new IDxFlowShape250S0100000_1_I2(new IDxFlowShape250S0100000_1_I2(C25807DsL.A01(new KtSLambdaShape3S0110000_I2(4, (C146958n9) null), r4, this.A07), 20), 21);
    }

    public final void A02(C83654rl r2) {
        C04220Ms.A0B(r2, 0);
        C61633Uq r0 = (C61633Uq) this.A01.A02.get(r2);
        if (r0 != null) {
            r0.A01();
        }
        C83664rm r02 = (C83664rm) this.A05.get(r2);
        if (r02 != null) {
            r02.AD2(r2);
        }
    }

    public final void A01() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0601000_I2((Object) this, (C146958n9) null, 16), this.A06, 3);
    }

    public AnonymousClass3II(AnonymousClass3YB r2, AnonymousClass38U r3, BadgingApiImpl badgingApiImpl, AnonymousClass35J r5, UserSession userSession, Map map, C83224qz r8) {
        AnonymousClass0wJ.A1O(r2, badgingApiImpl);
        C04220Ms.A0B(r8, 5);
        C04220Ms.A0B(r5, 7);
        this.A01 = r2;
        this.A03 = badgingApiImpl;
        this.A05 = map;
        this.A02 = r3;
        this.A06 = r8;
        this.A04 = userSession;
        this.A08 = r5;
    }
}

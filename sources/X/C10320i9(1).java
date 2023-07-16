package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.redex.IDxObjectShape235S0100000_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0i9  reason: invalid class name and case insensitive filesystem */
public final class C10320i9 implements AnonymousClass0i1 {
    public boolean A00 = false;
    public final AnonymousClass0gW A01;
    public final C08780eH A02;
    public final C08750eE A03;
    public final Map A04 = new HashMap();
    public final C08760eF A05;

    public final synchronized C08890eT A03(String str) {
        A02(this);
        return (C08890eT) this.A04.get(str);
    }

    public final synchronized Set A04() {
        A02(this);
        return new HashSet(this.A04.values());
    }

    public final synchronized void A05(C08890eT r3) {
        A02(this);
        this.A04.put(r3.A03, r3);
        this.A03.Ce3();
    }

    public static C10320i9 A00(UserSession userSession) {
        return (C10320i9) userSession.A01(C10320i9.class, new IDxObjectShape235S0100000_I2(userSession, 1));
    }

    public static /* synthetic */ C10320i9 A01(UserSession userSession) {
        C08750eE r5;
        C08780eH r2;
        C63643hy.A07("Expects to be created on main thread");
        Handler handler = new Handler();
        String A002 = C08920eW.A00(userSession);
        if (!A002.equals("delayed")) {
            if (!A002.equals("on_pause")) {
                C10450iM.A03("WriteStrategyFactory", AnonymousClass00U.A0L("Unknown write strategy configuration: ", C08920eW.A00(userSession)));
            }
            r5 = new C10560iY();
        } else {
            r5 = new C10790iw(handler);
        }
        Context context = C10600ic.A00;
        AnonymousClass0gW A003 = AnonymousClass0gN.A00();
        String A004 = C08940eY.A00(userSession);
        if (!A004.equals("json")) {
            if (!A004.equals("preferences")) {
                C10450iM.A03("StoreAdapterFactory", AnonymousClass00U.A0L("Unknown store adapter configuration: ", C08940eY.A00(userSession)));
            }
            r2 = new C10540iW(context, userSession);
        } else {
            r2 = new C10630if(context, A003, userSession);
        }
        C10320i9 r1 = new C10320i9(AnonymousClass0gN.A00(), r2, r5);
        userSession.A04(C10320i9.class, r1);
        return r1;
    }

    public static void A02(C10320i9 r4) {
        if (!r4.A00) {
            for (C08890eT r2 : r4.A02.CZ2()) {
                r4.A04.put(r2.A03, r2);
            }
            r4.A00 = true;
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        C08750eE r1 = this.A03;
        r1.ANQ();
        r1.CqN((C08760eF) null);
    }

    public C10320i9(AnonymousClass0gW r2, C08780eH r3, C08750eE r4) {
        C10330iA r0 = new C10330iA(this);
        this.A05 = r0;
        r4.CqN(r0);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}

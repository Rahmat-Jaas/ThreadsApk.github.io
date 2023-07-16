package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.nux.cal.model.DpActionContent;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.44V  reason: invalid class name */
public abstract class AnonymousClass44V implements C11630kW {
    public static final String __redex_internal_original_name = "DynamicFlowControllerBusinessLogic";
    public AnonymousClass3IX A00;
    public C58723Gw A01;
    public Object A02;
    public Set A03 = C18200wM.A0u();
    public final Map A04 = C18220wO.A0y();

    public final void A06() {
        String str;
        boolean z;
        Boolean AQJ;
        C27551sh r1 = (C27551sh) this;
        C67073yp r2 = (C67073yp) r1.A02;
        synchronized (C27551sh.class) {
            HashMap hashMap = C27551sh.A02;
            UserSession userSession = r2.A00;
            if (userSession != null) {
                str = userSession.getUserId();
            } else {
                str = null;
            }
            hashMap.remove(str);
            UserSession userSession2 = r2.A00;
            if (userSession2 != null) {
                userSession2.A03(DpActionContent.class);
            }
        }
        Context context = r1.A00;
        C10300i6 r4 = r1.A01;
        UserSession userSession3 = r2.A00;
        if (userSession3 == null || ((AQJ = AnonymousClass0wJ.A0Y(userSession3).A05.AQJ()) != null && AQJ.booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        boolean A002 = r2.A00();
        boolean A1W = AnonymousClass0wJ.A1W(C63443hU.A00());
        boolean A1W2 = AnonymousClass0wJ.A1W(r2.A00);
        C31155GhB.A03(C60013Nh.A00(context, r4, r2.A01, AnonymousClass006.A0C, r2.A02, C18200wM.A0s(r1.A04.values()), z, A002, A1W, A1W2));
    }

    private void A04() {
        String str;
        AnonymousClass3IX A002 = this.A01.A00();
        this.A00 = A002;
        if (A002 == null) {
            Set<C82834qL> set = this.A03;
            this.A03 = C18200wM.A0u();
            for (C82834qL onFinished : set) {
                onFinished.onFinished();
            }
            A06();
        } else if (this.A04.containsKey(A002)) {
            A04();
        } else if (!this.A00.A00()) {
            Ben(-1);
        } else {
            AnonymousClass3IX r2 = this.A00;
            C27551sh r1 = (C27551sh) this;
            if (r2 != null) {
                C313625r r0 = ((C67073yp) r1.A02).A01;
                C10300i6 r9 = r1.A01;
                if (r0 != null) {
                    str = r0.A00;
                } else {
                    str = "";
                }
                String name = ((AnonymousClass2AQ) r2.A00).name();
                C04220Ms.A0B(r9, 0);
                AnonymousClass0wJ.A1O(str, name);
                double A003 = C18200wM.A00();
                double A004 = AnonymousClass269.A00();
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r9), "ig_dynamic_onboarding_step"), 1171);
                AnonymousClass0wJ.A1B(A0I, A003, A004);
                C18210wN.A19(A0I, str);
                A0I.A0T("onboarding_step", name);
                C63683i7.A04(A0I);
                A0I.A0Q("skipped", false);
                AnonymousClass269.A06(A0I, A004);
                C18180wK.A19(A0I);
                C63683i7.A0A(A0I, r9);
            }
        }
    }

    public static void A05(AnonymousClass44V r3, C58723Gw r4) {
        r3.A01 = r4;
        C27551sh r32 = (C27551sh) r3;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r32, r32.A01), "ig_nux_flow_updated"), 1388);
        A0I.A0T("seen_steps", C60013Nh.A01(C18200wM.A0s(r32.A04.values())));
        A0I.A0T("new_flow", r4.A01());
        A0I.A0T("old_flow", r32.A01.A01());
        A0I.Bb4();
    }

    public void Ben(int i) {
        AnonymousClass3IX r3 = this.A00;
        if (r3 != null) {
            C81604o4 r2 = r3.A00;
            C67073yp r1 = (C67073yp) this.A02;
            if (((AnonymousClass2AQ) r2) instanceof C27561si) {
                r1.A03 = C18230wP.A1V(i);
            }
            this.A04.put(r3, new AnonymousClass3V7(r2, i));
        }
        A04();
    }

    public AnonymousClass44V(C58723Gw r2, Object obj) {
        this.A01 = r2;
        this.A00 = r2.A00();
        this.A02 = obj;
    }

    public final void A07(C58723Gw r2) {
        if (!C63643hy.A08()) {
            C63643hy.A04(new AnonymousClass4Rn(this, r2));
        } else {
            A05(this, r2);
        }
    }
}

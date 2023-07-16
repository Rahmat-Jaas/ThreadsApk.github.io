package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2;
import com.instagram.graphql.instagramschema.IGFxIdentityManagementMutationResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3iA  reason: invalid class name and case insensitive filesystem */
public final class C63713iA {
    public static AnonymousClass5z0 A00;
    public static boolean A01;

    public static void A09(UserSession userSession, boolean z) {
        IDxACallbackShape44S0000000_1_I2 iDxACallbackShape44S0000000_1_I2 = new IDxACallbackShape44S0000000_1_I2(3);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317457478717109L)) {
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            A002.A03("set_reminder_shown", Boolean.valueOf(z));
            AnonymousClass3WK.A02(new PandoGraphQLRequest(C63233h2.A00(), "IGFxIdentityManagementMutation", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), IGFxIdentityManagementMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fxim_update_reminders_state"), iDxACallbackShape44S0000000_1_I2, userSession);
            return;
        }
        C67463zb A004 = C67463zb.A00();
        A004.A03("set_reminder_shown", Boolean.valueOf(z));
        C32165H8c A0R = C18180wK.A0R(C67473zc.A00(A004, AnonymousClass150.class, "IGFxIdentityManagementMutation"), userSession);
        A0R.A00 = iDxACallbackShape44S0000000_1_I2;
        C31155GhB.A03(A0R);
    }

    public static ImmutableList A00() {
        Object obj;
        AnonymousClass5z0 r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((C85634vW) obj).AkP() != null && A02().AnY() != null && A02().AnY().B7y() != null) {
            return A02().AnY().B7y();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }

    public static C85724vf A01() {
        Object obj;
        AnonymousClass5z0 r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((C85634vW) obj).AkP() != null && A02().B92() != null) {
            return A02().B92();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }

    public static C85694vc A02() {
        return ((C85634vW) A00.A01).AkP();
    }

    public static C85524vK A03() {
        Object obj;
        AnonymousClass5z0 r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((C85634vW) obj).AkW() != null && ((C85634vW) A00.A01).AkW().B1N() != null) {
            return ((C85634vW) A00.A01).AkW().B1N();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }

    public static C85534vL A04() {
        Object obj;
        AnonymousClass5z0 r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((C85634vW) obj).AkW() != null && ((C85634vW) A00.A01).AkW().B1U() != null) {
            return ((C85634vW) A00.A01).AkW().B1U();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }

    public static C85544vM A05() {
        Object obj;
        AnonymousClass5z0 r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((C85634vW) obj).AkW() != null && ((C85634vW) A00.A01).AkW().B1V() != null) {
            return ((C85634vW) A00.A01).AkW().B1V();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (A02().AVp() == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A() {
        /*
            X.5z0 r0 = A00
            r2 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x004c
            X.4vW r0 = (X.C85634vW) r0
            X.4vc r0 = r0.AkP()
            if (r0 == 0) goto L_0x004c
            X.4vc r0 = A02()
            X.4vJ r0 = r0.B4J()
            if (r0 == 0) goto L_0x004c
            X.5z0 r0 = A00
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0036
            X.4vW r0 = (X.C85634vW) r0
            X.4vc r0 = r0.AkP()
            if (r0 == 0) goto L_0x0036
            X.4vc r0 = A02()
            boolean r1 = r0.AVp()
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 == 0) goto L_0x004c
            X.4vc r0 = A02()
            X.4vJ r0 = r0.B4J()
            boolean r0 = r0.AqA()
            if (r0 == 0) goto L_0x004c
            r2 = 1
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63713iA.A0A():boolean");
    }

    public static boolean A0B() {
        Object obj;
        AnonymousClass5z0 r0 = A00;
        if (r0 == null || (obj = r0.A01) == null || ((C85634vW) obj).AkP() == null || !A02().AVq()) {
            return false;
        }
        return true;
    }

    public static Boolean A06() {
        ImmutableList A002 = A00();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C1366783w it = A002.iterator();
        while (it.hasNext()) {
            A0v.addAll(((C85504vI) it.next()).AOa());
        }
        if (!A0v.isEmpty()) {
            return C18240wQ.A0X(((C85494vH) A0v.get(0)).Aq8());
        }
        return false;
    }

    public static String A07() {
        C85544vM A05 = A05();
        if (A05.BH1() != null && !C121687Hl.A03(A05.BH1().BFt())) {
            return A05.BH1().BFt();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }

    public static String A08() {
        C85544vM A05 = A05();
        if (A05.ATm() != null && !C121687Hl.A03(A05.ATm().BFt())) {
            return A05.ATm().BFt();
        }
        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
    }
}

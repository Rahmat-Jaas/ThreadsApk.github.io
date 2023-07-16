package com.instagram.common.task;

import X.AnonymousClass0wJ;
import X.AnonymousClass1RD;
import X.AnonymousClass269;
import X.AnonymousClass3Q8;
import X.AnonymousClass3TI;
import X.C10300i6;
import X.C10450iM;
import X.C11630kW;
import X.C13330nS;
import X.C13950oZ;
import X.C16370sw;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C25828Dsm;
import X.C31155GhB;
import X.C59243Kb;
import X.C678140q;
import X.FR1;
import X.H1T;
import android.app.Dialog;
import android.content.Context;
import com.facebook.redex.IDxKListenerShape735S0100000_1_I2;
import com.instagram.service.session.UserSession;

public class IDxLTaskShape28S0300000_1_I2 extends FR1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLTaskShape28S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public final void A02(Exception exc) {
        if (1 - this.A03 != 0) {
            super.A02(exc);
        } else {
            C10450iM.A07("Could not determine TOS display status", exc);
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        if (this.A03 == 0) {
            String str = (String) obj;
            if (str != null) {
                Context context = ((AnonymousClass3TI) this.A00).A00;
                UserSession userSession = (UserSession) this.A02;
                H1T A0N = AnonymousClass0wJ.A0N(userSession);
                A0N.A0J("accounts/try_verify_challenge_response_and_log_result/");
                AnonymousClass269.A0A(A0N, "auth_response", str);
                C18180wK.A0t(context, A0N, AnonymousClass3Q8.A00(0, 9, 104), C18220wO.A0g(context, A0N, "user_id", userSession.getUserId()));
                C18240wQ.A1A(A0N, AnonymousClass1RD.class, C59243Kb.class);
                C31155GhB.A03(C18190wL.A0Q(A0N));
            }
        } else if (AnonymousClass0wJ.A1X(obj)) {
            Context context2 = (Context) this.A00;
            C10300i6 r6 = (C10300i6) this.A01;
            C11630kW r5 = (C11630kW) this.A02;
            String string = context2.getString(2131831627, new Object[]{AnonymousClass0wJ.A0l(context2, context2.getString(2131829285), 2131831626), AnonymousClass0wJ.A0l(context2, context2.getString(2131832774), 2131831625), AnonymousClass0wJ.A0l(context2, context2.getString(2131831629), 2131831624)});
            C25828Dsm A0W = C18190wL.A0W(context2);
            A0W.A0L(2131836896);
            A0W.A0p(C16370sw.A02(new C678140q(string), new String[0]));
            A0W.A0q(false);
            A0W.A0P(C18250wR.A0E(context2, r6, r5, 35), 2131831628);
            Dialog A0G = A0W.A0G();
            A0G.setOnKeyListener(new IDxKListenerShape735S0100000_1_I2(context2, 0));
            C13950oZ.A00(A0G);
            C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, r6), "tos_dialog_displayed"), 2768).Bb4();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.A02 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r5 = this;
            int r0 = r5.A03
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = (android.content.Context) r0
            X.3FG r1 = X.AnonymousClass2CP.A00(r0)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0015
            boolean r1 = r1.A02
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x001a:
            return r4
        L_0x001b:
            r4 = 0
            java.lang.Object r0 = r5.A00     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            X.3TI r0 = (X.AnonymousClass3TI) r0     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            X.3HT r3 = r0.A02     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            java.lang.Object r2 = r5.A01     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            X.32O r2 = (X.AnonymousClass32O) r2     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            android.os.Bundle r0 = r2.A00     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            X.32P r1 = new X.32P     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            r1.<init>(r0)     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            android.os.Bundle r0 = X.C18180wK.A06()     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            r2.A00 = r0     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            X.32Q r0 = r3.A00(r1)     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            if (r0 == 0) goto L_0x001a
            X.Lzj r3 = X.AnonymousClass3TI.A07     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            android.os.Bundle r2 = r0.A00     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            java.lang.String r1 = "response"
            boolean r0 = r2.containsKey(r1)     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            if (r0 == 0) goto L_0x004e
            byte[] r0 = r2.getByteArray(r1)     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            java.lang.String r4 = r3.A02(r0)     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            return r4
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            r0.<init>()     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
            throw r0     // Catch:{ 2AX | RemoteException | IllegalStateException | SecurityException -> 0x0054 }
        L_0x0054:
            r2 = move-exception
            java.lang.String r1 = "ConfidenceFrameworkHelper"
            java.lang.String r0 = "confidence_framework_challenge_response_failed"
            X.C10450iM.A06(r1, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.task.IDxLTaskShape28S0300000_1_I2.call():java.lang.Object");
    }

    public final int getRunnableId() {
        if (this.A03 != 0) {
            return 439;
        }
        return 178336291;
    }
}

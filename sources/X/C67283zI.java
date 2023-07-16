package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;

/* renamed from: X.3zI  reason: invalid class name and case insensitive filesystem */
public final class C67283zI implements CallerContextable {
    public static final String __redex_internal_original_name = "CreateAccountUtil";

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r14.A0k != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.os.Handler r18, X.C34640IcN r19, X.C11630kW r20, X.C82804qI r21, X.C82824qK r22, com.instagram.registration.model.RegFlowExtras r23, X.C07530bf r24, java.lang.Integer r25, boolean r26) {
        /*
            r0 = 1
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r0)
            r14 = r23
            X.25r r17 = r14.A01()
            r17.getClass()
            X.01V r10 = X.AnonymousClass01V.A0p
            boolean r0 = r14.A0j
            if (r0 == 0) goto L_0x001b
            boolean r0 = r14.A0k
            r23 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001b:
            r23 = 0
        L_0x001d:
            java.lang.String r2 = r14.A04
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r0 = 0
            r14.writeToParcel(r1, r0)
            r1.setDataPosition(r0)
            android.os.Parcelable$Creator r0 = com.instagram.registration.model.RegFlowExtras.CREATOR
            java.lang.Object r13 = r0.createFromParcel(r1)
            com.instagram.registration.model.RegFlowExtras r13 = (com.instagram.registration.model.RegFlowExtras) r13
            r1.recycle()
            X.1uH r5 = new X.1uH
            r6 = r18
            r7 = r19
            r9 = r20
            r11 = r21
            r12 = r22
            r15 = r24
            r4 = r25
            r24 = r26
            r8 = r7
            r16 = r15
            r18 = r17
            r19 = r4
            r20 = r4
            r21 = r2
            r22 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.4Jp r0 = new X.4Jp
            r0.<init>(r3)
            r5.A01 = r0
            X.4Jr r0 = new X.4Jr
            r11 = r0
            r12 = r7
            r13 = r5
            r16 = r17
            r17 = r4
            r18 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.A02 = r0
            r1 = 4197923(0x400e23, float:5.882543E-39)
            java.lang.String r0 = "start_account_creation_request"
            r10.markerPoint(r1, r0)
            A05(r7, r5, r14, r15, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67283zI.A03(android.os.Handler, X.IcN, X.0kW, X.4qI, X.4qK, com.instagram.registration.model.RegFlowExtras, X.0bf, java.lang.Integer, boolean):void");
    }

    public static void A05(C34640IcN icN, C28451uI r11, RegFlowExtras regFlowExtras, C07530bf r13, Integer num) {
        RegFlowExtras regFlowExtras2 = regFlowExtras;
        C34640IcN icN2 = icN;
        C28451uI r5 = r11;
        C07530bf r7 = r13;
        if (A06(regFlowExtras)) {
            C48942qa.A00(icN, r11, regFlowExtras, r13);
            return;
        }
        String str = regFlowExtras.A0J;
        Integer num2 = num;
        if (C313625r.SAC == regFlowExtras.A01() && str != null) {
            AnonymousClass4KT r3 = new AnonymousClass4KT(icN2, r5, regFlowExtras2, r7, num2, str);
            if (!AnonymousClass0RA.A0C.A09(new AnonymousClass4KH(), (C04850Pk) null, r3, str)) {
                C10450iM.A03(__redex_internal_original_name, AnonymousClass00U.A0L("Failed to add create secondary account operation in non linking SAC. The last logged in account id is: ", str));
            }
        } else if (C63803iN.A0E(AnonymousClass0TJ.A05, r13, 36312251975730054L)) {
            AnonymousClass0gN.A00().AKp(new C25231mk(icN2, r5, regFlowExtras2, r7, num2));
        } else {
            C32165H8c A00 = AnonymousClass2TR.A00(icN.requireContext(), regFlowExtras, r7, num, (String) null, (String) null);
            A00.A00 = r5;
            icN2.schedule(A00);
        }
    }

    public static Integer A00() {
        for (Integer num : C18240wQ.A1Z()) {
            if (C04220Ms.A0I(AnonymousClass2TS.A00(num), NetInfoModule.CONNECTION_TYPE_NONE)) {
                return num;
            }
        }
        throw C18190wL.A0a(AnonymousClass00U.A0V("'", NetInfoModule.CONNECTION_TYPE_NONE, "' is not a valid retry strategy name."));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A0J == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(com.instagram.registration.model.RegFlowExtras r4) {
        /*
            boolean r0 = r4.A0t
            r3 = 1
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r4.A0J
            r2 = 1
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            X.25r r1 = X.C313625r.SAC
            X.25r r0 = r4.A01()
            if (r1 != r0) goto L_0x0016
            if (r2 == 0) goto L_0x0016
            return r3
        L_0x0016:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67283zI.A06(com.instagram.registration.model.RegFlowExtras):boolean");
    }

    public static Integer A01(RegFlowExtras regFlowExtras) {
        C313625r A01 = regFlowExtras.A01();
        C313625r r2 = C313625r.SAC;
        if (A01 == r2 && regFlowExtras.A0s && regFlowExtras.A0x) {
            return AnonymousClass006.A0j;
        }
        if (A01 == r2 && A06(regFlowExtras)) {
            return AnonymousClass006.A0N;
        }
        if (A01 == C313625r.PHONE || (A01 == r2 && regFlowExtras.A02() == AnonymousClass006.A01)) {
            return AnonymousClass006.A01;
        }
        if (A01 == C313625r.EMAIL || (A01 == r2 && regFlowExtras.A02() == AnonymousClass006.A00)) {
            return AnonymousClass006.A00;
        }
        if (A01 == r2) {
            return AnonymousClass006.A0C;
        }
        return AnonymousClass006.A0u;
    }

    public static void A04(FragmentActivity fragmentActivity, C11630kW r12, C313625r r13, Integer num, Integer num2, String str) {
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, str);
        A06.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession A0V = C18180wK.A0V(A06);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (fragmentActivity instanceof C81594o3) {
            ((SignedOutFragmentActivity) ((C81594o3) fragmentActivity2)).A0A = true;
        }
        AnonymousClass7GV.A01();
        AnonymousClass3RH.A00 = null;
        AnonymousClass3Y3.A01(fragmentActivity);
        double A00 = C18200wM.A00();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(A0V), "ig_nux_started"), 1389);
        C18180wK.A19(A0I);
        AnonymousClass0wJ.A1B(A0I, A00, A002);
        C313625r r10 = r13;
        A0I.A0Q("from_server", C18190wL.A0Z(A0I, "flow", r13.A00, true));
        C63683i7.A05(A0I);
        AnonymousClass269.A06(A0I, A002);
        C63683i7.A09(A0I, A0V);
        A0I.Bb4();
        C31155GhB.A03(C36452Rj.A00(fragmentActivity, A0V, AnonymousClass0wJ.A1W(C63443hU.A00())));
        C63463hW.A02().A08(fragmentActivity2, new AnonymousClass4F7(fragmentActivity, r12, A0V, r10), A0V, r10, num, num2, false);
        AnonymousClass01V.A0p.markerEnd(4197923, 2);
    }

    public static void A02(Handler handler, C34640IcN icN, C11630kW r19, C82804qI r20, C82824qK r21, RegFlowExtras regFlowExtras, C24721jv r23, C07530bf r24, AnonymousClass265 r25, String str, String str2, boolean z) {
        String A00;
        RegFlowExtras regFlowExtras2 = regFlowExtras;
        C313625r A01 = regFlowExtras2.A01();
        double A002 = AnonymousClass269.A00();
        double A003 = C18200wM.A00();
        C07530bf r8 = r24;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "register_with_ci_option"), 2624);
        AnonymousClass0wJ.A1B(A0I, A003, A002);
        A0I.A0Q("is_opted_in", Boolean.valueOf(regFlowExtras2.A0h));
        C18180wK.A1A(A0I, A002);
        AnonymousClass269.A08(A0I, r25.A01);
        boolean z2 = true;
        String str3 = str2;
        A0I.A0Q("username_suggestion_avail", Boolean.valueOf(AnonymousClass0wJ.A1W(str3)));
        String str4 = str;
        if (str2 == null || str3.equals(str4)) {
            z2 = false;
        }
        A0I.A0Q("username_suggestion_changed_by_user", Boolean.valueOf(z2));
        if (A01 != null) {
            C18210wN.A19(A0I, A01.A00);
        }
        C63683i7.A08(A0I);
        A0I.Bb4();
        Handler handler2 = handler;
        C34640IcN icN2 = icN;
        C11630kW r22 = r19;
        C82824qK r242 = r21;
        if (A01 != C313625r.A03) {
            AnonymousClass01V.A0p.markerPoint(4197923, "queue_signup_runnable");
            handler2.post(new AnonymousClass4TF(handler2, icN2, r22, r20, r242, regFlowExtras2, r8, str4, z));
            return;
        }
        Context requireContext = icN2.requireContext();
        if (regFlowExtras2.A09 == null || !C63173fJ.A05(AnonymousClass0TJ.A05, 2324140656521380674L)) {
            A00 = C62433Zv.A00(CallerContext.A00(C67283zI.class), r8, "ig_android_growth_FX_access_fbig_create_cp_claiming");
        } else {
            A00 = regFlowExtras2.A09;
        }
        C32165H8c A0A = C63883iV.A0A(r8, (Boolean) null, str4, A00, regFlowExtras2.A07, regFlowExtras2.A06, C09140ev.A00(requireContext), C18230wP.A0i(requireContext), (String) null, false, false, regFlowExtras2.A0h, regFlowExtras2.A0q, regFlowExtras2.A0l);
        A0A.A00 = new C24341hw(icN2.requireContext(), handler2, icN2, r22, r242, regFlowExtras2, r23, r8);
        icN2.schedule(A0A);
    }
}

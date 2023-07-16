package com.instagram.nux.activity;

import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RJ;
import X.AnonymousClass0TJ;
import X.AnonymousClass0gN;
import X.AnonymousClass0wJ;
import X.AnonymousClass1e1;
import X.AnonymousClass1m7;
import X.AnonymousClass1mI;
import X.AnonymousClass3HX;
import X.AnonymousClass3QU;
import X.AnonymousClass3Y4;
import X.AnonymousClass3Y9;
import X.AnonymousClass4OA;
import X.AnonymousClass4PS;
import X.AnonymousClass4QX;
import X.AnonymousClass4S7;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C05050Qq;
import X.C07530bf;
import X.C09120et;
import X.C09140ev;
import X.C10300i6;
import X.C10600ic;
import X.C109326jp;
import X.C11630kW;
import X.C127397h3;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18760xq;
import X.C25786Drz;
import X.C57653Bx;
import X.C57893Cw;
import X.C58903Hy;
import X.C62623aQ;
import X.C62833aq;
import X.C62983bG;
import X.C63173fJ;
import X.C66713y6;
import X.C66753yA;
import X.C66883yU;
import X.C81804oQ;
import X.E2V;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.redex.IDxCRunnableShape615S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BloksSignedOutFragmentActivity extends BaseFragmentActivity implements C11630kW, AnonymousClass0RJ {
    public C57653Bx A00;
    public AnonymousClass3Y9 A01;
    public AnonymousClass3Y4 A02;
    public C07530bf A03;
    public C57893Cw A04;
    public String A05;
    public boolean A06;
    public final Handler A07 = AnonymousClass0wJ.A0F();
    public final Runnable A08 = new AnonymousClass4PS(this);
    public final AtomicBoolean A09 = C18230wP.A0w();

    public static IgBloksScreenConfig A00(BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity, Boolean bool, String str) {
        Integer num = C66883yU.A0F;
        Integer num2 = AnonymousClass006.A00;
        Integer num3 = AnonymousClass006.A0N;
        BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity2 = bloksSignedOutFragmentActivity;
        C66883yU r3 = new C66883yU((C81804oQ) null, new CdsOpenScreenCallerDismissCallback(new IDxCRunnableShape615S0100000_1_I2((Object) bloksSignedOutFragmentActivity2, 3)), (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num3, num, num2, (Integer) null, (Integer) null, false, false, false);
        IgBloksScreenConfig A0N = C18190wL.A0N(bloksSignedOutFragmentActivity2.A03);
        A0N.A0P = str;
        A0N.A01 = r3;
        A0N.A0j = bool.booleanValue();
        return A0N;
    }

    private void A02(Context context, FrameLayout frameLayout) {
        int i;
        this.A06 = true;
        Context context2 = context;
        C04220Ms.A0B(context, 1);
        Integer BGG = AnonymousClass3QU.A00.BGG();
        C58903Hy A042 = C62833aq.A04(BGG, AnonymousClass006.A03);
        if (AnonymousClass3QU.A00.BSj(context)) {
            i = A042.A00;
        } else {
            i = A042.A01;
        }
        frameLayout.addView(new C18760xq(context2, (AnonymousClass3HX) null, AnonymousClass006.A00, BGG, i, 0));
    }

    public final String getModuleName() {
        return "bloks_signed_out";
    }

    public static void A04(BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity) {
        FrameLayout frameLayout;
        C57653Bx r2 = bloksSignedOutFragmentActivity.A00;
        if (r2 != null) {
            r2.A03.post(new AnonymousClass4OA(r2));
        }
        if (bloksSignedOutFragmentActivity.A04 != null && (frameLayout = (FrameLayout) bloksSignedOutFragmentActivity.findViewById(R.id.layout_container_main)) != null) {
            if (!bloksSignedOutFragmentActivity.A06) {
                bloksSignedOutFragmentActivity.A02(C10600ic.A00, frameLayout);
            }
            C57893Cw r3 = bloksSignedOutFragmentActivity.A04;
            r3.A02.post(new AnonymousClass4S7(frameLayout, r3, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r7.equals("fb") != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(android.os.Bundle r16) {
        /*
            r15 = this;
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18311696146048424(0x410e64000525a8, double:1.8975667258595806E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            r8 = r15
            if (r0 == 0) goto L_0x003a
            X.31N r10 = X.AnonymousClass31N.A00
            if (r10 != 0) goto L_0x0017
            X.C18250wR.A0k()
            r0 = 0
            throw r0
        L_0x0017:
            X.0bf r9 = r15.A03
            r12 = 0
            X.1ui r10 = (X.C28621ui) r10
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            X.360 r11 = new X.360
            r11.<init>(r10)
            X.E5N r2 = r10.A01
            r0 = 1318303345(0x4e93b671, float:1.23910362E9)
            r1 = 3
            X.4qz r0 = X.C84874u0.A00(r2, r0, r1)
            r14 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.C25237DiI.A00(r12, r12, r7, r0, r1)
        L_0x003a:
            android.content.Context r6 = X.C10600ic.A00
            X.0gW r5 = X.AnonymousClass0gN.A00()
            X.0bf r1 = r15.A03
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r15, r1)
            java.lang.String r7 = r0.A02()
            java.lang.String r0 = "fb_msgr"
            boolean r4 = r7.equals(r0)
            r3 = 0
            if (r4 != 0) goto L_0x005d
            java.lang.String r0 = "fb"
            boolean r1 = r7.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r4 != 0) goto L_0x006c
            java.lang.String r0 = "msgr"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x006d
        L_0x006c:
            r3 = 1
        L_0x006d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x018e
            X.1mY r0 = new X.1mY
            r0.<init>(r6, r15)
        L_0x007c:
            r5.AKp(r0)
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0187
            X.1ma r0 = new X.1ma
            r0.<init>(r6, r15)
        L_0x008a:
            r5.AKp(r0)
            android.os.Bundle r1 = X.C18190wL.A0C(r15)
            if (r1 != 0) goto L_0x0097
            android.os.Bundle r1 = X.C18180wK.A06()
        L_0x0097:
            java.lang.String r0 = "destination_id"
            java.lang.String r2 = ""
            java.lang.String r1 = r1.getString(r0, r2)
            java.lang.String r0 = "emaillogin"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x010b
            java.lang.String r0 = "smslogin"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x010b
            X.01V r1 = X.AnonymousClass01V.A0p
            r6 = 0
            java.lang.String r0 = r15.A05
            r3 = 896612552(0x357138c8, float:8.9862124E-7)
            r1.A0Z(r3, r6, r0)
            X.01V r2 = X.AnonymousClass01V.A0p
            X.3Y9 r0 = r15.A01
            java.lang.String r1 = X.AnonymousClass3Y9.A00(r0)
            java.lang.String r0 = "client_experiment_group"
            r2.markerAnnotate((int) r3, (java.lang.String) r0, (java.lang.String) r1)
            android.content.Context r0 = X.C10600ic.A00
            if (r0 == 0) goto L_0x0195
            X.3FG r1 = X.AnonymousClass2CP.A00(r0)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0195
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0195
            java.lang.String r5 = "com.bloks.www.caa.login.oxygen_preloads_terms_of_service"
            java.util.Map r4 = A01(r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = A00(r15, r0, r5)
            r0 = 13784(0x35d8, float:1.9315E-41)
            X.5zh r3 = new X.5zh
            r3.<init>(r0)
            java.lang.String r2 = "CAA_OXYGEN_PRELOADS_TERMS_OF_SERVICE_SCREEN"
            r1 = 45
            android.util.SparseArray r0 = r3.A04
            r0.put(r1, r2)
            java.util.HashMap r0 = X.C37067Jjv.A02(r4)
            X.3iE r1 = X.C63743iE.A02(r5, r0)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r1.A00 = r0
            r3.A0V()
            r1.A03 = r3
        L_0x0107:
            r1.A0E(r15, r6)
            return
        L_0x010b:
            android.os.Bundle r5 = X.C18190wL.A0C(r15)
            if (r5 != 0) goto L_0x0115
            android.os.Bundle r5 = X.C18180wK.A06()
        L_0x0115:
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "uid"
            java.lang.String r0 = r5.getString(r1, r2)
            r3.put(r1, r0)
            java.lang.String r1 = "token"
            java.lang.String r0 = r5.getString(r1, r2)
            r3.put(r1, r0)
            java.lang.String r1 = "source"
            java.lang.String r0 = r5.getString(r1, r2)
            r3.put(r1, r0)
            java.lang.String r1 = X.C09140ev.A00(r15)
            r4 = 0
            java.lang.String r0 = X.C62983bG.A02(r4)
            r3.put(r0, r1)
            java.lang.String r1 = X.C18230wP.A0i(r15)
            java.lang.String r0 = "guid"
            r3.put(r0, r1)
            X.0bf r0 = r15.A03
            java.lang.String r1 = X.C18190wL.A0l(r0)
            java.lang.String r0 = "family_device_id"
            r3.put(r0, r1)
            X.3Y9 r0 = r15.A01
            java.lang.String r1 = X.AnonymousClass3Y9.A00(r0)
            java.lang.String r0 = "offline_experiment_group"
            r3.put(r0, r1)
            java.lang.String r2 = "auto_send"
            java.lang.String r1 = "false"
            java.lang.String r0 = r5.getString(r2, r1)
            r3.put(r2, r0)
            java.lang.String r0 = "is_bypass_login"
            r3.put(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.String r1 = "com.bloks.www.caa.login.one_click_login_loading"
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = A00(r15, r0, r1)
            java.util.HashMap r0 = X.C37067Jjv.A02(r3)
            X.3iE r1 = X.C63743iE.A02(r1, r0)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r1.A00 = r0
            goto L_0x0107
        L_0x0187:
            X.1mb r0 = new X.1mb
            r0.<init>(r6, r15)
            goto L_0x008a
        L_0x018e:
            X.1mZ r0 = new X.1mZ
            r0.<init>(r6, r15)
            goto L_0x007c
        L_0x0195:
            A03(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.BloksSignedOutFragmentActivity.A0D(android.os.Bundle):void");
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final void onBackPressed() {
        E2V e2v = this.A01;
        e2v.getClass();
        if (!C18210wN.A0c(e2v.BHC()).equals("Native Integration Point") || getSupportFragmentManager().A0I() > 1) {
            super.onBackPressed();
            return;
        }
        Bundle A062 = C18180wK.A06();
        C05050Qq.A00(A062, this.A03);
        try {
            C25786Drz A0Q = C18180wK.A0Q(this, this.A03);
            A0Q.A0A(A062, (Fragment) C18230wP.A0g("com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment"));
            A0Q.A05();
        } catch (Exception e) {
            AnonymousClass0LU.A0E("BloksSignedOutFragmentActivity", "Can't find QuickExperimentCategoriesFragment", e);
        }
    }

    public static Map A01(BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        String A0h = C18230wP.A0h();
        C09120et.A02().A0F(A0h);
        A0y.put("logged_out_user", C18220wO.A0f(C09120et.A02().A07));
        A0y.put("show_internal_settings", false);
        A0y.put("family_device_id", C18190wL.A0l(bloksSignedOutFragmentActivity.A03));
        A0y.put(C62983bG.A02(0), C09140ev.A00(bloksSignedOutFragmentActivity));
        A0y.put("qe_device_id", C09140ev.A02.A04(bloksSignedOutFragmentActivity));
        A0y.put("offline_experiment_group", AnonymousClass3Y9.A00(bloksSignedOutFragmentActivity.A01));
        A0y.put("waterfall_id", A0h);
        A0y.put("qpl_join_id", bloksSignedOutFragmentActivity.A05);
        return A0y;
    }

    public static void A03(BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity) {
        FrameLayout frameLayout = (FrameLayout) bloksSignedOutFragmentActivity.findViewById(R.id.layout_container_main);
        if (!(bloksSignedOutFragmentActivity.A00 == null || frameLayout == null)) {
            if (!bloksSignedOutFragmentActivity.A06) {
                bloksSignedOutFragmentActivity.A02(bloksSignedOutFragmentActivity, frameLayout);
            }
            C57653Bx r2 = bloksSignedOutFragmentActivity.A00;
            r2.A03.post(new AnonymousClass4QX(frameLayout, r2));
        }
        AnonymousClass01V.A0p.markerPoint(896612552, "startClientDataFetch");
        C62623aQ.A04.A02(bloksSignedOutFragmentActivity, new AnonymousClass1e1(bloksSignedOutFragmentActivity), bloksSignedOutFragmentActivity.A03, (String) null);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1100969292);
        C07530bf A052 = AnonymousClass0RA.A0C.A05(this);
        this.A03 = A052;
        this.A02 = new AnonymousClass3Y4(this, A052);
        this.A01 = new AnonymousClass3Y9(this, this.A03);
        this.A05 = C18230wP.A0h();
        C66753yA r7 = new C66753yA(this);
        C66713y6 r6 = new C66713y6(this);
        this.A00 = new C57653Bx(getApplicationContext(), r7);
        this.A04 = new C57893Cw(getApplicationContext(), r6, r7, (AnonymousClass3HX) null, AnonymousClass3QU.A00.BGG());
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 2324146373123313641L)) {
            Context context = C10600ic.A00;
            C04220Ms.A0B(context, 0);
            AnonymousClass0gN.A00().AKp(new AnonymousClass1m7(context));
        }
        AnonymousClass0gN.A00().AKp(new AnonymousClass1mI(this));
        super.onCreate(bundle);
        C14030oh.A07(-1083771071, A002);
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(712332607);
        super.onDestroy();
        this.A07.removeCallbacks(this.A08);
        C14030oh.A07(-791344193, A002);
    }
}

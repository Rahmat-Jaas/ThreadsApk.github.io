package com.instagram.bloks.util;

import X.AnonymousClass01V;
import X.AnonymousClass0wJ;
import X.AnonymousClass1eT;
import X.AnonymousClass1x1;
import X.AnonymousClass3F8;
import X.AnonymousClass3RI;
import X.AnonymousClass3XX;
import X.C04220Ms;
import X.C10450iM;
import X.C11630kW;
import X.C18190wL;
import X.C18240wQ;
import X.C23301cw;
import X.C35682Ok;
import X.C58753Hb;
import X.C62123Xf;
import X.C62973bE;
import X.C63813iO;
import X.C697449w;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape2S0110000_1_I2;
import com.instagram.react.modules.base.IgReactQEModule;

public class IDxACallbackShape10S0300000_1_I2 extends AnonymousClass1eT {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape10S0300000_1_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(false);
        this.A03 = i;
        this.A02 = obj3;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void A01() {
        switch (this.A03) {
            case 10:
                AnonymousClass3RI.A00 = false;
                return;
            case 11:
                ((C23301cw) this.A02).A03 = false;
                return;
            default:
                return;
        }
    }

    public final void A02() {
        if (3 - this.A03 == 0) {
            C18190wL.A19((Fragment) this.A01);
        }
    }

    public final void A03(AnonymousClass3XX r5) {
        Throwable cause;
        switch (this.A03) {
            case 1:
                C04220Ms.A0B(r5, 0);
                AnonymousClass01V.A0p.markerEnd(39124996, 3);
                C63813iO.A03((Context) this.A00, (String) null, 2131826864, 0);
                return;
            case 4:
                C697449w r3 = (C697449w) this.A00;
                r3.A02 = false;
                Throwable th = r5.A01;
                if (AnonymousClass0wJ.A1W(th)) {
                    C10450iM.A06("CheckpointManagerImpl", "Failed to get bloks challenge", th);
                } else {
                    C10450iM.A03("CheckpointManagerImpl", "Failed to get bloks challenge");
                }
                C62123Xf r1 = (C62123Xf) this.A01;
                if (r1 != null) {
                    C697449w.A00((Context) this.A02, r3, r1);
                    return;
                }
                return;
            case 5:
                C04220Ms.A0B(r5, 0);
                Context A0C = C18240wQ.A0C(this.A00);
                if (A0C != null) {
                    C63813iO.A02(A0C, A0C.getString(2131831662), "network_error", 0);
                }
                Throwable th2 = r5.A01;
                if (th2 != null && (cause = th2.getCause()) != null) {
                    C10450iM.A07(((C11630kW) this.A01).getModuleName(), cause);
                    return;
                }
                return;
            case 6:
            case 7:
                C04220Ms.A0B(r5, 0);
                C62973bE.A01((Context) this.A00);
                return;
            case 8:
                ((IDxCListenerShape2S0110000_1_I2) this.A01).A01 = false;
                ((AnonymousClass3F8) ((C58753Hb) this.A02).A09.getValue()).A00.markerEnd(857808852, 3);
                return;
            case 9:
                ((AnonymousClass1x1) this.A02).A03 = false;
                C35682Ok.A00().A01((Window) this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C63813iO.A03((Context) this.A00, "branded_content_tools_error", 2131822639, 0);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014a, code lost:
        X.C33492Fx.A00((X.C130667qT) r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0189, code lost:
        X.C33492Fx.A00(X.C18220wO.A0T(r1, r0, r2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0190, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A03
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00be;
                case 3: goto L_0x00db;
                case 4: goto L_0x0006;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00ff;
                case 7: goto L_0x00ff;
                case 8: goto L_0x0117;
                case 9: goto L_0x0131;
                case 10: goto L_0x0047;
                case 11: goto L_0x006c;
                case 12: goto L_0x0150;
                case 13: goto L_0x0161;
                case 14: goto L_0x0172;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r7.A00
            X.49w r2 = (X.C697449w) r2
            r1 = 0
            r2.A02 = r1
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0005
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0005
            X.0i6 r5 = r2.A06
            boolean r0 = r5.hasEnded()
            if (r0 != 0) goto L_0x0005
            r0 = 1
            r2.A04 = r0
            r2.A05 = r1
            android.os.Bundle r4 = X.C18180wK.A06()
            X.49P r0 = X.AnonymousClass49P.A00(r5)
            int r1 = r0.A01(r8)
            java.lang.String r0 = "ChallengeFragment.bloksAction"
            r4.putInt(r0, r1)
            java.lang.Integer r3 = X.AnonymousClass006.A0j
            r0 = 805306368(0x30000000, float:4.656613E-10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r5.getToken()
            java.lang.Object r0 = r7.A02
            android.content.Context r0 = (android.content.Context) r0
            X.C34632Kh.A00(r0, r4, r3, r2, r1)
            return
        L_0x0047:
            X.3St r5 = X.C61733Vd.A00(r8)
            java.lang.Object r0 = r7.A01
            android.content.Context r4 = X.C18240wQ.A0C(r0)
            if (r4 == 0) goto L_0x0005
            java.lang.Object r3 = r7.A02
            X.7qT r3 = (X.C130667qT) r3
            java.lang.Object r2 = r7.A00
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.4To r1 = X.AnonymousClass4To.A00()
            X.6jp r0 = r5.A02
            if (r0 == 0) goto L_0x0068
            X.3iY r0 = X.C63893iY.A01
            X.C122047Jt.A02(r4, r5, r3, r0, r1)
        L_0x0068:
            r2.run()
            return
        L_0x006c:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A02
            X.1cw r0 = (X.C23301cw) r0
            com.instagram.service.session.UserSession r1 = r0.A00
            r4 = 0
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = "userSession"
        L_0x007b:
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x007f:
            java.lang.String r5 = r0.A01
            if (r5 != 0) goto L_0x0086
            java.lang.String r0 = "adId"
            goto L_0x007b
        L_0x0086:
            java.lang.String r6 = r0.A02
            if (r6 != 0) goto L_0x008d
            java.lang.String r0 = "trackingToken"
            goto L_0x007b
        L_0x008d:
            java.lang.String r2 = "visit_your_ad_topic_preferences"
            java.lang.String r3 = "tap"
            X.C19606Az7.A0Q(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object r3 = r7.A00
            X.DrH r3 = (X.C25745DrH) r3
            if (r3 == 0) goto L_0x0005
            java.lang.Object r2 = r7.A01
            r1 = 1
            com.instagram.ui.bottomsheet.intf.IDxCListenerShape60S0200000_1_I2 r0 = new com.instagram.ui.bottomsheet.intf.IDxCListenerShape60S0200000_1_I2
            r0.<init>(r1, r8, r2)
            r3.A0A(r0)
            r3.A0C()
            return
        L_0x00a9:
            X.3St r8 = (X.C61323St) r8
            java.lang.Object r0 = r7.A01
            X.4td r0 = (X.C84654td) r0
            r0.ACI()
            java.lang.Object r0 = r7.A02
            goto L_0x014a
        L_0x00b6:
            X.3St r8 = X.C61733Vd.A00(r8)
            java.lang.Object r0 = r7.A01
            goto L_0x014a
        L_0x00be:
            X.3St r4 = X.C61733Vd.A00(r8)
            java.lang.Object r3 = r7.A02
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.Object r2 = r7.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r7.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.43N r0 = new X.43N
            r0.<init>(r1)
            X.7qT r0 = X.C18220wO.A0T(r2, r0, r3)
            X.C33492Fx.A00(r0, r4)
            return
        L_0x00db:
            X.3St r3 = X.C61733Vd.A00(r8)
            java.lang.Object r2 = r7.A02
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Object r1 = r7.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.448 r0 = X.AnonymousClass448.A00
            goto L_0x0189
        L_0x00eb:
            X.3St r3 = X.C61733Vd.A00(r8)
            java.lang.Object r2 = r7.A02
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.FragmentActivity r1 = X.C18240wQ.A0I(r0)
            java.lang.Object r0 = r7.A01
            X.0kW r0 = (X.C11630kW) r0
            goto L_0x0189
        L_0x00ff:
            X.3St r2 = X.C61733Vd.A00(r8)
            X.3GW r1 = X.AnonymousClass3GW.A00
            java.lang.Object r0 = r7.A02
            X.0i6 r0 = (X.C10300i6) r0
            r1.A00(r0)
            java.lang.Object r1 = r7.A01
            X.7qT r1 = (X.C130667qT) r1
            r0 = 1
            r1.A00 = r0
            X.C33492Fx.A00(r1, r2)
            return
        L_0x0117:
            X.3St r1 = X.C61733Vd.A00(r8)
            java.lang.Object r0 = r7.A00
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r1)
            java.lang.Object r0 = r7.A01
            com.facebook.redex.IDxCListenerShape2S0110000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape2S0110000_1_I2) r0
            X.4QA r2 = new X.4QA
            r2.<init>(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.C63643hy.A06(r2, r0)
            return
        L_0x0131:
            X.3St r8 = (X.C61323St) r8
            r1 = 0
            X.C04220Ms.A0B(r8, r1)
            java.lang.Object r0 = r7.A02
            X.1x1 r0 = (X.AnonymousClass1x1) r0
            r0.A03 = r1
            X.3Gl r1 = X.C35682Ok.A00()
            java.lang.Object r0 = r7.A01
            android.view.Window r0 = (android.view.Window) r0
            r1.A01(r0)
            java.lang.Object r0 = r7.A00
        L_0x014a:
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r8)
            return
        L_0x0150:
            X.3St r3 = X.C61733Vd.A00(r8)
            java.lang.Object r2 = r7.A01
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Object r1 = r7.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A02
            com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity r0 = (com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity) r0
            goto L_0x0189
        L_0x0161:
            X.3St r3 = X.C61733Vd.A00(r8)
            java.lang.Object r2 = r7.A02
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A00
            X.0kW r0 = (X.C11630kW) r0
            goto L_0x0189
        L_0x0172:
            X.3St r3 = X.C61733Vd.A00(r8)
            java.lang.Object r2 = r7.A02
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C04220Ms.A0C(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A01
            X.IcN r0 = (X.C34640IcN) r0
        L_0x0189:
            X.7qT r0 = X.C18220wO.A0T(r1, r0, r2)
            X.C33492Fx.A00(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2.A04(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape10S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        super(false);
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }
}

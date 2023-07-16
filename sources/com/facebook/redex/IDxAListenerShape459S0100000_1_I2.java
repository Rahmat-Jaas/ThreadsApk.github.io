package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass1YU;
import X.AnonymousClass4AX;
import X.C18180wK;
import X.C567438j;
import X.C63813iO;
import X.C83964sH;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

public class IDxAListenerShape459S0100000_1_I2 implements C83964sH {
    public Object A00;
    public final int A01;

    public IDxAListenerShape459S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAuthorizeFail() {
        switch (this.A01) {
            case 1:
                ConnectFBPageFragment.A01((ConnectFBPageFragment) this.A00);
                C63813iO.A04(2131830180);
                return;
            case 9:
                C63813iO.A03(((C567438j) this.A00).A00.getContext(), "authorize_failed", 2131836068, 0);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass4AX.A05((AnonymousClass4AX) this.A00, AnonymousClass006.A00, false);
                return;
            case 13:
                DirectMessagesOptionsFragment.A0B((DirectMessagesOptionsFragment) this.A00);
                return;
            case 16:
                C18180wK.A13((AnonymousClass1YU) this.A00);
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.1aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.1dg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.1aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.1aw} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        X.C67363zQ.A07(r4, r3, X.AnonymousClass22w.A09, (java.lang.String) null, r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018c, code lost:
        r2.A00 = r0;
        X.C31155GhB.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0191, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e0, code lost:
        r3.A04(r1, r2, "FEED");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e5, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAuthorizeSuccess(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x00a0;
                case 2: goto L_0x000d;
                case 3: goto L_0x01bf;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ed;
                case 7: goto L_0x0102;
                case 8: goto L_0x003c;
                case 9: goto L_0x010c;
                case 10: goto L_0x0124;
                case 11: goto L_0x000c;
                case 12: goto L_0x0136;
                case 13: goto L_0x0152;
                case 14: goto L_0x0055;
                case 15: goto L_0x015a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.1YU r0 = (X.AnonymousClass1YU) r0
            X.C18180wK.A13(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r6.A00
            com.instagram.creation.fragment.FollowersShareFragment r4 = (com.instagram.creation.fragment.FollowersShareFragment) r4
            X.264 r0 = X.AnonymousClass264.A0b
            java.lang.String r0 = r0.A00()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x000c
            com.instagram.service.session.UserSession r3 = r4.A0T
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36325317266121774(0x810daf0000242e, double:3.035615137183013E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01bb
            com.instagram.service.session.UserSession r0 = r4.A0T
            X.49c r3 = X.C49222r2.A00(r0)
            java.lang.String r2 = "feed_composer"
            X.4s1 r1 = r4.A0V
            goto L_0x01e0
        L_0x003c:
            java.lang.Object r3 = r6.A00
            X.1cR r3 = (X.AnonymousClass1cR) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x000c
            X.4tQ r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            X.3D8 r0 = r3.A02
            r2.BlM(r1, r0)
            X.AnonymousClass1cR.A01(r3, r7)
            return
        L_0x0055:
            java.lang.Object r5 = r6.A00
            X.1x1 r5 = (X.AnonymousClass1x1) r5
            X.0Oa r4 = r5.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r4)
            boolean r0 = X.C67373zR.A07(r0)
            r3 = 1
            if (r0 == 0) goto L_0x008d
            X.AnonymousClass1x1.A0D(r5, r3)
        L_0x0069:
            X.2AI r1 = X.AnonymousClass2AI.A04
            r2 = 0
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r4)
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x000c
            X.3zG r1 = r5.A02
            if (r1 != 0) goto L_0x0087
            X.0Oa r0 = r5.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3zG r1 = new X.3zG
            r1.<init>(r0)
            r5.A02 = r1
        L_0x0087:
            java.lang.String r0 = "account_linking_setting"
            r1.A04(r2, r0, r3, r2)
            return
        L_0x008d:
            java.util.List r0 = X.AnonymousClass1x1.A0C(r5)
            r5.setItems(r0)
            goto L_0x0069
        L_0x0095:
            android.os.Handler r1 = X.AnonymousClass4Aj.A0E
            X.4OG r0 = new X.4OG
            r0.<init>(r6)
            r1.post(r0)
            return
        L_0x00a0:
            java.lang.Object r0 = r6.A00
            com.instagram.business.fragment.ConnectFBPageFragment r0 = (com.instagram.business.fragment.ConnectFBPageFragment) r0
            com.instagram.business.fragment.ConnectFBPageFragment.A00(r0)
            com.instagram.business.fragment.ConnectFBPageFragment.A02(r0)
            return
        L_0x00ab:
            java.lang.Object r5 = r6.A00
            X.1dj r5 = (X.C23391dj) r5
            r0 = 1
            X.C23391dj.A02(r5, r0)
            com.instagram.service.session.UserSession r1 = r5.A05
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            boolean r0 = X.C63073bQ.A03(r1)
            if (r0 == 0) goto L_0x00ca
            com.instagram.service.session.UserSession r0 = r5.A05
            X.49i r1 = X.C63073bQ.A00(r0)
            java.lang.String r0 = "advanced_setting_relink"
            r1.A0C(r0)
        L_0x00ca:
            r0 = 3
            com.facebook.redex.IDxCListenerShape663S0100000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape663S0100000_1_I2
            r4.<init>(r5, r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            com.instagram.service.session.UserSession r2 = r5.A05
            X.2AC r1 = X.AnonymousClass2AC.IG_FEED_COMPOSER_ADVANCED_SETTINGS_TOGGLE_ENABLE_POST_ACCOUNT_LINK
            android.content.Context r0 = r5.getContext()
            X.C60423Oz.A00(r3, r0, r1, r2, r4)
            return
        L_0x00e0:
            java.lang.Object r0 = r6.A00
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape201S0100000_1_I2) r0
            java.lang.Object r4 = r0.A00
            X.1dg r4 = (X.C23381dg) r4
            com.instagram.service.session.UserSession r3 = r4.A05
            X.1zH r0 = X.C29771zH.A04
            goto L_0x00f9
        L_0x00ed:
            java.lang.Object r0 = r6.A00
            com.facebook.redex.IDxCSpanShape14S0100000_1_I2 r0 = (com.facebook.redex.IDxCSpanShape14S0100000_1_I2) r0
            java.lang.Object r4 = r0.A00
            X.1aw r4 = (X.AnonymousClass1aw) r4
            com.instagram.service.session.UserSession r3 = r4.A05
            X.1zH r0 = X.C29771zH.A05
        L_0x00f9:
            java.util.List r2 = r0.A00
            X.22w r1 = X.AnonymousClass22w.UNKNOWN
            r0 = 0
            X.C67363zQ.A07(r4, r3, r1, r0, r2)
            return
        L_0x0102:
            java.lang.Object r1 = r6.A00
            X.4Kw r1 = (X.AnonymousClass4Kw) r1
            X.264 r0 = X.AnonymousClass264.A0M
            r1.Blp(r0)
            return
        L_0x010c:
            java.lang.Object r3 = r6.A00
            X.38j r3 = (X.C567438j) r3
            com.instagram.service.session.UserSession r2 = r3.A01
            r0 = 15
            kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2 r1 = new kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2
            r1.<init>(r3, r0)
            X.H8c r2 = X.C63503hc.A06(r2)
            r0 = 119(0x77, float:1.67E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r0 = X.C63873iU.A06(r1, r0)
            goto L_0x018c
        L_0x0124:
            java.lang.Object r0 = r6.A00
            X.4JC r0 = (X.AnonymousClass4JC) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            com.instagram.service.session.UserSession r0 = r0.A01
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            r1 = 0
            r0 = 1
            r2.A0D(r1, r0)
            return
        L_0x0136:
            java.lang.Object r5 = r6.A00
            X.4AX r5 = (X.AnonymousClass4AX) r5
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r0 = 1
            X.AnonymousClass4AX.A05(r5, r1, r0)
            androidx.fragment.app.FragmentActivity r4 = r5.A0D
            r0 = 4
            com.facebook.redex.IDxCListenerShape663S0100000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape663S0100000_1_I2
            r3.<init>(r6, r0)
            com.instagram.service.session.UserSession r2 = r5.A0E
            X.2AC r1 = X.AnonymousClass2AC.IG_STORY_SETTINGS_MAIN_CAMERA_SETTINGS_BUTTON_POST_ACCOUNT_LINK
            android.content.Context r0 = r5.A0B
            X.C60423Oz.A00(r4, r0, r1, r2, r3)
            return
        L_0x0152:
            java.lang.Object r0 = r6.A00
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = (com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment) r0
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment.A0B(r0)
            return
        L_0x015a:
            r4 = 0
            X.0TJ r3 = X.C18250wR.A0D(r7, r4)
            r0 = 18296277213118619(0x41005e0000009b, double:1.891472353814663E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            java.lang.String r2 = "calHelper"
            if (r0 == 0) goto L_0x0192
            java.lang.Object r3 = r6.A00
            X.1cQ r3 = (X.AnonymousClass1cQ) r3
            X.3Zp r0 = r3.A01
            if (r0 == 0) goto L_0x01b6
            r2 = 1
            X.0Oa r1 = r3.A06
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r1)
            X.AnonymousClass3Zp.A02(r0, r2)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r1)
            r0 = 0
            X.H8c r2 = X.C63883iV.A0B(r1, r7, r0)
            X.1hI r0 = new X.1hI
            r0.<init>(r3, r7)
        L_0x018c:
            r2.A00 = r0
            X.C31155GhB.A03(r2)
            return
        L_0x0192:
            r0 = 18296277213184156(0x41005e0001009c, double:1.8914723538405667E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r1 = r6.A00
            X.1cQ r1 = (X.AnonymousClass1cQ) r1
            X.3Zp r0 = r1.A01
            if (r0 == 0) goto L_0x01b6
            X.0Oa r0 = r1.A06
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.AnonymousClass3Zp.A02(r0, r4)
        L_0x01ae:
            java.lang.Object r0 = r6.A00
            X.1cQ r0 = (X.AnonymousClass1cQ) r0
            X.AnonymousClass1cQ.A01(r0)
            return
        L_0x01b6:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x01bb:
            com.instagram.creation.fragment.FollowersShareFragment.A0N(r4)
            return
        L_0x01bf:
            java.lang.Object r4 = r6.A00
            com.instagram.creation.fragment.ShareLaterFragment r4 = (com.instagram.creation.fragment.ShareLaterFragment) r4
            com.instagram.service.session.UserSession r3 = r4.A04
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36325317266121774(0x810daf0000242e, double:3.035615137183013E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e6
            com.instagram.service.session.UserSession r0 = r4.A04
            X.49c r3 = X.C49222r2.A00(r0)
            java.lang.String r2 = "feed_composer_prefetch"
            X.4s1 r1 = r4.A05
        L_0x01e0:
            java.lang.String r0 = "FEED"
            r3.A04(r1, r2, r0)
            return
        L_0x01e6:
            com.instagram.creation.fragment.ShareLaterFragment.A02(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxAListenerShape459S0100000_1_I2.onAuthorizeSuccess(java.lang.String, java.lang.String):void");
    }
}

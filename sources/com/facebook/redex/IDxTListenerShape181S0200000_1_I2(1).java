package com.facebook.redex;

import X.C22521Yk;
import X.C33516HpC;
import X.C63873iU;

public class IDxTListenerShape181S0200000_1_I2 implements C33516HpC {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxTListenerShape181S0200000_1_I2(C63873iU r1, C22521Yk r2, int i) {
        this.A02 = i;
        if (7 - i != 0) {
            this.A00 = r2;
            this.A01 = r1;
            return;
        }
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015a, code lost:
        X.AnonymousClass3PM.A01(r1, r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        X.AnonymousClass3PM.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0326, code lost:
        X.C13950oZ.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onToggle(boolean r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            r11 = r13
            switch(r0) {
                case 0: goto L_0x015f;
                case 1: goto L_0x0028;
                case 2: goto L_0x0069;
                case 3: goto L_0x0071;
                case 4: goto L_0x008f;
                case 5: goto L_0x00a5;
                case 6: goto L_0x01f5;
                case 7: goto L_0x00bc;
                case 8: goto L_0x0118;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r12.A00
            X.1Yk r1 = (X.C22521Yk) r1
            if (r13 == 0) goto L_0x0149
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.C22521Yk.A00(r1, r0)
            android.content.Context r0 = r1.requireContext()
            com.instagram.service.session.UserSession r2 = r1.A00
            com.instagram.user.model.User r3 = r1.A01
            java.lang.String r5 = "media_mute_sheet"
            java.lang.Object r1 = r12.A01
            X.3iU r1 = (X.C63873iU) r1
            r6 = 0
            r7 = 1
            r4 = 0
            r8 = r6
        L_0x0023:
            X.AnonymousClass3PM.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0026:
            r0 = 1
            return r0
        L_0x0028:
            java.lang.Object r3 = r12.A01
            X.1Zf r3 = (X.C22731Zf) r3
            com.instagram.business.promote.model.PromoteData r2 = r3.A01
            if (r2 != 0) goto L_0x0037
            java.lang.String r0 = "promoteData"
        L_0x0032:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0037:
            java.lang.Object r1 = r12.A00
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r1 = (com.instagram.api.schemas.InstagramProfileCallToActionDestinations) r1
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            if (r13 == 0) goto L_0x0063
            boolean r0 = X.C37318JpL.A02(r1, r2)
            if (r0 == 0) goto L_0x0063
            java.util.Set r0 = r2.A1i
            r0.add(r1)
        L_0x004c:
            java.lang.String r0 = "promoteLogger"
            X.K2b r2 = r3.A00
            if (r13 == 0) goto L_0x005c
            if (r2 == 0) goto L_0x0032
            X.Iu2 r1 = X.C35394Iu2.A10
            java.lang.String r0 = "secondary_cta_toggle_opt_in"
        L_0x0058:
            r2.A0I(r1, r0)
            goto L_0x0026
        L_0x005c:
            if (r2 == 0) goto L_0x0032
            X.Iu2 r1 = X.C35394Iu2.A10
            java.lang.String r0 = "secondary_cta_toggle_opt_out"
            goto L_0x0058
        L_0x0063:
            java.util.Set r0 = r2.A1i
            r0.remove(r1)
            goto L_0x004c
        L_0x0069:
            java.lang.Object r0 = r12.A01
            X.4vz r0 = (X.C85924vz) r0
            r0.CDC(r13)
            goto L_0x0026
        L_0x0071:
            java.lang.Object r2 = r12.A01
            X.1bs r2 = (X.C23071bs) r2
            java.lang.Object r1 = r12.A00
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131825810(0x7f111492, float:1.9284487E38)
            if (r13 == 0) goto L_0x0081
            r0 = 2131825811(0x7f111493, float:1.9284489E38)
        L_0x0081:
            r1.setText(r0)
            X.0zW r1 = X.C23071bs.A00(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r1.A02 = r0
            goto L_0x0026
        L_0x008f:
            java.lang.Object r1 = r12.A00
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = (com.instagram.ui.widget.progressbutton.ProgressButton) r1
            r0 = 2131826219(0x7f11162b, float:1.9285316E38)
            if (r13 == 0) goto L_0x009b
            r0 = 2131831737(0x7f112bb9, float:1.9296508E38)
        L_0x009b:
            r1.setText((int) r0)
            java.lang.Object r0 = r12.A01
            X.1bl r0 = (X.C23001bl) r0
            r0.A07 = r13
            goto L_0x0026
        L_0x00a5:
            java.lang.Object r0 = r12.A01
            X.1Yb r0 = (X.C22431Yb) r0
            java.util.HashMap r2 = r0.A08
            java.lang.Object r0 = r12.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getId()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r2.put(r1, r0)
            goto L_0x0026
        L_0x00bc:
            java.lang.Object r1 = r12.A00
            X.1Yk r1 = (X.C22521Yk) r1
            java.lang.Object r8 = r12.A01
            X.3iU r8 = (X.C63873iU) r8
            if (r13 == 0) goto L_0x0115
            java.lang.Integer r0 = X.AnonymousClass006.A0N
        L_0x00c8:
            X.C22521Yk.A00(r1, r0)
            android.content.Context r7 = r1.requireContext()
            com.instagram.service.session.UserSession r4 = r1.A00
            com.instagram.user.model.User r10 = r1.A01
            java.lang.String r6 = "media_mute_sheet"
            java.lang.String r5 = r10.getId()
            if (r13 == 0) goto L_0x0112
            java.lang.String r0 = "mute_note"
        L_0x00dd:
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r4)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/%s/"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            r3.A0J(r0)
            java.lang.String r0 = "container_module"
            r3.A0O(r0, r6)
            X.C18250wR.A17(r3, r5)
            java.lang.Class<X.1Th> r1 = X.C22081Th.class
            java.lang.Class<X.3PJ> r0 = X.AnonymousClass3PJ.class
            X.H8c r0 = X.C18180wK.A0T(r3, r1, r0)
            X.KHq r9 = X.AnonymousClass3LY.A00(r4)
            X.1ht r6 = new X.1ht
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A00 = r6
            X.C31155GhB.A03(r0)
            goto L_0x0026
        L_0x0112:
            java.lang.String r0 = "unmute_note"
            goto L_0x00dd
        L_0x0115:
            java.lang.Integer r0 = X.AnonymousClass006.A15
            goto L_0x00c8
        L_0x0118:
            java.lang.Object r1 = r12.A00
            X.1Yk r1 = (X.C22521Yk) r1
            if (r13 == 0) goto L_0x0137
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C22521Yk.A00(r1, r0)
            android.content.Context r0 = r1.requireContext()
            com.instagram.service.session.UserSession r2 = r1.A00
            com.instagram.user.model.User r3 = r1.A01
            r4 = 0
            java.lang.String r5 = "media_mute_sheet"
            java.lang.Object r1 = r12.A01
            X.3iU r1 = (X.C63873iU) r1
            r7 = 0
            r6 = 1
            r8 = r7
            goto L_0x0023
        L_0x0137:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            X.C22521Yk.A00(r1, r0)
            com.instagram.service.session.UserSession r2 = r1.A00
            com.instagram.user.model.User r3 = r1.A01
            java.lang.String r4 = "media_mute_sheet"
            java.lang.Object r1 = r12.A01
            X.3iU r1 = (X.C63873iU) r1
            r5 = 1
            r6 = 0
            goto L_0x015a
        L_0x0149:
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            X.C22521Yk.A00(r1, r0)
            com.instagram.service.session.UserSession r2 = r1.A00
            com.instagram.user.model.User r3 = r1.A01
            java.lang.String r4 = "media_mute_sheet"
            java.lang.Object r1 = r12.A01
            X.3iU r1 = (X.C63873iU) r1
            r5 = 0
            r6 = 1
        L_0x015a:
            X.AnonymousClass3PM.A01(r1, r2, r3, r4, r5, r6)
            goto L_0x0026
        L_0x015f:
            java.lang.Object r4 = r12.A00
            X.1cT r4 = (X.AnonymousClass1cT) r4
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x022d
            com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl r0 = X.AnonymousClass312.A00
            if (r0 == 0) goto L_0x01b3
            java.lang.Class<com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl$BusinessPresence> r5 = com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl.BusinessPresence.class
            java.lang.String r3 = "business_presence"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r3, r5)
            if (r0 == 0) goto L_0x01b3
            com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl r0 = X.AnonymousClass312.A00
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r3, r5)
            java.lang.String r0 = "is_bci"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 == 0) goto L_0x01b3
            android.content.Context r2 = r4.getContext()
            com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl r0 = X.AnonymousClass312.A00
            if (r0 == 0) goto L_0x01b1
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r3, r5)
            if (r0 == 0) goto L_0x01b1
            com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl r0 = X.AnonymousClass312.A00
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r3, r5)
            java.lang.String r0 = "ig_is_in_bci_sync_toggle_message"
            java.lang.String r1 = r1.getStringValue(r0)
        L_0x019d:
            if (r2 == 0) goto L_0x022d
            if (r1 == 0) goto L_0x022d
            X.Dsm r0 = X.C18190wL.A0W(r2)
            r0.A0p(r1)
            X.C18180wK.A1M(r0)
            android.app.Dialog r0 = r0.A0G()
            goto L_0x0326
        L_0x01b1:
            r1 = 0
            goto L_0x019d
        L_0x01b3:
            com.instagram.service.session.UserSession r3 = r4.A07
            if (r13 == 0) goto L_0x01dc
            X.H1T r2 = X.C18180wK.A0O(r3)
            java.lang.String r0 = "business/account/fetch_business_presence_attributes/"
            r2.A0J(r0)
            java.lang.Class<X.1Sw> r1 = X.C21971Sw.class
            java.lang.Class<X.3L2> r0 = X.AnonymousClass3L2.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r0 = 32
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r1 = X.C63873iU.A06(r4, r0)
        L_0x01ce:
            r2.A00 = r1
            r4.schedule(r2)
            java.lang.Object r0 = r12.A01
            X.3S4 r0 = (X.AnonymousClass3S4) r0
            X.4nK r0 = r0.A00
            monitor-enter(r0)
            monitor-exit(r0)
            goto L_0x022d
        L_0x01dc:
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r3)
            java.lang.String r0 = "business/account/disable_sync_business_attributes/"
            r2.A0J(r0)
            java.lang.Class<X.1Sw> r1 = X.C21971Sw.class
            java.lang.Class<X.3L2> r0 = X.AnonymousClass3L2.class
            X.H8c r2 = X.C18180wK.A0T(r2, r1, r0)
            r0 = 8
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r1 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r1.<init>(r0, r4, r3)
            goto L_0x01ce
        L_0x01f5:
            java.lang.Object r3 = r12.A00
            X.1x0 r3 = (X.AnonymousClass1x0) r3
            java.lang.Object r4 = r12.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            boolean r0 = r3.A09
            r6 = 0
            if (r0 != 0) goto L_0x022d
            X.266 r1 = r4.A0g()
            X.266 r0 = X.AnonymousClass266.A04
            if (r1 == r0) goto L_0x02d7
            X.266 r1 = r4.A0g()
            X.266 r0 = X.AnonymousClass266.A05
            if (r1 == r0) goto L_0x02d7
            r5 = 1
            r3.A09 = r5
            if (r13 != 0) goto L_0x022f
            com.instagram.service.session.UserSession r5 = r3.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342170310754707409(0x20810f7d000027d1, double:4.07177696764445E-152)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r5, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02f8
            X.AnonymousClass1x0.A0C(r3, r4)
        L_0x022d:
            r0 = 0
            return r0
        L_0x022f:
            com.instagram.service.session.UserSession r0 = r3.A06
            boolean r0 = X.C49042qk.A00(r0, r4)
            if (r0 == 0) goto L_0x0240
            X.AnonymousClass1x0.A0D(r3, r5)
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            X.AnonymousClass1x0.A0B(r3, r0, r4, r5)
            goto L_0x022d
        L_0x0240:
            com.instagram.service.session.UserSession r7 = r3.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342170310754707409(0x20810f7d000027d1, double:4.07177696764445E-152)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r7, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a7
            r0 = 174(0xae, float:2.44E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r4 = X.C18200wM.A0R(r4, r3, r0)
            com.instagram.service.session.UserSession r0 = r3.A06
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r0 = 2131835578(0x7f113aba, float:1.9304299E38)
            X.C18230wP.A10(r1, r2, r0)
            r0 = 3
            X.C18250wR.A1A(r2, r3, r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r0 = 2131835573(0x7f113ab5, float:1.9304288E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0R = r0
            r2.A0A = r4
            r2.A0d = r6
            X.Jqm r4 = r2.A00()
            r4.A0I(r5)
            X.1Yc r2 = new X.1Yc
            r2.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "ARG_PRIVACY_SWITCH_TO_PRIVATE"
            r1.putBoolean(r0, r5)
            java.lang.String r0 = "ARG_IS_REDESIGN"
            r1.putBoolean(r0, r5)
            r2.setArguments(r1)
            boolean r0 = r3.A0A
            r2.A02 = r0
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.C37383Jqm.A00(r0, r2, r4)
            goto L_0x022d
        L_0x02a7:
            android.app.Dialog r0 = r3.A02
            if (r0 != 0) goto L_0x0326
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r3)
            r0 = 2131823226(0x7f110a7a, float:1.9279246E38)
            r2.A0L(r0)
            r0 = 2131823225(0x7f110a79, float:1.9279244E38)
            r2.A0K(r0)
            r1 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 53
            X.C18190wL.A1R(r2, r3, r4, r0, r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 149(0x95, float:2.09E-43)
            X.C18180wK.A1N(r2, r3, r0, r1)
            r0 = 8
            X.C18240wQ.A1C(r2, r3, r0)
            android.app.Dialog r0 = r2.A0G()
            r3.A02 = r0
            goto L_0x0326
        L_0x02d7:
            android.app.Dialog r0 = r3.A00
            if (r0 != 0) goto L_0x0326
            X.Dsm r1 = X.AnonymousClass0wJ.A0V(r3)
            r0 = 2131822767(0x7f1108af, float:1.9278315E38)
            r1.A0L(r0)
            r0 = 2131822768(0x7f1108b0, float:1.9278317E38)
            r1.A0K(r0)
            r1.A0q(r6)
            X.C18180wK.A1M(r1)
            android.app.Dialog r0 = r1.A0G()
            r3.A00 = r0
            goto L_0x0326
        L_0x02f8:
            android.app.Dialog r0 = r3.A01
            if (r0 != 0) goto L_0x0326
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r3)
            r0 = 2131833820(0x7f1133dc, float:1.9300733E38)
            r2.A0L(r0)
            r0 = 2131833819(0x7f1133db, float:1.930073E38)
            r2.A0K(r0)
            r1 = 2131823201(0x7f110a61, float:1.9279195E38)
            r0 = 52
            X.C18190wL.A1R(r2, r3, r4, r0, r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 148(0x94, float:2.07E-43)
            X.C18180wK.A1N(r2, r3, r0, r1)
            r0 = 7
            X.C18240wQ.A1C(r2, r3, r0)
            android.app.Dialog r0 = r2.A0G()
            r3.A01 = r0
        L_0x0326:
            X.C13950oZ.A00(r0)
            goto L_0x022d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxTListenerShape181S0200000_1_I2.onToggle(boolean):boolean");
    }

    public IDxTListenerShape181S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}

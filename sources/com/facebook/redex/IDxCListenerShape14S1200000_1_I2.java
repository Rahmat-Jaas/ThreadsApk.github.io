package com.facebook.redex;

import X.AnonymousClass3BX;
import X.C24751jz;
import android.content.DialogInterface;

public class IDxCListenerShape14S1200000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxCListenerShape14S1200000_1_I2(AnonymousClass3BX r1, C24751jz r2, String str, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b2, code lost:
        X.C18210wN.A0t(r4, r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0129, code lost:
        X.C67273zH.A01(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012f, code lost:
        r2 = r2.equals(r1);
        r1 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0135, code lost:
        if (r2 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0137, code lost:
        r1.CMa();
        r0 = X.C318329d.ONE_TIME_OFF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x013d, code lost:
        r1.CKr((X.BKH) r0.A01);
        r0 = X.C318329d.ONE_TIME_ON;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ef, code lost:
        r2.A03 = r0;
        r2.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0057;
                case 2: goto L_0x006f;
                case 3: goto L_0x009c;
                case 4: goto L_0x00b6;
                case 5: goto L_0x0181;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00f7;
                case 8: goto L_0x0110;
                case 9: goto L_0x0147;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r0.A01
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r0.A00
            X.0kW r1 = (X.C11630kW) r1
            X.AnonymousClass0wJ.A1N(r2, r1)
            X.3Ui r3 = new X.3Ui
            r3.<init>(r1, r2)
            r5 = 0
            X.3DJ r4 = X.C63823iP.A05(r2)
            java.lang.String r14 = r0.A02
            java.lang.String r13 = "ig_quiet_mode_upsell_enable_flow_dialog_not_now"
            r16 = 4088(0xff8, float:5.729E-42)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r15 = r5
            X.AnonymousClass3Ui.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r20.dismiss()
        L_0x0030:
            return
        L_0x0031:
            X.Ds0 r1 = X.C25787Ds0.A00
            if (r1 == 0) goto L_0x0030
            java.lang.Object r2 = r0.A00
            X.601 r2 = (X.AnonymousClass601) r2
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r2)
            java.lang.Object r1 = r0.A01
            X.0i6 r1 = (X.C10300i6) r1
            X.Drz r2 = X.C18180wK.A0Q(r2, r1)
            X.Ds0 r1 = X.C25787Ds0.A00
            X.4q1 r1 = r1.getFragmentFactory()
            java.lang.String r0 = r0.A02
            androidx.fragment.app.Fragment r0 = r1.Bhg(r0)
            goto L_0x01ef
        L_0x0057:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r1 = r0.A00
            com.instagram.business.fragment.EditBusinessFBPageFragment r1 = (com.instagram.business.fragment.EditBusinessFBPageFragment) r1
            com.instagram.service.session.UserSession r3 = r1.A07
            java.lang.String r1 = "https://help.instagram.com/402748553849926"
            java.lang.String r1 = X.AnonymousClass3W8.A01(r4, r1)
            X.JhV r2 = new X.JhV
            r2.<init>((java.lang.String) r1)
            java.lang.String r0 = r0.A02
            goto L_0x00b2
        L_0x006f:
            java.lang.Object r2 = r0.A01
            X.1dy r2 = (X.C23511dy) r2
            X.0Oa r1 = r2.A0L
            java.lang.Object r1 = r1.getValue()
            X.10N r1 = (X.AnonymousClass10N) r1
            r1.A01()
            X.0Oa r1 = r2.A0I
            java.lang.Object r7 = r1.getValue()
            X.49J r7 = (X.AnonymousClass49J) r7
            X.29s r6 = X.C319829s.NEW_SUBSCRIBER_CHAT
            X.29t r4 = X.C319929t.DISCARD_CHANGES_YES
            X.28X r3 = X.AnonymousClass28X.TAP
            X.29u r5 = X.C320029u.DISCARD_CHANGES_DIALOG
            r8 = 0
            X.AnonymousClass49J.A00(r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r0.A00
            com.instagram.api.schemas.FanClubCategoryType r1 = (com.instagram.api.schemas.FanClubCategoryType) r1
            java.lang.String r0 = r0.A02
            X.C23511dy.A00(r1, r2, r0)
            return
        L_0x009c:
            java.lang.Object r4 = r0.A00
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A01
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.String r0 = r0.A02
            X.JhV r2 = new X.JhV
            r2.<init>((java.lang.String) r0)
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r0 = r4.getString(r0)
        L_0x00b2:
            X.C18210wN.A0t(r4, r3, r2, r0)
            return
        L_0x00b6:
            r20.dismiss()
            java.lang.Object r2 = r0.A00
            X.1jz r2 = (X.C24751jz) r2
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r0 = r0.A02
            X.C24751jz.A05(r2, r1, r0)
            return
        L_0x00c7:
            r20.dismiss()
            java.lang.Object r4 = r0.A00
            X.1jz r4 = (X.C24751jz) r4
            X.0bf r5 = r4.A08
            com.facebook.common.callercontext.CallerContext r3 = X.C24751jz.A0B
            java.lang.String r2 = "ig_android_growth_sdk_token_fbig_sign_up"
            boolean r1 = X.C62433Zv.A02(r3, r5, r2)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r7 = X.C62433Zv.A01(r3, r5, r2)
        L_0x00de:
            java.lang.String r8 = r0.A02
            r11 = 1
            java.lang.Object r0 = r0.A01
            X.3BX r0 = (X.AnonymousClass3BX) r0
            java.lang.String r0 = r0.A03
            X.5rY r1 = X.C18220wO.A0R(r0)
            X.5rZ r2 = X.AnonymousClass5rZ.A00
            r6 = 0
            r3 = r2
            r9 = r6
            r10 = r6
            X.C24751jz.A02(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00f5:
            r7 = 0
            goto L_0x00de
        L_0x00f7:
            java.lang.String r2 = r0.A02
            java.lang.Object r3 = r0.A00
            X.3zH r3 = (X.C67273zH) r3
            java.lang.String r1 = r3.A0F
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x010d
            X.4tF r0 = r3.A06
            r0.CMW()
            X.29d r0 = X.C318329d.AUTO_OFF
            goto L_0x0129
        L_0x010d:
            java.lang.String r1 = r3.A0G
            goto L_0x012f
        L_0x0110:
            java.lang.String r2 = r0.A02
            java.lang.Object r3 = r0.A00
            X.3zH r3 = (X.C67273zH) r3
            java.lang.String r1 = r3.A0I
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x012d
            X.4tF r1 = r3.A06
            java.lang.Object r0 = r0.A01
            X.BKH r0 = (X.BKH) r0
            r1.Blu(r0)
            X.29d r0 = X.C318329d.AUTO_ON
        L_0x0129:
            X.C67273zH.A01(r0, r3)
            return
        L_0x012d:
            java.lang.String r1 = r3.A0D
        L_0x012f:
            boolean r2 = r2.equals(r1)
            X.4tF r1 = r3.A06
            if (r2 == 0) goto L_0x013d
            r1.CMa()
            X.29d r0 = X.C318329d.ONE_TIME_OFF
            goto L_0x0129
        L_0x013d:
            java.lang.Object r0 = r0.A01
            X.BKH r0 = (X.BKH) r0
            r1.CKr(r0)
            X.29d r0 = X.C318329d.ONE_TIME_ON
            goto L_0x0129
        L_0x0147:
            java.lang.Object r4 = r0.A01
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            X.3Ui r5 = X.C60583Pr.A01(r4)
            X.3DJ r6 = X.C63823iP.A05(r4)
            java.lang.String r2 = r0.A02
            java.lang.String r15 = "ig_quiet_mode_confirmation_toast_edit_tap"
            r7 = 0
            r18 = 4088(0xff8, float:5.729E-42)
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r16 = r2
            r17 = r7
            X.AnonymousClass3Ui.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r1 = "entrypoint"
            r3.putString(r1, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.Object r1 = r0.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "quiet_mode_settings"
            X.3iT r0 = X.C63863iT.A04(r1, r3, r4, r2, r0)
            r0.A0I(r1)
            return
        L_0x0181:
            java.lang.Object r10 = r0.A00
            X.1jz r10 = (X.C24751jz) r10
            X.269 r2 = X.AnonymousClass269.A0I
            java.lang.String r1 = r0.A02
            X.C24751jz.A06(r10, r2, r1)
            r20.dismiss()
            java.lang.Object r0 = r0.A01
            X.3BX r0 = (X.AnonymousClass3BX) r0
            java.lang.String r7 = r0.A03
            X.0bf r9 = r10.A08
            X.265 r0 = r10.A0A
            java.lang.String r11 = r0.A01
            boolean r8 = X.AnonymousClass0wJ.A1Y(r9, r11)
            double r5 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.0nS r1 = X.C13330nS.A02(r9)
            java.lang.String r0 = "fb_clash_log_in_tapped"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 618(0x26a, float:8.66E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            X.AnonymousClass0wJ.A1B(r2, r5, r3)
            X.C18180wK.A1A(r2, r3)
            X.AnonymousClass269.A08(r2, r11)
            X.C18180wK.A19(r2)
            X.C63683i7.A07(r2)
            X.C63683i7.A08(r2)
            X.C63683i7.A09(r2, r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_internal_build"
            r2.A0Q(r0, r1)
            r2.Bb4()
            X.IcN r0 = r10.A06
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.Drz r2 = X.C63463hW.A00(r0, r9)
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "com.instagram.android.login.fragment.ARGUMENT_OMNISTRING"
            r1.putString(r0, r7)
            X.1ca r0 = X.C18250wR.A0O(r1)
        L_0x01ef:
            r2.A03 = r0
            r2.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape14S1200000_1_I2.onClick(android.content.DialogInterface, int):void");
    }

    public IDxCListenerShape14S1200000_1_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }
}

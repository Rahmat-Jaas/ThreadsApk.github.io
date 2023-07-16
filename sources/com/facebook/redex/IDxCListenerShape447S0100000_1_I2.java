package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape447S0100000_1_I2 implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape447S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0105, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r3.A02(r2, r2.getWidth() >> 1, 0, false);
        r3.A03(X.D0f.ABOVE_ANCHOR);
        r3.A04(X.AnonymousClass3TC.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        X.C18200wM.A1Q(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x004b;
                case 2: goto L_0x0116;
                case 3: goto L_0x00a9;
                case 4: goto L_0x007e;
                case 5: goto L_0x0079;
                case 6: goto L_0x0034;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A00
            X.13p r2 = (X.C202213p) r2
            android.content.Context r1 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.C04220Ms.A0C(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131832016(0x7f112cd0, float:1.9297074E38)
            X.Dnn r3 = X.AnonymousClass4DS.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r2 = r2.A03
        L_0x001b:
            int r0 = r2.getWidth()
            int r1 = r0 >> 1
            r0 = 0
            r3.A02(r2, r1, r0, r0)
            X.D0f r0 = X.D0f.ABOVE_ANCHOR
            r3.A03(r0)
            X.3TC r0 = X.AnonymousClass3TC.A05
            r3.A04(r0)
        L_0x002f:
            X.C18200wM.A1Q(r3)
        L_0x0032:
            r0 = 1
            return r0
        L_0x0034:
            java.lang.Object r2 = r8.A00
            X.13q r2 = (X.C202313q) r2
            android.content.Context r1 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.C04220Ms.A0C(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131832016(0x7f112cd0, float:1.9297074E38)
            X.Dnn r3 = X.AnonymousClass4DS.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r2 = r2.A09
            goto L_0x001b
        L_0x004b:
            java.lang.Object r2 = r8.A00
            X.1Yw r2 = (X.C22641Yw) r2
            android.content.Context r1 = r2.requireContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.C04220Ms.A0C(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131832185(0x7f112d79, float:1.9297417E38)
            java.lang.String r0 = X.C18180wK.A0g(r2, r0)
            X.Dnn r3 = X.AnonymousClass4DS.A01(r1, r0)
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r2.A0A
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "confirmationCodeEditText"
            goto L_0x0101
        L_0x006d:
            r3.A01(r0)
            r1 = 2
            com.facebook.redex.IDxTCallbackShape564S0100000_1_I2 r0 = new com.facebook.redex.IDxTCallbackShape564S0100000_1_I2
            r0.<init>(r2, r1)
            r3.A05 = r0
            goto L_0x002f
        L_0x0079:
            java.lang.Object r0 = r8.A00
            if (r0 == 0) goto L_0x01a5
            goto L_0x0032
        L_0x007e:
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.Object r0 = r8.A00
            X.1jq r0 = (X.C24691jq) r0
            X.0bf r1 = r0.A06
            X.C05050Qq.A00(r3, r1)
            java.lang.String r2 = "com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment"
            androidx.fragment.app.FragmentActivity r0 = r0.A04     // Catch:{ Exception -> 0x00a0 }
            X.Drz r1 = X.C18180wK.A0Q(r0, r1)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r0 = X.C18230wP.A0g(r2)     // Catch:{ Exception -> 0x00a0 }
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch:{ Exception -> 0x00a0 }
            r1.A0A(r3, r0)     // Catch:{ Exception -> 0x00a0 }
            r1.A05()     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0032
        L_0x00a0:
            r2 = move-exception
            java.lang.String r1 = "LandingLifecycleListener"
            java.lang.String r0 = "Can't find QuickExperimentCategoriesFragment"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            goto L_0x0032
        L_0x00a9:
            java.lang.Object r1 = r8.A00
            X.3Sf r1 = (X.C61183Sf) r1
            X.Icf r4 = X.C61183Sf.A00(r1)
            if (r4 == 0) goto L_0x01a5
            boolean r0 = com.facebook.endtoend.EndToEnd.A04()
            if (r0 != 0) goto L_0x01a5
            com.instagram.service.session.UserSession r3 = r1.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36324965078803274(0x810d5d0000234a, double:3.035392412504649E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x01a5
            android.content.Context r2 = r4.getContext()
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x01a0
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x019b
            X.AnonymousClass3MR.A00(r0, r2, r3)
            goto L_0x0032
        L_0x00db:
            java.lang.Object r3 = r8.A00
            X.1bx r3 = (X.C23121bx) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x01a5
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.C04220Ms.A0C(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131821825(0x7f110501, float:1.9276404E38)
            java.lang.String r0 = X.C18180wK.A0g(r3, r0)
            X.Dnn r2 = X.AnonymousClass4DS.A01(r1, r0)
            android.widget.TextView r0 = r3.A02
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = "backupCodesTextView"
        L_0x0101:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0106:
            r2.A01(r0)
            r1 = 1
            com.facebook.redex.IDxTCallbackShape564S0100000_1_I2 r0 = new com.facebook.redex.IDxTCallbackShape564S0100000_1_I2
            r0.<init>(r3, r1)
            r2.A05 = r0
            X.C18200wM.A1Q(r2)
            goto L_0x0032
        L_0x0116:
            java.lang.Object r0 = r8.A00
            X.3Sf r0 = (X.C61183Sf) r0
            X.Icf r2 = X.C61183Sf.A00(r0)
            if (r2 == 0) goto L_0x0032
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0032
            com.instagram.service.session.UserSession r3 = r0.A02
            boolean r0 = X.C63793iM.A0C(r3)
            if (r0 == 0) goto L_0x0142
            boolean r0 = X.C67313zL.A06(r3)
            if (r0 == 0) goto L_0x0142
            X.4Rd r1 = new X.4Rd
            r1.<init>(r2, r3)
            android.os.Handler r0 = X.AnonymousClass0wJ.A0F()
            r0.post(r1)
            goto L_0x0032
        L_0x0142:
            java.lang.String r7 = "long_press_tab_bar"
            java.lang.String r6 = "native"
            X.01V r5 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r5)
            r2 = 857814227(0x332134d3, float:3.7533777E-8)
            r5.markerStart(r2)
            java.lang.String r1 = X.C63453hV.A06
            java.lang.String r0 = X.C63833iQ.A00()
            r5.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r1 = "entry_point"
            r5.markerAnnotate((int) r2, (java.lang.String) r1, (java.lang.String) r7)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x016c
            java.lang.String r0 = "native_or_bloks"
            r5.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r6)
        L_0x016c:
            X.0f3 r0 = X.AnonymousClass0f3.A01
            r0.A02()
            java.lang.String r0 = r3.token
            android.os.Bundle r2 = X.C18180wK.A06()
            X.C18190wL.A13(r2, r0)
            r2.putString(r1, r7)
            r1 = 1
            java.lang.String r0 = "show_add_account_button"
            r2.putBoolean(r0, r1)
            X.Jj9 r0 = X.C18210wN.A0L(r3)
            X.Jqm r1 = r0.A00()
            X.1de r0 = new X.1de
            r0.<init>()
            r0.setArguments(r2)
            X.C37383Jqm.A00(r4, r0, r1)
            X.C63453hV.A03(r3)
            goto L_0x0032
        L_0x019b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01a0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01a5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape447S0100000_1_I2.onLongClick(android.view.View):boolean");
    }
}

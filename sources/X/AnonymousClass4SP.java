package X;

/* renamed from: X.4SP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4SP implements Runnable {
    public final /* synthetic */ C63723iC A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass4SP(C63723iC r1, Integer num, boolean z) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0429, code lost:
        if (r13 != false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0541, code lost:
        if (X.C63173fJ.A05(r8, 18296294393184475L) != false) goto L_0x0543;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            X.3iC r0 = r1.A00
            java.lang.Integer r5 = r1.A01
            boolean r7 = r1.A02
            X.39K r3 = r0.A06
            java.lang.Object r2 = r3.A01
            monitor-enter(r2)
            r1 = 0
            r3.A00 = r1     // Catch:{ all -> 0x0595 }
            monitor-exit(r2)     // Catch:{ all -> 0x0595 }
            com.instagram.service.session.UserSession r14 = r0.A08
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            X.0kW r11 = r0.A03
            X.4EQ r9 = new X.4EQ
            r9.<init>()
            monitor-enter(r2)
            X.3aW r8 = r3.A00     // Catch:{ all -> 0x0592 }
            if (r8 != 0) goto L_0x0028
            X.3aW r8 = new X.3aW     // Catch:{ all -> 0x0592 }
            r8.<init>()     // Catch:{ all -> 0x0592 }
            r3.A00 = r8     // Catch:{ all -> 0x0592 }
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x0592 }
            java.lang.Object r10 = r8.A07
            monitor-enter(r10)
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.A04     // Catch:{ all -> 0x058f }
            r6 = 0
            if (r2 != 0) goto L_0x0041
            r6 = 1
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ all -> 0x058f }
            r3.<init>()     // Catch:{ all -> 0x058f }
            r8.A04 = r3     // Catch:{ all -> 0x058f }
            X.4ER r2 = new X.4ER     // Catch:{ all -> 0x058f }
            r2.<init>(r9)     // Catch:{ all -> 0x058f }
            r3.add(r2)     // Catch:{ all -> 0x058f }
        L_0x0041:
            monitor-exit(r10)     // Catch:{ all -> 0x058f }
            if (r6 == 0) goto L_0x0058
            r16 = 1
            com.instagram.common.task.IDxLTaskShape11S0400000_1_I2 r15 = new com.instagram.common.task.IDxLTaskShape11S0400000_1_I2
            r17 = r4
            r18 = r11
            r19 = r8
            r20 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            X.C31155GhB.A03(r15)
        L_0x0056:
            monitor-enter(r10)
            goto L_0x0083
        L_0x0058:
            monitor-enter(r10)
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.A04     // Catch:{ all -> 0x058c }
            r2.getClass()     // Catch:{ all -> 0x058c }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x058c }
            if (r2 != 0) goto L_0x0073
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.A04     // Catch:{ all -> 0x058c }
            r3.getClass()     // Catch:{ all -> 0x058c }
            X.4ER r2 = new X.4ER     // Catch:{ all -> 0x058c }
            r2.<init>(r9)     // Catch:{ all -> 0x058c }
            r3.add(r2)     // Catch:{ all -> 0x058c }
        L_0x0071:
            monitor-exit(r10)     // Catch:{ all -> 0x058c }
            goto L_0x0056
        L_0x0073:
            java.util.List r2 = r8.A01     // Catch:{ all -> 0x058c }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x058c }
        L_0x0079:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x058c }
            if (r2 == 0) goto L_0x0071
            r3.next()     // Catch:{ all -> 0x058c }
            goto L_0x0079
        L_0x0083:
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.A03     // Catch:{ all -> 0x0589 }
            r6 = 0
            if (r2 != 0) goto L_0x009a
            r6 = 1
            r8.A00 = r1     // Catch:{ all -> 0x0589 }
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ all -> 0x0589 }
            r3.<init>()     // Catch:{ all -> 0x0589 }
            r8.A03 = r3     // Catch:{ all -> 0x0589 }
            X.4ER r2 = new X.4ER     // Catch:{ all -> 0x0589 }
            r2.<init>(r9)     // Catch:{ all -> 0x0589 }
            r3.add(r2)     // Catch:{ all -> 0x0589 }
        L_0x009a:
            monitor-exit(r10)     // Catch:{ all -> 0x0589 }
            if (r6 == 0) goto L_0x00cc
            r8.A00 = r1
            X.44X r2 = X.AnonymousClass44X.A00()
            java.lang.String r3 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            boolean r2 = X.AnonymousClass44X.A01(r14, r2, r3)
            if (r2 == 0) goto L_0x00b8
            X.44X r2 = X.AnonymousClass44X.A00()
            java.lang.String r2 = r2.A03(r14, r3)
            X.C62683aW.A00(r14, r8, r2)
        L_0x00b6:
            monitor-enter(r10)
            goto L_0x00fa
        L_0x00b8:
            X.KHr r6 = X.C38040KHr.A01
            java.lang.Class<X.45A> r3 = X.AnonymousClass45A.class
            X.46f r2 = new X.46f
            r2.<init>(r14, r8)
            r6.A03(r2, r3)
            X.44X r2 = X.AnonymousClass44X.A00()
            r2.A04(r14, r1)
            goto L_0x00b6
        L_0x00cc:
            monitor-enter(r10)
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.A03     // Catch:{ all -> 0x0586 }
            r2.getClass()     // Catch:{ all -> 0x0586 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0586 }
            if (r2 != 0) goto L_0x00e7
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.A03     // Catch:{ all -> 0x0586 }
            r3.getClass()     // Catch:{ all -> 0x0586 }
            X.4ER r2 = new X.4ER     // Catch:{ all -> 0x0586 }
            r2.<init>(r9)     // Catch:{ all -> 0x0586 }
            r3.add(r2)     // Catch:{ all -> 0x0586 }
        L_0x00e5:
            monitor-exit(r10)     // Catch:{ all -> 0x0586 }
            goto L_0x00b6
        L_0x00e7:
            X.1s2 r2 = r8.A00     // Catch:{ all -> 0x0586 }
            if (r2 == 0) goto L_0x00e5
            X.KHr r6 = X.C38040KHr.A01     // Catch:{ all -> 0x0586 }
            X.3DU r2 = r2.A00     // Catch:{ all -> 0x0586 }
            java.lang.String r3 = r2.A0F     // Catch:{ all -> 0x0586 }
            X.45H r2 = new X.45H     // Catch:{ all -> 0x0586 }
            r2.<init>(r3)     // Catch:{ all -> 0x0586 }
            r6.CWx(r2)     // Catch:{ all -> 0x0586 }
            goto L_0x00e5
        L_0x00fa:
            java.util.List r11 = r8.A02     // Catch:{ all -> 0x0583 }
            r11.clear()     // Catch:{ all -> 0x0583 }
            X.3hk r2 = X.C63533hk.A02(r14)     // Catch:{ all -> 0x0583 }
            r2.A0D(r14)     // Catch:{ all -> 0x0583 }
            java.util.Iterator r6 = X.C63533hk.A04(r14)     // Catch:{ all -> 0x0583 }
        L_0x010a:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0583 }
            if (r2 == 0) goto L_0x011d
            X.3ac r3 = X.C18250wR.A0Q(r6)     // Catch:{ all -> 0x0583 }
            X.1s0 r2 = new X.1s0     // Catch:{ all -> 0x0583 }
            r2.<init>(r3)     // Catch:{ all -> 0x0583 }
            r11.add(r2)     // Catch:{ all -> 0x0583 }
            goto L_0x010a
        L_0x011d:
            monitor-exit(r10)     // Catch:{ all -> 0x0583 }
            java.util.ArrayList r6 = X.C18200wM.A0s(r11)
            X.4ER r2 = new X.4ER
            r2.<init>(r9)
            java.util.List r3 = java.util.Collections.singletonList(r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>(r3)
            r8.A03(r6, r2)
            boolean r2 = X.AnonymousClass3X5.A01(r4, r14)
            if (r2 == 0) goto L_0x057c
            if (r7 == 0) goto L_0x0177
            X.0TJ r6 = X.C18180wK.A0J(r14)
            r2 = 36321344421370604(0x810a1200001aec, double:3.033102694165011E-306)
            boolean r2 = X.C63803iN.A0E(r6, r14, r2)
            if (r2 == 0) goto L_0x0177
            X.Dsm r6 = X.C18190wL.A0W(r4)
            r3 = 2131830124(0x7f11256c, float:1.9293236E38)
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r14)
            java.lang.String r2 = r2.BK7()
            java.lang.String r2 = X.AnonymousClass0wJ.A0l(r4, r2, r3)
            r6.A02 = r2
            r2 = 2131832755(0x7f112fb3, float:1.9298573E38)
            r6.A0K(r2)
            r3 = 2131830113(0x7f112561, float:1.9293214E38)
            r2 = 34
            X.C18190wL.A1R(r6, r0, r5, r2, r3)
            r0 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r6.A0O(r1, r0)
            X.AnonymousClass0wJ.A1K(r6)
        L_0x0176:
            return
        L_0x0177:
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            if (r5 != r6) goto L_0x0232
            X.3hk r8 = X.C63533hk.A02(r14)
            X.3LL r7 = new X.3LL
            r7.<init>()
            X.1tl r9 = X.AnonymousClass3WS.A01(r14)
            boolean r5 = r0.A0E()
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0201
            X.0BO r5 = r14.multipleAccountHelper
            X.0RL r5 = r5.A00
            java.util.List r5 = r5.A04(r1)
            java.util.Iterator r6 = r5.iterator()
        L_0x019c:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x0563
            com.instagram.user.model.User r5 = X.C18220wO.A0c(r6)
            java.lang.String r5 = r5.getId()
            boolean r5 = r8.A0I(r5)
            if (r5 != 0) goto L_0x019c
            boolean r1 = X.C63723iC.A0A(r0, r3)
            if (r1 != 0) goto L_0x0176
            X.1Yb r5 = new X.1Yb
            r5.<init>()
            X.Jj9 r6 = X.C18200wM.A0Y(r14, r2)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131822813(0x7f1108dd, float:1.9278408E38)
            java.lang.String r1 = r2.getString(r1)
            r6.A0O = r1
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131822809(0x7f1108d9, float:1.92784E38)
            java.lang.String r1 = r2.getString(r1)
            r6.A0R = r1
            r6.A0W = r3
            r6.A0k = r3
            r2 = 45
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r1.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r7, (java.lang.Object) r5)
            r6.A0A = r1
            X.Jqm r1 = r6.A00()
            androidx.fragment.app.Fragment r0 = r0.A00
            android.content.Context r0 = r0.requireContext()
            X.C37383Jqm.A00(r0, r5, r1)
        L_0x01f3:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r9)
            java.lang.String r0 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r3)
        L_0x01fd:
            r0.apply()
            return
        L_0x0201:
            X.0BO r5 = r14.multipleAccountHelper
            java.util.List r1 = r5.A0G(r1)
            java.util.Set r1 = X.AnonymousClass00J.A0c(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x020f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0572
            java.lang.String r1 = X.C18180wK.A0k(r5)
            boolean r1 = r8.A0I(r1)
            if (r1 != 0) goto L_0x020f
            boolean r1 = r8.A0H()
            if (r1 == 0) goto L_0x0572
            boolean r1 = X.C63723iC.A0A(r0, r3)
            if (r1 != 0) goto L_0x0176
            r4.getApplicationContext()
            X.C63723iC.A05(r0, r6)
            goto L_0x01f3
        L_0x0232:
            java.lang.Integer r6 = X.AnonymousClass006.A01
            if (r5 != r6) goto L_0x03bf
            X.3an r2 = X.C62813an.A01(r14)
            com.instagram.user.model.User r11 = r2.A03(r14)
            X.1tl r7 = X.AnonymousClass3WS.A01(r14)
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.lang.String r3 = "logout_scenario"
            java.lang.String r2 = "family_accounts"
            r5.put(r3, r2)
            if (r11 == 0) goto L_0x0284
            X.3hk r3 = X.C63533hk.A02(r14)
            java.lang.String r2 = r11.getId()
            boolean r2 = r3.A0I(r2)
            if (r2 != 0) goto L_0x0284
            X.49b r3 = r0.A04
            android.content.Context r2 = r4.getApplicationContext()
            boolean r2 = r3.A00(r2)
            if (r2 == 0) goto L_0x02a1
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r2 = 18313010405713925(0x410f9600002805, double:1.8980861902999317E-307)
            boolean r2 = X.C63173fJ.A05(r8, r2)
            if (r2 == 0) goto L_0x02a1
            android.content.SharedPreferences r3 = r7.A00
            java.lang.String r2 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            boolean r2 = X.C18190wL.A1X(r3, r2)
            if (r2 == 0) goto L_0x02a1
        L_0x0280:
            X.C63723iC.A06(r0, r6, r5)
            return
        L_0x0284:
            X.49b r2 = r0.A04
            android.content.Context r1 = r4.getApplicationContext()
            boolean r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x029d
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 18313010405713925(0x410f9600002805, double:1.8980861902999317E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x0280
        L_0x029d:
            X.C63723iC.A03(r0)
            return
        L_0x02a1:
            r2 = 37
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r3.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r11)
            r2 = 106(0x6a, float:1.49E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r2 = X.C18220wO.A0O(r0, r2)
            X.3DS r9 = new X.3DS
            r9.<init>(r4)
            r0 = 2131834566(0x7f1136c6, float:1.9302246E38)
            android.content.Context r8 = r9.A07
            java.lang.String r0 = r8.getString(r0)
            r9.A05 = r0
            android.content.res.Resources r12 = r4.getResources()
            r4 = 2131834563(0x7f1136c3, float:1.930224E38)
            r10 = 1
            java.lang.String r0 = r11.BK7()
            r5 = 0
            java.lang.String r0 = X.C18220wO.A0i(r12, r0, r4)
            android.widget.TextView r4 = r9.A0F
            r4.setText(r0)
            r4.setVisibility(r5)
            r0 = 2131834557(0x7f1136bd, float:1.9302228E38)
            java.lang.String r0 = r8.getString(r0)
            r9.A04 = r0
            r9.A01 = r3
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            java.lang.String r0 = r8.getString(r0)
            r9.A03 = r0
            r9.A00 = r2
            java.lang.String r0 = r9.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0320
            java.lang.Integer r2 = r9.A02
            java.lang.String r3 = r9.A05
            r0 = 1
            if (r2 != r6) goto L_0x02fd
            r0 = 0
        L_0x02fd:
            android.view.ViewStub r2 = r9.A0B
            if (r0 == 0) goto L_0x03b1
            r0 = 2131496395(0x7f0c0dcb, float:1.8616354E38)
            r2.setLayoutResource(r0)
            android.view.View r2 = r2.inflate()
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 1083(0x43b, float:1.518E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            r2.setTypeface(r0)
        L_0x031a:
            r2.setText(r3)
            r2.setVisibility(r5)
        L_0x0320:
            android.view.ViewStub r0 = r9.A0B
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0397
            java.lang.CharSequence r0 = r4.getText()
            if (r0 != 0) goto L_0x0397
        L_0x032e:
            android.widget.TextView r11 = r9.A0E
            r0 = 2131100092(0x7f0601bc, float:1.7812556E38)
            X.C18180wK.A0s(r8, r11, r0)
            android.widget.TextView r3 = r9.A0G
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            X.C18180wK.A0s(r8, r3, r0)
            r11.setTypeface(r1, r5)
            r3.setTypeface(r1, r10)
            android.view.View r6 = r9.A0A
            java.lang.String r0 = r9.A04
            android.content.DialogInterface$OnClickListener r2 = r9.A01
            r1 = -1
            r6.setVisibility(r5)
            r3.setText(r0)
            r4 = 4
            com.facebook.redex.IDxCListenerShape6S0201000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape6S0201000_1_I2
            r0.<init>(r1, r4, r2, r9)
            r6.setOnClickListener(r0)
            android.view.View r3 = r9.A09
            java.lang.String r0 = r9.A03
            android.content.DialogInterface$OnClickListener r2 = r9.A00
            r1 = -2
            r3.setVisibility(r5)
            r11.setText(r0)
            com.facebook.redex.IDxCListenerShape6S0201000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape6S0201000_1_I2
            r0.<init>(r1, r4, r2, r9)
            r3.setOnClickListener(r0)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0386
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0386
            android.view.View r1 = r9.A08
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r10
            r1.setVisibility(r5)
        L_0x0386:
            android.app.Dialog r0 = r9.A06
            X.C13950oZ.A00(r0)
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r7)
            java.lang.String r0 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r10)
            goto L_0x01fd
        L_0x0397:
            java.lang.Integer r0 = r9.A02
            if (r0 != r6) goto L_0x03a0
            android.widget.Space r0 = r9.A0D
            r0.setVisibility(r5)
        L_0x03a0:
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x032e
            android.widget.Space r0 = r9.A0C
            r0.setVisibility(r5)
            goto L_0x032e
        L_0x03b1:
            r0 = 2131493537(0x7f0c02a1, float:1.8610557E38)
            r2.setLayoutResource(r0)
            android.view.View r2 = r2.inflate()
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L_0x031a
        L_0x03bf:
            X.49b r6 = r0.A04
            android.content.Context r2 = r4.getApplicationContext()
            boolean r13 = r6.A00(r2)
            X.3hk r5 = X.C63533hk.A02(r14)
            java.lang.String r3 = r14.getUserId()
            boolean r2 = r5.A0I(r3)
            if (r2 != 0) goto L_0x042c
            boolean r2 = r5.A0H()
            if (r2 == 0) goto L_0x042c
            boolean r2 = r5.A0J(r3)
            if (r2 == 0) goto L_0x042c
            boolean r2 = r5.A0K(r3)
            if (r2 != 0) goto L_0x042c
        L_0x03e9:
            r12 = 1
        L_0x03ea:
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.lang.String r3 = "logout_scenario"
            java.lang.String r2 = "single_account"
            r5.put(r3, r2)
            X.1tl r7 = X.AnonymousClass3WS.A01(r14)
            if (r12 == 0) goto L_0x0429
            if (r13 == 0) goto L_0x044f
            com.instagram.service.session.UserSession r8 = r6.A00
            X.0TJ r6 = X.AnonymousClass0TJ.A06
            r2 = 36315739489176316(0x8104f900020afc, double:3.029558112476093E-306)
            boolean r2 = X.C63803iN.A0E(r6, r8, r2)
            if (r2 != 0) goto L_0x0416
            android.content.SharedPreferences r3 = r7.A00
            java.lang.String r2 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            boolean r2 = X.C18190wL.A1X(r3, r2)
            if (r2 == 0) goto L_0x044f
        L_0x0416:
            X.2A8 r3 = X.AnonymousClass2A8.A0C
            r1 = 1
            X.C04220Ms.A0B(r3, r1)
            X.2A9 r2 = X.AnonymousClass2A9.A09
            X.29h r1 = X.C318729h.CAL_FLOW
            X.C62383Zj.A00(r1, r2, r3, r14, r5)
        L_0x0423:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.C63723iC.A06(r0, r1, r5)
            return
        L_0x0429:
            if (r13 == 0) goto L_0x044f
            goto L_0x0423
        L_0x042c:
            X.3hk r5 = X.C63533hk.A02(r14)
            java.lang.String r3 = r14.getUserId()
            boolean r2 = r5.A0I(r3)
            if (r2 != 0) goto L_0x044d
            boolean r2 = r5.A0H()
            if (r2 == 0) goto L_0x044d
            boolean r2 = r5.A0J(r3)
            if (r2 == 0) goto L_0x03e9
            boolean r2 = r5.A0K(r3)
            if (r2 == 0) goto L_0x044d
            goto L_0x03e9
        L_0x044d:
            r12 = 0
            goto L_0x03ea
        L_0x044f:
            X.3hk r8 = X.C63533hk.A02(r14)
            X.3LL r2 = new X.3LL
            r2.<init>()
            java.lang.String r11 = r14.getUserId()
            boolean r6 = r8.A0I(r11)
            r3 = 1
            if (r6 == 0) goto L_0x0490
            boolean r4 = r0.A0E()
            if (r4 != 0) goto L_0x04a1
            X.C63723iC.A09(r0, r3)
        L_0x046c:
            if (r13 == 0) goto L_0x0176
            if (r12 == 0) goto L_0x0176
            android.content.SharedPreferences r6 = r7.A00
            java.lang.String r4 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            boolean r0 = X.C18190wL.A1X(r6, r4)
            if (r0 != 0) goto L_0x0176
            X.2A8 r2 = X.AnonymousClass2A8.A0D
            X.C04220Ms.A0B(r2, r3)
            X.2A9 r1 = X.AnonymousClass2A9.A09
            X.29h r0 = X.C318729h.CAL_FLOW
            X.C62383Zj.A00(r0, r1, r2, r14, r5)
            android.content.SharedPreferences$Editor r0 = r6.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r3)
            goto L_0x01fd
        L_0x0490:
            boolean r10 = r8.A0H()
            r6 = 0
            boolean r9 = r0.A0E()
            if (r10 != 0) goto L_0x04b4
            if (r9 != 0) goto L_0x04a1
            X.C63723iC.A09(r0, r6)
            goto L_0x046c
        L_0x04a1:
            java.lang.String r15 = "logout_password_saving_not_viewed"
            java.lang.String r16 = "logout_spi"
            java.lang.String r17 = "spi"
            java.lang.String r18 = "logout_interaction"
            r19 = r1
            r20 = r1
            X.AnonymousClass3LL.A00(r14, r15, r16, r17, r18, r19, r20)
            X.C63723iC.A01(r2, r0, r3)
            goto L_0x046c
        L_0x04b4:
            if (r9 == 0) goto L_0x0503
            java.lang.String r15 = "logout_password_saving_viewed"
            java.lang.String r16 = "logout_spi"
            java.lang.String r17 = "spi"
            java.lang.String r18 = "logout_interaction"
            r19 = r1
            r20 = r1
            X.AnonymousClass3LL.A00(r14, r15, r16, r17, r18, r19, r20)
            X.Dsm r9 = X.C18190wL.A0W(r4)
            r1 = 2131822817(0x7f1108e1, float:1.9278416E38)
            r9.A0L(r1)
            r10 = 2131822814(0x7f1108de, float:1.927841E38)
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r14)
            java.lang.String r1 = r1.BK7()
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r4, r1, r10)
            r9.A0p(r1)
            r4 = 2131822816(0x7f1108e0, float:1.9278414E38)
            r1 = 32
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r1 = X.C18250wR.A0E(r0, r2, r8, r1)
            r9.A0P(r1, r4)
            r4 = 2131822815(0x7f1108df, float:1.9278412E38)
            r1 = 35
            X.C18230wP.A1M(r9, r0, r2, r1, r4)
            android.app.Dialog r1 = r9.A0G()
            X.C13950oZ.A00(r1)     // Catch:{ BadTokenException -> 0x04fe }
            goto L_0x046c
        L_0x04fe:
            X.C63723iC.A01(r2, r0, r6)
            goto L_0x046c
        L_0x0503:
            boolean r1 = r8.A0J(r11)
            if (r1 != 0) goto L_0x0526
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 18296294393118938(0x410062000200da, double:1.8914791442530256E-307)
            boolean r1 = X.C63173fJ.A05(r4, r1)
            if (r1 != 0) goto L_0x055e
            r1 = 18296294393184475(0x410062000300db, double:1.8914791442789292E-307)
            boolean r1 = X.C63173fJ.A05(r4, r1)
            if (r1 != 0) goto L_0x055e
            X.C63723iC.A08(r0, r3)
            goto L_0x046c
        L_0x0526:
            boolean r9 = r8.A0K(r11)
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r1 = 18296294393118938(0x410062000200da, double:1.8914791442530256E-307)
            boolean r1 = X.C63173fJ.A05(r8, r1)
            if (r1 != 0) goto L_0x0543
            r1 = 18296294393184475(0x410062000300db, double:1.8914791442789292E-307)
            boolean r2 = X.C63173fJ.A05(r8, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0544
        L_0x0543:
            r1 = 1
        L_0x0544:
            if (r9 == 0) goto L_0x0552
            if (r1 == 0) goto L_0x054d
            X.C63723iC.A07(r0, r6)
            goto L_0x046c
        L_0x054d:
            X.C63723iC.A08(r0, r6)
            goto L_0x046c
        L_0x0552:
            if (r1 != 0) goto L_0x055e
            r4.getApplicationContext()
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.C63723iC.A05(r0, r1)
            goto L_0x046c
        L_0x055e:
            X.C63723iC.A07(r0, r3)
            goto L_0x046c
        L_0x0563:
            java.lang.String r15 = "logout_password_saving_multiaccount_not_viewed"
            java.lang.String r16 = "logout_spi"
            java.lang.String r17 = "spi"
            java.lang.String r18 = "logout_interaction"
            r19 = r1
            r20 = r1
            X.AnonymousClass3LL.A00(r14, r15, r16, r17, r18, r19, r20)
        L_0x0572:
            boolean r1 = X.C63723iC.A0A(r0, r2)
            if (r1 != 0) goto L_0x0176
            X.C63723iC.A02(r0)
            return
        L_0x057c:
            X.3GU r1 = r0.A05
            r0 = 1
            r1.A01(r14, r4, r0)
            return
        L_0x0583:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0583 }
            throw r0
        L_0x0586:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0586 }
            throw r0
        L_0x0589:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0589 }
            throw r0
        L_0x058c:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x058c }
            throw r0
        L_0x058f:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x058f }
            throw r0
        L_0x0592:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0592 }
            throw r0
        L_0x0595:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0595 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SP.run():void");
    }
}

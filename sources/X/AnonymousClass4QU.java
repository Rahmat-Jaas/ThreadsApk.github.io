package X;

/* renamed from: X.4QU  reason: invalid class name */
public final class AnonymousClass4QU implements Runnable {
    public final /* synthetic */ AnonymousClass4TP A00;

    public AnonymousClass4QU(AnonymousClass4TP r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0271, code lost:
        if (r0 != false) goto L_0x0273;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r0 = r24
            X.4TP r6 = r0.A00
            X.49j r1 = r6.A01
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0031
            boolean r0 = X.C691847d.A04
            if (r0 == 0) goto L_0x0031
            X.24O r2 = r6.A00
            X.24O r0 = X.AnonymousClass24O.TAKE_A_BREAK
            if (r2 != r0) goto L_0x0030
            com.instagram.service.session.UserSession r2 = r1.A02
            long r4 = X.C696349j.A01(r1)
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Integer r3 = X.AnonymousClass006.A0F
        L_0x0020:
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r4 = 0
            java.lang.String r8 = "take_break"
            r9 = 1
            r5 = r4
            r6 = r4
            X.C63583hq.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            X.C696349j.A09(r1, r0)
        L_0x0030:
            return
        L_0x0031:
            r3 = 0
            r1.A04 = r3
            r0 = 0
            X.H5O r2 = X.H5O.A01()     // Catch:{ ClassCastException | IndexOutOfBoundsException -> 0x003d }
            androidx.fragment.app.FragmentActivity r0 = r2.A06()     // Catch:{ ClassCastException | IndexOutOfBoundsException -> 0x003d }
        L_0x003d:
            if (r0 != 0) goto L_0x0052
            X.24O r2 = r6.A00
            X.24O r0 = X.AnonymousClass24O.TAKE_A_BREAK
            if (r2 != r0) goto L_0x0030
            com.instagram.service.session.UserSession r2 = r1.A02
            long r4 = X.C696349j.A01(r1)
            r0 = 0
            X.C04220Ms.A0B(r2, r3)
            java.lang.Integer r3 = X.AnonymousClass006.A0E
            goto L_0x0020
        L_0x0052:
            com.instagram.service.session.UserSession r2 = r1.A02
            if (r2 == 0) goto L_0x0076
            X.24O r8 = r6.A00
            int r5 = r8.ordinal()
            if (r5 == r3) goto L_0x00bd
            r7 = 1
            if (r5 == r7) goto L_0x00a8
            r4 = 2
            if (r5 == r4) goto L_0x009a
            r4 = 3
            if (r5 == r4) goto L_0x009a
            r4 = 4
            if (r5 != r4) goto L_0x0076
            X.C63433hT.A03(r0)
        L_0x006d:
            java.lang.String r7 = r8.A00
            long r4 = X.C696349j.A01(r1)
            X.C63583hq.A05(r2, r7, r4)
        L_0x0076:
            X.24O r7 = r6.A00
            int r8 = r7.ordinal()
            java.lang.String r15 = "time_up_animation"
            if (r8 == r3) goto L_0x012c
            r10 = 1
            if (r8 == r10) goto L_0x021d
            r4 = 2
            if (r8 == r4) goto L_0x00d6
            r4 = 3
            if (r8 == r4) goto L_0x03cc
            r4 = 4
            if (r8 == r4) goto L_0x023a
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r7.A00
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "TimeSpentReminderRunnable_launchReminderExperience"
            X.C10450iM.A03(r0, r1)
            return
        L_0x009a:
            java.lang.String r4 = r8.A00
            java.lang.Integer r8 = X.AnonymousClass006.A02
            r9 = 0
            r7 = r2
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r4
            X.C63583hq.A03(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0076
        L_0x00a8:
            long r4 = X.C696349j.A01(r1)
            java.lang.Integer r9 = X.AnonymousClass006.A0I
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r10 = 0
            java.lang.String r14 = "take_break"
            r8 = r2
            r11 = r10
            r12 = r10
            r15 = r7
            X.C63583hq.A04(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0076
        L_0x00bd:
            boolean r4 = X.C63043bN.A02(r2)
            if (r4 == 0) goto L_0x00c9
            X.C63433hT.A03(r0)
            X.24O r8 = X.AnonymousClass24O.GUARDIAN_DAILY_LIMIT_REMINDER
            goto L_0x006d
        L_0x00c9:
            java.lang.Integer r8 = X.AnonymousClass006.A02
            r9 = 0
            java.lang.String r13 = "daily_limit"
            r7 = r2
            r10 = r9
            r11 = r9
            r12 = r9
            X.C63583hq.A03(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0076
        L_0x00d6:
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r4 = 36322370918554945(0x810b0100001d41, double:3.033751855117761E-306)
            boolean r4 = X.C63803iN.A0E(r7, r2, r4)
            if (r4 == 0) goto L_0x0124
            boolean r4 = X.C09650fs.A02(r0)
            if (r4 != 0) goto L_0x00f9
            boolean r4 = X.C09650fs.A04(r0)
            if (r4 == 0) goto L_0x0120
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r2)
            boolean r2 = r2.A37()
            if (r2 == 0) goto L_0x0120
        L_0x00f9:
            r4 = 2131836809(0x7f113f89, float:1.9306795E38)
            r2 = 2131820557(0x7f11000d, float:1.9273832E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r4 = X.AnonymousClass0wJ.A0l(r0, r2, r4)
        L_0x0107:
            X.Dsm r9 = X.C18190wL.A0W(r0)
            r2 = 2131231938(0x7f0804c2, float:1.8079971E38)
            X.C18230wP.A11(r0, r9, r2)
            r9.A02 = r4
            r2 = 2131828135(0x7f111da7, float:1.9289202E38)
            X.C18220wO.A14(r0, r9, r2)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 193(0xc1, float:2.7E-43)
            goto L_0x0423
        L_0x0120:
            r2 = 2131828137(0x7f111da9, float:1.9289206E38)
            goto L_0x0127
        L_0x0124:
            r2 = 2131828136(0x7f111da8, float:1.9289204E38)
        L_0x0127:
            java.lang.String r4 = r0.getString(r2)
            goto L_0x0107
        L_0x012c:
            boolean r4 = X.C63043bN.A02(r2)
            if (r4 != 0) goto L_0x023a
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131233192(0x7f0809a8, float:1.8082515E38)
            android.graphics.drawable.Drawable r4 = X.C30845GYu.A00(r5, r4)
            X.Dsm r9 = X.C18190wL.A0W(r0)
            r7 = 1
            r9.A0g(r4)
            boolean r4 = X.C696349j.A0D(r1)
            if (r4 == 0) goto L_0x0198
            r4 = 2131824729(0x7f111059, float:1.9282294E38)
            java.lang.String r4 = r0.getString(r4)
        L_0x0152:
            r9.A02 = r4
            boolean r4 = X.C696349j.A0D(r1)
            if (r4 == 0) goto L_0x0190
            r8 = 2131824727(0x7f111057, float:1.928229E38)
            android.content.res.Resources r7 = r0.getResources()
            X.3am r4 = X.C63043bN.A01
            long r4 = r4.A04(r2)
            java.lang.String r2 = X.C60653Py.A01(r7, r4)
            java.lang.String r2 = X.AnonymousClass0wJ.A0l(r0, r2, r8)
        L_0x016f:
            r9.A0p(r2)
            r9.A0r(r3)
            r3 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r2 = 195(0xc3, float:2.73E-43)
            X.C18180wK.A1O(r9, r6, r2, r3)
            boolean r2 = X.C696349j.A0D(r1)
            r3 = 2131824723(0x7f111053, float:1.9282282E38)
            if (r2 == 0) goto L_0x0189
            r3 = 2131824728(0x7f111058, float:1.9282292E38)
        L_0x0189:
            r2 = 82
            X.C18230wP.A1M(r9, r6, r0, r2, r3)
            goto L_0x0429
        L_0x0190:
            r2 = 2131824722(0x7f111052, float:1.928228E38)
            java.lang.String r2 = r0.getString(r2)
            goto L_0x016f
        L_0x0198:
            r8 = 2131824724(0x7f111054, float:1.9282284E38)
            android.content.res.Resources r5 = r0.getResources()
            X.3am r4 = X.C63043bN.A01
            long r13 = r4.A04(r2)
            X.C04220Ms.A0B(r5, r7)
            r4 = 2131828376(0x7f111e98, float:1.9289691E38)
            java.lang.String r12 = X.C18190wL.A0g(r5, r4)
            r4 = 2131830528(0x7f112700, float:1.9294056E38)
            java.lang.String r11 = X.C18190wL.A0g(r5, r4)
            r20 = 60
            long r18 = r13 / r20
            r16 = 0
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x01c8
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x01c8
            r4 = 1
            long r18 = r18 + r4
        L_0x01c8:
            long r13 = r18 / r20
            long r18 = r18 % r20
            r10 = 2
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x01f9
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x01f9
            java.util.Locale r7 = java.util.Locale.getDefault()
            r10 = 4
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r12, r4, r11}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r4, r10)
            java.lang.String r4 = "%d%s %d%s"
            java.lang.String r4 = java.lang.String.format(r7, r4, r5)
        L_0x01f0:
            X.C04220Ms.A06(r4)
            java.lang.String r4 = X.AnonymousClass0wJ.A0l(r0, r4, r8)
            goto L_0x0152
        L_0x01f9:
            java.lang.String r7 = "%d%s"
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            java.util.Locale r5 = java.util.Locale.getDefault()
            if (r4 <= 0) goto L_0x0214
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r12}
        L_0x020b:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r10)
            java.lang.String r4 = java.lang.String.format(r5, r7, r4)
            goto L_0x01f0
        L_0x0214:
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r11}
            goto L_0x020b
        L_0x021d:
            r4 = 0
            r1.A00 = r4
            X.0TJ r9 = X.AnonymousClass0TJ.A05
            r4 = 36316134626626534(0x81055500090be6, double:3.029807998990702E-306)
            boolean r4 = X.C63803iN.A0E(r9, r2, r4)
            if (r4 == 0) goto L_0x02e8
            X.C63433hT.A03(r0)
            java.lang.String r6 = r7.A00
            long r4 = X.C696349j.A01(r1)
            X.C63583hq.A05(r2, r6, r4)
        L_0x023a:
            android.os.Bundle r9 = X.C18180wK.A06()
            java.lang.String r5 = r7.toString()
            java.lang.String r4 = "reminder_type"
            r9.putString(r4, r5)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.content.Intent r6 = X.C18250wR.A04(r0, r4)
            java.lang.String r5 = "fragment_name"
            java.lang.String r4 = "time_spent_fully_blocking_screen"
            android.content.Intent r5 = r6.putExtra(r5, r4)
            java.lang.String r4 = "fragment_arguments"
            android.content.Intent r5 = r5.putExtra(r4, r9)
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r5.setFlags(r4)
            X.C10650ih.A02(r0, r5)
            monitor-enter(r1)
            if (r8 == r3) goto L_0x02e0
            r0 = 2
            if (r8 == r0) goto L_0x02de
            r0 = 3
            if (r8 == r0) goto L_0x02de
            r0 = 4
            if (r8 == r0) goto L_0x02de
            r0 = 0
        L_0x0270:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x02ba
        L_0x0273:
            r5 = 5
            r9 = 1
            if (r8 == r3) goto L_0x02ca
            if (r8 == r9) goto L_0x02ca
            r0 = 2
            if (r8 == r0) goto L_0x02ca
            java.lang.String r4 = "cancel"
            X.4t9 r0 = X.C63193gy.A01(r2)
            if (r0 == 0) goto L_0x02ad
            java.lang.Integer r8 = r0.Afm()
            java.lang.Integer r0 = X.C63193gy.A03(r0, r2)
            if (r0 == 0) goto L_0x029a
            int r3 = r0.intValue()
            r0 = 86400(0x15180, float:1.21072E-40)
            int r3 = r3 + r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
        L_0x029a:
            if (r8 == 0) goto L_0x02ad
            long r5 = X.AnonymousClass0wJ.A0A()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r3
            int r0 = r8.intValue()
            long r3 = (long) r0
            long r5 = r5 + r3
        L_0x02a9:
            java.lang.String r4 = java.lang.String.valueOf(r5)
        L_0x02ad:
            java.lang.String r0 = "mute_all"
            X.H8c r3 = X.AnonymousClass3OP.A01(r2, r0, r4)
            r2 = 604052308(0x24011b54, float:2.7995564E-17)
            r0 = 3
            X.C31155GhB.A05(r3, r2, r0, r9, r9)
        L_0x02ba:
            r1.A03 = r7
            android.os.Handler r3 = r1.A0C
            java.lang.Runnable r2 = r1.A0E
            r3.removeCallbacks(r2)
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)
            return
        L_0x02ca:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r0 = 11
            r4.set(r0, r3)
            X.C18190wL.A1W(r4)
            r4.add(r5, r9)
            long r5 = X.C18210wN.A07(r4)
            goto L_0x02a9
        L_0x02de:
            monitor-exit(r1)
            goto L_0x0273
        L_0x02e0:
            boolean r0 = X.C63043bN.A02(r2)     // Catch:{ all -> 0x02e5 }
            goto L_0x0270
        L_0x02e5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02e8:
            long r4 = X.C696349j.A01(r1)
            X.C04220Ms.A0B(r2, r3)
            java.lang.Integer r17 = X.AnonymousClass006.A0I
            java.lang.Long r21 = java.lang.Long.valueOf(r4)
            r18 = 0
            java.lang.String r22 = "take_break"
            r16 = r2
            r19 = r18
            r20 = r18
            r23 = r10
            X.C63583hq.A04(r16, r17, r18, r19, r20, r21, r22, r23)
            com.instagram.service.session.UserSession r4 = r1.A02
            r7 = 36316134626102240(0x81055500010be0, double:3.029807998659136E-306)
            boolean r4 = X.C63803iN.A0E(r9, r4, r7)
            long r16 = X.C18240wQ.A08(r4)
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            android.content.res.Resources r14 = r0.getResources()
            X.3am r13 = X.C63043bN.A01
            long r4 = r13.A05(r2)
            long r4 = r4 / r16
            int r12 = (int) r4
            com.instagram.service.session.UserSession r4 = r1.A02
            boolean r4 = X.C63803iN.A0E(r9, r4, r7)
            java.lang.String r5 = X.C60653Py.A00(r14, r12, r4, r3)
            java.lang.String r4 = "num_break_mins"
            r11.put(r4, r5)
            long r4 = r13.A05(r2)
            int r7 = (int) r4
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r4 = "user_break_setting"
            r11.put(r4, r5)
            androidx.fragment.app.Fragment r4 = X.C696349j.A0F
            if (r4 == 0) goto L_0x035b
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L_0x035b
            java.lang.Integer r1 = X.AnonymousClass006.A0G
            r0 = r2
            r2 = r18
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r22
            r7 = r10
            X.C63583hq.A04(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0435
        L_0x035b:
            java.lang.String r4 = "com.instagram.mental_well_being.take_a_break_tips_screen.component"
            X.3iE r7 = X.C63743iE.A02(r4, r11)
            com.instagram.bloks.hosting.IgBloksScreenConfig r5 = X.C18190wL.A0N(r2)
            java.lang.String r4 = ""
            r5.A0S = r4
            r5.A0f = r10
            r5.A0h = r3
            r5.A0g = r3
            com.instagram.wellbeing.timespent.listeners.InstagramTimeSpentLogger$TimeSpentReminderRunnable$7 r4 = new com.instagram.wellbeing.timespent.listeners.InstagramTimeSpentLogger$TimeSpentReminderRunnable$7
            r4.<init>(r0, r6)
            r5.A06 = r4
            com.instagram.wellbeing.timespent.listeners.InstagramTimeSpentLogger$TimeSpentReminderRunnable$6 r4 = new com.instagram.wellbeing.timespent.listeners.InstagramTimeSpentLogger$TimeSpentReminderRunnable$6
            r4.<init>(r6)
            r5.A04 = r4
            java.lang.String r4 = "TAB_BREAKMODE"
            r5.A0Q = r4
            r5.A0e = r10
            X.1c8 r4 = X.C62853b1.A02(r5, r7)
            X.C696349j.A0F = r4
            java.lang.Integer r17 = X.AnonymousClass006.A0H     // Catch:{ IllegalArgumentException -> 0x039f }
            r16 = r2
            r21 = r18
            X.C63583hq.A04(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IllegalArgumentException -> 0x039f }
            X.Drz r5 = X.AnonymousClass0wJ.A0Q(r0, r2)     // Catch:{ IllegalArgumentException -> 0x039f }
            androidx.fragment.app.Fragment r4 = X.C696349j.A0F     // Catch:{ IllegalArgumentException -> 0x039f }
            r5.A03 = r4     // Catch:{ IllegalArgumentException -> 0x039f }
            r5.A05()     // Catch:{ IllegalArgumentException -> 0x039f }
            goto L_0x0435
        L_0x039f:
            r4 = move-exception
            java.lang.Integer r17 = X.AnonymousClass006.A02     // Catch:{ Exception -> 0x03ba }
            r16 = r2
            r21 = r18
            X.C63583hq.A04(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x03ba }
            X.Dsm r0 = X.AnonymousClass4TP.A00(r0, r6)     // Catch:{ Exception -> 0x03ba }
            android.app.Dialog r0 = r0.A0G()     // Catch:{ Exception -> 0x03ba }
            X.C696349j.A06(r1)     // Catch:{ Exception -> 0x03ba }
            r1.A01 = r0     // Catch:{ Exception -> 0x03ba }
            X.C13950oZ.A00(r0)     // Catch:{ Exception -> 0x03ba }
            goto L_0x0435
        L_0x03ba:
            X.C696349j.A09(r1, r3)
            java.lang.Integer r17 = X.AnonymousClass006.A0L
            r16 = r2
            r21 = r18
            X.C63583hq.A04(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = "InstagramTimeSpentLogger_launchBreakModeBloksAction"
            X.C10450iM.A07(r0, r4)
            goto L_0x0435
        L_0x03cc:
            X.4t9 r5 = X.C63193gy.A02(r2)
            if (r5 != 0) goto L_0x045e
            r8 = 0
        L_0x03d3:
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r4 = 36322370918554945(0x810b0100001d41, double:3.033751855117761E-306)
            boolean r4 = X.C63803iN.A0E(r7, r2, r4)
            if (r4 == 0) goto L_0x0456
            boolean r4 = X.C09650fs.A02(r0)
            if (r4 != 0) goto L_0x03f6
            boolean r4 = X.C09650fs.A04(r0)
            if (r4 == 0) goto L_0x0452
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r2)
            boolean r2 = r2.A37()
            if (r2 == 0) goto L_0x0452
        L_0x03f6:
            r4 = 2131836809(0x7f113f89, float:1.9306795E38)
            r2 = 2131820557(0x7f11000d, float:1.9273832E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r4 = X.AnonymousClass0wJ.A0l(r0, r2, r4)
        L_0x0404:
            X.Dsm r9 = X.C18190wL.A0W(r0)
            r2 = 2131231938(0x7f0804c2, float:1.8079971E38)
            X.C18230wP.A11(r0, r9, r2)
            r9.A02 = r4
            r12 = 2131835252(0x7f113974, float:1.9303637E38)
            if (r8 != 0) goto L_0x043f
            java.lang.String r2 = ""
        L_0x0417:
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r0, r2, r12)
            r9.A0p(r0)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 194(0xc2, float:2.72E-43)
        L_0x0423:
            X.C18180wK.A1O(r9, r6, r0, r2)
            r9.A0r(r3)
        L_0x0429:
            android.app.Dialog r0 = r9.A0G()
            X.C696349j.A06(r1)
            r1.A01 = r0
            X.C13950oZ.A00(r0)
        L_0x0435:
            r2 = 38797313(0x2500001, float:1.5281428E-37)
            java.lang.String r1 = "Animation Type"
            r0 = 1
            X.C62493a7.A01(r1, r15, r2, r0)
            return
        L_0x043f:
            long r4 = X.AnonymousClass0wJ.A0A()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r10
            int r2 = r8.intValue()
            long r7 = (long) r2
            long r4 = r4 + r7
            long r4 = r4 * r10
            java.lang.String r2 = X.C31171Ghr.A07(r0, r4)
            goto L_0x0417
        L_0x0452:
            r2 = 2131835254(0x7f113976, float:1.9303641E38)
            goto L_0x0459
        L_0x0456:
            r2 = 2131835253(0x7f113975, float:1.930364E38)
        L_0x0459:
            java.lang.String r4 = r0.getString(r2)
            goto L_0x0404
        L_0x045e:
            java.lang.Integer r4 = r5.Afm()
            java.lang.Integer r8 = X.C63193gy.A03(r5, r2)
            if (r8 != 0) goto L_0x03d3
            r8 = r4
            goto L_0x03d3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QU.run():void");
    }
}

package X;

/* renamed from: X.4P7  reason: invalid class name */
public final class AnonymousClass4P7 implements Runnable {
    public final /* synthetic */ C27051rr A00;

    public AnonymousClass4P7(C27051rr r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0078, code lost:
        if (r5 == -602962448) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        if (r5 != 2591) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
        r0 = r8.equals("QP");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        if (r0 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        r6.A0C = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0086, code lost:
        r6.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        r0 = r8.equals("MONETIZATION_INBOX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008f, code lost:
        r0 = r8.equals("NOTIFICATION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        r0 = r8.equals("SETTINGS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        if (r12.equals(r0) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        r6.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        if (r12.equals("MONETIZATION_INBOX") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        if (r0 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        r7.A11(r12, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0062, code lost:
        r7.A0d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0065, code lost:
        r6 = X.AnonymousClass0wJ.A0Q(r6, r11);
        r6.A03 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006e, code lost:
        if (r5 == -2077709277) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        if (r5 == -1382453013) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.1rr r3 = r14.A00
            com.instagram.service.session.UserSession r11 = r3.A09()
            r13 = 1
            X.0Oa r4 = r3.A05
            java.lang.String r1 = X.C18200wM.A0q(r4)
            java.util.Locale r0 = java.util.Locale.US
            X.C04220Ms.A08(r0)
            java.lang.String r1 = X.C18190wL.A0r(r0, r1)
            java.lang.String r0 = "entry_point"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            r10 = 0
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            java.util.HashMap r1 = X.AnonymousClass4WJ.A09(r0)
            java.lang.String r0 = "com.bloks.www.ig.bonus.bonus-settings"
            X.3iE r2 = X.C63743iE.A02(r0, r1)
            com.instagram.service.session.UserSession r0 = r3.A09()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r0)
            r0 = 2131829051(0x7f11213b, float:1.929106E38)
            X.C18230wP.A1A(r3, r1, r0)
            X.1c8 r9 = X.C62853b1.A02(r1, r2)
            java.lang.String r12 = X.C18200wM.A0q(r4)
            r8 = r12
            X.C18180wK.A1P(r11, r10, r12)
            X.0m7 r7 = r3.getParentFragmentManager()
            boolean r0 = r7.A15()
            if (r0 != 0) goto L_0x0089
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            int r5 = r12.hashCode()
            java.lang.String r4 = "QP"
            java.lang.String r3 = "MONETIZATION_INBOX"
            java.lang.String r2 = "NOTIFICATION"
            java.lang.String r1 = "SETTINGS"
            switch(r5) {
                case -2077709277: goto L_0x00bf;
                case -1382453013: goto L_0x00b8;
                case -602962448: goto L_0x00ac;
                case 2591: goto L_0x00b3;
                case 523908395: goto L_0x00a0;
                case 1915236889: goto L_0x0099;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7.A0d()
        L_0x0065:
            X.Drz r6 = X.AnonymousClass0wJ.A0Q(r6, r11)
            r6.A03 = r9
            r0 = -2077709277(0xffffffff8428ac23, float:-1.9827346E-36)
            if (r5 == r0) goto L_0x0094
            r0 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r5 == r0) goto L_0x008f
            r0 = -602962448(0xffffffffdc0f85f0, float:-1.6159275E17)
            if (r5 == r0) goto L_0x008a
            r0 = 2591(0xa1f, float:3.631E-42)
            if (r5 != r0) goto L_0x0084
            boolean r0 = r8.equals(r4)
        L_0x0082:
            if (r0 != 0) goto L_0x0086
        L_0x0084:
            r6.A0C = r10
        L_0x0086:
            r6.A05()
        L_0x0089:
            return
        L_0x008a:
            boolean r0 = r8.equals(r3)
            goto L_0x0082
        L_0x008f:
            boolean r0 = r8.equals(r2)
            goto L_0x0082
        L_0x0094:
            boolean r0 = r8.equals(r1)
            goto L_0x0082
        L_0x0099:
            r0 = 40
            java.lang.String r0 = X.I17.A00(r0)
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r0 = "POST_LIVE"
        L_0x00a2:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0062
            r6.finish()
            goto L_0x0065
        L_0x00ac:
            boolean r0 = r12.equals(r3)
            if (r0 == 0) goto L_0x0062
            goto L_0x00c7
        L_0x00b3:
            boolean r0 = r12.equals(r4)
            goto L_0x00bc
        L_0x00b8:
            boolean r0 = r12.equals(r2)
        L_0x00bc:
            if (r0 != 0) goto L_0x00c7
            goto L_0x0062
        L_0x00bf:
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x0062
            java.lang.String r12 = X.C67193z5.A0A
        L_0x00c7:
            r7.A11(r12, r13)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P7.run():void");
    }
}

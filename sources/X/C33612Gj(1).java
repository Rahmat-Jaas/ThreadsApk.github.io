package X;

/* renamed from: X.2Gj  reason: invalid class name and case insensitive filesystem */
public final class C33612Gj {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        r5.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        r5.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        r1 = r2.getString(r0);
        r0 = r3.A00;
        r0.A0S = r1;
        r3.A01();
        r5.A0C(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.AnonymousClass601 r5, X.C63893iY r6) {
        /*
            r3 = 0
            java.lang.Object r1 = X.C63893iY.A0B(r6, r3)
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.service.session.UserSession r4 = X.C63913ic.A0J(r5)
            X.C04220Ms.A0B(r5, r3)
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r5)
            boolean r5 = X.AnonymousClass0wJ.A1Z(r4, r2)
            if (r1 == 0) goto L_0x0022
            int r0 = r1.hashCode()
            switch(r0) {
                case -1102697448: goto L_0x00af;
                case -385502252: goto L_0x0090;
                case -250538715: goto L_0x007b;
                case -54704478: goto L_0x0053;
                case 763636605: goto L_0x0037;
                case 1950650808: goto L_0x002b;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.String r1 = "SafetyCheckUtil"
            java.lang.String r0 = "Invalid Safety Option Selected."
            X.C10450iM.A03(r1, r0)
        L_0x0029:
            r0 = 0
            return r0
        L_0x002b:
            java.lang.String r0 = "tag_control"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.C54522za.A00(r2, r4)
            goto L_0x0029
        L_0x0037:
            java.lang.String r0 = "comment_control"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.settings.privacy.comments"
            X.3iE r5 = X.C63743iE.A02(r0, r1)
            X.3Yl r3 = new X.3Yl
            r3.<init>(r4)
            r0 = 2131824171(0x7f110e2b, float:1.9281162E38)
            goto L_0x00e5
        L_0x0053:
            java.lang.String r0 = "two_factor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.3Hi r1 = X.C62653aT.A01()
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            androidx.fragment.app.Fragment r3 = r1.A01(r0, r3, r3)
            X.Drz r5 = X.C18180wK.A0Q(r2, r4)
            r2 = 184(0xb8, float:2.58E-43)
            r1 = 24
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.C61973Wo.A01(r2, r1, r0)
            r5.A07 = r0
            r5.A03 = r3
            r5.A08()
            goto L_0x00aa
        L_0x007b:
            java.lang.String r0 = "message_control"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.C18190wL.A10()
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = new com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment
            r0.<init>()
            X.Drz r5 = X.AnonymousClass0wJ.A0Q(r2, r4)
            goto L_0x00a8
        L_0x0090:
            java.lang.String r0 = "hidden_words"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.Drz r5 = X.AnonymousClass0wJ.A0Q(r2, r4)
            X.36r r0 = X.C35372Ne.A00()
            X.3Dh r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            androidx.fragment.app.Fragment r0 = r1.A00(r2, r4, r0)
        L_0x00a8:
            r5.A03 = r0
        L_0x00aa:
            r5.A05()
            goto L_0x0029
        L_0x00af:
            java.lang.String r0 = "limits"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = "step"
            java.lang.String r0 = "0"
            kotlin.Pair r3 = X.C18180wK.A0p(r1, r0)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r4)
            java.lang.String r0 = "limited_interactions_should_show_nux"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r1 = "False"
        L_0x00cd:
            java.lang.String r0 = "has_seen_nux_before"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.HashMap r1 = X.AnonymousClass4WJ.A08(r3, r0)
            java.lang.String r0 = "com.instagram.bullying.privacy.limits_entrypoint"
            X.3iE r5 = X.C63743iE.A02(r0, r1)
            X.3Yl r3 = new X.3Yl
            r3.<init>(r4)
            r0 = 2131829643(0x7f11238b, float:1.929226E38)
        L_0x00e5:
            java.lang.String r1 = r2.getString(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r3.A00
            r0.A0S = r1
            r3.A01()
            r5.A0C(r2, r0)
            goto L_0x0029
        L_0x00f5:
            java.lang.String r1 = "True"
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33612Gj.A00(X.601, X.3iY):java.lang.Object");
    }
}

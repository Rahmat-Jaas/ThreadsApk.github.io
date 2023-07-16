package X;

/* renamed from: X.3Ks  reason: invalid class name and case insensitive filesystem */
public final class C59413Ks {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r0.ABX(r11) != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.fragment.app.FragmentActivity r11, X.C11630kW r12, X.AnonymousClass3HX r13, X.AnonymousClass601 r14, X.C127397h3 r15) {
        /*
            r10 = 0
            boolean r9 = X.AnonymousClass0wJ.A1Z(r11, r12)
            r0 = 4
            r8 = 3
            X.C04220Ms.A0B(r15, r0)
            X.Dsm r7 = X.C18190wL.A0W(r11)
            r6 = 40
            boolean r0 = r15.A0T(r6, r9)
            r7.A0q(r0)
            r5 = 38
            boolean r0 = r15.A0T(r5, r10)
            r7.A0r(r0)
            r0 = 45
            java.lang.String r1 = r15.A0N(r0)
            if (r1 == 0) goto L_0x0030
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0030
            r7.A02 = r1
        L_0x0030:
            r4 = 48
            X.7h3 r3 = r15.A0K(r4)
            r2 = 36
            if (r3 == 0) goto L_0x00e8
            java.lang.String r1 = r3.A0N(r5)
            if (r1 == 0) goto L_0x00e8
            if (r13 == 0) goto L_0x005b
            boolean r0 = r13.A03
            if (r0 != r9) goto L_0x005b
        L_0x0046:
            java.lang.String r1 = r3.A0O(r6, r1)
        L_0x004a:
            com.instagram.common.typedurl.SimpleImageUrl r6 = X.C18250wR.A0K(r1)
            java.lang.String r1 = r3.A0N(r2)
            if (r1 == 0) goto L_0x00b3
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b3
            goto L_0x006e
        L_0x005b:
            X.7qT r0 = X.C63913ic.A08(r14)
            X.76t r0 = r0.A04
            X.4pC r0 = r0.A02
            if (r0 != 0) goto L_0x0067
            X.4pC r0 = X.C1197476t.A07
        L_0x0067:
            boolean r0 = r0.ABX(r11)
            if (r0 == 0) goto L_0x004a
            goto L_0x0046
        L_0x006e:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x00b6 }
            X.C04220Ms.A08(r0)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            java.lang.String r11 = X.C18220wO.A0u(r0, r1)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            java.lang.String r0 = "SQUARE"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r0 == 0) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00c3
        L_0x0082:
            java.lang.String r0 = "CIRCLE"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r0 == 0) goto L_0x008d
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00c3
        L_0x008d:
            java.lang.String r0 = "RECTANGLE"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r0 == 0) goto L_0x0098
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00c3
        L_0x0098:
            java.lang.String r0 = "FULL_WIDTH"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Integer r0 = X.AnonymousClass006.A0N     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00c3
        L_0x00a3:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Integer r0 = X.AnonymousClass006.A0Y     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00c3
        L_0x00ae:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r11)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00b6 }
        L_0x00b3:
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            goto L_0x00c3
        L_0x00b6:
            java.lang.String r0 = "Dialog header type unknown: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "IGBloksActionNavigationOpenDialogImpl"
            X.C30967GcS.A02(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
        L_0x00c3:
            int r0 = r0.intValue()
            if (r0 == r10) goto L_0x019f
            if (r0 == r9) goto L_0x019a
            r11 = 2
            if (r0 == r11) goto L_0x0192
            if (r0 == r8) goto L_0x017f
            r7.A0o(r6, r12)
            java.lang.String r0 = r3.A0N(r2)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = "Unknown header render type: "
            java.lang.String r0 = r3.A0N(r2)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "IgBloksCustomNavigationExtensions"
            X.C30967GcS.A02(r0, r1)
        L_0x00e8:
            r0 = 41
            java.lang.String r1 = r15.A0N(r0)
            if (r1 == 0) goto L_0x00f9
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00f9
            r7.A0p(r1)
        L_0x00f9:
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r0 = new kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17
            r0.<init>(r13, r4)
            X.0Oa r1 = X.AnonymousClass0OY.A02(r0)
            r0 = 44
            X.7h3 r12 = r15.A0K(r0)
            r8 = 34
            java.lang.String r11 = ""
            if (r12 == 0) goto L_0x0127
            java.lang.String r6 = r12.A0O(r5, r11)
            r0 = 7
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape48S0300000_1_I2
            r4.<init>((X.AnonymousClass601) r14, (X.C127397h3) r12, (X.C04530Oa) r1, (int) r0)
            boolean r3 = r12.A0T(r2, r9)
            java.lang.String r0 = r12.A0N(r8)
            X.25l r0 = A00(r0)
            r7.A0Y(r4, r0, r6, r3)
        L_0x0127:
            r0 = 35
            X.7h3 r12 = r15.A0K(r0)
            if (r12 == 0) goto L_0x0149
            java.lang.String r6 = r12.A0O(r5, r11)
            r0 = 8
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape48S0300000_1_I2
            r4.<init>((X.AnonymousClass601) r14, (X.C127397h3) r12, (X.C04530Oa) r1, (int) r0)
            boolean r3 = r12.A0T(r2, r9)
            java.lang.String r0 = r12.A0N(r8)
            X.25l r0 = A00(r0)
            r7.A0W(r4, r0, r6, r3)
        L_0x0149:
            r0 = 42
            X.7h3 r6 = r15.A0K(r0)
            if (r6 == 0) goto L_0x016b
            java.lang.String r4 = r6.A0O(r5, r11)
            r0 = 9
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape48S0300000_1_I2
            r3.<init>((X.AnonymousClass601) r14, (X.C127397h3) r6, (X.C04530Oa) r1, (int) r0)
            boolean r1 = r6.A0T(r2, r9)
            java.lang.String r0 = r6.A0N(r8)
            X.25l r0 = A00(r0)
            r7.A0X(r3, r0, r4, r1)
        L_0x016b:
            r0 = 43
            X.6jp r1 = r15.A0L(r0)
            if (r1 == 0) goto L_0x017b
            com.facebook.redex.IDxCListenerShape177S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape177S0200000_1_I2
            r0.<init>(r10, r1, r14)
            r7.A0M(r0)
        L_0x017b:
            X.AnonymousClass0wJ.A1K(r7)
            return
        L_0x017f:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.C25828Dsm.A00(r7)
            com.facebook.redex.IDxLListenerShape191S0200000_4_I2 r0 = new com.facebook.redex.IDxLListenerShape191S0200000_4_I2
            r0.<init>(r11, r1, r7)
            r1.A0F = r0
            r1.setUrl(r6, r12)
            r7.A0H()
            goto L_0x00e8
        L_0x0192:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r7.A0I
            r0 = 0
            r1.setImageURL(r6, r12, r0)
            goto L_0x00e8
        L_0x019a:
            r7.A0l(r6, r12)
            goto L_0x00e8
        L_0x019f:
            r7.A0o(r6, r12)
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59413Ks.A01(androidx.fragment.app.FragmentActivity, X.0kW, X.3HX, X.601, X.7h3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r1.equals(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        X.C30967GcS.A02("IgBloksCustomNavigationExtensions", X.AnonymousClass00U.A0L("Unknown button style ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return X.AnonymousClass25l.DEFAULT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass25l A00(java.lang.String r1) {
        /*
            if (r1 == 0) goto L_0x004c
            int r0 = r1.hashCode()
            switch(r0) {
                case -785846925: goto L_0x0017;
                case 112785: goto L_0x0022;
                case 3027034: goto L_0x002d;
                case 1544803905: goto L_0x0038;
                case 1949100874: goto L_0x0041;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "Unknown button style "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "IgBloksCustomNavigationExtensions"
            X.C30967GcS.A02(r0, r1)
            X.25l r0 = X.AnonymousClass25l.DEFAULT
            return r0
        L_0x0017:
            java.lang.String r0 = "red_bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.25l r0 = X.AnonymousClass25l.RED_BOLD
            return r0
        L_0x0022:
            java.lang.String r0 = "red"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.25l r0 = X.AnonymousClass25l.RED
            return r0
        L_0x002d:
            java.lang.String r0 = "blue"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.25l r0 = X.AnonymousClass25l.BLUE
            return r0
        L_0x0038:
            java.lang.String r0 = "default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0009
        L_0x0041:
            java.lang.String r0 = "blue_bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.25l r0 = X.AnonymousClass25l.BLUE_BOLD
            return r0
        L_0x004c:
            X.25l r0 = X.AnonymousClass25l.DEFAULT
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59413Ks.A00(java.lang.String):X.25l");
    }
}

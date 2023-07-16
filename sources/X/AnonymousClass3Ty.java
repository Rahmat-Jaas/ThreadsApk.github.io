package X;

/* renamed from: X.3Ty  reason: invalid class name */
public abstract class AnonymousClass3Ty {
    public static final AnonymousClass3Ty A00 = new C27181s6();

    /* JADX WARNING: type inference failed for: r8v4, types: [com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C34640IcN r27, X.C84634tZ r28, X.C84604tW r29, X.C81574o1 r30, X.C07530bf r31, X.AnonymousClass265 r32) {
        /*
            r26 = this;
            r15 = r26
            r4 = r29
            boolean r0 = r15 instanceof X.C27221sA
            r9 = r27
            r11 = r28
            r14 = r30
            r12 = r31
            r13 = r32
            if (r0 == 0) goto L_0x0081
            r2 = r15
            X.1sA r2 = (X.C27221sA) r2
            X.1s3 r4 = (X.C27151s3) r4
            java.util.concurrent.atomic.AtomicReference r5 = r4.A02
            java.lang.Object r0 = r5.get()
            r0.getClass()
            X.21L r0 = (X.AnonymousClass21L) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0048
            r0 = 1
            if (r1 == r0) goto L_0x005b
            r0 = 2
            if (r1 != r0) goto L_0x0047
            android.content.Context r0 = r9.getContext()
            X.Dsm r2 = X.C18190wL.A0W(r0)
            r0 = 2131826853(0x7f1118a5, float:1.9286602E38)
            r2.A0K(r0)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            r0 = 0
            r2.A0P(r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
        L_0x0047:
            return
        L_0x0048:
            X.3HF r0 = r2.A00
            if (r0 != 0) goto L_0x005b
            X.1vy r1 = new X.1vy
            r1.<init>()
            X.3HF r0 = new X.3HF
            r0.<init>(r9, r1)
            r2.A00 = r0
            r0.A01()
        L_0x005b:
            X.41L r3 = new X.41L
            r6 = r3
            r7 = r9
            r8 = r11
            r9 = r14
            r10 = r2
            r11 = r12
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            monitor-enter(r5)
            java.lang.Object r2 = r5.get()     // Catch:{ all -> 0x007e }
            X.21L r0 = X.AnonymousClass21L.PENDING     // Catch:{ all -> 0x007e }
            r1 = 1
            if (r2 != r0) goto L_0x0077
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A01     // Catch:{ all -> 0x007e }
            r0.add(r3)     // Catch:{ all -> 0x007e }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0047
            r3.apply(r4)
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            boolean r0 = r15 instanceof X.C27201s8
            if (r0 == 0) goto L_0x00af
            X.1s0 r4 = (X.C27121s0) r4
            android.content.Context r5 = r9.requireContext()
            X.3ac r3 = r4.A00
            java.lang.String r2 = r3.A03
            java.lang.String r1 = r3.A05
            java.lang.String r0 = r3.A00()
            X.H8c r2 = X.C63883iV.A04(r5, r12, r2, r1, r0)
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r3.A05
            r18 = 3
            com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2 r8 = new com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2
            r10 = r9
            r16 = r1
            r17 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00a9:
            r2.A00 = r8
            r9.schedule(r2)
            return
        L_0x00af:
            boolean r0 = r15 instanceof X.C27191s7
            if (r0 == 0) goto L_0x010c
            r6 = r15
            X.1s7 r6 = (X.C27191s7) r6
            X.1s1 r4 = (X.C27131s1) r4
            X.0wh r5 = X.C18330wh.A01(r9)
            r0 = 2131830126(0x7f11256e, float:1.929324E38)
            X.C18330wh.A03(r9, r5, r0)
            android.content.Context r8 = r9.getContext()
            java.lang.String r7 = r4.A01
            X.3DU r0 = r4.A00
            java.lang.String r3 = r0.A0A
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r12)
            java.lang.String r0 = "accounts/google_token_login/"
            r2.A0J(r0)
            java.lang.String r1 = X.C09140ev.A00(r8)
            r0 = 0
            java.lang.String r0 = X.C62983bG.A02(r0)
            X.C18180wK.A0t(r8, r2, r0, r1)
            java.lang.String r0 = "nonce"
            r2.A0O(r0, r7)
            X.C18250wR.A17(r2, r3)
            X.H8c r2 = X.C18180wK.A0S(r2)
            androidx.fragment.app.FragmentActivity r16 = r9.getActivity()
            java.lang.Integer r25 = X.AnonymousClass006.A00
            android.net.Uri r17 = X.C67323zM.A01(r9)
            X.1r9 r8 = new X.1r9
            r15 = r8
            r18 = r9
            r19 = r11
            r20 = r6
            r21 = r14
            r22 = r12
            r23 = r5
            r24 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00a9
        L_0x010c:
            boolean r0 = r15 instanceof X.C27211s9
            if (r0 == 0) goto L_0x0130
            r0 = r15
            X.1s9 r0 = (X.C27211s9) r0
            X.1s2 r4 = (X.C27141s2) r4
            X.1jz r6 = r0.A00
            java.lang.String r3 = r4.A02
            java.lang.String r2 = r4.A01
            X.3DU r0 = r4.A00
            java.lang.String r1 = r0.A0A
            X.5rZ r7 = X.AnonymousClass5rZ.A00
            java.lang.String r0 = "login_username_prefill"
            X.5rY r8 = X.C18220wO.A0R(r0)
            r13 = 0
            r9 = r12
            r10 = r3
            r11 = r2
            r12 = r1
            r6.A0A(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0130:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class<X.1s2> r0 = X.C27141s2.class
            if (r1 != r0) goto L_0x015c
            r18 = 0
            X.1jz r1 = new X.1jz
            r15 = r1
            r16 = r9
            r17 = r9
            r19 = r12
            r20 = r13
            r21 = r18
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.1s9 r0 = new X.1s9
            r0.<init>(r1)
        L_0x014f:
            r0.getClass()
            r1 = r9
            r2 = r11
            r3 = r4
            r4 = r14
            r5 = r12
            r6 = r13
            r0.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x015c:
            java.lang.Class<X.1s1> r0 = X.C27131s1.class
            if (r1 != r0) goto L_0x0166
            X.1s7 r0 = new X.1s7
            r0.<init>()
            goto L_0x014f
        L_0x0166:
            java.lang.Class<X.1s0> r0 = X.C27121s0.class
            if (r1 != r0) goto L_0x0170
            X.1s8 r0 = new X.1s8
            r0.<init>()
            goto L_0x014f
        L_0x0170:
            java.lang.Class<X.1s3> r0 = X.C27151s3.class
            if (r1 != r0) goto L_0x017a
            X.1sA r0 = new X.1sA
            r0.<init>()
            goto L_0x014f
        L_0x017a:
            r0 = 0
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ty.A00(X.IcN, X.4tZ, X.4tW, X.4o1, X.0bf, X.265):void");
    }
}

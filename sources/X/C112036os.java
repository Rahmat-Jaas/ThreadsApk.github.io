package X;

/* renamed from: X.6os  reason: invalid class name and case insensitive filesystem */
public final class C112036os {
    public C115546vR A00;
    public AnonymousClass7HD A01;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7HD A00(java.util.List r21) {
        /*
            r20 = this;
            r3 = 0
            r6 = 0
            r7 = r20
            r5 = r21
            int r2 = r5.size()     // Catch:{ Exception -> 0x004c }
        L_0x000a:
            if (r3 >= r2) goto L_0x001e
            java.lang.Object r1 = r5.get(r3)     // Catch:{ Exception -> 0x004c }
            X.8g5 r1 = (X.C143088g5) r1     // Catch:{ Exception -> 0x004c }
            X.6vR r0 = r7.A00     // Catch:{ Exception -> 0x001b }
            r1.A91(r0)     // Catch:{ Exception -> 0x001b }
            int r3 = r3 + 1
            r6 = r1
            goto L_0x000a
        L_0x001b:
            r4 = move-exception
            r6 = r1
            goto L_0x004d
        L_0x001e:
            X.6vR r0 = r7.A00
            java.lang.String r0 = r0.toString()
            X.7yH r6 = X.C134747yH.A04(r0)
            X.6vR r2 = r7.A00
            int r1 = r2.A03
            int r0 = r2.A02
            long r4 = X.AnonymousClass6FM.A00(r1, r0)
            int r1 = r2.A01
            r0 = -1
            if (r1 == r0) goto L_0x004a
            int r0 = r2.A00
            long r2 = X.AnonymousClass6FM.A00(r1, r0)
            X.7Ia r1 = new X.7Ia
            r1.<init>(r2)
        L_0x0042:
            X.7HD r0 = new X.7HD
            r0.<init>((X.C134747yH) r6, (X.C121767Ia) r1, (long) r4)
            r7.A01 = r0
            return r0
        L_0x004a:
            r1 = 0
            goto L_0x0042
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            java.lang.StringBuilder r12 = X.C18200wM.A0r()
            java.lang.String r0 = "Error while applying EditCommand batch to buffer (length="
            java.lang.StringBuilder r9 = X.C18190wL.A0s(r0)
            X.6vR r2 = r7.A00
            X.6uU r0 = r2.A04
            int r0 = r0.A00()
            r9.append(r0)
            java.lang.String r0 = ", composition="
            r9.append(r0)
            int r1 = r2.A01
            r3 = -1
            if (r1 == r3) goto L_0x00c2
            int r0 = r2.A00
            long r0 = X.AnonymousClass6FM.A00(r1, r0)
            X.7Ia r2 = new X.7Ia
            r2.<init>(r0)
        L_0x0077:
            r9.append(r2)
            java.lang.String r0 = ", selection="
            r9.append(r0)
            X.6vR r0 = r7.A00
            int r1 = r0.A03
            int r0 = r0.A02
            long r10 = X.AnonymousClass6FM.A00(r1, r0)
            java.lang.String r8 = "TextRange("
            int r2 = X.C86104wH.A07(r10)
            java.lang.String r1 = ", "
            int r0 = X.C86104wH.A08(r10)
            java.lang.String r0 = X.C86134wK.A0l(r2, r0, r8, r1)
            r9.append(r0)
            java.lang.String r0 = "):"
            java.lang.String r0 = X.C18180wK.A0i(r0, r9)
            X.C86154wM.A1W(r12, r0)
            java.lang.String r13 = "\n"
            r0 = 19
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r18 = X.C86164wN.A11(r7, r6, r0)
            java.lang.String r14 = ""
            java.lang.String r16 = "..."
            r15 = r14
            r19 = r3
            r17 = r5
            X.AnonymousClass00J.A0g(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = X.C18190wL.A0n(r12)
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r4)
            throw r0
        L_0x00c2:
            r2 = 0
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112036os.A00(java.util.List):X.7HD");
    }

    public C112036os() {
        AnonymousClass7HD r0 = new AnonymousClass7HD(AnonymousClass7G7.A00, (C121767Ia) null, C121767Ia.A01);
        this.A01 = r0;
        this.A00 = new C115546vR(r0.A01, r0.A00);
    }
}

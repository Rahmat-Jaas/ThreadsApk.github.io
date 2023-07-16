package X;

/* renamed from: X.2KB  reason: invalid class name */
public final class AnonymousClass2KB {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: com.instagram.model.business.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: com.instagram.model.business.PublicPhoneContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.instagram.model.business.PublicPhoneContact] */
    /* JADX WARNING: type inference failed for: r19v1, types: [com.instagram.model.business.Address] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.collect.ImmutableList A00(java.util.List r29) {
        /*
            com.google.common.collect.ImmutableList$Builder r10 = new com.google.common.collect.ImmutableList$Builder
            r10.<init>()
            if (r29 == 0) goto L_0x0157
            boolean r0 = r29.isEmpty()
            if (r0 != 0) goto L_0x0157
            java.util.Iterator r15 = r29.iterator()
        L_0x0011:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r11 = r15.next()
            X.3DO r11 = (X.AnonymousClass3DO) r11
            java.lang.String r14 = r11.A09
            java.lang.String r13 = r11.A0A
            X.34j r0 = r11.A05
            if (r0 != 0) goto L_0x0153
            r0 = 0
        L_0x0026:
            X.383 r1 = r11.A03
            boolean r29 = X.AnonymousClass0wJ.A1W(r1)
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            X.384 r1 = r11.A06
            if (r1 == 0) goto L_0x0073
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x0073
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0073
            X.384 r1 = r11.A06
            java.util.List r5 = r1.A01
            r4 = 0
        L_0x0043:
            int r1 = r5.size()
            if (r4 >= r1) goto L_0x0073
            java.lang.Object r7 = r5.get(r4)
            X.385 r7 = (X.AnonymousClass385) r7
            r3 = 0
            if (r7 == 0) goto L_0x0071
            X.34l r1 = r7.A00
            if (r1 == 0) goto L_0x0071
            X.34l r1 = r7.A00
            java.lang.String r2 = r1.A00
        L_0x005a:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0064
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.C18250wR.A0K(r2)
        L_0x0064:
            java.lang.String r2 = r7.A01
            com.instagram.business.model.PagePhotoItem r1 = new com.instagram.business.model.PagePhotoItem
            r1.<init>(r3, r2)
            r6.add((java.lang.Object) r1)
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0071:
            r2 = r3
            goto L_0x005a
        L_0x0073:
            com.google.common.collect.ImmutableList r3 = r6.build()
            r9 = 0
            r2 = 3
            X.4O4 r1 = new X.4O4
            r1.<init>(r3, r9, r2)
            X.33i r8 = new X.33i
            r8.<init>(r1)
            X.34g r1 = r11.A01
            if (r1 != 0) goto L_0x014f
            r7 = 0
        L_0x0088:
            java.lang.String r6 = r11.A08
            X.34k r1 = r11.A07
            if (r1 != 0) goto L_0x014b
            r1 = 0
        L_0x008f:
            com.instagram.common.typedurl.SimpleImageUrl r18 = X.C18250wR.A0K(r1)
            java.util.List r1 = r11.A0C
            if (r1 == 0) goto L_0x0147
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0147
            java.util.List r1 = r11.A0C
            java.lang.String r25 = X.C18190wL.A0p(r1, r9)
        L_0x00a3:
            X.3AI r1 = r11.A00
            r5 = 0
            if (r1 == 0) goto L_0x00d0
            java.lang.String r4 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x00d0
            X.382 r12 = r11.A02
            if (r12 != 0) goto L_0x0143
            r1 = r5
        L_0x00b5:
            X.3AI r2 = r11.A00
            java.lang.String r3 = r2.A02
            java.lang.String r2 = r2.A00
            if (r12 == 0) goto L_0x00bf
            java.lang.String r5 = r12.A00
        L_0x00bf:
            com.instagram.model.business.Address r19 = new com.instagram.model.business.Address
            r20 = r3
            r21 = r1
            r22 = r5
            r23 = r2
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)
            r5 = r19
        L_0x00d0:
            java.util.List r1 = r11.A0B
            if (r1 == 0) goto L_0x0141
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0141
            java.util.List r1 = r11.A0B
            java.lang.Object r1 = r1.get(r9)
            if (r1 == 0) goto L_0x0141
            java.util.List r1 = r11.A0B
            java.lang.Object r1 = r1.get(r9)
            X.34h r1 = (X.C557134h) r1
            X.381 r3 = r1.A00
        L_0x00ec:
            r9 = 0
            if (r3 != 0) goto L_0x013e
            r1 = r9
        L_0x00f0:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x010d
            if (r3 != 0) goto L_0x013b
            r2 = r9
        L_0x00f9:
            if (r1 == 0) goto L_0x0105
            java.lang.String r3 = " "
            java.lang.String r3 = X.AnonymousClass00U.A0V(r2, r3, r1)
            java.lang.String r9 = android.telephony.PhoneNumberUtils.stripSeparators(r3)
        L_0x0105:
            java.lang.String r4 = "CALL"
            com.instagram.model.business.PublicPhoneContact r3 = new com.instagram.model.business.PublicPhoneContact
            r3.<init>(r2, r1, r9, r4)
            r9 = r3
        L_0x010d:
            X.383 r1 = r11.A03
            if (r1 != 0) goto L_0x0138
            r3 = 0
        L_0x0112:
            if (r1 != 0) goto L_0x0135
            r1 = 0
        L_0x0115:
            X.3IK r2 = new X.3IK
            r22 = r13
            r23 = r7
            r24 = r6
            r26 = r3
            r27 = r1
            r28 = r0
            r19 = r5
            r20 = r9
            r21 = r14
            r17 = r8
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10.add((java.lang.Object) r2)
            goto L_0x0011
        L_0x0135:
            java.lang.String r1 = r1.A00
            goto L_0x0115
        L_0x0138:
            java.lang.String r3 = r1.A01
            goto L_0x0112
        L_0x013b:
            java.lang.String r2 = r3.A00
            goto L_0x00f9
        L_0x013e:
            java.lang.String r1 = r3.A01
            goto L_0x00f0
        L_0x0141:
            r3 = 0
            goto L_0x00ec
        L_0x0143:
            java.lang.String r1 = r12.A01
            goto L_0x00b5
        L_0x0147:
            r25 = 0
            goto L_0x00a3
        L_0x014b:
            java.lang.String r1 = r1.A00
            goto L_0x008f
        L_0x014f:
            java.lang.String r7 = r1.A00
            goto L_0x0088
        L_0x0153:
            int r0 = r0.A00
            goto L_0x0026
        L_0x0157:
            com.google.common.collect.ImmutableList r0 = r10.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KB.A00(java.util.List):com.google.common.collect.ImmutableList");
    }
}

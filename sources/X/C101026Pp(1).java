package X;

/* renamed from: X.6Pp  reason: invalid class name and case insensitive filesystem */
public final class C101026Pp {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r1 != false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C147078nM r13) {
        /*
            java.lang.Integer r0 = r13.CWR()
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            if (r0 != r6) goto L_0x01fc
            r5 = 0
        L_0x0009:
            java.lang.Integer r0 = r13.Bhu()
            java.lang.Integer r4 = X.AnonymousClass006.A0N
            if (r0 == r4) goto L_0x01ee
            java.lang.String r3 = r13.CWO()
            int r2 = X.AnonymousClass6Q5.A00(r3)
            r0 = 32
            boolean r1 = X.C86114wI.A1U(r2, r0)
            r13.Bhu()
            X.794 r0 = X.AnonymousClass794.A0G
            if (r0 == 0) goto L_0x0094
            if (r1 != 0) goto L_0x0096
            java.lang.String r0 = "ig.elements.alien_object.user"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r13.Acn()
            X.MMo r1 = (X.MMo) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            com.instagram.user.model.User r0 = X.C19527Axo.A01(r1, r0)
            if (r0 == 0) goto L_0x0049
            X.74x r5 = new X.74x
            r5.<init>(r0)
        L_0x0045:
            r13.CuL()
            goto L_0x0009
        L_0x0049:
            java.lang.String r1 = "IgBloksUserAlienObject"
            java.lang.String r0 = "DelegateParser in tokenizer for User was null."
            X.C30967GcS.A02(r1, r0)
            X.74x r5 = new X.74x
            r5.<init>()
            goto L_0x0045
        L_0x0056:
            java.lang.String r0 = "ig.elements.alien_object.explore.hashtag"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r13.Acn()
            X.6ds r5 = new X.6ds
            r5.<init>()
            X.MMo r0 = (X.MMo) r0
            com.instagram.model.hashtag.Hashtag r0 = X.C18771Al7.parseFromJson(r0)
            r5.A00 = r0
            goto L_0x0045
        L_0x0070:
            java.lang.String r0 = "ig.elements.alien_object.media"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0113
            X.6dr r5 = new X.6dr
            r5.<init>()
            java.lang.Object r1 = r13.Acn()
            java.lang.String r0 = "Expected a valid delegate parser"
            X.AnonymousClass7Ko.A07(r1, r0)
            java.lang.Object r1 = r13.Acn()
            X.MMo r1 = (X.MMo) r1
            r0 = 0
            X.BKU r0 = X.BKU.A08(r1, r0)
            r5.A00 = r0
            goto L_0x0045
        L_0x0094:
            if (r1 == 0) goto L_0x0113
        L_0x0096:
            r0 = 13347(0x3423, float:1.8703E-41)
            if (r0 != r2) goto L_0x0113
            X.6kz r7 = new X.6kz
            r7.<init>()
            java.lang.Integer r0 = r13.CWR()
            if (r0 == r6) goto L_0x00b6
            r13.CuL()
            r7 = 0
        L_0x00a9:
            X.7h3 r0 = r7.A00
            if (r0 == 0) goto L_0x01db
            X.7h3 r5 = new X.7h3
            r5.<init>(r0, r7)
            r0 = 0
            r7.A00 = r0
            goto L_0x0045
        L_0x00b6:
            java.lang.Integer r0 = r13.Bhu()
            if (r0 == r4) goto L_0x00a9
            java.lang.String r0 = r13.CWO()
            int r1 = X.AnonymousClass6Q5.A00(r0)
            r13.Bhu()
            r0 = 35
            if (r0 != r1) goto L_0x00d7
            java.lang.Object r0 = A00(r13)
            X.7h3 r0 = (X.C127397h3) r0
            r7.A00 = r0
        L_0x00d3:
            r13.CuL()
            goto L_0x00b6
        L_0x00d7:
            r0 = 33
            if (r0 != r1) goto L_0x00fd
            X.8m3 r3 = r13.CWS()
            java.lang.Integer r2 = r13.CWR()
            int r1 = r2.intValue()
            r0 = 7
            if (r1 == r0) goto L_0x00f4
            r0 = 5
            if (r1 != r0) goto L_0x01e3
            java.lang.String r0 = r3.CwM()
        L_0x00f1:
            r7.A03 = r0
            goto L_0x00d3
        L_0x00f4:
            long r0 = r3.BeP()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x00f1
        L_0x00fd:
            r0 = 38
            if (r0 != r1) goto L_0x0108
            X.6jp r0 = X.AnonymousClass6QG.A00(r13)
            r7.A02 = r0
            goto L_0x00d3
        L_0x0108:
            r0 = 43
            if (r0 != r1) goto L_0x00d3
            X.6jp r0 = X.AnonymousClass6QG.A00(r13)
            r7.A01 = r0
            goto L_0x00d3
        L_0x0113:
            X.5zh r5 = new X.5zh
            r5.<init>(r2)
            if (r1 != 0) goto L_0x012e
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Unexpectedly attempting to parse\"\n              + \" an unminified payload: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "BloksModelParser"
            X.C30967GcS.A02(r0, r1)
        L_0x0129:
            r5.A0V()
            goto L_0x0045
        L_0x012e:
            java.lang.Integer r0 = r13.CWR()
            if (r0 == r6) goto L_0x013a
            r13.CuL()
            r5 = 0
            goto L_0x0045
        L_0x013a:
            java.lang.Integer r0 = r13.Bhu()
            if (r0 == r4) goto L_0x01af
            java.lang.String r0 = r13.CWO()
            int r3 = X.AnonymousClass6Q5.A00(r0)
            r13.Bhu()
            java.lang.Integer r0 = r13.CWR()
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x017e;
                case 1: goto L_0x0156;
                case 2: goto L_0x01a5;
                case 3: goto L_0x0156;
                case 4: goto L_0x0156;
                case 5: goto L_0x0175;
                case 6: goto L_0x0170;
                case 7: goto L_0x015a;
                case 8: goto L_0x0163;
                default: goto L_0x0156;
            }
        L_0x0156:
            r13.CuL()
            goto L_0x013a
        L_0x015a:
            X.8m3 r0 = r13.CWS()
            java.lang.Number r1 = r0.BiQ()
            goto L_0x01a9
        L_0x0163:
            X.8m3 r0 = r13.CWS()
            boolean r0 = r0.AAu()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L_0x01a9
        L_0x0170:
            X.6jp r1 = X.AnonymousClass6QG.A00(r13)
            goto L_0x01a9
        L_0x0175:
            X.8m3 r0 = r13.CWS()
            java.lang.String r1 = r0.CwM()
            goto L_0x01a9
        L_0x017e:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
        L_0x0182:
            java.lang.Integer r1 = r13.Bhu()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x019f
            java.lang.Integer r0 = r13.CWR()
            if (r0 != r6) goto L_0x019a
            java.lang.Object r0 = A00(r13)
            if (r0 == 0) goto L_0x0182
        L_0x0196:
            r2.add(r0)
            goto L_0x0182
        L_0x019a:
            java.lang.Object r0 = X.AnonymousClass70J.A00(r13)
            goto L_0x0196
        L_0x019f:
            android.util.SparseArray r0 = r5.A04
            r0.put(r3, r2)
            goto L_0x0156
        L_0x01a5:
            java.lang.Object r1 = A00(r13)
        L_0x01a9:
            android.util.SparseArray r0 = r5.A04
            r0.put(r3, r1)
            goto L_0x0156
        L_0x01af:
            X.AnonymousClass794.A00()
            r4 = 0
            int[] r3 = X.C103576Zs.A01
            int r2 = r3.length
        L_0x01b6:
            if (r4 >= r2) goto L_0x0129
            r11 = r3[r4]
            java.lang.Object r8 = X.C127397h3.A0A(r5, r11)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x01d8
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r5.A02
            int r10 = r5.A03
            r1 = 128(0x80, float:1.794E-43)
            android.util.SparseArray r0 = r5.A04
            java.lang.String r12 = X.C86114wI.A0m(r0, r1)
            com.instagram.common.lispy.lang.BloksScript r7 = new com.instagram.common.lispy.lang.BloksScript
            r7.<init>(r8, r9, r10, r11, r12)
            r0.put(r11, r7)
        L_0x01d8:
            int r4 = r4 + 1
            goto L_0x01b6
        L_0x01db:
            java.lang.String r0 = "Shadow component should never be a leaf node"
            X.1zB r1 = new X.1zB
            r1.<init>(r0)
            throw r1
        L_0x01e3:
            java.lang.String r1 = "Bloks id only supports long and String types but got: "
            java.lang.String r0 = X.AnonymousClass6Q4.A00(r2)
            X.1zB r1 = X.C86124wJ.A0c(r1, r0)
            throw r1
        L_0x01ee:
            if (r5 != 0) goto L_0x01fb
            java.lang.String r0 = "unknown bloks data type"
            java.io.IOException r1 = X.C86154wM.A0V(r0)
            java.lang.String r0 = "BloksParser"
            X.C30967GcS.A03(r0, r1)
        L_0x01fb:
            return r5
        L_0x01fc:
            r13.CuL()
            java.lang.String r0 = "Token parsing error."
            java.io.IOException r1 = X.C86154wM.A0V(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101026Pp.A00(X.8nM):java.lang.Object");
    }
}

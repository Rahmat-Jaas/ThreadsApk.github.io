package X;

/* renamed from: X.7vY  reason: invalid class name and case insensitive filesystem */
public final class C133347vY implements C148708ri {
    public boolean A00;
    public final Class A01;
    public final boolean A02;

    public final void Cly(boolean z) {
        this.A00 = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.reflect.InvocationTargetException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.io.IOException} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r2.equals("error_message") == false) goto L_0x0065;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146578mT A00(java.lang.String r8) {
        /*
            r7 = this;
            X.MIS r0 = X.C18987Aon.A00
            X.MMo r3 = r0.A08(r8)
            X.LcR r0 = X.C86144wL.A0S(r3)     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00ee
            r3.A0g()     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = X.AnonymousClass0wJ.A0q(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "parseFromJson"
            r4 = 0
            if (r2 == 0) goto L_0x0065
            int r6 = r2.hashCode()     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            r0 = -1938755376(0xffffffff8c70f0d0, float:-1.8561394E-31)
            java.lang.String r1 = "error_message"
            if (r6 == r0) goto L_0x005f
            r0 = 3002589(0x2dd0dd, float:4.207523E-39)
            if (r6 == r0) goto L_0x0056
            r0 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r6 != r0) goto L_0x0065
            java.lang.String r0 = "error"
            boolean r0 = r2.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 == 0) goto L_0x0065
            java.lang.Class<X.70u> r1 = X.C1184070u.class
            java.lang.Class<X.MMo> r0 = X.MMo.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            java.lang.Object r1 = X.C86154wM.A0Z(r3, r4, r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.graphql.error.GraphQLError"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            X.5yz r1 = (X.C95165yz) r1     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            java.util.List r1 = X.C18180wK.A0n(r1)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            X.6CK r0 = new X.6CK     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
        L_0x0056:
            java.lang.String r0 = "args"
            boolean r0 = r2.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 != 0) goto L_0x0093
            goto L_0x0065
        L_0x005f:
            boolean r0 = r2.equals(r1)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 != 0) goto L_0x0093
        L_0x0065:
            java.lang.Class r1 = r7.A01     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r1 == 0) goto L_0x0082
            java.lang.Class<X.MMo> r0 = X.MMo.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = X.C86154wM.A0Z(r3, r4, r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
        L_0x0079:
            boolean r0 = r1 instanceof X.C146578mT     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 == 0) goto L_0x0088
            X.8mT r1 = (X.C146578mT) r1     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r1 == 0) goto L_0x0088
            goto L_0x0084
        L_0x0082:
            r1 = r4
            goto L_0x0079
        L_0x0084:
            r3.close()
            return r1
        L_0x0088:
            java.lang.String r0 = "GraphQL Response was not parseable. First level token: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
        L_0x0093:
            X.LcR r0 = r3.A0f()     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r3.A0o()     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            boolean r0 = r1.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 != 0) goto L_0x00a7
            r3.A0g()     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            goto L_0x0093
        L_0x00a7:
            java.lang.String r0 = r3.A0o()     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            boolean r0 = r1.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r3.A0r()     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
        L_0x00b5:
            X.6CB r0 = new X.6CB     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00d9, InvocationTargetException -> 0x00c4, IllegalAccessException -> 0x00bd }
        L_0x00bb:
            r1 = r4
            goto L_0x00b5
        L_0x00bd:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ed
        L_0x00c4:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getTargetException()     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00f4
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Exception"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ all -> 0x00f5 }
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch:{ all -> 0x00f5 }
            goto L_0x00f4
        L_0x00d9:
            r2 = move-exception
            java.lang.Class r0 = r7.A01     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r4 = r0.getCanonicalName()     // Catch:{ all -> 0x00f5 }
        L_0x00e2:
            java.lang.String r0 = "On Class "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ all -> 0x00f5 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00f5 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00f5 }
        L_0x00ed:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00ee:
            java.lang.String r0 = "Response body is empty"
            java.io.IOException r1 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00f4:
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r0 = move-exception
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133347vY.A00(java.lang.String):X.8mT");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x00fa in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r15) {
        /*
            r14 = this;
            X.GJX r15 = (X.GJX) r15
            r13 = 0
            if (r15 == 0) goto L_0x0010
            X.8rm r12 = r15.A00()
        L_0x0009:
            java.lang.String r3 = "IOException."
            java.lang.String r2 = "IGLegacyFragmentModelResponseParser"
            if (r12 == 0) goto L_0x0184
            goto L_0x0012
        L_0x0010:
            r12 = r13
            goto L_0x0009
        L_0x0012:
            X.MIS r1 = X.C18987Aon.A00     // Catch:{ all -> 0x0190 }
            java.io.InputStream r0 = r12.AUn()     // Catch:{ all -> 0x0190 }
            X.MMo r1 = r1.A07(r0)     // Catch:{ all -> 0x0190 }
            X.LcR r8 = X.C40318LcR.START_OBJECT     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r8)     // Catch:{ all -> 0x018b }
            X.LcR r7 = X.C40318LcR.FIELD_NAME     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r7)     // Catch:{ all -> 0x018b }
            r6 = 0     // Catch:{ all -> 0x018b }
            r5 = r6     // Catch:{ all -> 0x018b }
        L_0x0030:
            X.LcR r4 = r1.A0f()     // Catch:{ all -> 0x018b }
            if (r4 != r7) goto L_0x0151     // Catch:{ all -> 0x018b }
            java.lang.String r4 = r1.A0o()     // Catch:{ all -> 0x018b }
            if (r4 == 0) goto L_0x0137     // Catch:{ all -> 0x018b }
            int r0 = r4.hashCode()     // Catch:{ all -> 0x018b }
            java.lang.String r10 = "parseFromJson"
            switch(r0) {
                case -1938755376: goto L_0x00fa;
                case -1809421292: goto L_0x0047;
                case -1294635157: goto L_0x00a0;
                case 3076010: goto L_0x005b;
                default: goto L_0x0045;
            }     // Catch:{ all -> 0x0190 }
        L_0x0045:
            goto L_0x0137     // Catch:{ all -> 0x0190 }
        L_0x0047:
            java.lang.String r0 = "extensions"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0137     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r8)     // Catch:{ all -> 0x018b }
            r1.A0x()     // Catch:{ all -> 0x018b }
            goto L_0x00f5     // Catch:{ all -> 0x018b }
        L_0x005b:
            java.lang.String r0 = "data"     // Catch:{ all -> 0x018b }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0137     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r8)     // Catch:{ all -> 0x018b }
            boolean r9 = r14.A02     // Catch:{ all -> 0x018b }
            if (r9 == 0) goto L_0x007c     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r7)     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r8)     // Catch:{ all -> 0x018b }
        L_0x007c:
            if (r5 != 0) goto L_0x0120     // Catch:{ all -> 0x018b }
            java.lang.Class r5 = r14.A01     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x009b     // Catch:{ all -> 0x018b }
            java.lang.Class<X.MMo> r0 = X.MMo.class     // Catch:{ all -> 0x018b }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x018b }
            java.lang.reflect.Method r0 = r5.getMethod(r10, r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x009b     // Catch:{ all -> 0x018b }
            java.lang.Object r5 = X.C86154wM.A0Z(r1, r6, r0)     // Catch:{ all -> 0x018b }
        L_0x0092:
            boolean r0 = r5 instanceof X.C146578mT     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0110     // Catch:{ all -> 0x018b }
            X.8mT r5 = (X.C146578mT) r5     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x0110     // Catch:{ all -> 0x018b }
            goto L_0x009d     // Catch:{ all -> 0x018b }
        L_0x009b:
            r5 = r6     // Catch:{ all -> 0x018b }
            goto L_0x0092     // Catch:{ all -> 0x018b }
        L_0x009d:
            if (r9 == 0) goto L_0x00f5     // Catch:{ all -> 0x018b }
            goto L_0x00ec     // Catch:{ all -> 0x018b }
        L_0x00a0:
            java.lang.String r0 = "errors"     // Catch:{ all -> 0x018b }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0137     // Catch:{ all -> 0x018b }
            X.LcR r9 = X.C40318LcR.START_ARRAY     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r9)     // Catch:{ all -> 0x018b }
        L_0x00b1:
            X.LcR r0 = r1.A0f()     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x00f5     // Catch:{ all -> 0x018b }
            r1.A0g()     // Catch:{ all -> 0x018b }
            X.LcR r9 = X.C40318LcR.END_ARRAY     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0f()     // Catch:{ all -> 0x018b }
            if (r9 == r0) goto L_0x00f5     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r8)     // Catch:{ all -> 0x018b }
            java.lang.Class<X.70u> r9 = X.C1184070u.class     // Catch:{ all -> 0x018b }
            java.lang.Class<X.MMo> r0 = X.MMo.class     // Catch:{ all -> 0x018b }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x018b }
            java.lang.reflect.Method r0 = r9.getMethod(r10, r0)     // Catch:{ all -> 0x018b }
            java.lang.Object r11 = X.C86154wM.A0Z(r1, r6, r0)     // Catch:{ all -> 0x018b }
            boolean r0 = r11 instanceof X.C95165yz     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0127     // Catch:{ all -> 0x018b }
            X.5yz r11 = (X.C95165yz) r11     // Catch:{ all -> 0x018b }
            if (r11 == 0) goto L_0x0127     // Catch:{ all -> 0x018b }
            boolean r0 = r14.A00     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0147     // Catch:{ all -> 0x018b }
            java.lang.String r9 = "CRITICAL"     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r11.A05     // Catch:{ all -> 0x018b }
            boolean r0 = r9.equalsIgnoreCase(r0)     // Catch:{ all -> 0x018b }
            if (r0 != 0) goto L_0x0147     // Catch:{ all -> 0x018b }
            goto L_0x00b1     // Catch:{ all -> 0x018b }
        L_0x00ec:
            X.LcR r4 = X.C40318LcR.END_OBJECT     // Catch:{ all -> 0x018b }
            X.LcR r0 = r1.A0g()     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r0, r4)     // Catch:{ all -> 0x018b }
        L_0x00f5:
            r1.A0g()     // Catch:{ all -> 0x018b }
            goto L_0x0030     // Catch:{ all -> 0x018b }
        L_0x00fa:
            java.lang.String r0 = "error_message"     // Catch:{ all -> 0x018b }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0137     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r1.A0r()     // Catch:{ all -> 0x018b }
            if (r0 != 0) goto L_0x010a     // Catch:{ all -> 0x018b }
            java.lang.String r0 = ""     // Catch:{ all -> 0x018b }
        L_0x010a:
            X.6CB r4 = new X.6CB     // Catch:{ all -> 0x018b }
            r4.<init>(r0)     // Catch:{ all -> 0x018b }
            goto L_0x0150     // Catch:{ all -> 0x018b }
        L_0x0110:
            java.lang.String r0 = "Unparseable response"     // Catch:{ all -> 0x018b }
            X.C10450iM.A03(r2, r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "GraphQL Response was not parseable. First level token: "     // Catch:{ all -> 0x018b }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ all -> 0x018b }
            java.io.IOException r4 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x018b }
            goto L_0x0150     // Catch:{ all -> 0x018b }
        L_0x0120:
            java.lang.String r0 = "Check failed."     // Catch:{ all -> 0x018b }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x0127:
            java.lang.String r0 = "Unparseable error"     // Catch:{ all -> 0x018b }
            X.C10450iM.A03(r2, r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "GraphQL Error was not parseable. First level token: "     // Catch:{ all -> 0x018b }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ all -> 0x018b }
            java.io.IOException r4 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x018b }
            goto L_0x0150     // Catch:{ all -> 0x018b }
        L_0x0137:
            java.lang.String r0 = "Unexpected first level token"     // Catch:{ all -> 0x018b }
            X.C10450iM.A03(r2, r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "GraphQL Response was not parseable. Unexpected first level token: "     // Catch:{ all -> 0x018b }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ all -> 0x018b }
            java.io.IOException r4 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x018b }
            goto L_0x0150     // Catch:{ all -> 0x018b }
        L_0x0147:
            java.util.List r0 = X.C18180wK.A0n(r11)     // Catch:{ all -> 0x018b }
            X.6CK r4 = new X.6CK     // Catch:{ all -> 0x018b }
            r4.<init>(r0)     // Catch:{ all -> 0x018b }
        L_0x0150:
            throw r4     // Catch:{ all -> 0x018b }
        L_0x0151:
            X.LcR r0 = X.C40318LcR.END_OBJECT     // Catch:{ all -> 0x018b }
            X.C101706Sh.A00(r4, r0)     // Catch:{ all -> 0x018b }
            r1.close()     // Catch:{ all -> 0x0190 }
            if (r5 == 0) goto L_0x0173     // Catch:{ all -> 0x0190 }
            if (r15 == 0) goto L_0x0172     // Catch:{ all -> 0x0190 }
            int r0 = r15.A02     // Catch:{ all -> 0x0190 }
            r5.setStatusCode(r0)     // Catch:{ all -> 0x0190 }
            r0 = 6     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ all -> 0x0190 }
            X.3Ud r0 = r15.A01(r0)     // Catch:{ all -> 0x0190 }
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            r5.setFromDiskCache(r0)     // Catch:{ all -> 0x0190 }
        L_0x0172:
            r13 = r5     // Catch:{ all -> 0x0190 }
        L_0x0173:
            r12.close()     // Catch:{ IOException -> 0x0177 }
            goto L_0x0183     // Catch:{ IOException -> 0x0177 }
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x017f
            r3 = r0
        L_0x017f:
            X.C10450iM.A03(r2, r3)
            return r13
        L_0x0183:
            return r13
        L_0x0184:
            java.lang.String r0 = "Json Parser is null"
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x0190 }
            goto L_0x018f     // Catch:{ all -> 0x0190 }
            r0 = move-exception     // Catch:{ all -> 0x0190 }
            r1.close()     // Catch:{ all -> 0x0190 }
        L_0x018f:
            throw r0     // Catch:{ all -> 0x0190 }
            r1 = move-exception
            if (r12 == 0) goto L_0x01a2
            r12.close()     // Catch:{ IOException -> 0x0197 }
            throw r1
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x019f
            r3 = r0
        L_0x019f:
            X.C10450iM.A03(r2, r3)
        L_0x01a2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133347vY.then(java.lang.Object):java.lang.Object");
    }

    public C133347vY(Class cls, boolean z) {
        this.A01 = cls;
        this.A02 = z;
    }
}

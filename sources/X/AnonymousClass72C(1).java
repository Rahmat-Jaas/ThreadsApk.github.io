package X;

/* renamed from: X.72C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass72C {
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass8sP A00(X.AnonymousClass0AD r10, X.AnonymousClass76V r11) {
        /*
            r6 = 0
            r8 = 1
            X.C04220Ms.A0B(r10, r8)
            X.0JX r4 = r10.A03
            boolean r5 = r4 instanceof X.AnonymousClass0W7
            if (r5 == 0) goto L_0x020f
            r3 = r4
            X.0W7 r3 = (X.AnonymousClass0W7) r3
            int r0 = r10.A00
            r9 = 1
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0016
            r9 = 0
        L_0x0016:
            java.util.List r0 = r10.A01
            r7 = 10
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r7)
            java.util.Iterator r1 = r0.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r1.next()
            X.0FL r0 = (X.AnonymousClass0FL) r0
            X.0AD r0 = r0.A01
            if (r0 == 0) goto L_0x0036
            r2.add(r0)
            goto L_0x0022
        L_0x0036:
            java.lang.String r0 = "Star projections in type arguments are not allowed, but had "
            java.lang.String r0 = X.C04220Ms.A01(r0, r10)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0041:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0083
            X.C04220Ms.A0B(r3, r6)
        L_0x004a:
            X.8sP[] r0 = new X.AnonymousClass8sP[r6]
            X.8sP r0 = X.AnonymousClass6W9.A00(r3, r0)
            if (r0 != 0) goto L_0x00d0
            java.util.Map r0 = X.C36643Jc7.A00
            java.lang.Object r0 = r0.get(r3)
            X.8sP r0 = (X.AnonymousClass8sP) r0
            if (r0 != 0) goto L_0x00d0
            java.util.Map r0 = r11.A00
            r0.get(r3)
        L_0x0061:
            if (r5 == 0) goto L_0x01f9
            X.C04220Ms.A0B(r3, r6)
            java.lang.String r0 = "Serializer for class '"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            X.0Ai r3 = (X.C02230Ai) r3
            java.lang.Class r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass0N8.A00(r0)
            r1.append(r0)
            java.lang.String r0 = "' is not found.\nMark the class as @Serializable or provide the serializer explicitly."
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            X.6Cb r0 = new X.6Cb
            r0.<init>(r1)
            throw r0
        L_0x0083:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0x(r2, r7)
            java.util.Iterator r7 = r2.iterator()
        L_0x008b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r7.next()
            X.0AD r0 = (X.AnonymousClass0AD) r0
            X.8sP r0 = A00(r0, r11)
            r1.add(r0)
            goto L_0x008b
        L_0x009f:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = A01(r0, r3)
            if (r0 != 0) goto L_0x01ed
            java.lang.Class<java.util.List> r7 = java.util.List.class
            boolean r0 = A01(r7, r3)
            if (r0 != 0) goto L_0x01ed
            boolean r0 = A01(r7, r3)
            if (r0 != 0) goto L_0x01ed
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = A01(r0, r3)
            if (r0 != 0) goto L_0x01ed
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r1.get(r6)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.8bw r0 = new X.8bw
            r0.<init>(r1)
        L_0x00d0:
            if (r9 == 0) goto L_0x00d6
            X.8sP r0 = X.J5B.A00(r0)
        L_0x00d6:
            if (r0 == 0) goto L_0x0061
            return r0
        L_0x00d9:
            java.lang.Class<java.util.Set> r7 = java.util.Set.class
            boolean r0 = A01(r7, r3)
            if (r0 != 0) goto L_0x01e0
            boolean r0 = A01(r7, r3)
            if (r0 != 0) goto L_0x01e0
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            boolean r0 = A01(r0, r3)
            if (r0 != 0) goto L_0x01e0
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0109
            java.lang.Object r2 = r1.get(r6)
            X.8sP r2 = (X.AnonymousClass8sP) r2
            java.lang.Object r1 = r1.get(r8)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.8c4 r0 = new X.8c4
            r0.<init>(r2, r1)
            goto L_0x00d0
        L_0x0109:
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r0 = A01(r7, r3)
            if (r0 != 0) goto L_0x01ce
            boolean r0 = A01(r7, r3)
            if (r0 != 0) goto L_0x01ce
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            boolean r0 = A01(r0, r3)
            if (r0 != 0) goto L_0x01ce
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x013f
            java.lang.Object r2 = r1.get(r6)
            X.8sP r2 = (X.AnonymousClass8sP) r2
            java.lang.Object r1 = r1.get(r8)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.C04220Ms.A0B(r2, r6)
            X.C04220Ms.A0B(r1, r8)
            X.8bp r0 = new X.8bp
            r0.<init>(r2, r1)
            goto L_0x00d0
        L_0x013f:
            java.lang.Class<kotlin.Pair> r0 = kotlin.Pair.class
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0160
            java.lang.Object r2 = r1.get(r6)
            X.8sP r2 = (X.AnonymousClass8sP) r2
            java.lang.Object r1 = r1.get(r8)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.C04220Ms.A0B(r2, r6)
            X.C04220Ms.A0B(r1, r8)
            X.8bq r0 = new X.8bq
            r0.<init>(r2, r1)
            goto L_0x00d0
        L_0x0160:
            java.lang.Class<kotlin.Triple> r0 = kotlin.Triple.class
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x018b
            java.lang.Object r7 = r1.get(r6)
            X.8sP r7 = (X.AnonymousClass8sP) r7
            java.lang.Object r2 = r1.get(r8)
            X.8sP r2 = (X.AnonymousClass8sP) r2
            r0 = 2
            java.lang.Object r1 = r1.get(r0)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.C04220Ms.A0B(r7, r6)
            X.C04220Ms.A0B(r2, r8)
            X.C04220Ms.A0B(r1, r0)
            X.87b r0 = new X.87b
            r0.<init>(r7, r2, r1)
            goto L_0x00d0
        L_0x018b:
            X.C04220Ms.A0B(r3, r6)
            java.lang.Class r0 = X.AnonymousClass724.A00(r3)
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r2.get(r6)
            X.0AD r0 = (X.AnonymousClass0AD) r0
            X.0JX r2 = r0.A03
            X.0W7 r2 = (X.AnonymousClass0W7) r2
            java.lang.Object r1 = r1.get(r6)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.C04220Ms.A0B(r2, r6)
            X.C04220Ms.A0B(r1, r8)
            X.8by r0 = new X.8by
            r0.<init>(r2, r1)
            goto L_0x00d0
        L_0x01b5:
            X.8sP[] r0 = new X.AnonymousClass8sP[r6]
            java.lang.Object[] r1 = r1.toArray(r0)
            if (r1 == 0) goto L_0x0204
            X.8sP[] r1 = (X.AnonymousClass8sP[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.8sP[] r0 = (X.AnonymousClass8sP[]) r0
            X.8sP r0 = X.AnonymousClass6W9.A00(r3, r0)
            if (r0 != 0) goto L_0x00d0
            goto L_0x004a
        L_0x01ce:
            java.lang.Object r2 = r1.get(r6)
            X.8sP r2 = (X.AnonymousClass8sP) r2
            java.lang.Object r0 = r1.get(r8)
            X.8sP r0 = (X.AnonymousClass8sP) r0
            X.8c5 r0 = X.AnonymousClass8c5.A02(r2, r0)
            goto L_0x00d0
        L_0x01e0:
            java.lang.Object r1 = r1.get(r6)
            X.8sP r1 = (X.AnonymousClass8sP) r1
            X.8bx r0 = new X.8bx
            r0.<init>(r1)
            goto L_0x00d0
        L_0x01ed:
            java.lang.Object r0 = r1.get(r6)
            X.8sP r0 = (X.AnonymousClass8sP) r0
            X.8c0 r0 = X.AnonymousClass8c0.A00(r0)
            goto L_0x00d0
        L_0x01f9:
            java.lang.String r0 = "Only KClass supported as classifier, got "
            java.lang.String r0 = X.C04220Ms.A01(r0, r4)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0204:
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x020f:
            java.lang.String r0 = "Only KClass supported as classifier, got "
            java.lang.String r0 = X.C04220Ms.A01(r0, r4)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72C.A00(X.0AD, X.76V):X.8sP");
    }

    public static boolean A01(Class cls, Object obj) {
        return C04220Ms.A0I(obj, new C02230Ai(cls));
    }
}

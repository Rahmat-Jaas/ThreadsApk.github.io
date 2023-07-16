package X;

/* renamed from: X.6IZ  reason: invalid class name */
public final class AnonymousClass6IZ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r2 != 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0136, code lost:
        if (r0 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013c, code lost:
        if (X.AnonymousClass8bQ.A0n(r0) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x008e, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r7, X.C148488rA r8, java.lang.String r9) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.String r0 = r8.AaB()
            r3 = 1
            if (r0 == 0) goto L_0x0151
            java.lang.Class<com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl$CountryToFields> r1 = com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl.CountryToFields.class
            java.lang.String r0 = "country_to_fields"
            com.google.common.collect.ImmutableList r6 = r7.getTreeList(r0, r1)
            java.lang.String r5 = "Required value was null."
            if (r6 == 0) goto L_0x014c
            java.util.Iterator r2 = r6.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0144
            java.lang.Object r4 = r2.next()
            r1 = r4
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            java.lang.String r0 = "country_code"
            java.lang.String r1 = r1.getStringValue(r0)
            java.lang.String r0 = r8.AaB()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x001b
        L_0x0039:
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 != 0) goto L_0x0085
            java.util.Iterator r2 = r6.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r4 = r2.next()
            r1 = r4
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            java.lang.String r0 = "country_code"
            java.lang.String r1 = r1.getStringValue(r0)
            java.lang.String r0 = "default_country"
            java.lang.String r0 = r7.getStringValue(r0)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0041
        L_0x0060:
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 != 0) goto L_0x0085
            java.util.Iterator r3 = r6.iterator()
        L_0x0068:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r2 = r3.next()
            r4 = r2
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.String r0 = "country_code"
            java.lang.String r1 = r4.getStringValue(r0)
            java.lang.String r0 = "default"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0068
            if (r2 == 0) goto L_0x0147
        L_0x0085:
            java.lang.Class<com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl$CountryToFields$FormFields> r1 = com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl.CountryToFields.FormFields.class
            java.lang.String r0 = "form_fields"
            X.83w r4 = X.C18250wR.A0G(r4, r1, r0)
        L_0x008d:
            r3 = 1
        L_0x008e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r1 = r4.next()
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            java.lang.Class<com.facebook.graphql.impls.FBPayFormFieldImpl> r0 = com.facebook.graphql.impls.FBPayFormFieldImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            java.lang.String r0 = "field_id"
            java.lang.String r2 = r1.getStringValue(r0)
            if (r2 == 0) goto L_0x008e
            int r0 = r2.hashCode()
            switch(r0) {
                case -1881886578: goto L_0x00b0;
                case -1881886577: goto L_0x00c7;
                case 120609: goto L_0x00de;
                case 3053931: goto L_0x00f5;
                case 109757585: goto L_0x010c;
                case 553963973: goto L_0x0123;
                default: goto L_0x00af;
            }
        L_0x00af:
            goto L_0x008e
        L_0x00b0:
            java.lang.String r0 = "street1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = "is_optional"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r8.BEK()
            goto L_0x0136
        L_0x00c7:
            java.lang.String r0 = "street2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = "is_optional"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r8.BEL()
            goto L_0x0136
        L_0x00de:
            java.lang.String r0 = "zip"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = "is_optional"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r8.BMp()
            goto L_0x0136
        L_0x00f5:
            java.lang.String r0 = "city"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = "is_optional"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r8.APZ()
            goto L_0x0136
        L_0x010c:
            java.lang.String r0 = "state"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = "is_optional"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r8.APe()
            goto L_0x0136
        L_0x0123:
            java.lang.String r0 = "care_of"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = "is_optional"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto L_0x008d
            r0 = r9
        L_0x0136:
            if (r0 == 0) goto L_0x013e
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 == 0) goto L_0x008d
        L_0x013e:
            r3 = 0
            goto L_0x008e
        L_0x0141:
            r4 = r3
            goto L_0x0060
        L_0x0144:
            r4 = r3
            goto L_0x0039
        L_0x0147:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x014c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x0151:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IZ.A00(com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl, X.8rA, java.lang.String):boolean");
    }
}

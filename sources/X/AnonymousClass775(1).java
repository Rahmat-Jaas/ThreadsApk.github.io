package X;

import com.facebook.dcp.model.Type;

/* renamed from: X.775  reason: invalid class name */
public final class AnonymousClass775 {
    /* JADX WARNING: type inference failed for: r1v76, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v84, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07be, code lost:
        throw new X.C97436Bi("Got null model config or control config or time config or cache config in predictor config response from server");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07d4, code lost:
        throw new X.C97436Bi("Got null use case name or version, or purpose in response from server");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07da, code lost:
        throw new X.C97436Bi("Got null use case name or version, or purpose in response from server");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07e0, code lost:
        throw new X.C97436Bi("Got null use case name or version, or purpose in response from server");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (r3 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        if (r3 != null) goto L_0x015b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07bf A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.dcp.model.MetadataResponse A01(X.AnonymousClass7DX r71, com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata r72, java.util.Set r73) {
        /*
            r70 = this;
            r18 = 2
            r69 = r71
            r1 = r18
            r0 = r69
            X.C04220Ms.A0B(r0, r1)
            r26 = r72
            if (r72 == 0) goto L_0x07f1
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases> r25 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.class
            java.lang.String r24 = "usecases"
            r2 = r24
            r1 = r25
            r0 = r26
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r2, r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x07e9
            java.util.HashMap r23 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r22 = r73.iterator()
        L_0x002b:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x07e1
            java.lang.Object r17 = r22.next()
            r0 = r17
            X.5IK r0 = (X.AnonymousClass5IK) r0
            r17 = r0
            r2 = r25
            r1 = r24
            r0 = r26
            X.83w r21 = X.C18250wR.A0G(r0, r2, r1)
        L_0x0045:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r4 = r21.next()
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.String r7 = "Got null use case name or version, or purpose in response from server"
            if (r4 == 0) goto L_0x07db
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$UseCase> r6 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.UseCase.class
            java.lang.String r5 = "use_case"
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x07db
            java.lang.String r12 = "use_case_name"
            java.lang.String r2 = r0.getStringValue(r12)
            if (r2 == 0) goto L_0x07db
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x07d5
            java.lang.String r14 = "version"
            java.lang.String r1 = r0.getStringValue(r14)
            if (r1 == 0) goto L_0x07d5
            r0 = r17
            java.lang.String r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r0, r2)
            if (r0 == 0) goto L_0x0045
            r0 = r17
            java.lang.String r0 = r0.A02
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x0045
            r0 = r17
            java.lang.String r1 = r0.A01
            r19 = 0
            r0 = r69
            X.8nP r30 = X.AnonymousClass7DX.A00(r0, r1)
            if (r30 == 0) goto L_0x0045
            java.util.HashMap r20 = X.AnonymousClass0wJ.A0y()
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig> r29 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.class
            java.lang.String r13 = "features_config"
            r0 = r29
            com.facebook.pando.TreeJNI r2 = r4.getTreeValue(r13, r0)
            if (r2 == 0) goto L_0x079f
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.class
            java.lang.String r0 = "features_list"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x079f
        L_0x00b1:
            java.util.Iterator r28 = r0.iterator()
        L_0x00b5:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto L_0x026b
            com.facebook.pando.TreeJNI r10 = X.C18210wN.A0G(r28)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.class
            java.lang.String r0 = "metadata_config"
            X.83w r27 = X.C18250wR.A0G(r10, r1, r0)
        L_0x00c7:
            boolean r0 = r27.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r2 = r27.next()
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = "id"
            java.lang.String r3 = X.C86134wK.A0o(r10)
            int r0 = r2.getIntValue(r14)
            X.5I2 r9 = new X.5I2
            r9.<init>(r3, r0)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig$Metadata> r3 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.Metadata.class
            java.lang.String r0 = "metadata"
            com.facebook.pando.TreeJNI r3 = r2.getTreeValue(r0, r3)
            int r16 = r10.getIntValue(r1)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig$Value> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.Value.class
            java.lang.String r0 = "value"
            com.facebook.pando.TreeJNI r15 = r2.getTreeValue(r0, r1)
            r8 = 0
            if (r15 == 0) goto L_0x0268
            java.lang.String r11 = "type"
            int r11 = r15.getIntValue(r11)
        L_0x00ff:
            com.facebook.dcp.model.Type r43 = A00(r11)
            java.lang.String r44 = java.lang.String.valueOf(r16)
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            r32 = 0
            if (r2 == 0) goto L_0x0264
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig$Value$Default> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.Value.Default.class
            java.lang.String r0 = "default"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
        L_0x0117:
            r31 = 0
            if (r0 == 0) goto L_0x0122
            int r1 = r43.ordinal()
            switch(r1) {
                case 0: goto L_0x0246;
                case 1: goto L_0x023b;
                case 2: goto L_0x0220;
                case 3: goto L_0x0122;
                case 4: goto L_0x0202;
                case 5: goto L_0x01c7;
                case 6: goto L_0x01a9;
                default: goto L_0x0122;
            }
        L_0x0122:
            if (r3 == 0) goto L_0x0146
            java.lang.String r0 = "input_signal_list"
            com.google.common.collect.ImmutableList r1 = r3.getIntList(r0)
            if (r1 == 0) goto L_0x0146
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0134:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.add(r1)
            goto L_0x0134
        L_0x0146:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            if (r3 == 0) goto L_0x019f
        L_0x014a:
            java.lang.String r1 = "source"
            int r2 = r3.getIntValue(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x019f
            r1 = 1
            if (r2 != r1) goto L_0x0192
            com.facebook.dcp.model.FeatureSource r41 = com.facebook.dcp.model.FeatureSource.SERVER
        L_0x015b:
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig$Metadata$Cache> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.Metadata.Cache.class
            java.lang.String r1 = "cache"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x01a4
            java.lang.String r1 = "cache_ttl_in_days"
            java.lang.String r1 = r2.getStringValue(r1)
            if (r1 == 0) goto L_0x01a4
            int r46 = java.lang.Integer.parseInt(r1)
        L_0x0171:
            java.lang.String r1 = "log_level"
            int r8 = r3.getIntValue(r1)
        L_0x0177:
            com.facebook.dcp.model.LogLevel r1 = new com.facebook.dcp.model.LogLevel
            r1.<init>(r8)
            r47 = 1920(0x780, float:2.69E-42)
            com.facebook.dcp.model.FeatureMetadata r2 = new com.facebook.dcp.model.FeatureMetadata
            r39 = r2
            r40 = r31
            r42 = r1
            r45 = r0
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
            r0 = r20
            r0.put(r9, r2)
            goto L_0x00c7
        L_0x0192:
            r1 = r18
            if (r2 != r1) goto L_0x0199
            com.facebook.dcp.model.FeatureSource r41 = com.facebook.dcp.model.FeatureSource.CLIENT
            goto L_0x015b
        L_0x0199:
            r1 = 3
            if (r2 != r1) goto L_0x019f
            com.facebook.dcp.model.FeatureSource r41 = com.facebook.dcp.model.FeatureSource.PREFER_SERVER
            goto L_0x015b
        L_0x019f:
            com.facebook.dcp.model.FeatureSource r41 = com.facebook.dcp.model.FeatureSource.PREFER_CLIENT
            if (r3 == 0) goto L_0x01a4
            goto L_0x015b
        L_0x01a4:
            r46 = 0
            if (r3 == 0) goto L_0x0177
            goto L_0x0171
        L_0x01a9:
            r41 = 0
            r38 = 0
            java.lang.String r1 = "double_list"
            com.google.common.collect.ImmutableList r36 = r0.getDoubleList(r1)
            X.C04220Ms.A06(r36)
            r40 = 32511(0x7eff, float:4.5558E-41)
            com.facebook.dcp.model.DcpData r31 = new com.facebook.dcp.model.DcpData
            r33 = r32
            r34 = r32
            r35 = r32
            r37 = r32
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r41)
            goto L_0x0122
        L_0x01c7:
            r41 = 0
            r38 = 0
            java.lang.String r1 = "int32_list"
            com.google.common.collect.ImmutableList r0 = r0.getIntList(r1)
            X.C04220Ms.A06(r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x01dc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r11.next()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            long r0 = (long) r0
            X.C86144wL.A1U(r2, r0)
            goto L_0x01dc
        L_0x01ef:
            r40 = 32639(0x7f7f, float:4.5737E-41)
            com.facebook.dcp.model.DcpData r31 = new com.facebook.dcp.model.DcpData
            r33 = r32
            r34 = r32
            r35 = r2
            r36 = r32
            r37 = r32
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r41)
            goto L_0x0122
        L_0x0202:
            r41 = 0
            r38 = 0
            java.lang.String r1 = "string_list"
            com.google.common.collect.ImmutableList r37 = r0.getStringList(r1)
            X.C04220Ms.A06(r37)
            r40 = 32255(0x7dff, float:4.5199E-41)
            com.facebook.dcp.model.DcpData r31 = new com.facebook.dcp.model.DcpData
            r33 = r32
            r34 = r32
            r35 = r32
            r36 = r32
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r41)
            goto L_0x0122
        L_0x0220:
            r41 = 0
            r38 = 0
            java.lang.String r1 = "string_value"
            java.lang.String r34 = r0.getStringValue(r1)
            r40 = 32735(0x7fdf, float:4.5872E-41)
            com.facebook.dcp.model.DcpData r31 = new com.facebook.dcp.model.DcpData
            r33 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r41)
            goto L_0x0122
        L_0x023b:
            r1 = 0
            java.lang.String r11 = "float_value"
            double r38 = r0.getDoubleValue(r11)
            r40 = 32751(0x7fef, float:4.5894E-41)
            goto L_0x0251
        L_0x0246:
            java.lang.String r1 = "int_value"
            int r0 = r0.getIntValue(r1)
            long r1 = (long) r0
            r38 = 0
            r40 = 32759(0x7ff7, float:4.5905E-41)
        L_0x0251:
            com.facebook.dcp.model.DcpData r31 = new com.facebook.dcp.model.DcpData
            r33 = r32
            r34 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r41 = r1
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r41)
            goto L_0x0122
        L_0x0264:
            r0 = r32
            goto L_0x0117
        L_0x0268:
            r11 = 0
            goto L_0x00ff
        L_0x026b:
            java.lang.String r0 = "purpose"
            java.lang.String r58 = r4.getStringValue(r0)
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r5, r6)
            r57 = 0
            if (r0 == 0) goto L_0x0302
            java.lang.String r56 = r0.getStringValue(r12)
        L_0x027d:
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x0287
            java.lang.String r57 = r0.getStringValue(r14)
        L_0x0287:
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$CacheConfig> r0 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.CacheConfig.class
            java.lang.String r9 = "cache_config"
            com.facebook.pando.TreeJNI r27 = r4.getTreeValue(r9, r0)
            if (r56 == 0) goto L_0x07cf
            if (r57 == 0) goto L_0x07cf
            if (r58 == 0) goto L_0x07cf
            java.util.HashSet r0 = X.C18200wM.A0u()
            r1 = r29
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r13, r1)
            if (r3 == 0) goto L_0x02ff
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.class
            java.lang.String r1 = "features_list"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x02ff
        L_0x02ab:
            java.util.Iterator r6 = r1.iterator()
        L_0x02af:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0306
            com.facebook.pando.TreeJNI r3 = X.C18210wN.A0G(r6)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.class
            java.lang.String r1 = "metadata_config"
            X.83w r5 = X.C18250wR.A0G(r3, r2, r1)
        L_0x02c1:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x02af
            java.lang.Object r3 = r5.next()
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$FeaturesConfig$FeaturesList$MetadataConfig$Metadata> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.FeaturesConfig.FeaturesList.MetadataConfig.Metadata.class
            java.lang.String r1 = "metadata"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x02f9
            java.lang.String r1 = "input_signal_list"
            com.google.common.collect.ImmutableList r2 = r2.getIntList(r1)
            if (r2 == 0) goto L_0x02f9
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x02e7:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x02fb
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
            goto L_0x02e7
        L_0x02f9:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x02fb:
            r0.addAll(r1)
            goto L_0x02c1
        L_0x02ff:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            goto L_0x02ab
        L_0x0302:
            r56 = r57
            goto L_0x027d
        L_0x0306:
            long r63 = r30.Azv()
            java.util.List r61 = X.AnonymousClass00J.A0N(r0)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$TrainerConfig> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.TrainerConfig.class
            java.lang.String r1 = "trainer_config"
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x07c7
            java.util.HashMap r13 = X.AnonymousClass0wJ.A0y()
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x034f
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$TrainerConfig$Features> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.TrainerConfig.Features.class
            java.lang.String r1 = "features"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x034f
        L_0x032c:
            java.util.Iterator r6 = r1.iterator()
        L_0x0330:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0352
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r6)
            java.lang.String r5 = X.C86134wK.A0o(r1)
            java.lang.String r3 = X.C86134wK.A0o(r1)
            int r2 = r1.getIntValue(r14)
            X.5I2 r1 = new X.5I2
            r1.<init>(r3, r2)
            r13.put(r5, r1)
            goto L_0x0330
        L_0x034f:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            goto L_0x032c
        L_0x0352:
            java.lang.String r12 = "feature_preference"
            boolean r1 = r0.hasFieldValue(r12)
            if (r1 == 0) goto L_0x0463
            int r2 = r0.getIntValue(r12)
            r1 = 1
            if (r2 == r1) goto L_0x045f
            r1 = r18
            if (r2 != r1) goto L_0x0463
            com.facebook.dcp.model.ExampleSource r43 = com.facebook.dcp.model.ExampleSource.CLIENT
        L_0x0367:
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$TrainerConfig$Features> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.TrainerConfig.Features.class
            java.lang.String r10 = "features"
            com.google.common.collect.ImmutableList r1 = r0.getTreeList(r10, r1)
            if (r1 != 0) goto L_0x0377
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x0377:
            java.util.Iterator r30 = r1.iterator()
        L_0x037b:
            boolean r1 = r30.hasNext()
            if (r1 == 0) goto L_0x0467
            com.facebook.pando.TreeJNI r3 = X.C18210wN.A0G(r30)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            if (r3 == 0) goto L_0x045b
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$TrainerConfig$Features$Rules> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.TrainerConfig.Features.Rules.class
            java.lang.String r1 = "rules"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x045b
        L_0x0395:
            java.util.Iterator r29 = r1.iterator()
        L_0x0399:
            boolean r1 = r29.hasNext()
            if (r1 == 0) goto L_0x043f
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r29)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$TrainerConfig$Features$Rules$Value> r5 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.TrainerConfig.Features.Rules.Value.class
            java.lang.String r1 = "value"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r1, r5)
            if (r1 != 0) goto L_0x03e3
            r1 = 0
        L_0x03ae:
            java.lang.String r5 = "type"
            int r5 = r2.getIntValue(r5)
            com.facebook.dcp.model.Type r5 = A00(r5)
            java.lang.String r6 = "comparator"
            int r2 = r2.getIntValue(r6)
            switch(r2) {
                case 1: goto L_0x03ce;
                case 2: goto L_0x03d1;
                case 3: goto L_0x03d4;
                case 4: goto L_0x03d7;
                case 5: goto L_0x03da;
                case 6: goto L_0x03dd;
                case 7: goto L_0x03c1;
                case 8: goto L_0x03e0;
                default: goto L_0x03c1;
            }
        L_0x03c1:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.NO_RULE
        L_0x03c3:
            if (r1 == 0) goto L_0x0399
            com.facebook.dcp.model.DcpRule r2 = new com.facebook.dcp.model.DcpRule
            r2.<init>(r1, r6, r5)
            r8.add(r2)
            goto L_0x0399
        L_0x03ce:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.EQUAL
            goto L_0x03c3
        L_0x03d1:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.GREATER_THAN
            goto L_0x03c3
        L_0x03d4:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.GREATER_THAN_OR_EQUAL
            goto L_0x03c3
        L_0x03d7:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.LESS_THAN
            goto L_0x03c3
        L_0x03da:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.LESS_THAN_OR_EQUAL
            goto L_0x03c3
        L_0x03dd:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.GREATER_THAN_OR_LESS_THAN
            goto L_0x03c3
        L_0x03e0:
            com.facebook.dcp.model.DcpRuleType r6 = com.facebook.dcp.model.DcpRuleType.NOT_EQUAL
            goto L_0x03c3
        L_0x03e3:
            java.lang.String r5 = "float_value"
            double r38 = r1.getDoubleValue(r5)
            java.lang.String r5 = "int_value"
            int r5 = r1.getIntValue(r5)
            long r15 = (long) r5
            java.lang.String r5 = "string_value"
            java.lang.String r34 = r1.getStringValue(r5)
            java.lang.String r5 = "string_list"
            com.google.common.collect.ImmutableList r37 = r1.getStringList(r5)
            java.lang.String r5 = "int32_list"
            com.google.common.collect.ImmutableList r5 = r1.getIntList(r5)
            X.C04220Ms.A06(r5)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0w(r5)
            java.util.Iterator r28 = r5.iterator()
        L_0x040d:
            boolean r5 = r28.hasNext()
            if (r5 == 0) goto L_0x0420
            java.lang.Object r5 = r28.next()
            int r5 = X.AnonymousClass0wJ.A04(r5)
            long r5 = (long) r5
            X.C86144wL.A1U(r7, r5)
            goto L_0x040d
        L_0x0420:
            java.lang.String r5 = "double_list"
            com.google.common.collect.ImmutableList r36 = r1.getDoubleList(r5)
            r32 = 0
            X.C04220Ms.A06(r36)
            X.C04220Ms.A06(r37)
            r40 = 31815(0x7c47, float:4.4582E-41)
            com.facebook.dcp.model.DcpData r1 = new com.facebook.dcp.model.DcpData
            r31 = r1
            r33 = r32
            r35 = r7
            r41 = r15
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r41)
            goto L_0x03ae
        L_0x043f:
            boolean r1 = X.C18250wR.A1K(r8)
            if (r1 == 0) goto L_0x037b
            java.lang.String r2 = X.C86134wK.A0o(r3)
            int r3 = r3.getIntValue(r14)
            X.5I2 r1 = new X.5I2
            r1.<init>(r2, r3)
            java.util.List r2 = X.AnonymousClass00J.A0N(r8)
            r11.put(r1, r2)
            goto L_0x037b
        L_0x045b:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            goto L_0x0395
        L_0x045f:
            com.facebook.dcp.model.ExampleSource r43 = com.facebook.dcp.model.ExampleSource.SERVER
            goto L_0x0367
        L_0x0463:
            com.facebook.dcp.model.ExampleSource r43 = com.facebook.dcp.model.ExampleSource.COMBINE
            goto L_0x0367
        L_0x0467:
            java.lang.String r30 = "is_enabled"
            r1 = r30
            boolean r54 = r0.getBooleanValue(r1)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$TrainerConfig$TimeConfig> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.TrainerConfig.TimeConfig.class
            java.lang.String r2 = "time_config"
            com.facebook.pando.TreeJNI r5 = r0.getTreeValue(r2, r1)
            if (r5 == 0) goto L_0x054e
            java.lang.String r3 = "time_out_in_seconds"
            java.lang.String r3 = r5.getStringValue(r3)
            if (r3 == 0) goto L_0x054e
            long r48 = java.lang.Long.parseLong(r3)
        L_0x0485:
            com.facebook.pando.TreeJNI r5 = r0.getTreeValue(r2, r1)
            if (r5 == 0) goto L_0x054a
            java.lang.String r3 = "refresh_interval_in_seconds"
            java.lang.String r3 = r5.getStringValue(r3)
            if (r3 == 0) goto L_0x054a
            long r50 = java.lang.Long.parseLong(r3)
        L_0x0497:
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r2, r1)
            if (r1 == 0) goto L_0x0546
            java.lang.String r3 = "schedule_interval_in_minutes"
            java.lang.String r1 = r1.getStringValue(r3)
            if (r1 == 0) goto L_0x0546
            long r52 = java.lang.Long.parseLong(r1)
        L_0x04a9:
            java.lang.String r29 = "log_level"
            r1 = r29
            int r0 = r0.getIntValue(r1)
            com.facebook.dcp.model.LogLevel r1 = new com.facebook.dcp.model.LogLevel
            r1.<init>(r0)
            r47 = 128(0x80, float:1.794E-43)
            r15 = 0
            com.facebook.dcp.model.TrainerMetadata r55 = new com.facebook.dcp.model.TrainerMetadata
            r42 = r55
            r44 = r1
            r45 = r13
            r46 = r11
            r42.<init>(r43, r44, r45, r46, r47, r48, r50, r52, r54)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$PredictorConfig> r7 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.PredictorConfig.class
            java.lang.String r6 = "predictor_config"
            com.facebook.pando.TreeJNI r1 = r4.getTreeValue(r6, r7)
            if (r1 == 0) goto L_0x07bf
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$PredictorConfig$ModelConfig> r3 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.PredictorConfig.ModelConfig.class
            java.lang.String r0 = "model_config"
            com.facebook.pando.TreeJNI r0 = r1.getTreeValue(r0, r3)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$PredictorConfig$ControlConfig> r5 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.PredictorConfig.ControlConfig.class
            java.lang.String r3 = "control_config"
            com.facebook.pando.TreeJNI r3 = r1.getTreeValue(r3, r5)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$PredictorConfig$TimeConfig> r5 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.PredictorConfig.TimeConfig.class
            com.facebook.pando.TreeJNI r8 = r1.getTreeValue(r2, r5)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$PredictorConfig$CacheConfig> r2 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.PredictorConfig.CacheConfig.class
            com.facebook.pando.TreeJNI r13 = r1.getTreeValue(r9, r2)
            if (r0 == 0) goto L_0x07b7
            if (r3 == 0) goto L_0x07b7
            if (r8 == 0) goto L_0x07b7
            if (r13 == 0) goto L_0x07b7
            java.lang.String r5 = "model_name"
            java.lang.String r2 = r0.getStringValue(r5)
            if (r2 == 0) goto L_0x07af
            java.lang.String r2 = "model_version"
            java.lang.String r9 = r0.getStringValue(r2)
            if (r9 == 0) goto L_0x07af
            java.lang.String r11 = "model_asset_name"
            java.lang.String r9 = r0.getStringValue(r11)
            if (r9 == 0) goto L_0x07af
            java.util.HashMap r28 = X.AnonymousClass0wJ.A0y()
            com.facebook.pando.TreeJNI r7 = r4.getTreeValue(r6, r7)
            if (r7 == 0) goto L_0x0543
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$PredictorConfig$Features> r6 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.PredictorConfig.Features.class
            com.google.common.collect.ImmutableList r6 = r7.getTreeList(r10, r6)
            if (r6 == 0) goto L_0x0543
        L_0x051e:
            java.util.Iterator r16 = r6.iterator()
        L_0x0522:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x0552
            com.facebook.pando.TreeJNI r6 = X.C18210wN.A0G(r16)
            java.lang.String r10 = X.C86134wK.A0o(r6)
            java.lang.String r9 = X.C86134wK.A0o(r6)
            int r7 = r6.getIntValue(r14)
            X.5I2 r6 = new X.5I2
            r6.<init>(r9, r7)
            r7 = r28
            r7.put(r10, r6)
            goto L_0x0522
        L_0x0543:
            X.0ZV r6 = X.AnonymousClass0ZV.A00
            goto L_0x051e
        L_0x0546:
            r52 = 0
            goto L_0x04a9
        L_0x054a:
            r50 = 3600(0xe10, double:1.7786E-320)
            goto L_0x0497
        L_0x054e:
            r48 = 600(0x258, double:2.964E-321)
            goto L_0x0485
        L_0x0552:
            boolean r6 = r1.hasFieldValue(r12)
            if (r6 == 0) goto L_0x063c
            int r7 = r1.getIntValue(r12)
            r6 = 1
            if (r7 == r6) goto L_0x0638
            r6 = r18
            if (r7 != r6) goto L_0x063c
            com.facebook.dcp.model.ExampleSource r31 = com.facebook.dcp.model.ExampleSource.CLIENT
        L_0x0565:
            java.lang.String r6 = "model_positive_threshold"
            boolean r7 = r0.hasFieldValue(r6)
            if (r7 == 0) goto L_0x0634
            double r36 = r0.getDoubleValue(r6)
        L_0x0571:
            java.lang.String r33 = r0.getStringValue(r5)
            java.lang.String r6 = ""
            if (r33 != 0) goto L_0x057b
            r33 = r6
        L_0x057b:
            java.lang.String r2 = r0.getStringValue(r2)
            long r40 = X.C86144wL.A0D(r2)
            java.lang.String r34 = r0.getStringValue(r11)
            if (r34 != 0) goto L_0x058b
            r34 = r6
        L_0x058b:
            java.lang.String r2 = "default_confidence"
            double r38 = r0.getDoubleValue(r2)
            r0 = r30
            boolean r52 = r3.getBooleanValue(r0)
            r0 = 1183(0x49f, float:1.658E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            boolean r53 = r3.getBooleanValue(r0)
            r0 = 1191(0x4a7, float:1.669E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            boolean r54 = r3.getBooleanValue(r0)
            java.lang.String r0 = "time_out_in_seconds"
            java.lang.String r0 = r8.getStringValue(r0)
            if (r0 == 0) goto L_0x0631
            long r42 = java.lang.Long.parseLong(r0)
        L_0x05b7:
            java.lang.String r0 = "refresh_interval_in_seconds"
            java.lang.String r0 = r8.getStringValue(r0)
            if (r0 == 0) goto L_0x062e
            long r44 = java.lang.Long.parseLong(r0)
        L_0x05c3:
            java.lang.String r0 = "schedule_interval_in_minutes"
            java.lang.String r0 = r8.getStringValue(r0)
            if (r0 == 0) goto L_0x062b
            long r46 = java.lang.Long.parseLong(r0)
        L_0x05cf:
            java.lang.String r0 = "cache_ttl_in_minutes"
            int r0 = r13.getIntValue(r0)
            long r2 = (long) r0
            java.lang.String r5 = "cache_ttl_in_days"
            java.lang.String r0 = r13.getStringValue(r5)
            if (r0 == 0) goto L_0x0628
            long r50 = java.lang.Long.parseLong(r0)
        L_0x05e2:
            r0 = r29
            int r0 = r1.getIntValue(r0)
            com.facebook.dcp.model.LogLevel r1 = new com.facebook.dcp.model.LogLevel
            r1.<init>(r0)
            com.facebook.dcp.model.PredictorMetadata r30 = new com.facebook.dcp.model.PredictorMetadata
            r32 = r1
            r35 = r28
            r48 = r2
            r30.<init>(r31, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$Context> r7 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.Context.class
            java.lang.String r3 = "context"
            com.facebook.pando.TreeJNI r1 = r4.getTreeValue(r3, r7)
            if (r1 == 0) goto L_0x064f
            java.lang.String r0 = "signal_ids"
            com.google.common.collect.ImmutableList r1 = r1.getIntList(r0)
            if (r1 == 0) goto L_0x064f
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0612:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0640
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r6)
            r0.add(r1)
            goto L_0x0612
        L_0x0628:
            r50 = 0
            goto L_0x05e2
        L_0x062b:
            r46 = 0
            goto L_0x05cf
        L_0x062e:
            r44 = 3600(0xe10, double:1.7786E-320)
            goto L_0x05c3
        L_0x0631:
            r42 = 300(0x12c, double:1.48E-321)
            goto L_0x05b7
        L_0x0634:
            r36 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x0571
        L_0x0638:
            com.facebook.dcp.model.ExampleSource r31 = com.facebook.dcp.model.ExampleSource.SERVER
            goto L_0x0565
        L_0x063c:
            com.facebook.dcp.model.ExampleSource r31 = com.facebook.dcp.model.ExampleSource.COMBINE
            goto L_0x0565
        L_0x0640:
            java.util.LinkedHashMap r1 = X.C18220wO.A0y()
            X.AnonymousClass4WJ.A0J(r0, r1)
            r0 = 15
            com.facebook.dcp.model.DcpContext r2 = new com.facebook.dcp.model.DcpContext
            r2.<init>(r15, r15, r1, r0)
            goto L_0x0651
        L_0x064f:
            com.facebook.dcp.model.DcpContext r2 = com.facebook.dcp.model.DcpContext.A05
        L_0x0651:
            com.facebook.pando.TreeJNI r1 = r4.getTreeValue(r3, r7)
            if (r1 == 0) goto L_0x068c
            java.lang.String r0 = "feature_ids"
            com.google.common.collect.ImmutableList r1 = r1.getIntList(r0)
            if (r1 == 0) goto L_0x068c
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x0667:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x067d
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r6)
            r0.add(r1)
            goto L_0x0667
        L_0x067d:
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            X.AnonymousClass4WJ.A0J(r0, r6)
            r0 = 15
            com.facebook.dcp.model.DcpContext r1 = new com.facebook.dcp.model.DcpContext
            r1.<init>(r15, r15, r6, r0)
            goto L_0x068e
        L_0x068c:
            com.facebook.dcp.model.DcpContext r1 = com.facebook.dcp.model.DcpContext.A05
        L_0x068e:
            com.facebook.pando.TreeJNI r6 = r4.getTreeValue(r3, r7)
            com.facebook.dcp.model.DcpContext r0 = com.facebook.dcp.model.DcpContext.A05
            if (r6 == 0) goto L_0x076c
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$Context$UsecaseFeatures> r4 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.Context.UsecaseFeatures.class
            java.lang.String r3 = "usecase_features"
            com.google.common.collect.ImmutableList r3 = r6.getTreeList(r3, r4)
            if (r3 == 0) goto L_0x076c
            X.83w r9 = r3.iterator()
        L_0x06a4:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x076c
            java.lang.Object r6 = r9.next()
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            java.lang.String r3 = "type"
            int r3 = r6.getIntValue(r3)
            com.facebook.dcp.model.Type r7 = A00(r3)
            int r4 = r7.ordinal()
            r3 = r19
            if (r4 == r3) goto L_0x0743
            r3 = 1
            if (r4 == r3) goto L_0x0716
            r3 = r18
            if (r4 == r3) goto L_0x06f6
            r3 = 4
            if (r4 != r3) goto L_0x07a3
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$Context$UsecaseFeatures$Default> r4 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.Context.UsecaseFeatures.Default.class
            java.lang.String r3 = "default"
            com.facebook.pando.TreeJNI r4 = r6.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x06f4
            java.lang.String r3 = "string_list"
            com.google.common.collect.ImmutableList r14 = r4.getStringList(r3)
        L_0x06dc:
            java.lang.String r4 = X.C18220wO.A0l(r6)
            if (r4 == 0) goto L_0x06a4
            if (r14 == 0) goto L_0x06a4
            java.util.Map r3 = r0.A04
            java.lang.String r11 = ","
            r16 = 62
            r12 = r15
            r13 = r15
            java.lang.String r6 = X.AnonymousClass00J.A0H(r11, r12, r13, r14, r15, r16)
            r3.put(r4, r6)
            goto L_0x06a4
        L_0x06f4:
            r14 = r15
            goto L_0x06dc
        L_0x06f6:
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$Context$UsecaseFeatures$Default> r4 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.Context.UsecaseFeatures.Default.class
            java.lang.String r3 = "default"
            com.facebook.pando.TreeJNI r4 = r6.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x0714
            java.lang.String r3 = "string_value"
            java.lang.String r4 = r4.getStringValue(r3)
        L_0x0706:
            java.lang.String r6 = X.C18220wO.A0l(r6)
            if (r6 == 0) goto L_0x06a4
            if (r4 == 0) goto L_0x06a4
            java.util.Map r3 = r0.A04
            r3.put(r6, r4)
            goto L_0x06a4
        L_0x0714:
            r4 = r15
            goto L_0x0706
        L_0x0716:
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$Context$UsecaseFeatures$Default> r4 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.Context.UsecaseFeatures.Default.class
            java.lang.String r3 = "default"
            com.facebook.pando.TreeJNI r4 = r6.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x0741
            java.lang.String r3 = "float_value"
            double r3 = r4.getDoubleValue(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
        L_0x072a:
            java.lang.String r6 = X.C18220wO.A0l(r6)
            if (r6 == 0) goto L_0x06a4
            if (r3 == 0) goto L_0x06a4
            java.util.Map r4 = r0.A02
            double r7 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r4.put(r6, r3)
            goto L_0x06a4
        L_0x0741:
            r3 = r15
            goto L_0x072a
        L_0x0743:
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$Usecases$Context$UsecaseFeatures$Default> r4 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.Context.UsecaseFeatures.Default.class
            java.lang.String r3 = "default"
            com.facebook.pando.TreeJNI r4 = r6.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x076a
            java.lang.String r3 = "int_value"
            int r3 = r4.getIntValue(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0757:
            java.lang.String r6 = X.C18220wO.A0l(r6)
            if (r6 == 0) goto L_0x06a4
            if (r3 == 0) goto L_0x06a4
            java.util.Map r4 = r0.A03
            java.lang.Long r3 = X.C86144wL.A0c(r3)
            r4.put(r6, r3)
            goto L_0x06a4
        L_0x076a:
            r3 = r15
            goto L_0x0757
        L_0x076c:
            if (r27 == 0) goto L_0x079c
            r3 = r27
            java.lang.String r3 = r3.getStringValue(r5)
            if (r3 == 0) goto L_0x079c
            long r65 = java.lang.Long.parseLong(r3)
        L_0x077a:
            java.lang.String r59 = "default_model_name"
            java.lang.String r60 = "1.0"
            r67 = 1
            com.facebook.dcp.model.UseCaseMetadata r3 = new com.facebook.dcp.model.UseCaseMetadata
            r50 = r3
            r51 = r2
            r52 = r1
            r53 = r0
            r54 = r30
            r62 = r20
            r68 = r19
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r65, r67, r68)
            r1 = r23
            r0 = r17
            r1.put(r0, r3)
            goto L_0x0045
        L_0x079c:
            r65 = 30
            goto L_0x077a
        L_0x079f:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            goto L_0x00b1
        L_0x07a3:
            java.lang.String r0 = "Unsupported context data type: "
            java.lang.String r1 = X.AnonymousClass0wJ.A0t(r0, r7)
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        L_0x07af:
            java.lang.String r1 = "Got at least one null component in model config in predictor config response from server"
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        L_0x07b7:
            java.lang.String r1 = "Got null model config or control config or time config or cache config in predictor config response from server"
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        L_0x07bf:
            java.lang.String r1 = "Got null predictor config in response from server"
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        L_0x07c7:
            java.lang.String r1 = "Got null trainer config in response from server"
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        L_0x07cf:
            X.6Bi r0 = new X.6Bi
            r0.<init>(r7)
            throw r0
        L_0x07d5:
            X.6Bi r0 = new X.6Bi
            r0.<init>(r7)
            throw r0
        L_0x07db:
            X.6Bi r0 = new X.6Bi
            r0.<init>(r7)
            throw r0
        L_0x07e1:
            com.facebook.dcp.model.MetadataResponse r1 = new com.facebook.dcp.model.MetadataResponse
            r0 = r23
            r1.<init>(r0)
            return r1
        L_0x07e9:
            java.lang.String r1 = "Got null FL usecase metadata response from server"
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        L_0x07f1:
            java.lang.String r1 = "Got null FL metadata response from server"
            X.6Bi r0 = new X.6Bi
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass775.A01(X.7DX, com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata, java.util.Set):com.facebook.dcp.model.MetadataResponse");
    }

    public static final Type A00(int i) {
        switch (i) {
            case 1:
                return Type.DOUBLE;
            case 2:
                return Type.LONG;
            case 3:
                return Type.BOOLEAN;
            case 4:
                return Type.STRING;
            case 5:
                return Type.STRING_LIST;
            case 6:
                return Type.LONG_LIST;
            case 7:
                return Type.DOUBLE_LIST;
            default:
                throw new C97436Bi("Invalid default data type");
        }
    }
}

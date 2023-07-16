package X;

/* renamed from: X.6Vo  reason: invalid class name and case insensitive filesystem */
public final class C102536Vo {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        r10 = com.facebook.graphql.impls.NativeFeatureImpl.class;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C114846tz A00(com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl r23, X.AnonymousClass22C r24) {
        /*
            r0 = 1
            r7 = r24
            X.C04220Ms.A0B(r7, r0)
            java.lang.Class<com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl$XcxpUnifiedCrosspostingConfigsRoot> r1 = com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.class
            r0 = 529(0x211, float:7.41E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2 = r23
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0179
            java.lang.Class<com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigsV2> r1 = com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigsV2.class
            java.lang.String r0 = "content_compatibility_configs_v2"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0179
            java.lang.Class<com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigsV2$SourceNativeFeatures> r1 = com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigsV2.SourceNativeFeatures.class
            java.lang.String r0 = "source_native_features"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0179
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            X.83w r18 = r0.iterator()
        L_0x0032:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r3 = r18.next()
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigsV2$SourceNativeFeatures$SourceNativeFeature> r1 = com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigsV2.SourceNativeFeatures.SourceNativeFeature.class
            java.lang.String r0 = "source_native_feature"
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl> r10 = com.facebook.graphql.impls.NativeFeatureImpl.class
            com.facebook.pando.TreeJNI r2 = r0.reinterpret(r10)
            if (r2 == 0) goto L_0x0032
            X.69O r1 = X.AnonymousClass69O.A0K
            java.lang.String r0 = "client_native_feature_id"
            java.lang.Enum r5 = X.C86104wH.A0a(r2, r1, r0)
            if (r5 == 0) goto L_0x0032
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl$ChildNativeFeatureConfigs> r9 = com.facebook.graphql.impls.NativeFeatureImpl.ChildNativeFeatureConfigs.class
            java.lang.String r8 = "child_native_feature_configs"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r2, r9, r8)
            r2 = 10
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r0, r2)
            java.util.Iterator r15 = r0.iterator()
        L_0x006c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00cc
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r15)
            X.22D r1 = X.AnonymousClass22D.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "surfaces"
            com.google.common.collect.ImmutableList r22 = r13.getEnumList(r0, r1)
            X.C04220Ms.A06(r22)
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl$ChildNativeFeatureConfigs$ContentTypeControllers> r1 = com.facebook.graphql.impls.NativeFeatureImpl.ChildNativeFeatureConfigs.ContentTypeControllers.class
            java.lang.String r0 = "content_type_controllers"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r13, r1, r0)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r14 = r0.iterator()
        L_0x0091:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00a9
            com.facebook.pando.TreeJNI r11 = X.C18210wN.A0G(r14)
            X.22p r1 = X.C307122p.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "content_type"
            java.lang.Enum r0 = X.C86104wH.A0a(r11, r1, r0)
            if (r0 == 0) goto L_0x0091
            r12.add(r0)
            goto L_0x0091
        L_0x00a9:
            X.680 r1 = X.AnonymousClass680.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "client_behavior"
            java.lang.Enum r11 = X.C86104wH.A0a(r13, r1, r0)
            X.680 r11 = (X.AnonymousClass680) r11
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl$ChildNativeFeatureConfigs$AdditionalEligibilityRules> r1 = com.facebook.graphql.impls.NativeFeatureImpl.ChildNativeFeatureConfigs.AdditionalEligibilityRules.class
            java.lang.String r0 = "additional_eligibility_rules"
            com.google.common.collect.ImmutableList r24 = X.C18230wP.A0P(r13, r1, r0)
            X.6un r0 = new X.6un
            r19 = r0
            r20 = r7
            r21 = r11
            r23 = r12
            r19.<init>(r20, r21, r22, r23, r24)
            r4.add(r0)
            goto L_0x006c
        L_0x00cc:
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigsV2$SourceNativeFeatures$DestinationNativeFeatures> r1 = com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigsV2.SourceNativeFeatures.DestinationNativeFeatures.class
            java.lang.String r0 = "destination_native_features"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r3, r1, r0)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0x(r0, r2)
            java.util.Iterator r17 = r0.iterator()
        L_0x00e0:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0167
            com.facebook.pando.TreeJNI r0 = X.C18210wN.A0G(r17)
            com.facebook.pando.TreeJNI r2 = r0.reinterpret(r10)
            X.22C r1 = X.AnonymousClass22C.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "app_name"
            java.lang.Enum r3 = X.C86104wH.A0a(r2, r1, r0)
            X.22C r3 = (X.AnonymousClass22C) r3
            if (r3 == 0) goto L_0x0160
            X.83w r16 = X.C18250wR.A0G(r2, r9, r8)
        L_0x00fe:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r14 = r16.next()
            com.facebook.pando.TreeJNI r14 = (com.facebook.pando.TreeJNI) r14
            X.22D r1 = X.AnonymousClass22D.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "surfaces"
            com.google.common.collect.ImmutableList r22 = r14.getEnumList(r0, r1)
            X.C04220Ms.A06(r22)
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl$ChildNativeFeatureConfigs$ContentTypeControllers> r1 = com.facebook.graphql.impls.NativeFeatureImpl.ChildNativeFeatureConfigs.ContentTypeControllers.class
            java.lang.String r0 = "content_type_controllers"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r14, r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r15 = r0.iterator()
        L_0x0125:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x013d
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r15)
            X.22p r1 = X.C307122p.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "content_type"
            java.lang.Enum r0 = X.C86104wH.A0a(r13, r1, r0)
            if (r0 == 0) goto L_0x0125
            r2.add(r0)
            goto L_0x0125
        L_0x013d:
            X.680 r1 = X.AnonymousClass680.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "client_behavior"
            java.lang.Enum r1 = X.C86104wH.A0a(r14, r1, r0)
            X.680 r1 = (X.AnonymousClass680) r1
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl$ChildNativeFeatureConfigs$AdditionalEligibilityRules> r13 = com.facebook.graphql.impls.NativeFeatureImpl.ChildNativeFeatureConfigs.AdditionalEligibilityRules.class
            java.lang.String r0 = "additional_eligibility_rules"
            com.google.common.collect.ImmutableList r24 = X.C18230wP.A0P(r14, r13, r0)
            X.6un r0 = new X.6un
            r19 = r0
            r20 = r3
            r21 = r1
            r23 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            r11.add(r0)
            goto L_0x00fe
        L_0x0160:
            kotlin.Unit r0 = kotlin.Unit.A00
            r12.add(r0)
            goto L_0x00e0
        L_0x0167:
            java.util.List r2 = X.AnonymousClass00J.A0N(r4)
            java.util.List r1 = X.AnonymousClass00J.A0N(r11)
            X.6ty r0 = new X.6ty
            r0.<init>(r2, r1)
            r6.put(r5, r0)
            goto L_0x0032
        L_0x0179:
            java.util.Map r1 = X.AnonymousClass4WJ.A0A()
            goto L_0x0182
        L_0x017e:
            java.util.Map r1 = X.AnonymousClass4WJ.A0E(r6)
        L_0x0182:
            X.6tz r0 = new X.6tz
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102536Vo.A00(com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl, X.22C):X.6tz");
    }
}

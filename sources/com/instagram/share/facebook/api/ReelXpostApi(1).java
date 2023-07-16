package com.instagram.share.facebook.api;

import X.AnonymousClass3WK;
import X.C146958n9;
import X.C18180wK;
import X.C313325o;
import X.C63233h2;
import X.C67463zb;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.CXPFeatureImpl;
import com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl;
import java.util.Iterator;

public final class ReelXpostApi {
    public static final ReelXpostApi A00 = new ReelXpostApi();

    public static final Object A02(UserSession userSession, Long l, String str, C146958n9 r17) {
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A004, "IG", "source_app");
        GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A005, "FB", "destination_app");
        GraphQlCallInput.A05(A005, "REELS", "destination_surface");
        GraphQlCallInput.A05(A005, "REELS", "source_surface");
        GraphQlCallInput.A05(A005, str, "cross_app_share_type");
        A004.A0A("crosspost_app_surface_list", C18180wK.A0n(A005));
        A002.A02(A004, "configs_request");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A04(true), "CrossPostingContentCompatibilityConfig", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), CrossPostingContentCompatibilityConfigResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_unified_crossposting_configs_root");
        long longValue = l.longValue();
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(longValue).setFreshCacheAgeMs(longValue);
        return AnonymousClass3WK.A01(userSession).A06(pandoGraphQLRequest, r17);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x04d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x04ce A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x04ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x04a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0488 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0485 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x03a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x039c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x039a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0396 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x02c4 A[EDGE_INSN: B:354:0x02c4->B:176:0x02c4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x02ba A[EDGE_INSN: B:355:0x02ba->B:172:0x02ba ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x02b0 A[EDGE_INSN: B:358:0x02b0->B:168:0x02b0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x02a6 A[EDGE_INSN: B:360:0x02a6->B:164:0x02a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x029c A[EDGE_INSN: B:361:0x029c->B:160:0x029c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0292 A[EDGE_INSN: B:364:0x0292->B:156:0x0292 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0288 A[EDGE_INSN: B:365:0x0288->B:152:0x0288 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x027f A[EDGE_INSN: B:367:0x027f->B:148:0x027f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0276 A[EDGE_INSN: B:370:0x0276->B:144:0x0276 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x026b A[EDGE_INSN: B:372:0x026b->B:139:0x026b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x01f6 A[EDGE_INSN: B:374:0x01f6->B:112:0x01f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0181 A[EDGE_INSN: B:376:0x0181->B:85:0x0181 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.CKX A01(com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl r24) {
        /*
            r23 = 0
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl$XcxpUnifiedCrosspostingConfigsRoot> r1 = com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.class
            java.lang.String r0 = "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)"
            r2 = r24
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            r8 = 0
            r6 = 1
            if (r2 == 0) goto L_0x04fd
            java.lang.Class<com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigs> r1 = com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigs.class
            java.lang.String r0 = "content_compatibility_configs"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x04fd
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x04fd
            java.lang.Class<com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigs$FeatureLists> r1 = com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigs.FeatureLists.class
            java.lang.String r0 = "feature_lists"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x04fd
            java.util.Iterator r5 = r0.iterator()
        L_0x0034:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r3 = r5.next()
            r2 = r3
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0034
            X.21D r1 = X.AnonymousClass21D.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "post_content_types"
            com.google.common.collect.ImmutableList r1 = r2.getEnumList(r0, r1)
            if (r1 == 0) goto L_0x0034
            X.21D r0 = X.AnonymousClass21D.SINGLE_VIDEO
            boolean r0 = r1.contains(r0)
            if (r0 != r6) goto L_0x0034
        L_0x0055:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04fd
            java.lang.Class<com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$ContentCompatibilityConfigs$FeatureLists$FeatureList> r0 = com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.ContentCompatibilityConfigs.FeatureLists.FeatureList.class
            java.lang.String r5 = "feature_list"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r5, r0)
            if (r0 == 0) goto L_0x04fd
            java.util.Iterator r7 = r0.iterator()
        L_0x0067:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0096
            com.facebook.pando.TreeJNI r6 = X.C18210wN.A0G(r7)
            if (r6 == 0) goto L_0x0067
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl> r3 = com.instagram.share.facebook.graphql.CXPFeatureImpl.class
            com.facebook.pando.TreeJNI r2 = r6.reinterpret(r3)
            com.instagram.share.facebook.graphql.CXPFeatureImpl r2 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r2
            if (r2 == 0) goto L_0x0067
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r0 = r2.getEnumValue(r0, r1)
            X.25o r0 = (X.C313325o) r0
            if (r0 == 0) goto L_0x0067
            com.facebook.pando.TreeJNI r0 = r6.reinterpret(r3)
            X.C04220Ms.A06(r0)
            r4.add(r0)
            goto L_0x0067
        L_0x0094:
            r3 = r8
            goto L_0x0055
        L_0x0096:
            java.lang.Integer r7 = X.AnonymousClass006.A00
            java.util.Iterator r6 = r4.iterator()
        L_0x009c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04fa
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.instagram.share.facebook.graphql.CXPFeatureImpl r2 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r2
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r1 = (X.C313325o) r1
            X.25o r0 = X.C313325o.A07
            if (r1 != r0) goto L_0x009c
        L_0x00b7:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04f7
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.class
            java.lang.String r0 = "feature_properties"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x04f7
            java.util.Iterator r6 = r0.iterator()
        L_0x00c9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04f4
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            X.22Q r1 = X.AnonymousClass22Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "property_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.22Q r0 = X.AnonymousClass22Q.SUB_FEATURES
            if (r1 != r0) goto L_0x00c9
        L_0x00e2:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04f7
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.class
            java.lang.String r0 = "property_value"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x04f7
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.class
            java.lang.String r0 = "property_feature_list_value"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x04f7
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue$FeatureList> r0 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.FeatureList.class
            com.google.common.collect.ImmutableList r1 = r1.getTreeList(r5, r0)
            if (r1 == 0) goto L_0x04f7
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x04d7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x04d7
        L_0x010c:
            r10 = 0
        L_0x010d:
            java.util.Iterator r6 = r4.iterator()
        L_0x0111:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04d4
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.instagram.share.facebook.graphql.CXPFeatureImpl r2 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r2
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r1 = (X.C313325o) r1
            X.25o r0 = X.C313325o.A07
            if (r1 != r0) goto L_0x0111
        L_0x012c:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04d1
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.class
            java.lang.String r0 = "feature_properties"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x04d1
            java.util.Iterator r6 = r0.iterator()
        L_0x013e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04ce
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            X.22Q r1 = X.AnonymousClass22Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "property_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.22Q r0 = X.AnonymousClass22Q.SUB_FEATURES
            if (r1 != r0) goto L_0x013e
        L_0x0157:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04d1
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.class
            java.lang.String r0 = "property_value"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x04d1
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.class
            java.lang.String r0 = "property_feature_list_value"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x04d1
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue$FeatureList> r0 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.FeatureList.class
            com.google.common.collect.ImmutableList r1 = r1.getTreeList(r5, r0)
            if (r1 == 0) goto L_0x04d1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x04b1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x04b1
        L_0x0181:
            r11 = 0
        L_0x0182:
            java.util.Iterator r6 = r4.iterator()
        L_0x0186:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04ae
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.instagram.share.facebook.graphql.CXPFeatureImpl r2 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r2
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r1 = (X.C313325o) r1
            X.25o r0 = X.C313325o.A07
            if (r1 != r0) goto L_0x0186
        L_0x01a1:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04ab
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.class
            java.lang.String r0 = "feature_properties"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x04ab
            java.util.Iterator r6 = r0.iterator()
        L_0x01b3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04a8
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            X.22Q r1 = X.AnonymousClass22Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "property_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.22Q r0 = X.AnonymousClass22Q.SUB_FEATURES
            if (r1 != r0) goto L_0x01b3
        L_0x01cc:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x04ab
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.class
            java.lang.String r0 = "property_value"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x04ab
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.class
            java.lang.String r0 = "property_feature_list_value"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x04ab
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue$FeatureList> r0 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.FeatureList.class
            com.google.common.collect.ImmutableList r1 = r1.getTreeList(r5, r0)
            if (r1 == 0) goto L_0x04ab
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x048b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x048b
        L_0x01f6:
            r12 = 0
        L_0x01f7:
            java.util.Iterator r6 = r4.iterator()
        L_0x01fb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0488
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.instagram.share.facebook.graphql.CXPFeatureImpl r2 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r2
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r1 = (X.C313325o) r1
            X.25o r0 = X.C313325o.A07
            if (r1 != r0) goto L_0x01fb
        L_0x0216:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x026b
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.class
            java.lang.String r0 = "feature_properties"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x026b
            java.util.Iterator r6 = r0.iterator()
        L_0x0228:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0485
            java.lang.Object r3 = r6.next()
            r2 = r3
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            X.22Q r1 = X.AnonymousClass22Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "property_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.22Q r0 = X.AnonymousClass22Q.SUB_FEATURES
            if (r1 != r0) goto L_0x0228
        L_0x0241:
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x026b
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.class
            java.lang.String r0 = "property_value"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x026b
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue> r1 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.class
            java.lang.String r0 = "property_feature_list_value"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x026b
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue$PropertyFeatureListValue$FeatureList> r0 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.PropertyFeatureListValue.FeatureList.class
            com.google.common.collect.ImmutableList r1 = r1.getTreeList(r5, r0)
            if (r1 == 0) goto L_0x026b
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0468
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0468
        L_0x026b:
            r13 = 0
        L_0x026c:
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0453
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0453
        L_0x0276:
            r14 = 0
        L_0x0277:
            if (r1 == 0) goto L_0x043e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x043e
        L_0x027f:
            r15 = 0
        L_0x0280:
            if (r1 == 0) goto L_0x0428
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0428
        L_0x0288:
            r16 = 0
        L_0x028a:
            if (r1 == 0) goto L_0x0412
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0412
        L_0x0292:
            r17 = 0
        L_0x0294:
            if (r1 == 0) goto L_0x03fc
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x03fc
        L_0x029c:
            r18 = 0
        L_0x029e:
            if (r1 == 0) goto L_0x03e6
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x03e6
        L_0x02a6:
            r19 = 0
        L_0x02a8:
            if (r1 == 0) goto L_0x03d0
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x03d0
        L_0x02b0:
            r20 = 0
        L_0x02b2:
            if (r1 == 0) goto L_0x03ba
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x03ba
        L_0x02ba:
            r21 = 0
        L_0x02bc:
            if (r1 == 0) goto L_0x03a4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x03a4
        L_0x02c4:
            r22 = 0
        L_0x02c6:
            java.util.Iterator r5 = r4.iterator()
        L_0x02ca:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x03a1
            java.lang.Object r0 = r5.next()
            r3 = r0
            com.instagram.share.facebook.graphql.CXPFeatureImpl r3 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r3
            X.25o r2 = X.C313325o.A0E
            java.lang.String r1 = "feature_name"
            java.lang.Enum r1 = r3.getEnumValue(r1, r2)
            X.25o r1 = (X.C313325o) r1
            X.25o r2 = X.C313325o.A07
            if (r1 != r2) goto L_0x02ca
        L_0x02e5:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x039f
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties> r2 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.class
            java.lang.String r1 = "feature_properties"
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r1, r2)
            if (r0 == 0) goto L_0x039f
            java.util.Iterator r5 = r0.iterator()
        L_0x02f7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x039c
            java.lang.Object r0 = r5.next()
            r3 = r0
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            X.22Q r2 = X.AnonymousClass22Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "property_name"
            java.lang.Enum r2 = r3.getEnumValue(r1, r2)
            X.22Q r1 = X.AnonymousClass22Q.VIDEO_MIN_LENGTH_IN_MS
            if (r2 != r1) goto L_0x02f7
        L_0x0310:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x039f
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue> r2 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.class
            java.lang.String r1 = "property_value"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x039f
            java.lang.String r1 = "property_string_value"
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x039f
            java.lang.Integer r8 = X.AnonymousClass4n2.A01(r0)
        L_0x032a:
            java.util.Iterator r4 = r4.iterator()
        L_0x032e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x039a
            java.lang.Object r0 = r4.next()
            r3 = r0
            com.instagram.share.facebook.graphql.CXPFeatureImpl r3 = (com.instagram.share.facebook.graphql.CXPFeatureImpl) r3
            X.25o r2 = X.C313325o.A0E
            java.lang.String r1 = "feature_name"
            java.lang.Enum r1 = r3.getEnumValue(r1, r2)
            X.25o r1 = (X.C313325o) r1
            X.25o r2 = X.C313325o.A07
            if (r1 != r2) goto L_0x032e
        L_0x0349:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x0398
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties> r2 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.class
            java.lang.String r1 = "feature_properties"
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r1, r2)
            if (r0 == 0) goto L_0x0398
            java.util.Iterator r4 = r0.iterator()
        L_0x035b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0396
            java.lang.Object r0 = r4.next()
            r3 = r0
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            X.22Q r2 = X.AnonymousClass22Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "property_name"
            java.lang.Enum r2 = r3.getEnumValue(r1, r2)
            X.22Q r1 = X.AnonymousClass22Q.VIDEO_MAX_LENGTH_IN_MS
            if (r2 != r1) goto L_0x035b
        L_0x0374:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x0398
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFeatureImpl$FeatureProperties$PropertyValue> r2 = com.instagram.share.facebook.graphql.CXPFeatureImpl.FeatureProperties.PropertyValue.class
            java.lang.String r1 = "property_value"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x0398
            java.lang.String r1 = "property_string_value"
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x0398
            java.lang.Integer r9 = X.AnonymousClass4n2.A01(r0)
        L_0x038e:
            X.CKX r6 = new X.CKX
            r24 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r6
        L_0x0396:
            r0 = 0
            goto L_0x0374
        L_0x0398:
            r9 = 0
            goto L_0x038e
        L_0x039a:
            r0 = 0
            goto L_0x0349
        L_0x039c:
            r0 = 0
            goto L_0x0310
        L_0x039f:
            r8 = 0
            goto L_0x032a
        L_0x03a1:
            r0 = 0
            goto L_0x02e5
        L_0x03a4:
            java.util.Iterator r2 = r4.iterator()
        L_0x03a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02c4
            X.25o r1 = A00(r2)
            X.25o r0 = X.C313325o.A05
            if (r1 != r0) goto L_0x03a8
            r22 = 1
            goto L_0x02c6
        L_0x03ba:
            java.util.Iterator r3 = r4.iterator()
        L_0x03be:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02ba
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A02
            if (r2 != r0) goto L_0x03be
            r21 = 1
            goto L_0x02bc
        L_0x03d0:
            java.util.Iterator r3 = r4.iterator()
        L_0x03d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02b0
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A02
            if (r2 != r0) goto L_0x03d4
            r20 = 1
            goto L_0x02b2
        L_0x03e6:
            java.util.Iterator r3 = r4.iterator()
        L_0x03ea:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a6
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A04
            if (r2 != r0) goto L_0x03ea
            r19 = 1
            goto L_0x02a8
        L_0x03fc:
            java.util.Iterator r3 = r4.iterator()
        L_0x0400:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x029c
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A03
            if (r2 != r0) goto L_0x0400
            r18 = 1
            goto L_0x029e
        L_0x0412:
            java.util.Iterator r3 = r4.iterator()
        L_0x0416:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0292
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A09
            if (r2 != r0) goto L_0x0416
            r17 = 1
            goto L_0x0294
        L_0x0428:
            java.util.Iterator r3 = r4.iterator()
        L_0x042c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0288
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A0A
            if (r2 != r0) goto L_0x042c
            r16 = 1
            goto L_0x028a
        L_0x043e:
            java.util.Iterator r3 = r4.iterator()
        L_0x0442:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x027f
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A08
            if (r2 != r0) goto L_0x0442
            r15 = 1
            goto L_0x0280
        L_0x0453:
            java.util.Iterator r3 = r4.iterator()
        L_0x0457:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0276
            X.25o r2 = A00(r3)
            X.25o r0 = X.C313325o.A0D
            if (r2 != r0) goto L_0x0457
            r14 = 1
            goto L_0x0277
        L_0x0468:
            java.util.Iterator r3 = r1.iterator()
        L_0x046c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x026b
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r0 = X.C313325o.A01
            if (r1 != r0) goto L_0x046c
            r13 = 1
            goto L_0x026c
        L_0x0485:
            r3 = r8
            goto L_0x0241
        L_0x0488:
            r3 = r8
            goto L_0x0216
        L_0x048b:
            java.util.Iterator r3 = r1.iterator()
        L_0x048f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01f6
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r0 = X.C313325o.A06
            if (r1 != r0) goto L_0x048f
            r12 = 1
            goto L_0x01f7
        L_0x04a8:
            r3 = r8
            goto L_0x01cc
        L_0x04ab:
            r12 = 0
            goto L_0x01f7
        L_0x04ae:
            r3 = r8
            goto L_0x01a1
        L_0x04b1:
            java.util.Iterator r3 = r1.iterator()
        L_0x04b5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0181
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r0 = X.C313325o.A0C
            if (r1 != r0) goto L_0x04b5
            r11 = 1
            goto L_0x0182
        L_0x04ce:
            r3 = r8
            goto L_0x0157
        L_0x04d1:
            r11 = 0
            goto L_0x0182
        L_0x04d4:
            r3 = r8
            goto L_0x012c
        L_0x04d7:
            java.util.Iterator r3 = r1.iterator()
        L_0x04db:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x010c
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            X.25o r1 = X.C313325o.A0E
            java.lang.String r0 = "feature_name"
            java.lang.Enum r1 = r2.getEnumValue(r0, r1)
            X.25o r0 = X.C313325o.A0B
            if (r1 != r0) goto L_0x04db
            r10 = 1
            goto L_0x010d
        L_0x04f4:
            r3 = r8
            goto L_0x00e2
        L_0x04f7:
            r10 = 0
            goto L_0x010d
        L_0x04fa:
            r3 = r8
            goto L_0x00b7
        L_0x04fd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.api.ReelXpostApi.A01(com.instagram.share.facebook.graphql.CrossPostingContentCompatibilityConfigResponseImpl):X.CKX");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.service.session.UserSession r17, X.C146958n9 r18) {
        /*
            r16 = this;
            r4 = 34
            r5 = r18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8.A00(r4, r5)
            if (r0 == 0) goto L_0x00e7
            r3 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e7
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x00b0
            if (r0 != r2) goto L_0x00f7
            X.AnonymousClass0OU.A00(r1)
        L_0x0026:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r2 = X.C62903b6.A06(r1)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            r6 = 0
            if (r2 == 0) goto L_0x0090
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFbReelsCurrentPrivacyQueryResponseImpl$XcxpFbReelsCurrentPrivacy> r1 = com.instagram.share.facebook.graphql.CXPFbReelsCurrentPrivacyQueryResponseImpl.XcxpFbReelsCurrentPrivacy.class
            java.lang.String r0 = "xcxp_fb_reels_current_privacy"
            com.facebook.pando.TreeJNI r5 = r2.getTreeValue(r0, r1)
            if (r5 == 0) goto L_0x0090
            java.lang.String r4 = "name"
            java.lang.String r8 = r5.getStringValue(r4)
            X.22m r1 = X.C306822m.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "audience"
            java.lang.Enum r3 = r5.getEnumValue(r0, r1)
            java.lang.String r0 = "is_audience_same_as_feed"
            boolean r12 = r5.getBooleanValue(r0)
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFbReelsCurrentPrivacyQueryResponseImpl$XcxpFbReelsCurrentPrivacy$Destination> r2 = com.instagram.share.facebook.graphql.CXPFbReelsCurrentPrivacyQueryResponseImpl.XcxpFbReelsCurrentPrivacy.Destination.class
            java.lang.String r1 = "destination"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r9 = X.C18250wR.A0X(r0)
        L_0x0061:
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r10 = r0.getStringValue(r4)
        L_0x006b:
            com.facebook.pando.TreeJNI r1 = r5.getTreeValue(r1, r2)
            if (r1 == 0) goto L_0x00a1
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r11 = r1.getStringValue(r0)
        L_0x0077:
            if (r8 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x0090
            if (r9 == 0) goto L_0x0090
            if (r10 == 0) goto L_0x0090
            java.util.Map r0 = X.AnonymousClass24X.A01
            java.lang.Object r7 = r0.get(r3)
            X.24X r7 = (X.AnonymousClass24X) r7
            if (r7 != 0) goto L_0x008b
            X.24X r7 = X.AnonymousClass24X.A07
        L_0x008b:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2
            r6.<init>((X.AnonymousClass24X) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (boolean) r12)
        L_0x0090:
            X.1jA r1 = X.AnonymousClass1jA.A00(r6)
        L_0x0094:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00f2
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x00a0:
            return r1
        L_0x00a1:
            r11 = r6
            goto L_0x0077
        L_0x00a3:
            r10 = r6
            goto L_0x006b
        L_0x00a5:
            r9 = r6
            goto L_0x0061
        L_0x00a7:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0094
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b0:
            X.AnonymousClass0OU.A00(r1)
            r12 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r0 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            X.8l9 r6 = X.C63233h2.A01()
            java.util.Map r8 = r1.A07()
            java.util.Map r9 = r0.A07()
            java.lang.Class<com.instagram.share.facebook.graphql.CXPFbReelsCurrentPrivacyQueryResponseImpl> r10 = com.instagram.share.facebook.graphql.CXPFbReelsCurrentPrivacyQueryResponseImpl.class
            java.lang.String r7 = "CXPFbReelsCurrentPrivacyQuery"
            r11 = 0
            java.lang.String r15 = "xcxp_fb_reels_current_privacy"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.8mD r1 = X.C18230wP.A0N(r5)
            X.Grx r0 = X.AnonymousClass3WK.A01(r17)
            r3.A00 = r2
            java.lang.Object r1 = r0.A06(r1, r3)
            if (r1 != r4) goto L_0x0026
            return r4
        L_0x00e7:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8
            r1 = r16
            r3.<init>(r1, r5, r4, r0)
            goto L_0x0018
        L_0x00f2:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.api.ReelXpostApi.A03(com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }

    public static C313325o A00(Iterator it) {
        return (C313325o) ((CXPFeatureImpl) it.next()).getEnumValue("feature_name", C313325o.A0E);
    }
}

package com.facebook.redex;

import X.AnonymousClass0LU;
import X.AnonymousClass0YY;
import X.AnonymousClass1dM;
import X.AnonymousClass28H;
import X.AnonymousClass39I;
import X.AnonymousClass3VF;
import X.AnonymousClass3VO;
import X.AnonymousClass3Y2;
import X.AnonymousClass4To;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C10450iM;
import X.C109326jp;
import X.C61723Vc;
import X.C63893iY;
import X.C83334rD;
import X.C83974sI;

public class IDxFCallbackShape113S0200000_1_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFCallbackShape113S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final void onFailure(Throwable th) {
        switch (this.A02) {
            case 0:
                C63893iY.A0F((AnonymousClass601) this.A00, AnonymousClass3VO.A00(), (C109326jp) this.A01, AnonymousClass4To.A00(), 0);
                return;
            case 1:
                C04220Ms.A0B(th, 0);
                C10450iM.A06("attribution_sdk:GraphQLAttributionEventComplianceActionProvider", "GraphQL error", th);
                AnonymousClass39I r1 = (AnonymousClass39I) this.A00;
                C04220Ms.A0B("GraphQL error", 0);
                AnonymousClass3Y2 r2 = r1.A01.A05;
                AnonymousClass3Y2.A01(AnonymousClass28H.ERROR, AnonymousClass3Y2.A00("get_compliance_action_failure", "GraphQL error", th, r1.A00), r2);
                return;
            case 2:
                C04220Ms.A0B(th, 0);
                C10450iM.A06("attribution_sdk:GraphQLAttributionEventsClient", "GraphQL error for event reportAdid", th);
                ((C83974sI) this.A00).ByF("GraphQL error for event reportAdid", th);
                return;
            case 5:
                C04220Ms.A0B(th, 0);
                AnonymousClass0LU.A0N("BrandedContentXPostingDestinationFBPageEligibilityFetcher", "Failed to fetch BrandedContentXPostingDestinationFBPageEligibilityQuery: %s", th.getMessage());
                ((AnonymousClass0YY) this.A00).invoke(th);
                return;
            case 6:
                ((C61723Vc) this.A00).A04 = false;
                break;
            case 7:
                break;
            case 8:
                return;
            default:
                C04220Ms.A0B(th, 0);
                ((AnonymousClass3VF) this.A00).A02(th);
                return;
        }
        AnonymousClass1dM.A00((AnonymousClass1dM) this.A01);
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: type inference failed for: r2v30, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0600  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r31) {
        /*
            r30 = this;
            r3 = r30
            r2 = r31
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x06b8;
                case 1: goto L_0x0294;
                case 2: goto L_0x06b0;
                case 3: goto L_0x037e;
                case 4: goto L_0x0054;
                case 5: goto L_0x035a;
                case 6: goto L_0x0026;
                case 7: goto L_0x0320;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r3.A00
            X.3Vc r2 = (X.C61723Vc) r2
            if (r2 == 0) goto L_0x0316
            java.lang.Integer r0 = r2.A03
            int r0 = X.C18210wN.A03(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            java.lang.Object r1 = r3.A01
            X.1dM r1 = (X.AnonymousClass1dM) r1
            r0 = 1
            X.AnonymousClass1dM.A02(r1, r2, r0)
        L_0x0025:
            return
        L_0x0026:
            X.8gY r2 = (X.C143338gY) r2
            if (r2 == 0) goto L_0x004c
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r2)
            if (r2 == 0) goto L_0x004c
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPCommentDeleteMutationResponseImpl$XcxpDispatchCommentDelete> r1 = com.instagram.unifiedfeedback.api.graphql.CXPCommentDeleteMutationResponseImpl.XcxpDispatchCommentDelete.class
            java.lang.String r0 = "xcxp_dispatch_comment_delete(destinations:[$destination],params:$params)"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x004c
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPCommentDeleteMutationResponseImpl$XcxpDispatchCommentDelete$Data> r1 = com.instagram.unifiedfeedback.api.graphql.CXPCommentDeleteMutationResponseImpl.XcxpDispatchCommentDelete.Data.class
            java.lang.String r0 = "data"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            if (r0 != 0) goto L_0x0025
        L_0x004c:
            java.lang.Object r1 = r3.A00
            X.3Vc r1 = (X.C61723Vc) r1
            r0 = 0
            r1.A04 = r0
            return
        L_0x0054:
            X.8gY r2 = (X.C143338gY) r2
            if (r2 != 0) goto L_0x0062
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "GraphQL response is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x0062:
            X.0Ok r1 = X.C06810aP.A01
            java.lang.Object r0 = r3.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.lang.String r5 = r0.A14()
            java.lang.String r20 = ""
            if (r5 != 0) goto L_0x0076
            r5 = r20
        L_0x0076:
            r0 = r20
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "FBID of current user obtained from UserProvider is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x0088:
            com.facebook.pando.TreeJNI r4 = X.C685344e.A03(r2)
            r10 = 0
            if (r4 == 0) goto L_0x0099
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.class
            java.lang.String r0 = "fx_accounts"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r1)
            if (r0 != 0) goto L_0x009b
        L_0x0099:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x009b:
            java.util.Iterator r9 = r0.iterator()
        L_0x009f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x012d
            com.facebook.pando.TreeJNI r6 = X.C18210wN.A0G(r9)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.class
            java.lang.String r0 = "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)"
            com.facebook.pando.TreeJNI r2 = r6.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x06c9
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.class
            java.lang.String r0 = "services"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x06c9
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$PlatformInfo> r7 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.PlatformInfo.class
            java.lang.String r2 = "platform_info"
            com.facebook.pando.TreeJNI r8 = r6.getTreeValue(r2, r7)
            if (r8 == 0) goto L_0x012b
            X.20K r1 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r8.getEnumValue(r0, r1)
        L_0x00cf:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "FACEBOOK"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "XFBFXFBAccountInfo"
            boolean r0 = r6.isFulfilled(r0)
            if (r0 == 0) goto L_0x00eb
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$InlineXFBFXFBAccountInfo> r0 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.InlineXFBFXFBAccountInfo.class
            com.facebook.pando.TreeJNI r0 = r6.reinterpret(r0)
            if (r0 != 0) goto L_0x00f5
        L_0x00eb:
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "FB account info is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x00f5:
            com.facebook.pando.TreeJNI r2 = r6.getTreeValue(r2, r7)
            if (r2 == 0) goto L_0x0129
            X.20K r1 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r2.getEnumValue(r0, r1)
        L_0x0103:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "XFBFXIGAccountInfo"
            boolean r0 = r6.isFulfilled(r0)
            if (r0 == 0) goto L_0x011f
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$InlineXFBFXIGAccountInfo> r0 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.InlineXFBFXIGAccountInfo.class
            com.facebook.pando.TreeJNI r0 = r6.reinterpret(r0)
            if (r0 != 0) goto L_0x009f
        L_0x011f:
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "IG account info is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x0129:
            r0 = r10
            goto L_0x0103
        L_0x012b:
            r0 = r10
            goto L_0x00cf
        L_0x012d:
            if (r4 == 0) goto L_0x0025
            java.lang.Object r0 = r3.A00
            r19 = r0
            r0 = r19
            X.3VF r0 = (X.AnonymousClass3VF) r0
            r19 = r0
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts> r6 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.class
            java.lang.String r3 = "fx_accounts"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r4, r6, r3)
            java.util.Iterator r9 = r0.iterator()
        L_0x0145:
            boolean r1 = r9.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0291
            java.lang.Object r7 = r9.next()
            r8 = r7
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$PlatformInfo> r2 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.PlatformInfo.class
            java.lang.String r1 = "platform_info"
            com.facebook.pando.TreeJNI r2 = r8.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0165
            X.20K r1 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r2.getEnumValue(r0, r1)
        L_0x0165:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = X.C18250wR.A0X(r8)
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 == 0) goto L_0x0145
        L_0x017b:
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            if (r7 == 0) goto L_0x06d3
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.class
            java.lang.String r0 = "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)"
            com.facebook.pando.TreeJNI r2 = r7.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x06d3
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.class
            java.lang.String r0 = "services"
            com.google.common.collect.ImmutableList r1 = r2.getTreeList(r0, r1)
            if (r1 == 0) goto L_0x06d3
            r11 = 10
            int r0 = X.C02260Al.A0z(r1, r11)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r2 = X.C18190wL.A0v(r0)
            java.util.Iterator r18 = r1.iterator()
        L_0x01a5:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x06d7
            com.facebook.pando.TreeJNI r12 = X.C18210wN.A0G(r18)
            X.20H r1 = X.AnonymousClass20H.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "service_name"
            java.lang.Enum r0 = r12.getEnumValue(r0, r1)
            X.20H r0 = (X.AnonymousClass20H) r0
            if (r0 == 0) goto L_0x01c1
            java.lang.String r10 = r0.name()
            if (r10 != 0) goto L_0x01c3
        L_0x01c1:
            r10 = r20
        L_0x01c3:
            X.20J r1 = X.AnonymousClass20J.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r0 = r12.getEnumValue(r0, r1)
            X.20J r0 = (X.AnonymousClass20J) r0
            if (r0 == 0) goto L_0x01d5
            java.lang.String r9 = r0.name()
            if (r9 != 0) goto L_0x01d7
        L_0x01d5:
            r9 = r20
        L_0x01d7:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$IdentityMapping> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.IdentityMapping.class
            java.lang.String r0 = "identity_mapping"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r12, r1, r0)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r0, r11)
            java.util.Iterator r17 = r0.iterator()
        L_0x01e7:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0253
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r17)
            java.lang.String r0 = "source_identity_id"
            java.lang.String r14 = r7.getStringValue(r0)
            if (r14 != 0) goto L_0x01fb
            r14 = r20
        L_0x01fb:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$IdentityMapping$DestinationIdentities> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.IdentityMapping.DestinationIdentities.class
            java.lang.String r0 = "destination_identities"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r7, r1, r0)
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0x(r0, r11)
            java.util.Iterator r16 = r0.iterator()
        L_0x020b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x024a
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r16)
            java.lang.String r0 = "identity_id"
            java.lang.String r15 = r1.getStringValue(r0)
            r21 = r20
            if (r15 != 0) goto L_0x0221
            r15 = r20
        L_0x0221:
            X.20I r7 = X.AnonymousClass20I.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "identity_type"
            java.lang.Enum r0 = r1.getEnumValue(r0, r7)
            X.20I r0 = (X.AnonymousClass20I) r0
            if (r0 == 0) goto L_0x0233
            java.lang.String r7 = r0.name()
            if (r7 != 0) goto L_0x0235
        L_0x0233:
            r7 = r20
        L_0x0235:
            java.lang.String r0 = "obfuscated_identity_id"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x023f
            r21 = r0
        L_0x023f:
            X.3VW r1 = new X.3VW
            r0 = r21
            r1.<init>(r15, r7, r0)
            r13.add(r1)
            goto L_0x020b
        L_0x024a:
            X.3VT r0 = new X.3VT
            r0.<init>(r14, r13)
            r8.add(r0)
            goto L_0x01e7
        L_0x0253:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$ExtraClientCacheData> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.ExtraClientCacheData.class
            java.lang.String r0 = "extra_client_cache_data"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r12, r1, r0)
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r14 = r0.iterator()
        L_0x0263:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0285
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r14)
            java.lang.String r0 = "data_key"
            java.lang.String r7 = r13.getStringValue(r0)
            r1 = r20
            if (r7 != 0) goto L_0x0278
            r7 = r1
        L_0x0278:
            java.lang.String r0 = "data_value"
            java.lang.String r0 = r13.getStringValue(r0)
            if (r0 == 0) goto L_0x0281
            r1 = r0
        L_0x0281:
            r12.put(r7, r1)
            goto L_0x0263
        L_0x0285:
            r1 = 8
            X.3VZ r0 = new X.3VZ
            r0.<init>(r9, r12, r8, r1)
            r2.put(r10, r0)
            goto L_0x01a5
        L_0x0291:
            r7 = r0
            goto L_0x017b
        L_0x0294:
            X.8gY r2 = (X.C143338gY) r2
            r4 = 0
            if (r2 == 0) goto L_0x089e
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r2)
            if (r2 == 0) goto L_0x089e
            X.20Q r1 = X.AnonymousClass20Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "fetch_attribution_event_compliance_action(consent_type:\"OTHER_COMPANY_TRACKERS_ON_FOA\")"
            java.lang.Enum r5 = r2.getEnumValue(r0, r1)
            X.20Q r5 = (X.AnonymousClass20Q) r5
            if (r5 == 0) goto L_0x089f
            int r1 = r5.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0313
            r0 = 2
            if (r1 == r0) goto L_0x0310
            r0 = 1
            if (r1 != r0) goto L_0x089f
            java.lang.Integer r7 = X.AnonymousClass006.A0C
        L_0x02ba:
            java.lang.Object r2 = r3.A00
            X.39I r2 = (X.AnonymousClass39I) r2
            X.3YH r5 = r2.A01
            X.3Y2 r6 = r5.A05
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto L_0x030a;
                case 1: goto L_0x030d;
                default: goto L_0x02c9;
            }
        L_0x02c9:
            java.lang.String r1 = "BUFFER"
        L_0x02cb:
            java.util.List r4 = r2.A00
            java.lang.String r0 = "get_compliance_action_success"
            r6.A02(r0, r1, r4)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r7 != r0) goto L_0x02db
            r0 = 0
        L_0x02d7:
            X.AnonymousClass3YH.A00(r4, r5, r0)
            return
        L_0x02db:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r7 != r0) goto L_0x0025
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 18303363909423078(0x4106d000040fe6, double:1.8942733883638977E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            java.lang.String r2 = "buffer_events"
            if (r0 == 0) goto L_0x02f8
            java.lang.String r0 = "client_side"
            r6.A02(r2, r0, r4)
            java.util.List r0 = X.AnonymousClass3YH.A06
            r0.addAll(r4)
        L_0x02f8:
            r0 = 2324146373123051493(0x204106d000030fe5, double:2.539805375763739E-153)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "server_side"
            r6.A02(r2, r0, r4)
            r0 = 1
            goto L_0x02d7
        L_0x030a:
            java.lang.String r1 = "REPORT"
            goto L_0x02cb
        L_0x030d:
            java.lang.String r1 = "IGNORE"
            goto L_0x02cb
        L_0x0310:
            java.lang.Integer r7 = X.AnonymousClass006.A01
            goto L_0x02ba
        L_0x0313:
            java.lang.Integer r7 = X.AnonymousClass006.A00
            goto L_0x02ba
        L_0x0316:
            java.lang.Object r2 = r3.A01
            X.1dM r2 = (X.AnonymousClass1dM) r2
            r1 = 0
            r0 = 0
            X.AnonymousClass1dM.A04(r2, r1, r0)
            return
        L_0x0320:
            X.8gY r2 = (X.C143338gY) r2
            if (r2 == 0) goto L_0x0352
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r2)
            if (r2 == 0) goto L_0x0352
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPCommentReactMutationResponseImpl$XcxpDispatchCommentReact> r1 = com.instagram.unifiedfeedback.api.graphql.CXPCommentReactMutationResponseImpl.XcxpDispatchCommentReact.class
            java.lang.String r0 = "xcxp_dispatch_comment_react(destinations:[$destination],params:$params)"
            com.google.common.collect.ImmutableList r1 = r2.getTreeList(r0, r1)
            if (r1 == 0) goto L_0x0352
            boolean r0 = X.C18250wR.A1K(r1)
            if (r0 == 0) goto L_0x0352
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0352
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPCommentReactMutationResponseImpl$XcxpDispatchCommentReact$Data> r1 = com.instagram.unifiedfeedback.api.graphql.CXPCommentReactMutationResponseImpl.XcxpDispatchCommentReact.Data.class
            java.lang.String r0 = "data"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x0352
            java.lang.Object r0 = r3.A00
            X.C18240wQ.A1G(r0)
        L_0x0352:
            java.lang.Object r0 = r3.A01
            X.1dM r0 = (X.AnonymousClass1dM) r0
            X.AnonymousClass1dM.A00(r0)
            return
        L_0x035a:
            X.8gY r2 = (X.C143338gY) r2
            java.lang.Object r3 = r3.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            if (r2 == 0) goto L_0x037c
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r2)
            if (r2 == 0) goto L_0x037c
            java.lang.Class<com.instagram.share.facebook.brandedcontent.BrandedContentXPostingDestinationFBPageEligibilityQueryResponseImpl$FetchIGUser> r1 = com.instagram.share.facebook.brandedcontent.BrandedContentXPostingDestinationFBPageEligibilityQueryResponseImpl.FetchIGUser.class
            java.lang.String r0 = "fetch__IGUser(igid:$igid)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x037c
            java.lang.String r0 = "is_xposting_destination_fb_page_eligible_for_branded_content"
            java.lang.Boolean r0 = X.C18250wR.A0S(r1, r0)
        L_0x0378:
            r3.invoke(r0)
            return
        L_0x037c:
            r0 = 0
            goto L_0x0378
        L_0x037e:
            X.8gY r2 = (X.C143338gY) r2
            if (r2 != 0) goto L_0x038c
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "GraphQL response is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x038c:
            X.0Ok r1 = X.C06810aP.A01
            java.lang.Object r0 = r3.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.lang.String r1 = r0.A14()
            java.lang.String r19 = ""
            if (r1 != 0) goto L_0x03a0
            r1 = r19
        L_0x03a0:
            r0 = r19
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "FBID of current user obtained from UserProvider is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x03b2:
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r2)
            if (r2 == 0) goto L_0x03c2
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts> r4 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.class
            java.lang.String r0 = "fx_accounts"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r4)
            if (r0 != 0) goto L_0x03c4
        L_0x03c2:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x03c4:
            java.util.Iterator r6 = r0.iterator()
        L_0x03c8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x03f0
            com.facebook.pando.TreeJNI r5 = X.C18210wN.A0G(r6)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid> r4 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.class
            java.lang.String r0 = "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r0, r4)
            if (r5 == 0) goto L_0x03e6
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services> r4 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.class
            java.lang.String r0 = "services"
            com.google.common.collect.ImmutableList r0 = r5.getTreeList(r0, r4)
            if (r0 != 0) goto L_0x03c8
        L_0x03e6:
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "Service info for at least one account is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x03f0:
            java.lang.Object r4 = r3.A00
            X.3VF r4 = (X.AnonymousClass3VF) r4
            r6 = 1
            if (r2 == 0) goto L_0x0556
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts> r3 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.class
            java.lang.String r0 = "fx_accounts"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r2, r3, r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0403:
            boolean r0 = r10.hasNext()
            r9 = 0
            if (r0 == 0) goto L_0x0553
            java.lang.Object r7 = r10.next()
            r8 = r7
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$PlatformInfo> r3 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.PlatformInfo.class
            java.lang.String r0 = "platform_info"
            com.facebook.pando.TreeJNI r5 = r8.getTreeValue(r0, r3)
            if (r5 == 0) goto L_0x042b
            X.20K r3 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r5.getEnumValue(r0, r3)
            X.20K r0 = (X.AnonymousClass20K) r0
            if (r0 == 0) goto L_0x042b
            java.lang.String r9 = r0.name()
        L_0x042b:
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0403
            java.lang.String r0 = X.C18250wR.A0X(r8)
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x0403
        L_0x043d:
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            if (r7 == 0) goto L_0x0556
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid> r3 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.class
            java.lang.String r0 = "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)"
            com.facebook.pando.TreeJNI r5 = r7.getTreeValue(r0, r3)
            if (r5 == 0) goto L_0x0556
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services> r3 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.class
            java.lang.String r0 = "services"
            com.google.common.collect.ImmutableList r5 = r5.getTreeList(r0, r3)
            if (r5 == 0) goto L_0x0556
            r11 = 10
            int r0 = X.C02260Al.A0z(r5, r11)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r3 = X.C18190wL.A0v(r0)
            java.util.Iterator r18 = r5.iterator()
        L_0x0467:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x055a
            com.facebook.pando.TreeJNI r12 = X.C18210wN.A0G(r18)
            X.20H r5 = X.AnonymousClass20H.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "service_name"
            java.lang.Enum r0 = r12.getEnumValue(r0, r5)
            X.20H r0 = (X.AnonymousClass20H) r0
            if (r0 == 0) goto L_0x0483
            java.lang.String r10 = r0.name()
            if (r10 != 0) goto L_0x0485
        L_0x0483:
            r10 = r19
        L_0x0485:
            X.20J r5 = X.AnonymousClass20J.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r0 = r12.getEnumValue(r0, r5)
            X.20J r0 = (X.AnonymousClass20J) r0
            if (r0 == 0) goto L_0x0497
            java.lang.String r9 = r0.name()
            if (r9 != 0) goto L_0x0499
        L_0x0497:
            r9 = r19
        L_0x0499:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$IdentityMapping> r5 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.IdentityMapping.class
            java.lang.String r0 = "identity_mapping"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r12, r5, r0)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r0, r11)
            java.util.Iterator r17 = r0.iterator()
        L_0x04a9:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0515
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r17)
            java.lang.String r0 = "source_identity_id"
            java.lang.String r14 = r7.getStringValue(r0)
            if (r14 != 0) goto L_0x04bd
            r14 = r19
        L_0x04bd:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$IdentityMapping$DestinationIdentities> r5 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.IdentityMapping.DestinationIdentities.class
            java.lang.String r0 = "destination_identities"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r7, r5, r0)
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0x(r0, r11)
            java.util.Iterator r16 = r0.iterator()
        L_0x04cd:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x050c
            com.facebook.pando.TreeJNI r5 = X.C18210wN.A0G(r16)
            java.lang.String r0 = "identity_id"
            java.lang.String r15 = r5.getStringValue(r0)
            r20 = r19
            if (r15 != 0) goto L_0x04e3
            r15 = r19
        L_0x04e3:
            X.20I r7 = X.AnonymousClass20I.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "identity_type"
            java.lang.Enum r0 = r5.getEnumValue(r0, r7)
            X.20I r0 = (X.AnonymousClass20I) r0
            if (r0 == 0) goto L_0x04f5
            java.lang.String r7 = r0.name()
            if (r7 != 0) goto L_0x04f7
        L_0x04f5:
            r7 = r19
        L_0x04f7:
            java.lang.String r0 = "obfuscated_identity_id"
            java.lang.String r0 = r5.getStringValue(r0)
            if (r0 == 0) goto L_0x0501
            r20 = r0
        L_0x0501:
            X.3VW r5 = new X.3VW
            r0 = r20
            r5.<init>(r15, r7, r0)
            r13.add(r5)
            goto L_0x04cd
        L_0x050c:
            X.3VT r0 = new X.3VT
            r0.<init>(r14, r13)
            r8.add(r0)
            goto L_0x04a9
        L_0x0515:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$ExtraClientCacheData> r5 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.ExtraClientCacheData.class
            java.lang.String r0 = "extra_client_cache_data"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r12, r5, r0)
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r14 = r0.iterator()
        L_0x0525:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0547
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r14)
            java.lang.String r0 = "data_key"
            java.lang.String r7 = r13.getStringValue(r0)
            r5 = r19
            if (r7 != 0) goto L_0x053a
            r7 = r5
        L_0x053a:
            java.lang.String r0 = "data_value"
            java.lang.String r0 = r13.getStringValue(r0)
            if (r0 == 0) goto L_0x0543
            r5 = r0
        L_0x0543:
            r12.put(r7, r5)
            goto L_0x0525
        L_0x0547:
            r5 = 8
            X.3VZ r0 = new X.3VZ
            r0.<init>(r9, r12, r8, r5)
            r3.put(r10, r0)
            goto L_0x0467
        L_0x0553:
            r7 = r9
            goto L_0x043d
        L_0x0556:
            X.4To r3 = X.AnonymousClass4To.A00()
        L_0x055a:
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            if (r2 == 0) goto L_0x05f2
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAic> r7 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAic.class
            java.lang.String r5 = "fx_aic(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],family_device_id:$family_device_id)"
            com.facebook.pando.TreeJNI r8 = r2.getTreeValue(r5, r7)
            if (r8 == 0) goto L_0x05f2
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAic$Accounts> r7 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAic.Accounts.class
            java.lang.String r5 = "accounts"
            com.google.common.collect.ImmutableList r5 = r8.getTreeList(r5, r7)
            if (r5 == 0) goto L_0x05f2
        L_0x0574:
            java.util.Iterator r11 = r5.iterator()
        L_0x0578:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x05f5
            com.facebook.pando.TreeJNI r8 = X.C18210wN.A0G(r11)
            X.20K r10 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "account_type"
            java.lang.Enum r5 = r8.getEnumValue(r9, r10)
            X.20K r5 = (X.AnonymousClass20K) r5
            if (r5 == 0) goto L_0x0578
            int r7 = r5.ordinal()
            if (r7 == r6) goto L_0x0598
            r5 = 3
            if (r7 == r5) goto L_0x0598
            goto L_0x0578
        L_0x0598:
            java.lang.String r7 = "id"
            java.lang.String r5 = r8.getStringValue(r7)
            if (r5 == 0) goto L_0x0578
            java.lang.String r18 = r8.getStringValue(r7)
            r24 = r19
            if (r18 != 0) goto L_0x05aa
            r18 = r19
        L_0x05aa:
            java.lang.Enum r5 = r8.getEnumValue(r9, r10)
            X.20K r5 = (X.AnonymousClass20K) r5
            if (r5 == 0) goto L_0x05b8
            java.lang.String r20 = r5.name()
            if (r20 != 0) goto L_0x05ba
        L_0x05b8:
            r20 = r19
        L_0x05ba:
            java.lang.String r21 = X.C18220wO.A0l(r8)
            java.lang.String r23 = X.C61993Wq.A01(r8)
            java.lang.String r5 = "profile_picture_url"
            java.lang.String r22 = r8.getStringValue(r5)
            java.lang.String r5 = r8.getStringValue(r7)
            boolean r5 = X.C04220Ms.A0I(r5, r1)
            if (r5 != 0) goto L_0x05d8
            java.lang.String r5 = "obfuscated_id"
            java.lang.String r24 = r8.getStringValue(r5)
        L_0x05d8:
            java.lang.String r7 = "badge_count"
            boolean r5 = r8.hasFieldValue(r7)
            if (r5 == 0) goto L_0x05ef
            int r17 = r8.getIntValue(r7)
        L_0x05e4:
            fxcache.model.FxCalAccount r5 = new fxcache.model.FxCalAccount
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r5)
            goto L_0x0578
        L_0x05ef:
            r17 = 0
            goto L_0x05e4
        L_0x05f2:
            X.0ZV r5 = X.AnonymousClass0ZV.A00
            goto L_0x0574
        L_0x05f5:
            long r5 = java.lang.System.currentTimeMillis()
            fxcache.model.FxCalAccountLinkageInfo r9 = new fxcache.model.FxCalAccountLinkageInfo
            r9.<init>(r0, r5)
            if (r2 == 0) goto L_0x06a8
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts> r5 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.class
            java.lang.String r0 = "fx_accounts"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r2, r5, r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x060c:
            boolean r0 = r8.hasNext()
            r11 = 0
            if (r0 == 0) goto L_0x06a6
            java.lang.Object r6 = r8.next()
            r7 = r6
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$PlatformInfo> r2 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.PlatformInfo.class
            java.lang.String r0 = "platform_info"
            com.facebook.pando.TreeJNI r5 = r7.getTreeValue(r0, r2)
            if (r5 == 0) goto L_0x06a4
            X.20K r2 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r5.getEnumValue(r0, r2)
            X.20K r0 = (X.AnonymousClass20K) r0
            if (r0 == 0) goto L_0x06a4
            java.lang.String r2 = r0.name()
        L_0x0634:
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x060c
            java.lang.String r0 = X.C18250wR.A0X(r7)
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x060c
        L_0x0646:
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x06a8
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid> r1 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.class
            java.lang.String r0 = "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)"
            com.facebook.pando.TreeJNI r2 = r6.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x06a2
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services> r1 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.class
            java.lang.String r0 = "services"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
        L_0x065c:
            java.util.LinkedHashMap r8 = X.C18220wO.A0y()
            if (r0 != 0) goto L_0x0664
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0664:
            java.util.Iterator r10 = r0.iterator()
        L_0x0668:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x06ac
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r10)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$CustomServiceData> r6 = com.instagram.graphql.instagramschemagraphservices.FXAICServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.CustomServiceData.class
            java.lang.String r5 = "custom_service_data"
            com.facebook.pando.TreeJNI r0 = r7.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x0668
            X.20H r1 = X.AnonymousClass20H.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "service_name"
            java.lang.Enum r0 = r7.getEnumValue(r0, r1)
            X.20H r0 = (X.AnonymousClass20H) r0
            if (r0 == 0) goto L_0x068e
            java.lang.String r2 = r0.name()
            if (r2 != 0) goto L_0x0690
        L_0x068e:
            r2 = r19
        L_0x0690:
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r5, r6)
            if (r1 == 0) goto L_0x06a0
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl> r0 = com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
        L_0x069c:
            r8.put(r2, r0)
            goto L_0x0668
        L_0x06a0:
            r0 = r11
            goto L_0x069c
        L_0x06a2:
            r0 = r11
            goto L_0x065c
        L_0x06a4:
            r2 = r11
            goto L_0x0634
        L_0x06a6:
            r6 = r11
            goto L_0x0646
        L_0x06a8:
            java.util.LinkedHashMap r8 = X.C18220wO.A0y()
        L_0x06ac:
            r4.A01(r9, r3, r8)
            return
        L_0x06b0:
            java.lang.Object r0 = r3.A00
            X.4sI r0 = (X.C83974sI) r0
            r0.onSuccess()
            return
        L_0x06b8:
            java.lang.Object r4 = r3.A00
            X.601 r4 = (X.AnonymousClass601) r4
            java.lang.Object r3 = r3.A01
            X.6jp r3 = (X.C109326jp) r3
            X.3VO r1 = X.AnonymousClass3VO.A00()
            r0 = 0
            X.C63893iY.A0F(r4, r1, r3, r2, r0)
            return
        L_0x06c9:
            java.lang.Object r1 = r3.A00
            X.3VF r1 = (X.AnonymousClass3VF) r1
            java.lang.String r0 = "Service info for at least one account is null"
            X.AnonymousClass3VF.A00(r1, r0)
            return
        L_0x06d3:
            X.4To r2 = X.AnonymousClass4To.A00()
        L_0x06d7:
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r4, r6, r3)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x06e3:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x07eb
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r13)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$PlatformInfo> r12 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.PlatformInfo.class
            java.lang.String r11 = "platform_info"
            com.facebook.pando.TreeJNI r10 = r1.getTreeValue(r11, r12)
            r0 = 0
            if (r10 == 0) goto L_0x07c7
            X.20K r9 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "type"
            java.lang.Enum r8 = r10.getEnumValue(r8, r9)
            X.20K r8 = (X.AnonymousClass20K) r8
            if (r8 == 0) goto L_0x07c7
            java.lang.String r10 = r8.name()
        L_0x0708:
            java.lang.String r9 = "FACEBOOK"
            boolean r8 = X.C04220Ms.A0I(r10, r9)
            if (r8 == 0) goto L_0x0762
            java.lang.String r8 = "XFBFXFBAccountInfo"
            boolean r8 = r1.isFulfilled(r8)
            if (r8 != 0) goto L_0x075b
            r10 = 0
        L_0x0719:
            java.lang.String r23 = X.C18250wR.A0X(r1)
            if (r23 != 0) goto L_0x0721
            r23 = r20
        L_0x0721:
            if (r10 == 0) goto L_0x0756
            java.lang.String r8 = "full_name"
            java.lang.String r26 = r10.getStringValue(r8)
            java.lang.String r28 = X.C61993Wq.A01(r10)
        L_0x072d:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$ProfilePictureInfo> r10 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.ProfilePictureInfo.class
            java.lang.String r8 = "profile_picture_info"
            com.facebook.pando.TreeJNI r8 = r1.getTreeValue(r8, r10)
            if (r8 == 0) goto L_0x073d
            java.lang.String r0 = "url"
            java.lang.String r0 = r8.getStringValue(r0)
        L_0x073d:
            java.lang.String r8 = "obfuscated_id(caller_name:$caller_name)"
            java.lang.String r29 = r1.getStringValue(r8)
            r22 = 0
            fxcache.model.FxCalAccount r1 = new fxcache.model.FxCalAccount
            r21 = r1
            r24 = r20
            r25 = r9
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0752:
            r7.add(r1)
            goto L_0x06e3
        L_0x0756:
            r26 = r0
            r28 = r0
            goto L_0x072d
        L_0x075b:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$InlineXFBFXFBAccountInfo> r8 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.InlineXFBFXFBAccountInfo.class
            com.facebook.pando.TreeJNI r10 = r1.reinterpret(r8)
            goto L_0x0719
        L_0x0762:
            java.lang.String r9 = "INSTAGRAM"
            boolean r8 = X.C04220Ms.A0I(r10, r9)
            if (r8 == 0) goto L_0x07ca
            java.lang.String r8 = "XFBFXIGAccountInfo"
            boolean r8 = r1.isFulfilled(r8)
            if (r8 != 0) goto L_0x07c0
            r11 = 0
        L_0x0773:
            java.lang.String r10 = "id"
            java.lang.String r23 = r1.getStringValue(r10)
            r29 = r20
            if (r23 != 0) goto L_0x077f
            r23 = r20
        L_0x077f:
            if (r11 == 0) goto L_0x07bb
            java.lang.String r8 = "full_name"
            java.lang.String r26 = r11.getStringValue(r8)
            java.lang.String r28 = X.C61993Wq.A01(r11)
        L_0x078b:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$ProfilePictureInfo> r11 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.ProfilePictureInfo.class
            java.lang.String r8 = "profile_picture_info"
            com.facebook.pando.TreeJNI r8 = r1.getTreeValue(r8, r11)
            if (r8 == 0) goto L_0x079b
            java.lang.String r0 = "url"
            java.lang.String r0 = r8.getStringValue(r0)
        L_0x079b:
            java.lang.String r8 = r1.getStringValue(r10)
            boolean r8 = X.C04220Ms.A0I(r8, r5)
            if (r8 != 0) goto L_0x07ab
            java.lang.String r8 = "obfuscated_id(caller_name:$caller_name)"
            java.lang.String r29 = r1.getStringValue(r8)
        L_0x07ab:
            r22 = 0
            fxcache.model.FxCalAccount r1 = new fxcache.model.FxCalAccount
            r21 = r1
            r24 = r20
            r25 = r9
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0752
        L_0x07bb:
            r26 = r0
            r28 = r0
            goto L_0x078b
        L_0x07c0:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$InlineXFBFXIGAccountInfo> r8 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.InlineXFBFXIGAccountInfo.class
            com.facebook.pando.TreeJNI r11 = r1.reinterpret(r8)
            goto L_0x0773
        L_0x07c7:
            r10 = r0
            goto L_0x0708
        L_0x07ca:
            java.lang.String r4 = "unexpected account type: "
            com.facebook.pando.TreeJNI r3 = r1.getTreeValue(r11, r12)
            if (r3 == 0) goto L_0x07e2
            X.20K r2 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r1 = r3.getEnumValue(r1, r2)
            X.20K r1 = (X.AnonymousClass20K) r1
            if (r1 == 0) goto L_0x07e2
            java.lang.String r0 = r1.name()
        L_0x07e2:
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x07eb:
            long r0 = java.lang.System.currentTimeMillis()
            fxcache.model.FxCalAccountLinkageInfo r8 = new fxcache.model.FxCalAccountLinkageInfo
            r8.<init>(r7, r0)
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r4, r6, r3)
            java.util.Iterator r7 = r0.iterator()
        L_0x07fc:
            boolean r0 = r7.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x089c
            java.lang.Object r4 = r7.next()
            r6 = r4
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$PlatformInfo> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.PlatformInfo.class
            java.lang.String r0 = "platform_info"
            com.facebook.pando.TreeJNI r3 = r6.getTreeValue(r0, r1)
            if (r3 == 0) goto L_0x089a
            X.20K r1 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r3.getEnumValue(r0, r1)
        L_0x081c:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x07fc
            java.lang.String r0 = X.C18250wR.A0X(r6)
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 == 0) goto L_0x07fc
        L_0x0832:
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 != 0) goto L_0x0840
            X.4To r7 = X.AnonymousClass4To.A00()
        L_0x083a:
            r0 = r19
            r0.A01(r8, r2, r7)
            return
        L_0x0840:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.class
            java.lang.String r0 = "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r0, r1)
            if (r3 == 0) goto L_0x0898
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services> r1 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.class
            java.lang.String r0 = "services"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
        L_0x0852:
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            if (r0 != 0) goto L_0x085a
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x085a:
            java.util.Iterator r9 = r0.iterator()
        L_0x085e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x083a
            com.facebook.pando.TreeJNI r6 = X.C18210wN.A0G(r9)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl$FxAccounts$RawServicesSettingsWithObid$Services$CustomServiceData> r5 = com.instagram.graphql.instagramschemagraphservices.FxIGAccountsCenterServiceQueryResponseImpl.FxAccounts.RawServicesSettingsWithObid.Services.CustomServiceData.class
            java.lang.String r4 = "custom_service_data"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r4, r5)
            if (r0 == 0) goto L_0x085e
            X.20H r1 = X.AnonymousClass20H.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "service_name"
            java.lang.Enum r0 = r6.getEnumValue(r0, r1)
            X.20H r0 = (X.AnonymousClass20H) r0
            if (r0 == 0) goto L_0x0884
            java.lang.String r3 = r0.name()
            if (r3 != 0) goto L_0x0886
        L_0x0884:
            r3 = r20
        L_0x0886:
            com.facebook.pando.TreeJNI r1 = r6.getTreeValue(r4, r5)
            if (r1 == 0) goto L_0x0896
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl> r0 = com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
        L_0x0892:
            r7.put(r3, r0)
            goto L_0x085e
        L_0x0896:
            r0 = r10
            goto L_0x0892
        L_0x0898:
            r0 = r10
            goto L_0x0852
        L_0x089a:
            r0 = r10
            goto L_0x081c
        L_0x089c:
            r4 = r10
            goto L_0x0832
        L_0x089e:
            r5 = r4
        L_0x089f:
            java.lang.String r1 = "attribution_sdk:GraphQLAttributionEventComplianceActionProvider"
            java.lang.String r2 = "Unsupported compliance action: "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r2, r5)
            X.C10450iM.A03(r1, r0)
            java.lang.Object r1 = r3.A00
            X.39I r1 = (X.AnonymousClass39I) r1
            java.lang.StringBuilder r0 = X.C18200wM.A0r()
            r0.append(r2)
            java.lang.String r3 = X.C18200wM.A0m(r5, r0)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.3YH r0 = r1.A01
            X.3Y2 r2 = r0.A05
            java.util.List r1 = r1.A00
            java.lang.String r0 = "get_compliance_action_failure"
            java.lang.String r1 = X.AnonymousClass3Y2.A00(r0, r3, r4, r1)
            X.28H r0 = X.AnonymousClass28H.ERROR
            X.AnonymousClass3Y2.A01(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCallbackShape113S0200000_1_I2.onSuccess(java.lang.Object):void");
    }
}

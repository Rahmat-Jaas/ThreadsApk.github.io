package com.facebook.redex;

import X.AnonymousClass00J;
import X.AnonymousClass3BS;
import X.AnonymousClass5z0;
import X.C04180Mo;
import X.C04220Ms;
import X.C10450iM;
import X.C143338gY;
import X.C18190wL;
import X.C18200wM;
import X.C566437z;
import X.C685344e;
import X.C695248y;
import X.C82574pv;
import X.C83334rD;
import X.C83854s6;
import X.C83974sI;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.graphql.instagramschema.IGFxCanUserSeeISUpsellQueryResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.FXSSOInfoQueryResponseImpl;

public class IDxFCallbackShape78S0300000_1_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFCallbackShape78S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFailure(Throwable th) {
        switch (this.A03) {
            case 0:
                C04220Ms.A0B(th, 0);
                StringBuilder A0s = C18190wL.A0s("GraphQL error for event ");
                Object obj = this.A01;
                C10450iM.A06("attribution_sdk:GraphQLAttributionEventsClient", C18200wM.A0m(obj, A0s), th);
                StringBuilder A0r = C18200wM.A0r();
                A0r.append("GraphQL error for event ");
                ((C83974sI) this.A00).ByF(C18200wM.A0m(obj, A0r), th);
                return;
            case 1:
                ((C566437z) this.A02).A00.markerEnd(857806587, 3);
                ((C82574pv) this.A01).Byn(new AnonymousClass3BS());
                return;
            default:
                C04220Ms.A0B(th, 0);
                C83854s6 r0 = (C83854s6) this.A01;
                if (r0 != null) {
                    r0.Bxz(th);
                    return;
                }
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        TreeJNI A032;
        TreeJNI treeValue;
        ImmutableList treeList;
        TreeJNI treeJNI;
        switch (this.A03) {
            case 0:
                ((C83974sI) this.A00).onSuccess();
                return;
            case 1:
                C143338gY r5 = (C143338gY) obj;
                ((C566437z) this.A02).A00.markerEnd(857806587, 2);
                AnonymousClass3BS r2 = new AnonymousClass3BS();
                if (!(r5 == null || (obj2 = ((AnonymousClass5z0) r5).A01) == null)) {
                    IGFxCanUserSeeISUpsellQueryResponseImpl iGFxCanUserSeeISUpsellQueryResponseImpl = (IGFxCanUserSeeISUpsellQueryResponseImpl) obj2;
                    if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00() != null) {
                        if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00().hasFieldValue("can_user_see_is_upsell(flow:\"CP_UPSELL_IG_STORY_CROSS_POSTING\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                            iGFxCanUserSeeISUpsellQueryResponseImpl.A00().getBooleanValue("can_user_see_is_upsell(flow:\"CP_UPSELL_IG_STORY_CROSS_POSTING\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                        }
                        if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00().hasFieldValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                            r2.A02 = iGFxCanUserSeeISUpsellQueryResponseImpl.A00().getBooleanValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                        }
                        if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00().hasFieldValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                            r2.A03 = iGFxCanUserSeeISUpsellQueryResponseImpl.A00().getBooleanValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                        }
                        if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00().hasFieldValue("can_user_see_is_upsell(flow:\"IG_FEED_CROSS_POSTING_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                            r2.A00 = iGFxCanUserSeeISUpsellQueryResponseImpl.A00().getBooleanValue("can_user_see_is_upsell(flow:\"IG_FEED_CROSS_POSTING_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                        }
                        if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00().hasFieldValue("can_user_see_is_upsell(flow:\"IG_DISCOVER_PEOPLE_HOME_UPSELL\")")) {
                            iGFxCanUserSeeISUpsellQueryResponseImpl.A00().getBooleanValue("can_user_see_is_upsell(flow:\"IG_DISCOVER_PEOPLE_HOME_UPSELL\")");
                        }
                        if (iGFxCanUserSeeISUpsellQueryResponseImpl.A00().hasFieldValue("can_user_see_is_upsell(flow:\"IG_IMPORT_FROM_FB_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                            r2.A01 = iGFxCanUserSeeISUpsellQueryResponseImpl.A00().getBooleanValue("can_user_see_is_upsell(flow:\"IG_IMPORT_FROM_FB_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                        }
                    }
                }
                ((C82574pv) this.A01).Byn(r2);
                return;
            default:
                C143338gY r52 = (C143338gY) obj;
                if (!(r52 == null || (A032 = C685344e.A03(r52)) == null || (treeValue = A032.getTreeValue("xfb_fx_sso_info(account_type:\"FACEBOOK\")", FXSSOInfoQueryResponseImpl.XfbFxSsoInfo.class)) == null || (treeList = treeValue.getTreeList("sso_account_info", FXSSOInfoQueryResponseImpl.XfbFxSsoInfo.SsoAccountInfo.class)) == null || (treeJNI = (TreeJNI) AnonymousClass00J.A0D(treeList)) == null)) {
                    boolean booleanValue = treeJNI.getBooleanValue("sso_setting_enabled");
                    if (Boolean.valueOf(booleanValue) != null) {
                        ((C695248y) this.A02).A00 = booleanValue;
                    }
                }
                C04180Mo r22 = (C04180Mo) this.A00;
                if (!r22.A00) {
                    C83854s6 r1 = (C83854s6) this.A01;
                    if (r1 != null) {
                        r1.CNQ(((C695248y) this.A02).A00);
                    }
                    r22.A00 = true;
                    return;
                }
                return;
        }
    }
}

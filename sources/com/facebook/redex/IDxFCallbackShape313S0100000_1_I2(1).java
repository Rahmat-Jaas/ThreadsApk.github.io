package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass1dK;
import X.AnonymousClass349;
import X.AnonymousClass3AF;
import X.AnonymousClass3BP;
import X.AnonymousClass3BQ;
import X.AnonymousClass3HK;
import X.AnonymousClass3zG;
import X.AnonymousClass49V;
import X.AnonymousClass4WJ;
import X.AnonymousClass5z1;
import X.C04220Ms;
import X.C146368m8;
import X.C18180wK;
import X.C18230wP;
import X.C18240wQ;
import X.C320129v;
import X.C57553Bn;
import X.C59693Lv;
import X.C62873b3;
import X.C63813iO;
import X.C684443u;
import X.C82564pu;
import X.C83334rD;
import X.C83504rU;
import X.C83834s4;
import X.C83954sG;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;

public class IDxFCallbackShape313S0100000_1_I2 implements C83334rD {
    public Object A00;
    public final int A01;

    public IDxFCallbackShape313S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(th, 0);
                C18240wQ.A1O(new AnonymousClass5z1(th.toString()), (C146368m8) this.A00);
                return;
            case 1:
                C04220Ms.A0B(th, 0);
                C684443u r1 = (C684443u) this.A00;
                C62873b3.A03(r1, r1.A02, AnonymousClass006.A0f, (Integer) null, (Integer) null, (String) null, (String) null, th2, (Map) null, 984);
                r1.A04.CrC(new KtCSuperShape0S0110000_I2((List) null, 1, 10, true));
                return;
            case 2:
            case 6:
            case 7:
                return;
            case 3:
                Fragment fragment = (Fragment) this.A00;
                C63813iO.A0D(fragment.getContext(), C18230wP.A0l(fragment), 1);
                return;
            case 4:
                ((C83504rU) this.A00).Bxq();
                return;
            case 5:
                C59693Lv.A00(C320129v.DEFAULT_PRIVACY_INFO_FETCH_FAILURE, ((AnonymousClass349) this.A00).A00.A05);
                return;
            case 8:
                C04220Ms.A0B(th, 0);
                ((AnonymousClass3HK) this.A00).A01(th);
                return;
            case 9:
                C04220Ms.A0B(th, 0);
                AnonymousClass3BP r5 = (AnonymousClass3BP) this.A00;
                AnonymousClass49V r4 = r5.A01.A03;
                String str = r5.A03;
                String str2 = r5.A00.A02;
                C04220Ms.A06(str2);
                r4.A04("manual_fetch_failure", str, (List) null, AnonymousClass4WJ.A08(C18180wK.A0p("caller_class", str2), C18180wK.A0p("error_message", th.getMessage())));
                C83954sG r0 = r5.A02;
                if (r0 != null) {
                    r0.onFailure();
                    return;
                }
                return;
            case 10:
                C04220Ms.A0B(th, 0);
                AnonymousClass3BQ r52 = (AnonymousClass3BQ) this.A00;
                AnonymousClass49V r42 = r52.A02.A00;
                String str3 = r52.A03;
                String str4 = r52.A00.A02;
                C04220Ms.A06(str4);
                r42.A04("compare_obid_fetch_failure", str3, (List) null, AnonymousClass4WJ.A08(C18180wK.A0p("caller_class", str4), C18180wK.A0p("error_message", th.getMessage())));
                r52.A01.onFailure();
                return;
            case 11:
                ((C82564pu) this.A00).Bym(new AnonymousClass3AF());
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((C83834s4) this.A00).Bxq();
                return;
            case 13:
                C57553Bn r43 = (C57553Bn) this.A00;
                AnonymousClass3zG.A03(r43.A00, r43.A01, r43.A02.A00, r43.A03.A00);
                return;
            case 14:
                ((AnonymousClass1dK) this.A00).A05 = false;
                return;
            default:
                C04220Ms.A0B(th, 0);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v82, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07c9, code lost:
        if (r7 != null) goto L_0x074c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0781  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x07a4  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07bb  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x07c1  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x09ea  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0727 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r5 = r26
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x06c2;
                case 1: goto L_0x06e1;
                case 2: goto L_0x0023;
                case 3: goto L_0x00b0;
                case 4: goto L_0x0826;
                case 5: goto L_0x01a9;
                case 6: goto L_0x025b;
                case 7: goto L_0x02c9;
                case 8: goto L_0x0840;
                case 9: goto L_0x03fe;
                case 10: goto L_0x08f0;
                case 11: goto L_0x0928;
                case 12: goto L_0x0999;
                case 13: goto L_0x0436;
                case 14: goto L_0x054d;
                case 15: goto L_0x05c6;
                case 16: goto L_0x0644;
                case 17: goto L_0x065a;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.36h r5 = (X.C562336h) r5
            if (r5 == 0) goto L_0x0022
            X.36g r1 = r5.A00
            if (r1 == 0) goto L_0x0b19
            X.3B4 r1 = r1.A00
            if (r1 == 0) goto L_0x0b1c
            java.lang.Integer r3 = r1.A02
            java.lang.Integer r2 = r1.A01
            X.18o r1 = r1.A00
            java.lang.Object r0 = r0.A00
            X.3SX r0 = (X.AnonymousClass3SX) r0
            X.AnonymousClass3SX.A00(r1, r0, r3, r2)
        L_0x0022:
            return
        L_0x0023:
            X.8gY r5 = (X.C143338gY) r5
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r1 = r5.A01
            if (r1 == 0) goto L_0x0022
            X.4uz r1 = (X.C85394uz) r1
            X.4uy r1 = r1.AqD()
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.B7w()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r5 = r0.A00
            X.1dW r5 = (X.AnonymousClass1dW) r5
            com.instagram.service.session.UserSession r3 = r5.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36322392393391436(0x810b0600001d4c, double:3.03376543589083E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0022
            androidx.fragment.app.Fragment r6 = r5.getTargetFragment()
            if (r6 == 0) goto L_0x0022
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x0022
            X.Dsm r4 = X.C18190wL.A0W(r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r6)
            r0 = 2131824309(0x7f110eb5, float:1.9281442E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A02 = r0
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r6)
            r0 = 2131824307(0x7f110eb3, float:1.9281438E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0p(r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r6)
            r0 = 2131824308(0x7f110eb4, float:1.928144E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 17
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = X.C18220wO.A0O(r5, r0)
            X.25l r0 = X.AnonymousClass25l.BLUE_BOLD
            r2 = 1
            r4.A0Y(r1, r0, r3, r2)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r6)
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 16
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = X.C18220wO.A0O(r5, r0)
            r4.A0b(r0, r1)
            r4.A0q(r2)
            r4.A0r(r2)
            X.AnonymousClass0wJ.A1K(r4)
            return
        L_0x00b0:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0022
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r2 = r5.A01
            if (r2 == 0) goto L_0x0022
            X.4v2 r2 = (X.AnonymousClass4v2) r2
            X.4v1 r1 = r2.BMW()
            if (r1 == 0) goto L_0x0022
            X.4v1 r1 = r2.BMW()
            boolean r1 = r1.Apt()
            java.lang.Object r6 = r0.A00
            X.1cM r6 = (X.AnonymousClass1cM) r6
            android.widget.EditText r0 = r6.A03
            java.lang.String r7 = X.AnonymousClass0wJ.A0n(r0)
            X.48S r0 = r6.A0B
            if (r1 == 0) goto L_0x014f
            if (r0 != 0) goto L_0x014c
            r8 = 0
        L_0x00db:
            r8.getClass()
            java.lang.String r9 = X.C18250wR.A0Z(r0)
            r9.getClass()
            X.0i6 r0 = r6.A0E
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r5 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r5.<init>()
            java.lang.String r1 = r0.getUserId()
            java.lang.String r0 = "actor_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r5, r1, r0)
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r5, r1, r0)
            java.lang.String r0 = "name"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r5, r7, r0)
            java.lang.String r1 = "instagram"
            java.lang.String r0 = "creation_source"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r5, r1, r0)
            r3 = 1
            r10 = 0
            java.util.List r1 = X.C18210wN.A0h(r9)
            java.lang.String r0 = "categories"
            r5.A0A(r0, r1)
            java.lang.String r1 = "instagram_creation_flow"
            java.lang.String r0 = "page_referrer"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r5, r1, r0)
            X.0i6 r1 = r6.A0E
            X.4td r0 = r6.A08
            java.lang.String r4 = X.C67293zJ.A03(r0, r1)
            X.3zb r2 = X.C67463zb.A00()
            X.C67463zb.A01(r5, r2)
            X.AnonymousClass7Ko.A0B(r3)
            java.lang.Class<X.14g> r1 = X.C203314g.class
            java.lang.String r0 = "FbAdditionalProfilePlusCreationMutation"
            X.3zc r0 = X.C67473zc.A00(r2, r1, r0)
            r4.getClass()
        L_0x013d:
            X.H8c r0 = X.C18220wO.A0X(r0, r4)
            com.instagram.common.api.base.IDxACallbackShape0S3100000_1_I2 r5 = new com.instagram.common.api.base.IDxACallbackShape0S3100000_1_I2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r5
            r6.schedule(r0)
            return
        L_0x014c:
            java.lang.String r8 = r0.A02
            goto L_0x00db
        L_0x014f:
            if (r0 != 0) goto L_0x01a4
            r8 = 0
            r9 = 0
        L_0x0153:
            X.0i6 r0 = r6.A0E
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r3.<init>()
            java.lang.String r1 = r0.getUserId()
            java.lang.String r0 = "actor_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r0 = "name"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r7, r0)
            java.lang.String r0 = "category"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r9, r0)
            java.lang.String r1 = "instagram"
            java.lang.String r0 = "creation_source"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r1 = "instagram_creation_flow"
            java.lang.String r0 = "ref"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            X.0i6 r1 = r6.A0E
            X.4td r0 = r6.A08
            java.lang.String r4 = X.C67293zJ.A03(r0, r1)
            X.3zb r2 = X.C67463zb.A00()
            X.C67463zb.A01(r3, r2)
            r10 = 1
            X.AnonymousClass7Ko.A0B(r10)
            java.lang.Class<X.14n> r1 = X.C204014n.class
            java.lang.String r0 = "FbPageCreateMutation"
            X.3zc r0 = X.C67473zc.A00(r2, r1, r0)
            goto L_0x013d
        L_0x01a4:
            java.lang.String r8 = r0.A02
            java.lang.String r9 = r0.A01
            goto L_0x0153
        L_0x01a9:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0022
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r3 = r5.A01
            if (r3 == 0) goto L_0x0022
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x0259
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl$XcxpGetFeedCrosspostingDefaultAudienceStatus> r2 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl.XcxpGetFeedCrosspostingDefaultAudienceStatus.class
            java.lang.String r1 = "xcxp_get_feed_crossposting_default_audience_status"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x0259
            java.lang.String r1 = "is_ig_user_opt_in_default_audience"
            boolean r13 = r3.getBooleanValue(r1)
            X.20N r2 = X.AnonymousClass20N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "current_phase"
            java.lang.Enum r10 = r3.getEnumValue(r1, r2)
            X.20N r10 = (X.AnonymousClass20N) r10
            java.lang.String r1 = "fb_feed_audience"
            java.lang.String r11 = r3.getStringValue(r1)
            java.lang.String r1 = "consent_accept_deadline"
            java.lang.String r12 = r3.getStringValue(r1)
            java.lang.String r1 = "is_old_crossposter"
            boolean r14 = r3.getBooleanValue(r1)
            X.21z r2 = X.AnonymousClass21z.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "audience_cohort"
            java.lang.Enum r9 = r3.getEnumValue(r1, r2)
            X.21z r9 = (X.AnonymousClass21z) r9
            if (r11 == 0) goto L_0x0259
            if (r10 == 0) goto L_0x0259
            if (r12 == 0) goto L_0x0259
            if (r9 == 0) goto L_0x0259
            X.16t r8 = new X.16t
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x01fa:
            java.lang.Object r0 = r0.A00
            X.349 r0 = (X.AnonymousClass349) r0
            X.49i r6 = r0.A00
            int r2 = r6.A00
            com.instagram.service.session.UserSession r7 = r6.A05
            boolean r0 = X.C63803iN.A0F(r7)
            if (r0 == 0) goto L_0x0212
            X.49c r0 = X.C49222r2.A00(r7)
            int r2 = r0.A00()
        L_0x0212:
            X.29v r1 = X.C320129v.DEFAULT_PRIVACY_INFO_FETCH_SUCCESS
            r5 = 0
            if (r8 == 0) goto L_0x0257
            java.lang.String r4 = r8.A04
        L_0x0219:
            java.lang.Long r3 = X.C18230wP.A0f(r2)
            if (r8 == 0) goto L_0x0225
            boolean r0 = r8.A00
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L_0x0225:
            X.0nS r0 = X.C13330nS.A02(r7)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A07(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0253
            java.lang.String r0 = "action_name"
            r2.A0O(r1, r0)
            java.lang.String r1 = r7.getUserId()
            java.lang.String r0 = "instagram_user_id"
            r2.A0T(r0, r1)
            java.lang.String r0 = "audience_setting"
            r2.A0S(r0, r3)
            java.lang.String r0 = "default_audience"
            r2.A0T(r0, r4)
            java.lang.String r0 = "has_opt_in_default_audience_migration"
            r2.A0Q(r0, r5)
            r2.Bb4()
        L_0x0253:
            r6.A0B(r8)
            return
        L_0x0257:
            r4 = r5
            goto L_0x0219
        L_0x0259:
            r8 = 0
            goto L_0x01fa
        L_0x025b:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0022
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r3 = r5.A01
            if (r3 == 0) goto L_0x0022
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            r16 = 0
            if (r3 == 0) goto L_0x0a80
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent> r2 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.class
            java.lang.String r1 = "xcxp_get_feed_crossposting_audience_consent_content"
            com.facebook.pando.TreeJNI r4 = r3.getTreeValue(r1, r2)
            if (r4 == 0) goto L_0x0a80
            java.lang.String r1 = "title"
            java.lang.String r14 = r4.getStringValue(r1)
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$ButtonLabel> r5 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.ButtonLabel.class
            java.lang.String r3 = "button_label"
            com.facebook.pando.TreeJNI r2 = r4.getTreeValue(r3, r5)
            if (r2 == 0) goto L_0x02c6
            java.lang.String r1 = "primary"
            java.lang.String r15 = r2.getStringValue(r1)
        L_0x028b:
            com.facebook.pando.TreeJNI r2 = r4.getTreeValue(r3, r5)
            if (r2 == 0) goto L_0x0297
            java.lang.String r1 = "secondary"
            java.lang.String r16 = r2.getStringValue(r1)
        L_0x0297:
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$ToasterStylised> r2 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.ToasterStylised.class
            java.lang.String r1 = "toaster_stylised"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r1, r2)
            r10 = 0
            if (r3 == 0) goto L_0x09b5
            java.lang.String r1 = "text"
            java.lang.String r5 = r3.getStringValue(r1)
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$ToasterStylised$InlineStyleRanges> r2 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.ToasterStylised.InlineStyleRanges.class
            java.lang.String r1 = "inline_style_ranges"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r3, r2, r1)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x02b8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09b7
            X.16s r1 = X.C18190wL.A0V(r2)
            r3.add(r1)
            goto L_0x02b8
        L_0x02c6:
            r15 = r16
            goto L_0x028b
        L_0x02c9:
            X.8gY r5 = (X.C143338gY) r5
            java.lang.Object r2 = r0.A00
            X.1dp r2 = (X.C23431dp) r2
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A00
            if (r1 != 0) goto L_0x02da
            java.lang.String r0 = "spinner"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x02da:
            X.69F r0 = X.AnonymousClass69F.SUCCESS
            r1.setLoadingStatus(r0)
            if (r5 == 0) goto L_0x0022
            com.facebook.pando.TreeJNI r3 = X.C685344e.A03(r5)
            if (r3 == 0) goto L_0x0022
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node> r1 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.class
            java.lang.String r0 = "node(node_id:$fan_club_id)"
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "XIGFanClub"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub> r0 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.class
            com.facebook.pando.TreeJNI r3 = r1.reinterpret(r0)
            if (r3 == 0) goto L_0x0022
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package> r1 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.class
            java.lang.String r0 = "package"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r0, r1)
            if (r3 == 0) goto L_0x0022
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics> r1 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.class
            java.lang.String r0 = "fan_club_metrics"
            com.facebook.pando.TreeJNI r5 = r3.getTreeValue(r0, r1)
            if (r5 == 0) goto L_0x0022
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$LifetimeEstimatedEarnings> r3 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.LifetimeEstimatedEarnings.class
            java.lang.String r0 = "lifetime_estimated_earnings"
            com.facebook.pando.TreeJNI r3 = r5.getTreeValue(r0, r3)
            r7 = 0
            if (r3 == 0) goto L_0x03fb
            java.lang.String r0 = "formatted_amount"
            java.lang.String r0 = r3.getStringValue(r0)
        L_0x032a:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "lifetime_daterange"
            java.lang.String r0 = r5.getStringValue(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            X.48K r0 = new X.48K
            r0.<init>(r4, r3)
            r1.add(r0)
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics> r3 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.class
            java.lang.String r0 = "monthly_metrics(before:$date,last:$count)"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x0aa5
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics$Edges> r3 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.Edges.class
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r3)
            if (r0 == 0) goto L_0x0aa5
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x035c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0aa5
            com.facebook.pando.TreeJNI r5 = X.C18210wN.A0G(r6)
            if (r5 == 0) goto L_0x03f8
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics$Edges$EdgesNode> r4 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.Edges.EdgesNode.class
            java.lang.String r0 = "node"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r0, r4)
            if (r5 == 0) goto L_0x03f9
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics$Edges$EdgesNode$MonthInfo> r4 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.Edges.EdgesNode.MonthInfo.class
            java.lang.String r0 = "month_info"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r4)
            if (r4 == 0) goto L_0x03f9
            java.lang.String r0 = "month"
            java.lang.String r0 = r4.getStringValue(r0)
        L_0x0382:
            java.lang.String r9 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L_0x03f6
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics$Edges$EdgesNode$MonthInfo> r4 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.Edges.EdgesNode.MonthInfo.class
            java.lang.String r0 = "month_info"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r4)
            if (r4 == 0) goto L_0x03f6
            java.lang.String r0 = "month"
            java.lang.String r0 = r4.getStringValue(r0)
        L_0x0398:
            java.lang.String r10 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L_0x03f4
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics$Edges$EdgesNode$MonthInfo> r4 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.Edges.EdgesNode.MonthInfo.class
            java.lang.String r0 = "month_info"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r4)
            if (r4 == 0) goto L_0x03f4
            java.lang.String r0 = "dates"
            java.lang.String r0 = r4.getStringValue(r0)
        L_0x03ae:
            java.lang.String r11 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L_0x03f2
            java.lang.Class<com.instagram.fanclub.api.FanClubInsightsResponseImpl$Node$InlineXIGFanClub$Package$FanClubMetrics$MonthlyMetrics$Edges$EdgesNode$EstimatedEarnings> r4 = com.instagram.fanclub.api.FanClubInsightsResponseImpl.Node.InlineXIGFanClub.Package.FanClubMetrics.MonthlyMetrics.Edges.EdgesNode.EstimatedEarnings.class
            java.lang.String r0 = "estimated_earnings"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r4)
            if (r4 == 0) goto L_0x03f2
            java.lang.String r0 = "formatted_amount"
            java.lang.String r0 = r4.getStringValue(r0)
        L_0x03c4:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L_0x03ee
            java.lang.String r0 = "active_members"
            int r13 = r5.getIntValue(r0)
            java.lang.String r0 = "canceled_memberships"
            int r14 = r5.getIntValue(r0)
            java.lang.String r0 = "net_new"
            int r15 = r5.getIntValue(r0)
        L_0x03dc:
            X.MKD r8 = new X.MKD
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r1.add(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            goto L_0x035c
        L_0x03ee:
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x03dc
        L_0x03f2:
            r0 = r7
            goto L_0x03c4
        L_0x03f4:
            r0 = r7
            goto L_0x03ae
        L_0x03f6:
            r0 = r7
            goto L_0x0398
        L_0x03f8:
            r5 = r7
        L_0x03f9:
            r0 = r7
            goto L_0x0382
        L_0x03fb:
            r0 = r7
            goto L_0x032a
        L_0x03fe:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0aab
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r1 = r5.A01
            com.instagram.graphql.instagramschemagraphservices.FxIgXavSwitcherBadgingDataQueryResponseImpl r1 = (com.instagram.graphql.instagramschemagraphservices.FxIgXavSwitcherBadgingDataQueryResponseImpl) r1
            java.lang.Object r8 = r0.A00
            X.3BP r8 = (X.AnonymousClass3BP) r8
            X.3Tx r0 = X.AnonymousClass3Tx.A00
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r7 = r0.A00(r1)
            X.1z7 r6 = r8.A01
            X.49V r5 = r6.A03
            java.lang.String r4 = r8.A03
            com.facebook.common.callercontext.CallerContext r3 = r8.A00
            java.lang.String r1 = r3.A02
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "caller_class"
            java.util.HashMap r2 = X.C63203gz.A03(r0, r1)
            java.lang.String r1 = "manual_fetch_success"
            r0 = 0
            r5.A04(r1, r4, r0, r2)
            r6.A08(r3, r7, r4)
            X.4sG r0 = r8.A02
            if (r0 == 0) goto L_0x0022
            r0.onSuccess()
            return
        L_0x0436:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0022
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r5 = r5.A01
            if (r5 == 0) goto L_0x0022
            java.lang.Object r1 = r0.A00
            X.3Bn r1 = (X.C57553Bn) r1
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            X.3zG r2 = r1.A00
            X.21C r4 = X.AnonymousClass21C.FB
            if (r5 == 0) goto L_0x054a
            java.lang.Class<com.instagram.share.facebook.graphql.CrosspostingUnifiedConfigsQueryResponseImpl$XcxpUnifiedCrosspostingConfigsRoot> r3 = com.instagram.share.facebook.graphql.CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.class
            java.lang.String r0 = "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r0, r3)
            com.instagram.share.facebook.graphql.CrosspostingUnifiedConfigsQueryResponseImpl$XcxpUnifiedCrosspostingConfigsRoot r0 = (com.instagram.share.facebook.graphql.CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot) r0
        L_0x0456:
            com.instagram.share.facebook.graphql.CrosspostingUnifiedConfigsQueryResponseImpl$XcxpUnifiedCrosspostingConfigsRoot$AccountLinkingConfigs r3 = X.AnonymousClass3zG.A00(r4, r0)
            X.0Mo r0 = r1.A02
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0485
            X.22R r0 = X.AnonymousClass22R.FEED
            com.instagram.share.facebook.graphql.XpostingUnifiedConfigCrosspostingSettingImpl r10 = X.AnonymousClass3zG.A01(r0, r3)
            if (r10 == 0) goto L_0x0485
            X.3zF r9 = r2.A02
            java.lang.String r8 = r1.A01
            r7 = 0
            X.3Xq r6 = X.C67263zF.A03
            com.instagram.service.session.UserSession r5 = r9.A01
            java.lang.String r4 = "is_auto_crosspost_enabled"
            boolean r0 = r10.getBooleanValue(r4)
            r6.A02(r5, r8, r0, r7)
            boolean r0 = r10.getBooleanValue(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C67263zF.A00(r9, r8, r0)
        L_0x0485:
            X.0Mo r0 = r1.A03
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0505
            X.22R r5 = X.AnonymousClass22R.STORY
            com.instagram.share.facebook.graphql.XpostingUnifiedConfigCrosspostingSettingImpl r9 = X.AnonymousClass3zG.A01(r5, r3)
            if (r9 == 0) goto L_0x04db
            X.3zC r6 = r2.A04
            java.lang.String r12 = r1.A01
            java.lang.Integer r11 = X.AnonymousClass006.A00
            r14 = 0
            r8 = 1
            java.lang.String r0 = "is_auto_crosspost_enabled"
            boolean r13 = r9.getBooleanValue(r0)
            com.instagram.service.session.UserSession r10 = r6.A06
            boolean r7 = X.C61453Tm.A00(r10)
            if (r13 == 0) goto L_0x0546
            java.lang.String r4 = "ON"
        L_0x04ab:
            java.lang.String r0 = "server_setting_fetch_success"
            X.AnonymousClass3WY.A01(r10, r12, r0, r4, r7)
            X.1tl r4 = X.AnonymousClass3WS.A01(r10)
            java.lang.String r0 = "auto_crosspost_setting_timestamp"
            int r7 = r9.getIntValue(r0)
            android.content.SharedPreferences$Editor r4 = X.C28161tl.A02(r4)
            java.lang.String r0 = "xpost_to_facebook_story_server_mtime_in_second"
            X.AnonymousClass0wJ.A11(r4, r0, r7)
            java.lang.String r0 = "auto_crosspost_setting_surface"
            int r4 = r9.getIntValue(r0)
            if (r4 == 0) goto L_0x0543
            if (r4 == r8) goto L_0x0540
            r0 = 2
            if (r4 == r0) goto L_0x053d
            r0 = 0
        L_0x04d1:
            r6.A00 = r0
            X.C67233zC.A00(r6)
            X.3Tm r9 = X.C67233zC.A08
            r9.A01(r10, r11, r12, r13, r14)
        L_0x04db:
            com.instagram.share.facebook.graphql.XpostingUnifiedConfigCrosspostingSettingImpl r4 = X.AnonymousClass3zG.A02(r5, r3)
            if (r4 == 0) goto L_0x0505
            X.3zC r5 = r2.A04
            java.lang.String r8 = r1.A01
            java.lang.Integer r7 = X.AnonymousClass006.A01
            r10 = 0
            java.lang.String r0 = "is_auto_crosspost_enabled"
            boolean r9 = r4.getBooleanValue(r0)
            com.instagram.service.session.UserSession r6 = r5.A06
            android.content.SharedPreferences$Editor r4 = X.AnonymousClass3Zu.A01(r6)
            java.lang.String r0 = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS"
            X.AnonymousClass0wJ.A13(r4, r0, r9)
            X.4s3 r0 = r5.A07
            if (r0 == 0) goto L_0x0500
            r0.CKJ()
        L_0x0500:
            X.3Tm r5 = X.C67233zC.A08
            r5.A01(r6, r7, r8, r9, r10)
        L_0x0505:
            X.22R r0 = X.AnonymousClass22R.REELS
            com.instagram.share.facebook.graphql.XpostingUnifiedConfigCrosspostingSettingImpl r9 = X.AnonymousClass3zG.A01(r0, r3)
            if (r9 == 0) goto L_0x0022
            X.49f r8 = r2.A03
            java.lang.String r7 = r1.A01
            java.lang.String r6 = "is_auto_crosspost_enabled"
            boolean r5 = r9.getBooleanValue(r6)
            com.instagram.service.session.UserSession r4 = r8.A01
            X.3ZL r3 = r8.A02
            android.content.SharedPreferences r1 = r3.A04
            java.lang.String r0 = "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"
            boolean r2 = X.C18190wL.A1X(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "server_setting_fetch_success"
            X.AnonymousClass3WY.A00(r4, r7, r0, r1, r2)
            boolean r0 = r9.getBooleanValue(r6)
            r3.A04(r0)
            X.4wE r1 = r8.A04
            boolean r0 = r9.getBooleanValue(r6)
            X.C86074wE.A01(r1, r0)
            return
        L_0x053d:
            java.lang.String r0 = "FB_STORY_MID_CARD"
            goto L_0x04d1
        L_0x0540:
            java.lang.String r0 = "FB_FEED_QP_IMPORTING"
            goto L_0x04d1
        L_0x0543:
            java.lang.String r0 = "UNSET_DEFAULT"
            goto L_0x04d1
        L_0x0546:
            java.lang.String r4 = "OFF"
            goto L_0x04ab
        L_0x054a:
            r0 = 0
            goto L_0x0456
        L_0x054d:
            X.8gY r5 = (X.C143338gY) r5
            java.lang.Object r4 = r0.A00
            X.1dK r4 = (X.AnonymousClass1dK) r4
            r3 = 0
            r4.A05 = r3
            if (r5 == 0) goto L_0x0022
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r5)
            if (r2 == 0) goto L_0x0022
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl$XcxpFetchFeedback> r1 = com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.class
            java.lang.String r0 = "xcxp_fetch_feedback(content_destinations:$content_destinations,content_source:$content_source,id:$content_id)"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r0.get(r3)
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "XFBFeedback"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl$XcxpFetchFeedback$InlineXFBFeedback> r0 = com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            if (r2 == 0) goto L_0x0022
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl$XcxpFetchFeedback$InlineXFBFeedback$Reactors> r1 = com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.class
            java.lang.String r0 = "reactors(after:$after_cursor,first:$page_size)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0022
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl$XcxpFetchFeedback$InlineXFBFeedback$Reactors$PageInfo> r1 = com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.PageInfo.class
            java.lang.String r0 = "page_info"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl$XcxpFetchFeedback$InlineXFBFeedback$Reactors$PageInfo r0 = (com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.PageInfo) r0
            if (r0 == 0) goto L_0x0b09
            r4.A03 = r0
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl$XcxpFetchFeedback$InlineXFBFeedback$Reactors$Edges> r1 = com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.Edges.class
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r2, r1, r0)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x05a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ab0
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r2)
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl> r0 = com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl r1 = (com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl) r1
            X.C04220Ms.A06(r1)
            X.48T r0 = new X.48T
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x05a8
        L_0x05c6:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0022
            com.facebook.pando.TreeJNI r3 = X.C685344e.A03(r5)
            if (r3 == 0) goto L_0x0022
            java.lang.Class<com.instagram.graphql.instagramschema.WellbeingQuietTimeSubscriptionResponseImpl$IgSupervisedUserQuietTimeSettingsSubscribe> r2 = com.instagram.graphql.instagramschema.WellbeingQuietTimeSubscriptionResponseImpl.IgSupervisedUserQuietTimeSettingsSubscribe.class
            java.lang.String r1 = "ig_supervised_user_quiet_time_settings_subscribe(data:$input)"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x0022
            java.lang.Class<com.instagram.graphql.instagramschema.WellbeingQuietTimeSubscriptionResponseImpl$IgSupervisedUserQuietTimeSettingsSubscribe$QuietTimeIntervalsForEnforcement> r2 = com.instagram.graphql.instagramschema.WellbeingQuietTimeSubscriptionResponseImpl.IgSupervisedUserQuietTimeSettingsSubscribe.QuietTimeIntervalsForEnforcement.class
            java.lang.String r1 = "quiet_time_intervals_for_enforcement"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x0022
            r7 = 10
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r1, r7)
            java.util.Iterator r9 = r1.iterator()
        L_0x05ee:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0b0e
            com.facebook.pando.TreeJNI r8 = X.C18210wN.A0G(r9)
            X.20A r2 = X.AnonymousClass20A.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "days"
            com.google.common.collect.ImmutableList r1 = r8.getEnumList(r1, r2)
            X.C04220Ms.A06(r1)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r1, r7)
            java.util.Iterator r3 = r1.iterator()
        L_0x060b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0629
            java.lang.Object r1 = r3.next()
            X.20A r1 = (X.AnonymousClass20A) r1
            java.lang.String r2 = r1.name()
            java.util.Map r1 = com.instagram.api.schemas.DayOfTheWeek.A01
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L_0x0625
            com.instagram.api.schemas.DayOfTheWeek r1 = com.instagram.api.schemas.DayOfTheWeek.UNRECOGNIZED
        L_0x0625:
            r5.add(r1)
            goto L_0x060b
        L_0x0629:
            java.lang.String r1 = "end_time"
            java.lang.Integer r4 = X.C18240wQ.A0Y(r8, r1)
            java.lang.String r1 = "label"
            java.lang.String r3 = r8.getStringValue(r1)
            java.lang.String r1 = "start_time"
            java.lang.Integer r2 = X.C18240wQ.A0Y(r8, r1)
            X.18a r1 = new X.18a
            r1.<init>(r4, r2, r3, r5)
            r6.add(r1)
            goto L_0x05ee
        L_0x0644:
            X.36k r5 = (X.C562636k) r5
            if (r5 == 0) goto L_0x0022
            X.36j r2 = r5.A00
            if (r2 == 0) goto L_0x0b19
            java.lang.Object r1 = r0.A00
            X.3SW r1 = (X.AnonymousClass3SW) r1
            X.36i r0 = r2.A00
            if (r0 == 0) goto L_0x0b16
            java.util.List r0 = r0.A00
            X.AnonymousClass3SW.A00(r1, r0)
            return
        L_0x065a:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0022
            com.facebook.pando.TreeJNI r3 = X.C685344e.A03(r5)
            if (r3 == 0) goto L_0x0022
            java.lang.Class<com.instagram.graphql.instagramschema.WellbeingScreenTimeSubscriptionResponseImpl$IgSupervisedUserScreenTimeSettingsSubscribe> r2 = com.instagram.graphql.instagramschema.WellbeingScreenTimeSubscriptionResponseImpl.IgSupervisedUserScreenTimeSettingsSubscribe.class
            java.lang.String r1 = "ig_supervised_user_screen_time_settings_subscribe(data:$input)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0022
            java.lang.Object r9 = r0.A00
            X.3SX r9 = (X.AnonymousClass3SX) r9
            java.lang.String r0 = "screen_time_daily_limit_seconds"
            java.lang.Integer r8 = X.C18240wQ.A0Y(r2, r0)
            java.lang.String r0 = "daily_limit_without_extensions_seconds"
            java.lang.Integer r7 = X.C18240wQ.A0Y(r2, r0)
            java.lang.Class<com.instagram.graphql.instagramschema.WellbeingScreenTimeSubscriptionResponseImpl$IgSupervisedUserScreenTimeSettingsSubscribe$LatestValidTimeLimitExtensionRequest> r1 = com.instagram.graphql.instagramschema.WellbeingScreenTimeSubscriptionResponseImpl.IgSupervisedUserScreenTimeSettingsSubscribe.LatestValidTimeLimitExtensionRequest.class
            java.lang.String r0 = "latest_valid_time_limit_extension_request"
            com.facebook.pando.TreeJNI r6 = r2.getTreeValue(r0, r1)
            r0 = 0
            if (r6 == 0) goto L_0x06be
            java.lang.String r1 = "granted_extension_time_seconds"
            int r5 = r6.getIntValue(r1)
            java.lang.String r4 = X.C18220wO.A0m(r6)
            X.20E r2 = X.AnonymousClass20E.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "status"
            java.lang.Enum r1 = r6.getEnumValue(r1, r2)
            X.20E r1 = (X.AnonymousClass20E) r1
            if (r1 == 0) goto L_0x06a3
            java.lang.String r0 = r1.name()
        L_0x06a3:
            java.util.Map r1 = com.instagram.api.schemas.XFBYPRequestStatus.A01
            java.lang.Object r3 = r1.get(r0)
            com.instagram.api.schemas.XFBYPRequestStatus r3 = (com.instagram.api.schemas.XFBYPRequestStatus) r3
            if (r3 != 0) goto L_0x06af
            com.instagram.api.schemas.XFBYPRequestStatus r3 = com.instagram.api.schemas.XFBYPRequestStatus.UNRECOGNIZED
        L_0x06af:
            java.lang.String r0 = "decision_actor_username"
            java.lang.String r2 = r6.getStringValue(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.18o r0 = new X.18o
            r0.<init>(r3, r1, r2, r4)
        L_0x06be:
            X.AnonymousClass3SX.A00(r0, r9, r8, r7)
            return
        L_0x06c2:
            X.8gY r5 = (X.C143338gY) r5
            java.lang.Object r2 = r0.A00
            X.8m8 r2 = (X.C146368m8) r2
            if (r5 == 0) goto L_0x06d9
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r1 = r5.A01
            if (r1 == 0) goto L_0x06d9
            X.5z2 r0 = new X.5z2
            r0.<init>(r1)
        L_0x06d5:
            X.C18240wQ.A1O(r0, r2)
            return
        L_0x06d9:
            java.lang.String r1 = "success_result_should_not_be_null"
            X.5z1 r0 = new X.5z1
            r0.<init>(r1)
            goto L_0x06d5
        L_0x06e1:
            X.8gY r5 = (X.C143338gY) r5
            r15 = 0
            if (r5 == 0) goto L_0x07ce
            com.facebook.pando.TreeJNI r3 = X.C685344e.A03(r5)
            if (r3 == 0) goto L_0x07ce
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile> r2 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.class
            java.lang.String r1 = "cam_creator_profile"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x07ce
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile> r2 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.class
            java.lang.String r1 = "creator_profile"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x07ce
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns> r2 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.class
            java.lang.String r1 = "creator_campaigns(after:$after_cursor,before:$before_cursor,first:$first,last:$last,query_params:$params)"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x07ce
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges> r2 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.class
            java.lang.String r1 = "edges"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x07ce
            java.lang.Object r12 = r0.A00
            X.43u r12 = (X.C684443u) r12
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r11 = r1.iterator()
            r4 = 0
            r9 = 0
        L_0x0727:
            boolean r0 = r11.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x07dd
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r11)
            if (r7 == 0) goto L_0x07c8
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node> r1 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.class
            java.lang.String r0 = "node"
            com.facebook.pando.TreeJNI r6 = r7.getTreeValue(r0, r1)
            if (r6 == 0) goto L_0x07c8
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node$BcpCampaign> r1 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.BcpCampaign.class
            java.lang.String r0 = "bcp_campaign"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x07c8
            java.lang.String r6 = X.C18220wO.A0l(r0)
        L_0x074c:
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node> r10 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.class
            java.lang.String r9 = "node"
            com.facebook.pando.TreeJNI r8 = r7.getTreeValue(r9, r10)
            if (r8 == 0) goto L_0x0764
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node$BcpCampaign> r1 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.BcpCampaign.class
            java.lang.String r0 = "bcp_campaign"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x0764
            java.lang.String r3 = X.C18220wO.A0m(r0)
        L_0x0764:
            com.facebook.pando.TreeJNI r8 = r7.getTreeValue(r9, r10)
            if (r8 == 0) goto L_0x07cc
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node$BcpCampaign> r1 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.BcpCampaign.class
            java.lang.String r0 = "bcp_campaign"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x07cc
            java.lang.String r0 = X.C18220wO.A0l(r0)
        L_0x0778:
            r9 = 1
            if (r0 == 0) goto L_0x07c1
            int r0 = r0.length()
            if (r0 == 0) goto L_0x07c1
            r8 = 0
        L_0x0782:
            if (r7 == 0) goto L_0x07bb
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node> r1 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.class
            java.lang.String r0 = "node"
            com.facebook.pando.TreeJNI r7 = r7.getTreeValue(r0, r1)
            if (r7 == 0) goto L_0x07bb
            java.lang.Class<com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl$CamCreatorProfile$CreatorProfile$CreatorCampaigns$Edges$Node$BcpCampaign> r1 = com.instagram.brandedcontent.projectboard.graphql.CAMDiscoveryCampaignSearchResponseImpl.CamCreatorProfile.CreatorProfile.CreatorCampaigns.Edges.Node.BcpCampaign.class
            java.lang.String r0 = "bcp_campaign"
            com.facebook.pando.TreeJNI r0 = r7.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x07bb
            java.lang.String r0 = X.C18220wO.A0m(r0)
            if (r0 == 0) goto L_0x07bb
            int r0 = r0.length()
            if (r0 == 0) goto L_0x07bb
            r9 = r8
        L_0x07a5:
            if (r9 != 0) goto L_0x0727
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x07ac
            r3 = r0
        L_0x07ac:
            if (r6 != 0) goto L_0x07af
            r6 = r0
        L_0x07af:
            r1 = 18
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r0.<init>(r3, r6, r1)
            r5.add(r0)
            goto L_0x0727
        L_0x07bb:
            java.lang.String r0 = "campaign_name"
            r2.add(r0)
            goto L_0x07a5
        L_0x07c1:
            java.lang.String r0 = "campaign_id"
            r2.add(r0)
            r8 = 1
            goto L_0x0782
        L_0x07c8:
            r6 = r15
            if (r7 == 0) goto L_0x07cc
            goto L_0x074c
        L_0x07cc:
            r0 = r15
            goto L_0x0778
        L_0x07ce:
            java.lang.Object r0 = r0.A00
            X.43u r0 = (X.C684443u) r0
            X.4wE r3 = r0.A04
            r2 = 1
            r1 = 10
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r0.<init>(r15, r2, r1, r2)
            goto L_0x0822
        L_0x07dd:
            if (r9 == 0) goto L_0x07fe
            com.instagram.service.session.UserSession r13 = r12.A02
            java.lang.Integer r14 = X.AnonymousClass006.A0g
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "missing_fields"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r20 = X.AnonymousClass4WK.A0O(r0)
            r21 = 1008(0x3f0, float:1.413E-42)
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            X.C62873b3.A03(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x07fe:
            X.4wE r3 = r12.A04
            r2 = 2
            r1 = 10
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r0.<init>(r5, r2, r1, r4)
            r3.CrC(r0)
            X.4wE r3 = r12.A03
            boolean r0 = X.C18250wR.A1K(r5)
            if (r0 == 0) goto L_0x081e
            android.content.SharedPreferences r1 = r12.A00
            java.lang.String r0 = "has_user_seen_project_board"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x081e
            r4 = 1
        L_0x081e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x0822:
            r3.CrC(r0)
            return
        L_0x0826:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0838
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r1 = r5.A01
            if (r1 == 0) goto L_0x0838
            java.lang.Object r0 = r0.A00
            X.4rU r0 = (X.C83504rU) r0
            r0.onSuccess()
            return
        L_0x0838:
            java.lang.Object r0 = r0.A00
            X.4rU r0 = (X.C83504rU) r0
            r0.Bxq()
            return
        L_0x0840:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x08eb
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r5)
            java.lang.Object r4 = r0.A00
            X.3HK r4 = (X.AnonymousClass3HK) r4
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            if (r2 == 0) goto L_0x08d6
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICQueryResponseImpl$FxAic> r1 = com.instagram.graphql.instagramschemagraphservices.FXAICQueryResponseImpl.FxAic.class
            java.lang.String r0 = "fx_aic(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],family_device_id:$family_device_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x08d6
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.FXAICQueryResponseImpl$FxAic$Accounts> r1 = com.instagram.graphql.instagramschemagraphservices.FXAICQueryResponseImpl.FxAic.Accounts.class
            java.lang.String r0 = "accounts"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x08d6
        L_0x0866:
            java.util.Iterator r7 = r0.iterator()
        L_0x086a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x08de
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r7)
            X.20K r6 = X.AnonymousClass20K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r5 = "account_type"
            java.lang.Enum r0 = r2.getEnumValue(r5, r6)
            X.20K r0 = (X.AnonymousClass20K) r0
            if (r0 == 0) goto L_0x086a
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x088b
            r0 = 3
            if (r1 == r0) goto L_0x088b
            goto L_0x086a
        L_0x088b:
            java.lang.String r1 = "id"
            java.lang.String r0 = r2.getStringValue(r1)
            if (r0 == 0) goto L_0x086a
            java.lang.String r10 = r2.getStringValue(r1)
            if (r10 == 0) goto L_0x08d9
            java.lang.Enum r0 = r2.getEnumValue(r5, r6)
            X.20K r0 = (X.AnonymousClass20K) r0
            if (r0 == 0) goto L_0x08a7
            java.lang.String r12 = r0.name()
            if (r12 != 0) goto L_0x08a9
        L_0x08a7:
            java.lang.String r12 = ""
        L_0x08a9:
            java.lang.String r13 = X.C18220wO.A0l(r2)
            java.lang.String r15 = X.C61993Wq.A01(r2)
            java.lang.String r0 = "profile_picture_url"
            java.lang.String r14 = r2.getStringValue(r0)
            java.lang.String r0 = "obfuscated_id"
            java.lang.String r16 = r2.getStringValue(r0)
            java.lang.String r1 = "badge_count"
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L_0x08d4
            int r9 = r2.getIntValue(r1)
        L_0x08c9:
            java.lang.String r11 = ""
            fxcache.model.FxCalAccount r8 = new fxcache.model.FxCalAccount
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r8)
            goto L_0x086a
        L_0x08d4:
            r9 = 0
            goto L_0x08c9
        L_0x08d6:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            goto L_0x0866
        L_0x08d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x08de:
            long r1 = java.lang.System.currentTimeMillis()
            fxcache.model.FxCalAccountLinkageInfo r0 = new fxcache.model.FxCalAccountLinkageInfo
            r0.<init>(r3, r1)
            r4.A00(r0)
            return
        L_0x08eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x08f0:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x0923
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r5)
            if (r2 == 0) goto L_0x0923
            java.lang.String r1 = "fx_compare_ob_id(obfuscated_id_1:$obfuscated_id_1,obfuscated_id_2:$obfuscated_id_2,uig_caller_name:$caller_name)"
            boolean r6 = r2.getBooleanValue(r1)
            java.lang.Object r5 = r0.A00
            X.3BQ r5 = (X.AnonymousClass3BQ) r5
            X.49B r0 = r5.A02
            X.49V r4 = r0.A00
            java.lang.String r3 = r5.A03
            com.facebook.common.callercontext.CallerContext r0 = r5.A00
            java.lang.String r1 = r0.A02
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "caller_class"
            java.util.HashMap r2 = X.C63203gz.A03(r0, r1)
            java.lang.String r1 = "compare_obid_fetch_success"
            r0 = 0
            r4.A04(r1, r3, r0, r2)
            com.instagram.debug.devoptions.FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1 r0 = r5.A01
            r0.onSuccess(r6)
            return
        L_0x0923:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0928:
            X.8gY r5 = (X.C143338gY) r5
            X.3AF r4 = new X.3AF
            r4.<init>()
            if (r5 == 0) goto L_0x0991
            com.facebook.pando.TreeJNI r7 = X.C685344e.A03(r5)
            if (r7 == 0) goto L_0x0953
            java.lang.Class<com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl$FxGrowth> r2 = com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl.FxGrowth.class
            java.lang.String r1 = "fx_growth"
            com.facebook.pando.TreeJNI r3 = r7.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x0953
            java.lang.Class<com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl$FxGrowth$AcUpsellEligibilityConfig> r2 = com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl.FxGrowth.AcUpsellEligibilityConfig.class
            java.lang.String r1 = "ac_upsell_eligibility_config(entry_point:$entry_point,holdout_type:$holdout_type,impression_limit_check_enabled:$impression_limit_check_enabled,native_token:$native_token,recently_seen_check_enabled:$recently_seen_check_enabled,target_account_type:$target_account_type,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0953
            java.lang.String r1 = "is_eligibile"
            boolean r1 = r2.getBooleanValue(r1)
            r4.A02 = r1
        L_0x0953:
            if (r7 == 0) goto L_0x0991
            java.lang.Class<com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl$FxGrowth> r6 = com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl.FxGrowth.class
            java.lang.String r5 = "fx_growth"
            com.facebook.pando.TreeJNI r3 = r7.getTreeValue(r5, r6)
            if (r3 == 0) goto L_0x0977
            java.lang.Class<com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl$FxGrowth$AcUpsellEligibilityConfig> r2 = com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl.FxGrowth.AcUpsellEligibilityConfig.class
            java.lang.String r1 = "ac_upsell_eligibility_config(entry_point:$entry_point,holdout_type:$holdout_type,impression_limit_check_enabled:$impression_limit_check_enabled,native_token:$native_token,recently_seen_check_enabled:$recently_seen_check_enabled,target_account_type:$target_account_type,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x0977
            X.215 r2 = X.AnonymousClass215.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "linking_scenario"
            java.lang.Enum r1 = r3.getEnumValue(r1, r2)
            X.215 r1 = (X.AnonymousClass215) r1
            if (r1 == 0) goto L_0x0977
            r4.A00 = r1
        L_0x0977:
            com.facebook.pando.TreeJNI r3 = r7.getTreeValue(r5, r6)
            if (r3 == 0) goto L_0x0991
            java.lang.Class<com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl$FxGrowth$AcUpsellEligibilityConfig> r2 = com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl.FxGrowth.AcUpsellEligibilityConfig.class
            java.lang.String r1 = "ac_upsell_eligibility_config(entry_point:$entry_point,holdout_type:$holdout_type,impression_limit_check_enabled:$impression_limit_check_enabled,native_token:$native_token,recently_seen_check_enabled:$recently_seen_check_enabled,target_account_type:$target_account_type,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0991
            java.lang.String r1 = "target_account_name"
            java.lang.String r1 = r2.getStringValue(r1)
            if (r1 == 0) goto L_0x0991
            r4.A01 = r1
        L_0x0991:
            java.lang.Object r0 = r0.A00
            X.4pu r0 = (X.C82564pu) r0
            r0.Bym(r4)
            return
        L_0x0999:
            X.8gY r5 = (X.C143338gY) r5
            if (r5 == 0) goto L_0x09ad
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            java.lang.Object r1 = r5.A01
            if (r1 == 0) goto L_0x09ad
            java.lang.Object r0 = r0.A00
            X.4s4 r0 = (X.C83834s4) r0
            com.instagram.share.facebook.graphql.UpdateAutoCrossPostingSettingMutationResponseImpl r1 = (com.instagram.share.facebook.graphql.UpdateAutoCrossPostingSettingMutationResponseImpl) r1
            r0.CNE(r1)
            return
        L_0x09ad:
            java.lang.Object r0 = r0.A00
            X.4s4 r0 = (X.C83834s4) r0
            r0.Bxq()
            return
        L_0x09b5:
            r13 = r10
            goto L_0x09c6
        L_0x09b7:
            java.util.List r1 = X.AnonymousClass00J.A0N(r3)
            java.util.List r1 = X.AnonymousClass00J.A0K(r1)
            if (r5 == 0) goto L_0x09b5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r13 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r13.<init>((java.lang.String) r5, (java.util.List) r1, (java.util.List) r10)
        L_0x09c6:
            java.lang.String r1 = "future_post_audience"
            java.lang.String r17 = r4.getStringValue(r1)
            java.lang.String r1 = "footer"
            java.lang.String r18 = r4.getStringValue(r1)
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$Description> r2 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.Description.class
            java.lang.String r1 = "description"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r4, r2, r1)
            r4 = 10
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r1, r4)
            java.util.Iterator r12 = r1.iterator()
        L_0x09e4:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0a83
            com.facebook.pando.TreeJNI r6 = X.C18210wN.A0G(r12)
            r3 = 0
            if (r6 == 0) goto L_0x0a7b
            java.lang.String r1 = "text"
            java.lang.String r2 = r6.getStringValue(r1)
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$Description$InlineStyleRanges> r5 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.Description.InlineStyleRanges.class
            java.lang.String r1 = "inline_style_ranges"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r6, r5, r1)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r1, r4)
            java.util.Iterator r7 = r1.iterator()
        L_0x0a07:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0a15
            X.16s r1 = X.C18190wL.A0V(r7)
            r5.add(r1)
            goto L_0x0a07
        L_0x0a15:
            java.util.List r1 = X.AnonymousClass00J.A0N(r5)
            java.util.List r8 = X.AnonymousClass00J.A0K(r1)
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$Description$Ranges> r5 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.Description.Ranges.class
            java.lang.String r1 = "ranges"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r6, r5, r1)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r1, r4)
            java.util.Iterator r11 = r1.iterator()
        L_0x0a2d:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0a6c
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r11)
            r20 = 0
            if (r1 == 0) goto L_0x0a6a
            java.lang.String r5 = "offset"
            boolean r23 = r1.hasFieldValue(r5)
            int r21 = r1.getIntValue(r5)
            java.lang.String r5 = "length"
            boolean r24 = r1.hasFieldValue(r5)
            int r22 = r1.getIntValue(r5)
            java.lang.Class<com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl$XcxpGetFeedCrosspostingAudienceConsentContent$Description$Ranges$Entity> r6 = com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl.XcxpGetFeedCrosspostingAudienceConsentContent.Description.Ranges.Entity.class
            java.lang.String r5 = "entity"
            com.facebook.pando.TreeJNI r1 = r1.getTreeValue(r5, r6)
            if (r1 == 0) goto L_0x0a5f
            java.lang.String r5 = "url"
            java.lang.String r20 = r1.getStringValue(r5)
        L_0x0a5f:
            X.16o r1 = new X.16o
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24)
        L_0x0a66:
            r7.add(r1)
            goto L_0x0a2d
        L_0x0a6a:
            r1 = r10
            goto L_0x0a66
        L_0x0a6c:
            java.util.List r1 = X.AnonymousClass00J.A0N(r7)
            java.util.List r1 = X.AnonymousClass00J.A0K(r1)
            if (r2 == 0) goto L_0x0a7b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r3.<init>((java.lang.String) r2, (java.util.List) r8, (java.util.List) r1)
        L_0x0a7b:
            r9.add(r3)
            goto L_0x09e4
        L_0x0a80:
            r12 = r16
            goto L_0x0a90
        L_0x0a83:
            java.util.List r1 = X.AnonymousClass00J.A0N(r9)
            java.util.List r19 = X.AnonymousClass00J.A0K(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2 r12 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
        L_0x0a90:
            java.lang.Object r0 = r0.A00
            X.34A r0 = (X.AnonymousClass34A) r0
            X.29v r2 = X.C320129v.DEFAULT_PRIVACY_BOTTOMSHEET_FETCH_SUCCESS
            X.49i r1 = r0.A00
            com.instagram.service.session.UserSession r0 = r1.A05
            X.C59693Lv.A00(r2, r0)
            monitor-enter(r1)
            r1.A01 = r12     // Catch:{ all -> 0x0aa2 }
            monitor-exit(r1)
            return
        L_0x0aa2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0aa5:
            X.21l r0 = X.C304721l.LOADED
            r2.updateUi(r0, r1)
            return
        L_0x0aab:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0ab0:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r5.iterator()
        L_0x0ab8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0acc
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r4.A0A
            boolean r0 = r0.contains(r1)
            X.C18240wQ.A1N(r1, r3, r0)
            goto L_0x0ab8
        L_0x0acc:
            java.util.Iterator r2 = r3.iterator()
        L_0x0ad0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ae0
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r4.A0A
            r0.add(r1)
            goto L_0x0ad0
        L_0x0ae0:
            X.8wA r2 = r4.A01
            if (r2 != 0) goto L_0x0aeb
            java.lang.String r0 = "recyclerViewAdapter"
        L_0x0ae6:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0aeb:
            X.3I1 r1 = new X.3I1
            r1.<init>()
            java.util.List r0 = r4.A0A
            java.util.List r0 = X.AnonymousClass00J.A0N(r0)
            r1.A02(r0)
            r2.A04(r1)
            android.view.View r1 = r4.A00
            if (r1 != 0) goto L_0x0b03
            java.lang.String r0 = "splashScreen"
            goto L_0x0ae6
        L_0x0b03:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0b09:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0b0e:
            java.lang.Object r0 = r0.A00
            X.3SW r0 = (X.AnonymousClass3SW) r0
            X.AnonymousClass3SW.A00(r0, r6)
            return
        L_0x0b16:
            java.lang.String r0 = "quietTimeSettings"
            goto L_0x0b1e
        L_0x0b19:
            java.lang.String r0 = "data"
            goto L_0x0b1e
        L_0x0b1c:
            java.lang.String r0 = "screenTimeSettings"
        L_0x0b1e:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCallbackShape313S0100000_1_I2.onSuccess(java.lang.Object):void");
    }
}

package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape70S0100000_I2_50 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape70S0100000_I2_50(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0157, code lost:
        if (X.C62913b8.A02(r5.A09()) != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0187, code lost:
        if (X.C62913b8.A02(X.AnonymousClass0wJ.A0X(r1)) != false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0029;
                case 2: goto L_0x0032;
                case 3: goto L_0x003d;
                case 4: goto L_0x004d;
                case 5: goto L_0x0060;
                case 6: goto L_0x006f;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0082;
                case 12: goto L_0x0020;
                case 13: goto L_0x0029;
                case 14: goto L_0x0085;
                case 15: goto L_0x0099;
                case 16: goto L_0x00a6;
                case 17: goto L_0x0005;
                case 18: goto L_0x00b3;
                case 19: goto L_0x00c2;
                case 20: goto L_0x0082;
                case 21: goto L_0x0020;
                case 22: goto L_0x0029;
                case 23: goto L_0x00ef;
                case 24: goto L_0x0127;
                case 25: goto L_0x012e;
                case 26: goto L_0x000d;
                case 27: goto L_0x0160;
                case 28: goto L_0x0190;
                case 29: goto L_0x0127;
                case 30: goto L_0x01a5;
                case 31: goto L_0x01b4;
                case 32: goto L_0x0005;
                case 33: goto L_0x0082;
                case 34: goto L_0x0020;
                case 35: goto L_0x0029;
                case 36: goto L_0x01d1;
                case 37: goto L_0x01ef;
                case 38: goto L_0x01f9;
                case 39: goto L_0x0220;
                case 40: goto L_0x0247;
                case 41: goto L_0x0285;
                case 42: goto L_0x0291;
                case 43: goto L_0x02b6;
                case 44: goto L_0x02c0;
                case 45: goto L_0x02cd;
                case 46: goto L_0x02da;
                case 47: goto L_0x02f1;
                case 48: goto L_0x02fd;
                case 49: goto L_0x0309;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.4tk[] r0 = (X.C84714tk[]) r0
            int r0 = r0.length
            java.lang.Object[] r3 = new java.lang.Object[r0]
        L_0x000c:
            return r3
        L_0x000d:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "ARGUMENT_ENTRY_POINT"
            java.lang.String r3 = r1.getString(r0)
            if (r3 != 0) goto L_0x000c
        L_0x001d:
            java.lang.String r3 = "UNKNOWN"
            return r3
        L_0x0020:
            java.lang.Object r0 = r10.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x0029:
            java.lang.Object r0 = r10.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r3 = X.C18180wK.A0H(r0)
            return r3
        L_0x0032:
            X.0RG r1 = X.AnonymousClass0RA.A0C
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.service.session.UserSession r3 = X.C18180wK.A0W(r0, r1)
            return r3
        L_0x003d:
            java.lang.Object r0 = r10.A00
            X.1ds r0 = (X.C23451ds) r0
            X.0Oa r0 = r0.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3xe r3 = new X.3xe
            r3.<init>(r0)
            return r3
        L_0x004d:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.fanclub.api.FanClubApi r1 = new com.instagram.fanclub.api.FanClubApi
            r1.<init>(r0)
            java.lang.String r0 = r0.getUserId()
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r3 = new com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository
            r3.<init>(r1, r0)
            return r3
        L_0x0060:
            java.lang.Object r1 = r10.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            com.instagram.fanclub.api.FanClubApi r0 = new com.instagram.fanclub.api.FanClubApi
            r0.<init>(r1)
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r3 = new com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository
            r3.<init>(r0, r1)
            return r3
        L_0x006f:
            java.lang.Object r2 = r10.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            com.instagram.fanclub.api.FanClubApi r1 = new com.instagram.fanclub.api.FanClubApi
            r1.<init>(r2)
            java.lang.String r0 = r2.getUserId()
            com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository r3 = new com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository
            r3.<init>(r1, r2, r0)
            return r3
        L_0x0082:
            java.lang.Object r3 = r10.A00
            return r3
        L_0x0085:
            java.lang.Object r0 = r10.A00
            X.CUJ r0 = (X.CUJ) r0
            android.app.Application r1 = X.C18190wL.A09(r0)
            X.0Oa r0 = r0.A09
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.10j r3 = new X.10j
            r3.<init>(r1, r0)
            return r3
        L_0x0099:
            java.lang.Object r0 = r10.A00
            com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl r0 = (com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl) r0
            com.instagram.service.session.UserSession r1 = r0.A03
            X.0kW r0 = r0.A00
            X.0nS r3 = X.C13330nS.A01(r0, r1)
            return r3
        L_0x00a6:
            java.lang.Object r0 = r10.A00
            X.0zZ r0 = (X.C19260zZ) r0
            com.instagram.service.session.UserSession r1 = r0.A02
            X.0rm r0 = X.C19260zZ.A0A
            X.0nS r3 = X.C13330nS.A01(r0, r1)
            return r3
        L_0x00b3:
            java.lang.Object r1 = r10.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            com.instagram.fanclub.api.FanClubApi r0 = new com.instagram.fanclub.api.FanClubApi
            r0.<init>(r1)
            X.48w r3 = new X.48w
            r3.<init>(r0)
            return r3
        L_0x00c2:
            java.lang.Object r0 = r10.A00
            android.content.Context r1 = X.C18220wO.A0A(r0)
            r0 = 2131232211(0x7f0805d3, float:1.8080525E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            if (r3 == 0) goto L_0x00ea
            r3.mutate()
            r0 = 2131099963(0x7f06013b, float:1.7812294E38)
            X.C63393hP.A03(r1, r3, r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165275(0x7f07005b, float:1.7944763E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r3.setBounds(r0, r0, r1, r1)
            return r3
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00ef:
            java.lang.Object r2 = r10.A00
            X.1c1 r2 = (X.AnonymousClass1c1) r2
            X.0Oa r0 = r2.A04
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ARG_IS_FOR_PROMO_VIDEO"
            boolean r5 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ARG_IS_FOR_WELCOME_VIDEO"
            boolean r6 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ARG_IS_FOR_ONBOARDING"
            boolean r7 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "is_from_megaphone"
            boolean r8 = r1.getBoolean(r0)
            X.3xs r3 = new X.3xs
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0127:
            java.lang.Object r0 = r10.A00
            X.06B r3 = X.C18230wP.A0K(r0)
            return r3
        L_0x012e:
            java.lang.Object r5 = r10.A00
            X.5xM r5 = (X.AnonymousClass5xM) r5
            android.app.Application r4 = X.C18190wL.A09(r5)
            com.instagram.service.session.UserSession r7 = r5.A09()
            androidx.fragment.app.FragmentActivity r6 = r5.requireActivity()
            X.0Oa r0 = r5.A05
            java.lang.String r8 = X.C18200wM.A0q(r0)
            com.instagram.service.session.UserSession r0 = r5.A09()
            boolean r0 = X.C62913b8.A04(r0)
            if (r0 != 0) goto L_0x0159
            com.instagram.service.session.UserSession r0 = r5.A09()
            boolean r0 = X.C62913b8.A02(r0)
            r9 = 0
            if (r0 == 0) goto L_0x015a
        L_0x0159:
            r9 = 1
        L_0x015a:
            X.10k r3 = new X.10k
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x0160:
            java.lang.Object r4 = r10.A00
            X.1Zi r4 = (X.C22751Zi) r4
            X.0Oa r1 = r4.A04
            com.instagram.service.session.UserSession r6 = X.AnonymousClass0wJ.A0X(r1)
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            X.0Oa r0 = r4.A01
            java.lang.String r7 = X.C18200wM.A0q(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r1)
            boolean r0 = X.C62913b8.A04(r0)
            if (r0 != 0) goto L_0x0189
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r1)
            boolean r0 = X.C62913b8.A02(r0)
            r8 = 0
            if (r0 == 0) goto L_0x018a
        L_0x0189:
            r8 = 1
        L_0x018a:
            X.3xt r3 = new X.3xt
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0190:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01a3
            java.lang.String r0 = "should_fetch_settings_recommendations"
            boolean r0 = r1.getBoolean(r0)
        L_0x019e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x01a3:
            r0 = 1
            goto L_0x019e
        L_0x01a5:
            java.lang.Object r1 = r10.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            com.instagram.fanclub.api.FanClubApi r0 = new com.instagram.fanclub.api.FanClubApi
            r0.<init>(r1)
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r3 = new com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository
            r3.<init>(r0)
            return r3
        L_0x01b4:
            java.lang.Object r0 = r10.A00
            X.0zX r0 = (X.C19240zX) r0
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r0 = r0.A02
            X.6ew r0 = r0.A03
            android.content.SharedPreferences r5 = r0.A00
            java.lang.String r4 = "product_settings_promo_video_tooltip_count"
            long r2 = X.C18180wK.A05(r5, r4)
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r5.edit()
            X.AnonymousClass0wJ.A12(r0, r4, r2)
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x01d1:
            java.lang.Object r3 = r10.A00
            X.1YB r3 = (X.AnonymousClass1YB) r3
            X.0Oa r0 = r3.A02
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r3.A00
            java.lang.String r1 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            X.3xf r3 = new X.3xf
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01ef:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.37w r3 = new X.37w
            r3.<init>(r0)
            return r3
        L_0x01f9:
            java.lang.Object r0 = r10.A00
            X.7HK r0 = (X.AnonymousClass7HK) r0
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878685147496614(0x8304f8000000a6, double:3.385567213598069E-306)
            java.lang.String r1 = X.C63803iN.A0C(r2, r3, r0)
            java.lang.String r0 = "\""
            java.lang.String r3 = ""
            r2 = 0
            java.lang.String r1 = X.AnonymousClass8bQ.A0l(r1, r0, r3, r2)
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass8bQ.A0l(r1, r0, r3, r2)
            java.lang.String r0 = ","
            java.util.List r3 = X.C81074n3.A07(r1, r0, r2)
            return r3
        L_0x0220:
            java.lang.Object r0 = r10.A00
            X.7HK r0 = (X.AnonymousClass7HK) r0
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878685147562151(0x8304f8000100a7, double:3.385567213639515E-306)
            java.lang.String r1 = X.C63803iN.A0C(r2, r3, r0)
            java.lang.String r0 = "\""
            java.lang.String r3 = ""
            r2 = 0
            java.lang.String r1 = X.AnonymousClass8bQ.A0l(r1, r0, r3, r2)
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass8bQ.A0l(r1, r0, r3, r2)
            java.lang.String r0 = ","
            java.util.List r3 = X.C81074n3.A07(r1, r0, r2)
            return r3
        L_0x0247:
            java.lang.Object r2 = r10.A00
            X.3TB r2 = (X.AnonymousClass3TB) r2
            X.0Oa r0 = r2.A02
            java.lang.Object r1 = r0.getValue()
            X.4U9 r1 = (X.AnonymousClass4U9) r1
            X.0Oa r0 = r2.A04
            java.lang.Object r4 = r0.getValue()
            X.4UB r4 = (X.AnonymousClass4UB) r4
            X.0Oa r0 = r2.A03
            java.lang.Object r3 = r0.getValue()
            X.4UA r3 = (X.AnonymousClass4UA) r3
            X.AnonymousClass0wJ.A1O(r1, r4)
            r0 = 3
            X.C04220Ms.A0B(r3, r0)
            X.0Oe r1 = X.AnonymousClass4UJ.A00(r1)
            X.4U7 r0 = new X.4U7
            r0.<init>(r1)
            X.0Oe r2 = X.AnonymousClass4UJ.A00(r0)
            X.0Oe r1 = X.AnonymousClass4UJ.A00(r4)
            X.0Oe r0 = X.AnonymousClass4UJ.A00(r3)
            X.39V r3 = new X.39V
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0285:
            java.lang.Object r0 = r10.A00
            X.3TB r0 = (X.AnonymousClass3TB) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            X.4U9 r3 = new X.4U9
            r3.<init>(r0)
            return r3
        L_0x0291:
            java.lang.Object r1 = r10.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.34a r6 = new X.34a
            r6.<init>(r1)
            java.lang.String r0 = "IAB_AUTOFILL"
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r7 = new com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI
            r7.<init>(r1, r0)
            X.7Gw r8 = new X.7Gw
            r8.<init>(r1)
            X.34Z r5 = new X.34Z
            r5.<init>(r1)
            X.6nu r4 = new X.6nu
            r4.<init>()
            X.6mq r3 = new X.6mq
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x02b6:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.75L r3 = new X.75L
            r3.<init>(r0)
            return r3
        L_0x02c0:
            java.lang.Object r0 = r10.A00
            X.Luu r0 = (X.C41030Luu) r0
            int r0 = r0.getItemCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x02cd:
            java.lang.Object r0 = r10.A00
            X.Idy r0 = (X.C34727Idy) r0
            int r0 = r0.getViewCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x02da:
            java.lang.Object r3 = r10.A00
            X.9bM r3 = (X.C160019bM) r3
            X.AcW r2 = r3.A09
            X.C2o r0 = r3.A06
            java.lang.String r1 = X.C18230wP.A0n(r0)
            r0 = 45
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r0 = X.C18250wR.A0g(r3, r0)
            X.IgH r3 = r2.A00(r1, r0)
            return r3
        L_0x02f1:
            java.lang.Object r0 = r10.A00
            X.Aee r0 = (X.C18390Aee) r0
            com.instagram.service.session.UserSession r0 = r0.A02
            X.Ac1 r3 = new X.Ac1
            r3.<init>(r0)
            return r3
        L_0x02fd:
            java.lang.Object r0 = r10.A00
            X.Aee r0 = (X.C18390Aee) r0
            com.instagram.service.session.UserSession r0 = r0.A02
            X.AcU r3 = new X.AcU
            r3.<init>(r0)
            return r3
        L_0x0309:
            java.lang.Object r0 = r10.A00
            X.Aee r0 = (X.C18390Aee) r0
            com.instagram.service.session.UserSession r0 = r0.A02
            X.Ac8 r3 = new X.Ac8
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50.invoke():java.lang.Object");
    }
}

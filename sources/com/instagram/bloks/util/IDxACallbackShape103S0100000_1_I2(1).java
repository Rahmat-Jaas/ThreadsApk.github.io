package com.instagram.bloks.util;

import X.AnonymousClass1eT;
import X.C130667qT;
import X.C25745DrH;
import X.C35189Ipf;
import X.C40322Lcc;
import X.C62743ad;

public class IDxACallbackShape103S0100000_1_I2 extends AnonymousClass1eT {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape103S0100000_1_I2(C130667qT r2, int i) {
        super(false);
        this.A01 = i;
        this.A00 = r2;
    }

    public final void A01() {
        if (18 - this.A01 == 0) {
            C62743ad r1 = (C62743ad) this.A00;
            r1.A01 = true;
            r1.A02 = false;
        }
    }

    public final void A02() {
        C25745DrH drH;
        if (18 - this.A01 == 0) {
            C62743ad r1 = (C62743ad) this.A00;
            C62743ad.A00(C40322Lcc.FETCHING_START, r1);
            if (!r1.A02 && (drH = r1.A07) != null && !((C35189Ipf) drH).A0M) {
                r1.A02 = true;
                C62743ad.A02(r1);
            }
            r1.A08.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        X.C62973bE.A02(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        X.C63813iO.A03(r3, r2, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass3XX r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0005;
                case 2: goto L_0x00c5;
                case 3: goto L_0x0005;
                case 4: goto L_0x0034;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00e4;
                case 7: goto L_0x010d;
                case 8: goto L_0x0005;
                case 9: goto L_0x011b;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0142;
                case 19: goto L_0x0167;
                case 20: goto L_0x0006;
                case 21: goto L_0x0175;
                case 22: goto L_0x00b1;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            X.1uf r0 = (X.C28591uf) r0
            com.instagram.base.activity.IgFragmentActivity r0 = r0.A00
            goto L_0x00c1
        L_0x0012:
            r5 = 0
            X.C04220Ms.A0B(r8, r5)
            java.lang.Object r0 = r7.A00
            X.39y r0 = (X.C571539y) r0
            java.lang.Throwable r4 = r8.A01
            java.lang.String r1 = "Bloks Async Action Request Failed - "
            X.3Fe r3 = r0.A01
            java.lang.String r0 = r3.A03
            java.lang.String r2 = X.AnonymousClass00U.A0L(r1, r0)
            r1 = 0
            java.lang.String r0 = "BKAsyncActionInvoker"
            X.C30967GcS.A01(r1, r0, r2, r4, r5)
            X.4rQ r0 = r3.A00
            if (r0 == 0) goto L_0x0005
            r0.onFailure(r4)
            return
        L_0x0034:
            r3 = 0
            X.C04220Ms.A0B(r8, r3)
            java.lang.Object r4 = r7.A00
            X.3A8 r4 = (X.AnonymousClass3A8) r4
            androidx.fragment.app.FragmentActivity r2 = r4.A00
            java.lang.String r1 = "something_went_wrong"
            r5 = 0
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A03(r2, r1, r0, r3)
            com.instagram.service.session.UserSession r1 = r4.A02
            X.0kW r0 = r4.A01
            java.lang.String r6 = "igd_android_qp"
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "hidden_words_opening_bottom_sheet"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 712(0x2c8, float:9.98E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0005
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r8.A00
            X.4vo r1 = (X.C85814vo) r1
            r2 = 0
            if (r1 == 0) goto L_0x0097
            int r0 = r1.getStatusCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = r1.getErrorMessage()
        L_0x007a:
            java.lang.String r0 = "surface_type"
            r4.A0T(r0, r6)
            if (r3 == 0) goto L_0x0089
            int r0 = r3.intValue()
            java.lang.Long r2 = X.C18230wP.A0f(r0)
        L_0x0089:
            java.lang.String r0 = "error_code"
            r4.A0S(r0, r2)
            java.lang.String r0 = "error_info"
            r4.A0T(r0, r5)
            r4.Bb4()
            return
        L_0x0097:
            java.lang.Throwable r1 = r8.A01
            if (r1 == 0) goto L_0x007a
            boolean r0 = r1 instanceof X.AnonymousClass665
            if (r0 == 0) goto L_0x00aa
            r0 = r1
            X.665 r0 = (X.AnonymousClass665) r0
            if (r0 == 0) goto L_0x00af
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00aa:
            java.lang.String r5 = r1.getMessage()
            goto L_0x007a
        L_0x00af:
            r3 = r5
            goto L_0x00aa
        L_0x00b1:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            X.1uU r0 = (X.C28511uU) r0
            X.IcN r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0005
        L_0x00c1:
            X.C62973bE.A02(r0, r8)
            return
        L_0x00c5:
            java.lang.Object r0 = r7.A00
            android.content.Context r3 = X.C18240wQ.A0C(r0)
            r2 = 0
            r1 = 2131822639(0x7f11082f, float:1.9278055E38)
            goto L_0x00df
        L_0x00d0:
            java.lang.Object r0 = r7.A00
            X.4CE r0 = (X.AnonymousClass4CE) r0
            androidx.fragment.app.Fragment r0 = r0.A00
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            java.lang.String r2 = "add_yours_participation_screen_error_loading"
            r1 = 2131821168(0x7f110270, float:1.9275072E38)
        L_0x00df:
            r0 = 0
            X.C63813iO.A03(r3, r2, r1, r0)
            return
        L_0x00e4:
            java.lang.Object r4 = r7.A00
            X.1qA r4 = (X.C26171qA) r4
            com.instagram.service.session.UserSession r3 = r4.A00
            java.lang.String r2 = r4.A01
            boolean r0 = r4 instanceof X.C26161q9
            if (r0 == 0) goto L_0x00f9
            X.AnonymousClass0wJ.A1N(r3, r2)
            X.2AF r1 = X.AnonymousClass2AF.A0c
            r0 = 0
            X.C63003bJ.A00(r1, r3, r2, r0)
        L_0x00f9:
            X.3Gl r1 = X.C35682Ok.A00()
            android.view.Window r0 = r4.A00
            r1.A01(r0)
            X.Ayd r0 = r4.A01
            android.view.View r1 = r0.A08()
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x010d:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            android.content.Context r0 = X.C18220wO.A0A(r0)
            X.C62973bE.A01(r0)
            return
        L_0x011b:
            java.lang.Object r0 = r7.A00
            X.44T r0 = (X.AnonymousClass44T) r0
            android.content.Context r3 = r0.A00
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            java.lang.String r2 = r3.getString(r0)
            r1 = 0
            java.lang.String r0 = "save_to_creator_list_failed"
            X.C63813iO.A02(r3, r2, r0, r1)
            java.lang.Throwable r3 = r8.A01
            boolean r2 = X.AnonymousClass0wJ.A1W(r3)
            java.lang.String r1 = "Error in fetching bloks BC Creators AddToList bottom sheet"
            java.lang.String r0 = "BrandedContentAddToList"
            if (r2 == 0) goto L_0x013e
            X.C10450iM.A06(r0, r1, r3)
            return
        L_0x013e:
            X.C10450iM.A03(r0, r1)
            return
        L_0x0142:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r2 = r7.A00
            X.3ad r2 = (X.C62743ad) r2
            X.DrH r0 = r2.A07
            if (r0 == 0) goto L_0x0155
            X.Ipf r0 = (X.C35189Ipf) r0
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x0155
            return
        L_0x0155:
            X.C62743ad.A01(r8, r2)
            X.3If r1 = r2.A08
            r1.A01()
            androidx.fragment.app.FragmentActivity r0 = r2.A03
            X.C63373hN.A01(r0)
            r0 = 0
            r1.A05(r0)
            return
        L_0x0167:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            X.1ua r0 = (X.C28561ua) r0
            com.instagram.base.activity.IgFragmentActivity r0 = r0.A01
            X.C62973bE.A02(r0, r8)
            return
        L_0x0175:
            java.lang.Throwable r2 = r8.A01
            java.lang.String r1 = "MarkFeedPostSensitive"
            java.lang.String r0 = "Unable to fetch bloks action"
            X.C10450iM.A06(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2.A03(X.3XX):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.1be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.1qA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.1be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.1be} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d7, code lost:
        r1.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1 = (X.C130667qT) r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        X.C33492Fx.A00(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019d, code lost:
        r0 = X.C18220wO.A0T(r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b0, code lost:
        r0 = X.C18230wP.A0S(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01bd, code lost:
        X.C33492Fx.A00(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        r1 = X.C18220wO.A0T(r1, r0, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0112;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a2;
                case 3: goto L_0x0188;
                case 4: goto L_0x00dc;
                case 5: goto L_0x0175;
                case 6: goto L_0x014a;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00a9;
                case 9: goto L_0x0099;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0095;
                case 13: goto L_0x0095;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0089;
                case 18: goto L_0x0046;
                case 19: goto L_0x0032;
                case 20: goto L_0x0023;
                case 21: goto L_0x0141;
                case 22: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.3St r9 = X.C61733Vd.A00(r9)
        L_0x0009:
            java.lang.Object r1 = r8.A00
            X.7qT r1 = (X.C130667qT) r1
        L_0x000d:
            X.C33492Fx.A00(r1, r9)
        L_0x0010:
            return
        L_0x0011:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r0 = r8.A00
            X.1uU r0 = (X.C28511uU) r0
            X.0i6 r1 = r0.A01
            X.IcN r0 = r0.A00
            X.7qT r1 = X.C18230wP.A0S(r0, r1)
            goto L_0x00d7
        L_0x0023:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r0 = r8.A00
            X.1uf r0 = (X.C28591uf) r0
            X.0i6 r2 = r0.A01
            com.instagram.base.activity.IgFragmentActivity r1 = r0.A00
            X.44S r0 = X.AnonymousClass44S.A00
            goto L_0x0040
        L_0x0032:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r0 = r8.A00
            X.1ua r0 = (X.C28561ua) r0
            X.0bf r2 = r0.A02
            com.instagram.base.activity.IgFragmentActivity r1 = r0.A01
            X.44R r0 = X.AnonymousClass44R.A00
        L_0x0040:
            X.7qT r1 = X.C18220wO.A0T(r1, r0, r2)
            goto L_0x00d7
        L_0x0046:
            X.3St r6 = X.C61733Vd.A00(r9)
            java.lang.Object r7 = r8.A00
            X.3ad r7 = (X.C62743ad) r7
            X.DrH r0 = r7.A07
            if (r0 == 0) goto L_0x0059
            X.Ipf r0 = (X.C35189Ipf) r0
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x0059
            return
        L_0x0059:
            X.Jqm r5 = r7.A00
            if (r5 == 0) goto L_0x0010
            X.Lcc r0 = X.C40322Lcc.FETCHING_DONE
            X.C62743ad.A00(r0, r7)
            X.3If r4 = r7.A08
            r3 = 0
            r4.A04(r3)
            com.instagram.service.session.UserSession r2 = r7.A06
            androidx.fragment.app.FragmentActivity r1 = r7.A03
            X.0kW r0 = r7.A05
            X.7qT r2 = X.C130667qT.A00(r3, r1, r0, r2)
            r0 = 2131297646(0x7f09056e, float:1.8213243E38)
            android.util.SparseArray r1 = r2.A01
            r1.put(r0, r5)
            r0 = 2131302288(0x7f091790, float:1.8222658E38)
            r1.put(r0, r4)
            X.4S0 r0 = new X.4S0
            r0.<init>(r2, r6)
            X.AnonymousClass7J1.A02(r0)
            return
        L_0x0089:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r1 = r8.A00
            X.7qT r1 = (X.C130667qT) r1
            if (r1 == 0) goto L_0x0010
            goto L_0x000d
        L_0x0095:
            X.3St r9 = (X.C61323St) r9
            goto L_0x0009
        L_0x0099:
            X.3St r9 = (X.C61323St) r9
            java.lang.Object r0 = r8.A00
            X.44T r0 = (X.AnonymousClass44T) r0
            com.instagram.service.session.UserSession r1 = r0.A06
            X.IcN r0 = r0.A03
            X.7qT r1 = X.C18230wP.A0S(r0, r1)
            goto L_0x000d
        L_0x00a9:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r1 = r8.A00
            X.5xM r1 = (X.AnonymousClass5xM) r1
            com.instagram.service.session.UserSession r0 = r1.A09()
            X.7qT r1 = X.C18230wP.A0S(r1, r0)
            goto L_0x000d
        L_0x00bb:
            X.3St r9 = X.C61733Vd.A00(r9)
            X.3GW r4 = X.AnonymousClass3GW.A00
            java.lang.Object r3 = r8.A00
            X.1Yw r3 = (X.C22641Yw) r3
            X.0bf r0 = r3.A09
            java.lang.String r2 = "loggedOutSession"
            r1 = 0
            if (r0 == 0) goto L_0x01c1
            r4.A00(r0)
            X.0bf r0 = r3.A09
            if (r0 == 0) goto L_0x01c1
            X.7qT r1 = X.C130667qT.A02(r3, r0, r1)
        L_0x00d7:
            r0 = 1
            r1.A00 = r0
            goto L_0x000d
        L_0x00dc:
            X.3St r2 = X.C61733Vd.A00(r9)
            java.lang.Object r1 = r8.A00
            X.3A8 r1 = (X.AnonymousClass3A8) r1
            com.instagram.service.session.UserSession r3 = r1.A02
            androidx.fragment.app.FragmentActivity r0 = r1.A00
            X.0kW r1 = r1.A01
            X.7qT r0 = X.C18220wO.A0T(r0, r1, r3)
            X.C33492Fx.A00(r0, r2)
            java.lang.String r2 = "igd_android_qp"
            X.0nS r1 = X.C13330nS.A01(r1, r3)
            java.lang.String r0 = "hidden_words_opening_bottom_sheet"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 712(0x2c8, float:9.98E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "surface_type"
            r1.A0T(r0, r2)
            r1.Bb4()
            return
        L_0x0112:
            X.3St r5 = X.C61733Vd.A00(r9)
            java.lang.Object r1 = r8.A00
            X.39y r1 = (X.C571539y) r1
            X.4To r0 = X.AnonymousClass4To.A00()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r0)
            X.3Fe r3 = r1.A01
            java.util.Map r0 = r3.A01
            if (r0 == 0) goto L_0x012c
            r4.putAll(r0)
        L_0x012c:
            android.content.Context r2 = r1.A00
            X.4rP r1 = r1.A02
            X.6jp r0 = r5.A02
            if (r0 == 0) goto L_0x0139
            X.3iY r0 = X.C63893iY.A01
            X.C122047Jt.A02(r2, r5, r1, r0, r4)
        L_0x0139:
            X.4rQ r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            r0.onSuccess()
            return
        L_0x0141:
            X.3St r9 = (X.C61323St) r9
            java.lang.Object r0 = r8.A00
            X.3Bu r0 = (X.C57623Bu) r0
            r0.A01 = r9
            return
        L_0x014a:
            X.3St r9 = (X.C61323St) r9
            java.lang.Object r4 = r8.A00
            X.1qA r4 = (X.C26171qA) r4
            com.instagram.service.session.UserSession r3 = r4.A00
            java.lang.String r2 = r4.A01
            boolean r0 = r4 instanceof X.C26161q9
            if (r0 == 0) goto L_0x0161
            X.AnonymousClass0wJ.A1N(r3, r2)
            X.2AF r1 = X.AnonymousClass2AF.A0e
            r0 = 0
            X.C63003bJ.A00(r1, r3, r2, r0)
        L_0x0161:
            X.Ayd r1 = r4.A01
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0172
            android.view.View r1 = r1.A08()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0172:
            com.instagram.service.session.UserSession r0 = r4.A00
            goto L_0x01b0
        L_0x0175:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r1 = r8.A00
            X.4CE r1 = (X.AnonymousClass4CE) r1
            com.instagram.service.session.UserSession r3 = r1.A02
            androidx.fragment.app.Fragment r0 = r1.A00
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.C2o r0 = r1.A01
            goto L_0x019d
        L_0x0188:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r1 = r8.A00
            X.HAP r1 = (X.HAP) r1
            com.instagram.service.session.UserSession r3 = r1.A08
            android.content.Context r2 = r1.A04
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C04220Ms.A0C(r2, r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.0kW r0 = r1.A05
        L_0x019d:
            X.7qT r0 = X.C18220wO.A0T(r2, r0, r3)
            goto L_0x01bd
        L_0x01a2:
            X.3St r9 = X.C61733Vd.A00(r9)
            java.lang.Object r4 = r8.A00
            X.1be r4 = (X.C22941be) r4
            X.0Oa r0 = r4.A03
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
        L_0x01b0:
            X.7qT r0 = X.C18230wP.A0S(r4, r0)
            goto L_0x01bd
        L_0x01b5:
            X.3St r9 = (X.C61323St) r9
            java.lang.Object r0 = r8.A00
            X.1dF r0 = (X.AnonymousClass1dF) r0
            X.7qT r0 = r0.A00
        L_0x01bd:
            X.C33492Fx.A00(r0, r9)
            return
        L_0x01c1:
            X.C04220Ms.A0E(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2.A04(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape103S0100000_1_I2(Object obj, int i, int i2) {
        super(false);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape103S0100000_1_I2(Object obj, int i) {
        super(false);
        this.A01 = i;
        this.A00 = obj;
    }
}

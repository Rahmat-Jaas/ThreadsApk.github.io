package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass1cj;
import X.C10300i6;
import X.C11630kW;
import X.C13950oZ;
import X.C14020og;
import X.C14030oh;
import X.C15730rn;
import X.C18180wK;
import X.C18250wR;
import X.C18860y1;
import X.C23401dk;
import X.C24671jo;
import X.C26743EUq;
import X.C63873iU;
import android.app.Dialog;
import android.view.View;
import java.util.List;
import java.util.Map;

public class IDxACallbackShape2S1200000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxACallbackShape2S1200000_1_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017e, code lost:
        X.C14030oh.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0181, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d6, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r9) {
        /*
            r8 = this;
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x003d;
                case 2: goto L_0x0031;
                case 3: goto L_0x00c5;
                case 4: goto L_0x0114;
                case 5: goto L_0x0005;
                case 6: goto L_0x014c;
                case 7: goto L_0x006b;
                case 8: goto L_0x0182;
                case 9: goto L_0x01ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onFail(r9)
            return
        L_0x0009:
            r0 = 1186439543(0x46b7a177, float:23504.732)
            int r3 = X.C14030oh.A03(r0)
            X.3VO r2 = X.AnonymousClass3VO.A00()
            r1 = 0
            java.lang.String r0 = "failure"
            r2.A02(r0, r1)
            r1 = 1
            java.lang.String r0 = ""
            X.3iY r2 = X.C63893iY.A05(r2, r0, r1)
            java.lang.Object r1 = r8.A00
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object r0 = r8.A01
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r2, r1)
            r0 = -97498862(0xfffffffffa304912, float:-2.2883157E35)
            goto L_0x01d6
        L_0x0031:
            r0 = -1293841719(0xffffffffb2e18ac9, float:-2.625656E-8)
            int r5 = X.C14030oh.A03(r0)
            r0 = 1021120341(0x3cdd0f55, float:0.02698485)
            goto L_0x017e
        L_0x003d:
            r0 = -1867776680(0xffffffff90abfd58, float:-6.7837945E-29)
            int r5 = X.AnonymousClass0wJ.A00(r0, r9)
            super.onFail(r9)
            java.lang.Object r1 = r8.A00
            X.BKU r1 = (X.BKU) r1
            X.24M r0 = X.AnonymousClass24M.NOT_SHARED
            r1.A3g(r0)
            java.lang.Object r1 = r8.A01
            X.3Yc r1 = (X.C62283Yc) r1
            com.instagram.service.session.UserSession r4 = r1.A04
            monitor-enter(r1)
            java.lang.String r3 = r1.A02     // Catch:{ all -> 0x0068 }
            monitor-exit(r1)
            java.lang.String r2 = r8.A02
            java.lang.String r1 = "failure"
            java.lang.String r0 = "upsell"
            X.AnonymousClass2SK.A00(r4, r1, r0, r3, r2)
            r0 = 2137661555(0x7f6a2073, float:3.1120784E38)
            goto L_0x017e
        L_0x0068:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x006b:
            r0 = 428188216(0x1985a238, float:1.3817397E-23)
            int r3 = X.C14030oh.A03(r0)
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.lang.Object r5 = r9.A00
            r7 = 0
            if (r5 == 0) goto L_0x0098
            r7 = 1
            r0 = r5
            X.8mT r0 = (X.C146578mT) r0
            int r0 = r0.getStatusCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "error code"
            r6.put(r0, r1)
            r0 = r5
            X.4vo r0 = (X.C85814vo) r0
            java.lang.String r1 = r0.getErrorMessage()
            java.lang.String r0 = "exception"
            r6.put(r0, r1)
        L_0x0098:
            java.lang.Object r4 = r8.A01
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.String r2 = r8.A02
            r1 = 1
            java.lang.String r0 = "facebook_auth_error"
            X.C35772Ot.A00(r4, r0, r2, r6, r1)
            if (r7 == 0) goto L_0x00c0
            if (r5 == 0) goto L_0x00c0
            r1 = 409(0x199, float:5.73E-43)
            X.8mT r5 = (X.C146578mT) r5
            int r0 = r5.getStatusCode()
            if (r1 != r0) goto L_0x00c0
            java.lang.Object r0 = r8.A00
            X.2B3 r0 = (X.AnonymousClass2B3) r0
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "mFragment"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x00c0:
            r0 = 404145964(0x1816c72c, float:1.9487602E-24)
            goto L_0x01d6
        L_0x00c5:
            r0 = 587380741(0x2302b805, float:7.086282E-18)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r9.A00
            X.1U7 r4 = (X.AnonymousClass1U7) r4
            java.lang.String r3 = "IgMobileConfigFetcher"
            r2 = 0
            if (r4 != 0) goto L_0x00ee
            java.lang.String r0 = r8.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s request failed, err: null raw response"
            X.AnonymousClass0LU.A0O(r3, r0, r1)
            java.lang.Object r1 = r8.A01
            com.facebook.mobileconfig.MobileConfigFetcherHandler r1 = (com.facebook.mobileconfig.MobileConfigFetcherHandler) r1
            java.lang.String r0 = ""
            r1.onComplete(r2, r0)
            r0 = 1632579257(0x614f2eb9, float:2.3886517E20)
            goto L_0x017e
        L_0x00ee:
            X.GJX r0 = r4.A00
            java.lang.String r1 = r8.A02
            if (r0 == 0) goto L_0x010d
            r0 = -1
            java.lang.Object[] r1 = X.C18210wN.A1Y(r1, r0)
            java.lang.String r0 = "%s request failed, err: %d"
            X.AnonymousClass0LU.A0O(r3, r0, r1)
            java.lang.Object r1 = r8.A01
            com.facebook.mobileconfig.MobileConfigFetcherHandler r1 = (com.facebook.mobileconfig.MobileConfigFetcherHandler) r1
            java.lang.String r0 = r4.A00()
            r1.onComplete(r2, r0)
            r0 = -143064060(0xfffffffff7790404, float:-5.050638E33)
            goto L_0x017e
        L_0x010d:
            java.lang.String r0 = "getStatusCode"
            java.lang.NullPointerException r1 = X.C18210wN.A0W(r0)
            throw r1
        L_0x0114:
            r0 = 2044104723(0x79d69013, float:1.3925921E35)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r9)
            java.lang.Object r1 = r9.A00
            if (r1 == 0) goto L_0x0140
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            java.lang.String r0 = r1.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0140
            java.lang.Object r2 = r8.A00
            X.1cj r2 = (X.AnonymousClass1cj) r2
            java.lang.String r1 = r1.getErrorMessage()
        L_0x0136:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.Cth(r1, r0)
            r0 = 1525654880(0x5aefa560, float:3.37271756E16)
            goto L_0x01d6
        L_0x0140:
            java.lang.Object r2 = r8.A00
            X.1cj r2 = (X.AnonymousClass1cj) r2
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            java.lang.String r1 = r2.getString(r0)
            goto L_0x0136
        L_0x014c:
            r0 = 968858532(0x39bf9ba4, float:3.654632E-4)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r8.A01
            X.C18250wR.A1C(r0)
            X.C63463hW.A03()
            java.lang.String r2 = r8.A02
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "com.instagram.android.login.fragment.ARGUMENT_OMNISTRING"
            r1.putString(r0, r2)
            X.1ca r2 = X.C18250wR.A0O(r1)
            java.lang.Object r0 = r8.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r0 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0bf r0 = r0.A03
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            X.C18220wO.A1A(r2, r0)
            r0 = 1953640583(0x74723087, float:7.6752935E31)
        L_0x017e:
            X.C14030oh.A0A(r0, r5)
            return
        L_0x0182:
            r0 = 1538166672(0x5bae8f90, float:9.8268989E16)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r9)
            if (r9 == 0) goto L_0x01ab
            java.lang.Throwable r1 = r9.A01
            if (r1 == 0) goto L_0x01ab
            boolean r0 = r1 instanceof X.AnonymousClass6CK
            if (r0 == 0) goto L_0x01ab
            X.6CK r1 = (X.AnonymousClass6CK) r1
            X.8lh r0 = r1.A00()
            if (r0 == 0) goto L_0x01ab
            java.lang.String r1 = r0.getDescription()
        L_0x01a2:
            java.lang.String r0 = "rapid_feedback_controller"
            X.C10450iM.A03(r0, r1)
            r0 = -1192420888(0xffffffffb8ed19e8, float:-1.1305866E-4)
            goto L_0x01d6
        L_0x01ab:
            java.lang.String r1 = "Survey fetch failed."
            goto L_0x01a2
        L_0x01ae:
            r0 = -533625638(0xffffffffe03184da, float:-5.1166354E19)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r9)
            if (r9 == 0) goto L_0x01da
            java.lang.Throwable r1 = r9.A01
            if (r1 == 0) goto L_0x01da
            boolean r0 = r1 instanceof X.AnonymousClass6CK
            if (r0 == 0) goto L_0x01da
            X.6CK r1 = (X.AnonymousClass6CK) r1
            X.8lh r0 = r1.A00()
            if (r0 == 0) goto L_0x01da
            java.lang.String r1 = r0.getDescription()
        L_0x01ce:
            java.lang.String r0 = "rapid_feedback_controller"
            X.C10450iM.A03(r0, r1)
            r0 = -983683228(0xffffffffc55e2f64, float:-3554.962)
        L_0x01d6:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x01da:
            java.lang.String r1 = "Survey fetch failed."
            goto L_0x01ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2.onFail(X.3XX):void");
    }

    public final void onFailInBackground(C26743EUq eUq) {
        if (10 - this.A03 != 0) {
            super.onFailInBackground(eUq);
            return;
        }
        int A002 = AnonymousClass0wJ.A00(-1755016695, eUq);
        super.onFailInBackground(eUq);
        String str = this.A02;
        C15730rn A003 = C15730rn.A00((C11630kW) this.A00, "cp_confirm_fail");
        A003.A0D("type", "gmail");
        A003.A0D("flow", str);
        C18180wK.A1K(A003, (C10300i6) this.A01);
        C14030oh.A0A(-200087321, A002);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A03) {
            case 4:
                i = C14030oh.A03(779439949);
                super.onFinish();
                ((AnonymousClass1cj) this.A00).A0K.A00();
                i2 = 424023459;
                break;
            case 5:
                i = C14030oh.A03(-1188791789);
                C24671jo r6 = (C24671jo) this.A00;
                Map map = r6.A06;
                String str = this.A02;
                if (map.get(str) != null) {
                    ((List) map.get(str)).remove(this.A01);
                    if (((List) map.get(str)).isEmpty()) {
                        C23401dk r2 = r6.A00;
                        if (str.equals(r2.A08)) {
                            C18860y1 r1 = r2.A05;
                            if (r1.A01.isEmpty()) {
                                r1.A03 = true;
                                C14020og.A00(r1, -900434024);
                            }
                            View view = r2.A01;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                        map.remove(str);
                        r6.A05.remove(str);
                    }
                }
                i2 = -682563131;
                break;
            case 6:
                i = C14030oh.A03(-83155688);
                C18250wR.A1C(this.A01);
                i2 = -826006329;
                break;
            default:
                super.onFinish();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onStart() {
        if (6 - this.A03 != 0) {
            super.onStart();
            return;
        }
        int A032 = C14030oh.A03(1767970801);
        C13950oZ.A00((Dialog) this.A01);
        C14030oh.A0A(87127952, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03b1, code lost:
        X.C14030oh.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03eb, code lost:
        X.C14030oh.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r18
            r2 = r19
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x03b8;
                case 1: goto L_0x037b;
                case 2: goto L_0x02d0;
                case 3: goto L_0x028a;
                case 4: goto L_0x0198;
                case 5: goto L_0x012f;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00c9;
                case 8: goto L_0x0052;
                case 9: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onSuccess(r2)
            return
        L_0x000d:
            r0 = 982096984(0x3a899c58, float:0.0010498865)
            int r0 = X.C14030oh.A03(r0)
            X.1iw r2 = (X.C24521iw) r2
            r1 = 1367470420(0x5181f154, float:6.9762449E10)
            int r3 = X.C14030oh.A03(r1)
            java.lang.Object r5 = r4.A00
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L_0x0047
            r1 = 2131836301(0x7f113d8d, float:1.9305765E38)
            java.lang.String r11 = r5.getString(r1)
            r1 = 2131836300(0x7f113d8c, float:1.9305763E38)
            java.lang.String r12 = r5.getString(r1)
            r1 = 2131836302(0x7f113d8e, float:1.9305767E38)
            java.lang.String r13 = r5.getString(r1)
            java.lang.Object r7 = r4.A01
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            java.lang.String r9 = r4.A02
            X.JIh r6 = r2.A00
            java.lang.String r8 = "1750502288572541"
            java.lang.String r10 = ""
            X.AnonymousClass3PC.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0047:
            r1 = 252008615(0xf0558a7, float:6.57448E-30)
            X.C14030oh.A0A(r1, r3)
            r1 = 213476676(0xcb96544, float:2.856471E-31)
            goto L_0x03b1
        L_0x0052:
            r0 = -1725164279(0xffffffff992c1509, float:-8.8964396E-24)
            int r0 = X.C14030oh.A03(r0)
            X.1ix r2 = (X.C24531ix) r2
            r1 = -1404835229(0xffffffffac43ea63, float:-2.7841277E-12)
            int r3 = X.C14030oh.A03(r1)
            java.lang.Object r8 = r4.A00
            android.app.Activity r8 = (android.app.Activity) r8
            X.3XP r1 = X.AnonymousClass3XP.A00
            android.content.SharedPreferences r1 = X.AnonymousClass3XP.A00(r8, r1)
            android.content.SharedPreferences$Editor r7 = r1.edit()
            java.lang.String r1 = X.AnonymousClass3XP.A03
            long r5 = X.C18190wL.A07()
            r7.putLong(r1, r5)
            r7.apply()
            java.lang.Object r10 = r4.A01
            com.instagram.service.session.UserSession r10 = (com.instagram.service.session.UserSession) r10
            java.lang.String r11 = r4.A02
            X.3AJ r4 = r2.A00
            if (r4 == 0) goto L_0x00be
            X.38A r1 = r4.A01
            java.lang.String r14 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L_0x0097
            r1 = 2131836301(0x7f113d8d, float:1.9305765E38)
            java.lang.String r14 = r8.getString(r1)
        L_0x0097:
            r1 = 2131836300(0x7f113d8c, float:1.9305763E38)
            java.lang.String r15 = r8.getString(r1)
            X.3AJ r1 = r2.A00
            X.38A r1 = r1.A01
            java.lang.String r2 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x00b1
            r1 = 2131836302(0x7f113d8e, float:1.9305767E38)
            java.lang.String r2 = r8.getString(r1)
        L_0x00b1:
            X.389 r1 = r4.A00
            java.lang.String r12 = r1.A01
            java.lang.String r13 = r4.A02
            X.JIh r9 = r1.A00
            r16 = r2
            X.AnonymousClass3PC.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00be:
            r1 = 387033616(0x1711aa10, float:4.7066676E-25)
            X.C14030oh.A0A(r1, r3)
            r1 = 2119043181(0x7e4e086d, float:6.846618E37)
            goto L_0x03b1
        L_0x00c9:
            r0 = 849318626(0x329f92e2, float:1.857683E-8)
            int r0 = X.C14030oh.A03(r0)
            r1 = -1630085330(0xffffffff9ed6df2e, float:-2.2750436E-20)
            int r7 = X.C14030oh.A03(r1)
            java.lang.Object r6 = r4.A01
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            X.1z6 r3 = X.C35692Ol.A00(r6)
            com.facebook.common.callercontext.CallerContext r2 = X.C67363zQ.A01
            java.lang.String r1 = "ig_android_linking_cache_fx_internal"
            r5 = 0
            r3.A04(r2, r5, r1)
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "facebook_link_success"
            r1 = 1
            X.C35772Ot.A00(r6, r2, r3, r5, r1)
            r1 = 2074312436(0x7ba37ef4, float:1.6978386E36)
            X.C14030oh.A0A(r1, r7)
            r1 = -2107689222(0xffffffff825f36fa, float:-1.639923E-37)
            goto L_0x03b1
        L_0x00fa:
            r0 = 159050577(0x97aeb51, float:3.02033E-33)
            int r0 = X.C14030oh.A03(r0)
            X.1qz r2 = (X.C26651qz) r2
            r1 = 1968356620(0x7552bd0c, float:2.6714274E32)
            int r5 = X.C14030oh.A03(r1)
            com.instagram.user.model.User r9 = r2.A05
            java.lang.Object r3 = r4.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r3 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r3
            X.0bf r8 = r3.A03
            android.content.Context r6 = r3.requireContext()
            r11 = 0
            r7 = 0
            r10 = r7
            com.instagram.service.session.UserSession r2 = X.C67323zM.A03(r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.C67323zM.A06(r1, r7, r3, r2)
            r1 = 2079743511(0x7bf65e17, float:2.5584268E36)
            X.C14030oh.A0A(r1, r5)
            r1 = 290304193(0x114db0c1, float:1.6226115E-28)
            goto L_0x03b1
        L_0x012f:
            r0 = -1872218911(0xffffffff906834e1, float:-4.579467E-29)
            int r0 = X.C14030oh.A03(r0)
            X.4K4 r2 = (X.AnonymousClass4K4) r2
            r1 = 1574122075(0x5dd3325b, float:1.90229077E18)
            int r5 = X.C14030oh.A03(r1)
            super.onSuccess(r2)
            java.util.List r1 = r2.getItems()
            if (r1 == 0) goto L_0x018d
            java.util.List r1 = r2.getItems()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x018d
            java.lang.Object r1 = r4.A00
            X.1jo r1 = (X.C24671jo) r1
            X.1dk r6 = r1.A00
            java.lang.String r3 = r4.A02
            java.util.List r2 = r2.getItems()
            java.lang.String r1 = r6.A08
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x018d
            java.util.Set r1 = r6.A0B
            r1.addAll(r2)
            java.util.Set r1 = r6.A0B
            java.util.ArrayList r3 = X.C18200wM.A0s(r1)
            r2 = 8
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x017a
            r1.setVisibility(r2)
        L_0x017a:
            X.0y1 r2 = r6.A05
            X.C23401dk.A04(r6, r3)
            r1 = 1
            r2.A02 = r1
            r2.A01 = r3
            r1 = 0
            r2.A03 = r1
            r1 = -1551055127(0xffffffffa38cc6e9, float:-1.5263072E-17)
            X.C14020og.A00(r2, r1)
        L_0x018d:
            r1 = -428265902(0xffffffffe6792e52, float:-2.9418093E23)
            X.C14030oh.A0A(r1, r5)
            r1 = -1565119186(0xffffffffa2b62d2e, float:-4.9379035E-18)
            goto L_0x03b1
        L_0x0198:
            r0 = 857561095(0x331d5807, float:3.663447E-8)
            int r5 = X.C14030oh.A03(r0)
            X.1SP r2 = (X.AnonymousClass1SP) r2
            r0 = -669271735(0xffffffffd81bb949, float:-6.8488038E14)
            int r3 = X.C14030oh.A03(r0)
            super.onSuccess(r2)
            java.lang.Object r11 = r4.A01
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            java.lang.String r1 = r2.A00
            r11.A0B = r1
            java.lang.String r0 = r4.A02
            r11.A08 = r0
            java.lang.Object r7 = r4.A00
            X.1cj r7 = (X.AnonymousClass1cj) r7
            com.instagram.registration.model.RegFlowExtras r0 = r7.A0I
            java.lang.String r0 = r0.A04
            r11.A04 = r0
            boolean r0 = r7.A0T
            if (r0 == 0) goto L_0x0286
            X.25r r0 = X.C313625r.SAC
        L_0x01c7:
            r11.A03(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            java.lang.String r0 = X.AnonymousClass2TT.A00(r0)
            r11.A0V = r0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x026c
            boolean r0 = r7.A0T
            if (r0 == 0) goto L_0x024c
            boolean r0 = r11.A0s
            if (r0 == 0) goto L_0x020e
            r0 = 0
            r11.A0t = r0
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            X.0bf r0 = r7.A0M
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r11)
            X.1dA r0 = new X.1dA
            r0.<init>()
        L_0x01fb:
            r0.setArguments(r2)
            r1.A03 = r0
        L_0x0200:
            r1.A05()
        L_0x0203:
            r0 = 524765430(0x1f4748f6, float:4.220024E-20)
            X.C14030oh.A0A(r0, r3)
            r0 = -996747411(0xffffffffc496d76d, float:-1206.732)
            goto L_0x03eb
        L_0x020e:
            boolean r0 = r11.A0t
            if (r0 == 0) goto L_0x0233
            r1 = 0
            r11.A0t = r1
            r7.A0J = r11
            r0 = 1
            r7.A0W = r0
            X.0bf r13 = r7.A0M
            java.lang.String r15 = r11.A0Z
            android.os.Handler r6 = X.AnonymousClass0wJ.A0F()
            X.1jv r12 = r7.A0K
            r9 = 0
            X.265 r14 = r7.BDt()
            r8 = r7
            r10 = r7
            r16 = r9
            r17 = r1
            X.C67283zI.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0203
        L_0x0233:
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            X.0bf r0 = r7.A0M
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r11)
            X.1Qa r0 = new X.1Qa
            r0.<init>()
            goto L_0x01fb
        L_0x024c:
            X.3Vf r2 = X.C63463hW.A01()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r11)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            androidx.fragment.app.Fragment r2 = r2.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            X.0bf r0 = r7.A0M
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            r1.A03 = r2
            goto L_0x0200
        L_0x026c:
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            X.0bf r0 = r7.A0M
            X.Drz r1 = X.C63463hW.A00(r1, r0)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r11)
            X.1rN r0 = new X.1rN
            r0.<init>()
            goto L_0x01fb
        L_0x0286:
            X.25r r0 = X.C313625r.EMAIL
            goto L_0x01c7
        L_0x028a:
            r0 = -214280476(0xfffffffff33a56e4, float:-1.476333E31)
            int r5 = X.C14030oh.A03(r0)
            X.1U7 r2 = (X.AnonymousClass1U7) r2
            r0 = 1253332936(0x4ab457c8, float:5909476.0)
            int r7 = X.C14030oh.A03(r0)
            X.GJX r0 = r2.A00
            r6 = 1
            java.lang.String r3 = "IgMobileConfigFetcher"
            if (r0 != 0) goto L_0x02c1
            java.lang.String r0 = r4.A02
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s request succeeded with null response"
            X.AnonymousClass0LU.A0O(r3, r0, r1)
            java.lang.Object r1 = r4.A01
            com.facebook.mobileconfig.MobileConfigFetcherHandler r1 = (com.facebook.mobileconfig.MobileConfigFetcherHandler) r1
            java.lang.String r0 = ""
            r1.onComplete(r2, r0)
            r0 = 2040080435(0x79992833, float:9.940459E34)
        L_0x02b9:
            X.C14030oh.A0A(r0, r7)
            r0 = 527428415(0x1f6feb3f, float:5.080481E-20)
            goto L_0x03eb
        L_0x02c1:
            java.lang.String r1 = r2.A00()
            java.lang.Object r0 = r4.A01
            com.facebook.mobileconfig.MobileConfigFetcherHandler r0 = (com.facebook.mobileconfig.MobileConfigFetcherHandler) r0
            r0.onComplete(r6, r1)
            r0 = -1523098317(0xffffffffa5375d33, float:-1.5904297E-16)
            goto L_0x02b9
        L_0x02d0:
            r0 = -958925819(0xffffffffc6d7f405, float:-27642.01)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            r1 = -681300185(0xffffffffd7642f27, float:-2.50891169E14)
            int r6 = X.C14030oh.A03(r1)
            java.lang.Object r3 = r2.A01
            if (r3 == 0) goto L_0x033f
            X.4ur r3 = (X.C85314ur) r3
            X.4vN r1 = r3.Ao1()
            if (r1 == 0) goto L_0x033f
            X.216 r2 = X.AnonymousClass216.SUCCESS
            X.4vN r1 = r3.Ao1()
            X.216 r1 = r1.BDj()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x033f
            X.4vN r1 = r3.Ao1()
            int r8 = r1.getCount()
            java.lang.Object r1 = r4.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.1tl r2 = X.AnonymousClass3WS.A01(r1)
            java.lang.String r1 = r4.A02
            java.lang.String r3 = "CONTACT_AUTOFILL"
            boolean r1 = r1.equals(r3)
            java.lang.String r7 = "USER_PERMANENT_OPTOUT"
            if (r1 == 0) goto L_0x0349
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r2)
            java.lang.String r1 = "browser_consecutive_decline_autofill"
            X.AnonymousClass0wJ.A11(r2, r1, r8)
            r1 = 5
            if (r8 < r1) goto L_0x033f
            java.lang.Object r2 = r4.A01
            X.0nS r2 = (X.C13330nS) r2
            java.lang.String r1 = "iab_autofill_interaction"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 726(0x2d6, float:1.017E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            X.C18210wN.A1A(r2, r7)
        L_0x0337:
            java.lang.String r1 = "type"
            r2.A0T(r1, r3)
            r2.Bb4()
        L_0x033f:
            r1 = -1188651609(0xffffffffb9269da7, float:-1.5889724E-4)
            X.C14030oh.A0A(r1, r6)
            r1 = -543343099(0xffffffffdf9d3e05, float:-2.2660998E19)
            goto L_0x03b1
        L_0x0349:
            r5 = 0
            android.content.SharedPreferences r3 = r2.A00
            android.content.SharedPreferences$Editor r2 = r3.edit()
            java.lang.String r1 = "browser_autofill_payment_opt_in"
            X.AnonymousClass0wJ.A13(r2, r1, r5)
            android.content.SharedPreferences$Editor r2 = r3.edit()
            java.lang.String r1 = "browser_autofill_payment_decline_count"
            X.AnonymousClass0wJ.A11(r2, r1, r8)
            r1 = 3
            if (r8 < r1) goto L_0x033f
            java.lang.Object r2 = r4.A01
            X.0nS r2 = (X.C13330nS) r2
            java.lang.String r1 = "iab_autofill_interaction"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 726(0x2d6, float:1.017E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            X.C18210wN.A1A(r2, r7)
            r1 = 429(0x1ad, float:6.01E-43)
            java.lang.String r3 = X.I17.A00(r1)
            goto L_0x0337
        L_0x037b:
            r0 = -36232394(0xfffffffffdd72336, float:-3.5745856E37)
            int r0 = X.C14030oh.A03(r0)
            r1 = -1779660954(0xffffffff95ec8766, float:-9.553326E-26)
            int r7 = X.AnonymousClass0wJ.A00(r1, r2)
            super.onSuccess(r2)
            java.lang.Object r2 = r4.A00
            X.BKU r2 = (X.BKU) r2
            X.24M r1 = X.AnonymousClass24M.SHARED
            r2.A3g(r1)
            java.lang.Object r1 = r4.A01
            X.3Yc r1 = (X.C62283Yc) r1
            com.instagram.service.session.UserSession r6 = r1.A04
            monitor-enter(r1)
            java.lang.String r5 = r1.A02     // Catch:{ all -> 0x03b5 }
            monitor-exit(r1)
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "success"
            java.lang.String r1 = "upsell"
            X.AnonymousClass2SK.A00(r6, r2, r1, r5, r3)
            r1 = -1146375955(0xffffffffbbabb0ed, float:-0.005239597)
            X.C14030oh.A0A(r1, r7)
            r1 = -1725896618(0xffffffff9920e856, float:-8.318726E-24)
        L_0x03b1:
            X.C14030oh.A0A(r1, r0)
            return
        L_0x03b5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x03b8:
            r0 = 1706209908(0x65b2b274, float:1.0548414E23)
            int r5 = X.C14030oh.A03(r0)
            r0 = -1567901590(0xffffffffa28bb86a, float:-3.787128E-18)
            int r3 = X.C14030oh.A03(r0)
            X.3VO r2 = X.AnonymousClass3VO.A00()
            r1 = 0
            java.lang.String r0 = "success"
            r2.A02(r0, r1)
            java.lang.String r1 = r4.A02
            r0 = 1
            X.3iY r2 = X.C63893iY.A05(r2, r1, r0)
            java.lang.Object r1 = r4.A00
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object r0 = r4.A01
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r2, r1)
            r0 = 136475833(0x82274b9, float:4.888731E-34)
            X.C14030oh.A0A(r0, r3)
            r0 = 97285506(0x5cc7582, float:1.9227233E-35)
        L_0x03eb:
            X.C14030oh.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        if (10 - this.A03 != 0) {
            super.onSuccessInBackground(obj);
            return;
        }
        int A032 = C14030oh.A03(1136408384);
        int A002 = AnonymousClass0wJ.A00(-572768294, obj);
        super.onSuccessInBackground(obj);
        String str = this.A02;
        C15730rn A003 = C15730rn.A00((C11630kW) this.A00, "cp_confirm_success");
        A003.A0D("type", "gmail");
        A003.A0D("flow", str);
        C18180wK.A1K(A003, (C10300i6) this.A01);
        C14030oh.A0A(-763540733, A002);
        C14030oh.A0A(-468594498, A032);
    }
}

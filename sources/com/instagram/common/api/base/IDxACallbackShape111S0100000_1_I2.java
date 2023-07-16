package com.instagram.common.api.base;

import X.AnonymousClass0TJ;
import X.AnonymousClass0g9;
import X.AnonymousClass0wJ;
import X.AnonymousClass1cW;
import X.AnonymousClass4R1;
import X.AnonymousClass4R2;
import X.AnonymousClass4R3;
import X.AnonymousClass4S2;
import X.AnonymousClass4S3;
import X.C14030oh;
import X.C18240wQ;
import X.C22871as;
import X.C22881ax;
import X.C25201mh;
import X.C26743EUq;
import X.C28161tl;
import X.C37408JrQ;
import X.C63173fJ;
import X.C63203gz;
import X.C63803iN;
import X.C63873iU;
import X.C696349j;
import X.C85814vo;
import android.os.Handler;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.task.IDxLTaskShape133S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

public class IDxACallbackShape111S0100000_1_I2 extends C63873iU {
    public Object A00;
    public final int A01;

    public IDxACallbackShape111S0100000_1_I2(UserSession userSession, int i) {
        this.A01 = i;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0685, code lost:
        r2 = (X.AnonymousClass1j3) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x1057, code lost:
        X.C14030oh.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x105a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x12e9, code lost:
        X.C14030oh.A0A(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x12ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x13a4, code lost:
        r0 = "actionButtonHolder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x1472, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x1476, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x14af, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x14b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x17f0, code lost:
        X.C14030oh.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x17f3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x17ab;
                case 1: goto L_0x1777;
                case 2: goto L_0x175f;
                case 3: goto L_0x0005;
                case 4: goto L_0x1716;
                case 5: goto L_0x0005;
                case 6: goto L_0x16cf;
                case 7: goto L_0x16ba;
                case 8: goto L_0x16a5;
                case 9: goto L_0x1684;
                case 10: goto L_0x1675;
                case 11: goto L_0x1646;
                case 12: goto L_0x1605;
                case 13: goto L_0x15ce;
                case 14: goto L_0x1598;
                case 15: goto L_0x1556;
                case 16: goto L_0x1516;
                case 17: goto L_0x14d2;
                case 18: goto L_0x0005;
                case 19: goto L_0x14b3;
                case 20: goto L_0x1461;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x141f;
                case 25: goto L_0x13e1;
                case 26: goto L_0x13a8;
                case 27: goto L_0x1367;
                case 28: goto L_0x132a;
                case 29: goto L_0x12ed;
                case 30: goto L_0x12a9;
                case 31: goto L_0x0005;
                case 32: goto L_0x1293;
                case 33: goto L_0x1280;
                case 34: goto L_0x126a;
                case 35: goto L_0x1253;
                case 36: goto L_0x1236;
                case 37: goto L_0x1220;
                case 38: goto L_0x11ec;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x11b8;
                case 42: goto L_0x0005;
                case 43: goto L_0x119c;
                case 44: goto L_0x117e;
                case 45: goto L_0x115e;
                case 46: goto L_0x1143;
                case 47: goto L_0x1137;
                case 48: goto L_0x109b;
                case 49: goto L_0x106a;
                case 50: goto L_0x0fd5;
                case 51: goto L_0x0fa1;
                case 52: goto L_0x0005;
                case 53: goto L_0x0f8a;
                case 54: goto L_0x0f7e;
                case 55: goto L_0x0f36;
                case 56: goto L_0x0f2a;
                case 57: goto L_0x0f1e;
                case 58: goto L_0x0ef4;
                case 59: goto L_0x0ed3;
                case 60: goto L_0x0eb2;
                case 61: goto L_0x0e8f;
                case 62: goto L_0x0e09;
                case 63: goto L_0x0ddc;
                case 64: goto L_0x0dc6;
                case 65: goto L_0x0da5;
                case 66: goto L_0x0d89;
                case 67: goto L_0x0d74;
                case 68: goto L_0x0d52;
                case 69: goto L_0x0d34;
                case 70: goto L_0x0d18;
                case 71: goto L_0x0cff;
                case 72: goto L_0x0cc1;
                case 73: goto L_0x0c85;
                case 74: goto L_0x0c70;
                case 75: goto L_0x0005;
                case 76: goto L_0x0c50;
                case 77: goto L_0x0c2e;
                case 78: goto L_0x0c0f;
                case 79: goto L_0x0bed;
                case 80: goto L_0x0bd8;
                case 81: goto L_0x0bc9;
                case 82: goto L_0x0b9e;
                case 83: goto L_0x0b82;
                case 84: goto L_0x0b53;
                case 85: goto L_0x0b44;
                case 86: goto L_0x0aee;
                case 87: goto L_0x0adf;
                case 88: goto L_0x0ad0;
                case 89: goto L_0x0aa1;
                case 90: goto L_0x0a85;
                case 91: goto L_0x0a2d;
                case 92: goto L_0x09fd;
                case 93: goto L_0x09cf;
                case 94: goto L_0x09ba;
                case 95: goto L_0x098d;
                case 96: goto L_0x0977;
                case 97: goto L_0x0958;
                case 98: goto L_0x0939;
                case 99: goto L_0x091d;
                case 100: goto L_0x0911;
                case 101: goto L_0x08d5;
                case 102: goto L_0x08c2;
                case 103: goto L_0x089f;
                case 104: goto L_0x0809;
                case 105: goto L_0x07ed;
                case 106: goto L_0x0797;
                case 107: goto L_0x0005;
                case 108: goto L_0x0766;
                case 109: goto L_0x0746;
                case 110: goto L_0x0727;
                case 111: goto L_0x0005;
                case 112: goto L_0x0710;
                case 113: goto L_0x0005;
                case 114: goto L_0x06c9;
                case 115: goto L_0x06bd;
                case 116: goto L_0x06b1;
                case 117: goto L_0x066e;
                case 118: goto L_0x064a;
                case 119: goto L_0x0636;
                case 120: goto L_0x0005;
                case 121: goto L_0x0615;
                case 122: goto L_0x05cc;
                case 123: goto L_0x0596;
                case 124: goto L_0x057d;
                case 125: goto L_0x054f;
                case 126: goto L_0x052a;
                case 127: goto L_0x0005;
                case 128: goto L_0x0511;
                case 129: goto L_0x04fa;
                case 130: goto L_0x0005;
                case 131: goto L_0x04df;
                case 132: goto L_0x04c8;
                case 133: goto L_0x0005;
                case 134: goto L_0x04a1;
                case 135: goto L_0x0005;
                case 136: goto L_0x0005;
                case 137: goto L_0x0484;
                case 138: goto L_0x0465;
                case 139: goto L_0x0427;
                case 140: goto L_0x03ff;
                case 141: goto L_0x0005;
                case 142: goto L_0x03de;
                case 143: goto L_0x03c8;
                case 144: goto L_0x0383;
                case 145: goto L_0x0005;
                case 146: goto L_0x0363;
                case 147: goto L_0x033a;
                case 148: goto L_0x031d;
                case 149: goto L_0x0005;
                case 150: goto L_0x0307;
                case 151: goto L_0x02f1;
                case 152: goto L_0x0005;
                case 153: goto L_0x0005;
                case 154: goto L_0x0005;
                case 155: goto L_0x02e5;
                case 156: goto L_0x0005;
                case 157: goto L_0x0005;
                case 158: goto L_0x02af;
                case 159: goto L_0x0005;
                case 160: goto L_0x0286;
                case 161: goto L_0x0262;
                case 162: goto L_0x0238;
                case 163: goto L_0x021a;
                case 164: goto L_0x0005;
                case 165: goto L_0x0005;
                case 166: goto L_0x0005;
                case 167: goto L_0x0005;
                case 168: goto L_0x0005;
                case 169: goto L_0x01f6;
                case 170: goto L_0x01ca;
                case 171: goto L_0x01a9;
                case 172: goto L_0x016b;
                case 173: goto L_0x0145;
                case 174: goto L_0x012c;
                case 175: goto L_0x0115;
                case 176: goto L_0x0005;
                case 177: goto L_0x0005;
                case 178: goto L_0x00f9;
                case 179: goto L_0x00d2;
                case 180: goto L_0x004a;
                case 181: goto L_0x0024;
                case 182: goto L_0x0005;
                case 183: goto L_0x0005;
                case 184: goto L_0x0005;
                case 185: goto L_0x0015;
                case 186: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onFail(r15)
            return
        L_0x0009:
            r0 = -1861388311(0xffffffff910d77e9, float:-1.1159889E-28)
            int r7 = X.C14030oh.A03(r0)
            r0 = 1891030054(0x70b6d426, float:4.5266195E29)
            goto L_0x12e9
        L_0x0015:
            r0 = 1235106861(0x499e3c2d, float:1296261.6)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            r1 = -370001472(0xffffffffe9f239c0, float:-3.6604096E25)
            goto L_0x17f0
        L_0x0024:
            r0 = -142866288(0xfffffffff77c0890, float:-5.1118456E33)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = (com.facebook.redex.IDxCListenerShape70S0200000_1_I2) r1
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r2 = r1.getContext()
            if (r2 == 0) goto L_0x0045
            boolean r1 = r1.isResumed()
            if (r1 == 0) goto L_0x0045
            X.C62973bE.A01(r2)
        L_0x0045:
            r1 = 757285225(0x2d234169, float:9.280001E-12)
            goto L_0x17f0
        L_0x004a:
            r0 = -1445249566(0xffffffffa9db3de2, float:-9.7362887E-14)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Throwable r5 = r15.A01
            if (r5 == 0) goto L_0x00cb
            java.lang.Object r4 = r14.A00
            X.3Fj r4 = (X.AnonymousClass3Fj) r4
            android.content.Context r2 = r4.A00
            r1 = 2131829640(0x7f112388, float:1.9292255E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r2, r1)
            X.3iD r3 = X.C63733iD.A01()
            r3.A0A = r1
            r3.A0C()
            X.22c r1 = X.C306022c.ERROR
            r3.A0F(r1)
            java.lang.String r1 = "auto_enroll_limited_interactions_retry"
            r3.A0E = r1
            r1 = 2131834950(0x7f113846, float:1.9303025E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r2, r1)
            r3.A0D = r1
            r1 = 1
            r3.A0I = r1
            r2 = 12
            com.facebook.redex.IDxCBackShape392S0100000_1_I2 r1 = new com.facebook.redex.IDxCBackShape392S0100000_1_I2
            r1.<init>(r4, r2)
            r3.A07 = r1
            X.KHr r1 = X.C38040KHr.A01
            X.C63733iD.A09(r1, r3)
            X.36a r1 = r4.A02
            X.0nS r2 = r1.A00
            java.lang.String r1 = "limits_feature_api_call"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2368(0x940, float:3.318E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r2, r1)
            boolean r1 = X.AnonymousClass0wJ.A1U(r4)
            if (r1 == 0) goto L_0x00cb
            boolean r1 = r5 instanceof X.AnonymousClass665
            if (r1 == 0) goto L_0x00d0
            r1 = r5
            X.665 r1 = (X.AnonymousClass665) r1
            if (r1 == 0) goto L_0x00d0
            int r3 = r1.A00
        L_0x00af:
            java.lang.String r2 = "mass_harassment_auto_enroll_qp"
            java.lang.String r1 = "surface_type"
            r4.A0T(r1, r2)
            java.lang.Long r2 = X.C18230wP.A0f(r3)
            java.lang.String r1 = "error_code"
            r4.A0S(r1, r2)
            java.lang.String r2 = r5.getMessage()
            java.lang.String r1 = "error_info"
            r4.A0T(r1, r2)
            r4.Bb4()
        L_0x00cb:
            r1 = 1988264838(0x76828386, float:1.3235668E33)
            goto L_0x17f0
        L_0x00d0:
            r3 = -1
            goto L_0x00af
        L_0x00d2:
            r0 = -825562114(0xffffffffcecaebfe, float:-1.70223181E9)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x00e7
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            if (r1 == 0) goto L_0x00e7
            java.lang.String r2 = r1.getErrorMessage()
            if (r2 != 0) goto L_0x00e9
        L_0x00e7:
            java.lang.String r2 = ""
        L_0x00e9:
            java.lang.String r1 = "Could not fetch Creator Info: "
            java.lang.String r2 = X.AnonymousClass00U.A0L(r1, r2)
            java.lang.String r1 = "CreatorInfoFetcher"
            X.C10450iM.A03(r1, r2)
            r1 = 1899370824(0x71361948, float:9.0170936E29)
            goto L_0x17f0
        L_0x00f9:
            r0 = 530803833(0x1fa36c79, float:6.921264E-20)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r2 = r14.A00
            android.view.View r2 = (android.view.View) r2
            r1 = 1
            r2.setClickable(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r1)
            r1 = 90807804(0x5699dfc, float:1.09846245E-35)
            goto L_0x17f0
        L_0x0115:
            r0 = 933742211(0x37a7c683, float:2.000039E-5)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            com.facebook.redex.IDxCListenerShape20S0400000_1_I2 r1 = (com.facebook.redex.IDxCListenerShape20S0400000_1_I2) r1
            java.lang.Object r1 = r1.A01
            X.4t4 r1 = (X.C84394t4) r1
            r1.Bxq()
            r1 = 1138404665(0x43daad39, float:437.3533)
            goto L_0x17f0
        L_0x012c:
            r0 = -1372967725(0xffffffffae2a2cd3, float:-3.8693337E-11)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            android.os.Bundle r1 = r1.mArguments
            X.C63753iH.A02(r2, r1)
            r1 = 1404032144(0x53afd490, float:1.51037097E12)
            goto L_0x17f0
        L_0x0145:
            r0 = 1697920987(0x653437db, float:5.319102E22)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.3Az r1 = (X.C57423Az) r1
            X.3Ay r1 = r1.A01
            com.instagram.urlhandler.IgMeMessageUrlHandlerActivity r3 = r1.A01
            java.lang.String r1 = r3.A00
            java.lang.String r2 = java.lang.String.valueOf(r1)
            X.28g r1 = X.C316028g.FAILURE
            com.instagram.urlhandler.IgMeMessageUrlHandlerActivity.A00(r1, r3, r2)
            android.content.Intent r1 = X.C62333Yi.A00(r3)
            X.C10650ih.A02(r3, r1)
            r1 = -79893765(0xfffffffffb3ceafb, float:-9.809178E35)
            goto L_0x17f0
        L_0x016b:
            r0 = 1446874023(0x563d8ba7, float:5.2101875E13)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Throwable r2 = r15.A01
            if (r2 == 0) goto L_0x01a4
            boolean r1 = r2 instanceof X.AnonymousClass6CK
            if (r1 == 0) goto L_0x01a4
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.graphql.error.GraphQLException"
            X.C04220Ms.A0C(r2, r1)
            X.6CK r2 = (X.AnonymousClass6CK) r2
            com.google.common.collect.ImmutableList r1 = r2.A00
            X.83w r3 = r1.iterator()
        L_0x018a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01a4
            java.lang.Object r1 = r3.next()
            X.8lh r1 = (X.C146138lh) r1
            java.lang.String r2 = r1.getDescription()
            if (r2 != 0) goto L_0x019e
            java.lang.String r2 = "Session level survey fetch failed."
        L_0x019e:
            java.lang.String r1 = "session_survey_controller"
            X.C10450iM.A03(r1, r2)
            goto L_0x018a
        L_0x01a4:
            r1 = -1048804408(0xffffffffc17c83c8, float:-15.782173)
            goto L_0x17f0
        L_0x01a9:
            r0 = -1607331728(0xffffffffa0321070, float:-1.5082625E-19)
            int r0 = X.C14030oh.A03(r0)
            java.lang.String r3 = "Survey Post Impression:"
            java.lang.Object r1 = r14.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r2 = X.C50192sb.A00(r1)
            java.lang.String r1 = " Failed"
            java.lang.String r2 = X.AnonymousClass00U.A0V(r3, r2, r1)
            java.lang.String r1 = "RapidFeedbackAnalyticsUtil"
            X.C10450iM.A03(r1, r2)
            r1 = 1599553753(0x5f5740d9, float:1.5510636E19)
            goto L_0x17f0
        L_0x01ca:
            r0 = 372179462(0x162f0206, float:1.4137026E-25)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.8m8 r3 = (X.C146368m8) r3
            java.lang.Object r1 = r15.A00
            X.EUq r1 = (X.C26743EUq) r1
            if (r1 == 0) goto L_0x01ee
            java.lang.Object r2 = r1.A04()
            if (r2 == 0) goto L_0x01ee
            X.5z2 r1 = new X.5z2
            r1.<init>(r2)
        L_0x01e6:
            r3.D7w(r1)
            r1 = 1007698552(0x3c104278, float:0.00880491)
            goto L_0x17f0
        L_0x01ee:
            java.lang.Throwable r2 = r15.A01
            X.5z1 r1 = new X.5z1
            r1.<init>(r2)
            goto L_0x01e6
        L_0x01f6:
            r0 = -1604508306(0xffffffffa05d256e, float:-1.8731813E-19)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.8m8 r3 = (X.C146368m8) r3
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x0212
            X.5z2 r1 = new X.5z2
            r1.<init>(r2)
        L_0x020a:
            r3.D7w(r1)
            r1 = 1065635028(0x3f844cd4, float:1.0335946)
            goto L_0x17f0
        L_0x0212:
            java.lang.Throwable r2 = r15.A01
            X.5z1 r1 = new X.5z1
            r1.<init>(r2)
            goto L_0x020a
        L_0x021a:
            r0 = -1390970744(0xffffffffad177888, float:-8.6101196E-12)
            int r0 = X.C14030oh.A03(r0)
            java.lang.String r1 = "ig_fbconnected_backend_convert_big_blue_token_failed"
            X.0rn r3 = X.C18230wP.A0T(r1)
            java.lang.Object r2 = r14.A00
            X.47q r2 = (X.C692747q) r2
            com.instagram.service.session.UserSession r1 = r2.A03
            X.C18180wK.A1K(r3, r1)
            r1 = 0
            r2.A02 = r1
            r1 = -1599163309(0xffffffffa0aeb453, float:-2.9596075E-19)
            goto L_0x17f0
        L_0x0238:
            r0 = 1213710568(0x4857c0e8, float:220931.62)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Throwable r1 = r15.A01
            if (r1 == 0) goto L_0x0249
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x024b
        L_0x0249:
            java.lang.String r1 = ""
        L_0x024b:
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r1 = "Failed to fetch fb crossposting destinations: %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            X.C04220Ms.A06(r1)
            r1 = -297114477(0xffffffffee4a6493, float:-1.565939E28)
            goto L_0x17f0
        L_0x0262:
            r0 = -1718838820(0xffffffff998c99dc, float:-1.4537804E-23)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r2 = r14.A00
            X.49K r2 = (X.AnonymousClass49K) r2
            android.widget.Toast r1 = r2.A00
            if (r1 == 0) goto L_0x0277
            r1.cancel()
        L_0x0277:
            r1 = 0
            r2.A00 = r1
            java.lang.Object r1 = r15.A00
            X.1TE r1 = (X.AnonymousClass1TE) r1
            X.AnonymousClass49K.A00(r2, r1)
            r1 = 622736659(0x251e3513, float:1.3722298E-16)
            goto L_0x17f0
        L_0x0286:
            r0 = 1600176531(0x5f60c193, float:1.6195387E19)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r3 = r14.A00
            X.1x8 r3 = (X.AnonymousClass1x8) r3
            X.2qs r1 = new X.2qs
            r1.<init>()
            java.util.List r1 = X.C18180wK.A0n(r1)
            r3.setItems(r1)
            r2 = 16
            kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96 r1 = new kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96
            r1.<init>(r3, r2)
            X.AnonymousClass1x8.A0E(r3, r1)
            r1 = -830280802(0xffffffffce82eb9e, float:-1.09823974E9)
            goto L_0x17f0
        L_0x02af:
            r0 = 1134992703(0x43a69d3f, float:333.2285)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1cP r5 = (X.AnonymousClass1cP) r5
            android.content.Context r4 = r5.requireContext()
            r3 = 2131831666(0x7f112b72, float:1.9296364E38)
            r2 = 0
            java.lang.String r1 = "load_whitelist_failed"
            android.widget.Toast r1 = X.C63813iO.A03(r4, r1, r3, r2)
            if (r1 == 0) goto L_0x02cd
            r1.show()
        L_0x02cd:
            X.1fV r4 = r5.A04()
            android.content.Context r3 = r5.requireContext()
            X.9uK r2 = X.C170039uK.ERROR
            r1 = 268(0x10c, float:3.76E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r5, r1)
            r4.A03(r3, r1, r2)
            r1 = 2042412091(0x79bcbc3b, float:1.224962E35)
            goto L_0x17f0
        L_0x02e5:
            r0 = 143397295(0x88c11af, float:8.430101E-34)
            int r7 = X.C14030oh.A03(r0)
            r0 = -527496292(0xffffffffe08f0b9c, float:-8.246003E19)
            goto L_0x12e9
        L_0x02f1:
            r0 = 1626412028(0x60f113fc, float:1.3897204E20)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.String r2 = "FxSettingsAccountsCenterTransitionQueryResponse"
            java.lang.String r1 = "GraphQL Result Failed"
            X.C10450iM.A03(r2, r1)
            r1 = 1142467755(0x4418acab, float:610.69794)
            goto L_0x17f0
        L_0x0307:
            r0 = -1883713249(0xffffffff8fb8d11f, float:-1.8224351E-29)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.String r2 = "FxSettingsSearchQueryResponse"
            java.lang.String r1 = "GraphQL Result Failed"
            X.C10450iM.A03(r2, r1)
            r1 = 1371636771(0x51c18423, float:1.03893197E11)
            goto L_0x17f0
        L_0x031d:
            r0 = 1979823615(0x7601b5ff, float:6.577125E32)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.String r2 = "FxSettingsSecurityTransitionResponse"
            java.lang.String r1 = "GraphQL Result Failed"
            X.C10450iM.A03(r2, r1)
            java.lang.Object r1 = r14.A00
            X.1wk r1 = (X.C29111wk) r1
            X.C29111wk.A0B(r1)
            r1 = -1989970455(0xffffffff896375e9, float:-2.7379572E-33)
            goto L_0x17f0
        L_0x033a:
            r0 = 410405556(0x18764ab4, float:3.183247E-24)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r3 = r14.A00
            X.1x6 r3 = (X.AnonymousClass1x6) r3
            X.2qo r1 = new X.2qo
            r1.<init>()
            java.util.List r1 = X.C18180wK.A0n(r1)
            r3.setItems(r1)
            r2 = 36
            kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95 r1 = new kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95
            r1.<init>(r3, r2)
            X.AnonymousClass1x6.A0E(r3, r1)
            r1 = 1169827201(0x45ba2581, float:5956.688)
            goto L_0x17f0
        L_0x0363:
            r0 = 626665257(0x255a2729, float:1.8921754E-16)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r3 = r14.A00
            X.1Yx r3 = (X.C22651Yx) r3
            X.C22651Yx.A02(r3)
            r2 = 30
            kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95 r1 = new kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95
            r1.<init>(r3, r2)
            X.C22651Yx.A05(r3, r1)
            r1 = -955506862(0xffffffffc70c1f52, float:-35871.32)
            goto L_0x17f0
        L_0x0383:
            r0 = 675026136(0x283c14d8, float:1.0440616E-14)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.1wV r1 = (X.AnonymousClass1wV) r1
            com.instagram.service.session.UserSession r4 = r1.A02
            X.1tl r1 = X.AnonymousClass3WS.A01(r4)
            r3 = 0
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r1)
            java.lang.String r1 = "user_consent_query_loaded"
            X.AnonymousClass0wJ.A13(r2, r1, r3)
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A03(r4)
            java.lang.String r1 = "user_consent_query_consented"
            X.AnonymousClass0wJ.A13(r2, r1, r3)
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A03(r4)
            java.lang.String r1 = "user_consent_query_settings_required"
            X.AnonymousClass0wJ.A13(r2, r1, r3)
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A03(r4)
            java.lang.String r1 = "user_consent_query_first_party_tracking"
            X.AnonymousClass0wJ.A13(r2, r1, r3)
            java.lang.String r2 = "IGUserConsentQueryResponse"
            java.lang.String r1 = "GraphQL Result Failed"
            X.C10450iM.A03(r2, r1)
            r1 = -1251738793(0xffffffffb563fb57, float:-8.492984E-7)
            goto L_0x17f0
        L_0x03c8:
            r0 = 1669654208(0x6384e6c0, float:4.903195E21)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.String r2 = "FxSettingsCookiesSubtitleResponse"
            java.lang.String r1 = "GraphQL Result Failed"
            X.C10450iM.A03(r2, r1)
            r1 = 1562351190(0x5d1f9656, float:7.1871708E17)
            goto L_0x17f0
        L_0x03de:
            r0 = -394674208(0xffffffffe879bfe0, float:-4.717635E24)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1wV r1 = (X.AnonymousClass1wV) r1
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.3aX r2 = r1.A03
            r7 = 0
            java.lang.String r3 = r1.A04
            r5 = 1
            r6 = r5
            r2.A03(r3, r4, r5, r6, r7)
            r1.setItems(r4)
            r1 = -1973661362(0xffffffff8a5c514e, float:-1.06079064E-32)
            goto L_0x17f0
        L_0x03ff:
            r0 = -2085014669(0xffffffff83b93373, float:-1.0885135E-36)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r1 = (com.facebook.redex.IDxCListenerShape267S0100000_1_I2) r1
            java.lang.Object r2 = r1.A00
            X.1wj r2 = (X.C29101wj) r2
            java.util.List r1 = X.C29101wj.A0B(r2)
            r2.setItems(r1)
            android.content.Context r4 = r2.getContext()
            r3 = 2131831662(0x7f112b6e, float:1.9296356E38)
            r2 = 0
            java.lang.String r1 = "add_donate_action_failed"
            X.C63813iO.A03(r4, r1, r3, r2)
            r1 = -2092468116(0xffffffff8347786c, float:-5.861908E-37)
            goto L_0x17f0
        L_0x0427:
            r0 = 116805269(0x6f64e95, float:9.265038E-35)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.3Vj r4 = (X.C61783Vj) r4
            X.IcN r2 = r4.A02
            r1 = 2131826867(0x7f1118b3, float:1.928663E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r8 = X.C63873iU.A09(r15, r1)
            com.instagram.service.session.UserSession r1 = r4.A07
            java.lang.String r3 = "switch_to_personal_account_failed"
            X.C62423Zt.A02(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r4.A03
            java.lang.String r5 = "switch_back"
            r9 = 0
            java.lang.String r6 = "setting"
            java.lang.String r7 = "switch_back_button"
            X.JrQ r4 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Bdy(r4)
            android.content.Context r2 = X.C10600ic.A00
            r1 = 0
            X.C63813iO.A02(r2, r8, r3, r1)
            r1 = -1820786787(0xffffffff9378ff9d, float:-3.1428028E-27)
            goto L_0x17f0
        L_0x0465:
            r0 = -439212280(0xffffffffe5d22708, float:-1.2405212E23)
            int r0 = X.C14030oh.A03(r0)
            r1 = 0
            X.C04220Ms.A0B(r15, r1)
            super.onFail(r15)
            java.lang.Object r2 = r14.A00
            X.1wh r2 = (X.C29081wh) r2
            r2.A04 = r1
            r1 = 0
            r2.A03 = r1
            X.C29081wh.A0B(r2)
            r1 = -658088684(0xffffffffd8c65d14, float:-1.74482456E15)
            goto L_0x17f0
        L_0x0484:
            r0 = -416343453(0xffffffffe72f1a63, float:-8.269009E23)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.String r2 = "FxSettingsAdsTransitionResponse"
            java.lang.String r1 = "GraphQL Result Failed"
            X.C10450iM.A03(r2, r1)
            java.lang.Object r1 = r14.A00
            X.1wh r1 = (X.C29081wh) r1
            X.C29081wh.A0B(r1)
            r1 = -1642141550(0xffffffff9e1ee892, float:-8.412545E-21)
            goto L_0x17f0
        L_0x04a1:
            r0 = 1888390019(0x708e8b83, float:3.5292425E29)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.8n9 r3 = (X.C146958n9) r3
            java.lang.Throwable r2 = r15.A01
            if (r2 != 0) goto L_0x04bb
            r1 = 10
            java.lang.String r1 = X.I17.A00(r1)
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r1)
        L_0x04bb:
            X.1jB r1 = new X.1jB
            r1.<init>(r2)
            r3.resumeWith(r1)
            r1 = -233362771(0xfffffffff2172aad, float:-2.994165E30)
            goto L_0x17f0
        L_0x04c8:
            r0 = 905918151(0x35ff36c7, float:1.9014923E-6)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Boolean r1 = X.C18180wK.A0X()
            r2.invoke(r1)
            r1 = 151788487(0x90c1bc7, float:1.6864948E-33)
            goto L_0x17f0
        L_0x04df:
            r0 = 997669873(0x3b773bf1, float:0.0037724937)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            android.content.Context r4 = X.C18240wQ.A0C(r1)
            r3 = 2131834837(0x7f1137d5, float:1.9302796E38)
            r2 = 1
            java.lang.String r1 = "createBlockedReelsTask_request_error"
            X.C63813iO.A03(r4, r1, r3, r2)
            r1 = 1113219418(0x425a615a, float:54.59507)
            goto L_0x17f0
        L_0x04fa:
            r0 = -1899586804(0xffffffff8ec69b0c, float:-4.8960073E-30)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.4AX r2 = (X.AnonymousClass4AX) r2
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r2.A08 = r1
            X.AnonymousClass4AX.A04(r2)
            r1 = 1380505685(0x5248d855, float:2.15655727E11)
            goto L_0x17f0
        L_0x0511:
            r0 = -951387594(0xffffffffc74afa36, float:-51962.21)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r3 = "addMentionsTask_network_error"
            r2 = 2131831662(0x7f112b6e, float:1.9296356E38)
            r1 = 0
            X.C63813iO.A03(r4, r3, r2, r1)
            r1 = 2003565739(0x776bfcab, float:4.7863847E33)
            goto L_0x17f0
        L_0x052a:
            r0 = -1172916885(0xffffffffba16b56b, float:-5.749079E-4)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r1 = r2.getContext()
            if (r1 != 0) goto L_0x0540
            r1 = 2032551021(0x7926446d, float:5.395682E34)
            goto L_0x17f0
        L_0x0540:
            android.content.Context r3 = r2.getContext()
            r2 = 0
            java.lang.String r1 = "Error loading a QP"
            X.C63813iO.A0D(r3, r1, r2)
            r1 = -1594791751(0xffffffffa0f168b9, float:-4.0896288E-19)
            goto L_0x17f0
        L_0x054f:
            r0 = -1983895974(0xffffffff89c0265a, float:-4.6258384E-33)
            int r0 = X.C14030oh.A03(r0)
            r4 = 0
            X.C04220Ms.A0B(r15, r4)
            java.lang.Object r1 = r14.A00
            X.4JP r1 = (X.AnonymousClass4JP) r1
            android.content.Context r3 = r1.A00
            r1 = 2131834837(0x7f1137d5, float:1.9302796E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r3, r1)
            java.lang.Object r1 = r15.A00
            X.4vo r1 = (X.C85814vo) r1
            if (r1 == 0) goto L_0x0574
            java.lang.String r1 = r1.getErrorMessage()
            if (r1 == 0) goto L_0x0574
            r2 = r1
        L_0x0574:
            r1 = 0
            X.C63813iO.A02(r3, r2, r1, r4)
            r1 = 1482478101(0x585cd215, float:9.7117941E14)
            goto L_0x17f0
        L_0x057d:
            r0 = -619455951(0xffffffffdb13da31, float:-4.1616726E16)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.4JI r1 = (X.AnonymousClass4JI) r1
            android.content.Context r3 = r1.A00
            r2 = 2131827051(0x7f11196b, float:1.9287004E38)
            r1 = 0
            X.C63813iO.A0A(r3, r2, r1)
            r1 = 1891588428(0x70bf594c, float:4.7375672E29)
            goto L_0x17f0
        L_0x0596:
            r0 = 142756938(0x8824c4a, float:7.842026E-34)
            int r0 = X.C14030oh.A03(r0)
            if (r15 == 0) goto L_0x05be
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x05be
            X.4vo r2 = (X.C85814vo) r2
            java.lang.String r1 = r2.getErrorMessage()
            if (r1 == 0) goto L_0x05be
            java.lang.String r3 = r2.getErrorMessage()
        L_0x05af:
            java.lang.Object r1 = r14.A00
            X.4JH r1 = (X.AnonymousClass4JH) r1
            android.content.Context r2 = r1.A00
            r1 = 0
            X.C63813iO.A0D(r2, r3, r1)
            r1 = 1358092281(0x50f2d7f9, float:3.2593922E10)
            goto L_0x17f0
        L_0x05be:
            java.lang.Object r1 = r14.A00
            X.4JH r1 = (X.AnonymousClass4JH) r1
            android.content.Context r2 = r1.A00
            r1 = 2131834837(0x7f1137d5, float:1.9302796E38)
            java.lang.String r3 = r2.getString(r1)
            goto L_0x05af
        L_0x05cc:
            r0 = 1430103332(0x553da524, float:1.30323107E13)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r14.A00
            X.4Hc r6 = (X.C70994Hc) r6
            android.content.Context r5 = r6.A00
            r4 = 2131825775(0x7f11146f, float:1.9284416E38)
            r1 = 2131232571(0x7f08073b, float:1.8081255E38)
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r1)
            X.3iD r3 = X.C63733iD.A01()
            X.22b r1 = X.AnonymousClass22b.CIRCULAR
            r3.A0E(r1)
            X.C63733iD.A07(r5, r3, r4)
            r3.A0C()
            if (r2 == 0) goto L_0x05f7
            X.C63733iD.A05(r5, r2, r3)
        L_0x05f7:
            r1 = 2131834950(0x7f113846, float:1.9303025E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r5, r1)
            r3.A0D = r1
            r2 = 6
            com.facebook.redex.IDxCBackShape392S0100000_1_I2 r1 = new com.facebook.redex.IDxCBackShape392S0100000_1_I2
            r1.<init>(r6, r2)
            r3.A07 = r1
            r1 = 1
            r3.A0I = r1
            X.KHr r1 = X.C38040KHr.A01
            X.C63733iD.A09(r1, r3)
            r1 = -567542996(0xffffffffde2bfb2c, float:-3.09813679E18)
            goto L_0x17f0
        L_0x0615:
            r0 = -1422153752(0xffffffffab3ba7e8, float:-6.666876E-13)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.4Hb r1 = (X.C70984Hb) r1
            android.content.Context r3 = r1.A00
            r1 = 2131835592(0x7f113ac8, float:1.9304327E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 0
            X.0z7 r1 = X.C19080z7.A00(r3, r2, r1)
            r1.show()
            r1 = -993327415(0xffffffffc4cb06c9, float:-1624.212)
            goto L_0x17f0
        L_0x0636:
            r0 = -1467464437(0xffffffffa888450b, float:-1.5128976E-14)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r1 = 0
            r2.invoke(r1)
            r1 = -598865684(0xffffffffdc4e08ec, float:-2.3197462E17)
            goto L_0x17f0
        L_0x064a:
            r0 = -263098835(0xfffffffff0516e2d, float:-2.5926225E29)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r5 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r5
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            r3 = 2131834837(0x7f1137d5, float:1.9302796E38)
            r2 = 1
            java.lang.String r1 = "load_user_error"
            X.C63813iO.A03(r4, r1, r3, r2)
            java.lang.Object r1 = r5.A00
            X.3ZJ r1 = (X.AnonymousClass3ZJ) r1
            r1.A06()
            r1 = 350347716(0x14e1e1c4, float:2.2808243E-26)
            goto L_0x17f0
        L_0x066e:
            r0 = -1639817233(0xffffffff9e425fef, float:-1.0290113E-20)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r5 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r5
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            java.lang.String r4 = r5.getString(r1)
            java.lang.Object r2 = r15.A00
            r3 = 0
            if (r2 == 0) goto L_0x0697
            X.1j3 r2 = (X.AnonymousClass1j3) r2
            java.util.List r1 = r2.mErrorStrings
            if (r1 == 0) goto L_0x0697
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0697
            java.util.List r1 = r2.mErrorStrings
            java.lang.String r4 = X.C18190wL.A0q(r1, r3)
        L_0x0697:
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A03(r5, r4)
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            if (r2 == 0) goto L_0x06ac
            X.E2V r1 = X.E2V.A03(r2)
            r1.setIsLoading(r3)
            java.lang.String r1 = "save_failed"
            X.C63813iO.A02(r2, r4, r1, r3)
        L_0x06ac:
            r1 = -1638742137(0xffffffff9e52c787, float:-1.1158569E-20)
            goto L_0x17f0
        L_0x06b1:
            r0 = -950174917(0xffffffffc75d7b3b, float:-56699.23)
            int r7 = X.C14030oh.A03(r0)
            r0 = -1709719325(0xffffffff9a17c0e3, float:-3.138188E-23)
            goto L_0x12e9
        L_0x06bd:
            r0 = -1871588200(0xffffffff9071d498, float:-4.7692646E-29)
            int r7 = X.C14030oh.A03(r0)
            r0 = 244611711(0xe947a7f, float:3.6602776E-30)
            goto L_0x12e9
        L_0x06c9:
            r0 = 668711171(0x27dbb903, float:6.09853E-15)
            int r7 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.String r6 = X.C63483hZ.A00(r15)
            java.lang.Object r1 = r14.A00
            X.1b5 r1 = (X.AnonymousClass1b5) r1
            java.lang.String r0 = X.C18230wP.A0l(r1)
            java.lang.String r5 = X.C63483hZ.A03(r15, r0)
            X.0i6 r4 = r1.A01
            java.lang.String r3 = "sign_up_with_biz_option"
            java.lang.String r2 = r1.A04
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            X.0rn r1 = X.C34512Jv.A00(r0)
            X.C18250wR.A19(r1, r3)
            java.lang.String r0 = "entry_point"
            r1.A0D(r0, r2)
            java.lang.String r0 = "error_identifier"
            r1.A0D(r0, r6)
            java.lang.String r0 = "error_message"
            r1.A0D(r0, r5)
            if (r4 == 0) goto L_0x070b
            X.C18180wK.A1K(r1, r4)
            r0 = -806350896(0xffffffffcff00fd0, float:-8.0551363E9)
            goto L_0x12e9
        L_0x070b:
            java.lang.IllegalStateException r5 = X.AnonymousClass0wJ.A0b()
            throw r5
        L_0x0710:
            r0 = -754351139(0xffffffffd30983dd, float:-5.9062282E11)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1ca r1 = (X.C23151ca) r1
            android.view.View r2 = r1.A02
            r1 = 8
            r2.setVisibility(r1)
            r1 = -779121476(0xffffffffd18f8cbc, float:-7.7067682E10)
            goto L_0x17f0
        L_0x0727:
            r0 = -1137253609(0xffffffffbc36e317, float:-0.011162541)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.Iat r1 = (X.C34575Iat) r1
            r4 = 0
            r1.A02(r4)
            android.content.Context r3 = r1.getContext()
            r2 = 0
            r1 = 2131837305(0x7f114179, float:1.9307801E38)
            X.C63813iO.A03(r3, r2, r1, r4)
            r1 = -1933015870(0xffffffff8cc884c2, float:-3.089478E-31)
            goto L_0x17f0
        L_0x0746:
            r0 = -802259334(0xffffffffd02e7e7a, float:-1.17100974E10)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r1)
            r1 = 2131831662(0x7f112b6e, float:1.9296356E38)
            r2.A0K(r1)
            X.C18180wK.A1M(r2)
            X.AnonymousClass0wJ.A1K(r2)
            r1 = 2115211300(0x7e139024, float:4.9036234E37)
            goto L_0x17f0
        L_0x0766:
            r0 = 1398692361(0x535e5a09, float:9.5499328E11)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x078f
            X.1j3 r2 = (X.AnonymousClass1j3) r2
            java.lang.String r1 = r2.getErrorMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x078f
            java.lang.Object r3 = r14.A00
            X.1cj r3 = (X.AnonymousClass1cj) r3
            java.lang.String r2 = r2.getErrorMessage()
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            r3.Cth(r2, r1)
        L_0x078a:
            r1 = -496655425(0xffffffffe265a3bf, float:-1.0590259E21)
            goto L_0x17f0
        L_0x078f:
            java.lang.Object r1 = r14.A00
            X.1cj r1 = (X.AnonymousClass1cj) r1
            X.AnonymousClass1cj.A04(r1)
            goto L_0x078a
        L_0x0797:
            r0 = 142799200(0x882f160, float:7.880837E-34)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1ce r3 = (X.C23191ce) r3
            com.instagram.registration.ui.NotificationBar r1 = r3.A00
            if (r1 == 0) goto L_0x07af
            java.lang.String r2 = X.C18230wP.A0l(r3)
            com.instagram.registration.ui.NotificationBar r1 = r3.A00
            X.C63553hn.A08(r1, r2)
        L_0x07af:
            com.instagram.service.session.UserSession r7 = r3.A02
            X.265 r1 = X.AnonymousClass265.A07
            X.AnonymousClass0wJ.A1N(r7, r1)
            double r5 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.0nS r2 = X.C13330nS.A02(r7)
            java.lang.String r1 = "save_additional_phone_fail"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2678(0xa76, float:3.753E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            X.AnonymousClass0wJ.A1B(r2, r5, r3)
            X.C18180wK.A1A(r2, r3)
            java.lang.String r1 = "additional_contact"
            X.AnonymousClass269.A08(r2, r1)
            X.C63683i7.A08(r2)
            X.C63683i7.A09(r2, r7)
            X.C63683i7.A07(r2)
            X.C18180wK.A19(r2)
            r2.Bb4()
            r1 = -1043853278(0xffffffffc1c81022, float:-25.007877)
            goto L_0x17f0
        L_0x07ed:
            r0 = 323102535(0x13422747, float:2.4505608E-27)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.1sg r1 = (X.C27541sg) r1
            java.lang.String r2 = X.C18230wP.A0l(r1)
            com.instagram.registration.ui.NotificationBar r1 = r1.A05
            X.C63553hn.A08(r1, r2)
            r1 = 722989784(0x2b17f2d8, float:5.398299E-13)
            goto L_0x17f0
        L_0x0809:
            r0 = 902570611(0x35cc2273, float:1.520921E-6)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1Yr r4 = (X.C22591Yr) r4
            X.0i6 r7 = r4.A02
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            X.2A6 r6 = r4.A01
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            X.29J r1 = X.AnonymousClass29J.NAME
            r2.add((java.lang.Object) r1)
            X.10C r1 = r4.A03
            com.instagram.common.typedurl.ImageUrl r1 = r1.A01
            boolean r1 = X.AnonymousClass3WG.A02(r1)
            if (r1 != 0) goto L_0x0832
            X.29J r1 = X.AnonymousClass29J.PROFILE_PHOTO
            r2.add((java.lang.Object) r1)
        L_0x0832:
            com.google.common.collect.ImmutableList r5 = r2.build()
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            X.218 r2 = X.AnonymousClass218.FACEBOOK
            r3.add((java.lang.Object) r2)
            X.10C r1 = r4.A03
            com.instagram.common.typedurl.ImageUrl r1 = r1.A01
            boolean r1 = X.AnonymousClass3WG.A02(r1)
            if (r1 != 0) goto L_0x084c
            r3.add((java.lang.Object) r2)
        L_0x084c:
            com.google.common.collect.ImmutableList r1 = r3.build()
            X.AnonymousClass0wJ.A1N(r7, r6)
            X.AnonymousClass0wJ.A1Q(r5, r1)
            X.2A7 r2 = X.AnonymousClass2A7.A02
            java.util.Map r1 = X.C63243h6.A00(r5, r1)
            X.C63243h6.A01(r2, r6, r7, r1)
            android.content.Context r1 = r4.getContext()
            if (r1 != 0) goto L_0x086e
            r1 = -1
            X.C22591Yr.A01(r4, r1)
        L_0x0869:
            r1 = 1266498517(0x4b7d3bd5, float:1.6595925E7)
            goto L_0x17f0
        L_0x086e:
            X.Dsm r3 = X.C18190wL.A0W(r1)
            r1 = 2131836526(0x7f113e6e, float:1.9306221E38)
            r3.A0L(r1)
            X.10C r1 = r4.A03
            boolean r1 = r1.A0C
            if (r1 == 0) goto L_0x0896
            r2 = 2131836527(0x7f113e6f, float:1.9306223E38)
            r1 = 113(0x71, float:1.58E-43)
            X.C18180wK.A1O(r3, r4, r1, r2)
            r2 = 2131836525(0x7f113e6d, float:1.930622E38)
            r1 = 114(0x72, float:1.6E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = X.C18220wO.A0O(r4, r1)
            r3.A0N(r1, r2)
        L_0x0892:
            X.AnonymousClass0wJ.A1K(r3)
            goto L_0x0869
        L_0x0896:
            r2 = 2131836525(0x7f113e6d, float:1.930622E38)
            r1 = 115(0x73, float:1.61E-43)
            X.C18180wK.A1O(r3, r4, r1, r2)
            goto L_0x0892
        L_0x089f:
            r0 = -1264080707(0xffffffffb4a7a8bd, float:-3.1228947E-7)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1Yr r5 = (X.C22591Yr) r5
            X.0i6 r4 = r5.A02
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            X.2A6 r3 = r5.A01
            X.AnonymousClass0wJ.A1N(r4, r3)
            X.2A7 r2 = X.AnonymousClass2A7.A04
            r1 = 0
            X.C63243h6.A01(r2, r3, r4, r1)
            r1 = -1
            X.C22591Yr.A01(r5, r1)
            r1 = 1533857974(0x5b6cd0b6, float:6.6657575E16)
            goto L_0x17f0
        L_0x08c2:
            r0 = 1059557922(0x3f279222, float:0.65457356)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.3aW r1 = (X.C62683aW) r1
            X.C62683aW.A02(r1)
            r1 = -1587571661(0xffffffffa15f9433, float:-7.575148E-19)
            goto L_0x17f0
        L_0x08d5:
            r0 = -1439061144(0xffffffffaa39ab68, float:-1.6490769E-13)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1k1 r3 = (X.AnonymousClass1k1) r3
            X.IcN r1 = r3.A02
            java.lang.String r6 = X.C18230wP.A0l(r1)
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x08f9
            X.4vo r1 = (X.C85814vo) r1
            java.lang.String r2 = r1.getErrorMessage()
            if (r2 == 0) goto L_0x08f9
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x08f9
            r6 = r2
        L_0x08f9:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A03
            java.lang.String r3 = "activity_feed_reminder"
            r5 = 0
            java.lang.String r4 = "activity_feed"
            X.JrQ r2 = new X.JrQ
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Bdy(r2)
            r1 = -659751412(0xffffffffd8acfe0c, float:-1.52165698E15)
            goto L_0x17f0
        L_0x0911:
            r0 = 1888026803(0x708900b3, float:3.3920233E29)
            int r7 = X.C14030oh.A03(r0)
            r0 = -308194493(0xffffffffeda15343, float:-6.240968E27)
            goto L_0x12e9
        L_0x091d:
            r0 = 1178277005(0x463b148d, float:11973.138)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r1 = r14.A00
            X.1c0 r1 = (X.AnonymousClass1c0) r1
            android.content.Context r2 = r1.requireContext()
            X.0Oa r1 = r1.A03
            r1.getValue()
            X.C62973bE.A02(r2, r15)
            r1 = 1065088352(0x3f7bf560, float:0.9842129)
            goto L_0x17f0
        L_0x0939:
            r0 = 474584650(0x1c49964a, float:6.6699565E-22)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.1ZZ r1 = (X.AnonymousClass1ZZ) r1
            android.content.Context r2 = r1.requireContext()
            X.0Oa r1 = r1.A03
            r1.getValue()
            X.C62973bE.A02(r2, r15)
            r1 = 688026936(0x29027538, float:2.896747E-14)
            goto L_0x17f0
        L_0x0958:
            r0 = -1147720966(0xffffffffbb972afa, float:-0.0046132775)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.1bn r1 = (X.C23021bn) r1
            android.content.Context r2 = r1.requireContext()
            X.0Oa r1 = r1.A04
            r1.getValue()
            X.C62973bE.A02(r2, r15)
            r1 = -1690758963(0xffffffff9b3910cd, float:-1.530827E-22)
            goto L_0x17f0
        L_0x0977:
            r0 = 728379018(0x2b6a2e8a, float:8.3198086E-13)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.1wr r1 = (X.AnonymousClass1wr) r1
            X.AnonymousClass1wr.A0B(r1)
            r1 = 1083123467(0x408f270b, float:4.473516)
            goto L_0x17f0
        L_0x098d:
            r0 = -2059654898(0xffffffff853c290e, float:-8.847258E-36)
            int r7 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r2 = r14.A00
            X.1Yw r2 = (X.C22641Yw) r2
            android.os.Handler r1 = r2.A00
            if (r1 != 0) goto L_0x09a3
            java.lang.String r0 = "notificationStatusHandler"
            goto L_0x1472
        L_0x09a3:
            java.lang.Runnable r0 = r2.A0U
            r1.removeCallbacks(r0)
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x09b5
            android.content.Context r0 = r2.requireContext()
            X.C62973bE.A01(r0)
        L_0x09b5:
            r0 = 1579922610(0x5e2bb4b2, float:3.09317745E18)
            goto L_0x12e9
        L_0x09ba:
            r0 = 2066586849(0x7b2d9ce1, float:9.014492E35)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = X.C18220wO.A0A(r1)
            X.C62973bE.A02(r1, r15)
            r1 = -741312776(0xffffffffd3d076f8, float:-1.79069832E12)
            goto L_0x17f0
        L_0x09cf:
            r0 = -360044548(0xffffffffea8a27fc, float:-8.351029E25)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r5 = r14.A00
            X.1Yw r5 = (X.C22641Yw) r5
            android.content.Context r1 = r5.requireContext()
            r4 = 0
            X.C62973bE.A02(r1, r15)
            X.0bf r3 = r5.A09
            if (r3 != 0) goto L_0x09ec
            java.lang.String r0 = "loggedOutSession"
        L_0x09e8:
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x09ec:
            java.lang.String r2 = "next_blocked"
            X.265 r1 = r5.A0C
            if (r1 != 0) goto L_0x09f5
            java.lang.String r0 = "twoFacStage"
            goto L_0x09e8
        L_0x09f5:
            X.C63313hF.A04(r3, r4, r1, r2)
            r1 = -1663378953(0xffffffff9cdad9f7, float:-1.4482372E-21)
            goto L_0x17f0
        L_0x09fd:
            r0 = 1628786976(0x61155120, float:1.7215066E20)
            int r5 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r4 = r14.A00
            X.1Yw r4 = (X.C22641Yw) r4
            android.content.Context r0 = r4.requireContext()
            r3 = 0
            X.C62973bE.A02(r0, r15)
            X.0bf r2 = r4.A09
            if (r2 != 0) goto L_0x0a1a
            java.lang.String r0 = "loggedOutSession"
        L_0x0a16:
            X.C04220Ms.A0E(r0)
            throw r3
        L_0x0a1a:
            java.lang.String r1 = "next_blocked"
            X.265 r0 = r4.A0C
            if (r0 != 0) goto L_0x0a23
            java.lang.String r0 = "twoFacStage"
            goto L_0x0a16
        L_0x0a23:
            X.C63313hF.A04(r2, r3, r0, r1)
            r0 = -61226317(0xfffffffffc59c2b3, float:-4.5227096E36)
            X.C14030oh.A0A(r0, r5)
            return
        L_0x0a2d:
            r0 = 1187431270(0x46c6c366, float:25441.7)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r5 = r15.A00
            X.1j3 r5 = (X.AnonymousClass1j3) r5
            if (r5 == 0) goto L_0x0a63
            java.lang.Object r4 = r14.A00
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.String r1 = r5.getErrorMessage()
            if (r1 == 0) goto L_0x0a73
            android.content.Context r3 = r4.requireContext()
            java.lang.String r2 = r5.mErrorTitle
            if (r2 == 0) goto L_0x0a55
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0a5c
        L_0x0a55:
            r1 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r2 = r4.getString(r1)
        L_0x0a5c:
            java.lang.String r1 = r5.getErrorMessage()
            X.C62973bE.A04(r3, r1, r2)
        L_0x0a63:
            java.lang.Object r2 = r14.A00
            X.1Zj r2 = (X.C22761Zj) r2
            android.view.View r1 = r2.mView
            if (r1 == 0) goto L_0x0a80
            android.view.ViewStub r2 = r2.A01
            if (r2 != 0) goto L_0x0a7b
            java.lang.String r0 = "loadingViewStub"
            goto L_0x1472
        L_0x0a73:
            android.content.Context r1 = r4.requireContext()
            X.C62973bE.A01(r1)
            goto L_0x0a63
        L_0x0a7b:
            r1 = 8
            r2.setVisibility(r1)
        L_0x0a80:
            r1 = 745588060(0x2c70c55c, float:3.4215608E-12)
            goto L_0x17f0
        L_0x0a85:
            r0 = -636987128(0xffffffffda085908, float:-9.5946219E15)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r0 = r14.A00
            X.1am r0 = (X.C22841am) r0
            android.content.Context r1 = r0.requireContext()
            X.0Oa r0 = r0.A08
            r0.getValue()
            X.C62973bE.A02(r1, r15)
            r0 = 542799298(0x205a75c2, float:1.8504281E-19)
            goto L_0x1057
        L_0x0aa1:
            r0 = 1297240185(0x4d525079, float:2.20530576E8)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r4 = r14.A00
            X.1aN r4 = (X.AnonymousClass1aN) r4
            X.0Oa r3 = r4.A0B
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Object r1 = r15.A00
            X.1T5 r1 = (X.AnonymousClass1T5) r1
            if (r1 == 0) goto L_0x0abc
            java.lang.String r1 = r1.A00
            if (r1 != 0) goto L_0x0abe
        L_0x0abc:
            java.lang.String r1 = "unknown"
        L_0x0abe:
            X.AnonymousClass3WQ.A01(r2, r1)
            android.content.Context r1 = r4.requireContext()
            r3.getValue()
            X.C62973bE.A02(r1, r15)
            r1 = 51134610(0x30c4092, float:4.1216425E-37)
            goto L_0x17f0
        L_0x0ad0:
            r0 = -410184426(0xffffffffe78d1516, float:-1.3324853E24)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            X.C63873iU.A0G(r14, r15)
            r0 = -191551554(0xfffffffff49527be, float:-9.453837E31)
            goto L_0x1057
        L_0x0adf:
            r0 = -1972336520(0xffffffff8a708878, float:-1.15812466E-32)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            X.C63873iU.A0G(r14, r15)
            r0 = 1673530179(0x63c00b43, float:7.0851727E21)
            goto L_0x1057
        L_0x0aee:
            r0 = 1067451270(0x3fa00386, float:1.2501075)
            int r2 = X.C14030oh.A03(r0)
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            java.lang.Object r1 = r14.A00
            X.1aN r1 = (X.AnonymousClass1aN) r1
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x0b3f
            android.content.Context r0 = r1.requireContext()
            X.0Oa r1 = r1.A0B
            r1.getValue()
            X.C62973bE.A02(r0, r15)
            java.lang.Object r0 = r15.A00
            X.1j3 r0 = (X.AnonymousClass1j3) r0
            if (r0 == 0) goto L_0x0b19
            java.lang.String r3 = r0.mErrorMessage
            if (r3 != 0) goto L_0x0b1b
        L_0x0b19:
            java.lang.String r3 = "unknown"
        L_0x0b1b:
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r1)
            X.C18200wM.A1S(r1, r3)
            X.0kW r0 = X.C60923Rc.A01
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "instagram_two_fac_setup_verification_failure"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2319(0x90f, float:3.25E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "reason"
            r1.A0T(r0, r3)
            X.C63833iQ.A0D(r1)
            r1.Bb4()
        L_0x0b3f:
            r0 = -1628981641(0xffffffff9ee7b677, float:-2.4533542E-20)
            goto L_0x1057
        L_0x0b44:
            r0 = 1165555100(0x4578f59c, float:3983.3506)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            X.C63873iU.A0G(r14, r15)
            r0 = 1594664752(0x5f0ca730, float:1.0135122E19)
            goto L_0x1057
        L_0x0b53:
            r0 = 1947233061(0x74106b25, float:4.576806E31)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r4 = r14.A00
            X.1aN r4 = (X.AnonymousClass1aN) r4
            X.0Oa r3 = r4.A0B
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Object r1 = r15.A00
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            if (r1 == 0) goto L_0x0b6e
            java.lang.String r1 = r1.mErrorMessage
            if (r1 != 0) goto L_0x0b70
        L_0x0b6e:
            java.lang.String r1 = "unknown"
        L_0x0b70:
            X.AnonymousClass3WQ.A01(r2, r1)
            android.content.Context r1 = r4.requireContext()
            r3.getValue()
            X.C62973bE.A02(r1, r15)
            r1 = -1098932465(0xffffffffbe7f9f0f, float:-0.2496302)
            goto L_0x17f0
        L_0x0b82:
            r0 = -1290174270(0xffffffffb31980c2, float:-3.5740193E-8)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r0 = r14.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            android.content.Context r1 = r0.requireContext()
            X.0Oa r0 = r0.A0B
            r0.getValue()
            X.C62973bE.A02(r1, r15)
            r0 = -963614440(0xffffffffc6906918, float:-18484.547)
            goto L_0x1057
        L_0x0b9e:
            r0 = -500724461(0xffffffffe2278d13, float:-7.726929E20)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r4 = r14.A00
            X.1aN r4 = (X.AnonymousClass1aN) r4
            X.0Oa r3 = r4.A0B
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.String r0 = "unknown"
            X.AnonymousClass3WQ.A01(r1, r0)
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x0bc4
            android.content.Context r0 = r4.requireContext()
            r3.getValue()
            X.C62973bE.A02(r0, r15)
        L_0x0bc4:
            r0 = 703012996(0x29e72084, float:1.0264101E-13)
            goto L_0x1057
        L_0x0bc9:
            r0 = 625732749(0x254bec8d, float:1.768759E-16)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            X.C63873iU.A0G(r14, r15)
            r0 = 1014703079(0x3c7b23e7, float:0.015328384)
            goto L_0x1057
        L_0x0bd8:
            r0 = -767048734(0xffffffffd247c3e2, float:-2.14496215E11)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            android.content.Context r0 = X.C18220wO.A0A(r0)
            X.C62973bE.A01(r0)
            r0 = 417359971(0x18e06863, float:5.8008047E-24)
            goto L_0x1057
        L_0x0bed:
            r0 = 87915911(0x53d7d87, float:8.909793E-36)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.1bL r3 = (X.AnonymousClass1bL) r3
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x0c0a
            android.content.Context r1 = r3.requireContext()
            X.0Oa r0 = r3.A03
            r0.getValue()
            X.C62973bE.A02(r1, r15)
        L_0x0c0a:
            r0 = -1300388482(0xffffffffb27da57e, float:-1.4764167E-8)
            goto L_0x1057
        L_0x0c0f:
            r0 = 976684295(0x3a370507, float:6.981645E-4)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r0 = r14.A00
            X.1bN r0 = (X.AnonymousClass1bN) r0
            android.content.Context r1 = r0.requireContext()
            X.0Oa r0 = r0.A00
            r0.getValue()
            X.C62973bE.A02(r1, r15)
            r0 = 544624576(0x20764fc0, float:2.0863398E-19)
            goto L_0x1057
        L_0x0c2e:
            r0 = 300107113(0x11e34569, float:3.5857062E-28)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.1ZN r3 = (X.AnonymousClass1ZN) r3
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x0c4b
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0Oa r0 = r3.A05
            r0.getValue()
            X.C62973bE.A02(r1, r15)
        L_0x0c4b:
            r0 = -1279146829(0xffffffffb3c1c4b3, float:-9.023042E-8)
            goto L_0x1057
        L_0x0c50:
            r0 = -565013594(0xffffffffde5293a6, float:-3.79341352E18)
            int r2 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r3 = r0.requireContext()
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0c68
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.getString(r0)
        L_0x0c68:
            X.C62973bE.A02(r3, r15)
            r0 = -620528340(0xffffffffdb037d2c, float:-3.701085E16)
            goto L_0x1057
        L_0x0c70:
            r0 = 1299056928(0x4d6e0920, float:2.49598464E8)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            X.C62973bE.A02(r0, r15)
            r0 = -1605823486(0xffffffffa0491402, float:-1.7031982E-19)
            goto L_0x1057
        L_0x0c85:
            r0 = -188417896(0xfffffffff4c4f898, float:-1.2484525E32)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Throwable r2 = r15.A01
            if (r2 == 0) goto L_0x0cb6
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x0cb6
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = r2.getMessage()
            android.content.Context r1 = r1.getContext()
            X.Dsm r1 = X.C18190wL.A0W(r1)
            r1.A02 = r2
            X.C18180wK.A1M(r1)
            X.AnonymousClass0wJ.A1K(r1)
        L_0x0cb1:
            r1 = 1416902263(0x54743677, float:4.19554315E12)
            goto L_0x17f0
        L_0x0cb6:
            java.lang.Object r2 = r14.A00
            X.1d9 r2 = (X.AnonymousClass1d9) r2
            r1 = 2131836954(0x7f11401a, float:1.930709E38)
            r2.A01(r1)
            goto L_0x0cb1
        L_0x0cc1:
            r0 = 1376718363(0x520f0e1b, float:1.53604243E11)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x0cf4
            X.1j3 r2 = (X.AnonymousClass1j3) r2
            java.lang.String r1 = r2.getErrorMessage()
            if (r1 == 0) goto L_0x0cf4
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = r2.getErrorMessage()
            android.content.Context r1 = r1.getContext()
            X.Dsm r1 = X.C18190wL.A0W(r1)
            r1.A02 = r2
            X.C18180wK.A1M(r1)
            X.AnonymousClass0wJ.A1K(r1)
        L_0x0cef:
            r1 = -505655711(0xffffffffe1dc4e61, float:-5.0799144E20)
            goto L_0x17f0
        L_0x0cf4:
            java.lang.Object r2 = r14.A00
            X.1d9 r2 = (X.AnonymousClass1d9) r2
            r1 = 2131836953(0x7f114019, float:1.9307087E38)
            r2.A01(r1)
            goto L_0x0cef
        L_0x0cff:
            r0 = -640155819(0xffffffffd9d7ff55, float:-7.5997326E15)
            int r2 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.1d9 r1 = (X.AnonymousClass1d9) r1
            r0 = 2131836954(0x7f11401a, float:1.930709E38)
            r1.A01(r0)
            r0 = -1643794295(0xffffffff9e05b089, float:-7.077468E-21)
            goto L_0x1057
        L_0x0d18:
            r0 = -1954986606(0xffffffff8b794592, float:-4.8007995E-32)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1aA r0 = (X.AnonymousClass1aA) r0
            android.content.Context r1 = r0.requireContext()
            com.instagram.service.session.UserSession r0 = r0.A0E
            X.C05030Qo.A04(r0)
            X.C62973bE.A02(r1, r15)
            r0 = 731535103(0x2b9a56ff, float:1.0966504E-12)
            goto L_0x1057
        L_0x0d34:
            r0 = -656333490(0xffffffffd8e1254e, float:-1.98040271E15)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1aA r3 = (X.AnonymousClass1aA) r3
            com.instagram.service.session.UserSession r1 = r3.A0E
            java.lang.String r0 = "The API creation line before this callback is used additionally includes checkNotNulls in IgApi.Builder to assert that the user session is not null"
            X.AnonymousClass0KW.A00(r1, r0)
            android.content.Context r0 = r3.requireContext()
            X.C62973bE.A02(r0, r15)
            r0 = -1714572008(0xffffffff99cdb518, float:-2.1269646E-23)
            goto L_0x1057
        L_0x0d52:
            r0 = 985297212(0x3aba713c, float:0.001422442)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1co r4 = (X.C23231co) r4
            X.3F8 r0 = r4.A06
            X.01V r3 = r0.A00
            r1 = 857809457(0x33212231, float:3.751683E-8)
            r0 = 3
            r3.markerEnd(r1, r0)
            android.content.Context r0 = r4.getContext()
            X.C62973bE.A02(r0, r15)
            r0 = -707208266(0xffffffffd5d8dbb6, float:-2.98047704E13)
            goto L_0x1057
        L_0x0d74:
            r0 = -2047644963(0xffffffff85f36add, float:-2.2890866E-35)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            X.C62973bE.A02(r0, r15)
            r0 = 1975914571(0x75c6104b, float:5.02151E32)
            goto L_0x1057
        L_0x0d89:
            r0 = -204570633(0xfffffffff3ce7ff7, float:-3.272121E31)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            android.content.Context r3 = X.C18240wQ.A0C(r0)
            r1 = 2131831741(0x7f112bbd, float:1.9296516E38)
            r0 = 0
            X.C63813iO.A0A(r3, r1, r0)
            super.onFail(r15)
            r0 = 640387522(0x262b89c2, float:5.951424E-16)
            goto L_0x1057
        L_0x0da5:
            r0 = -802853535(0xffffffffd0256d61, float:-1.11016356E10)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r1 = r0.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x0dc1
            android.content.Context r0 = r1.getContext()
            X.C62973bE.A01(r0)
        L_0x0dc1:
            r0 = -1810360941(0xffffffff94181593, float:-7.678294E-27)
            goto L_0x1057
        L_0x0dc6:
            r0 = -1402168911(0xffffffffac6c99b1, float:-3.3622933E-12)
            int r2 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r0 = r14.A00
            X.1xX r0 = (X.C29221xX) r0
            X.C29221xX.A0C(r0)
            r0 = 954467565(0x38e404ed, float:1.0872805E-4)
            goto L_0x1057
        L_0x0ddc:
            r0 = -616375577(0xffffffffdb42dae7, float:-5.4846831E16)
            int r2 = X.C14030oh.A03(r0)
            super.onFail(r15)
            r1 = 0
            java.lang.Object r0 = r14.A00
            X.1av r0 = (X.AnonymousClass1av) r0
            r0.A08 = r1
            X.AnonymousClass1av.A00(r0)
            android.content.Context r0 = r0.getContext()
            X.Dsm r1 = X.C18190wL.A0W(r0)
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            r1.A0K(r0)
            X.C18180wK.A1M(r1)
            X.AnonymousClass0wJ.A1K(r1)
            r0 = 1276372240(0x4c13e510, float:3.8769728E7)
            goto L_0x1057
        L_0x0e09:
            r0 = -153753283(0xfffffffff6d5e93d, float:-2.1693161E33)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1aw r4 = (X.AnonymousClass1aw) r4
            X.3F8 r1 = r4.A06
            X.01V r3 = r1.A00
            r2 = 857809457(0x33212231, float:3.751683E-8)
            r1 = 3
            r3.markerEnd(r2, r1)
            r1 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r6 = r4.getString(r1)
            r1 = 2131837305(0x7f114179, float:1.9307801E38)
            java.lang.String r3 = r4.getString(r1)
            java.lang.Object r5 = r15.A00
            if (r5 == 0) goto L_0x0e66
            X.4vo r5 = (X.C85814vo) r5
            java.util.List r1 = r5.getErrorStrings()
            if (r1 == 0) goto L_0x0e5c
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            java.util.Iterator r2 = r1.iterator()
        L_0x0e41:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0e54
            java.lang.String r1 = X.C18180wK.A0k(r2)
            r3.append(r1)
            r1 = 10
            r3.append(r1)
            goto L_0x0e41
        L_0x0e54:
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r1.trim()
        L_0x0e5c:
            java.lang.String r1 = r5.getErrorTitle()
            if (r1 == 0) goto L_0x0e66
            java.lang.String r6 = r5.getErrorTitle()
        L_0x0e66:
            X.AnonymousClass1aw.A02(r4, r3)
            r2 = 1
            r4.A08 = r2
            r4.A0A = r2
            X.AnonymousClass1aw.A01(r4)
            android.content.Context r1 = r4.requireContext()
            X.C62973bE.A04(r1, r3, r6)
            X.C18190wL.A1B(r4)
            com.instagram.igds.components.form.IgFormField r1 = r4.A01
            r1.setEnabled(r2)
            com.instagram.igds.components.form.IgFormField r1 = r4.A03
            r1.setEnabled(r2)
            com.instagram.igds.components.form.IgFormField r1 = r4.A02
            r1.setEnabled(r2)
            r1 = -1131716637(0xffffffffbc8b5fe3, float:-0.017013496)
            goto L_0x17f0
        L_0x0e8f:
            r0 = 1704136866(0x659310a2, float:8.681184E22)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1B(r0)
            android.content.Context r3 = r0.getContext()
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0eaa
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.getString(r0)
        L_0x0eaa:
            X.C62973bE.A02(r3, r15)
            r0 = 2101033215(0x7d3b38ff, float:1.5553848E37)
            goto L_0x1057
        L_0x0eb2:
            r0 = -1343589026(0xffffffffafea755e, float:-4.2647746E-10)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1xV r1 = (X.C29211xV) r1
            android.content.Context r0 = r1.getContext()
            X.C62973bE.A01(r0)
            android.os.Handler r1 = r1.A08
            X.4PB r0 = new X.4PB
            r0.<init>(r14)
            r1.post(r0)
            r0 = 1195732466(0x47456df2, float:50541.945)
            goto L_0x1057
        L_0x0ed3:
            r0 = 1069474815(0x3fbee3ff, float:1.4913329)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1xV r3 = (X.C29211xV) r3
            android.os.Handler r1 = r3.A08
            X.4PA r0 = new X.4PA
            r0.<init>(r14)
            r1.post(r0)
            android.content.Context r0 = r3.getContext()
            X.C62973bE.A02(r0, r15)
            r0 = -1846279488(0xffffffff91f402c0, float:-3.8498107E-28)
            goto L_0x1057
        L_0x0ef4:
            r0 = -761501941(0xffffffffd29c670b, float:-3.35871836E11)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0m7 r0 = r1.mFragmentManager
            X.C61873Wd.A01(r0)
            r0 = 2131826864(0x7f1118b0, float:1.9286624E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = X.C63483hZ.A03(r15, r0)
            android.content.Context r3 = r1.getContext()
            r1 = 0
            java.lang.String r0 = "BusinessConversionUtils.requestAdminPages onFail"
            X.C63813iO.A02(r3, r4, r0, r1)
            r0 = 1670830846(0x6396dafe, float:5.5655833E21)
            goto L_0x1057
        L_0x0f1e:
            r0 = -1590577180(0xffffffffa131b7e4, float:-6.021331E-19)
            int r7 = X.C14030oh.A03(r0)
            r0 = 835564364(0x31cdb34c, float:5.986669E-9)
            goto L_0x12e9
        L_0x0f2a:
            r0 = -1943034159(0xffffffff8c2fa6d1, float:-1.3531709E-31)
            int r7 = X.C14030oh.A03(r0)
            r0 = -624693256(0xffffffffdac3eff8, float:-2.75757344E16)
            goto L_0x12e9
        L_0x0f36:
            r0 = -866712616(0xffffffffcc5703d8, float:-5.6364896E7)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r4 = r15.A00
            boolean r1 = X.AnonymousClass0wJ.A1W(r4)
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0f61
            if (r4 == 0) goto L_0x0f73
            X.8mT r4 = (X.C146578mT) r4
            X.1j9 r3 = new X.1j9
            r3.<init>(r4)
        L_0x0f50:
            java.lang.Object r2 = r14.A00
            X.8m8 r2 = (X.C146368m8) r2
            X.5z1 r1 = new X.5z1
            r1.<init>(r3)
            X.C18240wQ.A1O(r1, r2)
            r1 = -481248923(0xffffffffe350b965, float:-3.8502819E21)
            goto L_0x17f0
        L_0x0f61:
            java.lang.Throwable r1 = r15.A01
            if (r1 == 0) goto L_0x0f6b
            X.1j8 r3 = new X.1j8
            r3.<init>(r1)
            goto L_0x0f50
        L_0x0f6b:
            java.lang.IllegalStateException r5 = X.C18180wK.A0a(r2)
            r1 = -1117843346(0xffffffffbd5f106e, float:-0.054459028)
            goto L_0x0f7a
        L_0x0f73:
            java.lang.IllegalStateException r5 = X.C18180wK.A0a(r2)
            r1 = 2043279876(0x79c9fa04, float:1.3109032E35)
        L_0x0f7a:
            X.C14030oh.A0A(r1, r0)
            throw r5
        L_0x0f7e:
            r0 = -1851840118(0xffffffff919f298a, float:-2.5111377E-28)
            int r7 = X.C14030oh.A03(r0)
            r0 = 1866679143(0x6f434367, float:6.043106E28)
            goto L_0x12e9
        L_0x0f8a:
            r0 = 257496370(0xf591532, float:1.0703008E-29)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.49S r0 = (X.AnonymousClass49S) r0
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "FACEBOOK"
            r1.remove(r0)
            r0 = 1725791427(0x66dd7cc3, float:5.2297222E23)
            goto L_0x1057
        L_0x0fa1:
            r0 = 899622148(0x359f2504, float:1.1857196E-6)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.493 r3 = (X.AnonymousClass493) r3
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.1mD r0 = new X.1mD
            r0.<init>(r3)
            r1.AKp(r0)
            X.1aY r0 = r3.A02
            if (r0 == 0) goto L_0x0fc9
            X.AnonymousClass1aY.A02(r0)
            X.AnonymousClass1aY.A03(r0)
            android.content.Context r0 = r0.A05()
            X.AnonymousClass2MP.A00(r0)
        L_0x0fc9:
            java.lang.String r1 = "DirectWelcomeMessageSettingManager"
            java.lang.String r0 = "Failed to get the welcome message from the server"
            X.C10450iM.A03(r1, r0)
            r0 = 57358658(0x36b3942, float:6.912602E-37)
            goto L_0x1057
        L_0x0fd5:
            r0 = -795023735(0xffffffffd09ce689, float:-2.10588324E10)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.493 r0 = (X.AnonymousClass493) r0
            X.3Rv r4 = r0.A08
            X.29Z r3 = X.AnonymousClass29Z.WELCOME_MESSAGE_SETTINGS_MESSAGE_SAVE_ERROR
            java.lang.String r10 = "There was a HTTP request failure to modify welcome message"
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            X.C61083Rv.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            X.1aY r4 = r0.A02
            if (r4 == 0) goto L_0x104d
            X.AnonymousClass1aY.A02(r4)
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = "business_setting"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x105b
            android.content.Context r1 = r4.A05()
            r0 = 2131232575(0x7f08073f, float:1.8081263E38)
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
            X.3iD r3 = X.C63733iD.A01()
            if (r5 == 0) goto L_0x1023
            X.22b r0 = X.AnonymousClass22b.ICON
            r3.A0E(r0)
            android.content.Context r1 = r4.A05()
            r0 = 2131099864(0x7f0600d8, float:1.7812093E38)
            int r0 = r1.getColor(r0)
            r3.A0D(r5, r0)
        L_0x1023:
            android.content.Context r1 = r4.A05()
            r0 = 2131826095(0x7f1115af, float:1.9285065E38)
            X.C63733iD.A07(r1, r3, r0)
            android.content.Context r1 = r4.A05()
            r0 = 2131826094(0x7f1115ae, float:1.9285063E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r1, r0)
            r3.A0D = r0
            r1 = 4
            com.facebook.redex.IDxCBackShape392S0100000_1_I2 r0 = new com.facebook.redex.IDxCBackShape392S0100000_1_I2
            r0.<init>(r4, r1)
            r3.A07 = r0
            r0 = 1
            r3.A0I = r0
            r3.A0B()
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r3)
        L_0x104d:
            java.lang.String r1 = "DirectWelcomeMessageSettingManager"
            java.lang.String r0 = "Failed to update the welcome message from the server"
            X.C10450iM.A03(r1, r0)
            r0 = -146189250(0xfffffffff749543e, float:-4.0834387E33)
        L_0x1057:
            X.C14030oh.A0A(r0, r2)
            return
        L_0x105b:
            android.app.Activity r1 = r4.A00
            if (r1 == 0) goto L_0x1064
            r0 = 3
            r1.setResult(r0)
            goto L_0x104d
        L_0x1064:
            java.lang.String r0 = "activity"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x106a:
            r0 = -2126592289(0xffffffff813ec6df, float:-3.5040172E-38)
            int r3 = X.C14030oh.A03(r0)
            X.29v r4 = X.C320129v.FETCH_SETTING_FAILURE
            java.lang.Object r0 = r14.A00
            X.49i r0 = (X.C696249i) r0
            com.instagram.service.session.UserSession r0 = r0.A05
            java.lang.String r2 = "fetch setting failed"
            X.0nS r0 = X.C13330nS.A02(r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A07(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x1096
            java.lang.String r0 = "action_name"
            r1.A0O(r4, r0)
            java.lang.String r0 = "exception_message"
            r1.A0T(r0, r2)
            r1.Bb4()
        L_0x1096:
            r0 = -1450959973(0xffffffffa9841b9b, float:-5.8667664E-14)
            goto L_0x14af
        L_0x109b:
            r0 = -1919057962(0xffffffff8d9d7fd6, float:-9.706647E-31)
            int r1 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r14.A00
            com.instagram.creation.fragment.ShareLaterFragment r6 = (com.instagram.creation.fragment.ShareLaterFragment) r6
            X.E2V r0 = X.C18190wL.A0M(r6)
            r3 = 0
            r0.setIsLoading(r3)
            X.Dsm r4 = X.AnonymousClass0wJ.A0V(r6)
            r0 = 2131835753(0x7f113b69, float:1.9304653E38)
            r4.A0L(r0)
            r0 = 2131834837(0x7f1137d5, float:1.9302796E38)
            r4.A0K(r0)
            r2 = 2131826195(0x7f111613, float:1.9285268E38)
            r0 = 36
            X.C18180wK.A1O(r4, r14, r0, r2)
            X.AnonymousClass0wJ.A1K(r4)
            java.lang.Throwable r11 = r15.A01
            java.lang.String r0 = "share_later_fragment_share_failure"
            X.0rn r4 = X.C15730rn.A00(r6, r0)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r6.A03
            boolean r0 = r0.A07
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "facebook_enabled"
            r4.A09(r0, r2)
            if (r11 == 0) goto L_0x1134
            java.lang.String r2 = r11.getMessage()
        L_0x10e4:
            java.lang.String r0 = "error"
            r4.A0D(r0, r2)
            com.instagram.service.session.UserSession r0 = r6.A04
            X.C18180wK.A1K(r4, r0)
            java.lang.String r8 = r6.A08
            com.instagram.service.session.UserSession r7 = r6.A04
            com.instagram.model.sharelater.ShareLaterMedia r0 = r6.A03
            java.lang.String r9 = r0.A05
            r0 = 95
            int r2 = r9.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x1103
            java.lang.String r9 = r9.substring(r3, r2)
        L_0x1103:
            com.instagram.model.sharelater.ShareLaterMedia r0 = r6.A03
            X.Ffc r0 = r0.A02
            int r12 = r0.A00
            java.lang.String r10 = "share_later"
            X.C62943bB.A04(r6, r7, r8, r9, r10, r11, r12)
            com.instagram.service.session.UserSession r7 = r6.A04
            com.instagram.model.sharelater.ShareLaterMedia r0 = r6.A03
            java.lang.String r8 = r0.A05
            java.lang.String r9 = "share_later_view"
            java.lang.String r10 = "share"
            X.C63673i6.A09(r6, r7, r8, r9, r10, r11)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r6.A03
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x112d
            com.instagram.service.session.UserSession r5 = r6.A04
            com.instagram.pendingmedia.model.constants.ShareType r4 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            r3 = 0
            java.lang.String r2 = r6.A08
            java.lang.String r0 = "feed_share_later"
            X.C63353hL.A03(r4, r5, r0, r3, r2)
        L_0x112d:
            r0 = 1801214940(0x6b5c5bdc, float:2.6639747E26)
            X.C14030oh.A0A(r0, r1)
            return
        L_0x1134:
            java.lang.String r2 = "null"
            goto L_0x10e4
        L_0x1137:
            r0 = 1601425710(0x5f73d12e, float:1.7568874E19)
            int r7 = X.C14030oh.A03(r0)
            r0 = -1574358815(0xffffffffa22930e1, float:-2.2929647E-18)
            goto L_0x12e9
        L_0x1143:
            r0 = -725003662(0xffffffffd4c95272, float:-6.917373E12)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            android.content.Context r4 = X.C18240wQ.A0C(r0)
            java.lang.String r2 = "iglive_subscriptions_reminder_failure"
            r1 = 2131828782(0x7f11202e, float:1.9290515E38)
            r0 = 0
            X.C63813iO.A03(r4, r2, r1, r0)
            r0 = 27671082(0x1a63a2a, float:6.106223E-38)
            goto L_0x14af
        L_0x115e:
            r0 = 15147491(0xe721e3, float:2.1226156E-38)
            int r0 = X.C14030oh.A03(r0)
            r4 = 0
            X.C04220Ms.A0B(r15, r4)
            X.2L8 r3 = X.C63873iU.A07(r15)
            java.lang.Object r1 = r14.A00
            kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8 r2 = new kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8
            r2.<init>((int) r4, (java.lang.Object) r1, (java.lang.Object) r3)
            java.lang.String r1 = "LoadingFlow fail"
            X.C63623hv.A09(r1, r2)
            r1 = 355384934(0x152ebe66, float:3.5289218E-26)
            goto L_0x17f0
        L_0x117e:
            r0 = -1289163801(0xffffffffb328ebe7, float:-3.93301E-8)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            X.2L8 r4 = X.C63873iU.A07(r15)
            java.lang.Object r3 = r14.A00
            r1 = 48
            kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7 r2 = new kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7
            r2.<init>(r1, r3, r4)
            java.lang.String r1 = "Flow fail"
            X.C63623hv.A09(r1, r2)
            r1 = -1915360911(0xffffffff8dd5e971, float:-1.31833375E-30)
            goto L_0x17f0
        L_0x119c:
            r0 = -846443084(0xffffffffcd8c4db4, float:-2.94237824E8)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            X.2L8 r3 = X.C63873iU.A07(r15)
            java.lang.Object r2 = r14.A00
            X.8n9 r2 = (X.C146958n9) r2
            X.1jB r1 = new X.1jB
            r1.<init>(r3)
            r2.resumeWith(r1)
            r1 = 1475332981(0x57efcb75, float:5.27314241E14)
            goto L_0x17f0
        L_0x11b8:
            r0 = -1562080638(0xffffffffa2e48a82, float:-6.1946175E-18)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1cP r5 = (X.AnonymousClass1cP) r5
            android.content.Context r2 = r5.requireContext()
            r0 = 2131831666(0x7f112b72, float:1.9296364E38)
            r1 = 0
            java.lang.String r0 = r2.getString(r0)
            X.0z7 r0 = X.C19080z7.A00(r2, r0, r1)
            r0.show()
            X.1fV r4 = r5.A00
            android.content.Context r2 = r5.requireContext()
            X.9uK r1 = X.C170039uK.ERROR
            r0 = 259(0x103, float:3.63E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r5, r0)
            r4.A03(r2, r0, r1)
            r0 = -1561571283(0xffffffffa2ec502d, float:-6.4052818E-18)
            goto L_0x14af
        L_0x11ec:
            r0 = -2081255933(0xffffffff83f28e03, float:-1.4256086E-36)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1cP r5 = (X.AnonymousClass1cP) r5
            android.content.Context r2 = r5.requireContext()
            r0 = 2131831666(0x7f112b72, float:1.9296364E38)
            r1 = 0
            java.lang.String r0 = r2.getString(r0)
            X.0z7 r0 = X.C19080z7.A00(r2, r0, r1)
            r0.show()
            X.1fV r4 = r5.A00
            android.content.Context r2 = r5.requireContext()
            X.9uK r1 = X.C170039uK.ERROR
            r0 = 257(0x101, float:3.6E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r5, r0)
            r4.A03(r2, r0, r1)
            r0 = 962613112(0x39604f78, float:2.1391909E-4)
            goto L_0x14af
        L_0x1220:
            r0 = -1981774219(0xffffffff89e08675, float:-5.405248E-33)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.String r1 = "Challenge"
            java.lang.String r0 = "rewind challenge failed"
            X.C10450iM.A03(r1, r0)
            r0 = -1970142597(0xffffffff8a92027b, float:-1.4060222E-32)
            goto L_0x14af
        L_0x1236:
            r0 = 1622987323(0x60bcd23b, float:1.0884802E20)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.String r1 = "Challenge"
            java.lang.String r0 = "unknown challenge type found"
            X.C10450iM.A03(r1, r0)
            java.lang.Object r0 = r14.A00
            com.instagram.challenge.activity.ChallengeActivity r0 = (com.instagram.challenge.activity.ChallengeActivity) r0
            r0.finish()
            r0 = 2010229107(0x77d1a973, float:8.5048975E33)
            goto L_0x14af
        L_0x1253:
            r0 = 1186723572(0x46bbf6f4, float:24059.477)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1iU r0 = (X.AnonymousClass1iU) r0
            X.4su r1 = r0.A07
            X.266 r0 = r0.A0A
            r1.CGg(r0)
            r0 = 2113882788(0x7dff4aa4, float:4.2417587E37)
            goto L_0x14af
        L_0x126a:
            r0 = 1760687350(0x68f1f4f6, float:9.1408724E24)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r0 = r14.A00
            X.4rL r0 = (X.C83414rL) r0
            r0.CNj()
            r0 = 241235361(0xe60f5a1, float:2.7728398E-30)
            goto L_0x14af
        L_0x1280:
            r0 = -1687823181(0xffffffff9b65dcb3, float:-1.9013748E-22)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.4sc r0 = (X.C84144sc) r0
            r0.Bys(r15)
            r0 = -726378658(0xffffffffd4b4575e, float:-6.1964791E12)
            goto L_0x14af
        L_0x1293:
            r0 = 1906239172(0x719ee6c4, float:1.5736835E30)
            int r3 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r0 = r14.A00
            X.4ss r0 = (X.C84274ss) r0
            r0.CGF()
            r0 = -1787058713(0xffffffff957ba5e7, float:-5.081992E-26)
            goto L_0x14af
        L_0x12a9:
            r0 = -111872448(0xfffffffff954f640, float:-6.911009E34)
            int r7 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1cE r4 = (X.AnonymousClass1cE) r4
            X.0Oa r0 = r4.A05
            java.lang.Object r3 = r0.getValue()
            X.K2b r3 = (X.C37741K2b) r3
            X.Iu2 r0 = X.C35394Iu2.A0t
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "ACCEPTED_NON_DISCRIMINATION"
            java.lang.String r0 = "NETWORK_ERROR"
            r3.A0S(r2, r1, r0)
            android.content.Context r2 = r4.requireContext()
            r0 = 2131833503(0x7f11329f, float:1.930009E38)
            java.lang.String r0 = r4.getString(r0)
            r5 = 0
            r1 = 0
            X.C63813iO.A02(r2, r0, r5, r1)
            X.3Id r0 = r4.A00
            if (r0 != 0) goto L_0x12e3
            java.lang.String r0 = "acceptButtonHolder"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x12e3:
            r0.A04(r1)
            r0 = -1752578583(0xffffffff9789c5e9, float:-8.903377E-25)
        L_0x12e9:
            X.C14030oh.A0A(r0, r7)
            return
        L_0x12ed:
            r0 = -954417128(0xffffffffc71cc018, float:-40128.094)
            int r0 = X.C14030oh.A03(r0)
            r6 = 0
            X.C04220Ms.A0B(r15, r6)
            java.lang.Object r5 = r14.A00
            X.1ai r5 = (X.AnonymousClass1ai) r5
            X.K2b r4 = X.AnonymousClass1ai.A00(r5)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r3 = r1.toString()
            java.lang.Throwable r2 = r15.A01
            java.lang.String r1 = "publish_page"
            r4.A0W(r3, r1, r2)
            X.3Id r1 = r5.A05
            if (r1 == 0) goto L_0x13a4
            r1.A04(r6)
            r1 = 2131833463(0x7f113277, float:1.9300009E38)
            java.lang.String r3 = X.C18180wK.A0g(r5, r1)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x1325
            r1 = 0
            X.C63813iO.A02(r2, r3, r1, r6)
        L_0x1325:
            r1 = -103609514(0xfffffffff9d30b56, float:-1.3697557E35)
            goto L_0x17f0
        L_0x132a:
            r0 = -1820189669(0xffffffff93821c1b, float:-3.2844328E-27)
            int r0 = X.C14030oh.A03(r0)
            r6 = 0
            X.C04220Ms.A0B(r15, r6)
            java.lang.Object r5 = r14.A00
            X.1ai r5 = (X.AnonymousClass1ai) r5
            X.K2b r4 = X.AnonymousClass1ai.A00(r5)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r3 = r1.toString()
            java.lang.Throwable r2 = r15.A01
            java.lang.String r1 = "page_created"
            r4.A0W(r3, r1, r2)
            X.3Id r1 = r5.A05
            if (r1 == 0) goto L_0x13a4
            r1.A04(r6)
            r1 = 2131833452(0x7f11326c, float:1.9299986E38)
            java.lang.String r3 = X.C18180wK.A0g(r5, r1)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x1362
            r1 = 0
            X.C63813iO.A02(r2, r3, r1, r6)
        L_0x1362:
            r1 = 103320969(0x6288d89, float:3.1701272E-35)
            goto L_0x17f0
        L_0x1367:
            r0 = 927103883(0x37427b8b, float:1.1592066E-5)
            int r0 = X.C14030oh.A03(r0)
            r6 = 0
            X.C04220Ms.A0B(r15, r6)
            java.lang.Object r5 = r14.A00
            X.1ai r5 = (X.AnonymousClass1ai) r5
            X.K2b r4 = X.AnonymousClass1ai.A00(r5)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r3 = r1.toString()
            java.lang.Throwable r2 = r15.A01
            java.lang.String r1 = "take_page_onwership"
            r4.A0W(r3, r1, r2)
            X.3Id r1 = r5.A05
            if (r1 == 0) goto L_0x13a4
            r1.A04(r6)
            r1 = 2131833449(0x7f113269, float:1.929998E38)
            java.lang.String r3 = X.C18180wK.A0g(r5, r1)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x139f
            r1 = 0
            X.C63813iO.A02(r2, r3, r1, r6)
        L_0x139f:
            r1 = -629098136(0xffffffffda80b968, float:-1.81163267E16)
            goto L_0x17f0
        L_0x13a4:
            java.lang.String r0 = "actionButtonHolder"
            goto L_0x1472
        L_0x13a8:
            r0 = -427006583(0xffffffffe68c6589, float:-3.3150215E23)
            int r3 = X.C14030oh.A03(r0)
            r6 = 0
            X.C04220Ms.A0B(r15, r6)
            super.onFail(r15)
            java.lang.Object r5 = r14.A00
            X.1aj r5 = (X.AnonymousClass1aj) r5
            X.0Oa r0 = r5.A03
            java.lang.Object r4 = r0.getValue()
            X.K2b r4 = (X.C37741K2b) r4
            X.Iu2 r0 = X.C35394Iu2.A0N
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r15.A01
            java.lang.String r0 = "connect_button"
            r4.A0W(r2, r0, r1)
            r2 = 2131826866(0x7f1118b2, float:1.9286628E38)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x13dc
            r0 = 0
            X.C63813iO.A03(r1, r0, r2, r6)
        L_0x13dc:
            r0 = -220681784(0xfffffffff2d8a9c8, float:-8.582914E30)
            goto L_0x14af
        L_0x13e1:
            r0 = -172217451(0xfffffffff5bc2b95, float:-4.7706824E32)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.3IJ r3 = (X.AnonymousClass3IJ) r3
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A04
            java.lang.String r5 = "onboarding_checklist"
            r7 = 0
            r9 = 0
            r8 = 0
            java.lang.String r6 = r3.A08
            java.lang.Object r1 = r15.A00
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            if (r1 == 0) goto L_0x1401
            java.lang.String r8 = r1.getErrorMessage()
            java.lang.String r9 = r1.mErrorType
        L_0x1401:
            X.JrQ r4 = new X.JrQ
            r10 = r7
            r11 = r7
            r12 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.BcB(r4)
            com.instagram.business.fragment.OnboardingCheckListFragment r1 = r3.A05
            android.content.Context r2 = r1.getContext()
            if (r2 == 0) goto L_0x141a
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
        L_0x141a:
            r1 = 2078704316(0x7be682bc, float:2.3937598E36)
            goto L_0x17f0
        L_0x141f:
            r0 = -904425513(0xffffffffca178fd7, float:-2483189.8)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            com.instagram.business.fragment.SuggestBusinessFragment r2 = (com.instagram.business.fragment.SuggestBusinessFragment) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            if (r1 == 0) goto L_0x1450
            java.lang.String r4 = "pro_account_suggestions"
            r6 = 0
            r8 = 0
            r7 = 0
            java.lang.String r5 = r2.A05
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x1443
            X.4vo r1 = (X.C85814vo) r1
            java.lang.String r7 = r1.getErrorMessage()
            java.lang.String r8 = r1.getErrorType()
        L_0x1443:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            X.JrQ r3 = new X.JrQ
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Bdy(r3)
        L_0x1450:
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x145c
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
        L_0x145c:
            r1 = 673727726(0x282844ee, float:9.34082E-15)
            goto L_0x17f0
        L_0x1461:
            r0 = -1983711888(0xffffffff89c2f570, float:-4.693461E-33)
            int r3 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r2 = r14.A00
            X.1cU r2 = (X.AnonymousClass1cU) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A07
            if (r0 != 0) goto L_0x1477
            java.lang.String r0 = "logger"
        L_0x1472:
            X.C04220Ms.A0E(r0)
            r5 = 0
            throw r5
        L_0x1477:
            java.lang.String r5 = "renew"
            r10 = 0
            java.lang.String r6 = r2.A0B
            java.lang.String r7 = "professional_conversion_nux_config"
            java.lang.String r8 = X.C63483hZ.A02(r15)
            java.lang.String r9 = X.C63483hZ.A01(r15)
            X.JrQ r4 = new X.JrQ
            r11 = r10
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.BcB(r4)
            X.4td r0 = r2.A08
            if (r0 != 0) goto L_0x1497
            java.lang.String r0 = "controller"
            goto L_0x1472
        L_0x1497:
            X.3yv r1 = X.AnonymousClass0wJ.A0R(r0)
            X.1S0 r0 = new X.1S0
            r0.<init>()
            r1.A03 = r0
            android.os.Handler r1 = r2.A0D
            X.4Oa r0 = new X.4Oa
            r0.<init>(r2)
            r1.post(r0)
            r0 = -1563296153(0xffffffffa2d1fe67, float:-5.6918922E-18)
        L_0x14af:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x14b3:
            r0 = 1719425254(0x667c58e6, float:2.9791906E23)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r2 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r2
            android.view.View r1 = r2.A01
            X.C18210wN.A0z(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
            r1 = 1636807950(0x618fb50e, float:3.3136635E20)
            goto L_0x17f0
        L_0x14d2:
            r0 = -616503411(0xffffffffdb40e78d, float:-5.4297788E16)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r1
            java.lang.Object r1 = r1.A00
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r1 = (com.facebook.redex.IDxCListenerShape201S0100000_1_I2) r1
            java.lang.Object r4 = r1.A00
            com.instagram.business.fragment.OnboardingCheckListFragment r4 = (com.instagram.business.fragment.OnboardingCheckListFragment) r4
            X.3IJ r3 = r4.A04
            java.lang.String r8 = "skip"
            r1 = 1
            X.C04220Ms.A0B(r15, r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A04
            java.lang.String r6 = "onboarding_checklist"
            r11 = 0
            r10 = 0
            r9 = 0
            java.lang.String r7 = r3.A08
            java.lang.Object r1 = r15.A00
            X.4vo r1 = (X.C85814vo) r1
            if (r1 == 0) goto L_0x1504
            java.lang.String r9 = r1.getErrorMessage()
            java.lang.String r10 = r1.getErrorType()
        L_0x1504:
            X.JrQ r5 = new X.JrQ
            r12 = r11
            r13 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Bdy(r5)
            r4.A00()
            r1 = -706269619(0xffffffffd5e72e4d, float:-3.17732558E13)
            goto L_0x17f0
        L_0x1516:
            r0 = -78165157(0xfffffffffb574b5b, float:-1.1178722E36)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1bz r2 = (X.C23141bz) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A03
            if (r1 == 0) goto L_0x1547
            java.lang.String r4 = "learn_professional_tools"
            r6 = 0
            r8 = 0
            r7 = 0
            java.lang.String r5 = r2.A06
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x153a
            X.4vo r1 = (X.C85814vo) r1
            java.lang.String r7 = r1.getErrorMessage()
            java.lang.String r8 = r1.getErrorType()
        L_0x153a:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A03
            X.JrQ r3 = new X.JrQ
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Bdy(r3)
        L_0x1547:
            android.content.Context r2 = r2.requireContext()
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
            r1 = 2123657644(0x7e9471ac, float:9.865798E37)
            goto L_0x17f0
        L_0x1556:
            r0 = 1725991589(0x66e08aa5, float:5.301838E23)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r2 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            if (r1 == 0) goto L_0x1587
            java.lang.String r4 = "invite_followers"
            r6 = 0
            r8 = 0
            r7 = 0
            java.lang.String r5 = r2.A05
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x157a
            X.4vo r1 = (X.C85814vo) r1
            java.lang.String r7 = r1.getErrorMessage()
            java.lang.String r8 = r1.getErrorType()
        L_0x157a:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            X.JrQ r3 = new X.JrQ
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Bdy(r3)
        L_0x1587:
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x1593
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
        L_0x1593:
            r1 = -2115369845(0xffffffff81ea048b, float:-8.5964543E-38)
            goto L_0x17f0
        L_0x1598:
            r0 = 129842098(0x7bd3bb2, float:2.8472645E-34)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r2 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r2
            java.lang.String r7 = X.C63483hZ.A02(r15)
            java.lang.String r8 = X.C63483hZ.A01(r15)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            if (r1 == 0) goto L_0x15bf
            java.lang.String r4 = "invite_followers"
            r9 = 0
            java.lang.String r5 = r2.A05
            X.JrQ r3 = new X.JrQ
            r6 = r4
            r10 = r9
            r11 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.BcB(r3)
        L_0x15bf:
            android.content.Context r2 = r2.requireContext()
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
            r1 = -2138638244(0xffffffff8086f85c, float:-1.2395051E-38)
            goto L_0x17f0
        L_0x15ce:
            r0 = 1099139590(0x41838a06, float:16.442394)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1da r4 = (X.C23331da) r4
            r1 = 2131826864(0x7f1118b0, float:1.9286624E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = X.C63483hZ.A03(r15, r1)
            android.content.Context r1 = r4.getContext()
            X.C63813iO.A01(r1, r2)
            android.view.View r1 = r4.mView
            r3 = 0
            X.C50242sg.A00(r1, r3)
            X.1fO r2 = r4.A03
            java.util.List r1 = r2.A05
            r1.clear()
            X.AnonymousClass1fO.A00(r2)
            android.widget.ImageView r1 = r4.A02
            r1.setVisibility(r3)
            r1 = 1647849345(0x62382f81, float:8.49406E20)
            goto L_0x17f0
        L_0x1605:
            r0 = -179785603(0xfffffffff548b07d, float:-2.5440405E32)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.4OW r1 = (X.AnonymousClass4OW) r1
            X.1cS r3 = r1.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A01
            if (r1 == 0) goto L_0x1636
            java.lang.String r8 = X.C63483hZ.A02(r15)
            java.lang.String r9 = X.C63483hZ.A01(r15)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A01
            java.lang.String r5 = "edit_contact_info"
            r10 = 0
            java.lang.String r6 = r3.A08
            java.lang.String r7 = "save_info"
            com.instagram.model.business.BusinessInfo r1 = r3.A05
            java.util.Map r11 = X.C34492Jt.A00(r1)
            X.JrQ r4 = new X.JrQ
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Bdy(r4)
        L_0x1636:
            android.content.Context r2 = r3.requireContext()
            java.lang.String r1 = X.C18230wP.A0l(r3)
            X.C63813iO.A01(r2, r1)
            r1 = -906726652(0xffffffffc9f47304, float:-2002528.5)
            goto L_0x17f0
        L_0x1646:
            r0 = 1770131697(0x698210f1, float:1.9655045E25)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1cS r2 = (X.AnonymousClass1cS) r2
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            if (r1 == 0) goto L_0x1670
            java.lang.String r6 = X.C63483hZ.A02(r15)
            java.lang.String r7 = X.C63483hZ.A01(r15)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            java.lang.String r3 = "edit_contact_info"
            r8 = 0
            java.lang.String r4 = r2.A08
            java.lang.String r5 = "personal_contact_info"
            X.JrQ r2 = new X.JrQ
            r9 = r8
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.BcB(r2)
        L_0x1670:
            r1 = 1915727857(0x722faff1, float:3.479845E30)
            goto L_0x17f0
        L_0x1675:
            r0 = -573821484(0xffffffffddcc2dd4, float:-1.83908108E18)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            r1 = 1923012133(0x729ed625, float:6.292162E30)
            goto L_0x17f0
        L_0x1684:
            r0 = -2032937409(0xffffffff86d3d63f, float:-7.9684185E-35)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1cT r3 = (X.AnonymousClass1cT) r3
            android.view.View r2 = r3.A01
            r1 = 8
            r2.setVisibility(r1)
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r2, r1)
            r1 = 1069691525(0x3fc23285, float:1.5171667)
            goto L_0x17f0
        L_0x16a5:
            r0 = -562096676(0xffffffffde7f15dc, float:-4.59520984E18)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = X.C18220wO.A0A(r1)
            X.C63813iO.A06(r1)
            r1 = 2127523970(0x7ecf7082, float:1.3786718E38)
            goto L_0x17f0
        L_0x16ba:
            r0 = -720041107(0xffffffffd5150b6d, float:-1.02422691E13)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = X.C18220wO.A0A(r1)
            X.C63813iO.A06(r1)
            r1 = 1503617657(0x599f6279, float:5.6078491E15)
            goto L_0x17f0
        L_0x16cf:
            r0 = -508128610(0xffffffffe1b6929e, float:-4.2098404E20)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r3 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r3
            java.lang.String r8 = X.C63483hZ.A02(r15)
            java.lang.String r9 = X.C63483hZ.A01(r15)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A00
            if (r1 == 0) goto L_0x16f7
            java.lang.String r5 = "account_type_selection"
            r10 = 0
            java.lang.String r6 = r3.A05
            java.lang.String r7 = "professional_conversion_nux_config"
            X.JrQ r4 = new X.JrQ
            r11 = r10
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.BcB(r4)
        L_0x16f7:
            X.4td r1 = r3.mController
            r1.getClass()
            X.3yv r2 = X.AnonymousClass0wJ.A0R(r1)
            X.1S0 r1 = new X.1S0
            r1.<init>()
            r2.A03 = r1
            android.os.Handler r2 = r3.A08
            X.4OP r1 = new X.4OP
            r1.<init>(r3)
            r2.post(r1)
            r1 = 895909097(0x35667ce9, float:8.5863445E-7)
            goto L_0x17f0
        L_0x1716:
            r0 = 1645446040(0x62138398, float:6.802884E20)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Throwable r3 = r15.A01
            if (r3 == 0) goto L_0x1736
            java.lang.Object r1 = r14.A00
            X.4A9 r1 = (X.AnonymousClass4A9) r1
            X.3Vd r2 = r1.A00
            if (r2 == 0) goto L_0x1731
            X.3XX r1 = new X.3XX
            r1.<init>((java.lang.Throwable) r3)
            r2.A03(r1)
        L_0x1731:
            r1 = -1536188827(0xffffffffa46f9e65, float:-5.195903E-17)
            goto L_0x17f0
        L_0x1736:
            java.lang.Object r2 = r15.A00
            java.lang.Object r1 = r14.A00
            X.4A9 r1 = (X.AnonymousClass4A9) r1
            X.3Vd r3 = r1.A00
            if (r2 == 0) goto L_0x174f
            if (r3 == 0) goto L_0x174a
            X.3XX r1 = new X.3XX
            r1.<init>((java.lang.Object) r2)
            r3.A03(r1)
        L_0x174a:
            r1 = -1031792074(0xffffffffc2801a36, float:-64.05119)
            goto L_0x17f0
        L_0x174f:
            if (r3 == 0) goto L_0x175a
            r2 = 0
            X.3XX r1 = new X.3XX
            r1.<init>((java.lang.Object) r2)
            r3.A03(r1)
        L_0x175a:
            r1 = 1596597882(0x5f2a267a, float:1.2260621E19)
            goto L_0x17f0
        L_0x175f:
            r0 = 1917226863(0x72468f6f, float:3.9328917E30)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            android.content.Context r4 = (android.content.Context) r4
            r3 = 2131824428(0x7f110f2c, float:1.9281684E38)
            r2 = 0
            java.lang.String r1 = "could_not_update_profile_picture"
            X.C63813iO.A03(r4, r1, r3, r2)
            r1 = 1152384369(0x44affd71, float:1407.92)
            goto L_0x17f0
        L_0x1777:
            r0 = -253976636(0xfffffffff0dc9fc4, float:-5.4623878E29)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x179f
            X.4vo r2 = (X.C85814vo) r2
            java.lang.String r1 = r2.getErrorMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x179f
            java.lang.Object r3 = r14.A00
            X.1cf r3 = (X.AnonymousClass1cf) r3
            java.lang.String r2 = r2.getErrorMessage()
        L_0x1796:
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r3.Cth(r2, r1)
            r1 = -335876284(0xffffffffebfaef44, float:-6.067227E26)
            goto L_0x17f0
        L_0x179f:
            java.lang.Object r3 = r14.A00
            X.1cf r3 = (X.AnonymousClass1cf) r3
            r1 = 2131831662(0x7f112b6e, float:1.9296356E38)
            java.lang.String r2 = r3.getString(r1)
            goto L_0x1796
        L_0x17ab:
            r0 = 1215807795(0x4877c133, float:253700.8)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r5 = r14.A00
            X.1by r5 = (X.C23131by) r5
            boolean r1 = r5.A02
            com.instagram.service.session.UserSession r4 = r5.A00
            if (r1 == 0) goto L_0x17f4
            X.2A2 r1 = X.AnonymousClass2A2.A02
            java.lang.String r2 = r1.toString()
            X.AnonymousClass0wJ.A1N(r4, r2)
            X.2AF r1 = X.AnonymousClass2AF.A02
            r3 = 0
            X.C63003bJ.A00(r1, r4, r2, r3)
            X.C18190wL.A19(r5)
            X.C18190wL.A19(r5)
        L_0x17d4:
            r1 = 0
            r5.A07 = r1
            X.C23131by.A01(r5)
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r5)
            r1 = 2131831662(0x7f112b6e, float:1.9296356E38)
            r2.A0K(r1)
            r1 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r2.A0P(r3, r1)
            X.AnonymousClass0wJ.A1K(r2)
            r1 = 1278049147(0x4c2d7b7b, float:4.5477356E7)
        L_0x17f0:
            X.C14030oh.A0A(r1, r0)
            return
        L_0x17f4:
            X.2A2 r1 = X.AnonymousClass2A2.A03
            java.lang.String r2 = r1.toString()
            X.AnonymousClass0wJ.A1N(r4, r2)
            X.2AF r1 = X.AnonymousClass2AF.A02
            r3 = 0
            X.C63003bJ.A00(r1, r4, r2, r3)
            goto L_0x17d4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2.onFail(X.3XX):void");
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int i;
        int i2;
        String str;
        switch (this.A01) {
            case 18:
                i = AnonymousClass0wJ.A00(-255962056, eUq);
                AnonymousClass1cW r2 = (AnonymousClass1cW) this.A00;
                String str2 = null;
                String str3 = null;
                String str4 = r2.A01;
                if (r2.A03) {
                    str = "on";
                } else {
                    str = "off";
                }
                HashMap A03 = C63203gz.A03("opt_in_promotional_email_setting", str);
                if (eUq.A06()) {
                    str3 = ((C85814vo) eUq.A03()).getErrorMessage();
                    str2 = ((C85814vo) eUq.A03()).getErrorType();
                }
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r2.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Bdy(new C37408JrQ("opt_in_promotional_email", str4, "opt_in_promotional_email_setting", str3, str2, (Map) null, A03, (Map) null));
                    AnonymousClass0wJ.A0F().post(new AnonymousClass4R1(r2, this));
                    i2 = -1408183383;
                    break;
                } else {
                    C18240wQ.A0p();
                    throw null;
                }
            case 21:
                i = AnonymousClass0wJ.A00(2092487514, eUq);
                Handler A0F = AnonymousClass0wJ.A0F();
                C22881ax r1 = (C22881ax) this.A00;
                A0F.post(new AnonymousClass4R2(r1, this));
                C22881ax.A00(eUq, r1, "hide_more_comments_setting");
                i2 = -713230654;
                break;
            case 22:
                i = AnonymousClass0wJ.A00(405959295, eUq);
                Handler A0F2 = AnonymousClass0wJ.A0F();
                C22881ax r12 = (C22881ax) this.A00;
                A0F2.post(new AnonymousClass4R3(r12, this));
                C22881ax.A00(eUq, r12, "hide_message_requests_setting");
                i2 = 1244806878;
                break;
            case 75:
                i = C14030oh.A03(-213205449);
                super.onFailInBackground(eUq);
                C25201mh r13 = (C25201mh) this.A00;
                int i3 = r13.A00;
                if (i3 < 11) {
                    AnonymousClass0g9.A00().A01(new C25201mh(r13.A01, r13.A03, r13.A02, i3 + 1), 3600000);
                }
                i2 = -1865859502;
                break;
            case 177:
                i = C14030oh.A03(-24688219);
                if (C63173fJ.A05(AnonymousClass0TJ.A05, 18306361796335820L)) {
                    C28161tl A08 = C63873iU.A08(this);
                    AnonymousClass0wJ.A12(C28161tl.A02(A08), "last_successful_contact_points_auto_sync", System.currentTimeMillis());
                }
                i2 = 43312860;
                break;
            case 182:
                i = C14030oh.A03(-846103032);
                AnonymousClass0wJ.A0F().post(new AnonymousClass4S2(this, (C22871as) this.A00));
                i2 = -1537247007;
                break;
            case 183:
                i = C14030oh.A03(-1206436962);
                AnonymousClass0wJ.A0F().post(new AnonymousClass4S3(this, (C22871as) this.A00));
                i2 = 1815618007;
                break;
            case 184:
                i = C14030oh.A03(-403380914);
                super.onFailInBackground(eUq);
                C696349j r5 = (C696349j) ((IDxLTaskShape133S0100000_1_I2) this.A00).A00;
                C696349j.A0A(r5, Math.max(C63803iN.A01(AnonymousClass0TJ.A05, r5.A02, 36598752064310212L), 30));
                i2 = -86908693;
                break;
            default:
                super.onFailInBackground(eUq);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0435, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0438, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0439, code lost:
        r4 = "confirmButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x043b, code lost:
        X.C04220Ms.A0E(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x043f, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x056a, code lost:
        X.C14030oh.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x056d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03b6, code lost:
        r4 = "nextButton";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 1: goto L_0x0009;
                case 4: goto L_0x001f;
                case 11: goto L_0x0036;
                case 12: goto L_0x004e;
                case 14: goto L_0x0067;
                case 15: goto L_0x007e;
                case 16: goto L_0x0096;
                case 23: goto L_0x00ac;
                case 24: goto L_0x00bb;
                case 25: goto L_0x00d3;
                case 26: goto L_0x00f8;
                case 32: goto L_0x0117;
                case 33: goto L_0x012a;
                case 40: goto L_0x013d;
                case 47: goto L_0x0153;
                case 59: goto L_0x0162;
                case 60: goto L_0x0178;
                case 61: goto L_0x018e;
                case 62: goto L_0x01a4;
                case 66: goto L_0x01b7;
                case 67: goto L_0x01da;
                case 68: goto L_0x01ed;
                case 69: goto L_0x0200;
                case 70: goto L_0x0213;
                case 71: goto L_0x0226;
                case 72: goto L_0x023e;
                case 73: goto L_0x0256;
                case 74: goto L_0x026e;
                case 77: goto L_0x028a;
                case 79: goto L_0x02a2;
                case 81: goto L_0x02c4;
                case 82: goto L_0x02e6;
                case 84: goto L_0x02fe;
                case 85: goto L_0x0316;
                case 86: goto L_0x0338;
                case 87: goto L_0x035a;
                case 88: goto L_0x037c;
                case 89: goto L_0x039e;
                case 90: goto L_0x03ba;
                case 91: goto L_0x03db;
                case 92: goto L_0x03f1;
                case 93: goto L_0x0408;
                case 94: goto L_0x041f;
                case 105: goto L_0x0440;
                case 106: goto L_0x0456;
                case 107: goto L_0x046b;
                case 109: goto L_0x0484;
                case 118: goto L_0x049a;
                case 133: goto L_0x04b5;
                case 135: goto L_0x04cc;
                case 139: goto L_0x04e1;
                case 155: goto L_0x051e;
                case 161: goto L_0x0530;
                case 169: goto L_0x0545;
                case 170: goto L_0x0558;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onFinish()
            return
        L_0x0009:
            r0 = -364664037(0xffffffffea43ab1b, float:-5.913714E25)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1cf r0 = (X.AnonymousClass1cf) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -642731157(0xffffffffd9b0b36b, float:-6.2171085E15)
            goto L_0x056a
        L_0x001f:
            r0 = 1520813606(0x5aa5c626, float:2.33306188E16)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.4A9 r0 = (X.AnonymousClass4A9) r0
            X.3Vd r0 = r0.A00
            if (r0 == 0) goto L_0x0031
            r0.A01()
        L_0x0031:
            r0 = -300167841(0xffffffffee1bcd5f, float:-1.2054614E28)
            goto L_0x056a
        L_0x0036:
            r0 = 749671810(0x2caf1582, float:4.976187E-12)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1cS r1 = (X.AnonymousClass1cS) r1
            X.1ju r0 = r1.A04
            r0.A00()
            r0 = 1
            r1.A09 = r0
            r0 = -1275170180(0xffffffffb3fe727c, float:-1.1848621E-7)
            goto L_0x056a
        L_0x004e:
            r0 = 2130195805(0x7ef8355d, float:1.6496281E38)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.4OW r0 = (X.AnonymousClass4OW) r0
            X.1cS r0 = r0.A00
            X.1ju r0 = r0.A04
            if (r0 == 0) goto L_0x0062
            r0.A00()
        L_0x0062:
            r0 = -1939082132(0xffffffff8c6bf46c, float:-1.8177295E-31)
            goto L_0x056a
        L_0x0067:
            r0 = 41863173(0x27ec805, float:1.8718376E-37)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r0 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r0
            android.view.View r1 = r0.mLoadingIndicator
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1789478108(0x6aa944dc, float:1.0231682E26)
            goto L_0x056a
        L_0x007e:
            r0 = -950377233(0xffffffffc75a64ef, float:-55908.934)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r0 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r0
            X.E2V r1 = r0.A00
            if (r1 == 0) goto L_0x0091
            r0 = 0
            r1.setIsLoading(r0)
        L_0x0091:
            r0 = -2118338799(0xffffffff81bcb711, float:-6.932298E-38)
            goto L_0x056a
        L_0x0096:
            r0 = -1286261565(0xffffffffb35534c3, float:-4.9640914E-8)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1bz r0 = (X.C23141bz) r0
            X.E2V r1 = r0.A01
            r0 = 0
            r1.setIsLoading(r0)
            r0 = -21332171(0xfffffffffeba7f35, float:-1.2394845E38)
            goto L_0x056a
        L_0x00ac:
            r0 = -1443413586(0xffffffffa9f741ae, float:-1.0980397E-13)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            r0 = -130475833(0xfffffffff83918c7, float:-1.5016835E34)
            goto L_0x056a
        L_0x00bb:
            r0 = 1877662180(0x6fead9e4, float:1.4536581E29)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            com.instagram.business.fragment.SuggestBusinessFragment r0 = (com.instagram.business.fragment.SuggestBusinessFragment) r0
            X.E2V r1 = r0.mActionBarService
            if (r1 == 0) goto L_0x00ce
            r0 = 0
            r1.setIsLoading(r0)
        L_0x00ce:
            r0 = -1698924631(0xffffffff9abc77a9, float:-7.79483E-23)
            goto L_0x056a
        L_0x00d3:
            r0 = -865146852(0xffffffffcc6ee81c, float:-6.2627952E7)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.3IJ r0 = (X.AnonymousClass3IJ) r0
            com.instagram.business.fragment.OnboardingCheckListFragment r3 = r0.A05
            android.widget.ProgressBar r1 = r3.mProgressBar
            if (r1 == 0) goto L_0x00f3
            android.view.ViewGroup r0 = r3.mLayoutContent
            if (r0 == 0) goto L_0x00f3
            r0 = 8
            r1.setVisibility(r0)
            android.view.ViewGroup r1 = r3.mLayoutContent
            r0 = 0
            r1.setVisibility(r0)
        L_0x00f3:
            r0 = -1689372273(0xffffffff9b4e398f, float:-1.7058519E-22)
            goto L_0x056a
        L_0x00f8:
            r0 = 2052049748(0x7a4fcb54, float:2.6973236E35)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r0 = r6.A00
            X.1aj r0 = (X.AnonymousClass1aj) r0
            X.3Id r1 = r0.A00
            if (r1 != 0) goto L_0x010e
            java.lang.String r4 = "connectButtonHolder"
            goto L_0x043b
        L_0x010e:
            r0 = 0
            r1.A04(r0)
            r0 = -1642222335(0xffffffff9e1dad01, float:-8.347287E-21)
            goto L_0x056a
        L_0x0117:
            r0 = -1033761537(0xffffffffc2620cff, float:-56.51269)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.4ss r0 = (X.C84274ss) r0
            r0.CGO()
            r0 = 1574091262(0x5dd2b9fe, float:1.89805586E18)
            goto L_0x056a
        L_0x012a:
            r0 = -2026563137(0xffffffff873519bf, float:-1.3624493E-34)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.4sc r0 = (X.C84144sc) r0
            r0.Byt()
            r0 = 2135896004(0x7f4f2fc4, float:2.753982E38)
            goto L_0x056a
        L_0x013d:
            r0 = -253624495(0xfffffffff0e1ff51, float:-5.595423E29)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1us r0 = (X.C28721us) r0
            com.instagram.igds.components.button.IgdsButton r1 = r0.A01
            r0 = 0
            r1.setLoading(r0)
            r0 = -1197062943(0xffffffffb8a644e1, float:-7.9283265E-5)
            goto L_0x056a
        L_0x0153:
            r0 = 1963312321(0x7505c4c1, float:1.695718E32)
            int r3 = X.C14030oh.A03(r0)
            r0 = 0
            X.AnonymousClass2BB.A01 = r0
            r0 = 130463113(0x7c6b589, float:2.9898426E-34)
            goto L_0x0435
        L_0x0162:
            r0 = 717496188(0x2ac41f7c, float:3.483844E-13)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1xV r1 = (X.C29211xV) r1
            r0 = 0
            r1.A06 = r0
            X.C18180wK.A11(r1)
            r0 = 1073168562(0x3ff740b2, float:1.9316618)
            goto L_0x056a
        L_0x0178:
            r0 = -1803797495(0xffffffff947c3c09, float:-1.27345885E-26)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1xV r1 = (X.C29211xV) r1
            r0 = 0
            r1.A06 = r0
            X.C18180wK.A11(r1)
            r0 = -1113438013(0xffffffffbda248c3, float:-0.079240344)
            goto L_0x056a
        L_0x018e:
            r0 = -1890931160(0xffffffff8f4aae28, float:-9.99291E-30)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1xa r1 = (X.C29241xa) r1
            r0 = 0
            r1.A04 = r0
            X.C18180wK.A11(r1)
            r0 = 987978861(0x3ae35c6d, float:0.0017346271)
            goto L_0x056a
        L_0x01a4:
            r0 = 463849938(0x1ba5c9d2, float:2.7427384E-22)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1aw r1 = (X.AnonymousClass1aw) r1
            r0 = 0
            r1.A09 = r0
            r0 = 1722498392(0x66ab3d58, float:4.0432813E23)
            goto L_0x056a
        L_0x01b7:
            r0 = 1660926987(0x62ffbc0b, float:2.3587348E21)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r3 = r6.A00
            X.1c4 r3 = (X.AnonymousClass1c4) r3
            r1 = 0
            r3.A0B = r1
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x01d5
            X.E2V r0 = X.C18190wL.A0M(r3)
            r0.setIsLoading(r1)
        L_0x01d5:
            r0 = 213993978(0xcc149fa, float:2.9780881E-31)
            goto L_0x056a
        L_0x01da:
            r0 = -594767191(0xffffffffdc8c92a9, float:-3.1654201E17)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1B(r0)
            r0 = 283981988(0x10ed38a4, float:9.3567286E-29)
            goto L_0x056a
        L_0x01ed:
            r0 = 310887759(0x1287c54f, float:8.568338E-28)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1B(r0)
            r0 = 1775249827(0x69d029a3, float:3.145665E25)
            goto L_0x056a
        L_0x0200:
            r0 = -605141759(0xffffffffdbee4501, float:-1.3413383E17)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1B(r0)
            r0 = -929851974(0xffffffffc89395ba, float:-302253.8)
            goto L_0x056a
        L_0x0213:
            r0 = -1915830656(0xffffffff8dcebe80, float:-1.2741591E-30)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1B(r0)
            r0 = 565064929(0x21ae34e1, float:1.1804696E-18)
            goto L_0x056a
        L_0x0226:
            r0 = 1333184573(0x4f76c83d, float:4.14031795E9)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r0 = r6.A00
            X.1d9 r0 = (X.AnonymousClass1d9) r0
            X.1jv r0 = r0.A03
            r0.A00()
            r0 = -206880194(0xfffffffff3ab423e, float:-2.7137034E31)
            goto L_0x056a
        L_0x023e:
            r0 = 514922389(0x1eb11795, float:1.8750357E-20)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r0 = r6.A00
            X.1d9 r0 = (X.AnonymousClass1d9) r0
            X.1jv r0 = r0.A03
            r0.A00()
            r0 = 1849484053(0x6e3ce315, float:1.4614427E28)
            goto L_0x056a
        L_0x0256:
            r0 = 1388364077(0x52c0c12d, float:4.13937336E11)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r0 = r6.A00
            X.1d9 r0 = (X.AnonymousClass1d9) r0
            X.1jv r0 = r0.A03
            r0.A00()
            r0 = -159141954(0xfffffffff683afbe, float:-1.3354597E33)
            goto L_0x056a
        L_0x026e:
            r0 = -367287734(0xffffffffea1ba24a, float:-4.7037473E25)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r6.A00
            X.1Yo r3 = (X.C22561Yo) r3
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A05
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A05
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1583321339(0x5e5f90fb, float:4.02741296E18)
            goto L_0x056a
        L_0x028a:
            r0 = -21496360(0xfffffffffeb7fdd8, float:-1.2228338E38)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1ZN r0 = (X.AnonymousClass1ZN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A01
            if (r1 == 0) goto L_0x03b6
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 609528100(0x2454a924, float:4.611344E-17)
            goto L_0x056a
        L_0x02a2:
            r0 = 166289966(0x9e9622e, float:5.6185037E-33)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1bL r2 = (X.AnonymousClass1bL) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 2143045774(0x7fbc488e, float:NaN)
            goto L_0x0435
        L_0x02c4:
            r0 = 399682624(0x17d2ac40, float:1.3614414E-24)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 813620376(0x307edc98, float:9.2718144E-10)
            goto L_0x0435
        L_0x02e6:
            r0 = 434969723(0x19ed1c7b, float:2.4516729E-23)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x03b6
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 595098044(0x237879bc, float:1.3469885E-17)
            goto L_0x0435
        L_0x02fe:
            r0 = -1141598479(0xffffffffbbf496f1, float:-0.0074642827)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x03b6
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1206060770(0xffffffffb81cf91e, float:-3.7425307E-5)
            goto L_0x0435
        L_0x0316:
            r0 = -1434505844(0xffffffffaa7f2d8c, float:-2.2664352E-13)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -211862949(0xfffffffff35f3a5b, float:-1.768594E31)
            goto L_0x0435
        L_0x0338:
            r0 = 2094378978(0x7cd5afe2, float:8.8762125E36)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1399578062(0x536bddce, float:1.01303858E12)
            goto L_0x0435
        L_0x035a:
            r0 = 135328713(0x810f3c9, float:4.361999E-34)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1769629618(0xffffffff9685984e, float:-2.1583427E-25)
            goto L_0x0435
        L_0x037c:
            r0 = 705368617(0x2a0b1229, float:1.235198E-13)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 250236024(0xeea4c78, float:5.775909E-30)
            goto L_0x0435
        L_0x039e:
            r0 = -540010112(0xffffffffdfd01980, float:-2.9990314E19)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x03b6
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1354638533(0xffffffffaf41db3b, float:-1.7631134E-10)
            goto L_0x0435
        L_0x03b6:
            java.lang.String r4 = "nextButton"
            goto L_0x043b
        L_0x03ba:
            r0 = -121990359(0xfffffffff8ba9329, float:-3.02735E34)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r6.A00
            X.1am r2 = (X.C22841am) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x043b
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            if (r1 == 0) goto L_0x043b
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1371525494(0x51bfd176, float:1.02981616E11)
            goto L_0x0435
        L_0x03db:
            r0 = 1621077119(0x609fac7f, float:9.204569E19)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1Zj r1 = (X.C22761Zj) r1
            r0 = 0
            r1.A03 = r0
            X.C18180wK.A11(r1)
            r0 = -184073574(0xfffffffff507429a, float:-1.7146263E32)
            goto L_0x056a
        L_0x03f1:
            r0 = 279400141(0x10a74ecd, float:6.59913E-29)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1Yw r0 = (X.C22641Yw) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A0B
            if (r1 == 0) goto L_0x0439
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 388882994(0x172de232, float:5.6184813E-25)
            goto L_0x0435
        L_0x0408:
            r0 = -482453025(0xffffffffe33e59df, float:-3.5113573E21)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1Yw r0 = (X.C22641Yw) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A0B
            if (r1 == 0) goto L_0x0439
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -2055509311(0xffffffff857b6ac1, float:-1.1821571E-35)
            goto L_0x0435
        L_0x041f:
            r0 = -1031018635(0xffffffffc28be775, float:-69.952065)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1Yw r0 = (X.C22641Yw) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A0B
            if (r1 == 0) goto L_0x0439
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1832007932(0x6d3238fc, float:3.4473264E27)
        L_0x0435:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x0439:
            java.lang.String r4 = "confirmButton"
        L_0x043b:
            X.C04220Ms.A0E(r4)
            r0 = 0
            throw r0
        L_0x0440:
            r0 = -1465210426(0xffffffffa8aaa9c6, float:-1.8947419E-14)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1sg r0 = (X.C27541sg) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A06
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 356601512(0x15414ea8, float:3.9038088E-26)
            goto L_0x056a
        L_0x0456:
            r0 = 1702454709(0x657965b5, float:7.360909E22)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1ce r0 = (X.C23191ce) r0
            X.1jv r0 = r0.A01
            r0.A00()
            r0 = 1645687735(0x621733b7, float:6.972962E20)
            goto L_0x056a
        L_0x046b:
            r0 = 1541198787(0x5bdcd3c3, float:1.24314659E17)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r6.A00
            X.1Yv r3 = (X.C22631Yv) r3
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A03
            r0 = 0
            r1.setShowProgressBar(r0)
            X.C22631Yv.A02(r3)
            r0 = -336783094(0xffffffffebed190a, float:-5.7326733E26)
            goto L_0x056a
        L_0x0484:
            r0 = 1949475574(0x7432a2f6, float:5.6612188E31)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1cf r0 = (X.AnonymousClass1cf) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1795016836(0xffffffff9502377c, float:-2.629706E-26)
            goto L_0x056a
        L_0x049a:
            r0 = 2041700101(0x79b1df05, float:1.1544499E35)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r0 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r0
            java.lang.Object r3 = r0.A00
            X.3ZJ r3 = (X.AnonymousClass3ZJ) r3
            java.lang.Object r1 = r0.A03
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r3.A08(r0, r1)
            r0 = 1824785794(0x6cc40582, float:1.8958038E27)
            goto L_0x056a
        L_0x04b5:
            r0 = 75360236(0x47de7ec, float:2.98465E-36)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r1.invoke(r0)
            r0 = -448912722(0xffffffffe53e22ae, float:-5.6118085E22)
            goto L_0x056a
        L_0x04cc:
            r0 = -1408949756(0xffffffffac052204, float:-1.891932E-12)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r6.A00
            X.1cm r0 = (X.C23211cm) r0
            X.1jv r0 = r0.A06
            r0.A00()
            r0 = -1727690558(0xffffffff990588c2, float:-6.903557E-24)
            goto L_0x056a
        L_0x04e1:
            r0 = 1773088300(0x69af2e2c, float:2.6472507E25)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r5 = r6.A00
            X.3Vj r5 = (X.C61783Vj) r5
            androidx.fragment.app.FragmentActivity r4 = r5.A01
            X.E2V r3 = X.E2V.A03(r4)
            r1 = 0
            r0 = 0
            r3.CtQ(r0, r1)
            X.E2V r0 = X.E2V.A03(r4)
            r0.setIsLoading(r1)
            r5.A00 = r1
            X.IcN r3 = r5.A02
            boolean r0 = r3 instanceof X.C29131wm
            if (r0 == 0) goto L_0x051a
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.1wm r3 = (X.C29131wm) r3
            r3.getClass()
            X.4Q1 r0 = new X.4Q1
            r0.<init>(r3)
            r1.post(r0)
        L_0x051a:
            r0 = -1196260523(0xffffffffb8b28355, float:-8.512164E-5)
            goto L_0x056a
        L_0x051e:
            r0 = 1012547587(0x3c5a4003, float:0.013320926)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.1x2 r1 = (X.AnonymousClass1x2) r1
            r0 = 0
            r1.A0B = r0
            r0 = 1757795956(0x68c5d674, float:7.474097E24)
            goto L_0x056a
        L_0x0530:
            r0 = 429618296(0x199b7478, float:1.6073666E-23)
            int r2 = X.C14030oh.A03(r0)
            super.onFinish()
            java.lang.Object r1 = r6.A00
            X.49K r1 = (X.AnonymousClass49K) r1
            r0 = 0
            r1.A03 = r0
            r0 = -1039116229(0xffffffffc210583b, float:-36.086163)
            goto L_0x056a
        L_0x0545:
            r0 = 1786906666(0x6a82082a, float:7.8599455E25)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.8m8 r1 = (X.C146368m8) r1
            r0 = 0
            r1.ADR(r0)
            r0 = 1344432620(0x502269ec, float:1.08994028E10)
            goto L_0x056a
        L_0x0558:
            r0 = 1660065632(0x62f29760, float:2.2375099E21)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r6.A00
            X.8m8 r1 = (X.C146368m8) r1
            r0 = 0
            r1.ADR(r0)
            r0 = -1353639492(0xffffffffaf5119bc, float:-1.9017582E-10)
        L_0x056a:
            X.C14030oh.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2.onFinish():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x048e, code lost:
        X.C04220Ms.A0E(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0492, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0586, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0589, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0022;
                case 4: goto L_0x0038;
                case 6: goto L_0x0076;
                case 11: goto L_0x008b;
                case 12: goto L_0x00a0;
                case 14: goto L_0x00b9;
                case 15: goto L_0x00cf;
                case 16: goto L_0x00e5;
                case 23: goto L_0x00fb;
                case 24: goto L_0x010a;
                case 25: goto L_0x0120;
                case 26: goto L_0x047a;
                case 32: goto L_0x0145;
                case 40: goto L_0x0158;
                case 48: goto L_0x016e;
                case 59: goto L_0x017a;
                case 60: goto L_0x0190;
                case 61: goto L_0x01a3;
                case 62: goto L_0x01b9;
                case 63: goto L_0x01e3;
                case 66: goto L_0x01fc;
                case 67: goto L_0x0219;
                case 68: goto L_0x0225;
                case 69: goto L_0x0231;
                case 70: goto L_0x023d;
                case 71: goto L_0x0249;
                case 72: goto L_0x0261;
                case 73: goto L_0x0279;
                case 74: goto L_0x0291;
                case 79: goto L_0x02ad;
                case 81: goto L_0x02cf;
                case 82: goto L_0x02f1;
                case 84: goto L_0x0313;
                case 85: goto L_0x0335;
                case 86: goto L_0x0357;
                case 87: goto L_0x0379;
                case 88: goto L_0x039b;
                case 89: goto L_0x03bd;
                case 90: goto L_0x03df;
                case 91: goto L_0x0401;
                case 92: goto L_0x0414;
                case 93: goto L_0x0436;
                case 94: goto L_0x0458;
                case 105: goto L_0x049c;
                case 106: goto L_0x04b2;
                case 107: goto L_0x04c7;
                case 109: goto L_0x04dd;
                case 110: goto L_0x04f3;
                case 111: goto L_0x0507;
                case 117: goto L_0x051a;
                case 118: goto L_0x0525;
                case 135: goto L_0x0530;
                case 139: goto L_0x0544;
                case 155: goto L_0x056a;
                case 173: goto L_0x057c;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onStart()
            return
        L_0x0009:
            r0 = 2017952855(0x78478457, float:1.6186738E34)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            r1 = 1
            java.lang.Object r0 = r5.A00
            X.1by r0 = (X.C23131by) r0
            r0.A07 = r1
            X.C23131by.A01(r0)
            r0 = -1951182927(0xffffffff8bb34fb1, float:-6.90682E-32)
            goto L_0x0586
        L_0x0022:
            r0 = 1281958745(0x4c692359, float:6.1115748E7)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1cf r0 = (X.AnonymousClass1cf) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 615625744(0x24b1b410, float:7.706655E-17)
            goto L_0x0586
        L_0x0038:
            r0 = 729170764(0x2b76434c, float:8.749015E-13)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r5.A00
            X.4A9 r4 = (X.AnonymousClass4A9) r4
            X.3Vd r0 = r4.A00
            if (r0 == 0) goto L_0x004a
            r0.A02()
        L_0x004a:
            X.H8c r0 = r4.A01
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = "com.bloks.www.fx.company-identity-switcher.v1"
            r0 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r1, r0)
            if (r0 == 0) goto L_0x0071
            X.1eG r2 = X.C60753Qj.A00()
            if (r2 == 0) goto L_0x0071
            X.3Vd r1 = r4.A00
            boolean r0 = r1 instanceof X.AnonymousClass1eS
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.bloks.util.IgBloksRequestTask.ResponseCallback"
            X.C04220Ms.A0C(r1, r0)
            X.1eS r1 = (X.AnonymousClass1eS) r1
            X.39n r0 = X.AnonymousClass2JY.A00(r2)
            r1.A05(r0)
        L_0x0071:
            r0 = 40967932(0x2711efc, float:1.7714776E-37)
            goto L_0x0586
        L_0x0076:
            r0 = -337316715(0xffffffffebe4f495, float:-5.535802E26)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r0 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r0
            X.1ju r0 = r0.A01
            r0.A01()
            r0 = -1871069792(0xffffffff9079bda0, float:-4.9252673E-29)
            goto L_0x0586
        L_0x008b:
            r0 = -1869600207(0xffffffff90902a31, float:-5.686299E-29)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1cS r0 = (X.AnonymousClass1cS) r0
            X.1ju r0 = r0.A04
            r0.A01()
            r0 = 1688530715(0x64a4ef1b, float:2.4339963E22)
            goto L_0x0586
        L_0x00a0:
            r0 = -2124985037(0xffffffff81574d33, float:-3.954465E-38)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.4OW r0 = (X.AnonymousClass4OW) r0
            X.1cS r0 = r0.A00
            X.1ju r0 = r0.A04
            if (r0 == 0) goto L_0x00b4
            r0.A01()
        L_0x00b4:
            r0 = -592057902(0xffffffffdcb5e9d2, float:-4.09632471E17)
            goto L_0x0586
        L_0x00b9:
            r0 = 499054868(0x1dbef914, float:5.055012E-21)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r0 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r0
            android.view.View r1 = r0.mLoadingIndicator
            r0 = 0
            r1.setVisibility(r0)
            r0 = -717777183(0xffffffffd53796e1, float:-1.26161655E13)
            goto L_0x0586
        L_0x00cf:
            r0 = -686341773(0xffffffffd7174173, float:-1.66307358E14)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r0 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r0
            X.E2V r1 = r0.A00
            r0 = 1
            r1.setIsLoading(r0)
            r0 = -2108205505(0xffffffff8257563f, float:-1.5820457E-37)
            goto L_0x0586
        L_0x00e5:
            r0 = 1943129115(0x73d1cc1b, float:3.3243707E31)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1bz r0 = (X.C23141bz) r0
            X.E2V r1 = r0.A01
            r0 = 1
            r1.setIsLoading(r0)
            r0 = -512637634(0xffffffffe171c53e, float:-2.7874238E20)
            goto L_0x0586
        L_0x00fb:
            r0 = -1677098475(0xffffffff9c098215, float:-4.5497625E-22)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            r0 = -1623264170(0xffffffff9f3ef456, float:-4.0436175E-20)
            goto L_0x0586
        L_0x010a:
            r0 = 1386446675(0x52a37f53, float:3.51107908E11)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.instagram.business.fragment.SuggestBusinessFragment r0 = (com.instagram.business.fragment.SuggestBusinessFragment) r0
            X.E2V r1 = r0.mActionBarService
            r0 = 1
            r1.setIsLoading(r0)
            r0 = -604878986(0xffffffffdbf24776, float:-1.36391033E17)
            goto L_0x0586
        L_0x0120:
            r0 = 1535959536(0x5b8ce1f0, float:7.9309835E16)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.3IJ r0 = (X.AnonymousClass3IJ) r0
            com.instagram.business.fragment.OnboardingCheckListFragment r2 = r0.A05
            android.widget.ProgressBar r1 = r2.mProgressBar
            if (r1 == 0) goto L_0x0140
            android.view.ViewGroup r0 = r2.mLayoutContent
            if (r0 == 0) goto L_0x0140
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewGroup r1 = r2.mLayoutContent
            r0 = 8
            r1.setVisibility(r0)
        L_0x0140:
            r0 = 728830997(0x2b711415, float:8.564827E-13)
            goto L_0x0586
        L_0x0145:
            r0 = 1370894726(0x51b63186, float:9.7814364E10)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.4ss r0 = (X.C84274ss) r0
            r0.CGY()
            r0 = 1359435873(0x51075861, float:3.6331459E10)
            goto L_0x0586
        L_0x0158:
            r0 = 1730429908(0x672443d4, float:7.757193E23)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1us r0 = (X.C28721us) r0
            com.instagram.igds.components.button.IgdsButton r1 = r0.A01
            r0 = 1
            r1.setLoading(r0)
            r0 = -1793368248(0xffffffff951b5f48, float:-3.1377164E-26)
            goto L_0x0586
        L_0x016e:
            r0 = -803271628(0xffffffffd01f0c34, float:-1.06735084E10)
            int r3 = X.C63873iU.A03(r5, r0)
            r0 = 1823365492(0x6cae5974, float:1.6862042E27)
            goto L_0x0586
        L_0x017a:
            r0 = 416699116(0x18d652ec, float:5.5401433E-24)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.1xV r1 = (X.C29211xV) r1
            r0 = 1
            r1.A06 = r0
            X.C18180wK.A11(r1)
            r0 = 1033956442(0x3da0ec5a, float:0.078575805)
            goto L_0x0586
        L_0x0190:
            r0 = 834225562(0x31b9459a, float:5.3921214E-9)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.1xV r1 = (X.C29211xV) r1
            r0 = 1
            r1.A06 = r0
            r0 = 204810320(0xc352850, float:1.3955864E-31)
            goto L_0x0586
        L_0x01a3:
            r0 = -560596602(0xffffffffde95f986, float:-5.4034081E18)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.1xa r1 = (X.C29241xa) r1
            r0 = 1
            r1.A04 = r0
            X.C18180wK.A11(r1)
            r0 = 786043148(0x2eda110c, float:9.9165204E-11)
            goto L_0x0586
        L_0x01b9:
            r0 = 1379197195(0x5234e10b, float:1.94217427E11)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aw r2 = (X.AnonymousClass1aw) r2
            r1 = 1
            r2.A09 = r1
            X.E2V r0 = X.C18190wL.A0M(r2)
            r0.setIsLoading(r1)
            r1 = 0
            com.instagram.igds.components.form.IgFormField r0 = r2.A01
            r0.setEnabled(r1)
            com.instagram.igds.components.form.IgFormField r0 = r2.A03
            r0.setEnabled(r1)
            com.instagram.igds.components.form.IgFormField r0 = r2.A02
            r0.setEnabled(r1)
            r0 = -715069578(0xffffffffd560e776, float:-1.54552951E13)
            goto L_0x0586
        L_0x01e3:
            r0 = -1270476891(0xffffffffb4460fa5, float:-1.8445878E-7)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            r1 = 1
            java.lang.Object r0 = r5.A00
            X.1av r0 = (X.AnonymousClass1av) r0
            r0.A08 = r1
            X.AnonymousClass1av.A00(r0)
            r0 = -850019867(0xffffffffcd55b9e5, float:-2.24108112E8)
            goto L_0x0586
        L_0x01fc:
            r0 = -978084490(0xffffffffc5b39d76, float:-5747.6826)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A00
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            r1 = 1
            r0.A0B = r1
            X.E2V r0 = X.C18190wL.A0M(r0)
            r0.setIsLoading(r1)
            r0 = 511891444(0x1e82d7f4, float:1.3853602E-20)
            goto L_0x0586
        L_0x0219:
            r0 = -1993388809(0xffffffff892f4cf7, float:-2.1101047E-33)
            int r3 = X.C63873iU.A03(r5, r0)
            r0 = 1880175042(0x701131c2, float:1.7974192E29)
            goto L_0x0586
        L_0x0225:
            r0 = 1026193612(0x3d2a78cc, float:0.041619107)
            int r3 = X.C63873iU.A03(r5, r0)
            r0 = -429117080(0xffffffffe66c3168, float:-2.7884747E23)
            goto L_0x0586
        L_0x0231:
            r0 = 571123635(0x220aa7b3, float:1.8791267E-18)
            int r3 = X.C63873iU.A03(r5, r0)
            r0 = -1728003245(0xffffffff9900c353, float:-6.65689E-24)
            goto L_0x0586
        L_0x023d:
            r0 = 519214763(0x1ef296ab, float:2.5685061E-20)
            int r3 = X.C63873iU.A03(r5, r0)
            r0 = -942599450(0xffffffffc7d112e6, float:-107045.8)
            goto L_0x0586
        L_0x0249:
            r0 = -2113577799(0xffffffff82055cb9, float:-9.797907E-38)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A00
            X.1d9 r0 = (X.AnonymousClass1d9) r0
            X.1jv r0 = r0.A03
            r0.A01()
            r0 = -1386396440(0xffffffffad5d44e8, float:-1.2577696E-11)
            goto L_0x0586
        L_0x0261:
            r0 = -420941889(0xffffffffe6e8efbf, float:-5.5000578E23)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A00
            X.1d9 r0 = (X.AnonymousClass1d9) r0
            X.1jv r0 = r0.A03
            r0.A01()
            r0 = -1304889356(0xffffffffb238f7f4, float:-1.0766588E-8)
            goto L_0x0586
        L_0x0279:
            r0 = 1918989541(0x726174e5, float:4.4656284E30)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A00
            X.1d9 r0 = (X.AnonymousClass1d9) r0
            X.1jv r0 = r0.A03
            r0.A01()
            r0 = 1871344476(0x6f8a735c, float:8.569678E28)
            goto L_0x0586
        L_0x0291:
            r0 = -500195404(0xffffffffe22f9fb4, float:-8.09922E20)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1Yo r2 = (X.C22561Yo) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A05
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A05
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 708989549(0x2a42526d, float:1.7259259E-13)
            goto L_0x0586
        L_0x02ad:
            r0 = 1777888279(0x69f86c17, float:3.7540505E25)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1bL r2 = (X.AnonymousClass1bL) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 1112352472(0x424d26d8, float:51.287933)
            goto L_0x0586
        L_0x02cf:
            r0 = 761434490(0x2d62917a, float:1.2878915E-11)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 1520821382(0x5aa5e486, float:2.33473177E16)
            goto L_0x0586
        L_0x02f1:
            r0 = 1196194311(0x474c7a07, float:52346.027)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -225963630(0xfffffffff2881192, float:-5.390234E30)
            goto L_0x0586
        L_0x0313:
            r0 = -1166012448(0xffffffffba800fe0, float:-9.770356E-4)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1296807108(0xffffffffb2b44b3c, float:-2.098897E-8)
            goto L_0x0586
        L_0x0335:
            r0 = 1318989224(0x4e9e2da8, float:1.32689613E9)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1194918479(0xffffffffb8c6fdb1, float:-9.4886294E-5)
            goto L_0x0586
        L_0x0357:
            r0 = 733652914(0x2bbaa7b2, float:1.326264E-12)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 205465485(0xc3f278d, float:1.4726007E-31)
            goto L_0x0586
        L_0x0379:
            r0 = -595152509(0xffffffffdc86b183, float:-3.03302585E17)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 830923634(0x3186e372, float:3.925771E-9)
            goto L_0x0586
        L_0x039b:
            r0 = 158372031(0x97090bf, float:2.8957008E-33)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 719261388(0x2adf0ecc, float:3.9623025E-13)
            goto L_0x0586
        L_0x03bd:
            r0 = -333200880(0xffffffffec23c210, float:-7.918854E26)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -720444655(0xffffffffd50ee311, float:-9.8191184E12)
            goto L_0x0586
        L_0x03df:
            r0 = 533436704(0x1fcb9920, float:8.622717E-20)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1am r2 = (X.C22841am) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -2018933384(0xffffffff87a98578, float:-2.550674E-34)
            goto L_0x0586
        L_0x0401:
            r0 = 2035249370(0x794f70da, float:6.7318397E34)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.1Zj r1 = (X.C22761Zj) r1
            r0 = 1
            r1.A03 = r0
            r0 = -1150186282(0xffffffffbb718cd6, float:-0.0036857626)
            goto L_0x0586
        L_0x0414:
            r0 = -1854334910(0xffffffff91791842, float:-1.9650112E-28)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1Yw r2 = (X.C22641Yw) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            java.lang.String r4 = "confirmButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1338732681(0xffffffffb0348f77, float:-6.5687494E-10)
            goto L_0x0586
        L_0x0436:
            r0 = -234158731(0xfffffffff20b0575, float:-2.753601E30)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1Yw r2 = (X.C22641Yw) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            java.lang.String r4 = "confirmButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 1005083552(0x3be85ba0, float:0.0070910007)
            goto L_0x0586
        L_0x0458:
            r0 = -573030927(0xffffffffddd83df1, float:-1.94773441E18)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1Yw r2 = (X.C22641Yw) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            java.lang.String r4 = "confirmButton"
            if (r1 == 0) goto L_0x048e
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            if (r1 == 0) goto L_0x048e
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1439306156(0xffffffffaa35ee54, float:-1.6158716E-13)
            goto L_0x0586
        L_0x047a:
            r0 = -840805783(0xffffffffcde25269, float:-4.74631456E8)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A00
            X.1aj r0 = (X.AnonymousClass1aj) r0
            X.3Id r1 = r0.A00
            if (r1 != 0) goto L_0x0493
            java.lang.String r4 = "connectButtonHolder"
        L_0x048e:
            X.C04220Ms.A0E(r4)
            r0 = 0
            throw r0
        L_0x0493:
            r0 = 1
            r1.A04(r0)
            r0 = -677067417(0xffffffffd7a4c567, float:-3.62335487E14)
            goto L_0x0586
        L_0x049c:
            r0 = 1711855706(0x6608d85a, float:1.615582E23)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1sg r0 = (X.C27541sg) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A06
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -34302073(0xfffffffffdf49787, float:-4.06398E37)
            goto L_0x0586
        L_0x04b2:
            r0 = -360365852(0xffffffffea8540e4, float:-8.054679E25)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1ce r0 = (X.C23191ce) r0
            X.1jv r0 = r0.A01
            r0.A01()
            r0 = -903209039(0xffffffffca2a1fb1, float:-2787308.2)
            goto L_0x0586
        L_0x04c7:
            r0 = 515980302(0x1ec13c0e, float:2.0459508E-20)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1Yv r0 = (X.C22631Yv) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A03
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1817446948(0xffffffff93abf5dc, float:-4.3408905E-27)
            goto L_0x0586
        L_0x04dd:
            r0 = -670056524(0xffffffffd80fbfb4, float:-6.3221409E14)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1cf r0 = (X.AnonymousClass1cf) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -2020441625(0xffffffff879281e7, float:-2.2043988E-34)
            goto L_0x0586
        L_0x04f3:
            r0 = 230980591(0xdc47bef, float:1.2109269E-30)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.Iat r1 = (X.C34575Iat) r1
            r0 = 1
            r1.A02(r0)
            r0 = 66132692(0x3f11ad4, float:1.4170866E-36)
            goto L_0x0586
        L_0x0507:
            r0 = -1519674027(0xffffffffa56b9d55, float:-2.0436307E-16)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.Iat r1 = (X.C34575Iat) r1
            r0 = 1
            r1.A02(r0)
            r0 = 1771319334(0x69943026, float:2.239355E25)
            goto L_0x0586
        L_0x051a:
            r0 = 313933637(0x12b63f45, float:1.1501412E-27)
            int r3 = X.C63873iU.A03(r5, r0)
            r0 = 1497115973(0x593c2d45, float:3.31044187E15)
            goto L_0x0586
        L_0x0525:
            r0 = 525739454(0x1f5625be, float:4.5347482E-20)
            int r3 = X.C14030oh.A03(r0)
            r0 = 1068563387(0x3fb0fbbb, float:1.3826822)
            goto L_0x0586
        L_0x0530:
            r0 = -1241748518(0xffffffffb5fc6bda, float:-1.8806852E-6)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            X.1cm r0 = (X.C23211cm) r0
            X.1jv r0 = r0.A06
            r0.A01()
            r0 = -163497593(0xfffffffff6413987, float:-9.797657E32)
            goto L_0x0586
        L_0x0544:
            r0 = -960743603(0xffffffffc6bc374d, float:-24091.65)
            int r3 = X.C14030oh.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A00
            X.3Vj r0 = (X.C61783Vj) r0
            r4 = 1
            r0.A00 = r4
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            X.E2V r1 = X.E2V.A03(r2)
            r0 = 0
            r1.CtQ(r0, r4)
            X.E2V r0 = X.E2V.A03(r2)
            r0.setIsLoading(r4)
            r0 = -1065723934(0xffffffffc07a57e2, float:-3.911614)
            goto L_0x0586
        L_0x056a:
            r0 = -955767719(0xffffffffc7082459, float:-34852.348)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.1x2 r1 = (X.AnonymousClass1x2) r1
            r0 = 1
            r1.A0B = r0
            r0 = 981620205(0x3a8255ed, float:9.943821E-4)
            goto L_0x0586
        L_0x057c:
            r0 = -1444696233(0xffffffffa9e3af57, float:-1.0111242E-13)
            int r3 = X.C14030oh.A03(r0)
            r0 = 1290212786(0x4ce715b2, float:1.2115496E8)
        L_0x0586:
            X.C14030oh.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2.onStart():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v57, resolved type: com.instagram.location.surface.data.LocationPageInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v474, resolved type: X.1eT} */
    /* JADX WARNING: type inference failed for: r10v56 */
    /* JADX WARNING: type inference failed for: r10v58, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: type inference failed for: r10v59 */
    /* JADX WARNING: type inference failed for: r10v85 */
    /* JADX WARNING: Code restructure failed: missing block: B:1110:0x2ea5, code lost:
        if (X.C63803iN.A05(X.AnonymousClass0TJ.A05, r5.A02, 36325841252132123L).booleanValue() == false) goto L_0x2ea7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1211:0x3350, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, X.AnonymousClass0wJ.A0U(r6.A0L), 36325841252132123L) == false) goto L_0x3352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1354:0x397b, code lost:
        if (X.AnonymousClass00J.A0k(X.AnonymousClass3RK.A00, r3) != false) goto L_0x397d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1370:0x3a4b, code lost:
        X.C14030oh.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1371:0x3a4e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1390:0x3b7f, code lost:
        r10 = "response";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1391:0x3b82, code lost:
        r10 = "interestAccountsAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1392:0x3b84, code lost:
        X.C04220Ms.A0E(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1394:0x3b88, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1396:0x3bb6, code lost:
        X.C14030oh.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1397:0x3bb9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x1080, code lost:
        if (r2.AkL() != X.C313025c.A01) goto L_0x1082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x1a46, code lost:
        if (r4 == false) goto L_0x1a48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x1aba, code lost:
        if (r2 == false) goto L_0x1abc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x1b91, code lost:
        r0 = "twoFacPhoneVerificationHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x1b93, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x1b96, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x1e00, code lost:
        r10 = "twoFacIdentifier";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x1e04, code lost:
        r10 = X.C63833iQ.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x1e33, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x1e36, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x1e84, code lost:
        X.C14030oh.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x1e87, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x1eba, code lost:
        r10 = "igKeyLineTwo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x1ebe, code lost:
        r10 = "igKeyLineOne";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:741:0x1f4a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r34) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            int r2 = r1.A01
            switch(r2) {
                case 0: goto L_0x0074;
                case 1: goto L_0x00e2;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x012c;
                case 5: goto L_0x0171;
                case 6: goto L_0x0194;
                case 7: goto L_0x01ef;
                case 8: goto L_0x0270;
                case 9: goto L_0x0336;
                case 10: goto L_0x038c;
                case 11: goto L_0x03b9;
                case 12: goto L_0x0433;
                case 13: goto L_0x047e;
                case 14: goto L_0x0529;
                case 15: goto L_0x0629;
                case 16: goto L_0x0671;
                case 17: goto L_0x06b9;
                case 18: goto L_0x0009;
                case 19: goto L_0x0706;
                case 20: goto L_0x077b;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x07db;
                case 24: goto L_0x0802;
                case 25: goto L_0x083f;
                case 26: goto L_0x08f6;
                case 27: goto L_0x0948;
                case 28: goto L_0x0977;
                case 29: goto L_0x09a6;
                case 30: goto L_0x0a0f;
                case 31: goto L_0x0009;
                case 32: goto L_0x0a8c;
                case 33: goto L_0x0ab1;
                case 34: goto L_0x0b00;
                case 35: goto L_0x0b22;
                case 36: goto L_0x0b4e;
                case 37: goto L_0x0bbd;
                case 38: goto L_0x0bd9;
                case 39: goto L_0x0009;
                case 40: goto L_0x0009;
                case 41: goto L_0x0c7c;
                case 42: goto L_0x0cfc;
                case 43: goto L_0x0d2e;
                case 44: goto L_0x0d52;
                case 45: goto L_0x0d79;
                case 46: goto L_0x0d9f;
                case 47: goto L_0x0dfd;
                case 48: goto L_0x0e30;
                case 49: goto L_0x0f27;
                case 50: goto L_0x0f6d;
                case 51: goto L_0x0fe4;
                case 52: goto L_0x1034;
                case 53: goto L_0x105d;
                case 54: goto L_0x109d;
                case 55: goto L_0x1127;
                case 56: goto L_0x114c;
                case 57: goto L_0x1199;
                case 58: goto L_0x11de;
                case 59: goto L_0x1297;
                case 60: goto L_0x12c0;
                case 61: goto L_0x12ef;
                case 62: goto L_0x131e;
                case 63: goto L_0x1370;
                case 64: goto L_0x1466;
                case 65: goto L_0x1493;
                case 66: goto L_0x14c2;
                case 67: goto L_0x14fc;
                case 68: goto L_0x1529;
                case 69: goto L_0x156e;
                case 70: goto L_0x15a2;
                case 71: goto L_0x15cb;
                case 72: goto L_0x15f1;
                case 73: goto L_0x16aa;
                case 74: goto L_0x16d0;
                case 75: goto L_0x0009;
                case 76: goto L_0x170e;
                case 77: goto L_0x1754;
                case 78: goto L_0x17d1;
                case 79: goto L_0x1818;
                case 80: goto L_0x187f;
                case 81: goto L_0x18b6;
                case 82: goto L_0x18e5;
                case 83: goto L_0x0009;
                case 84: goto L_0x1910;
                case 85: goto L_0x193b;
                case 86: goto L_0x1982;
                case 87: goto L_0x1a78;
                case 88: goto L_0x1afc;
                case 89: goto L_0x1b66;
                case 90: goto L_0x1b97;
                case 91: goto L_0x1bfb;
                case 92: goto L_0x1c37;
                case 93: goto L_0x1c73;
                case 94: goto L_0x1cc3;
                case 95: goto L_0x1d5b;
                case 96: goto L_0x1e0a;
                case 97: goto L_0x1e37;
                case 98: goto L_0x1e88;
                case 99: goto L_0x1ec2;
                case 100: goto L_0x1ef2;
                case 101: goto L_0x0009;
                case 102: goto L_0x1f61;
                case 103: goto L_0x1fc8;
                case 104: goto L_0x2262;
                case 105: goto L_0x22ce;
                case 106: goto L_0x231b;
                case 107: goto L_0x0009;
                case 108: goto L_0x2372;
                case 109: goto L_0x23cf;
                case 110: goto L_0x240e;
                case 111: goto L_0x254f;
                case 112: goto L_0x261e;
                case 113: goto L_0x2648;
                case 114: goto L_0x2693;
                case 115: goto L_0x2727;
                case 116: goto L_0x2750;
                case 117: goto L_0x2779;
                case 118: goto L_0x2821;
                case 119: goto L_0x2848;
                case 120: goto L_0x286c;
                case 121: goto L_0x289d;
                case 122: goto L_0x28cb;
                case 123: goto L_0x290d;
                case 124: goto L_0x296d;
                case 125: goto L_0x29a1;
                case 126: goto L_0x29f1;
                case 127: goto L_0x2aee;
                case 128: goto L_0x2b2b;
                case 129: goto L_0x2b63;
                case 130: goto L_0x2bec;
                case 131: goto L_0x2c0f;
                case 132: goto L_0x2c3f;
                case 133: goto L_0x0009;
                case 134: goto L_0x2c63;
                case 135: goto L_0x2c8b;
                case 136: goto L_0x2cd6;
                case 137: goto L_0x2cff;
                case 138: goto L_0x2d47;
                case 139: goto L_0x2d90;
                case 140: goto L_0x2e07;
                case 141: goto L_0x0009;
                case 142: goto L_0x2e51;
                case 143: goto L_0x2ecb;
                case 144: goto L_0x2f0d;
                case 145: goto L_0x2fc2;
                case 146: goto L_0x2fea;
                case 147: goto L_0x3045;
                case 148: goto L_0x30e8;
                case 149: goto L_0x312c;
                case 150: goto L_0x3178;
                case 151: goto L_0x31ac;
                case 152: goto L_0x3200;
                case 153: goto L_0x324a;
                case 154: goto L_0x3289;
                case 155: goto L_0x32c1;
                case 156: goto L_0x3302;
                case 157: goto L_0x3367;
                case 158: goto L_0x3425;
                case 159: goto L_0x3475;
                case 160: goto L_0x34c9;
                case 161: goto L_0x354c;
                case 162: goto L_0x361b;
                case 163: goto L_0x36e9;
                case 164: goto L_0x3730;
                case 165: goto L_0x3761;
                case 166: goto L_0x3792;
                case 167: goto L_0x37c3;
                case 168: goto L_0x3808;
                case 169: goto L_0x384d;
                case 170: goto L_0x3872;
                case 171: goto L_0x389f;
                case 172: goto L_0x38b8;
                case 173: goto L_0x000d;
                case 174: goto L_0x391f;
                case 175: goto L_0x39aa;
                case 176: goto L_0x39ce;
                case 177: goto L_0x0009;
                case 178: goto L_0x39f6;
                case 179: goto L_0x3a12;
                case 180: goto L_0x3a4f;
                case 181: goto L_0x3aba;
                case 182: goto L_0x0009;
                case 183: goto L_0x0009;
                case 184: goto L_0x0009;
                case 185: goto L_0x3af9;
                case 186: goto L_0x3b89;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onSuccess(r0)
            return
        L_0x000d:
            r2 = 611109812(0x246ccbb4, float:5.1346886E-17)
            X.C14030oh.A03(r2)
            X.1UD r0 = (X.AnonymousClass1UD) r0
            r2 = -1620952716(0xffffffff9f623974, float:-4.7904886E-20)
            X.C14030oh.A03(r2)
            java.lang.Object r1 = r1.A00
            X.3Az r1 = (X.C57423Az) r1
            X.3Ay r7 = r1.A01
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            com.instagram.user.model.User r6 = X.D5D.A00(r0)
            com.instagram.urlhandler.IgMeMessageUrlHandlerActivity r5 = r7.A01
            r5.finish()
            java.lang.String r0 = r5.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.28g r0 = X.C316028g.SUCCESS
            com.instagram.urlhandler.IgMeMessageUrlHandlerActivity.A00(r0, r5, r1)
            X.0i6 r3 = r5.getSession()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318196210340079(0x810735000010ef, double:3.031111752832479E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x006d
            X.0i6 r2 = r5.getSession()
            X.C18200wM.A1R(r2)
            X.C04220Ms.A0B(r2, r4)
            X.4eO r1 = X.C76624eO.A00
            java.lang.Class<X.2TQ> r0 = X.AnonymousClass2TQ.class
            r2.A01(r0, r1)
            java.lang.String r0 = r7.A02
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r6.getId()
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
        L_0x006d:
            java.lang.String r0 = "Must call setInstanceSupplier first"
            X.AnonymousClass7Ko.A0E(r4, r0)
            goto L_0x3b87
        L_0x0074:
            r2 = -662699184(0xffffffffd8800350, float:-1.12601372E15)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1087031784(0xffffffffbf353618, float:-0.70785666)
            int r4 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r7 = r1.A00
            X.1by r7 = (X.C23131by) r7
            boolean r0 = r7.A02
            com.instagram.service.session.UserSession r8 = r7.A00
            if (r0 == 0) goto L_0x00d0
            X.2A2 r0 = X.AnonymousClass2A2.A02
            java.lang.String r3 = r0.toString()
            r6 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r8, r3)
            X.2AF r1 = X.AnonymousClass2AF.A06
            r0 = 0
            X.C63003bJ.A00(r1, r8, r3, r0)
            X.C18190wL.A19(r7)
            X.C18190wL.A19(r7)
        L_0x00a6:
            r7.A07 = r6
            X.C23131by.A01(r7)
            android.content.Context r1 = r7.getContext()
            r0 = 2131832178(0x7f112d72, float:1.9297402E38)
            X.C63813iO.A0A(r1, r0, r5)
            boolean r0 = r7.A03
            X.0m7 r1 = r7.getParentFragmentManager()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME"
        L_0x00bf:
            r1.A11(r0, r6)
            r0 = -303459960(0xffffffffede99188, float:-9.035743E27)
            X.C14030oh.A0A(r0, r4)
            r0 = -1035725643(0xffffffffc24414b5, float:-49.02022)
            goto L_0x3bb6
        L_0x00cd:
            java.lang.String r0 = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME"
            goto L_0x00bf
        L_0x00d0:
            X.2A2 r0 = X.AnonymousClass2A2.A03
            java.lang.String r3 = r0.toString()
            r6 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r8, r3)
            X.2AF r1 = X.AnonymousClass2AF.A06
            r0 = 0
            X.C63003bJ.A00(r1, r8, r3, r0)
            goto L_0x00a6
        L_0x00e2:
            r0 = -1486733620(0xffffffffa7623ecc, float:-3.1397843E-15)
            int r4 = X.C14030oh.A03(r0)
            r0 = 200690629(0xbf64bc5, float:9.486976E-32)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r1.A00
            X.1QY r6 = (X.AnonymousClass1QY) r6
            X.C18240wQ.A10(r6)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x010b
            com.instagram.service.session.UserSession r0 = r6.A00
            X.3hk r5 = X.C63533hk.A02(r0)
            java.lang.String r9 = r6.A03
            r10 = 1
            java.lang.Integer r8 = X.AnonymousClass006.A03
            com.instagram.service.session.UserSession r7 = r6.A00
            r5.A0B(r6, r7, r8, r9, r10)
        L_0x010b:
            androidx.fragment.app.Fragment r2 = r6.getTargetFragment()
            boolean r0 = r2 instanceof X.C82024ox
            if (r0 == 0) goto L_0x011c
            X.4ox r2 = (X.C82024ox) r2
            java.lang.String r1 = r6.A03
            java.lang.String r0 = r6.A02
            r2.CAL(r1, r0)
        L_0x011c:
            X.0m7 r0 = r6.mFragmentManager
            r0.A0d()
            r0 = -228714324(0xfffffffff25e18ac, float:-4.399072E30)
            X.C14030oh.A0A(r0, r3)
            r0 = -1217141769(0xffffffffb773e3f7, float:-1.4537006E-5)
            goto L_0x3a4b
        L_0x012c:
            r2 = 566530542(0x21c491ee, float:1.3320104E-18)
            int r4 = X.C14030oh.A03(r2)
            X.1UJ r0 = (X.AnonymousClass1UJ) r0
            r2 = -214692727(0xfffffffff3340c89, float:-1.4264949E31)
            int r3 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r1 = r1.A00
            X.4A9 r1 = (X.AnonymousClass4A9) r1
            X.3Vd r2 = r1.A00
            if (r2 == 0) goto L_0x014f
            X.39n r1 = X.AnonymousClass2JY.A00(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1eS
            if (r0 == 0) goto L_0x015a
            r2.A04(r1)
        L_0x014f:
            r0 = 713534161(0x2a87aad1, float:2.4099345E-13)
            X.C14030oh.A0A(r0, r3)
            r0 = 1775672114(0x69d69b32, float:3.2430377E25)
            goto L_0x3a4b
        L_0x015a:
            boolean r0 = r2 instanceof X.AnonymousClass1eR
            if (r0 == 0) goto L_0x0164
            X.7Jj r0 = r1.A02
        L_0x0160:
            r2.A04(r0)
            goto L_0x014f
        L_0x0164:
            X.1eT r2 = (X.AnonymousClass1eT) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x014f
            X.7Jj r0 = r1.A02
            X.3St r0 = X.C61323St.A00(r0)
            goto L_0x0160
        L_0x0171:
            r2 = -1758659420(0xffffffff972cfca4, float:-5.5895075E-25)
            int r4 = X.C14030oh.A03(r2)
            X.1Tl r0 = (X.C22121Tl) r0
            r2 = 24948962(0x17cb0e2, float:4.6411997E-38)
            int r2 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r1 = r1.A00
            X.3yv r1 = X.AnonymousClass0wJ.A0R(r1)
            r1.A02 = r0
            r0 = -303295641(0xffffffffedec1367, float:-9.13274E27)
            X.C14030oh.A0A(r0, r2)
            r0 = 180964301(0xac94bcd, float:1.9384109E-32)
            goto L_0x3a4b
        L_0x0194:
            r2 = 1990166975(0x769f89bf, float:1.6179082E33)
            int r4 = X.C14030oh.A03(r2)
            X.1S0 r0 = (X.AnonymousClass1S0) r0
            r2 = -290082505(0xffffffffeeb5b137, float:-2.8115513E28)
            int r2 = X.C14030oh.A03(r2)
            java.lang.Object r3 = r1.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r3 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r3
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A00
            if (r1 == 0) goto L_0x01cf
            java.util.HashMap r13 = X.AnonymousClass0wJ.A0y()
            boolean r1 = r0.A00
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "should_show_edit_contact_info_step"
            r13.put(r1, r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A00
            java.lang.String r6 = "account_type_selection"
            r9 = 0
            java.lang.String r7 = r3.A05
            java.lang.String r8 = "professional_conversion_nux_config"
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.BcA(r5)
        L_0x01cf:
            X.4td r1 = r3.mController
            r1.getClass()
            X.3yv r1 = X.AnonymousClass0wJ.A0R(r1)
            r1.A03 = r0
            android.os.Handler r1 = r3.A08
            X.4OP r0 = new X.4OP
            r0.<init>(r3)
            r1.post(r0)
            r0 = 229164098(0xda8c442, float:1.0401047E-30)
            X.C14030oh.A0A(r0, r2)
            r0 = -1066559884(0xffffffffc06d9674, float:-3.712308)
            goto L_0x3a4b
        L_0x01ef:
            r0 = 1850384920(0x6e4aa218, float:1.5677983E28)
            int r2 = X.C14030oh.A03(r0)
            r0 = 137362577(0x82ffc91, float:5.2959037E-34)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A00
            X.1bg r4 = (X.C22961bg) r4
            java.util.List r1 = r4.A06
            if (r1 != 0) goto L_0x0209
            java.lang.String r10 = "selectedObjectiveIds"
            goto L_0x3b84
        L_0x0209:
            java.util.Set r3 = r4.A09
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A02
            if (r0 == 0) goto L_0x0240
            java.util.HashMap r13 = X.AnonymousClass0wJ.A0y()
            r9 = 0
            r12 = 63
            r7 = r9
            r8 = r9
            r10 = r1
            r11 = r9
            java.lang.String r1 = X.AnonymousClass00J.A0H(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "objectives"
            r13.put(r0, r1)
            r10 = r3
            java.lang.String r1 = X.AnonymousClass00J.A0H(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "connection_methods"
            r13.put(r0, r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A02
            if (r0 == 0) goto L_0x0240
            java.lang.String r7 = "business_objectives"
            java.lang.String r8 = r4.A05
            X.JrQ r6 = new X.JrQ
            r10 = r9
            r12 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Bdx(r6)
        L_0x0240:
            X.0Oa r0 = r4.A0B
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A02
            X.C63873iU.A0H(r1, r0)
            X.0m7 r3 = r4.getParentFragmentManager()
            r1 = 1
            java.lang.String r0 = "BusinessObjectives"
            r3.A11(r0, r1)
            android.content.Context r4 = r4.requireContext()
            r3 = 0
            r1 = 2131821083(0x7f11021b, float:1.92749E38)
            r0 = 0
            X.C63813iO.A03(r4, r3, r1, r0)
            r0 = 1090659135(0x4102233f, float:8.133605)
            X.C14030oh.A0A(r0, r5)
            r0 = -49118971(0xfffffffffd128105, float:-1.2171075E37)
            goto L_0x3bb6
        L_0x0270:
            r2 = -1403498453(0xffffffffac58502b, float:-3.0739948E-12)
            int r3 = X.C14030oh.A03(r2)
            X.1Sx r0 = (X.C21981Sx) r0
            r2 = 2063518167(0x7afec9d7, float:6.614686E35)
            int r4 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r6 = r1.A00
            X.1bh r6 = (X.C22971bh) r6
            java.util.List r1 = r0.A01
            r6.A06 = r1
            X.0Oa r1 = r6.A0B
            java.lang.Object r2 = r1.getValue()
            X.0zu r2 = (X.C19460zu) r2
            java.util.List r1 = r0.A00
            X.56r r0 = r2.A00
            r0.A0H(r1)
            java.util.List r9 = r6.A06
            if (r9 != 0) goto L_0x029f
            java.lang.String r10 = "objectives"
            goto L_0x3b84
        L_0x029f:
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Set r5 = r6.A0A
            boolean r0 = r5.isEmpty()
            r8 = 1
            if (r0 == 0) goto L_0x02cc
            java.util.Iterator r2 = r9.iterator()
        L_0x02b0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r1 = r2.next()
            X.1TL r1 = (X.AnonymousClass1TL) r1
            java.lang.Boolean r0 = r1.A00
            boolean r0 = X.C18190wL.A1Z(r0, r8)
            if (r0 == 0) goto L_0x02b0
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x02b0
            r5.add(r0)
            goto L_0x02b0
        L_0x02cc:
            java.util.Iterator r8 = r9.iterator()
        L_0x02d0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0302
            java.lang.Object r2 = r8.next()
            X.1TL r2 = (X.AnonymousClass1TL) r2
            int r1 = r5.size()
            r0 = 2
            if (r1 < r0) goto L_0x02ec
            java.lang.Integer r0 = r2.A01
            boolean r0 = X.AnonymousClass00J.A0k(r5, r0)
            r1 = 0
            if (r0 == 0) goto L_0x02ed
        L_0x02ec:
            r1 = 1
        L_0x02ed:
            java.lang.Integer r0 = r2.A01
            boolean r0 = X.AnonymousClass00J.A0k(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.37a r0 = new X.37a
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x02d0
        L_0x0302:
            r6.A07 = r7
            X.10y r2 = r6.A01
            if (r2 != 0) goto L_0x030c
            java.lang.String r10 = "adapter"
            goto L_0x3b84
        L_0x030c:
            java.util.List r1 = X.AnonymousClass00J.A0N(r7)
            java.util.List r0 = r2.A01
            r0.clear()
            r0.addAll(r1)
            r2.notifyDataSetChanged()
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r6.A04
            if (r2 == 0) goto L_0x032b
            int r1 = r5.size()
            r0 = 2
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            r2.setPrimaryButtonEnabled(r0)
        L_0x032b:
            r0 = -993788536(0xffffffffc4c3fd88, float:-1567.9229)
            X.C14030oh.A0A(r0, r4)
            r0 = -1867839036(0xffffffff90ab09c4, float:-6.7462654E-29)
            goto L_0x1e33
        L_0x0336:
            r2 = -103088348(0xfffffffff9daff24, float:-1.4213695E35)
            int r4 = X.C14030oh.A03(r2)
            X.1S0 r0 = (X.AnonymousClass1S0) r0
            r2 = 1218002554(0x48993e7a, float:313843.8)
            int r5 = X.C14030oh.A03(r2)
            java.lang.Object r6 = r1.A00
            X.1cT r6 = (X.AnonymousClass1cT) r6
            android.view.View r3 = r6.A01
            if (r3 == 0) goto L_0x035d
            android.view.View r1 = r6.A00
            if (r1 == 0) goto L_0x035d
            r2 = 0
            r1 = 8
            r3.setVisibility(r1)
            android.view.View r1 = r6.A00
            r1.setVisibility(r2)
        L_0x035d:
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            r6.A0E = r0
            if (r0 == 0) goto L_0x0381
            com.instagram.business.ui.BusinessInfoSectionView r3 = r6.A04
            android.widget.TextView r1 = r3.A03
            r0 = 2131826704(0x7f111810, float:1.92863E38)
            r1.setText(r0)
            android.widget.TextView r2 = r3.A04
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131826705(0x7f111811, float:1.9286302E38)
            X.C18200wM.A18(r1, r2, r0)
            android.widget.TextView r1 = r3.A04
            r0 = 0
            r1.setVisibility(r0)
        L_0x0381:
            r0 = -1211968845(0xffffffffb7c2d2b3, float:-2.3224717E-5)
            X.C14030oh.A0A(r0, r5)
            r0 = 1601654580(0x5f774f34, float:1.7820519E19)
            goto L_0x3a4b
        L_0x038c:
            r2 = -1721781538(0xffffffff995fb2de, float:-1.1564952E-23)
            int r3 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r2 = -628263133(0xffffffffda8d7723, float:-1.9909482E16)
            int r2 = X.AnonymousClass0wJ.A00(r2, r0)
            super.onSuccess(r0)
            java.lang.Object r1 = r1.A00
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            java.lang.Object r0 = r0.D7H()
            X.32r r0 = (X.C553132r) r0
            boolean r0 = r0.A00
            r1.setChecked(r0)
            r0 = -1118039971(0xffffffffbd5c105d, float:-0.053726543)
            X.C14030oh.A0A(r0, r2)
            r0 = -434626524(0xffffffffe6182024, float:-1.7959815E23)
            goto L_0x1e33
        L_0x03b9:
            r2 = 41948937(0x2801709, float:1.8821131E-37)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = 565742616(0x21b88c18, float:1.2505407E-18)
            int r3 = X.C14030oh.A03(r3)
            X.3DU r8 = r0.A00
            java.lang.String r0 = r8.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0431
            java.lang.String r7 = r8.A06
            java.lang.String r6 = r8.A0B
            java.lang.String r5 = r8.A0E
            java.lang.String r0 = "CALL"
            com.instagram.model.business.PublicPhoneContact r4 = new com.instagram.model.business.PublicPhoneContact
            r4.<init>(r7, r6, r5, r0)
        L_0x03e0:
            java.lang.Object r5 = r1.A00
            X.1cS r5 = (X.AnonymousClass1cS) r5
            com.instagram.model.business.BusinessInfo r0 = r5.A05
            X.3Xl r1 = new X.3Xl
            r1.<init>(r0)
            java.lang.String r0 = r8.A07
            r1.A0B = r0
            r1.A01 = r4
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>((X.C62163Xl) r1)
            r5.A05 = r0
            r0 = 1
            X.AnonymousClass1cS.A00(r5, r0)
            java.lang.String r4 = r8.A07
            java.lang.String r1 = r8.A0E
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A01
            if (r0 == 0) goto L_0x0426
            java.util.HashMap r13 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "email"
            r13.put(r0, r4)
            java.lang.String r0 = "phone"
            r13.put(r0, r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A01
            java.lang.String r6 = "edit_contact_info"
            r9 = 0
            java.lang.String r7 = r5.A08
            java.lang.String r8 = "personal_contact_info"
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.BcA(r5)
        L_0x0426:
            r0 = -832803693(0xffffffffce5c6c93, float:-9.2452576E8)
            X.C14030oh.A0A(r0, r3)
            r0 = 650400(0x9eca0, float:9.11405E-40)
            goto L_0x3bb6
        L_0x0431:
            r4 = 0
            goto L_0x03e0
        L_0x0433:
            r0 = -287291036(0xffffffffeee04964, float:-3.4706683E28)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.4OW r0 = (X.AnonymousClass4OW) r0
            X.1cS r2 = r0.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            if (r1 == 0) goto L_0x045c
            java.lang.String r6 = "edit_contact_info"
            r9 = 0
            java.lang.String r7 = r2.A08
            java.lang.String r8 = "save_info"
            com.instagram.model.business.BusinessInfo r0 = r2.A05
            java.util.Map r12 = X.C34492Jt.A00(r0)
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Bdx(r5)
        L_0x045c:
            X.4td r0 = r2.A02
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r8 = 0
            r0.Bel(r8)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A01
            if (r0 == 0) goto L_0x0479
            java.lang.String r6 = "edit_contact_info"
            java.lang.String r7 = r2.A08
            X.JrQ r5 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.BcE(r5)
        L_0x0479:
            r0 = 2001110379(0x7746856b, float:4.0264876E33)
            goto L_0x3a4b
        L_0x047e:
            r2 = 1860500935(0x6ee4fdc7, float:3.543469E28)
            int r4 = X.C14030oh.A03(r2)
            X.1is r0 = (X.C24481is) r0
            r2 = 563373425(0x21946571, float:1.0055721E-18)
            int r2 = X.C14030oh.A03(r2)
            java.lang.Object r3 = r1.A00
            X.1da r3 = (X.C23331da) r3
            android.view.View r1 = r3.mView
            r5 = 0
            X.C50242sg.A00(r1, r5)
            if (r0 == 0) goto L_0x0503
            X.34f r1 = r0.A00
            if (r1 == 0) goto L_0x04f1
            X.34e r1 = r1.A00
            if (r1 == 0) goto L_0x04f1
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x04f1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04f1
            X.34f r0 = r0.A00
            X.34e r0 = r0.A00
            java.util.List r1 = r0.A00
            android.view.View r0 = r3.A01
            r0.setVisibility(r5)
            X.1fO r7 = r3.A03
            com.google.common.collect.ImmutableList r0 = X.AnonymousClass2KB.A00(r1)
            java.util.List r6 = r7.A05
            r6.clear()
            r6.addAll(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04d9
            X.4sY r1 = r7.A04
            java.lang.Object r0 = r6.get(r5)
            X.3IK r0 = (X.AnonymousClass3IK) r0
            r1.Crt(r0)
            X.AnonymousClass1fO.A00(r7)
        L_0x04d9:
            X.1fO r0 = r3.A03
            X.3IK r0 = r0.A00
            r3.A04 = r0
        L_0x04df:
            android.widget.ImageView r1 = r3.A02
            r0 = 8
            r1.setVisibility(r0)
            r0 = 71225232(0x43ecf90, float:2.24297E-36)
        L_0x04e9:
            X.C14030oh.A0A(r0, r2)
            r0 = 1916181263(0x72369b0f, float:3.6168785E30)
            goto L_0x3a4b
        L_0x04f1:
            X.34f r0 = r0.A00
            if (r0 == 0) goto L_0x0503
            X.34e r0 = r0.A00
            if (r0 == 0) goto L_0x0503
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x04df
            android.view.View r0 = r3.A00
            r0.setVisibility(r5)
            goto L_0x04df
        L_0x0503:
            r0 = 2131826864(0x7f1118b0, float:1.9286624E38)
            java.lang.String r1 = r3.getString(r0)
            android.content.Context r0 = r3.getContext()
            X.C63813iO.A01(r0, r1)
            android.view.View r0 = r3.mView
            X.C50242sg.A00(r0, r5)
            X.1fO r1 = r3.A03
            java.util.List r0 = r1.A05
            r0.clear()
            X.AnonymousClass1fO.A00(r1)
            android.widget.ImageView r0 = r3.A02
            r0.setVisibility(r5)
            r0 = -1427171357(0xffffffffaaef17e3, float:-4.2471503E-13)
            goto L_0x04e9
        L_0x0529:
            r2 = 602749269(0x23ed3955, float:2.5719873E-17)
            int r2 = X.C14030oh.A03(r2)
            X.1Rz r0 = (X.C21741Rz) r0
            r3 = -61270556(0xfffffffffc5915e4, float:-4.5086897E36)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r4 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r4
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r4.A02
            if (r1 == 0) goto L_0x0553
            java.lang.String r6 = "invite_followers"
            r9 = 0
            java.lang.String r7 = r4.A05
            X.JrQ r5 = new X.JrQ
            r8 = r6
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.BcA(r5)
        L_0x0553:
            java.util.List r7 = r0.A00
            if (r7 == 0) goto L_0x060d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x060d
            r1 = 1
            com.instagram.service.session.UserSession r0 = r4.A04
            X.3Va r6 = new X.3Va
            r6.<init>(r4, r4, r0, r1)
            r6.A00 = r4
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r12 = r7.iterator()
        L_0x056f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x061b
            java.lang.Object r11 = r12.next()
            X.3HW r11 = (X.AnonymousClass3HW) r11
            java.lang.String r10 = r11.A05
            X.234[] r9 = X.AnonymousClass234.values()
            int r8 = r9.length
            r7 = 0
        L_0x0583:
            if (r7 >= r8) goto L_0x0592
            r1 = r9[r7]
            java.lang.String r0 = r1.A00
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0593
            int r7 = r7 + 1
            goto L_0x0583
        L_0x0592:
            r1 = 0
        L_0x0593:
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x05ab;
                case 1: goto L_0x05bb;
                case 2: goto L_0x05cb;
                case 3: goto L_0x059a;
                case 4: goto L_0x05d1;
                case 5: goto L_0x05d7;
                case 6: goto L_0x05e7;
                case 7: goto L_0x05f7;
                case 8: goto L_0x059b;
                default: goto L_0x059a;
            }
        L_0x059a:
            goto L_0x056f
        L_0x059b:
            java.lang.String r1 = r11.A02
            r0 = 190(0xbe, float:2.66E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r11, r6, r0)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r1)
            r0 = 2131233065(0x7f080929, float:1.8082257E38)
            goto L_0x0606
        L_0x05ab:
            java.lang.String r1 = r11.A02
            r0 = 164(0xa4, float:2.3E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r1)
            r0 = 2131233122(0x7f080962, float:1.8082373E38)
            goto L_0x0606
        L_0x05bb:
            java.lang.String r1 = r11.A02
            r0 = 160(0xa0, float:2.24E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r1)
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            goto L_0x0606
        L_0x05cb:
            java.lang.String r0 = r11.A02
            r6.A02(r5, r0)
            goto L_0x056f
        L_0x05d1:
            java.lang.String r0 = r11.A02
            r6.A03(r5, r0)
            goto L_0x056f
        L_0x05d7:
            java.lang.String r1 = r11.A02
            r0 = 163(0xa3, float:2.28E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r1)
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
            goto L_0x0606
        L_0x05e7:
            java.lang.String r1 = r11.A02
            r0 = 162(0xa2, float:2.27E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r1)
            r0 = 2131232974(0x7f0808ce, float:1.8082072E38)
            goto L_0x0606
        L_0x05f7:
            java.lang.String r1 = r11.A02
            r0 = 161(0xa1, float:2.26E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r1)
            r0 = 2131232255(0x7f0805ff, float:1.8080614E38)
        L_0x0606:
            r1.A01 = r0
            r5.add(r1)
            goto L_0x056f
        L_0x060d:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A00(r1, r0)
            r0 = 2096059913(0x7cef5609, float:9.9416316E36)
            goto L_0x0621
        L_0x061b:
            r4.setItems(r5)
            r0 = 1610493240(0x5ffe2d38, float:3.6630714E19)
        L_0x0621:
            X.C14030oh.A0A(r0, r3)
            r0 = -1419884306(0xffffffffab5e48ee, float:-7.8971454E-13)
            goto L_0x3bb6
        L_0x0629:
            r0 = -382974915(0xffffffffe92c443d, float:-1.3016093E25)
            int r2 = X.C14030oh.A03(r0)
            r0 = 2137346099(0x7f655033, float:3.0480963E38)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r1.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r3 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r3
            r0 = 0
            r3.A08 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A02
            if (r0 == 0) goto L_0x0654
            java.lang.String r6 = "invite_followers"
            r8 = 0
            java.lang.String r7 = r3.A05
            X.JrQ r5 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Bdx(r5)
        L_0x0654:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0663
            com.instagram.service.session.UserSession r0 = r3.A04
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            X.C63873iU.A0H(r1, r0)
        L_0x0663:
            X.C18210wN.A14(r3)
            r0 = 1374797914(0x51f1c05a, float:1.2978928E11)
            X.C14030oh.A0A(r0, r4)
            r0 = 926833506(0x373e5b62, float:1.1346159E-5)
            goto L_0x3bb6
        L_0x0671:
            r0 = -999312748(0xffffffffc46fb294, float:-958.7903)
            int r4 = X.C14030oh.A03(r0)
            r0 = -359161606(0xffffffffea97a0fa, float:-9.165399E25)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r1.A00
            X.1bz r2 = (X.C23141bz) r2
            r0 = 0
            r2.A08 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A03
            if (r0 == 0) goto L_0x069c
            java.lang.String r6 = "learn_professional_tools"
            r8 = 0
            java.lang.String r7 = r2.A06
            X.JrQ r5 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Bdx(r5)
        L_0x069c:
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x06ab
            com.instagram.service.session.UserSession r0 = r2.A05
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A15
            X.C63873iU.A0H(r1, r0)
        L_0x06ab:
            X.C18180wK.A12(r2)
            r0 = -1684641726(0xffffffff9b966842, float:-2.4882793E-22)
            X.C14030oh.A0A(r0, r3)
            r0 = 295200577(0x11986741, float:2.4045007E-28)
            goto L_0x3a4b
        L_0x06b9:
            r0 = 1148718738(0x44780e92, float:992.22766)
            int r3 = X.C14030oh.A03(r0)
            r0 = -1477088170(0xffffffffa7f56c56, float:-6.811862E-15)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r0 = r0.A00
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape201S0100000_1_I2) r0
            java.lang.Object r2 = r0.A00
            com.instagram.business.fragment.OnboardingCheckListFragment r2 = (com.instagram.business.fragment.OnboardingCheckListFragment) r2
            X.3IJ r1 = r2.A04
            java.lang.String r8 = "skip"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A04
            java.lang.String r6 = "onboarding_checklist"
            r9 = 0
            java.lang.String r7 = r1.A08
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Bdx(r5)
            com.instagram.service.session.UserSession r0 = r2.A07
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.45d r0 = new X.45d
            r0.<init>()
            r1.CWx(r0)
            r2.A00()
            r0 = 1362179274(0x513134ca, float:4.7568429E10)
            X.C14030oh.A0A(r0, r4)
            r0 = 2098345485(0x7d12360d, float:1.2146746E37)
            goto L_0x1e33
        L_0x0706:
            r2 = -1560064736(0xffffffffa3034d20, float:-7.117856E-18)
            int r4 = X.C14030oh.A03(r2)
            X.1S0 r0 = (X.AnonymousClass1S0) r0
            r2 = 1297814619(0x4d5b145b, float:2.2972152E8)
            int r5 = X.C14030oh.A03(r2)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0759
            java.lang.Object r0 = r1.A00
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r0 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r0
            android.view.View r2 = r0.mRootView
            r0 = 2131306096(0x7f092670, float:1.8230381E38)
            android.view.View r7 = r2.requireViewById(r0)
            r0 = 2131297341(0x7f09043d, float:1.8212624E38)
            android.view.View r2 = r7.requireViewById(r0)
            r0 = 0
            r2.setVisibility(r0)
            r0 = 2131297346(0x7f090442, float:1.8212634E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r7, r0)
            r0 = 2131297347(0x7f090443, float:1.8212636E38)
            android.widget.TextView r3 = X.AnonymousClass0wJ.A0L(r7, r0)
            r0 = 2131297348(0x7f090444, float:1.8212638E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r7, r0)
            r0 = 2131833807(0x7f1133cf, float:1.9300706E38)
            r6.setText(r0)
            r0 = 2131833808(0x7f1133d0, float:1.9300709E38)
            r3.setText(r0)
            r0 = 2131833809(0x7f1133d1, float:1.930071E38)
            r2.setText(r0)
        L_0x0759:
            java.lang.Object r3 = r1.A00
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r3 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r3
            android.view.View r2 = r3.A01
            if (r2 == 0) goto L_0x0770
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x0770
            r1 = 0
            r0 = 8
            r2.setVisibility(r0)
            android.view.View r0 = r3.A00
            r0.setVisibility(r1)
        L_0x0770:
            r0 = 811110090(0x30588eca, float:7.878326E-10)
            X.C14030oh.A0A(r0, r5)
            r0 = -1387726197(0xffffffffad48fa8b, float:-1.14243155E-11)
            goto L_0x3a4b
        L_0x077b:
            r2 = -1449082542(0xffffffffa9a0c152, float:-7.138963E-14)
            int r3 = X.C14030oh.A03(r2)
            X.1S0 r0 = (X.AnonymousClass1S0) r0
            r2 = 2001559732(0x774d60b4, float:4.1655556E33)
            int r2 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r4 = r1.A00
            X.1cU r4 = (X.AnonymousClass1cU) r4
            java.util.HashMap r13 = X.AnonymousClass0wJ.A0y()
            boolean r1 = r0.A00
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "should_show_edit_contact_info_step"
            r13.put(r1, r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r4.A07
            if (r1 != 0) goto L_0x07a6
            java.lang.String r10 = "logger"
            goto L_0x3b84
        L_0x07a6:
            java.lang.String r6 = "renew"
            r9 = 0
            java.lang.String r7 = r4.A0B
            java.lang.String r8 = "professional_conversion_nux_config"
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.BcA(r5)
            X.4td r1 = r4.A08
            if (r1 != 0) goto L_0x07c0
            java.lang.String r10 = "controller"
            goto L_0x3b84
        L_0x07c0:
            X.3yv r1 = X.AnonymousClass0wJ.A0R(r1)
            r1.A03 = r0
            android.os.Handler r1 = r4.A0D
            X.4Oa r0 = new X.4Oa
            r0.<init>(r4)
            r1.post(r0)
            r0 = -307939070(0xffffffffeda53902, float:-6.391743E27)
            X.C14030oh.A0A(r0, r2)
            r0 = 168101108(0xa0504f4, float:6.404649E-33)
            goto L_0x1e33
        L_0x07db:
            r2 = -1696531143(0xffffffff9ae0fd39, float:-9.305333E-23)
            int r3 = X.C14030oh.A03(r2)
            r2 = 128725220(0x7ac30e4, float:2.590842E-34)
            int r2 = X.C14030oh.A03(r2)
            super.onSuccess(r0)
            java.lang.Object r0 = r1.A00
            com.instagram.business.fragment.SuggestBusinessFragment r0 = (com.instagram.business.fragment.SuggestBusinessFragment) r0
            X.1fT r0 = com.instagram.business.fragment.SuggestBusinessFragment.A00(r0)
            r0.A00()
            r0 = -1472719543(0xffffffffa8381549, float:-1.0218667E-14)
            X.C14030oh.A0A(r0, r2)
            r0 = 1899905701(0x713e42a5, float:9.421235E29)
            goto L_0x1e33
        L_0x0802:
            r0 = 769122044(0x2dd7defc, float:2.4541695E-11)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1635683229(0x617e8b9d, float:2.9347082E20)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r1.A00
            com.instagram.business.fragment.SuggestBusinessFragment r3 = (com.instagram.business.fragment.SuggestBusinessFragment) r3
            r0 = 0
            r3.A09 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A01
            if (r1 == 0) goto L_0x0822
            X.JrQ r0 = X.C18240wQ.A0M(r3)
            r1.Bdx(r0)
        L_0x0822:
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0831
            com.instagram.service.session.UserSession r0 = r3.A04
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C63873iU.A0H(r1, r0)
        L_0x0831:
            X.C18210wN.A14(r3)
            r0 = 1177708206(0x463266ae, float:11417.67)
            X.C14030oh.A0A(r0, r4)
            r0 = 918654383(0x36c18daf, float:5.7683424E-6)
            goto L_0x3bb6
        L_0x083f:
            r2 = -789272814(0xffffffffd0f4a712, float:-3.28367186E10)
            int r4 = X.C14030oh.A03(r2)
            X.1Tl r0 = (X.C22121Tl) r0
            r2 = 283395573(0x10e445f5, float:9.003793E-29)
            int r3 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r6 = r1.A00
            X.3IJ r6 = (X.AnonymousClass3IJ) r6
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r6.A04
            java.lang.String r8 = "onboarding_checklist"
            r10 = 0
            java.lang.String r9 = r6.A08
            X.JrQ r7 = new X.JrQ
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.BcA(r7)
            java.util.List r5 = r0.A03
            X.0Ok r2 = X.C06810aP.A01
            com.instagram.service.session.UserSession r1 = r6.A07
            com.instagram.user.model.User r1 = r2.A01(r1)
            boolean r1 = r1.A3a()
            if (r1 == 0) goto L_0x0883
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x0883
            if (r5 == 0) goto L_0x0888
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0888
        L_0x0883:
            com.instagram.business.fragment.OnboardingCheckListFragment r1 = r6.A05
            r1.A00()
        L_0x0888:
            X.23X r1 = r0.A00
            r6.A00 = r1
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0892
            r6.A02 = r1
        L_0x0892:
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x0898
            r6.A01 = r1
        L_0x0898:
            java.util.List r1 = r0.A03
            if (r1 == 0) goto L_0x089f
            r6.A02(r1)
        L_0x089f:
            boolean r1 = X.AnonymousClass3IJ.A09
            if (r1 != 0) goto L_0x08c6
            X.23X r2 = r6.A00
            X.23X r1 = X.AnonymousClass23X.RESURRECTED
            if (r2 != r1) goto L_0x08c6
            X.3V5 r7 = r6.A06
            com.instagram.service.session.UserSession r1 = r7.A01
            X.H1T r5 = X.AnonymousClass0wJ.A0N(r1)
            java.lang.String r1 = "business/account/set_onboarding_checklist_has_opened_status/"
            r5.A0J(r1)
            java.lang.Class<X.4vo> r2 = X.C85814vo.class
            java.lang.Class<X.3Za> r1 = X.AnonymousClass3Za.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r5, r2, r1)
            X.8kf r1 = r7.A00
            r1.schedule(r2)
            r1 = 1
            X.AnonymousClass3IJ.A09 = r1
        L_0x08c6:
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x08eb
            X.3V5 r0 = r6.A06
            X.8kf r5 = r0.A00
            com.instagram.service.session.UserSession r0 = r0.A01
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r0)
            java.lang.String r0 = "business/account/set_onboarding_checklist_should_show_reminder/"
            r2.A0J(r0)
            java.lang.String r1 = "value"
            java.lang.String r0 = "0"
            r2.A0O(r1, r0)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            X.H8c r0 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r5.schedule(r0)
        L_0x08eb:
            r0 = -2050429035(0xffffffff85c8ef95, float:-1.8895918E-35)
            X.C14030oh.A0A(r0, r3)
            r0 = 1095128627(0x41465633, float:12.396045)
            goto L_0x3a4b
        L_0x08f6:
            r2 = -1362339472(0xffffffffaecc5970, float:-9.292733E-11)
            int r3 = X.C14030oh.A03(r2)
            r2 = -2085490071(0xffffffff83b1f269, float:-1.045878E-36)
            int r5 = X.C14030oh.A03(r2)
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            super.onSuccess(r0)
            java.lang.Object r4 = r1.A00
            X.1aj r4 = (X.AnonymousClass1aj) r4
            X.0Oa r0 = r4.A03
            java.lang.Object r2 = r0.getValue()
            X.K2b r2 = (X.C37741K2b) r2
            X.Iu2 r0 = X.C35394Iu2.A0N
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "connect_button"
            r2.A0Q(r1, r0)
            X.C62883b4.A03()
            X.Ibk r2 = new X.Ibk
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            X.0Oa r0 = r4.A04
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            X.0i6 r0 = (X.C10300i6) r0
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            X.C18230wP.A19(r2, r0)
            r0 = -433272436(0xffffffffe62cc98c, float:-2.0399123E23)
            X.C14030oh.A0A(r0, r5)
            r0 = -1359302799(0xffffffffaefaaf71, float:-1.13998484E-10)
            goto L_0x1e33
        L_0x0948:
            r0 = -428664602(0xffffffffe67318e6, float:-2.8699859E23)
            int r3 = X.C14030oh.A03(r0)
            r0 = 1812442010(0x6c07ab9a, float:6.560614E26)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A00
            X.1ai r4 = (X.AnonymousClass1ai) r4
            X.K2b r2 = X.AnonymousClass1ai.A00(r4)
            X.Iu2 r0 = X.C35394Iu2.A0b
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "claim"
            r2.A0Q(r1, r0)
            X.AnonymousClass1ai.A05(r4)
            r0 = -499476582(0xffffffffe23a979a, float:-8.605046E20)
            X.C14030oh.A0A(r0, r5)
            r0 = 1840185378(0x6daf0022, float:6.7700047E27)
            goto L_0x1e33
        L_0x0977:
            r0 = -963155752(0xffffffffc69768d8, float:-19380.422)
            int r3 = X.C14030oh.A03(r0)
            r0 = 1372935372(0x51d554cc, float:1.14531336E11)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A00
            X.1ai r4 = (X.AnonymousClass1ai) r4
            X.K2b r2 = X.AnonymousClass1ai.A00(r4)
            X.Iu2 r0 = X.C35394Iu2.A0b
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "page_created"
            r2.A0Q(r1, r0)
            X.AnonymousClass1ai.A05(r4)
            r0 = 126831510(0x78f4b96, float:2.1560674E-34)
            X.C14030oh.A0A(r0, r5)
            r0 = -519305529(0xffffffffe10c06c7, float:-1.6143953E20)
            goto L_0x1e33
        L_0x09a6:
            r2 = -1395602908(0xffffffffacd0ca24, float:-5.9341577E-12)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1849871540(0x6e42ccb4, float:1.5071891E28)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r4 = r0.A01
            X.3Ih r4 = (X.C58933Ih) r4
            if (r4 == 0) goto L_0x0a0d
            java.lang.Class<X.14v> r3 = X.C204814v.class
            java.lang.String r0 = "page_set_visibility"
            X.3Ih r4 = r4.A00(r3, r0)
            if (r4 == 0) goto L_0x0a0d
            java.lang.Class<X.14u> r3 = X.C204714u.class
            java.lang.String r0 = "page"
            X.3Ih r3 = r4.A00(r3, r0)
            if (r3 == 0) goto L_0x0a0d
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.A05(r0)
        L_0x09d6:
            java.lang.String r4 = "publish_page"
            java.lang.Object r3 = r1.A00
            X.1ai r3 = (X.AnonymousClass1ai) r3
            if (r0 == 0) goto L_0x09f9
            X.K2b r1 = X.AnonymousClass1ai.A00(r3)
            X.Iu2 r0 = X.C35394Iu2.A0b
            java.lang.String r0 = r0.toString()
            r1.A0Q(r0, r4)
            X.AnonymousClass1ai.A05(r3)
        L_0x09ee:
            r0 = -1081602594(0xffffffffbf880dde, float:-1.0629232)
            X.C14030oh.A0A(r0, r5)
            r0 = -617652415(0xffffffffdb2f5f41, float:-4.9362854E16)
            goto L_0x3bb6
        L_0x09f9:
            X.K2b r3 = X.AnonymousClass1ai.A00(r3)
            X.Iu2 r0 = X.C35394Iu2.A0b
            java.lang.String r1 = r0.toString()
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.A12
            java.lang.String r0 = r0.toString()
            r3.A0R(r1, r4, r0)
            goto L_0x09ee
        L_0x0a0d:
            r0 = 0
            goto L_0x09d6
        L_0x0a0f:
            r2 = -103400139(0xfffffffff9d63d35, float:-1.3904912E35)
            int r2 = X.C14030oh.A03(r2)
            X.1S3 r0 = (X.AnonymousClass1S3) r0
            r3 = -1670186916(0xffffffff9c72f85c, float:-8.039208E-22)
            int r5 = X.C14030oh.A03(r3)
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            java.lang.Object r8 = r1.A00
            X.1cE r8 = (X.AnonymousClass1cE) r8
            X.0Oa r7 = r8.A05
            java.lang.Object r3 = r7.getValue()
            X.K2b r3 = (X.C37741K2b) r3
            X.Iu2 r6 = X.C35394Iu2.A0t
            java.lang.String r1 = "submit_non_discrimination"
            r3.A0H(r6, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r1 = r0.A00
            if (r1 == 0) goto L_0x0a51
            android.content.Context r3 = r8.requireContext()
            r1 = 2131833503(0x7f11329f, float:1.930009E38)
            java.lang.String r1 = r8.getString(r1)
            r9 = 0
            X.C63813iO.A02(r3, r1, r9, r4)
            X.3Id r1 = r8.A00
            if (r1 != 0) goto L_0x0a66
            java.lang.String r0 = "acceptButtonHolder"
            goto L_0x1b93
        L_0x0a51:
            java.lang.Object r3 = r7.getValue()
            X.K2b r3 = (X.C37741K2b) r3
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "ACCEPTED_NON_DISCRIMINATION"
            r3.A0Q(r1, r0)
            r8.A02 = r4
            X.C18180wK.A12(r8)
            goto L_0x0a81
        L_0x0a66:
            r1.A04(r4)
            java.lang.Object r4 = r7.getValue()
            X.K2b r4 = (X.C37741K2b) r4
            java.lang.String r3 = r6.toString()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r0 = r0.A00
            java.lang.String r1 = "NETWORK_ERROR"
            if (r0 == 0) goto L_0x0a7d
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0a7e
        L_0x0a7d:
            r0 = r1
        L_0x0a7e:
            r4.A0R(r3, r1, r0)
        L_0x0a81:
            r0 = 1916282545(0x723826b1, float:3.647489E30)
            X.C14030oh.A0A(r0, r5)
            r0 = -538910083(0xffffffffdfe0e27d, float:-3.2409304E19)
            goto L_0x3bb6
        L_0x0a8c:
            r2 = -942469640(0xffffffffc7d30df8, float:-108059.94)
            int r2 = X.C14030oh.A03(r2)
            X.1Sw r0 = (X.C21971Sw) r0
            r3 = 821318930(0x30f45512, float:1.7777515E-9)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r1 = r1.A00
            X.4ss r1 = (X.C84274ss) r1
            r1.CGe(r0)
            r0 = -1999794321(0xffffffff88cd8f6f, float:-1.237171E-33)
            X.C14030oh.A0A(r0, r3)
            r0 = 1815443885(0x6c3579ad, float:8.775607E26)
            goto L_0x3bb6
        L_0x0ab1:
            r2 = 1697465488(0x652d4490, float:5.1139635E22)
            int r4 = X.C14030oh.A03(r2)
            X.1SW r0 = (X.AnonymousClass1SW) r0
            r2 = -833624006(0xffffffffce4fe83a, float:-8.7202573E8)
            int r6 = X.C14030oh.A03(r2)
            java.util.List r0 = r0.A00
            com.google.common.collect.ImmutableList r5 = X.C18220wO.A0S(r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0afa
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2 = 0
            java.lang.Object r0 = r5.get(r2)
            X.3DP r0 = (X.AnonymousClass3DP) r0
            boolean r0 = r0.A0D
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0afa
            java.lang.Object r1 = r1.A00
            X.4sc r1 = (X.C84144sc) r1
            java.lang.Object r0 = r5.get(r2)
            X.3DP r0 = (X.AnonymousClass3DP) r0
        L_0x0aec:
            r1.Byu(r0)
            r0 = 160049774(0x98a2a6e, float:3.3262192E-33)
            X.C14030oh.A0A(r0, r6)
            r0 = 1365780642(0x516828a2, float:6.2319632E10)
            goto L_0x3a4b
        L_0x0afa:
            java.lang.Object r1 = r1.A00
            X.4sc r1 = (X.C84144sc) r1
            r0 = 0
            goto L_0x0aec
        L_0x0b00:
            r2 = 1288813156(0x4cd1ba64, float:1.0995792E8)
            int r2 = X.C14030oh.A03(r2)
            X.1Sz r0 = (X.C22001Sz) r0
            r3 = 2035530684(0x7953bbbc, float:6.8711396E34)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A00
            X.4rL r1 = (X.C83414rL) r1
            r1.CNk(r0)
            r0 = -575738758(0xffffffffddaeec7a, float:-1.57557295E18)
            X.C14030oh.A0A(r0, r3)
            r0 = -1460880825(0xffffffffa8ecba47, float:-2.6282048E-14)
            goto L_0x3bb6
        L_0x0b22:
            r2 = -1671184699(0xffffffff9c63bec5, float:-7.5354563E-22)
            int r2 = X.C14030oh.A03(r2)
            X.1Tl r0 = (X.C22121Tl) r0
            r3 = -121638487(0xfffffffff8bff1a9, float:-3.1144692E34)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r1.A00
            X.1iU r3 = (X.AnonymousClass1iU) r3
            X.3yv r1 = r3.A06
            if (r1 == 0) goto L_0x0b3c
            r1.A02 = r0
        L_0x0b3c:
            X.4su r1 = r3.A07
            X.266 r0 = r3.A0A
            r1.CGg(r0)
            r0 = 1110841788(0x423619bc, float:45.52513)
            X.C14030oh.A0A(r0, r4)
            r0 = 314898522(0x12c4f85a, float:1.2430562E-27)
            goto L_0x3bb6
        L_0x0b4e:
            r2 = 2140797339(0x7f99f99b, float:NaN)
            int r2 = X.C14030oh.A03(r2)
            X.1qv r0 = (X.C26611qv) r0
            r3 = -907617020(0xffffffffc9e6dd04, float:-1891232.5)
            int r4 = X.C14030oh.A03(r3)
            X.3GW r3 = X.AnonymousClass3GW.A00
            java.lang.Object r5 = r1.A00
            com.instagram.challenge.activity.ChallengeActivity r5 = (com.instagram.challenge.activity.ChallengeActivity) r5
            X.0i6 r1 = r5.A02
            X.49w r6 = r3.A00(r1)
            if (r6 == 0) goto L_0x0b88
            java.lang.Integer r3 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r3 != r1) goto L_0x0b93
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r1 = r0.A07
            java.lang.Integer r3 = X.C34642Ki.A00(r1)
            java.util.HashMap r1 = r0.A09
            if (r1 != 0) goto L_0x0b84
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x0b84:
            r0 = 0
            r6.A04(r5, r3, r0, r1)
        L_0x0b88:
            r0 = -971971446(0xffffffffc610e48a, float:-9273.135)
            X.C14030oh.A0A(r0, r4)
            r0 = 1837610332(0x6d87b55c, float:5.249966E27)
            goto L_0x3bb6
        L_0x0b93:
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            if (r3 != r1) goto L_0x0bae
            r6.A01()
            android.content.Context r7 = r5.getApplicationContext()
            r8 = 0
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A08
            java.lang.String r11 = r0.A06
            java.lang.String r12 = r0.A04
            java.lang.String r13 = r0.A05
            r14 = 0
            r6.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0b88
        L_0x0bae:
            X.0IB r3 = X.C10450iM.A00()
            java.lang.String r1 = "challenges_finish_source"
            java.lang.String r0 = "a"
            r3.CYW(r1, r0)
            r5.finish()
            goto L_0x0b88
        L_0x0bbd:
            r2 = -1761230563(0xffffffff9705c11d, float:-4.321836E-25)
            int r2 = X.C14030oh.A03(r2)
            r3 = 178862115(0xaa93823, float:1.6295224E-32)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            r0 = 1915235892(0x72282e34, float:3.3311576E30)
            X.C14030oh.A0A(r0, r3)
            r0 = -666869209(0xffffffffd8406227, float:-8.4611117E14)
            goto L_0x3bb6
        L_0x0bd9:
            r2 = 1050721859(0x3ea0be43, float:0.31395158)
            int r2 = X.C14030oh.A03(r2)
            X.1TM r0 = (X.AnonymousClass1TM) r0
            r3 = 807646140(0x3023b3bc, float:5.955447E-10)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            X.1ut r4 = (X.C28731ut) r4
            X.3I8 r5 = r4.A04
            java.util.List r1 = r0.A01
            r5.A02(r1)
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x0c03
            X.1fV r5 = r4.A00
            r1 = 1
            r5.A03 = r1
            int r1 = r0.A00
            r4.A00 = r1
            r5.A00 = r1
        L_0x0c03:
            X.3I8 r7 = r4.A04
            java.util.List r0 = r0.A02
            r8 = 0
            java.util.List r6 = r7.A02
            r6.clear()
            java.util.Iterator r9 = r0.iterator()
        L_0x0c11:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0c4c
            com.instagram.user.model.User r5 = X.C18220wO.A0c(r9)
            X.C04220Ms.A0B(r5, r8)
            java.util.List r1 = r7.A01
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0c33
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0c33
        L_0x0c2a:
            X.395 r0 = new X.395
            r0.<init>(r5, r8)
            r6.add(r0)
            goto L_0x0c11
        L_0x0c33:
            java.util.Iterator r1 = r1.iterator()
        L_0x0c37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c2a
            java.lang.Object r0 = r1.next()
            X.395 r0 = (X.AnonymousClass395) r0
            com.instagram.user.model.User r0 = r0.A01
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 == 0) goto L_0x0c37
            goto L_0x0c11
        L_0x0c4c:
            X.AnonymousClass1cP.A00(r4)
            X.1fV r0 = r4.A00
            r0.A01()
            X.C28731ut.A03(r4)
            X.3GJ r1 = r4.A02
            X.3I8 r0 = r4.A04
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            r1.A02 = r0
            X.3I8 r0 = r4.A04
            java.util.List r0 = r0.A02
            com.google.common.collect.ImmutableList r0 = X.C18220wO.A0S(r0)
            int r0 = r0.size()
            r1.A04 = r0
            r0 = 600082710(0x23c48916, float:2.130842E-17)
            X.C14030oh.A0A(r0, r3)
            r0 = 146359502(0x8b944ce, float:1.1150458E-33)
            goto L_0x3bb6
        L_0x0c7c:
            r2 = 1470377910(0x57a42fb6, float:3.61049648E14)
            int r2 = X.C14030oh.A03(r2)
            X.1TM r0 = (X.AnonymousClass1TM) r0
            r3 = -326633669(0xffffffffec87f73b, float:-1.31498E27)
            int r5 = X.C14030oh.A03(r3)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.List r3 = r0.A01
            java.util.Iterator r8 = r3.iterator()
        L_0x0c96:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0caa
            com.instagram.user.model.User r6 = X.C18220wO.A0c(r8)
            r4 = 1
            X.395 r3 = new X.395
            r3.<init>(r6, r4)
            r7.add(r3)
            goto L_0x0c96
        L_0x0caa:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r0.A02
            java.util.Iterator r8 = r0.iterator()
        L_0x0cb4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0cc8
            com.instagram.user.model.User r4 = X.C18220wO.A0c(r8)
            r3 = 0
            X.395 r0 = new X.395
            r0.<init>(r4, r3)
            r6.add(r0)
            goto L_0x0cb4
        L_0x0cc8:
            java.lang.Object r4 = r1.A00
            X.1us r4 = (X.C28721us) r4
            X.1fV r0 = r4.A00
            r0.A04(r7, r6)
            X.1fV r0 = r4.A00
            r0.A01()
            X.1fV r1 = r4.A00
            java.util.List r0 = X.C28721us.A01(r4)
            int r0 = r0.size()
            r1.A02(r0)
            int r3 = r7.size()
            int r1 = r6.size()
            X.3GJ r0 = r4.A00
            r0.A02 = r3
            r0.A04 = r1
            r0 = 1549575190(0x5c5ca416, float:2.48419637E17)
            X.C14030oh.A0A(r0, r5)
            r0 = -357266107(0xffffffffeab48d45, float:-1.0913689E26)
            goto L_0x3bb6
        L_0x0cfc:
            r2 = -1989065854(0xffffffff89714382, float:-2.9041062E-33)
            int r2 = X.C14030oh.A03(r2)
            X.1S5 r0 = (X.AnonymousClass1S5) r0
            r3 = 148679971(0x8dcad23, float:1.3281473E-33)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r4 = r1.A00
            X.0i6 r4 = (X.C10300i6) r4
            r1 = 47
            kotlin.jvm.internal.KtLambdaShape49S0100000_I2_29 r3 = new kotlin.jvm.internal.KtLambdaShape49S0100000_I2_29
            r3.<init>(r4, r1)
            java.lang.Class<X.37l> r1 = X.C565037l.class
            java.lang.Object r1 = r4.A01(r1, r3)
            X.37l r1 = (X.C565037l) r1
            int r0 = r0.A00
            r1.A00 = r0
            r0 = 685128540(0x28d63b5c, float:2.3784516E-14)
            X.C14030oh.A0A(r0, r5)
            r0 = 221722538(0xd3737aa, float:5.645823E-31)
            goto L_0x3bb6
        L_0x0d2e:
            r2 = 1174474965(0x460110d5, float:8260.208)
            int r2 = X.C14030oh.A03(r2)
            r3 = 551856795(0x20e4aa9b, float:3.87376E-19)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A00
            X.8n9 r1 = (X.C146958n9) r1
            X.1jA r0 = X.AnonymousClass1jA.A00(r0)
            r1.resumeWith(r0)
            r0 = -2109374573(0xffffffff82457f93, float:-1.4509886E-37)
            X.C14030oh.A0A(r0, r3)
            r0 = -91777795(0xfffffffffa8794fd, float:-3.5199096E35)
            goto L_0x3bb6
        L_0x0d52:
            r2 = 1998150143(0x771959ff, float:3.110339E33)
            int r2 = X.C14030oh.A03(r2)
            r3 = 1254040175(0x4abf226f, float:6263095.5)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r4 = r1.A00
            r3 = 49
            kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7 r1 = new kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "Flow success"
            X.C63623hv.A09(r0, r1)
            r0 = 550383121(0x20ce2e11, float:3.4928242E-19)
            X.C14030oh.A0A(r0, r5)
            r0 = -300901811(0xffffffffee109a4d, float:-1.1188095E28)
            goto L_0x3bb6
        L_0x0d79:
            r2 = -482919318(0xffffffffe3373c6a, float:-3.3801075E21)
            int r2 = X.C14030oh.A03(r2)
            r3 = 1300670026(0x4d86a64a, float:2.82380608E8)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r4 = r1.A00
            r3 = 1
            kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8 r1 = new kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8
            r1.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r0)
            java.lang.String r0 = "LoadingFlow success"
            X.C63623hv.A09(r0, r1)
            r0 = 713103647(0x2a81191f, float:2.2932434E-13)
            X.C14030oh.A0A(r0, r5)
            r0 = 554964409(0x211415b9, float:5.01731E-19)
            goto L_0x3bb6
        L_0x0d9f:
            r0 = -1120168589(0xffffffffbd3b9573, float:-0.045796823)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1147279062(0xffffffffbb9de92a, float:-0.004819055)
            int r5 = X.C14030oh.A03(r0)
            X.3iD r4 = X.C63733iD.A00()
            java.lang.Object r3 = r1.A00
            X.1Yu r3 = (X.C22621Yu) r3
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r3)
            r0 = 2131828783(0x7f11202f, float:1.9290517E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0A = r0
            r4.A0C()
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r4)
            X.495 r1 = r3.A0A
            if (r1 != 0) goto L_0x0dd2
            java.lang.String r10 = "fanClubLogger"
            goto L_0x3b84
        L_0x0dd2:
            X.0Oa r0 = r3.A0G
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            long r3 = X.C18200wM.A0B(r0)
            X.0nS r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_live_audience_onboarding_reminder_click"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1200(0x4b0, float:1.682E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "live_audience_selector"
            X.C18190wL.A1J(r1, r0, r3)
            r1.Bb4()
            r0 = -716652124(0xffffffffd548c1a4, float:-1.37958754E13)
            X.C14030oh.A0A(r0, r5)
            r0 = 1560985254(0x5d0abea6, float:6.2485067E17)
            goto L_0x3bb6
        L_0x0dfd:
            r2 = -574035272(0xffffffffddc8eab8, float:-1.80969828E18)
            int r2 = X.C14030oh.A03(r2)
            X.1Te r0 = (X.C22051Te) r0
            r3 = -1075298355(0xffffffffbfe83fcd, float:-1.814447)
            int r4 = X.C14030oh.A03(r3)
            r3 = 1
            X.AnonymousClass2BB.A00 = r3
            java.lang.Boolean r3 = r0.A02
            if (r3 == 0) goto L_0x0e25
            X.1tl r0 = X.C63873iU.A08(r1)
            boolean r3 = r3.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "auto_save_reel_media_to_gallery"
            X.AnonymousClass0wJ.A13(r1, r0, r3)
        L_0x0e25:
            r0 = 1254920422(0x4acc90e6, float:6703219.0)
            X.C14030oh.A0A(r0, r4)
            r0 = 150786146(0x8fcd062, float:1.5215689E-33)
            goto L_0x3bb6
        L_0x0e30:
            r0 = 562213670(0x2182b326, float:8.856563E-19)
            int r2 = X.C14030oh.A03(r0)
            r0 = 793105879(0x2f45d5d7, float:1.7993017E-10)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r8 = r1.A00
            com.instagram.creation.fragment.ShareLaterFragment r8 = (com.instagram.creation.fragment.ShareLaterFragment) r8
            X.E2V r0 = X.C18230wP.A0R(r8)
            r4 = 0
            r0.setIsLoading(r4)
            android.content.Context r5 = r8.getContext()
            r0 = 2131835765(0x7f113b75, float:1.9304678E38)
            X.C63813iO.A0A(r5, r0, r4)
            android.os.Handler r5 = r8.A00
            X.4Ol r0 = new X.4Ol
            r0.<init>(r1)
            r5.post(r0)
            java.lang.String r0 = "share_later_fragment_share_success"
            X.0rn r5 = X.C15730rn.A00(r8, r0)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A03
            boolean r0 = r0.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "facebook_enabled"
            r5.A09(r0, r1)
            com.instagram.service.session.UserSession r0 = r8.A04
            X.C18180wK.A1K(r5, r0)
            java.lang.String r10 = r8.A08
            com.instagram.service.session.UserSession r9 = r8.A04
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A03
            java.lang.String r11 = r0.A05
            r0 = 95
            int r1 = r11.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0e8b
            java.lang.String r11 = r11.substring(r4, r1)
        L_0x0e8b:
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A03
            X.Ffc r0 = r0.A02
            int r13 = r0.A00
            java.lang.String r12 = "share_later"
            X.C62943bB.A02(r8, r9, r10, r11, r12, r13)
            com.instagram.service.session.UserSession r9 = r8.A04
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A03
            java.lang.String r10 = r0.A05
            java.lang.String r11 = "share_later_view"
            java.lang.String r12 = "share"
            java.lang.String r13 = "null"
            X.C63673i6.A0A(r8, r9, r10, r11, r12, r13)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A03
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0f0a
            com.instagram.service.session.UserSession r6 = r8.A04
            com.instagram.pendingmedia.model.constants.ShareType r5 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            r4 = 0
            java.lang.String r1 = r8.A08
            java.lang.String r0 = "feed_share_later"
            X.C63353hL.A05(r5, r6, r0, r4, r1)
            X.3FS r6 = r8.A02
            if (r6 == 0) goto L_0x0f0a
            boolean r0 = r6.A01
            com.instagram.service.session.UserSession r5 = r6.A02
            X.0TJ r4 = X.AnonymousClass0TJ.A06
            if (r0 == 0) goto L_0x0f21
            r0 = 2342158289141238267(0x2081048e000009fb, double:4.061583659187471E-152)
        L_0x0ec8:
            java.lang.Boolean r0 = X.C63803iN.A05(r4, r5, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0f0a
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0f0a
            androidx.fragment.app.FragmentActivity r7 = r8.requireActivity()
            com.instagram.service.session.UserSession r6 = r8.A04
            boolean r5 = X.C62183Xq.A00(r6)
            if (r5 == 0) goto L_0x0f1b
            r0 = 2342158289141238267(0x2081048e000009fb, double:4.061583659187471E-152)
        L_0x0ee7:
            boolean r0 = X.C63803iN.A0E(r4, r6, r0)
            if (r0 != 0) goto L_0x0f0a
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            if (r5 == 0) goto L_0x0f15
            r0 = 36315279927609852(0x81048e000109fc, double:3.0292674838909554E-306)
        L_0x0ef6:
            boolean r0 = X.C63803iN.A0E(r4, r6, r0)
            if (r0 == 0) goto L_0x0f0a
            android.os.Handler r5 = X.AnonymousClass0wJ.A0F()
            X.4RR r4 = new X.4RR
            r4.<init>(r7, r6)
            r0 = 2500(0x9c4, double:1.235E-320)
            r5.postDelayed(r4, r0)
        L_0x0f0a:
            r0 = -423722230(0xffffffffe6be830a, float:-4.4983344E23)
            X.C14030oh.A0A(r0, r3)
            r0 = 2094601435(0x7cd914db, float:9.0172113E36)
            goto L_0x3bb6
        L_0x0f15:
            r0 = 36315541920746079(0x8104cb00030a5f, double:3.029433169405267E-306)
            goto L_0x0ef6
        L_0x0f1b:
            r0 = 2342158551134243422(0x208104cb00000a5e, double:4.0618058070316E-152)
            goto L_0x0ee7
        L_0x0f21:
            r0 = 2342158551134243422(0x208104cb00000a5e, double:4.0618058070316E-152)
            goto L_0x0ec8
        L_0x0f27:
            r2 = 1395684104(0x53307308, float:7.5784415E11)
            int r2 = X.C14030oh.A03(r2)
            X.1S7 r0 = (X.AnonymousClass1S7) r0
            r3 = -627938924(0xffffffffda926994, float:-2.06057155E16)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.49i r3 = (X.C696249i) r3
            int r4 = r0.A00
            r3.A00 = r4
            X.29v r1 = X.C320129v.FETCH_SETTING_SUCCESS
            com.instagram.service.session.UserSession r0 = r3.A05
            X.0nS r0 = X.C13330nS.A02(r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A07(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0f62
            java.lang.String r0 = "action_name"
            r3.A0O(r1, r0)
            java.lang.Long r1 = X.C18230wP.A0f(r4)
            java.lang.String r0 = "audience_setting"
            r3.A0S(r0, r1)
            r3.Bb4()
        L_0x0f62:
            r0 = 1085873836(0x40b91eac, float:5.784994)
            X.C14030oh.A0A(r0, r5)
            r0 = -1076013758(0xffffffffbfdd5542, float:-1.7291644)
            goto L_0x3bb6
        L_0x0f6d:
            r2 = -1390488898(0xffffffffad1ed2be, float:-9.028054E-12)
            int r2 = X.C14030oh.A03(r2)
            X.1RX r0 = (X.AnonymousClass1RX) r0
            r3 = 229663940(0xdb064c4, float:1.0871096E-30)
            int r4 = X.C14030oh.A03(r3)
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            super.onSuccess(r0)
            X.39e r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            java.lang.Object r5 = r1.A00
            X.493 r5 = (X.AnonymousClass493) r5
            java.lang.String r7 = r0.A02
            java.lang.Boolean r3 = r0.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x0f97
            r7 = r0
        L_0x0f97:
            r5.A05 = r7
            r5.A03 = r3
            if (r1 != 0) goto L_0x0f9e
            r1 = r0
        L_0x0f9e:
            r5.A04 = r1
            X.1aY r3 = r5.A02
            if (r3 == 0) goto L_0x0fbd
            X.AnonymousClass1aY.A02(r3)
            java.lang.String r1 = r3.A0B
            java.lang.String r0 = "inbox_qp"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0fd4
            android.app.Activity r1 = r3.A00
            if (r1 == 0) goto L_0x0fe0
            r0 = 2
            r1.setResult(r0)
            java.lang.String r0 = "business_setting"
            r3.A0B = r0
        L_0x0fbd:
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.1mE r0 = new X.1mE
            r0.<init>(r5)
            r1.AKp(r0)
            r0 = 1317258355(0x4e83c473, float:1.1053449E9)
            X.C14030oh.A0A(r0, r4)
            r0 = -1442059971(0xffffffffaa0be93d, float:-1.2426601E-13)
            goto L_0x3bb6
        L_0x0fd4:
            android.content.Context r3 = r3.A05()
            r1 = 0
            r0 = 2131826104(0x7f1115b8, float:1.9285083E38)
            X.C63813iO.A03(r3, r1, r0, r6)
            goto L_0x0fbd
        L_0x0fe0:
            java.lang.String r10 = "activity"
            goto L_0x3b84
        L_0x0fe4:
            r2 = -1835356932(0xffffffff929aacfc, float:-9.76141E-28)
            int r2 = X.C14030oh.A03(r2)
            X.1RX r0 = (X.AnonymousClass1RX) r0
            r3 = -1268711638(0xffffffffb460ff2a, float:-2.0954454E-7)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            super.onSuccess(r0)
            X.39e r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            java.lang.Object r5 = r1.A00
            X.493 r5 = (X.AnonymousClass493) r5
            java.lang.String r4 = r0.A02
            java.lang.Boolean r3 = r0.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x100a
            r4 = r0
        L_0x100a:
            r5.A05 = r4
            r5.A03 = r3
            if (r1 != 0) goto L_0x1011
            r1 = r0
        L_0x1011:
            r5.A04 = r1
            X.1aY r0 = r5.A02
            if (r0 == 0) goto L_0x101d
            X.AnonymousClass1aY.A02(r0)
            X.AnonymousClass1aY.A03(r0)
        L_0x101d:
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.1mE r0 = new X.1mE
            r0.<init>(r5)
            r1.AKp(r0)
            r0 = 860047946(0x33434a4a, float:4.546954E-8)
            X.C14030oh.A0A(r0, r6)
            r0 = -2111790708(0xffffffff8220a18c, float:-1.1801305E-37)
            goto L_0x3bb6
        L_0x1034:
            r2 = -388391666(0xffffffffe8d99d0e, float:-8.2212054E24)
            int r2 = X.C14030oh.A03(r2)
            X.1SE r0 = (X.AnonymousClass1SE) r0
            r3 = -1790209424(0xffffffff954b9270, float:-4.1111042E-26)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.1YD r3 = (X.AnonymousClass1YD) r3
            java.util.Set r1 = r3.A03
            java.util.List r0 = r0.A00
            r1.addAll(r0)
            r0 = 1
            r3.A02 = r0
            r0 = -1914688966(0xffffffff8de02a3a, float:-1.38152315E-30)
            X.C14030oh.A0A(r0, r4)
            r0 = -950385619(0xffffffffc75a442d, float:-55876.176)
            goto L_0x3bb6
        L_0x105d:
            r2 = 365308511(0x15c62a5f, float:8.003841E-26)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -1732902301(0xffffffff98b60263, float:-4.7048307E-24)
            int r5 = X.C14030oh.A03(r2)
            java.lang.Object r2 = r0.A01
            if (r2 == 0) goto L_0x1082
            X.4up r2 = (X.C85294up) r2
            X.25c r0 = r2.AkL()
            if (r0 == 0) goto L_0x1082
            X.25c r2 = r2.AkL()
            X.25c r0 = X.C313025c.A01
            r3 = 1
            if (r2 == r0) goto L_0x1083
        L_0x1082:
            r3 = 0
        L_0x1083:
            java.lang.Object r0 = r1.A00
            X.49S r0 = (X.AnonymousClass49S) r0
            java.util.Map r2 = r0.A01
            java.lang.String r1 = "FACEBOOK"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r0)
            r0 = 657448330(0x272fdd8a, float:2.4406225E-15)
            X.C14030oh.A0A(r0, r5)
            r0 = 200839768(0xbf89258, float:9.574632E-32)
            goto L_0x3a4b
        L_0x109d:
            r2 = -830865802(0xffffffffce79fe76, float:-1.04855078E9)
            int r2 = X.C14030oh.A03(r2)
            X.1SH r0 = (X.AnonymousClass1SH) r0
            r3 = 2104363031(0x7d6e0817, float:1.9774892E37)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            super.onSuccess(r0)
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x111c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x111c
            java.lang.Object r9 = r1.A00
            X.48o r9 = (X.C694448o) r9
            r8 = 10
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r10 = r0.iterator()
        L_0x10c8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x111c
            java.lang.Object r0 = r10.next()
            X.3BO r0 = (X.AnonymousClass3BO) r0
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x111a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x10dc:
            r5 = 0
            if (r0 == 0) goto L_0x1116
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r3 = r0.iterator()
        L_0x10e7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1115
            java.lang.Object r1 = r3.next()
            X.3AC r1 = (X.AnonymousClass3AC) r1
            if (r1 == 0) goto L_0x1113
            X.3DU r0 = r1.A00
            if (r0 == 0) goto L_0x110d
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x110d
            java.lang.Boolean r0 = r1.A01
            X.C04220Ms.A06(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x110d
            java.util.List r0 = r9.A00
            r0.add(r1)
        L_0x110d:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x110f:
            r4.add(r0)
            goto L_0x10e7
        L_0x1113:
            r0 = r5
            goto L_0x110f
        L_0x1115:
            r5 = r4
        L_0x1116:
            r7.add(r5)
            goto L_0x10c8
        L_0x111a:
            r0 = 0
            goto L_0x10dc
        L_0x111c:
            r0 = -263823913(0xfffffffff0465dd7, float:-2.455659E29)
            X.C14030oh.A0A(r0, r6)
            r0 = 722675332(0x2b132684, float:5.227834E-13)
            goto L_0x3bb6
        L_0x1127:
            r2 = 661095634(0x276784d2, float:3.2129692E-15)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1781566612(0xffffffff95cf736c, float:-8.378874E-26)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.8m8 r3 = (X.C146368m8) r3
            X.5z2 r1 = new X.5z2
            r1.<init>(r0)
            X.C18240wQ.A1O(r1, r3)
            r0 = 435740157(0x19f8ddfd, float:2.573226E-23)
            X.C14030oh.A0A(r0, r4)
            r0 = -927224134(0xffffffffc8bbaeba, float:-384373.8)
            goto L_0x3bb6
        L_0x114c:
            r2 = 829566218(0x31722d0a, float:3.5241237E-9)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -1576066113(0xffffffffa20f23bf, float:-1.9399038E-18)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x118e
            X.4uq r3 = (X.C85304uq) r3
            X.4vg r0 = r3.Ao0()
            if (r0 == 0) goto L_0x118e
            X.4vg r0 = r3.Ao0()
            boolean r5 = r0.App()
            X.4vg r0 = r3.Ao0()
            boolean r4 = r0.Apk()
            java.lang.Object r3 = r1.A00
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A03(r3)
            java.lang.String r0 = "browser_autofill_consent_accepted"
            X.AnonymousClass0wJ.A13(r1, r0, r4)
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A03(r3)
            java.lang.String r0 = "browser_autofill_fbpay_disclosure_shown"
            X.AnonymousClass0wJ.A13(r1, r0, r5)
        L_0x118e:
            r0 = 2141173399(0x7f9fb697, float:NaN)
            X.C14030oh.A0A(r0, r6)
            r0 = 1012605507(0x3c5b2243, float:0.013374868)
            goto L_0x3bb6
        L_0x1199:
            r2 = 1209989495(0x481ef977, float:162789.86)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -1326345471(0xffffffffb0f19301, float:-1.7576839E-9)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x11d3
            X.4ur r4 = (X.C85314ur) r4
            X.4vN r0 = r4.Ao1()
            if (r0 == 0) goto L_0x11d3
            X.216 r3 = X.AnonymousClass216.SUCCESS
            X.4vN r0 = r4.Ao1()
            X.216 r0 = r0.BDj()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x11d3
            X.1tl r0 = X.C63873iU.A08(r1)
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "browser_autofill_fbpay_disclosure_shown"
            X.AnonymousClass0wJ.A13(r1, r0, r3)
        L_0x11d3:
            r0 = 86403517(0x52669bd, float:7.8247035E-36)
            X.C14030oh.A0A(r0, r5)
            r0 = 552426477(0x20ed5bed, float:4.0210193E-19)
            goto L_0x3bb6
        L_0x11de:
            r2 = -1545342373(0xffffffffa3e3f25b, float:-2.4714031E-17)
            int r2 = X.C14030oh.A03(r2)
            X.1is r0 = (X.C24481is) r0
            r3 = 1778847256(0x6a070e18, float:4.0817885E25)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Object r5 = r1.A00
            X.1dg r5 = (X.C23381dg) r5
            X.0m7 r3 = r5.mFragmentManager
            X.C61873Wd.A01(r3)
            java.lang.String r4 = r5.A06
            r10 = 0
            if (r0 == 0) goto L_0x123f
            X.34f r0 = r0.A00
            if (r0 == 0) goto L_0x123f
            X.34e r0 = r0.A00
            if (r0 == 0) goto L_0x123f
            if (r4 == 0) goto L_0x123f
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x120c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x123f
            java.lang.Object r8 = r3.next()
            X.3DO r8 = (X.AnonymousClass3DO) r8
            java.lang.String r11 = r8.A09
            boolean r0 = r4.equals(r11)
            if (r0 == 0) goto L_0x120c
            X.1U8 r9 = r5.A01
            java.lang.String r12 = r9.A08
            java.lang.String r0 = r9.A05
            if (r0 != 0) goto L_0x1284
            r13 = 0
        L_0x1229:
            X.34k r0 = r8.A07
            if (r0 == 0) goto L_0x1233
            java.lang.String r0 = r0.A00
            com.instagram.common.typedurl.SimpleImageUrl r10 = X.C18250wR.A0K(r0)
        L_0x1233:
            X.34g r0 = r8.A01
            java.lang.String r14 = r0.A00
            java.lang.String r15 = r5.A07
            com.instagram.location.surface.data.LocationPageInfo r9 = new com.instagram.location.surface.data.LocationPageInfo
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r10 = r9
        L_0x123f:
            r5.A02 = r10
            if (r10 == 0) goto L_0x1258
            android.os.Handler r3 = r5.A0B
            X.4RT r0 = new X.4RT
            r0.<init>(r1, r10)
            r3.post(r0)
        L_0x124d:
            r0 = 28625098(0x1b4c8ca, float:6.6409675E-38)
            X.C14030oh.A0A(r0, r6)
            r0 = -2053234351(0xffffffff859e2151, float:-1.4870487E-35)
            goto L_0x3bb6
        L_0x1258:
            java.lang.String r0 = "claim_location_error"
            X.C23381dg.A06(r5, r0)
            android.content.Context r1 = r5.getContext()
            r0 = 74
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r3 = X.C18220wO.A0O(r5, r0)
            X.Dsm r1 = X.C18190wL.A0W(r1)
            X.C18200wM.A1O(r1)
            r0 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r1.A0P(r3, r0)
            r0 = 2131823302(0x7f110ac6, float:1.92794E38)
            r1.A0L(r0)
            r0 = 2131823301(0x7f110ac5, float:1.9279398E38)
            r1.A0K(r0)
            X.AnonymousClass0wJ.A1K(r1)
            goto L_0x124d
        L_0x1284:
            java.lang.String r7 = r0.trim()
            java.lang.String r4 = " "
            java.lang.String r3 = r9.A07
            java.lang.String r0 = r9.A0B
            java.lang.String r0 = X.AnonymousClass00U.A0h(r7, r4, r3, r4, r0)
            java.lang.String r13 = r0.trim()
            goto L_0x1229
        L_0x1297:
            r2 = 1680814917(0x642f3345, float:1.2927498E22)
            int r2 = X.C14030oh.A03(r2)
            X.1U3 r0 = (X.AnonymousClass1U3) r0
            r3 = -1112085376(0xffffffffbdb6ec80, float:-0.089318275)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r1.A00
            X.1xV r3 = (X.C29211xV) r3
            android.os.Handler r4 = r3.A08
            X.4RX r3 = new X.4RX
            r3.<init>(r1, r0)
            r4.post(r3)
            r0 = -2032315613(0xffffffff86dd5323, float:-8.325312E-35)
            X.C14030oh.A0A(r0, r5)
            r0 = 1661609780(0x630a2734, float:2.5484756E21)
            goto L_0x3bb6
        L_0x12c0:
            r0 = 725453171(0x2b3d8973, float:6.733704E-13)
            int r2 = X.C14030oh.A03(r0)
            r0 = 429002975(0x199210df, float:1.510286E-23)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r1.A00
            X.1xV r1 = (X.C29211xV) r1
            r0 = 0
            X.C29211xV.A0B(r0, r1)
            X.0dD r0 = X.C08360dF.A00()
            r3 = 0
            android.content.SharedPreferences$Editor r1 = X.C18220wO.A0B(r0)
            java.lang.String r0 = "has_backup_codes"
            X.AnonymousClass0wJ.A13(r1, r0, r3)
            r0 = 1978726590(0x75f0f8be, float:6.109357E32)
            X.C14030oh.A0A(r0, r4)
            r0 = 1030501847(0x3d6c35d7, float:0.057668533)
            goto L_0x3bb6
        L_0x12ef:
            r2 = 343452939(0x1478ad0b, float:1.2554927E-26)
            int r2 = X.C14030oh.A03(r2)
            X.1U1 r0 = (X.AnonymousClass1U1) r0
            r3 = -1636160018(0xffffffff9e7a2dee, float:-1.3244388E-20)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            X.1xa r4 = (X.C29241xa) r4
            android.os.Bundle r3 = r4.mArguments
            java.util.ArrayList r1 = r0.A04
            java.lang.String r0 = "backup_codes_key"
            r3.putStringArrayList(r0, r1)
            java.util.List r0 = X.C29241xa.A0B(r4)
            r4.setItems(r0)
            r0 = -1087228395(0xffffffffbf323615, float:-0.6961377)
            X.C14030oh.A0A(r0, r5)
            r0 = -181203943(0xfffffffff5330c19, float:-2.2696936E32)
            goto L_0x3bb6
        L_0x131e:
            r0 = 1916344654(0x7239194e, float:3.6662604E30)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1973362019(0x759f1d63, float:4.0340392E32)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r1.A00
            X.1aw r6 = (X.AnonymousClass1aw) r6
            X.3F8 r0 = r6.A06
            X.01V r5 = r0.A00
            r3 = 857809457(0x33212231, float:3.751683E-8)
            r0 = 2
            r5.markerEnd(r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x1365
            com.instagram.service.session.UserSession r0 = r6.A05
            X.0Ok r3 = X.C06810aP.A01
            java.lang.String r11 = X.C18200wM.A0k(r0, r3)
            com.instagram.igds.components.form.IgFormField r0 = r6.A03
            java.lang.String r12 = X.C18200wM.A0i(r0)
            com.instagram.service.session.UserSession r0 = r6.A05
            com.instagram.user.model.User r0 = r3.A01(r0)
            com.instagram.common.typedurl.ImageUrl r8 = r0.B4M()
            r13 = 0
            r10 = 0
            com.instagram.service.session.UserSession r7 = r6.A05
            X.4Du r9 = new X.4Du
            r9.<init>(r1)
            X.C551031t.A00(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x1365:
            r0 = 562014530(0x217fa942, float:8.662137E-19)
            X.C14030oh.A0A(r0, r4)
            r0 = 1834680643(0x6d5b0143, float:4.2361714E27)
            goto L_0x3bb6
        L_0x1370:
            r2 = 1857112462(0x6eb1498e, float:2.7433884E28)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1294299568(0xffffffffb2da8e50, float:-2.5443256E-8)
            int r6 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            r0 = 0
            java.lang.Object r8 = r1.A00
            X.1av r8 = (X.AnonymousClass1av) r8
            r8.A08 = r0
            X.AnonymousClass1av.A00(r8)
            com.instagram.service.session.UserSession r0 = r8.A02
            X.AnonymousClass49X.A02(r0)
            com.instagram.service.session.UserSession r0 = r8.A02
            X.3an r1 = X.C62813an.A01(r0)
            com.instagram.service.session.UserSession r0 = r8.A02
            com.instagram.accountlinking.model.AccountFamily r1 = X.C62813an.A02(r1, r0)
            if (r1 == 0) goto L_0x140f
            X.4Mm r0 = r1.A00()
            if (r0 == 0) goto L_0x140f
            X.4Mm r12 = r1.A00()
            com.instagram.api.schemas.HasPasswordState r18 = com.instagram.api.schemas.HasPasswordState.TRUE
            com.instagram.user.model.MicroUserDict r0 = r12.A00
            r22 = 0
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.A00
            r21 = r1
            java.lang.Float r1 = r0.A0B
            r19 = r1
            java.lang.String r1 = r0.A0C
            r17 = r1
            com.instagram.user.model.FriendshipStatus r11 = r0.A05
            java.lang.String r1 = r0.A0D
            r16 = r1
            com.instagram.api.schemas.ProfileTheme r10 = r0.A03
            java.lang.Boolean r1 = r0.A06
            r23 = r1
            java.lang.Boolean r15 = r0.A07
            java.lang.Boolean r14 = r0.A08
            java.lang.Boolean r13 = r0.A09
            java.lang.String r9 = r0.A0E
            com.instagram.common.typedurl.ImageUrl r7 = r0.A04
            java.lang.Boolean r5 = r0.A0A
            com.instagram.api.schemas.IGUserThirdPartyDownloads r4 = r0.A02
            java.lang.String r3 = r0.A0F
            X.420 r1 = new X.420
            r1.<init>()
            r20 = 0
            X.6p7 r0 = new X.6p7
            r0.<init>(r1)
            if (r11 == 0) goto L_0x13e8
            com.instagram.user.model.FriendshipStatus r22 = r11.D7F()
        L_0x13e8:
            if (r10 == 0) goto L_0x13ee
            com.instagram.api.schemas.ProfileTheme r20 = r10.D08()
        L_0x13ee:
            com.instagram.user.model.MicroUserDict r0 = new com.instagram.user.model.MicroUserDict
            r25 = r14
            r26 = r13
            r27 = r5
            r28 = r19
            r29 = r17
            r30 = r16
            r31 = r9
            r32 = r3
            r16 = r0
            r17 = r21
            r19 = r4
            r21 = r7
            r24 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r12.A00 = r0
        L_0x140f:
            android.widget.CheckBox r0 = r8.A00
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x142c
            com.instagram.service.session.UserSession r0 = r8.A02
            X.3hk r7 = X.C63533hk.A02(r0)
            com.instagram.service.session.UserSession r0 = r8.A02
            java.lang.String r11 = r0.getUserId()
            r12 = 1
            java.lang.Integer r10 = X.AnonymousClass006.A04
            com.instagram.service.session.UserSession r0 = r8.A02
            r9 = r0
            r7.A0B(r8, r9, r10, r11, r12)
        L_0x142c:
            android.content.Context r1 = r8.getContext()
            r0 = 2131832178(0x7f112d72, float:1.9297402E38)
            r3 = 1
            X.C63813iO.A0A(r1, r0, r3)
            androidx.fragment.app.Fragment r0 = r8.getTargetFragment()
            if (r0 == 0) goto L_0x1458
            android.content.Context r1 = r8.getContext()
            java.lang.Class<X.1av> r0 = X.AnonymousClass1av.class
            android.content.Intent r4 = X.C18250wR.A04(r1, r0)
            java.lang.String r0 = "password_updated_key"
            r4.putExtra(r0, r3)
            androidx.fragment.app.Fragment r3 = r8.getTargetFragment()
            int r1 = r8.getTargetRequestCode()
            r0 = 7
            r3.onActivityResult(r1, r0, r4)
        L_0x1458:
            X.C18190wL.A19(r8)
            r0 = -20823929(0xfffffffffec24087, float:-1.2910264E38)
            X.C14030oh.A0A(r0, r6)
            r0 = 1105418897(0x41e35a91, float:28.419222)
            goto L_0x3bb6
        L_0x1466:
            r2 = 130268905(0x7c3bee9, float:2.9452546E-34)
            int r2 = X.C14030oh.A03(r2)
            X.1T1 r0 = (X.AnonymousClass1T1) r0
            r3 = -968237200(0xffffffffc649df70, float:-12919.859)
            int r4 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r3 = r1.A00
            X.1xX r3 = (X.C29221xX) r3
            java.lang.String r1 = r0.A00
            r3.A01 = r1
            boolean r0 = r0.A01
            r3.A02 = r0
            X.C29221xX.A0C(r3)
            r0 = 921234049(0x36e8ea81, float:6.9414386E-6)
            X.C14030oh.A0A(r0, r4)
            r0 = 913312616(0x36700b68, float:3.5769426E-6)
            goto L_0x3bb6
        L_0x1493:
            r0 = 1823884666(0x6cb6457a, float:1.7628207E27)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1539566916(0xffffffffa43c12bc, float:-4.078187E-17)
            int r6 = X.C14030oh.A03(r0)
            X.3Yh r5 = X.C62323Yh.A00
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r4 = r0.A00
            X.1xX r4 = (X.C29221xX) r4
            com.instagram.service.session.UserSession r3 = r4.A00
            java.lang.String r1 = "manage_saved_login"
            java.lang.String r0 = "client_del_setting_opt_out_confirmed"
            r5.A01(r3, r1, r0)
            X.C29221xX.A0B(r4)
            r0 = 1359984783(0x510fb88f, float:3.8579794E10)
            X.C14030oh.A0A(r0, r6)
            r0 = -640989332(0xffffffffd9cb476c, float:-7.1522437E15)
            goto L_0x3bb6
        L_0x14c2:
            r2 = -55921855(0xfffffffffcaab341, float:-7.0906093E36)
            int r2 = X.C14030oh.A03(r2)
            X.1TB r0 = (X.AnonymousClass1TB) r0
            r3 = 1300046440(0x4d7d2268, float:2.65430656E8)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r1.A00
            X.1c4 r3 = (X.AnonymousClass1c4) r3
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x14f6
            r3.A09 = r1
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            if (r0 == 0) goto L_0x14f2
            r3.A05 = r0
            android.view.View r0 = r3.mView
            X.AnonymousClass1c4.A00(r0, r3)
            r0 = -1172088459(0xffffffffba235975, float:-6.2312867E-4)
            X.C14030oh.A0A(r0, r4)
            r0 = -1968979586(0xffffffff8aa3c17e, float:-1.5769113E-32)
            goto L_0x3bb6
        L_0x14f2:
            java.lang.String r10 = "profilePicUrl"
            goto L_0x3b84
        L_0x14f6:
            java.lang.String r10 = X.C63213h0.A00()
            goto L_0x3b84
        L_0x14fc:
            r2 = -943557519(0xffffffffc7c27471, float:-99560.88)
            int r2 = X.C14030oh.A03(r2)
            X.1U3 r0 = (X.AnonymousClass1U3) r0
            r3 = 717169427(0x2abf2313, float:3.3952753E-13)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r1.A00
            X.1co r3 = (X.C23231co) r3
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r3.A07
            java.lang.String r1 = r1.getPhoneNumber()
            r3.A0A = r1
            X.3Um r1 = r0.A01
            r0 = 0
            X.C23231co.A01(r1, r3, r0)
            r0 = 106506024(0x6592728, float:4.084193E-35)
            X.C14030oh.A0A(r0, r4)
            r0 = -1965339293(0xffffffff8adb4d63, float:-2.1118043E-32)
            goto L_0x3bb6
        L_0x1529:
            r2 = -1651523779(0xffffffff9d8fbf3d, float:-3.804952E-21)
            int r4 = X.C14030oh.A03(r2)
            X.1T2 r0 = (X.AnonymousClass1T2) r0
            r2 = 2141340017(0x7fa24171, float:NaN)
            int r6 = X.C14030oh.A03(r2)
            java.lang.Object r7 = r1.A00
            X.1co r7 = (X.C23231co) r7
            X.3F8 r2 = r7.A06
            X.01V r5 = r2.A00
            r3 = 857809457(0x33212231, float:3.751683E-8)
            r2 = 2
            r5.markerEnd(r3, r2)
            java.lang.Integer r3 = r0.A01
            java.lang.Integer r2 = X.AnonymousClass006.A01
            if (r3 != r2) goto L_0x1563
            android.os.Handler r2 = r7.A0H
            X.4PI r0 = new X.4PI
            r0.<init>(r1)
            r2.post(r0)
        L_0x1558:
            r0 = 1573715132(0x5dccfcbc, float:1.84636095E18)
            X.C14030oh.A0A(r0, r6)
            r0 = -238999965(0xfffffffff1c12663, float:-1.9128644E30)
            goto L_0x3a4b
        L_0x1563:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r3 != r1) goto L_0x1558
            X.3Um r1 = r0.A00
            r0 = 1
            X.C23231co.A01(r1, r7, r0)
            goto L_0x1558
        L_0x156e:
            r0 = -2019167010(0xffffffff87a5f4de, float:-2.497036E-34)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1481888625(0x5853d371, float:9.3162035E14)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A00
            X.1aA r4 = (X.AnonymousClass1aA) r4
            r0 = 2131837145(0x7f1140d9, float:1.9307477E38)
            java.lang.String r3 = r4.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0 = 0
            X.C63813iO.A0D(r1, r3, r0)
            X.3Um r1 = r4.A07
            int r0 = r1.A00
            int r0 = r0 + -1
            r1.A00 = r0
            r0 = -1375588028(0xffffffffae023144, float:-2.9602334E-11)
            X.C14030oh.A0A(r0, r5)
            r0 = -1925901226(0xffffffff8d351456, float:-5.579941E-31)
            goto L_0x3bb6
        L_0x15a2:
            r2 = 663033615(0x2785170f, float:3.6939916E-15)
            int r2 = X.C14030oh.A03(r2)
            X.1U4 r0 = (X.AnonymousClass1U4) r0
            r3 = -150374149(0xfffffffff70978fb, float:-2.7882752E33)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r1.A00
            X.1aA r3 = (X.AnonymousClass1aA) r3
            android.os.Handler r4 = r3.A0L
            X.4RZ r3 = new X.4RZ
            r3.<init>(r1, r0)
            r4.post(r3)
            r0 = -664904552(0xffffffffd85e5c98, float:-9.7795707E14)
            X.C14030oh.A0A(r0, r5)
            r0 = 956862300(0x39088f5c, float:1.3023376E-4)
            goto L_0x3bb6
        L_0x15cb:
            r2 = 1863791755(0x6f17348b, float:4.6795757E28)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1323762095(0xffffffffb118fe51, float:-2.2263473E-9)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r1 = r1.A00
            X.1d9 r1 = (X.AnonymousClass1d9) r1
            r0 = 2131826742(0x7f111836, float:1.9286377E38)
            r1.A01(r0)
            r0 = -352128155(0xffffffffeb02f365, float:-1.5830975E26)
            X.C14030oh.A0A(r0, r3)
            r0 = 1777575175(0x69f3a507, float:3.6818537E25)
            goto L_0x3bb6
        L_0x15f1:
            r2 = -2135701490(0xffffffff80b3c80e, float:-1.651032E-38)
            int r2 = X.C14030oh.A03(r2)
            X.1SP r0 = (X.AnonymousClass1SP) r0
            r3 = 1438069135(0x55b7318f, float:2.51779351E13)
            int r4 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r6 = r1.A00
            X.1rN r6 = (X.C26871rN) r6
            com.instagram.registration.model.RegFlowExtras r10 = r6.A00
            java.lang.String r0 = r0.A00
            r10.A0B = r0
            X.25r r1 = X.C313625r.SAC
            X.25r r0 = r10.A01()
            if (r1 != r0) goto L_0x1684
            boolean r0 = r10.A0s
            if (r0 == 0) goto L_0x164a
            r0 = 0
            r10.A0t = r0
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            X.0i6 r0 = r6.A02
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            com.instagram.registration.model.RegFlowExtras r3 = r6.A00
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r1, r3)
            X.1dA r1 = new X.1dA
            r1.<init>()
        L_0x1637:
            r1.setArguments(r5)
            r0.A03 = r1
        L_0x163c:
            r0.A05()
        L_0x163f:
            r0 = -909884039(0xffffffffc9c44579, float:-1607855.1)
            X.C14030oh.A0A(r0, r4)
            r0 = -1498277629(0xffffffffa6b21903, float:-1.2358011E-15)
            goto L_0x3bb6
        L_0x164a:
            boolean r0 = r10.A0t
            if (r0 == 0) goto L_0x1669
            r0 = 0
            r10.A0t = r0
            X.0i6 r12 = r6.A02
            X.0bf r12 = (X.C07530bf) r12
            java.lang.String r14 = r10.A0Z
            android.os.Handler r5 = X.AnonymousClass0wJ.A0F()
            X.1jv r11 = r6.A03
            r8 = 0
            X.265 r13 = X.AnonymousClass265.A1N
            r7 = r6
            r9 = r6
            r15 = r8
            r16 = r0
            X.C67283zI.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x163f
        L_0x1669:
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            X.0i6 r0 = r6.A02
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            com.instagram.registration.model.RegFlowExtras r3 = r6.A00
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r1, r3)
            X.1Qa r1 = new X.1Qa
            r1.<init>()
            goto L_0x1637
        L_0x1684:
            X.3Vf r5 = X.C63463hW.A01()
            com.instagram.registration.model.RegFlowExtras r3 = r6.A00
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r3)
            X.0i6 r0 = r6.A02
            java.lang.String r0 = r0.getToken()
            androidx.fragment.app.Fragment r3 = r5.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            X.0i6 r0 = r6.A02
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            r0.A03 = r3
            goto L_0x163c
        L_0x16aa:
            r2 = -1440199809(0xffffffffaa284b7f, float:-1.494759E-13)
            int r2 = X.C14030oh.A03(r2)
            r3 = 138599303(0x842db87, float:5.8637805E-34)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r1 = r1.A00
            X.1d9 r1 = (X.AnonymousClass1d9) r1
            r0 = 2131826742(0x7f111836, float:1.9286377E38)
            r1.A01(r0)
            r0 = -1368188409(0xffffffffae731a07, float:-5.527492E-11)
            X.C14030oh.A0A(r0, r3)
            r0 = 1549701861(0x5c5e92e5, float:2.50595828E17)
            goto L_0x3bb6
        L_0x16d0:
            r0 = -38210569(0xfffffffffdb8f3f7, float:-3.0730586E37)
            int r2 = X.C14030oh.A03(r0)
            r0 = 227331604(0xd8cce14, float:8.677778E-31)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            X.Dsm r4 = X.C18190wL.A0W(r0)
            r0 = 2131837054(0x7f11407e, float:1.9307292E38)
            r4.A0L(r0)
            r0 = 2131837053(0x7f11407d, float:1.930729E38)
            r4.A0K(r0)
            r3 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 92
            X.C18180wK.A1O(r4, r1, r0, r3)
            r0 = 0
            r4.A0r(r0)
            X.AnonymousClass0wJ.A1K(r4)
            r0 = -1204634639(0xffffffffb832bbf1, float:-4.261354E-5)
            X.C14030oh.A0A(r0, r5)
            r0 = 118344034(0x70dc962, float:1.0666842E-34)
            goto L_0x3bb6
        L_0x170e:
            r2 = 1151877911(0x44a84317, float:1346.0966)
            int r6 = X.C14030oh.A03(r2)
            X.1U1 r0 = (X.AnonymousClass1U1) r0
            r2 = -731372734(0xffffffffd4682342, float:-3.98809576E12)
            int r5 = X.C14030oh.A03(r2)
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            java.lang.Object r3 = r1.A00
            X.1bx r3 = (X.C23121bx) r3
            android.content.Context r2 = r3.requireContext()
            r9 = 0
            r1 = 2131836997(0x7f114045, float:1.9307177E38)
            X.C63813iO.A03(r2, r9, r1, r4)
            android.widget.TextView r2 = r3.A02
            if (r2 != 0) goto L_0x1739
            java.lang.String r0 = "backupCodesTextView"
            goto L_0x1b93
        L_0x1739:
            java.util.ArrayList r1 = r0.A04
            if (r1 == 0) goto L_0x1751
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.C18200wM.A0l(r0, r1)
        L_0x1743:
            r2.setText(r0)
            r0 = -1352425136(0xffffffffaf63a150, float:-2.070284E-10)
            X.C14030oh.A0A(r0, r5)
            r0 = 1906742259(0x71a693f3, float:1.6497079E30)
            goto L_0x1e84
        L_0x1751:
            java.lang.String r0 = ""
            goto L_0x1743
        L_0x1754:
            r2 = -112032847(0xfffffffff95283b1, float:-6.8315835E34)
            int r2 = X.C14030oh.A03(r2)
            X.1Ta r0 = (X.C22011Ta) r0
            r3 = -1583531607(0xffffffffa19d39a9, float:-1.0653996E-18)
            int r3 = X.C14030oh.A03(r3)
            r11 = 0
            X.C04220Ms.A0B(r0, r11)
            java.lang.Object r5 = r1.A00
            X.1ZN r5 = (X.AnonymousClass1ZN) r5
            boolean r1 = r5.isResumed()
            if (r1 == 0) goto L_0x17c6
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x17a0
            X.3Hi r6 = X.C62653aT.A01()
            X.C04220Ms.A06(r6)
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x178d
            android.os.Bundle r7 = r5.requireArguments()
            com.instagram.igds.components.form.IgFormField r0 = r5.A00
            if (r0 != 0) goto L_0x17ac
            java.lang.String r10 = "emailFormField"
            goto L_0x3b84
        L_0x178d:
            r1 = 1
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            androidx.fragment.app.Fragment r6 = r6.A01(r0, r1, r11)
            android.content.Context r4 = r5.requireContext()
            r1 = 0
            r0 = 2131837060(0x7f114084, float:1.9307304E38)
            X.C63813iO.A03(r4, r1, r0, r11)
            goto L_0x17b9
        L_0x17a0:
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A00
            X.C62973bE.A04(r4, r0, r1)
            goto L_0x17c6
        L_0x17ac:
            android.widget.EditText r0 = r0.A00
            java.lang.String r10 = X.AnonymousClass0wJ.A0n(r0)
            r8 = 0
            java.lang.Integer r9 = X.AnonymousClass006.A0N
            androidx.fragment.app.Fragment r6 = r6.A00(r7, r8, r9, r10, r11)
        L_0x17b9:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0Oa r0 = r5.A05
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r6, r1, r0)
        L_0x17c6:
            r0 = 1435932842(0x559698aa, float:2.06978039E13)
            X.C14030oh.A0A(r0, r3)
            r0 = 1969401804(0x7562afcc, float:2.8735954E32)
            goto L_0x3bb6
        L_0x17d1:
            r2 = 1480071241(0x58381849, float:8.0965777E14)
            int r6 = X.C14030oh.A03(r2)
            X.1RQ r0 = (X.AnonymousClass1RQ) r0
            r2 = -2100542447(0xffffffff82cc4411, float:-3.0014174E-37)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r4 = r1.A00
            X.1bN r4 = (X.AnonymousClass1bN) r4
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0Oa r1 = r4.A00
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r1)
            X.Drz r3 = X.C18180wK.A0Q(r2, r1)
            android.os.Bundle r2 = X.C62653aT.A00(r4)
            X.38L r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "arg_totp_seed"
            r2.putString(r0, r1)
            X.1bm r0 = new X.1bm
            r0.<init>()
            r0.setArguments(r2)
            X.C18220wO.A1A(r0, r3)
            r0 = -491599529(0xffffffffe2b2c957, float:-1.6490143E21)
            X.C14030oh.A0A(r0, r5)
            r0 = -935415785(0xffffffffc83eb017, float:-195264.36)
            goto L_0x1e84
        L_0x1818:
            r2 = 1555162902(0x5cb1e716, float:4.0060122E17)
            int r2 = X.C14030oh.A03(r2)
            X.1T5 r0 = (X.AnonymousClass1T5) r0
            r3 = 1508303400(0x59e6e228, float:8.1234883E15)
            int r5 = X.C14030oh.A03(r3)
            r11 = 0
            X.C04220Ms.A0B(r0, r11)
            boolean r3 = r0.A01
            if (r3 == 0) goto L_0x1844
            X.3Hi r6 = X.C62653aT.A01()
            java.lang.Object r0 = r1.A00
            X.1bL r0 = (X.AnonymousClass1bL) r0
            android.os.Bundle r7 = r0.requireArguments()
            java.lang.String r10 = r0.A01
            if (r10 != 0) goto L_0x185f
            java.lang.String r10 = "currPhoneNumber"
            goto L_0x3b84
        L_0x1844:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r4 = r1.requireContext()
            android.content.Context r3 = r1.requireContext()
            r1 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r0 = r0.getErrorMessage()
            X.C62973bE.A04(r4, r0, r1)
            goto L_0x1874
        L_0x185f:
            java.lang.Integer r8 = X.AnonymousClass006.A0C
            java.lang.Integer r9 = X.AnonymousClass006.A0Y
            androidx.fragment.app.Fragment r3 = r6.A00(r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A03
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r3, r1, r0)
        L_0x1874:
            r0 = 730370677(0x2b889275, float:9.704031E-13)
            X.C14030oh.A0A(r0, r5)
            r0 = 1319316621(0x4ea32c8d, float:1.36880294E9)
            goto L_0x3bb6
        L_0x187f:
            r0 = -1642439949(0xffffffff9e1a5af3, float:-8.1715E-21)
            int r6 = X.C14030oh.A03(r0)
            r0 = 650486707(0x26c5a3b3, float:1.3713992E-15)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r1.A00
            X.1xY r3 = (X.C29231xY) r3
            X.0Oa r0 = r3.A07
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.C62423Zt.A02(r0)
            android.os.Bundle r2 = r3.A00
            if (r2 != 0) goto L_0x18a2
            java.lang.String r10 = "twoFacResponseBundle"
            goto L_0x3b84
        L_0x18a2:
            r1 = 0
            java.lang.String r0 = "is_totp_two_factor_enabled"
            r2.putBoolean(r0, r1)
            X.C29231xY.A0B(r3)
            r0 = 11246457(0xab9b79, float:1.5759643E-38)
            X.C14030oh.A0A(r0, r4)
            r0 = -1790861033(0xffffffff9541a117, float:-3.9103117E-26)
            goto L_0x1e84
        L_0x18b6:
            r0 = 1117897385(0x42a1c2a9, float:80.880196)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1311172129(0xffffffffb1d919df, float:-6.3184724E-9)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0m7 r4 = r0.getParentFragmentManager()
            r3 = 487(0x1e7, float:6.82E-43)
            r1 = 38
            r0 = 54
            java.lang.String r1 = X.C63833iQ.A07(r3, r1, r0)
            r0 = 0
            r4.A11(r1, r0)
            r0 = -846194384(0xffffffffcd901930, float:-3.02196224E8)
            X.C14030oh.A0A(r0, r5)
            r0 = -226366450(0xfffffffff281ec0e, float:-5.146744E30)
            goto L_0x3bb6
        L_0x18e5:
            r0 = -1153746367(0xffffffffbb3b3a41, float:-0.0028568658)
            int r4 = X.C14030oh.A03(r0)
            r0 = 2125050028(0x7ea9b0ac, float:1.1277843E38)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            java.lang.Throwable r9 = X.C63873iU.A0A(r0)
            X.38M r2 = r0.A00
            if (r2 == 0) goto L_0x1b91
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r0 = -342838008(0xffffffffeb90b508, float:-3.4988043E26)
            X.C14030oh.A0A(r0, r3)
            r0 = -398698312(0xffffffffe83c58b8, float:-3.557766E24)
            goto L_0x3a4b
        L_0x1910:
            r0 = 1751070460(0x685f36fc, float:4.216408E24)
            int r4 = X.C14030oh.A03(r0)
            r0 = -541385562(0xffffffffdfbb1ca6, float:-2.6965668E19)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            java.lang.Throwable r9 = X.C63873iU.A0A(r0)
            X.38M r2 = r0.A00
            if (r2 == 0) goto L_0x1b91
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r0 = -793858474(0xffffffffd0aeae56, float:-2.34452869E10)
            X.C14030oh.A0A(r0, r3)
            r0 = 1556008387(0x5cbecdc3, float:4.29651864E17)
            goto L_0x3a4b
        L_0x193b:
            r0 = 497744458(0x1daafa4a, float:4.525742E-21)
            int r2 = X.C14030oh.A03(r0)
            r0 = -259486270(0xfffffffff0888dc2, float:-3.380907E29)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r7 = r1.A00
            X.1aN r7 = (X.AnonymousClass1aN) r7
            boolean r0 = r7.isResumed()
            if (r0 == 0) goto L_0x1977
            X.3Hi r3 = X.C62653aT.A01()
            r1 = 1
            r5 = 0
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            androidx.fragment.app.Fragment r4 = r3.A01(r0, r1, r5)
            android.content.Context r3 = r7.requireContext()
            r1 = 0
            r0 = 2131837060(0x7f114084, float:1.9307304E38)
            X.C63813iO.A03(r3, r1, r0, r5)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.0Oa r0 = r7.A0B
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r4, r1, r0)
        L_0x1977:
            r0 = -1820444210(0xffffffff937e39ce, float:-3.2087807E-27)
            X.C14030oh.A0A(r0, r6)
            r0 = 503443946(0x1e01f1ea, float:6.87923E-21)
            goto L_0x3bb6
        L_0x1982:
            r2 = -191966519(0xfffffffff48ed2c9, float:-9.052507E31)
            int r2 = X.C14030oh.A03(r2)
            X.1U4 r0 = (X.AnonymousClass1U4) r0
            r3 = -754774635(0xffffffffd3030d95, float:-5.6286858E11)
            int r8 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r9 = r1.A00
            X.1aN r9 = (X.AnonymousClass1aN) r9
            boolean r1 = r9.isResumed()
            if (r1 == 0) goto L_0x1a11
            java.lang.Integer r3 = r9.A04
            java.lang.String r12 = "twoFacMethod"
            if (r3 == 0) goto L_0x1a73
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            if (r3 != r1) goto L_0x1a1c
            X.KHr r5 = X.C38040KHr.A01
            X.3iD r4 = X.C63733iD.A01()
            r1 = 2131837061(0x7f114085, float:1.9307306E38)
            X.C63733iD.A08(r9, r4, r1)
            r1 = 2131837176(0x7f1140f8, float:1.930754E38)
            java.lang.String r1 = r9.getString(r1)
            r4.A0F = r1
            android.content.Context r3 = r9.requireContext()
            r1 = 2131232281(0x7f080619, float:1.8080667E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r1)
            X.C04220Ms.A0A(r3)
            android.content.Context r1 = r9.requireContext()
            X.C63733iD.A05(r1, r3, r4)
            X.22b r1 = X.AnonymousClass22b.ICON
            r4.A0E(r1)
            X.C63733iD.A09(r5, r4)
            android.os.Bundle r7 = X.C62653aT.A00(r9)
            X.1bL r4 = new X.1bL
            r4.<init>()
        L_0x19e1:
            r4.setArguments(r7)
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x1a04
            int r1 = r1.length()
            if (r1 == 0) goto L_0x1a04
            X.3YZ r3 = X.C62653aT.A02()
            X.0Oa r1 = r9.A0B
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            java.lang.String r1 = r1.getUserId()
            java.lang.String r0 = r0.A02
            X.C04220Ms.A06(r0)
            r3.A02(r1, r0)
        L_0x1a04:
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            X.0Oa r0 = r9.A0B
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r4, r1, r0)
        L_0x1a11:
            r0 = 307898719(0x125a295f, float:6.8839665E-28)
            X.C14030oh.A0A(r0, r8)
            r0 = 1626688281(0x60f54b19, float:1.4140199E20)
            goto L_0x3bb6
        L_0x1a1c:
            android.os.Bundle r7 = r9.requireArguments()
            java.lang.String r3 = r9.A05
            java.lang.String r11 = "phoneNumberOrEmail"
            if (r3 == 0) goto L_0x1a6e
            java.lang.String r10 = X.C63833iQ.A02()
            java.lang.String r1 = r7.getString(r10)
            boolean r4 = r3.equals(r1)
            java.lang.String r1 = "is_phone_confirmed"
            boolean r3 = r7.getBoolean(r1)
            java.lang.String r1 = "is_totp_two_factor_enabled"
            boolean r6 = r7.getBoolean(r1)
            X.3aT r1 = X.C62653aT.A02
            r1.A03()
            if (r3 == 0) goto L_0x1a48
            r5 = 1
            if (r4 != 0) goto L_0x1a49
        L_0x1a48:
            r5 = 0
        L_0x1a49:
            java.lang.String r4 = r9.A05
            if (r4 == 0) goto L_0x1a6e
            java.lang.Integer r3 = r9.A04
            if (r3 == 0) goto L_0x1a73
            java.lang.String r1 = "has_phone_number_confirmed"
            r7.putBoolean(r1, r5)
            r7.putString(r10, r4)
            java.lang.String r1 = "has_two_fac_already_on"
            r7.putBoolean(r1, r6)
            java.lang.String r3 = X.C36182Qi.A00(r3)
            java.lang.String r1 = "two_fac_enable_method"
            r7.putString(r1, r3)
            X.1bl r4 = new X.1bl
            r4.<init>()
            goto L_0x19e1
        L_0x1a6e:
            X.C04220Ms.A0E(r11)
            goto L_0x3b87
        L_0x1a73:
            X.C04220Ms.A0E(r12)
            goto L_0x3b87
        L_0x1a78:
            r0 = -492774688(0xffffffffe2a0dae0, float:-1.4836253E21)
            int r4 = X.C14030oh.A03(r0)
            r0 = -2140873941(0xffffffff8064db2b, float:-9.262172E-39)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r7 = r1.A00
            X.1aN r7 = (X.AnonymousClass1aN) r7
            boolean r0 = r7.isResumed()
            if (r0 == 0) goto L_0x1af1
            android.os.Bundle r8 = r7.requireArguments()
            java.lang.String r1 = r7.A05
            java.lang.String r10 = "phoneNumberOrEmail"
            if (r1 == 0) goto L_0x3b84
            java.lang.String r9 = X.C63833iQ.A02()
            java.lang.String r0 = r8.getString(r9)
            boolean r2 = r1.equals(r0)
            java.lang.String r0 = "is_phone_confirmed"
            boolean r1 = r8.getBoolean(r0)
            java.lang.String r0 = "is_two_factor_enabled"
            boolean r6 = r8.getBoolean(r0)
            X.3aT r0 = X.C62653aT.A02
            r0.A03()
            if (r1 == 0) goto L_0x1abc
            r3 = 0
            if (r2 != 0) goto L_0x1abd
        L_0x1abc:
            r3 = 1
        L_0x1abd:
            java.lang.String r2 = r7.A05
            if (r2 == 0) goto L_0x3b84
            java.lang.Integer r1 = r7.A04
            if (r1 != 0) goto L_0x1ac9
            java.lang.String r10 = "twoFacMethod"
            goto L_0x3b84
        L_0x1ac9:
            java.lang.String r0 = "has_phone_number_confirmed"
            r8.putBoolean(r0, r3)
            r8.putString(r9, r2)
            java.lang.String r0 = "has_two_fac_already_on"
            r8.putBoolean(r0, r6)
            java.lang.String r1 = X.C36182Qi.A00(r1)
            java.lang.String r0 = "two_fac_enable_method"
            r8.putString(r0, r1)
            X.1bl r2 = new X.1bl
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.C18210wN.A0F(r8, r2, r7)
            X.0Oa r0 = r7.A0B
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r2, r1, r0)
        L_0x1af1:
            r0 = 293282825(0x117b2409, float:1.9811513E-28)
            X.C14030oh.A0A(r0, r5)
            r0 = 254769087(0xf2f77bf, float:8.6512284E-30)
            goto L_0x3a4b
        L_0x1afc:
            r0 = 711310780(0x2a65bdbc, float:2.0405113E-13)
            int r4 = X.C14030oh.A03(r0)
            r0 = 313842302(0x12b4da7e, float:1.14134595E-27)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r1.A00
            X.1aN r6 = (X.AnonymousClass1aN) r6
            X.KHr r3 = X.C38040KHr.A01
            X.3iD r2 = X.C63733iD.A01()
            r0 = 2131837175(0x7f1140f7, float:1.9307538E38)
            X.C63733iD.A08(r6, r2, r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131232255(0x7f0805ff, float:1.8080614E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            X.C04220Ms.A0A(r1)
            android.content.Context r0 = r6.requireContext()
            X.C63733iD.A05(r0, r1, r2)
            X.22b r0 = X.AnonymousClass22b.ICON
            r2.A0E(r0)
            X.C63733iD.A09(r3, r2)
            X.3Hi r3 = X.C62653aT.A01()
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "is_two_factor_enabled"
            boolean r0 = r1.getBoolean(r0)
            r2 = 1
            r1 = r0 ^ 1
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            androidx.fragment.app.Fragment r2 = r3.A01(r0, r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0Oa r0 = r6.A0B
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r2, r1, r0)
            r0 = -1675280836(0xffffffff9c253e3c, float:-5.4674356E-22)
            X.C14030oh.A0A(r0, r5)
            r0 = 1878670338(0x6ffa3c02, float:1.54887595E29)
            goto L_0x3a4b
        L_0x1b66:
            r0 = 1999955972(0x7734e804, float:3.669216E33)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1902967491(0xffffffff8e93053d, float:-3.6243342E-30)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            java.lang.Throwable r9 = X.C63873iU.A0A(r0)
            X.38M r2 = r0.A00
            if (r2 == 0) goto L_0x1b91
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r0 = -961309833(0xffffffffc6b39377, float:-22985.732)
            X.C14030oh.A0A(r0, r3)
            r0 = -1213126897(0xffffffffb7b1270f, float:-2.1118232E-5)
            goto L_0x3a4b
        L_0x1b91:
            java.lang.String r0 = "twoFacPhoneVerificationHelper"
        L_0x1b93:
            X.C04220Ms.A0E(r0)
            throw r9
        L_0x1b97:
            r0 = 190865912(0xb6061f8, float:4.3214534E-32)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1670421232(0x63909af0, float:5.334991E21)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A00
            X.1am r4 = (X.C22841am) r4
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r4.A00
            java.lang.String r10 = "editPhoneNumberView"
            if (r0 == 0) goto L_0x3b84
            java.lang.String r0 = r0.getPhoneNumber()
            r4.A02 = r0
            android.os.Bundle r5 = r4.requireArguments()
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r4.A00
            if (r0 == 0) goto L_0x3b84
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = X.C63833iQ.A02()
            r5.putString(r0, r1)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r4.A00
            if (r0 == 0) goto L_0x3b84
            com.instagram.ui.widget.editphonenumber.CountryCodeTextView r0 = r0.A04
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "country_code"
            r5.putString(r0, r1)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r4.A00
            if (r0 == 0) goto L_0x3b84
            android.widget.EditText r0 = r0.A01
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r0)
            java.lang.String r0 = "national_number"
            r5.putString(r0, r1)
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.4PO r0 = new X.4PO
            r0.<init>(r4)
            r1.post(r0)
            r0 = 926290339(0x373611a3, float:1.0852152E-5)
            X.C14030oh.A0A(r0, r3)
            r0 = 1228066685(0x4932cf7d, float:732407.8)
            goto L_0x3bb6
        L_0x1bfb:
            r2 = -781904983(0xffffffffd16513a9, float:-6.1492335E10)
            int r4 = X.C14030oh.A03(r2)
            X.1U1 r0 = (X.AnonymousClass1U1) r0
            r2 = -1493102114(0xffffffffa70111de, float:-1.7912032E-15)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r3 = r1.A00
            X.1Zj r3 = (X.C22761Zj) r3
            android.view.View r1 = r3.mView
            if (r1 == 0) goto L_0x1c20
            android.view.ViewStub r2 = r3.A01
            if (r2 != 0) goto L_0x1c1b
            java.lang.String r10 = "loadingViewStub"
            goto L_0x3b84
        L_0x1c1b:
            r1 = 8
            r2.setVisibility(r1)
        L_0x1c20:
            android.os.Handler r2 = X.AnonymousClass0wJ.A0F()
            X.4Rc r1 = new X.4Rc
            r1.<init>(r0, r3)
            r2.post(r1)
            r0 = -1523206049(0xffffffffa535b85f, float:-1.5761715E-16)
            X.C14030oh.A0A(r0, r5)
            r0 = 612384957(0x248040bd, float:5.562082E-17)
            goto L_0x3a4b
        L_0x1c37:
            r2 = 307399705(0x12528c19, float:6.6437E-28)
            int r2 = X.C14030oh.A03(r2)
            X.1RP r0 = (X.AnonymousClass1RP) r0
            r3 = 1185537661(0x46a9de7d, float:21743.244)
            int r7 = X.C14030oh.A03(r3)
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            X.359 r5 = r0.A00
            if (r5 == 0) goto L_0x3b7f
            java.lang.Object r4 = r1.A00
            X.1Yw r4 = (X.C22641Yw) r4
            r0 = 2131837145(0x7f1140d9, float:1.9307477E38)
            java.lang.String r3 = X.C18180wK.A0g(r4, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 0
            X.C63813iO.A02(r1, r3, r0, r6)
            X.16y r0 = r5.A00
            java.lang.String r0 = r0.A02
            r4.A0G = r0
            r0 = 1162724673(0x454dc541, float:3292.3284)
            X.C14030oh.A0A(r0, r7)
            r0 = 18968020(0x1216dd4, float:2.9649828E-38)
            goto L_0x3bb6
        L_0x1c73:
            r2 = -373374627(0xffffffffe9bec15d, float:-2.882613E25)
            int r4 = X.C14030oh.A03(r2)
            X.1TP r0 = (X.AnonymousClass1TP) r0
            r2 = -126904414(0xfffffffff86f97a2, float:-1.9438038E34)
            int r5 = X.C14030oh.A03(r2)
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            java.lang.Object r6 = r1.A00
            X.1Yw r6 = (X.C22641Yw) r6
            boolean r1 = r6.A0I
            if (r1 == 0) goto L_0x1c9e
            r1 = 2131837145(0x7f1140d9, float:1.9307477E38)
            java.lang.String r3 = X.C18180wK.A0g(r6, r1)
            android.content.Context r2 = r6.requireContext()
            r1 = 0
            X.C63813iO.A02(r2, r3, r1, r7)
        L_0x1c9e:
            r1 = 1
            r6.A0I = r1
            X.3DR r0 = r0.A01
            java.lang.String r0 = r0.A05
            X.C04220Ms.A06(r0)
            r6.A0G = r0
            X.38M r2 = r6.A07
            if (r2 != 0) goto L_0x1cb2
            java.lang.String r10 = "twoFacPhoneVerificationHelper"
            goto L_0x3b84
        L_0x1cb2:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r0 = -2104152579(0xffffffff82952dfd, float:-2.1919978E-37)
            X.C14030oh.A0A(r0, r5)
            r0 = -1073753907(0xffffffffbfffd0cd, float:-1.9985596)
            goto L_0x3a4b
        L_0x1cc3:
            r2 = 529808410(0x1f943c1a, float:6.277987E-20)
            int r5 = X.C14030oh.A03(r2)
            X.1Tn r0 = (X.C22141Tn) r0
            r2 = 478023028(0x1c7e0d74, float:8.405894E-22)
            int r6 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "show_two_factor_support_challenge"
            boolean r2 = X.C04220Ms.A0I(r3, r2)
            java.lang.String r10 = "loggedOutSession"
            if (r2 == 0) goto L_0x1d28
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r3 = "get_challenge"
            java.lang.String r2 = "true"
            r4.put(r3, r2)
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "user_id"
            r4.put(r2, r3)
            java.lang.String r3 = r0.A04
            java.lang.String r2 = "nonce_code"
            r4.put(r2, r3)
            java.lang.String r3 = r0.A03
            java.lang.String r2 = "cni"
            r4.put(r2, r3)
            java.lang.String r3 = r0.A02
            java.lang.String r2 = "challenge_context"
            r4.put(r2, r3)
            java.lang.Object r2 = r1.A00
            X.1Yw r2 = (X.C22641Yw) r2
            X.0bf r1 = r2.A09
            if (r1 == 0) goto L_0x3b84
            java.lang.String r0 = r0.A01
            X.4A9 r1 = X.C63263h8.A00(r1, r0, r4)
            r0 = 7
            X.AnonymousClass4A9.A00(r1, r2, r0)
            r2.schedule(r1)
        L_0x1d1b:
            r0 = -155653090(0xfffffffff6b8ec1e, float:-1.8753352E33)
            X.C14030oh.A0A(r0, r6)
            r0 = -2145817490(0xffffffff80196c6e, float:-2.334785E-39)
            X.C14030oh.A0A(r0, r5)
            return
        L_0x1d28:
            X.C63463hW.A03()
            java.lang.Object r8 = r1.A00
            X.1Yw r8 = (X.C22641Yw) r8
            java.lang.String r7 = r8.A0H
            if (r7 == 0) goto L_0x1e04
            java.lang.String r4 = r8.A0G
            if (r4 == 0) goto L_0x1e00
            X.25m r3 = X.C313225m.ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW
            X.1Yo r2 = new X.1Yo
            r2.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "ARGUMENT_OMNISTRING"
            r1.putString(r0, r7)
            java.lang.String r0 = "ARGUMENT_TWOFAC_IDENTIFIER"
            r1.putString(r0, r4)
            X.C313225m.A00(r1, r3)
            androidx.fragment.app.FragmentActivity r1 = X.C18210wN.A0F(r1, r2, r8)
            X.0bf r0 = r8.A09
            if (r0 == 0) goto L_0x3b84
            X.AnonymousClass0wJ.A19(r2, r1, r0)
            goto L_0x1d1b
        L_0x1d5b:
            r2 = 381467021(0x16bcb98d, float:3.0490137E-25)
            int r3 = X.C14030oh.A03(r2)
            X.1Tw r0 = (X.C22221Tw) r0
            r2 = 923812257(0x371041a1, float:8.598349E-6)
            int r2 = X.C14030oh.A03(r2)
            r12 = 0
            X.C04220Ms.A0B(r0, r12)
            super.onSuccess(r0)
            java.lang.Integer r0 = r0.A00()
            int r4 = r0.intValue()
            r0 = 3
            java.lang.String r10 = "notificationStatusHandler"
            if (r4 == r0) goto L_0x1db1
            r0 = 2
            if (r4 == r0) goto L_0x1da1
            r0 = 4
            if (r4 != r0) goto L_0x1d96
            java.lang.Object r1 = r1.A00
            X.1Yw r1 = (X.C22641Yw) r1
            X.3YZ r0 = r1.A08
            if (r0 == 0) goto L_0x1dfc
            java.lang.String r1 = r1.A0E
            if (r1 == 0) goto L_0x1df8
            java.util.Map r0 = r0.A01
            r0.remove(r1)
        L_0x1d96:
            r0 = -1214368383(0xffffffffb79e3581, float:-1.8859982E-5)
            X.C14030oh.A0A(r0, r2)
            r0 = 485384932(0x1cee62e4, float:1.5775081E-21)
            goto L_0x1e33
        L_0x1da1:
            java.lang.Object r0 = r1.A00
            X.1Yw r0 = (X.C22641Yw) r0
            android.os.Handler r5 = r0.A00
            if (r5 == 0) goto L_0x3b84
            java.lang.Runnable r4 = r0.A0U
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r4, r0)
            goto L_0x1d96
        L_0x1db1:
            java.lang.Object r4 = r1.A00
            X.1Yw r4 = (X.C22641Yw) r4
            android.os.Handler r1 = r4.A00
            if (r1 == 0) goto L_0x3b84
            java.lang.Runnable r0 = r4.A0U
            r1.removeCallbacks(r0)
            android.content.Context r5 = r4.requireContext()
            X.0bf r6 = r4.A09
            if (r6 != 0) goto L_0x1dca
            java.lang.String r10 = "loggedOutSession"
            goto L_0x3b84
        L_0x1dca:
            java.lang.String r7 = r4.A0H
            if (r7 == 0) goto L_0x1e04
            java.lang.String r8 = r4.A0G
            if (r8 == 0) goto L_0x1e00
            X.3YZ r0 = r4.A08
            if (r0 == 0) goto L_0x1dfc
            java.lang.String r1 = r4.A0E
            if (r1 == 0) goto L_0x1df8
            java.util.Map r0 = r0.A01
            java.lang.Object r11 = r0.get(r1)
            java.util.List r11 = (java.util.List) r11
            r0 = 4
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r9 = ""
            X.H8c r1 = X.C62403Zn.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.1rC r0 = new X.1rC
            r0.<init>(r4, r12)
            r1.A00 = r0
            r4.schedule(r1)
            goto L_0x1d96
        L_0x1df8:
            java.lang.String r10 = "pk"
            goto L_0x3b84
        L_0x1dfc:
            java.lang.String r10 = "twoFacSecureNonceManager"
            goto L_0x3b84
        L_0x1e00:
            java.lang.String r10 = "twoFacIdentifier"
            goto L_0x3b84
        L_0x1e04:
            java.lang.String r10 = X.C63833iQ.A06()
            goto L_0x3b84
        L_0x1e0a:
            r2 = -1568228686(0xffffffffa286bab2, float:-3.6518444E-18)
            int r3 = X.C14030oh.A03(r2)
            X.1U1 r0 = (X.AnonymousClass1U1) r0
            r2 = 997839869(0x3b79d3fd, float:0.003812074)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r4 = r1.A00
            X.1wr r4 = (X.AnonymousClass1wr) r4
            android.os.Bundle r2 = r0.A00()
            r4.A00 = r2
            super.onSuccess(r0)
            X.AnonymousClass1wr.A0B(r4)
            r0 = 114823629(0x6d811cd, float:8.1276325E-35)
            X.C14030oh.A0A(r0, r5)
            r0 = -2065210530(0xffffffff84e7635e, float:-5.4399093E-36)
        L_0x1e33:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x1e37:
            r2 = -2140242564(0xffffffff806e7d7c, float:-1.014692E-38)
            int r6 = X.C14030oh.A03(r2)
            X.1RQ r0 = (X.AnonymousClass1RQ) r0
            r2 = -291910275(0xffffffffee99cd7d, float:-2.3799813E28)
            int r7 = X.AnonymousClass0wJ.A00(r2, r0)
            X.38L r5 = r0.A00
            if (r5 == 0) goto L_0x3b7f
            java.lang.Object r4 = r1.A00
            X.1bn r4 = (X.C23021bn) r4
            r0 = 1
            r4.A03 = r0
            android.os.Bundle r1 = r4.A00
            java.lang.String r10 = "twoFacResponseBundle"
            if (r1 == 0) goto L_0x3b84
            java.lang.String r3 = r5.A00
            java.lang.String r0 = "instagram_key"
            r1.putString(r0, r3)
            android.os.Bundle r2 = r4.A00
            if (r2 == 0) goto L_0x3b84
            java.lang.String r1 = r5.A01
            if (r1 != 0) goto L_0x1e69
            java.lang.String r1 = ""
        L_0x1e69:
            java.lang.String r0 = X.C63833iQ.A04()
            r2.putString(r0, r1)
            android.widget.TextView r1 = r4.A01
            if (r1 == 0) goto L_0x1ebe
            android.widget.TextView r0 = r4.A02
            if (r0 == 0) goto L_0x1eba
            X.C62923b9.A03(r1, r0, r3)
            r0 = 1529650704(0x5b2c9e10, float:4.8587488E16)
            X.C14030oh.A0A(r0, r7)
            r0 = -1631616700(0xffffffff9ebf8144, float:-2.0276375E-20)
        L_0x1e84:
            X.C14030oh.A0A(r0, r6)
            return
        L_0x1e88:
            r2 = 1041552805(0x3e14d5a5, float:0.14534624)
            int r4 = X.C14030oh.A03(r2)
            X.1RQ r0 = (X.AnonymousClass1RQ) r0
            r2 = 436982727(0x1a0bd3c7, float:2.89156E-23)
            int r3 = X.AnonymousClass0wJ.A00(r2, r0)
            X.38L r2 = r0.A00
            if (r2 == 0) goto L_0x3b7f
            java.lang.Object r0 = r1.A00
            X.1ZZ r0 = (X.AnonymousClass1ZZ) r0
            java.lang.String r2 = r2.A00
            r0.A02 = r2
            android.widget.TextView r1 = r0.A00
            if (r1 == 0) goto L_0x1ebe
            android.widget.TextView r0 = r0.A01
            if (r0 == 0) goto L_0x1eba
            X.C62923b9.A03(r1, r0, r2)
            r0 = 246669047(0xeb3def7, float:4.4341614E-30)
            X.C14030oh.A0A(r0, r3)
            r0 = 1875891617(0x6fcfd5a1, float:1.2864332E29)
            goto L_0x3a4b
        L_0x1eba:
            java.lang.String r10 = "igKeyLineTwo"
            goto L_0x3b84
        L_0x1ebe:
            java.lang.String r10 = "igKeyLineOne"
            goto L_0x3b84
        L_0x1ec2:
            r0 = -1997454089(0xffffffff88f144f7, float:-1.4520873E-33)
            int r4 = X.C14030oh.A03(r0)
            r0 = 43396497(0x2962d91, float:2.2066673E-37)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.1c0 r0 = (X.AnonymousClass1c0) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A03
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            r1 = 0
            r0 = 0
            r2.A0D(r1, r0)
            r0 = -2102500074(0xffffffff82ae6516, float:-2.5625023E-37)
            X.C14030oh.A0A(r0, r3)
            r0 = -1747512(0xffffffffffe555c8, float:NaN)
            goto L_0x3a4b
        L_0x1ef2:
            r2 = 261850363(0xf9b84fb, float:1.5335402E-29)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -824995871(0xffffffffced38fe1, float:-1.77471091E9)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r0 = r0.A01
            X.4vB r0 = (X.C85434vB) r0
            if (r0 != 0) goto L_0x1f13
            r0 = -907015628(0xffffffffc9f00a34, float:-1966406.5)
        L_0x1f0b:
            X.C14030oh.A0A(r0, r5)
            r0 = 431412625(0x19b6d591, float:1.8904618E-23)
            goto L_0x3a4b
        L_0x1f13:
            X.4vZ r6 = r0.BMa()
            if (r6 != 0) goto L_0x1f1d
            r0 = 474588964(0x1c49a724, float:6.6721345E-22)
            goto L_0x1f0b
        L_0x1f1d:
            boolean r0 = r6.Apl()
            if (r0 == 0) goto L_0x1f34
            X.1tl r0 = X.C63873iU.A08(r1)
            boolean r3 = r6.Apl()
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r0)
            java.lang.String r0 = "basic_ads_opt_in_status"
            X.AnonymousClass0wJ.A13(r2, r0, r3)
        L_0x1f34:
            boolean r0 = r6.Apm()
            X.1tl r1 = X.C63873iU.A08(r1)
            if (r0 == 0) goto L_0x1f59
            X.Ist r0 = X.C35334Ist.BASIC_ADS_TIER_YOUTH
        L_0x1f40:
            java.lang.String r2 = r0.toString()
        L_0x1f44:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r1)
            if (r2 != 0) goto L_0x1f50
            X.Ist r0 = X.C35334Ist.BASIC_ADS_TIER_NONE
            java.lang.String r2 = r0.toString()
        L_0x1f50:
            java.lang.String r0 = "basic_ads_tier"
            X.C18180wK.A0v(r1, r0, r2)
            r0 = 1117065030(0x42950f46, float:74.52983)
            goto L_0x1f0b
        L_0x1f59:
            X.Ist r0 = r6.BGj()
            if (r0 != 0) goto L_0x1f40
            r2 = 0
            goto L_0x1f44
        L_0x1f61:
            r2 = 2114479543(0x7e0865b7, float:4.5325785E37)
            int r2 = X.C14030oh.A03(r2)
            X.1SK r0 = (X.AnonymousClass1SK) r0
            r3 = 1745719966(0x680d929e, float:2.674233E24)
            int r5 = X.C14030oh.A03(r3)
            java.util.List r0 = r0.A00
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = r0.iterator()
        L_0x1f7b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x1f94
            java.lang.Object r0 = r6.next()
            X.38K r0 = (X.AnonymousClass38K) r0
            X.3DU r4 = r0.A00
            java.lang.String r3 = r0.A01
            X.1s1 r0 = new X.1s1
            r0.<init>(r4, r3)
            r7.add(r0)
            goto L_0x1f7b
        L_0x1f94:
            java.lang.Object r1 = r1.A00
            X.3aW r1 = (X.C62683aW) r1
            java.lang.Object r3 = r1.A07
            monitor-enter(r3)
            java.util.ArrayList r0 = X.C18200wM.A0s(r7)     // Catch:{ all -> 0x1fbf }
            r1.A01 = r0     // Catch:{ all -> 0x1fbf }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x1fbf }
            monitor-exit(r3)     // Catch:{ all -> 0x1fbf }
            if (r0 != 0) goto L_0x1fbb
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A04
            r0.getClass()
            r1.A03(r7, r0)
        L_0x1fb0:
            r0 = -433049090(0xffffffffe63031fe, float:-2.0801467E23)
            X.C14030oh.A0A(r0, r5)
            r0 = 971377179(0x39e60a1b, float:4.3876548E-4)
            goto L_0x3bb6
        L_0x1fbb:
            X.C62683aW.A02(r1)
            goto L_0x1fb0
        L_0x1fbf:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1fbf }
            r0 = -2078807731(0xffffffff8417e94d, float:-1.7857091E-36)
            X.C14030oh.A0A(r0, r5)
            throw r1
        L_0x1fc8:
            r2 = 2049521377(0x7a2936e1, float:2.1965281E35)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1984544974(0x7649c0ce, float:1.02301E33)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r7 = r1.A00
            X.1Yr r7 = (X.C22591Yr) r7
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.7IU r3 = new X.7IU
            r3.<init>(r1)
            java.lang.Class<X.10C> r1 = X.AnonymousClass10C.class
            X.3ak r1 = r3.A01(r1)
            X.10C r1 = (X.AnonymousClass10C) r1
            r7.A03 = r1
            java.lang.Object r0 = r0.A01
            r0.getClass()
            X.4ug r0 = (X.C85204ug) r0
            X.4uf r0 = r0.AkO()
            r0.getClass()
            X.4vG r0 = r0.AkQ()
            r0.getClass()
            X.4vb r6 = r0.AZT()
            X.4vF r3 = r0.Ag5()
            if (r6 == 0) goto L_0x2255
            X.4vU r5 = r6.AWT()
            X.4va r3 = r6.AjP()
            if (r5 == 0) goto L_0x2062
            if (r3 == 0) goto L_0x2062
            java.lang.String r0 = r6.BH2()
            r1.A0B = r0
            java.lang.String r0 = r6.ATn()
            r1.A02 = r0
            com.google.common.collect.ImmutableList r0 = r6.AOc()
            r1.A00 = r0
            java.lang.String r0 = r5.B2z()
            r1.A08 = r0
            java.lang.String r0 = r5.Ah2()
            r1.A05 = r0
            java.lang.String r0 = r5.Ah4()
            if (r0 == 0) goto L_0x2252
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C18250wR.A0K(r0)
        L_0x2042:
            r1.A01 = r0
            java.lang.String r0 = r3.AdP()
            r1.A03 = r0
            java.lang.String r0 = r3.Arn()
            r1.A07 = r0
            java.lang.String r0 = r3.Amm()
            r1.A06 = r0
            java.lang.String r0 = r3.B3I()
            r1.A09 = r0
            java.lang.String r0 = r3.B9J()
            r1.A0A = r0
        L_0x2062:
            X.3Gl r1 = X.C35682Ok.A00()
            android.view.Window r0 = X.C18180wK.A0F(r7)
            r1.A01(r0)
            X.10C r1 = r7.A03
            java.lang.String r0 = r1.A04
            if (r0 != 0) goto L_0x223e
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x223e
            X.0i6 r3 = r7.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.2A6 r1 = r7.A01
            boolean r8 = X.AnonymousClass0wJ.A1Z(r3, r1)
            X.2A7 r0 = X.AnonymousClass2A7.A05
            r6 = 0
            X.C63243h6.A01(r0, r1, r3, r6)
            android.view.ViewStub r0 = r7.A00
            android.view.View r9 = r0.inflate()
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.view.View r1 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.10C r0 = r7.A03
            java.lang.String r0 = r0.A0B
            r0.getClass()
            r1.setText(r0)
            r0 = 2131297530(0x7f0904fa, float:1.8213008E38)
            android.view.View r10 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            X.10C r0 = r7.A03
            java.lang.String r1 = r0.A02
            r1.getClass()
            java.lang.String r0 = r0.A05
            r0.getClass()
            int r5 = r1.indexOf(r0)
            android.text.SpannableStringBuilder r3 = X.C18200wM.A0E(r1)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            int r0 = X.AnonymousClass0hA.A01(r0)
            int r0 = r0 + r5
            r11 = 33
            r3.setSpan(r1, r5, r0, r11)
            r10.setText(r3)
            r0 = 2131301471(0x7f09145f, float:1.8221E38)
            android.view.View r1 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.10C r0 = r7.A03
            java.lang.String r0 = r0.A08
            r0.getClass()
            r1.setText(r0)
            r0 = 2131302111(0x7f0916df, float:1.8222299E38)
            android.view.View r5 = X.C18180wK.A0E(r9, r0)
            r0 = 2131297185(0x7f0903a1, float:1.8212308E38)
            android.view.View r3 = X.C18180wK.A0E(r5, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            X.0i6 r0 = r7.A02
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            com.instagram.user.model.User r10 = X.AnonymousClass0wJ.A0Y(r0)
            X.10C r0 = r7.A03
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01
            boolean r0 = X.AnonymousClass3WG.A02(r1)
            if (r0 == 0) goto L_0x2239
            android.content.Context r1 = r7.requireContext()
            r0 = 2131233606(0x7f080b46, float:1.8083354E38)
            X.C18180wK.A0r(r1, r3, r0)
        L_0x2110:
            r0 = 2131297316(0x7f090424, float:1.8212573E38)
            android.view.View r3 = X.C18180wK.A0E(r5, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r1 = r7.requireContext()
            r0 = 2131231875(0x7f080483, float:1.8079843E38)
            X.C18180wK.A0r(r1, r3, r0)
            r0 = 2131296357(0x7f090065, float:1.8210628E38)
            android.view.View r3 = X.C18180wK.A0E(r5, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r1 = r10.Ak1()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x213a
            java.lang.String r1 = r10.BK7()
        L_0x213a:
            r1.getClass()
            r3.setText(r1)
            r0 = 2131296356(0x7f090064, float:1.8210626E38)
            android.view.View r1 = X.C18180wK.A0E(r5, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131820625(0x7f110051, float:1.927397E38)
            r1.setText(r0)
            r0 = 2131300351(0x7f090fff, float:1.821873E38)
            android.view.View r5 = X.C18180wK.A0E(r9, r0)
            r0 = 2131297185(0x7f0903a1, float:1.8212308E38)
            android.view.View r3 = X.C18180wK.A0E(r5, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            X.10C r0 = r7.A03
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01
            boolean r0 = X.AnonymousClass3WG.A02(r1)
            if (r0 == 0) goto L_0x2234
            android.content.Context r1 = r7.requireContext()
            r0 = 2131233606(0x7f080b46, float:1.8083354E38)
            X.C18180wK.A0r(r1, r3, r0)
        L_0x2173:
            r0 = 2131297316(0x7f090424, float:1.8212573E38)
            android.view.View r3 = X.C18180wK.A0E(r5, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r1 = r7.requireContext()
            r0 = 2131231564(0x7f08034c, float:1.8079213E38)
            X.C18180wK.A0r(r1, r3, r0)
            r0 = 2131296357(0x7f090065, float:1.8210628E38)
            android.view.View r1 = X.C18180wK.A0E(r5, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.10C r0 = r7.A03
            java.lang.String r0 = r0.A05
            r0.getClass()
            r1.setText(r0)
            r0 = 2131296356(0x7f090064, float:1.8210626E38)
            android.view.View r1 = X.C18180wK.A0E(r5, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131826983(0x7f111927, float:1.9286866E38)
            r1.setText(r0)
            r0 = 2131299773(0x7f090dbd, float:1.8217557E38)
            android.view.View r1 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.10C r0 = r7.A03
            java.lang.String r0 = r0.A03
            r0.getClass()
            r1.setText(r0)
            r0 = 2131302512(0x7f091870, float:1.8223112E38)
            android.view.View r10 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            X.10C r0 = r7.A03
            java.lang.String r5 = r0.A06
            r5.getClass()
            java.lang.String r1 = r0.A07
            r1.getClass()
            r0 = 2
            com.facebook.redex.IDxCSpanShape0S1100000_1_I2 r3 = new com.facebook.redex.IDxCSpanShape0S1100000_1_I2
            r3.<init>(r5, r7, r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r1)
            int r0 = r1.length()
            r5 = 0
            r1.setSpan(r3, r5, r0, r11)
            r10.setText(r1)
            X.C18180wK.A0z(r10)
            r0 = 2131304563(0x7f092073, float:1.8227272E38)
            android.view.View r1 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.10C r0 = r7.A03
            java.lang.String r0 = r0.A09
            r0.getClass()
            r1.setText(r0)
            r0 = 572(0x23c, float:8.02E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r7)
            r0 = 2131306716(0x7f0928dc, float:1.8231639E38)
            android.view.View r1 = X.C18180wK.A0E(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.10C r0 = r7.A03
            java.lang.String r0 = r0.A0A
            r0.getClass()
            r1.setText(r0)
            r0 = 573(0x23d, float:8.03E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r7)
            X.0i6 r3 = r7.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.2A6 r1 = r7.A01
            X.C04220Ms.A0B(r3, r5)
            X.C04220Ms.A0B(r1, r8)
            X.2A7 r0 = X.AnonymousClass2A7.A08
            X.C63243h6.A01(r0, r1, r3, r6)
        L_0x2229:
            r0 = 340325417(0x1448f429, float:1.0145572E-26)
            X.C14030oh.A0A(r0, r4)
            r0 = 1467836989(0x577d6a3d, float:2.78632732E14)
            goto L_0x3bb6
        L_0x2234:
            r3.setUrl(r1, r7)
            goto L_0x2173
        L_0x2239:
            r3.setUrl(r1, r7)
            goto L_0x2110
        L_0x223e:
            X.0i6 r5 = r7.A02
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            X.2A6 r3 = r7.A01
            X.AnonymousClass0wJ.A1N(r5, r3)
            X.2A7 r1 = X.AnonymousClass2A7.A04
            r0 = 0
            X.C63243h6.A01(r1, r3, r5, r0)
            r0 = -1
            X.C22591Yr.A01(r7, r0)
            goto L_0x2229
        L_0x2252:
            r0 = 0
            goto L_0x2042
        L_0x2255:
            if (r3 == 0) goto L_0x2062
            java.lang.String r0 = r3.AvQ()
            r1.A04 = r0
            r3.B3H()
            goto L_0x2062
        L_0x2262:
            r0 = -567209142(0xffffffffde31134a, float:-3.18990588E18)
            int r4 = X.C14030oh.A03(r0)
            r0 = -73364864(0xfffffffffba08a80, float:-1.6671532E36)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r7 = r1.A00
            X.1Yr r7 = (X.C22591Yr) r7
            X.0i6 r8 = r7.A02
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
            X.2A6 r6 = r7.A01
            com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
            X.29J r0 = X.AnonymousClass29J.NAME
            r1.add((java.lang.Object) r0)
            X.10C r0 = r7.A03
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            boolean r0 = X.AnonymousClass3WG.A02(r0)
            if (r0 != 0) goto L_0x2292
            X.29J r0 = X.AnonymousClass29J.PROFILE_PHOTO
            r1.add((java.lang.Object) r0)
        L_0x2292:
            com.google.common.collect.ImmutableList r3 = r1.build()
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            X.218 r1 = X.AnonymousClass218.FACEBOOK
            r2.add((java.lang.Object) r1)
            X.10C r0 = r7.A03
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            boolean r0 = X.AnonymousClass3WG.A02(r0)
            if (r0 != 0) goto L_0x22ac
            r2.add((java.lang.Object) r1)
        L_0x22ac:
            com.google.common.collect.ImmutableList r0 = r2.build()
            X.AnonymousClass0wJ.A1N(r8, r6)
            X.AnonymousClass0wJ.A1Q(r3, r0)
            X.2A7 r1 = X.AnonymousClass2A7.A03
            java.util.Map r0 = X.C63243h6.A00(r3, r0)
            X.C63243h6.A01(r1, r6, r8, r0)
            r0 = 1
            X.C22591Yr.A01(r7, r0)
            r0 = -906451881(0xffffffffc9f8a457, float:-2036874.9)
            X.C14030oh.A0A(r0, r5)
            r0 = -1032684645(0xffffffffc2727b9b, float:-60.62071)
            goto L_0x3a4b
        L_0x22ce:
            r2 = 1207240706(0x47f50802, float:125456.016)
            int r4 = X.C14030oh.A03(r2)
            X.1T6 r0 = (X.AnonymousClass1T6) r0
            r2 = -1921583326(0xffffffff8d76f722, float:-7.610208E-31)
            int r5 = X.C14030oh.A03(r2)
            java.lang.Object r6 = r1.A00
            X.1sg r6 = (X.C27541sg) r6
            com.instagram.registration.model.RegFlowExtras r7 = r6.A00
            boolean r1 = r0.A00
            r7.A0r = r1
            if (r1 == 0) goto L_0x230f
            boolean r0 = r0.A01
            r7.A0u = r0
            int r3 = r6.A02
            int r0 = r6.A01
            int r2 = r0 + 1
            int r1 = r6.A00
            com.instagram.registration.model.UserBirthDate r0 = new com.instagram.registration.model.UserBirthDate
            r0.<init>(r3, r2, r1)
            r7.A03 = r0
            X.2AT r0 = X.AnonymousClass2AT.A08
            X.265 r0 = r0.A00
            r6.A03(r0)
        L_0x2304:
            r0 = 1759920181(0x68e64035, float:8.6986296E24)
            X.C14030oh.A0A(r0, r5)
            r0 = 2085590380(0x7c4f956c, float:4.3113443E36)
            goto L_0x3a4b
        L_0x230f:
            int r3 = r6.A02
            int r2 = r6.A01
            int r1 = r6.A00
            java.lang.String r0 = r7.A0J
            r6.A04(r0, r3, r2, r1)
            goto L_0x2304
        L_0x231b:
            r0 = -912196693(0xffffffffc9a0fbab, float:-1318773.4)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1206124291(0xffffffffb81c00fd, float:-3.719422E-5)
            int r8 = X.C14030oh.A03(r0)
            java.lang.Object r10 = r1.A00
            X.1ce r10 = (X.C23191ce) r10
            com.instagram.service.session.UserSession r9 = r10.A02
            X.265 r0 = X.AnonymousClass265.A07
            boolean r7 = X.AnonymousClass0wJ.A1Z(r9, r0)
            double r5 = X.C18200wM.A00()
            double r2 = X.AnonymousClass269.A00()
            X.0nS r1 = X.C13330nS.A02(r9)
            java.lang.String r0 = "save_additional_phone_success"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2679(0xa77, float:3.754E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.AnonymousClass0wJ.A1B(r1, r5, r2)
            X.C18180wK.A1A(r1, r2)
            java.lang.String r0 = "additional_contact"
            X.AnonymousClass269.A08(r1, r0)
            X.C63683i7.A08(r1)
            X.C63683i7.A09(r1, r9)
            X.C18180wK.A19(r1)
            r1.Bb4()
            X.C23191ce.A00(r10, r7)
            r0 = -1761795632(0xffffffff96fd21d0, float:-4.0895693E-25)
            X.C14030oh.A0A(r0, r8)
            r0 = 1844824036(0x6df5c7e4, float:9.508185E27)
            goto L_0x3a4b
        L_0x2372:
            r2 = -1381334484(0xffffffffadaa822c, float:-1.938457E-11)
            int r4 = X.C14030oh.A03(r2)
            X.1SQ r0 = (X.AnonymousClass1SQ) r0
            r2 = -1246381027(0xffffffffb5b5bc1d, float:-1.3540299E-6)
            int r8 = X.C14030oh.A03(r2)
            java.lang.String r2 = r0.A00
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.Object r9 = r1.A00
            X.1cj r9 = (X.AnonymousClass1cj) r9
            if (r2 != 0) goto L_0x23cb
            java.lang.String r7 = r0.A00
            r2 = 1
            com.facebook.redex.IDxCListenerShape20S1100000_1_I2 r6 = new com.facebook.redex.IDxCListenerShape20S1100000_1_I2
            r6.<init>((java.lang.String) r7, (java.lang.Object) r9, (int) r2)
            r2 = 124(0x7c, float:1.74E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r5 = X.C18220wO.A0O(r9, r2)
            android.content.Context r2 = r9.getContext()
            X.Dsm r3 = X.C18190wL.A0W(r2)
            r2 = 2131835970(0x7f113c42, float:1.9305094E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0o(r9, r7, r2)
            r3.A0p(r2)
            r2 = 2131838153(0x7f1144c9, float:1.9309521E38)
            r3.A0P(r6, r2)
            r2 = 2131831740(0x7f112bbc, float:1.9296514E38)
            r3.A0O(r5, r2)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x23bd:
            super.onSuccess(r0)
            r0 = -894326672(0xffffffffcab1a870, float:-5821496.0)
            X.C14030oh.A0A(r0, r8)
            r0 = -398960235(0xffffffffe8385995, float:-3.4822717E24)
            goto L_0x3a4b
        L_0x23cb:
            X.AnonymousClass1cj.A04(r9)
            goto L_0x23bd
        L_0x23cf:
            r0 = 915767275(0x36957feb, float:4.4554376E-6)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1419731700(0xffffffffab609d0c, float:-7.9798733E-13)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r1.A00
            X.1QZ r6 = (X.AnonymousClass1QZ) r6
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x23f9
            com.instagram.service.session.UserSession r0 = r6.A00
            X.3hk r5 = X.C63533hk.A02(r0)
            com.instagram.service.session.UserSession r0 = r6.A00
            java.lang.String r9 = r0.getUserId()
            r10 = 1
            java.lang.Integer r8 = X.AnonymousClass006.A03
            com.instagram.service.session.UserSession r7 = r6.A00
            r5.A0B(r6, r7, r8, r9, r10)
        L_0x23f9:
            android.view.View r0 = r6.requireView()
            X.C09860go.A0I(r0)
            X.AnonymousClass2S5.A00(r6)
            r0 = -1524618303(0xffffffffa5202bc1, float:-1.3892612E-16)
            X.C14030oh.A0A(r0, r2)
            r0 = -297046561(0xffffffffee4b6ddf, float:-1.5739571E28)
            goto L_0x3a4b
        L_0x240e:
            r2 = -523501296(0xffffffffe0cc0110, float:-1.1760039E20)
            int r19 = X.C14030oh.A03(r2)
            X.1RN r0 = (X.AnonymousClass1RN) r0
            r2 = -1441901326(0xffffffffaa0e54f2, float:-1.2641605E-13)
            int r6 = X.C14030oh.A03(r2)
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            X.37J r0 = r0.A01
            if (r0 == 0) goto L_0x3b7f
            java.util.List r2 = r0.A00
            if (r2 == 0) goto L_0x2540
            java.lang.Object r8 = r1.A00
            X.Iat r8 = (X.C34575Iat) r8
            X.0Oa r5 = r8.A09
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r5)
            X.0TJ r4 = X.AnonymousClass0TJ.A06
            r0 = 36602076368867115(0x82096500020f2b, double:3.2106387081786236E-306)
            int r10 = X.C63803iN.A01(r4, r3, r0)
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r5)
            r0 = 36602076368932652(0x82096500030f2c, double:3.2106387082200694E-306)
            int r0 = X.C63803iN.A01(r4, r3, r0)
            X.I7Z r9 = r8.A00
            if (r9 == 0) goto L_0x3b82
            r8 = 1
            r9.A05 = r8
            r9.A00 = r0
            java.util.Iterator r3 = r2.iterator()
            r1 = 0
        L_0x245a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x2487
            java.lang.Object r0 = r3.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0
            java.lang.Object r0 = r0.A00
            X.170 r0 = (X.AnonymousClass170) r0
            if (r0 == 0) goto L_0x245a
            java.util.List r0 = r0.A09
            if (r0 == 0) goto L_0x245a
            java.lang.Object r0 = r0.get(r7)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r0
            if (r0 == 0) goto L_0x245a
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x245a
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x245a
            int r1 = r1 + 1
            goto L_0x245a
        L_0x2487:
            int r5 = r1 + -1
            java.util.Iterator r18 = r2.iterator()
            r4 = 0
        L_0x248e:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x2538
            java.lang.Object r12 = r18.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r12
            java.lang.Object r11 = r12.A00
            X.170 r11 = (X.AnonymousClass170) r11
            if (r11 == 0) goto L_0x248e
            java.util.List r0 = r11.A09
            if (r0 == 0) goto L_0x248e
            java.lang.Object r0 = r0.get(r7)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r0
            if (r0 == 0) goto L_0x248e
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x248e
            boolean r0 = X.C18190wL.A1a(r2)
            if (r0 == 0) goto L_0x248e
            java.lang.String r1 = r12.A02
            if (r1 == 0) goto L_0x24c1
            java.util.ArrayList r0 = r9.A0B
            r0.add(r1)
        L_0x24c1:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r17 = r2.iterator()
            r13 = 0
        L_0x24ca:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x2529
            int r16 = r13 + 1
            java.lang.Object r2 = r17.next()
            X.172 r2 = (X.AnonymousClass172) r2
            com.instagram.user.model.User r14 = r2.A00
            if (r14 == 0) goto L_0x2505
            java.lang.String r15 = r2.A06
            if (r15 == 0) goto L_0x24e9
            java.util.HashMap r1 = r9.A0C
            java.lang.String r0 = r14.getId()
            r1.put(r0, r15)
        L_0x24e9:
            java.lang.Boolean r0 = r11.A03
            boolean r0 = X.C18190wL.A1Z(r0, r8)
            if (r0 == 0) goto L_0x250e
            java.util.HashMap r1 = r9.A0D
            java.lang.String r14 = r14.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x24fb:
            r1.put(r14, r0)
            if (r13 < r10) goto L_0x2508
            if (r4 == r5) goto L_0x2508
            r3.add(r2)
        L_0x2505:
            r13 = r16
            goto L_0x24ca
        L_0x2508:
            java.util.ArrayList r0 = r9.A0B
            r0.add(r2)
            goto L_0x2505
        L_0x250e:
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "From your contacts"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            java.util.HashMap r1 = r9.A0D
            java.lang.String r14 = r14.getId()
            if (r0 == 0) goto L_0x2524
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x24fb
        L_0x2524:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x24fb
        L_0x2529:
            boolean r0 = X.C18250wR.A1K(r3)
            if (r0 == 0) goto L_0x2534
            java.util.ArrayList r0 = r9.A0B
            r0.add(r3)
        L_0x2534:
            int r4 = r4 + 1
            goto L_0x248e
        L_0x2538:
            X.Iat r0 = r9.A09
            r0.A02(r7)
            r9.notifyDataSetChanged()
        L_0x2540:
            r0 = -2038137537(0xffffffff86847d3f, float:-4.9836914E-35)
            X.C14030oh.A0A(r0, r6)
            r1 = 1307296501(0x4debc2f5, float:4.94427808E8)
            r0 = r19
            X.C14030oh.A0A(r1, r0)
            return
        L_0x254f:
            r2 = 1608106661(0x5fd9c2a5, float:3.138257E19)
            int r4 = X.C14030oh.A03(r2)
            X.1RE r0 = (X.AnonymousClass1RE) r0
            r2 = -663383876(0xffffffffd87590bc, float:-1.08000791E15)
            int r3 = X.C14030oh.A03(r2)
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            X.33J r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            java.util.List r7 = r0.A00
            if (r7 == 0) goto L_0x2613
            java.lang.Object r0 = r1.A00
            X.Iat r0 = (X.C34575Iat) r0
            X.I7Z r6 = r0.A00
            if (r6 == 0) goto L_0x3b82
            java.util.Iterator r18 = r7.iterator()
        L_0x2577:
            boolean r0 = r18.hasNext()
            r12 = 0
            if (r0 == 0) goto L_0x260b
            java.lang.Object r1 = r18.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r1
            java.lang.String r10 = r1.A01
            java.lang.String r9 = "discover_accounts"
            boolean r0 = X.C04220Ms.A0I(r10, r9)
            if (r0 != 0) goto L_0x2595
            if (r10 == 0) goto L_0x2595
            java.util.ArrayList r0 = r6.A0B
            r0.add(r10)
        L_0x2595:
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x2577
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r17 = r0.iterator()
        L_0x25a3:
            boolean r0 = r17.hasNext()
            r11 = 1
            if (r0 == 0) goto L_0x25fe
            int r16 = r12 + 1
            java.lang.Object r2 = r17.next()
            X.18V r2 = (X.AnonymousClass18V) r2
            java.util.List r15 = r2.A01
            if (r15 == 0) goto L_0x25f5
            boolean r0 = X.C18190wL.A1a(r15)
            if (r0 == 0) goto L_0x25f5
            com.instagram.user.model.User r14 = r2.A00
            if (r14 == 0) goto L_0x25f5
            java.lang.Object r0 = r15.get(r5)
            X.BKU r0 = (X.BKU) r0
            X.Ffc r13 = r0.Aup()
            X.Ffc r0 = X.C28991Ffc.VIDEO
            r1 = 3
            if (r13 != r0) goto L_0x25d0
            r1 = 4
        L_0x25d0:
            int r0 = r15.size()
            if (r0 != r1) goto L_0x25f5
            java.lang.String r1 = r14.getId()
            if (r1 == 0) goto L_0x25e3
            if (r10 == 0) goto L_0x25e3
            java.util.HashMap r0 = r6.A0C
            r0.put(r1, r10)
        L_0x25e3:
            r0 = 3
            if (r12 < r0) goto L_0x25f8
            boolean r0 = X.C04220Ms.A0I(r10, r9)
            if (r0 != 0) goto L_0x25f8
            int r0 = r7.size()
            if (r0 == r11) goto L_0x25f8
            r8.add(r2)
        L_0x25f5:
            r12 = r16
            goto L_0x25a3
        L_0x25f8:
            java.util.ArrayList r0 = r6.A0B
            r0.add(r2)
            goto L_0x25f5
        L_0x25fe:
            boolean r0 = X.C18250wR.A1K(r8)
            if (r0 == 0) goto L_0x2577
            java.util.ArrayList r0 = r6.A0B
            r0.add(r8)
            goto L_0x2577
        L_0x260b:
            X.Iat r0 = r6.A09
            r0.A02(r5)
            r6.notifyDataSetChanged()
        L_0x2613:
            r0 = 675057294(0x283c8e8e, float:1.0467008E-14)
            X.C14030oh.A0A(r0, r3)
            r0 = 1181870277(0x4671e8c5, float:15482.192)
            goto L_0x3a4b
        L_0x261e:
            r2 = 652016919(0x26dcfd17, float:1.5334167E-15)
            int r4 = X.C14030oh.A03(r2)
            X.1Su r0 = (X.C21951Su) r0
            r2 = -1312379178(0xffffffffb1c6aed6, float:-5.782435E-9)
            int r2 = X.C14030oh.A03(r2)
            java.lang.Object r1 = r1.A00
            X.1ca r1 = (X.C23151ca) r1
            android.view.View r1 = r1.A02
            boolean r0 = r0.A00
            int r0 = X.C18190wL.A00(r0)
            r1.setVisibility(r0)
            r0 = 1779030087(0x6a09d847, float:4.1661045E25)
            X.C14030oh.A0A(r0, r2)
            r0 = 1892896272(0x70d34e10, float:5.2316567E29)
            goto L_0x3a4b
        L_0x2648:
            r2 = 1887326246(0x707e5026, float:3.1482434E29)
            int r4 = X.C14030oh.A03(r2)
            X.1T7 r0 = (X.AnonymousClass1T7) r0
            r2 = -271626780(0xffffffffefcf4de4, float:-1.2831512E29)
            int r7 = X.C14030oh.A03(r2)
            X.3FW r2 = r0.A00
            java.util.List r6 = r0.A01
            if (r2 == 0) goto L_0x2677
            java.lang.Object r0 = r1.A00
            X.1cg r0 = (X.C23201cg) r0
            java.util.List r1 = r0.A0N
            r1.clear()
            java.util.List r0 = r2.A02
            r1.addAll(r0)
        L_0x266c:
            r0 = -1036714489(0xffffffffc234fe07, float:-45.248074)
            X.C14030oh.A0A(r0, r7)
            r0 = 1823423709(0x6caf3cdd, float:1.6947955E27)
            goto L_0x3a4b
        L_0x2677:
            if (r6 == 0) goto L_0x266c
            java.lang.Object r5 = r1.A00
            X.1cg r5 = (X.C23201cg) r5
            X.0bf r3 = r5.A09
            java.lang.String r2 = "no_prototype_sent"
            X.2AT r0 = X.AnonymousClass2AT.A09
            X.265 r1 = r0.A00
            X.25r r0 = r5.A0F
            X.C63313hF.A04(r3, r0, r1, r2)
            java.util.List r0 = r5.A0M
            r0.clear()
            r0.addAll(r6)
            goto L_0x266c
        L_0x2693:
            r2 = -1352813392(0xffffffffaf5db4b0, float:-2.0164026E-10)
            int r4 = X.C14030oh.A03(r2)
            X.1iz r0 = (X.C24541iz) r0
            r2 = 1269622968(0x4bace8b8, float:2.2663536E7)
            int r7 = X.C14030oh.A03(r2)
            super.onSuccess(r0)
            if (r0 != 0) goto L_0x26b3
            r0 = -1915687343(0xffffffff8dd0ee51, float:-1.2876362E-30)
        L_0x26ab:
            X.C14030oh.A0A(r0, r7)
            r0 = -1246106990(0xffffffffb5b9ea92, float:-1.3851843E-6)
            goto L_0x3a4b
        L_0x26b3:
            X.34s r2 = r0.A00
            if (r2 == 0) goto L_0x26c6
            java.lang.String r5 = r2.A00
            if (r5 == 0) goto L_0x26c6
            java.lang.Object r3 = r1.A00
            X.1b5 r3 = (X.AnonymousClass1b5) r3
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r3.A02
            if (r2 == 0) goto L_0x26c6
            X.C18230wP.A1J(r3, r2, r5)
        L_0x26c6:
            java.lang.Object r8 = r1.A00
            X.1b5 r8 = (X.AnonymousClass1b5) r8
            android.widget.TextView r1 = r8.A00
            if (r1 == 0) goto L_0x26fe
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x26fe
            r1 = 18299635877611288(0x41036c00010718, double:1.8927998744080507E-307)
            X.0ea r1 = X.C08960ea.A00(r1)
            java.lang.Object r1 = r1.A02()
            X.C04220Ms.A06(r1)
            boolean r1 = X.AnonymousClass0wJ.A1X(r1)
            if (r1 != 0) goto L_0x26fe
            java.lang.String r0 = r0.A01
            r8.A06 = r0
            android.widget.TextView r3 = r8.A00
            android.content.Context r2 = r8.requireContext()
            r1 = 2131824547(0x7f110fa3, float:1.9281925E38)
            java.lang.String r0 = r8.A06
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r2, r0, r1)
            r3.setText(r0)
        L_0x26fe:
            X.0i6 r6 = r8.A01
            java.lang.String r5 = "sign_up_with_biz_option"
            java.lang.String r3 = r8.A04
            java.lang.String r2 = r8.A05
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            X.0rn r1 = X.C34512Jv.A00(r0)
            X.C18250wR.A19(r1, r5)
            java.lang.String r0 = "entry_point"
            r1.A0D(r0, r3)
            java.lang.String r0 = "page_id"
            r1.A0D(r0, r2)
            if (r6 == 0) goto L_0x2722
            X.C18180wK.A1K(r1, r6)
            r0 = 101507868(0x60ce31c, float:2.6497927E-35)
            goto L_0x26ab
        L_0x2722:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x2727:
            r2 = -856885479(0xffffffffccecf719, float:-1.24238024E8)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -1153136848(0xffffffffbb448730, float:-0.0029987805)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r3 = r1.A00
            X.47j r3 = (X.C692247j) r3
            X.0gL r2 = r3.A04
            X.4Ro r1 = new X.4Ro
            r1.<init>(r0, r3)
            r2.execute(r1)
            r0 = -592804385(0xffffffffdcaa85df, float:-3.83983511E17)
            X.C14030oh.A0A(r0, r5)
            r0 = -1279216588(0xffffffffb3c0b434, float:-8.9734755E-8)
            goto L_0x3a4b
        L_0x2750:
            r2 = 1141310468(0x44070404, float:540.06274)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -151866028(0xfffffffff6f2b554, float:-2.4613547E33)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r3 = r1.A00
            X.47j r3 = (X.C692247j) r3
            X.0gL r2 = r3.A04
            X.4Rp r1 = new X.4Rp
            r1.<init>(r0, r3)
            r2.execute(r1)
            r0 = 1492619617(0x58f79161, float:2.17763016E15)
            X.C14030oh.A0A(r0, r5)
            r0 = 1915835950(0x7231562e, float:3.512514E30)
            goto L_0x3a4b
        L_0x2779:
            r2 = -1234237497(0xffffffffb66f07c7, float:-3.5618302E-6)
            int r2 = X.C14030oh.A03(r2)
            X.1Ti r0 = (X.C22091Ti) r0
            r3 = 1875112050(0x6fc3f072, float:1.21280515E29)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r4 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r4
            com.instagram.service.session.UserSession r1 = r4.A04
            X.Dnj r1 = X.AnonymousClass6VR.A00(r1)
            com.instagram.user.model.User r0 = r0.A00
            r1.A04(r0)
            com.instagram.user.model.User r0 = r4.A05
            java.lang.String r5 = r0.BK7()
            java.lang.Class<X.3hs> r1 = X.C63593hs.class
            monitor-enter(r1)
            X.3Eq r0 = X.C63593hs.A03     // Catch:{ all -> 0x281e }
            r0.A00(r5)     // Catch:{ all -> 0x281e }
            monitor-exit(r1)
            com.instagram.service.session.UserSession r0 = r4.A04
            X.3hk r8 = X.C63533hk.A02(r0)
            com.instagram.user.model.User r7 = r4.A05
            java.util.List r0 = r8.A07()
            java.util.Iterator r6 = r0.iterator()
        L_0x27b7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x27da
            X.3ac r5 = X.C18250wR.A0Q(r6)
            java.lang.String r1 = r5.A05
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x27b7
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x27b7
            X.3ac r0 = new X.3ac
            r0.<init>(r7, r1)
            r8.A0F(r0)
            goto L_0x27b7
        L_0x27da:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x27e9
            com.instagram.service.session.UserSession r0 = r4.A04
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.C63873iU.A0H(r1, r0)
        L_0x27e9:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A01
            if (r0 == 0) goto L_0x27ff
            java.lang.String r6 = "profile_completion"
            r8 = 0
            java.lang.String r7 = r4.A06
            X.JrQ r5 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Bdx(r5)
        L_0x27ff:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x281a
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x281a
            r0 = 0
            r4.A09 = r0
            r1.onBackPressed()
            r0 = 552399341(0x20ecf1ed, float:4.0140048E-19)
        L_0x2812:
            X.C14030oh.A0A(r0, r3)
            r0 = -29090415(0xfffffffffe441d91, float:-6.517055E37)
            goto L_0x3bb6
        L_0x281a:
            r0 = -1795376210(0xffffffff94fcbbae, float:-2.5519524E-26)
            goto L_0x2812
        L_0x281e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x2821:
            r2 = -963378082(0xffffffffc694045e, float:-18946.184)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = -1908125289(0xffffffff8e445197, float:-2.419815E-30)
            int r4 = X.C14030oh.A03(r3)
            X.3DU r3 = r0.A00
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r0 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r0
            java.lang.Object r0 = r0.A03
            X.3D9 r0 = (X.AnonymousClass3D9) r0
            r0.A01 = r3
            r0 = -1434918117(0xffffffffaa78e31b, float:-2.2105618E-13)
            X.C14030oh.A0A(r0, r4)
            r0 = -950209734(0xffffffffc75cf33a, float:-56563.227)
            goto L_0x3bb6
        L_0x2848:
            r2 = -1889234088(0xffffffff8f649358, float:-1.1269645E-29)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = 1138455021(0x43db71ed, float:438.89005)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r1 = r1.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.3DU r0 = r0.A00
            r1.invoke(r0)
            r0 = 1405440573(0x53c5523d, float:1.69497657E12)
            X.C14030oh.A0A(r0, r3)
            r0 = 1819960969(0x6c7a6689, float:1.21086265E27)
            goto L_0x3bb6
        L_0x286c:
            r1 = -1584595835(0xffffffffa18cfc85, float:-9.55361E-19)
            int r2 = X.C14030oh.A03(r1)
            X.1Qx r0 = (X.C21461Qx) r0
            r1 = 1350870836(0x5084a734, float:1.78044027E10)
            int r4 = X.C14030oh.A03(r1)
            if (r0 == 0) goto L_0x2892
            X.333 r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x2892
            X.0on r3 = X.C10770iu.A00()
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "push_event_test_ig_user_session_server_canary_test.bool"
            X.C18250wR.A13(r3, r0, r1)
        L_0x2892:
            r0 = 1084390961(0x40a27e31, float:5.077904)
            X.C14030oh.A0A(r0, r4)
            r0 = -940624560(0xffffffffc7ef3550, float:-122474.625)
            goto L_0x3bb6
        L_0x289d:
            r0 = 299365222(0x11d7f366, float:3.4071025E-28)
            int r2 = X.C14030oh.A03(r0)
            r0 = -583021364(0xffffffffdd3fcccc, float:-8.6379035E17)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.4Hb r0 = (X.C70984Hb) r0
            android.content.Context r3 = r0.A00
            r0 = 2131835593(0x7f113ac9, float:1.9304329E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            X.0z7 r0 = X.C19080z7.A00(r3, r1, r0)
            r0.show()
            r0 = -1341345776(0xffffffffb00cb010, float:-5.1181903E-10)
            X.C14030oh.A0A(r0, r4)
            r0 = 804173973(0x2feeb895, float:4.34231E-10)
            goto L_0x3bb6
        L_0x28cb:
            r0 = -693319461(0xffffffffd6acc8db, float:-9.4989334E13)
            int r2 = X.C14030oh.A03(r0)
            r0 = 2038690216(0x7983f1a8, float:8.563653E34)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.4Hc r0 = (X.C70994Hc) r0
            android.content.Context r5 = r0.A00
            r4 = 2131825776(0x7f111470, float:1.9284418E38)
            r0 = 2131232441(0x7f0806b9, float:1.8080991E38)
            android.graphics.drawable.Drawable r3 = r5.getDrawable(r0)
            X.3iD r1 = X.C63733iD.A01()
            X.22b r0 = X.AnonymousClass22b.CIRCULAR
            r1.A0E(r0)
            X.C63733iD.A07(r5, r1, r4)
            r1.A0C()
            if (r3 == 0) goto L_0x28fd
            X.C63733iD.A05(r5, r3, r1)
        L_0x28fd:
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r1)
            r0 = -1273557919(0xffffffffb4170c61, float:-1.4067474E-7)
            X.C14030oh.A0A(r0, r6)
            r0 = 1590186623(0x5ec8527f, float:7.2173697E18)
            goto L_0x3bb6
        L_0x290d:
            r2 = -1944906480(0xffffffff8c131510, float:-1.1330806E-31)
            int r4 = X.C14030oh.A03(r2)
            X.4vo r0 = (X.C85814vo) r0
            r2 = -1345727567(0xffffffffafc9d3b1, float:-3.6712103E-10)
            int r3 = X.C14030oh.A03(r2)
            java.lang.String r2 = r0.getFeedbackTitle()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x2931
            java.lang.String r2 = r0.getFeedbackMessage()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x2962
        L_0x2931:
            java.lang.Object r1 = r1.A00
            X.4JH r1 = (X.AnonymousClass4JH) r1
            android.content.Context r1 = r1.A00
            X.Dsm r2 = X.C18190wL.A0W(r1)
            X.C18180wK.A1M(r2)
            java.lang.String r1 = r0.getFeedbackTitle()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x294e
            java.lang.String r1 = r0.getFeedbackTitle()
            r2.A02 = r1
        L_0x294e:
            java.lang.String r1 = r0.getFeedbackMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x295f
            java.lang.String r0 = r0.getFeedbackMessage()
            r2.A0p(r0)
        L_0x295f:
            X.AnonymousClass0wJ.A1K(r2)
        L_0x2962:
            r0 = -1922898820(0xffffffff8d62e47c, float:-6.9916655E-31)
            X.C14030oh.A0A(r0, r3)
            r0 = 511493074(0x1e7cc3d2, float:1.3381264E-20)
            goto L_0x3a4b
        L_0x296d:
            r2 = 1890489082(0x70ae92fa, float:4.322246E29)
            int r2 = X.C14030oh.A03(r2)
            X.1Ta r0 = (X.C22011Ta) r0
            r3 = 302949011(0x120ea293, float:4.500769E-28)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A00
            X.4JI r1 = (X.AnonymousClass4JI) r1
            android.content.Context r1 = r1.A00
            X.Dsm r3 = X.C18190wL.A0W(r1)
            java.lang.String r1 = r0.A01
            r3.A02 = r1
            java.lang.String r0 = r0.A00
            r3.A0p(r0)
            X.C18180wK.A1M(r3)
            X.AnonymousClass0wJ.A1K(r3)
            r0 = -993272214(0xffffffffc4cbde6a, float:-1630.9504)
            X.C14030oh.A0A(r0, r4)
            r0 = 162556257(0x9b06961, float:4.2469557E-33)
            goto L_0x3bb6
        L_0x29a1:
            r0 = 889689906(0x35079732, float:5.051144E-7)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1328284411(0xffffffffb0d3fd05, float:-1.5424183E-9)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r1.A00
            X.4JP r1 = (X.AnonymousClass4JP) r1
            r0 = 7
            com.facebook.redex.IDxCBackShape392S0100000_1_I2 r5 = new com.facebook.redex.IDxCBackShape392S0100000_1_I2
            r5.<init>(r1, r0)
            X.3iD r4 = X.C63733iD.A01()
            android.content.Context r3 = r1.A00
            r0 = 2131825940(0x7f111514, float:1.928475E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            android.text.Spanned r0 = android.text.Html.fromHtml(r1, r0)
            r4.A0A = r0
            r4.A0C()
            X.22c r0 = X.C306022c.DEFAULT
            r4.A0F(r0)
            r0 = 1
            r4.A0I = r0
            r0 = 2131825939(0x7f111513, float:1.9284748E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r3, r0)
            r4.A0D = r0
            r4.A07 = r5
            X.C63733iD.A0A(r4)
            r0 = -1384677123(0xffffffffad7780fd, float:-1.4068966E-11)
            X.C14030oh.A0A(r0, r6)
            r0 = -460575227(0xffffffffe48c2e05, float:-2.0686882E22)
            goto L_0x3bb6
        L_0x29f1:
            r2 = 180326302(0xabf8f9e, float:1.8446654E-32)
            int r4 = X.C14030oh.A03(r2)
            X.64g r0 = (X.C963064g) r0
            r2 = 1850254432(0x6e48a460, float:1.552393E28)
            int r5 = X.C14030oh.A03(r2)
            X.Lct r2 = X.C40337Lct.A10
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = r2.A00
            java.util.List r2 = r0.A00(r10)
            if (r2 == 0) goto L_0x2aea
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x2aea
            r6 = 0
            java.lang.Object r9 = r2.get(r6)
            X.3Cq r9 = (X.C57833Cq) r9
            java.lang.Long r0 = r9.A03
            if (r0 == 0) goto L_0x2ae6
            long r2 = r0.longValue()
        L_0x2a20:
            X.38p r0 = r9.A01
            if (r0 == 0) goto L_0x2adf
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L_0x2adf
            long r2 = r0.longValue()
        L_0x2a2c:
            X.3GI r12 = r9.A02
            X.3XY r8 = X.AnonymousClass3XY.A01()
            java.lang.Object r0 = r1.A00
            X.1ZC r0 = (X.AnonymousClass1ZC) r0
            com.instagram.service.session.UserSession r1 = r0.A01
            java.lang.String r7 = r1.getUserId()
            java.lang.String r1 = r12.A05
            X.3Ye r13 = X.AnonymousClass3XY.A00(r8, r7, r1)
            if (r13 != 0) goto L_0x2a51
            com.instagram.service.session.UserSession r1 = r0.A01
            java.lang.String r7 = r1.getUserId()
            java.lang.String r1 = r12.A05
            X.3Ye r13 = new X.3Ye
            r13.<init>(r7, r1, r2)
        L_0x2a51:
            com.instagram.service.session.UserSession r1 = r0.A01
            java.lang.String r14 = r1.getUserId()
            java.util.List r1 = r12.A06
            r1.getClass()
            java.lang.Object r11 = r1.get(r6)
            X.1tt r11 = (X.C28221tt) r11
            int r15 = r9.A00
            boolean r1 = r9.A04
            r16 = 0
            r20 = r16
            r22 = r6
            r23 = r1
            r18 = r2
            X.1u0 r13 = X.C36802Ss.A00(r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r23)
            android.view.View r1 = r0.mView
            if (r1 == 0) goto L_0x2ac9
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x2ac9
            X.3Vz r3 = X.C36622Sa.A00()
            android.content.Context r2 = r0.getContext()
            com.instagram.service.session.UserSession r1 = r0.A01
            android.view.View r7 = r0.mView
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            com.instagram.quickpromotion.intf.QuickPromotionSlot r11 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0c
            X.1tr r6 = new X.1tr
            r8 = r0
            r9 = r0
            r10 = r0
            r12 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.1gt r9 = r3.A06(r2, r0, r6, r1)
            X.3Gy r1 = r13.A09
            java.lang.String r2 = r1.A00
            X.1tt r1 = r13.A08
            X.35h r1 = r1.A04
            if (r1 == 0) goto L_0x2ad4
            X.5zj r1 = r1.A00
            if (r1 == 0) goto L_0x2ad4
            r1.A01()
            r10 = 3
        L_0x2aad:
            r11 = 0
            android.view.View r12 = r0.mView
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r14 = r11
            android.view.View r1 = r9.getView(r10, r11, r12, r13, r14)
            r0.A00 = r1
            android.view.View r2 = r0.mView
            r1 = 2131305080(0x7f092278, float:1.822832E38)
            android.view.ViewGroup r1 = X.C18240wQ.A0G(r2, r1)
            if (r1 == 0) goto L_0x2ac9
            android.view.View r0 = r0.A00
            r1.addView(r0)
        L_0x2ac9:
            r0 = 534603307(0x1fdd662b, float:9.3766163E-20)
        L_0x2acc:
            X.C14030oh.A0A(r0, r5)
            r0 = -2146534797(0xffffffff800e7a73, float:-1.329623E-39)
            goto L_0x3a4b
        L_0x2ad4:
            java.lang.String r1 = "condensed_megaphone"
            boolean r1 = r1.equals(r2)
            boolean r10 = X.C18180wK.A1V(r1)
            goto L_0x2aad
        L_0x2adf:
            long r7 = X.C18180wK.A04()
            long r2 = r2 + r7
            goto L_0x2a2c
        L_0x2ae6:
            r2 = 0
            goto L_0x2a20
        L_0x2aea:
            r0 = 1800465496(0x6b50ec58, float:2.5257267E26)
            goto L_0x2acc
        L_0x2aee:
            r2 = 2071121776(0x7b72cf70, float:1.2607432E36)
            int r2 = X.C14030oh.A03(r2)
            X.4K4 r0 = (X.AnonymousClass4K4) r0
            r3 = -764799264(0xffffffffd26a16e0, float:-2.51351532E11)
            int r5 = X.C14030oh.A03(r3)
            java.util.List r0 = r0.getItems()
            java.util.Iterator r4 = r0.iterator()
        L_0x2b06:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x2b15
            com.instagram.user.model.User r3 = X.C18220wO.A0c(r4)
            r0 = 1
            r3.A2I(r0)
            goto L_0x2b06
        L_0x2b15:
            java.lang.Object r0 = r1.A00
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r0 = (com.instagram.reels.dashboard.fragment.ReelDashboardFragment) r0
            X.8tz r0 = r0.mListAdapter
            if (r0 == 0) goto L_0x2b20
            r0.A05()
        L_0x2b20:
            r0 = -575023620(0xffffffffddb9d5fc, float:-1.67386077E18)
            X.C14030oh.A0A(r0, r5)
            r0 = 1823074200(0x6ca9e798, float:1.643217E27)
            goto L_0x3bb6
        L_0x2b2b:
            r2 = 956063506(0x38fc5f12, float:1.20340046E-4)
            int r2 = X.C14030oh.A03(r2)
            X.1ST r0 = (X.AnonymousClass1ST) r0
            r3 = -1012640353(0xffffffffc3a4559f, float:-328.6689)
            int r6 = X.C14030oh.A03(r3)
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            java.lang.Object r4 = r1.A00
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r3 = r4.getResources()
            r1 = 2131689473(0x7f0f0001, float:1.9007962E38)
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            java.lang.String r1 = r3.getQuantityString(r1, r0)
            r0 = 0
            X.C63813iO.A02(r4, r1, r0, r5)
            r0 = -1821213707(0xffffffff93727bf5, float:-3.060581E-27)
            X.C14030oh.A0A(r0, r6)
            r0 = 695612160(0x29763300, float:5.4667208E-14)
            goto L_0x3bb6
        L_0x2b63:
            r2 = -472631013(0xffffffffe3d4391b, float:-7.829649E21)
            int r4 = X.C14030oh.A03(r2)
            X.1Te r0 = (X.C22051Te) r0
            r2 = 1724381383(0x66c7f8c7, float:4.7217003E23)
            int r3 = X.C14030oh.A03(r2)
            java.lang.Object r5 = r1.A00
            X.4AX r5 = (X.AnonymousClass4AX) r5
            com.instagram.service.session.UserSession r6 = r5.A0E
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            java.lang.String r7 = r0.A03
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r1)
            java.lang.String r1 = "reel_message_prefs"
            X.C18180wK.A0v(r2, r1, r7)
            java.lang.Boolean r2 = r0.A02
            if (r2 == 0) goto L_0x2b9d
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            boolean r7 = r2.booleanValue()
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r1)
            java.lang.String r1 = "auto_save_reel_media_to_gallery"
            X.AnonymousClass0wJ.A13(r2, r1, r7)
        L_0x2b9d:
            X.1SL r1 = r0.A00
            java.util.List r1 = r1.A00
            int r1 = r1.size()
            r5.A00 = r1
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r6)
            int r1 = r5.A00
            boolean r1 = X.C18180wK.A1X(r1)
            X.MeW r2 = r2.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.Cls(r1)
            X.1SM r1 = r0.A01
            if (r1 != 0) goto L_0x2be9
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L_0x2bc0:
            if (r1 == 0) goto L_0x2bc8
            int r1 = r1.size()
            r5.A01 = r1
        L_0x2bc8:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r5.A08 = r1
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            boolean r2 = r0.A04
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r1)
            java.lang.String r0 = "allow_story_reshare"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            X.AnonymousClass4AX.A04(r5)
            r0 = 1025800498(0x3d247932, float:0.040154643)
            X.C14030oh.A0A(r0, r3)
            r0 = 488156129(0x1d18abe1, float:2.0205892E-21)
            goto L_0x3a4b
        L_0x2be9:
            java.util.List r1 = r1.A00
            goto L_0x2bc0
        L_0x2bec:
            r2 = -986761031(0xffffffffc52f38b9, float:-2803.5452)
            int r2 = X.C14030oh.A03(r2)
            r3 = -2107714820(0xffffffff825ed2fc, float:-1.6370534E-37)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r0 = r1.A00
            X.4AX r0 = (X.AnonymousClass4AX) r0
            X.AnonymousClass4AX.A04(r0)
            r0 = 1194530315(0x4733160b, float:45846.043)
            X.C14030oh.A0A(r0, r3)
            r0 = 833825914(0x31b32c7a, float:5.214642E-9)
            goto L_0x3bb6
        L_0x2c0f:
            r2 = 1391719174(0x52f3f306, float:5.23877155E11)
            int r2 = X.C14030oh.A03(r2)
            X.4K4 r0 = (X.AnonymousClass4K4) r0
            r3 = 506867470(0x1e362f0e, float:9.6447305E-21)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A00
            X.1cN r1 = (X.AnonymousClass1cN) r1
            X.1fU r3 = r1.A02
            java.util.List r1 = r0.getItems()
            java.util.List r0 = r3.A05
            r0.clear()
            r0.addAll(r1)
            X.AnonymousClass1fU.A00(r3)
            r0 = -992861251(0xffffffffc4d223bd, float:-1681.1168)
            X.C14030oh.A0A(r0, r4)
            r0 = 567762961(0x21d76011, float:1.4594395E-18)
            goto L_0x3bb6
        L_0x2c3f:
            r0 = 2103234310(0x7d5ccf06, float:1.8344068E37)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1625714165(0xffffffff9f19920b, float:-3.2519814E-20)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r1.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r1.invoke(r0)
            r0 = -1314700113(0xffffffffb1a344af, float:-4.751733E-9)
            X.C14030oh.A0A(r0, r3)
            r0 = 2079090449(0x7bec6711, float:2.454945E36)
            goto L_0x3bb6
        L_0x2c63:
            r2 = -1273215348(0xffffffffb41c468c, float:-1.4554297E-7)
            int r2 = X.C14030oh.A03(r2)
            X.1Ty r0 = (X.C22241Ty) r0
            r3 = -259814877(0xfffffffff0838a23, float:-3.2567627E29)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r1 = r1.A00
            X.8n9 r1 = (X.C146958n9) r1
            com.instagram.user.model.User r0 = r0.A01
            X.1jA r0 = X.AnonymousClass1jA.A00(r0)
            r1.resumeWith(r0)
            r0 = -459156693(0xffffffffe4a1d32b, float:-2.3881136E22)
            X.C14030oh.A0A(r0, r3)
            r0 = 693647886(0x29583a0e, float:4.801199E-14)
            goto L_0x3bb6
        L_0x2c8b:
            r2 = -1462736181(0xffffffffa8d06acb, float:-2.3138953E-14)
            int r4 = X.C14030oh.A03(r2)
            X.1TR r0 = (X.AnonymousClass1TR) r0
            r2 = 200700792(0xbf67378, float:9.492949E-32)
            int r5 = X.C14030oh.A03(r2)
            boolean r2 = r0.A02
            java.lang.Object r3 = r1.A00
            X.1cm r3 = (X.C23211cm) r3
            if (r2 == 0) goto L_0x2cce
            r2 = 1
            r3.A0F = r2
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r3.A0A
            r0.setShowProgressBar(r2)
            android.os.Handler r1 = r3.A00
            java.lang.Runnable r0 = r3.A0J
            r1.removeCallbacks(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r3.A04
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r3.A0B
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            r1.A0Z = r0
            com.instagram.registration.model.RegFlowExtras r0 = r3.A04
            r0.A0t = r2
            X.C23211cm.A03(r3)
        L_0x2cc3:
            r0 = 1526907498(0x5b02c26a, float:3.6805507E16)
            X.C14030oh.A0A(r0, r5)
            r0 = 1668010688(0x636bd2c0, float:4.350171E21)
            goto L_0x3a4b
        L_0x2cce:
            java.lang.String r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r3.Cth(r1, r0)
            goto L_0x2cc3
        L_0x2cd6:
            r2 = -958565169(0xffffffffc6dd74cf, float:-28346.404)
            int r2 = X.C14030oh.A03(r2)
            X.1Sh r0 = (X.C21821Sh) r0
            r3 = 898272180(0x358a8bb4, float:1.032246E-6)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r1.A00
            X.1x0 r3 = (X.AnonymousClass1x0) r3
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r0.A00
            boolean r0 = r1.equals(r0)
            r3.A0A = r0
            r0 = -467312321(0xffffffffe425613f, float:-1.220288E22)
            X.C14030oh.A0A(r0, r4)
            r0 = 2119988194(0x7e5c73e2, float:7.3257964E37)
            goto L_0x3bb6
        L_0x2cff:
            r2 = -2078660224(0xffffffff841a2980, float:-1.8121669E-36)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -362571914(0xffffffffea639776, float:-6.8785354E25)
            int r3 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r0 = r0.A01
            X.4uV r0 = (X.C85094uV) r0
            if (r0 == 0) goto L_0x2d43
            X.4vS r2 = r0.AkS()
            if (r2 == 0) goto L_0x2d43
            java.lang.Object r1 = r1.A00
            X.1wh r1 = (X.C29081wh) r1
            java.lang.String r0 = r2.APk()
            r1.A02 = r0
            X.4vR r0 = r2.AOM()
            r1.A00 = r0
            boolean r0 = r2.BBP()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.C29081wh.A0B(r1)
            r0 = 353369386(0x150ffd2a, float:2.907833E-26)
        L_0x2d3b:
            X.C14030oh.A0A(r0, r3)
            r0 = 784369100(0x2ec085cc, float:8.754916E-11)
            goto L_0x3a4b
        L_0x2d43:
            r0 = -1983619509(0xffffffff89c45e4b, float:-4.7273956E-33)
            goto L_0x2d3b
        L_0x2d47:
            r2 = 1250043882(0x4a8227ea, float:4264949.0)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = 1424100647(0x54e20d27, float:7.7670661E12)
            int r6 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r5 = r0.A01
            X.4vB r5 = (X.C85434vB) r5
            if (r5 != 0) goto L_0x2d68
            r0 = -1097993305(0xffffffffbe8df3a7, float:-0.27724954)
        L_0x2d60:
            X.C14030oh.A0A(r0, r6)
            r0 = -559608258(0xffffffffdea50e3e, float:-5.9467559E18)
            goto L_0x3a4b
        L_0x2d68:
            X.4vZ r3 = r5.BMa()
            r2 = 1
            if (r3 == 0) goto L_0x2d7f
            boolean r0 = r3.BO5()
            if (r0 != r2) goto L_0x2d7f
            java.lang.Object r2 = r1.A00
            X.1wh r2 = (X.C29081wh) r2
            boolean r0 = r3.Apl()
            r2.A04 = r0
        L_0x2d7f:
            java.lang.Object r1 = r1.A00
            X.1wh r1 = (X.C29081wh) r1
            java.lang.String r0 = r5.Akg()
            r1.A03 = r0
            X.C29081wh.A0B(r1)
            r0 = 1463634976(0x573d4c20, float:2.08134652E14)
            goto L_0x2d60
        L_0x2d90:
            r2 = -1005569457(0xffffffffc4103a4f, float:-576.9111)
            int r2 = X.C14030oh.A03(r2)
            X.1UD r0 = (X.AnonymousClass1UD) r0
            r3 = 1595855516(0x5f1ed29c, float:1.1444381E19)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r5 = r1.A00
            X.3Vj r5 = (X.C61783Vj) r5
            com.instagram.user.model.User r3 = X.D5D.A00(r0)
            r3.getClass()
            com.instagram.service.session.UserSession r1 = r5.A07
            X.C62423Zt.A02(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A03
            java.lang.String r7 = "switch_back"
            r10 = 0
            java.lang.String r8 = "setting"
            java.lang.String r9 = "switch_back_button"
            X.JrQ r6 = new X.JrQ
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Bdx(r6)
            X.C18210wN.A1J(r1, r3)
            r3.A1t(r1)
            X.1tl r0 = X.AnonymousClass3WS.A01(r1)
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "show_business_welcome_dialog"
            X.AnonymousClass0wJ.A13(r1, r0, r3)
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.4Q2 r0 = new X.4Q2
            r0.<init>(r5)
            r1.post(r0)
            X.IcN r3 = r5.A02
            boolean r0 = r3 instanceof X.C29201xU
            if (r0 == 0) goto L_0x2dfc
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.1xU r3 = (X.C29201xU) r3
            r3.getClass()
            X.4Q3 r0 = new X.4Q3
            r0.<init>(r3)
            r1.post(r0)
        L_0x2dfc:
            r0 = -1944252496(0xffffffff8c1d0fb0, float:-1.2099561E-31)
            X.C14030oh.A0A(r0, r4)
            r0 = -1185736415(0xffffffffb9531921, float:-2.013189E-4)
            goto L_0x3bb6
        L_0x2e07:
            r2 = -1278883624(0xffffffffb3c5c8d8, float:-9.2100606E-8)
            int r2 = X.C14030oh.A03(r2)
            X.1SS r0 = (X.AnonymousClass1SS) r0
            r3 = 1523131986(0x5ac92652, float:2.8309302E16)
            int r5 = X.C14030oh.A03(r3)
            java.lang.String r3 = r0.A00
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape267S0100000_1_I2) r0
            java.lang.Object r4 = r0.A00
            X.1wj r4 = (X.C29101wj) r4
            com.instagram.user.model.User r1 = r4.A02
            java.lang.String r0 = "READY"
            boolean r0 = r3.equals(r0)
            X.MeW r1 = r1.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.ClZ(r0)
            com.instagram.service.session.UserSession r0 = r4.A01
            X.KHq r3 = X.AnonymousClass3LY.A00(r0)
            com.instagram.user.model.User r0 = r4.A02
            java.lang.String r1 = r0.getId()
            X.46N r0 = new X.46N
            r0.<init>(r1)
            r3.CWx(r0)
            r0 = -1253900108(0xffffffffb54300b4, float:-7.2644184E-7)
            X.C14030oh.A0A(r0, r5)
            r0 = 1730823298(0x672a4482, float:8.0406605E23)
            goto L_0x3bb6
        L_0x2e51:
            r2 = 1895526291(0x70fb6f93, float:6.2252498E29)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -1031817995(0xffffffffc27fb4f5, float:-63.926716)
            int r2 = X.C14030oh.A03(r2)
            java.lang.Object r5 = r1.A00
            X.1wV r5 = (X.AnonymousClass1wV) r5
            java.lang.Object r8 = r0.A01
            if (r8 == 0) goto L_0x2ea7
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            java.lang.Class<com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl$FetchIGUser> r7 = com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl.FetchIGUser.class
            java.lang.String r6 = "fetch__IGUser(igid:$user_id)"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r6, r7)
            if (r0 == 0) goto L_0x2ea7
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r6, r7)
            java.lang.Class<com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl$FetchIGUser$UserAvatar> r3 = com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl.FetchIGUser.UserAvatar.class
            java.lang.String r1 = "user_avatar"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r3)
            if (r0 == 0) goto L_0x2ea7
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r6, r7)
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r1, r3)
            java.lang.String r0 = "is_public"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 == 0) goto L_0x2ea7
            com.instagram.service.session.UserSession r6 = r5.A02
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325841252132123(0x810e290000251b, double:3.03594650804588E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r3, r6, r0)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x2ea8
        L_0x2ea7:
            r0 = 0
        L_0x2ea8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            X.3aX r6 = r5.A03
            boolean r11 = r0.booleanValue()
            java.lang.String r7 = r5.A04
            r9 = 1
            r10 = r9
            r6.A03(r7, r8, r9, r10, r11)
            r5.setItems(r8)
            r0 = -192163984(0xfffffffff48bcf70, float:-8.861531E31)
            X.C14030oh.A0A(r0, r2)
            r0 = -1338818179(0xffffffffb033417d, float:-6.5212885E-10)
            goto L_0x3a4b
        L_0x2ecb:
            r2 = 1939835944(0x739f8c28, float:2.5281308E31)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -1991585389(0xffffffff894ad193, float:-2.4413407E-33)
            int r5 = X.C14030oh.A03(r3)
            if (r0 == 0) goto L_0x2f02
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x2f02
            X.4uX r4 = (X.C85114uX) r4
            X.4uW r0 = r4.AkT()
            if (r0 == 0) goto L_0x2f02
            java.lang.Object r3 = r1.A00
            X.1wV r3 = (X.AnonymousClass1wV) r3
            X.4uW r0 = r4.AkT()
            java.lang.String r0 = r0.Ans()
            r3.A04 = r0
            r0 = 142(0x8e, float:1.99E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r1 = X.C63873iU.A06(r3, r0)
            X.3EF r0 = r3.A01
            r0.A00(r1)
        L_0x2f02:
            r0 = 1333382333(0x4f79ccbd, float:4.19094451E9)
            X.C14030oh.A0A(r0, r5)
            r0 = 878919725(0x3463402d, float:2.116437E-7)
            goto L_0x3bb6
        L_0x2f0d:
            r2 = 1704396495(0x659706cf, float:8.915037E22)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = 1590750895(0x5ed0eeaf, float:7.5275815E18)
            int r3 = X.C14030oh.A03(r2)
            java.lang.Object r5 = r1.A00
            X.1wV r5 = (X.AnonymousClass1wV) r5
            com.instagram.service.session.UserSession r7 = r5.A02
            if (r0 == 0) goto L_0x2fb6
            java.lang.Object r6 = r0.A01
            if (r6 == 0) goto L_0x2fb6
            X.4v3 r6 = (X.AnonymousClass4v3) r6
            X.4vh r0 = r6.AoG()
            if (r0 == 0) goto L_0x2fb6
            X.1tl r0 = X.AnonymousClass3WS.A01(r7)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "user_consent_query_loaded"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            X.4vh r0 = r6.AoG()
            boolean r0 = r0.BNq()
            X.1tl r1 = X.AnonymousClass3WS.A01(r7)
            if (r0 == 0) goto L_0x2f55
            X.4vh r0 = r6.AoG()
            boolean r2 = r0.AZ9()
        L_0x2f55:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r1)
            java.lang.String r0 = "user_consent_query_consented"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            X.4vh r0 = r6.AoG()
            boolean r0 = r0.BOc()
            X.1tl r1 = X.AnonymousClass3WS.A01(r7)
            if (r0 == 0) goto L_0x2fb4
            X.4vh r0 = r6.AoG()
            boolean r2 = r0.BBz()
        L_0x2f74:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r1)
            java.lang.String r0 = "user_consent_query_settings_required"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            X.4vh r0 = r6.AoG()
            boolean r0 = r0.BNz()
            X.1tl r1 = X.AnonymousClass3WS.A01(r7)
            if (r0 == 0) goto L_0x2fb2
            X.4vh r0 = r6.AoG()
            boolean r2 = r0.Aii()
        L_0x2f93:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r1)
            java.lang.String r0 = "user_consent_query_first_party_tracking"
        L_0x2f99:
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            r0 = 142(0x8e, float:1.99E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r1 = X.C63873iU.A06(r5, r0)
            X.3EF r0 = r5.A01
            r0.A00(r1)
            r0 = -624233465(0xffffffffdacaf407, float:-2.85631281E16)
            X.C14030oh.A0A(r0, r3)
            r0 = 371523993(0x16250199, float:1.3329098E-25)
            goto L_0x3a4b
        L_0x2fb2:
            r2 = 0
            goto L_0x2f93
        L_0x2fb4:
            r2 = 0
            goto L_0x2f74
        L_0x2fb6:
            X.1tl r0 = X.AnonymousClass3WS.A01(r7)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "user_consent_query_loaded"
            goto L_0x2f99
        L_0x2fc2:
            r0 = 1148301961(0x4471b289, float:966.7896)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1013981597(0xffffffffc38fde63, float:-287.7374)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.1wV r0 = (X.AnonymousClass1wV) r0
            X.3aX r0 = r0.A03
            r1 = 1
            r0.A02 = r1
            X.1xr r0 = r0.A00
            if (r0 == 0) goto L_0x2fdf
            r0.A08 = r1
        L_0x2fdf:
            r0 = -1447401043(0xffffffffa9ba69ad, float:-8.278391E-14)
            X.C14030oh.A0A(r0, r3)
            r0 = 2068737027(0x7b4e6c03, float:1.0718039E36)
            goto L_0x3bb6
        L_0x2fea:
            r2 = -1958230947(0xffffffff8b47c45d, float:-3.8473733E-32)
            int r2 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r3 = -947712454(0xffffffffc7830e3a, float:-67100.45)
            int r5 = X.C14030oh.A03(r3)
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            super.onSuccess(r0)
            java.lang.Object r6 = r1.A00
            X.1Yx r6 = (X.C22651Yx) r6
            X.C22651Yx.A02(r6)
            X.C22651Yx.A01(r6)
            java.lang.Object r1 = r0.D7H()
            X.32o r1 = (X.C552832o) r1
            int r4 = r1.A00
            X.250 r3 = X.AnonymousClass250.NONE
            int r1 = r3.A00
            if (r4 == r1) goto L_0x303a
            java.lang.Object r0 = r0.D7H()
            X.32o r0 = (X.C552832o) r0
            int r1 = r0.A00
            java.util.Map r0 = X.AnonymousClass250.A02
            java.lang.Object r1 = X.C18200wM.A0f(r0, r1)
            if (r1 != 0) goto L_0x302a
            r1 = r3
        L_0x302a:
            X.C04220Ms.A0B(r1, r7)
            X.0Oa r0 = r6.A0O
            java.lang.Object r0 = r0.getValue()
            X.0zs r0 = (X.C19440zs) r0
            X.4wE r0 = r0.A00
            r0.CrC(r1)
        L_0x303a:
            r0 = -1324866890(0xffffffffb10822b6, float:-1.9810336E-9)
            X.C14030oh.A0A(r0, r5)
            r0 = 480373851(0x1ca1ec5b, float:1.0715183E-21)
            goto L_0x3bb6
        L_0x3045:
            r2 = -1727279946(0xffffffff990bccb6, float:-7.227473E-24)
            int r2 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r3 = 1876410881(0x6fd7c201, float:1.3354763E29)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            super.onSuccess(r0)
            java.lang.Object r7 = r1.A00
            X.1x6 r7 = (X.AnonymousClass1x6) r7
            java.lang.Object r0 = r0.D7H()
            X.32o r0 = (X.C552832o) r0
            int r1 = r0.A00
            java.util.Map r0 = X.AnonymousClass250.A02
            java.lang.Object r0 = X.C18200wM.A0f(r0, r1)
            if (r0 != 0) goto L_0x306e
            X.250 r0 = X.AnonymousClass250.NONE
        L_0x306e:
            java.lang.String r9 = r0.toString()
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            X.250 r0 = X.AnonymousClass250.NONE
            java.lang.String r3 = r0.A01
            android.content.Context r1 = r7.requireContext()
            r0 = 2131822323(0x7f1106f3, float:1.9277414E38)
            java.lang.String r0 = r1.getString(r0)
            X.C62563aI.A01(r3, r0, r8)
            X.250 r0 = X.AnonymousClass250.CLOSE_FRIENDS
            java.lang.String r3 = r0.A01
            android.content.Context r1 = r7.requireContext()
            r0 = 2131822319(0x7f1106ef, float:1.9277406E38)
            java.lang.String r0 = r1.getString(r0)
            X.C62563aI.A01(r3, r0, r8)
            X.250 r0 = X.AnonymousClass250.RECIPROCAL_FOLLOWS
            java.lang.String r3 = r0.A01
            android.content.Context r1 = r7.requireContext()
            r0 = 2131822324(0x7f1106f4, float:1.9277416E38)
            java.lang.String r0 = r1.getString(r0)
            X.C62563aI.A01(r3, r0, r8)
            r0 = 2131822322(0x7f1106f2, float:1.9277412E38)
            X.3hu r5 = new X.3hu
            r5.<init>((int) r0)
            r1 = 3
            com.facebook.redex.IDxCListenerShape219S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape219S0200000_1_I2
            r0.<init>(r1, r7, r8)
            X.3Sw r4 = new X.3Sw
            r4.<init>(r0, r9, r8)
            r0 = 2131822321(0x7f1106f1, float:1.927741E38)
            X.3hC r3 = new X.3hC
            r3.<init>((int) r0)
            r1 = 2131822320(0x7f1106f0, float:1.9277408E38)
            X.3hC r0 = new X.3hC
            r0.<init>((int) r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4, r3, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            r7.setItems(r0)
            X.AnonymousClass1x6.A0C(r7)
            r0 = -1620731382(0xffffffff9f659a0a, float:-4.8620054E-20)
            X.C14030oh.A0A(r0, r6)
            r0 = 1684259941(0x6463c465, float:1.680625E22)
            goto L_0x3bb6
        L_0x30e8:
            r2 = -172258671(0xfffffffff5bb8a91, float:-4.7547362E32)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1886621442(0x70738f02, float:3.0151097E29)
            int r4 = X.C14030oh.A03(r3)
            if (r0 == 0) goto L_0x3121
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x3121
            X.4ua r3 = (X.C85144ua) r3
            X.4vE r0 = r3.AkV()
            if (r0 == 0) goto L_0x3121
            java.lang.Object r1 = r1.A00
            X.1wk r1 = (X.C29111wk) r1
            X.4vE r0 = r3.AkV()
            java.lang.String r0 = r0.B9U()
            r1.A02 = r0
            X.4vE r0 = r3.AkV()
            X.4vT r0 = r0.AON()
            r1.A00 = r0
            X.C29111wk.A0B(r1)
        L_0x3121:
            r0 = 53096145(0x32a2ed1, float:5.0012253E-37)
            X.C14030oh.A0A(r0, r4)
            r0 = 955229474(0x38efa522, float:1.14271665E-4)
            goto L_0x3bb6
        L_0x312c:
            r2 = -783005956(0xffffffffd15446fc, float:-5.6982749E10)
            int r2 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r3 = -1238781698(0xffffffffb629b0fe, float:-2.5285985E-6)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r0 = r0.D7H()
            X.32u r0 = (X.C553432u) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x316d
            java.lang.Object r4 = r1.A00
            X.3Hb r4 = (X.C58753Hb) r4
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A07
            r0 = 1
            r1.set(r0)
            com.instagram.base.activity.IgFragmentActivity r1 = r4.A03
            r0 = 2131830148(0x7f112584, float:1.9293285E38)
            X.Dnn r3 = X.AnonymousClass4DS.A00(r1, r0)
            X.D0f r0 = X.D0f.ABOVE_ANCHOR
            r3.A03(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r3.A00 = r0
            r1 = 14
            com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2 r0 = new com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2
            r0.<init>(r4, r1)
            r3.A05 = r0
            r4.A00 = r3
        L_0x316d:
            r0 = -895448724(0xffffffffcaa0896c, float:-5260470.0)
            X.C14030oh.A0A(r0, r5)
            r0 = 45022660(0x2aefdc4, float:2.5712656E-37)
            goto L_0x3bb6
        L_0x3178:
            r2 = 1304676440(0x4dc3c858, float:4.10585856E8)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -1503995959(0xffffffffa65ad7c9, float:-7.5926387E-16)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r0 = r0.A01
            X.4uZ r0 = (X.C85134uZ) r0
            if (r0 == 0) goto L_0x31a1
            X.4uY r0 = r0.AkU()
            if (r0 == 0) goto L_0x31a1
            java.lang.Object r1 = r1.A00
            X.1x2 r1 = (X.AnonymousClass1x2) r1
            com.google.common.collect.ImmutableList r0 = r0.B9H()
            r1.A01 = r0
            X.AnonymousClass1x2.A0D(r1)
        L_0x31a1:
            r0 = 176773292(0xa8958ac, float:1.3225975E-32)
            X.C14030oh.A0A(r0, r3)
            r0 = 940436572(0x380dec5c, float:3.3837146E-5)
            goto L_0x3bb6
        L_0x31ac:
            r2 = -485234662(0xffffffffe313e81a, float:-2.728396E21)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1164423420(0x4567b0fc, float:3707.0615)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r0 = r0.A01
            X.4uU r0 = (X.C85084uU) r0
            if (r0 == 0) goto L_0x31f5
            X.4vC r0 = r0.AkR()
            if (r0 == 0) goto L_0x31f5
            java.lang.Object r3 = r1.A00
            X.1x2 r3 = (X.AnonymousClass1x2) r3
            X.4vY r1 = r0.AOO()
            if (r1 == 0) goto L_0x31f2
            java.lang.String r7 = r1.BH2()
            java.lang.String r8 = r1.AZU()
            java.lang.String r9 = r1.B3D()
            r1.B3E()
            boolean r10 = r0.BBd()
            r0 = 203(0xcb, float:2.84E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r6 = X.C18200wM.A0R(r3, r1, r0)
            X.3CZ r5 = new X.3CZ
            r5.<init>(r6, r7, r8, r9, r10)
            r3.A07 = r5
        L_0x31f2:
            X.AnonymousClass1x2.A0D(r3)
        L_0x31f5:
            r0 = 1525713924(0x5af08c04, float:3.38539716E16)
            X.C14030oh.A0A(r0, r4)
            r0 = 372874556(0x16399d3c, float:1.4993795E-25)
            goto L_0x3bb6
        L_0x3200:
            r2 = 984746710(0x3ab20ad6, float:0.0013583552)
            int r2 = X.C14030oh.A03(r2)
            X.1Qf r0 = (X.C21311Qf) r0
            r3 = 1062279387(0x3f5118db, float:0.8167855)
            int r6 = X.C14030oh.A03(r3)
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            X.32l r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x323f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x323f
            java.lang.Object r4 = r1.A00
            X.1x2 r4 = (X.AnonymousClass1x2) r4
            X.0Oa r0 = r4.A0L
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.C04220Ms.A0B(r3, r5)
            X.4Xs r1 = X.AnonymousClass4Xs.A00
            java.lang.Class<X.363> r0 = X.AnonymousClass363.class
            java.lang.Object r1 = r3.A01(r0, r1)
            X.363 r1 = (X.AnonymousClass363) r1
            r0 = 1
            r1.A00 = r0
            X.AnonymousClass1x2.A0D(r4)
        L_0x323f:
            r0 = 2000043343(0x77363d4f, float:3.696256E33)
            X.C14030oh.A0A(r0, r6)
            r0 = 33556596(0x2000874, float:9.406381E-38)
            goto L_0x3bb6
        L_0x324a:
            r2 = -1429920337(0xffffffffaac525af, float:-3.5020378E-13)
            int r2 = X.C14030oh.A03(r2)
            X.1Sq r0 = (X.C21911Sq) r0
            r3 = 1512899788(0x5a2d04cc, float:1.21751113E16)
            int r7 = X.C14030oh.A03(r3)
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            boolean r5 = r0.A00
            java.lang.Object r4 = r1.A00
            X.1x2 r4 = (X.AnonymousClass1x2) r4
            X.0Oa r0 = r4.A0L
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.C04220Ms.A0B(r3, r6)
            X.4Xt r1 = X.AnonymousClass4Xt.A00
            java.lang.Class<X.364> r0 = X.AnonymousClass364.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.364 r0 = (X.AnonymousClass364) r0
            r0.A00 = r5
            if (r5 == 0) goto L_0x327e
            X.AnonymousClass1x2.A0D(r4)
        L_0x327e:
            r0 = -1878622435(0xffffffff90067f1d, float:-2.6524765E-29)
            X.C14030oh.A0A(r0, r7)
            r0 = 794899235(0x2f613323, float:2.0481798E-10)
            goto L_0x3bb6
        L_0x3289:
            r2 = -87205541(0xfffffffffacd595b, float:-5.331166E35)
            int r2 = X.C14030oh.A03(r2)
            X.1Sf r0 = (X.C21801Sf) r0
            r3 = -2027233755(0xffffffff872ade25, float:-1.2854661E-34)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            boolean r5 = r0.A00
            java.lang.Object r4 = r1.A00
            X.1x2 r4 = (X.AnonymousClass1x2) r4
            X.0Oa r0 = r4.A0L
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<X.36A> r1 = X.AnonymousClass36A.class
            X.4Ub r0 = X.C73774Ub.A00
            java.lang.Object r0 = r3.A01(r1, r0)
            X.36A r0 = (X.AnonymousClass36A) r0
            r0.A00 = r5
            if (r5 == 0) goto L_0x32b6
            X.AnonymousClass1x2.A0D(r4)
        L_0x32b6:
            r0 = -1200959086(0xffffffffb86ad192, float:-5.5985125E-5)
            X.C14030oh.A0A(r0, r6)
            r0 = -1755628320(0xffffffff975b3ce0, float:-7.083955E-25)
            goto L_0x3bb6
        L_0x32c1:
            r2 = 2079904209(0x7bf8d1d1, float:2.5838904E36)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = -1573982815(0xffffffffa22eeda1, float:-2.3707197E-18)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            X.3DU r5 = r0.A00
            X.C04220Ms.A06(r5)
            java.lang.Object r0 = r1.A00
            X.1x2 r0 = (X.AnonymousClass1x2) r0
            X.0Oa r4 = r0.A0L
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r4)
            com.instagram.user.model.User r3 = X.C18250wR.A0R(r0)
            java.lang.String r0 = r5.A0C
            X.MeW r1 = r3.A05
            r1.Cnt(r0)
            java.lang.String r0 = r5.A0D
            r1.Cnu(r0)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r4)
            r3.A1t(r0)
            r0 = -469005515(0xffffffffe40b8b35, float:-1.0296513E22)
            X.C14030oh.A0A(r0, r6)
            r0 = -1292661210(0xffffffffb2f38e26, float:-2.8353565E-8)
            goto L_0x3bb6
        L_0x3302:
            r2 = 181291394(0xace4982, float:1.9864729E-32)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 959753362(0x3934ac92, float:1.7230425E-4)
            int r7 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r4 = r0.A01
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 == 0) goto L_0x3355
            java.lang.Class<com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl$FetchIGUser> r3 = com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl.FetchIGUser.class
            java.lang.String r0 = "fetch__IGUser(igid:$user_id)"
            com.facebook.pando.TreeJNI r4 = r4.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x3355
            java.lang.Class<com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl$FetchIGUser$UserAvatar> r3 = com.instagram.graphql.instagramschema.IGAvatarPrivacySettingsIsPublicResponseImpl.FetchIGUser.UserAvatar.class
            java.lang.String r0 = "user_avatar"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r0, r3)
            if (r3 == 0) goto L_0x3355
            java.lang.String r0 = "is_public"
            boolean r3 = r3.getBooleanValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x3355
            java.lang.Object r6 = r1.A00
            X.1x2 r6 = (X.AnonymousClass1x2) r6
            if (r3 == 0) goto L_0x3352
            X.0Oa r0 = r6.A0L
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r3 = 36325841252132123(0x810e290000251b, double:3.03594650804588E-306)
            boolean r3 = X.C63803iN.A0E(r0, r5, r3)
            r0 = 1
            if (r3 != 0) goto L_0x3353
        L_0x3352:
            r0 = 0
        L_0x3353:
            r6.A0A = r0
        L_0x3355:
            java.lang.Object r0 = r1.A00
            X.1x2 r0 = (X.AnonymousClass1x2) r0
            X.AnonymousClass1x2.A0C(r0)
            r0 = 1733308101(0x67502ec5, float:9.83115E23)
            X.C14030oh.A0A(r0, r7)
            r0 = 368815832(0x15fbaed8, float:1.0165395E-25)
            goto L_0x3bb6
        L_0x3367:
            r2 = -1167878378(0xffffffffba639716, float:-8.6818764E-4)
            int r2 = X.C14030oh.A03(r2)
            X.1RM r0 = (X.AnonymousClass1RM) r0
            r3 = 46234583(0x2c17bd7, float:2.8429882E-37)
            int r4 = X.C14030oh.A03(r3)
            r9 = 0
            X.C04220Ms.A0B(r0, r9)
            X.37G r5 = r0.A00
            if (r5 == 0) goto L_0x3b7f
            com.instagram.api.schemas.UserCallSettings r8 = r5.A00
            com.instagram.api.schemas.UserCallSettings r0 = com.instagram.api.schemas.UserCallSettings.SPECIFIC_PEOPLE
            if (r8 != r0) goto L_0x3391
            java.lang.Object r3 = r1.A00
            X.1wi r3 = (X.C29091wi) r3
            java.util.List r0 = r5.A01
            int r0 = r0.size()
            r3.A00 = r0
        L_0x3391:
            java.lang.Object r6 = r1.A00
            X.1wi r6 = (X.C29091wi) r6
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            r0 = 2131837721(0x7f114319, float:1.9308645E38)
            X.C63613hu.A03(r5, r0)
            int r1 = r8.ordinal()
            r0 = 6
            if (r1 == r0) goto L_0x33e9
            r0 = 2
            if (r1 == r0) goto L_0x33e9
            r0 = 5
            if (r1 != r0) goto L_0x33db
            r1 = 2131837723(0x7f11431b, float:1.930865E38)
            r0 = 265(0x109, float:3.71E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            X.3Xk r8 = new X.3Xk
            r8.<init>((android.view.View.OnClickListener) r0, (int) r1)
            android.content.res.Resources r7 = X.AnonymousClass0wJ.A0B(r6)
            r3 = 2131689483(0x7f0f000b, float:1.9007983E38)
            int r1 = r6.A00
            java.lang.Object[] r0 = X.C18210wN.A1X(r9)
            java.lang.String r0 = r7.getQuantityString(r3, r1, r0)
            r8.A04 = r0
            r5.add(r8)
            r1 = 2131837724(0x7f11431c, float:1.9308651E38)
        L_0x33d3:
            X.3hC r0 = new X.3hC
            r0.<init>((int) r1)
            r5.add(r0)
        L_0x33db:
            r6.setItems(r5)
            r0 = 183581489(0xaf13b31, float:2.3229721E-32)
            X.C14030oh.A0A(r0, r4)
            r0 = 1159341260(0x451a24cc, float:2466.2998)
            goto L_0x3bb6
        L_0x33e9:
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            com.instagram.api.schemas.UserCallSettings r0 = com.instagram.api.schemas.UserCallSettings.PEOPLE_YOU_FOLLOW
            java.lang.String r3 = r0.A00
            android.content.Context r1 = r6.requireContext()
            r0 = 2131837719(0x7f114317, float:1.930864E38)
            java.lang.String r0 = r1.getString(r0)
            X.C62563aI.A01(r3, r0, r7)
            com.instagram.api.schemas.UserCallSettings r0 = com.instagram.api.schemas.UserCallSettings.OFF
            java.lang.String r3 = r0.A00
            android.content.Context r1 = r6.requireContext()
            r0 = 2131837720(0x7f114318, float:1.9308643E38)
            java.lang.String r0 = r1.getString(r0)
            X.C62563aI.A01(r3, r0, r7)
            java.lang.String r3 = r8.A00
            r0 = 4
            com.facebook.redex.IDxCListenerShape219S0200000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape219S0200000_1_I2
            r1.<init>(r0, r6, r7)
            X.3Sw r0 = new X.3Sw
            r0.<init>(r1, r3, r7)
            r5.add(r0)
            r1 = 2131837722(0x7f11431a, float:1.9308647E38)
            goto L_0x33d3
        L_0x3425:
            r2 = 1355534209(0x50cbcf81, float:2.73549906E10)
            int r2 = X.C14030oh.A03(r2)
            X.1RM r0 = (X.AnonymousClass1RM) r0
            r3 = -912288005(0xffffffffc99f96fb, float:-1307359.4)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            X.37G r0 = r0.A00
            if (r0 == 0) goto L_0x3b7f
            java.lang.Object r5 = r1.A00
            X.1cP r5 = (X.AnonymousClass1cP) r5
            X.3I8 r1 = r5.A02
            java.util.List r0 = r0.A01
            r1.A02(r0)
            X.1fV r4 = r5.A04()
            java.util.List r3 = r1.A01
            com.google.common.collect.ImmutableList r1 = X.C18220wO.A0S(r3)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            X.C04220Ms.A06(r0)
            r4.A04(r1, r0)
            X.1fV r0 = r5.A04()
            r0.A01()
            int r1 = r3.size()
            X.1fV r0 = r5.A04()
            r0.A02(r1)
            r0 = 1983254098(0x76360e52, float:9.231333E32)
            X.C14030oh.A0A(r0, r6)
            r0 = -1940047342(0xffffffff8c5d3a12, float:-1.7042696E-31)
            goto L_0x3bb6
        L_0x3475:
            r2 = -775320808(0xffffffffd1c98b18, float:-1.08202754E11)
            int r2 = X.C14030oh.A03(r2)
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse r0 = (com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse) r0
            r3 = -1567788214(0xffffffffa28d734a, float:-3.8340194E-18)
            int r7 = X.C14030oh.A03(r3)
            java.lang.Object r8 = r1.A00
            X.1uw r8 = (X.C28761uw) r8
            r8.A02 = r0
            X.C28761uw.A00(r8)
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse r4 = r8.A02
            if (r4 == 0) goto L_0x34be
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus r3 = r4.A00
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus r0 = com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus.NO_VALID_DOWNLOADABLE
            if (r3 == r0) goto L_0x34be
            java.lang.String r6 = r4.A03
            java.lang.String r5 = r4.A02
            r0 = 11
            com.facebook.redex.IDxCListenerShape420S0100000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape420S0100000_1_I2
            r4.<init>(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            X.Dsm r3 = X.C18190wL.A0W(r0)
            r3.A02 = r6
            r3.A0p(r5)
            r1 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 154(0x9a, float:2.16E-43)
            X.C18180wK.A1N(r3, r8, r0, r1)
            r3.A0M(r4)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x34be:
            r0 = -931456777(0xffffffffc87b18f7, float:-257123.86)
            X.C14030oh.A0A(r0, r7)
            r0 = 1776907210(0x69e973ca, float:3.5278314E25)
            goto L_0x3bb6
        L_0x34c9:
            r2 = 1792925340(0x6addde9c, float:1.3411192E26)
            int r4 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r2 = -1187548293(0xffffffffb937737b, float:-1.749526E-4)
            int r6 = X.AnonymousClass0wJ.A00(r2, r0)
            super.onSuccess(r0)
            java.lang.Object r7 = r1.A00
            X.1x8 r7 = (X.AnonymousClass1x8) r7
            java.lang.Object r0 = r0.D7H()
            X.337 r0 = (X.AnonymousClass337) r0
            boolean r0 = r0.A00
            r2 = 2131826747(0x7f11183b, float:1.9286387E38)
            r1 = r0 ^ 1
            r0 = 50
            X.4MC r8 = X.AnonymousClass4MC.A05(r7, r0, r2, r1)
            r0 = 2131826746(0x7f11183a, float:1.9286385E38)
            java.lang.String r9 = X.C18180wK.A0g(r7, r0)
            X.0Oa r0 = r7.A01
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36879763184353476(0x8305f3000100c4, double:3.3862489684472546E-306)
            java.lang.String r5 = X.C63803iN.A0C(r2, r3, r0)
            int r0 = r5.length()
            if (r0 != 0) goto L_0x352f
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r9)
        L_0x3516:
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            r7.setItems(r0)
            X.AnonymousClass1x8.A0D(r7)
            r0 = -69405347(0xfffffffffbdcf55d, float:-2.2945637E36)
            X.C14030oh.A0A(r0, r6)
            r0 = -1285063709(0xffffffffb3677be3, float:-5.3896553E-8)
            goto L_0x3a4b
        L_0x352f:
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r3 = X.C18180wK.A0g(r7, r0)
            android.text.SpannableStringBuilder r2 = X.C18190wL.A0D(r9, r3)
            X.C04220Ms.A06(r2)
            r1 = 4
            com.facebook.redex.IDxCSpanShape0S1100000_1_I2 r0 = new com.facebook.redex.IDxCSpanShape0S1100000_1_I2
            r0.<init>(r5, r7, r1)
            X.AnonymousClass3Zw.A01(r2, r0, r3)
            X.3hC r0 = new X.3hC
            r0.<init>((android.text.SpannableStringBuilder) r2)
            goto L_0x3516
        L_0x354c:
            r2 = 191634854(0xb6c1da6, float:4.5474252E-32)
            int r4 = X.C14030oh.A03(r2)
            X.1TE r0 = (X.AnonymousClass1TE) r0
            r2 = 204576709(0xc3197c5, float:1.3681255E-31)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            super.onSuccess(r0)
            java.lang.Object r3 = r1.A00
            r6 = r3
            X.49K r6 = (X.AnonymousClass49K) r6
            android.widget.Toast r1 = r6.A00
            if (r1 == 0) goto L_0x356b
            r1.cancel()
        L_0x356b:
            r11 = 0
            r6.A00 = r11
            X.1U6 r1 = r0.A00
            if (r1 == 0) goto L_0x3584
            X.3Bm r1 = r0.A01
            if (r1 == 0) goto L_0x3584
            X.AnonymousClass49K.A00(r6, r0)
        L_0x3579:
            r0 = -1841594585(0xffffffff923b7f27, float:-5.9163523E-28)
            X.C14030oh.A0A(r0, r5)
            r0 = 2143760162(0x7fc72f22, float:NaN)
            goto L_0x3a4b
        L_0x3584:
            monitor-enter(r3)
            X.1tl r1 = r6.A06     // Catch:{ IOException -> 0x360d }
            java.lang.String r10 = "interop_reachability_setting"
            java.lang.String r0 = ""
            android.content.SharedPreferences r9 = r1.A00     // Catch:{ IOException -> 0x360d }
            java.lang.String r0 = r9.getString(r10, r0)     // Catch:{ IOException -> 0x360d }
            X.C04220Ms.A06(r0)     // Catch:{ IOException -> 0x360d }
            X.MIS r8 = X.C18987Aon.A00     // Catch:{ IOException -> 0x360d }
            X.MMo r0 = r8.A08(r0)     // Catch:{ IOException -> 0x360d }
            r0.A0g()     // Catch:{ IOException -> 0x360d }
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r7 = X.C60223Oe.parseFromJson(r0)     // Catch:{ IOException -> 0x360d }
            java.lang.String r2 = "interop_reachability_setting_PENDING"
            java.lang.String r1 = r9.getString(r2, r11)     // Catch:{ IOException -> 0x360d }
            if (r1 == 0) goto L_0x35b0
            android.content.SharedPreferences$Editor r0 = r9.edit()     // Catch:{ IOException -> 0x360d }
            X.C18180wK.A0v(r0, r10, r1)     // Catch:{ IOException -> 0x360d }
        L_0x35b0:
            android.content.SharedPreferences$Editor r0 = r9.edit()     // Catch:{ IOException -> 0x360d }
            X.C18180wK.A0u(r0, r2)     // Catch:{ IOException -> 0x360d }
            if (r1 == 0) goto L_0x35c5
            X.MMo r0 = r8.A08(r1)     // Catch:{ IOException -> 0x360d }
            r0.A0g()     // Catch:{ IOException -> 0x360d }
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r10 = X.C60223Oe.parseFromJson(r0)     // Catch:{ IOException -> 0x360d }
            goto L_0x35d8
        L_0x35c5:
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r10 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel     // Catch:{ IOException -> 0x360d }
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x360d }
        L_0x35d8:
            java.util.Set r0 = r6.A08     // Catch:{ all -> 0x360b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x360b }
        L_0x35de:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x360b }
            if (r0 == 0) goto L_0x35f0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x360b }
            X.36C r0 = (X.AnonymousClass36C) r0     // Catch:{ all -> 0x360b }
            X.1ir r0 = r0.A00     // Catch:{ all -> 0x360b }
            X.C23411dm.A08(r0)     // Catch:{ all -> 0x360b }
            goto L_0x35de
        L_0x35f0:
            java.util.Set r0 = r6.A09     // Catch:{ IOException -> 0x360d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x360d }
        L_0x35f6:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x360d }
            if (r0 == 0) goto L_0x3615
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x360d }
            X.4ry r1 = (X.C83774ry) r1     // Catch:{ IOException -> 0x360d }
            java.lang.String r0 = r6.A05     // Catch:{ IOException -> 0x360d }
            X.C04220Ms.A09(r10)     // Catch:{ IOException -> 0x360d }
            r1.D9n(r10, r7, r0)     // Catch:{ IOException -> 0x360d }
            goto L_0x35f6
        L_0x360b:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x360d }
        L_0x360d:
            r2 = move-exception
            java.lang.String r1 = "DirectMessagesInteropOptionsUpdateHelper"
            java.lang.String r0 = "Error while parsing DirectMessagesInteropOptionsViewModel"
            X.C10450iM.A06(r1, r0, r2)     // Catch:{ all -> 0x3618 }
        L_0x3615:
            monitor-exit(r3)
            goto L_0x3579
        L_0x3618:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x361b:
            r2 = -1536319821(0xffffffffa46d9eb3, float:-5.1525606E-17)
            int r4 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -2099801241(0xffffffff82d79367, float:-3.1676015E-37)
            int r3 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r2 = r1.A00
            X.3yn r2 = (X.C67053yn) r2
            com.instagram.service.session.UserSession r7 = r2.A01
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            java.lang.Object r0 = r0.A01
            X.4v0 r0 = (X.C85404v0) r0
            if (r0 == 0) goto L_0x36d2
            X.4vO r6 = r0.AoD()
            if (r6 == 0) goto L_0x36d2
            X.4vd r5 = r6.AsJ()
            r12 = 0
            if (r5 == 0) goto L_0x366d
            boolean r0 = X.C60343Oq.A01(r7)
            if (r0 == 0) goto L_0x36af
            java.lang.String r8 = r5.BK3()
        L_0x3653:
            java.lang.String r10 = r5.getName()
            X.20B r0 = r5.BIn()
            if (r0 == 0) goto L_0x36ad
            java.lang.String r9 = r0.toString()
        L_0x3661:
            java.lang.String r11 = r5.B4V()
            X.3CV r7 = new X.3CV
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add((java.lang.Object) r7)
        L_0x366d:
            com.google.common.collect.ImmutableList r0 = r6.Azl()
            X.C04220Ms.A06(r0)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x367c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x36b4
            java.lang.Object r5 = r6.next()
            X.4ve r5 = (X.C85714ve) r5
            java.lang.String r14 = r5.getId()
            java.lang.String r16 = r5.getName()
            X.20B r0 = r5.BIn()
            if (r0 == 0) goto L_0x36ab
            java.lang.String r15 = r0.toString()
        L_0x369a:
            java.lang.String r17 = r5.B4V()
            java.lang.String r18 = r5.B1p()
            X.3CV r13 = new X.3CV
            r13.<init>(r14, r15, r16, r17, r18)
            r7.add(r13)
            goto L_0x367c
        L_0x36ab:
            r15 = r12
            goto L_0x369a
        L_0x36ad:
            r9 = r12
            goto L_0x3661
        L_0x36af:
            java.lang.String r8 = r5.getId()
            goto L_0x3653
        L_0x36b4:
            java.util.ArrayList r7 = X.C18200wM.A0s(r7)
            X.4Tf r5 = X.C73644Tf.A00
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }"
            X.C04220Ms.A0C(r5, r0)
            r0 = 11
            com.facebook.redex.IDxComparatorShape302S0100000_1_I2 r6 = new com.facebook.redex.IDxComparatorShape302S0100000_1_I2
            r6.<init>((int) r0, (java.util.Comparator) r5)
            r5 = 6
            com.facebook.redex.IDxComparatorShape302S0100000_1_I2 r0 = new com.facebook.redex.IDxComparatorShape302S0100000_1_I2
            r0.<init>((int) r5, (java.util.Comparator) r6)
            X.C001300p.A0y(r7, r0)
            r1.addAll((java.lang.Iterable) r7)
        L_0x36d2:
            com.google.common.collect.ImmutableList r1 = X.C18250wR.A0F(r1)
            boolean r0 = X.C18250wR.A1K(r1)
            if (r0 == 0) goto L_0x36de
            r2.A00 = r1
        L_0x36de:
            r0 = -1655556521(0xffffffff9d523657, float:-2.7821362E-21)
            X.C14030oh.A0A(r0, r3)
            r0 = 1935919266(0x7363c8a2, float:1.8046886E31)
            goto L_0x3a4b
        L_0x36e9:
            r2 = 172922413(0xa4e962d, float:9.946784E-33)
            int r4 = X.C14030oh.A03(r2)
            X.1TF r0 = (X.AnonymousClass1TF) r0
            r2 = 1605389689(0x5fb04d79, float:2.5407886E19)
            int r7 = X.C14030oh.A03(r2)
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x3720
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x3720
            java.lang.Object r3 = r1.A00
            X.47q r3 = (X.C692747q) r3
            com.instagram.service.session.UserSession r1 = r3.A03
            com.facebook.AccessToken r0 = new com.facebook.AccessToken
            r0.<init>(r5, r2)
            X.C67363zQ.A0A(r0, r1, r6)
        L_0x3713:
            r3.A02 = r6
            r0 = 2075694836(0x7bb896f4, float:1.9168886E36)
            X.C14030oh.A0A(r0, r7)
            r0 = 1909349632(0x71ce5d00, float:2.043723E30)
            goto L_0x3a4b
        L_0x3720:
            java.lang.String r0 = "ig_fbconnected_backend_convert_big_blue_token_failed"
            X.0rn r2 = X.C18230wP.A0T(r0)
            java.lang.Object r3 = r1.A00
            X.47q r3 = (X.C692747q) r3
            com.instagram.service.session.UserSession r0 = r3.A03
            X.C18180wK.A1K(r2, r0)
            goto L_0x3713
        L_0x3730:
            r2 = 799373619(0x2fa57933, float:3.0099442E-10)
            int r2 = X.C14030oh.A03(r2)
            X.1Sj r0 = (X.C21841Sj) r0
            r3 = 1424997454(0x54efbc4e, float:8.2372513E12)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.1v3 r3 = (X.AnonymousClass1v3) r3
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A01 = r0
            long r0 = X.C18180wK.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A03 = r0
            r0 = -1294524103(0xffffffffb2d72139, float:-2.5044402E-8)
            X.C14030oh.A0A(r0, r4)
            r0 = -97961430(0xfffffffffa293a2a, float:-2.1966947E35)
            goto L_0x3bb6
        L_0x3761:
            r2 = 2095740977(0x7cea7831, float:9.739482E36)
            int r2 = X.C14030oh.A03(r2)
            X.1Sl r0 = (X.C21861Sl) r0
            r3 = -378614819(0xffffffffe96ecbdd, float:-1.8042941E25)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.1v3 r3 = (X.AnonymousClass1v3) r3
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            long r0 = X.C18180wK.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            r0 = -805379468(0xffffffffcffee274, float:-8.5525074E9)
            X.C14030oh.A0A(r0, r4)
            r0 = 261675480(0xf98d9d8, float:1.5072268E-29)
            goto L_0x3bb6
        L_0x3792:
            r2 = 285788458(0x1108c92a, float:1.0790497E-28)
            int r2 = X.C14030oh.A03(r2)
            X.1Sk r0 = (X.C21851Sk) r0
            r3 = -148495448(0xfffffffff72623a8, float:-3.369705E33)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.1v3 r3 = (X.AnonymousClass1v3) r3
            boolean r0 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            long r0 = X.C18180wK.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            r0 = 485963501(0x1cf736ed, float:1.6359287E-21)
            X.C14030oh.A0A(r0, r4)
            r0 = -986067649(0xffffffffc539cd3f, float:-2972.828)
            goto L_0x3bb6
        L_0x37c3:
            r2 = -1535109343(0xffffffffa4801721, float:-5.555033E-17)
            int r2 = X.C14030oh.A03(r2)
            X.1TQ r0 = (X.AnonymousClass1TQ) r0
            r3 = 1275987693(0x4c0e06ed, float:3.723154E7)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r1 = r1.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.1v4 r3 = X.C62753ae.A00(r1)
            boolean r1 = r0.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.A00 = r1
            int r1 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.A04 = r1
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A02 = r0
            long r0 = X.C18180wK.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
            r0 = 188527986(0xb3cb572, float:3.6343987E-32)
            X.C14030oh.A0A(r0, r4)
            r0 = -1624303562(0xffffffff9f2f1836, float:-3.7077718E-20)
            goto L_0x3bb6
        L_0x3808:
            r2 = -1031615235(0xffffffffc282ccfd, float:-65.40037)
            int r2 = X.C14030oh.A03(r2)
            X.1TQ r0 = (X.AnonymousClass1TQ) r0
            r3 = 896195864(0x356add18, float:8.7493527E-7)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r1 = r1.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.1v4 r3 = X.C62753ae.A00(r1)
            boolean r1 = r0.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r1
            int r1 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.A05 = r1
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A03 = r0
            long r0 = X.C18180wK.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A07 = r0
            r0 = -106134512(0xfffffffff9ac8410, float:-1.119692E35)
            X.C14030oh.A0A(r0, r4)
            r0 = 303902555(0x121d2f5b, float:4.9598835E-28)
            goto L_0x3bb6
        L_0x384d:
            r2 = -970102559(0xffffffffc62d68e1, float:-11098.22)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1852998363(0xffffffff918d7d25, float:-2.2323004E-28)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A00
            X.8m8 r3 = (X.C146368m8) r3
            X.5z2 r1 = new X.5z2
            r1.<init>(r0)
            r3.D7w(r1)
            r0 = 1695565306(0x651045fa, float:4.2581976E22)
            X.C14030oh.A0A(r0, r4)
            r0 = 1713165715(0x661cd593, float:1.8515723E23)
            goto L_0x3bb6
        L_0x3872:
            r2 = 1512657809(0x5a295391, float:1.19152883E16)
            int r2 = X.C14030oh.A03(r2)
            X.EUq r0 = (X.C26743EUq) r0
            r3 = 1467989414(0x577fbda6, float:2.81189999E14)
            int r4 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r0.A04()
            if (r3 == 0) goto L_0x3894
            java.lang.Object r1 = r1.A00
            X.8m8 r1 = (X.C146368m8) r1
            X.5z2 r0 = new X.5z2
            r0.<init>(r3)
            r1.D7w(r0)
        L_0x3894:
            r0 = -131984362(0xfffffffff8221416, float:-1.3149367E34)
            X.C14030oh.A0A(r0, r4)
            r0 = -560211824(0xffffffffde9bd890, float:-5.614942E18)
            goto L_0x3bb6
        L_0x389f:
            r0 = 516027433(0x1ec1f429, float:2.0535652E-20)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1911503774(0xffffffff8e10c462, float:-1.7843925E-30)
            int r1 = X.C14030oh.A03(r0)
            r0 = 226370220(0xd7e22ac, float:7.831153E-31)
            X.C14030oh.A0A(r0, r1)
            r0 = -1065743875(0xffffffffc07a09fd, float:-3.9068596)
            goto L_0x3bb6
        L_0x38b8:
            r2 = 1177612708(0x4630f1a4, float:11324.41)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -1648282325(0xffffffff9dc1352b, float:-5.114165E-21)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r5 = r0.A01
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            if (r5 == 0) goto L_0x3912
            java.lang.Class<com.instagram.graphql.instagramschema.SessionSurveyUriQueryResponseImpl$IgEndSessionSurveyUriRootQuery> r4 = com.instagram.graphql.instagramschema.SessionSurveyUriQueryResponseImpl.IgEndSessionSurveyUriRootQuery.class
            java.lang.String r0 = "ig_end_session_survey_uri_root_query(integration_point_id:$integration_point_id,session_id:$session_id,survey_context_data:$survey_context_data)"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r0, r4)
            if (r5 == 0) goto L_0x3912
            java.lang.Object r4 = r1.A00
            X.49G r4 = (X.AnonymousClass49G) r4
            java.lang.String r0 = "survey_uri"
            java.lang.String r0 = r5.getStringValue(r0)
            r4.A05 = r0
            java.lang.String r1 = "survey_id"
            boolean r0 = r5.hasFieldValue(r1)
            if (r0 == 0) goto L_0x391d
            int r0 = r5.getIntValue(r1)
            java.lang.Long r0 = X.C18230wP.A0f(r0)
        L_0x38f4:
            r4.A02 = r0
            java.lang.String r0 = "leaf_id"
            java.lang.String r0 = r5.getStringValue(r0)
            r4.A03 = r0
            java.lang.String r0 = "root_id"
            java.lang.String r0 = r5.getStringValue(r0)
            r4.A04 = r0
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.4QG r0 = new X.4QG
            r0.<init>(r4)
            r1.post(r0)
        L_0x3912:
            r0 = 527460709(0x1f706965, float:5.0909157E-20)
            X.C14030oh.A0A(r0, r3)
            r0 = -799228489(0xffffffffd05cbdb7, float:-1.48136827E10)
            goto L_0x3bb6
        L_0x391d:
            r0 = 0
            goto L_0x38f4
        L_0x391f:
            r2 = 726835929(0x2b52a2d9, float:7.4832984E-13)
            int r4 = X.C14030oh.A03(r2)
            X.1SG r0 = (X.AnonymousClass1SG) r0
            r2 = -1259414484(0xffffffffb4eedc2c, float:-4.449115E-7)
            int r6 = X.C14030oh.A03(r2)
            if (r0 == 0) goto L_0x399c
            java.lang.String r2 = r0.A00
            android.net.Uri r7 = X.C15430rJ.A01(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x399c
            r2 = 0
            X.C04220Ms.A0B(r7, r2)
            java.lang.String r3 = r7.getHost()
            java.lang.String r2 = "instagram.com"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L_0x397d
            java.lang.String r2 = "www.instagram.com"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L_0x397d
            java.lang.String r2 = "help.instagram.com"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L_0x397d
            java.lang.String r2 = "applink.instagram.com"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L_0x397d
            java.lang.String r5 = r7.getScheme()
            java.lang.String r3 = r7.getHost()
            java.lang.String r2 = "instagram"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x399c
            java.util.List r2 = X.AnonymousClass3RK.A00
            boolean r2 = X.AnonymousClass00J.A0k(r2, r3)
            if (r2 == 0) goto L_0x399c
        L_0x397d:
            java.lang.String r0 = r0.A00
            android.net.Uri r3 = X.C15430rJ.A01(r0)
            java.lang.Object r0 = r1.A00
            X.1Z5 r0 = (X.AnonymousClass1Z5) r0
            android.os.Handler r2 = r0.A01
            X.4Ry r0 = new X.4Ry
            r0.<init>(r3, r1)
            r2.post(r0)
        L_0x3991:
            r0 = 1850113008(0x6e467bf0, float:1.5356966E28)
            X.C14030oh.A0A(r0, r6)
            r0 = 223404087(0xd50e037, float:6.4364837E-31)
            goto L_0x3a4b
        L_0x399c:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            android.os.Bundle r0 = r0.mArguments
            X.C63753iH.A02(r1, r0)
            goto L_0x3991
        L_0x39aa:
            r0 = 1186844374(0x46bdced6, float:24295.418)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1814764117(0x6c2b1a55, float:8.2740266E26)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCListenerShape20S0400000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape20S0400000_1_I2) r0
            java.lang.Object r0 = r0.A01
            X.4t4 r0 = (X.C84394t4) r0
            r0.onSuccess()
            r0 = -797897138(0xffffffffd0710e4e, float:-1.61769861E10)
            X.C14030oh.A0A(r0, r3)
            r0 = 1948303742(0x7420c17e, float:5.0945556E31)
            goto L_0x3bb6
        L_0x39ce:
            r2 = -583464198(0xffffffffdd390afa, float:-8.3335903E17)
            int r2 = X.C14030oh.A03(r2)
            r3 = 2027741976(0x78dce318, float:3.5840979E34)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r0 = r1.A00
            X.CUH r0 = (X.CUH) r0
            X.CW6 r1 = r0.A09
            r0 = -2097033320(0xffffffff8301cf98, float:-3.8148E-37)
            X.C14020og.A00(r1, r0)
            r0 = -1220770593(0xffffffffb73c84df, float:-1.123661E-5)
            X.C14030oh.A0A(r0, r3)
            r0 = 2009253908(0x77c2c814, float:7.9012786E33)
            goto L_0x3bb6
        L_0x39f6:
            r2 = -1712963489(0xffffffff99e6405f, float:-2.3807442E-23)
            int r2 = X.C14030oh.A03(r2)
            r3 = -46730067(0xfffffffffd36f4ad, float:-1.519937E37)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            super.onSuccess(r0)
            r0 = 596507950(0x238dfd2e, float:1.5394476E-17)
            X.C14030oh.A0A(r0, r3)
            r0 = 1765126461(0x6935b13d, float:1.3728285E25)
            goto L_0x3bb6
        L_0x3a12:
            r2 = 326246039(0x13721e97, float:3.0559776E-27)
            int r4 = X.C14030oh.A03(r2)
            X.1UG r0 = (X.AnonymousClass1UG) r0
            r2 = -2027229651(0xffffffff872aee2d, float:-1.2859372E-34)
            int r3 = X.AnonymousClass0wJ.A00(r2, r0)
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x3a2f
            X.HtU r0 = r0.A0G()
            if (r0 == 0) goto L_0x3a2f
            r0.Aah()
        L_0x3a2f:
            X.0Ok r2 = X.C06810aP.A01
            java.lang.Object r0 = r1.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.user.model.User r0 = r2.A01(r0)
            X.HtU r0 = r0.A0G()
            if (r0 == 0) goto L_0x3a42
            r0.Aah()
        L_0x3a42:
            r0 = -1097275565(0xffffffffbe98e753, float:-0.29863986)
            X.C14030oh.A0A(r0, r3)
            r0 = -776127372(0xffffffffd1bd3c74, float:-1.01595382E11)
        L_0x3a4b:
            X.C14030oh.A0A(r0, r4)
            return
        L_0x3a4f:
            r0 = -467886844(0xffffffffe41c9d04, float:-1.1556025E22)
            int r2 = X.C14030oh.A03(r0)
            r0 = -388926307(0xffffffffe8d1749d, float:-7.913006E24)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r8 = r1.A00
            X.3Fj r8 = (X.AnonymousClass3Fj) r8
            android.content.Context r9 = r8.A00
            r7 = 2131829641(0x7f112389, float:1.9292257E38)
            com.instagram.service.session.UserSession r5 = r8.A01
            X.0TJ r3 = X.AnonymousClass0TJ.A06
            r0 = 36602291117100864(0x82099700000f40, double:3.210774515826368E-306)
            long r5 = X.C63803iN.A03(r3, r5, r0)
            r0 = 24
            long r5 = r5 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r9, r0, r7)
            X.C04220Ms.A06(r0)
            X.3iD r1 = X.C63733iD.A01()
            r1.A0A = r0
            r1.A0C()
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r1)
            X.36a r0 = r8.A02
            X.0nS r1 = r0.A00
            java.lang.String r0 = "limits_feature_api_call"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2368(0x940, float:3.318E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x3aaf
            java.lang.String r1 = "mass_harassment_auto_enroll_qp"
            java.lang.String r0 = "surface_type"
            r3.A0T(r0, r1)
            r3.Bb4()
        L_0x3aaf:
            r0 = 389948260(0x173e2364, float:6.143698E-25)
            X.C14030oh.A0A(r0, r4)
            r0 = 576866345(0x22624829, float:3.0666913E-18)
            goto L_0x3bb6
        L_0x3aba:
            r2 = -1372799494(0xffffffffae2cbdfa, float:-3.9277005E-11)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1133740027(0xffffffffbc6c8005, float:-0.014434819)
            int r5 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r4 = r1.A00
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r4 = (com.facebook.redex.IDxCListenerShape70S0200000_1_I2) r4
            java.lang.Object r1 = r4.A00
            X.1dd r1 = (X.C23351dd) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x3aee
            X.C18210wN.A0p(r0)
            com.instagram.service.session.UserSession r0 = r1.A00
            X.KHq r3 = X.AnonymousClass3LY.A00(r0)
            java.lang.Object r1 = r4.A01
            X.3DN r1 = (X.AnonymousClass3DN) r1
            X.46S r0 = new X.46S
            r0.<init>(r1)
            r3.CWx(r0)
        L_0x3aee:
            r0 = -281120666(0xffffffffef3e7066, float:-5.8938033E28)
            X.C14030oh.A0A(r0, r5)
            r0 = -1952527978(0xffffffff8b9ec996, float:-6.11627E-32)
            goto L_0x3bb6
        L_0x3af9:
            r2 = 2036549237(0x79634675, float:7.3755027E34)
            int r2 = X.C14030oh.A03(r2)
            X.1Re r0 = (X.C21531Re) r0
            r3 = 278626345(0x109b8029, float:6.133418E-29)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r1 = r1.A00
            X.49j r1 = (X.C696349j) r1
            com.instagram.service.session.UserSession r4 = r1.A02
            com.instagram.user.model.User r1 = X.C18250wR.A0R(r4)
            X.4tf r8 = r1.A0Z()
            if (r8 != 0) goto L_0x3b27
            r0 = -1502681314(0xffffffffa66ee71e, float:-8.288606E-16)
        L_0x3b1f:
            X.C14030oh.A0A(r0, r3)
            r0 = -1238740539(0xffffffffb62a51c5, float:-2.537957E-6)
            goto L_0x3bb6
        L_0x3b27:
            X.3BC r7 = r0.A00
            if (r7 == 0) goto L_0x3b7f
            java.util.List r6 = r7.A03
            java.lang.Integer r5 = r7.A02
            java.lang.Integer r0 = r7.A01
            X.18o r7 = r7.A00
            r9 = 0
            if (r7 == 0) goto L_0x3b37
            r9 = r7
        L_0x3b37:
            X.18m r8 = r8.D2g()
            r8.Ac1()
            java.lang.String r19 = r8.Ahm()
            java.lang.Boolean r10 = r8.AmO()
            java.lang.Boolean r11 = r8.BTI()
            java.lang.Boolean r12 = r8.BUb()
            java.lang.Boolean r13 = r8.BUc()
            java.lang.Boolean r14 = r8.BXf()
            java.lang.Boolean r15 = r8.BYv()
            java.lang.Boolean r16 = r8.BYw()
            r8.ArU()
            r8.B5a()
            java.lang.String r20 = r8.B93()
            r8.B94()
            r21 = r6
            r18 = r5
            r17 = r0
            X.18m r0 = X.C33252Ez.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A1r(r0)
            r1.A1t(r4)
            r0 = 1114640140(0x42700f0c, float:60.014694)
            goto L_0x3b1f
        L_0x3b7f:
            java.lang.String r10 = "response"
            goto L_0x3b84
        L_0x3b82:
            java.lang.String r10 = "interestAccountsAdapter"
        L_0x3b84:
            X.C04220Ms.A0E(r10)
        L_0x3b87:
            r0 = 0
            throw r0
        L_0x3b89:
            r0 = 325668335(0x13694def, float:2.9447159E-27)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1805269056(0xffffffff9465c7c0, float:-1.1600939E-26)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            X.3iD r1 = X.C63733iD.A00()
            r0 = 2131836972(0x7f11402c, float:1.9307126E38)
            X.C63733iD.A07(r3, r1, r0)
            r1.A0C()
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r1)
            r0 = -575806700(0xffffffffddade314, float:-1.56623507E18)
            X.C14030oh.A0A(r0, r4)
            r0 = -67983329(0xfffffffffbf2a81f, float:-2.5198915E36)
        L_0x3bb6:
            X.C14030oh.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0215, code lost:
        r0 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0230, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0234, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03bd, code lost:
        X.C14030oh.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x03c0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 3: goto L_0x0009;
                case 4: goto L_0x0070;
                case 18: goto L_0x0135;
                case 21: goto L_0x0179;
                case 22: goto L_0x01c7;
                case 31: goto L_0x0218;
                case 141: goto L_0x0249;
                case 177: goto L_0x027b;
                case 182: goto L_0x02a5;
                case 183: goto L_0x02e2;
                case 184: goto L_0x031f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onSuccessInBackground(r15)
            return
        L_0x0009:
            r0 = -414590617(0xffffffffe749d967, float:-9.53206E23)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r15 = (X.AnonymousClass5z0) r15
            r1 = -1196767005(0xffffffffb8aac8e3, float:-8.14365E-5)
            int r4 = X.AnonymousClass0wJ.A00(r1, r15)
            java.lang.Object r1 = r15.A01
            X.4vB r1 = (X.C85434vB) r1
            if (r1 == 0) goto L_0x006c
            X.4vZ r3 = r1.BMa()
            if (r3 == 0) goto L_0x006c
            boolean r1 = r3.BO6()
            if (r1 == 0) goto L_0x0057
            boolean r1 = r3.Apm()
            if (r1 == 0) goto L_0x0057
            X.1tl r2 = X.C63873iU.A08(r14)
            X.Ist r1 = X.C35334Ist.BASIC_ADS_TIER_YOUTH
            java.lang.String r3 = r1.toString()
        L_0x003b:
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r2)
            if (r3 != 0) goto L_0x0047
            X.Ist r1 = X.C35334Ist.BASIC_ADS_TIER_NONE
            java.lang.String r3 = r1.toString()
        L_0x0047:
            java.lang.String r1 = "basic_ads_tier"
            X.C18180wK.A0v(r2, r1, r3)
            r1 = -655588463(0xffffffffd8ec8391, float:-2.08039854E15)
        L_0x004f:
            X.C14030oh.A0A(r1, r4)
            r1 = 181056541(0xacab41d, float:1.9519644E-32)
            goto L_0x03bd
        L_0x0057:
            X.1tl r2 = X.C63873iU.A08(r14)
            X.Ist r1 = r3.BGj()
            if (r1 == 0) goto L_0x006a
            X.Ist r1 = r3.BGj()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            goto L_0x003b
        L_0x006a:
            r3 = 0
            goto L_0x003b
        L_0x006c:
            r1 = -416077815(0xffffffffe7332809, float:-8.460421E23)
            goto L_0x004f
        L_0x0070:
            r0 = -894526790(0xffffffffcaae9aba, float:-5721437.0)
            int r0 = X.C14030oh.A03(r0)
            X.1UJ r15 = (X.AnonymousClass1UJ) r15
            r1 = 239610665(0xe482b29, float:2.4672684E-30)
            int r4 = X.C14030oh.A03(r1)
            r5 = 0
            X.C04220Ms.A0B(r15, r5)
            java.lang.Object r6 = r14.A00
            X.4A9 r6 = (X.AnonymousClass4A9) r6
            X.3Vd r3 = r6.A00
            boolean r1 = r3 instanceof X.AnonymousClass1eS
            if (r1 == 0) goto L_0x00ba
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.bloks.util.IgBloksRequestTask.ResponseCallback"
            X.C04220Ms.A0C(r3, r1)
            X.1eS r3 = (X.AnonymousClass1eS) r3
            X.39n r1 = X.AnonymousClass2JY.A00(r15)
            r3.A05(r1)
        L_0x009c:
            X.H8c r1 = r6.A01
            java.lang.String r1 = r1.A0A
            java.lang.String r3 = "com.bloks.www.fx.company-identity-switcher.v1"
            r2 = 0
            boolean r1 = X.AnonymousClass8bP.A0j(r1, r3, r5)
            if (r1 == 0) goto L_0x012a
            boolean r1 = r15 instanceof X.AnonymousClass1eG
            if (r1 == 0) goto L_0x012a
            X.1eG r15 = (X.AnonymousClass1eG) r15
            boolean r1 = X.C63793iM.A07()
            if (r1 == 0) goto L_0x012a
            android.content.SharedPreferences r6 = X.C08340dC.A01(r3)
            goto L_0x00d1
        L_0x00ba:
            boolean r1 = r3 instanceof X.AnonymousClass1eT
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.bloks.util.IgBloksRequestTask.ActionCallback"
            X.C04220Ms.A0C(r3, r1)
            X.1eT r3 = (X.AnonymousClass1eT) r3
            X.39n r2 = X.AnonymousClass2JY.A00(r15)
            boolean r1 = r3.A00
            if (r1 == 0) goto L_0x009c
            r3.A05(r2)
            goto L_0x009c
        L_0x00d1:
            java.io.StringWriter r5 = X.C18230wP.A0d()     // Catch:{ IOException -> 0x0118 }
            X.MMp r3 = X.C18180wK.A0K(r5)     // Catch:{ IOException -> 0x0118 }
            X.5zj r1 = r15.A00     // Catch:{ IOException -> 0x0118 }
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = "layout"
            r3.A0U(r1)     // Catch:{ IOException -> 0x0118 }
            X.5zj r1 = r15.A00     // Catch:{ IOException -> 0x0118 }
            if (r1 == 0) goto L_0x0112
            java.util.Map r2 = r1.A00     // Catch:{ IOException -> 0x0118 }
            X.3TW r1 = X.C95255zj.A01     // Catch:{ IOException -> 0x0118 }
            r1.A01(r3, r2)     // Catch:{ IOException -> 0x0118 }
            X.AnonymousClass3Za.A00(r3, r15)     // Catch:{ IOException -> 0x0118 }
            java.lang.String r3 = X.C18180wK.A0h(r3, r5)     // Catch:{ IOException -> 0x0118 }
            android.content.SharedPreferences$Editor r2 = r6.edit()     // Catch:{ IOException -> 0x0118 }
            java.lang.String r1 = "switcher_app_cache_data"
            android.content.SharedPreferences$Editor r5 = r2.putString(r1, r3)     // Catch:{ IOException -> 0x0118 }
            java.lang.String r3 = "switcher_app_cache_last_data_saved_time"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0118 }
            android.content.SharedPreferences$Editor r3 = r5.putLong(r3, r1)     // Catch:{ IOException -> 0x0118 }
            java.lang.String r2 = "switcher_app_cache_key"
            java.lang.String r1 = X.C60753Qj.A01()     // Catch:{ IOException -> 0x0118 }
            X.C18180wK.A0v(r3, r2, r1)     // Catch:{ IOException -> 0x0118 }
            goto L_0x012a
        L_0x0112:
            java.lang.String r1 = "bloksDataAdapter"
            X.C04220Ms.A0E(r1)     // Catch:{ IOException -> 0x0118 }
            throw r2     // Catch:{ IOException -> 0x0118 }
        L_0x0118:
            r1 = move-exception
            X.0on r3 = X.C10770iu.A00()
            r2 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r1 = r1.getMessage()
            r1.getClass()
            X.C18250wR.A13(r3, r1, r2)
        L_0x012a:
            r1 = -1257104556(0xffffffffb5121b54, float:-5.4429006E-7)
            X.C14030oh.A0A(r1, r4)
            r1 = -1143416307(0xffffffffbbd8da0d, float:-0.0066177906)
            goto L_0x03bd
        L_0x0135:
            r0 = -268689504(0xffffffffeffc1fa0, float:-1.5605691E29)
            int r0 = X.C14030oh.A03(r0)
            r1 = 968621732(0x39bbfea4, float:3.5857141E-4)
            int r4 = X.C14030oh.A03(r1)
            java.lang.Object r3 = r14.A00
            X.1cW r3 = (X.AnonymousClass1cW) r3
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r3.A00
            if (r2 == 0) goto L_0x0215
            java.lang.String r6 = "opt_in_promotional_email"
            r9 = 0
            java.lang.String r7 = r3.A01
            java.lang.String r8 = "opt_in_promotional_email_setting"
            boolean r1 = r3.A03
            if (r1 == 0) goto L_0x0176
            java.lang.String r1 = "on"
        L_0x0158:
            java.util.HashMap r12 = X.C63203gz.A03(r8, r1)
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Bdx(r5)
            boolean r1 = r3.A03
            r3.A02 = r1
            r1 = 319393298(0x13098e12, float:1.7361877E-27)
            X.C14030oh.A0A(r1, r4)
            r1 = 176181156(0xa804fa4, float:1.2355909E-32)
            goto L_0x03bd
        L_0x0176:
            java.lang.String r1 = "off"
            goto L_0x0158
        L_0x0179:
            r0 = -503397201(0xffffffffe1fec4af, float:-5.874557E20)
            int r0 = X.C14030oh.A03(r0)
            r1 = 1350307188(0x507c0d74, float:1.69149604E10)
            int r4 = X.C14030oh.A03(r1)
            java.lang.Object r5 = r14.A00
            X.1ax r5 = (X.C22881ax) r5
            X.0Oa r3 = r5.A0E
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            com.instagram.user.model.User r2 = X.C18250wR.A0R(r1)
            boolean r1 = r5.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A27(r1)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            r2.A1t(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A00
            if (r1 == 0) goto L_0x0215
            java.lang.String r6 = "safety"
            r9 = 0
            java.lang.String r7 = r5.A03
            java.lang.String r8 = "hide_more_comments_setting"
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Bdx(r5)
            r1 = -1143746542(0xffffffffbbd3d012, float:-0.006464013)
            X.C14030oh.A0A(r1, r4)
            r1 = -968983563(0xffffffffc63e7bf5, float:-12190.989)
            goto L_0x03bd
        L_0x01c7:
            r0 = -1842130334(0xffffffff92335262, float:-5.6583985E-28)
            int r0 = X.C14030oh.A03(r0)
            r1 = 1699675456(0x654efd40, float:6.1092446E22)
            int r4 = X.C14030oh.A03(r1)
            java.lang.Object r5 = r14.A00
            X.1ax r5 = (X.C22881ax) r5
            X.0Oa r3 = r5.A0E
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            com.instagram.user.model.User r2 = X.C18250wR.A0R(r1)
            boolean r1 = r5.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A28(r1)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            r2.A1t(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A00
            if (r1 == 0) goto L_0x0215
            java.lang.String r6 = "safety"
            r9 = 0
            java.lang.String r7 = r5.A03
            java.lang.String r8 = "hide_message_requests_setting"
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Bdx(r5)
            r1 = -158284599(0xfffffffff690c4c9, float:-1.468129E33)
            X.C14030oh.A0A(r1, r4)
            r1 = 1108714663(0x4215a4a7, float:37.410793)
            goto L_0x03bd
        L_0x0215:
            java.lang.String r0 = "logger"
            goto L_0x0230
        L_0x0218:
            r0 = 217018337(0xcef6fe1, float:3.6891115E-31)
            int r0 = X.C14030oh.A03(r0)
            r1 = -1644042935(0xffffffff9e01e549, float:-6.876618E-21)
            int r3 = X.C14030oh.A03(r1)
            java.lang.Object r1 = r14.A00
            X.Ibj r1 = (X.C34613Ibj) r1
            com.instagram.service.session.UserSession r1 = r1.A0H
            if (r1 != 0) goto L_0x0235
            java.lang.String r0 = "userSession"
        L_0x0230:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0235:
            X.KHq r2 = X.AnonymousClass3LY.A00(r1)
            java.lang.Integer r1 = X.AnonymousClass006.A1L
            X.C63873iU.A0H(r2, r1)
            r1 = 933479065(0x37a3c299, float:1.952173E-5)
            X.C14030oh.A0A(r1, r3)
            r1 = 578672950(0x227dd936, float:3.4402884E-18)
            goto L_0x03bd
        L_0x0249:
            r0 = 172420358(0xa46ed06, float:9.5779324E-33)
            int r0 = X.C14030oh.A03(r0)
            X.1Sp r15 = (X.C21901Sp) r15
            r1 = -1588882560(0xffffffffa14b9380, float:-6.897429E-19)
            int r4 = X.C14030oh.A03(r1)
            r3 = 0
            X.C04220Ms.A0B(r15, r3)
            super.onSuccessInBackground(r15)
            java.lang.Object r1 = r14.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.3ER r2 = X.C36372Rb.A00(r1)
            int r1 = r15.A00
            int r1 = java.lang.Math.max(r3, r1)
            r2.A00 = r1
            r1 = 1798879116(0x6b38b78c, float:2.2330913E26)
            X.C14030oh.A0A(r1, r4)
            r1 = 2029538506(0x78f84cca, float:4.0288972E34)
            goto L_0x03bd
        L_0x027b:
            r0 = -76384235(0xfffffffffb727815, float:-1.2589714E36)
            int r0 = X.C14030oh.A03(r0)
            r1 = -145840271(0xfffffffff74ea771, float:-4.1914425E33)
            int r5 = X.C14030oh.A03(r1)
            X.1tl r1 = X.C63873iU.A08(r14)
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r1)
            java.lang.String r1 = "last_successful_contact_points_auto_sync"
            X.AnonymousClass0wJ.A12(r2, r1, r3)
            r1 = 878391483(0x345b30bb, float:2.0413692E-7)
            X.C14030oh.A0A(r1, r5)
            r1 = -1406256777(0xffffffffac2e3977, float:-2.4758787E-12)
            goto L_0x03bd
        L_0x02a5:
            r0 = -1610701840(0xffffffff9ffea3f0, float:-1.07844396E-19)
            int r0 = X.C14030oh.A03(r0)
            r1 = -775955793(0xffffffffd1bfdaaf, float:-1.03000957E11)
            int r5 = X.C14030oh.A03(r1)
            java.lang.Object r4 = r14.A00
            X.1as r4 = (X.C22871as) r4
            X.0Oa r3 = r4.A09
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            com.instagram.user.model.User r2 = X.C18250wR.A0R(r1)
            boolean r1 = r4.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A27(r1)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            r2.A1t(r1)
            r1 = 1
            r4.A03 = r1
            X.C22871as.A01(r4)
            r1 = 1038189473(0x3de183a1, float:0.11011434)
            X.C14030oh.A0A(r1, r5)
            r1 = 1502756683(0x59923f4b, float:5.1456172E15)
            goto L_0x03bd
        L_0x02e2:
            r0 = -2115180556(0xffffffff81ece7f4, float:-8.7025545E-38)
            int r0 = X.C14030oh.A03(r0)
            r1 = -811880820(0xffffffffcf9bae8c, float:-5.2238152E9)
            int r5 = X.C14030oh.A03(r1)
            java.lang.Object r4 = r14.A00
            X.1as r4 = (X.C22871as) r4
            X.0Oa r3 = r4.A09
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            com.instagram.user.model.User r2 = X.C18250wR.A0R(r1)
            boolean r1 = r4.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A28(r1)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            r2.A1t(r1)
            r1 = 1
            r4.A06 = r1
            X.C22871as.A01(r4)
            r1 = 1575881963(0x5dee0ceb, float:2.14416793E18)
            X.C14030oh.A0A(r1, r5)
            r1 = -947536820(0xffffffffc785bc4c, float:-68472.59)
            goto L_0x03bd
        L_0x031f:
            r0 = 900921731(0x35b2f983, float:1.3334651E-6)
            int r0 = X.C14030oh.A03(r0)
            X.1TT r15 = (X.AnonymousClass1TT) r15
            r1 = 188356434(0xb3a1752, float:3.583984E-32)
            int r6 = X.C14030oh.A03(r1)
            super.onSuccessInBackground(r15)
            if (r15 == 0) goto L_0x0396
            java.util.List r1 = r15.A02
            java.util.ArrayList r2 = X.C18200wM.A0s(r1)
            java.lang.Object r1 = r14.A00
            com.instagram.common.task.IDxLTaskShape133S0100000_1_I2 r1 = (com.instagram.common.task.IDxLTaskShape133S0100000_1_I2) r1
            java.lang.Object r1 = r1.A00
            X.49j r1 = (X.C696349j) r1
            com.instagram.service.session.UserSession r10 = r1.A02
            X.3am r9 = X.C63043bN.A01
            r1 = 0
            X.C04220Ms.A0B(r10, r1)
            java.lang.String r3 = X.C18220wO.A0p(r2)
            android.content.SharedPreferences r1 = r9.A06(r10)
            android.content.SharedPreferences$Editor r2 = r1.edit()
            java.lang.String r1 = "AGGREGATED_TIME_SPENT_PER_DAY"
            X.C18180wK.A0v(r2, r1, r3)
            java.util.List r1 = r15.A00
            java.util.ArrayList r8 = X.C18200wM.A0s(r1)
            java.util.List r1 = r15.A01
            java.util.ArrayList r11 = X.C18200wM.A0s(r1)
            int r7 = r8.size()
            r5 = 0
        L_0x036c:
            if (r5 >= r7) goto L_0x0396
            java.lang.Object r1 = r8.get(r5)
            java.lang.String r12 = r1.toString()
            java.lang.Object r1 = r11.get(r5)
            long r2 = X.C18190wL.A08(r1)
            r1 = 1
            X.C04220Ms.A0B(r12, r1)
            android.content.SharedPreferences r1 = r9.A06(r10)
            android.content.SharedPreferences$Editor r4 = r1.edit()
            java.lang.String r1 = "AGGREGATED_SCREEN_TIME_BY_SCREEN_"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r12)
            X.AnonymousClass0wJ.A12(r4, r1, r2)
            int r5 = r5 + 1
            goto L_0x036c
        L_0x0396:
            java.lang.Object r1 = r14.A00
            com.instagram.common.task.IDxLTaskShape133S0100000_1_I2 r1 = (com.instagram.common.task.IDxLTaskShape133S0100000_1_I2) r1
            java.lang.Object r5 = r1.A00
            X.49j r5 = (X.C696349j) r5
            com.instagram.service.session.UserSession r4 = r5.A02
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36598752064310212(0x82065f00040bc4, double:3.208536404590938E-306)
            int r2 = X.C63803iN.A01(r3, r4, r1)
            r1 = 30
            int r1 = java.lang.Math.max(r2, r1)
            X.C696349j.A0A(r5, r1)
            r1 = -254634961(0xfffffffff0d2942f, float:-5.2136796E29)
            X.C14030oh.A0A(r1, r6)
            r1 = -271585389(0xffffffffefcfef93, float:-1.2870605E29)
        L_0x03bd:
            X.C14030oh.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2.onSuccessInBackground(java.lang.Object):void");
    }

    public IDxACallbackShape111S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}

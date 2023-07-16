package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass1cB;
import X.AnonymousClass1cS;
import X.AnonymousClass1d0;
import X.AnonymousClass22b;
import X.AnonymousClass3XX;
import X.AnonymousClass3ZJ;
import X.AnonymousClass69F;
import X.C13950oZ;
import X.C14030oh;
import X.C18190wL;
import X.C18250wR;
import X.C23171cc;
import X.C24711ju;
import X.C34238I9r;
import X.C570939s;
import X.C63733iD;
import X.C63873iU;
import X.C84274ss;
import X.E2V;
import X.KJT;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.redex.IDxNActionShape38S0400000_1_I2;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

public class IDxACallbackShape35S0200000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxACallbackShape35S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x066d, code lost:
        X.C14030oh.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0670, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0798, code lost:
        X.C14030oh.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x079b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02b9, code lost:
        r1 = (X.AnonymousClass1j3) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r15) {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0753;
                case 1: goto L_0x06ef;
                case 2: goto L_0x0005;
                case 3: goto L_0x06d5;
                case 4: goto L_0x069b;
                case 5: goto L_0x0685;
                case 6: goto L_0x0671;
                case 7: goto L_0x0663;
                case 8: goto L_0x064d;
                case 9: goto L_0x05fa;
                case 10: goto L_0x059f;
                case 11: goto L_0x0560;
                case 12: goto L_0x0521;
                case 13: goto L_0x04a7;
                case 14: goto L_0x048d;
                case 15: goto L_0x045c;
                case 16: goto L_0x0443;
                case 17: goto L_0x0425;
                case 18: goto L_0x0005;
                case 19: goto L_0x0409;
                case 20: goto L_0x03eb;
                case 21: goto L_0x03d4;
                case 22: goto L_0x03bd;
                case 23: goto L_0x03a6;
                case 24: goto L_0x0390;
                case 25: goto L_0x0340;
                case 26: goto L_0x0005;
                case 27: goto L_0x032d;
                case 28: goto L_0x031a;
                case 29: goto L_0x02dc;
                case 30: goto L_0x029b;
                case 31: goto L_0x027c;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0262;
                case 39: goto L_0x01ff;
                case 40: goto L_0x01e1;
                case 41: goto L_0x01bf;
                case 42: goto L_0x019d;
                case 43: goto L_0x0172;
                case 44: goto L_0x0150;
                case 45: goto L_0x013f;
                case 46: goto L_0x012e;
                case 47: goto L_0x011d;
                case 48: goto L_0x00f9;
                case 49: goto L_0x00bf;
                case 50: goto L_0x0005;
                case 51: goto L_0x0005;
                case 52: goto L_0x0095;
                case 53: goto L_0x0005;
                case 54: goto L_0x0062;
                case 55: goto L_0x002f;
                case 56: goto L_0x002b;
                case 57: goto L_0x0005;
                case 58: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onFail(r15)
            return
        L_0x0009:
            r0 = 752025293(0x2cd2fecd, float:5.9968475E-12)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            java.lang.String r1 = "change_push_notification_settings_failed"
            r0 = 2131837305(0x7f114179, float:1.9307801E38)
            X.C63813iO.A03(r3, r1, r0, r2)
            java.lang.Object r0 = r14.A01
            X.13g r0 = (X.C201313g) r0
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r0.A05
            r0.setChecked(r2)
            r0 = -838386933(0xffffffffce073b0b, float:-5.671984E8)
            goto L_0x066d
        L_0x002b:
            A00(r14, r15)
            return
        L_0x002f:
            r0 = 286424348(0x11127d1c, float:1.1555922E-28)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A01
            java.util.List r0 = (java.util.List) r0
            int r3 = r0.size()
            X.3iD r2 = X.C63733iD.A02()
            java.lang.String r0 = "batch_remove_many_followers_request_failed"
            r2.A0E = r0
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r0)
            r0 = 2131689497(0x7f0f0019, float:1.9008011E38)
            java.lang.String r0 = r1.getQuantityString(r0, r3)
            r2.A0A = r0
            r2.A0C()
            X.C63733iD.A0A(r2)
            r0 = 664061879(0x2794c7b7, float:4.1294783E-15)
            goto L_0x066d
        L_0x0062:
            r0 = -1827920100(0xffffffff930c271c, float:-1.7689767E-27)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A01
            java.util.List r0 = (java.util.List) r0
            int r3 = r0.size()
            X.3iD r2 = X.C63733iD.A02()
            java.lang.String r0 = "batch_follow_many_request_failed"
            r2.A0E = r0
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r0)
            r0 = 2131689496(0x7f0f0018, float:1.900801E38)
            java.lang.String r0 = r1.getQuantityString(r0, r3)
            r2.A0A = r0
            r2.A0C()
            X.C63733iD.A0A(r2)
            r0 = 1766297452(0x69478f6c, float:1.5078346E25)
            goto L_0x066d
        L_0x0095:
            r0 = -1631439549(0xffffffff9ec23543, float:-2.0562578E-20)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1Yk r1 = (X.C22521Yk) r1
            X.2t9 r3 = r1.A02
            if (r3 == 0) goto L_0x00b1
            boolean r1 = r3 instanceof X.C29551yn
            if (r1 == 0) goto L_0x00b1
            X.1yn r3 = (X.C29551yn) r3
            X.601 r2 = r3.A00
            X.6jp r1 = r3.A01
            X.C63893iY.A0G(r2, r1)
        L_0x00b1:
            java.lang.Object r1 = r14.A01
            com.instagram.igds.components.switchbutton.IgSwitch r1 = (com.instagram.igds.components.switchbutton.IgSwitch) r1
            if (r1 == 0) goto L_0x00ba
            r1.A00()
        L_0x00ba:
            r1 = -669385082(0xffffffffd819fe86, float:-6.772738E14)
            goto L_0x0798
        L_0x00bf:
            r0 = 1723828165(0x66bf87c5, float:4.5223825E23)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Throwable r2 = r15.A01
            boolean r1 = r2 instanceof X.AnonymousClass6CK
            if (r1 == 0) goto L_0x00dc
            X.6CK r2 = (X.AnonymousClass6CK) r2
            if (r2 == 0) goto L_0x00dc
            X.8lh r1 = r2.A00()
            if (r1 == 0) goto L_0x00dc
            java.lang.String r2 = r1.getDescription()
            if (r2 != 0) goto L_0x00eb
        L_0x00dc:
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131834837(0x7f1137d5, float:1.9302796E38)
            java.lang.String r2 = X.C18190wL.A0g(r2, r1)
        L_0x00eb:
            r1 = 433(0x1b1, float:6.07E-43)
            java.lang.String r1 = X.I17.A00(r1)
            X.C10450iM.A03(r1, r2)
            r1 = 1257174081(0x4aeef441, float:7830048.5)
            goto L_0x0798
        L_0x00f9:
            r0 = -2104753528(0xffffffff828c0288, float:-2.0572604E-37)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A01
            X.1d0 r4 = (X.AnonymousClass1d0) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r4.A04
            if (r2 == 0) goto L_0x010d
            X.69F r1 = X.AnonymousClass69F.FAILED
            r2.setLoadingStatus(r1)
        L_0x010d:
            com.instagram.ui.widget.spinner.SpinnerImageView r3 = r4.A04
            if (r3 == 0) goto L_0x0118
            java.lang.Object r2 = r14.A00
            r1 = 211(0xd3, float:2.96E-43)
            X.AnonymousClass0wJ.A18(r3, r1, r4, r2)
        L_0x0118:
            r1 = 2013378125(0x7801b64d, float:1.0523497E34)
            goto L_0x0798
        L_0x011d:
            r0 = -1457586167(0xffffffffa91f0009, float:-3.5305123E-14)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.C18240wQ.A1G(r0)
            r0 = -1830902566(0xffffffff92dea4da, float:-1.4050809E-27)
            goto L_0x066d
        L_0x012e:
            r0 = 1331030479(0x4f55e9cf, float:3.58886989E9)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.C18240wQ.A1G(r0)
            r0 = -528740526(0xffffffffe07c0f52, float:-7.2651304E19)
            goto L_0x066d
        L_0x013f:
            r0 = -1588779961(0xffffffffa14d2447, float:-6.9504714E-19)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.C18240wQ.A1G(r0)
            r0 = 1126081714(0x431ea4b2, float:158.64334)
            goto L_0x066d
        L_0x0150:
            r0 = -1154530025(0xffffffffbb2f4517, float:-0.0026744062)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.3ST r1 = (X.AnonymousClass3ST) r1
            r0 = 0
            X.AnonymousClass3ST.A00(r1, r0)
            java.lang.Object r2 = r14.A01
            X.3YL r2 = (X.AnonymousClass3YL) r2
            X.3As r1 = r2.A08
            r0 = 1
            r1.A02 = r0
            r1.A01 = r0
            X.AnonymousClass3YL.A00(r2)
            r0 = 234325512(0xdf78608, float:1.5254817E-30)
            goto L_0x066d
        L_0x0172:
            r0 = 1812600837(0x6c0a1805, float:6.677808E26)
            int r4 = X.C14030oh.A03(r0)
            X.01V r2 = X.AnonymousClass01V.A0p
            r1 = 39059457(0x2540001, float:1.5575301E-37)
            r0 = 3
            r2.markerEnd(r1, r0)
            java.lang.Object r1 = r14.A00
            X.3SS r1 = (X.AnonymousClass3SS) r1
            r0 = 0
            X.AnonymousClass3SS.A00(r1, r0)
            java.lang.Object r2 = r14.A01
            X.3YL r2 = (X.AnonymousClass3YL) r2
            X.3As r1 = r2.A07
            r0 = 1
            r1.A02 = r0
            r1.A01 = r0
            X.AnonymousClass3YL.A00(r2)
            r0 = 1436968651(0x55a666cb, float:2.28700528E13)
            goto L_0x066d
        L_0x019d:
            r0 = -2114968995(0xffffffff81f0225d, float:-8.8211385E-38)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.3SR r1 = (X.AnonymousClass3SR) r1
            r0 = 0
            X.AnonymousClass3SR.A00(r1, r0)
            java.lang.Object r2 = r14.A01
            X.3YL r2 = (X.AnonymousClass3YL) r2
            X.3As r1 = r2.A06
            r0 = 1
            r1.A02 = r0
            r1.A01 = r0
            X.AnonymousClass3YL.A00(r2)
            r0 = 2120136861(0x7e5eb89d, float:7.4011796E37)
            goto L_0x066d
        L_0x01bf:
            r0 = -2072979938(0xffffffff8470d61e, float:-2.8310182E-36)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.3UW r1 = (X.AnonymousClass3UW) r1
            r0 = 0
            X.AnonymousClass3UW.A00(r1, r0)
            java.lang.Object r2 = r14.A01
            X.3YL r2 = (X.AnonymousClass3YL) r2
            X.3As r1 = r2.A05
            r0 = 1
            r1.A02 = r0
            r1.A01 = r0
            X.AnonymousClass3YL.A00(r2)
            r0 = -732206531(0xffffffffd45b6a3d, float:-3.76952088E12)
            goto L_0x066d
        L_0x01e1:
            r0 = -314286786(0xffffffffed445d3e, float:-3.7982366E27)
            int r4 = X.AnonymousClass0wJ.A00(r0, r15)
            super.onFail(r15)
            java.lang.Object r3 = r14.A01
            X.1x8 r3 = (X.AnonymousClass1x8) r3
            java.lang.Object r2 = r14.A00
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18 r0 = new kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18
            r0.<init>(r1, r2, r3)
            X.AnonymousClass1x8.A0E(r3, r0)
            r0 = 627451451(0x2566263b, float:1.9962273E-16)
            goto L_0x066d
        L_0x01ff:
            r0 = 181242079(0xacd88df, float:1.9792267E-32)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A01
            X.3F8 r1 = (X.AnonymousClass3F8) r1
            X.01V r3 = r1.A00
            r2 = 857809457(0x33212231, float:3.751683E-8)
            r1 = 3
            r3.markerEnd(r2, r1)
            java.lang.Object r5 = r14.A00
            X.1uv r5 = (X.C28751uv) r5
            r1 = 2131837305(0x7f114179, float:1.9307801E38)
            java.lang.String r4 = r5.getString(r1)
            java.lang.Object r3 = r15.A00
            r2 = 0
            if (r3 == 0) goto L_0x0234
            r1 = r3
            X.1Sg r1 = (X.C21811Sg) r1
            java.lang.Integer r2 = r1.A00
            X.1j3 r3 = (X.AnonymousClass1j3) r3
            java.lang.String r1 = r3.getErrorMessage()
            if (r1 == 0) goto L_0x0234
            java.lang.String r4 = r3.getErrorMessage()
        L_0x0234:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r2 != r1) goto L_0x025c
            r1 = 2131834036(0x7f1134b4, float:1.930117E38)
            java.lang.String r2 = r5.getString(r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.Dsm r3 = X.C18190wL.A0W(r1)
            r3.A02 = r2
            r3.A0p(r4)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r1 = 154(0x9a, float:2.16E-43)
            X.C18180wK.A1N(r3, r5, r1, r2)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x0257:
            r1 = 423902376(0x19443ca8, float:1.0145212E-23)
            goto L_0x0798
        L_0x025c:
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r1 = r5.A05
            r1.A05(r4)
            goto L_0x0257
        L_0x0262:
            r0 = -619957351(0xffffffffdb0c3399, float:-3.9463229E16)
            int r4 = X.C14030oh.A03(r0)
            r1 = 0
            X.C04220Ms.A0B(r15, r1)
            super.onFail(r15)
            java.lang.Object r0 = r14.A01
            X.1Yp r0 = (X.C22571Yp) r0
            r0.A01(r1)
            r0 = 2011899825(0x77eb27b1, float:9.539022E33)
            goto L_0x066d
        L_0x027c:
            r0 = 1388320646(0x52c01786, float:4.12514189E11)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Integer r2 = X.AnonymousClass006.A1L
            java.lang.Object r0 = r14.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r0 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r0
            java.lang.Object r1 = r0.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r14.A01
            X.3DI r0 = (X.AnonymousClass3DI) r0
            X.4oJ r0 = r0.A07
            X.C60093Nq.A00(r1, r0, r2)
            r0 = 1255299200(0x4ad25880, float:6892608.0)
            goto L_0x066d
        L_0x029b:
            r0 = 1083411352(0x40938b98, float:4.6107903)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Integer r3 = X.AnonymousClass006.A15
            java.lang.Object r2 = r14.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r2 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r2
            java.lang.Object r1 = r2.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r14.A01
            X.3DI r0 = (X.AnonymousClass3DI) r0
            X.4oJ r0 = r0.A07
            X.C60093Nq.A00(r1, r0, r3)
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x02d7
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            java.util.List r0 = r1.mErrorStrings
            if (r0 == 0) goto L_0x02d7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02d7
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            java.util.List r0 = r1.mErrorStrings
            java.lang.Object r2 = X.C18240wQ.A0b(r0)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1 = 1
            java.lang.String r0 = "save_user_error"
            X.C63813iO.A02(r3, r2, r0, r1)
        L_0x02d7:
            r0 = 1254955667(0x4acd1a93, float:6720841.5)
            goto L_0x066d
        L_0x02dc:
            r0 = -1662913038(0xffffffff9ce1f5f2, float:-1.4952826E-21)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r5 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r5
            android.content.Context r4 = r5.getContext()
            if (r4 == 0) goto L_0x02f6
            r3 = 2131836068(0x7f113ca4, float:1.9305292E38)
            r2 = 0
            java.lang.String r1 = "load_user_error"
            X.C63813iO.A03(r4, r1, r3, r2)
        L_0x02f6:
            java.lang.Throwable r1 = r15.A01
            if (r1 != 0) goto L_0x0315
            r7 = 0
        L_0x02fb:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A01
            if (r1 == 0) goto L_0x0310
            java.lang.String r4 = "profile_completion"
            r6 = 0
            java.lang.String r5 = r5.A06
            X.JrQ r3 = new X.JrQ
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.BcB(r3)
        L_0x0310:
            r1 = -2015186821(0xffffffff87e2b07b, float:-3.4108426E-34)
            goto L_0x0798
        L_0x0315:
            java.lang.String r7 = r1.getMessage()
            goto L_0x02fb
        L_0x031a:
            r0 = 1407459932(0x53e4225c, float:1.959658E12)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.3iU r0 = (X.C63873iU) r0
            r0.onFail(r15)
            r0 = 78925183(0x4b44d7f, float:4.2388966E-36)
            goto L_0x066d
        L_0x032d:
            r0 = -1847496171(0xffffffff91e17215, float:-3.556905E-28)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.3aW r0 = (X.C62683aW) r0
            X.C62683aW.A01(r0)
            r0 = 1382858618(0x526cbf7a, float:2.54206181E11)
            goto L_0x066d
        L_0x0340:
            r0 = -478524115(0xffffffffe37a4d2d, float:-4.617247E21)
            int r4 = X.C14030oh.A03(r0)
            super.onFail(r15)
            X.269 r1 = X.AnonymousClass269.A0S
            java.lang.Object r2 = r14.A00
            X.1cc r2 = (X.C23171cc) r2
            com.instagram.service.session.UserSession r0 = r2.A03
            X.3hF r1 = r1.A0B(r0)
            X.265 r0 = X.AnonymousClass265.A12
            X.0rn r1 = r1.A05()
            java.lang.String r0 = r0.A01
            X.C18250wR.A19(r1, r0)
            com.instagram.service.session.UserSession r0 = r2.A03
            X.C18180wK.A1K(r1, r0)
            java.lang.Object r0 = r15.A00
            if (r0 == 0) goto L_0x0389
            X.4vo r0 = (X.C85814vo) r0
            if (r0 == 0) goto L_0x038e
            java.util.List r1 = r0.getErrorStrings()
            if (r1 == 0) goto L_0x038e
            java.lang.String r0 = "\n"
            java.lang.String r1 = X.AnonymousClass0hA.A04(r0, r1)
        L_0x037a:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0384
            java.lang.String r1 = X.C18230wP.A0l(r2)
        L_0x0384:
            com.instagram.registration.ui.NotificationBar r0 = r2.A01
            X.C63553hn.A08(r0, r1)
        L_0x0389:
            r0 = 1875177956(0x6fc4f1e4, float:1.2190298E29)
            goto L_0x066d
        L_0x038e:
            r1 = 0
            goto L_0x037a
        L_0x0390:
            r0 = -1650330025(0xffffffff9da1f657, float:-4.2871055E-21)
            int r4 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.String r1 = "IGUserConsentQueryResponse"
            java.lang.String r0 = "GraphQL Result Failed"
            X.C10450iM.A03(r1, r0)
            r0 = 916160553(0x369b8029, float:4.63428E-6)
            goto L_0x066d
        L_0x03a6:
            r0 = -1007721537(0xffffffffc3ef63bf, float:-478.77927)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.4rh r1 = (X.C83614rh) r1
            if (r1 == 0) goto L_0x03b8
            java.lang.Throwable r0 = r15.A01
            r1.onFailure(r0)
        L_0x03b8:
            r0 = 1586553764(0x5e90e3a4, float:5.2201843E18)
            goto L_0x066d
        L_0x03bd:
            r0 = -489244396(0xffffffffe2d6b914, float:-1.9804698E21)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.4rh r1 = (X.C83614rh) r1
            if (r1 == 0) goto L_0x03cf
            java.lang.Throwable r0 = r15.A01
            r1.onFailure(r0)
        L_0x03cf:
            r0 = -1159709282(0xffffffffbae03d9e, float:-0.0017108207)
            goto L_0x066d
        L_0x03d4:
            r0 = 2100794042(0x7d3792ba, float:1.5250661E37)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.4rh r1 = (X.C83614rh) r1
            if (r1 == 0) goto L_0x03e6
            java.lang.Throwable r0 = r15.A01
            r1.onFailure(r0)
        L_0x03e6:
            r0 = -1918117281(0xffffffff8dabda5f, float:-1.059126E-30)
            goto L_0x066d
        L_0x03eb:
            r0 = 283906769(0x10ec12d1, float:9.311458E-29)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Throwable r1 = r15.A01
            if (r1 != 0) goto L_0x03fd
            java.lang.String r0 = "Unknown error executing GraphQL operation"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
        L_0x03fd:
            java.lang.Object r0 = r14.A01
            X.4rD r0 = (X.C83334rD) r0
            r0.onFailure(r1)
            r0 = -2128347249(0xffffffff8123ff8f, float:-3.0121726E-38)
            goto L_0x066d
        L_0x0409:
            r0 = 1453862362(0x56a82dda, float:9.2457442E13)
            int r4 = X.C14030oh.A03(r0)
            X.01V r2 = X.AnonymousClass01V.A0p
            r1 = 190461770(0xb5a374a, float:4.2026868E-32)
            r0 = 3
            r2.markerEnd(r1, r0)
            java.lang.Object r0 = r14.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C63813iO.A07(r0)
            r0 = 2089743456(0x7c8ef460, float:5.9381013E36)
            goto L_0x066d
        L_0x0425:
            r0 = -1773092453(0xffffffff9650c19b, float:-1.6863197E-25)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A01
            X.3GR r2 = (X.AnonymousClass3GR) r2
            java.lang.Throwable r1 = r15.A01
            if (r1 == 0) goto L_0x0440
            java.lang.String r1 = r1.getMessage()
        L_0x0438:
            r2.onFail(r1)
            r1 = -1570452568(0xffffffffa264cba8, float:-3.1007577E-18)
            goto L_0x0798
        L_0x0440:
            java.lang.String r1 = "gating_manager_unknown_error"
            goto L_0x0438
        L_0x0443:
            r0 = 1523991041(0x5ad64201, float:3.01541085E16)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x0457
            r0.dismiss()
        L_0x0457:
            r0 = 704400057(0x29fc4ab9, float:1.12040104E-13)
            goto L_0x066d
        L_0x045c:
            r0 = 1562885696(0x5d27be40, float:7.5544805E17)
            int r4 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r3 = r14.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.2A8 r2 = X.AnonymousClass2A8.A06
            X.2A9 r1 = X.AnonymousClass2A9.A0E
            X.29h r0 = X.C318729h.NONE
            X.C35722Oo.A00(r0, r1, r2, r3)
            java.lang.Object r1 = r14.A00
            X.34E r1 = (X.AnonymousClass34E) r1
            X.22r r0 = X.C307322r.NONE
            X.1dN r1 = r1.A00
            monitor-enter(r1)
            r1.A06 = r0     // Catch:{ all -> 0x048a }
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x048a }
            X.AnonymousClass1dN.A02(r1)     // Catch:{ all -> 0x048a }
            monitor-exit(r1)
            r0 = -65057756(0xfffffffffc1f4c24, float:-3.308478E36)
            goto L_0x066d
        L_0x048a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x048d:
            r0 = -1529147400(0xffffffffa4db0ff8, float:-9.500316E-17)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A01
            X.433 r1 = (X.AnonymousClass433) r1
            android.app.Activity r4 = r1.A00
            r3 = 0
            r2 = 2131826851(0x7f1118a3, float:1.9286598E38)
            r1 = 0
            X.C63813iO.A03(r4, r3, r2, r1)
            r1 = 472294420(0x1c26a414, float:5.513686E-22)
            goto L_0x0798
        L_0x04a7:
            r0 = -207849587(0xfffffffff39c778d, float:-2.4793185E31)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r2 = r14.A00
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131826865(0x7f1118b1, float:1.9286626E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r8 = X.C63873iU.A09(r15, r1)
            java.lang.Object r3 = r14.A01
            X.1cS r3 = (X.AnonymousClass1cS) r3
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A03
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r1.A0A
            android.widget.EditText r1 = r1.A01
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0516
            X.1ju r1 = r3.A04
            if (r1 == 0) goto L_0x04db
            r1.A00()
        L_0x04db:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A01
            if (r1 == 0) goto L_0x0509
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A03
            com.instagram.model.business.PublicPhoneContact r1 = r1.getSubmitPublicPhoneContact()
            if (r1 == 0) goto L_0x04f6
            java.lang.String r2 = r1.A03
            if (r2 == 0) goto L_0x04f6
            java.lang.String r1 = X.C62983bG.A00()
            r11.put(r1, r2)
        L_0x04f6:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A01
            java.lang.String r5 = "edit_contact_info"
            r9 = 0
            java.lang.String r6 = r3.A08
            java.lang.String r7 = "phone_validation"
            X.JrQ r4 = new X.JrQ
            r10 = r9
            r12 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.BcB(r4)
        L_0x0509:
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A03
            android.widget.TextView r2 = r1.A06
            r1 = 0
            r2.setVisibility(r1)
        L_0x0511:
            r1 = -706941354(0xffffffffd5dcee56, float:-3.03645254E13)
            goto L_0x0798
        L_0x0516:
            android.os.Handler r2 = r3.A0E
            X.4OW r1 = new X.4OW
            r1.<init>(r3)
            r2.post(r1)
            goto L_0x0511
        L_0x0521:
            r0 = 465325023(0x1bbc4bdf, float:3.1151022E-22)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r2 = r14.A01
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            if (r2 == 0) goto L_0x0550
            java.lang.String r4 = "opt_in_promotional_email"
            r5 = 0
            r8 = 0
            r7 = 0
            java.lang.String r6 = "promotional_email_setting"
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x0545
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            if (r1 == 0) goto L_0x0541
            java.lang.String r7 = r1.getErrorMessage()
        L_0x0541:
            if (r1 == 0) goto L_0x0545
            java.lang.String r8 = r1.mErrorType
        L_0x0545:
            X.JrQ r3 = new X.JrQ
            r9 = r5
            r10 = r5
            r11 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.BcB(r3)
        L_0x0550:
            java.lang.Object r1 = r14.A00
            X.3BG r1 = (X.AnonymousClass3BG) r1
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r2 = r1.A03
            X.24p r1 = r1.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r1, r2)
            r1 = 306582118(0x12461266, float:6.250046E-28)
            goto L_0x0798
        L_0x0560:
            r0 = 396414552(0x17a0ce58, float:1.0391846E-24)
            int r0 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r2 = r14.A01
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            if (r2 == 0) goto L_0x058f
            java.lang.String r4 = "opt_in_promotional_email"
            r5 = 0
            r8 = 0
            r7 = 0
            java.lang.String r6 = "user_email"
            java.lang.Object r1 = r15.A00
            if (r1 == 0) goto L_0x0584
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            if (r1 == 0) goto L_0x0580
            java.lang.String r7 = r1.getErrorMessage()
        L_0x0580:
            if (r1 == 0) goto L_0x0584
            java.lang.String r8 = r1.mErrorType
        L_0x0584:
            X.JrQ r3 = new X.JrQ
            r9 = r5
            r10 = r5
            r11 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.BcB(r3)
        L_0x058f:
            java.lang.Object r1 = r14.A00
            X.37Z r1 = (X.AnonymousClass37Z) r1
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r2 = r1.A01
            X.24p r1 = r1.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r1, r2)
            r1 = -827406574(0xffffffffceaec712, float:-1.46614093E9)
            goto L_0x0798
        L_0x059f:
            r0 = -1343741645(0xffffffffafe82133, float:-4.2224144E-10)
            int r0 = X.C14030oh.A03(r0)
            r4 = 0
            X.C04220Ms.A0B(r15, r4)
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x05c1
            X.1j3 r2 = (X.AnonymousClass1j3) r2
            if (r2 == 0) goto L_0x05c1
            java.lang.String r1 = r2.getErrorMessage()
            if (r1 == 0) goto L_0x05c1
            int r1 = r1.length()
            if (r1 == 0) goto L_0x05c1
            r2.getErrorMessage()
        L_0x05c1:
            java.lang.Object r3 = r14.A00
            X.39s r3 = (X.C570939s) r3
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r2 = r3.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A02
            java.lang.String r6 = "profile_display_options"
            r9 = 0
            java.lang.String r7 = r2.A07
            java.lang.String r8 = "save_info"
            java.util.Map r11 = r3.A01
            java.util.Map r12 = r3.A02
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Bdy(r5)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x05eb
            X.E2V r1 = X.E2V.A03(r1)
            r1.setIsLoading(r4)
        L_0x05eb:
            android.content.Context r2 = r2.getContext()
            r1 = 2131826864(0x7f1118b0, float:1.9286624E38)
            X.C63813iO.A00(r2, r1)
            r1 = -2104547345(0xffffffff828f27ef, float:-2.1034882E-37)
            goto L_0x0798
        L_0x05fa:
            r0 = 2107038949(0x7d96dce5, float:2.5066394E37)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131834837(0x7f1137d5, float:1.9302796E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r7 = X.C63483hZ.A03(r15, r1)
            java.lang.Object r1 = r14.A00
            X.3SA r1 = (X.AnonymousClass3SA) r1
            com.instagram.business.fragment.CategorySearchFragment r3 = r1.A00
            r1 = 1
            r3.A0E = r1
            android.view.View r2 = r3.A01
            r1 = 8
            r2.setVisibility(r1)
            boolean r1 = r3.A0P()
            if (r1 == 0) goto L_0x062d
            android.content.Context r1 = r3.getContext()
            X.C63813iO.A01(r1, r7)
        L_0x062d:
            com.instagram.business.fragment.CategorySearchFragment.A06(r3)
            java.lang.String r6 = "suggested_category"
            r8 = 0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r3.A05
            if (r1 == 0) goto L_0x0648
            java.lang.String r4 = X.C18220wO.A0n(r3)
            java.lang.String r5 = r3.A0C
            X.JrQ r3 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.BcB(r3)
        L_0x0648:
            r1 = 1338408982(0x4fc68016, float:6.660566E9)
            goto L_0x0798
        L_0x064d:
            r0 = 2108436982(0x7dac31f6, float:2.8610828E37)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r1 = r14.A00
            X.4ss r1 = (X.C84274ss) r1
            r1.CGF()
            r1 = 1804567574(0x6b8f8416, float:3.470003E26)
            goto L_0x0798
        L_0x0663:
            r0 = 506574289(0x1e31b5d1, float:9.407901E-21)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1682282108(0xffffffff9bba6984, float:-3.0839307E-22)
        L_0x066d:
            X.C14030oh.A0A(r0, r4)
            return
        L_0x0671:
            r0 = -1741753791(0xffffffff982ef241, float:-2.261128E-24)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A01
            X.4rJ r2 = (X.C83394rJ) r2
            r1 = 0
            r2.CBv(r1)
            r1 = -1375425115(0xffffffffae04ada5, float:-3.0167552E-11)
            goto L_0x0798
        L_0x0685:
            r0 = -1895150814(0xffffffff8f0a4b22, float:-6.818395E-30)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.Icx r1 = (X.C34668Icx) r1
            X.4rJ r2 = r1.A02
            r1 = 0
            r2.CBv(r1)
            r1 = 1836432799(0x6d75bd9f, float:4.7533166E27)
            goto L_0x0798
        L_0x069b:
            r0 = 829952977(0x317813d1, float:3.6100014E-9)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r5 = r14.A00
            X.3z7 r5 = (X.AnonymousClass3z7) r5
            com.instagram.service.session.UserSession r3 = r5.A02
            com.facebook.common.callercontext.CallerContext r2 = X.AnonymousClass3z7.A06
            java.lang.String r1 = "ig_professional_instant_experiences"
            boolean r1 = X.C61853Wb.A01(r2, r3, r1)
            if (r1 == 0) goto L_0x06d0
            java.lang.Object r4 = r14.A01
            X.3zb r3 = X.C67463zb.A00()
            java.lang.Class<X.14j> r2 = X.C203614j.class
            java.lang.String r1 = "FbAutoFillQuery"
            X.3zc r2 = X.C67473zc.A00(r3, r2, r1)
            java.lang.String r1 = ""
            X.H8c r2 = X.C18220wO.A0X(r2, r1)
            r1 = 3
            X.C63873iU.A0F(r2, r5, r4, r1)
            X.C31155GhB.A03(r2)
        L_0x06d0:
            r1 = 1131064594(0x436aad12, float:234.67606)
            goto L_0x0798
        L_0x06d5:
            r0 = 1470240491(0x57a216eb, float:3.56438631E14)
            int r0 = X.C14030oh.A03(r0)
            super.onFail(r15)
            java.lang.Object r2 = r14.A00
            X.3z7 r2 = (X.AnonymousClass3z7) r2
            java.lang.Object r1 = r14.A01
            X.4oZ r1 = (X.C81894oZ) r1
            X.AnonymousClass3z7.A00(r1, r2)
            r1 = -1806160111(0xffffffff94582f11, float:-1.0914495E-26)
            goto L_0x0798
        L_0x06ef:
            r0 = -1152210672(0xffffffffbb52a910, float:-0.0032144226)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1cB r5 = (X.AnonymousClass1cB) r5
            android.content.Context r4 = r5.getContext()
            java.lang.Object r2 = r15.A00
            if (r2 == 0) goto L_0x074e
            X.4vo r2 = (X.C85814vo) r2
            java.lang.String r1 = r2.getErrorMessage()
            if (r1 == 0) goto L_0x074e
            java.lang.String r3 = r2.getErrorMessage()
            java.lang.String r2 = r2.getErrorTitle()
            X.Dsm r1 = X.C18190wL.A0W(r4)
            if (r2 == 0) goto L_0x071a
            r1.A02 = r2
        L_0x071a:
            r1.A0p(r3)
            X.C18180wK.A1M(r1)
            X.C18200wM.A1O(r1)
            X.AnonymousClass0wJ.A1K(r1)
        L_0x0726:
            X.1fJ r4 = r5.A00
            java.lang.Object r3 = r14.A01
            X.378 r3 = (X.AnonymousClass378) r3
            X.4Mm r1 = r3.A01
            java.lang.String r2 = r1.A01()
            boolean r1 = r3.A00
            r1 = r1 ^ 1
            r4.A09(r2, r1)
            java.lang.String r1 = "ig_manage_main_account_failure"
            X.0rn r2 = X.C15730rn.A00(r5, r1)
            X.AnonymousClass1cB.A02(r5, r2)
            X.AnonymousClass1cB.A03(r5, r2)
            com.instagram.service.session.UserSession r1 = r5.A03
            X.C32592Cl.A00(r2, r1)
            r1 = 882552583(0x349aaf07, float:2.8812084E-7)
            goto L_0x0798
        L_0x074e:
            r1 = 0
            X.AnonymousClass3JQ.A00(r4, r1)
            goto L_0x0726
        L_0x0753:
            r0 = 1228831712(0x493e7be0, float:780222.0)
            int r0 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1cA r5 = (X.AnonymousClass1cA) r5
            com.instagram.service.session.UserSession r4 = r5.A01
            java.lang.Object r1 = r14.A01
            X.4Mm r1 = (X.C72144Mm) r1
            java.lang.String r1 = r1.A01()
            java.lang.Long r3 = X.AnonymousClass0wJ.A0d(r1)
            X.0nS r2 = X.C18220wO.A0W(r4)
            java.lang.String r1 = "ig_my_main_account_disconnect_failure"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 1358(0x54e, float:1.903E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            X.C77494gf.A00(r2, r4)
            java.lang.String r1 = "account_id_clicked"
            r2.A0S(r1, r3)
            r2.Bb4()
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x0795
            android.content.Context r2 = r5.getContext()
            r1 = 0
            X.AnonymousClass3JQ.A00(r2, r1)
        L_0x0795:
            r1 = -584823558(0xffffffffdd244cfa, float:-7.3994452E17)
        L_0x0798:
            X.C14030oh.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2.onFail(X.3XX):void");
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A02) {
            case 1:
                i = C14030oh.A03(1105283699);
                AnonymousClass1cB.A04((AnonymousClass1cB) this.A00, false);
                i2 = 1651426000;
                break;
            case 8:
                i = C14030oh.A03(-346091613);
                ((C84274ss) this.A00).CGO();
                i2 = -1387450625;
                break;
            case 10:
                i = C14030oh.A03(164106423);
                super.onFinish();
                i2 = -1005608004;
                break;
            case 13:
                i = C14030oh.A03(-1854478953);
                super.onFinish();
                i2 = -305261743;
                break;
            case 25:
                i = C14030oh.A03(-1184075735);
                super.onFinish();
                ((C23171cc) this.A00).A02.A00();
                i2 = 766049046;
                break;
            case 28:
                i = C14030oh.A03(-1383872657);
                ((C63873iU) this.A00).onFinish();
                i2 = 278165428;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                i = C14030oh.A03(-1399173952);
                C18250wR.A1C(this.A01);
                i2 = -1453414987;
                break;
            case 30:
                i = C14030oh.A03(38441120);
                IDxNActionShape38S0400000_1_I2 iDxNActionShape38S0400000_1_I2 = (IDxNActionShape38S0400000_1_I2) this.A00;
                ((AnonymousClass3ZJ) iDxNActionShape38S0400000_1_I2.A00).A08("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", iDxNActionShape38S0400000_1_I2.A03);
                i2 = -180936490;
                break;
            case 31:
                i = C14030oh.A03(39120559);
                IDxNActionShape38S0400000_1_I2 iDxNActionShape38S0400000_1_I22 = (IDxNActionShape38S0400000_1_I2) this.A00;
                ((AnonymousClass3ZJ) iDxNActionShape38S0400000_1_I22.A00).A08("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", iDxNActionShape38S0400000_1_I22.A03);
                i2 = 1128980705;
                break;
            default:
                super.onFinish();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A02) {
            case 8:
                i = C14030oh.A03(1072067456);
                ((C84274ss) this.A00).CGY();
                i2 = 1075215178;
                break;
            case 10:
                i = C14030oh.A03(118895285);
                super.onStart();
                FragmentActivity activity = ((C570939s) this.A00).A00.getActivity();
                if (activity != null) {
                    E2V.A03(activity).setIsLoading(true);
                }
                i2 = -1947437854;
                break;
            case 13:
                i = C14030oh.A03(507359463);
                super.onStart();
                C24711ju r0 = ((AnonymousClass1cS) this.A01).A04;
                if (r0 != null) {
                    r0.A01();
                }
                i2 = 188222089;
                break;
            case 25:
                i = C14030oh.A03(-343369802);
                super.onStart();
                ((C23171cc) this.A00).A02.A01();
                i2 = -1213781165;
                break;
            case 28:
                i = C14030oh.A03(-298189317);
                ((C63873iU) this.A00).onStart();
                i2 = -821933443;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                i = C14030oh.A03(1001602252);
                C13950oZ.A00((Dialog) this.A01);
                i2 = 764052155;
                break;
            case 30:
                i = C14030oh.A03(-691633101);
                E2V.A03((Activity) ((IDxNActionShape38S0400000_1_I2) this.A00).A01).setIsLoading(true);
                i2 = -116075534;
                break;
            case 34:
                i = C14030oh.A03(-348589902);
                super.onStart();
                i2 = -1691180947;
                break;
            case 48:
                i = C14030oh.A03(393553148);
                SpinnerImageView spinnerImageView = ((AnonymousClass1d0) this.A01).A04;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
                }
                i2 = 290454673;
                break;
            default:
                super.onStart();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            int r2 = r1.A02
            switch(r2) {
                case 0: goto L_0x13bf;
                case 1: goto L_0x138d;
                case 2: goto L_0x1369;
                case 3: goto L_0x12b5;
                case 4: goto L_0x1258;
                case 5: goto L_0x11cb;
                case 6: goto L_0x1198;
                case 7: goto L_0x115e;
                case 8: goto L_0x1118;
                case 9: goto L_0x1063;
                case 10: goto L_0x1002;
                case 11: goto L_0x0fb5;
                case 12: goto L_0x0f06;
                case 13: goto L_0x0eb2;
                case 14: goto L_0x0e69;
                case 15: goto L_0x0c1f;
                case 16: goto L_0x0bf0;
                case 17: goto L_0x0bb3;
                case 18: goto L_0x0b71;
                case 19: goto L_0x0b36;
                case 20: goto L_0x0b16;
                case 21: goto L_0x0ab6;
                case 22: goto L_0x0a6d;
                case 23: goto L_0x0a1a;
                case 24: goto L_0x09c2;
                case 25: goto L_0x0953;
                case 26: goto L_0x08de;
                case 27: goto L_0x0848;
                case 28: goto L_0x07d1;
                case 29: goto L_0x0795;
                case 30: goto L_0x0745;
                case 31: goto L_0x070f;
                case 32: goto L_0x06d1;
                case 33: goto L_0x0693;
                case 34: goto L_0x066c;
                case 35: goto L_0x0601;
                case 36: goto L_0x120b;
                case 37: goto L_0x05b7;
                case 38: goto L_0x055b;
                case 39: goto L_0x0507;
                case 40: goto L_0x04e4;
                case 41: goto L_0x0451;
                case 42: goto L_0x0404;
                case 43: goto L_0x0363;
                case 44: goto L_0x0316;
                case 45: goto L_0x02f8;
                case 46: goto L_0x02da;
                case 47: goto L_0x02bc;
                case 48: goto L_0x0c78;
                case 49: goto L_0x02a3;
                case 50: goto L_0x0241;
                case 51: goto L_0x01e7;
                case 52: goto L_0x01b9;
                case 53: goto L_0x0188;
                case 54: goto L_0x0134;
                case 55: goto L_0x008d;
                case 56: goto L_0x0089;
                case 57: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onSuccess(r0)
            return
        L_0x000d:
            r2 = -1586528555(0xffffffffa16f7ed5, float:-8.114421E-19)
            int r2 = X.C14030oh.A03(r2)
            X.1Tx r0 = (X.C22231Tx) r0
            r3 = 497037946(0x1da0327a, float:4.240384E-21)
            int r5 = X.C14030oh.A03(r3)
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            java.util.List r0 = r0.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x0027:
            boolean r0 = r8.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r8.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2) r0
            java.lang.Object r4 = r0.A00
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0027
            java.lang.Object r0 = r4.get(r7)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r3 = r0.A01
            java.lang.String r0 = "live_broadcast"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0027
            java.util.Iterator r4 = r4.iterator()
        L_0x0052:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r4.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r3 = r0.A03
            if (r3 != 0) goto L_0x0064
            java.lang.String r3 = "off"
        L_0x0064:
            java.lang.Object r0 = r0.A00
            boolean r0 = X.C18190wL.A1Z(r0, r6)
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.A01
            X.3HS r0 = (X.AnonymousClass3HS) r0
            r0.A00 = r3
            goto L_0x0052
        L_0x0073:
            java.lang.Object r0 = r1.A01
            X.3HS r0 = (X.AnonymousClass3HS) r0
            r0.A01 = r6
            java.lang.Object r0 = r1.A00
            X.C18240wQ.A1G(r0)
            r0 = 914903992(0x368853b8, float:4.062862E-6)
            X.C14030oh.A0A(r0, r5)
            r0 = 326930498(0x137c9042, float:3.1877996E-27)
            goto L_0x1431
        L_0x0089:
            A01(r1, r0)
            return
        L_0x008d:
            r0 = -157797331(0xfffffffff698342d, float:-1.54353E33)
            int r6 = X.C14030oh.A03(r0)
            r0 = -1998255991(0xffffffff88e50889, float:-1.3784443E-33)
            int r7 = X.C14030oh.A03(r0)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x00a7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r3 = X.C18180wK.A0k(r5)
            java.lang.Object r2 = r1.A00
            X.CUH r2 = (X.CUH) r2
            X.Dnj r0 = r2.A06
            if (r0 != 0) goto L_0x00c1
            com.instagram.service.session.UserSession r0 = r2.A04
            X.Dnj r0 = X.AnonymousClass6VR.A00(r0)
            r2.A06 = r0
        L_0x00c1:
            com.instagram.user.model.User r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x00a7
            r4.add(r0)
            goto L_0x00a7
        L_0x00cb:
            java.lang.Object r3 = r1.A00
            X.CUH r3 = (X.CUH) r3
            X.CW6 r5 = r3.A09
            java.util.Iterator r2 = r4.iterator()
        L_0x00d5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r5.A0f
            r0.remove(r1)
            goto L_0x00d5
        L_0x00e5:
            r5.A09()
            com.instagram.service.session.UserSession r0 = r3.A04
            X.0Ok r2 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r2.A01(r0)
            java.lang.Integer r1 = r0.A0n()
            if (r1 == 0) goto L_0x010e
            com.instagram.service.session.UserSession r0 = r3.A04
            com.instagram.user.model.User r2 = r2.A01(r0)
            int r1 = r1.intValue()
            int r0 = r4.size()
            int r1 = r1 - r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.MeW r0 = r2.A05
            r0.ClE(r1)
        L_0x010e:
            int r5 = r4.size()
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r3)
            r2 = 2131689498(0x7f0f001a, float:1.9008013E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1 = 0
            java.lang.String r0 = X.C18230wP.A0j(r3, r0, r2, r5)
            X.C63813iO.A0D(r4, r0, r1)
            r0 = 358891252(0x15643ef4, float:4.6093895E-26)
            X.C14030oh.A0A(r0, r7)
            r0 = -1963534237(0xffffffff8af6d863, float:-2.3770334E-32)
            goto L_0x1254
        L_0x0134:
            r0 = -731541044(0xffffffffd46591cc, float:-3.94397431E12)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1285595248(0x4ca0a070, float:8.4214656E7)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x014a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.String r3 = X.C18180wK.A0k(r5)
            java.lang.Object r4 = r1.A00
            X.CUH r4 = (X.CUH) r4
            X.Dnj r0 = r4.A06
            if (r0 != 0) goto L_0x0164
            com.instagram.service.session.UserSession r0 = r4.A04
            X.Dnj r0 = X.AnonymousClass6VR.A00(r0)
            r4.A06 = r0
        L_0x0164:
            com.instagram.user.model.User r3 = r0.A03(r3)
            if (r3 == 0) goto L_0x014a
            com.instagram.service.session.UserSession r0 = r4.A04
            X.Drj r0 = X.C37088JkK.A00(r0)
            r0.A0D(r3)
            goto L_0x014a
        L_0x0174:
            java.lang.Object r0 = r1.A00
            X.CUH r0 = (X.CUH) r0
            X.CW6 r0 = r0.A09
            r0.A09()
            r0 = -1388179878(0xffffffffad420e5a, float:-1.103081E-11)
            X.C14030oh.A0A(r0, r6)
            r0 = -727026680(0xffffffffd4aa7408, float:-5.856729E12)
            goto L_0x1431
        L_0x0188:
            r0 = 848982377(0x329a7169, float:1.7979533E-8)
            int r6 = X.C14030oh.A03(r0)
            r0 = -2011903827(0xffffffff8814c8ad, float:-4.4773023E-34)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A00
            X.CUH r4 = (X.CUH) r4
            android.content.Context r3 = r4.getContext()
            r2 = 2131834761(0x7f113789, float:1.9302641E38)
            r0 = 0
            X.C63813iO.A0A(r3, r2, r0)
            X.CW6 r2 = r4.A09
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.A0B(r0)
            r0 = -44825417(0xfffffffffd5404b7, float:-1.7613801E37)
            X.C14030oh.A0A(r0, r5)
            r0 = 228319037(0xd9bdf3d, float:9.606355E-31)
            goto L_0x1254
        L_0x01b9:
            r0 = 652610107(0x26e60a3b, float:1.5962229E-15)
            int r6 = X.C14030oh.A03(r0)
            r0 = -1854785174(0xffffffff9172396a, float:-1.9108126E-28)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            X.1Yk r0 = (X.C22521Yk) r0
            X.2t9 r2 = r0.A02
            if (r2 == 0) goto L_0x01dc
            boolean r0 = r2 instanceof X.C29551yn
            if (r0 == 0) goto L_0x01dc
            X.1yn r2 = (X.C29551yn) r2
            X.601 r1 = r2.A00
            X.6jp r0 = r2.A02
            X.C63893iY.A0G(r1, r0)
        L_0x01dc:
            r0 = -51403758(0xfffffffffcefa412, float:-9.9542935E36)
            X.C14030oh.A0A(r0, r3)
            r0 = 1628825977(0x6115e979, float:1.7283677E20)
            goto L_0x1254
        L_0x01e7:
            r2 = 1448526539(0x5656c2cb, float:5.9033029E13)
            int r6 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = 1009056391(0x3c24fa87, float:0.010069496)
            int r4 = X.C14030oh.A03(r2)
            if (r0 == 0) goto L_0x0236
            java.lang.Object r8 = r0.A01
            if (r8 == 0) goto L_0x0236
            X.3Ih r8 = (X.C58933Ih) r8
            java.lang.Class<X.14v> r7 = X.C204814v.class
            java.lang.String r5 = "page_set_visibility"
            X.3Ih r0 = r8.A00(r7, r5)
            if (r0 == 0) goto L_0x0236
            X.3Ih r3 = r8.A00(r7, r5)
            java.lang.Class<X.14u> r2 = X.C204714u.class
            java.lang.String r0 = "page"
            X.3Ih r0 = r3.A00(r2, r0)
            if (r0 == 0) goto L_0x0236
            X.3Ih r2 = X.C63873iU.A05(r8, r7, r2, r5)
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x0236
            java.lang.Object r2 = r1.A00
            X.1Yz r2 = (X.C22671Yz) r2
            java.lang.Object r0 = r1.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.String r0 = r0.A18()
            r2.BpC(r0)
        L_0x0236:
            r0 = -1235071241(0xffffffffb6624ef7, float:-3.3722588E-6)
            X.C14030oh.A0A(r0, r4)
            r0 = 1393636316(0x531133dc, float:6.2364031E11)
            goto L_0x1254
        L_0x0241:
            r2 = 988829837(0x3af0588d, float:0.0018336937)
            int r6 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = 872721554(0x3404ac92, float:1.2356239E-7)
            int r7 = X.C14030oh.A03(r2)
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x0298
            X.3Ih r4 = (X.C58933Ih) r4
            java.lang.Class<X.14q> r3 = X.C204314q.class
            java.lang.String r2 = "page"
            X.3Ih r0 = r4.A00(r3, r2)
            if (r0 == 0) goto L_0x0298
            X.3Ih r0 = r4.A00(r3, r2)
            org.json.JSONObject r2 = r0.A00
            java.lang.String r0 = "is_manually_unpublished"
            boolean r0 = r2.optBoolean(r0)
            if (r0 == 0) goto L_0x0298
            java.lang.Object r5 = r1.A00
            X.0yP r5 = (X.C19000yP) r5
            com.instagram.service.session.UserSession r4 = r5.A0P
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36313987142387468(0x8103610000070c, double:3.0284499213106915E-306)
            boolean r0 = X.C63803iN.A0E(r0, r4, r2)
            if (r0 == 0) goto L_0x0298
            r0 = 1
            r5.A0D = r0
            android.widget.TextView r2 = r5.A01
            r2.getClass()
            r0 = 2131835776(0x7f113b80, float:1.93047E38)
            r2.setText(r0)
            java.lang.Object r1 = r1.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 0
            r1.setChecked(r0)
        L_0x0298:
            r0 = -1586102651(0xffffffffa175fe85, float:-8.3346083E-19)
            X.C14030oh.A0A(r0, r7)
            r0 = 1793494592(0x6ae68e40, float:1.3936235E26)
            goto L_0x1254
        L_0x02a3:
            r0 = 1441323945(0x55e8dba9, float:3.20037664E13)
            int r6 = X.C14030oh.A03(r0)
            r0 = -600256396(0xffffffffdc38d074, float:-2.08082369E17)
            int r1 = X.C14030oh.A03(r0)
            r0 = 1988435633(0x76851eb1, float:1.349996E33)
            X.C14030oh.A0A(r0, r1)
            r0 = 496045290(0x1d910cea, float:3.8394533E-21)
            goto L_0x1254
        L_0x02bc:
            r0 = 784129754(0x2ebcdeda, float:8.5888366E-11)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1091445176(0x410e21b8, float:8.883232)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A01
            X.C18240wQ.A1G(r0)
            r0 = 872697828(0x34044fe4, float:1.2322522E-7)
            X.C14030oh.A0A(r0, r3)
            r0 = 1564927580(0x5d46e65c, float:8.9576525E17)
            goto L_0x1431
        L_0x02da:
            r0 = 502103049(0x1ded7c09, float:6.2861627E-21)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1801535524(0xffffffff949ebfdc, float:-1.6029598E-26)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A01
            X.C18240wQ.A1G(r0)
            r0 = 960177352(0x393b24c8, float:1.7847412E-4)
            X.C14030oh.A0A(r0, r3)
            r0 = 1934905840(0x735451f0, float:1.6821729E31)
            goto L_0x1431
        L_0x02f8:
            r0 = 1108777229(0x4216990d, float:37.649464)
            int r2 = X.C14030oh.A03(r0)
            r0 = 2122994248(0x7e8a5248, float:9.193035E37)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A01
            X.C18240wQ.A1G(r0)
            r0 = 1887071899(0x707a6e9b, float:3.1001987E29)
            X.C14030oh.A0A(r0, r3)
            r0 = 140912863(0x86628df, float:6.926115E-34)
            goto L_0x1431
        L_0x0316:
            r2 = -1654948728(0xffffffff9d5b7c88, float:-2.904879E-21)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 2111125690(0x7dd538ba, float:3.5427513E37)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            X.3ST r4 = (X.AnonymousClass3ST) r4
            r3 = 0
            X.AnonymousClass3ST.A00(r4, r3)
            java.lang.Object r5 = r1.A01
            X.3YL r5 = (X.AnonymousClass3YL) r5
            X.3As r4 = r5.A08
            r3 = 1
            r4.A02 = r3
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x0361
            X.4ux r1 = (X.C85374ux) r1
            X.4uw r0 = r1.Akd()
            if (r0 == 0) goto L_0x0361
            X.4uw r0 = r1.Akd()
            java.lang.String r0 = r0.AqY()
            if (r0 == 0) goto L_0x0361
        L_0x034d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.A00 = r0
            X.AnonymousClass3YL.A00(r5)
            r0 = -1695283871(0xffffffff9af40561, float:-1.00924725E-22)
            X.C14030oh.A0A(r0, r6)
            r0 = -649851563(0xffffffffd9440d55, float:-3.44898463E15)
            goto L_0x1431
        L_0x0361:
            r3 = 0
            goto L_0x034d
        L_0x0363:
            r2 = 1256002870(0x4add1536, float:7244443.0)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -776739624(0xffffffffd1b3e4d8, float:-9.6579813E10)
            int r3 = X.C14030oh.A03(r3)
            X.01V r6 = X.AnonymousClass01V.A0p
            r5 = 39059457(0x2540001, float:1.5575301E-37)
            r4 = 2
            r6.markerEnd(r5, r4)
            java.lang.Object r5 = r1.A00
            X.3SS r5 = (X.AnonymousClass3SS) r5
            r4 = 0
            X.AnonymousClass3SS.A00(r5, r4)
            java.lang.Object r4 = r1.A01
            X.3YL r4 = (X.AnonymousClass3YL) r4
            X.3As r5 = r4.A07
            r1 = 1
            r5.A02 = r1
            if (r0 == 0) goto L_0x03f6
            java.lang.Object r8 = r0.A01
            if (r8 == 0) goto L_0x03f6
            X.4v4 r8 = (X.AnonymousClass4v4) r8
            X.4vX r0 = r8.Atr()
            if (r0 == 0) goto L_0x03f6
            X.4vX r0 = r8.Atr()
            X.4v6 r0 = r0.A9X()
            X.4v5 r7 = r0.B0G()
            r6 = 0
            if (r7 == 0) goto L_0x03db
            X.4vX r0 = r8.Atr()
            X.4v9 r0 = r0.A9Z()
            X.4v8 r1 = r0.AtG()
            if (r1 == 0) goto L_0x03f6
            com.google.common.collect.ImmutableList r0 = r7.B0N()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03da
            com.google.common.collect.ImmutableList r0 = r1.Aeb()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03da
            X.4vX r0 = r8.Atr()
            X.4v7 r0 = r0.A9Y()
            X.4uF r0 = r0.B0Q()
            if (r0 == 0) goto L_0x03db
        L_0x03da:
            r6 = 1
        L_0x03db:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            if (r1 == 0) goto L_0x03f6
            r5.A00 = r1
            com.instagram.service.session.UserSession r0 = r4.A02
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            boolean r5 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "has_stored_payment_info"
            X.AnonymousClass0wJ.A13(r1, r0, r5)
        L_0x03f6:
            X.AnonymousClass3YL.A00(r4)
            r0 = 172097668(0xa420084, float:9.340857E-33)
            X.C14030oh.A0A(r0, r3)
            r0 = 821492003(0x30f6f923, float:1.7969665E-9)
            goto L_0x1431
        L_0x0404:
            r2 = -1720619243(0xffffffff99716f15, float:-1.2481841E-23)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -352113427(0xffffffffeb032ced, float:-1.5858144E26)
            int r7 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            X.3SR r4 = (X.AnonymousClass3SR) r4
            r3 = 0
            X.AnonymousClass3SR.A00(r4, r3)
            java.lang.Object r6 = r1.A01
            X.3YL r6 = (X.AnonymousClass3YL) r6
            X.3As r5 = r6.A06
            r1 = 1
            r5.A02 = r1
            if (r0 == 0) goto L_0x0443
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x0443
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.Class<com.instagram.graphql.instagramschema.IgDonationsEligibilityQueryResponseImpl$Me> r3 = com.instagram.graphql.instagramschema.IgDonationsEligibilityQueryResponseImpl.Me.class
            java.lang.String r1 = "me"
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r1, r3)
            if (r0 == 0) goto L_0x0443
            com.facebook.pando.TreeJNI r1 = r4.getTreeValue(r1, r3)
            java.lang.String r0 = "can_viewer_donate"
            java.lang.Boolean r0 = X.C18250wR.A0S(r1, r0)
            r5.A00 = r0
        L_0x0443:
            X.AnonymousClass3YL.A00(r6)
            r0 = 1922491874(0x7296e5e2, float:5.977685E30)
            X.C14030oh.A0A(r0, r7)
            r0 = -133758524(0xfffffffff80701c4, float:-1.0953061E34)
            goto L_0x1431
        L_0x0451:
            r2 = 923286831(0x37083d2f, float:8.120477E-6)
            int r3 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = 546322486(0x20903836, float:2.4431746E-19)
            int r4 = X.C14030oh.A03(r2)
            java.lang.Object r2 = r1.A00
            X.3UW r2 = (X.AnonymousClass3UW) r2
            r5 = 0
            X.AnonymousClass3UW.A00(r2, r5)
            java.lang.Object r7 = r1.A01
            X.3YL r7 = (X.AnonymousClass3YL) r7
            X.3As r6 = r7.A05
            r2 = 1
            r6.A02 = r2
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x04a6
            X.4uu r1 = (X.C85344uu) r1
            X.4ut r0 = r1.Atp()
            if (r0 == 0) goto L_0x04a6
            X.4ut r0 = r1.Atp()
            X.4us r0 = r0.B0F()
            if (r0 == 0) goto L_0x04a6
            X.4ut r0 = r1.Atp()
            X.4us r0 = r0.B0F()
            boolean r0 = r0.B0R()
            if (r0 == 0) goto L_0x04a6
        L_0x0496:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.A00 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04d4
            X.3ST r6 = r7.A0A
            monitor-enter(r6)
            goto L_0x04a8
        L_0x04a6:
            r2 = 0
            goto L_0x0496
        L_0x04a8:
            boolean r0 = r6.A01     // Catch:{ all -> 0x04cf }
            if (r0 != 0) goto L_0x04cd
            r0 = 1
            X.AnonymousClass3ST.A00(r6, r0)     // Catch:{ all -> 0x04d1 }
            X.3zb r2 = X.C67463zb.A00()     // Catch:{ all -> 0x04d1 }
            java.lang.Class<X.16F> r1 = X.AnonymousClass16F.class
            java.lang.String r0 = "IGRiskAppealCase"
            X.3zc r1 = X.C67473zc.A00(r2, r1, r0)     // Catch:{ all -> 0x04d1 }
            com.instagram.service.session.UserSession r0 = r6.A00     // Catch:{ all -> 0x04d1 }
            X.H8c r2 = X.C18180wK.A0R(r1, r0)     // Catch:{ all -> 0x04d1 }
            r0 = 44
            X.C63873iU.A0F(r2, r6, r7, r0)     // Catch:{ all -> 0x04d1 }
            r1 = 219(0xdb, float:3.07E-43)
            r0 = 3
            X.C31155GhB.A05(r2, r1, r0, r5, r5)     // Catch:{ all -> 0x04d1 }
        L_0x04cd:
            monitor-exit(r6)
            goto L_0x04d7
        L_0x04cf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04d1 }
        L_0x04d1:
            r2 = move-exception
            monitor-exit(r6)
            throw r2
        L_0x04d4:
            X.AnonymousClass3YL.A00(r7)
        L_0x04d7:
            r0 = 751374243(0x2cc90fa3, float:5.7144996E-12)
            X.C14030oh.A0A(r0, r4)
            r0 = -1080897905(0xffffffffbf92ce8f, float:-1.1469287)
            X.C14030oh.A0A(r0, r3)
            return
        L_0x04e4:
            r2 = -862253118(0xffffffffcc9b0fc2, float:-8.1296912E7)
            int r2 = X.C14030oh.A03(r2)
            r3 = 1713907370(0x662826aa, float:1.985177E23)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            super.onSuccess(r0)
            java.lang.Object r0 = r1.A01
            X.1x8 r0 = (X.AnonymousClass1x8) r0
            X.AnonymousClass1x8.A0D(r0)
            r0 = -1081763449(0xffffffffbf859987, float:-1.0437478)
            X.C14030oh.A0A(r0, r3)
            r0 = -387565191(0xffffffffe8e63979, float:-8.697636E24)
            goto L_0x1431
        L_0x0507:
            r0 = -1500593868(0xffffffffa68ec134, float:-9.905597E-16)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1171813291(0xffffffffba278c55, float:-6.3914555E-4)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A01
            X.3F8 r0 = (X.AnonymousClass3F8) r0
            X.01V r4 = r0.A00
            r3 = 857809457(0x33212231, float:3.751683E-8)
            r0 = 2
            r4.markerEnd(r3, r0)
            java.lang.Object r3 = r1.A00
            X.1uv r3 = (X.C28751uv) r3
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r3.A05
            r0.A04()
            android.widget.EditText r0 = r3.A02
            X.C09860go.A0I(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            com.instagram.service.session.UserSession r0 = r3.A04
            X.Drz r5 = X.C18180wK.A0Q(r1, r0)
            X.C18190wL.A10()
            java.lang.String r4 = r3.A06
            X.1uu r3 = new X.1uu
            r3.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "email"
            r1.putString(r0, r4)
            X.C18180wK.A0x(r1, r3, r5)
            r0 = -64494585(0xfffffffffc27e407, float:-3.486954E36)
            X.C14030oh.A0A(r0, r6)
            r0 = 850267702(0x32ae0e36, float:2.0262728E-8)
            goto L_0x1431
        L_0x055b:
            r2 = 176296021(0xa821055, float:1.2524688E-32)
            int r2 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r3 = -2137407791(0xffffffff8099bed1, float:-1.4119283E-38)
            int r4 = X.C14030oh.A03(r3)
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            super.onSuccess(r0)
            java.lang.Object r6 = r1.A01
            X.1Yp r6 = (X.C22571Yp) r6
            r6.A01(r5)
            java.lang.Object r1 = r1.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r3 = r1.getId()
            X.0Oa r1 = r6.A08
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            java.lang.String r1 = r1.getUserId()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x05ac
            java.lang.Object r0 = r0.D7H()
            X.33G r0 = (X.AnonymousClass33G) r0
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x05ac
            if (r1 <= 0) goto L_0x05ac
            com.instagram.igds.components.textcell.IgdsListCell r0 = r6.A00
            if (r0 == 0) goto L_0x05ac
            r0.setVisibility(r5)
        L_0x05ac:
            r0 = 1890569899(0x70afceab, float:4.352778E29)
            X.C14030oh.A0A(r0, r4)
            r0 = 918518195(0x36bf79b3, float:5.7064112E-6)
            goto L_0x1431
        L_0x05b7:
            r2 = 1514671500(0x5a480d8c, float:1.40774726E16)
            int r2 = X.C14030oh.A03(r2)
            X.1Se r0 = (X.C21791Se) r0
            r3 = -1279251300(0xffffffffb3c02c9c, float:-8.948811E-8)
            int r5 = X.C14030oh.A03(r3)
            int r0 = r0.A00
            java.lang.String r4 = java.lang.Integer.toString(r0)
            java.lang.Object r3 = r1.A01
            X.3Xk r3 = (X.C62153Xk) r3
            if (r0 != 0) goto L_0x05f6
            r0 = 0
            r3.A04 = r0
        L_0x05d6:
            java.lang.Object r0 = r1.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            X.1wp r1 = r0.A03
            X.EvB r0 = r1.getAdapter()
            if (r0 == 0) goto L_0x05eb
            X.EvB r0 = r1.getAdapter()
            X.Luu r0 = (X.C41030Luu) r0
            r0.notifyDataSetChanged()
        L_0x05eb:
            r0 = -2141193521(0xffffffff805ffacf, float:-8.814345E-39)
            X.C14030oh.A0A(r0, r5)
            r0 = -1100135064(0xffffffffbe6d4568, float:-0.23171008)
            goto L_0x1431
        L_0x05f6:
            java.lang.CharSequence r0 = r3.A04
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x05d6
            r3.A04 = r4
            goto L_0x05d6
        L_0x0601:
            r2 = 1992493227(0x76c308ab, float:1.9778783E33)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = -570736305(0xffffffffddfb414f, float:-2.26310485E18)
            int r5 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            X.3DU r3 = r0.A00
            if (r3 == 0) goto L_0x0661
            java.lang.Object r8 = r1.A00
            X.1cm r8 = (X.C23211cm) r8
            java.util.Date r3 = r3.A0G
            r8.A0C = r3
            r7 = 0
            java.lang.Object r1 = r1.A01     // Catch:{ 2Ah -> 0x0653 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ 2Ah -> 0x0653 }
            android.content.Context r1 = r1.getContext()     // Catch:{ 2Ah -> 0x0653 }
            com.facebook.phonenumbers.PhoneNumberUtil r10 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r1)     // Catch:{ 2Ah -> 0x0653 }
            X.3DU r1 = r0.A00     // Catch:{ 2Ah -> 0x0653 }
            java.lang.String r1 = r1.A0E     // Catch:{ 2Ah -> 0x0653 }
            X.4Np r9 = r10.A0A(r1, r7)     // Catch:{ 2Ah -> 0x0653 }
            com.instagram.registration.model.RegFlowExtras r6 = r8.A04     // Catch:{ 2Ah -> 0x0653 }
            X.3DU r1 = r0.A00     // Catch:{ 2Ah -> 0x0653 }
            java.lang.String r1 = r1.A0E     // Catch:{ 2Ah -> 0x0653 }
            r6.A0K = r1     // Catch:{ 2Ah -> 0x0653 }
            long r3 = r9.A02     // Catch:{ 2Ah -> 0x0653 }
            java.lang.String r1 = java.lang.Long.toString(r3)     // Catch:{ 2Ah -> 0x0653 }
            r6.A0L = r1     // Catch:{ 2Ah -> 0x0653 }
            int r4 = r9.A00     // Catch:{ 2Ah -> 0x0653 }
            java.lang.String r3 = r10.A0B(r4)     // Catch:{ 2Ah -> 0x0653 }
            com.instagram.phonenumber.model.CountryCodeData r1 = new com.instagram.phonenumber.model.CountryCodeData     // Catch:{ 2Ah -> 0x0653 }
            r1.<init>(r4, r3)     // Catch:{ 2Ah -> 0x0653 }
            r6.A01 = r1     // Catch:{ 2Ah -> 0x0653 }
            goto L_0x0659
        L_0x0653:
            com.instagram.registration.model.RegFlowExtras r1 = r8.A04
            r1.A0L = r7
            r1.A0K = r7
        L_0x0659:
            com.instagram.registration.model.RegFlowExtras r1 = r8.A04
            X.3DU r0 = r0.A00
            java.lang.String r0 = r0.A07
            r1.A0I = r0
        L_0x0661:
            r0 = -1109908750(0xffffffffbdd822f2, float:-0.1055354)
            X.C14030oh.A0A(r0, r5)
            r0 = 1646659517(0x622607bd, float:7.656793E20)
            goto L_0x1431
        L_0x066c:
            r2 = 1198580435(0x4770e2d3, float:61666.824)
            int r6 = X.C14030oh.A03(r2)
            X.1SU r0 = (X.AnonymousClass1SU) r0
            r2 = 2115248727(0x7e142257, float:4.922601E37)
            int r2 = X.AnonymousClass0wJ.A00(r2, r0)
            super.onSuccess(r0)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0688
            java.lang.NullPointerException r2 = X.C18200wM.A0d()
            throw r2
        L_0x0688:
            r0 = 1732304232(0x6740dd68, float:9.107786E23)
            X.C14030oh.A0A(r0, r2)
            r0 = -1866281294(0xffffffff90c2ceb2, float:-7.683797E-29)
            goto L_0x1254
        L_0x0693:
            r2 = 446984337(0x1aa47091, float:6.801067E-23)
            int r2 = X.C14030oh.A03(r2)
            r3 = -1989070374(0xffffffff897131da, float:-2.903276E-33)
            int r6 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r3 = r1.A00
            X.BPz r3 = (X.C20134BPz) r3
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r0 = r3.A08
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment.A0G(r0)
            X.IcN r5 = r3.A04
            android.content.Context r4 = r5.requireContext()
            r3 = 2131832815(0x7f112fef, float:1.9298694E38)
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.BK7()
            r1 = 0
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r5, r0, r3)
            X.C63813iO.A0D(r4, r0, r1)
            r0 = 732037502(0x2ba2017e, float:1.1511206E-12)
            X.C14030oh.A0A(r0, r6)
            r0 = 1417574983(0x547e7a47, float:4.37189267E12)
            goto L_0x1431
        L_0x06d1:
            r2 = 398467439(0x17c0216f, float:1.2416149E-24)
            int r2 = X.C14030oh.A03(r2)
            r3 = 1722182783(0x66a66c7f, float:3.929571E23)
            int r6 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r3 = r1.A00
            X.BPz r3 = (X.C20134BPz) r3
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r0 = r3.A08
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment.A0G(r0)
            X.IcN r5 = r3.A04
            android.content.Context r4 = r5.requireContext()
            r3 = 2131832814(0x7f112fee, float:1.9298692E38)
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.BK7()
            r1 = 0
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r5, r0, r3)
            X.C63813iO.A0D(r4, r0, r1)
            r0 = -897133825(0xffffffffca86d2ff, float:-4417919.5)
            X.C14030oh.A0A(r0, r6)
            r0 = 2131396239(0x7f0a868f, float:1.8413213E38)
            goto L_0x1431
        L_0x070f:
            r2 = 1072870063(0x3ff2b2af, float:1.896078)
            int r2 = X.C14030oh.A03(r2)
            X.1Rw r0 = (X.C21711Rw) r0
            r3 = 951424128(0x38b59480, float:8.658413E-5)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Integer r5 = X.AnonymousClass006.A1C
            java.lang.Object r4 = r1.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r4 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r4
            java.lang.Object r3 = r4.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r1 = r1.A01
            X.3DI r1 = (X.AnonymousClass3DI) r1
            X.4oJ r1 = r1.A07
            X.C60093Nq.A00(r3, r1, r5)
            java.lang.Object r1 = r4.A03
            X.3D9 r1 = (X.AnonymousClass3D9) r1
            com.instagram.user.model.User r0 = r0.A00
            r1.A04 = r0
            r0 = 1111718317(0x424379ad, float:48.868824)
            X.C14030oh.A0A(r0, r6)
            r0 = 331718150(0x13c59e06, float:4.9885615E-27)
            goto L_0x1431
        L_0x0745:
            r2 = -1820920059(0xffffffff9376f705, float:-3.1171355E-27)
            int r2 = X.C14030oh.A03(r2)
            X.1Ti r0 = (X.C22091Ti) r0
            r3 = -1404387848(0xffffffffac4abdf8, float:-2.881138E-12)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Integer r3 = X.AnonymousClass006.A0u
            java.lang.Object r5 = r1.A00
            com.facebook.redex.IDxNActionShape38S0400000_1_I2 r5 = (com.facebook.redex.IDxNActionShape38S0400000_1_I2) r5
            java.lang.Object r7 = r5.A02
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            java.lang.Object r1 = r1.A01
            X.3DI r1 = (X.AnonymousClass3DI) r1
            X.4oJ r1 = r1.A07
            X.C60093Nq.A00(r7, r1, r3)
            X.0Ok r4 = X.C06810aP.A01
            com.instagram.user.model.User r3 = r4.A01(r7)
            java.lang.Object r5 = r5.A03
            X.3D9 r5 = (X.AnonymousClass3D9) r5
            X.3DU r1 = r5.A01
            java.lang.String r1 = r1.A09
            r3.A2B(r1)
            com.instagram.user.model.User r4 = r4.A01(r7)
            X.3DU r1 = r5.A01
            java.lang.String r3 = r1.A05
            X.MeW r1 = r4.A05
            r1.CiH(r3)
            com.instagram.user.model.User r0 = r0.A00
            r5.A04 = r0
            r0 = 135695980(0x8168e6c, float:4.53064E-34)
            X.C14030oh.A0A(r0, r6)
            r0 = -535588325(0xffffffffe013921b, float:-4.2534365E19)
            goto L_0x1431
        L_0x0795:
            r2 = 2111132820(0x7dd55494, float:3.544559E37)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = -1088299999(0xffffffffbf21dc21, float:-0.63226515)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r1 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r1
            X.3DU r0 = r0.A00
            r1.A02 = r0
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A00(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A01
            if (r0 == 0) goto L_0x07c6
            java.lang.String r5 = "profile_completion"
            r7 = 0
            java.lang.String r6 = r1.A06
            X.JrQ r4 = new X.JrQ
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.BcA(r4)
        L_0x07c6:
            r0 = -136005650(0xfffffffff7e4b7ee, float:-9.2779236E33)
            X.C14030oh.A0A(r0, r3)
            r0 = -1070933650(0xffffffffc02ad96e, float:-2.6695209)
            goto L_0x1431
        L_0x07d1:
            r2 = 905710110(0x35fc0a1e, float:1.8778408E-6)
            int r2 = X.C14030oh.A03(r2)
            X.1TY r0 = (X.AnonymousClass1TY) r0
            r3 = 612110592(0x247c1100, float:5.465819E-17)
            int r4 = X.C14030oh.A03(r3)
            java.lang.String r3 = r0.A01
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0819
            com.instagram.common.typedurl.ImageUrl r3 = r0.A00
            boolean r3 = X.AnonymousClass3WG.A02(r3)
            if (r3 != 0) goto L_0x0819
            java.lang.String r3 = r0.A02
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0819
            java.lang.String r3 = r0.A03
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0819
            java.lang.Object r6 = r1.A01
            X.1cj r6 = (X.AnonymousClass1cj) r6
            com.instagram.registration.model.RegFlowExtras r5 = r6.A0I
            boolean r3 = r5.A0s
            if (r3 == 0) goto L_0x082b
            java.lang.String r5 = r5.A0K
            X.3GG r3 = r6.A0D
            java.lang.String r3 = r3.A00()
            boolean r3 = X.C32572Cj.A00(r5, r3)
            if (r3 == 0) goto L_0x082b
        L_0x0819:
            java.lang.Object r1 = r1.A00
            X.3iU r1 = (X.C63873iU) r1
            r1.onSuccess(r0)
        L_0x0820:
            r0 = -1937812637(0xffffffff8c7f5363, float:-1.9669579E-31)
            X.C14030oh.A0A(r0, r4)
            r0 = -18331013(0xfffffffffee84a7b, float:-1.5438381E38)
            goto L_0x1431
        L_0x082b:
            X.0bf r8 = r6.A0M
            java.lang.String r10 = r0.A02
            java.lang.String r11 = r0.A03
            java.lang.String r12 = r0.A01
            com.instagram.common.typedurl.ImageUrl r7 = r0.A00
            X.265 r9 = r6.BDt()
            r3 = 43
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r5 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r5.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r0)
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r13 = r0.A0A
            X.AnonymousClass3R7.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0820
        L_0x0848:
            r2 = 1260897593(0x4b27c539, float:1.0995001E7)
            int r6 = X.C14030oh.A03(r2)
            X.1SJ r0 = (X.AnonymousClass1SJ) r0
            r2 = 984577888(0x3aaf7760, float:0.0013387017)
            int r4 = X.C14030oh.A03(r2)
            X.44X r2 = X.AnonymousClass44X.A00()
            java.lang.Object r9 = r1.A01
            X.0i6 r9 = (X.C10300i6) r9
            java.lang.String r3 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            java.lang.String r8 = r2.A03(r9, r3)
            X.44X r2 = X.AnonymousClass44X.A00()
            java.lang.String r7 = r2.A02(r9, r3)
            X.3DU r2 = r0.A00
            if (r2 == 0) goto L_0x08a9
            if (r8 == 0) goto L_0x08a9
            if (r7 == 0) goto L_0x08a9
            java.lang.Object r5 = r1.A00
            X.3aW r5 = (X.C62683aW) r5
            X.1s2 r2 = r5.A00
            if (r2 == 0) goto L_0x08a0
            X.44X r2 = X.AnonymousClass44X.A00()
            java.lang.String r3 = r2.A02(r9, r3)
            X.1s2 r2 = r5.A00
            java.lang.String r2 = r2.A02
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 != 0) goto L_0x08a0
            X.1s2 r2 = r5.A00
            X.3DU r2 = r2.A00
            java.lang.String r3 = r2.A0F
            X.3DU r2 = r0.A00
            java.lang.String r2 = r2.A0F
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x08a9
        L_0x08a0:
            X.3DU r3 = r0.A00
            X.1s2 r2 = new X.1s2
            r2.<init>(r3, r8, r7)
            r5.A00 = r2
        L_0x08a9:
            r2 = 1
            java.util.ArrayList r3 = X.C18240wQ.A0k(r2)
            java.lang.Object r2 = r1.A00
            X.3aW r2 = (X.C62683aW) r2
            X.1s2 r1 = r2.A00
            if (r1 == 0) goto L_0x08b9
            r3.add(r1)
        L_0x08b9:
            java.util.concurrent.CopyOnWriteArrayList r1 = r2.A03
            r1.getClass()
            r2.A03(r3, r1)
            X.KHr r2 = X.C38040KHr.A01
            X.3DU r0 = r0.A00
            if (r0 == 0) goto L_0x08dc
            java.lang.String r1 = r0.A0F
        L_0x08c9:
            X.45H r0 = new X.45H
            r0.<init>(r1)
            r2.CWx(r0)
            r0 = -1084810636(0xffffffffbf571a74, float:-0.8402474)
            X.C14030oh.A0A(r0, r4)
            r0 = 1237996560(0x49ca5410, float:1657474.0)
            goto L_0x1254
        L_0x08dc:
            r1 = 0
            goto L_0x08c9
        L_0x08de:
            r2 = -506027758(0xffffffffe1d6a112, float:-4.949012E20)
            int r2 = X.C14030oh.A03(r2)
            X.1Tx r0 = (X.C22231Tx) r0
            r3 = 82257522(0x4e72672, float:5.4343145E-36)
            int r6 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A01
            X.49F r3 = (X.AnonymousClass49F) r3
            X.3ES r8 = r3.A03
            java.util.List r0 = r0.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x08fa:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0948
            java.lang.Object r5 = r7.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2) r5
            java.lang.String r4 = r5.A06
            android.content.Context r3 = r8.A00
            r0 = 2131831895(0x7f112c57, float:1.9296829E38)
            java.lang.String r0 = r3.getString(r0)
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 == 0) goto L_0x08fa
            java.lang.Object r0 = r5.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x091f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0948
            java.lang.Object r4 = r5.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r4
            java.lang.String r3 = r4.A01
            java.lang.String r0 = "likes"
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 == 0) goto L_0x091f
            java.lang.Object r0 = r4.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0948
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0948
            java.lang.Object r0 = r1.A00
            X.C18240wQ.A1G(r0)
        L_0x0948:
            r0 = -420657279(0xffffffffe6ed4781, float:-5.6025994E23)
            X.C14030oh.A0A(r0, r6)
            r0 = -1471157005(0xffffffffa84fecf3, float:-1.15421885E-14)
            goto L_0x1431
        L_0x0953:
            r2 = 1367924822(0x5188e056, float:7.3484911E10)
            int r2 = X.C14030oh.A03(r2)
            r3 = -459175669(0xffffffffe4a1890b, float:-2.3838406E22)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r5 = r1.A00
            X.1cc r5 = (X.C23171cc) r5
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0978
            android.content.Context r4 = r5.getContext()
            r0 = 2131832177(0x7f112d71, float:1.92974E38)
            X.C63813iO.A00(r4, r0)
        L_0x0978:
            X.269 r4 = X.AnonymousClass269.A0T
            com.instagram.service.session.UserSession r0 = r5.A03
            X.3hF r0 = r4.A0B(r0)
            X.265 r9 = X.AnonymousClass265.A12
            X.0rn r4 = r0.A05()
            java.lang.String r0 = r9.A01
            X.C18250wR.A19(r4, r0)
            com.instagram.service.session.UserSession r0 = r5.A03
            X.C18180wK.A1K(r4, r0)
            java.lang.Object r4 = r1.A01
            X.0kW r4 = (X.C11630kW) r4
            com.instagram.service.session.UserSession r0 = r5.A03
            X.0Ok r1 = X.C06810aP.A01
            java.lang.String r10 = X.C18200wM.A0k(r0, r1)
            android.widget.EditText r0 = r5.A00
            java.lang.String r11 = X.AnonymousClass0wJ.A0n(r0)
            com.instagram.service.session.UserSession r0 = r5.A03
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.common.typedurl.ImageUrl r7 = r0.B4M()
            com.instagram.service.session.UserSession r6 = r5.A03
            X.4Dv r8 = new X.4Dv
            r8.<init>(r4, r5)
            r12 = 0
            X.C551031t.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -260721280(0xfffffffff075b580, float:-3.0417299E29)
            X.C14030oh.A0A(r0, r3)
            r0 = 358499644(0x155e453c, float:4.488716E-26)
            goto L_0x1431
        L_0x09c2:
            r1 = -489869004(0xffffffffe2cd3134, float:-1.892564E21)
            int r2 = X.C14030oh.A03(r1)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r1 = -651979540(0xffffffffd92394ec, float:-2.87776016E15)
            int r4 = X.C14030oh.A03(r1)
            if (r0 == 0) goto L_0x0a0f
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0a0f
            X.4v3 r3 = (X.AnonymousClass4v3) r3
            X.4vh r0 = r3.AoG()
            if (r0 == 0) goto L_0x0a0f
            X.4vh r0 = r3.AoG()
            boolean r0 = r0.BO3()
            if (r0 == 0) goto L_0x0a0f
            X.4vh r0 = r3.AoG()
            boolean r0 = r0.Ald()
            if (r0 == 0) goto L_0x0a0f
            X.4vh r0 = r3.AoG()
            boolean r1 = r0.BOi()
            r0 = 1
            if (r1 == 0) goto L_0x0a09
            X.4vh r0 = r3.AoG()
            boolean r0 = r0.BGJ()
            r0 = r0 ^ 1
        L_0x0a09:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass3R2.A00 = r0
        L_0x0a0f:
            r0 = 342504773(0x146a3545, float:1.18244865E-26)
            X.C14030oh.A0A(r0, r4)
            r0 = -717149873(0xffffffffd541294f, float:-1.32739477E13)
            goto L_0x1431
        L_0x0a1a:
            r2 = -784546259(0xffffffffd13cc62d, float:-5.0673668E10)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -753706961(0xffffffffd313582f, float:-6.3283967E11)
            int r7 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0a62
            X.4ur r3 = (X.C85314ur) r3
            X.4vN r0 = r3.Ao1()
            if (r0 == 0) goto L_0x0a62
            X.4vN r0 = r3.Ao1()
            int r6 = r0.getCount()
            java.lang.Object r5 = r1.A01
            X.1tl r5 = (X.C28161tl) r5
            r4 = 1
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r5)
            java.lang.String r0 = "browser_autofill_contact_synced"
            X.AnonymousClass0wJ.A13(r3, r0, r4)
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r5)
            java.lang.String r0 = "browser_consecutive_decline_autofill"
            X.AnonymousClass0wJ.A11(r3, r0, r6)
            java.lang.Object r1 = r1.A00
            X.4rh r1 = (X.C83614rh) r1
            if (r1 == 0) goto L_0x0a62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.CNK(r0)
        L_0x0a62:
            r0 = -54001237(0xfffffffffcc801ab, float:-8.3079456E36)
            X.C14030oh.A0A(r0, r7)
            r0 = 1466671263(0x576ba09f, float:2.59075095E14)
            goto L_0x1431
        L_0x0a6d:
            r2 = -1887706230(0xffffffff8f7be38a, float:-1.2419078E-29)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1717803004(0x666397fc, float:2.686952E23)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0aab
            X.4uq r3 = (X.C85304uq) r3
            X.4vg r0 = r3.Ao0()
            if (r0 == 0) goto L_0x0aab
            X.4vg r0 = r3.Ao0()
            int r4 = r0.AZ8()
            java.lang.Object r0 = r1.A01
            X.1tl r0 = (X.C28161tl) r0
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r0)
            java.lang.String r0 = "browser_consecutive_decline_autofill"
            X.AnonymousClass0wJ.A11(r3, r0, r4)
            java.lang.Object r1 = r1.A00
            X.4rh r1 = (X.C83614rh) r1
            if (r1 == 0) goto L_0x0aab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.CNK(r0)
        L_0x0aab:
            r0 = -1756451708(0xffffffff974eac84, float:-6.6779935E-25)
            X.C14030oh.A0A(r0, r5)
            r0 = -2012838601(0xffffffff88068537, float:-4.048075E-34)
            goto L_0x1431
        L_0x0ab6:
            r2 = 1059451560(0x3f25f2a8, float:0.6482339)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = -2096709231(0xffffffff8306c191, float:-3.9601264E-37)
            int r7 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x0b0b
            X.4uq r4 = (X.C85304uq) r4
            X.4vg r0 = r4.Ao0()
            if (r0 == 0) goto L_0x0b0b
            java.lang.Object r0 = r1.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.1tl r3 = X.AnonymousClass3WS.A01(r0)
            X.4vg r0 = r4.Ao0()
            boolean r6 = r0.Aq3()
            X.4vg r0 = r4.Ao0()
            int r5 = r0.B0M()
            android.content.SharedPreferences r4 = r3.A00
            android.content.SharedPreferences$Editor r3 = r4.edit()
            java.lang.String r0 = "browser_autofill_payment_opt_in"
            X.AnonymousClass0wJ.A13(r3, r0, r6)
            android.content.SharedPreferences$Editor r3 = r4.edit()
            java.lang.String r0 = "browser_autofill_payment_decline_count"
            X.AnonymousClass0wJ.A11(r3, r0, r5)
            java.lang.Object r1 = r1.A00
            X.4rh r1 = (X.C83614rh) r1
            if (r1 == 0) goto L_0x0b0b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.CNK(r0)
        L_0x0b0b:
            r0 = 1474918366(0x57e977de, float:5.1340207E14)
            X.C14030oh.A0A(r0, r7)
            r0 = -2001641954(0xffffffff88b15e1e, float:-1.0674927E-33)
            goto L_0x1431
        L_0x0b16:
            r2 = -1997865620(0xffffffff88eafd6c, float:-1.4142942E-33)
            int r2 = X.C14030oh.A03(r2)
            r3 = -692327760(0xffffffffd6bbeab0, float:-1.03308325E14)
            int r3 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A01
            X.4rD r1 = (X.C83334rD) r1
            r1.onSuccess(r0)
            r0 = 1753606808(0x6885ea98, float:5.059218E24)
            X.C14030oh.A0A(r0, r3)
            r0 = 1176777566(0x4624335e, float:10508.842)
            goto L_0x1431
        L_0x0b36:
            r0 = 429321911(0x1996eeb7, float:1.5606053E-23)
            int r2 = X.C14030oh.A03(r0)
            r0 = -993557327(0xffffffffc4c784b1, float:-1596.1466)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r1.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.C35442Nl.A00(r0, r3)
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r3)
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r1.A28(r0)
            r1.A1t(r3)
            X.01V r3 = X.AnonymousClass01V.A0p
            r1 = 190461770(0xb5a374a, float:4.2026868E-32)
            r0 = 2
            r3.markerEnd(r1, r0)
            r0 = 595493390(0x237e820e, float:1.3796908E-17)
            X.C14030oh.A0A(r0, r4)
            r0 = -683483325(0xffffffffd742df43, float:-2.14264158E14)
            goto L_0x1431
        L_0x0b71:
            r0 = -1995980789(0xffffffff8907c00b, float:-1.6340332E-33)
            int r2 = X.C14030oh.A03(r0)
            r0 = 544107406(0x206e6b8e, float:2.0194971E-19)
            int r7 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r1.A01
            X.10S r6 = (X.AnonymousClass10S) r6
            X.4qz r5 = r6.A07
            r4 = 0
            r0 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7 r3 = X.C18240wQ.A0n(r6, r4, r0)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r3, r5, r0)
            java.lang.Object r0 = r1.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.KHq r3 = X.AnonymousClass3LY.A00(r0)
            java.util.List r0 = X.AnonymousClass10S.A00(r6)
            int r1 = r0.size()
            X.46L r0 = new X.46L
            r0.<init>(r1)
            r3.CWx(r0)
            r0 = 2126560771(0x7ec0be03, float:1.2809919E38)
            X.C14030oh.A0A(r0, r7)
            r0 = -1793819567(0xffffffff95147c51, float:-2.998643E-26)
            goto L_0x1431
        L_0x0bb3:
            r0 = -1936966886(0xffffffff8c8c3b1a, float:-2.1605986E-31)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1137980729(0xffffffffbc2bcac7, float:-0.010485358)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r1.A00
            X.3hX r5 = (X.C63473hX) r5
            X.1tl r0 = r5.A03
            r4 = 0
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r0)
            java.lang.String r0 = "has_interop_enable"
            X.AnonymousClass0wJ.A13(r3, r0, r4)
            X.KHq r3 = r5.A01
            r5.A06()
            X.45j r0 = new X.45j
            r0.<init>()
            r3.CWx(r0)
            java.lang.Object r0 = r1.A01
            X.3GR r0 = (X.AnonymousClass3GR) r0
            r0.onSuccess()
            r0 = -931672342(0xffffffffc877ceea, float:-253755.66)
            X.C14030oh.A0A(r0, r6)
            r0 = 1833008388(0x6d417d04, float:3.7426088E27)
            goto L_0x1431
        L_0x0bf0:
            r0 = -1591806852(0xffffffffa11ef47c, float:-5.3856055E-19)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1744855251(0xffffffff97ff9f2d, float:-1.651917E-24)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x0c0b
            r0.dismiss()
        L_0x0c0b:
            java.lang.Object r0 = r1.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x0c14
            r0.invoke()
        L_0x0c14:
            r0 = 1006960460(0x3c04ff4c, float:0.008117508)
            X.C14030oh.A0A(r0, r3)
            r0 = 1703064088(0x6582b218, float:7.714911E22)
            goto L_0x1431
        L_0x0c1f:
            r2 = -533684045(0xffffffffe030a0b3, float:-5.0909477E19)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1556768799(0x5cca681f, float:4.55779421E17)
            int r4 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            if (r0 == 0) goto L_0x0c5a
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0c5a
            X.4uc r3 = (X.C85164uc) r3
            X.4ub r0 = r3.AkX()
            if (r0 == 0) goto L_0x0c5a
            X.4ub r0 = r3.AkX()
            X.22r r0 = r0.BJm()
            if (r0 == 0) goto L_0x0c5a
            java.lang.Object r1 = r1.A00
            X.34E r1 = (X.AnonymousClass34E) r1
            X.4ub r0 = r3.AkX()
            X.22r r0 = r0.BJm()
        L_0x0c56:
            X.1dN r1 = r1.A00
            monitor-enter(r1)
            goto L_0x0c61
        L_0x0c5a:
            java.lang.Object r1 = r1.A00
            X.34E r1 = (X.AnonymousClass34E) r1
            X.22r r0 = X.C307322r.NONE
            goto L_0x0c56
        L_0x0c61:
            r1.A06 = r0     // Catch:{ all -> 0x0c75 }
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x0c75 }
            X.AnonymousClass1dN.A02(r1)     // Catch:{ all -> 0x0c75 }
            monitor-exit(r1)
            r0 = -1336002698(0xffffffffb05e3776, float:-8.0841944E-10)
            X.C14030oh.A0A(r0, r4)
            r0 = -1887040079(0xffffffff8f860db1, float:-1.3218694E-29)
            goto L_0x1431
        L_0x0c75:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0c78:
            r2 = -480625564(0xffffffffe35a3c64, float:-4.0257418E21)
            int r6 = X.C14030oh.A03(r2)
            X.1Tt r0 = (X.C22201Tt) r0
            r2 = 201854991(0xc08100f, float:1.0481891E-31)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r3 = r1.A00
            android.view.View r3 = (android.view.View) r3
            r2 = 2131304322(0x7f091f82, float:1.8226783E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r3, r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            java.lang.Object r8 = r1.A01
            X.1d0 r8 = (X.AnonymousClass1d0) r8
            android.view.View r7 = r2.inflate()
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.ScrollView"
            X.C04220Ms.A0C(r7, r1)
            android.widget.ScrollView r7 = (android.widget.ScrollView) r7
            r8.A01 = r7
            if (r7 == 0) goto L_0x0e5e
            com.instagram.service.session.UserSession r4 = r8.A03
            if (r4 != 0) goto L_0x0cb0
            java.lang.String r0 = "userSession"
            goto L_0x1221
        L_0x0cb0:
            java.lang.String r9 = r8.A07
            X.3CY r3 = r0.A00
            if (r3 == 0) goto L_0x0e5a
            r1 = 2131304804(0x7f092164, float:1.822776E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r7, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            com.instagram.common.typedurl.ImageUrl r1 = r3.A00
            if (r1 == 0) goto L_0x0e56
            r2.setUrl(r1, r8)
            r1 = 2131308781(0x7f0930ed, float:1.8235827E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x0e52
            r2.setText(r1)
            java.lang.StringBuilder r10 = X.C18200wM.A0r()
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x0ce7
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0ce7
            r10.append(r2)
        L_0x0ce7:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0d06
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0d06
            int r1 = r10.length()
            if (r1 <= 0) goto L_0x0d01
            android.content.Context r2 = r7.getContext()
            r1 = 2131826227(0x7f111633, float:1.9285332E38)
            X.C18210wN.A0u(r2, r10, r1)
        L_0x0d01:
            java.lang.String r1 = r3.A01
            r10.append(r1)
        L_0x0d06:
            int r1 = r10.length()
            if (r1 <= 0) goto L_0x0d1a
            r1 = 2131303857(0x7f091db1, float:1.822584E38)
            android.view.View r1 = X.C18200wM.A0G(r7, r1)
            android.widget.TextView r1 = X.C18250wR.A0A(r1)
            r1.setText(r10)
        L_0x0d1a:
            r1 = 2131304744(0x7f092128, float:1.822764E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0K(r7, r1)
            r1 = 214(0xd6, float:3.0E-43)
            X.AnonymousClass0wJ.A18(r2, r1, r3, r8)
            if (r9 == 0) goto L_0x0d4c
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0d4c
            r1 = 2131307433(0x7f092ba9, float:1.8233093E38)
            android.view.View r2 = X.C18200wM.A0G(r7, r1)
            r1 = 2131307429(0x7f092ba5, float:1.8233085E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r2, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r2 = r2.getContext()
            r1 = 2131836115(0x7f113cd3, float:1.9305388E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r2, r9, r1)
            r3.setText(r1)
        L_0x0d4c:
            r1 = 2131304019(0x7f091e53, float:1.8226169E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r0.A0D
            if (r1 == 0) goto L_0x0e4e
            r2.setText(r1)
            r1 = 2131300860(0x7f0911fc, float:1.8219762E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r0.A0A
            if (r1 == 0) goto L_0x0e4a
            r2.setText(r1)
            r1 = 2131300859(0x7f0911fb, float:1.821976E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x0e46
            r2.setText(r1)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36312226205860731(0x8101c70001037b, double:3.027336297960461E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.TextView"
            if (r1 == 0) goto L_0x0e07
            r1 = 2131299090(0x7f090b12, float:1.8216172E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r4 = r1.inflate()
            X.C04220Ms.A0C(r4, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.Context r9 = r7.getContext()
            r3 = 2131822801(0x7f1108d1, float:1.9278384E38)
            r2 = 2131824403(0x7f110f13, float:1.9281633E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r9, r1, r3)
            r4.setContentDescription(r1)
            r4.setText(r2)
            r1 = 314(0x13a, float:4.4E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r8, r1)
        L_0x0dbb:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r4.setOnClickListener(r1)
        L_0x0dc0:
            r1 = 2131302508(0x7f09186c, float:1.8223104E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r1 = r0.A0C
            if (r1 == 0) goto L_0x0e3e
            r4.setText(r1)
            android.content.Context r3 = r7.getContext()
            r2 = 2131822801(0x7f1108d1, float:1.9278384E38)
            java.lang.String r1 = r0.A0C
            if (r1 == 0) goto L_0x0e3e
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r3, r1, r2)
            r4.setContentDescription(r1)
            r1 = 213(0xd5, float:2.98E-43)
            X.AnonymousClass0wJ.A18(r4, r1, r0, r8)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r8.A04
            if (r1 == 0) goto L_0x0df0
            X.69F r0 = X.AnonymousClass69F.SUCCESS
            r1.setLoadingStatus(r0)
        L_0x0df0:
            android.widget.ScrollView r1 = r8.A01
            if (r1 == 0) goto L_0x0dfc
            X.4QF r0 = new X.4QF
            r0.<init>(r8)
            r1.post(r0)
        L_0x0dfc:
            r0 = -1514027370(0xffffffffa5c1c696, float:-3.361473E-16)
            X.C14030oh.A0A(r0, r5)
            r0 = 121986498(0x7455dc2, float:1.4848186E-34)
            goto L_0x1254
        L_0x0e07:
            boolean r1 = r0.A0J
            if (r1 == 0) goto L_0x0dc0
            r1 = 2131306781(0x7f09291d, float:1.823177E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r7, r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r4 = r1.inflate()
            X.C04220Ms.A0C(r4, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r1 = r0.A0E
            if (r1 == 0) goto L_0x0e42
            r4.setText(r1)
            android.content.Context r3 = r7.getContext()
            r2 = 2131822801(0x7f1108d1, float:1.9278384E38)
            java.lang.String r1 = r0.A0E
            if (r1 == 0) goto L_0x0e42
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r3, r1, r2)
            r4.setContentDescription(r1)
            r1 = 212(0xd4, float:2.97E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r0, r8, r1)
            goto L_0x0dbb
        L_0x0e3e:
            java.lang.String r0 = "learnMoreAboutThisAdText"
            goto L_0x1221
        L_0x0e42:
            java.lang.String r0 = "seeFewerAdsLikeThisText"
            goto L_0x1221
        L_0x0e46:
            java.lang.String r0 = "fundingDisclaimer"
            goto L_0x1221
        L_0x0e4a:
            java.lang.String r0 = "fundingEntityName"
            goto L_0x1221
        L_0x0e4e:
            java.lang.String r0 = "paidForByText"
            goto L_0x1221
        L_0x0e52:
            java.lang.String r0 = "name"
            goto L_0x1221
        L_0x0e56:
            java.lang.String r0 = "profilePicUrl"
            goto L_0x1221
        L_0x0e5a:
            java.lang.String r0 = "pageInfo"
            goto L_0x1221
        L_0x0e5e:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            r0 = 1553085693(0x5c9234fd, float:3.29228863E17)
            X.C14030oh.A0A(r0, r5)
            throw r2
        L_0x0e69:
            r0 = -235185334(0xfffffffff1fb5b4a, float:-2.4893152E30)
            int r2 = X.C14030oh.A03(r0)
            r0 = 717320608(0x2ac171a0, float:3.436253E-13)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r7 = r1.A00
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            r0 = 1
            r7.A2V(r0)
            java.lang.Object r3 = r1.A01
            X.433 r3 = (X.AnonymousClass433) r3
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = r3.A01
            com.instagram.user.model.User r0 = r1.A01(r0)
            r0.A1a()
            android.app.Activity r5 = r3.A00
            android.content.res.Resources r4 = r5.getResources()
            r1 = 2131821176(0x7f110278, float:1.9275088E38)
            r3 = 0
            java.lang.String r0 = r7.BK7()
            java.lang.String r1 = X.C18190wL.A0h(r4, r0, r1)
            X.C04220Ms.A06(r1)
            r0 = 0
            X.C63813iO.A02(r5, r1, r0, r3)
            r0 = -747509933(0xffffffffd371e753, float:-1.03896809E12)
            X.C14030oh.A0A(r0, r6)
            r0 = -149070217(0xfffffffff71d5e77, float:-3.1918226E33)
            goto L_0x1431
        L_0x0eb2:
            r2 = -68847857(0xfffffffffbe5770f, float:-2.3829016E36)
            int r2 = X.C14030oh.A03(r2)
            X.1Ry r0 = (X.C21731Ry) r0
            r3 = 2098779333(0x7d18d4c5, float:1.2696714E37)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            if (r0 == 0) goto L_0x0efb
            java.lang.Object r4 = r1.A01
            X.1cS r4 = (X.AnonymousClass1cS) r4
            java.lang.String r1 = r0.A00
            r1.getClass()
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A01
            if (r0 == 0) goto L_0x0ef1
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "phone"
            r12.put(r0, r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A01
            java.lang.String r6 = "edit_contact_info"
            r9 = 0
            java.lang.String r7 = r4.A08
            java.lang.String r8 = "phone_validation"
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.BcA(r5)
        L_0x0ef1:
            android.os.Handler r1 = r4.A0E
            X.4OW r0 = new X.4OW
            r0.<init>(r4)
            r1.post(r0)
        L_0x0efb:
            r0 = 779854105(0x2e7ba119, float:5.7213876E-11)
            X.C14030oh.A0A(r0, r3)
            r0 = 504034684(0x1e0af57c, float:7.356424E-21)
            goto L_0x1431
        L_0x0f06:
            r2 = -714775565(0xffffffffd56563f3, float:-1.57635901E13)
            int r6 = X.C14030oh.A03(r2)
            X.1Tx r0 = (X.C22231Tx) r0
            r2 = -198937062(0xfffffffff424761a, float:-5.2119877E31)
            int r5 = X.C14030oh.A03(r2)
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            java.lang.Object r2 = r1.A01
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r2
            java.lang.String r11 = "promotional_email_setting"
            if (r2 == 0) goto L_0x0f33
            java.lang.String r9 = "opt_in_promotional_email"
            r10 = 0
            X.JrQ r8 = new X.JrQ
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.BcA(r8)
        L_0x0f33:
            java.lang.Object r8 = r1.A00
            X.3BG r8 = (X.AnonymousClass3BG) r8
            java.util.List r0 = r0.A01
            java.util.Iterator r10 = r0.iterator()
            r4 = 0
        L_0x0f3e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0f7f
            java.lang.Object r0 = r10.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r9 = r0.iterator()
        L_0x0f52:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0f3e
            java.lang.Object r0 = r9.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.Object r3 = r0.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "marketing_email"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0f52
            if (r1 == 0) goto L_0x0f52
            java.lang.String r0 = "on"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0f52
            if (r3 == 0) goto L_0x0f52
            boolean r4 = r3.booleanValue()
            goto L_0x0f52
        L_0x0f7f:
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r1 = r8.A03
            X.4td r0 = r1.mController
            if (r0 == 0) goto L_0x0f89
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.A06 = r4
        L_0x0f89:
            if (r4 != 0) goto L_0x0faf
            com.instagram.service.session.UserSession r4 = r1.A02
            X.37Z r3 = r8.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r8.A00
            X.C04220Ms.A0B(r4, r7)
            r0 = 11
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r1 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r1.<init>(r0, r3, r2)
            X.H8c r0 = X.C63503hc.A06(r4)
            r0.A00 = r1
            X.C31155GhB.A03(r0)
        L_0x0fa4:
            r0 = -2021162278(0xffffffff878782da, float:-2.038945E-34)
            X.C14030oh.A0A(r0, r5)
            r0 = -1404050427(0xffffffffac4fe405, float:-2.9543046E-12)
            goto L_0x1254
        L_0x0faf:
            X.24p r0 = r8.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r0, r1)
            goto L_0x0fa4
        L_0x0fb5:
            r2 = 135769368(0x817ad18, float:4.564338E-34)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = 1965246637(0x752348ad, float:2.0698692E32)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A01
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r3 = (com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger) r3
            java.lang.String r9 = "user_email"
            if (r3 == 0) goto L_0x0fdd
            java.lang.String r7 = "opt_in_promotional_email"
            r8 = 0
            X.JrQ r6 = new X.JrQ
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r3.BcA(r6)
        L_0x0fdd:
            java.lang.Object r4 = r1.A00
            X.37Z r4 = (X.AnonymousClass37Z) r4
            X.3DU r0 = r0.A00
            java.lang.String r3 = r0.A07
            X.C04220Ms.A06(r3)
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r1 = r4.A01
            X.4td r0 = r1.mController
            if (r0 == 0) goto L_0x0ff2
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.A04 = r3
        L_0x0ff2:
            X.24p r0 = r4.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A00(r0, r1)
            r0 = 1458572296(0x56f00c08, float:1.31967232E14)
            X.C14030oh.A0A(r0, r5)
            r0 = 151592886(0x9091fb6, float:1.6505686E-33)
            goto L_0x1431
        L_0x1002:
            r2 = 1347852248(0x505697d8, float:1.44011018E10)
            int r2 = X.C14030oh.A03(r2)
            X.1UD r0 = (X.AnonymousClass1UD) r0
            r3 = 609823505(0x24592b11, float:4.7090853E-17)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            super.onSuccess(r0)
            com.instagram.user.model.User r4 = X.D5D.A00(r0)
            java.lang.Object r0 = r1.A01
            X.0i6 r0 = (X.C10300i6) r0
            r4.A1t(r0)
            java.lang.Object r4 = r1.A00
            X.39s r4 = (X.C570939s) r4
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r1 = r4.A00
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A02
            java.lang.String r6 = "profile_display_options"
            r9 = 0
            java.lang.String r7 = r1.A07
            java.lang.String r8 = "save_info"
            java.util.Map r11 = r4.A01
            java.util.Map r12 = r4.A02
            X.JrQ r5 = new X.JrQ
            r10 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Bdx(r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A02
            java.lang.String r7 = r1.A07
            X.JrQ r5 = new X.JrQ
            r8 = r9
            r11 = r9
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.BcE(r5)
            android.os.Handler r1 = X.C18250wR.A08()
            X.4OZ r0 = new X.4OZ
            r0.<init>(r4)
            r1.post(r0)
            r0 = 362876004(0x15a10c64, float:6.504693E-26)
            X.C14030oh.A0A(r0, r3)
            r0 = -39341162(0xfffffffffda7b396, float:-2.7864192E37)
            goto L_0x1431
        L_0x1063:
            r2 = -1302387541(0xffffffffb25f24ab, float:-1.2988646E-8)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 1945278529(0x73f29841, float:3.8440671E31)
            int r7 = X.C14030oh.A03(r3)
            java.lang.Object r1 = r1.A00
            X.3SA r1 = (X.AnonymousClass3SA) r1
            com.instagram.business.fragment.CategorySearchFragment r8 = r1.A00
            com.google.common.collect.ImmutableList$Builder r6 = new com.google.common.collect.ImmutableList$Builder
            r6.<init>()
            if (r0 == 0) goto L_0x10e1
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x10e1
            X.4uP r1 = (X.C85034uP) r1
            X.4uO r0 = r1.Anp()
            if (r0 == 0) goto L_0x10e1
            X.4uO r0 = r1.Anp()
            com.google.common.collect.ImmutableList r0 = r0.AqW()
            if (r0 == 0) goto L_0x10e1
            X.4uO r0 = r1.Anp()
            com.google.common.collect.ImmutableList r0 = r0.AqW()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x10e1
            X.4uO r0 = r1.Anp()
            com.google.common.collect.ImmutableList r0 = r0.AqW()
            X.83w r5 = r0.iterator()
        L_0x10b0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x10e1
            java.lang.Object r0 = r5.next()
            X.4vQ r0 = (X.C85574vQ) r0
            java.lang.String r4 = r0.getId()
            java.lang.String r3 = r0.getName()
            java.lang.String r1 = r0.AOY()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x10b0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x10b0
            X.266 r1 = X.AnonymousClass266.A01(r1)
            X.48S r0 = new X.48S
            r0.<init>(r1, r4, r3)
            r6.add((java.lang.Object) r0)
            goto L_0x10b0
        L_0x10e1:
            com.google.common.collect.ImmutableList r3 = r6.build()
            r8.A03 = r3
            r0 = 1
            r8.A0E = r0
            android.view.View r1 = r8.A01
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.business.fragment.CategorySearchFragment.A06(r8)
            java.lang.Integer r0 = com.instagram.business.fragment.CategorySearchFragment.A01(r8)
            if (r0 == 0) goto L_0x1103
            android.widget.ListView r1 = r8.mCategoriesListView
            int r0 = r0.intValue()
            r1.setSelection(r0)
        L_0x1103:
            int r3 = r3.size()
            java.lang.String r1 = "suggested_category"
            r0 = 0
            com.instagram.business.fragment.CategorySearchFragment.A08(r8, r1, r0, r0, r3)
            r0 = -1915614440(0xffffffff8dd20b18, float:-1.294492E-30)
            X.C14030oh.A0A(r0, r7)
            r0 = 1530798311(0x5b3e20e7, float:5.3516422E16)
            goto L_0x1431
        L_0x1118:
            r2 = 1738487962(0x679f389a, float:1.5038008E24)
            int r2 = X.C14030oh.A03(r2)
            X.1Sw r0 = (X.C21971Sw) r0
            r3 = -2104917185(0xffffffff8289833f, float:-2.0205672E-37)
            int r7 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            com.instagram.user.model.User r5 = X.AnonymousClass0wJ.A0Y(r6)
            r3 = 0
            X.MeW r4 = r5.A05
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.Chy(r3)
            X.KHq r4 = X.AnonymousClass3LY.A00(r6)
            X.46E r3 = new X.46E
            r3.<init>(r5)
            r4.CWx(r3)
            X.C18210wN.A1J(r6, r5)
            java.lang.Object r1 = r1.A00
            X.4ss r1 = (X.C84274ss) r1
            r1.CGe(r0)
            r0 = 231218871(0xdc81eb7, float:1.2333346E-30)
            X.C14030oh.A0A(r0, r7)
            r0 = 209369472(0xc7ab980, float:1.9315121E-31)
            goto L_0x1431
        L_0x115e:
            r2 = -1237427742(0xffffffffb63e59e2, float:-2.8364525E-6)
            int r6 = X.C14030oh.A03(r2)
            X.1TV r0 = (X.AnonymousClass1TV) r0
            r2 = -1282335668(0xffffffffb3911c4c, float:-6.757236E-8)
            int r4 = X.C14030oh.A03(r2)
            java.lang.Object r2 = r1.A00
            X.Jq1 r2 = (X.C37352Jq1) r2
            com.instagram.business.promote.model.PromoteData r3 = r2.A06
            boolean r2 = r0.A01
            r3.A26 = r2
            boolean r2 = r0.A02
            r3.A2P = r2
            boolean r2 = r0.A03
            r3.A2W = r2
            com.instagram.business.promote.model.PromoteWhatsAppAccountType r2 = r0.A00
            if (r2 == 0) goto L_0x1208
            r3.A0l = r2
            java.lang.Object r1 = r1.A01
            X.4pJ r1 = (X.C82244pJ) r1
            r1.Byw(r0)
            r0 = -1565117552(0xffffffffa2b63390, float:-4.9385793E-18)
            X.C14030oh.A0A(r0, r4)
            r0 = -1818298572(0xffffffff939ef734, float:-4.012857E-27)
            goto L_0x1254
        L_0x1198:
            r2 = -2013035593(0xffffffff880383b7, float:-3.957621E-34)
            int r6 = X.C14030oh.A03(r2)
            X.1TV r0 = (X.AnonymousClass1TV) r0
            r2 = -1767528693(0xffffffff96a5a70b, float:-2.6762607E-25)
            int r3 = X.C14030oh.A03(r2)
            java.lang.Object r1 = r1.A00
            X.Jq1 r1 = (X.C37352Jq1) r1
            com.instagram.business.promote.model.PromoteData r2 = r1.A06
            boolean r1 = r0.A01
            r2.A26 = r1
            boolean r1 = r0.A02
            r2.A2P = r1
            boolean r1 = r0.A03
            r2.A2W = r1
            com.instagram.business.promote.model.PromoteWhatsAppAccountType r0 = r0.A00
            if (r0 == 0) goto L_0x1208
            r2.A0l = r0
            r0 = -216843843(0xfffffffff31339bd, float:-1.1664409E31)
            X.C14030oh.A0A(r0, r3)
            r0 = -240809199(0xfffffffff1a58b11, float:-1.6394607E30)
            goto L_0x1254
        L_0x11cb:
            r2 = 344246927(0x1484ca8f, float:1.3408489E-26)
            int r6 = X.C14030oh.A03(r2)
            X.1TV r0 = (X.AnonymousClass1TV) r0
            r2 = 448653610(0x1abde92a, float:7.8545265E-23)
            int r5 = X.C14030oh.A03(r2)
            java.lang.Object r4 = r1.A00
            X.Icx r4 = (X.C34668Icx) r4
            X.Jq1 r2 = r4.A03
            com.instagram.business.promote.model.PromoteData r3 = r2.A06
            boolean r2 = r0.A01
            r3.A26 = r2
            boolean r2 = r0.A02
            r3.A2P = r2
            boolean r2 = r0.A03
            r3.A2W = r2
            com.instagram.business.promote.model.PromoteWhatsAppAccountType r0 = r0.A00
            if (r0 == 0) goto L_0x1208
            r3.A0l = r0
            X.4rJ r2 = r4.A02
            java.lang.Object r0 = r1.A01
            X.IZw r0 = (X.C34530IZw) r0
            r2.CBw(r0)
            r0 = -1234991699(0xffffffffb66385ad, float:-3.3903445E-6)
            X.C14030oh.A0A(r0, r5)
            r0 = -1051072936(0xffffffffc159e658, float:-13.618736)
            goto L_0x1254
        L_0x1208:
            java.lang.String r0 = "accountType"
            goto L_0x1221
        L_0x120b:
            r2 = -623123653(0xffffffffdadbe33b, float:-3.09464312E16)
            int r6 = X.C14030oh.A03(r2)
            X.1RB r0 = (X.AnonymousClass1RB) r0
            r2 = -139139835(0xfffffffff7b4e505, float:-7.337957E33)
            int r5 = X.AnonymousClass0wJ.A00(r2, r0)
            X.33H r0 = r0.A00
            if (r0 != 0) goto L_0x1226
            java.lang.String r0 = "response"
        L_0x1221:
            X.C04220Ms.A0E(r0)
            r2 = 0
            throw r2
        L_0x1226:
            boolean r4 = r0.A00
            java.lang.Object r3 = r1.A01
            X.4MC r3 = (X.AnonymousClass4MC) r3
            boolean r0 = r3.A0C
            r2 = 1
            r0 = r0 ^ 1
            if (r4 == r0) goto L_0x124b
            if (r4 != r2) goto L_0x1236
            r2 = 0
        L_0x1236:
            r3.A0C = r2
            java.lang.Object r1 = r1.A00
            X.CTd r1 = (X.C22302CTd) r1
            X.EvB r0 = r1.getAdapter()
            if (r0 == 0) goto L_0x124b
            X.EvB r0 = r1.getAdapter()
            X.Luu r0 = (X.C41030Luu) r0
            r0.notifyDataSetChanged()
        L_0x124b:
            r0 = -1810128948(0xffffffff941b9fcc, float:-7.8570146E-27)
            X.C14030oh.A0A(r0, r5)
            r0 = 1497753733(0x5945e885, float:3.48163927E15)
        L_0x1254:
            X.C14030oh.A0A(r0, r6)
            return
        L_0x1258:
            r2 = 2129262875(0x7ee9f91b, float:1.5550178E38)
            int r2 = X.C14030oh.A03(r2)
            X.1Sr r0 = (X.C21921Sr) r0
            r3 = 1585884892(0x5e86aedc, float:4.8524681E18)
            int r4 = X.C14030oh.A03(r3)
            X.3DU r8 = r0.A00
            java.lang.Object r6 = r1.A00
            X.3z7 r6 = (X.AnonymousClass3z7) r6
            java.lang.String r3 = r8.A09
            java.lang.String r0 = "name"
            X.AnonymousClass3z7.A01(r6, r0, r3)
            java.lang.String r3 = r8.A09
            r5 = 1
            if (r3 == 0) goto L_0x1293
            java.lang.String r0 = " "
            java.lang.String[] r7 = r3.split(r0)
            r0 = 0
            r3 = r7[r0]
            java.lang.String r0 = "given-name"
            X.AnonymousClass3z7.A01(r6, r0, r3)
            int r0 = r7.length
            if (r0 <= r5) goto L_0x1293
            int r0 = r0 - r5
            r3 = r7[r0]
            java.lang.String r0 = "family-name"
            X.AnonymousClass3z7.A01(r6, r0, r3)
        L_0x1293:
            java.lang.String r3 = r8.A07
            java.lang.String r0 = "email"
            X.AnonymousClass3z7.A01(r6, r0, r3)
            java.lang.String r3 = r8.A0E
            java.lang.String r0 = "tel"
            X.AnonymousClass3z7.A01(r6, r0, r3)
            java.lang.Object r0 = r1.A01
            X.4oZ r0 = (X.C81894oZ) r0
            X.AnonymousClass3z7.A00(r0, r6)
            r6.A05 = r5
            r0 = 1272399114(0x4bd7450a, float:2.8215828E7)
            X.C14030oh.A0A(r0, r4)
            r0 = 2095916166(0x7ced2486, float:9.850521E36)
            goto L_0x1431
        L_0x12b5:
            r2 = -814296581(0xffffffffcf76d1fb, float:-4.14095642E9)
            int r2 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r3 = 995951773(0x3b5d049d, float:0.0033724674)
            int r7 = X.C14030oh.A03(r3)
            if (r0 == 0) goto L_0x134c
            java.lang.Object r8 = r0.A01
            if (r8 == 0) goto L_0x134c
            X.3Ih r8 = (X.C58933Ih) r8
            java.lang.Class<X.14i> r6 = X.C203514i.class
            java.lang.String r5 = "pages_platform_autofill"
            X.3Ih r0 = r8.A00(r6, r5)
            if (r0 == 0) goto L_0x134c
            X.3Ih r0 = r8.A00(r6, r5)
            java.lang.Class<X.14h> r4 = X.C203414h.class
            java.lang.String r3 = "all_autofill_values"
            com.google.common.collect.ImmutableList r0 = r0.A02(r3, r4)
            if (r0 == 0) goto L_0x134c
            X.3Ih r0 = r8.A00(r6, r5)
            com.google.common.collect.ImmutableList r0 = r0.A02(r3, r4)
            X.83w r9 = r0.iterator()
        L_0x12f1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x1350
            java.lang.Object r8 = r9.next()
            X.3Ih r8 = (X.C58933Ih) r8
            java.lang.String r4 = "values"
            com.google.common.collect.ImmutableList r0 = r8.A01(r4)
            if (r0 == 0) goto L_0x12f1
            com.google.common.collect.ImmutableList r0 = r8.A01(r4)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x12f1
            com.google.common.collect.ImmutableList r3 = r8.A01(r4)
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x12f1
            java.lang.String r0 = "autocomplete_tag"
            java.lang.String r6 = r8.A05(r0)
            java.lang.Object r5 = r1.A00
            X.3z7 r5 = (X.AnonymousClass3z7) r5
            com.google.common.collect.ImmutableList r4 = r8.A01(r4)
            java.util.HashMap r3 = r5.A03
            java.lang.Object r0 = r3.get(r6)
            if (r0 != 0) goto L_0x133d
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r3.put(r6, r0)
        L_0x133d:
            java.lang.Object r0 = r3.get(r6)
            java.util.List r0 = (java.util.List) r0
            r0.addAll(r4)
            java.util.List r0 = r5.A04
            r0.add(r6)
            goto L_0x12f1
        L_0x134c:
            r0 = -1822876825(0xffffffff93591b67, float:-2.7402761E-27)
            goto L_0x1361
        L_0x1350:
            java.lang.Object r3 = r1.A00
            X.3z7 r3 = (X.AnonymousClass3z7) r3
            java.lang.Object r0 = r1.A01
            X.4oZ r0 = (X.C81894oZ) r0
            X.AnonymousClass3z7.A00(r0, r3)
            r0 = 1
            r3.A05 = r0
            r0 = 236471843(0xe184623, float:1.8769216E-30)
        L_0x1361:
            X.C14030oh.A0A(r0, r7)
            r0 = -20729069(0xfffffffffec3b313, float:-1.3006463E38)
            goto L_0x1431
        L_0x1369:
            r0 = -6452612(0xffffffffff9d8a7c, float:NaN)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1488038450(0x58b1aa32, float:1.56275633E15)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r1.A00
            X.601 r3 = (X.AnonymousClass601) r3
            java.lang.Object r0 = r1.A01
            X.6jp r0 = (X.C109326jp) r0
            X.C63893iY.A0G(r3, r0)
            r0 = -1272232425(0xffffffffb42b4617, float:-1.5951115E-7)
            X.C14030oh.A0A(r0, r4)
            r0 = -77760458(0xfffffffffb5d7836, float:-1.1499358E36)
            goto L_0x1431
        L_0x138d:
            r0 = 2097586527(0x7d06a15f, float:1.1184652E37)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1864905073(0x6f283171, float:5.2053253E28)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r1.A00
            X.1cB r3 = (X.AnonymousClass1cB) r3
            com.instagram.service.session.UserSession r0 = r3.A03
            X.AnonymousClass49X.A02(r0)
            java.lang.String r0 = "ig_manage_main_account_success"
            X.0rn r1 = X.C15730rn.A00(r3, r0)
            X.AnonymousClass1cB.A03(r3, r1)
            X.AnonymousClass1cB.A02(r3, r1)
            com.instagram.service.session.UserSession r0 = r3.A03
            X.C32592Cl.A00(r1, r0)
            r0 = -159518914(0xfffffffff67def3e, float:-1.2876011E33)
            X.C14030oh.A0A(r0, r4)
            r0 = 615652391(0x24b21c27, float:7.7242887E-17)
            goto L_0x1431
        L_0x13bf:
            r0 = 1319921352(0x4eac66c8, float:1.44620851E9)
            int r2 = X.C14030oh.A03(r0)
            r0 = -2108083537(0xffffffff825932af, float:-1.5957188E-37)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r1.A00
            X.1cA r5 = (X.AnonymousClass1cA) r5
            X.1fN r3 = r5.A00
            java.lang.Object r1 = r1.A01
            X.4Mm r1 = (X.C72144Mm) r1
            java.util.ArrayList r0 = r3.A00
            r0.remove(r1)
            X.AnonymousClass1fN.A00(r3)
            com.instagram.service.session.UserSession r6 = r5.A01
            java.lang.String r0 = r1.A01()
            java.lang.Long r3 = X.AnonymousClass0wJ.A0d(r0)
            X.0nS r1 = X.C18220wO.A0W(r6)
            java.lang.String r0 = "ig_my_main_account_click"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1356(0x54c, float:1.9E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.C77494gf.A00(r1, r6)
            java.lang.String r0 = "account_id_clicked"
            r1.A0S(r0, r3)
            r1.Bb4()
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x1428
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x1428
            android.content.Context r3 = r5.getContext()
            r0 = 2131820865(0x7f110141, float:1.9274457E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 1
            X.C63813iO.A0D(r3, r1, r0)
            X.1fN r0 = r5.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x1428
            X.C18190wL.A19(r5)
        L_0x1428:
            r0 = 750552894(0x2cbc873e, float:5.3582963E-12)
            X.C14030oh.A0A(r0, r4)
            r0 = -745766542(0xffffffffd38c8172, float:-1.20693431E12)
        L_0x1431:
            X.C14030oh.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2.onSuccess(java.lang.Object):void");
    }

    public static final void A00(IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2, AnonymousClass3XX r4) {
        int A002 = AnonymousClass0wJ.A00(1378021638, r4);
        super.onFail(r4);
        TextView textView = ((C34238I9r) iDxACallbackShape35S0200000_1_I2.A01).A04;
        textView.setClickable(true);
        textView.setAlpha(1.0f);
        C14030oh.A0A(1547783873, A002);
    }

    public static final /* bridge */ /* synthetic */ void A01(IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2, Object obj) {
        int A03 = C14030oh.A03(-1747336534);
        int A002 = AnonymousClass0wJ.A00(-1125074282, obj);
        super.onSuccess(obj);
        C63733iD A003 = C63733iD.A00();
        Resources resources = ((C34238I9r) iDxACallbackShape35S0200000_1_I2.A01).A04.getResources();
        User user = ((KJT) iDxACallbackShape35S0200000_1_I2.A00).A01;
        A003.A0A = C18190wL.A0h(resources, user.BK7(), 2131830043);
        A003.A06 = user.B4M();
        A003.A0E(AnonymousClass22b.CIRCULAR);
        C63733iD.A0A(A003);
        C14030oh.A0A(-664949863, A002);
        C14030oh.A0A(517873253, A03);
    }
}

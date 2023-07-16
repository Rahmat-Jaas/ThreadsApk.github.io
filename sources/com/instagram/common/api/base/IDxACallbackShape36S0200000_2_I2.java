package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass3XX;
import X.AnonymousClass5KP;
import X.AnonymousClass5z0;
import X.AnonymousClass7IV;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C10450iM;
import X.C1201579a;
import X.C121307Fk;
import X.C13950oZ;
import X.C14030oh;
import X.C145508kc;
import X.C145858lE;
import X.C146558mR;
import X.C148018qJ;
import X.C148028qK;
import X.C148538rF;
import X.C148558rH;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18240wQ;
import X.C19514Axb;
import X.C63813iO;
import X.C63873iU;
import X.C85814vo;
import X.C86104wH;
import X.C86114wI;
import X.C86164wN;
import X.C95155yx;
import X.EO9;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IDxACallbackShape36S0200000_2_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxACallbackShape36S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void onFail(AnonymousClass3XX r13) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        switch (this.A02) {
            case 3:
                i = AnonymousClass0wJ.A00(604132753, r13);
                super.onFail(r13);
                C18240wQ.A1G(this.A00);
                i2 = -2082249574;
                break;
            case 4:
                i = C14030oh.A03(813221527);
                C04220Ms.A0B(r13, 0);
                String A012 = C19514Axb.A01(r13);
                Context context = (Context) this.A00;
                if (A012 == null || A012.length() == 0) {
                    A012 = AnonymousClass0wJ.A0k(context, 2131826864);
                }
                C63813iO.A02(context, A012, (String) null, 0);
                i2 = -1338884788;
                break;
            case 6:
                i = C14030oh.A03(1380480725);
                super.onFail(r13);
                Throwable th = r13.A01;
                if (th != null) {
                    str4 = th.getMessage();
                } else {
                    str4 = null;
                }
                SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = (SupportProfileDisplayOptionsFragment) this.A00;
                AnonymousClass5KP r1 = supportProfileDisplayOptionsFragment.A02.A00;
                AnonymousClass7Ko.A07(r1, "Selected Partner should not be null if save enabled");
                AnonymousClass7IV r9 = supportProfileDisplayOptionsFragment.A03;
                String str5 = r1.A04;
                String str6 = r1.A01;
                String str7 = r1.A06;
                String str8 = r1.A07;
                String str9 = r1.A03;
                AnonymousClass0wJ.A1Q(str7, str8);
                USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r9);
                C18190wL.A1I(A002, "update_action_button");
                AnonymousClass7IV.A03(A002, r9, "error", str5, true);
                A002.A0S("partner_id", AnonymousClass0wJ.A0d(str6));
                C86114wI.A1F(A002, str7, str8);
                A002.A1J(str4);
                C86164wN.A1C(A002, str9);
                C63813iO.A00(supportProfileDisplayOptionsFragment.requireContext(), 2131836068);
                i2 = -1583267278;
                break;
            case 7:
                i = C14030oh.A03(1850153917);
                super.onFail(r13);
                Throwable th2 = r13.A01;
                if (th2 != null) {
                    str3 = th2.getMessage();
                } else {
                    str3 = null;
                }
                SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment2 = (SupportProfileDisplayOptionsFragment) this.A00;
                C146558mR r12 = supportProfileDisplayOptionsFragment2.A01;
                AnonymousClass7Ko.A07(r12, "Initial Partner should not be null if remove button is shown");
                AnonymousClass7IV r11 = supportProfileDisplayOptionsFragment2.A03;
                String AWx = r12.AWx();
                String AQz = r12.AQz();
                String B08 = r12.B08();
                String url = r12.getUrl();
                String AUd = r12.AUd();
                AnonymousClass0wJ.A1O(AQz, B08);
                C04220Ms.A0B(url, 3);
                USLEBaseShape0S0000000 A003 = AnonymousClass7IV.A00(r11);
                C18190wL.A1I(A003, "remove_action_button");
                AnonymousClass7IV.A03(A003, r11, "error", AWx, true);
                A003.A0S("partner_id", AnonymousClass0wJ.A0d(AQz));
                C86114wI.A1F(A003, B08, url);
                A003.A1J(str3);
                C86164wN.A1C(A003, AUd);
                C63813iO.A00(supportProfileDisplayOptionsFragment2.requireContext(), 2131836068);
                i2 = 188050709;
                break;
            case 8:
                i = AnonymousClass0wJ.A00(-957966885, r13);
                Object obj = r13.A00;
                if (!(obj == null || (str2 = ((C95155yx) obj).A00) == null || str2.length() == 0)) {
                    ((C145508kc) this.A00).CKX();
                }
                i2 = -2039869911;
                break;
            case 11:
                i = C14030oh.A03(-2021383900);
                ViewGroup viewGroup = ((EO9) this.A00).A03;
                if (viewGroup != null) {
                    C63813iO.A03(viewGroup.getContext(), (String) null, 2131836068, 0);
                }
                i2 = 1452242647;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = C14030oh.A03(1411564789);
                if (((ReactContextBaseJavaModule) this.A00).getCurrentActivity() != null) {
                    C145858lE r2 = (C145858lE) this.A01;
                    Object obj2 = r13.A00;
                    if (obj2 != null) {
                        str = ((C85814vo) obj2).getErrorMessage();
                    } else {
                        str = "";
                    }
                    r2.reject(IgReactCommentModerationModule.ERROR_SERVER_ERR, str);
                }
                i2 = -1175203920;
                break;
            default:
                super.onFail(r13);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A02) {
            case 6:
                i = C14030oh.A03(117712200);
                ((Dialog) this.A01).dismiss();
                i2 = -919935599;
                break;
            case 7:
                i = C14030oh.A03(1908241678);
                ((Dialog) this.A01).dismiss();
                i2 = 501963670;
                break;
            case 11:
                i = C14030oh.A03(2135511281);
                ((Dialog) this.A01).dismiss();
                i2 = -129958232;
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
            case 6:
                i = C14030oh.A03(-1233137395);
                C13950oZ.A00((Dialog) this.A01);
                i2 = -1168860435;
                break;
            case 7:
                i = C14030oh.A03(1324329315);
                C13950oZ.A00((Dialog) this.A01);
                i2 = -1476344982;
                break;
            case 11:
                i = C14030oh.A03(899329780);
                C13950oZ.A00((Dialog) this.A01);
                i2 = 1908066527;
                break;
            default:
                super.onStart();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0345, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0348, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0349, code lost:
        X.C18250wR.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x034d, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 2: goto L_0x0009;
                case 3: goto L_0x003d;
                case 4: goto L_0x005f;
                case 5: goto L_0x008d;
                case 6: goto L_0x00ce;
                case 7: goto L_0x012b;
                case 8: goto L_0x01a9;
                case 9: goto L_0x01ea;
                case 10: goto L_0x026a;
                case 11: goto L_0x02bd;
                case 12: goto L_0x02e9;
                case 13: goto L_0x0313;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onSuccess(r13)
            return
        L_0x0009:
            r0 = -1787604104(0xffffffff95735378, float:-4.9139304E-26)
            int r3 = X.C14030oh.A03(r0)
            X.5yr r13 = (X.C95095yr) r13
            r0 = -619657748(0xffffffffdb10c5ec, float:-4.0750014E16)
            int r4 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.Object r1 = r12.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.6dS r0 = X.C33312Ff.A00(r1, r0)
            java.lang.String r2 = r13.A00
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "autofill_js"
            X.C18180wK.A0v(r1, r0, r2)
            r0 = -1940363273(0xffffffff8c5867f7, float:-1.667132E-31)
            X.C14030oh.A0A(r0, r4)
            r0 = -1257830536(0xffffffffb5070778, float:-5.030229E-7)
            goto L_0x0345
        L_0x003d:
            r0 = 1728269427(0x67034c73, float:6.2004025E23)
            int r3 = X.C14030oh.A03(r0)
            X.5tb r13 = (X.C94005tb) r13
            r0 = 1532781728(0x5b5c64a0, float:6.2035133E16)
            int r2 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.String r1 = r13.A00
            java.lang.Object r0 = r12.A01
            X.C86134wK.A1L(r0, r1)
            r0 = -667901323(0xffffffffd830a275, float:-7.7684718E14)
            X.C14030oh.A0A(r0, r2)
            r0 = 603294359(0x23f58a97, float:2.6621648E-17)
            goto L_0x0345
        L_0x005f:
            r0 = 1048475728(0x3e7e7850, float:0.24850583)
            int r3 = X.C14030oh.A03(r0)
            X.5uB r13 = (X.AnonymousClass5uB) r13
            r0 = -1123859966(0xffffffffbd034202, float:-0.03204537)
            int r4 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.Object r2 = r12.A01
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            X.Awj r1 = X.C19462Awj.A01(r2)
            X.BKU r0 = r13.A00()
            X.BKU r0 = r1.A03(r0)
            r0.AAy(r2)
            r0 = -1939028117(0xffffffff8c6cc76b, float:-1.8240789E-31)
            X.C14030oh.A0A(r0, r4)
            r0 = -494041922(0xffffffffe28d84be, float:-1.305278E21)
            goto L_0x0345
        L_0x008d:
            r0 = -1478224764(0xffffffffa7e41484, float:-6.3304955E-15)
            int r3 = X.C14030oh.A03(r0)
            X.9Me r13 = (X.C156169Me) r13
            r0 = 1012926565(0x3c600865, float:0.013673876)
            int r2 = X.C14030oh.A03(r0)
            r1 = 0
            X.C04220Ms.A0B(r13, r1)
            super.onSuccess(r13)
            java.util.List r0 = r13.A04
            java.lang.Object r1 = r0.get(r1)
            X.BKU r1 = (X.BKU) r1
            java.lang.Object r0 = r12.A01
            X.Cri r0 = (X.C23416Cri) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            X.Awj r0 = X.C19462Awj.A01(r0)
            r0.A03(r1)
            java.lang.Object r0 = r12.A00
            X.8m8 r0 = (X.C146368m8) r0
            X.C04220Ms.A04(r1)
            r0.D7w(r1)
            r0 = 485025445(0x1ce8e6a5, float:1.5412092E-21)
            X.C14030oh.A0A(r0, r2)
            r0 = -2020951437(0xffffffff878aba73, float:-2.0873517E-34)
            goto L_0x0345
        L_0x00ce:
            r0 = -2006053465(0xffffffff886e0da7, float:-7.163657E-34)
            int r3 = X.C14030oh.A03(r0)
            X.5to r13 = (X.C94135to) r13
            r0 = -854787040(0xffffffffcd0cfc20, float:-1.47833344E8)
            int r2 = X.C14030oh.A03(r0)
            super.onSuccess(r13)
            java.lang.Object r4 = r12.A00
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r4 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r4
            com.instagram.service.session.UserSession r0 = r4.A04
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r0)
            X.5KP r0 = r13.A00
            r1.A1j(r0)
            com.instagram.api.schemas.SMBPartnerType r0 = r13.A01
            r1.A1p(r0)
            r0 = 0
            r1.A2J(r0)
            com.instagram.service.session.UserSession r0 = r4.A04
            X.C18210wN.A1J(r0, r1)
            X.5yI r0 = r4.A02
            X.5KP r1 = r0.A00
            java.lang.String r0 = "Selected Partner should not be null if save enabled"
            X.AnonymousClass7Ko.A07(r1, r0)
            X.7IV r5 = r4.A03
            java.lang.String r6 = r1.A04
            java.lang.String r7 = r1.A01
            java.lang.String r8 = r1.A06
            java.lang.String r9 = r1.A07
            java.lang.String r10 = r1.A03
            r5.A04(r6, r7, r8, r9, r10)
            android.os.Handler r1 = r4.A06
            X.81U r0 = new X.81U
            r0.<init>(r13, r12)
            r1.post(r0)
            r0 = -1656794751(0xffffffff9d3f5181, float:-2.5320776E-21)
            X.C14030oh.A0A(r0, r2)
            r0 = 2014518283(0x78131c0b, float:1.1934944E34)
            goto L_0x0345
        L_0x012b:
            r0 = 712472976(0x2a777990, float:2.1980182E-13)
            int r3 = X.C14030oh.A03(r0)
            r0 = -2006080655(0xffffffff886da371, float:-7.1511718E-34)
            int r6 = X.C14030oh.A03(r0)
            super.onSuccess(r13)
            java.lang.Object r10 = r12.A00
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r10 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r10
            com.instagram.service.session.UserSession r0 = r10.A04
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r0)
            r0 = 0
            r1.A1j(r0)
            r1.A1p(r0)
            com.instagram.service.session.UserSession r0 = r10.A04
            X.C18210wN.A1J(r0, r1)
            X.8mR r1 = r10.A01
            java.lang.String r0 = "Initial Partner should not be null if remove button is shown"
            X.AnonymousClass7Ko.A07(r1, r0)
            X.7IV r11 = r10.A03
            java.lang.String r9 = r1.AWx()
            java.lang.String r8 = r1.AQz()
            java.lang.String r7 = r1.B08()
            java.lang.String r5 = r1.getUrl()
            java.lang.String r4 = r1.AUd()
            r1 = 1
            X.AnonymousClass0wJ.A1O(r8, r7)
            r0 = 3
            X.C04220Ms.A0B(r5, r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.AnonymousClass7IV.A00(r11)
            java.lang.String r0 = "remove_action_button"
            X.C18190wL.A1I(r2, r0)
            java.lang.String r0 = "success"
            X.AnonymousClass7IV.A03(r2, r11, r0, r9, r1)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r8)
            java.lang.String r0 = "partner_id"
            r2.A0S(r0, r1)
            X.C86114wI.A1F(r2, r7, r5)
            X.C86164wN.A1C(r2, r4)
            android.os.Handler r1 = r10.A06
            X.7zf r0 = new X.7zf
            r0.<init>(r12)
            r1.post(r0)
            r0 = 635638651(0x25e3137b, float:3.9391423E-16)
            X.C14030oh.A0A(r0, r6)
            r0 = 1596726757(0x5f2c1de5, float:1.2402321E19)
            goto L_0x0345
        L_0x01a9:
            r0 = 1056889631(0x3efedb1f, float:0.4977655)
            int r3 = X.C14030oh.A03(r0)
            r0 = 2025228883(0x78b68a53, float:2.9618862E34)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            long r1 = java.lang.System.currentTimeMillis()
            X.C67363zQ.A00 = r1
            X.49q r4 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r0 = X.D2R.A0v
            android.content.SharedPreferences r0 = r4.A01(r0)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r0 = 743(0x2e7, float:1.041E-42)
            java.lang.String r0 = X.I17.A00(r0)
            X.AnonymousClass0wJ.A12(r4, r0, r1)
            java.lang.Object r0 = r12.A00
            X.8kc r0 = (X.C145508kc) r0
            r0.CNi()
            r0 = -337638372(0xffffffffebe00c1c, float:-5.4171314E26)
            X.C14030oh.A0A(r0, r5)
            r0 = -1866084905(0xffffffff90c5cdd7, float:-7.8019946E-29)
            goto L_0x0345
        L_0x01ea:
            r0 = -419180308(0xffffffffe703d0ec, float:-6.2248394E23)
            int r3 = X.C14030oh.A03(r0)
            X.5ss r13 = (X.C93925ss) r13
            r0 = 1161948026(0x4541eb7a, float:3102.7173)
            int r4 = X.AnonymousClass0wJ.A00(r0, r13)
            X.6em r0 = r13.A00
            if (r0 == 0) goto L_0x0349
            java.util.List r1 = r0.A00
            java.lang.Object r0 = r12.A01
            X.77T r0 = (X.AnonymousClass77T) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            com.instagram.monetization.repository.MonetizationRepository r6 = X.AnonymousClass2RN.A00(r0)
            X.1tl r9 = X.AnonymousClass3WS.A01(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x0212:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x025f
            java.lang.Object r7 = r8.next()
            X.5Hb r7 = (X.AnonymousClass5Hb) r7
            com.instagram.api.schemas.UserMonetizationProductType r2 = r7.A03
            boolean r0 = r7.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r0 = r6.A0C
            r0.put(r2, r1)
            boolean r0 = r7.A05
            r6.A03(r2, r0)
            boolean r5 = r7.A04
            r6.A02(r2, r5)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            if (r2 != r0) goto L_0x0255
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = r7.A01
            java.lang.String r2 = r0.A00
            X.1tl r0 = r6.A07
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            r0 = 37
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C18180wK.A0v(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r9)
            java.lang.String r0 = "can_use_branded_content"
            X.AnonymousClass0wJ.A13(r1, r0, r5)
        L_0x0255:
            java.lang.Object r1 = r12.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = r7.A01
            r1.invoke(r0)
            goto L_0x0212
        L_0x025f:
            r0 = 481178509(0x1cae338d, float:1.152768E-21)
            X.C14030oh.A0A(r0, r4)
            r0 = 335568(0x51ed0, float:4.70231E-40)
            goto L_0x0345
        L_0x026a:
            r0 = 1853429629(0x6e79177d, float:1.9272541E28)
            int r3 = X.C14030oh.A03(r0)
            X.4vm r13 = (X.C85794vm) r13
            r0 = -2096981652(0xffffffff8302996c, float:-3.8379686E-37)
            int r6 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.Object r0 = r12.A01
            X.77T r0 = (X.AnonymousClass77T) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            com.instagram.monetization.repository.MonetizationRepository r5 = X.AnonymousClass2RN.A00(r0)
            java.lang.Object r0 = r13.D7H()
            X.6dC r0 = (X.C105296dC) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0290:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02b2
            java.lang.Object r0 = r4.next()
            X.5Hl r0 = (X.C89895Hl) r0
            r5.A01(r0)
            java.lang.Object r2 = r12.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r1 = r0.A05
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r0 = com.instagram.api.schemas.CanUseCreatorMonetizationProduct.CAN_USE_PRODUCT
            if (r1 != r0) goto L_0x02af
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
        L_0x02ab:
            r2.invoke(r0)
            goto L_0x0290
        L_0x02af:
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.NOT_ELIGIBLE
            goto L_0x02ab
        L_0x02b2:
            r0 = -11831373(0xffffffffff4b77b3, float:-2.704548E38)
            X.C14030oh.A0A(r0, r6)
            r0 = -89168814(0xfffffffffaaf6452, float:-4.5534334E35)
            goto L_0x0345
        L_0x02bd:
            r0 = 1748280068(0x6834a304, float:3.4121323E24)
            int r3 = X.C14030oh.A03(r0)
            r0 = 400751517(0x17e2fb9d, float:1.4668424E-24)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A00
            X.EO9 r0 = (X.EO9) r0
            r4 = 2131831565(0x7f112b0d, float:1.929616E38)
            android.view.ViewGroup r0 = r0.A03
            if (r0 == 0) goto L_0x02df
            android.content.Context r2 = r0.getContext()
            r1 = 0
            r0 = 0
            X.C63813iO.A03(r2, r1, r4, r0)
        L_0x02df:
            r0 = -1252843023(0xffffffffb55321f1, float:-7.8653017E-7)
            X.C14030oh.A0A(r0, r5)
            r0 = -640110682(0xffffffffd9d8afa6, float:-7.6239653E15)
            goto L_0x0345
        L_0x02e9:
            r0 = -1885596324(0xffffffff8f9c155c, float:-1.5391015E-29)
            int r3 = X.C14030oh.A03(r0)
            r0 = -359886680(0xffffffffea8c90a8, float:-8.496637E25)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A00
            com.facebook.react.bridge.ReactContextBaseJavaModule r0 = (com.facebook.react.bridge.ReactContextBaseJavaModule) r0
            android.app.Activity r0 = r0.getCurrentActivity()
            if (r0 == 0) goto L_0x0309
            java.lang.Object r1 = r12.A01
            X.8lE r1 = (X.C145858lE) r1
            r0 = 0
            r1.resolve(r0)
        L_0x0309:
            r0 = 416676327(0x18d5f9e7, float:5.5311546E-24)
            X.C14030oh.A0A(r0, r2)
            r0 = 1870230684(0x6f79749c, float:7.720274E28)
            goto L_0x0345
        L_0x0313:
            r0 = 2039020643(0x7988fc63, float:8.890892E34)
            int r3 = X.C14030oh.A03(r0)
            X.5st r13 = (X.AnonymousClass5st) r13
            r0 = -601981946(0xffffffffdc1e7c06, float:-1.78437646E17)
            int r5 = X.C14030oh.A03(r0)
            r4 = 0
            X.C04220Ms.A0B(r13, r4)
            java.lang.Object r2 = r12.A00
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.7oa r1 = r13.A00
            if (r1 == 0) goto L_0x0349
            X.MeW r0 = r2.A05
            r0.ChW(r1)
            java.lang.Object r1 = r12.A01
            X.Dnj r1 = (X.C25550Dnj) r1
            r0 = 1
            r1.A02(r2, r0, r4)
            r0 = -908108723(0xffffffffc9df5c4d, float:-1829769.6)
            X.C14030oh.A0A(r0, r5)
            r0 = 1298466579(0x4d650713, float:2.4015288E8)
        L_0x0345:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x0349:
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        boolean z;
        switch (this.A02) {
            case 0:
                i = C14030oh.A03(1211834067);
                AnonymousClass5z0 r9 = (AnonymousClass5z0) obj;
                int A03 = C14030oh.A03(1555424505);
                if (!(r9 == null || (obj3 = r9.A01) == null)) {
                    C148018qJ r1 = (C148018qJ) obj3;
                    if (!(r1.AnJ() == null || r1.AnJ().Ac5() == null)) {
                        C148538rF Ac5 = r1.AnJ().Ac5();
                        HashMap A0y = AnonymousClass0wJ.A0y();
                        C121307Fk.A03(A0y, "given-name", Ac5.Akj());
                        C121307Fk.A03(A0y, "family-name", Ac5.AhD());
                        C121307Fk.A03(A0y, "address-line1", Ac5.APc());
                        C121307Fk.A03(A0y, "address-line2", Ac5.APd());
                        C121307Fk.A03(A0y, "address-level1", Ac5.APa());
                        C121307Fk.A03(A0y, "address-level2", Ac5.APb());
                        C121307Fk.A03(A0y, "postal-code", Ac5.B2P());
                        C121307Fk.A03(A0y, "country", Ac5.Aa7());
                        C121307Fk.A03(A0y, "email", Ac5.AfO());
                        C121307Fk.A03(A0y, "tel", Ac5.BFn());
                        AutofillData autofillData = new AutofillData((Map) A0y);
                        Iterator A14 = C86104wH.A14(A0y);
                        while (true) {
                            if (!A14.hasNext()) {
                                z = true;
                            } else if (!TextUtils.isEmpty(C18180wK.A0k(A14))) {
                                z = false;
                            }
                        }
                        C1201579a A002 = C1201579a.A00((Context) this.A00, (UserSession) this.A01);
                        if (!z) {
                            A002.A01(autofillData);
                        } else {
                            C18190wL.A11(A002.A01);
                        }
                        i4 = 642945935;
                        C14030oh.A0A(i4, A03);
                        i2 = 1816123214;
                        break;
                    }
                }
                C10450iM.A03("AutofillGraphQLRequest", "Error creating query autofill response");
                i4 = 289873278;
                C14030oh.A0A(i4, A03);
                i2 = 1816123214;
            case 1:
                i = C14030oh.A03(131704020);
                AnonymousClass5z0 r92 = (AnonymousClass5z0) obj;
                int A032 = C14030oh.A03(1750634066);
                if (r92 == null || (obj2 = r92.A01) == null) {
                    C10450iM.A03("AutofillGraphQLRequest", "Error creating query autofill response");
                    i3 = 376231420;
                } else {
                    ArrayList A0s = C18200wM.A0s(((C148028qK) obj2).Any());
                    ArrayList<AutofillData> A0v = AnonymousClass0wJ.A0v();
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        C148558rH r4 = (C148558rH) it.next();
                        HashMap A0y2 = AnonymousClass0wJ.A0y();
                        C121307Fk.A03(A0y2, "id", r4.Afv());
                        C121307Fk.A03(A0y2, "given-name", r4.Akj());
                        C121307Fk.A03(A0y2, "family-name", r4.AhD());
                        C121307Fk.A03(A0y2, "address-line1", r4.APc());
                        C121307Fk.A03(A0y2, "address-line2", r4.APd());
                        C121307Fk.A03(A0y2, "address-level1", r4.APa());
                        C121307Fk.A03(A0y2, "address-level2", r4.APb());
                        C121307Fk.A03(A0y2, "postal-code", r4.B2P());
                        C121307Fk.A03(A0y2, "country", r4.Aa7());
                        C121307Fk.A03(A0y2, "email", r4.AfO());
                        C121307Fk.A03(A0y2, "tel", r4.BFn());
                        A0v.add(new AutofillData((Map) A0y2));
                    }
                    SharedPreferences sharedPreferences = C1201579a.A00((Context) this.A00, (UserSession) this.A01).A01;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!sharedPreferences.getAll().isEmpty()) {
                        edit.clear();
                    }
                    for (AutofillData autofillData2 : A0v) {
                        String A0r = C18220wO.A0r("id", autofillData2.A00);
                        if (A0r != null) {
                            C18180wK.A0v(edit, A0r, autofillData2.A01().toString());
                        }
                    }
                    i3 = 1214294181;
                }
                C14030oh.A0A(i3, A032);
                i2 = -36329776;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C14030oh.A0A(i2, i);
    }
}

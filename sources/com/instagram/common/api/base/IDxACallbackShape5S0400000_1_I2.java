package com.instagram.common.api.base;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1j3;
import X.AnonymousClass3C3;
import X.AnonymousClass3C4;
import X.AnonymousClass3EW;
import X.AnonymousClass3XX;
import X.AnonymousClass42P;
import X.AnonymousClass42Q;
import X.AnonymousClass42R;
import X.AnonymousClass42S;
import X.AnonymousClass4QQ;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C10600ic;
import X.C109326jp;
import X.C12560m7;
import X.C14030oh;
import X.C146578mT;
import X.C146958n9;
import X.C18220wO;
import X.C18240wQ;
import X.C25237DiI;
import X.C27952Ew2;
import X.C37408JrQ;
import X.C38040KHr;
import X.C61043Rr;
import X.C61873Wd;
import X.C63483hZ;
import X.C63643hy;
import X.C63733iD;
import X.C63813iO;
import X.C63873iU;
import X.C63893iY;
import X.C81354ne;
import X.C83224qz;
import X.C83584re;
import X.H4Q;
import android.content.Context;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.user.model.User;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5;

public class IDxACallbackShape5S0400000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxACallbackShape5S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A00 = obj;
    }

    public final void onFail(AnonymousClass3XX r14) {
        int A032;
        int i;
        String str;
        Object obj;
        switch (this.A04) {
            case 0:
                A032 = AnonymousClass0wJ.A00(-765187000, r14);
                C146578mT r0 = (C146578mT) r14.A00;
                if (r0 == null || r0.getStatusCode() != 400) {
                    obj = this.A02;
                } else {
                    obj = this.A03;
                }
                C63893iY r1 = (C63893iY) this.A00;
                C61043Rr.A00((AnonymousClass601) this.A01, r1, (C109326jp) obj);
                i = 264463903;
                break;
            case 1:
                A032 = C14030oh.A03(1911237023);
                int A033 = C14030oh.A03(1358012877);
                Context context = (Context) this.A00;
                C63813iO.A01(context, C63483hZ.A04(r14, context.getString(2131834837)));
                C14030oh.A0A(759426839, A033);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A02;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Bdy(new C37408JrQ(C18220wO.A0n(categorySearchFragment), categorySearchFragment.A0C, "save_info", (String) null, (String) null, (Map) null, (Map) this.A03, (Map) null));
                }
                i = 133839516;
                break;
            case 2:
                A032 = AnonymousClass0wJ.A00(-806537740, r14);
                Throwable th = r14.A01;
                if (th != null) {
                    ((AnonymousClass42P) this.A03).A02.A02((C81354ne) this.A00, th.getMessage());
                }
                i = 1555384868;
                break;
            case 3:
                A032 = AnonymousClass0wJ.A00(-606425866, r14);
                Throwable th2 = r14.A01;
                if (th2 != null) {
                    ((AnonymousClass42Q) this.A03).A02.A02((C81354ne) this.A00, th2.getMessage());
                }
                i = -922493105;
                break;
            case 4:
                A032 = AnonymousClass0wJ.A00(-297930953, r14);
                Throwable th3 = r14.A01;
                if (th3 != null) {
                    ((AnonymousClass42R) this.A03).A02.A02((C81354ne) this.A00, th3.getMessage());
                }
                i = -340500720;
                break;
            case 5:
                A032 = AnonymousClass0wJ.A00(-427058413, r14);
                Throwable th4 = r14.A01;
                if (th4 != null) {
                    ((AnonymousClass42S) this.A03).A02.A02((C81354ne) this.A00, th4.getMessage());
                }
                i = -1029707058;
                break;
            case 6:
                A032 = AnonymousClass0wJ.A00(909943413, r14);
                Throwable th5 = r14.A01;
                if (th5 != null) {
                    ((AnonymousClass3C3) this.A03).A01.A03((C81354ne) this.A00, AnonymousClass006.A0C, th5.getMessage());
                }
                i = -781328615;
                break;
            case 7:
                A032 = AnonymousClass0wJ.A00(-1037610155, r14);
                Throwable th6 = r14.A01;
                if (th6 != null) {
                    ((AnonymousClass3C4) this.A03).A01.A03((C81354ne) this.A00, AnonymousClass006.A00, th6.getMessage());
                }
                i = -1901713243;
                break;
            case 8:
                A032 = C14030oh.A03(-258920711);
                i = 2015769174;
                break;
            case 9:
                A032 = C14030oh.A03(1214273147);
                C04220Ms.A0B(r14, 0);
                AnonymousClass1j3 r02 = (AnonymousClass1j3) r14.A00;
                if (r02 == null || (str = r02.mClientFacingErrorMessage) == null || str.length() == 0) {
                    C63813iO.A03((Context) this.A00, (String) null, 2131831662, 0);
                } else {
                    C63733iD A022 = C63733iD.A02();
                    A022.A0E = "group_profile_admin_request_failure";
                    A022.A0A = str;
                    A022.A0C();
                    C63733iD.A0A(A022);
                }
                i = -75376333;
                break;
            case 10:
                A032 = C14030oh.A03(1807062693);
                ((AnonymousClass3EW) this.A02).A00((AnonymousClass3XX) this.A01);
                i = 1181516655;
                break;
            case 11:
                A032 = C14030oh.A03(-762205619);
                C18240wQ.A1G(this.A03);
                String A0k = AnonymousClass0wJ.A0k(C10600ic.A00, 2131832535);
                C63733iD A002 = C63733iD.A00();
                A002.A0A = A0k;
                C38040KHr.A01.CWx(new H4Q(A002.A0B()));
                i = 24995675;
                break;
            default:
                A032 = C14030oh.A03(-1926566481);
                C61873Wd.A01((C12560m7) this.A02);
                C63643hy.A04(new AnonymousClass4QQ(this));
                i = 787698866;
                break;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A04) {
            case 1:
                i = C14030oh.A03(1139979125);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A02;
                ActionButton actionButton = categorySearchFragment.mActionButton;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(0);
                }
                categorySearchFragment.A08.A00 = true;
                i2 = 1906981146;
                break;
            case 9:
                i = C14030oh.A03(807468611);
                ((C83584re) this.A01).BjI((User) this.A03);
                i2 = -1019165061;
                break;
            case 11:
                i = C14030oh.A03(411111480);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0100000_I2_5(this.A00, (C146958n9) null, 11), (C83224qz) this.A01, 3);
                i2 = -1305574455;
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
        switch (this.A04) {
            case 1:
                i = C14030oh.A03(283992559);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A02;
                ActionButton actionButton = categorySearchFragment.mActionButton;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                }
                categorySearchFragment.A08.A00 = false;
                i2 = 919705908;
                break;
            case 9:
                i = C14030oh.A03(-419459266);
                ((C83584re) this.A01).BjN((User) this.A03);
                i2 = -938883609;
                break;
            case 11:
                i = C14030oh.A03(205152594);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0100000_I2_5(this.A00, (C146958n9) null, 12), (C83224qz) this.A01, 3);
                i2 = 752393090;
                break;
            default:
                super.onStart();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x022e, code lost:
        if (r10 == null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0247, code lost:
        if (r11 != null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x024f, code lost:
        if (r16 == null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0251, code lost:
        r16 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0253, code lost:
        if (r10 == null) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0255, code lost:
        r14 = X.C18220wO.A0l(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r14 != null) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025b, code lost:
        r14 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025c, code lost:
        if (r10 == null) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025e, code lost:
        r15 = X.C18220wO.A0m(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0262, code lost:
        if (r15 != null) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0264, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0265, code lost:
        r5 = r9.getTreeValue("xfb_one_link_monoschema(input:$input)", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0269, code lost:
        if (r5 == null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026b, code lost:
        r2 = r5.getTreeValue("page_info", com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0273, code lost:
        if (r2 == null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0275, code lost:
        r17 = r2.getBooleanValue("is_bpl_and_ads_page_consistent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027b, code lost:
        r11 = new com.instagram.business.onelink.cache.FBPageCacheInfo(r12, r13, r14, r15, r16, r17);
        r2 = r4.A00;
        r9 = X.C18250wR.A06(r2.A00);
        r5 = r2.A01;
        r9.putString("fb_page_info", X.C18210wN.A0d(com.instagram.business.onelink.cache.FBPageCacheInfo.class, r11, r5, r5.A02));
        r9.apply();
        r4.A03.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a0, code lost:
        r17 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            r5 = r19
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x07ad;
                case 1: goto L_0x075d;
                case 2: goto L_0x0678;
                case 3: goto L_0x059f;
                case 4: goto L_0x047e;
                case 5: goto L_0x038d;
                case 6: goto L_0x02b3;
                case 7: goto L_0x017c;
                case 8: goto L_0x0117;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00c9;
                case 11: goto L_0x007f;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 1513682194(0x5a38f512, float:1.30152133E16)
            int r0 = X.C14030oh.A03(r0)
            X.1qv r5 = (X.C26611qv) r5
            r2 = 923023550(0x370438be, float:7.881024E-6)
            int r4 = X.C14030oh.A03(r2)
            X.3GW r3 = X.AnonymousClass3GW.A00
            java.lang.Object r2 = r1.A03
            X.0i6 r2 = (X.C10300i6) r2
            X.49w r8 = r3.A00(r2)
            if (r8 == 0) goto L_0x0071
            r8.A01()
            java.lang.Integer r3 = r5.A00
            java.lang.Integer r2 = X.AnonymousClass006.A01
            if (r3 != r2) goto L_0x0058
            java.lang.Object r7 = r1.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r2 = r5.A07
            java.lang.Integer r6 = X.C34642Ki.A00(r2)
            java.util.HashMap r3 = r5.A09
            if (r3 != 0) goto L_0x0040
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x0040:
            r2 = 0
            r8.A04(r7, r6, r2, r3)
        L_0x0044:
            java.lang.Object r1 = r1.A02
            X.0m7 r1 = (X.C12560m7) r1
            X.C61873Wd.A01(r1)
            r1 = 1045151882(0x3e4bc08a, float:0.19897667)
            X.C14030oh.A0A(r1, r4)
            r1 = -1190156594(0xffffffffb90fa6ce, float:-1.3699682E-4)
        L_0x0054:
            X.C14030oh.A0A(r1, r0)
            return
        L_0x0058:
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            if (r3 != r2) goto L_0x0044
            java.lang.Object r9 = r1.A01
            android.content.Context r9 = (android.content.Context) r9
            r10 = 0
            java.lang.String r11 = r5.A03
            java.lang.String r12 = r5.A08
            java.lang.String r13 = r5.A06
            java.lang.String r14 = r5.A04
            java.lang.String r15 = r5.A05
            r16 = 0
            r8.A03(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0044
        L_0x0071:
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x0044
            boolean r2 = r3 instanceof com.instagram.challenge.activity.ChallengeActivity
            if (r2 == 0) goto L_0x0044
            r3.finish()
            goto L_0x0044
        L_0x007f:
            r0 = 1817155534(0x6c4f97ce, float:1.0038581E27)
            int r0 = X.C14030oh.A03(r0)
            r2 = -1632270479(0xffffffff9eb58771, float:-1.9220138E-20)
            int r4 = X.C14030oh.A03(r2)
            java.lang.Object r1 = r1.A02
            X.C18240wQ.A1G(r1)
            r3 = 2131232883(0x7f080873, float:1.8081888E38)
            r2 = 2131832542(0x7f112ede, float:1.929814E38)
            android.content.Context r1 = X.C10600ic.A00
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r1, r2)
            X.3iD r2 = X.C63733iD.A00()
            r2.A0A = r1
            X.22b r1 = X.AnonymousClass22b.ICON
            r2.A0E(r1)
            android.content.Context r1 = X.C10600ic.A00
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r2.A03 = r1
            X.3TR r1 = r2.A0B()
            X.H4Q r2 = new X.H4Q
            r2.<init>(r1)
            X.KHr r1 = X.C38040KHr.A01
            r1.CWx(r2)
            r1 = 276828597(0x108011b5, float:5.051438E-29)
            X.C14030oh.A0A(r1, r4)
            r1 = 1764299359(0x6929125f, float:1.2774701E25)
            goto L_0x0054
        L_0x00c9:
            r0 = -1458704938(0xffffffffa90dedd6, float:-3.151458E-14)
            int r0 = X.C14030oh.A03(r0)
            X.1qy r5 = (X.C26641qy) r5
            r2 = -1165056320(0xffffffffba8ea6c0, float:-0.0010883436)
            int r3 = X.C14030oh.A03(r2)
            com.instagram.user.model.User r6 = r5.A00
            java.lang.Object r2 = r1.A00
            X.4Jr r2 = (X.C71664Jr) r2
            X.1uI r4 = r2.A02
            java.lang.Object r5 = r1.A03
            X.0bf r5 = (X.C07530bf) r5
            X.269 r7 = X.AnonymousClass269.RegisterAccountCreated
            r8 = 0
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9)
            r1 = -2076849466(0xffffffff8435cac6, float:-2.1369557E-36)
            X.C14030oh.A0A(r1, r3)
            r1 = -2114938964(0xffffffff81f097ac, float:-8.8379715E-38)
            goto L_0x0054
        L_0x00f7:
            r0 = 1357213926(0x50e570e6, float:3.0795051E10)
            int r0 = X.C14030oh.A03(r0)
            r2 = -178687884(0xfffffffff5597074, float:-2.7563702E32)
            int r2 = X.AnonymousClass0wJ.A00(r2, r5)
            java.lang.Object r1 = r1.A02
            X.0YY r1 = (X.AnonymousClass0YY) r1
            r1.invoke(r5)
            r1 = 1214495622(0x4863bb86, float:233198.1)
            X.C14030oh.A0A(r1, r2)
            r1 = 1618088458(0x6072120a, float:6.977206E19)
            goto L_0x0054
        L_0x0117:
            r0 = 1469221752(0x57928b78, float:3.22255423E14)
            int r0 = X.C14030oh.A03(r0)
            X.1TU r5 = (X.AnonymousClass1TU) r5
            r2 = 223190901(0xd4d9f75, float:6.336244E-31)
            int r6 = X.C14030oh.A03(r2)
            boolean r2 = r5.A03
            if (r2 == 0) goto L_0x0171
            X.24D r3 = r5.A02
            X.24D r2 = X.AnonymousClass24D.UNSET
            if (r3 != r2) goto L_0x0171
            X.3Vz r7 = X.C36622Sa.A00()
            java.lang.Object r5 = r1.A02
            X.4tx r5 = (X.C84844tx) r5
            java.lang.Object r3 = r1.A03
            X.4o8 r3 = (X.C81644o8) r3
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r1.A00
            com.facebook.redex.IDxIListenerShape658S0100000_1_I2 r1 = (com.facebook.redex.IDxIListenerShape658S0100000_1_I2) r1
            java.lang.Object r1 = r1.A00
            X.E4i r1 = (X.C26218E4i) r1
            X.IcN r4 = r1.A0F
            r7.A09(r2, r4, r3, r5)
            com.instagram.service.session.UserSession r3 = r1.A0O
            X.24D r2 = X.AnonymousClass24D.ON
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            X.H1T r3 = X.AnonymousClass0wJ.A0O(r3)
            java.lang.String r1 = "users/set_live_settings/"
            r3.A0J(r1)
            java.lang.String r2 = r2.A00
            java.lang.String r1 = "live_badge_setting"
            r3.A0O(r1, r2)
            java.lang.Class<X.4vo> r2 = X.C85814vo.class
            java.lang.Class<X.3Za> r1 = X.AnonymousClass3Za.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r3, r2, r1)
            r4.schedule(r1)
        L_0x0171:
            r1 = -877872551(0xffffffffcbacba59, float:-2.2639794E7)
            X.C14030oh.A0A(r1, r6)
            r1 = 1065815870(0x3f870f3e, float:1.0551527)
            goto L_0x0054
        L_0x017c:
            r0 = 1938537204(0x738bbaf4, float:2.2141148E31)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            r2 = -137954328(0xfffffffff7c6fbe8, float:-8.0717503E33)
            int r6 = X.C14030oh.A03(r2)
            r8 = 0
            X.C04220Ms.A0B(r5, r8)
            java.lang.Object r4 = r1.A03
            X.3C4 r4 = (X.AnonymousClass3C4) r4
            java.lang.Object r3 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r3
            java.lang.Object r11 = r1.A00
            X.4ne r11 = (X.C81354ne) r11
            java.lang.Object r7 = r1.A01
            X.4pI r7 = (X.C82234pI) r7
            java.lang.Object r9 = r5.A01
            com.facebook.pando.TreeJNI r9 = (com.facebook.pando.TreeJNI) r9
            if (r9 != 0) goto L_0x01bb
            X.3aR r2 = r4.A01
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.C04220Ms.A0B(r3, r8)
            X.C62633aR.A02(r3, r2, r11, r1)
        L_0x01b0:
            r1 = -1541653196(0xffffffffa41c3d34, float:-3.387895E-17)
            X.C14030oh.A0A(r1, r6)
            r1 = -1439154829(0xffffffffaa383d73, float:-1.6363802E-13)
            goto L_0x0054
        L_0x01bb:
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema> r8 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.class
            java.lang.String r5 = "xfb_one_link_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r3 = r9.getTreeValue(r5, r8)
            if (r3 == 0) goto L_0x02ab
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.class
            java.lang.String r1 = "page_info"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x02ab
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$BplPage> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.BplPage.class
            java.lang.String r1 = "bpl_page"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x02ab
            java.lang.String r1 = X.C18220wO.A0m(r3)
            if (r1 == 0) goto L_0x02a8
            java.lang.String r1 = X.C18210wN.A0f(r1)
            X.3EH r10 = new X.3EH
            r10.<init>(r1)
        L_0x01e8:
            java.lang.String r2 = X.C18220wO.A0l(r3)
            java.lang.String r1 = "profile_pic_uri"
            java.lang.String r1 = r3.getStringValue(r1)
            X.3Sb r3 = new X.3Sb
            r3.<init>(r10, r2, r1)
        L_0x01f7:
            boolean r1 = r11 instanceof X.AnonymousClass42T
            if (r1 == 0) goto L_0x0230
            com.facebook.pando.TreeJNI r10 = r9.getTreeValue(r5, r8)
            r12 = 0
            if (r10 == 0) goto L_0x02a5
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.class
            java.lang.String r1 = "page_info"
            com.facebook.pando.TreeJNI r10 = r10.getTreeValue(r1, r2)
            if (r10 == 0) goto L_0x02a5
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$BplPage> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.BplPage.class
            java.lang.String r1 = "bpl_page"
            com.facebook.pando.TreeJNI r11 = r10.getTreeValue(r1, r2)
        L_0x0214:
            com.facebook.pando.TreeJNI r10 = r9.getTreeValue(r5, r8)
            if (r10 == 0) goto L_0x02a3
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.class
            java.lang.String r1 = "page_info"
            com.facebook.pando.TreeJNI r10 = r10.getTreeValue(r1, r2)
            if (r10 == 0) goto L_0x02a3
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$AdsPage> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.AdsPage.class
            java.lang.String r1 = "ads_page"
            com.facebook.pando.TreeJNI r10 = r10.getTreeValue(r1, r2)
        L_0x022c:
            if (r11 != 0) goto L_0x0235
            if (r10 != 0) goto L_0x0239
        L_0x0230:
            r7.onSuccess(r3)
            goto L_0x01b0
        L_0x0235:
            java.lang.String r12 = X.C18220wO.A0l(r11)
        L_0x0239:
            java.lang.String r2 = ""
            if (r12 != 0) goto L_0x023e
            r12 = r2
        L_0x023e:
            if (r11 == 0) goto L_0x0246
            java.lang.String r13 = X.C18220wO.A0m(r11)
            if (r13 != 0) goto L_0x0249
        L_0x0246:
            r13 = r2
            if (r11 == 0) goto L_0x0251
        L_0x0249:
            java.lang.String r1 = "profile_pic_uri"
            java.lang.String r16 = r11.getStringValue(r1)
            if (r16 != 0) goto L_0x0253
        L_0x0251:
            r16 = r2
        L_0x0253:
            if (r10 == 0) goto L_0x025b
            java.lang.String r14 = X.C18220wO.A0l(r10)
            if (r14 != 0) goto L_0x025e
        L_0x025b:
            r14 = r2
            if (r10 == 0) goto L_0x0264
        L_0x025e:
            java.lang.String r15 = X.C18220wO.A0m(r10)
            if (r15 != 0) goto L_0x0265
        L_0x0264:
            r15 = r2
        L_0x0265:
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r5, r8)
            if (r5 == 0) goto L_0x02a0
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl$XfbOneLinkMonoschema$PageInfo> r2 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageWithBPLPageInfoQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.class
            java.lang.String r1 = "page_info"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x02a0
            java.lang.String r1 = "is_bpl_and_ads_page_consistent"
            boolean r17 = r2.getBooleanValue(r1)
        L_0x027b:
            com.instagram.business.onelink.cache.FBPageCacheInfo r11 = new com.instagram.business.onelink.cache.FBPageCacheInfo
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.37d r2 = r4.A00
            android.content.SharedPreferences r1 = r2.A00
            android.content.SharedPreferences$Editor r9 = X.C18250wR.A06(r1)
            java.lang.String r8 = "fb_page_info"
            X.Ji8 r5 = r2.A01
            X.76V r2 = r5.A02
            java.lang.Class<com.instagram.business.onelink.cache.FBPageCacheInfo> r1 = com.instagram.business.onelink.cache.FBPageCacheInfo.class
            java.lang.String r1 = X.C18210wN.A0d(r1, r11, r5, r2)
            r9.putString(r8, r1)
            r9.apply()
            X.0ZU r1 = r4.A03
            r1.invoke()
            goto L_0x0230
        L_0x02a0:
            r17 = 0
            goto L_0x027b
        L_0x02a3:
            r10 = r12
            goto L_0x022c
        L_0x02a5:
            r11 = r12
            goto L_0x0214
        L_0x02a8:
            r10 = 0
            goto L_0x01e8
        L_0x02ab:
            r1 = 0
            X.3Sb r3 = new X.3Sb
            r3.<init>(r1, r1, r1)
            goto L_0x01f7
        L_0x02b3:
            r0 = -291432624(0xffffffffeea11750, float:-2.4927635E28)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            r2 = 933372464(0x37a22230, float:1.9327825E-5)
            int r7 = X.AnonymousClass0wJ.A00(r2, r5)
            java.lang.Object r8 = r1.A03
            X.3C3 r8 = (X.AnonymousClass3C3) r8
            java.lang.Object r3 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r3
            java.lang.Object r9 = r1.A00
            X.4ne r9 = (X.C81354ne) r9
            java.lang.Object r6 = r1.A01
            X.4pI r6 = (X.C82234pI) r6
            java.lang.Object r11 = r5.A01
            com.facebook.pando.TreeJNI r11 = (com.facebook.pando.TreeJNI) r11
            if (r11 != 0) goto L_0x02eb
            X.3aR r2 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            X.C62633aR.A02(r3, r2, r9, r1)
        L_0x02e0:
            r1 = 429637601(0x199bbfe1, float:1.6104124E-23)
            X.C14030oh.A0A(r1, r7)
            r1 = -888669410(0xffffffffcb07fb1e, float:-8911646.0)
            goto L_0x0054
        L_0x02eb:
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl$XfbOneLinkMonoschema> r10 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl.XfbOneLinkMonoschema.class
            java.lang.String r5 = "xfb_one_link_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r5, r10)
            if (r3 == 0) goto L_0x0386
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo> r2 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.class
            java.lang.String r1 = "business_info"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x0386
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo$Business> r2 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.Business.class
            java.lang.String r1 = "business"
            com.facebook.pando.TreeJNI r12 = r3.getTreeValue(r1, r2)
            if (r12 == 0) goto L_0x0386
            java.lang.String r4 = X.C18220wO.A0l(r12)
            java.lang.String r1 = X.C18220wO.A0m(r12)
            if (r1 == 0) goto L_0x0384
            java.lang.String r1 = X.C18210wN.A0f(r1)
            X.3EH r3 = new X.3EH
            r3.<init>(r1)
        L_0x031c:
            java.lang.String r1 = "is_two_factor_enabled"
            java.lang.Boolean r2 = X.C18250wR.A0S(r12, r1)
            java.lang.String r1 = "is_hidden"
            java.lang.Boolean r1 = X.C18250wR.A0S(r12, r1)
            X.3Sr r12 = new X.3Sr
            r12.<init>(r3, r2, r1, r4)
        L_0x032d:
            boolean r1 = r9 instanceof X.AnonymousClass42T
            if (r1 == 0) goto L_0x037f
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r5, r10)
            if (r3 == 0) goto L_0x037f
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo> r2 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.class
            java.lang.String r1 = "business_info"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x037f
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo$Business> r2 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.Business.class
            java.lang.String r1 = "business"
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r1, r2)
            if (r1 == 0) goto L_0x037f
            java.lang.String r3 = X.C18220wO.A0l(r1)
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x0354
            r3 = r2
        L_0x0354:
            java.lang.String r1 = X.C18220wO.A0m(r1)
            if (r1 == 0) goto L_0x035b
            r2 = r1
        L_0x035b:
            com.instagram.business.onelink.cache.BusinessAccountCacheInfo r9 = new com.instagram.business.onelink.cache.BusinessAccountCacheInfo
            r9.<init>(r3, r2)
            X.37c r2 = r8.A00
            android.content.SharedPreferences r1 = r2.A00
            android.content.SharedPreferences$Editor r5 = X.C18250wR.A06(r1)
            java.lang.String r4 = "business_account_info"
            X.Ji8 r3 = r2.A01
            X.76V r2 = r3.A02
            java.lang.Class<com.instagram.business.onelink.cache.BusinessAccountCacheInfo> r1 = com.instagram.business.onelink.cache.BusinessAccountCacheInfo.class
            java.lang.String r1 = X.C18210wN.A0d(r1, r9, r3, r2)
            r5.putString(r4, r1)
            r5.apply()
            X.0ZU r1 = r8.A03
            r1.invoke()
        L_0x037f:
            r6.onSuccess(r12)
            goto L_0x02e0
        L_0x0384:
            r3 = 0
            goto L_0x031c
        L_0x0386:
            r1 = 0
            X.3Sr r12 = new X.3Sr
            r12.<init>(r1, r1, r1, r1)
            goto L_0x032d
        L_0x038d:
            r0 = -1416198068(0xffffffffab96884c, float:-1.0695971E-12)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            r2 = -477226934(0xffffffffe38e184a, float:-5.242376E21)
            int r4 = X.AnonymousClass0wJ.A00(r2, r5)
            java.lang.Object r3 = r1.A03
            X.42S r3 = (X.AnonymousClass42S) r3
            java.lang.Object r2 = r1.A00
            X.4ne r2 = (X.C81354ne) r2
            java.lang.Object r8 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r8
            java.lang.Object r1 = r1.A01
            X.4pI r1 = (X.C82234pI) r1
            java.lang.Object r7 = r5.A01
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            if (r7 == 0) goto L_0x0451
            java.lang.Class<com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl$XfbOneLinkMonoschema> r6 = com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl.XfbOneLinkMonoschema.class
            java.lang.String r5 = "xfb_one_link_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r7 = r7.getTreeValue(r5, r6)
            if (r7 == 0) goto L_0x0451
            java.lang.Class<com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl$XfbOneLinkMonoschema$WhatsappInfo> r6 = com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl.XfbOneLinkMonoschema.WhatsappInfo.class
            java.lang.String r5 = "whatsapp_info"
            com.facebook.pando.TreeJNI r7 = r7.getTreeValue(r5, r6)
            if (r7 == 0) goto L_0x0451
            java.lang.String r5 = "linked_whatsapp_phone_number"
            java.lang.String r10 = r7.getStringValue(r5)
            X.20R r6 = X.AnonymousClass20R.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r5 = "linked_whatsapp_account_type"
            java.lang.Enum r5 = r7.getEnumValue(r5, r6)
            X.20R r5 = (X.AnonymousClass20R) r5
            if (r5 == 0) goto L_0x044f
            java.lang.String r11 = r5.name()
        L_0x03dd:
            java.lang.String r5 = "is_risky_tier_account_for_ctwa"
            boolean r12 = r7.getBooleanValue(r5)
            java.lang.Class<com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl$XfbOneLinkMonoschema$WhatsappInfo$LinkedWhatsappAccount> r6 = com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl.XfbOneLinkMonoschema.WhatsappInfo.LinkedWhatsappAccount.class
            java.lang.String r5 = "linked_whatsapp_account"
            com.facebook.pando.TreeJNI r6 = r7.getTreeValue(r5, r6)
            if (r6 == 0) goto L_0x044d
            java.lang.String r5 = "is_whatsapp_number_banned"
            boolean r13 = r6.getBooleanValue(r5)
        L_0x03f3:
            java.lang.String r5 = "is_business_verification_eligible"
            boolean r14 = r7.getBooleanValue(r5)
            com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo r9 = new com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r5 = r9.A01
            if (r5 == 0) goto L_0x044b
            X.3EH r11 = new X.3EH
            r11.<init>(r5)
        L_0x0407:
            java.lang.String r12 = r9.A00
            boolean r13 = r9.A03
            boolean r14 = r9.A04
            boolean r15 = r9.A02
            X.6li r10 = new X.6li
            r10.<init>(r11, r12, r13, r14, r15)
            boolean r2 = r2 instanceof X.AnonymousClass42T
            if (r2 == 0) goto L_0x043b
            r3.A00 = r10
            X.37e r5 = r3.A01
            android.content.SharedPreferences r2 = r5.A00
            android.content.SharedPreferences$Editor r8 = X.C18250wR.A06(r2)
            java.lang.String r7 = "whatsapp_business_info"
            X.Ji8 r6 = r5.A01
            X.76V r5 = r6.A02
            java.lang.Class<com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo> r2 = com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo.class
            java.lang.String r2 = X.C18210wN.A0d(r2, r9, r6, r5)
            r8.putString(r7, r2)
            r8.apply()
            X.KHq r3 = r3.A03
            X.46c r2 = X.C689546c.A00
            r3.CWx(r2)
        L_0x043b:
            if (r1 == 0) goto L_0x0440
            r1.onSuccess(r10)
        L_0x0440:
            r1 = 1691247388(0x64ce631c, float:3.0457367E22)
            X.C14030oh.A0A(r1, r4)
            r1 = -655073108(0xffffffffd8f460ac, float:-2.14956832E15)
            goto L_0x0054
        L_0x044b:
            r11 = 0
            goto L_0x0407
        L_0x044d:
            r13 = 0
            goto L_0x03f3
        L_0x044f:
            r11 = 0
            goto L_0x03dd
        L_0x0451:
            boolean r5 = r2 instanceof X.AnonymousClass42T
            if (r5 == 0) goto L_0x046f
            r5 = 0
            r3.A00 = r5
            X.37e r5 = r3.A01
            android.content.SharedPreferences r5 = r5.A00
            android.content.SharedPreferences$Editor r6 = X.C18250wR.A06(r5)
            java.lang.String r5 = "whatsapp_business_info"
            r6.remove(r5)
            r6.apply()
            X.KHq r6 = r3.A03
            X.46c r5 = X.C689546c.A00
            r6.CWx(r5)
        L_0x046f:
            X.3I4 r3 = r3.A02
            r3.A01(r8, r2)
            if (r1 == 0) goto L_0x0440
            java.lang.String r2 = "WhatsApp Business response is null."
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r2)
            goto L_0x0440
        L_0x047e:
            r0 = 1282168959(0x4c6c587f, float:6.1956604E7)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            r2 = 48816171(0x2e8e02b, float:3.4218002E-37)
            int r3 = X.AnonymousClass0wJ.A00(r2, r5)
            java.lang.Object r6 = r1.A03
            X.42R r6 = (X.AnonymousClass42R) r6
            java.lang.Object r2 = r1.A00
            X.4ne r2 = (X.C81354ne) r2
            java.lang.Object r7 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r7
            java.lang.Object r4 = r1.A01
            X.4pI r4 = (X.C82234pI) r4
            r14 = 0
            java.lang.Object r8 = r5.A01
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            if (r8 == 0) goto L_0x0573
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl$XfbOneLinkMonoschema> r5 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl.XfbOneLinkMonoschema.class
            java.lang.String r1 = "xfb_one_link_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r10 = r8.getTreeValue(r1, r5)
            if (r10 == 0) goto L_0x0573
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl$XfbOneLinkMonoschema$PageInfo> r9 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.class
            java.lang.String r8 = "page_info"
            com.facebook.pando.TreeJNI r7 = r10.getTreeValue(r8, r9)
            if (r7 == 0) goto L_0x0570
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$BplPage> r5 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.BplPage.class
            java.lang.String r1 = "bpl_page"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r1, r5)
            if (r1 == 0) goto L_0x0570
            java.lang.String r11 = X.C18220wO.A0l(r1)
        L_0x04c7:
            com.facebook.pando.TreeJNI r7 = r10.getTreeValue(r8, r9)
            if (r7 == 0) goto L_0x056d
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$BplPage> r5 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.BplPage.class
            java.lang.String r1 = "bpl_page"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r1, r5)
            if (r1 == 0) goto L_0x056d
            java.lang.String r12 = X.C18220wO.A0m(r1)
        L_0x04db:
            com.facebook.pando.TreeJNI r7 = r10.getTreeValue(r8, r9)
            if (r7 == 0) goto L_0x056b
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$AdsPage> r5 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.AdsPage.class
            java.lang.String r1 = "ads_page"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r1, r5)
            if (r1 == 0) goto L_0x056b
            java.lang.String r13 = X.C18220wO.A0l(r1)
        L_0x04ef:
            com.facebook.pando.TreeJNI r7 = r10.getTreeValue(r8, r9)
            if (r7 == 0) goto L_0x0503
            java.lang.Class<com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl$XfbOneLinkMonoschema$PageInfo$AdsPage> r5 = com.instagram.business.onelink.queries.page.IGOneLinkMiddlewarePageQueryResponseImpl.XfbOneLinkMonoschema.PageInfo.AdsPage.class
            java.lang.String r1 = "ads_page"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r1, r5)
            if (r1 == 0) goto L_0x0503
            java.lang.String r14 = X.C18220wO.A0m(r1)
        L_0x0503:
            com.facebook.pando.TreeJNI r5 = r10.getTreeValue(r8, r9)
            if (r5 == 0) goto L_0x0568
            java.lang.String r1 = "is_bpl_and_ads_page_consistent"
            boolean r16 = r5.getBooleanValue(r1)
        L_0x050f:
            r15 = 0
            com.instagram.business.onelink.cache.FBPageCacheInfo r10 = new com.instagram.business.onelink.cache.FBPageCacheInfo
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r8 = r10.A03
            java.lang.String r1 = r10.A02
            r7 = 0
            if (r1 == 0) goto L_0x0521
            X.3EH r15 = new X.3EH
            r15.<init>(r1)
        L_0x0521:
            java.lang.String r5 = r10.A01
            java.lang.String r1 = r10.A00
            if (r1 == 0) goto L_0x052c
            X.3EH r7 = new X.3EH
            r7.<init>(r1)
        L_0x052c:
            X.3BJ r9 = new X.3BJ
            r9.<init>(r15, r7, r8, r5)
            boolean r1 = r2 instanceof X.AnonymousClass42T
            if (r1 == 0) goto L_0x0558
            r6.A00 = r9
            X.37d r2 = r6.A01
            android.content.SharedPreferences r1 = r2.A00
            android.content.SharedPreferences$Editor r8 = X.C18250wR.A06(r1)
            java.lang.String r7 = "fb_page_info"
            X.Ji8 r5 = r2.A01
            X.76V r2 = r5.A02
            java.lang.Class<com.instagram.business.onelink.cache.FBPageCacheInfo> r1 = com.instagram.business.onelink.cache.FBPageCacheInfo.class
            java.lang.String r1 = X.C18210wN.A0d(r1, r10, r5, r2)
            r8.putString(r7, r1)
            r8.apply()
            X.KHq r2 = r6.A03
            X.46b r1 = X.C689446b.A00
            r2.CWx(r1)
        L_0x0558:
            if (r4 == 0) goto L_0x055d
            r4.onSuccess(r9)
        L_0x055d:
            r1 = -1674359171(0xffffffff9c334e7d, float:-5.9327576E-22)
            X.C14030oh.A0A(r1, r3)
            r1 = -1071135463(0xffffffffc027c519, float:-2.621405)
            goto L_0x0054
        L_0x0568:
            r16 = 0
            goto L_0x050f
        L_0x056b:
            r13 = r14
            goto L_0x04ef
        L_0x056d:
            r12 = r14
            goto L_0x04db
        L_0x0570:
            r11 = r14
            goto L_0x04c7
        L_0x0573:
            boolean r1 = r2 instanceof X.AnonymousClass42T
            if (r1 == 0) goto L_0x0590
            r6.A00 = r14
            X.37d r1 = r6.A01
            android.content.SharedPreferences r1 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C18250wR.A06(r1)
            java.lang.String r1 = "fb_page_info"
            r5.remove(r1)
            r5.apply()
            X.KHq r5 = r6.A03
            X.46b r1 = X.C689446b.A00
            r5.CWx(r1)
        L_0x0590:
            X.3I4 r1 = r6.A02
            r1.A01(r7, r2)
            if (r4 == 0) goto L_0x055d
            java.lang.String r2 = "FB Page response is null."
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r2)
            goto L_0x055d
        L_0x059f:
            r0 = 1633399676(0x615bb37c, float:2.5329814E20)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            r2 = 852049489(0x32c93e51, float:2.3427818E-8)
            int r7 = X.AnonymousClass0wJ.A00(r2, r5)
            java.lang.Object r9 = r1.A03
            X.42Q r9 = (X.AnonymousClass42Q) r9
            java.lang.Object r4 = r1.A00
            X.4ne r4 = (X.C81354ne) r4
            java.lang.Object r3 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r3
            java.lang.Object r8 = r1.A01
            X.4pI r8 = (X.C82234pI) r8
            r1 = 0
            java.lang.Object r6 = r5.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x064c
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl$XfbOneLinkMonoschema> r5 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl.XfbOneLinkMonoschema.class
            java.lang.String r2 = "xfb_one_link_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r12 = r6.getTreeValue(r2, r5)
            if (r12 == 0) goto L_0x064c
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo> r11 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.class
            java.lang.String r10 = "business_info"
            com.facebook.pando.TreeJNI r5 = r12.getTreeValue(r10, r11)
            if (r5 == 0) goto L_0x064a
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo$Business> r3 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.Business.class
            java.lang.String r2 = "business"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r2, r3)
            if (r2 == 0) goto L_0x064a
            java.lang.String r6 = X.C18220wO.A0m(r2)
        L_0x05e8:
            com.facebook.pando.TreeJNI r5 = r12.getTreeValue(r10, r11)
            if (r5 == 0) goto L_0x05fc
            java.lang.Class<com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl$XfbOneLinkMonoschema$BusinessInfo$Business> r3 = com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountQueryResponseImpl.XfbOneLinkMonoschema.BusinessInfo.Business.class
            java.lang.String r2 = "business"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r2, r3)
            if (r2 == 0) goto L_0x05fc
            java.lang.String r1 = X.C18220wO.A0l(r2)
        L_0x05fc:
            com.instagram.business.onelink.cache.BusinessAccountCacheInfo r10 = new com.instagram.business.onelink.cache.BusinessAccountCacheInfo
            r10.<init>(r1, r6)
            java.lang.String r3 = r10.A01
            java.lang.String r2 = r10.A00
            if (r2 == 0) goto L_0x0648
            X.3EH r1 = new X.3EH
            r1.<init>(r2)
        L_0x060c:
            X.37h r6 = new X.37h
            r6.<init>(r1, r3)
            boolean r1 = r4 instanceof X.AnonymousClass42T
            if (r1 == 0) goto L_0x0638
            r9.A00 = r6
            X.37c r2 = r9.A01
            android.content.SharedPreferences r1 = r2.A00
            android.content.SharedPreferences$Editor r5 = X.C18250wR.A06(r1)
            java.lang.String r4 = "business_account_info"
            X.Ji8 r3 = r2.A01
            X.76V r2 = r3.A02
            java.lang.Class<com.instagram.business.onelink.cache.BusinessAccountCacheInfo> r1 = com.instagram.business.onelink.cache.BusinessAccountCacheInfo.class
            java.lang.String r1 = X.C18210wN.A0d(r1, r10, r3, r2)
            r5.putString(r4, r1)
            r5.apply()
            X.KHq r2 = r9.A03
            X.46a r1 = X.C689346a.A00
            r2.CWx(r1)
        L_0x0638:
            if (r8 == 0) goto L_0x063d
            r8.onSuccess(r6)
        L_0x063d:
            r1 = 316031562(0x12d6424a, float:1.352164E-27)
            X.C14030oh.A0A(r1, r7)
            r1 = -355234701(0xffffffffead38c73, float:-1.278733E26)
            goto L_0x0054
        L_0x0648:
            r1 = 0
            goto L_0x060c
        L_0x064a:
            r6 = r1
            goto L_0x05e8
        L_0x064c:
            boolean r2 = r4 instanceof X.AnonymousClass42T
            if (r2 == 0) goto L_0x0669
            r9.A00 = r1
            X.37c r1 = r9.A01
            android.content.SharedPreferences r1 = r1.A00
            android.content.SharedPreferences$Editor r2 = X.C18250wR.A06(r1)
            java.lang.String r1 = "business_account_info"
            r2.remove(r1)
            r2.apply()
            X.KHq r2 = r9.A03
            X.46a r1 = X.C689346a.A00
            r2.CWx(r1)
        L_0x0669:
            X.3I4 r1 = r9.A02
            r1.A01(r3, r4)
            if (r8 == 0) goto L_0x063d
            java.lang.String r2 = "Business Account response is null."
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r2)
            goto L_0x063d
        L_0x0678:
            r0 = 948293035(0x3885cdab, float:6.380243E-5)
            int r0 = X.C14030oh.A03(r0)
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            r2 = -477608842(0xffffffffe3884476, float:-5.0273806E21)
            int r6 = X.AnonymousClass0wJ.A00(r2, r5)
            java.lang.Object r8 = r1.A03
            X.42P r8 = (X.AnonymousClass42P) r8
            java.lang.Object r11 = r1.A00
            X.4ne r11 = (X.C81354ne) r11
            java.lang.Object r3 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r3
            java.lang.Object r7 = r1.A01
            X.4pI r7 = (X.C82234pI) r7
            r1 = 0
            java.lang.Object r5 = r5.A01
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            if (r5 == 0) goto L_0x0731
            java.lang.Class<com.instagram.business.onelink.queries.adaccount.IGOneLinkMiddlewareAdAccountQueryResponseImpl$XfbOneLinkMonoschema> r4 = com.instagram.business.onelink.queries.adaccount.IGOneLinkMiddlewareAdAccountQueryResponseImpl.XfbOneLinkMonoschema.class
            java.lang.String r2 = "xfb_one_link_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r2, r4)
            if (r4 == 0) goto L_0x0731
            java.lang.Class<com.instagram.business.onelink.queries.adaccount.IGOneLinkMiddlewareAdAccountQueryResponseImpl$XfbOneLinkMonoschema$AdAccountInfo> r2 = com.instagram.business.onelink.queries.adaccount.IGOneLinkMiddlewareAdAccountQueryResponseImpl.XfbOneLinkMonoschema.AdAccountInfo.class
            java.lang.String r9 = "ad_account_info"
            com.facebook.pando.TreeJNI r12 = r4.getTreeValue(r9, r2)
            if (r12 == 0) goto L_0x0731
            java.lang.Class<com.instagram.business.onelink.queries.adaccount.IGOneLinkMiddlewareAdAccountQueryResponseImpl$XfbOneLinkMonoschema$AdAccountInfo$DefaultAdAccount> r10 = com.instagram.business.onelink.queries.adaccount.IGOneLinkMiddlewareAdAccountQueryResponseImpl.XfbOneLinkMonoschema.AdAccountInfo.DefaultAdAccount.class
            java.lang.String r5 = "default_ad_account"
            com.facebook.pando.TreeJNI r2 = r12.getTreeValue(r5, r10)
            if (r2 == 0) goto L_0x072f
            java.lang.String r4 = X.C18220wO.A0m(r2)
        L_0x06c1:
            com.facebook.pando.TreeJNI r2 = r12.getTreeValue(r5, r10)
            if (r2 == 0) goto L_0x072d
            java.lang.String r3 = X.C18220wO.A0l(r2)
        L_0x06cb:
            com.facebook.pando.TreeJNI r2 = r12.getTreeValue(r5, r10)
            if (r2 == 0) goto L_0x06d7
            java.lang.String r1 = "legacy_account_id"
            java.lang.String r1 = r2.getStringValue(r1)
        L_0x06d7:
            com.instagram.business.onelink.cache.AdAccountCacheInfo r10 = new com.instagram.business.onelink.cache.AdAccountCacheInfo
            r10.<init>(r3, r4, r1)
            java.lang.String r4 = r10.A01
            java.lang.String r1 = r10.A00
            r3 = 0
            if (r1 == 0) goto L_0x072b
            X.3EH r2 = new X.3EH
            r2.<init>(r1)
        L_0x06e8:
            java.lang.String r1 = r10.A02
            if (r1 == 0) goto L_0x06f1
            X.3EH r3 = new X.3EH
            r3.<init>(r1)
        L_0x06f1:
            X.39t r5 = new X.39t
            r5.<init>(r2, r3, r4)
            boolean r1 = r11 instanceof X.AnonymousClass42T
            if (r1 == 0) goto L_0x071b
            r8.A00 = r5
            X.37b r2 = r8.A01
            android.content.SharedPreferences r1 = r2.A00
            android.content.SharedPreferences$Editor r4 = X.C18250wR.A06(r1)
            X.Ji8 r3 = r2.A01
            X.76V r2 = r3.A02
            java.lang.Class<com.instagram.business.onelink.cache.AdAccountCacheInfo> r1 = com.instagram.business.onelink.cache.AdAccountCacheInfo.class
            java.lang.String r1 = X.C18210wN.A0d(r1, r10, r3, r2)
            r4.putString(r9, r1)
            r4.apply()
            X.KHq r2 = r8.A03
            X.46Z r1 = X.AnonymousClass46Z.A00
            r2.CWx(r1)
        L_0x071b:
            if (r7 == 0) goto L_0x0720
            r7.onSuccess(r5)
        L_0x0720:
            r1 = -1250382825(0xffffffffb578ac17, float:-9.2637623E-7)
            X.C14030oh.A0A(r1, r6)
            r1 = -1688171417(0xffffffff9b608c67, float:-1.8574212E-22)
            goto L_0x0054
        L_0x072b:
            r2 = r3
            goto L_0x06e8
        L_0x072d:
            r3 = r1
            goto L_0x06cb
        L_0x072f:
            r4 = r1
            goto L_0x06c1
        L_0x0731:
            boolean r2 = r11 instanceof X.AnonymousClass42T
            if (r2 == 0) goto L_0x074e
            r8.A00 = r1
            X.37b r1 = r8.A01
            android.content.SharedPreferences r1 = r1.A00
            android.content.SharedPreferences$Editor r2 = X.C18250wR.A06(r1)
            java.lang.String r1 = "ad_account_info"
            r2.remove(r1)
            r2.apply()
            X.KHq r2 = r8.A03
            X.46Z r1 = X.AnonymousClass46Z.A00
            r2.CWx(r1)
        L_0x074e:
            X.3I4 r1 = r8.A02
            r1.A01(r3, r11)
            if (r7 == 0) goto L_0x0720
            java.lang.String r2 = "Ad Account response is null."
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r2)
            goto L_0x0720
        L_0x075d:
            r0 = -1606389901(0xffffffffa0406f73, float:-1.6299908E-19)
            int r0 = X.C14030oh.A03(r0)
            X.CP8 r5 = (X.CP8) r5
            r2 = 1151379556(0x44a0a864, float:1285.2622)
            int r6 = X.C14030oh.A03(r2)
            r2 = 1339041065(0x4fd02529, float:6.9841925E9)
            int r4 = X.C14030oh.A03(r2)
            if (r5 == 0) goto L_0x078b
            X.E2e r2 = r5.D7H()
            com.instagram.user.model.User r2 = r2.A02
            if (r2 == 0) goto L_0x078b
            X.E2e r2 = r5.D7H()
            com.instagram.user.model.User r3 = r2.A02
            java.lang.Object r2 = r1.A01
            X.0i6 r2 = (X.C10300i6) r2
            r3.A1t(r2)
        L_0x078b:
            r2 = 184991459(0xb06bee3, float:2.5951068E-32)
            X.C14030oh.A0A(r2, r4)
            java.lang.Object r3 = r1.A02
            com.instagram.business.fragment.CategorySearchFragment r3 = (com.instagram.business.fragment.CategorySearchFragment) r3
            r2 = 1
            r3.A0L = r2
            android.os.Handler r3 = r3.A0U
            X.4OT r2 = new X.4OT
            r2.<init>(r1)
            r3.post(r2)
            r1 = 1615108104(0x60449808, float:5.6664326E19)
            X.C14030oh.A0A(r1, r6)
            r1 = 1659452445(0x62e93c1d, float:2.1512115E21)
            goto L_0x0054
        L_0x07ad:
            r0 = -348541241(0xffffffffeb39aec7, float:-2.2447664E26)
            int r0 = X.C14030oh.A03(r0)
            r2 = -2132867932(0xffffffff80df04a4, float:-2.048098E-38)
            int r4 = X.C14030oh.A03(r2)
            java.lang.Object r3 = r1.A02
            X.6jp r3 = (X.C109326jp) r3
            java.lang.Object r2 = r1.A00
            X.3iY r2 = (X.C63893iY) r2
            java.lang.Object r1 = r1.A01
            X.601 r1 = (X.AnonymousClass601) r1
            X.C61043Rr.A00(r1, r2, r3)
            r1 = -2104789211(0xffffffff828b7725, float:-2.04926E-37)
            X.C14030oh.A0A(r1, r4)
            r1 = 1985708574(0x765b821e, float:1.1130392E33)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2.onSuccess(java.lang.Object):void");
    }
}

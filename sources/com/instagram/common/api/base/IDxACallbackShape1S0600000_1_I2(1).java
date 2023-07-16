package com.instagram.common.api.base;

import X.AnonymousClass1iy;
import X.AnonymousClass3iG;
import X.BKH;
import X.C09830gl;
import X.C12560m7;
import X.C14030oh;
import X.C18250wR;
import X.C21781Sd;
import X.C21839C2o;
import X.C34392Jj;
import X.C63673i6;
import X.C63813iO;
import X.C63873iU;
import X.C72824Pw;
import android.content.Context;
import android.os.Handler;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterService;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxACallbackShape1S0600000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 1;

    public IDxACallbackShape1S0600000_1_I2(Context context, BugReport bugReport, BugReport bugReport2, BugReportComposerViewModel bugReportComposerViewModel, BugReporterService bugReporterService, UserSession userSession) {
        this.A00 = bugReporterService;
        this.A03 = context;
        this.A04 = userSession;
        this.A01 = bugReport;
        this.A02 = bugReport2;
        this.A05 = bugReportComposerViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r3, 36326236389123552L) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r13) {
        /*
            r12 = this;
            int r0 = r12.A06
            if (r0 == 0) goto L_0x004e
            r0 = 393132692(0x176eba94, float:7.713744E-25)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1749434277(0xffffffff97b9c05b, float:-1.2003902E-24)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r12.A00
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131834837(0x7f1137d5, float:1.9302796E38)
            X.C63813iO.A00(r1, r0)
            r0 = -1184268149(0xffffffffb969808b, float:-2.2268498E-4)
            X.C14030oh.A0A(r0, r2)
            java.lang.Object r6 = r12.A03
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            java.lang.Object r5 = r12.A05
            X.C2o r5 = (X.C21839C2o) r5
            java.lang.Object r0 = r12.A04
            X.BKH r0 = (X.BKH) r0
            java.lang.String r7 = r0.A0U
            java.lang.String r8 = "location_story_action_sheet"
            java.lang.Throwable r10 = r13.A01
            java.lang.String r9 = "copy_link"
            X.C63673i6.A09(r5, r6, r7, r8, r9, r10)
            com.instagram.user.model.User r0 = r0.A0S
            if (r0 != 0) goto L_0x0049
            r10 = 0
        L_0x003e:
            r11 = 0
            X.AnonymousClass3iG.A0B(r5, r6, r7, r8, r9, r10, r11)
            r0 = -55848482(0xfffffffffcabd1de, float:-7.137115E36)
        L_0x0045:
            X.C14030oh.A0A(r0, r4)
            return
        L_0x0049:
            java.lang.String r10 = r0.getId()
            goto L_0x003e
        L_0x004e:
            r0 = 14178863(0xd85a2f, float:1.9868819E-38)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r13.A00
            boolean r0 = X.AnonymousClass0wJ.A1W(r1)
            r6 = 1
            if (r0 == 0) goto L_0x00af
            X.1iy r1 = (X.AnonymousClass1iy) r1
            X.3Fd r5 = r1.A00
            int r1 = r5.A03
            java.lang.Object r3 = r12.A04
            X.0i6 r3 = (X.C10300i6) r3
            r0 = 17
            if (r1 == r0) goto L_0x0074
            r0 = 10
            if (r1 == r0) goto L_0x0074
            r0 = 368(0x170, float:5.16E-43)
            if (r1 != r0) goto L_0x0082
        L_0x0074:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326236389123552(0x810e85000025e0, double:3.0361963942703486E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r2 = 0
            if (r0 != 0) goto L_0x0083
        L_0x0082:
            r2 = 1
        L_0x0083:
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "BugReporterService"
            java.lang.String r0 = "Error creating flytrap bug, response present: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r5)
            X.C10450iM.A04(r1, r0, r6)
            r6 = r2
        L_0x0093:
            java.lang.Object r3 = r12.A03
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r12.A04
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r12.A01
            com.instagram.bugreporter.BugReport r1 = (com.instagram.bugreporter.BugReport) r1
            java.lang.Object r0 = r12.A05
            com.instagram.bugreporter.BugReportComposerViewModel r0 = (com.instagram.bugreporter.BugReportComposerViewModel) r0
            com.instagram.bugreporter.BugReporterService.A02(r3, r1, r0, r2, r6)
            boolean r0 = r1.A0D
            com.instagram.bugreporter.BugReporterService.A05(r2, r5, r0)
            r0 = 802320882(0x2fd271f2, float:3.827974E-10)
            goto L_0x0045
        L_0x00af:
            java.lang.String r5 = "OptionalResponse unavailable. Device is likely offline"
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape1S0600000_1_I2.onFail(X.3XX):void");
    }

    public final void onFinish() {
        if (1 - this.A06 != 0) {
            super.onFinish();
            return;
        }
        int A032 = C14030oh.A03(-2132906898);
        ((Handler) this.A02).post(new C72824Pw(this));
        C14030oh.A0A(1051232325, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        String id;
        if (this.A06 != 0) {
            A032 = C14030oh.A03(248457953);
            C21781Sd r11 = (C21781Sd) obj;
            int A033 = C14030oh.A03(-1789449158);
            int A034 = C14030oh.A03(1911547496);
            Context context = (Context) this.A00;
            C09830gl.A01(context, r11.A00, (String) null);
            C63813iO.A03(context, (String) null, 2131829646, 0);
            C14030oh.A0A(1612674992, A034);
            String str = r11.A00;
            UserSession userSession = (UserSession) this.A03;
            C21839C2o c2o = (C21839C2o) this.A05;
            BKH bkh = (BKH) this.A04;
            String str2 = bkh.A0U;
            C63673i6.A0A(c2o, userSession, str2, "location_story_action_sheet", "copy_link", str);
            User user = bkh.A0S;
            if (user == null) {
                id = null;
            } else {
                id = user.getId();
            }
            AnonymousClass3iG.A0B(c2o, userSession, str2, "location_story_action_sheet", "copy_link", id, str);
            C14030oh.A0A(-2050101588, A033);
            i = 362323121;
        } else {
            A032 = C14030oh.A03(101966775);
            int A035 = C14030oh.A03(-241067414);
            String str3 = ((AnonymousClass1iy) obj).A01;
            UserSession userSession2 = (UserSession) this.A04;
            BugReporterService.A04((Context) this.A03, userSession2);
            C34392Jj.A00((BugReport) this.A01);
            BugReporterService.A06(userSession2, str3, ((BugReport) this.A02).A0D);
            C14030oh.A0A(-1239291715, A035);
            i = -1690864189;
        }
        C14030oh.A0A(i, A032);
    }

    public IDxACallbackShape1S0600000_1_I2(Context context, C12560m7 r3, C21839C2o c2o, BKH bkh, UserSession userSession) {
        this.A03 = userSession;
        this.A05 = c2o;
        this.A04 = bkh;
        this.A02 = C18250wR.A08();
        this.A00 = context;
        this.A01 = r3;
    }
}

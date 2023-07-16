package X;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.42s  reason: invalid class name and case insensitive filesystem */
public final class C682042s implements C84284st {
    public static final CallerContext A0G = CallerContext.A01(C682042s.class.getName());
    public Fragment A00;
    public BusinessFlowAnalyticsLogger A01;
    public C84654td A02;
    public PageSelectionOverrideData A03;
    public AnonymousClass3IK A04;
    public AnonymousClass3IK A05;
    public C24711ju A06;
    public C10300i6 A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F = AnonymousClass0wJ.A0F();

    public final void CGO() {
    }

    public static void A00(C682042s r11) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        String str;
        if (!r11.A0C && (businessFlowAnalyticsLogger = r11.A01) != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            AnonymousClass3IK r0 = r11.A05;
            if (r0 == null) {
                str = null;
            } else {
                str = r0.A08;
            }
            if (str != null) {
                A0y.put("page_id", str);
            }
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A0y2.put("page_id", r11.A04.A08);
            businessFlowAnalyticsLogger.BcE(new C37408JrQ("page_selection", r11.A08, (String) null, (String) null, (String) null, A0y, A0y2, (Map) null));
        }
    }

    public static void A01(C682042s r7) {
        String str;
        Fragment fragment = r7.A00;
        if ((fragment instanceof I5x) || (fragment instanceof C34640IcN)) {
            C10300i6 r6 = r7.A07;
            C130667qT A022 = C130667qT.A02(fragment, r6, (C30938GbW) null);
            PageSelectionOverrideData pageSelectionOverrideData = r7.A03;
            String str2 = r7.A08;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("entry_point", str2);
            A0y.put("waterfall_id", pageSelectionOverrideData.A08);
            A0y.put("prior_module", "page_selection");
            A0y.put("presentation_style", pageSelectionOverrideData.A05);
            r7.A06.A01();
            String str3 = r7.A08;
            PageSelectionOverrideData pageSelectionOverrideData2 = r7.A03;
            if (pageSelectionOverrideData2 == null) {
                str = null;
            } else {
                str = pageSelectionOverrideData2.A07;
            }
            AnonymousClass3L1.A00(r6, "page_selection", str3, str, pageSelectionOverrideData2.A08);
            C145538kf r2 = A022.A07;
            String str4 = r7.A03.A02;
            str4.getClass();
            AnonymousClass4A9 A002 = C63263h8.A00(r6, str4, A0y);
            AnonymousClass4A9.A01(A002, A022, r7, 1);
            r2.schedule(A002);
        }
    }

    public static void A02(C682042s r5, boolean z) {
        String str;
        C10300i6 r1 = r5.A07;
        String str2 = r5.A08;
        PageSelectionOverrideData pageSelectionOverrideData = r5.A03;
        if (pageSelectionOverrideData == null) {
            str = null;
        } else {
            str = pageSelectionOverrideData.A07;
        }
        AnonymousClass3L1.A01(r1, "page_selection", str2, str, pageSelectionOverrideData.A08, z);
    }

    public final Bundle A03() {
        String str;
        String str2;
        AnonymousClass3IK r0 = this.A05;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A08;
        }
        AnonymousClass3IK r02 = this.A04;
        if (r02 == null) {
            str2 = null;
        } else {
            str2 = r02.A08;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("prev_page_id", str);
        A0y.put("current_page_id", str2);
        return AnonymousClass3z8.A02(A0y);
    }

    public final void A04(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("page_selection", this.A08, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void CGK(String str, String str2, String str3, String str4) {
        C63813iO.A01(this.A00.getContext(), str);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            C18250wR.A1E(str4, A0y);
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("page_selection", this.A08, "switch_page", str2, str3, (Map) null, A0y, (Map) null));
        }
        this.A06.A00();
    }

    public final void CGY() {
        this.A06.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r12.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CGh(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x0010
            boolean r2 = r12.A0C
            if (r2 != 0) goto L_0x0010
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x0010
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x0040
        L_0x0010:
            X.4td r0 = r12.A02
            r0.D8y(r13)
            boolean r2 = r12.A0C
            if (r2 != 0) goto L_0x0036
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r12.A01
            if (r0 == 0) goto L_0x0036
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            X.C18250wR.A1E(r13, r10)
            java.lang.String r4 = "page_selection"
            r7 = 0
            java.lang.String r5 = r12.A08
            java.lang.String r6 = "switch_page"
            X.JrQ r3 = new X.JrQ
            r8 = r7
            r9 = r7
            r11 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Bdx(r3)
        L_0x0036:
            android.os.Handler r1 = r12.A0F
            X.4Oe r0 = new X.4Oe
            r0.<init>(r12)
            r1.post(r0)
        L_0x0040:
            if (r2 != 0) goto L_0x0046
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x004a
        L_0x0046:
            X.4td r0 = r12.A02
            if (r0 != 0) goto L_0x004f
        L_0x004a:
            X.1ju r0 = r12.A06
            r0.A00()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682042s.CGh(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r2 != X.C311924p.SERVICE_ONBOARDING_FLOW) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (X.C67333zN.A06(r2, 36310271995805697L, true) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r7.Aiz() != X.C311924p.SHOPPING_IN_APP_SIGNUP_FLOW) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C682042s(androidx.fragment.app.Fragment r5, com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r6, X.C84654td r7, X.C10300i6 r8) {
        /*
            r4 = this;
            r4.<init>()
            android.os.Handler r0 = X.AnonymousClass0wJ.A0F()
            r4.A0F = r0
            boolean r0 = r5 instanceof X.I5x
            if (r0 != 0) goto L_0x0018
            boolean r0 = r5 instanceof X.C34640IcN
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "Invalid fragment type passed in the constructor. The fragment type must be either IgListFragment or IgFragment"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0018:
            r4.A07 = r8
            r4.A00 = r5
            r4.A02 = r7
            r4.A01 = r6
            if (r7 == 0) goto L_0x002b
            X.24p r2 = r7.Aiz()
            X.24p r1 = X.C311924p.SHOPPING_IN_APP_SIGNUP_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r4.A0C = r0
            X.4td r0 = r4.A02
            if (r0 == 0) goto L_0x003b
            X.24p r2 = r0.Aiz()
            X.24p r1 = X.C311924p.SERVICE_ONBOARDING_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r4.A0B = r0
            X.4td r0 = r4.A02
            boolean r0 = X.C67293zJ.A04(r0)
            r4.A09 = r0
            X.4td r0 = r4.A02
            boolean r0 = X.C67293zJ.A06(r0)
            r4.A0A = r0
            X.4td r0 = r4.A02
            boolean r0 = X.C67293zJ.A05(r0)
            r4.A0E = r0
            r3 = 1
            if (r0 != 0) goto L_0x0073
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0073
            X.0i6 r2 = r4.A07
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 36310271995740160(0x81000000010000, double:3.026100447611239E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            java.lang.Object r0 = X.C67333zN.A00(r2, r0, r3)
            X.C04220Ms.A06(r0)
        L_0x0073:
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x008f
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x008f
            X.0i6 r2 = r4.A07
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 36310271995805697(0x81000000020001, double:3.026100447652685E-306)
            boolean r0 = X.C67333zN.A06(r2, r0, r3)
            if (r0 == 0) goto L_0x008f
        L_0x008c:
            r4.A0D = r3
            return
        L_0x008f:
            r3 = 0
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682042s.<init>(androidx.fragment.app.Fragment, com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger, X.4td, X.0i6):void");
    }

    public final void A05(boolean z) {
        String str;
        Bundle A062 = C18180wK.A06();
        PageSelectionOverrideData pageSelectionOverrideData = this.A03;
        if (!(pageSelectionOverrideData == null || (str = pageSelectionOverrideData.A07) == null)) {
            A062.putString("prior_step", str);
        }
        if (!z) {
            A04("create_page");
        }
        C84654td r3 = this.A02;
        r3.getClass();
        r3.Bem(A03(), ConversionStep.CREATE_PAGE, true);
    }
}

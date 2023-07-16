package com.facebookpay.msc.overview.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass6IH;
import X.AnonymousClass7BK;
import X.AnonymousClass7Kz;
import X.AnonymousClass8N1;
import X.C04180Mo;
import X.C04220Ms;
import X.C04530Oa;
import X.C121177En;
import X.C128377jT;
import X.C138288Gx;
import X.C143588gz;
import X.C143688h9;
import X.C18220wO;
import X.C30821GXg;
import X.C86144wL;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import android.os.Bundle;
import com.facebook.graphql.impls.OverviewFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2;

public final class OverviewViewModel extends ListSectionWithFeSelectorViewModel implements C143588gz {
    public C880856r A00 = C880756q.A01();
    public OverviewFragmentImpl A01;
    public C128377jT A02;
    public String A03;
    public boolean A04;
    public final C880756q A05 = C880756q.A01();
    public final C04530Oa A06 = AnonymousClass0OY.A02(C138288Gx.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverviewViewModel(C121177En r2) {
        super(r2);
        C04220Ms.A0B(r2, 1);
    }

    public final void BQK(NotificationsViewModel notificationsViewModel) {
        C04220Ms.A0B(notificationsViewModel, 0);
        notificationsViewModel.A04(C30821GXg.A01(this.A03, AnonymousClass8N1.A00));
        C880856r.A05(notificationsViewModel.A06, this.A05, this, 99);
        C880856r.A05(notificationsViewModel.A08, this.A03, this, 100);
    }

    public static /* synthetic */ void A02(OverviewViewModel overviewViewModel, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3, int i) {
        String A0r;
        Map map4 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        if ((i & 128) != 0) {
            map2 = null;
        }
        if ((i & 256) == 0) {
            map4 = map3;
        }
        C143688h9 A08 = AnonymousClass7Kz.A08();
        HashMap A002 = AnonymousClass6IH.A00(overviewViewModel.A09());
        TreeJNI A0N = C86144wL.A0N(overviewViewModel);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(A0r, A002);
        if (str2 != null) {
            A002.put("target_name", str2);
        }
        A002.put("view_name", "overview");
        if (str3 != null) {
            A002.put("endpoint", str3);
        }
        if (str4 != null) {
            A002.put("error_message", str4);
        }
        if (str5 != null) {
            A002.put("error_stacktrace", str5);
        }
        if (str6 != null) {
            A002.put("exception_class", str6);
        }
        if (map != null) {
            A002.put("earning_summary", map);
        }
        if (map2 != null) {
            A002.put("earning_summary_breakdown", map2);
        }
        if (map4 != null) {
            A002.put("payout_summary", map4);
        }
        A08.Bb8(str, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        if (r1 == null) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.facebookpay.msc.overview.viewmodel.OverviewViewModel r20) {
        /*
            com.google.common.collect.ImmutableList$Builder r12 = com.google.common.collect.ImmutableList.builder()
            r2 = r20
            X.5iR r0 = r2.A08()
            X.C92465iX.A01(r0, r12)
            X.7jT r0 = r2.A02
            if (r0 == 0) goto L_0x0014
            r12.add((java.lang.Object) r0)
        L_0x0014:
            com.facebook.graphql.impls.OverviewFragmentImpl r3 = r2.A01
            if (r3 == 0) goto L_0x00db
            X.AnonymousClass7Kz.A0P()
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview> r1 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.class
            java.lang.String r0 = "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)"
            com.facebook.pando.TreeJNI r8 = r3.getTreeValue(r0, r1)
            boolean r4 = r2.A04
            r3 = 0
            kotlin.jvm.internal.IDxRImplShape201S0000000_2_I2 r5 = new kotlin.jvm.internal.IDxRImplShape201S0000000_2_I2
            r5.<init>(r2, r3)
            r0 = 0
            if (r8 == 0) goto L_0x00d7
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview$PayoutsSummary> r6 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.PayoutsSummary.class
            java.lang.String r1 = "payouts_summary"
            com.facebook.pando.TreeJNI r6 = r8.getTreeValue(r1, r6)
            if (r6 == 0) goto L_0x00ec
            java.lang.Class<com.facebook.graphql.impls.PayoutsSummaryFragmentImpl> r1 = com.facebook.graphql.impls.PayoutsSummaryFragmentImpl.class
            com.facebook.pando.TreeJNI r1 = r6.reinterpret(r1)
        L_0x003e:
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview$EarningsSummary> r7 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.EarningsSummary.class
            java.lang.String r6 = "earnings_summary"
            com.facebook.pando.TreeJNI r6 = r8.getTreeValue(r6, r7)
            if (r6 == 0) goto L_0x004e
            java.lang.Class<com.facebook.graphql.impls.EarningsSummaryFragmentImpl> r0 = com.facebook.graphql.impls.EarningsSummaryFragmentImpl.class
            com.facebook.pando.TreeJNI r0 = r6.reinterpret(r0)
        L_0x004e:
            if (r1 == 0) goto L_0x0091
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r6 = 2131832383(0x7f112e3f, float:1.9297818E38)
            X.7is r8 = X.C128097is.A00(r7, r6)
            java.lang.Class<com.facebook.graphql.impls.PayoutsSummaryFragmentImpl$LastPayoutTotalAmount> r7 = com.facebook.graphql.impls.PayoutsSummaryFragmentImpl.LastPayoutTotalAmount.class
            java.lang.String r6 = "last_payout_total_amount"
            com.facebook.pando.TreeJNI r6 = r1.getTreeValue(r6, r7)
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = X.C86154wM.A0k(r6)
        L_0x0067:
            X.7it r9 = X.C128107it.A01(r6)
            java.lang.String r6 = "last_payout_paid_date"
            X.7it r10 = X.C128107it.A00(r1, r6)
            java.lang.String r6 = "last_total_payouts_percentage_delta_text"
            X.7it r11 = X.C128107it.A00(r1, r6)
            java.lang.String r7 = "last_total_payouts_percentage_delta"
            double r18 = r1.getDoubleValue(r7)
            if (r4 == 0) goto L_0x00e6
            java.lang.String r13 = "transactions_fragment"
        L_0x0081:
            r20 = 2131832102(0x7f112d26, float:1.9297248E38)
            java.lang.String r15 = r1.getStringValue(r6)
            java.lang.String r14 = "payments_overview_payout_summary_view_details"
            java.lang.String r16 = "PAYOUTS"
            r17 = r5
            X.AnonymousClass6IL.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
        L_0x0091:
            if (r0 == 0) goto L_0x00d7
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r3 = 2131826327(0x7f111697, float:1.9285535E38)
            X.7is r8 = X.C128097is.A00(r6, r3)
            java.lang.Class<com.facebook.graphql.impls.EarningsSummaryFragmentImpl$LastTotalEarnings> r6 = com.facebook.graphql.impls.EarningsSummaryFragmentImpl.LastTotalEarnings.class
            java.lang.String r3 = "last_total_earnings"
            com.facebook.pando.TreeJNI r3 = r0.getTreeValue(r3, r6)
            if (r3 == 0) goto L_0x00e4
            java.lang.String r3 = X.C86154wM.A0k(r3)
        L_0x00aa:
            X.7it r9 = X.C128107it.A01(r3)
            java.lang.String r3 = "last_total_earnings_date_delta_text"
            X.7it r10 = X.C128107it.A00(r0, r3)
            java.lang.String r6 = "last_total_earnings_percentage_delta_text"
            X.7it r11 = X.C128107it.A00(r0, r6)
            java.lang.String r3 = "last_total_earnings_percentage_delta"
            double r18 = r0.getDoubleValue(r3)
            if (r4 == 0) goto L_0x00e1
            java.lang.String r13 = "transactions_fragment"
        L_0x00c4:
            r20 = 2131837916(0x7f1143dc, float:1.930904E38)
            java.lang.String r15 = r0.getStringValue(r6)
            java.lang.String r14 = "payments_overview_earnings_summary_view_details"
            java.lang.String r16 = "EARNINGS"
            r17 = r5
            X.AnonymousClass6IL.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            r0 = 1
            if (r1 != 0) goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            X.C86154wM.A1N(r2, r0)
        L_0x00db:
            X.56q r0 = r2.A05
            X.C86144wL.A1E(r0, r12)
            return
        L_0x00e1:
            java.lang.String r13 = "earnings_fragment"
            goto L_0x00c4
        L_0x00e4:
            r3 = 0
            goto L_0x00aa
        L_0x00e6:
            java.lang.String r13 = "payouts_fragment"
            goto L_0x0081
        L_0x00e9:
            r6 = 0
            goto L_0x0067
        L_0x00ec:
            r1 = r0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.overview.viewmodel.OverviewViewModel.A00(com.facebookpay.msc.overview.viewmodel.OverviewViewModel):void");
    }

    public static final void A01(OverviewViewModel overviewViewModel, String str) {
        String A0r;
        LinkedHashMap A0y = C18220wO.A0y();
        TreeJNI A0N = C86144wL.A0N(overviewViewModel);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(A0r, A0y);
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A01(str, A0y, 667754853, 0, 2);
    }

    public final void A07(Bundle bundle) {
        String str;
        super.A07(bundle);
        if (bundle != null) {
            str = bundle.getString("page_id");
        } else {
            str = null;
        }
        this.A03 = str;
        if (bundle != null) {
            boolean z = bundle.getBoolean("IS_V2");
            if (Boolean.valueOf(z) != null) {
                this.A04 = z;
                this.A00 = null;
                C04180Mo r4 = new C04180Mo();
                this.A05.A0K(C30821GXg.A02(this.A03, new KtLambdaShape41S0200000_I2_2(8, (Object) this, (Object) r4)), C86164wN.A0O(this, r4, 7));
                return;
            }
        }
        throw AnonymousClass0wJ.A0b();
    }
}

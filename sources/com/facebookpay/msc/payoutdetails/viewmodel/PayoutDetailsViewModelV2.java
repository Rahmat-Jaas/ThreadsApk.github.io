package com.facebookpay.msc.payoutdetails.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass4n2;
import X.AnonymousClass5k7;
import X.AnonymousClass6IH;
import X.AnonymousClass7BK;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass8H2;
import X.C04220Ms;
import X.C04530Oa;
import X.C114986uF;
import X.C121277Fh;
import X.C128097is;
import X.C128377jT;
import X.C143588gz;
import X.C143688h9;
import X.C18180wK;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.M5J;
import android.os.Bundle;
import com.facebook.graphql.impls.PayoutDetailImpl;
import com.facebook.graphql.impls.StatusInfoDetailsImpl;
import com.facebook.graphql.impls.SummaryDetailsImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxFunctionShape0S4100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import java.util.Map;

public final class PayoutDetailsViewModelV2 extends ListSectionViewModel implements C143588gz {
    public C128377jT A00;
    public LoggingData A01;
    public AnonymousClass7Kx A02 = AnonymousClass7Kx.A01();
    public String A03;
    public String A04;
    public String A05;
    public final C880756q A06 = C880756q.A01();
    public final C04530Oa A07 = AnonymousClass0OY.A02(AnonymousClass8H2.A00);

    public final void BQK(NotificationsViewModel notificationsViewModel) {
        C04220Ms.A0B(notificationsViewModel, 0);
        String str = this.A03;
        if (str == null) {
            C04220Ms.A0E("financialID");
            throw null;
        }
        notificationsViewModel.A04(C880856r.A04(str));
        C880856r.A05(notificationsViewModel.A06, this.A06, this, 110);
        C880856r.A05(notificationsViewModel.A08, this.A03, this, 111);
    }

    public static final String A00(PayoutDetailsViewModelV2 payoutDetailsViewModelV2) {
        TreeJNI treeValue;
        TreeJNI reinterpret;
        TreeJNI treeValue2;
        TreeJNI reinterpret2;
        TreeJNI treeValue3;
        String A0q;
        TreeJNI treeJNI = (TreeJNI) payoutDetailsViewModelV2.A02.A01;
        if (treeJNI != null && (treeValue2 = treeJNI.getTreeValue("status_info", PayoutDetailImpl.StatusInfo.class)) != null && (reinterpret2 = treeValue2.reinterpret(StatusInfoDetailsImpl.class)) != null && (treeValue3 = reinterpret2.getTreeValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, StatusInfoDetailsImpl.Status.class)) != null && (A0q = C86144wL.A0q(treeValue3)) != null) {
            return A0q;
        }
        TreeJNI treeJNI2 = (TreeJNI) payoutDetailsViewModelV2.A02.A01;
        if (treeJNI2 == null || (treeValue = treeJNI2.getTreeValue("total_summary", PayoutDetailImpl.TotalSummary.class)) == null || (reinterpret = treeValue.reinterpret(SummaryDetailsImpl.class)) == null) {
            return null;
        }
        return C86164wN.A0g(reinterpret);
    }

    public static final void A02(PayoutDetailsViewModelV2 payoutDetailsViewModelV2, String str) {
        int i;
        String str2 = payoutDetailsViewModelV2.A05;
        if (str2 == null) {
            C04220Ms.A0E("payoutReleaseID");
            throw null;
        }
        Integer A012 = AnonymousClass4n2.A01(str2);
        if (A012 != null) {
            i = A012.intValue();
        } else {
            i = 0;
        }
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A01(str, (Map) null, 667750653, i, 8);
    }

    public static /* synthetic */ void A03(PayoutDetailsViewModelV2 payoutDetailsViewModelV2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        String str10;
        String str11 = null;
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
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) == 0) {
            str11 = str9;
        }
        C143688h9 A08 = AnonymousClass7Kz.A08();
        LoggingData loggingData = payoutDetailsViewModelV2.A01;
        if (loggingData == null) {
            str10 = "loggingData";
        } else {
            HashMap A002 = AnonymousClass6IH.A00(loggingData);
            String str12 = payoutDetailsViewModelV2.A03;
            if (str12 == null) {
                str10 = "financialID";
            } else {
                C86164wN.A1I(str12, A002);
                String str13 = payoutDetailsViewModelV2.A05;
                if (str13 == null) {
                    str10 = "payoutReleaseID";
                } else {
                    A002.put("batch_item_id", str13);
                    C86134wK.A1M("payout_details", str2, A002);
                    if (str3 != null) {
                        A002.put("target_url", str3);
                    }
                    if (str4 != null) {
                        A002.put("payout_record_id", str4);
                    }
                    String str14 = payoutDetailsViewModelV2.A04;
                    if (str14 != null) {
                        A002.put("managed_merchant_account_id", str14);
                    }
                    if (str5 != null) {
                        A002.put("payout_status", str5);
                    }
                    if (str6 != null) {
                        A002.put("endpoint", str6);
                    }
                    if (str7 != null) {
                        A002.put("error_message", str7);
                    }
                    if (str8 != null) {
                        A002.put("error_stacktrace", str8);
                    }
                    if (str11 != null) {
                        A002.put("exception_class", str11);
                    }
                    A08.Bb8(str, A002);
                    return;
                }
            }
        }
        C04220Ms.A0E(str10);
        throw null;
    }

    public final void A07(Bundle bundle) {
        String string;
        Bundle bundle2 = bundle;
        super.A07(bundle2);
        String str = null;
        if (bundle != null) {
            str = bundle2.getString("payout_release_id");
        }
        if (str != null) {
            this.A05 = str;
            if (bundle == null || (string = bundle2.getString("financial_entity_id")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A03 = string;
            this.A04 = bundle2.getString("managed_merchant_account_id");
            LoggingData loggingData = (LoggingData) bundle2.getParcelable("logging_data");
            if (loggingData != null) {
                this.A01 = loggingData;
                this.A07.A0H(new C114986uF(C128097is.A00(new Object[0], 2131832262), C86134wK.A0T(), false));
                this.A00 = null;
                A03(this, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, (String) null, "BSC_PAYOUT_PAYOUTS_DETAIL", (String) null, (String) null, (String) null, 478);
                A02(this, "fetch_init");
                C880756q r2 = this.A06;
                Object value = this.A07.getValue();
                LoggingData loggingData2 = this.A01;
                if (loggingData2 == null) {
                    C04220Ms.A0E("loggingData");
                    throw null;
                }
                String str2 = loggingData2.A00;
                String str3 = this.A03;
                if (str3 == null) {
                    C04220Ms.A0E("financialID");
                    throw null;
                }
                String str4 = this.A04;
                String str5 = this.A05;
                if (str5 == null) {
                    C04220Ms.A0E("payoutReleaseID");
                    throw null;
                }
                M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape0S4100000_2_I2(value, str2, str3, str4, str5, 1), AnonymousClass7Kz.A0C());
                C04220Ms.A06(A002);
                C121277Fh.A02(A002, r2, C86114wI.A0Q(this, 109));
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r1 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        if (X.C04220Ms.A0I(r13.getStringValue("payee_name"), "Meta") != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2 r26) {
        /*
            com.google.common.collect.ImmutableList$Builder r10 = com.google.common.collect.ImmutableList.builder()
            r11 = r26
            X.7jT r0 = r11.A00
            if (r0 == 0) goto L_0x000d
            r10.add((java.lang.Object) r0)
        L_0x000d:
            X.7Kx r1 = r11.A02
            boolean r0 = X.AnonymousClass7Kx.A0R(r1)
            if (r0 == 0) goto L_0x0291
            X.7Jl r3 = X.AnonymousClass7Jl.A00
            java.lang.Object r2 = r1.A01
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            r12 = 0
            if (r2 == 0) goto L_0x020f
            java.lang.Class<com.facebook.graphql.impls.PayoutDetailImpl$TotalSummary> r1 = com.facebook.graphql.impls.PayoutDetailImpl.TotalSummary.class
            java.lang.String r0 = "total_summary"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x020f
            java.lang.Class<com.facebook.graphql.impls.SummaryDetailsImpl> r0 = com.facebook.graphql.impls.SummaryDetailsImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.SummaryDetailsImpl r0 = (com.facebook.graphql.impls.SummaryDetailsImpl) r0
        L_0x0030:
            boolean r0 = X.AnonymousClass7Jl.A04(r0, r10)
            X.C86154wM.A1N(r11, r0)
            X.7Kx r0 = r11.A02
            java.lang.Object r2 = r0.A01
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x020c
            java.lang.Class<com.facebook.graphql.impls.PayoutDetailImpl$StatusInfo> r1 = com.facebook.graphql.impls.PayoutDetailImpl.StatusInfo.class
            java.lang.String r0 = "status_info"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x020c
            java.lang.Class<com.facebook.graphql.impls.StatusInfoDetailsImpl> r0 = com.facebook.graphql.impls.StatusInfoDetailsImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            com.facebook.graphql.impls.StatusInfoDetailsImpl r2 = (com.facebook.graphql.impls.StatusInfoDetailsImpl) r2
        L_0x0051:
            r1 = 8
            kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2 r0 = new kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2
            r0.<init>(r11, r1)
            X.AnonymousClass7Jl.A01(r2, r10, r0)
            r9 = 0
            r8 = 1
            X.C92445iV.A00(r10)
            X.7Kx r0 = r11.A02
            java.lang.Object r2 = r0.A01
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0209
            java.lang.Class<com.facebook.graphql.impls.PayoutDetailImpl$TransactionInfo> r1 = com.facebook.graphql.impls.PayoutDetailImpl.TransactionInfo.class
            java.lang.String r0 = "transaction_info"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0209
            java.lang.Class<com.facebook.graphql.impls.InfoDetailsImpl> r0 = com.facebook.graphql.impls.InfoDetailsImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.InfoDetailsImpl r0 = (com.facebook.graphql.impls.InfoDetailsImpl) r0
        L_0x007a:
            boolean r0 = r3.A05(r0, r10)
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x008d
            java.lang.Boolean r0 = r11.A00
            if (r0 == 0) goto L_0x021c
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            X.C86154wM.A1N(r11, r0)
            X.C92445iV.A00(r10)
            X.7Kx r0 = r11.A02
            java.lang.Object r1 = r0.A01
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x0205
            java.lang.Class<com.facebook.graphql.impls.EarningsImpl> r0 = com.facebook.graphql.impls.EarningsImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            if (r2 == 0) goto L_0x0205
            java.lang.Class<com.facebook.graphql.impls.EarningsImpl$EarningsIncludedInPayout> r1 = com.facebook.graphql.impls.EarningsImpl.EarningsIncludedInPayout.class
            java.lang.String r0 = "earnings_included_in_payout"
            com.facebook.pando.TreeJNI r7 = r2.getTreeValue(r0, r1)
            if (r7 == 0) goto L_0x0206
            java.lang.String r0 = "section_title"
            java.lang.String r0 = r7.getStringValue(r0)
        L_0x00b4:
            X.AnonymousClass7Jl.A03(r10, r0)
            if (r7 == 0) goto L_0x023a
            java.lang.Class<com.facebook.graphql.impls.EarningsImpl$EarningsIncludedInPayout$TableRows> r17 = com.facebook.graphql.impls.EarningsImpl.EarningsIncludedInPayout.TableRows.class
            java.lang.String r6 = "table_rows"
            r0 = r17
            com.google.common.collect.ImmutableList r0 = r7.getTreeList(r6, r0)
            if (r0 == 0) goto L_0x0221
            java.util.Iterator r16 = r0.iterator()
        L_0x00c9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0221
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r16)
            java.lang.String r14 = "payee_name"
            java.lang.String r1 = r13.getStringValue(r14)
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = "product_name"
            java.lang.String r0 = r13.getStringValue(r0)
            X.7it r5 = X.C128107it.A01(r0)
        L_0x00eb:
            java.lang.String r0 = "image_uri"
            java.lang.String r15 = r13.getStringValue(r0)
            java.lang.String r0 = "image_uri_dark"
            java.lang.String r2 = r13.getStringValue(r0)
            java.lang.String r0 = r11.A04
            java.lang.String r4 = "Meta"
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r13.getStringValue(r14)
            boolean r1 = X.C04220Ms.A0I(r0, r4)
            r0 = 1
            if (r1 == 0) goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            X.7iH r3 = new X.7iH
            r3.<init>(r15, r2, r0, r8)
            java.lang.String r0 = r11.A04
            r1 = 14
            if (r0 != 0) goto L_0x01cc
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r1 = 2131233789(0x7f080bfd, float:1.8083725E38)
            r0 = 2131165224(0x7f070028, float:1.794466E38)
            X.7iI r2 = new X.7iI
            r2.<init>(r12, r15, r1, r0)
        L_0x0123:
            java.lang.String r0 = r11.A04
            if (r0 != 0) goto L_0x01bc
            r1 = 5
        L_0x0128:
            X.5iR r4 = X.AnonymousClass5iR.A00(r1)
            X.5iC r0 = new X.5iC
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r2
            X.5iF r3 = X.C128387jU.A03(r0, r4)
            java.lang.String r0 = "amount"
            X.7it r1 = X.C128107it.A00(r13, r0)
            X.69Q r0 = X.AnonymousClass69Q.PRIMARY_TEXT
            X.C121777Ib.A02(r1, r3, r0)
            X.69Q r2 = X.AnonymousClass69Q.A0z
            r14 = 4
            X.7Ib r0 = new X.7Ib
            r0.<init>(r12, r5, r2)
            r3.A02 = r0
            java.lang.String r0 = "date_range"
            X.7it r1 = X.C128107it.A00(r13, r0)
            X.7Ib r0 = new X.7Ib
            r0.<init>(r12, r1, r2)
            r3.A03 = r0
            r3.A03 = r9
            X.AnonymousClass5iL.A01(r4, r3, r8)
            X.AnonymousClass7Kz.A0P()
            X.5iC r5 = new X.5iC
            r5.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.7iJ r0 = new X.7iJ
            r0.<init>(r3, r2, r1, r1)
            r5.A01 = r0
            r5.A03 = r9
            X.5iH r0 = new X.5iH
            r0.<init>(r5)
            r4.A06 = r0
            r0 = 25
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r13, r11, r0)
            r4.A03 = r0
            r23 = 127(0x7f, float:1.78E-43)
            X.7Eo r2 = new X.7Eo
            r19 = r2
            r20 = r12
            r21 = r12
            r22 = r12
            r24 = r9
            r25 = r9
            r26 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = "accessibility_label"
            X.7it r0 = X.C128107it.A00(r13, r0)
            r2.A01 = r0
            r2.A04 = r8
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131837916(0x7f1143dc, float:1.930904E38)
            X.7is r0 = X.C128097is.A00(r1, r0)
            r2.A00 = r0
            X.AnonymousClass7E5.A01(r2, r4, r10)
            goto L_0x00c9
        L_0x01bc:
            java.lang.String r0 = r13.getStringValue(r14)
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            r1 = 37
            if (r0 == 0) goto L_0x0128
            r1 = 48
            goto L_0x0128
        L_0x01cc:
            java.lang.String r0 = r13.getStringValue(r14)
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x01e7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r1 = 2131233763(0x7f080be3, float:1.8083673E38)
            r0 = 2131165224(0x7f070028, float:1.794466E38)
            X.7iI r2 = new X.7iI
            r2.<init>(r12, r15, r1, r0)
            goto L_0x0123
        L_0x01e7:
            r2 = r12
            goto L_0x0123
        L_0x01ea:
            java.lang.String r1 = r13.getStringValue(r14)
            if (r1 == 0) goto L_0x0217
            java.lang.String r0 = "product_name"
            java.lang.String r0 = r13.getStringValue(r0)
            if (r0 == 0) goto L_0x0212
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            r0 = 2131826309(0x7f111685, float:1.9285499E38)
            X.7is r5 = X.C128097is.A00(r1, r0)
            goto L_0x00eb
        L_0x0205:
            r7 = r12
        L_0x0206:
            r0 = r12
            goto L_0x00b4
        L_0x0209:
            r0 = r12
            goto L_0x007a
        L_0x020c:
            r2 = r12
            goto L_0x0051
        L_0x020f:
            r0 = r12
            goto L_0x0030
        L_0x0212:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x0217:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x021c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x0221:
            r0 = r17
            com.google.common.collect.ImmutableList r0 = r7.getTreeList(r6, r0)
            if (r0 == 0) goto L_0x023a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x023a
            java.lang.Boolean r0 = r11.A00
            if (r0 == 0) goto L_0x0297
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x023a
            r9 = 1
        L_0x023a:
            X.C86154wM.A1N(r11, r9)
            X.7Kx r0 = r11.A02
            java.lang.Object r3 = r0.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            r2 = 0
            if (r3 == 0) goto L_0x0291
            java.lang.Class<com.facebook.graphql.impls.PayoutDetailImpl$SupportInfo> r1 = com.facebook.graphql.impls.PayoutDetailImpl.SupportInfo.class
            java.lang.String r0 = "support_info"
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0291
            java.lang.Class<com.facebook.graphql.impls.SupportImpl> r0 = com.facebook.graphql.impls.SupportImpl.class
            com.facebook.pando.TreeJNI r6 = r1.reinterpret(r0)
            if (r6 == 0) goto L_0x0291
            java.lang.String r5 = "section_title"
            java.lang.String r0 = r6.getStringValue(r5)
            if (r0 == 0) goto L_0x0291
            java.lang.Class<com.facebook.graphql.impls.SupportImpl$SupportUri> r4 = com.facebook.graphql.impls.SupportImpl.SupportUri.class
            java.lang.String r3 = "support_uri"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r3, r4)
            if (r0 == 0) goto L_0x0291
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl> r1 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.class
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r1)
            if (r0 == 0) goto L_0x0291
            X.C92445iV.A00(r10)
            java.lang.String r0 = r6.getStringValue(r5)
            X.AnonymousClass7Jl.A03(r10, r0)
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r3, r4)
            if (r0 == 0) goto L_0x0288
            com.facebook.pando.TreeJNI r2 = r0.reinterpret(r1)
            com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl r2 = (com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl) r2
        L_0x0288:
            r1 = 7
            kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2 r0 = new kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2
            r0.<init>(r11, r1)
            X.AnonymousClass7Jl.A00(r2, r10, r0)
        L_0x0291:
            X.56q r0 = r11.A06
            X.C86144wL.A1E(r0, r10)
            return
        L_0x0297:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2.A01(com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2):void");
    }
}

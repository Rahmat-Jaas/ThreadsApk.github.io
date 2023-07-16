package com.facebookpay.msc.earningdetail.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4n2;
import X.AnonymousClass5iC;
import X.AnonymousClass5iL;
import X.AnonymousClass5iP;
import X.AnonymousClass5iR;
import X.AnonymousClass5k7;
import X.AnonymousClass69Q;
import X.AnonymousClass6IH;
import X.AnonymousClass7BK;
import X.AnonymousClass7E5;
import X.AnonymousClass7Jl;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C04530Oa;
import X.C114986uF;
import X.C121187Eo;
import X.C121277Fh;
import X.C121777Ib;
import X.C128057iH;
import X.C128067iI;
import X.C128097is;
import X.C128107it;
import X.C128377jT;
import X.C128387jU;
import X.C138218Gq;
import X.C143588gz;
import X.C143688h9;
import X.C146928n6;
import X.C18180wK;
import X.C18210wN;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.C92375iF;
import X.C92445iV;
import X.C92465iX;
import X.M5J;
import android.os.Bundle;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.graphql.impls.BreakDownImpl;
import com.facebook.graphql.impls.DisclaimerImpl;
import com.facebook.graphql.impls.EarningDetailImpl;
import com.facebook.graphql.impls.InfoDetailsImpl;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.graphql.impls.PayoutAmountRowImpl;
import com.facebook.graphql.impls.StatusInfoDetailsImpl;
import com.facebook.graphql.impls.SummaryDetailsImpl;
import com.facebook.graphql.impls.SummaryImpl;
import com.facebook.graphql.impls.UserInfoSectionImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxFunctionShape0S4100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2;

public final class EarningsDetailViewModelV2 extends ListSectionViewModel implements C143588gz {
    public C128377jT A00;
    public LoggingData A01;
    public AnonymousClass7Kx A02 = AnonymousClass7Kx.A01();
    public String A03;
    public String A04;
    public String A05;
    public final C880756q A06 = C880756q.A01();
    public final C04530Oa A07 = AnonymousClass0OY.A02(C138218Gq.A00);

    public final void A07(Bundle bundle) {
        String string;
        super.A07(bundle);
        String str = null;
        if (bundle != null) {
            str = bundle.getString("payout_record_id");
        }
        if (str != null) {
            this.A05 = str;
            if (bundle == null || (string = bundle.getString("financial_entity_id")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A03 = string;
            this.A04 = bundle.getString("managed_merchant_account_id");
            LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
            if (loggingData != null) {
                this.A01 = loggingData;
                this.A07.A0H(new C114986uF(C128097is.A00(new Object[0], 2131826322), C86134wK.A0T(), false));
                this.A00 = null;
                A02(this, "client_fetch_payouthub_init", (String) null, (String) null, "BSC_PAYOUT_EARNINGS_DETAIL", (String) null, (String) null, (String) null, 118);
                A01(this, "fetch_init");
                C880756q r2 = this.A06;
                Object value = this.A07.getValue();
                String str2 = this.A05;
                if (str2 == null) {
                    C04220Ms.A0E("payoutRecordID");
                    throw null;
                }
                LoggingData loggingData2 = this.A01;
                if (loggingData2 == null) {
                    C04220Ms.A0E("loggingData");
                    throw null;
                }
                String str3 = loggingData2.A00;
                String str4 = this.A03;
                if (str4 == null) {
                    C04220Ms.A0E("financialID");
                    throw null;
                }
                String str5 = this.A04;
                M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape0S4100000_2_I2(value, str3, str4, str5, str2, 0), AnonymousClass7Kz.A0C());
                C04220Ms.A06(A002);
                C121277Fh.A02(A002, r2, C86114wI.A0Q(this, 89));
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final void BQK(NotificationsViewModel notificationsViewModel) {
        C04220Ms.A0B(notificationsViewModel, 0);
        String str = this.A03;
        if (str == null) {
            C04220Ms.A0E("financialID");
            throw null;
        }
        notificationsViewModel.A04(C880856r.A04(str));
        C880856r.A05(notificationsViewModel.A06, this.A06, this, 90);
        C880856r.A05(notificationsViewModel.A08, this.A03, this, 91);
    }

    public static final void A01(EarningsDetailViewModelV2 earningsDetailViewModelV2, String str) {
        int i;
        String str2 = earningsDetailViewModelV2.A05;
        if (str2 == null) {
            C04220Ms.A0E("payoutRecordID");
            throw null;
        }
        Integer A012 = AnonymousClass4n2.A01(str2);
        if (A012 != null) {
            i = A012.intValue();
        } else {
            i = 0;
        }
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A01(str, (Map) null, 667750821, i, 8);
    }

    public static /* synthetic */ void A02(EarningsDetailViewModelV2 earningsDetailViewModelV2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9 = null;
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
        if ((i & 64) == 0) {
            str9 = str7;
        }
        C143688h9 A08 = AnonymousClass7Kz.A08();
        LoggingData loggingData = earningsDetailViewModelV2.A01;
        if (loggingData == null) {
            str8 = "loggingData";
        } else {
            HashMap A002 = AnonymousClass6IH.A00(loggingData);
            String str10 = earningsDetailViewModelV2.A03;
            if (str10 == null) {
                str8 = "financialID";
            } else {
                C86164wN.A1I(str10, A002);
                String str11 = earningsDetailViewModelV2.A05;
                if (str11 == null) {
                    str8 = "payoutRecordID";
                } else {
                    A002.put("payout_record_id", str11);
                    A002.put("view_name", "earning_details");
                    String str12 = earningsDetailViewModelV2.A04;
                    if (str12 != null) {
                        A002.put("managed_merchant_account_id", str12);
                    }
                    if (str2 != null) {
                        A002.put("target_name", str2);
                    }
                    if (str3 != null) {
                        A002.put("target_url", str3);
                    }
                    if (str4 != null) {
                        A002.put("endpoint", str4);
                    }
                    if (str5 != null) {
                        A002.put("error_message", str5);
                    }
                    if (str6 != null) {
                        A002.put("error_stacktrace", str6);
                    }
                    if (str9 != null) {
                        A002.put("exception_class", str9);
                    }
                    A08.Bb8(str, A002);
                    return;
                }
            }
        }
        C04220Ms.A0E(str8);
        throw null;
    }

    public static final void A00(EarningsDetailViewModelV2 earningsDetailViewModelV2) {
        SummaryDetailsImpl summaryDetailsImpl;
        StatusInfoDetailsImpl statusInfoDetailsImpl;
        TreeJNI treeJNI;
        String str;
        String str2;
        PAYTextWithLinksFragmentImpl pAYTextWithLinksFragmentImpl;
        TreeJNI reinterpret;
        TreeJNI treeValue;
        TreeJNI treeValue2;
        TreeJNI reinterpret2;
        TreeJNI treeValue3;
        TreeJNI treeValue4;
        TreeJNI reinterpret3;
        TreeJNI treeValue5;
        TreeJNI treeValue6;
        TreeJNI reinterpret4;
        TreeJNI reinterpret5;
        TreeJNI treeValue7;
        TreeJNI treeValue8;
        TreeJNI reinterpret6;
        ImmutableList treeList;
        String stringValue;
        String str3;
        String str4;
        String str5;
        TreeJNI treeValue9;
        TreeJNI treeValue10;
        TreeJNI treeValue11;
        TreeJNI treeValue12;
        TreeJNI reinterpret7;
        String stringValue2;
        String stringValue3;
        C128067iI r11;
        TreeJNI treeValue13;
        ImmutableList.Builder builder = ImmutableList.builder();
        EarningsDetailViewModelV2 earningsDetailViewModelV22 = earningsDetailViewModelV2;
        C128377jT r0 = earningsDetailViewModelV22.A00;
        if (r0 != null) {
            builder.add((Object) r0);
        }
        AnonymousClass7Kx r1 = earningsDetailViewModelV22.A02;
        if (AnonymousClass7Kx.A0R(r1)) {
            AnonymousClass7Jl r5 = AnonymousClass7Jl.A00;
            TreeJNI treeJNI2 = (TreeJNI) r1.A01;
            InfoDetailsImpl infoDetailsImpl = null;
            if (treeJNI2 == null || (treeValue13 = treeJNI2.getTreeValue("total_summary", EarningDetailImpl.TotalSummary.class)) == null) {
                summaryDetailsImpl = null;
            } else {
                summaryDetailsImpl = (SummaryDetailsImpl) treeValue13.reinterpret(SummaryDetailsImpl.class);
            }
            C86154wM.A1N(earningsDetailViewModelV22, AnonymousClass7Jl.A04(summaryDetailsImpl, builder));
            TreeJNI treeJNI3 = (TreeJNI) earningsDetailViewModelV22.A02.A01;
            if (!(treeJNI3 == null || (treeValue12 = treeJNI3.getTreeValue("user_info", EarningDetailImpl.UserInfo.class)) == null || (reinterpret7 = treeValue12.reinterpret(UserInfoSectionImpl.class)) == null || (stringValue2 = reinterpret7.getStringValue(FXPFAccessLibraryDebugFragment.NAME)) == null || stringValue2.length() == 0 || (stringValue3 = reinterpret7.getStringValue("image_uri")) == null || stringValue3.length() == 0)) {
                int i = 43;
                if (C04220Ms.A0I(reinterpret7.getStringValue(FXPFAccessLibraryDebugFragment.NAME), "Meta")) {
                    i = 49;
                }
                if (C04220Ms.A0I(reinterpret7.getStringValue(FXPFAccessLibraryDebugFragment.NAME), "Meta")) {
                    r11 = new C128067iI((Integer) null, 14, R.drawable.ring_background, R.dimen.account_recs_header_image_margin);
                } else {
                    r11 = null;
                }
                AnonymousClass5iR A002 = AnonymousClass5iR.A00(i);
                AnonymousClass5iC r10 = new AnonymousClass5iC();
                r10.A01 = new C128057iH(reinterpret7.getStringValue("image_uri"), (String) null, C86144wL.A1X(reinterpret7.getStringValue(FXPFAccessLibraryDebugFragment.NAME), "Meta"), true);
                r10.A00 = r11;
                C92375iF A032 = C128387jU.A03(r10, A002);
                C121777Ib.A02(C128107it.A00(reinterpret7, FXPFAccessLibraryDebugFragment.NAME), A032, AnonymousClass69Q.PRIMARY_TEXT);
                A002.A05 = C121777Ib.A00(C128107it.A00(reinterpret7, "user_name"), A032, AnonymousClass69Q.A0E);
                A002.A02 = 1;
                C121187Eo r13 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
                r13.A01 = C128107it.A00(reinterpret7, "accessibility_label");
                A002.A02 = new AnonymousClass7E5(r13);
                builder.add((Object[]) new C128377jT[]{new C92465iX(A002), new C92445iV(new AnonymousClass5iP((DefaultConstructorMarker) null, 0, 1))});
            }
            TreeJNI treeJNI4 = (TreeJNI) earningsDetailViewModelV22.A02.A01;
            if (treeJNI4 == null || (treeValue11 = treeJNI4.getTreeValue("status_info", EarningDetailImpl.StatusInfo.class)) == null) {
                statusInfoDetailsImpl = null;
            } else {
                statusInfoDetailsImpl = (StatusInfoDetailsImpl) treeValue11.reinterpret(StatusInfoDetailsImpl.class);
            }
            AnonymousClass7Jl.A01(statusInfoDetailsImpl, builder, new IDxRImplShape189S0000000_2_I2(earningsDetailViewModelV22, 4));
            boolean z = false;
            C92445iV.A00(builder);
            TreeJNI treeJNI5 = (TreeJNI) earningsDetailViewModelV22.A02.A01;
            if (!(treeJNI5 == null || (treeValue10 = treeJNI5.getTreeValue("transaction_info", EarningDetailImpl.TransactionInfo.class)) == null)) {
                infoDetailsImpl = (InfoDetailsImpl) treeValue10.reinterpret(InfoDetailsImpl.class);
            }
            if (r5.A05(infoDetailsImpl, builder)) {
                Boolean bool = earningsDetailViewModelV22.A00;
                if (bool == null) {
                    throw AnonymousClass0wJ.A0b();
                } else if (bool.booleanValue()) {
                    z = true;
                }
            }
            C86154wM.A1N(earningsDetailViewModelV22, z);
            TreeJNI treeJNI6 = (TreeJNI) earningsDetailViewModelV22.A02.A01;
            if (!(treeJNI6 == null || (reinterpret5 = treeJNI6.reinterpret(SummaryImpl.class)) == null || (treeValue7 = reinterpret5.getTreeValue("summary_info", SummaryImpl.SummaryInfo.class)) == null || (treeValue8 = treeValue7.getTreeValue("cost_breakdown", SummaryImpl.SummaryInfo.CostBreakdown.class)) == null || (reinterpret6 = treeValue8.reinterpret(BreakDownImpl.class)) == null || (treeList = reinterpret6.getTreeList("breakdown", BreakDownImpl.Breakdown.class)) == null || treeList.isEmpty() || (stringValue = treeValue7.getStringValue("section_title")) == null || stringValue.length() == 0)) {
                C92445iV.A00(builder);
                AnonymousClass7Jl.A03(builder, treeValue7.getStringValue("section_title"));
                Iterator it = treeList.iterator();
                while (it.hasNext()) {
                    TreeJNI A0G = C18210wN.A0G(it);
                    AnonymousClass5iR A003 = AnonymousClass5iR.A00(18);
                    C92375iF A004 = C92375iF.A00();
                    if (A0G != null) {
                        str3 = C86154wM.A0j(A0G);
                    } else {
                        str3 = null;
                    }
                    C128107it A012 = C128107it.A01(str3);
                    AnonymousClass69Q r8 = AnonymousClass69Q.A0l;
                    A003.A05 = C121777Ib.A01(A012, A004, r8);
                    A003.A02 = 1;
                    C92375iF A005 = C92375iF.A00();
                    if (A0G == null || (treeValue9 = A0G.getTreeValue("amount", BreakDownImpl.Breakdown.Amount.class)) == null) {
                        str4 = null;
                    } else {
                        str4 = C86154wM.A0k(treeValue9);
                    }
                    A003.A06 = C121777Ib.A01(C128107it.A01(str4), A005, r8);
                    C121187Eo r112 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
                    if (A0G != null) {
                        str5 = A0G.getStringValue("accessibility_label");
                    } else {
                        str5 = null;
                    }
                    r112.A01 = C128107it.A01(str5);
                    AnonymousClass7E5.A01(r112, A003, builder);
                }
                AnonymousClass7Kz.A0P();
            }
            TreeJNI treeJNI7 = (TreeJNI) earningsDetailViewModelV22.A02.A01;
            String str6 = null;
            if (treeJNI7 == null || (reinterpret3 = treeJNI7.reinterpret(SummaryImpl.class)) == null || (treeValue5 = reinterpret3.getTreeValue("summary_info", SummaryImpl.SummaryInfo.class)) == null || (treeValue6 = treeValue5.getTreeValue("cost_breakdown", SummaryImpl.SummaryInfo.CostBreakdown.class)) == null || (reinterpret4 = treeValue6.reinterpret(PayoutAmountRowImpl.class)) == null) {
                treeJNI = null;
            } else {
                treeJNI = reinterpret4.getTreeValue("payout_amount_row", PayoutAmountRowImpl.PayoutAmountRowPayoutAmountRow.class);
            }
            AnonymousClass5iR A006 = AnonymousClass5iR.A00(18);
            C92375iF A007 = C92375iF.A00();
            if (treeJNI != null) {
                str = C86154wM.A0j(treeJNI);
            } else {
                str = null;
            }
            C121777Ib.A02(C128107it.A01(str), A007, AnonymousClass69Q.A0l);
            A007.A03 = false;
            AnonymousClass5iL.A01(A006, A007, 1);
            C92375iF A008 = C92375iF.A00();
            if (treeJNI == null || (treeValue4 = treeJNI.getTreeValue("amount", PayoutAmountRowImpl.PayoutAmountRowPayoutAmountRow.Amount.class)) == null) {
                str2 = null;
            } else {
                str2 = C86154wM.A0k(treeValue4);
            }
            A006.A06 = C121777Ib.A01(C128107it.A01(str2), A008, AnonymousClass69Q.A0F);
            C121187Eo r9 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
            if (treeJNI != null) {
                str6 = treeJNI.getStringValue("accessibility_label");
            }
            r9.A01 = C128107it.A01(str6);
            AnonymousClass7E5.A01(r9, A006, builder);
            TreeJNI treeJNI8 = (TreeJNI) earningsDetailViewModelV22.A02.A01;
            if (treeJNI8 == null || (reinterpret = treeJNI8.reinterpret(SummaryImpl.class)) == null || (treeValue = reinterpret.getTreeValue("summary_info", SummaryImpl.SummaryInfo.class)) == null || (treeValue2 = treeValue.getTreeValue("cost_breakdown", SummaryImpl.SummaryInfo.CostBreakdown.class)) == null || (reinterpret2 = treeValue2.reinterpret(DisclaimerImpl.class)) == null || (treeValue3 = reinterpret2.getTreeValue("disclaimer", DisclaimerImpl.DisclaimerDisclaimer.class)) == null) {
                pAYTextWithLinksFragmentImpl = null;
            } else {
                pAYTextWithLinksFragmentImpl = (PAYTextWithLinksFragmentImpl) treeValue3.reinterpret(PAYTextWithLinksFragmentImpl.class);
            }
            AnonymousClass7Jl.A00(pAYTextWithLinksFragmentImpl, builder, new IDxRImplShape189S0000000_2_I2(earningsDetailViewModelV22, 3));
        }
        C86144wL.A1E(earningsDetailViewModelV22.A06, builder);
    }
}

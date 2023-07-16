package com.facebookpay.msc.transactions.viewmodel;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.AnonymousClass5iC;
import X.AnonymousClass5iL;
import X.AnonymousClass5iQ;
import X.AnonymousClass5iR;
import X.AnonymousClass5k7;
import X.AnonymousClass67Q;
import X.AnonymousClass69Q;
import X.AnonymousClass6IH;
import X.AnonymousClass7BK;
import X.AnonymousClass7E5;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass8H8;
import X.AnonymousClass8N3;
import X.C02260Al;
import X.C04220Ms;
import X.C04530Oa;
import X.C121177En;
import X.C121187Eo;
import X.C121277Fh;
import X.C121777Ib;
import X.C128057iH;
import X.C128067iI;
import X.C128077iJ;
import X.C128097is;
import X.C128107it;
import X.C128377jT;
import X.C143588gz;
import X.C143688h9;
import X.C146928n6;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C30061zl;
import X.C302220c;
import X.C30821GXg;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.C92375iF;
import X.C92395iH;
import X.C92435iS;
import X.C92465iX;
import X.M5J;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.graphql.impls.PaginationInfoImpl;
import com.facebook.graphql.impls.TransactionAmountImpl;
import com.facebook.graphql.impls.TransactionDateImpl;
import com.facebook.graphql.impls.TransactionLabelImpl;
import com.facebook.graphql.impls.TransactionRowAccessibilityImpl;
import com.facebook.graphql.impls.TransactionUriImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.redex.IDxFunctionShape0S4100000_2_I2;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TransactionsViewModel extends ListSectionWithFeSelectorViewModel implements C143588gz {
    public PaginationInfoImpl A00;
    public C128377jT A01;
    public AnonymousClass7Kx A02 = AnonymousClass7Kx.A01();
    public String A03 = "ALL";
    public final C880756q A04 = C880756q.A01();
    public final C04530Oa A05 = AnonymousClass0OY.A02(AnonymousClass8H8.A00);
    public final C121177En A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionsViewModel(C121177En r4) {
        super(r4);
        C04220Ms.A0B(r4, 1);
        this.A06 = r4;
        r4.A04.put("filter_type_bundle", new IDxSProviderShape515S0100000_2_I2(this, 6));
    }

    public final boolean A0A(Bundle bundle, Integer num) {
        boolean z;
        String str;
        String A0r;
        C04220Ms.A0B(num, 1);
        boolean A0A = super.A0A(bundle, num);
        String string = bundle.getString("filter_transaction_type");
        if (string == null || C04220Ms.A0I(this.A03, string)) {
            z = false;
        } else {
            this.A03 = string;
            z = true;
        }
        if (!A0A && !z) {
            return false;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                str = "overview_view_details";
            }
            A01();
            if (A0A && !z) {
                return false;
            }
        }
        str = "filter";
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A00(667758015, 0, 615);
        AnonymousClass7Kz.A06();
        TreeJNI A0N = C86144wL.A0N(this);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        MarkerEditor A022 = AnonymousClass7Kz.A02(667758015, 0);
        if (str != null) {
            A022.annotate("entry_point", str);
            A022.point("entry_point_clicked");
        }
        A022.annotate("financial_entity_id", A0r);
        if (string != null) {
            A022.annotate("transaction_type_filter", string);
        }
        A022.markerEditingCompleted();
        A01();
        return A0A ? true : true;
    }

    public final void BQK(NotificationsViewModel notificationsViewModel) {
        C04220Ms.A0B(notificationsViewModel, 0);
        notificationsViewModel.A04(C30821GXg.A01(this.A03, AnonymousClass8N3.A00));
        C880856r.A05(notificationsViewModel.A06, this.A04, this, 117);
        C880856r.A05(notificationsViewModel.A08, this.A03, this, 118);
    }

    public static final Map A00(AnonymousClass7Kx r7) {
        TreeJNI reinterpret;
        String A0q;
        AbstractCollection abstractCollection = (AbstractCollection) r7.A01;
        LinkedHashMap linkedHashMap = null;
        if (abstractCollection != null) {
            linkedHashMap = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(abstractCollection, 10)));
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                TreeJNI A0G = C18210wN.A0G(it);
                Class<TransactionLabelImpl> cls = TransactionLabelImpl.class;
                String stringValue = A0G.reinterpret(cls).getStringValue("transaction_id");
                if (stringValue != null) {
                    TreeJNI treeValue = A0G.reinterpret(cls).getTreeValue("transaction_status", TransactionLabelImpl.TransactionStatus.class);
                    if (treeValue == null || (reinterpret = treeValue.reinterpret(PAYTextWithLinksFragmentImpl.class)) == null || (A0q = C86144wL.A0q(reinterpret)) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    linkedHashMap.put(stringValue, A0q);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
        }
        return linkedHashMap;
    }

    private final void A01() {
        String stringValue;
        String stringValue2;
        A03(this, (Boolean) null, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", "0", "25", (String) null, (String) null, (String) null, (Map) null, 3982);
        LinkedHashMap A0y = C18220wO.A0y();
        C880756q r4 = this.A03;
        TreeJNI treeJNI = (TreeJNI) r4.A08();
        if (treeJNI == null || (stringValue = treeJNI.getStringValue("financial_id")) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(stringValue, A0y);
        A0y.put("transaction_type_filter", this.A03);
        A0y.put("start_cursor", "0");
        A0y.put("end_cursor", "25");
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A02(A0y, 667758015, 0);
        this.A00 = null;
        A04("fetch_init");
        C880756q r2 = this.A04;
        Object value = this.A05.getValue();
        TreeJNI treeJNI2 = (TreeJNI) r4.A08();
        if (treeJNI2 == null || (stringValue2 = treeJNI2.getStringValue("financial_id")) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        String str = this.A03;
        String str2 = A09().A00;
        int A022 = C18200wM.A02(0, stringValue2, str);
        M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape0S4100000_2_I2(value, str2, (String) null, str, stringValue2, A022), AnonymousClass7Kz.A0C());
        C04220Ms.A06(A002);
        C121277Fh.A02(A002, r2, C86114wI.A0Q(this, 116));
    }

    public static /* synthetic */ void A03(TransactionsViewModel transactionsViewModel, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, int i) {
        String A0r;
        int i2 = i;
        Map map2 = null;
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
        if ((i2 & 128) != 0) {
            bool = null;
        }
        if ((i2 & 256) != 0) {
            str8 = null;
        }
        if ((i2 & 512) != 0) {
            str9 = null;
        }
        if ((i2 & 1024) != 0) {
            str10 = null;
        }
        if ((i2 & 2048) == 0) {
            map2 = map;
        }
        C143688h9 A08 = AnonymousClass7Kz.A08();
        HashMap A002 = AnonymousClass6IH.A00(transactionsViewModel.A09());
        TreeJNI A0N = C86144wL.A0N(transactionsViewModel);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(A0r, A002);
        C86134wK.A1M("transactions", str2, A002);
        if (str3 != null) {
            A002.put("batch_item_id", str3);
        }
        if (str4 != null) {
            A002.put("payout_record_id", str4);
        }
        if (str5 != null) {
            A002.put("endpoint", str5);
        }
        if (str6 != null) {
            A002.put("start_cursor", str6);
        }
        if (str7 != null) {
            A002.put("end_cursor", str7);
        }
        if (bool != null) {
            A002.put("has_next_page", bool);
        }
        if (str8 != null) {
            A002.put("error_message", str8);
        }
        if (str9 != null) {
            A002.put("error_stacktrace", str9);
        }
        if (str10 != null) {
            A002.put("exception_class", str10);
        }
        if (map2 != null) {
            A002.put("transactions_id_list", map2);
        }
        A08.Bb8(str, A002);
    }

    @OnLifecycleEvent(AnonymousClass060.ON_RESUME)
    public final void onResume(AnonymousClass066 r4) {
        short s;
        Object A08 = this.A06.A08();
        if (A08 == AnonymousClass67Q.SUCCESS) {
            s = 2;
        } else if (A08 == AnonymousClass67Q.ERROR) {
            s = 3;
        } else {
            return;
        }
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A00(667758015, 0, s);
    }

    public static final void A02(TransactionsViewModel transactionsViewModel) {
        TreeJNI treeJNI;
        AnonymousClass69Q r3;
        ImmutableList.Builder builder = ImmutableList.builder();
        TransactionsViewModel transactionsViewModel2 = transactionsViewModel;
        AnonymousClass5iR A08 = transactionsViewModel2.A08();
        AnonymousClass5iC r32 = new AnonymousClass5iC();
        r32.A01 = new C128077iJ(3, 4, 0, 0);
        r32.A00 = new C128067iI(13, (Integer) null, R.drawable.circle_drawable, 0);
        C121187Eo r15 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        r15.A04 = true;
        C121187Eo.A00(r15, new Object[0], 2131827479);
        AnonymousClass7E5.A00(r15, r32);
        r32.A00 = C86134wK.A0P(transactionsViewModel2, 30);
        A08.A06 = new C92395iH(r32);
        C92465iX.A01(A08, builder);
        C128377jT r0 = transactionsViewModel2.A01;
        if (r0 != null) {
            builder.add((Object) r0);
        }
        AbstractCollection abstractCollection = (AbstractCollection) transactionsViewModel2.A02.A01;
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                TreeJNI A0G = C18210wN.A0G(it);
                TreeJNI reinterpret = A0G.reinterpret(TransactionLabelImpl.class);
                TreeJNI treeValue = reinterpret.getTreeValue("transaction_status", TransactionLabelImpl.TransactionStatus.class);
                String str = null;
                if (treeValue != null) {
                    treeJNI = treeValue.reinterpret(PAYTextWithLinksFragmentImpl.class);
                } else {
                    treeJNI = null;
                }
                C30061zl r33 = (C30061zl) C86104wH.A0a(reinterpret, C30061zl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "transaction_status_style");
                TreeJNI reinterpret2 = A0G.reinterpret(TransactionAmountImpl.class);
                TreeJNI reinterpret3 = A0G.reinterpret(TransactionDateImpl.class);
                TreeJNI reinterpret4 = A0G.reinterpret(TransactionUriImpl.class);
                TreeJNI reinterpret5 = A0G.reinterpret(TransactionRowAccessibilityImpl.class);
                int i = 22;
                if (C86104wH.A0a(reinterpret, C302220c.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "transaction_type") == C302220c.PAYOUT) {
                    i = 32;
                }
                if (r33 != null) {
                    if (treeJNI != null) {
                        str = C86144wL.A0q(treeJNI);
                    }
                    C128107it A012 = C128107it.A01(str);
                    int ordinal = r33.ordinal();
                    int i2 = 11;
                    if (ordinal != 3) {
                        if (ordinal != 2) {
                            if (ordinal != 4) {
                                if (ordinal != 3) {
                                    if (ordinal != 2) {
                                        if (ordinal != 4) {
                                            r3 = AnonymousClass69Q.A0P;
                                        }
                                    }
                                }
                                r3 = AnonymousClass69Q.META_EMPHASIZED_POSITIVE;
                            } else {
                                i2 = 10;
                            }
                            r3 = AnonymousClass69Q.A0S;
                        } else {
                            i2 = 9;
                        }
                        r3 = AnonymousClass69Q.META_EMPHASIZED_NEGATIVE;
                    } else {
                        i2 = 8;
                        r3 = AnonymousClass69Q.META_EMPHASIZED_POSITIVE;
                    }
                    C121777Ib r5 = new C121777Ib(new C128067iI(Integer.valueOf(i2), (Integer) null, R.drawable.status_background_drawable, 0), A012, r3);
                    AnonymousClass5iR A002 = AnonymousClass5iR.A00(i);
                    AnonymousClass5iC r34 = new AnonymousClass5iC();
                    r34.A01 = new C128057iH(reinterpret4.getStringValue("transaction_image_uri"), reinterpret4.getStringValue("transaction_image_uri_dark"), false, true);
                    r34.A03 = false;
                    A002.A04 = new C92395iH(r34);
                    A002.A01 = 0;
                    A002.A00 = 1.0f;
                    C92375iF A003 = C92375iF.A00();
                    C128107it A004 = C128107it.A00(reinterpret, "transaction_description_title");
                    AnonymousClass69Q r2 = AnonymousClass69Q.PRIMARY_TEXT;
                    C121777Ib.A02(A004, A003, r2);
                    A002.A05 = C121777Ib.A00(C128107it.A00(reinterpret3, "transaction_date"), A003, AnonymousClass69Q.A0z);
                    A002.A02 = 1;
                    C92375iF A005 = C92375iF.A00();
                    C121777Ib.A02(C128107it.A00(reinterpret2, "transaction_formatted_amount"), A005, r2);
                    A005.A02 = r5;
                    A005.A03 = false;
                    A002.A06 = new AnonymousClass5iL(A005);
                    A002.A03 = C86164wN.A0L(A0G, transactionsViewModel2, 27);
                    C121187Eo r20 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
                    r20.A01 = C128107it.A00(reinterpret5, "transaction_row_accessibility_label");
                    r20.A00 = C128097is.A00(new Object[0], 2131836906);
                    r20.A04 = true;
                    AnonymousClass7E5.A01(r20, A002, builder);
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
        }
        PaginationInfoImpl paginationInfoImpl = transactionsViewModel2.A00;
        if (!(paginationInfoImpl == null || !paginationInfoImpl.getBooleanValue("has_next_page") || transactionsViewModel2.A06.A08() == AnonymousClass67Q.LOADING)) {
            builder.add((Object) new C92435iS(new AnonymousClass5iQ((DefaultConstructorMarker) null, 0, 1)));
        }
        C86144wL.A1E(transactionsViewModel2.A04, builder);
    }

    public static final void A04(String str) {
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A01(str, (Map) null, 667758015, 0, 10);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.BaseBundle] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r3 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r2.A03 = r0;
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.os.Bundle r3) {
        /*
            r2 = this;
            super.A07(r3)
            X.7En r1 = r2.A06
            java.lang.String r0 = "filter_type_bundle"
            java.lang.Object r0 = r1.A00(r0)
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            if (r0 != 0) goto L_0x0021
            if (r3 == 0) goto L_0x0019
        L_0x0011:
            java.lang.String r0 = "filter_transaction_type"
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r0 = r2.A03
        L_0x001b:
            r2.A03 = r0
            r2.A01()
            return
        L_0x0021:
            r3 = r0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A07(android.os.Bundle):void");
    }
}

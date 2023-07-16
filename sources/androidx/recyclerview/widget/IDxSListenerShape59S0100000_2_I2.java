package androidx.recyclerview.widget;

import X.AnonymousClass0wJ;
import X.AnonymousClass56B;
import X.AnonymousClass56H;
import X.AnonymousClass5k7;
import X.AnonymousClass67Q;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass7SJ;
import X.C04220Ms;
import X.C107396gg;
import X.C109266jj;
import X.C111256n2;
import X.C113246qz;
import X.C121277Fh;
import X.C14030oh;
import X.C155029Et;
import X.C18180wK;
import X.C18200wM;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import X.C880756q;
import X.C880856r;
import X.C882957m;
import X.C92865jz;
import X.M5J;
import com.facebook.graphql.impls.PaginationInfoImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.redex.IDxFunctionShape0S4100000_2_I2;
import com.facebook.redex.IDxObserverShape4S2100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel;
import java.util.Map;

public class IDxSListenerShape59S0100000_2_I2 extends C113246qz {
    public Object A00;
    public final int A01;

    public IDxSListenerShape59S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        TransactionsViewModel transactionsViewModel;
        PaginationInfoImpl paginationInfoImpl;
        String str;
        Integer num;
        String A0r;
        String A0r2;
        String stringValue;
        RecyclerView recyclerView2 = recyclerView;
        int i4 = i;
        switch (this.A01) {
            case 0:
                i2 = AnonymousClass0wJ.A00(-916762870, recyclerView2);
                super.onScrollStateChanged(recyclerView2, i4);
                if (!recyclerView2.canScrollVertically(1)) {
                    ListSectionViewModel A02 = ((AnonymousClass56B) this.A00).A02();
                    if ((A02 instanceof TransactionsViewModel) && (paginationInfoImpl = transactionsViewModel.A00) != null && paginationInfoImpl.getBooleanValue("has_next_page") && (transactionsViewModel = (TransactionsViewModel) A02).A06.A08() != AnonymousClass67Q.LOADING) {
                        PaginationInfoImpl paginationInfoImpl2 = transactionsViewModel.A00;
                        if (paginationInfoImpl2 != null) {
                            str = paginationInfoImpl2.getStringValue("end_cursor");
                        } else {
                            str = null;
                        }
                        PaginationInfoImpl paginationInfoImpl3 = transactionsViewModel.A00;
                        if (paginationInfoImpl3 == null || (stringValue = paginationInfoImpl3.getStringValue("end_cursor")) == null) {
                            num = null;
                        } else {
                            num = C86124wJ.A0h(stringValue);
                        }
                        if (num != null) {
                            String valueOf = String.valueOf(num.intValue() + 25);
                            String str2 = str;
                            if (str == null) {
                                str2 = "0";
                            }
                            TransactionsViewModel.A03(transactionsViewModel, (Boolean) null, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str2, valueOf, (String) null, (String) null, (String) null, (Map) null, 3982);
                            transactionsViewModel.A00 = null;
                            String str3 = transactionsViewModel.A03;
                            String str4 = str;
                            if (str == null) {
                                str4 = "0";
                            }
                            AnonymousClass7Kz.A06();
                            TreeJNI A0N = C86144wL.A0N(transactionsViewModel);
                            if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
                                throw AnonymousClass0wJ.A0b();
                            }
                            MarkerEditor A022 = AnonymousClass7Kz.A02(667758015, 0);
                            A022.annotate("entry_point", "load_more");
                            A022.point("entry_point_clicked");
                            A022.annotate("financial_entity_id", A0r);
                            if (str3 != null) {
                                A022.annotate("transaction_type_filter", str3);
                            }
                            if (str4 != null) {
                                A022.annotate("start_cursor", str4);
                            }
                            if (valueOf != null) {
                                A022.annotate("end_cursor", valueOf);
                            }
                            A022.markerEditingCompleted();
                            TransactionsViewModel.A04("fetch_init");
                            C880756q r9 = transactionsViewModel.A04;
                            Object value = transactionsViewModel.A05.getValue();
                            TreeJNI A0N2 = C86144wL.A0N(transactionsViewModel);
                            if (A0N2 == null || (A0r2 = C86144wL.A0r(A0N2)) == null) {
                                throw C18180wK.A0a("Required value was null.");
                            }
                            String str5 = transactionsViewModel.A03;
                            M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape0S4100000_2_I2(value, transactionsViewModel.A09().A00, str, str5, A0r2, C18200wM.A02(0, A0r2, str5)), AnonymousClass7Kz.A0C());
                            C04220Ms.A06(A002);
                            C121277Fh.A02(A002, r9, new IDxObserverShape4S2100000_2_I2(transactionsViewModel, valueOf, str, 1));
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    }
                }
                i3 = 798458621;
                break;
            case 1:
                i2 = C14030oh.A03(1209480050);
                super.onScrollStateChanged(recyclerView2, i4);
                if (!recyclerView2.canScrollVertically(1)) {
                    C882957m r7 = ((AnonymousClass56H) this.A00).A04;
                    if (r7 instanceof C92865jz) {
                        C92865jz r72 = (C92865jz) r7;
                        if (!r72.A04 && r72.A03 != null) {
                            C880756q r6 = r72.A07;
                            if (!AnonymousClass7Kx.A0P(C86104wH.A0R(r6))) {
                                C107396gg r5 = r72.A08;
                                C880856r.A05(AnonymousClass5k7.A00(new AnonymousClass7SJ(r5, r72.A03, false), r5.A00), r6, r72, 269);
                            }
                        }
                    }
                }
                i3 = 1038483350;
                break;
            case 4:
                i2 = C14030oh.A03(-1306819117);
                super.onScrollStateChanged(recyclerView2, i4);
                if (i4 == 2 || i4 == 1) {
                    C109266jj r2 = (C109266jj) this.A00;
                    RecyclerView recyclerView3 = r2.A00;
                    recyclerView3.A12(this);
                    recyclerView3.A0I = null;
                    r2.A01.A06(recyclerView3);
                }
                i3 = 1431130122;
                break;
            default:
                super.onScrollStateChanged(recyclerView2, i4);
                return;
        }
        C14030oh.A0A(i3, i2);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        switch (this.A01) {
            case 2:
                i3 = AnonymousClass0wJ.A00(-2002729372, recyclerView);
                super.onScrolled(recyclerView, i, i2);
                ((C155029Et) this.A00).A01.A00 = new KtCSuperShape0S0020000_I2(!recyclerView.canScrollVertically(-1), !recyclerView.canScrollVertically(1), 4);
                i4 = -1382685897;
                break;
            case 3:
                i3 = C14030oh.A03(-506510503);
                if (i != 0) {
                    ((C111256n2) this.A00).A04 += i;
                }
                if (i2 != 0) {
                    ((C111256n2) this.A00).A05 += i2;
                }
                i4 = 54538551;
                break;
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
        }
        C14030oh.A0A(i4, i3);
    }
}

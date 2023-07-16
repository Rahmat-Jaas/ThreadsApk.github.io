package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl;
import com.facebook.graphql.impls.PAYTextWithEntitiesFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;

/* renamed from: X.5jz  reason: invalid class name and case insensitive filesystem */
public final class C92865jz extends C882957m {
    public QuickPerformanceLogger A00;
    public UpcomingPayout A01;
    public FBPayLoggerData A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final M5J A06;
    public final C880756q A07;
    public final C107396gg A08;
    public final C143688h9 A09;

    public static ImmutableList A00(C1201178p r14, C92865jz r15) {
        Object r1;
        C99176Ik r10;
        String str;
        String quantityString;
        PAYTextWithEntitiesFragmentImpl pAYTextWithEntitiesFragmentImpl;
        ImmutableList immutableList = r14.A01;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        if (immutableList.isEmpty()) {
            C121817Ig A0K = AnonymousClass7Kz.A0K();
            if (A0K.A03 == null) {
                A0K.A03 = new AnonymousClass6S3();
            }
            AnonymousClass5jQ r4 = new AnonymousClass5jQ();
            r4.A02 = AnonymousClass7Kz.A0K().A08.getString(2131836905);
            boolean A012 = AnonymousClass7HK.A01();
            Context context = AnonymousClass7Kz.A0K().A08;
            int i = 2131836903;
            if (A012) {
                i = 2131836904;
            }
            AnonymousClass7Kz.A0K();
            r4.A01 = AnonymousClass0wJ.A0l(context, "Instagram", i);
            C121817Ig A0K2 = AnonymousClass7Kz.A0K();
            if (A0K2.A03 == null) {
                A0K2.A03 = new AnonymousClass6S3();
            }
            r4.A00 = R.attr.fbpay_order_icon;
            r1 = new AnonymousClass5jZ(r4);
        } else {
            int i2 = 3;
            if (r15.A04) {
                AnonymousClass5jV r12 = new AnonymousClass5jV();
                r12.A02 = 2131827292;
                if (immutableList.size() > 3) {
                    r12.A00 = 2131827304;
                    r12.A03 = C86134wK.A0P(r15, 74);
                }
                A0Q.add((Object) new C92665jc(r12));
            } else {
                AnonymousClass7Kz.A0K().A08();
            }
            if (!r15.A04) {
                i2 = immutableList.size();
            }
            int i3 = 6;
            if (r15.A05) {
                i3 = 8;
            }
            int i4 = 0;
            while (i4 < i2 && i4 < immutableList.size()) {
                TreeJNI treeJNI = (TreeJNI) immutableList.get(i4);
                AnonymousClass5jS r3 = new AnonymousClass5jS(i3);
                r3.A0G = treeJNI.getStringValue("receiver_name");
                r3.A04 = 1;
                r3.A03 = 2;
                r3.A0H = true;
                r3.A0F = treeJNI.getStringValue("transaction_payment_type");
                r3.A0D = treeJNI.getStringValue("creation_date");
                r3.A0E = treeJNI.getStringValue("receiver_profile_image_uri");
                if (r15.A05) {
                    r10 = new C92705jh(treeJNI.getStringList("transaction_item_images"));
                } else {
                    r10 = new C92695jg(treeJNI.getStringValue("transaction_amount_subtitle"), treeJNI.getStringValue("transaction_amount_formatted"));
                }
                r3.A0B = r10;
                r3.A08 = C86164wN.A0L(r15, treeJNI, 42);
                if (r15.A05) {
                    Class<FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionStatusAndDate> cls = FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionStatusAndDate.class;
                    PAYTextWithEntitiesFragmentImpl pAYTextWithEntitiesFragmentImpl2 = null;
                    if (treeJNI.getTreeValue("transaction_status_and_date", cls) == null) {
                        pAYTextWithEntitiesFragmentImpl = null;
                    } else {
                        pAYTextWithEntitiesFragmentImpl = (PAYTextWithEntitiesFragmentImpl) treeJNI.getTreeValue("transaction_status_and_date", cls).reinterpret(PAYTextWithEntitiesFragmentImpl.class);
                    }
                    r3.A0A = pAYTextWithEntitiesFragmentImpl;
                    Class<FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionAmountWithEntities> cls2 = FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionAmountWithEntities.class;
                    if (treeJNI.getTreeValue("transaction_amount_with_entities", cls2) != null) {
                        pAYTextWithEntitiesFragmentImpl2 = (PAYTextWithEntitiesFragmentImpl) treeJNI.getTreeValue("transaction_amount_with_entities", cls2).reinterpret(PAYTextWithEntitiesFragmentImpl.class);
                    }
                    r3.A09 = pAYTextWithEntitiesFragmentImpl2;
                }
                C107316gY r122 = new C107316gY();
                r122.A00 = AnonymousClass006.A01;
                if (r15.A05) {
                    String stringValue = treeJNI.getStringValue("receiver_name");
                    Class<FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionStatusAndDate> cls3 = FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionStatusAndDate.class;
                    String str2 = "";
                    if (treeJNI.getTreeValue("transaction_status_and_date", cls3) != null) {
                        str = C86144wL.A0q(treeJNI.getTreeValue("transaction_status_and_date", cls3).reinterpret(PAYTextWithEntitiesFragmentImpl.class));
                    } else {
                        str = str2;
                    }
                    Class<FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionAmountWithEntities> cls4 = FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.TransactionAmountWithEntities.class;
                    if (treeJNI.getTreeValue("transaction_amount_with_entities", cls4) != null) {
                        str2 = C86144wL.A0q(treeJNI.getTreeValue("transaction_amount_with_entities", cls4).reinterpret(PAYTextWithEntitiesFragmentImpl.class));
                    }
                    boolean isEmpty = treeJNI.getStringList("transaction_item_images").isEmpty();
                    C121817Ig A0K3 = AnonymousClass7Kz.A0K();
                    if (isEmpty) {
                        quantityString = A0K3.A08.getString(2131827293, new Object[]{stringValue, str, str2});
                    } else {
                        quantityString = A0K3.A08.getResources().getQuantityString(R.plurals.fbpay_hub_transaction_row_content_description_with_items, treeJNI.getStringList("transaction_item_images").size(), new Object[]{stringValue, Integer.valueOf(treeJNI.getStringList("transaction_item_images").size()), str, str2});
                    }
                    r122.A01 = quantityString;
                }
                r3.A02 = new C107326gZ(r122);
                A0Q.add((Object) new AnonymousClass5je(r3));
                i4++;
            }
            if (r15.A03 != null && !r15.A04) {
                r1 = new AnonymousClass5jY(new AnonymousClass5jP());
            }
            return A0Q.build();
        }
        A0Q.add(r1);
        return A0Q.build();
    }

    public C92865jz(QuickPerformanceLogger quickPerformanceLogger, C107396gg r5, C143688h9 r6) {
        C880756q A012 = C880756q.A01();
        this.A07 = A012;
        this.A09 = r6;
        this.A00 = quickPerformanceLogger;
        this.A08 = r5;
        this.A06 = C86114wI.A0H(A012, this, 27);
        C880856r.A05(A012, this.A03, this, 267);
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A02 = C86104wH.A0Q(bundle);
        boolean z = bundle.getBoolean("is_short_version", false);
        this.A04 = z;
        if (!z) {
            this.A00.markerStart(110177888);
        }
        this.A05 = bundle.getBoolean("use_transactions_v1", false);
        if (!this.A04) {
            this.A09.Bb8("fbpay_transactions_page_display", C122037Js.A06(this.A02));
        }
    }
}

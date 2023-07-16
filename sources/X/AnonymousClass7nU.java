package X;

import com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7nU  reason: invalid class name */
public final class AnonymousClass7nU implements McB {
    public static final AnonymousClass7nU A00 = new AnonymousClass7nU();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C107386gf r2;
        String str;
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI != null) {
            try {
                TreeJNI reinterpret = treeJNI.reinterpret(AnonymousClass6H6.A00(-1284681296));
                r2 = new C107386gf();
                Class<FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery> cls = FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.class;
                if (reinterpret.getTreeValue("transaction_hub_history_query(pagination:$pagination)", cls) != null) {
                    str = reinterpret.getTreeValue("transaction_hub_history_query(pagination:$pagination)", cls).getStringValue("last_transaction_index");
                } else {
                    str = null;
                }
                r2.A01 = str;
                ImmutableList.Builder A0Q = C86164wN.A0Q();
                if (reinterpret.getTreeValue("transaction_hub_history_query(pagination:$pagination)", cls) != null) {
                    C1366783w A0G = C18250wR.A0G(reinterpret.getTreeValue("transaction_hub_history_query(pagination:$pagination)", cls), FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.class, "transactions");
                    while (A0G.hasNext()) {
                        TreeJNI A0G2 = C18210wN.A0G(A0G);
                        if (!(A0G2.getStringValue("creation_date") == null || A0G2.getStringValue("receiver_name") == null || A0G2.getStringValue("receiver_profile_image_uri") == null || A0G2.getStringValue("transaction_amount_formatted") == null || A0G2.getStringValue("transaction_id") == null || A0G2.getStringValue("transaction_payment_type") == null)) {
                            A0Q.add((Object) A0G2);
                        }
                    }
                }
                ImmutableList build = A0Q.build();
                r2.A00 = build;
                AnonymousClass3ZT.A02(build, "transactions");
            } catch (ClassNotFoundException e) {
                throw C86114wI.A0k(e);
            }
        } else {
            r2 = new C107386gf();
        }
        return new C1201178p(r2);
    }
}

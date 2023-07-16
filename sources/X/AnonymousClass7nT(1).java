package X;

import com.facebook.pando.TreeJNI;
import com.instagram.graphql.instagramschemagraphservices.ShowConnectFBPayQueryResponseImpl;

/* renamed from: X.7nT  reason: invalid class name */
public final class AnonymousClass7nT implements McB {
    public static final AnonymousClass7nT A00 = new AnonymousClass7nT();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeJNI = (TreeJNI) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (treeJNI != null) {
            TreeJNI treeValue = treeJNI.getTreeValue("fbpay_account_extended", ShowConnectFBPayQueryResponseImpl.FbpayAccountExtended.class);
            if (treeValue != null) {
                z2 = treeValue.getBooleanValue("should_show_connect_in_hub");
                z3 = treeValue.getBooleanValue("should_show_orders_in_hub");
            }
            TreeJNI treeValue2 = treeJNI.getTreeValue("transaction_hub_metadata", ShowConnectFBPayQueryResponseImpl.TransactionHubMetadata.class);
            if (treeValue2 != null) {
                z = treeValue2.getBooleanValue("show_all_payment_activities_button");
            }
        }
        return new C113676rx(z, z2, z3);
    }
}

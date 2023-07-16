package X;

import com.facebook.graphql.impls.MetaPayConnectQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TH  reason: invalid class name */
public final class AnonymousClass7TH implements C142618fJ {
    public static final AnonymousClass7TH A00 = new AnonymousClass7TH();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI != null) {
            return treeJNI.getTreeValue("meta_pay_wallet_connect_payload", MetaPayConnectQueryResponseImpl.MetaPayWalletConnectPayload.class);
        }
        return null;
    }
}

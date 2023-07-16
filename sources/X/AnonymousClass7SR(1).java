package X;

import com.facebook.graphql.impls.FetchAddressDetailsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7SR  reason: invalid class name */
public final class AnonymousClass7SR implements C142618fJ {
    public static final AnonymousClass7SR A00 = new AnonymousClass7SR();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI != null) {
            return treeJNI.getTreeValue("fetch_address_details(address_id:$address_id,payment_product_id:$payment_product_id,session_id:$session_id,upl_session_id:$upl_session_id)", FetchAddressDetailsQueryResponseImpl.FetchAddressDetails.class);
        }
        return null;
    }
}

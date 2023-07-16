package X;

import com.facebook.graphql.impls.ShippingAddressResponseImpl;
import com.facebook.graphql.impls.ShippingAddressesImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.8NA  reason: invalid class name */
public final class AnonymousClass8NA extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NA A00 = new AnonymousClass8NA();

    public AnonymousClass8NA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TreeJNI treeJNI;
        TreeJNI treeValue;
        TreeJNI reinterpret;
        String A0X;
        if (!(obj instanceof ShippingAddressResponseImpl) || (treeJNI = (TreeJNI) obj) == null || (treeValue = treeJNI.getTreeValue("shipping_address", ShippingAddressResponseImpl.ShippingAddress.class)) == null || (reinterpret = treeValue.reinterpret(ShippingAddressesImpl.class)) == null || (A0X = C18250wR.A0X(reinterpret)) == null) {
            return null;
        }
        return AnonymousClass0wJ.A0d(A0X);
    }
}

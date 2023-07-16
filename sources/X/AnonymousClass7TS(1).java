package X;

import com.facebook.graphql.impls.InitLinkPaypalResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TS  reason: invalid class name */
public final class AnonymousClass7TS implements C142618fJ {
    public static final AnonymousClass7TS A00 = new AnonymousClass7TS();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI == null || (treeValue = treeJNI.getTreeValue("init_link_paypal(input:$input)", InitLinkPaypalResponseImpl.InitLinkPaypal.class)) == null) {
            return null;
        }
        return treeValue.getStringValue("paypal_link_url");
    }
}

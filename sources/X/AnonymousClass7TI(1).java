package X;

import com.facebook.graphql.impls.OtcOptionComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;

/* renamed from: X.7TI  reason: invalid class name */
public final class AnonymousClass7TI implements C142618fJ {
    public static final AnonymousClass7TI A00 = new AnonymousClass7TI();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue(I17.A00(92), OtcOptionComponentImpl.BackButton.class);
        if (treeValue == null || (str = C86144wL.A0q(treeValue)) == null) {
            str = "";
        }
        return new InlineBackButtonItem(AnonymousClass69U.A0F, str);
    }
}

package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.shopping.merchant.CreatorShoppingInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.64S  reason: invalid class name */
public final class AnonymousClass64S extends AnonymousClass5NL implements C21605BxB {
    public final List AsI() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(811810775, AnonymousClass9jT.class);
        if (optionalTreeListByHashCode != null) {
            return optionalTreeListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final CreatorShoppingInfo D62() {
        List<C21758Bzj> AsI = AsI();
        ArrayList A0w = AnonymousClass0wJ.A0w(AsI);
        for (C21758Bzj D63 : AsI) {
            A0w.add(D63.D63());
        }
        return new CreatorShoppingInfo(A0w);
    }
}

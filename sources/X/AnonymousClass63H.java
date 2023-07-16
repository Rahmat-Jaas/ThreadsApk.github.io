package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProductDiscountsDict;
import java.util.ArrayList;

/* renamed from: X.63H  reason: invalid class name */
public final class AnonymousClass63H extends AnonymousClass5NL implements C21166Bpv {
    public final ProductDiscountsDict D03() {
        ArrayList arrayList;
        ImmutableList<C2L> optionalTreeListByHashCode = getOptionalTreeListByHashCode(-121228462, AnonymousClass63G.class);
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C2L D02 : optionalTreeListByHashCode) {
                arrayList.add(D02.D02());
            }
        } else {
            arrayList = null;
        }
        return new ProductDiscountsDict(arrayList);
    }
}

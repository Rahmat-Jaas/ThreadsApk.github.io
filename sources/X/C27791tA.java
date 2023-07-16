package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1tA  reason: invalid class name and case insensitive filesystem */
public final class C27791tA extends AnonymousClass5NL implements C84064sU {
    public final List B1g() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(1174631302, C27641sv.class);
        if (optionalTreeListByHashCode != null) {
            return optionalTreeListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final Boolean AmE() {
        return getOptionalBooleanValueByHashCode(-161366719);
    }

    public final AnonymousClass18W Czo() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-161366719);
        List<C84614tX> B1g = B1g();
        ArrayList A0w = AnonymousClass0wJ.A0w(B1g);
        for (C84614tX Cy1 : B1g) {
            A0w.add(Cy1.Cy1());
        }
        return new AnonymousClass18W(optionalBooleanValueByHashCode, A0w);
    }
}

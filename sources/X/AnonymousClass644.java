package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.644  reason: invalid class name */
public final class AnonymousClass644 extends AnonymousClass5NL implements C21705Byq {
    public final List BMr() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(3365, AnonymousClass64G.class);
        if (optionalTreeListByHashCode != null) {
            return optionalTreeListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C90525Mi D4M(C144028hi r2) {
        return D4L(new C112176p7(r2));
    }

    public final C90525Mi D4L(C112176p7 r4) {
        List<C144778jG> BMr = BMr();
        ArrayList A0w = AnonymousClass0wJ.A0w(BMr);
        for (C144778jG D4z : BMr) {
            A0w.add(D4z.D4z(r4));
        }
        return new C90525Mi(A0w);
    }
}

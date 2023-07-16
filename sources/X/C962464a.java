package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.64a  reason: invalid class name and case insensitive filesystem */
public final class C962464a extends AnonymousClass5NL implements C144898jT {
    public final AnonymousClass5N0 D70(C112176p7 r4) {
        ImmutableList<C144908jU> optionalTreeListByHashCode = getOptionalTreeListByHashCode(1981727545, C962564b.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C144908jU D6z : optionalTreeListByHashCode) {
                A0w.add(D6z.D6z(r4));
            }
            return new AnonymousClass5N0(A0w);
        }
        throw AnonymousClass0wJ.A0b();
    }
}

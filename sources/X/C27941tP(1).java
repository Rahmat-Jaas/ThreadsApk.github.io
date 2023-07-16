package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1tP  reason: invalid class name and case insensitive filesystem */
public final class C27941tP extends AnonymousClass5NL implements C21553BwH {
    public final AnonymousClass18j D2L(C112176p7 r6) {
        String stringValueByHashCode = getStringValueByHashCode(3355);
        if (stringValueByHashCode != null) {
            ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(1498308178, ImmutablePandoUserDict.class);
            if (optionalTreeListByHashCode != null) {
                ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
                Iterator it = optionalTreeListByHashCode.iterator();
                while (it.hasNext()) {
                    C18180wK.A1U(A0x, it);
                }
                ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
                Iterator it2 = A0x.iterator();
                while (it2.hasNext()) {
                    C18190wL.A1Q(r6, A0x2, it2);
                }
                return new AnonymousClass18j(getOptionalIntValueByHashCode(1462626351), stringValueByHashCode, getStringValueByHashCode(3556653), A0x2);
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass18j D2M(C144028hi r2) {
        return D2L(new C112176p7(r2));
    }
}

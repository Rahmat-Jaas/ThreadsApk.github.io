package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.63N  reason: invalid class name */
public final class AnonymousClass63N extends AnonymousClass5NL implements C21547BwB {
    public final AnonymousClass5L3 D0f(C112176p7 r9) {
        ArrayList arrayList;
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(378965114, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0x, it);
            }
            ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                C18190wL.A1Q(r9, A0x2, it2);
            }
            String stringValueByHashCode = getStringValueByHashCode(985509442);
            ImmutableList<C144338iD> optionalTreeListByHashCode2 = getOptionalTreeListByHashCode(-1263111006, AnonymousClass63O.class);
            if (optionalTreeListByHashCode2 != null) {
                arrayList = AnonymousClass0wJ.A0x(optionalTreeListByHashCode2, 10);
                for (C144338iD D0h : optionalTreeListByHashCode2) {
                    arrayList.add(D0h.D0h());
                }
            } else {
                arrayList = null;
            }
            Object A08 = A08(C139208Nb.A00, 1882641244);
            if (A08 != null) {
                SocialContextType socialContextType = (SocialContextType) A08;
                Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(567070134);
                if (optionalIntValueByHashCode != null) {
                    return new AnonymousClass5L3(socialContextType, stringValueByHashCode, A0x2, arrayList, optionalIntValueByHashCode.intValue());
                }
                throw AnonymousClass0wJ.A0b();
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass5L3 D0g(C144028hi r2) {
        return D0f(new C112176p7(r2));
    }
}

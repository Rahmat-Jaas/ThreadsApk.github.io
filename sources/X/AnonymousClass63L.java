package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.63L  reason: invalid class name */
public final class AnonymousClass63L extends AnonymousClass5NL implements C145468kY {
    public final AnonymousClass5L2 D0M(C144028hi r2) {
        return D0L(new C112176p7(r2));
    }

    public final AnonymousClass5L2 D0L(C112176p7 r8) {
        String stringValueByHashCode = getStringValueByHashCode(1285435075);
        String A0A = A0A(640522819);
        if (A0A != null) {
            String A0A2 = A0A(-352405625);
            if (A0A2 != null) {
                Long optionalTimeValueByHashCode = getOptionalTimeValueByHashCode(646001248);
                if (optionalTimeValueByHashCode != null) {
                    long longValue = optionalTimeValueByHashCode.longValue();
                    ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(-427009728, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict != null) {
                        return new AnonymousClass5L2(AnonymousClass5NL.A02(r8, new User(immutablePandoUserDict)), stringValueByHashCode, A0A, A0A2, longValue);
                    }
                    throw AnonymousClass0wJ.A0b();
                }
                throw AnonymousClass0wJ.A0b();
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }
}

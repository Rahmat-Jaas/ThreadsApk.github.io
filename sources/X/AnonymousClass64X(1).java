package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.64X  reason: invalid class name */
public final class AnonymousClass64X extends AnonymousClass5NL implements C145618kn {
    public final C90675Mz D6f(C112176p7 r4) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(1954752018, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            User A02 = AnonymousClass5NL.A02(r4, new User(immutablePandoUserDict));
            String stringValueByHashCode = getStringValueByHashCode(-871218243);
            if (stringValueByHashCode != null) {
                return new C90675Mz(A02, stringValueByHashCode);
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C90675Mz D6g(C144028hi r2) {
        return D6f(new C112176p7(r2));
    }
}

package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.647  reason: invalid class name */
public final class AnonymousClass647 extends AnonymousClass5NL implements C08 {
    public final User BD8() {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(-1998892262, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            return new User(immutablePandoUserDict);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass9BR D4X(C144028hi r2) {
        return D4W(new C112176p7(r2));
    }

    public final Boolean B1A() {
        return getOptionalBooleanValueByHashCode(-517618225);
    }

    public final Boolean BWy() {
        return getOptionalBooleanValueByHashCode(817722242);
    }

    public final AnonymousClass9BR D4W(C112176p7 r7) {
        return new AnonymousClass9BR((User) r7.A00(BD8()), getOptionalBooleanValueByHashCode(817722242), getOptionalBooleanValueByHashCode(-517618225), getOptionalTimeValueByHashCode(722276448), getStringValueByHashCode(-265713450));
    }
}

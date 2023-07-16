package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProfileTheme;
import com.instagram.api.schemas.ProfileThemeType;
import java.util.List;

/* renamed from: X.1tE  reason: invalid class name and case insensitive filesystem */
public final class C27831tE extends AnonymousClass5NL implements C21683ByU {
    public final ProfileThemeType BGH() {
        Object A08 = A08(C78274iA.A00, 549259248);
        if (A08 != null) {
            return (ProfileThemeType) A08;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final List Akv() {
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-1476702881);
        if (optionalStringListByHashCode != null) {
            return optionalStringListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final ProfileTheme D08() {
        String stringValueByHashCode = getStringValueByHashCode(-1358800464);
        String stringValueByHashCode2 = getStringValueByHashCode(-65374582);
        String stringValueByHashCode3 = getStringValueByHashCode(1427833566);
        List Akv = Akv();
        String stringValueByHashCode4 = getStringValueByHashCode(1108949841);
        if (stringValueByHashCode4 != null) {
            return new ProfileTheme(BGH(), stringValueByHashCode, stringValueByHashCode2, stringValueByHashCode3, stringValueByHashCode4, getStringValueByHashCode(1825632156), Akv);
        }
        throw AnonymousClass0wJ.A0b();
    }
}

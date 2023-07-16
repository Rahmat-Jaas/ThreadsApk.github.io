package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.2FJ  reason: invalid class name */
public final class AnonymousClass2FJ {
    public static final UserMonetizationProductType A00(String str) {
        UserMonetizationProductType userMonetizationProductType = (UserMonetizationProductType) UserMonetizationProductType.A01.get(str);
        if (userMonetizationProductType == null) {
            return UserMonetizationProductType.UNRECOGNIZED;
        }
        return userMonetizationProductType;
    }
}

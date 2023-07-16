package X;

import com.instagram.api.schemas.SMBPartnerType;

/* renamed from: X.6Kn  reason: invalid class name and case insensitive filesystem */
public final class C99726Kn {
    public static final SMBPartnerType A00(String str) {
        SMBPartnerType sMBPartnerType = (SMBPartnerType) SMBPartnerType.A01.get(str);
        if (sMBPartnerType == null) {
            return SMBPartnerType.UNRECOGNIZED;
        }
        return sMBPartnerType;
    }
}

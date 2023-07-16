package X;

import com.instagram.model.mediasize.ProfilePicUrlInfo;

/* renamed from: X.64D  reason: invalid class name */
public final class AnonymousClass64D extends AnonymousClass5NL implements C41798MdO {
    public final ProfilePicUrlInfo D4t() {
        return new ProfilePicUrlInfo(getHeight(), getUrl(), getWidth());
    }

    public final int getHeight() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1221029593);
        if (optionalIntValueByHashCode != null) {
            return optionalIntValueByHashCode.intValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String getUrl() {
        String A0i = C86154wM.A0i(this);
        if (A0i != null) {
            return A0i;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final int getWidth() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(113126854);
        if (optionalIntValueByHashCode != null) {
            return optionalIntValueByHashCode.intValue();
        }
        throw AnonymousClass0wJ.A0b();
    }
}

package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.0e5  reason: invalid class name */
public final class AnonymousClass0e5 extends C07950cU {
    public AnonymousClass0e5(String str, String str2, long j) {
        super(str, str2, C07940cT.User, j);
    }

    public static AnonymousClass0e5 A00(long j) {
        return new AnonymousClass0e5("", "", j);
    }

    public final Object A01(UserSession userSession) {
        long j = this.mMobileConfigSpecifier;
        return C63803iN.A08(AnonymousClass0TJ.A06, userSession, getDefaultValue(), j);
    }

    public final Object A02(UserSession userSession) {
        long j = this.mMobileConfigSpecifier;
        return C63803iN.A08(AnonymousClass0TJ.A05, userSession, getDefaultValue(), j);
    }
}

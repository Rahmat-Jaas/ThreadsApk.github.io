package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.40g  reason: invalid class name */
public final class AnonymousClass40g implements C33819Hv8 {
    public final C558334t A00;

    public final boolean getGlobalBool(String str, boolean z) {
        return z;
    }

    public final int getGlobalInt(String str, int i) {
        return i;
    }

    public final String getStringForContext(String str, String str2, String str3) {
        C04220Ms.A0B(str3, 2);
        return str3;
    }

    public AnonymousClass40g(C558334t r1) {
        this.A00 = r1;
    }

    public final boolean getBoolForContext(String str, String str2, boolean z) {
        long j;
        AnonymousClass0wJ.A1N(str, str2);
        if (!str2.equals("shouldExecuteLiveQueryWithConfigId")) {
            return z;
        }
        UserSession userSession = this.A00.A00;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (AnonymousClass00J.A0c(C81074n3.A06(C63803iN.A0C(r2, userSession, 36884397454000503L))).contains(str)) {
            return false;
        }
        if (AnonymousClass00J.A0c(C81074n3.A06(C63803iN.A0C(r2, userSession, 36884397454524795L))).contains(str)) {
            return true;
        }
        if (AnonymousClass00J.A0c(C81074n3.A06(C63803iN.A0C(r2, userSession, 36884397454066040L))).contains(str)) {
            j = 36321447500913477L;
        } else if (AnonymousClass00J.A0c(C81074n3.A06(C63803iN.A0C(r2, userSession, 36884397454131577L))).contains(str)) {
            j = 36321447500979014L;
        } else if (!AnonymousClass00J.A0c(C81074n3.A06(C63803iN.A0C(r2, userSession, 36884397454197114L))).contains(str)) {
            return z;
        } else {
            j = 36321447501044551L;
        }
        return C63803iN.A0E(r2, userSession, j);
    }

    public final String getGlobalString(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        if (!str.equals("kGraphQLLiveQuerySandboxUrl")) {
            return str2;
        }
        String A01 = AnonymousClass3h3.A01();
        C04220Ms.A06(A01);
        return A01;
    }
}

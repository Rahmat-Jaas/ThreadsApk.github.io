package X;

import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.40h  reason: invalid class name and case insensitive filesystem */
public final class C677540h implements C33819Hv8 {
    public final RealtimeClientConfig A00;
    public final UserSession A01;

    public final boolean getBoolForContext(String str, String str2, boolean z) {
        return z;
    }

    public final boolean getGlobalBool(String str, boolean z) {
        C04220Ms.A0B(str, 0);
        if (str.equals("graphQLSubscriptionsDisableRetryStrategy")) {
            return C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36317345806880310L);
        } else if (str.equals("IGIsGqlsDebugLogEnabled")) {
            return this.A00.isGqlsDebugLogEnable();
        } else {
            return z;
        }
    }

    public final int getGlobalInt(String str, int i) {
        C04220Ms.A0B(str, 0);
        if (str.equals("IGGQLSSamplingWeight")) {
            return (int) this.A00.getGQLSSamplingWeight();
        }
        return i;
    }

    public final String getStringForContext(String str, String str2, String str3) {
        C04220Ms.A0B(str3, 2);
        return str3;
    }

    public C677540h(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new RealtimeClientConfig(userSession);
    }

    public final String getGlobalString(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        if (!str.equals("graphQLSubscriptionsSandboxUrl")) {
            return str2;
        }
        String A012 = AnonymousClass3h3.A01();
        C04220Ms.A06(A012);
        return A012;
    }
}

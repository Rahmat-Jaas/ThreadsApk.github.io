package X;

import android.content.SharedPreferences;
import android.util.Pair;
import com.instagram.common.api.base.IDxACallbackShape3S0101000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1n3  reason: invalid class name */
public final class AnonymousClass1n3 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n3(C697249u r3) {
        super("sendSupportedCameraCapabilities", 376);
        this.A00 = r3;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        SharedPreferences sharedPreferences = AnonymousClass2B6.A00;
        if (sharedPreferences == null) {
            sharedPreferences = C08340dC.A01("SupportedCapabilitiesPreferences");
            AnonymousClass2B6.A00 = sharedPreferences;
        }
        long j = sharedPreferences.getLong("LastTimeSupportedCapabilitiesUpdated", -1);
        long A09 = C18240wQ.A09(j);
        if (j < 0 || A09 >= 86400000) {
            IDxACallbackShape3S0101000_1_I2 iDxACallbackShape3S0101000_1_I2 = new IDxACallbackShape3S0101000_1_I2(userSession);
            Pair A002 = C31032GeB.A00(userSession);
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0J("creatives/write_supported_capabilities/");
            A0N.A0P((String) A002.first, (String) A002.second);
            C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
            A0S.A00 = iDxACallbackShape3S0101000_1_I2;
            C31155GhB.A03(A0S);
        }
    }
}

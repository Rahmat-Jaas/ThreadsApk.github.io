package X;

import android.os.BaseBundle;
import android.util.Log;
import java.io.IOException;

/* renamed from: X.7mA  reason: invalid class name and case insensitive filesystem */
public final class C129597mA implements C143858hQ {
    public final /* synthetic */ C120937De A00;

    public C129597mA(C120937De r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object Cx8(AnonymousClass7HU r5) {
        BaseBundle baseBundle = (BaseBundle) r5.A05(IOException.class);
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string != null || (string = baseBundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = baseBundle.getString("error");
            if ("RST".equals(string2)) {
                throw C86154wM.A0V("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw C86154wM.A0V(string2);
            } else {
                String valueOf = String.valueOf(baseBundle);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 21);
                A0s.append(AnonymousClass000.A00(741));
                Log.w("FirebaseInstanceId", C18180wK.A0i(valueOf, A0s), new Throwable());
                throw C86154wM.A0V("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw C86154wM.A0V("SERVICE_NOT_AVAILABLE");
        }
    }
}

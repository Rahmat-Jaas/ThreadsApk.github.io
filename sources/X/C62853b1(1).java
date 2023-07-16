package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

/* renamed from: X.3b1  reason: invalid class name and case insensitive filesystem */
public final class C62853b1 {
    public static final Bundle A00(IgBloksScreenConfig igBloksScreenConfig, C63743iE r5) {
        boolean booleanValue = C63803iN.A05(AnonymousClass0TJ.A05, igBloksScreenConfig.A0C, 36326524151998067L).booleanValue();
        Bundle A06 = C18180wK.A06();
        C66843yQ.A03(A06, C63743iE.A01(r5, r5.A06, r5.A07), booleanValue);
        IgBloksScreenConfig.A03(A06, igBloksScreenConfig);
        C18180wK.A0w(A06, igBloksScreenConfig.A0C);
        return A06;
    }

    public static final AnonymousClass1c8 A02(IgBloksScreenConfig igBloksScreenConfig, C63743iE r3) {
        AnonymousClass1c8 r1 = new AnonymousClass1c8();
        r1.setArguments(A00(igBloksScreenConfig, r3));
        return r1;
    }

    public static final C23221cn A01(IgBloksScreenConfig igBloksScreenConfig, C63743iE r1) {
        Bundle A00 = A00(igBloksScreenConfig, r1);
        C23221cn r0 = new C23221cn();
        r0.setArguments(A00);
        return r0;
    }

    public static AnonymousClass1c8 A03(C10300i6 r2, String str, Map map) {
        return A02(new IgBloksScreenConfig(r2), C63743iE.A02(str, map));
    }

    public static void A04(C25786Drz drz, C10300i6 r3, String str, String str2, Map map) {
        C63743iE A02 = C63743iE.A02(str, map);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(r3);
        igBloksScreenConfig.A0S = str2;
        drz.A03 = A02(igBloksScreenConfig, A02);
        drz.A07 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        drz.A05();
    }
}

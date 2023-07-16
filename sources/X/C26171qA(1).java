package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1qA  reason: invalid class name and case insensitive filesystem */
public abstract class C26171qA extends AnonymousClass1YM {
    public static final String __redex_internal_original_name = "IgFxBaseFragment";
    public UserSession A00;
    public String A01;
    public String A02;

    public void onCreate(Bundle bundle) {
        String str;
        String A0V;
        int A022 = C14030oh.A02(420437615);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(C18250wR.A07(this));
        this.A01 = C18190wL.A0j(this.mArguments, "flow");
        this.A02 = this.mArguments.getString("opaque_target_account_id");
        UserSession userSession = this.A00;
        String str2 = this.A01;
        if (this instanceof C26161q9) {
            AnonymousClass0wJ.A1N(userSession, str2);
            C63003bJ.A00(AnonymousClass2AF.A0d, userSession, str2, (String) null);
        }
        UserSession userSession2 = this.A00;
        boolean z = this instanceof C26151q8;
        if (z) {
            str = "com.bloks.www.fxim.sync.interop.async";
        } else {
            str = "com.bloks.www.fxcal.link.async";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (z) {
            A0V = AnonymousClass00U.A0V("{server_params: {", AnonymousClass00U.A0M("\"flow\":\"", this.A01, '\"'), "}}");
        } else {
            String A0e = AnonymousClass00U.A0e("\"", "logging_event", "\":\"", "linking_flow_initiated", '\"');
            UserSession userSession3 = this.A00;
            C04220Ms.A05(userSession3);
            ArrayList A0s = C18200wM.A0s(C06750aI.A17(A0e, AnonymousClass00U.A05(C59713Ma.A00(userSession3), "\"", "cds_client_value", "\":")));
            String str3 = this.A01;
            if (str3 != null) {
                A0s.add(AnonymousClass00U.A0e("\"", "flow", "\":\"", str3, '\"'));
            }
            String str4 = this.A02;
            if (str4 != null) {
                A0s.add(AnonymousClass00U.A0e("\"", "opaque_target_account_id", "\":\"", str4, '\"'));
            }
            A0V = AnonymousClass00U.A0V("{server_params: {", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0s), "}}");
        }
        A0y.put("params", A0V);
        AnonymousClass4A9 A002 = C63263h8.A00(userSession2, str, A0y);
        A002.A00 = new IDxACallbackShape103S0100000_1_I2((Object) this, 6);
        schedule(A002);
        C14030oh.A09(1501295586, A022);
    }
}

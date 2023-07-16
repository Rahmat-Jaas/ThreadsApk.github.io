package X;

import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wK  reason: invalid class name */
public final class AnonymousClass1wK extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "DataSaverNetworkOptionsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "data_saver_network_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131824772);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(744448440);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(1415919697, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1663779351);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        C62563aI.A01(Integer.toString(0), getString(2131824767), A0v2);
        C62563aI.A01(Integer.toString(1), getString(2131824771), A0v2);
        C62563aI.A01(Integer.toString(2), getString(2131824770), A0v2);
        int i = C28161tl.A04(AnonymousClass3V2.A00(((AnonymousClass1wN) getTargetFragment()).A00).A00).getInt("data_saver_network_resources_quality", -1);
        if (i == -1) {
            i = 1;
        }
        C61353Sw.A00(new IDxCListenerShape512S0100000_1_I2(this, 6), Integer.toString(i), A0v, A0v2);
        setItems(A0v);
        C14030oh.A09(1244429355, A02);
    }
}

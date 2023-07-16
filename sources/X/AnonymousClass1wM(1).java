package X;

import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wM  reason: invalid class name */
public final class AnonymousClass1wM extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AppearanceThemeOptionsFragment";
    public UserSession A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final String getModuleName() {
        return "theme_settings";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131824752);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(636374232);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        List list = this.A01;
        list.add(AnonymousClass3T1.A05);
        list.add(AnonymousClass3T1.A06);
        list.add(AnonymousClass3T1.A04);
        C14030oh.A09(1181591263, A02);
    }

    public final void onResume() {
        AnonymousClass3T1 r1;
        C62563aI r12;
        int A02 = C14030oh.A02(-1369524570);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        List<AnonymousClass3T1> list = this.A01;
        for (AnonymousClass3T1 r0 : list) {
            Integer num = r0.A03;
            String str = r0.A00;
            int i = r0.A01;
            if (num != null) {
                r12 = new C62563aI(str, getString(i), getString(num.intValue()));
            } else {
                r12 = new C62563aI(str, getString(i));
            }
            A0v2.add(r12);
        }
        int i2 = C08360dF.A00().A00.getInt("dark_mode_toggle_setting", -1);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                r1 = (AnonymousClass3T1) it.next();
                if (r1.A02 == i2) {
                    break;
                }
            } else if (C34822La.A00(getContext())) {
                r1 = AnonymousClass3T1.A05;
            } else {
                r1 = AnonymousClass3T1.A06;
            }
        }
        C61353Sw.A00(new IDxCListenerShape512S0100000_1_I2(this, 5), r1.A00, A0v, A0v2);
        setItems(A0v);
        C14030oh.A09(1050388200, A02);
    }
}

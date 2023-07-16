package com.instagram.urlhandlers.payouthub;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass2FJ;
import X.AnonymousClass2SD;
import X.AnonymousClass5x0;
import X.AnonymousClass6S1;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18170wI;
import X.C18180wK;
import X.C25786Drz;
import X.C35355ItJ;
import X.C86124wJ;
import X.DDJ;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class PayoutHubUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        C25786Drz drz;
        Fragment fragment;
        UserMonetizationProductType userMonetizationProductType;
        int i;
        int A002 = C14030oh.A00(-883668819);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1505011486;
        } else {
            String string = A0C.getString("original_url");
            if (string == null) {
                finish();
                i = 416054233;
            } else {
                this.A00 = AnonymousClass0RA.A0C.A02(A0C);
                Uri A01 = C15430rJ.A01(string);
                UserSession A02 = C05030Qo.A02(this.A00);
                String queryParameter = A01.getQueryParameter(C18170wI.A00(196));
                String queryParameter2 = A01.getQueryParameter("entry_point");
                String queryParameter3 = A01.getQueryParameter("upl_session_id");
                String queryParameter4 = A01.getQueryParameter("financial_entity_id");
                if (queryParameter != null) {
                    userMonetizationProductType = AnonymousClass2FJ.A00(queryParameter);
                    drz = C18180wK.A0Q(this, A02);
                    drz.A0C = false;
                    fragment = AnonymousClass6S1.A00(userMonetizationProductType, AnonymousClass2SD.A00(queryParameter2), queryParameter4, queryParameter3, true);
                    drz.A03 = fragment;
                } else if (queryParameter4 != null) {
                    userMonetizationProductType = null;
                    drz = C18180wK.A0Q(this, A02);
                    drz.A0C = false;
                    fragment = AnonymousClass6S1.A00(userMonetizationProductType, AnonymousClass2SD.A00(queryParameter2), queryParameter4, queryParameter3, true);
                    drz.A03 = fragment;
                } else if (AnonymousClass7Kz.A0V()) {
                    Bundle A06 = C18180wK.A06();
                    if (queryParameter2 == null) {
                        queryParameter2 = C35355ItJ.UNKNOWN.A00;
                    }
                    A06.putParcelable("logging_data", new LoggingData(C86124wJ.A0t(A06, queryParameter2, queryParameter3)));
                    drz = C18180wK.A0Q(this, A02);
                    drz.A0C = false;
                    drz.A03 = AnonymousClass7Kz.A06().A00(A06, "settings_fragment");
                } else {
                    drz = C18180wK.A0Q(this, A02);
                    drz.A0C = false;
                    DDJ.A00();
                    C35355ItJ A003 = AnonymousClass2SD.A00(queryParameter2);
                    C04220Ms.A0B(A003, 0);
                    fragment = new AnonymousClass5x0();
                    Bundle A062 = C18180wK.A06();
                    A062.putString("ORIGIN", A003.A00);
                    fragment.setArguments(A062);
                    drz.A03 = fragment;
                }
                drz.A05();
                i = 727646448;
            }
        }
        C14030oh.A07(i, A002);
    }
}

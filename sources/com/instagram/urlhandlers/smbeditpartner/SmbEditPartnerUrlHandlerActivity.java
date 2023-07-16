package com.instagram.urlhandlers.smbeditpartner;

import X.AnonymousClass000;
import X.AnonymousClass06E;
import X.AnonymousClass0RA;
import X.AnonymousClass3YR;
import X.AnonymousClass5tQ;
import X.AnonymousClass7Ko;
import X.C04620Ok;
import X.C05030Qo;
import X.C06810aP;
import X.C10300i6;
import X.C118176zs;
import X.C121877Ip;
import X.C14030oh;
import X.C146558mR;
import X.C18170wI;
import X.C18180wK;
import X.C25786Drz;
import X.C32165H8c;
import X.C86144wL;
import X.C95055yi;
import X.C99726Kn;
import X.H1T;
import X.H8Q;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class SmbEditPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        r0.getClass();
        return r0;
    }

    public final void onCreate(Bundle bundle) {
        C10300i6 r4;
        Fragment A01;
        int i;
        int A002 = C14030oh.A00(1087118831);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra(C18170wI.A00(13));
        if (bundleExtra != null) {
            this.A00 = AnonymousClass0RA.A0C.A02(bundleExtra);
        }
        String A0e = C18180wK.A0e();
        String stringExtra = intent.getStringExtra("servicetype");
        stringExtra.getClass();
        SMBPartnerType A003 = C99726Kn.A00(stringExtra);
        AnonymousClass7Ko.A07(A003, "service type in deep link should not be null");
        String stringExtra2 = intent.getStringExtra("entrypoint");
        C10300i6 r1 = this.A00;
        if (r1 != null) {
            if (!(r1 instanceof UserSession)) {
                AnonymousClass3YR.A00.A02(this, bundleExtra, r1);
                i = 1752060101;
            } else {
                UserSession A02 = C05030Qo.A02(r1);
                C04620Ok r12 = C06810aP.A01;
                C146558mR A004 = C121877Ip.A00(A003, r12.A01(A02));
                if (A004 != null) {
                    r4 = this.A00;
                    r4.getClass();
                    A01 = C86144wL.A0U().A02(A003, A0e, A004.AQz(), A004.B08(), A004.getUrl(), A004.getUrl(), stringExtra2);
                } else if (SMBPartnerType.DONATION == A003) {
                    H8Q h8q = new H8Q(this, AnonymousClass06E.A00(this));
                    C95055yi r14 = new C95055yi(this, A003, this, A0e, stringExtra2);
                    H1T A0O = C18180wK.A0O(A02);
                    A0O.A0J("business/instant_experience/get_donation_button_partners_bundle/");
                    C32165H8c A0T = C18180wK.A0T(A0O, AnonymousClass5tQ.class, C118176zs.class);
                    A0T.A00 = r14;
                    h8q.schedule(A0T);
                    i = -878286441;
                } else {
                    r4 = this.A00;
                    r4.getClass();
                    User A012 = r12.A01(A02);
                    SMBPartnerType[] values = SMBPartnerType.values();
                    int length = values.length;
                    int i2 = 0;
                    while (i2 < length && C121877Ip.A00(values[i2], A012) == null) {
                        i2++;
                    }
                    A01 = C86144wL.A0U().A01(A003, stringExtra2, A0e);
                }
                C25786Drz A0Q = C18180wK.A0Q(this, r4);
                A0Q.A03 = A01;
                A0Q.A0C = false;
                A0Q.A05();
                i = -878286441;
            }
            C14030oh.A07(i, A002);
            return;
        }
        IllegalStateException A0a = C18180wK.A0a(AnonymousClass000.A00(598));
        C14030oh.A07(651524962, A002);
        throw A0a;
    }
}

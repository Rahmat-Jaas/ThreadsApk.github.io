package com.instagram.urlhandlers.smbselectpartner;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass7Ko;
import X.C05030Qo;
import X.C10300i6;
import X.C121877Ip;
import X.C14030oh;
import X.C18170wI;
import X.C18180wK;
import X.C25786Drz;
import X.C86144wL;
import X.C99726Kn;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class SmbSelectPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        r0.getClass();
        return r0;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-752911788);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra(C18170wI.A00(13));
        if (bundleExtra != null) {
            this.A00 = AnonymousClass0RA.A0C.A02(bundleExtra);
        }
        C10300i6 r1 = this.A00;
        r1.getClass();
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, bundleExtra, r1);
        } else {
            String A0e = C18180wK.A0e();
            String stringExtra = intent.getStringExtra("servicetype");
            stringExtra.getClass();
            SMBPartnerType A003 = C99726Kn.A00(stringExtra);
            AnonymousClass7Ko.A07(A003, "service type in deep link should not be null");
            String stringExtra2 = intent.getStringExtra("entrypoint");
            C10300i6 r5 = this.A00;
            r5.getClass();
            User A0Y = AnonymousClass0wJ.A0Y(C05030Qo.A02(r5));
            SMBPartnerType[] values = SMBPartnerType.values();
            int length = values.length;
            int i = 0;
            while (i < length && C121877Ip.A00(values[i], A0Y) == null) {
                i++;
            }
            Fragment A01 = C86144wL.A0U().A01(A003, stringExtra2, A0e);
            C25786Drz A0Q = C18180wK.A0Q(this, r5);
            A0Q.A03 = A01;
            A0Q.A0C = false;
            A0Q.A05();
        }
        C14030oh.A07(-534265347, A002);
    }
}

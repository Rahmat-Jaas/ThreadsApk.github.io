package com.instagram.urlhandlers.clipscamera;

import X.AnonymousClass00J;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C28174Ezk;
import X.C62333Yi;
import X.C63803iN;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class ClipsCameraUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        String A0i;
        int A00 = C14030oh.A00(-1042551834);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || (A0i = C18190wL.A0i(A0C)) == null) {
            finish();
        } else {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            C10300i6 A03 = r2.A03(this);
            if (A03 instanceof UserSession) {
                Intent A002 = C62333Yi.A00(this);
                Uri.Builder A0E = C18220wO.A0E("instagram://reels-camera");
                if (C63803iN.A0E(AnonymousClass0TJ.A05, r2.A03(this), 36328289383491933L)) {
                    List<String> pathSegments = C15430rJ.A01(A0i).getPathSegments();
                    C04220Ms.A06(pathSegments);
                    String str = (String) AnonymousClass00J.A0G(pathSegments, 2);
                    if (!(str == null || str.length() == 0)) {
                        A0E.appendQueryParameter(C28174Ezk.A00(60), str);
                    }
                }
                A002.setData(A0E.build());
                A002.putExtra("com.instagram.url.extra.IS_ALREADY_HANDLED", true);
                C10650ih.A02(this, A002);
            } else {
                AnonymousClass3YR.A00(this, A0C, A03);
            }
        }
        finish();
        C14030oh.A07(-15612932, A00);
    }
}

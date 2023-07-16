package com.instagram.canvas;

import X.AnonymousClass01J;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C22274CRq;
import X.C25556Dns;
import X.C37220Jmj;
import X.C37235Jn1;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public final class CanvasActivity extends IgFragmentActivity {
    public C22274CRq A00;
    public UserSession A01;

    public final C37220Jmj getGnvGestureHandler() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            if (!C25556Dns.A02(userSession)) {
                return null;
            }
            UserSession userSession2 = this.A01;
            if (userSession2 != null) {
                C37220Jmj A002 = C37220Jmj.A00(userSession2);
                C04220Ms.A06(A002);
                UserSession userSession3 = this.A01;
                if (userSession3 != null) {
                    C37235Jn1 A003 = C37235Jn1.A00(userSession3);
                    C04220Ms.A06(A003);
                    A002.A03(A003);
                    A002.A02(A003);
                    return A002;
                }
            }
        }
        C04220Ms.A0E("userSession");
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onBackPressed() {
        C22274CRq cRq = this.A00;
        if (cRq == null) {
            C04220Ms.A0E("canvasFragment");
            throw null;
        } else {
            cRq.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(1797511702);
        Bundle A0C = C18190wL.A0C(this);
        if (A0C != null) {
            this.A01 = C18180wK.A0V(A0C);
            super.onCreate(bundle);
            setContentView((int) R.layout.activity_canvas);
            C22274CRq cRq = (C22274CRq) getSupportFragmentManager().A0L(R.id.layout_container_main);
            if (cRq != null) {
                this.A00 = cRq;
            } else {
                A0C.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_CLOSE_ACTIVITY", true);
                C22274CRq cRq2 = new C22274CRq();
                cRq2.setArguments(A0C);
                this.A00 = cRq2;
                AnonymousClass01J A0L = C18220wO.A0L(this);
                C22274CRq cRq3 = this.A00;
                if (cRq3 == null) {
                    C04220Ms.A0E("canvasFragment");
                    throw null;
                } else {
                    A0L.A0D(cRq3, R.id.layout_container_main);
                    A0L.A00();
                }
            }
            C14030oh.A07(1443687882, A002);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A07(184355600, A002);
        throw A0b;
    }
}

package com.instagram.inappbrowser.actions;

import X.AnonymousClass00U;
import X.AnonymousClass21J;
import X.AnonymousClass25Q;
import X.AnonymousClass2C5;
import X.AnonymousClass2Q9;
import X.AnonymousClass9PV;
import X.C10300i6;
import X.C11590kS;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C21659By5;
import X.C25745DrH;
import X.C28174Ezk;
import X.C31164GhX;
import X.C35189Ipf;
import X.C37032Jj9;
import android.os.Bundle;
import android.view.Window;
import com.facebook.redex.IDxListenerShape412S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public final class BrowserActionActivity extends IgFragmentActivity implements C21659By5 {
    public AnonymousClass21J A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05 = true;

    public final void Bmq() {
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void Bmo() {
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-914862404);
        super.onCreate(bundle);
        AnonymousClass2C5.A00(this, 1);
        setContentView((int) R.layout.browser_action_activity);
        Bundle A0C = C18190wL.A0C(this);
        A0C.getClass();
        this.A01 = C18180wK.A0V(A0C);
        this.A00 = (AnonymousClass21J) A0C.getSerializable("browser_action_extra_action_type");
        this.A02 = A0C.getString("browser_action_extra_browser_url");
        A0C.getString("browser_action_extra_media_id", "");
        this.A03 = A0C.getString("browser_action_session_id", "");
        this.A04 = A0C.getString("browser_action_tracking_token");
        this.A05 = A0C.getBoolean("browser_action_tracking_enabled", true);
        A0C.getString("browser_url_author_id");
        Window window = getWindow();
        window.getClass();
        C31164GhX.A06(window.getDecorView(), window, A0C.getBoolean("browser_action_status_bar_visibility"));
        C14030oh.A07(1398382271, A002);
    }

    public final void onStart() {
        int A002 = C14030oh.A00(-1584700076);
        super.onStart();
        AnonymousClass21J r2 = this.A00;
        r2.getClass();
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            this.A02.getClass();
            C25745DrH A0b = C18220wO.A0b(this);
            A0b.getClass();
            ((C35189Ipf) A0b).A0B = new IDxListenerShape412S0100000_1_I2(this, 4);
            C11590kS r22 = new C11590kS();
            r22.A02("iab_session_id", this.A03);
            r22.A02("tracking_token", this.A04);
            r22.A02("target_url", this.A02);
            r22.A02(C28174Ezk.A00(259), "send_in_direct");
            throw C18200wM.A0d();
        } else if (ordinal == 1) {
            AnonymousClass9PV r23 = (AnonymousClass9PV) AnonymousClass2Q9.A00(AnonymousClass25Q.IN_APP_BROWSER, this.A01, this.A05);
            C37032Jj9 A0Y = C18200wM.A0Y(this.A01, true);
            A0Y.A00 = 0.7f;
            A0Y.A0I = r23;
            A0Y.A0J = this;
            C18200wM.A16(this, r23, A0Y);
            C14030oh.A07(-2137331855, A002);
        } else {
            throw new UnsupportedOperationException(AnonymousClass00U.A0L("Unknown action type: ", r2.toString()));
        }
    }
}

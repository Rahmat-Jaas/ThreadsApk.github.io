package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.inappbrowser.actions.BrowserActionActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3GD  reason: invalid class name */
public final class AnonymousClass3GD {
    public AnonymousClass21J A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07 = true;
    public final UserSession A08;
    public final Context A09;

    public final Intent A00() {
        Intent A042 = C18250wR.A04(this.A09, BrowserActionActivity.class);
        Bundle A062 = C18180wK.A06();
        C18190wL.A13(A062, this.A08.token);
        A062.putSerializable("browser_action_extra_action_type", this.A00);
        A062.putString("browser_action_extra_browser_url", this.A04);
        A062.putString("browser_action_extra_media_id", this.A02);
        A062.putBoolean("browser_action_status_bar_visibility", this.A06);
        A062.putString("browser_action_session_id", this.A01);
        A062.putString("browser_action_tracking_token", this.A03);
        A062.putBoolean("browser_action_tracking_enabled", this.A07);
        A062.putString("browser_url_author_id", this.A05);
        A042.putExtras(A062);
        A042.addFlags(268435456);
        return A042;
    }

    public AnonymousClass3GD(Context context, UserSession userSession) {
        this.A09 = context;
        this.A08 = userSession;
    }
}

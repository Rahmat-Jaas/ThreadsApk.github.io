package X;

import android.view.View;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Es  reason: invalid class name and case insensitive filesystem */
public final class C58263Es {
    public final IgSwitch A00;
    public final UserSession A01;

    public final void A00() {
        this.A00.setChecked(C28161tl.A04(this.A01).getBoolean("allow_story_mention_sharing", true));
    }

    public C58263Es(View view, UserSession userSession, int i) {
        this.A01 = userSession;
        view.setVisibility(0);
        AnonymousClass0wJ.A0L(view, R.id.sticker_setting_toggle_text).setText(i);
        IgSwitch A0N = C18250wR.A0N(view, R.id.sticker_setting_toggle);
        this.A00 = A0N;
        A0N.A07 = new IDxTListenerShape295S0100000_1_I2(this, 11);
    }
}

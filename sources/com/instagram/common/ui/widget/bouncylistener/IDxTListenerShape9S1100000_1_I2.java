package com.instagram.common.ui.widget.bouncylistener;

import X.BF4;
import X.C09830gl;
import X.C11630kW;
import X.C25976Dwr;
import X.C61873Wd;
import X.C63673i6;
import X.C63813iO;
import X.C72894Qd;
import android.app.Activity;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.service.session.UserSession;

public class IDxTListenerShape9S1100000_1_I2 extends BF4 {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxTListenerShape9S1100000_1_I2(NametagController nametagController, String str, int i) {
        this.A02 = i;
        this.A00 = nametagController;
        this.A01 = str;
    }

    public final boolean COg(View view) {
        int i = this.A02;
        NametagController nametagController = (NametagController) this.A00;
        UserSession userSession = nametagController.A0F;
        C11630kW r4 = nametagController.A0E;
        if (i != 0) {
            C63673i6.A04(r4, userSession, userSession.getUserId(), "nametag_view", "system_share_sheet");
            String str = this.A01;
            C25976Dwr dwr = nametagController.A0B.A07;
            if (dwr.A05()) {
                dwr.A03(false);
            }
            C61873Wd.A02(nametagController.A0D.getParentFragmentManager());
            nametagController.A09.post(new C72894Qd(nametagController, str));
            return true;
        }
        C63673i6.A04(r4, userSession, userSession.getUserId(), "nametag_view", "copy_link");
        String str2 = this.A01;
        String str3 = nametagController.A02;
        if (str3 == null) {
            str3 = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s?r=nametag", (Object) str2);
        }
        Activity activity = nametagController.A07;
        C09830gl.A01(activity, str3, (String) null);
        C63813iO.A03(activity, (String) null, 2131829646, 0);
        C63673i6.A0A(r4, userSession, userSession.getUserId(), "nametag_view", "copy_link", str3);
        return true;
    }
}

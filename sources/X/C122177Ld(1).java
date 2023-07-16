package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;

/* renamed from: X.7Ld  reason: invalid class name and case insensitive filesystem */
public final class C122177Ld implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ GrowthFrictionInterventionButton A01;
    public final /* synthetic */ GrowthFrictionInterventionDetail A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ Integer A05;

    public C122177Ld(Context context, GrowthFrictionInterventionButton growthFrictionInterventionButton, GrowthFrictionInterventionDetail growthFrictionInterventionDetail, UserSession userSession, User user, Integer num) {
        this.A03 = userSession;
        this.A04 = user;
        this.A02 = growthFrictionInterventionDetail;
        this.A05 = num;
        this.A00 = context;
        this.A01 = growthFrictionInterventionButton;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A03;
        User user = this.A04;
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail = this.A02;
        Integer num = this.A05;
        C04220Ms.A0B(num, 3);
        C120747Ch.A00(AnonymousClass6BF.USER_SELECTED_URL_ON_DIALOG, growthFrictionInterventionDetail, userSession, user, num);
        SimpleWebViewActivity.A01.A02(this.A00, userSession, new SimpleWebViewConfig(this.A01.A03, (String) null, (String) null, (String) null, false, false, false, false, true, true, false, true, false, false, false));
    }
}

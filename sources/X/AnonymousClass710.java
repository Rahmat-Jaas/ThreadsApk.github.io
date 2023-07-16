package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.instagram.barcelona.R;
import com.instagram.groupprofiles.nux.GroupProfileNuxFragment$Row;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;

/* renamed from: X.710  reason: invalid class name */
public final class AnonymousClass710 {
    public static final void A00(Activity activity, UserSession userSession) {
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 1);
        Activity activity2 = activity;
        SimpleWebViewActivity.A01.A02(activity2, userSession2, new SimpleWebViewConfig(C63803iN.A0C(AnonymousClass0TJ.A05, userSession2, 36881180523888874L), (String) null, activity2.getString(2131829574), (String) null, false, false, false, false, true, true, false, true, false, false, false));
    }

    public static final void A01(Activity activity, UserSession userSession, User user, String str) {
        int i;
        int i2;
        UserSession userSession2 = userSession;
        String str2 = str;
        C18180wK.A1P(userSession, 1, str2);
        boolean A1Z = C18190wL.A1Z(user.A0k(), true);
        SharedPreferences A04 = C28161tl.A04(userSession);
        if (A1Z) {
            i = 362;
        } else {
            i = 363;
        }
        if (!A04.getBoolean(AnonymousClass000.A00(i), false)) {
            C37032Jj9 jj9 = new C37032Jj9(userSession);
            Activity activity2 = activity;
            jj9.A0O = AnonymousClass0wJ.A0l(activity, user.BK7(), 2131828049);
            jj9.A0i = false;
            C37383Jqm A00 = jj9.A00();
            int i3 = 2131828047;
            if (A1Z) {
                i3 = 2131828046;
            }
            C37383Jqm.A00(activity2, C101766Sn.A00(userSession2, user.getId(), str2, (String) null, C06750aI.A14(new GroupProfileNuxFragment$Row(2131828048, i3, R.drawable.instagram_shield_pano_outline_24), new GroupProfileNuxFragment$Row(2131828045, 2131828044, R.drawable.instagram_sliders_pano_outline_24), new GroupProfileNuxFragment$Row(2131828043, 2131828042, R.drawable.instagram_delete_pano_outline_24)), C86164wN.A12(A00, 38), false), A00);
            SharedPreferences.Editor edit = C28161tl.A04(userSession2).edit();
            if (A1Z) {
                i2 = 362;
            } else {
                i2 = 363;
            }
            AnonymousClass0wJ.A13(edit, AnonymousClass000.A00(i2), true);
        }
    }
}

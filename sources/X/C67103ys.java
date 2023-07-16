package X;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.widget.FindPeopleButton;

/* renamed from: X.3ys  reason: invalid class name and case insensitive filesystem */
public final class C67103ys implements CallerContextable {
    public static final String __redex_internal_original_name = "FindPeopleButtonsRowViewBinder";

    public static final void A00(UserSession userSession, FindPeopleButton findPeopleButton, AnonymousClass3D4 r5, AnonymousClass39E r6) {
        int i = 8;
        findPeopleButton.setVisibility(8);
        View view = r5.A00;
        if (!(r5.A04.getVisibility() == 8 && r5.A02.getVisibility() == 8)) {
            i = 0;
        }
        view.setVisibility(i);
        if (r6.A01 == AnonymousClass006.A00) {
            C28161tl A01 = AnonymousClass3WS.A01(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            if (findPeopleButton.equals(r5.A02)) {
                SharedPreferences sharedPreferences = A01.A00;
                AnonymousClass0wJ.A11(sharedPreferences.edit(), "num_times_dismissed_ci_find_people_button_follow_list", C18190wL.A04(sharedPreferences, "num_times_dismissed_ci_find_people_button_follow_list") + 1);
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "last_time_dismissed_ci_find_people_button_follow_list", currentTimeMillis);
            }
        }
    }
}

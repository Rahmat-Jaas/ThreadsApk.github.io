package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2KV  reason: invalid class name */
public final class AnonymousClass2KV {
    public static void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str) {
        Intent A03;
        String str2;
        String str3 = userSession.token;
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, str3);
        C18210wN.A0x(A06, "professional_account_onboarding_checklist");
        A06.putBoolean("hide_logged_in_user", true);
        A06.putBoolean("hide_radio_button_and_badge", true);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        int intValue = num.intValue();
        Intent A0B = C18230wP.A0B();
        if (intValue != 5) {
            A0B.putExtra("EXTRA_PROFILE_SHARE_WITH_FOA_DISABLED", true);
            A0B.putExtra("EXTRA_PROFILE_SHARE_USER_ID", A0Y.getId());
            A0B.putExtra("EXTRA_PROFILE_SHARE_PREFILL_MESSAGE", AnonymousClass0wJ.A0l(context, A0Y.BK7(), 2131829224));
            A03 = C62333Yi.A01().A03(context, 268468224);
            str2 = "EXTRA_PROFILE_SHARE_INTENT";
        } else {
            A0B.putExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_TOOL_TIP_ENABLED", true);
            A03 = C62333Yi.A01().A03(context, 268468224);
            str2 = "StoryHandlerActivity.EXTRA_SHARE_INTENT";
        }
        A03.putExtra(str2, A0B);
        A06.putParcelable("in_app_deeplink_intent", A03);
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0O = str;
        C37383Jqm A00 = A0L.A00();
        C23361de r0 = new C23361de();
        r0.setArguments(A06);
        C37383Jqm.A00(fragmentActivity, r0, A00);
    }
}

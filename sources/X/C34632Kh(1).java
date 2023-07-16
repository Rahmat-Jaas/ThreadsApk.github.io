package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.challenge.activity.ChallengeActivity;

/* renamed from: X.2Kh  reason: invalid class name and case insensitive filesystem */
public final class C34632Kh {
    public static void A00(Context context, Bundle bundle, Integer num, Integer num2, String str) {
        String str2;
        Intent A04 = C18250wR.A04(context, ChallengeActivity.class);
        A04.addFlags(num2.intValue());
        Bundle A06 = C18180wK.A06();
        switch (num.intValue()) {
            case 1:
                str2 = "consent";
                break;
            case 2:
                str2 = "delta_login_review";
                break;
            case 3:
                str2 = "change_password";
                break;
            case 4:
                str2 = "selfie_captcha";
                break;
            case 5:
                str2 = "bloks";
                break;
            case 6:
                str2 = "ie_change_password";
                break;
            case 7:
                str2 = "id_captcha";
                break;
            case 8:
                str2 = "unknown";
                break;
            default:
                str2 = "underage";
                break;
        }
        A06.putString("ChallengeFragment.challengeType", str2);
        if (str != null) {
            C18190wL.A13(bundle, str);
        }
        A06.putBundle("ChallengeFragment.arguments", bundle);
        A04.putExtras(A06);
        try {
            C10650ih.A02(context, A04);
        } catch (IllegalStateException e) {
            C10450iM.A07("ChallengeLauncherImpl_launchActivity", e);
        }
    }
}

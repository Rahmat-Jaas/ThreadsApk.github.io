package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.3F7  reason: invalid class name */
public final class AnonymousClass3F7 {
    public final Fragment A00;
    public final UserSession A01;

    public AnonymousClass3F7(Fragment fragment, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragment;
    }

    public final String A00() {
        String string;
        int A002 = AnonymousClass3LT.A00(this.A01);
        Resources A0B = AnonymousClass0wJ.A0B(this.A00);
        if (A002 > 0) {
            string = AnonymousClass0wJ.A0m(A0B, A002, R.plurals.birthday_effect_audience_picker_close_friends_count);
        } else {
            string = A0B.getString(2131822298);
        }
        C04220Ms.A06(string);
        return string;
    }
}

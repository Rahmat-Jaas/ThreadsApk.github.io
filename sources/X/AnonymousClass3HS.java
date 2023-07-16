package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3HS  reason: invalid class name */
public final class AnonymousClass3HS {
    public String A00 = "off";
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    public /* synthetic */ AnonymousClass3HS(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = context;
    }

    public final C41882MfV A00(User user, AnonymousClass0ZU r24) {
        User user2 = user;
        AnonymousClass0ZU r3 = r24;
        boolean A1Z = AnonymousClass0wJ.A1Z(user2, r3);
        if (!this.A01) {
            return null;
        }
        if ("off".equals(this.A00)) {
            Context context = this.A02;
            String string = context.getString(2131829745);
            String A0l = AnonymousClass0wJ.A0l(context, user2.BK7(), 2131829744);
            Drawable drawable = context.getDrawable(R.drawable.instagram_alert_new_pano_outline_24);
            drawable.getClass();
            return new AnonymousClass48R((Typeface) null, drawable, (Drawable) null, (SpannableStringBuilder) null, (C83174qu) null, string, A0l, false, A1Z, false, false);
        } else if (IGLiveNotificationPreference.ALL == user2.A0N()) {
            return null;
        } else {
            Context context2 = this.A02;
            String string2 = context2.getString(2131829745);
            String A0l2 = AnonymousClass0wJ.A0l(context2, user2.BK7(), 2131829744);
            Drawable drawable2 = context2.getDrawable(R.drawable.instagram_alert_new_pano_outline_24);
            drawable2.getClass();
            Drawable drawable3 = context2.getDrawable(R.drawable.instagram_chevron_right_outline_24);
            drawable3.getClass();
            return new AnonymousClass48R((Typeface) null, drawable2, drawable3, (SpannableStringBuilder) null, new AnonymousClass4N6(r3), string2, A0l2, A1Z, false, false, false);
        }
    }

    public final void A01(AnonymousClass0ZU r6) {
        boolean z;
        if (C548230f.A00 == null) {
            C18250wR.A0k();
            throw null;
        }
        Context context = this.A02;
        UserSession userSession = this.A03;
        String A002 = C63853iS.A00(context, userSession);
        if (A002 == null || AnonymousClass8bQ.A0n(A002)) {
            z = false;
        } else {
            z = AnonymousClass3Zd.A01(context, A002, false);
        }
        if (C18190wL.A1Z(z, false)) {
            this.A01 = true;
            this.A00 = "off";
            r6.invoke();
            return;
        }
        IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(57, r6, this);
        C32165H8c A003 = AnonymousClass3OP.A00(userSession, "story_live_and_igtv");
        A003.A00 = iDxACallbackShape35S0200000_1_I2;
        C31155GhB.A03(A003);
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.25W  reason: invalid class name */
public enum AnonymousClass25W {
    ;

    public void A02(TextView textView, C84354t0 r3, UserSession userSession) {
        textView.setVisibility(0);
        textView.setText(2131832159);
    }

    public String A01(Context context, C84354t0 r4, UserSession userSession) {
        if (context == null) {
            return "";
        }
        return context.getResources().getString(2131830673);
    }

    public Drawable A00(Context context, UserSession userSession) {
        return context.getDrawable(R.drawable.ig_creator_account_badge_with_rounded_border);
    }
}

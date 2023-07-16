package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.3G2  reason: invalid class name */
public final class AnonymousClass3G2 {
    public CircularImageView A00;
    public final Activity A01;
    public final Context A02;
    public final C27930Evg A03;
    public final UserSession A04;
    public final String A05;

    public AnonymousClass3G2(Activity activity, Context context, C27930Evg evg, UserSession userSession, String str) {
        C18190wL.A1S(userSession, 2, evg);
        this.A02 = context;
        this.A04 = userSession;
        this.A01 = activity;
        this.A05 = str;
        this.A03 = evg;
    }

    public final void A00(String str) {
        CircularImageView circularImageView = this.A00;
        if (circularImageView != null) {
            Context context = this.A02;
            circularImageView.setImageDrawable(new AnonymousClass4yJ(context, new ColorDrawable(context.getColor(R.color.callout_background)), str, R.dimen.action_bar_item_spacing_left, 0, 0, 0, 104, false));
        }
    }
}

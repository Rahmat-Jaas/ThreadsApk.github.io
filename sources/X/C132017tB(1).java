package X;

import android.content.Context;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tB  reason: invalid class name and case insensitive filesystem */
public final class C132017tB implements AnonymousClass0i4 {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02 = C550631o.A00();

    public final void onSessionWillEnd() {
        IgImageView.A0d = C147088nN.A01;
        IgImageView.A0g = false;
    }

    public C132017tB(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}

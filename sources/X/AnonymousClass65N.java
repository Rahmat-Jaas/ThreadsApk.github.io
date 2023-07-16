package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.65N  reason: invalid class name */
public final class AnonymousClass65N extends C18730xl {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65N(Activity activity, Context context, UserSession userSession, String str, int i) {
        super(i);
        this.A03 = str;
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void onClick(View view) {
        String str = this.A03;
        UserSession userSession = this.A02;
        C25795Ds9.A04(this.A00, this.A01, userSession, str);
    }
}

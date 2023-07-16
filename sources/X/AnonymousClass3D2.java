package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.instagram.service.session.UserSession;

/* renamed from: X.3D2  reason: invalid class name */
public final class AnonymousClass3D2 {
    public final SharedPreferences A00;
    public final Context A01;
    public final Handler A02;
    public final C38040KHr A03;
    public final C09810gi A04;
    public final AnonymousClass3EY A05;
    public final UserSession A06;

    public AnonymousClass3D2(Context context, SharedPreferences sharedPreferences, Handler handler, C38040KHr kHr, C09810gi r6, AnonymousClass3EY r7, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A01 = context;
        this.A06 = userSession;
        this.A03 = kHr;
        this.A00 = sharedPreferences;
        this.A04 = r6;
        this.A02 = handler;
        this.A05 = r7;
    }
}

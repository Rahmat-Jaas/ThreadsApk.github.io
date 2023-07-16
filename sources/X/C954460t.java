package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74;

/* renamed from: X.60t  reason: invalid class name and case insensitive filesystem */
public final class C954460t extends AnonymousClass0gG {
    public C954460t() {
        super(1634543048);
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = C120887Cz.A00;
        if (sharedPreferences != null) {
            AnonymousClass0wJ.A12(sharedPreferences.edit(), "last_app_background_timestamp", currentTimeMillis);
        }
        UserSession userSession = C120887Cz.A01;
        if (userSession != null) {
            AnonymousClass0wJ.A12(((C106366ev) userSession.A01(C106366ev.class, new KtLambdaShape94S0100000_I2_74(userSession, 8))).A00.edit(), C28174Ezk.A00(92), currentTimeMillis);
        }
    }
}

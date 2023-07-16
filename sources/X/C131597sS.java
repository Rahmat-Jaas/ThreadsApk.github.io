package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7sS  reason: invalid class name and case insensitive filesystem */
public final class C131597sS implements C10390iG, AnonymousClass0i4 {
    public UserSession A00;
    public final Context A01;
    public final List A02;
    public final List A03;
    public final Handler A04 = AnonymousClass0wJ.A0F();

    public C131597sS(Context context, UserSession userSession) {
        this.A01 = context;
        this.A00 = userSession;
        this.A03 = AnonymousClass0wJ.A0v();
        this.A02 = AnonymousClass0wJ.A0v();
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(1984817015);
        SharedPreferences A0C = C18200wM.A0C();
        long A05 = C18180wK.A05(A0C, "device_info_last_reported_time");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > A05 + 43200000) {
            for (C144868jQ r4 : this.A02) {
                AnonymousClass0gN.A00().AKp(new AnonymousClass61I(this, r4));
            }
            AnonymousClass0wJ.A12(A0C.edit(), "device_info_last_reported_time", currentTimeMillis);
        }
        C14030oh.A0A(717072789, A032);
    }

    public final void onAppForegrounded() {
        int A032 = C14030oh.A03(729820635);
        this.A04.postDelayed(new AnonymousClass80B(this), 5000);
        C14030oh.A0A(788703209, A032);
    }

    public final void onSessionWillEnd() {
        C691847d.A03(this);
    }
}

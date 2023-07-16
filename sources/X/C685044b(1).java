package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.44b  reason: invalid class name and case insensitive filesystem */
public final class C685044b implements AnonymousClass0k3 {
    public String A00;
    public final SharedPreferences A01;
    public final String A02;
    public final boolean A03;

    public static C685044b A00(C10300i6 r2) {
        return (C685044b) C18180wK.A0c(r2, C685044b.class, 29);
    }

    public final void A01(String str) {
        String str2;
        if (!str.equals(this.A00)) {
            this.A00 = str;
            if (this.A03 && (str2 = this.A02) != null) {
                C18180wK.A0v(this.A01.edit(), str2, str);
            }
        }
    }

    public C685044b(SharedPreferences sharedPreferences, C10300i6 r4) {
        this.A03 = r4 instanceof UserSession;
        String A04 = C05030Qo.A04(r4);
        this.A02 = A04;
        this.A01 = sharedPreferences;
        if (this.A03 && A04 != null) {
            this.A00 = C18200wM.A0h(sharedPreferences, A04);
        }
    }
}

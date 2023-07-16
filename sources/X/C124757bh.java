package X;

import android.content.Context;
import com.instagram.groupprofiles.data.GroupProfileCustomizationRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bh  reason: invalid class name and case insensitive filesystem */
public final class C124757bh implements C147138nS {
    public final Context A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C124757bh(Context context, UserSession userSession, String str, String str2, boolean z) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new AnonymousClass57T(new GroupProfileCustomizationRepository(userSession, C18230wP.A09(this.A00)), userSession, this.A02, this.A03, this.A04);
    }
}

package X;

import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bW  reason: invalid class name and case insensitive filesystem */
public final class C124647bW implements C147138nS {
    public final UserSession A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public C124647bW(UserSession userSession, String str, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new AnonymousClass58C(new ArchiveStoryRepository(userSession), userSession, this.A01, this.A02, this.A03);
    }
}

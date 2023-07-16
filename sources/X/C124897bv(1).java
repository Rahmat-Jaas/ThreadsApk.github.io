package X;

import android.app.Application;
import com.instagram.groupprofiles.data.GroupProfileRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bv  reason: invalid class name and case insensitive filesystem */
public final class C124897bv implements C147138nS, AnonymousClass0RJ {
    public final /* synthetic */ AnonymousClass5xU A00;

    public C124897bv(AnonymousClass5xU r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        AnonymousClass5xU r1 = this.A00;
        C04530Oa r0 = r1.A02;
        UserSession A0X = AnonymousClass0wJ.A0X(r0);
        String str = r1.A00;
        if (str == null) {
            C04220Ms.A0E("groupProfileId");
            throw null;
        }
        UserSession A0X2 = AnonymousClass0wJ.A0X(r0);
        C07530bf A05 = AnonymousClass0RA.A0C.A05(this);
        Application application = r1.requireActivity().getApplication();
        C04220Ms.A06(application);
        return new C883557s(new GroupProfileRepository(application, A05, A0X2), A0X, str);
    }
}

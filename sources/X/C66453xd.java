package X;

import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xd  reason: invalid class name and case insensitive filesystem */
public final class C66453xd implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;
    public final Integer A02;

    public C66453xd(C11630kW r2, UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = num;
    }

    public final C62793ak create(Class cls) {
        C83554rb r6 = null;
        AnonymousClass0gQ BQy = C18250wR.A0J((AnonymousClass0gW) null, 3).BQy(104699016, 3);
        Integer num = this.A02;
        Integer num2 = AnonymousClass006.A01;
        UserSession userSession = this.A01;
        if (num == num2) {
            r6 = new HiddenWordsPostsDictionary(userSession);
        } else {
            MutedWordsFilterManager A002 = C35362Nd.A00(userSession);
            if (A002 != null) {
                r6 = A002.A00;
            }
        }
        return new AnonymousClass10S(new DictionaryRepository(r6), new C58553Gf(this.A00, userSession), BQy, AnonymousClass7Ja.A03(BQy));
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }
}

package X;

import android.os.Handler;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.7uM  reason: invalid class name and case insensitive filesystem */
public final class C132697uM implements C09990hX {
    public final AnonymousClass0hW A00;
    public final C11900kz A01 = new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "LocalReelItemSeenStateSerialize");
    public final C113766s6 A02;
    public final UserSession A03;
    public final Handler A04;

    public final synchronized void A00(Reel reel, UserSession userSession, Set set) {
        C21785C0k c0k;
        User user;
        synchronized (this) {
            C113766s6 r4 = this.A02;
            r4.A01(set, AnonymousClass7HM.A01(reel));
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316581303356632L) && (c0k = reel.A0V) != null && c0k.BIy() == AnonymousClass006.A03) {
                for (BKH bkh : reel.A0P(userSession)) {
                    BKU bku = bkh.A0M;
                    if (bku != null) {
                        BKN bkn = bku.A0f;
                        if (!(!set.contains(bkn.A4Y) || (user = bkh.A0S) == null || user.getId() == null)) {
                            r4.A01(new SingletonImmutableSet(bkn.A4Y), user.getId());
                        }
                    }
                }
            }
            this.A00.A01(C18200wM.A0c());
        }
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C113766s6 r2;
        synchronized (this) {
            C113766s6 r3 = this.A02;
            synchronized (r3) {
                r2 = new C113766s6();
                r2.A01.putAll(r3.A01);
                r2.A02.addAll(r3.A02);
            }
            this.A01.AKp(new AnonymousClass61E(r2, this));
        }
    }

    public final synchronized String toString() {
        String str;
        try {
            str = AnonymousClass71E.A00(this.A02);
        } catch (IOException e) {
            C10450iM.A06("LocalReelItemSeenStateStore#toString", "Failed to serialize seen state to json", e.getCause());
            str = "";
        }
        return str;
    }

    public C132697uM(C113766s6 r5, UserSession userSession) {
        Handler A0F = AnonymousClass0wJ.A0F();
        this.A04 = A0F;
        this.A02 = r5;
        this.A03 = userSession;
        this.A00 = new AnonymousClass0hW(A0F, this, C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36592404103365043L));
    }
}

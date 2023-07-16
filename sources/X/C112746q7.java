package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.6q7  reason: invalid class name and case insensitive filesystem */
public final class C112746q7 {
    public String A00;
    public String A01;
    public String A02;
    public final ReelStore A03;

    public final Reel A00(C94225tx r4) {
        C04220Ms.A0B(r4, 0);
        this.A01 = r4.A00.A1G;
        this.A02 = r4.A01;
        List list = r4.A02;
        C04220Ms.A06(list);
        this.A00 = (String) AnonymousClass00J.A0D(list);
        return this.A03.A0G(r4.A00, true);
    }

    public /* synthetic */ C112746q7(UserSession userSession) {
        C19554AyF.A02();
        ReelStore A022 = ReelStore.A02(userSession);
        C04220Ms.A06(A022);
        this.A03 = A022;
    }
}

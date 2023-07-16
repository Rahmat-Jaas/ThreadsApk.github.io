package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7pT  reason: invalid class name */
public final class AnonymousClass7pT implements C145498kb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C95355zy A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ UserSession A04;

    public final void CGI(String str) {
    }

    public AnonymousClass7pT(FragmentActivity fragmentActivity, C95355zy r2, AnonymousClass601 r3, C127397h3 r4, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final void CGk(C171229wH r14, List list) {
        if (!list.isEmpty()) {
            String str = ((BKU) list.get(0)).A0f.A4Y;
            UserSession userSession = this.A04;
            User A2Z = ((BKU) list.get(0)).A2Z(userSession);
            A2Z.getClass();
            C171229wH r11 = r14;
            boolean A1Z = C18180wK.A1Z(r14, C171229wH.A0L);
            C19554AyF.A02();
            Reel A0H = ReelStore.A02(userSession).A0H(new C20098BOf(A2Z), str, list, A1Z);
            C127397h3 r1 = this.A03;
            AnonymousClass601 r3 = this.A02;
            View A0J = r1.A0J(r3.A00);
            int[] iArr = new int[2];
            if (A0J != null) {
                A0J.getLocationOnScreen(iArr);
            }
            C95355zy r6 = this.A01;
            float f = (float) iArr[0];
            float f2 = (float) iArr[1];
            r6.A01(new RectF(f, f2, f, f2), this.A00, C63913ic.A0A(r3), A0H, r11, userSession);
        }
    }
}

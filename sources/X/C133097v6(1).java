package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7v6  reason: invalid class name and case insensitive filesystem */
public final class C133097v6 implements L1K {
    public final /* synthetic */ C109976kv A00;
    public final /* synthetic */ C171229wH A01;

    public final void Byg(AnonymousClass3XX r2) {
        C04220Ms.A0B(r2, 0);
        r2.toString();
    }

    public final void Byh(C26743EUq eUq) {
    }

    public final void Byi() {
    }

    public final void Byj() {
    }

    public C133097v6(C109976kv r1, C171229wH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void Byk(C146578mT r21) {
        C156169Me r0 = (C156169Me) r21;
        C04220Ms.A0B(r0, 0);
        C109976kv r3 = this.A00;
        List list = r0.A04;
        C04220Ms.A06(list);
        C171229wH r9 = this.A01;
        if (!list.isEmpty()) {
            String str = ((BKU) list.get(0)).A0f.A4Y;
            UserSession userSession = r3.A02;
            User A2Z = ((BKU) list.get(0)).A2Z(userSession);
            if (A2Z != null) {
                C19554AyF.A02();
                Reel A0H = ReelStore.A02(userSession).A0H(new C20098BOf(A2Z), str, list, false);
                AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession);
                long parseLong = Long.parseLong(A2Z.getId());
                List list2 = r3.A03;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A002.A00, "fan_onboarding_view_exclusive_media"), 615);
                A0I.A0T("container_module", C18170wI.A00(1046));
                A0I.A0S(C18170wI.A00(54), Long.valueOf(parseLong));
                A0I.A0U("media_ids", list2);
                A0I.Bb4();
                RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f);
                FragmentActivity fragmentActivity = r3.A00;
                C11630kW A0A = C63913ic.A0A(r3.A01);
                C18190wL.A1S(fragmentActivity, 3, r9);
                C04220Ms.A0B(A0A, 6);
                C26159E1n A09 = C19554AyF.A02().A09(fragmentActivity, userSession);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                A0v.add(A0H.getId());
                A09.A0P((RectF) null, rectF, A0A, A0H, r9, new C26600ENc(rectF, fragmentActivity, A0H, r9, A09, userSession, A0v), 0);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Byl(C146578mT r1) {
    }
}

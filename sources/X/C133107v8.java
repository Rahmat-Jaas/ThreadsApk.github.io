package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxListenerShape126S0000000_2_I2;
import com.facebook.redex.IDxPHolderShape745S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7v8  reason: invalid class name and case insensitive filesystem */
public final class C133107v8 implements L1K {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void Byh(C26743EUq eUq) {
    }

    public final void Byi() {
    }

    public final void Byj() {
    }

    public C133107v8(FragmentActivity fragmentActivity, AnonymousClass601 r2, C109326jp r3, UserSession userSession, String str, String str2) {
        this.A02 = r3;
        this.A03 = userSession;
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void Byg(AnonymousClass3XX r6) {
        C109326jp r4 = this.A02;
        if (r4 != null) {
            C61043Rr.A00(this.A01, C86154wM.A0R(AnonymousClass3VO.A00(), false, 0), r4);
        }
    }

    public final /* bridge */ /* synthetic */ void Byk(C146578mT r20) {
        String str;
        Object obj;
        C171229wH r14;
        C156169Me r0 = (C156169Me) r20;
        C04220Ms.A0B(r0, 0);
        List list = r0.A04;
        C04220Ms.A06(list);
        int i = 0;
        if (!list.isEmpty()) {
            String str2 = this.A05;
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C04220Ms.A0I(((BKU) obj).A0f.A4Y, str2)) {
                    break;
                }
            }
            BKU bku = (BKU) obj;
            if (bku == null) {
                bku = (BKU) list.get(0);
            }
            UserSession userSession = this.A03;
            User A2Z = bku.A2Z(userSession);
            if (A2Z != null) {
                C19554AyF.A02();
                Reel A0H = ReelStore.A02(userSession).A0H(new C20098BOf(A2Z), bku.A0f.A4Y, list, C18250wR.A1J(userSession, A2Z.getId()));
                AnonymousClass601 r3 = this.A01;
                C04220Ms.A0B(r3, 0);
                C25029DeI deI = new C25029DeI(C63913ic.A0A(r3), new C133937wk(C63913ic.A01(r3), -1), userSession);
                RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f);
                C23372Cqx cqx = new C23372Cqx((Activity) this.A00, rectF, (C27907EvI) new IDxListenerShape126S0000000_2_I2(1));
                IDxPHolderShape745S0100000_2_I2 iDxPHolderShape745S0100000_2_I2 = new IDxPHolderShape745S0100000_2_I2(rectF, 1);
                C171229wH[] values = C171229wH.values();
                String str3 = this.A04;
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        r14 = C171229wH.A0H;
                        break;
                    }
                    r14 = values[i];
                    if (C04220Ms.A0I(r14.A00, str3)) {
                        break;
                    }
                    i++;
                }
                AnonymousClass3HX r1 = r3.A00;
                if (r1 != null) {
                    str = (String) r1.A00(R.id.bloks_reel_tray_session_id);
                }
                deI.A0C = str;
                deI.A05 = cqx;
                deI.A00(A0H, (ReelChainingConfig) null, r14, iDxPHolderShape745S0100000_2_I2, C18180wK.A0n(A0H), C18180wK.A0n(A0H), 0);
                C109326jp r2 = this.A02;
                if (r2 != null) {
                    C61043Rr.A00(r3, C86154wM.A0R(AnonymousClass3VO.A00(), true, 0), r2);
                    return;
                }
                return;
            }
        }
        C109326jp r32 = this.A02;
        if (r32 != null) {
            C61043Rr.A00(this.A01, C86154wM.A0R(AnonymousClass3VO.A00(), false, 0), r32);
        }
    }

    public final /* bridge */ /* synthetic */ void Byl(C146578mT r1) {
    }
}

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
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.6P2  reason: invalid class name */
public final class AnonymousClass6P2 {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        C11630kW r0;
        String str;
        Object obj;
        AnonymousClass601 r9 = r17;
        C63893iY r2 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r9);
        Object A0B = C63893iY.A0B(r2, 0);
        A0B.getClass();
        Iterable iterable = (Iterable) A0B;
        Object A0B2 = C63893iY.A0B(r2, A1Z ? 1 : 0);
        A0B2.getClass();
        String A0h = C86164wN.A0h(A0B2);
        String str2 = (String) A0B2;
        UserSession A0Y = C86104wH.A0Y(r9);
        FragmentActivity A05 = C63913ic.A05(r9);
        AnonymousClass3HX r8 = r9.A00;
        C171229wH valueOf = C171229wH.valueOf(C18220wO.A0u(Locale.ROOT, (String) C63893iY.A0C(r2, A0h, 2)));
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        C23372Cqx cqx = new C23372Cqx((Activity) A05, rectF, (C27907EvI) new IDxListenerShape126S0000000_2_I2(0));
        C133937wk r1 = new C133937wk(C63913ic.A01(r9), -1);
        if (r8 != null) {
            r0 = C63913ic.A09(r8);
        } else {
            r0 = null;
        }
        C25029DeI deI = new C25029DeI(r0, r1, A0Y);
        IDxPHolderShape745S0100000_2_I2 iDxPHolderShape745S0100000_2_I2 = new IDxPHolderShape745S0100000_2_I2(rectF, 0);
        if (r8 != null) {
            str = (String) r8.A00(R.id.bloks_reel_tray_session_id);
        } else {
            str = null;
        }
        deI.A0C = str;
        deI.A05 = cqx;
        deI.A03 = ReelViewerConfig.A00();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C04690Os A00 = C04700Ot.A00(C18987Aon.A00.A08(C18180wK.A0k(it)), A0Y);
            if (A00.A0f() == null) {
                A00.A0g();
            }
            C20096BOd parseFromJson = C18779AlF.parseFromJson(A00);
            if (parseFromJson != null) {
                A0v.add(ReelStore.A02(A0Y).A0G(parseFromJson, A0Y.getUserId().equals(parseFromJson.A1B)));
            }
        }
        Iterator it2 = A0v.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            String id = ((Reel) obj).getId();
            C04220Ms.A06(id);
            if (AnonymousClass8bP.A0j(id, str2, false)) {
                break;
            }
        }
        Reel reel = (Reel) obj;
        if (reel == null) {
            reel = (Reel) A0v.get(0);
        }
        deI.A00(reel, (ReelChainingConfig) null, valueOf, iDxPHolderShape745S0100000_2_I2, A0v, A0v, 0);
        return null;
    }
}

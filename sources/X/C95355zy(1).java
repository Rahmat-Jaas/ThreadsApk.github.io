package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxRCallbackShape1S0800000_4_I2;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5zy  reason: invalid class name and case insensitive filesystem */
public final class C95355zy extends C19819BBt implements C27907EvI {
    public Context A00;

    public final void A01(RectF rectF, FragmentActivity fragmentActivity, C11630kW r21, Reel reel, C171229wH r23, UserSession userSession) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        C26159E1n A09 = C19554AyF.A02().A09(fragmentActivity2, userSession2);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Reel reel2 = reel;
        A0v.add(reel2.getId());
        RectF rectF2 = rectF;
        C171229wH r5 = r23;
        A09.A0P((RectF) null, rectF2, r21, reel2, r5, new IDxRCallbackShape1S0800000_4_I2(rectF2, fragmentActivity2, this, reel2, r5, A09, userSession2, A0v, 0), 0);
    }

    public final /* synthetic */ void BzF(Reel reel, C24429DLt dLt) {
    }

    public final /* synthetic */ void CEd(Reel reel) {
    }

    public final /* synthetic */ void CF5(Reel reel) {
    }

    public C95355zy(Context context) {
        this.A00 = context;
    }

    public static C32165H8c A00(UserSession userSession, List list) {
        return C86104wH.A0U(userSession, list);
    }
}

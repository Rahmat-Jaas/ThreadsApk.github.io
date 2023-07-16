package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.IDxLListenerShape120S0300000_1_I2;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;

/* renamed from: X.6Ox  reason: invalid class name and case insensitive filesystem */
public final class C100856Ox {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        C109326jp A06 = C63893iY.A06(r9, A1Z ? 1 : 0);
        Object A0B2 = C63893iY.A0B(r9, 3);
        A0B2.getClass();
        AnonymousClass3HX r3 = (AnonymousClass3HX) A0B2;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("highlight:%s", A0B);
        C10300i6 A0E = C63913ic.A0E(r3);
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        Fragment A01 = C63913ic.A01(r8);
        FragmentActivity A05 = C63913ic.A05(r8);
        C63913ic.A06(r8);
        Reel A0X = C86114wI.A0X(userSession, formatStrLocaleSafe);
        if (A0X == null) {
            return null;
        }
        C63913ic.A0Q(r8, new IDxLListenerShape120S0300000_1_I2(0, r8, A06, A0X));
        C133937wk r82 = new C133937wk(A01, 1005);
        Context context = r82.A00.getContext();
        C04220Ms.A06(context);
        RectF rectF = new RectF((float) (C09860go.A08(context) >> 1), (float) (C09860go.A07(context) >> 1), (float) (C09860go.A08(context) >> 1), (float) (C09860go.A07(context) >> 1));
        C25029DeI deI = new C25029DeI(C63913ic.A09(r3), r82, userSession);
        C23372Cqx cqx = new C23372Cqx(A05, rectF, (C27907EvI) null, AnonymousClass006.A01);
        deI.A0C = C18180wK.A0e();
        deI.A05 = cqx;
        deI.A01(A0X, C171229wH.A0H, (C27981EwV) null);
        return null;
    }
}

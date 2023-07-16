package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxListenerShape403S0100000_2_I2;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114;

/* renamed from: X.8DX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8DX extends AnonymousClass019 implements AnonymousClass0YM, C81774oL {
    public AnonymousClass8DX(Object obj) {
        super(3, obj, CTp.class, "navigateToUserStory", "navigateToUserStory(Lcom/instagram/model/reels/Reel;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass7F6 r11 = (AnonymousClass7F6) obj2;
        CTp cTp = (CTp) this.receiver;
        C109526k9 r4 = (C109526k9) cTp.A03.getValue();
        KtLambdaShape134S0100000_I2_114 ktLambdaShape134S0100000_I2_114 = new KtLambdaShape134S0100000_I2_114(cTp, 3);
        C27420EnC A17 = C86104wH.A17((C146958n9) obj3);
        UserSession userSession = r4.A01;
        Fragment fragment = r4.A00;
        C25029DeI deI = new C25029DeI(new C130477q8(r4), new C133937wk(fragment, -1), userSession);
        deI.A0C = C18180wK.A0e();
        deI.A06 = new C133947wl(A17);
        FragmentActivity requireActivity = fragment.requireActivity();
        C04220Ms.A0B(r11, 0);
        deI.A05 = new C23372Cqx((Activity) requireActivity, new RectF(r11.A01, r11.A03, r11.A02, r11.A00), (C27907EvI) new IDxListenerShape403S0100000_2_I2(ktLambdaShape134S0100000_I2_114, 2));
        deI.A01((Reel) obj, C171229wH.A1A, (C27981EwV) null);
        Object A0B = A17.A0B();
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A0B != d0e) {
            A0B = Unit.A00;
        }
        if (A0B != d0e) {
            return Unit.A00;
        }
        return A0B;
    }
}

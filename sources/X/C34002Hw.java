package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3;

/* renamed from: X.2Hw  reason: invalid class name and case insensitive filesystem */
public final class C34002Hw {
    public static final Object A00(AnonymousClass601 r6) {
        C04220Ms.A0B(r6, 1);
        UserSession userSession = (UserSession) C63913ic.A0F(r6);
        FragmentActivity A05 = C63913ic.A05(r6);
        AnonymousClass0wJ.A13(AnonymousClass2SP.A00(userSession).A00.edit(), "should_show_exclusive_story_button", true);
        AnonymousClass2RN.A00(userSession).A03(UserMonetizationProductType.FAN_CLUB_CREATOR, true);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape6S0101000_I2_3(userSession, (C146958n9) null, 0), AnonymousClass7Ja.A04(C550531n.A00.A03, C550531n.A01), 3);
        C63863iT.A03(A05, C18180wK.A06(), userSession, TransparentModalActivity.class, "universal_creation_story_camera").A0I(A05);
        return null;
    }
}

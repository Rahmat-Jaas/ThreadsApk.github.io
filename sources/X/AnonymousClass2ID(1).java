package X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2ID  reason: invalid class name */
public final class AnonymousClass2ID {
    public static Object A00(AnonymousClass601 r8, C63893iY r9) {
        int A04 = AnonymousClass0wJ.A04(C63893iY.A07(r9));
        C109326jp A06 = C63893iY.A06(r9, 2);
        UserSession A0J = C63913ic.A0J(r8);
        AnonymousClass2BA.A00 = new AnonymousClass37W(r8, A06);
        Bundle A062 = C18180wK.A06();
        A062.putInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS", A04);
        A062.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_TITLE", (String) C63893iY.A08(r9));
        C04220Ms.A0B(r8, 0);
        C63863iT A02 = C63863iT.A02(C63913ic.A05(r8), A062, A0J, ModalActivity.class, "activity_center_date_picker");
        A02.A0F();
        A02.A0H(C63913ic.A05(r8), 1003);
        return null;
    }
}

package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2L1  reason: invalid class name */
public final class AnonymousClass2L1 {
    public static final void A00(Activity activity, C312224t r4, UserSession userSession) {
        C04220Ms.A0B(r4, 2);
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("entry_point", r4);
        C63863iT.A09(activity, A06, userSession, ModalActivity.class, "private_story_audience_picker");
    }
}

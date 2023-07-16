package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.6rV  reason: invalid class name and case insensitive filesystem */
public final class C113486rV {
    public static C113486rV A01;
    public C101846Sv A00;

    public final void A00(FragmentActivity fragmentActivity, C35356ItK itK, UserSession userSession, String str, String str2, String str3) {
        if (AnonymousClass056.A01(fragmentActivity.getSupportFragmentManager())) {
            Bundle A06 = C18180wK.A06();
            A06.putSerializable("entry_point", itK);
            if (str != null) {
                A06.putString("media_id", str);
            }
            if (str2 != null) {
                A06.putString(I17.A00(242), str2);
            }
            if (str3 != null) {
                A06.putString("utm_source", str3);
            }
            C63863iT.A09(fragmentActivity, A06, userSession, ModalActivity.class, I17.A00(52));
        }
    }

    public final void A01(FragmentActivity fragmentActivity, C35356ItK itK, UserSession userSession, String str, String str2, String str3) {
        if (AnonymousClass056.A01(fragmentActivity.getSupportFragmentManager())) {
            Bundle A06 = C18180wK.A06();
            A06.putSerializable("entry_point", itK);
            if (str != null) {
                A06.putString("media_id", str);
            }
            if (str2 != null) {
                A06.putString(I17.A00(242), str2);
            }
            if (str3 != null) {
                A06.putString("utm_source", str3);
            }
            C63863iT.A09(fragmentActivity, A06, userSession, ModalActivity.class, C28174Ezk.A00(44));
        }
    }
}

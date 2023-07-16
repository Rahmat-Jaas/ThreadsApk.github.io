package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.2qb  reason: invalid class name and case insensitive filesystem */
public final class C48952qb {
    public static Fragment A00(UserSession userSession, String str) {
        AnonymousClass1YC r2 = new AnonymousClass1YC();
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString("AddAccountBottomSheetFragment.ARGUMENT_ENTRY_POINT", str);
        r2.setArguments(A0E);
        return r2;
    }
}

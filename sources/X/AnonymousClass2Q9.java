package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Q9  reason: invalid class name */
public final class AnonymousClass2Q9 {
    public static Fragment A00(AnonymousClass25Q r3, UserSession userSession, boolean z) {
        Bundle A06 = C18180wK.A06();
        C05050Qq.A00(A06, userSession);
        A06.putSerializable("iab_history_entry_point", r3);
        A06.putBoolean("iab_history_is_first_tab", true);
        A06.putBoolean("iab_history_logging_enabled", z);
        AnonymousClass9PV r0 = new AnonymousClass9PV();
        r0.setArguments(A06);
        return r0;
    }
}

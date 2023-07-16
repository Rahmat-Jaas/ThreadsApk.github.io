package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Dy  reason: invalid class name and case insensitive filesystem */
public final class C58113Dy {
    public final /* bridge */ /* synthetic */ Fragment A00(UserSession userSession, C83934sE r6, AnonymousClass21X r7, C23874Czk czk, Boolean bool, String str, String str2) {
        boolean booleanValue = bool.booleanValue();
        AnonymousClass0wJ.A1N(userSession, czk);
        AnonymousClass0wJ.A1Q(r7, str);
        AnonymousClass1bB r2 = new AnonymousClass1bB();
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putSerializable("warning_type", czk);
        A0E.putSerializable("content_warning_type", r7);
        A0E.putString("action_source", str);
        A0E.putString("text_language", str2);
        A0E.putBoolean("is_launched_from_bottom_sheet", booleanValue);
        r2.setArguments(A0E);
        r2.A01 = r6;
        return r2;
    }
}

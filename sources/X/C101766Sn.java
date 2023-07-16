package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6Sn  reason: invalid class name and case insensitive filesystem */
public final class C101766Sn {
    public static final AnonymousClass5wu A00(UserSession userSession, String str, String str2, String str3, ArrayList arrayList, AnonymousClass0ZU r8, boolean z) {
        C04220Ms.A0B(str, 1);
        AnonymousClass5wu r2 = new AnonymousClass5wu();
        r2.A01 = r8;
        Bundle A06 = C18180wK.A06();
        AnonymousClass3W9.A02(A06, userSession);
        A06.putString("arg_group_profile_id", str);
        A06.putParcelableArrayList("arg_detail_rows", arrayList);
        A06.putBoolean("arg_is_notifications_enabled", z);
        A06.putString(AnonymousClass000.A00(126), str2);
        A06.putString("arg_notifications_click_point", str3);
        r2.setArguments(A06);
        return r2;
    }
}

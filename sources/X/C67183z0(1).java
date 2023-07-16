package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3z0  reason: invalid class name and case insensitive filesystem */
public final class C67183z0 implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67183z0.class);
    public static final String __redex_internal_original_name = "SwitchToBusinessUtil";

    public static H1T A00(UserSession userSession, AnonymousClass266 r3, String str) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("business/account/convert_account/");
        A0N.A0O("entry_point", str);
        A0N.A0B(CP8.class, C25056Dep.class);
        A0N.A0R("creator_destination_migration", C18180wK.A1Z(r3, AnonymousClass266.A05));
        if (!(r3 == null || r3 == AnonymousClass266.A07)) {
            A0N.A0O("to_account_type", String.valueOf(r3.A00));
        }
        return A0N;
    }
}

package X;

import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3yn  reason: invalid class name and case insensitive filesystem */
public final class C67053yn implements CallerContextable {
    public static final String __redex_internal_original_name = "CrossPostingDestinationManager";
    public ImmutableList A00;
    public final UserSession A01;

    public final String A00(String str) {
        if (str == null) {
            return null;
        }
        ImmutableList immutableList = this.A00;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C04220Ms.A0I(((AnonymousClass3CV) next).A02, str)) {
                A0v.add(next);
            }
        }
        if (C18190wL.A1a(A0v)) {
            return ((AnonymousClass3CV) C18240wQ.A0b(A0v)).A04;
        }
        return null;
    }

    public C67053yn(UserSession userSession) {
        this.A01 = userSession;
        ImmutableList of = ImmutableList.of();
        C04220Ms.A06(of);
        this.A00 = of;
    }
}

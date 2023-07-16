package X;

import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.3FQ  reason: invalid class name */
public final class AnonymousClass3FQ {
    public final UserSession A00;
    public final LinkedList A01;
    public final Set A02;

    public /* synthetic */ AnonymousClass3FQ(UserSession userSession) {
        LinkedList linkedList = new LinkedList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A01 = linkedList;
        this.A02 = linkedHashSet;
        this.A00 = userSession;
    }

    public final Object A00(Collection collection) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : collection) {
            C18240wQ.A1N(next, A0v, this.A02.contains(next) ? 1 : 0);
        }
        if (C18190wL.A1a(A0v)) {
            this.A02.addAll(A0v);
            this.A01.addAll(0, A0v);
        }
        return Unit.A00;
    }
}

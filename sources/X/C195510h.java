package X;

import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.10h  reason: invalid class name and case insensitive filesystem */
public final class C195510h extends C62793ak implements C82704q8 {
    public final AnonymousClass3II A00;

    public C195510h(AnonymousClass3II r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final M5J AA8(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        List A04 = userSession.multipleAccountHelper.A00.A04((User) null);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A04) {
            C18240wQ.A1N(next, A0v, C04220Ms.A0I(next, A0Y) ? 1 : 0);
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            User A0c = C18220wO.A0c(it);
            A0w.add(new IDxFlowShape93S0200000_1_I2(27, (Object) A0c, (Object) this.A00.A00(new AnonymousClass4EA((AnonymousClass2AP) null, A0c.getId()))));
        }
        Object[] array = AnonymousClass00J.A0N(A0w).toArray(new C84714tk[0]);
        if (array != null) {
            return C29110FiC.A00((C27952Ew2) null, new IDxFlowShape250S0100000_1_I2(array, 26), 3);
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

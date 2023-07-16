package X;

import com.instagram.user.model.User;
import java.util.Collection;

/* renamed from: X.3IO  reason: invalid class name */
public abstract class AnonymousClass3IO {
    public final int A00() {
        if (this instanceof C27241sC) {
            return AnonymousClass0wJ.A04(((C27241sC) this).A04.getValue());
        }
        return AnonymousClass0wJ.A04(((C27231sB) this).A04.getValue());
    }

    public final User A01() {
        C04530Oa r0;
        if (this instanceof C27241sC) {
            r0 = ((C27241sC) this).A0A;
        } else {
            r0 = ((C27231sB) this).A0A;
        }
        return (User) r0.getValue();
    }

    public final String A02() {
        if (this instanceof C27241sC) {
            return C18200wM.A0q(((C27241sC) this).A03);
        }
        return C18200wM.A0q(((C27231sB) this).A03);
    }

    public final Collection A03() {
        C04530Oa r0;
        if (this instanceof C27241sC) {
            r0 = ((C27241sC) this).A01;
        } else {
            r0 = ((C27231sB) this).A01;
        }
        return (Collection) r0.getValue();
    }
}

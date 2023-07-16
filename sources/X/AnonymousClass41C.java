package X;

import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.41C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass41C implements McB {
    public final /* synthetic */ McB A00;
    public final /* synthetic */ Set A01;

    public /* synthetic */ AnonymousClass41C(McB mcB, Set set) {
        this.A00 = mcB;
        this.A01 = set;
    }

    public final Object apply(Object obj) {
        McB mcB = this.A00;
        Set set = this.A01;
        User user = (User) obj;
        boolean z = true;
        if (!AnonymousClass0wJ.A1X(mcB.apply(user)) && set.add(user.getId())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

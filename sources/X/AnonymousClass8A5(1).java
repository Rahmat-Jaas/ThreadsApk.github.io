package X;

import java.util.Collection;
import java.util.regex.Matcher;

/* renamed from: X.8A5  reason: invalid class name */
public final class AnonymousClass8A5 extends AnonymousClass83X implements Collection, C03740Kn {
    public final /* synthetic */ C110166lE A00;

    public AnonymousClass8A5(C110166lE r1) {
        this.A00 = r1;
    }

    public final C114856u0 A09(int i) {
        Matcher matcher = this.A00.A01;
        AnonymousClass8bH A0C = AnonymousClass8bI.A0C(matcher.start(i), matcher.end(i));
        if (A0C.A00 < 0) {
            return null;
        }
        String group = matcher.group(i);
        C04220Ms.A06(group);
        return new C114856u0(group, A0C);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C114856u0)) {
            return super.contains(obj);
        }
        return false;
    }
}

package X;

import java.util.List;

/* renamed from: X.88E  reason: invalid class name */
public final class AnonymousClass88E implements C145028ji {
    public final List A00 = AnonymousClass0wJ.A0v();

    public final C142608fI Ass(String str) {
        List list = this.A00;
        synchronized (list) {
            list.add(str);
        }
        return AnonymousClass8cO.A00;
    }
}

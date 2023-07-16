package X;

import java.util.List;

/* renamed from: X.7W1  reason: invalid class name */
public abstract class AnonymousClass7W1 implements C146498mL {
    public Object A00;
    public final Object A01;
    public final List A02 = AnonymousClass0wJ.A0v();

    public final void AIY(Object obj) {
        this.A02.add(this.A00);
        this.A00 = obj;
    }

    public final Object AbA() {
        return this.A00;
    }

    public final void D8Y() {
        List list = this.A02;
        if (C18190wL.A1a(list)) {
            this.A00 = list.remove(C86104wH.A0B(list));
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final void clear() {
        this.A02.clear();
        Object obj = this.A01;
        this.A00 = obj;
        if (this instanceof C874952z) {
            ((AnonymousClass7Y3) obj).A0G();
            return;
        }
        AnonymousClass798 r2 = (AnonymousClass798) obj;
        if (r2 instanceof AnonymousClass548) {
            AnonymousClass548 r22 = (AnonymousClass548) r2;
            r22.A05(0, r22.A0F.size());
            return;
        }
        throw C18180wK.A0a("Cannot only insert VNode into Group");
    }

    public AnonymousClass7W1(Object obj) {
        this.A01 = obj;
        this.A00 = obj;
    }
}

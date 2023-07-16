package X;

import java.util.List;

/* renamed from: X.6rQ  reason: invalid class name and case insensitive filesystem */
public final class C113436rQ {
    public List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113436rQ)) {
            return false;
        }
        return C32572Cj.A00(this.A00, ((C113436rQ) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public C113436rQ(List list) {
        this.A00 = list;
    }
}

package X;

import java.util.List;

/* renamed from: X.3V3  reason: invalid class name */
public final class AnonymousClass3V3 {
    public List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass3V3) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3V3(List list) {
        this.A00 = list;
    }

    public AnonymousClass3V3() {
    }
}

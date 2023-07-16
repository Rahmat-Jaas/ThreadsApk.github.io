package X;

import java.util.List;

/* renamed from: X.6tB  reason: invalid class name and case insensitive filesystem */
public final class C114366tB {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114366tB) && C04220Ms.A0I(this.A00, ((C114366tB) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("BackupDataModel(entries="));
    }

    public C114366tB(List list) {
        this.A00 = list;
    }
}

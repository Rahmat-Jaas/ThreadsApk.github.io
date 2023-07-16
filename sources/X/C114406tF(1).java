package X;

import java.util.Map;

/* renamed from: X.6tF  reason: invalid class name and case insensitive filesystem */
public final class C114406tF {
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114406tF) && C04220Ms.A0I(this.A00, ((C114406tF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("BloksFunctionTable(entries="));
    }

    public C114406tF(Map map) {
        this.A00 = map;
    }
}

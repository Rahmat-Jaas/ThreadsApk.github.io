package X;

/* renamed from: X.08y  reason: invalid class name and case insensitive filesystem */
public final class C019208y {
    public final Class A00;
    public final Object A01;

    public final String toString() {
        String str;
        String str2;
        String str3;
        Class cls = this.A00;
        if (cls != null) {
            str = cls.getName();
        } else {
            str = null;
        }
        Object obj = this.A01;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = "<null>";
        }
        if (obj != null) {
            str3 = obj.getClass().getName();
        } else {
            str3 = "<unknown>";
        }
        return AnonymousClass00U.A0j("< SubType Instance cls: ", str, " parma val: ", str2, " [cls: ", str3, "] >");
    }

    public C019208y(Class cls, Object obj) {
        this.A00 = cls;
        this.A01 = obj;
    }
}

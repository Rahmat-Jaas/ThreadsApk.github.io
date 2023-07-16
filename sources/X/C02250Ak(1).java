package X;

import java.io.Serializable;

/* renamed from: X.0Ak  reason: invalid class name and case insensitive filesystem */
public class C02250Ak implements C05920Wy, Serializable {
    public final int arity;
    public final int flags;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C02250Ak)) {
            return false;
        }
        C02250Ak r4 = (C02250Ak) obj;
        return this.isTopLevel == r4.isTopLevel && this.arity == r4.arity && this.flags == r4.flags && C04220Ms.A0I(this.receiver, r4.receiver) && C04220Ms.A0I(this.owner, r4.owner) && this.name.equals(r4.name) && this.signature.equals(r4.signature);
    }

    public AnonymousClass0JU getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return new AnonymousClass0AE(cls);
        }
        return new C02230Ai(cls);
    }

    public int hashCode() {
        int i;
        Object obj = this.receiver;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        int hashCode = (((((i3 + i2) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        int i4 = 1237;
        if (this.isTopLevel) {
            i4 = 1231;
        }
        return ((((hashCode + i4) * 31) + this.arity) * 31) + this.flags;
    }

    public C02250Ak(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        return AnonymousClass0Ln.A00(this);
    }

    public C02250Ak(int i, Class cls, String str, String str2, int i2) {
        this(i, C02240Aj.NO_RECEIVER, cls, str, str2, i2);
    }
}

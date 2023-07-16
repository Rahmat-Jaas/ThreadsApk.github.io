package X;

/* renamed from: X.02F  reason: invalid class name */
public class AnonymousClass02F extends C02240Aj implements AnonymousClass0A8, C05920Wy {
    public final int arity;
    public final int flags;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass02F) {
                AnonymousClass02F r4 = (AnonymousClass02F) obj;
                if (!this.name.equals(r4.name) || !this.signature.equals(r4.signature) || this.flags != r4.flags || this.arity != r4.arity || !C04220Ms.A0I(this.receiver, r4.receiver) || !C04220Ms.A0I(getOwner(), r4.getOwner())) {
                    return false;
                }
            } else if (!(obj instanceof AnonymousClass0A8)) {
                return false;
            } else {
                AnonymousClass0WB r0 = this.reflected;
                if (r0 == null) {
                    r0 = this;
                    this.reflected = this;
                }
                return obj.equals(r0);
            }
        }
        return true;
    }

    public AnonymousClass02F(int i) {
        this(i, C02240Aj.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public String toString() {
        AnonymousClass0WB r0 = this.reflected;
        if (r0 == null) {
            r0 = this;
            this.reflected = this;
        }
        if (r0 != this) {
            return r0.toString();
        }
        String str = this.name;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AnonymousClass00U.A0V("function ", str, " (Kotlin reflection is not available)");
    }

    public AnonymousClass0WB computeReflected() {
        return this;
    }

    public int getArity() {
        return this.arity;
    }

    public AnonymousClass0A8 getReflected() {
        return (AnonymousClass0A8) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    public boolean isExternal() {
        return ((AnonymousClass0A8) super.getReflected()).isExternal();
    }

    public boolean isInfix() {
        return ((AnonymousClass0A8) super.getReflected()).isInfix();
    }

    public boolean isInline() {
        return ((AnonymousClass0A8) super.getReflected()).isInline();
    }

    public boolean isOperator() {
        return ((AnonymousClass0A8) super.getReflected()).isOperator();
    }

    public boolean isSuspend() {
        return ((AnonymousClass0A8) super.getReflected()).isSuspend();
    }

    public AnonymousClass02F(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass02F(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}

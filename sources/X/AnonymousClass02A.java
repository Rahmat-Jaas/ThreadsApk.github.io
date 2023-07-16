package X;

/* renamed from: X.02A  reason: invalid class name */
public abstract class AnonymousClass02A extends C02240Aj implements AnonymousClass0A5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass02A(Class cls, Object obj, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass02A) {
                C02240Aj r4 = (C02240Aj) obj;
                if (!getOwner().equals(r4.getOwner()) || !this.name.equals(r4.name) || !this.signature.equals(r4.signature) || !C04220Ms.A0I(this.receiver, r4.receiver)) {
                    return false;
                }
            } else if (!(obj instanceof AnonymousClass0A5)) {
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

    public final String toString() {
        AnonymousClass0WB r0 = this.reflected;
        if (r0 == null) {
            r0 = this;
            this.reflected = this;
        }
        if (r0 != this) {
            return r0.toString();
        }
        return AnonymousClass00U.A0V("property ", this.name, " (Kotlin reflection is not available)");
    }

    public final AnonymousClass0A5 A00() {
        return (AnonymousClass0A5) super.getReflected();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0WB getReflected() {
        return super.getReflected();
    }

    public final int hashCode() {
        return (((getOwner().hashCode() * 31) + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    public AnonymousClass02A() {
    }
}

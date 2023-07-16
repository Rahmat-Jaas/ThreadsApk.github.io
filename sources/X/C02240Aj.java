package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Aj  reason: invalid class name and case insensitive filesystem */
public abstract class C02240Aj implements AnonymousClass0WB, Serializable {
    public static final Object NO_RECEIVER = AnonymousClass0NC.A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient AnonymousClass0WB reflected;
    public final String signature;

    public C02240Aj(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    public abstract AnonymousClass0WB computeReflected();

    public AnonymousClass0WB compute() {
        AnonymousClass0WB r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
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

    public AnonymousClass0WB getReflected() {
        AnonymousClass0WB r0 = this.reflected;
        if (r0 == null) {
            r0 = this;
            this.reflected = this;
        }
        if (r0 != this) {
            return r0;
        }
        throw new C97376Bc();
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public List getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public List getParameters() {
        return getReflected().getParameters();
    }

    public AnonymousClass0AD getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C03230Ez getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public C02240Aj(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public C02240Aj() {
        this(NO_RECEIVER);
    }
}

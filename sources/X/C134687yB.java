package X;

import java.io.Serializable;

/* renamed from: X.7yB  reason: invalid class name and case insensitive filesystem */
public final class C134687yB implements Serializable {
    public int A00 = -1;
    public Object A01;
    public String A02;

    public C134687yB(Object obj, String str) {
        this.A01 = obj;
        if (str != null) {
            this.A02 = str;
            return;
        }
        throw C18210wN.A0W("Can not pass null fieldName");
    }

    public final String toString() {
        Class<?> cls;
        char c;
        StringBuilder A0r = C18200wM.A0r();
        Object obj = this.A01;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Package packageR = cls.getPackage();
        if (packageR != null) {
            A0r.append(packageR.getName());
            A0r.append('.');
        }
        A0r.append(cls.getSimpleName());
        A0r.append('[');
        String str = this.A02;
        if (str != null) {
            c = '\"';
            A0r.append('\"');
            A0r.append(str);
        } else {
            int i = this.A00;
            if (i >= 0) {
                A0r.append(i);
                return C86114wI.A0q(A0r, ']');
            }
            c = '?';
        }
        A0r.append(c);
        return C86114wI.A0q(A0r, ']');
    }

    public C134687yB(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }

    public C134687yB() {
    }
}

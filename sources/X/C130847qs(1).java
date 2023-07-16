package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.7qs  reason: invalid class name and case insensitive filesystem */
public final class C130847qs implements C147078nM {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final AnonymousClass6O8 A05;
    public final C130877qv A06 = new C130877qv();
    public final C110486ll A07;

    public final Integer Bhu() {
        C971067y r0;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((C971067y) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = AnonymousClass006.A0C;
            stack.pop();
            r0 = C971067y.ObjectReadName;
            stack.push(r0);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                stack.pop();
                stack.push(C971067y.ObjectReadName);
            } else if (ordinal == 3) {
                this.A00 = AnonymousClass006.A00;
                stack.pop();
                r0 = C971067y.ArrayReadValue;
                stack.push(r0);
            } else if (ordinal == 4) {
                this.A01 = null;
                if (it.hasNext()) {
                    this.A01 = it.next();
                } else {
                    this.A00 = AnonymousClass006.A01;
                    stack2.pop();
                    stack.pop();
                }
            }
            Object obj = this.A01;
            if (obj == null) {
                num = AnonymousClass006.A1L;
            } else if (obj instanceof Boolean) {
                num = AnonymousClass006.A1C;
            } else if (obj instanceof Number) {
                num = AnonymousClass006.A15;
            } else if (obj instanceof C105916eC) {
                num = AnonymousClass006.A0u;
            } else if (obj instanceof String) {
                num = AnonymousClass006.A0j;
            } else if (obj instanceof List) {
                stack2.push(C86144wL.A0y(obj));
                stack.push(C971067y.ArrayReadValue);
                num = AnonymousClass006.A00;
            } else if (obj instanceof Map) {
                stack2.push(AnonymousClass0wJ.A0z((Map) obj));
                stack.push(C971067y.ObjectReadName);
                num = AnonymousClass006.A0C;
            } else {
                throw C18180wK.A0a(AnonymousClass0wJ.A0t(C18170wI.A00(1468), obj));
            }
            this.A00 = num;
        } else {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                this.A02 = C18200wM.A0p(A0o);
                this.A01 = A0o.getValue();
                this.A00 = AnonymousClass006.A0Y;
                stack.pop();
                r0 = C971067y.ObjectReadValue;
                stack.push(r0);
            } else {
                this.A00 = AnonymousClass006.A0N;
                stack.pop();
                stack2.pop();
            }
        }
        return this.A00;
    }

    public final Object Acn() {
        return C60713Qf.A00((AnonymousClass601) this.A07, (String) this.A01);
    }

    public final String CWO() {
        return this.A02;
    }

    public final Integer CWR() {
        return this.A00;
    }

    public final C146328m3 CWS() {
        C130877qv r1 = this.A06;
        r1.A00 = this.A01;
        return r1;
    }

    public final void CuL() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass006.A00;
        if (num == num2 || num == AnonymousClass006.A0C) {
            int i = 1;
            while (true) {
                Integer Bhu = Bhu();
                if (Bhu == num2 || Bhu == AnonymousClass006.A0C) {
                    i++;
                } else if (Bhu == AnonymousClass006.A01 || Bhu == AnonymousClass006.A0N) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public C130847qs(AnonymousClass6O8 r4, C110486ll r5, Iterator it) {
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        this.A07 = r5;
        stack.add(it);
        stack2.add(C971067y.ReadObject);
        this.A05 = r4;
    }
}

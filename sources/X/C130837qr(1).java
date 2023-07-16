package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.7qr  reason: invalid class name and case insensitive filesystem */
public final class C130837qr implements C147078nM {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final MMo A05;
    public final C130867qu A06 = new C130867qu();

    public C130837qr(MMo mMo, Iterator it) {
        C04220Ms.A0B(it, 1);
        this.A05 = mMo;
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        stack.add(it);
        stack2.add(AnonymousClass68A.ReadObject);
    }

    public final Integer Bhu() {
        AnonymousClass68A r0;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        AnonymousClass68A r02 = (AnonymousClass68A) stack.peek();
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        if (r02 != null) {
            int ordinal = r02.ordinal();
            if (ordinal == 0) {
                this.A00 = AnonymousClass006.A0C;
                stack.pop();
                r0 = AnonymousClass68A.ObjectReadName;
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    stack.pop();
                    stack.push(AnonymousClass68A.ObjectReadName);
                } else if (ordinal == 3) {
                    this.A00 = AnonymousClass006.A00;
                    stack.pop();
                    r0 = AnonymousClass68A.ArrayReadValue;
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
                } else if (obj instanceof String) {
                    num = AnonymousClass006.A0j;
                } else if (obj instanceof List) {
                    stack2.push(C86144wL.A0y(obj));
                    stack.push(AnonymousClass68A.ArrayReadValue);
                    num = AnonymousClass006.A00;
                } else if (obj instanceof Map) {
                    stack2.push(AnonymousClass0wJ.A0z((Map) obj));
                    stack.push(AnonymousClass68A.ObjectReadName);
                    num = AnonymousClass006.A0C;
                } else {
                    throw C18180wK.A0a(AnonymousClass0wJ.A0t("unknown value type ", obj));
                }
                this.A00 = num;
            } else {
                this.A01 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    C04220Ms.A0C(next, "null cannot be cast to non-null type kotlin.collections.Map.Entry<*, *>");
                    Map.Entry entry = (Map.Entry) next;
                    String A0p = C18200wM.A0p(entry);
                    this.A02 = A0p;
                    if (A0p == null) {
                        C30967GcS.A02("bloks_null_name", "Field name should not be null");
                    }
                    this.A01 = entry.getValue();
                    this.A00 = AnonymousClass006.A0Y;
                    stack.pop();
                    r0 = AnonymousClass68A.ObjectReadValue;
                } else {
                    this.A00 = AnonymousClass006.A0N;
                    stack.pop();
                    stack2.pop();
                }
            }
            stack.push(r0);
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            return num2;
        }
        throw new IOException();
    }

    public final Object Acn() {
        return this.A05;
    }

    public final String CWO() {
        if (this.A02 == null) {
            C30967GcS.A02("bloks_null_name", "Field name should not be null");
        }
        return this.A02;
    }

    public final Integer CWR() {
        Integer num = this.A00;
        if (num != null) {
            return num;
        }
        throw new IOException();
    }

    public final C146328m3 CWS() {
        C130867qu r1 = this.A06;
        Object obj = this.A01;
        if (obj != null) {
            r1.A00 = obj;
            return r1;
        }
        throw new IOException();
    }

    public final void CuL() {
        Integer CWR = CWR();
        Integer num = AnonymousClass006.A00;
        if (CWR == num || CWR() == AnonymousClass006.A0C) {
            int i = 1;
            while (true) {
                Integer Bhu = Bhu();
                if (Bhu == num || Bhu == AnonymousClass006.A0C) {
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
}

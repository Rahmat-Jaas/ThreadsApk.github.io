package X;

import java.util.List;

/* renamed from: X.6rm  reason: invalid class name and case insensitive filesystem */
public final class C113596rm {
    public final Object A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final void A00(Object obj, String str) {
        List list = this.A01;
        C13320nQ.A01(str);
        String valueOf = String.valueOf(obj);
        StringBuilder A0s = C86114wI.A0s(str.length() + 1 + C86104wH.A0A(valueOf));
        A0s.append(str);
        A0s.append("=");
        list.add(C18180wK.A0i(valueOf, A0s));
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(100);
        A0s.append(C18210wN.A0e(this.A00));
        A0s.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0s.append(C18190wL.A0p(list, i));
            if (i < size - 1) {
                C86144wL.A1T(A0s);
            }
        }
        return C18190wL.A0o(A0s);
    }

    public /* synthetic */ C113596rm(Object obj) {
        this.A00 = obj;
    }
}

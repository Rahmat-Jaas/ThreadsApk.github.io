package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3aW  reason: invalid class name and case insensitive filesystem */
public final class C62683aW {
    public C27141s2 A00;
    public List A01 = AnonymousClass0wJ.A0v();
    public List A02 = AnonymousClass0wJ.A0v();
    public CopyOnWriteArrayList A03 = null;
    public CopyOnWriteArrayList A04 = null;
    public List A05;
    public List A06;
    public final Object A07 = new Object();

    public static void A00(C10300i6 r3, C62683aW r4, String str) {
        if (str != null) {
            H1T A0N = AnonymousClass0wJ.A0N(r3);
            A0N.A0J("fb/ig_user/");
            A0N.A0O("big_blue_token", str);
            C32165H8c A0T = C18180wK.A0T(A0N, AnonymousClass1SJ.class, C59883Mu.class);
            C63873iU.A0F(A0T, r4, r3, 27);
            C31155GhB.A03(A0T);
            return;
        }
        A01(r4);
    }

    public static void A01(C62683aW r3) {
        Iterator it;
        synchronized (r3.A07) {
            CopyOnWriteArrayList copyOnWriteArrayList = r3.A03;
            copyOnWriteArrayList.getClass();
            it = copyOnWriteArrayList.iterator();
            r3.A03.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
        C38040KHr.A01.CWx(new AnonymousClass45H((String) null));
    }

    public static void A02(C62683aW r3) {
        Iterator it;
        synchronized (r3.A07) {
            r3.A01 = AnonymousClass0wJ.A0v();
            CopyOnWriteArrayList copyOnWriteArrayList = r3.A04;
            copyOnWriteArrayList.getClass();
            it = copyOnWriteArrayList.iterator();
            r3.A04.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(List list, CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        String str;
        C566037v r0;
        synchronized (this.A07) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            List list2 = this.A02;
            A0v.addAll(list2);
            A0v2.addAll(list2);
            if (this.A00 != null) {
                AnonymousClass3AB r02 = AnonymousClass44X.A00().A01;
                if (r02 == null || (r0 = r02.A00) == null) {
                    str = null;
                } else {
                    str = r0.A01;
                }
                if (TextUtils.equals(str, this.A00.A02)) {
                    int indexOf = A0v.indexOf(this.A00);
                    if (indexOf >= 0) {
                        A0v.set(indexOf, this.A00);
                    } else {
                        A0v.add(this.A00);
                    }
                    A0v2.add(this.A00);
                }
            }
            for (C27131s1 r1 : this.A01) {
                if (A0v.indexOf(r1) < 0) {
                    A0v.add(r1);
                }
                A0v2.add(r1);
            }
            this.A06 = A0v;
            this.A05 = A0v2;
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.A04;
            if (!(copyOnWriteArrayList3 == null || !copyOnWriteArrayList3.isEmpty() || (copyOnWriteArrayList2 = this.A03) == null)) {
                copyOnWriteArrayList2.isEmpty();
            }
        }
        while (it.hasNext()) {
            it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}

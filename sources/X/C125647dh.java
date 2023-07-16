package X;

import com.facebook.redex.IDxCTaskShape424S0100000_2_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7dh  reason: invalid class name and case insensitive filesystem */
public final class C125647dh implements C143268gR {
    public final /* synthetic */ C114936uA A00;
    public final /* synthetic */ C143508gr A01;
    public final /* synthetic */ C145268kD A02;
    public final /* synthetic */ AnonymousClass7II A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C125647dh(C114936uA r1, C143508gr r2, C145268kD r3, AnonymousClass7II r4, String str, boolean z) {
        this.A03 = r4;
        this.A04 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        Boolean bool;
        List A0n;
        C114366tB A002;
        Object obj2;
        Object obj3;
        C107216gN r13 = (C107216gN) obj;
        byte[] bArr = null;
        if (r13 != null) {
            bool = Boolean.valueOf(r13.A00);
        } else {
            bool = null;
        }
        if (C18190wL.A1Z(bool, true)) {
            bArr = AnonymousClass7II.A02;
        } else if (r13 != null) {
            bArr = r13.A01;
        }
        AnonymousClass7II r7 = this.A03;
        String str = this.A04;
        C145268kD r2 = this.A02;
        byte[] CxB = this.A01.CxB();
        C04220Ms.A0B(str, 0);
        String id = r2.getId();
        C114646tf r10 = new C114646tf(id, CxB);
        C114636te r3 = new C114636te(str, C18180wK.A0n(r10));
        if (bArr == null || (A002 = AnonymousClass7BA.A00(bArr)) == null) {
            A0n = C18180wK.A0n(r3);
        } else {
            List list = A002.A00;
            Iterator it = list.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (C04220Ms.A0I(((C114636te) obj3).A00, str)) {
                    break;
                }
            }
            C114636te r4 = (C114636te) obj3;
            A0n = C18200wM.A0s(list);
            if (r4 == null) {
                A0n.add(r3);
            } else {
                List list2 = r4.A01;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C04220Ms.A0I(((C114646tf) next).A00, id)) {
                        obj2 = next;
                        break;
                    }
                }
                ArrayList A0s = C18200wM.A0s(list2);
                if (obj2 != null) {
                    A0s.remove(obj2);
                }
                A0s.add(r10);
                C114636te r0 = new C114636te(str, A0s);
                A0n.remove(r4);
                A0n.add(r0);
            }
        }
        byte[] A012 = AnonymousClass7BA.A01(new C114366tB(A0n));
        if (A012 == null) {
            this.A00.A02(new COV(C18180wK.A0a("can't serialize data for user")));
        } else {
            AnonymousClass7II.A02(r7, str, A012, this.A05).A01(new IDxCTaskShape424S0100000_2_I2(this.A00, 1));
        }
    }
}

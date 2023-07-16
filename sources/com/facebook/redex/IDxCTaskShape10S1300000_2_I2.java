package com.facebook.redex;

import X.AnonymousClass7BA;
import X.AnonymousClass7II;
import X.C04220Ms;
import X.C107216gN;
import X.C114366tB;
import X.C114636te;
import X.C114646tf;
import X.C114936uA;
import X.C143268gR;
import X.C145268kD;
import X.C18190wL;
import X.C18200wM;
import X.C91205fo;
import X.C91215fp;
import X.COU;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IDxCTaskShape10S1300000_2_I2 implements C143268gR {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCTaskShape10S1300000_2_I2(C114936uA r1, C145268kD r2, AnonymousClass7II r3, String str, int i) {
        this.A04 = i;
        if (i != 0) {
            this.A01 = r1;
            this.A02 = r3;
            this.A03 = str;
            this.A00 = r2;
        } else {
            this.A02 = r3;
            this.A03 = str;
            this.A00 = r2;
            this.A01 = r1;
        }
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C114936uA r2;
        Object obj2;
        Object obj3;
        Object obj4;
        byte[] bArr;
        C114366tB A002;
        Object obj5;
        switch (this.A04) {
            case 0:
                C107216gN r14 = (C107216gN) obj;
                Boolean bool = null;
                if (r14 != null) {
                    bArr = r14.A01;
                    bool = Boolean.valueOf(r14.A00);
                } else {
                    bArr = null;
                }
                AnonymousClass7II r6 = (AnonymousClass7II) this.A02;
                String str = this.A03;
                C145268kD r11 = (C145268kD) this.A00;
                if (!(bArr == null || (A002 = AnonymousClass7BA.A00(bArr)) == null)) {
                    List list = A002.A00;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj5 = it.next();
                            if (C04220Ms.A0I(((C114636te) obj5).A00, str)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    C114636te r9 = (C114636te) obj5;
                    if (r9 != null) {
                        List list2 = r9.A01;
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (C04220Ms.A0I(((C114646tf) next).A00, r11.getId())) {
                                    if (next != null) {
                                        ArrayList A0s = C18200wM.A0s(list2);
                                        ArrayList A0s2 = C18200wM.A0s(list);
                                        A0s.remove(next);
                                        C114636te r0 = new C114636te(str, A0s);
                                        A0s2.remove(r9);
                                        A0s2.add(r0);
                                        byte[] A012 = AnonymousClass7BA.A01(new C114366tB(A0s2));
                                        if (A012 != null) {
                                            if (C18190wL.A1Z(bool, true)) {
                                                str = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                                            }
                                            AnonymousClass7II.A02(r6, str, A012, false).A01(new IDxCTaskShape424S0100000_2_I2((C114936uA) this.A01, 2));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                r2 = (C114936uA) this.A01;
                obj2 = COU.A00;
                break;
            case 1:
                C107216gN r142 = (C107216gN) obj;
                if (r142 != null) {
                    byte[] bArr2 = r142.A01;
                    if (bArr2.length != 0) {
                        String str2 = this.A03;
                        C145268kD r4 = (C145268kD) this.A00;
                        C114366tB A003 = AnonymousClass7BA.A00(bArr2);
                        if (A003 != null) {
                            Iterator it3 = A003.A00.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj3 = it3.next();
                                    if (C04220Ms.A0I(((C114636te) obj3).A00, str2)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            C114636te r1 = (C114636te) obj3;
                            if (r1 != null) {
                                Iterator it4 = r1.A01.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj4 = it4.next();
                                        if (C04220Ms.A0I(((C114646tf) obj4).A00, r4.getId())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                C114646tf r22 = (C114646tf) obj4;
                                if (r22 != null) {
                                    byte[] bArr3 = r22.A01;
                                    r2 = (C114936uA) this.A01;
                                    obj2 = new C91205fo(bArr3);
                                    break;
                                }
                            }
                        }
                    }
                }
                r2 = (C114936uA) this.A01;
                obj2 = C91215fp.A00;
                break;
            default:
                return;
        }
        r2.A02(obj2);
    }
}

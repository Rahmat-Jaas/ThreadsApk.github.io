package com.facebook.redex;

import X.AnonymousClass74V;
import X.C04220Ms;
import X.C114936uA;
import X.C143268gR;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C18250wR;
import X.C81074n3;
import X.C91205fo;
import X.C98946Hn;
import X.COV;
import java.util.List;
import org.json.JSONException;

public class IDxCTaskShape424S0100000_2_I2 implements C143268gR {
    public Object A00;
    public final int A01;

    public IDxCTaskShape424S0100000_2_I2(C114936uA r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C114936uA r1;
        switch (this.A01) {
            case 0:
                C98946Hn r5 = (C98946Hn) obj;
                if (r5 instanceof C91205fo) {
                    List A07 = C81074n3.A07(new String(((C91205fo) r5).A00, AnonymousClass74V.A05), ";", 0);
                    if (A07.size() == 2) {
                        String A0p = C18190wL.A0p(A07, 1);
                        C04220Ms.A0B(A0p, 1);
                        try {
                            ((C114936uA) this.A00).A02(C18250wR.A0j(A0p));
                            return;
                        } catch (JSONException unused) {
                            ((C114936uA) this.A00).A02(C18230wP.A0y());
                            return;
                        }
                    }
                }
                ((C114936uA) this.A00).A02(C18230wP.A0y());
                return;
            case 1:
                r1 = (C114936uA) this.A00;
                if (obj == null) {
                    obj = new COV(C18180wK.A0a("can't backup data as no result return from SDK"));
                    break;
                }
                break;
            default:
                r1 = (C114936uA) this.A00;
                if (obj == null) {
                    obj = new COV(C18180wK.A0a("can't backup data as no result return from SDK"));
                    break;
                }
                break;
        }
        r1.A02(obj);
    }
}

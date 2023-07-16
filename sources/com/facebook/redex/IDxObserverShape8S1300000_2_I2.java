package com.facebook.redex;

import X.AnonymousClass2C6;
import X.AnonymousClass573;
import X.AnonymousClass6CA;
import X.AnonymousClass6CI;
import X.AnonymousClass7BD;
import X.AnonymousClass7EC;
import X.AnonymousClass7Kx;
import X.AnonymousClass8XT;
import X.C104906cZ;
import X.C107246gR;
import X.C108866j5;
import X.C121577Gw;
import X.C128157j3;
import X.C128877kW;
import X.C129017kq;
import X.C143158gC;
import X.C18240wQ;
import X.C86104wH;
import X.C86154wM;
import X.C880756q;
import X.C92885kB;
import X.C93015kU;
import X.M5J;
import android.util.SparseArray;
import androidx.core.app.ComponentActivity;
import com.facebook.graphql.impls.ShippingAddressResponseImpl;

public class IDxObserverShape8S1300000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxObserverShape8S1300000_2_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C129017kq r5;
        Throwable r0;
        String substring;
        switch (this.A04) {
            case 0:
                AnonymousClass7Kx r12 = (AnonymousClass7Kx) obj;
                if (AnonymousClass7Kx.A0O(r12) && !(r12.A02 instanceof C92885kB)) {
                    C18240wQ.A1G(this.A01);
                    String str = this.A03;
                    ComponentActivity componentActivity = (ComponentActivity) this.A00;
                    C107246gR r1 = (C107246gR) ((AnonymousClass573) this.A02).A01.remove(str);
                    if (r1 != null) {
                        r1.A01.A0B(componentActivity);
                        r1.A00.A0B(componentActivity);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass7Kx r122 = (AnonymousClass7Kx) obj;
                if (AnonymousClass7Kx.A0R(r122)) {
                    ShippingAddressResponseImpl shippingAddressResponseImpl = ((C104906cZ) AnonymousClass7Kx.A0D(r122)).A00;
                    if (shippingAddressResponseImpl == null || C86154wM.A0M(shippingAddressResponseImpl, ShippingAddressResponseImpl.Error.class) == null) {
                        C880756q r3 = (C880756q) this.A01;
                        if (AnonymousClass7Kx.A0R(C86104wH.A0R(r3))) {
                            C128157j3.A02(r3, (C128157j3) this.A02, (String) null, AnonymousClass7BD.A01(this.A03, ((C108866j5) AnonymousClass7Kx.A0D(C86104wH.A0R(r3))).A02, AnonymousClass8XT.A00));
                        }
                    }
                } else if (!AnonymousClass7Kx.A0O(r122)) {
                    return;
                }
                ((C880756q) this.A01).A0J((M5J) this.A00);
                return;
            case 2:
                C128877kW r6 = (C128877kW) this.A00;
                String str2 = this.A03;
                SparseArray sparseArray = (SparseArray) this.A01;
                r5 = (C129017kq) this.A02;
                AnonymousClass7Kx r123 = (AnonymousClass7Kx) obj;
                if (!AnonymousClass7Kx.A0R(r123)) {
                    r0 = new AnonymousClass6CA();
                    break;
                } else {
                    String str3 = (String) AnonymousClass7Kx.A0D(r123);
                    int A002 = AnonymousClass2C6.A00(str2);
                    String str4 = null;
                    if (A002 < 6) {
                        substring = null;
                    } else {
                        substring = str2.substring(0, 6);
                    }
                    if (A002 >= 4) {
                        str4 = str2.substring(A002 - 4);
                    }
                    C128877kW.A04(sparseArray, r5, r6, "$e2ee", str3, substring, str4);
                    return;
                }
            default:
                AnonymousClass7Kx r124 = (AnonymousClass7Kx) obj;
                if (AnonymousClass7Kx.A0O(r124)) {
                    r5 = (C129017kq) this.A01;
                    r0 = new AnonymousClass6CI((C121577Gw) this.A02);
                    break;
                } else if (AnonymousClass7Kx.A0R(r124)) {
                    C121577Gw.A02((C129017kq) this.A01, (C93015kU) this.A00, (C121577Gw) this.A02, this.A03, "$e2ee", (String) AnonymousClass7Kx.A0D(r124));
                    return;
                } else {
                    return;
                }
        }
        r5.A01(AnonymousClass7EC.A01(r0));
    }
}

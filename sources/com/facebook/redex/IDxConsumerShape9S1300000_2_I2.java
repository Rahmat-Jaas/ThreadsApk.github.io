package com.facebook.redex;

import X.AnonymousClass01V;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4VZ;
import X.AnonymousClass8s9;
import X.C04220Ms;
import X.C111886oa;
import X.C132057tF;
import X.C139798Pi;
import X.C142598fH;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C27420EnC;
import X.C40289Lbs;
import X.C82404pZ;
import X.E1T;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.Map;

public class IDxConsumerShape9S1300000_2_I2 implements C82404pZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxConsumerShape9S1300000_2_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A00 = obj3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        E1T e1t;
        String str;
        String str2;
        if (this.A04 != 0) {
            C111886oa r7 = (C111886oa) this.A02;
            String str3 = this.A03;
            boolean A1X = AnonymousClass0wJ.A1X(((C139798Pi) ((AnonymousClass0YY) this.A01)).invoke(obj));
            int hashCode = str3.hashCode();
            Iterator A0z = AnonymousClass0wJ.A0z((Map) ((AnonymousClass0YY) this.A00).invoke(obj));
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                r7.A00.markerAnnotate(20127312, hashCode, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            AnonymousClass01V r1 = r7.A00;
            short s = 3;
            if (A1X) {
                s = 2;
            }
            r1.markerEnd(20127312, hashCode, s);
            return;
        }
        C40289Lbs lbs = (C40289Lbs) obj;
        C132057tF r4 = (C132057tF) this.A02;
        boolean z = lbs.A01;
        boolean z2 = !z;
        r4.A03 = z2;
        if (z) {
            boolean A0I = C04220Ms.A0I(this.A03, "FETCH_PRICE");
            Map map = (Map) this.A01;
            if (A0I) {
                map.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ERROR_IN_FETCH");
                map.put("fetch_status_error_code", lbs.name());
                str = lbs.A00;
                str2 = "fetch_status_error_description";
            } else {
                map.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "PURCHASE_FAILURE");
                map.put("purchase_status_error_code", lbs.name());
                str = lbs.A00;
                str2 = "purchase_product_status_error_description";
            }
            map.put(str2, str);
        }
        AnonymousClass8s9 r12 = (AnonymousClass8s9) this.A00;
        if (((C27420EnC) r12)._state instanceof C142598fH) {
            if (z2) {
                e1t = r4.A01;
            } else if (!z2) {
                e1t = null;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            r12.resumeWith(e1t);
        }
    }
}

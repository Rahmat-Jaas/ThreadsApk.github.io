package com.facebook.redex;

import X.C122097Kc;
import X.C18200wM;
import X.C18220wO;
import X.C32572Cj;
import X.C41823MeE;
import X.C41836MeS;
import android.text.TextUtils;
import android.util.Pair;
import com.fbpay.w3c.CardDetails;
import java.util.Map;
import java.util.Set;

public class IDxPredicateShape352S0100000_2_I2 implements C41836MeS {
    public Object A00;
    public final int A01;

    public IDxPredicateShape352S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        boolean z;
        switch (this.A01) {
            case 0:
                Pair pair = (Pair) obj;
                if (!"ua-autofill-hints".equals(pair.first) || TextUtils.isEmpty((CharSequence) pair.second)) {
                    return false;
                }
                return ((Set) this.A00).contains(C122097Kc.A00.get(pair.second));
            case 1:
                CardDetails cardDetails = (CardDetails) obj;
                String str = cardDetails.A09;
                CardDetails cardDetails2 = (CardDetails) this.A00;
                if (C32572Cj.A00(str, cardDetails2.A09) && C32572Cj.A00(cardDetails.A03, cardDetails2.A03)) {
                    z = C32572Cj.A00(cardDetails.A02, cardDetails2.A02);
                    break;
                } else {
                    return false;
                }
                break;
            case 2:
                Set set = (Set) this.A00;
                String A0p = C18200wM.A0p((Map.Entry) obj);
                if (!C18220wO.A1S(A0p) && !"ent_id".equals(A0p) && !"last_used_time".equals(A0p)) {
                    z = C122097Kc.A08(A0p, set);
                    break;
                } else {
                    return true;
                }
                break;
            case 3:
                return C122097Kc.A08((String) obj, (Set) this.A00);
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || ((C41823MeE) this.A00).AEH(entry.getKey(), entry.getValue())) {
                    return false;
                }
                return true;
        }
        if (z) {
            return true;
        }
        return false;
    }
}

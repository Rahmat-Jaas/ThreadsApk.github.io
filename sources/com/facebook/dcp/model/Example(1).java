package com.facebook.dcp.model;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C86124wJ;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.redex.IDxComparatorShape95S0000000_2_I2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
public final class Example extends AnonymousClass0Sf {
    public static final Example A03 = new Example(ExampleContext.A05, HTTP.IDENTITY_CODING, AnonymousClass0wJ.A0y());
    public static final Companion Companion = new Companion();
    public final ExampleContext A00;
    public final String A01;
    public final HashMap A02;

    public final class Companion {
        public static final Map A00(List list) {
            C04220Ms.A0B(list, 0);
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Example example = (Example) it.next();
                String str = example.A01;
                Collection values = example.A02.values();
                C04220Ms.A06(values);
                A0y.put(str, AnonymousClass00J.A0W(values, new IDxComparatorShape95S0000000_2_I2(4)).toString());
            }
            return A0y;
        }

        public static final Map A01(List list) {
            C04220Ms.A0B(list, 0);
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Example example = (Example) it.next();
                String str = example.A01;
                ExampleContext exampleContext = example.A00;
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Set entrySet = exampleContext.A03.entrySet();
                ArrayList A0x = AnonymousClass0wJ.A0x(entrySet, 10);
                Iterator it2 = entrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(it2);
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append(C18200wM.A0p(A0o));
                    A0r.append(':');
                    A0r.append(C18190wL.A08(A0o.getValue()));
                    C18210wN.A1O(A0r, A0x);
                }
                A0v.addAll(AnonymousClass00J.A0M(A0x));
                Set entrySet2 = exampleContext.A02.entrySet();
                ArrayList A0x2 = AnonymousClass0wJ.A0x(entrySet2, 10);
                Iterator it3 = entrySet2.iterator();
                while (it3.hasNext()) {
                    Map.Entry A0o2 = C18180wK.A0o(it3);
                    StringBuilder A0r2 = C18200wM.A0r();
                    A0r2.append(C18200wM.A0p(A0o2));
                    A0r2.append(':');
                    A0r2.append(C86124wJ.A00(A0o2.getValue()));
                    C18210wN.A1O(A0r2, A0x2);
                }
                A0v.addAll(AnonymousClass00J.A0M(A0x2));
                Set entrySet3 = exampleContext.A04.entrySet();
                ArrayList A0x3 = AnonymousClass0wJ.A0x(entrySet3, 10);
                Iterator it4 = entrySet3.iterator();
                while (it4.hasNext()) {
                    Map.Entry A0o3 = C18180wK.A0o(it4);
                    A0x3.add(AnonymousClass00U.A0N(C18200wM.A0p(A0o3), C18230wP.A0u(A0o3), ':'));
                }
                A0v.addAll(AnonymousClass00J.A0M(A0x3));
                A0y.put(str, C18190wL.A0n(A0v));
            }
            return A0y;
        }

        public final AnonymousClass8sP serializer() {
            return Example$$serializer.INSTANCE;
        }
    }

    public Example(ExampleContext exampleContext, String str, HashMap hashMap) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = exampleContext;
        this.A02 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Example) {
                Example example = (Example) obj;
                if (!C04220Ms.A0I(this.A01, example.A01) || !C04220Ms.A0I(this.A00, example.A00) || !C04220Ms.A0I(this.A02, example.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A01)));
    }

    public /* synthetic */ Example(ExampleContext exampleContext, String str, HashMap hashMap, int i) {
        this.A01 = (i & 1) == 0 ? HTTP.IDENTITY_CODING : str;
        if ((i & 2) == 0) {
            this.A00 = ExampleContext.A05;
        } else {
            this.A00 = exampleContext;
        }
        if ((i & 4) == 0) {
            this.A02 = AnonymousClass0wJ.A0y();
        } else {
            this.A02 = hashMap;
        }
    }

    public Example() {
        this(ExampleContext.A05, HTTP.IDENTITY_CODING, AnonymousClass0wJ.A0y());
    }
}

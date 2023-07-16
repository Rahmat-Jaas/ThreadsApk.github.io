package X;

import android.os.Bundle;
import com.facebook.redex.IDxSequenceShape670S0100000_I2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape10S0300000_I2;

/* renamed from: X.6tX  reason: invalid class name and case insensitive filesystem */
public abstract class C114586tX {
    public boolean A00;
    public AnonymousClass7F7 A01;

    public void A01(AnonymousClass7F7 r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
        this.A00 = true;
    }

    public final AnonymousClass7F7 A00() {
        AnonymousClass7F7 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18180wK.A0a("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final void A02(C113926sO r9, AnonymousClass8dR r10, List list) {
        Object A04;
        String str;
        C124977cD r102;
        C112186p9 r2;
        if (this instanceof AnonymousClass59F) {
            C04220Ms.A0B(list, 0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A00().A06(C86154wM.A0J(it));
            }
        } else if (this instanceof AnonymousClass59E) {
            AnonymousClass59E r5 = (AnonymousClass59E) this;
            C04220Ms.A0B(list, 0);
            boolean z = true;
            if ((!((Collection) r5.A00().A04.getValue()).isEmpty()) && (r2 = r5.A02) != null) {
                r2.A00(((C123917Zx) AnonymousClass00J.A0E((List) r5.A00().A04.getValue())).A03, C86144wL.A08(r5.A00().A04.getValue()));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                r5.A00().A06(C86154wM.A0J(it2));
            }
            C147368pE.A04(r5.A01, false);
            C147368pE r1 = r5.A00;
            if (!(r10 instanceof C124977cD) || (r102 = (C124977cD) r10) == null || !r102.A00) {
                z = false;
            }
            C147368pE.A04(r1, z);
        } else if (this instanceof AnonymousClass59B) {
            C04220Ms.A0B(list, 0);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                A00().A05(C86154wM.A0J(it3));
            }
        } else if (this instanceof AnonymousClass59A) {
            C04220Ms.A0B(list, 0);
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                A00().A06(C86154wM.A0J(it4));
            }
        } else if (this instanceof AnonymousClass59C) {
            AnonymousClass59C r4 = (AnonymousClass59C) this;
            C04220Ms.A0B(list, 0);
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                C123917Zx A0J = C86154wM.A0J(it5);
                AnonymousClass593 r6 = (AnonymousClass593) A0J.A03;
                Bundle bundle = A0J.A06;
                int i = r6.A00;
                String str2 = r6.A02;
                if (i == 0) {
                    if (str2 == null) {
                        int i2 = r6.A00;
                        if (i2 != 0) {
                            str = String.valueOf(i2);
                        } else {
                            str = "the root navigation";
                        }
                        throw C18180wK.A0a(AnonymousClass00U.A0L("no start destination defined via app:startDestination for ", str));
                    }
                    A04 = r6.A03.A04(AnonymousClass00U.A0L("android-app://androidx.navigation/", str2).hashCode());
                } else {
                    if (str2 == null) {
                        A04 = r6.A03.A04(i);
                    }
                    A04 = r6.A03.A04(AnonymousClass00U.A0L("android-app://androidx.navigation/", str2).hashCode());
                }
                AnonymousClass7AO r3 = (AnonymousClass7AO) A04;
                if (r3 == null) {
                    String str3 = r6.A01;
                    if (str3 == null) {
                        str3 = r6.A02;
                        if (str3 == null) {
                            str3 = String.valueOf(r6.A00);
                        }
                        r6.A01 = str3;
                    }
                    C04220Ms.A0A(str3);
                    throw C18190wL.A0a(AnonymousClass00U.A0V("navigation destination ", str3, " is not a direct child of this NavGraph"));
                }
                r4.A00.A00(r3.A05).A02(r9, r10, C18180wK.A0n(r4.A00().A01(r3.A00(bundle), r3)));
            }
        } else {
            C04220Ms.A0B(list, 0);
            IDxSequenceShape670S0100000_I2 iDxSequenceShape670S0100000_I2 = new IDxSequenceShape670S0100000_I2(list, 1);
            KtLambdaShape10S0300000_I2 A0y = C86154wM.A0y(r9, this, r10, 21);
            AnonymousClass0wJ.A1N(iDxSequenceShape670S0100000_I2, A0y);
            Iterator it6 = AnonymousClass8bJ.A06(new C1371286f(A0y, iDxSequenceShape670S0100000_I2)).iterator();
            while (it6.hasNext()) {
                A00().A05(C86154wM.A0J(it6));
            }
        }
    }
}

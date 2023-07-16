package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass000;
import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass4VZ;
import X.AnonymousClass5IJ;
import X.AnonymousClass686;
import X.C04220Ms;
import X.C06750aI;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C86104wH;
import X.C86114wI;
import X.C970767v;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

public class KtCSuperShape0S0302000_I2 extends AnonymousClass0Sf {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 1;

    public KtCSuperShape0S0302000_I2(Rect rect, AnonymousClass686 r3, Integer num, int i, int i2) {
        C04220Ms.A0B(r3, 1);
        this.A04 = r3;
        this.A00 = i;
        this.A03 = rect;
        this.A01 = i2;
        this.A02 = num;
    }

    public final int A00() {
        int ordinal = ((C970767v) this.A03).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            int i = this.A00;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) this.A02) {
                AnonymousClass5IJ r1 = (AnonymousClass5IJ) next;
                if (r1.A04 && !r1.A05) {
                    A0v.add(next);
                }
            }
            return i - A0v.size();
        } else if (ordinal == 2 || ordinal == 3) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next2 : (Iterable) this.A04) {
                AnonymousClass5IJ r12 = (AnonymousClass5IJ) next2;
                if (r12.A04 && !r12.A05) {
                    A0v2.add(next2);
                }
            }
            return A0v2.size();
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public final int A01() {
        int ordinal = ((C970767v) this.A03).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            int i = this.A01;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) this.A02) {
                AnonymousClass5IJ r1 = (AnonymousClass5IJ) next;
                if (!r1.A04 || r1.A05) {
                    A0v.add(next);
                }
            }
            return i - A0v.size();
        } else if (ordinal == 2 || ordinal == 3) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next2 : (Iterable) this.A04) {
                AnonymousClass5IJ r12 = (AnonymousClass5IJ) next2;
                if (!r12.A04 || r12.A05) {
                    A0v2.add(next2);
                }
            }
            return A0v2.size();
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public final String A02() {
        String str;
        Rect rect = (Rect) this.A03;
        String A0L = AnonymousClass00U.A0L("bounds:", AnonymousClass00U.A0f("{l:", ", t:", ", r:", ", b:", '}', rect.left, rect.top, rect.right, rect.bottom));
        String A0J = AnonymousClass00U.A0J("visibility:", this.A01);
        Number number = (Number) this.A02;
        if (number != null) {
            str = AnonymousClass00U.A0J("lines:", number.intValue());
        } else {
            str = null;
        }
        List A17 = C06750aI.A17(A0L, A0J, str);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A17) {
            String str2 = (String) next;
            if (!(str2 == null || str2.length() == 0)) {
                A0v.add(next);
            }
        }
        return AnonymousClass00U.A0M("{", C18200wM.A0l(", ", A0v), '}');
    }

    public final String A03(Integer num) {
        AnonymousClass686 r2 = (AnonymousClass686) this.A04;
        int ordinal = r2.ordinal();
        if (ordinal == 0 || ordinal == 3 || ordinal == 4) {
            return C86114wI.A0o(r2.name());
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C86114wI.A0o(r2.name()));
        A0r.append('_');
        return C18200wM.A0m(num, A0r);
    }

    public final boolean equals(Object obj) {
        if (this.A05 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0302000_I2)) {
                return false;
            }
            KtCSuperShape0S0302000_I2 ktCSuperShape0S0302000_I2 = (KtCSuperShape0S0302000_I2) obj;
            if (ktCSuperShape0S0302000_I2.A05 == 1 && C04220Ms.A0I(this.A04, ktCSuperShape0S0302000_I2.A04) && C04220Ms.A0I(this.A02, ktCSuperShape0S0302000_I2.A02) && this.A03 == ktCSuperShape0S0302000_I2.A03 && this.A00 == ktCSuperShape0S0302000_I2.A00 && this.A01 == ktCSuperShape0S0302000_I2.A01) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0302000_I2)) {
                return false;
            }
            KtCSuperShape0S0302000_I2 ktCSuperShape0S0302000_I22 = (KtCSuperShape0S0302000_I2) obj;
            if (ktCSuperShape0S0302000_I22.A05 == 0 && this.A04 == ktCSuperShape0S0302000_I22.A04 && this.A00 == ktCSuperShape0S0302000_I22.A00 && C04220Ms.A0I(this.A03, ktCSuperShape0S0302000_I22.A03) && this.A01 == ktCSuperShape0S0302000_I22.A01 && C04220Ms.A0I(this.A02, ktCSuperShape0S0302000_I22.A02)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A052;
        int A032;
        int i = this.A05;
        Object obj = this.A04;
        if (i != 0) {
            A052 = (AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A02, C18210wN.A04(obj))) + this.A00) * 31;
            A032 = this.A01;
        } else {
            A052 = (AnonymousClass0wJ.A05(this.A03, (C18210wN.A04(obj) + this.A00) * 31) + this.A01) * 31;
            A032 = AnonymousClass0wJ.A03(this.A02);
        }
        return A052 + A032;
    }

    public final String toString() {
        if (this.A05 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("UiElementRenderingDebugInfo(uiElementType=");
        A0s.append(this.A04);
        A0s.append(", viewUniqueIdentifier=");
        A0s.append(this.A00);
        A0s.append(", rect=");
        A0s.append(this.A03);
        A0s.append(AnonymousClass000.A00(534));
        A0s.append(this.A01);
        A0s.append(", lines=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public KtCSuperShape0S0302000_I2(C970767v r2, List list, List list2, int i, int i2) {
        this.A04 = list;
        this.A02 = list2;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }
}

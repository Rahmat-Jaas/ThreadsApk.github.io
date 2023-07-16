package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.facebook.redex.IDxCListenerShape3S1300000_2_I2;

/* renamed from: X.6xz  reason: invalid class name and case insensitive filesystem */
public final class C117016xz {
    public static C114026sZ A01(Drawable drawable, AnonymousClass67N r15, AnonymousClass67N r16, C142188eA r17, C143708hB r18, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        IDxCListenerShape3S1300000_2_I2 iDxCListenerShape3S1300000_2_I2;
        C142188eA r5 = r17;
        C143708hB r3 = r18;
        IDxCListenerShape3S1300000_2_I2 iDxCListenerShape3S1300000_2_I22 = new IDxCListenerShape3S1300000_2_I2(r3, r15, r5, str4, 0);
        AnonymousClass67N r10 = r16;
        if (r16 != null) {
            iDxCListenerShape3S1300000_2_I2 = new IDxCListenerShape3S1300000_2_I2(r3, r10, r5, str6, 1);
        } else {
            iDxCListenerShape3S1300000_2_I2 = null;
        }
        C111306n7 r1 = new C111306n7();
        r1.A0I = str;
        r1.A0D = drawable;
        r1.A0F = str2;
        r1.A0H = str3;
        r1.A0B = iDxCListenerShape3S1300000_2_I22;
        r1.A0G = str5;
        r1.A09 = iDxCListenerShape3S1300000_2_I2;
        r1.A04 = i;
        r1.A01 = 0;
        Boolean bool2 = bool;
        r1.A0E = bool2;
        AnonymousClass3ZT.A02(bool2, "isCancelable");
        return new C114026sZ(r1);
    }

    public static C114026sZ A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i4);
        Integer valueOf4 = Integer.valueOf(i6);
        Integer valueOf5 = Integer.valueOf(i7);
        C111306n7 r1 = new C111306n7();
        r1.A06 = i3;
        r1.A04 = i5;
        r1.A0B = onClickListener;
        if (valueOf != null) {
            r1.A07 = valueOf.intValue();
        }
        if (valueOf2 != null) {
            r1.A00 = valueOf2.intValue();
        }
        if (valueOf3 != null) {
            r1.A02 = valueOf3.intValue();
        }
        if (valueOf4 != null) {
            r1.A01 = valueOf4.intValue();
        }
        if (valueOf5 != null) {
            r1.A05 = valueOf5.intValue();
        }
        r1.A09 = onClickListener2;
        return new C114026sZ(r1);
    }
}

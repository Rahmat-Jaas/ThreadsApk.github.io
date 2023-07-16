package X;

import android.view.View;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.4MC  reason: invalid class name */
public class AnonymousClass4MC implements C81724oG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View.OnClickListener A06;
    public View.OnLongClickListener A07;
    public CompoundButton.OnCheckedChangeListener A08;
    public C33516HpC A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public AnonymousClass4MC(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, int i2, boolean z) {
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A03 = 0;
        this.A04 = i;
        this.A01 = i2;
        this.A0C = z;
        this.A08 = onCheckedChangeListener;
        this.A09 = null;
    }

    public static AnonymousClass4MC A03(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, boolean z) {
        return new AnonymousClass4MC(onCheckedChangeListener, i, z);
    }

    public static AnonymousClass4MC A04(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Object obj, int i, int i2, boolean z) {
        return new AnonymousClass4MC(onCheckedChangeListener, (C33516HpC) new IDxTListenerShape295S0100000_1_I2(obj, i), i2, z);
    }

    public static AnonymousClass4MC A05(Object obj, int i, int i2, boolean z) {
        return new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new IDxCListenerShape267S0100000_1_I2(obj, i), i2, z);
    }

    public static void A06(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new AnonymousClass4MC(onCheckedChangeListener, charSequence, z));
    }

    public static void A07(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new AnonymousClass4MC(onCheckedChangeListener, i, z));
    }

    public static void A08(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, List list, int i, boolean z) {
        list.add(new AnonymousClass4MC(onCheckedChangeListener, i, z));
    }

    public AnonymousClass4MC(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, boolean z) {
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A03 = 0;
        this.A0B = charSequence;
        this.A0C = z;
        this.A08 = onCheckedChangeListener;
    }

    public AnonymousClass4MC(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A03 = 0;
        this.A0B = charSequence;
        this.A0A = charSequence2;
        this.A0C = z;
        this.A08 = onCheckedChangeListener;
    }

    public AnonymousClass4MC(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, C33516HpC hpC, int i, boolean z) {
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A03 = 0;
        this.A04 = i;
        this.A0C = z;
        this.A08 = onCheckedChangeListener;
        this.A09 = hpC;
    }

    public AnonymousClass4MC(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, boolean z) {
        this(onCheckedChangeListener, (C33516HpC) null, i, z);
    }
}

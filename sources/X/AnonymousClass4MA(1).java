package X;

import android.view.View;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.instagram.barcelona.R;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.4MA  reason: invalid class name */
public class AnonymousClass4MA implements C81714oF, C81724oG {
    public int A00;
    public int A01;
    public int A02;
    public View.OnClickListener A03;
    public View.OnLongClickListener A04;
    public CharSequence A05;
    public List A06;
    public boolean A07 = true;
    public boolean A08;
    public final int A09;

    public static AnonymousClass4MA A00(View.OnClickListener onClickListener, int i) {
        return new AnonymousClass4MA(onClickListener, i);
    }

    public static AnonymousClass4MA A01(View.OnClickListener onClickListener, CharSequence charSequence) {
        return new AnonymousClass4MA(charSequence, onClickListener);
    }

    public static void A02(View.OnClickListener onClickListener, CharSequence charSequence, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass4MA(charSequence, onClickListener));
    }

    public static void A03(View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass4MA(onClickListener, i));
    }

    public static void A04(Object obj, List list, int i, int i2) {
        list.add(new AnonymousClass4MA((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(obj, i), i2));
    }

    public AnonymousClass4MA(View.OnClickListener onClickListener, int i) {
        this.A02 = i;
        this.A03 = onClickListener;
        this.A09 = R.color.igds_primary_text;
    }

    public AnonymousClass4MA(View.OnClickListener onClickListener, int i, int i2) {
        this.A02 = i;
        this.A03 = onClickListener;
        this.A09 = i2;
    }

    public AnonymousClass4MA(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.A05 = charSequence;
        this.A03 = onClickListener;
        this.A09 = R.color.igds_primary_text;
    }

    public AnonymousClass4MA(CharSequence charSequence, int i) {
        this.A05 = charSequence;
        this.A09 = i;
    }
}

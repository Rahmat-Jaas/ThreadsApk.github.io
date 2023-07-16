package X;

import android.widget.RadioGroup;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public final class C61353Sw {
    public String A00;
    public boolean A01 = true;
    public final RadioGroup.OnCheckedChangeListener A02;
    public final List A03;

    public static void A00(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, String str, AbstractCollection abstractCollection, List list) {
        abstractCollection.add(new C61353Sw(onCheckedChangeListener, str, list));
    }

    public C61353Sw(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, String str, List list) {
        this.A03 = list;
        this.A00 = str;
        this.A02 = onCheckedChangeListener;
    }
}

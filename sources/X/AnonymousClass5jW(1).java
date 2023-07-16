package X;

import android.view.View;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.facebook.redex.IDxCListenerShape71S0200000_2_I2;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5jW  reason: invalid class name */
public final class AnonymousClass5jW extends C108896j8 {
    public int A00;
    public int A01;
    public int A02;
    public View.OnClickListener A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;

    public AnonymousClass5jW() {
        super(3);
    }

    public static C92675jd A00(AnonymousClass5jW r2, Integer num, Object obj, int i) {
        r2.A03 = new IDxCListenerShape203S0100000_2_I2(obj, i);
        C107316gY r1 = new C107316gY();
        r1.A00 = num;
        r2.A02 = new C107326gZ(r1);
        return new C92675jd(r2);
    }

    public static void A01(TreeJNI treeJNI, AnonymousClass5jW r2, ImmutableList.Builder builder, Object obj, int i) {
        r2.A03 = new IDxCListenerShape71S0200000_2_I2(i, obj, treeJNI);
        r2.A00 = 2131827283;
        r2.A06 = !treeJNI.getBooleanValue("is_default");
        C107316gY r1 = new C107316gY();
        r1.A00 = AnonymousClass006.A01;
        r2.A02 = new C107326gZ(r1);
        builder.add((Object) new C92675jd(r2));
    }
}

package X;

import android.view.View;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5jb  reason: invalid class name and case insensitive filesystem */
public final class C92655jb extends C108906j9 {
    public final int A00;
    public final View.OnClickListener A01;
    public final String A02;

    public static void A00(AnonymousClass5jU r1, ImmutableList.Builder builder, Object obj, int i) {
        r1.A01 = new IDxCListenerShape203S0100000_2_I2(obj, i);
        builder.add((Object) new C92655jb(r1));
    }

    public C92655jb(AnonymousClass5jU r2) {
        super(r2);
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }
}

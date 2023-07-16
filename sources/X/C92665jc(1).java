package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5jc  reason: invalid class name and case insensitive filesystem */
public final class C92665jc extends C108906j9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final View.OnClickListener A03;
    public final String A04;

    public static void A00(AnonymousClass5jV r1, ImmutableList.Builder builder, int i) {
        r1.A02 = i;
        builder.add((Object) new C92665jc(r1));
    }

    public C92665jc(AnonymousClass5jV r2) {
        super(r2);
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A01 = r2.A01;
    }
}

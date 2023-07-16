package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.3Xg  reason: invalid class name and case insensitive filesystem */
public class C62133Xg {
    public float A00 = 1.0f;
    public int A01;
    public int A02 = -1;
    public View.OnClickListener A03;
    public CharSequence A04;
    public CharSequence A05;
    public List A06;

    public C62133Xg(View.OnClickListener onClickListener, int i) {
        this.A01 = i;
        this.A03 = onClickListener;
    }

    public static void A00(Context context, C62133Xg r1, List list, int i) {
        r1.A02 = context.getColor(i);
        list.add(r1);
    }

    public C62133Xg(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.A05 = charSequence;
        this.A03 = onClickListener;
    }
}

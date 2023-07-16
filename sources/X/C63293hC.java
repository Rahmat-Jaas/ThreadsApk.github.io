package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.3hC  reason: invalid class name and case insensitive filesystem */
public final class C63293hC {
    public int A00;
    public int A01;
    public int A02;
    public View.OnClickListener A03;
    public CharSequence A04;
    public boolean A05;
    public SpannableStringBuilder A06;
    public final int A07;

    public static void A02(CharSequence charSequence, AbstractCollection abstractCollection) {
        abstractCollection.add(new C63293hC(charSequence));
    }

    public final void A03(TextView textView) {
        CharSequence charSequence = this.A04;
        if (charSequence == null && (charSequence = this.A06) == null) {
            textView.setText(this.A07);
        } else {
            textView.setText(charSequence);
        }
        int i = this.A00;
        if (i != 0) {
            textView.setTextAppearance(textView.getContext(), i);
        }
        int i2 = this.A01;
        if (i2 != 0) {
            int A042 = C18240wQ.A04(textView, i2);
            textView.setPadding(A042, A042, A042, A042);
        }
        int i3 = this.A02;
        if (i3 != 0) {
            C09860go.A0X(textView, C18240wQ.A04(textView, i3));
        }
    }

    public C63293hC(SpannableStringBuilder spannableStringBuilder) {
        this.A04 = null;
        this.A06 = spannableStringBuilder;
        this.A07 = 0;
    }

    public static void A00(Fragment fragment, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C63293hC((CharSequence) fragment.getString(i)));
    }

    public static void A01(Fragment fragment, List list, int i) {
        list.add(new C63293hC((CharSequence) fragment.getString(i)));
    }

    public C63293hC(CharSequence charSequence) {
        this.A04 = charSequence;
        this.A06 = null;
        this.A07 = 0;
    }

    public C63293hC(int i) {
        this.A04 = null;
        this.A06 = null;
        this.A07 = i;
    }
}

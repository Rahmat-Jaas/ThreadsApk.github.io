package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.3hu  reason: invalid class name and case insensitive filesystem */
public final class C63613hu {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public View.OnClickListener A06;
    public View.OnClickListener A07;
    public ImageUrl A08;
    public ImageUrl A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    public static void A00(C63613hu r2) {
        r2.A02 = -1;
        r2.A0F = true;
        r2.A0H = false;
        r2.A0G = true;
        r2.A03 = 0;
        r2.A07 = null;
    }

    public final void A06(TextView textView, TextView textView2, TextView textView3) {
        if (textView != null && (!TextUtils.isEmpty(this.A0A) || this.A02 != -1)) {
            CharSequence charSequence = this.A0A;
            if (charSequence == null || charSequence.toString().isEmpty()) {
                int i = this.A02;
                if (i != 0) {
                    textView.setText(i);
                }
            } else {
                textView.setText(this.A0A);
            }
            textView.setVisibility(0);
        }
        if (textView2 != null) {
            CharSequence charSequence2 = this.A0C;
            if (C18210wN.A1U(charSequence2)) {
                textView2.setText(charSequence2);
                textView2.setVisibility(0);
                if (textView != null && textView.getVisibility() == 8) {
                    C09860go.A0X(textView2, 0);
                }
            }
        }
        if (textView3 != null) {
            CharSequence charSequence3 = this.A0B;
            if (C18210wN.A1U(charSequence3)) {
                textView3.setText(charSequence3);
                textView3.setVisibility(0);
            }
        }
    }

    public static void A01(CharSequence charSequence, AbstractCollection abstractCollection) {
        abstractCollection.add(new C63613hu(charSequence));
    }

    public static void A02(CharSequence charSequence, List list) {
        list.add(new C63613hu(charSequence));
    }

    public static void A03(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C63613hu(i));
    }

    public static void A04(List list, int i) {
        list.add(new C63613hu(i));
    }

    public C63613hu(int i) {
        A00(this);
        this.A02 = i;
    }

    public final String A05() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A02);
        A0r.append("::");
        return C18200wM.A0m(this.A0A, A0r);
    }

    public C63613hu(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        A00(this);
        this.A0A = charSequence;
        this.A0C = charSequence2;
        this.A0B = charSequence3;
    }

    public C63613hu(CharSequence charSequence, CharSequence charSequence2) {
        A00(this);
        this.A0A = charSequence;
        this.A0C = charSequence2;
    }

    public C63613hu(CharSequence charSequence) {
        A00(this);
        this.A0A = charSequence;
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.barcelona.R;

/* renamed from: X.10v  reason: invalid class name and case insensitive filesystem */
public final class C196310v extends I7V {
    public final C82994qc A00;

    public C196310v(C82994qc r2) {
        super((JWT) AnonymousClass10r.A00);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass138 r7 = (AnonymousClass138) m5o;
        C04220Ms.A0B(r7, 0);
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2 = (KtCSuperShape0S0110000_I2) getItem(i);
        Context A0B = C18240wQ.A0B(r7);
        AnonymousClass19W r2 = (AnonymousClass19W) ktCSuperShape0S0110000_I2.A00;
        String A0k = AnonymousClass0wJ.A0k(A0B, r2.A01);
        r7.A01.setText(A0k);
        String A0k2 = AnonymousClass0wJ.A0k(A0B, r2.A00);
        boolean equals = A0k.equals(A0k2);
        int i2 = 8;
        TextView textView = r7.A02;
        if (equals) {
            textView.setVisibility(8);
        } else {
            textView.setText(A0k2);
            textView.setVisibility(0);
        }
        AnonymousClass0wJ.A18(r7.itemView, HttpStatus.SC_NO_CONTENT, this, ktCSuperShape0S0110000_I2);
        View view = r7.A00;
        if (ktCSuperShape0S0110000_I2.A01) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public final long getItemId(int i) {
        int A03 = C14030oh.A03(34516534);
        long j = (long) ((AnonymousClass19W) ((KtCSuperShape0S0110000_I2) getItem(i)).A00).A00;
        C14030oh.A0A(-1423356075, A03);
        return j;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass138(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.language_locale_item, C18200wM.A1Y(viewGroup)));
    }
}

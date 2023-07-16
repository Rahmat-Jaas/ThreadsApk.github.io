package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2;

/* renamed from: X.3ty  reason: invalid class name and case insensitive filesystem */
public final class C65633ty implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ KtCSuperShape0S0120000_I2 A01;
    public final /* synthetic */ String A02;

    public C65633ty(TextView textView, KtCSuperShape0S0120000_I2 ktCSuperShape0S0120000_I2, String str) {
        this.A00 = textView;
        this.A02 = str;
        this.A01 = ktCSuperShape0S0120000_I2;
    }

    public final boolean onPreDraw() {
        int i;
        TextView textView = this.A00;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        String str = this.A02;
        KtCSuperShape0S0120000_I2 ktCSuperShape0S0120000_I2 = this.A01;
        boolean z = ktCSuperShape0S0120000_I2.A01;
        boolean z2 = ktCSuperShape0S0120000_I2.A02;
        C04220Ms.A0B(str, 1);
        Context A0A = C18190wL.A0A(textView);
        Drawable A002 = C59633Lp.A00(A0A, z2);
        float A03 = C09860go.A03(A0A, 4);
        if (A002 != null) {
            i = A002.getIntrinsicWidth();
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        textView.getPaint().getTextBounds(str, 0, AnonymousClass0hA.A01(str), rect);
        CharSequence charSequence = str;
        if (z) {
            float f = (float) i;
            charSequence = str;
            if (((float) rect.width()) + A03 + f > ((float) textView.getWidth())) {
                CharSequence ellipsize = TextUtils.ellipsize(str, textView.getPaint(), (((float) textView.getWidth()) - A03) - f, TextUtils.TruncateAt.END, false, (TextUtils.EllipsizeCallback) null);
                C04220Ms.A06(ellipsize);
                charSequence = ellipsize;
            }
        }
        textView.setText(C59633Lp.A01(textView, charSequence.toString(), z2));
        return true;
    }
}

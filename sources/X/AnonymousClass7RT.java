package X;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.IDxDListenerShape160S0200000_2_I2;
import com.instagram.common.bloks.component.textinput.BloksEditText;

/* renamed from: X.7RT  reason: invalid class name */
public final class AnonymousClass7RT implements View.OnFocusChangeListener {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;
    public final C111326n9 A02;
    public final C109326jp A03;
    public final C109326jp A04;

    public final void onFocusChange(View view, boolean z) {
        C109326jp r3;
        Editable text;
        BloksEditText bloksEditText = (BloksEditText) view;
        TextUtils.TruncateAt ellipsize = bloksEditText.getEllipsize();
        if (z) {
            if (ellipsize != null) {
                C121887Iq.A00((TextUtils.TruncateAt) null, bloksEditText, this.A02);
                bloksEditText.getExtendedPaddingTop();
                bloksEditText.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape160S0200000_2_I2(0, bloksEditText, this));
            }
            r3 = this.A03;
        } else {
            if (ellipsize == null && C121887Iq.A05(bloksEditText) && (text = bloksEditText.getText()) != null) {
                Rect A0D = C86134wK.A0D();
                bloksEditText.getPaint().getTextBounds(text.toString(), 0, text.length(), A0D);
                if (A0D.width() > (bloksEditText.getWidth() - bloksEditText.getPaddingLeft()) - bloksEditText.getPaddingRight()) {
                    C121887Iq.A00(TextUtils.TruncateAt.END, bloksEditText, this.A02);
                }
            }
            r3 = this.A04;
        }
        if (r3 != null) {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            C127397h3 r1 = this.A01;
            A002.A02(r1, 0);
            AnonymousClass3HX r0 = this.A00;
            A002.A02(r0, 1);
            C122047Jt.A07(r0, r1, A002, r3);
        }
    }

    public AnonymousClass7RT(AnonymousClass3HX r2, C127397h3 r3, C109326jp r4, C109326jp r5) {
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = (C111326n9) AnonymousClass7K7.A03(r2, r3);
    }
}

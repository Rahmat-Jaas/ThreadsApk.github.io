package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import com.instagram.common.bloks.component.textinput.BloksEditText;

/* renamed from: X.7Iq  reason: invalid class name and case insensitive filesystem */
public final class C121887Iq {
    public static boolean A04(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145;
    }

    public static void A00(TextUtils.TruncateAt truncateAt, BloksEditText bloksEditText, C111326n9 r4) {
        KeyListener keyListener;
        if (r4 != null && bloksEditText.getEllipsize() != truncateAt) {
            if (truncateAt == null) {
                if (r4.A0E != bloksEditText.getKeyListener()) {
                    keyListener = r4.A0E;
                }
                r4.A0C = truncateAt;
                bloksEditText.setEllipsize(truncateAt);
            }
            r4.A0E = bloksEditText.getKeyListener();
            keyListener = null;
            bloksEditText.setKeyListener(keyListener);
            r4.A0C = truncateAt;
            bloksEditText.setEllipsize(truncateAt);
        }
    }

    public static void A01(AnonymousClass3HX r3, C127397h3 r4, BloksEditText bloksEditText, C111326n9 r6) {
        Drawable.ConstantState constantState;
        if (r4 != null) {
            Drawable textCursorDrawable = bloksEditText.getTextCursorDrawable();
            r6.A09 = textCursorDrawable;
            if (textCursorDrawable != null && (constantState = textCursorDrawable.getConstantState()) != null) {
                Drawable newDrawable = constantState.newDrawable();
                C86154wM.A1B(PorterDuff.Mode.SRC_OVER, newDrawable, C101086Pv.A00(r3, r4, 0));
                bloksEditText.setTextCursorDrawable(newDrawable);
            }
        }
    }

    public static void A02(BloksEditText bloksEditText, C111326n9 r2) {
        Drawable drawable = r2.A09;
        if (drawable != null) {
            bloksEditText.setTextCursorDrawable(drawable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.instagram.common.bloks.component.textinput.BloksEditText r3, X.C111326n9 r4, int r5) {
        /*
            boolean r0 = A04(r5)
            if (r0 != 0) goto L_0x0010
            if (r4 == 0) goto L_0x001f
            int r0 = r4.A04
            boolean r0 = A04(r0)
            if (r0 == 0) goto L_0x001f
        L_0x0010:
            r3.setInputType(r5)
            r0 = 0
            A00(r0, r3, r4)
            if (r4 == 0) goto L_0x001e
            r0 = 0
            r4.A0H = r0
        L_0x001c:
            r4.A04 = r5
        L_0x001e:
            return
        L_0x001f:
            r2 = 131087(0x2000f, float:1.83692E-40)
            r0 = r5 & r2
            r1 = 131073(0x20001, float:1.83672E-40)
            if (r0 == r1) goto L_0x0030
            if (r4 == 0) goto L_0x0046
            int r0 = r4.A04
            r0 = r0 & r2
            if (r0 != r1) goto L_0x0046
        L_0x0030:
            if (r5 != 0) goto L_0x0042
            r0 = 0
            r3.setRawInputType(r0)
        L_0x0036:
            android.view.inputmethod.InputMethodManager r0 = X.C86134wK.A0F(r3)
            if (r0 == 0) goto L_0x003f
            r0.restartInput(r3)
        L_0x003f:
            if (r4 == 0) goto L_0x001e
            goto L_0x001c
        L_0x0042:
            r3.setInputType(r5)
            goto L_0x003f
        L_0x0046:
            r3.setRawInputType(r5)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121887Iq.A03(com.instagram.common.bloks.component.textinput.BloksEditText, X.6n9, int):void");
    }

    public static boolean A05(BloksEditText bloksEditText) {
        Editable text = bloksEditText.getText();
        if (text == null || text.length() == 0 || bloksEditText.getWidth() == 0 || bloksEditText.getLineCount() > 1 || (bloksEditText.getInputType() & 131087) == 131073 || A04(bloksEditText.getInputType())) {
            return false;
        }
        return true;
    }
}

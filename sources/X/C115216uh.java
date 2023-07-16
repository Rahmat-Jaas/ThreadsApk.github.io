package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Arrays;

/* renamed from: X.6uh  reason: invalid class name and case insensitive filesystem */
public final class C115216uh {
    public final PrecomputedText.Params A00;
    public final int A01;
    public final int A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r2.getTypeface() != null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r6) goto L_0x0093
            boolean r0 = r7 instanceof X.C115216uh
            r4 = 0
            if (r0 == 0) goto L_0x007c
            X.6uh r7 = (X.C115216uh) r7
            int r1 = r6.A01
            int r0 = r7.A01
            if (r1 != r0) goto L_0x007c
            int r1 = r6.A02
            int r0 = r7.A02
            if (r1 != r0) goto L_0x007c
            android.text.TextPaint r3 = r6.A04
            float r1 = r3.getTextSize()
            android.text.TextPaint r2 = r7.A04
            float r0 = r2.getTextSize()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            float r1 = r3.getTextScaleX()
            float r0 = r2.getTextScaleX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            float r1 = r3.getTextSkewX()
            float r0 = r2.getTextSkewX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            float r1 = r3.getLetterSpacing()
            float r0 = r2.getLetterSpacing()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            java.lang.String r1 = r3.getFontFeatureSettings()
            java.lang.String r0 = r2.getFontFeatureSettings()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x007c
            int r1 = r3.getFlags()
            int r0 = r2.getFlags()
            if (r1 != r0) goto L_0x007c
            android.os.LocaleList r1 = r3.getTextLocales()
            android.os.LocaleList r0 = r2.getTextLocales()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
            android.graphics.Typeface r0 = r3.getTypeface()
            if (r0 != 0) goto L_0x007d
            android.graphics.Typeface r0 = r2.getTypeface()
            if (r0 == 0) goto L_0x008c
        L_0x007c:
            return r4
        L_0x007d:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r0 = r2.getTypeface()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008c
            return r4
        L_0x008c:
            android.text.TextDirectionHeuristic r1 = r6.A03
            android.text.TextDirectionHeuristic r0 = r7.A03
            if (r1 == r0) goto L_0x0093
            return r4
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115216uh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextPaint textPaint = this.A04;
        return Arrays.hashCode(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("{");
        TextPaint textPaint = this.A04;
        A0s.append(AnonymousClass00U.A0I("textSize=", textPaint.getTextSize()));
        A0s.append(AnonymousClass00U.A0I(", textScaleX=", textPaint.getTextScaleX()));
        A0s.append(AnonymousClass00U.A0I(", textSkewX=", textPaint.getTextSkewX()));
        A0s.append(AnonymousClass00U.A0I(", letterSpacing=", textPaint.getLetterSpacing()));
        A0s.append(AnonymousClass00U.A0o(", elegantTextHeight=", textPaint.isElegantTextHeight()));
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(", textLocale=");
        A0s.append(C18200wM.A0m(textPaint.getTextLocales(), A0r));
        A0s.append(C18200wM.A0m(textPaint.getTypeface(), C18190wL.A0s(", typeface=")));
        A0s.append(AnonymousClass00U.A0L(", variationSettings=", textPaint.getFontVariationSettings()));
        A0s.append(C18200wM.A0m(this.A03, C18190wL.A0s(", textDir=")));
        A0s.append(AnonymousClass00U.A0J(", breakStrategy=", this.A01));
        A0s.append(AnonymousClass00U.A0J(", hyphenationFrequency=", this.A02));
        return C18180wK.A0i("}", A0s);
    }

    public C115216uh(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A01 = params.getBreakStrategy();
        this.A02 = params.getHyphenationFrequency();
        this.A00 = Build.VERSION.SDK_INT < 29 ? null : params;
    }
}

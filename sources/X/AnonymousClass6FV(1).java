package X;

import android.view.inputmethod.ExtractedText;

/* renamed from: X.6FV  reason: invalid class name */
public final class AnonymousClass6FV {
    public static final ExtractedText A00(AnonymousClass7HD r5) {
        ExtractedText extractedText = new ExtractedText();
        String str = r5.A01.A00;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = r5.A00;
        extractedText.selectionStart = C121767Ia.A01(j);
        extractedText.selectionEnd = C121767Ia.A00(j);
        extractedText.flags = C04220Ms.A0B(str, 0) ^ true ? 1 : 0;
        return extractedText;
    }
}

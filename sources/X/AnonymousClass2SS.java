package X;

import android.os.Bundle;

/* renamed from: X.2SS  reason: invalid class name */
public final class AnonymousClass2SS {
    public static AnonymousClass1bD A00(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        AnonymousClass1bD r3 = new AnonymousClass1bD();
        Bundle A06 = C18180wK.A06();
        A06.putInt("EXTRA_TITLE_STRING_RES_ID", i6);
        A06.putInt("EXTRA_SUBTITLE_STRING_RES_ID", i5);
        A06.putInt("EXTRA_HINT_STRING_RES_ID", i);
        A06.putString("EXTRA_CONTENT", str);
        if (i4 == -1) {
            i4 = 2131831737;
        }
        A06.putInt("EXTRA_PROGRESS_BUTTON_LABEL_STRING_RES_ID", i4);
        A06.putInt("EXTRA_INPUT_MAX_LINES", i3);
        A06.putInt("EXTRA_INPUT_MAX_CHARACTERS", 150);
        A06.putInt("EXTRA_INPUT_IME_ACTION", i2);
        r3.setArguments(A06);
        return r3;
    }
}

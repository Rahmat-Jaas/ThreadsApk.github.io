package X;

import android.graphics.RectF;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.util.List;

/* renamed from: X.70b  reason: invalid class name and case insensitive filesystem */
public final class C1182670b {
    public static final RectF A00(String str) {
        List A0e;
        if (str == null || (A0e = AnonymousClass8bP.A0e(str, new char[]{BasicHeaderValueParser.ELEM_DELIMITER}, 0)) == null) {
            return null;
        }
        return C86104wH.A0E(A0e);
    }

    public static final String A01(RectF rectF) {
        return C86124wJ.A0s(rectF, C18200wM.A0r());
    }
}

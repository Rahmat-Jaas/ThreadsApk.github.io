package X;

import android.graphics.RectF;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.util.List;

/* renamed from: X.711  reason: invalid class name */
public final class AnonymousClass711 {
    public static final RectF A00(String str) {
        List A0e;
        if (str == null || (A0e = AnonymousClass8bP.A0e(str, new char[]{BasicHeaderValueParser.ELEM_DELIMITER}, 0)) == null) {
            return null;
        }
        return C86104wH.A0E(A0e);
    }

    public static final String A01(RectF rectF) {
        if (rectF != null) {
            return C86124wJ.A0s(rectF, C18200wM.A0r());
        }
        return null;
    }
}

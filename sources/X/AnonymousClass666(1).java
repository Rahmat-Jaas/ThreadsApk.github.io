package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.666  reason: invalid class name */
public final class AnonymousClass666 extends IOException {
    public final String A00;

    public AnonymousClass666(AnonymousClass3Ud r3, String str) {
        super(StringFormatUtil.formatStrLocaleSafe("Expected 'Content-Type: %s' but got '%s'", "application/json", r3));
        this.A00 = str;
    }
}

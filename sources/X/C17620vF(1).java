package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0vF  reason: invalid class name and case insensitive filesystem */
public final class C17620vF {
    public final List A00 = Collections.synchronizedList(new ArrayList());

    public final void A00(Context context, String str, String str2) {
        for (C17620vF A002 : this.A00) {
            A002.A00(context, str, str2);
        }
    }

    public final void A01(Context context, String str, String str2, String str3, String str4) {
        for (C17620vF A01 : this.A00) {
            A01.A01(context, str, str2, str3, str4);
        }
    }
}

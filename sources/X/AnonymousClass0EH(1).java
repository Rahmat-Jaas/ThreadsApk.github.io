package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0EH  reason: invalid class name */
public final class AnonymousClass0EH {
    public final List A00 = Collections.synchronizedList(new ArrayList());

    public final void A00(Intent intent, String str, String str2, String str3) {
        for (AnonymousClass0EH A002 : this.A00) {
            A002.A00(intent, str, str2, str3);
        }
    }
}

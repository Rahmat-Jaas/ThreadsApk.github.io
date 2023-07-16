package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.0hH  reason: invalid class name */
public final class AnonymousClass0hH {
    public static final Bundle A00(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras;
        }
        StringBuilder sb = new StringBuilder("Intent extras must be set for ");
        sb.append(intent);
        throw new IllegalStateException(sb.toString());
    }
}

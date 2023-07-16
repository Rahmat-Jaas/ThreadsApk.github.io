package X;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* renamed from: X.07i  reason: invalid class name and case insensitive filesystem */
public final class C015707i extends AnonymousClass00X {
    public final /* bridge */ /* synthetic */ Intent A02(Context context, Object obj) {
        Intent intent = (Intent) obj;
        C04220Ms.A0B(intent, 1);
        return intent;
    }

    public final /* bridge */ /* synthetic */ Object A04(Intent intent, int i) {
        return new ActivityResult(i, intent);
    }
}

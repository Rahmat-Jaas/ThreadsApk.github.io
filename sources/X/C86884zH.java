package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.4zH  reason: invalid class name and case insensitive filesystem */
public final class C86884zH extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        C04220Ms.A0B(obj, 1);
        this.A00.A02.remove(obj);
    }

    public C86884zH(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }
}

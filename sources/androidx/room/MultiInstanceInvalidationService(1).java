package androidx.room;

import X.C18220wO;
import X.C86884zH;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.Map;

public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final RemoteCallbackList A01 = new C86884zH(this);
    public final Map A02 = C18220wO.A0y();
    public final IMultiInstanceInvalidationService.Stub A03 = new MultiInstanceInvalidationService$binder$1(this);

    public final IBinder onBind(Intent intent) {
        return this.A03;
    }
}

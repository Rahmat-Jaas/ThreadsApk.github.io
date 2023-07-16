package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.5pv  reason: invalid class name */
public final class AnonymousClass5pv extends C86854zE {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            try {
                ((C143758hG) pair.first).CH9((C82014ow) pair.second);
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            StringBuilder A0s = C86114wI.A0s(45);
            A0s.append("Don't know how to handle message: ");
            A0s.append(i);
            Log.wtf("BasePendingResult", A0s.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).A08(Status.A0A);
        }
    }

    public AnonymousClass5pv(Looper looper) {
        super(looper);
    }

    public AnonymousClass5pv() {
        super(Looper.getMainLooper());
    }
}

package kotlinx.coroutines.android;

import X.C141458be;
import X.C141478bg;
import X.C146048lX;
import X.C18180wK;
import X.C18210wN;
import X.C86154wM;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

public final class AndroidDispatcherFactory implements C146048lX {
    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public C141478bg createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            Object A0Z = C86154wM.A0Z(mainLooper, (Object) null, Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}));
            if (A0Z != null) {
                return new C141458be((Handler) A0Z, (String) null, false);
            }
            throw C18210wN.A0W("null cannot be cast to non-null type android.os.Handler");
        }
        throw C18180wK.A0a("The main looper is not available");
    }
}

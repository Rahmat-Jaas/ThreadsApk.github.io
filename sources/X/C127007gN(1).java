package X;

import com.facebook.papaya.client.ICallback;
import java.util.Map;

/* renamed from: X.7gN  reason: invalid class name and case insensitive filesystem */
public final class C127007gN implements ICallback {
    public ICallback A00;

    public final synchronized void onExecutorComplete(String str, Map map) {
        ICallback iCallback = this.A00;
        if (iCallback != null) {
            iCallback.onExecutorComplete(str, map);
        }
    }
}

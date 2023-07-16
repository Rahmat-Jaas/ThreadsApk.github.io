package X;

import com.facebook.papaya.client.ICallback;
import java.util.Map;

/* renamed from: X.7gO  reason: invalid class name and case insensitive filesystem */
public final class C127017gO implements ICallback {
    public final /* synthetic */ C146428mE A00;
    public final /* synthetic */ C127057gS A01;

    public C127017gO(C146428mE r1, C127057gS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onExecutorComplete(String str, Map map) {
        C04220Ms.A0B(str, 0);
        for (C146148lj r1 : this.A01.A02) {
            if (str.equals(r1.getName())) {
                r1.BTd();
            }
        }
    }
}

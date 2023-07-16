package X;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: X.3zU  reason: invalid class name and case insensitive filesystem */
public final class C67403zU implements C143278gS {
    public final ComponentName A00;
    public final String A01;
    public final Messenger A02;

    public final void Ba8(int i) {
        Messenger messenger = this.A02;
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        Bundle A06 = C18180wK.A06();
        A06.putString("tag", this.A01);
        A06.putParcelable("component", this.A00);
        obtain.setData(A06);
        messenger.send(obtain);
    }

    public C67403zU(ComponentName componentName, Messenger messenger, String str) {
        this.A02 = messenger;
        this.A01 = str;
        this.A00 = componentName;
    }
}

package X;

import android.graphics.Picture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import java.lang.ref.WeakReference;

/* renamed from: X.4z7  reason: invalid class name */
public final class AnonymousClass4z7 extends Handler {
    public final Picture A00;

    public final void handleMessage(Message message) {
        Picture picture = this.A00;
        if (picture != null) {
            try {
                int i = message.what;
                if (i == 0) {
                    Layout layout = (Layout) ((WeakReference) message.obj).get();
                    if (layout != null) {
                        layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
                        picture.endRecording();
                    }
                } else if (i == 1) {
                    ((WeakReference) message.obj).get();
                }
            } catch (Exception unused) {
            }
        }
    }

    public AnonymousClass4z7(Looper looper) {
        super(looper);
        Picture picture;
        try {
            picture = new Picture();
        } catch (RuntimeException unused) {
            picture = null;
        }
        this.A00 = picture;
    }
}

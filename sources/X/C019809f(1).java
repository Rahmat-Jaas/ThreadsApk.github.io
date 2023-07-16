package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.File;
import java.util.Properties;

/* renamed from: X.09f  reason: invalid class name and case insensitive filesystem */
public final class C019809f {
    public char A00 = '!';
    public final Handler A01;
    public final File A02;
    public final Properties A03 = new Properties();

    public final synchronized char A00(String str) {
        char c;
        synchronized (this) {
            Properties properties = this.A03;
            String property = properties.getProperty(str);
            if (TextUtils.isEmpty(property)) {
                char c2 = this.A00;
                if (c2 == '~') {
                    c = '!';
                } else {
                    char c3 = (char) (c2 + 1);
                    this.A00 = c3;
                    properties.setProperty(str, Character.toString(c3));
                    this.A01.post(new C019709e(this));
                    c = this.A00;
                }
            } else {
                c = property.charAt(0);
            }
        }
        return c;
    }

    public C019809f(File file) {
        this.A02 = file;
        HandlerThread handlerThread = new HandlerThread("ForegroundEntityMapper");
        C13820oM.A00(handlerThread);
        handlerThread.start();
        this.A01 = new Handler(handlerThread.getLooper());
    }
}

package X;

import android.app.Application;
import java.util.concurrent.Callable;

/* renamed from: X.0dX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08490dX implements Callable {
    public final /* synthetic */ Application A00;

    public /* synthetic */ C08490dX(Application application) {
        this.A00 = application;
    }

    public final Object call() {
        return this.A00.getDir("errorreporting", 0);
    }
}

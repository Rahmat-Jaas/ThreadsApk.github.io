package X;

import java.io.File;

/* renamed from: X.81O  reason: invalid class name */
public final class AnonymousClass81O implements Runnable {
    public final /* synthetic */ FOV A00;
    public final /* synthetic */ File A01;

    public AnonymousClass81O(FOV fov, File file) {
        this.A00 = fov;
        this.A01 = file;
    }

    public final void run() {
        FOV.A00(this.A00, this.A01, "image");
    }
}

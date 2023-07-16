package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

/* renamed from: X.7MD  reason: invalid class name */
public final class AnonymousClass7MD implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ C90725dz A00;

    public AnonymousClass7MD(C90725dz r1) {
        this.A00 = r1;
    }

    public final void onScanCompleted(String str, Uri uri) {
        C145858lE r2 = this.A00.A02;
        if (uri != null) {
            r2.resolve(uri.toString());
        } else {
            r2.reject(CameraRollManager.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
        }
    }
}

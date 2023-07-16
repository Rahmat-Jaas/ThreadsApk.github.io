package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.model.creation.MediaCaptureConfig;

/* renamed from: X.4tU  reason: invalid class name and case insensitive filesystem */
public interface C84584tU {
    void CH2(Bundle bundle);

    void Cuz(C170769vX r1, C28923FeI feI);

    void Cv0(C170769vX r1, MediaCaptureConfig mediaCaptureConfig, C28923FeI feI);

    void CvB(Uri uri, String str, int i, int i2);

    void Cvr(C170769vX r1, MediaCaptureConfig mediaCaptureConfig, C28923FeI feI);

    void Cvt(C170769vX r1, MediaCaptureConfig mediaCaptureConfig, C28923FeI feI);

    void onActivityResult(int i, int i2, Intent intent);

    void onSaveInstanceState(Bundle bundle);
}

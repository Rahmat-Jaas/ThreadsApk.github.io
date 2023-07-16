package X;

import com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider;
import java.io.File;

/* renamed from: X.7dV  reason: invalid class name and case insensitive filesystem */
public final class C125557dV implements SlamLibraryProvider {
    public String getLibraryPath() {
        C15020qa.A0A("slam-native");
        try {
            File A01 = C15020qa.A01("slam-native");
            A01.getAbsolutePath();
            String absolutePath = A01.getAbsolutePath();
            C04220Ms.A06(absolutePath);
            return absolutePath;
        } catch (Exception e) {
            AnonymousClass0LU.A0E("SLAMManager", "Fail to unpack SLAM library", e);
            return "";
        }
    }
}

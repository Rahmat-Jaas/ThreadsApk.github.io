package com.facebook.avatar.autogen.download;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass6CQ;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C12560m7;
import X.C130037nv;
import X.C18240wQ;
import X.C28979FfK;
import X.C30954Gc6;
import X.C36813Jf5;
import X.C37200JmN;
import X.C86124wJ;
import X.C97356Ba;
import X.GP0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.models.IgModelLoader;
import com.facebook.redex.IDxCCallbackShape584S0100000_2_I2;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class IgModelDownloader implements FaceTrackerModelsProvider {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(91);
    public final C10300i6 A00;

    public IgModelDownloader(C10300i6 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeValue(this.A00);
    }

    public final Map AwI(Context context) {
        SettableFuture settableFuture = new SettableFuture();
        C10300i6 r7 = this.A00;
        UserSession A02 = C05030Qo.A02(r7);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.PYTORCH});
        Integer num = AnonymousClass006.A01;
        C37200JmN.A00().A02(A02, new C36813Jf5((C12560m7) null, new IDxCCallbackShape584S0100000_2_I2(settableFuture, 0), num, A0v));
        IgModelLoader A002 = GP0.A00(r7);
        if (A002 != null) {
            C97356Ba r8 = C97356Ba.A01;
            HashMap A0y = AnonymousClass0wJ.A0y();
            CountDownLatch countDownLatch = new CountDownLatch(3);
            C30954Gc6.A03(new C130037nv("FaceDetectorWithBundledImage", "bc_face_detector", A0y, countDownLatch), A002.load("face_detection_autogen_frame_selection", 4), r8);
            C30954Gc6.A03(new C130037nv("E2eLandmarksModel", "bc_landmarks_detector", A0y, countDownLatch), A002.load("face_landmarks_autogen_frame_selection", 5), r8);
            C30954Gc6.A03(new C130037nv("ModelWithOptimizedSize", "blur_model", A0y, countDownLatch), A002.load("blur_autogen_frame_selection", 3), r8);
            countDownLatch.await();
            if (A0y.size() >= 3) {
                return A0y;
            }
            throw new AnonymousClass6CQ("Failed to download autogen models");
        }
        throw new AnonymousClass6CQ("modelLoader not available");
    }
}

package com.facebook.smartcapture.ig.logging;

import X.AnonymousClass0RA;
import X.C04220Ms;
import X.C10300i6;
import X.C18180wK;
import X.C31874Gxw;
import X.C86144wL;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;

public final class IgSmartCaptureLoggerProvider implements Parcelable, SmartCaptureLoggerProvider {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(15);
    public final C10300i6 A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00.getToken());
    }

    public final SmartCaptureLogger get(Context context) {
        return new C31874Gxw(this.A00);
    }

    public IgSmartCaptureLoggerProvider(Parcel parcel) {
        String readString = parcel.readString();
        Bundle A06 = C18180wK.A06();
        A06.putString("IgSessionManager.SESSION_TOKEN_KEY", readString);
        this.A00 = AnonymousClass0RA.A0C.A02(A06);
    }

    public IgSmartCaptureLoggerProvider(C10300i6 r1) {
        this.A00 = r1;
    }
}

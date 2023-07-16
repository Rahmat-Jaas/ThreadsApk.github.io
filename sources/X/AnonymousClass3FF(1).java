package X;

import android.net.Uri;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.3FF  reason: invalid class name */
public final class AnonymousClass3FF {
    public final int A00;
    public final Uri A01;
    public final Integer A02;

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("Asset{mId=");
        A0s.append(this.A00);
        A0s.append(", mType=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "VIDEO";
                    break;
                case 2:
                    str = "IMAGE_AS_VIDEO";
                    break;
                default:
                    str = "AUDIO";
                    break;
            }
        } else {
            str = "null";
        }
        A0s.append(str);
        A0s.append(", mUri=");
        A0s.append(this.A01);
        return C18190wL.A0o(A0s);
    }

    public AnonymousClass3FF(JSONObject jSONObject) {
        String str;
        this.A00 = jSONObject.getInt("id");
        String string = jSONObject.getString("type");
        C04220Ms.A06(string);
        for (Integer num : C18240wQ.A1Z()) {
            switch (num.intValue()) {
                case 1:
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                    break;
                case 2:
                    str = "image";
                    break;
                default:
                    str = MediaStreamTrack.AUDIO_TRACK_KIND;
                    break;
            }
            if (C04220Ms.A0I(str, string)) {
                this.A02 = num;
                this.A01 = C18210wN.A0A(jSONObject.getString("uri"));
                return;
            }
        }
        throw C18250wR.A0V(AnonymousClass00U.A0L("unknown asset type ", string));
    }
}

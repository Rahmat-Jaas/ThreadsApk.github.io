package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.3Uy  reason: invalid class name and case insensitive filesystem */
public final class C61703Uy {
    public static final AtomicInteger A0E = new AtomicInteger(0);
    public Integer A00;
    public final double A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final AnonymousClass3FF A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public C61703Uy(Map map, JSONObject jSONObject) {
        String str;
        Integer num;
        String str2;
        this.A02 = jSONObject.getInt("id");
        Object A0f = C18200wM.A0f(map, jSONObject.getInt("asset"));
        if (A0f != null) {
            AnonymousClass3FF r8 = (AnonymousClass3FF) A0f;
            this.A08 = r8;
            String path = r8.A01.getPath();
            if (path != null) {
                this.A0C = path;
                double A002 = AnonymousClass2C9.A00(TraceFieldType.StartTime, jSONObject);
                double A003 = AnonymousClass2C9.A00("end_time", jSONObject);
                long min = (long) Math.min(A002, A003);
                this.A07 = min;
                long max = (long) Math.max(A002, A003);
                this.A05 = max;
                if (min <= max) {
                    double A004 = AnonymousClass2C9.A00("asset_start_time", jSONObject);
                    double A005 = AnonymousClass2C9.A00("asset_end_time", jSONObject);
                    long min2 = (long) Math.min(A004, A005);
                    this.A04 = min2;
                    long max2 = (long) Math.max(A004, A005);
                    this.A03 = max2;
                    if (min2 <= max2) {
                        this.A01 = jSONObject.getDouble("speed");
                        this.A06 = (long) AnonymousClass2C9.A00(C28174Ezk.A00(221), jSONObject);
                        String str3 = null;
                        if (jSONObject.has("curve_arg")) {
                            str = jSONObject.getString("curve_arg");
                        } else {
                            str = null;
                        }
                        this.A0A = str;
                        this.A0B = jSONObject.has("curve_type") ? jSONObject.getString("curve_type") : str3;
                        this.A0D = jSONObject.optBoolean("is_muted", true);
                        String optString = jSONObject.optString("asset_type");
                        C04220Ms.A06(optString);
                        Integer num2 = r8.A02;
                        Integer[] A1Z = C18240wQ.A1Z();
                        int length = A1Z.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A1Z[i];
                                switch (num.intValue()) {
                                    case 1:
                                        str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                                        break;
                                    case 2:
                                        str2 = "image";
                                        break;
                                    default:
                                        str2 = MediaStreamTrack.AUDIO_TRACK_KIND;
                                        break;
                                }
                                if (!C04220Ms.A0I(str2, optString)) {
                                    i++;
                                }
                            } else {
                                num = num2;
                            }
                        }
                        this.A09 = num;
                        return;
                    }
                    throw C18180wK.A0a("Check failed.");
                }
                throw C18180wK.A0a("Check failed.");
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Clip{mId=");
        A0s.append(this.A02);
        A0s.append(", mAsset=");
        A0s.append(this.A08);
        A0s.append(", mAssetStartTimeUs=");
        A0s.append(this.A04);
        A0s.append(", mAssetEndTimeUs=");
        A0s.append(this.A03);
        A0s.append(", mStartTimeUs=");
        A0s.append(this.A07);
        A0s.append(", mEndTimeUs=");
        A0s.append(this.A05);
        A0s.append(", mSpeed=");
        A0s.append(this.A01);
        A0s.append(", mCurveArg=");
        A0s.append(this.A0A);
        A0s.append(", mCurveType=");
        A0s.append(this.A0B);
        A0s.append(", mIsMuted=");
        A0s.append(this.A0D);
        return C18190wL.A0o(A0s);
    }
}

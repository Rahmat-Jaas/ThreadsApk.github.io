package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3G4  reason: invalid class name */
public final class AnonymousClass3G4 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03 = AnonymousClass0wJ.A0v();
    public final boolean A04;
    public final String A05;
    public final String A06;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Graph{mInputClips=");
        A0s.append(this.A03);
        A0s.append(", mId=");
        A0s.append(this.A00);
        A0s.append(", mIsAREngine=");
        A0s.append(this.A04);
        A0s.append(", mAREngineAssetsUri='");
        A0s.append(this.A05);
        A0s.append("', mAREngineMetadataJson='");
        A0s.append(this.A06);
        A0s.append("', mStartTimeUs=");
        A0s.append(this.A02);
        A0s.append(", mEndTimeUs=");
        A0s.append(this.A01);
        return C18190wL.A0o(A0s);
    }

    public AnonymousClass3G4(Map map, JSONObject jSONObject) {
        this.A00 = jSONObject.getInt("id");
        this.A04 = jSONObject.getBoolean("is_ar_engine");
        String string = jSONObject.getString("ar_engine_assets_uri");
        C04220Ms.A06(string);
        this.A05 = string;
        String string2 = jSONObject.getString("ar_engine_metadata_json");
        C04220Ms.A06(string2);
        this.A06 = string2;
        JSONArray jSONArray = jSONObject.getJSONArray("input_clips");
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = jSONArray.getInt(i);
            List list = this.A03;
            Object A0f = C18200wM.A0f(map, i2);
            if (A0f != null) {
                list.add(A0f);
                i++;
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        this.A02 = (long) AnonymousClass2C9.A00(TraceFieldType.StartTime, jSONObject);
        this.A01 = (long) AnonymousClass2C9.A00("end_time", jSONObject);
    }
}

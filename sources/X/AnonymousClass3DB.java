package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.3DB  reason: invalid class name */
public final class AnonymousClass3DB {
    public final List A00 = AnonymousClass0wJ.A0v();
    public final List A01 = AnonymousClass0wJ.A0v();
    public final List A02 = AnonymousClass0wJ.A0v();
    public final List A03 = AnonymousClass0wJ.A0v();
    public final Map A04 = AnonymousClass0wJ.A0y();
    public final Map A05 = AnonymousClass0wJ.A0y();
    public final Map A06 = AnonymousClass0wJ.A0y();
    public final Map A07 = AnonymousClass0wJ.A0y();
    public final Map A08 = AnonymousClass0wJ.A0y();

    public AnonymousClass3DB(JSONObject jSONObject) {
        Throwable A0b;
        JSONObject jSONObject2 = jSONObject;
        C04220Ms.A0B(jSONObject2, 1);
        try {
            JSONArray jSONArray = jSONObject2.getJSONArray("assets");
            C04220Ms.A06(jSONArray);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                C04220Ms.A06(jSONObject3);
                AnonymousClass3FF r2 = new AnonymousClass3FF(jSONObject3);
                C18250wR.A1F(r2, this.A04, r2.A00);
            }
            JSONArray jSONArray2 = jSONObject2.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND).getJSONArray("clips");
            C04220Ms.A06(jSONArray2);
            HashMap A0y = AnonymousClass0wJ.A0y();
            int length2 = jSONArray2.length();
            int i2 = 0;
            int i3 = 0;
            while (i2 < length2) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                C04220Ms.A06(jSONObject4);
                C61703Uy r22 = new C61703Uy(this.A04, jSONObject4);
                this.A02.add(r22);
                if (!r22.A0D && r22.A01 == 1.0d) {
                    List list = this.A01;
                    List list2 = this.A00;
                    list.add(Integer.valueOf(list2.size()));
                    list2.add(r22);
                    C18250wR.A1F(r22, this.A05, r22.A02);
                }
                AnonymousClass3FF r1 = r22.A08;
                String path = r1.A01.getPath();
                if (path != null) {
                    if (path.length() != 0) {
                        String str = r22.A0C;
                        Integer num = (Integer) A0y.get(str);
                        if (num == null) {
                            num = Integer.valueOf(i3);
                            i3++;
                            A0y.put(str, num);
                        }
                        int intValue = r1.A02.intValue();
                        if (!(intValue == 1 || intValue == 2)) {
                            if (intValue != 0) {
                                A0b = C18190wL.A0a("unknown asset type");
                            } else if (num != null) {
                                A0b = C18190wL.A0a("set glInputIndex to null for audio clips");
                            }
                        }
                        r22.A00 = num;
                    }
                    C18250wR.A1F(r22, this.A08, r22.A02);
                    i2++;
                } else {
                    A0b = AnonymousClass0wJ.A0b();
                }
                throw A0b;
            }
            JSONArray jSONArray3 = jSONObject2.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND).getJSONArray("graphs");
            C04220Ms.A06(jSONArray3);
            int length3 = jSONArray3.length();
            for (int i4 = 0; i4 < length3; i4++) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i4);
                C04220Ms.A06(jSONObject5);
                AnonymousClass3G4 r3 = new AnonymousClass3G4(this.A08, jSONObject5);
                Map map = this.A07;
                Integer valueOf = Integer.valueOf(r3.A00);
                map.put(valueOf, r3);
                this.A03.add(valueOf);
            }
            JSONArray jSONArray4 = jSONObject2.getJSONObject(MediaStreamTrack.AUDIO_TRACK_KIND).getJSONArray("clips");
            C04220Ms.A06(jSONArray4);
            int length4 = jSONArray4.length();
            for (int i5 = 0; i5 < length4; i5++) {
                JSONObject jSONObject6 = jSONArray4.getJSONObject(i5);
                C04220Ms.A06(jSONObject6);
                C61703Uy r23 = new C61703Uy(this.A04, jSONObject6);
                this.A00.add(r23);
                C18250wR.A1F(r23, this.A05, r23.A02);
            }
            if (jSONObject2.has("clip_durations")) {
                JSONObject jSONObject7 = jSONObject2.getJSONObject("clip_durations");
                C04220Ms.A06(jSONObject7);
                Iterator<String> keys = jSONObject7.keys();
                while (keys.hasNext()) {
                    String A0k = C18180wK.A0k(keys);
                    Map map2 = this.A06;
                    C04220Ms.A04(A0k);
                    map2.put(AnonymousClass0wJ.A0d(A0k), Double.valueOf(jSONObject7.getDouble(A0k)));
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}

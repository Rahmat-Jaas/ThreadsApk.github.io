package X;

import android.database.Cursor;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4VF  reason: invalid class name */
public final class AnonymousClass4VF implements C84424t7 {
    public final AnonymousClass3HZ D7b(Cursor cursor, AnonymousClass24G r11) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A0j = C18250wR.A0j(string);
            JSONObject jSONObject = A0j.getJSONObject("profile");
            return new AnonymousClass3HZ(jSONObject.getString(FXPFAccessLibraryDebugFragment.UID), A0j.getString("access_token"), "FACEBOOK", new AnonymousClass4W6(this, jSONObject), C311624m.FACEBOOK_LITE, r11);
        } catch (JSONException e) {
            throw new C73914Va((Throwable) e);
        }
    }

    public final AnonymousClass3VA D7Z(Cursor cursor) {
        String str;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A0j = C18250wR.A0j(string);
            JSONObject jSONObject = A0j.getJSONObject("profile");
            String string2 = jSONObject.getString(FXPFAccessLibraryDebugFragment.UID);
            String string3 = jSONObject.getString(FXPFAccessLibraryDebugFragment.NAME);
            if (jSONObject.has("profile_pic_url")) {
                str = jSONObject.getString("profile_pic_url");
            } else {
                str = "";
            }
            return new AnonymousClass3VA(A0j.getString("access_token"), new AnonymousClass3VD(string2, string3, str));
        } catch (JSONException e) {
            throw new C73914Va((Throwable) e);
        }
    }

    public final AnonymousClass3HZ D7a(Cursor cursor, C311624m r4, AnonymousClass24G r5) {
        throw new C73914Va("LiteProvider not used in Facebook Lite.");
    }

    public final FXDeviceItem D7c(Cursor cursor, AnonymousClass23U r7, C307822y r8) {
        Long l;
        String string = cursor.getString(cursor.getColumnIndex("id"));
        String string2 = cursor.getString(cursor.getColumnIndex("timestamp"));
        if (string2 != null) {
            l = AnonymousClass0wJ.A0d(string2);
        } else {
            l = null;
        }
        return new FXDeviceItem(l, string, C311624m.FACEBOOK_LITE, AnonymousClass23U.DEVICE_ID);
    }
}

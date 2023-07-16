package X;

import android.database.Cursor;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4VG  reason: invalid class name */
public final class AnonymousClass4VG implements C84424t7 {
    public final AnonymousClass3VA D7Z(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A0j = C18250wR.A0j(string);
            JSONObject jSONObject = A0j.getJSONObject("profile");
            return new AnonymousClass3VA(A0j.getString("access_token"), new AnonymousClass3VD(jSONObject.getString(FXPFAccessLibraryDebugFragment.UID), jSONObject.getString(FXPFAccessLibraryDebugFragment.NAME), jSONObject.getString("pic_square")));
        } catch (JSONException e) {
            throw new C73914Va((Throwable) e);
        }
    }

    public final AnonymousClass3HZ D7b(Cursor cursor, AnonymousClass24G r11) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A0j = C18250wR.A0j(string);
            JSONObject jSONObject = A0j.getJSONObject("profile");
            return new AnonymousClass3HZ(jSONObject.getString(FXPFAccessLibraryDebugFragment.UID), A0j.getString("access_token"), "FACEBOOK", new AnonymousClass4W7(this, jSONObject), C311624m.FACEBOOK, r11);
        } catch (JSONException e) {
            throw new C73914Va((Throwable) e);
        }
    }

    public final AnonymousClass3HZ D7a(Cursor cursor, C311624m r14, AnonymousClass24G r15) {
        String str;
        String str2;
        String str3;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A0j = C18250wR.A0j(string);
            String str4 = "";
            if (A0j.has("userId")) {
                str = A0j.getString("userId");
            } else {
                str = str4;
            }
            if (A0j.has(FXPFAccessLibraryDebugFragment.NAME)) {
                str2 = A0j.getString(FXPFAccessLibraryDebugFragment.NAME);
            } else {
                str2 = str4;
            }
            if (A0j.has("profilePicUrl")) {
                str3 = A0j.getString("profilePicUrl");
            } else {
                str3 = str4;
            }
            if (A0j.has("accessToken")) {
                str4 = A0j.getString("accessToken");
            }
            return new AnonymousClass3HZ(str, str4, r14.name(), new AnonymousClass4W1(str2, str3, this), r14, r15);
        } catch (JSONException e) {
            throw new C73914Va((Throwable) e);
        }
    }

    public final FXDeviceItem D7c(Cursor cursor, AnonymousClass23U r6, C307822y r7) {
        String string;
        C311624m r1;
        String string2;
        int columnIndex = cursor.getColumnIndex("id");
        Long l = null;
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null || string.equals("")) {
            return null;
        }
        int columnIndex2 = cursor.getColumnIndex("timestamp");
        if (!(columnIndex2 == -1 || (string2 = cursor.getString(columnIndex2)) == null)) {
            l = AnonymousClass0wJ.A0d(string2);
        }
        if (r7 == C307822y.A05) {
            r1 = C311624m.MESSENGER;
        } else {
            r1 = C311624m.FACEBOOK;
        }
        return new FXDeviceItem(l, string, r1, r6);
    }
}

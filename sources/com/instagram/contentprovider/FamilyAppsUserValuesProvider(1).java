package com.instagram.contentprovider;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0BO;
import X.AnonymousClass0LU;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass23U;
import X.AnonymousClass24G;
import X.AnonymousClass2QP;
import X.AnonymousClass39H;
import X.AnonymousClass3HZ;
import X.AnonymousClass3Q2;
import X.AnonymousClass3YX;
import X.AnonymousClass3ZN;
import X.AnonymousClass8AP;
import X.AnonymousClass8bP;
import X.C04220Ms;
import X.C04620Ok;
import X.C06810aP;
import X.C08340dC;
import X.C09140ev;
import X.C10300i6;
import X.C15780rs;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C311624m;
import X.C320229w;
import X.C50502t6;
import X.C548130e;
import X.C60843Qs;
import X.C61243Sl;
import X.C61793Vp;
import X.C62733ac;
import X.C63173fJ;
import X.C63203gz;
import X.C63533hk;
import X.C81124nC;
import X.C81134nD;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequestSerializer;
import org.json.JSONException;
import org.json.JSONObject;

public final class FamilyAppsUserValuesProvider extends ContentProvider {
    public C10300i6 A00;
    public UserSession A01;
    public User A02;
    public String A03;
    public AnonymousClass39H A04;

    public final Bundle call(String str, String str2, Bundle bundle) {
        int i;
        Integer num;
        int length;
        int i2;
        AnonymousClass23U r9;
        String str3;
        C04220Ms.A0B(str, 0);
        AnonymousClass3YX.A01.A02();
        if (getContext() != null) {
            AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
            if (C63173fJ.A05(r4, 18300984497277471L)) {
                Context context = getContext();
                if (context == null) {
                    throw AnonymousClass0wJ.A0b();
                } else if (C60843Qs.A00.A05(context)) {
                    boolean A05 = C63173fJ.A05(r4, 18300984497277471L);
                    Bundle A06 = C18180wK.A06();
                    if (!A05) {
                        return A06;
                    }
                    Bundle bundle2 = bundle;
                    if (bundle != null) {
                        if (str.equals("SAVE")) {
                            num = AnonymousClass006.A00;
                        } else if (str.equals("DELETE")) {
                            num = AnonymousClass006.A01;
                        } else {
                            throw C18190wL.A0a(str);
                        }
                        if (num.intValue() != 0) {
                            try {
                                ClassLoader classLoader = FXAccessLibraryDeviceRequest.class.getClassLoader();
                                if (classLoader != null) {
                                    bundle2.setClassLoader(classLoader);
                                    FXAccessLibraryDeviceRequest fXAccessLibraryDeviceRequest = (FXAccessLibraryDeviceRequest) bundle2.getParcelable("device_request");
                                    if (fXAccessLibraryDeviceRequest != null) {
                                        ArrayList A0v = AnonymousClass0wJ.A0v();
                                        for (FXAccessLibraryDeviceRequestItem fXAccessLibraryDeviceRequestItem : C18200wM.A0s(fXAccessLibraryDeviceRequest.A00)) {
                                            A0v.add(AnonymousClass00U.A0L(fXAccessLibraryDeviceRequestItem.A00.A00, fXAccessLibraryDeviceRequestItem.A01.A00));
                                        }
                                        SharedPreferences A012 = C08340dC.A01("access_library_shared_storage");
                                        Iterator it = A0v.iterator();
                                        while (it.hasNext()) {
                                            String A0k = C18180wK.A0k(it);
                                            Iterator<T> it2 = A012.getAll().keySet().iterator();
                                            while (it2.hasNext()) {
                                                String A0k2 = C18180wK.A0k(it2);
                                                C04220Ms.A04(A0k2);
                                                if (AnonymousClass8bP.A0j(A0k2, A0k, false)) {
                                                    C18180wK.A0u(A012.edit(), A0k2);
                                                }
                                            }
                                        }
                                        i = 1;
                                    }
                                }
                            } catch (ClassCastException | Exception unused) {
                            } catch (JSONException unused2) {
                                i = -1;
                            }
                        } else {
                            ClassLoader classLoader2 = FXDeviceItem.class.getClassLoader();
                            if (classLoader2 != null) {
                                bundle2.setClassLoader(classLoader2);
                                Parcelable[] parcelableArray = bundle2.getParcelableArray("device_items");
                                if (parcelableArray != null && (length = parcelableArray.length) > 0) {
                                    FXDeviceItem[] fXDeviceItemArr = new FXDeviceItem[length];
                                    for (int i3 = 0; i3 < length; i3++) {
                                        fXDeviceItemArr[i3] = (FXDeviceItem) parcelableArray[i3];
                                    }
                                    i = 1;
                                    for (FXDeviceItem fXDeviceItem : AnonymousClass8AP.A0A(fXDeviceItemArr)) {
                                        C04220Ms.A0B(fXDeviceItem, 0);
                                        C311624m r10 = fXDeviceItem.A00;
                                        if (r10 == null || (r9 = fXDeviceItem.A03) == null || (str3 = fXDeviceItem.A02) == null) {
                                            i2 = 0;
                                        } else {
                                            SharedPreferences.Editor A0C = C18220wO.A0C("access_library_shared_storage");
                                            String A0L = AnonymousClass00U.A0L(r10.A00, r9.A00);
                                            JSONObject A0y = C18230wP.A0y();
                                            A0y.put("app_source", r10);
                                            A0y.put("id_type", r9);
                                            A0y.put("id", str3);
                                            A0y.put("created_timestamp", fXDeviceItem.A01);
                                            C18180wK.A0v(A0C, A0L, A0y.toString());
                                            i2 = 1;
                                        }
                                        i &= i2;
                                    }
                                }
                            }
                        }
                        i = 0;
                    } else {
                        i = 0;
                    }
                    A06.putInt("device_result", i);
                    return A06;
                } else {
                    throw new SecurityException("Component access not allowed.");
                }
            }
        }
        return C18180wK.A06();
    }

    public final boolean onCreate() {
        return true;
    }

    private final Cursor A00() {
        User user = this.A02;
        if (user == null) {
            C04220Ms.A0E("currentUser");
            throw null;
        }
        String BK7 = user.BK7();
        User user2 = this.A02;
        if (user2 == null) {
            C04220Ms.A0E("currentUser");
            throw null;
        }
        String Ak1 = user2.Ak1();
        User user3 = this.A02;
        if (user3 == null) {
            C04220Ms.A0E("currentUser");
            throw null;
        }
        String valueOf = String.valueOf(user3.Apo());
        User user4 = this.A02;
        if (user4 == null) {
            C04220Ms.A0E("currentUser");
            throw null;
        }
        ImageUrl B4M = user4.B4M();
        UserSession userSession = this.A01;
        if (userSession == null) {
            C04220Ms.A0E("userSession");
            throw null;
        }
        String str = C61793Vp.A00(userSession).A04;
        if (str != null) {
            MatrixCursor matrixCursor = new MatrixCursor(C548130e.A00);
            matrixCursor.addRow(new String[]{BK7, Ak1, str, B4M.getUrl(), valueOf, null, null});
            UserSession userSession2 = this.A01;
            if (userSession2 == null) {
                C04220Ms.A0E("userSession");
                throw null;
            }
            userSession2.getUserId();
            C81124nC r12 = new C81124nC(userSession2);
            String obj = C311624m.INSTAGRAM.toString();
            String obj2 = AnonymousClass24G.ACTIVE_ACCOUNT.toString();
            String str2 = this.A03;
            if (str2 == null) {
                C04220Ms.A0E("waterfallId");
                throw null;
            }
            HashMap A032 = C63203gz.A03("waterfall_id", str2);
            AnonymousClass3ZN.A01(C320229w.TARGET_APP_FETCH_SUCCESS, AnonymousClass006.A00, obj, obj2, (String) null, (String) null, C18210wN.A0g("waterfall_id", A032), "IgFamilyAppsUserValuesProvider", A032, r12);
            return matrixCursor;
        }
        UserSession userSession3 = this.A01;
        if (userSession3 == null) {
            C04220Ms.A0E("userSession");
            throw null;
        }
        userSession3.getUserId();
        C81124nC r122 = new C81124nC(userSession3);
        String obj3 = C311624m.INSTAGRAM.toString();
        String obj4 = AnonymousClass24G.ACTIVE_ACCOUNT.toString();
        String str3 = this.A03;
        if (str3 == null) {
            C04220Ms.A0E("waterfallId");
            throw null;
        }
        HashMap A033 = C63203gz.A03("waterfall_id", str3);
        AnonymousClass3ZN.A01(C320229w.TARGET_APP_FETCH_FAILURE, AnonymousClass006.A00, obj3, obj4, (String) null, "NO_ACCOUNT_FOUND", C18210wN.A0g("waterfall_id", A033), "IgFamilyAppsUserValuesProvider", A033, r122);
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        String str2;
        Integer num;
        AnonymousClass3ZN r7;
        String[] strArr2;
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                throw AnonymousClass0wJ.A0b();
            } else if (!C60843Qs.A00.A05(context)) {
                throw new SecurityException("Component access not allowed.");
            }
        }
        if (str == null) {
            return 0;
        }
        AnonymousClass2QP r3 = new AnonymousClass2QP();
        UserSession userSession = this.A01;
        String str3 = null;
        if (userSession == null) {
            C04220Ms.A0E("userSession");
            throw null;
        }
        userSession.getUserId();
        AnonymousClass39H r2 = new AnonymousClass39H(r3, new C81124nC(userSession));
        this.A04 = r2;
        if (strArr != null) {
            str2 = strArr[0];
            str3 = strArr[1];
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = "null";
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        try {
            for (C61243Sl r6 : ReplicatedStorageRequestSerializer.A00(str).A00) {
                C18210wN.A1O(r6.A01, A0v);
                C18210wN.A1O(r6.A02, A0v2);
            }
            AnonymousClass3ZN r32 = r2.A01;
            Map A002 = AnonymousClass3ZN.A00("waterfall_id", str2, r32);
            if (!A0v2.isEmpty() && !A0v.isEmpty()) {
                Iterator it = A0v.iterator();
                while (it.hasNext()) {
                    String A0t = C18220wO.A0t(it);
                    Iterator it2 = A0v2.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3ZN.A01(C320229w.REPLICATED_STORAGE_TARGET_APP_REMOVE_RECEIVED, AnonymousClass006.A00, A0t, C18220wO.A0t(it2), (String) null, (String) null, C18210wN.A0g("waterfall_id", A002), str3, A002, r32);
                    }
                }
            }
            if (new C81134nD().A00(AnonymousClass0wJ.A0v(), ReplicatedStorageRequestSerializer.A00(str)) == 1) {
                Map A003 = AnonymousClass3ZN.A00("waterfall_id", str2, r32);
                if (!A0v2.isEmpty() && !A0v.isEmpty()) {
                    Iterator it3 = A0v.iterator();
                    while (it3.hasNext()) {
                        String A0t2 = C18220wO.A0t(it3);
                        Iterator it4 = A0v2.iterator();
                        while (it4.hasNext()) {
                            AnonymousClass3ZN.A01(C320229w.REPLICATED_STORAGE_TARGET_APP_REMOVE_SUCCESS, AnonymousClass006.A00, A0t2, C18220wO.A0t(it4), (String) null, (String) null, C18210wN.A0g("waterfall_id", A003), str3, A003, r32);
                        }
                    }
                }
                return 1;
            }
            r32.A0B(AnonymousClass006.A07, str3, A0v, A0v2, AnonymousClass3ZN.A00("waterfall_id", str2, r32));
            return 0;
        } catch (JSONException unused) {
            r7 = r2.A01;
            num = AnonymousClass006.A0C;
            strArr2 = new String[]{"waterfall_id", str2};
            r7.A0B(num, str3, A0v, A0v2, r7.A02(strArr2));
            return 0;
        } catch (Exception e) {
            r7 = r2.A01;
            num = AnonymousClass006.A05;
            strArr2 = new String[]{"errors", e.getMessage(), "waterfall_id", str2};
            r7.A0B(num, str3, A0v, A0v2, r7.A02(strArr2));
            return 0;
        }
    }

    public final String getType(Uri uri) {
        AnonymousClass0LU.A01(FamilyAppsUserValuesProvider.class, "Unsupported Operation");
        throw C18240wQ.A0j();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        AnonymousClass0LU.A01(FamilyAppsUserValuesProvider.class, "Unsupported Operation");
        throw C18240wQ.A0j();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        MatrixCursor matrixCursor;
        String str4;
        String str5;
        String str6;
        AnonymousClass3YX.A01.A02();
        if (!C15780rs.A01(getContext())) {
            if (!C60843Qs.A00.A05(getContext())) {
                AnonymousClass0LU.A01(FamilyAppsUserValuesProvider.class, "Component access not allowed.");
                throw new SecurityException("Component access not allowed.");
            }
        }
        this.A00 = C18200wM.A0W(this);
        if (strArr2 != null) {
            str3 = strArr2[0];
        } else {
            str3 = null;
        }
        this.A03 = String.valueOf(str3);
        String str7 = str;
        if (str != null) {
            int hashCode = str7.hashCode();
            if (hashCode != -875409851) {
                if (hashCode != 928732438) {
                    if (hashCode == 1063606563 && str7.equals("name='saved_session_info'")) {
                        C63533hk.A01();
                        List A0v = AnonymousClass0wJ.A0v();
                        String A0h = C18200wM.A0h(C18200wM.A0C(), "one_tap_login_user_map");
                        if (!TextUtils.isEmpty(A0h)) {
                            try {
                                A0v = C50502t6.parseFromJson(C18180wK.A0L(A0h)).A00;
                            } catch (IOException unused) {
                            }
                        }
                        if (A0v != null && !A0v.isEmpty()) {
                            matrixCursor = new MatrixCursor(C548130e.A00);
                            Iterator it = A0v.iterator();
                            while (it.hasNext()) {
                                C62733ac A0Q = C18250wR.A0Q(it);
                                String str8 = A0Q.A06;
                                C04220Ms.A06(str8);
                                ImageUrl imageUrl = A0Q.A02;
                                C04220Ms.A06(imageUrl);
                                matrixCursor.addRow(new Object[]{str8, "", A0Q.A03, imageUrl, null, null, null});
                            }
                            return matrixCursor;
                        }
                        return null;
                    }
                } else if (str7.equals("device_id_value")) {
                    matrixCursor = new MatrixCursor(C18210wN.A1Z());
                    str6 = C09140ev.A00(getContext());
                }
            } else if (str7.equals("machine_id_value")) {
                matrixCursor = new MatrixCursor(C18210wN.A1Z());
                C10300i6 r0 = this.A00;
                if (r0 == null) {
                    C18250wR.A0l();
                    throw null;
                }
                str6 = C61793Vp.A00(r0).A01.A00;
            }
            matrixCursor.addRow(new String[]{str6});
            return matrixCursor;
        }
        C10300i6 r1 = this.A00;
        if (r1 == null) {
            str5 = "session";
        } else if (!(r1 instanceof UserSession)) {
            AnonymousClass0LU.A02(FamilyAppsUserValuesProvider.class, "No logged-in user");
            return null;
        } else {
            UserSession userSession = (UserSession) r1;
            this.A01 = userSession;
            C04620Ok r02 = C06810aP.A01;
            if (userSession == null) {
                str5 = "userSession";
            } else {
                this.A02 = r02.A01(userSession);
                if (!C04220Ms.A0I(str7, "all_session_info")) {
                    return A00();
                }
                UserSession userSession2 = this.A01;
                String str9 = "userSession";
                if (userSession2 != null) {
                    AnonymousClass0BO r03 = userSession2.multipleAccountHelper;
                    User user = this.A02;
                    if (user == null) {
                        str9 = "currentUser";
                    } else {
                        List A042 = r03.A00.A04(user);
                        if (A042 != null && C18190wL.A1a(A042)) {
                            matrixCursor = (MatrixCursor) A00();
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                C61793Vp A002 = C61793Vp.A00(userSession3);
                                C04220Ms.A06(A002);
                                ArrayList A0w = AnonymousClass0wJ.A0w(A042);
                                Iterator it2 = A042.iterator();
                                while (it2.hasNext()) {
                                    C18190wL.A1T(A0w, it2);
                                }
                                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                                Iterator it3 = A0w.iterator();
                                while (it3.hasNext()) {
                                    String A0k = C18180wK.A0k(it3);
                                    if (A0k != null) {
                                        str4 = C18250wR.A0W(A002.A00, A0k);
                                    } else {
                                        str4 = null;
                                    }
                                    A0v2.add(str4);
                                }
                                if (matrixCursor != null) {
                                    int size = A042.size();
                                    for (int i = 0; i < size; i++) {
                                        User user2 = (User) A042.get(i);
                                        String BK7 = user2.BK7();
                                        String Ak1 = user2.Ak1();
                                        String valueOf = String.valueOf(user2.Apo());
                                        ImageUrl B4M = user2.B4M();
                                        String A0p = C18190wL.A0p(A0v2, i);
                                        if (!(A0p == null || A0p.length() == 0)) {
                                            matrixCursor.addRow(new String[]{BK7, Ak1, A0p, B4M.getUrl(), valueOf, null, null});
                                        }
                                    }
                                }
                                return matrixCursor;
                            }
                        }
                        return null;
                    }
                }
                C04220Ms.A0E(str9);
                throw null;
            }
        }
        C04220Ms.A0E(str5);
        throw null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        String str3;
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                throw AnonymousClass0wJ.A0b();
            } else if (!C60843Qs.A00.A05(context)) {
                throw new SecurityException("Component access not allowed.");
            }
        }
        ContentValues contentValues2 = contentValues;
        if (contentValues != null) {
            AnonymousClass2QP r5 = new AnonymousClass2QP();
            UserSession userSession = this.A01;
            String str4 = null;
            if (userSession == null) {
                C04220Ms.A0E("userSession");
                throw null;
            }
            userSession.getUserId();
            AnonymousClass39H r3 = new AnonymousClass39H(r5, new C81124nC(userSession));
            this.A04 = r3;
            if (strArr != null) {
                str2 = strArr[0];
                str4 = strArr[1];
            } else {
                str2 = null;
            }
            String str5 = "null";
            if (str2 == null) {
                str2 = str5;
            }
            if (str4 != null) {
                str5 = str4;
            }
            ArrayList A0v = AnonymousClass0wJ.A0v();
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            ArrayList A0v3 = AnonymousClass0wJ.A0v();
            try {
                Set<String> keySet = contentValues2.keySet();
                if (keySet != null) {
                    Iterator<String> it = keySet.iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        if (contentValues2.getAsString(A0k) != null) {
                            AnonymousClass3HZ A012 = AnonymousClass3Q2.A01(contentValues2.getAsString(A0k));
                            A0v.add(AnonymousClass3Q2.A01(contentValues2.getAsString(A0k)));
                            C18210wN.A1O(A012.A04, A0v2);
                            C18210wN.A1O(A012.A05, A0v3);
                        }
                    }
                }
                AnonymousClass3HZ[] r7 = new AnonymousClass3HZ[A0v.size()];
                AnonymousClass3ZN r4 = r3.A01;
                Map A002 = AnonymousClass3ZN.A00("waterfall_id", str2, r4);
                if (!A0v3.isEmpty() && !A0v2.isEmpty()) {
                    Iterator it2 = A0v2.iterator();
                    while (it2.hasNext()) {
                        String A0t = C18220wO.A0t(it2);
                        Iterator it3 = A0v3.iterator();
                        while (it3.hasNext()) {
                            AnonymousClass3ZN.A01(C320229w.REPLICATED_STORAGE_TARGET_APP_SAVE_RECEIVED, AnonymousClass006.A00, A0t, C18220wO.A0t(it3), (String) null, (String) null, C18210wN.A0g("waterfall_id", A002), str5, A002, r4);
                        }
                    }
                }
                AnonymousClass3HZ[] r11 = (AnonymousClass3HZ[]) A0v.toArray(r7);
                C04220Ms.A0B(r11, 0);
                for (AnonymousClass3HZ r12 : AnonymousClass8AP.A0A(r11)) {
                    C04220Ms.A0B(r12, 0);
                    SharedPreferences.Editor A0C = C18220wO.A0C("access_library_shared_storage");
                    C311624m r72 = r12.A04;
                    AnonymousClass24G r6 = r12.A05;
                    String str6 = r12.A02;
                    if (r72 == null || r6 == null || str6 == null) {
                        str3 = "";
                    } else {
                        str3 = AnonymousClass00U.A0V(r72.A00, r6.A00, str6);
                    }
                    C18180wK.A0v(A0C, str3, AnonymousClass3Q2.A00(r12));
                }
                if (r11.length == 0) {
                    r4.A0C(AnonymousClass006.A06, str5, A0v2, A0v3, AnonymousClass3ZN.A00("waterfall_id", str2, r4));
                    return 0;
                }
                Map A003 = AnonymousClass3ZN.A00("waterfall_id", str2, r4);
                if (A0v3.isEmpty() || A0v2.isEmpty()) {
                    return 1;
                }
                Iterator it4 = A0v2.iterator();
                while (it4.hasNext()) {
                    String A0t2 = C18220wO.A0t(it4);
                    Iterator it5 = A0v3.iterator();
                    while (it5.hasNext()) {
                        AnonymousClass3ZN.A01(C320229w.REPLICATED_STORAGE_TARGET_APP_SAVE_SUCCESS, AnonymousClass006.A00, A0t2, C18220wO.A0t(it5), (String) null, (String) null, C18210wN.A0g("waterfall_id", A003), str5, A003, r4);
                    }
                }
                return 1;
            } catch (JSONException unused) {
                AnonymousClass3ZN r2 = r3.A01;
                r2.A0C(AnonymousClass006.A0C, str5, A0v2, A0v3, AnonymousClass3ZN.A00("waterfall_id", str2, r2));
                return -1;
            } catch (Exception e) {
                AnonymousClass3ZN r62 = r3.A01;
                r62.A0C(AnonymousClass006.A05, str5, A0v2, A0v3, r62.A02("errors", e.getMessage(), "waterfall_id", str2));
            }
        }
        return 0;
    }
}

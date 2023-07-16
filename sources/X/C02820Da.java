package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Da  reason: invalid class name and case insensitive filesystem */
public final class C02820Da extends C02530Bu {
    public StringWriter A00 = new StringWriter();
    public StringWriter A01 = new StringWriter();
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass0LI A05 = new AnonymousClass0LI();
    public final Set A06 = new HashSet();
    public final Map A07 = new HashMap();

    public static Object A00(AnonymousClass0KD r2, String str) {
        for (int i = 0; i < r2.A00; i++) {
            if (str.equals(r2.A0C(i))) {
                return r2.A0B(i);
            }
        }
        return null;
    }

    public static boolean A01(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        if (!(obj instanceof Number) || ((Number) obj).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A02(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5 = JSONObject.NULL;
        if (obj5.equals(obj)) {
            obj = null;
        }
        if (obj5.equals(obj2)) {
            obj2 = null;
        }
        boolean z = true;
        if (obj != null) {
            if (obj2 != null) {
                if (obj.equals(obj2)) {
                    return true;
                }
                if ((obj instanceof Boolean) || (obj2 instanceof Boolean)) {
                    if (A01(obj) == A01(obj2)) {
                        return true;
                    }
                } else if ((obj instanceof Number) || (obj2 instanceof Number)) {
                    return obj.toString().equals(obj2.toString());
                } else {
                    if (obj.getClass() == obj2.getClass()) {
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) obj;
                            JSONArray jSONArray2 = (JSONArray) obj2;
                            if (jSONArray.length() == jSONArray2.length()) {
                                int i = 0;
                                while (i < jSONArray.length()) {
                                    if (A02(jSONArray2.get(i), jSONArray.get(i))) {
                                        i++;
                                    }
                                }
                                return true;
                            }
                        } else if (obj instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) obj;
                            JSONObject jSONObject2 = (JSONObject) obj2;
                            HashSet hashSet = new HashSet();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                hashSet.add(keys.next());
                            }
                            Iterator<String> keys2 = jSONObject.keys();
                            while (keys2.hasNext()) {
                                hashSet.add(keys2.next());
                            }
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (jSONObject.has(str)) {
                                    obj3 = jSONObject.get(str);
                                } else {
                                    obj3 = null;
                                }
                                if (jSONObject2.has(str)) {
                                    obj4 = jSONObject2.get(str);
                                } else {
                                    obj4 = null;
                                }
                                if (A02(obj4, obj3)) {
                                    if (jSONObject2.has(str)) {
                                        jSONObject2.remove(str);
                                    }
                                    if (jSONObject.has(str)) {
                                        jSONObject.remove(str);
                                    }
                                } else {
                                    z = false;
                                }
                            }
                            return z;
                        }
                    }
                    return false;
                }
            }
        } else if (obj == obj2) {
            return true;
        }
        return false;
    }

    public final void onEventReceivedWithParamsCollectionMap(AnonymousClass0KD r10, AnonymousClass0CU r11) {
        String str;
        String str2;
        String str3;
        String str4;
        Object A002;
        Object A003 = A00(r10, FXPFAccessLibraryDebugFragment.NAME);
        if (A003 != null) {
            str = A003.toString();
        } else {
            str = null;
        }
        if (this.A06.contains(str)) {
            String str5 = (String) this.A07.get(str);
            String str6 = null;
            if (str5 != null) {
                Object A004 = A00(r10, "extra");
                if ((A004 instanceof AnonymousClass0KD) && (A002 = A00((AnonymousClass0KD) A004, str5)) != null) {
                    str6 = A002.toString();
                }
            }
            Object A005 = A00(r10, IgFragmentActivity.MODULE_KEY);
            if (A005 != null) {
                str2 = A005.toString();
            } else {
                str2 = null;
            }
            String str7 = this.A03;
            if (str7 != null && ((AnonymousClass00U.A0L(str7, "_experimental").equals(str) || AnonymousClass00U.A0L(str, "_experimental").equals(str7)) && ((str6 == (str3 = this.A04) || (str3 != null && str3.equals(str6))) && (str2 == (str4 = this.A02) || (str4 != null && str4.equals(str2)))))) {
                StringWriter stringWriter = this.A00;
                stringWriter.getBuffer().setLength(0);
                try {
                    AnonymousClass0KR.A00().A04(r10, stringWriter);
                    String obj = this.A01.toString();
                    String obj2 = stringWriter.toString();
                    JSONObject jSONObject = new JSONObject(obj);
                    JSONObject jSONObject2 = new JSONObject(obj2);
                    if (!A02(jSONObject.get("extra"), jSONObject2.get("extra"))) {
                        jSONObject.get("extra").toString();
                        jSONObject2.get("extra").toString();
                    }
                } catch (IOException | NullPointerException | JSONException unused) {
                }
            }
            StringWriter stringWriter2 = this.A01;
            stringWriter2.getBuffer().setLength(0);
            this.A03 = str;
            this.A04 = str6;
            this.A02 = str2;
            try {
                AnonymousClass0KR.A00().A04(r10, stringWriter2);
            } catch (IOException unused2) {
            }
        }
    }

    public C02820Da(String[][] strArr) {
        for (String[] strArr2 : strArr) {
            this.A06.add(strArr2[0]);
            this.A06.add(AnonymousClass00U.A0L(strArr2[0], "_experimental"));
            this.A07.put(strArr2[0], strArr2[1]);
            this.A07.put(AnonymousClass00U.A0L(strArr2[0], "_experimental"), strArr2[1]);
        }
    }
}

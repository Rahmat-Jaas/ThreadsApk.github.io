package com.facebook.msys.mci;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass6CO;
import X.AnonymousClass6HJ;
import X.AnonymousClass737;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C86124wJ;
import X.C86164wN;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthDataStorage {
    public static volatile boolean sInitialized;
    public static volatile AnonymousClass6HJ sObjectSerializer;
    public static volatile SharedPreferences sSharedPreferences;

    public static native void nativeInitialize();

    public static Object getFromRawKey(String str) {
        JSONException jSONException;
        if (sInitialized) {
            String string = sSharedPreferences.getString(str, (String) null);
            if (string == null) {
                return null;
            }
            try {
                JSONObject A0j = C18250wR.A0j(string);
                String string2 = A0j.getString("type");
                if (string2.equals("null")) {
                    return null;
                }
                if (string2.equals("double")) {
                    String string3 = A0j.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    try {
                        return Double.valueOf(Double.parseDouble(string3));
                    } catch (NumberFormatException unused) {
                        jSONException = new JSONException(AnonymousClass00U.A0L("Could not parse double ", string3));
                    }
                } else if (string2.equals("float")) {
                    String string4 = A0j.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    try {
                        return Float.valueOf(Float.parseFloat(string4));
                    } catch (NumberFormatException unused2) {
                        jSONException = new JSONException(AnonymousClass00U.A0L("Could not parse float ", string4));
                    }
                } else if (string2.equals("int")) {
                    String string5 = A0j.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    try {
                        return C86124wJ.A0h(string5);
                    } catch (NumberFormatException unused3) {
                        jSONException = new JSONException(AnonymousClass00U.A0L("Could not parse int ", string5));
                    }
                } else if (string2.equals("long")) {
                    String string6 = A0j.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    try {
                        return AnonymousClass0wJ.A0d(string6);
                    } catch (NumberFormatException unused4) {
                        jSONException = new JSONException(AnonymousClass00U.A0L("Could not parse long ", string6));
                    }
                } else if (string2.equals(IgNetworkingModule.REQUEST_BODY_KEY_STRING)) {
                    return A0j.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else {
                    jSONException = new JSONException(AnonymousClass00U.A0L("Unsupported type of object: ", string2));
                    throw jSONException;
                }
            } catch (JSONException e) {
                throw new AnonymousClass6CO((Exception) e);
            } catch (AnonymousClass6CO e2) {
                Log.e("AuthDataStorage", AnonymousClass00U.A0L("Error deserializing object for key ", str), e2);
                return null;
            }
        } else {
            throw C18250wR.A0V("Settings have not been initialized yet. Call initialize() first");
        }
    }

    public static boolean isMCPEnabledForAuthDataStorage() {
        return false;
    }

    public static void resetFromFacebookUserId(String str) {
        if (sInitialized) {
            Map<String, ?> all = sSharedPreferences.getAll();
            SharedPreferences.Editor edit = sSharedPreferences.edit();
            Iterator A0z = AnonymousClass0wJ.A0z(all);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                if (C18200wM.A0p(A0o).startsWith(str)) {
                    edit.remove(C18200wM.A0p(A0o));
                }
            }
            edit.commit();
            return;
        }
        throw C18250wR.A0V("Settings have not been initialized yet. Call initialize() first");
    }

    public static void setWithRawKey(String str, Object obj) {
        if (sInitialized) {
            try {
                SharedPreferences.Editor edit = sSharedPreferences.edit();
                JSONObject A0y = C18230wP.A0y();
                if (obj == null) {
                    A0y.put("type", "null");
                } else if (obj instanceof Double) {
                    A0y.put("type", "double");
                    C86164wN.A1H(obj, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0y);
                } else if (obj instanceof Float) {
                    A0y.put("type", "float");
                    C86164wN.A1H(obj, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0y);
                } else if (obj instanceof Integer) {
                    A0y.put("type", "int");
                    C86164wN.A1H(obj, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0y);
                } else if (obj instanceof Long) {
                    A0y.put("type", "long");
                    C86164wN.A1H(obj, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0y);
                } else if (obj instanceof String) {
                    A0y.put("type", IgNetworkingModule.REQUEST_BODY_KEY_STRING);
                    C86164wN.A1H(obj, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0y);
                } else {
                    throw new AnonymousClass6CO(AnonymousClass00U.A0L("Unsupported type of object: ", C18220wO.A0q(obj)));
                }
                edit.putString(str, A0y.toString()).commit();
            } catch (JSONException e) {
                throw new AnonymousClass6CO((Exception) e);
            } catch (AnonymousClass6CO e2) {
                Log.e("AuthDataStorage", AnonymousClass00U.A0L("Error serializing object for key ", str), e2);
            }
        } else {
            throw C18250wR.A0V("Settings have not been initialized yet. Call initialize() first");
        }
    }

    static {
        AnonymousClass737.A00();
    }
}

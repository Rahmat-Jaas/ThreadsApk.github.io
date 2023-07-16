package com.facebook.pando;

import X.C108776iv;
import X.C1366783w;
import X.C15020qa;
import X.C18180wK;
import X.C18210wN;
import X.C18230wP;
import X.C18250wR;
import X.C86104wH;
import X.C86144wL;
import X.C86164wN;
import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.jni.HybridClassBase;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TreeJNI extends HybridClassBase {
    private final native boolean isFieldSet(String str);

    public final native ImmutableList getBooleanList(String str);

    public final native ImmutableList getBooleanListByHashCode(int i);

    public final native boolean getBooleanValue(String str);

    public final native boolean getBooleanValueByHashCode(int i);

    public final native Boolean getBooleanVariable(String str);

    public final native ImmutableList getDoubleList(String str);

    public final native ImmutableList getDoubleListByHashCode(int i);

    public final native double getDoubleValue(String str);

    public final native double getDoubleValueByHashCode(int i);

    public C108776iv[] getEdgeFields() {
        return new C108776iv[0];
    }

    public final native Object getFieldByHashCode_UNTYPED(int i);

    public final native Object getField_UNTYPED(String str);

    public Class[] getInlineClasses() {
        return new Class[0];
    }

    public final native ImmutableList getIntList(String str);

    public final native ImmutableList getIntListByHashCode(int i);

    public final native int getIntValue(String str);

    public final native int getIntValueByHashCode(int i);

    public final native ImmutableList getOptionalBooleanList(String str);

    public final native ImmutableList getOptionalBooleanListByHashCode(int i);

    public final native Boolean getOptionalBooleanValue(String str);

    public final native Boolean getOptionalBooleanValueByHashCode(int i);

    public final native ImmutableList getOptionalDoubleList(String str);

    public final native ImmutableList getOptionalDoubleListByHashCode(int i);

    public final native Double getOptionalDoubleValue(String str);

    public final native Double getOptionalDoubleValueByHashCode(int i);

    public final native ImmutableList getOptionalIntList(String str);

    public final native ImmutableList getOptionalIntListByHashCode(int i);

    public final native Integer getOptionalIntValue(String str);

    public final native Integer getOptionalIntValueByHashCode(int i);

    public final native ImmutableList getOptionalStringList(String str);

    public final native ImmutableList getOptionalStringListByHashCode(int i);

    public final native ImmutableList getOptionalTimeList(String str);

    public final native ImmutableList getOptionalTimeListByHashCode(int i);

    public final native Long getOptionalTimeValue(String str);

    public final native Long getOptionalTimeValueByHashCode(int i);

    public final native ImmutableList getOptionalTreeList(String str, Class cls);

    public final native ImmutableList getOptionalTreeListByHashCode(int i, Class cls);

    public String[] getScalarFields() {
        return new String[0];
    }

    public final native ImmutableList getStringList(String str);

    public final native ImmutableList getStringListByHashCode(int i);

    public final native String getStringValue(String str);

    public final native String getStringValueByHashCode(int i);

    public final native ImmutableList getTimeList(String str);

    public final native ImmutableList getTimeListByHashCode(int i);

    public final native long getTimeValue(String str);

    public final native long getTimeValueByHashCode(int i);

    public final native ImmutableList getTreeList(String str, Class cls);

    public final native ImmutableList getTreeListByHashCode(int i, Class cls);

    public final native TreeJNI getTreeValue(String str, Class cls);

    public final native TreeJNI getTreeValueByHashCode(int i, Class cls);

    public final native boolean hasFieldValue(String str);

    public final native boolean hasFieldValueByHashCode(int i);

    public final native void maybeUpdateActiveFields();

    public final native TreeJNI reinterpret(Class cls);

    public final String toExpensiveHumanReadableDebugString() {
        try {
            return asJSON(false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final String toFlipperFormattedResponseString() {
        try {
            return asJSON(true).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    static {
        C15020qa.A0A("pando-jni");
    }

    public static Enum parseEnum(String str, Enum enumR) {
        if (str == null) {
            return enumR;
        }
        try {
            return Enum.valueOf(enumR.getClass(), str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return enumR;
        }
    }

    public static String parseStringDef(String str, String str2, String str3, FromStringAble fromStringAble) {
        if (str == null) {
            return str3;
        }
        throw C18210wN.A0W("fromString");
    }

    public final String getTypeName() {
        return getStringValue("__typename");
    }

    public final boolean isFulfilled(String str) {
        if (str.equals(getStringValue("__typename")) || getBooleanValue(String.format("is_fulfilled__(name:\"%s\")", new Object[]{str}))) {
            return true;
        }
        return false;
    }

    public final JSONObject asJSON(boolean z) {
        JSONArray jSONArray;
        String str;
        Object obj;
        Object obj2;
        JSONObject asJSON;
        JSONObject A0y = C18230wP.A0y();
        for (String str2 : getScalarFields()) {
            if (isFieldSet(str2)) {
                Object field_UNTYPED = getField_UNTYPED(str2);
                if (field_UNTYPED == null) {
                    field_UNTYPED = JSONObject.NULL;
                } else if (field_UNTYPED instanceof List) {
                    JSONArray A0i = C18250wR.A0i();
                    Iterator A0y2 = C86144wL.A0y(field_UNTYPED);
                    while (A0y2.hasNext()) {
                        A0i.put(A0y2.next());
                    }
                    A0y.put(str2, A0i);
                }
                A0y.put(str2, field_UNTYPED);
            }
        }
        for (C108776iv r1 : getEdgeFields()) {
            if (isFieldSet(r1.A01)) {
                if (r1.A02) {
                    JSONArray A0i2 = C18250wR.A0i();
                    str = r1.A01;
                    C1366783w A0G = C18250wR.A0G(this, r1.A00, str);
                    while (A0G.hasNext()) {
                        TreeJNI A0G2 = C18210wN.A0G(A0G);
                        if (z) {
                            asJSON = C18230wP.A0y();
                            asJSON.put("type", A0G2.getStringValue("__typename"));
                            asJSON.put("fields", A0G2.asJSON(z));
                        } else {
                            asJSON = A0G2.asJSON(z);
                        }
                        A0i2.put(asJSON);
                    }
                    jSONArray = A0i2;
                } else {
                    str = r1.A01;
                    TreeJNI treeValue = getTreeValue(str, r1.A00);
                    if (z) {
                        JSONObject A0y3 = C18230wP.A0y();
                        if (treeValue != null) {
                            obj = treeValue.getStringValue("__typename");
                        } else {
                            obj = JSONObject.NULL;
                        }
                        A0y3.put("type", obj);
                        if (treeValue != null) {
                            obj2 = treeValue.asJSON(z);
                        } else {
                            obj2 = JSONObject.NULL;
                        }
                        A0y3.put("fields", obj2);
                        A0y.put(str, A0y3);
                    } else if (treeValue != null) {
                        jSONArray = treeValue.asJSON(z);
                    } else {
                        jSONArray = JSONObject.NULL;
                    }
                }
                A0y.put(str, jSONArray);
            }
        }
        for (Class reinterpret : getInlineClasses()) {
            JSONObject asJSON2 = reinterpret(reinterpret).asJSON(z);
            Iterator<String> keys = asJSON2.keys();
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                A0y.put(A0k, asJSON2.get(A0k));
            }
        }
        return A0y;
    }

    public final ImmutableList getEnumList(String str, Enum enumR) {
        ImmutableList stringList = getStringList(str);
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        C1366783w it = stringList.iterator();
        while (it.hasNext()) {
            A0Q.add((Object) parseEnum(C18180wK.A0k(it), enumR));
        }
        return A0Q.build();
    }

    public final Enum getEnumValue(String str, Enum enumR) {
        return C86104wH.A0a(this, enumR, str);
    }

    public final ImmutableList getStringDefList(String str, String str2, String str3, FromStringAble fromStringAble) {
        ImmutableList stringList = getStringList(str);
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        C1366783w it = stringList.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                A0Q.add((Object) str3);
            } else {
                throw C18210wN.A0W("fromString");
            }
        }
        return A0Q.build();
    }

    public final String getStringDefValue(String str, String str2, String str3, FromStringAble fromStringAble) {
        if (getStringValue(str) == null) {
            return str3;
        }
        throw C18210wN.A0W("fromString");
    }
}

package com.facebook.pando;

import X.AnonymousClass6HN;
import X.C04220Ms;
import X.C15020qa;
import X.C86134wK;
import com.facebook.jni.HybridData;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class NativeMap extends AbstractMap<String, String> {
    public static final AnonymousClass6HN Companion = new AnonymousClass6HN();
    public final HybridData mHybridData = initHybridData();

    public NativeMap(Map map) {
        C04220Ms.A0B(map, 1);
        putAll(map);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData();

    private final native void putNative(String str, String str2);

    static {
        C15020qa.A0A("pando-graphql-jni");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsValue(obj);
        }
        return false;
    }

    public final /* bridge */ String get(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return (String) super.get(obj);
        }
        return null;
    }

    public Set getEntries() {
        throw C86134wK.A0s("not implemented");
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        if (obj == null || (obj instanceof String)) {
            return (String) super.getOrDefault(obj, str);
        }
        return str;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj2;
        put((String) obj, str);
        return str;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z || (obj2 != null && !(obj2 instanceof String))) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public final /* bridge */ Set entrySet() {
        getEntries();
        throw null;
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public NativeMap() {
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey(str);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue(str);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj == null || (obj instanceof String)) {
            return super.getOrDefault(obj, obj2);
        }
        return obj2;
    }

    public String put(String str, String str2) {
        C04220Ms.A0B(str, 0);
        putNative(str, str2);
        return str2;
    }

    public final /* bridge */ String remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return (String) super.remove(obj);
        }
        return null;
    }

    public /* bridge */ String get(String str) {
        return (String) super.get(str);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault(str, str2);
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove(str, str2);
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove(str);
    }
}

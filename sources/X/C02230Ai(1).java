package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.0Ai  reason: invalid class name and case insensitive filesystem */
public final class C02230Ai implements AnonymousClass0W7, AnonymousClass0XL {
    public static final HashMap A01;
    public static final Map A02;
    public static final Map A03;
    public static final HashMap A04;
    public static final HashMap A05;
    public final Class A00;

    public C02230Ai(Class cls) {
        C04220Ms.A0B(cls, 1);
        this.A00 = cls;
    }

    static {
        int i = 0;
        List A17 = C06750aI.A17(AnonymousClass0ZU.class, AnonymousClass0YY.class, AnonymousClass0YP.class, AnonymousClass0YM.class, AnonymousClass0YC.class, AnonymousClass0Y0.class, C06080Xo.class, C06070Xn.class, AnonymousClass0XZ.class, AnonymousClass0XO.class, AnonymousClass0ZL.class, AnonymousClass0ZK.class, AnonymousClass0ZH.class, AnonymousClass0Z3.class, C06360Yz.class, C06340Yx.class, C06330Yw.class, C06260Yl.class, C06190Ya.class, AnonymousClass0YZ.class, AnonymousClass0YT.class, AnonymousClass0YR.class, AnonymousClass0YQ.class);
        ArrayList arrayList = new ArrayList(C02260Al.A0z(A17, 10));
        for (Object next : A17) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            } else {
                arrayList.add(C54682zq.A00(next, Integer.valueOf(i)));
                i = i2;
            }
        }
        A02 = AnonymousClass4WJ.A0B(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        A04 = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        A05 = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C04220Ms.A06(values);
        for (String str : values) {
            C04220Ms.A04(str);
            Pair A002 = C54682zq.A00(AnonymousClass00U.A0V("kotlin.jvm.internal.", AnonymousClass8bP.A0W(str, str), "CompanionObject"), AnonymousClass00U.A0L(str, ".Companion"));
            hashMap3.put(A002.A00(), A002.A01());
        }
        for (Map.Entry entry : A02.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), AnonymousClass00U.A0J("kotlin.Function", ((Number) entry.getValue()).intValue()));
        }
        A01 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass4WK.A0N(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AnonymousClass8bP.A0W((String) entry2.getValue(), (String) entry2.getValue()));
        }
        A03 = linkedHashMap;
    }

    public static final void A00() {
        throw new C97376Bc();
    }

    public final String B5C() {
        String str;
        String A0L;
        Class cls = this.A00;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (!componentType.isPrimitive() || (str = (String) A01.get(componentType.getName())) == null || (A0L = AnonymousClass00U.A0L(str, "Array")) == null) {
                return "kotlin.Array";
            }
            return A0L;
        }
        String str2 = (String) A01.get(cls.getName());
        if (str2 == null) {
            return cls.getCanonicalName();
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02230Ai) || !C04220Ms.A0I(AnonymousClass724.A01(this), AnonymousClass724.A01((AnonymousClass0W7) obj))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0L(this.A00.toString(), " (Kotlin reflection is not available)");
    }

    public final Class AqX() {
        return this.A00;
    }

    public final List getAnnotations() {
        A00();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final int hashCode() {
        return AnonymousClass724.A01(this).hashCode();
    }
}

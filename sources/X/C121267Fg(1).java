package X;

import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Fg  reason: invalid class name and case insensitive filesystem */
public final class C121267Fg {
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.lang.Object r5, java.util.Map r6, boolean r7) {
        /*
            if (r5 == 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Character
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Short
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.String
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0046
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r1 = r5.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = A00(r0, r6, r7)
            r3.add(r0)
            goto L_0x0034
        L_0x0046:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L_0x006f
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r5)
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006e
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = A00(r0, r6, r7)
            r3.put(r1, r0)
            goto L_0x0054
        L_0x006e:
            return r3
        L_0x006f:
            boolean r0 = r5 instanceof X.C107406gh
            if (r0 == 0) goto L_0x007a
            X.6gh r5 = (X.C107406gh) r5
            java.util.Map r5 = processPttBloksPayload(r5, r6, r7)
            return r5
        L_0x007a:
            java.lang.Class r0 = r5.getClass()
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.reflect.Field[] r3 = r0.getDeclaredFields()
            int r2 = r3.length
            r1 = 0
        L_0x0088:
            if (r1 >= r2) goto L_0x0092
            r0 = r3[r1]
            processFieldPayload(r0, r5, r4, r6, r7)
            int r1 = r1 + 1
            goto L_0x0088
        L_0x0092:
            return r4
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121267Fg.A00(java.lang.Object, java.util.Map, boolean):java.lang.Object");
    }

    public static AnonymousClass79P createPayloads(Object obj) {
        byte[] bytes;
        byte[] bArr;
        obj.getClass();
        M4h m4h = new M4h();
        m4h.A05 = false;
        Gson A03 = m4h.A03();
        HashMap A0y = AnonymousClass0wJ.A0y();
        String A08 = A03.A08(A00(obj, A0y, false));
        if (!A0y.isEmpty()) {
            String A082 = A03.A08(A0y);
            bytes = A08.getBytes(Charset.defaultCharset());
            bArr = A082.getBytes(Charset.defaultCharset());
        } else {
            bytes = A08.getBytes(Charset.defaultCharset());
            bArr = null;
        }
        return new AnonymousClass79P(bytes, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void processFieldPayload(java.lang.reflect.Field r4, java.lang.Object r5, java.util.Map r6, java.util.Map r7, boolean r8) {
        /*
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x005f
            boolean r0 = r4.isSynthetic()
            if (r0 != 0) goto L_0x005f
            r2 = 1
            r4.setAccessible(r2)
            java.lang.Object r3 = r4.get(r5)
            if (r3 == 0) goto L_0x005f
            java.lang.Class<com.fbpay.ptt.SerializedName> r1 = com.fbpay.ptt.SerializedName.class
            boolean r0 = r4.isAnnotationPresent(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r1)
            com.fbpay.ptt.SerializedName r0 = (com.fbpay.ptt.SerializedName) r0
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r0.value()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0065
        L_0x0034:
            if (r8 != 0) goto L_0x0060
            java.lang.Class<com.fbpay.ptt.Sensitive> r0 = com.fbpay.ptt.Sensitive.class
            boolean r0 = r4.isAnnotationPresent(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "csc"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0060
        L_0x0053:
            java.lang.Object r0 = A00(r3, r7, r2)
            r7.put(r1, r0)
            java.lang.String r0 = "$e2ee"
        L_0x005c:
            r6.put(r1, r0)
        L_0x005f:
            return
        L_0x0060:
            java.lang.Object r0 = A00(r3, r7, r8)
            goto L_0x005c
        L_0x0065:
            java.lang.String r1 = r4.getName()
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121267Fg.processFieldPayload(java.lang.reflect.Field, java.lang.Object, java.util.Map, java.util.Map, boolean):void");
    }

    public static Map processPttBloksPayload(C107406gh r6, Map map, boolean z) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Map unmodifiableMap = Collections.unmodifiableMap(r6.A00);
        Iterator A0z = AnonymousClass0wJ.A0z(unmodifiableMap);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A0y.put(A0o.getKey(), A00(A0o.getValue(), map, z));
        }
        for (Object next : Collections.unmodifiableSet(r6.A01)) {
            if (unmodifiableMap.containsKey(next)) {
                map.put(next, A00(unmodifiableMap.get(next), map, true));
                A0y.put(next, "$e2ee");
            }
        }
        return A0y;
    }
}

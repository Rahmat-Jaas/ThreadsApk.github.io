package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0kH  reason: invalid class name and case insensitive filesystem */
public final class C11480kH implements Serializable {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final void A03(C11490kI r3, int i) {
        if (i != -1) {
            this.A01.put(r3, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11480kH)) {
            return false;
        }
        C11480kH r4 = (C11480kH) obj;
        return C002401c.A00(this.A00, r4.A00) && C002401c.A00(this.A01, r4.A01);
    }

    public final C15680ri A00() {
        String str;
        C15680ri A002;
        C15680ri r5 = new C15680ri();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (entry.getValue() instanceof String) {
                r5.A0D((String) entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue() instanceof Integer) {
                r5.A09((Integer) entry.getValue(), (String) entry.getKey());
            } else if (entry.getValue() instanceof Double) {
                r5.A0B((String) entry.getKey(), (Double) entry.getValue());
            } else if (entry.getValue() instanceof Float) {
                Object value = entry.getValue();
                r5.A00.A02((String) entry.getKey(), value);
            } else if (entry.getValue() instanceof Long) {
                r5.A0C((String) entry.getKey(), (Long) entry.getValue());
            } else if (entry.getValue() instanceof Boolean) {
                r5.A0A((String) entry.getKey(), (Boolean) entry.getValue());
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                if (list.isEmpty() || (list.get(0) instanceof String)) {
                    r5.A0E((String) entry.getKey(), (List) entry.getValue());
                } else if (list.get(0) instanceof C11480kH) {
                    r5.A0F((String) entry.getKey(), (List) entry.getValue());
                } else if (list.get(0) instanceof Map) {
                    r5.A0G((String) entry.getKey(), (List) entry.getValue());
                }
            } else {
                if (entry.getValue() instanceof Map) {
                    Map map = (Map) entry.getValue();
                    ArrayList arrayList = new ArrayList(map.keySet());
                    ArrayList arrayList2 = new ArrayList(map.values());
                    if (!map.isEmpty()) {
                        if (arrayList.get(0) instanceof String) {
                            if (!(arrayList2.get(0) instanceof String)) {
                                if (arrayList2.get(0) instanceof Float) {
                                    str = (String) entry.getKey();
                                    A002 = new C15680ri();
                                    A002.A0N(map);
                                } else if (arrayList2.get(0) instanceof List) {
                                    str = (String) entry.getKey();
                                    A002 = new C15680ri();
                                    A002.A0O(map);
                                }
                            }
                        } else if (arrayList.get(0) instanceof Long) {
                            if (arrayList2.get(0) instanceof String) {
                                str = (String) entry.getKey();
                                A002 = new C15680ri();
                                A002.A0M(map);
                            } else if (arrayList2.get(0) instanceof Float) {
                                str = (String) entry.getKey();
                                A002 = new C15680ri();
                                A002.A0K(map);
                            } else if (arrayList2.get(0) instanceof List) {
                                str = (String) entry.getKey();
                                A002 = new C15680ri();
                                A002.A0L(map);
                            }
                        }
                    }
                    str = (String) entry.getKey();
                    A002 = new C15680ri();
                    A002.A0J(map);
                } else if (entry.getValue() instanceof C11480kH) {
                    str = (String) entry.getKey();
                    A002 = ((C11480kH) entry.getValue()).A00();
                } else if (entry.getValue() == null) {
                    r5.A0D((String) entry.getKey(), (String) null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown type: ");
                    sb.append(entry.getValue().getClass());
                    throw new UnsupportedOperationException(sb.toString());
                }
                r5.A07(A002, str);
            }
        }
        for (Map.Entry entry2 : this.A01.entrySet()) {
            if (entry2.getValue() instanceof String) {
                r5.A0D(((C11490kI) entry2.getKey()).A01, (String) entry2.getValue());
            } else if (entry2.getValue() instanceof Integer) {
                r5.A09((Integer) entry2.getValue(), ((C11490kI) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Double) {
                r5.A0B(((C11490kI) entry2.getKey()).A01, (Double) entry2.getValue());
            } else if (entry2.getValue() instanceof Float) {
                r5.A00.A02(((C11490kI) entry2.getKey()).A01, entry2.getValue());
            } else if (entry2.getValue() instanceof Long) {
                r5.A0C(((C11490kI) entry2.getKey()).A01, (Long) entry2.getValue());
            } else if (entry2.getValue() instanceof Boolean) {
                r5.A0A(((C11490kI) entry2.getKey()).A01, (Boolean) entry2.getValue());
            } else {
                boolean z = entry2.getValue() instanceof List;
                Object value2 = entry2.getValue();
                if (z) {
                    List<Number> list2 = (List) value2;
                    if (list2.isEmpty()) {
                        r5.A0E(((C11490kI) entry2.getKey()).A01, list2);
                    } else if (list2.get(0) instanceof String) {
                        r5.A0E(((C11490kI) entry2.getKey()).A01, list2);
                    } else if (list2.get(0) instanceof Double) {
                        String str2 = ((C11490kI) entry2.getKey()).A01;
                        C15560rW r7 = new C15560rW();
                        for (Number doubleValue : list2) {
                            r7.A00(doubleValue.doubleValue());
                        }
                        r5.A00.A02(str2, r7);
                    } else if (list2.get(0) instanceof C11480kH) {
                        r5.A0F(((C11490kI) entry2.getKey()).A01, list2);
                    } else if (list2.get(0) instanceof Map) {
                        Map map2 = (Map) list2.get(0);
                        ArrayList arrayList3 = new ArrayList(map2.keySet());
                        ArrayList arrayList4 = new ArrayList(map2.values());
                        if (map2.isEmpty()) {
                            r5.A0G(((C11490kI) entry2.getKey()).A01, (List) entry2.getValue());
                        } else if (arrayList3.get(0) instanceof String) {
                            if (arrayList4.get(0) instanceof String) {
                                r5.A0G(((C11490kI) entry2.getKey()).A01, (List) entry2.getValue());
                            } else if (arrayList4.get(0) instanceof Double) {
                                String str3 = ((C11490kI) entry2.getKey()).A01;
                                C15560rW r9 = new C15560rW();
                                for (Map entrySet : (List) entry2.getValue()) {
                                    C15680ri r72 = new C15680ri();
                                    for (Map.Entry entry3 : entrySet.entrySet()) {
                                        r72.A0B((String) entry3.getKey(), (Double) entry3.getValue());
                                    }
                                    r9.A00.add(r72);
                                }
                                r5.A00.A02(str3, r9);
                            }
                        }
                    }
                } else {
                    boolean z2 = value2 instanceof Map;
                    Object value3 = entry2.getValue();
                    if (z2) {
                        Map map3 = (Map) value3;
                        ArrayList arrayList5 = new ArrayList(map3.keySet());
                        ArrayList arrayList6 = new ArrayList(map3.values());
                        if (map3.isEmpty()) {
                            String str4 = ((C11490kI) entry2.getKey()).A01;
                            C15680ri r0 = new C15680ri();
                            r0.A0J(map3);
                            r5.A07(r0, str4);
                        } else if (arrayList5.get(0) instanceof String) {
                            if (arrayList6.get(0) instanceof String) {
                                String str5 = ((C11490kI) entry2.getKey()).A01;
                                C15680ri r02 = new C15680ri();
                                r02.A0J(map3);
                                r5.A07(r02, str5);
                            } else if (arrayList6.get(0) instanceof Float) {
                                String str6 = ((C11490kI) entry2.getKey()).A01;
                                C15680ri r03 = new C15680ri();
                                r03.A0N(map3);
                                r5.A07(r03, str6);
                            } else if (arrayList6.get(0) instanceof List) {
                                String str7 = ((C11490kI) entry2.getKey()).A01;
                                C15680ri r04 = new C15680ri();
                                r04.A0O(map3);
                                r5.A07(r04, str7);
                            }
                        } else if (arrayList5.get(0) instanceof Long) {
                            if (arrayList6.get(0) instanceof String) {
                                String str8 = ((C11490kI) entry2.getKey()).A01;
                                C15680ri r05 = new C15680ri();
                                r05.A0M(map3);
                                r5.A07(r05, str8);
                            } else if (arrayList6.get(0) instanceof Float) {
                                String str9 = ((C11490kI) entry2.getKey()).A01;
                                C15680ri r06 = new C15680ri();
                                r06.A0K(map3);
                                r5.A07(r06, str9);
                            } else if (arrayList6.get(0) instanceof List) {
                                String str10 = ((C11490kI) entry2.getKey()).A01;
                                C15680ri r07 = new C15680ri();
                                r07.A0L(map3);
                                r5.A07(r07, str10);
                            }
                        }
                    } else if (value3 instanceof C11480kH) {
                        r5.A07(((C11480kH) entry2.getValue()).A00(), ((C11490kI) entry2.getKey()).A01);
                    } else if (entry2.getValue() == null) {
                        r5.A0D(((C11490kI) entry2.getKey()).A01, (String) null);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unknown type: ");
                        sb2.append(entry2.getValue().getClass());
                        throw new UnsupportedOperationException(sb2.toString());
                    }
                }
            }
        }
        return r5;
    }

    public final Serializable A01(C11490kI r2) {
        return (Serializable) this.A01.get(r2);
    }

    public final HashMap A02() {
        Object key;
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (entry.getValue() instanceof String) {
                key = entry.getKey();
                obj = entry.getValue();
            } else if (entry.getValue() instanceof Integer) {
                key = entry.getKey();
                obj = Integer.toString(((Number) entry.getValue()).intValue());
            } else if (entry.getValue() instanceof Double) {
                key = entry.getKey();
                obj = Double.toString(((Number) entry.getValue()).doubleValue());
            } else if (entry.getValue() instanceof Float) {
                key = entry.getKey();
                obj = Float.toString(((Number) entry.getValue()).floatValue());
            } else if (entry.getValue() instanceof Long) {
                key = entry.getKey();
                obj = Long.toString(((Number) entry.getValue()).longValue());
            } else if (entry.getValue() instanceof Boolean) {
                key = entry.getKey();
                obj = Boolean.toString(((Boolean) entry.getValue()).booleanValue());
            } else if (entry.getValue() == null) {
                hashMap.put(entry.getKey(), (Object) null);
            } else {
                C10450iM.A03("IgExtras", AnonymousClass00U.A0d("coercing a non scalar to string via toString() key: ", (String) entry.getKey(), " value: ", entry.getValue().toString()));
                key = entry.getKey();
                obj = entry.getValue().toString();
            }
            hashMap.put(key, obj);
        }
        for (Map.Entry entry2 : this.A01.entrySet()) {
            if (entry2.getValue() instanceof String) {
                hashMap.put(((C11490kI) entry2.getKey()).A01, entry2.getValue());
            } else if (entry2.getValue() instanceof Integer) {
                hashMap.put(((C11490kI) entry2.getKey()).A01, Integer.toString(((Number) entry2.getValue()).intValue()));
            } else if (entry2.getValue() instanceof Double) {
                hashMap.put(((C11490kI) entry2.getKey()).A01, Double.toString(((Number) entry2.getValue()).doubleValue()));
            } else if (entry2.getValue() instanceof Float) {
                hashMap.put(((C11490kI) entry2.getKey()).A01, Float.toString(((Number) entry2.getValue()).floatValue()));
            } else if (entry2.getValue() instanceof Long) {
                hashMap.put(((C11490kI) entry2.getKey()).A01, Long.toString(((Number) entry2.getValue()).longValue()));
            } else if (entry2.getValue() instanceof Boolean) {
                hashMap.put(((C11490kI) entry2.getKey()).A01, Boolean.toString(((Boolean) entry2.getValue()).booleanValue()));
            } else {
                Object value = entry2.getValue();
                C11490kI r0 = (C11490kI) entry2.getKey();
                if (value == null) {
                    hashMap.put(r0.A01, (Object) null);
                } else {
                    hashMap.put(r0.A01, entry2.getValue().toString());
                    C10450iM.A03("IgExtras", AnonymousClass00U.A0d("coercing a non scalar to string via toString() key: ", ((C11490kI) entry2.getKey()).A01, " value: ", entry2.getValue().toString()));
                }
            }
        }
        return hashMap;
    }

    public final void A04(C11490kI r2, Serializable serializable) {
        this.A01.put(r2, serializable);
    }

    public final void A05(C11490kI r2, Serializable serializable) {
        if (serializable != null) {
            this.A01.put(r2, serializable);
        }
    }

    public final void A06(C11480kH r5) {
        for (Map.Entry entry : r5.A00.entrySet()) {
            this.A00.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : r5.A01.entrySet()) {
            this.A01.put(entry2.getKey(), entry2.getValue());
        }
    }

    public final void A07(Integer num, String str) {
        if (num != null) {
            this.A00.put(str, num);
        }
    }

    public final void A08(String str, float f) {
        this.A00.put(str, Float.valueOf(f));
    }

    public final void A09(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final void A0A(String str, List list) {
        if (list != null) {
            this.A00.put(str, new ArrayList(list));
        }
    }

    public final void A0B(String str, List list) {
        if (list != null) {
            this.A00.put(str, new ArrayList(list));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        return new JSONObject(this.A00).toString();
    }

    public final void A0C(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A09((String) entry.getKey(), (String) entry.getValue());
        }
    }
}

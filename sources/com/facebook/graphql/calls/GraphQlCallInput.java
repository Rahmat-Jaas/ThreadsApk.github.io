package com.facebook.graphql.calls;

import X.AnonymousClass0KD;
import X.AnonymousClass0LI;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C03590Jr;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C67463zb;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@JsonSerialize(using = GraphQlCallInputSerializer.class)
public abstract class GraphQlCallInput {
    public static final AnonymousClass0LI A02 = AnonymousClass0LI.A00();
    public AnonymousClass0KD A00 = null;
    public AnonymousClass0LI A01 = A02;

    public static GQLCallInputCInputShape0S0000000 A00() {
        return new GQLCallInputCInputShape0S0000000();
    }

    public static GQLCallInputCInputShape0S0000000 A01(C67463zb r3, String str) {
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000 = new GQLCallInputCInputShape0S0000000();
        gQLCallInputCInputShape0S0000000.A0F("FB", "destination_app");
        gQLCallInputCInputShape0S0000000.A0F("FEED", "destination_surface");
        gQLCallInputCInputShape0S0000000.A0F("", "destination_id");
        gQLCallInputCInputShape0S0000000.A0A("validation_check_bypass_list", AnonymousClass0ZV.A00);
        r3.A02(gQLCallInputCInputShape0S0000000, "destination");
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002 = new GQLCallInputCInputShape0S0000000();
        gQLCallInputCInputShape0S00000002.A0F(str, "id");
        return gQLCallInputCInputShape0S00000002;
    }

    private Object A02(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof C03590Jr) {
            ArrayList arrayList = ((C03590Jr) obj).A00;
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof AnonymousClass0KD)) {
                ArrayList A0k = C18240wQ.A0k(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        A0k.add(A02(arrayList.get(i)));
                    }
                }
                return A0k;
            } else if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof C03590Jr)) {
                ArrayList A0k2 = C18240wQ.A0k(arrayList.size());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj2 = arrayList.get(i2);
                    if (obj2 == null) {
                        str = null;
                    } else if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                        A0k2.add(obj2);
                    } else {
                        str = obj2.toString();
                    }
                    A0k2.add(str);
                }
                return A0k2;
            } else {
                ArrayList A0k3 = C18240wQ.A0k(arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (arrayList.get(i3) != null) {
                        A0k3.add(A02(arrayList.get(i3)));
                    }
                }
                return A0k3;
            }
        } else if (!(obj instanceof AnonymousClass0KD)) {
            return obj;
        } else {
            TreeMap treeMap = new TreeMap();
            A04((AnonymousClass0KD) obj, treeMap);
            return treeMap;
        }
    }

    public static Map A03(C67463zb r0) {
        return r0.A00.A07();
    }

    private void A04(AnonymousClass0KD r4, Map map) {
        if (r4 != null) {
            for (int i = 0; i < r4.A00; i++) {
                map.put(r4.A0C(i), A02(r4.A0B(i)));
            }
        }
    }

    public final AnonymousClass0KD A06() {
        AnonymousClass0KD r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0KD A022 = this.A01.A02();
        this.A00 = A022;
        return A022;
    }

    public final Map A07() {
        TreeMap treeMap = new TreeMap();
        A04(this.A00, treeMap);
        return treeMap;
    }

    public final void A08(C03590Jr r4, List list) {
        if (list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof List) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C03590Jr A012 = r4.A01.A01();
                            r4.A0B(A012);
                            A08(A012, (List) it.next());
                        }
                        return;
                    } else if (next instanceof String) {
                        for (Object A002 : list) {
                            C03590Jr.A00(r4, A002);
                        }
                        return;
                    } else if (next instanceof Boolean) {
                        for (Object A003 : list) {
                            C03590Jr.A00(r4, A003);
                        }
                        return;
                    } else if (next instanceof Number) {
                        for (Object A004 : list) {
                            C03590Jr.A00(r4, A004);
                        }
                        return;
                    } else if (next instanceof Enum) {
                        for (Object obj : list) {
                            C03590Jr.A00(r4, obj.toString());
                        }
                        return;
                    } else if (next instanceof GraphQlCallInput) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r4.A0B(((GraphQlCallInput) it2.next()).A06());
                        }
                        return;
                    } else if (next instanceof Map) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            AnonymousClass0KD A022 = r4.A01.A02();
                            r4.A0B(A022);
                            A09(A022, (Map) it3.next());
                        }
                        return;
                    } else {
                        throw C18190wL.A0a(C18200wM.A0m(next.getClass(), C18190wL.A0s("List value type is not supported: ")));
                    }
                }
            }
        }
    }

    public static void A05(GraphQlCallInput graphQlCallInput, Object obj, String str) {
        AnonymousClass0KD.A00(graphQlCallInput.A06(), obj, str);
    }

    public final void A09(AnonymousClass0KD r5, Map map) {
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            String value = A0o.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = AnonymousClass0wJ.A1X(value) ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        r5.A0D(((GraphQlCallInput) value).A06(), A0p);
                    } else if (value instanceof List) {
                        C03590Jr A012 = r5.A01.A01();
                        r5.A0D(A012, A0p);
                        A08(A012, (List) value);
                    } else if (value instanceof Map) {
                        AnonymousClass0KD A022 = r5.A01.A02();
                        r5.A0D(A022, A0p);
                        A09(A022, (Map) value);
                    } else {
                        throw C18190wL.A0a(C18200wM.A0m(value.getClass(), C18190wL.A0s("Unexpected object value type ")));
                    }
                }
                AnonymousClass0KD.A00(r5, value, A0p);
            }
        }
    }

    public final void A0A(String str, List list) {
        AnonymousClass0KD A06 = A06();
        C03590Jr A012 = A06.A01.A01();
        A06.A0D(A012, str);
        A08(A012, list);
    }
}

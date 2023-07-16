package X;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87d  reason: invalid class name and case insensitive filesystem */
public abstract class C1372887d implements AnonymousClass8sP {
    public final Object deserialize(Decoder decoder) {
        Object A0v;
        int size;
        C04220Ms.A0B(decoder, 0);
        boolean z = this instanceof AnonymousClass8c5;
        if (z) {
            A0v = C18220wO.A0y();
        } else if (this instanceof AnonymousClass8c4) {
            A0v = AnonymousClass0wJ.A0y();
        } else if (this instanceof C141648by) {
            A0v = AnonymousClass0wJ.A0v();
        } else if (this instanceof C141658bz) {
            C141658bz r3 = (C141658bz) this;
            A0v = r3.A04(r3.A07());
        } else if (this instanceof C141638bx) {
            A0v = C86134wK.A0u();
        } else if (this instanceof C141628bw) {
            A0v = C18200wM.A0u();
        } else {
            A0v = AnonymousClass0wJ.A0v();
        }
        if (z || (this instanceof AnonymousClass8c4)) {
            AbstractMap abstractMap = (AbstractMap) A0v;
            C04220Ms.A0B(abstractMap, 0);
            size = abstractMap.size();
        } else if ((this instanceof C141648by) || !(this instanceof C141658bz)) {
            AbstractCollection abstractCollection = (AbstractCollection) A0v;
            C04220Ms.A0B(abstractCollection, 0);
            size = abstractCollection.size();
        } else {
            C41208Lz1 lz1 = (C41208Lz1) A0v;
            C04220Ms.A0B(lz1, 0);
            size = lz1.A01();
        }
        C147118nQ AAF = decoder.AAF(getDescriptor());
        while (true) {
            int AGx = AAF.AGx(getDescriptor());
            if (AGx == -1) {
                break;
            }
            A06(A0v, AAF, AGx + size, true);
        }
        AAF.AKG(getDescriptor());
        if (!z && !(this instanceof AnonymousClass8c4)) {
            if (this instanceof C141648by) {
                AbstractCollection abstractCollection2 = (AbstractCollection) A0v;
                C04220Ms.A0B(abstractCollection2, 0);
                Object newInstance = Array.newInstance(AnonymousClass724.A00(((C141648by) this).A00), abstractCollection2.size());
                if (newInstance != null) {
                    Object[] array = abstractCollection2.toArray((Object[]) newInstance);
                    C04220Ms.A06(array);
                    return array;
                }
                throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
            } else if (this instanceof C141658bz) {
                C41208Lz1 lz12 = (C41208Lz1) A0v;
                C04220Ms.A0B(lz12, 0);
                return lz12.A02();
            }
        }
        C04220Ms.A0B(A0v, 0);
        return A0v;
    }

    public int A03(Object obj) {
        if ((this instanceof AnonymousClass8c5) || (this instanceof AnonymousClass8c4)) {
            Map map = (Map) obj;
            C04220Ms.A0B(map, 0);
            return map.size();
        } else if (this instanceof C141648by) {
            Object[] objArr = (Object[]) obj;
            C04220Ms.A0B(objArr, 0);
            return objArr.length;
        } else if ((this instanceof C141638bx) || (this instanceof C141628bw)) {
            Set set = (Set) obj;
            C04220Ms.A0B(set, 0);
            return set.size();
        } else {
            List list = (List) obj;
            C04220Ms.A0B(list, 0);
            return list.size();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.Collection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r1 instanceof X.AnonymousClass8c5
            if (r0 == 0) goto L_0x0014
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            boolean r0 = r2 instanceof java.util.LinkedHashMap
            if (r0 != 0) goto L_0x0074
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            return r0
        L_0x0014:
            boolean r0 = r1 instanceof X.AnonymousClass8c4
            if (r0 == 0) goto L_0x0027
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            boolean r0 = r2 instanceof java.util.HashMap
            if (r0 != 0) goto L_0x0074
            java.util.HashMap r0 = X.C86164wN.A0j(r2)
            return r0
        L_0x0027:
            boolean r0 = r1 instanceof X.C141648by
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.util.List r0 = java.util.Arrays.asList(r2)
            X.C04220Ms.A06(r0)
            java.util.ArrayList r0 = X.C18200wM.A0s(r0)
            return r0
        L_0x003d:
            boolean r0 = r1 instanceof X.C141638bx
            if (r0 == 0) goto L_0x0051
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            boolean r0 = r2 instanceof java.util.LinkedHashSet
            if (r0 != 0) goto L_0x0074
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r2)
            return r0
        L_0x0051:
            boolean r0 = r1 instanceof X.C141628bw
            if (r0 == 0) goto L_0x0065
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            boolean r0 = r2 instanceof java.util.HashSet
            if (r0 != 0) goto L_0x0074
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            return r0
        L_0x0065:
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x0074
            java.util.ArrayList r0 = X.C18200wM.A0s(r2)
            return r0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1372887d.A04(java.lang.Object):java.lang.Object");
    }

    public final Iterator A05(Object obj) {
        if (this instanceof AnonymousClass8c5) {
            Map map = (Map) obj;
            C04220Ms.A0B(map, 0);
            return AnonymousClass0wJ.A0z(map);
        } else if (this instanceof AnonymousClass8c4) {
            Map map2 = (Map) obj;
            C04220Ms.A0B(map2, 0);
            return AnonymousClass0wJ.A0z(map2);
        } else if (this instanceof C141648by) {
            Object[] objArr = (Object[]) obj;
            C04220Ms.A0B(objArr, 0);
            return new AnonymousClass0XN(objArr);
        } else if (this instanceof C141658bz) {
            throw C18180wK.A0a("This method lead to boxing and must not be used, use writeContents instead");
        } else if ((this instanceof C141638bx) || (this instanceof C141628bw)) {
            Set set = (Set) obj;
            C04220Ms.A0B(set, 0);
            return set.iterator();
        } else {
            List list = (List) obj;
            C04220Ms.A0B(list, 0);
            return list.iterator();
        }
    }

    public void A06(Object obj, C147118nQ r9, int i, boolean z) {
        int i2;
        Object AHC;
        if (this instanceof C141538bm) {
            C141538bm r6 = (C141538bm) this;
            Map map = (Map) obj;
            AnonymousClass0wJ.A1M(r9, 0, map);
            SerialDescriptor descriptor = r6.getDescriptor();
            Object AHC2 = r9.AHC((Object) null, r6.A00, descriptor, i);
            if (z) {
                i2 = r9.AGx(descriptor);
                if (i2 != i + 1) {
                    throw C18190wL.A0a(AnonymousClass00U.A01(i, i2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                }
            } else {
                i2 = i + 1;
            }
            if (map.containsKey(AHC2)) {
                AnonymousClass8sP r1 = r6.A01;
                if (!(r1.getDescriptor().Aqu() instanceof C39229Kpw)) {
                    AHC = r9.AHC(AnonymousClass4WJ.A07(AHC2, map), r1, descriptor, i2);
                    map.put(AHC2, AHC);
                    return;
                }
            }
            AHC = r9.AHC((Object) null, r6.A01, descriptor, i2);
            map.put(AHC2, AHC);
            return;
        }
        AnonymousClass8c1 r4 = (AnonymousClass8c1) this;
        C04220Ms.A0B(r9, 0);
        Object AHC3 = r9.AHC((Object) null, r4.A00, r4.getDescriptor(), i);
        if (!(r4 instanceof C141648by)) {
            if (r4 instanceof C141658bz) {
                throw C18180wK.A0a("This method lead to boxing and must not be used, use Builder.append instead");
            } else if ((r4 instanceof C141638bx) || (r4 instanceof C141628bw)) {
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                C04220Ms.A0B(abstractCollection, 0);
                abstractCollection.add(AHC3);
                return;
            }
        }
        AbstractList abstractList = (AbstractList) obj;
        C04220Ms.A0B(abstractList, 0);
        abstractList.add(i, AHC3);
    }

    public final void serialize(Encoder encoder, Object obj) {
        C146588mU r8;
        SerialDescriptor serialDescriptor;
        if (this instanceof C141538bm) {
            C141538bm r6 = (C141538bm) this;
            C04220Ms.A0B(encoder, 0);
            r6.A03(obj);
            serialDescriptor = r6.getDescriptor();
            C04220Ms.A0B(serialDescriptor, 1);
            r8 = encoder.AAG(serialDescriptor);
            Iterator A05 = r6.A05(obj);
            int i = 0;
            while (A05.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A05);
                Object key = A0o.getKey();
                Object value = A0o.getValue();
                int i2 = i + 1;
                r8.AJz(key, r6.A00, serialDescriptor, i);
                i = i2 + 1;
                r8.AJz(value, r6.A01, serialDescriptor, i2);
            }
        } else {
            AnonymousClass8c1 r62 = (AnonymousClass8c1) this;
            if (r62 instanceof C141658bz) {
                C141658bz r63 = (C141658bz) r62;
                C04220Ms.A0B(encoder, 0);
                int A03 = r63.A03(obj);
                serialDescriptor = r63.A00;
                r8 = encoder.AAG(serialDescriptor);
                r63.A08(obj, r8, A03);
            } else {
                C04220Ms.A0B(encoder, 0);
                int A032 = r62.A03(obj);
                serialDescriptor = r62.getDescriptor();
                C04220Ms.A0B(serialDescriptor, 1);
                r8 = encoder.AAG(serialDescriptor);
                Iterator A052 = r62.A05(obj);
                if (A032 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        r8.AJz(A052.next(), r62.A00, serialDescriptor, i3);
                        if (i4 >= A032) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            }
        }
        r8.AKG(serialDescriptor);
    }
}

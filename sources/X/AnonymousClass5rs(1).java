package X;

import android.util.Log;
import com.facebook.redex.IDxProviderShape309S0200000_2_I2;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5rs  reason: invalid class name */
public final class AnonymousClass5rs extends C115446v5 {
    public static final C143998hf A06 = AnonymousClass7oK.A00;
    public final List A00;
    public final Map A01 = AnonymousClass0wJ.A0y();
    public final Map A02 = AnonymousClass0wJ.A0y();
    public final Map A03 = AnonymousClass0wJ.A0y();
    public final AtomicReference A04 = new AtomicReference();
    public final AnonymousClass7oF A05;

    public AnonymousClass5rs(Iterable iterable, Collection collection, Executor executor) {
        Map map;
        AnonymousClass7oF r3 = new AnonymousClass7oF(executor);
        this.A05 = r3;
        ArrayList<AnonymousClass78C> A0v = AnonymousClass0wJ.A0v();
        Class<AnonymousClass7oF> cls = AnonymousClass7oF.class;
        A0v.add(AnonymousClass78C.A00(cls, r3, cls, AnonymousClass8eW.class));
        A0v.add(AnonymousClass78C.A00(AnonymousClass5rs.class, this, new Class[0]));
        for (Object next : collection) {
            if (next != null) {
                A0v.add(next);
            }
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Object add : iterable) {
            A0v2.add(add);
        }
        this.A00 = A0v2;
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        synchronized (this) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C143998hf) it.next()).get();
                    if (componentRegistrar != null) {
                        A0v.addAll(componentRegistrar.getComponents());
                        it.remove();
                    }
                } catch (C1373288d e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            map = this.A01;
            if (map.isEmpty()) {
                AnonymousClass6JI.A00(A0v);
            } else {
                ArrayList A0s = C18200wM.A0s(map.keySet());
                A0s.addAll(A0v);
                AnonymousClass6JI.A00(A0s);
            }
            for (AnonymousClass78C r2 : A0v) {
                map.put(r2, new AnonymousClass7oM(new IDxProviderShape309S0200000_2_I2(1, r2, this)));
            }
            ArrayList A0v4 = AnonymousClass0wJ.A0v();
            for (AnonymousClass78C r1 : A0v) {
                if (r1.A01 == 0) {
                    C143998hf r4 = (C143998hf) map.get(r1);
                    for (Object next2 : r1.A04) {
                        Map map2 = this.A02;
                        if (!map2.containsKey(next2)) {
                            map2.put(next2, r4);
                        } else {
                            A0v4.add(new AnonymousClass81J((AnonymousClass7oN) ((C143998hf) map2.get(next2)), r4));
                        }
                    }
                }
            }
            A0v3.addAll(A0v4);
            ArrayList A0v5 = AnonymousClass0wJ.A0v();
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                AnonymousClass78C r12 = (AnonymousClass78C) A0o.getKey();
                if (r12.A01 != 0) {
                    Object value = A0o.getValue();
                    for (Object next3 : r12.A04) {
                        if (!A0y.containsKey(next3)) {
                            A0y.put(next3, C18200wM.A0u());
                        }
                        ((Set) A0y.get(next3)).add(value);
                    }
                }
            }
            Iterator A0u = C18190wL.A0u(A0y);
            while (A0u.hasNext()) {
                Map.Entry A0o2 = C18180wK.A0o(A0u);
                Map map3 = this.A03;
                boolean containsKey = map3.containsKey(A0o2.getKey());
                Object key = A0o2.getKey();
                if (!containsKey) {
                    map3.put(key, new AnonymousClass7oI((Collection) A0o2.getValue()));
                } else {
                    AnonymousClass7oI r32 = (AnonymousClass7oI) map3.get(key);
                    for (C143998hf r13 : (Set) A0o2.getValue()) {
                        A0v5.add(new AnonymousClass81K(r32, r13));
                    }
                }
            }
            A0v3.addAll(A0v5);
            Iterator A0x = C18220wO.A0x(map);
            while (A0x.hasNext()) {
                AnonymousClass78C r6 = (AnonymousClass78C) A0x.next();
                Iterator it2 = r6.A03.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        AnonymousClass79T r11 = (AnonymousClass79T) it2.next();
                        int i = r11.A00;
                        boolean z = false;
                        if (i == 2) {
                            z = true;
                            Map map4 = this.A03;
                            Class cls2 = r11.A01;
                            if (!map4.containsKey(cls2)) {
                                map4.put(cls2, new AnonymousClass7oI(Collections.emptySet()));
                            }
                        }
                        Map map5 = this.A02;
                        Class cls3 = r11.A01;
                        if (map5.containsKey(cls3)) {
                            continue;
                        } else if (i == 1) {
                            throw new C93855rt(String.format("Unsatisfied dependency for component %s: %s", new Object[]{r6, cls3}));
                        } else if (!z) {
                            map5.put(cls3, new AnonymousClass7oN(AnonymousClass7oN.A02, AnonymousClass7oN.A03));
                        }
                    }
                }
            }
        }
        Iterator it3 = A0v3.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        if (this.A04.get() != null) {
            A00(this, map);
        }
    }

    public static void A00(AnonymousClass5rs r4, Map map) {
        Queue queue;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            C143998hf r2 = (C143998hf) A0o.getValue();
            if (((AnonymousClass78C) A0o.getKey()).A00 == 1) {
                r2.get();
            }
        }
        AnonymousClass7oF r22 = r4.A05;
        synchronized (r22) {
            queue = r22.A00;
            if (queue != null) {
                r22.A00 = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
    }
}

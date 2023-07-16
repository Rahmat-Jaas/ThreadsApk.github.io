package com.facebook.pando;

import X.AnonymousClass0wJ;
import X.C121297Fj;
import X.C15020qa;
import X.C18180wK;
import X.C18200wM;
import com.facebook.jni.HybridClassBase;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class TreeUpdaterJNI extends HybridClassBase {
    private final native void build();

    private native void initHybridForRawBuilder();

    private native void initHybridForUpdateBuilder(TreeJNI treeJNI);

    private final native void setBoolean(String str, Boolean bool);

    private final native void setBooleanList(String str, Iterable iterable);

    private final native void setDouble(String str, Double d);

    private final native void setDoubleList(String str, Iterable iterable);

    private final native void setEmptyList(String str);

    private final native void setInt(String str, Integer num);

    private final native void setIntList(String str, Iterable iterable);

    private final native void setLong(String str, Long l);

    private final native void setLongList(String str, Iterable iterable);

    private final native void setNull(String str);

    private final native void setString(String str, String str2);

    private final native void setStringList(String str, Iterable iterable);

    private final native void setTreeUpdater(String str, TreeUpdaterJNI treeUpdaterJNI);

    private final native void setTreeUpdaterList(String str, Iterable iterable);

    public final native TreeJNI applyToTree(TreeJNI treeJNI);

    static {
        C15020qa.A0A("pando-jni");
    }

    public TreeUpdaterJNI(String str, Map map) {
        initHybridForRawBuilder();
        constructTreeWithArgs(map);
    }

    private void constructTreeWithArgs(Map map) {
        int A00;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object value = A0o.getValue();
            if (value == null) {
                setNull(C18200wM.A0p(A0o));
            } else if (value instanceof Integer) {
                setInt(C18200wM.A0p(A0o), (Integer) value);
            } else if (value instanceof Long) {
                setLong(C18200wM.A0p(A0o), (Long) value);
            } else if (value instanceof Double) {
                setDouble(C18200wM.A0p(A0o), (Double) value);
            } else if (value instanceof Boolean) {
                setBoolean(C18200wM.A0p(A0o), (Boolean) value);
            } else if (value instanceof String) {
                setString(C18200wM.A0p(A0o), (String) value);
            } else if (value instanceof TreeUpdaterJNI) {
                setTreeUpdater(C18200wM.A0p(A0o), (TreeUpdaterJNI) value);
            } else if (value instanceof Iterable) {
                String A0p = C18200wM.A0p(A0o);
                Iterable iterable = (Iterable) value;
                if (iterable instanceof Collection) {
                    A00 = ((Collection) iterable).size();
                } else {
                    Iterator it = iterable.iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        it.next();
                        j++;
                    }
                    A00 = C121297Fj.A00(j);
                }
                if (A00 == 0) {
                    setEmptyList(A0p);
                } else {
                    Object next = iterable.iterator().next();
                    if (next instanceof Integer) {
                        setIntList(A0p, iterable);
                    } else if (next instanceof Long) {
                        setLongList(A0p, iterable);
                    } else if (next instanceof Double) {
                        setDoubleList(A0p, iterable);
                    } else if (next instanceof Boolean) {
                        setBooleanList(A0p, iterable);
                    } else if (next instanceof String) {
                        setStringList(A0p, iterable);
                    } else if (next instanceof TreeUpdaterJNI) {
                        setTreeUpdaterList(A0p, iterable);
                    }
                }
            }
        }
        build();
    }

    public TreeUpdaterJNI(Map map, TreeJNI treeJNI) {
        initHybridForUpdateBuilder(treeJNI);
        constructTreeWithArgs(map);
    }
}

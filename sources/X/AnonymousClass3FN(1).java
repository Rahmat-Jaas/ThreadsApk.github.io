package X;

import android.util.SparseArray;
import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3FN  reason: invalid class name */
public final class AnonymousClass3FN {
    public final SparseArray A00;
    public final Map A01;
    public final Map A02;

    public final int A00(Class cls) {
        Object obj = this.A02.get(cls);
        String name = cls.getName();
        if (obj != null) {
            return AnonymousClass0wJ.A04(obj);
        }
        throw C18210wN.A0W(Strings.A00("No definition corresponding to model class %s was found", name));
    }

    public AnonymousClass3FN(List list) {
        this.A01 = new HashMap((int) Math.ceil((((double) list.size()) * 4.0d) / 3.0d), 0.75f);
        this.A00 = new SparseArray(list.size());
        this.A02 = new HashMap(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C18523Agw agw = (C18523Agw) it.next();
            Class modelClass = agw.modelClass();
            StringBuilder A0s = C18190wL.A0s("Duplicate ModelClass ");
            A0s.append(modelClass);
            AnonymousClass7Ko.A0E(!this.A01.containsKey(modelClass), C18180wK.A0i(" in definition not allowed", A0s));
            this.A01.put(modelClass, agw);
            StringBuilder A0r = C18200wM.A0r();
            A0r.append("Duplicate ModelClass ");
            A0r.append(modelClass);
            AnonymousClass7Ko.A0E(!this.A02.containsKey(modelClass), C18180wK.A0i(" in model-to-view-type map not allowed", A0r));
            this.A02.put(modelClass, Integer.valueOf(i));
            this.A00.put(i, agw);
            i++;
        }
    }
}
